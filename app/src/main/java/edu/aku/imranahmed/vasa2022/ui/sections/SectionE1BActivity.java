package edu.aku.imranahmed.vasa2022.ui.sections;

import static edu.aku.imranahmed.vasa2022.core.MainApp.pregD;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.imranahmed.vasa2022.R;
import edu.aku.imranahmed.vasa2022.contracts.TableContracts;
import edu.aku.imranahmed.vasa2022.core.MainApp;
import edu.aku.imranahmed.vasa2022.database.DatabaseHelper;
import edu.aku.imranahmed.vasa2022.databinding.ActivitySectionE1bBinding;
import edu.aku.imranahmed.vasa2022.models.FamilyMembers;

public class SectionE1BActivity extends AppCompatActivity {

    private static final String TAG = "SectionE1BActivity";
    ActivitySectionE1bBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> childNames, childCodes, childAges, childFmUID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e1b);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        // FMUID
        MainApp.pregD.setFmuid(MainApp.allMWRAList.get(0).getUid());
        MainApp.pregD.setMsno(MainApp.allMWRAList.get(0).getD101());
        MainApp.pregD.setMName(MainApp.allMWRAList.get(0).getD102());

/*        try {
            MainApp.child = db.getChildByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(Child): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }*/

        bi.setPregD(pregD);
        //  setupSkips();
        populateSpinner();
    }


    private void populateSpinner() {

        childNames = new ArrayList<>();
        childCodes = new ArrayList<>();
        childAges = new ArrayList<>();
        childFmUID = new ArrayList<>();

        childNames.add("...");
        childCodes.add("");
        childAges.add("");
        childFmUID.add("");
        String mwraSno = MainApp.allMWRAList.get(0).getD101();

        try {
            for (FamilyMembers fm : db.AllChildrenByMUID(MainApp.pregD.getFmuid())) {

                // populate only selected mwra's children (i.e selected for Pregnancy history. May Not be Indexed mother)
                if (mwraSno.equals(fm.getD107())) {
                    childNames.add(fm.getD102());
                    childCodes.add(fm.getD101());
                    childAges.add(fm.getD109y());
                    childFmUID.add(fm.getUid());
                }

            }
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(familymembers): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        childNames.add("Not Available/Died");
        childCodes.add("97");
        childAges.add("");
        childFmUID.add("");

        ArrayAdapter<String> adapterE108 = new ArrayAdapter<String>(SectionE1BActivity.this,
                R.layout.custom_spinner, childNames);

        bi.e108s.setAdapter(adapterE108);

        bi.e108s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.e108.setEnabled(false);
                bi.e108.setText("");

                if (position == 0) return;
                MainApp.pregD.setFmuidE108(childFmUID.get(bi.e108s.getSelectedItemPosition()));
                MainApp.pregD.setE108(childNames.get(bi.e108s.getSelectedItemPosition()));

                if (bi.e108s.getSelectedItem().toString().equals("Not Available/Died")) {
                    bi.e108.setEnabled(true);
                } else {
                    bi.e108.setText(bi.e108s.getSelectedItem().toString());

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        // Set Second Adapter
        ArrayAdapter<String> adapterE108a = new ArrayAdapter<String>(SectionE1BActivity.this,
                R.layout.custom_spinner, childNames);

        bi.e108as.setAdapter(adapterE108a);

        bi.e108as.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.e108a.setEnabled(false);
                bi.e108a.setText("");

                if (position == 0) return;
                MainApp.pregD.setFmuidE108a(childFmUID.get(bi.e108as.getSelectedItemPosition()));
                MainApp.pregD.setE108a(childNames.get(bi.e108as.getSelectedItemPosition()));

                if (bi.e108as.getSelectedItem().toString().equals("Not Available/Died")) {
                    bi.e108a.setEnabled(true);
                } else {
                    bi.e108a.setText(bi.e108as.getSelectedItem().toString());

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    private boolean insertNewRecord() {
        if (!MainApp.pregD.getUid().equals("") || MainApp.superuser) return true;

        MainApp.pregD.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addPregnancyDetails(MainApp.pregD);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.pregD.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.pregD.setUid(MainApp.pregD.getDeviceId() + MainApp.pregD.getId());
            db.updatesPregnancyDetailsColumn(TableContracts.PregnancyDetailsTable.COLUMN_UID, MainApp.pregD.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            db.updatesPregnancyDetailsColumn(TableContracts.PregnancyDetailsTable.COLUMN_SE1, MainApp.pregD.sE1toString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    public void btnContinue(View view) {

        if (!formValidation()) return;
        if (MainApp.pregD.getUid().equals("") ? insertNewRecord() : updateDB()) {
            setResult(RESULT_OK);
            finish();
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        setResult(Activity.RESULT_CANCELED);
        finish();
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        // Allow BackPress
        setResult(Activity.RESULT_CANCELED);
        super.onBackPressed();

        // Dont Allow BackPress
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}