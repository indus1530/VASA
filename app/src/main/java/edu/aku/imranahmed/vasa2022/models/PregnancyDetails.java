package edu.aku.imranahmed.vasa2022.models;

import static edu.aku.imranahmed.vasa2022.core.MainApp.PROJECT_NAME;
import static edu.aku.imranahmed.vasa2022.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.imranahmed.vasa2022.BR;
import edu.aku.imranahmed.vasa2022.contracts.TableContracts;
import edu.aku.imranahmed.vasa2022.core.MainApp;

public class PregnancyDetails extends BaseObservable implements Observable {

    private final String TAG = "PregnancyDetails";
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String pSno = _EMPTY_;
    private String mSno = _EMPTY_;
    private String mName = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    //Field Variables;

    private String e103 = _EMPTY_;
    private String e104 = _EMPTY_;
    private String e105 = _EMPTY_;
    private String e106d = _EMPTY_;
    private String e106m = _EMPTY_;
    private String e106y = _EMPTY_;
    private String e107 = _EMPTY_;
    private String e109 = _EMPTY_;
    private String e108 = _EMPTY_;
    private String fmuidE108 = _EMPTY_;
    private String e110y = _EMPTY_;
    private String e110m = _EMPTY_;
    private String e110d = _EMPTY_;
    private String e111 = _EMPTY_;
    private String e11196x = _EMPTY_;
    private String e111a = _EMPTY_;
    private String e111a96x = _EMPTY_;
    private String e112 = _EMPTY_;
    private String e113y = _EMPTY_;
    private String e113m = _EMPTY_;
    private String e114 = _EMPTY_;
    private String e115 = _EMPTY_;

    private String e107a = _EMPTY_;
    private String e109a = _EMPTY_;
    private String e108a = _EMPTY_;
    private String fmuidE108a = _EMPTY_;
    private String e110ay = _EMPTY_;
    private String e110am = _EMPTY_;
    private String e110ad = _EMPTY_;
    private String e111c = _EMPTY_;
    private String e111c96x = _EMPTY_;
    private String e112a = _EMPTY_;

    public void PregnancyDetails() {
    }

    public void populateMeta() {
        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setPsuCode(MainApp.currentHousehold.getClusterCode());
        setHhid(MainApp.currentHousehold.getHhno());
        setPSno(MainApp.pregM.getE101a());

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getPsuCode() {
        return psuCode;
    }

    public void setPsuCode(String psuCode) {
        this.psuCode = psuCode;
    }

    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public String getPSno() {
        return pSno;
    }

    public void setPSno(String pSno) {
        this.pSno = pSno;
    }

    public String getMsno() {
        return mSno;
    }

    public void setMsno(String mSno) {
        this.mSno = mSno;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    @Bindable
    public String getE103() {
        return e103;
    }

    public void setE103(String e103) {
        this.e103 = e103;
        notifyPropertyChanged(BR.e103);
    }

    @Bindable
    public String getE104() {
        return e104;
    }

    public void setE104(String e104) {
        this.e104 = e104;
        setE107a(e104.equals("1") ? "" : this.e107a);
        setE109a(e104.equals("1") ? "" : this.e109a);
        setE108a(e104.equals("1") ? "" : this.e108a);
        setE110ad(e104.equals("1") ? "" : this.e110ad);
        setE110am(e104.equals("1") ? "" : this.e110am);
        setE110ay(e104.equals("1") ? "" : this.e110ay);
        setE111c(e104.equals("1") ? "" : this.e111c);
        setE112a(e104.equals("1") ? "" : this.e112a);
        notifyPropertyChanged(BR.e104);
    }

    @Bindable
    public String getE105() {
        return e105;
    }

    public void setE105(String e105) {
        this.e105 = e105;
        boolean b = e105.equals("2") || e105.equals("5") || e105.equals("6");
        setE106d(b ? "" : this.e106d);
        setE106m(b ? "" : this.e106m);
        setE106y(b ? "" : this.e106y);
        setE107(b ? "" : this.e107);
        setE109(b ? "" : this.e109);
        setE108(b ? "" : this.e108);
        /*setE110d(b ? "" : this.e110d);
        setE110m(b ? "" : this.e110m);
        setE110y(b ? "" : this.e110y);*/

        setE111(e105.equals("6") ? "" : this.e111);

        /*setE111a(e105.equals("2") ? "" : this.e111a);
        setE111a(e105.equals("5") ? "" : this.e111a);
        setE111a(e105.equals("6") ? "" : this.e111a);
        setE112(e105.equals("6") ? "" : this.e112);*/

        setE114(e105.equals("2") ? this.e114 : "");
        setE114(e105.equals("5") ? this.e114 : "");
        setE114(e105.equals("6") ? this.e114 : "");

        setE115(e105.equals("6") ? this.e115 : "");

        setE113y(e105.equals("1") || e105.equals("3") ? "" : this.e113y);
        setE113m(e105.equals("1") || e105.equals("3") ? "" : this.e113m);

        boolean b1 = e105.equals("4") || e105.equals("5") || e105.equals("6");
        setE107a(b1 ? "" : this.e107a);
        setE109a(b1 ? "" : this.e109a);
        setE108a(b1 ? "" : this.e108a);
        setE110ad(b1 ? "" : this.e110ad);
        setE110am(b1 ? "" : this.e110am);
        setE110ay(b1 ? "" : this.e110ay);
        setE111c(b1 ? "" : this.e111c);
        setE112a(b1 ? "" : this.e112a);

        notifyPropertyChanged(BR.e105);
    }

    @Bindable
    public String getE106d() {
        return e106d;
    }

    public void setE106d(String e106d) {
        this.e106d = e106d;
        notifyPropertyChanged(BR.e106d);
    }

    @Bindable
    public String getE106m() {
        return e106m;
    }

    public void setE106m(String e106m) {
        this.e106m = e106m;
        notifyPropertyChanged(BR.e106m);
    }

    @Bindable
    public String getE106y() {
        return e106y;
    }

    public void setE106y(String e106y) {
        this.e106y = e106y;
        notifyPropertyChanged(BR.e106y);
    }

    @Bindable
    public String getE107() {
        return e107;
    }

    public void setE107(String e107) {
        this.e107 = e107;
        notifyPropertyChanged(BR.e107);
    }

    @Bindable
    public String getE109() {
        return e109;
    }

    public void setE109(String e109) {
        this.e109 = e109;
        setE110d(e109.equals("1") ? "" : this.e110d);
        setE110m(e109.equals("1") ? "" : this.e110m);
        setE110y(e109.equals("1") ? "" : this.e110y);
        setE111(e109.equals("1") ? "" : this.e111);

        setE111a(e109.equals("1") ? "" : this.e111a);
        setE112(e109.equals("1") ? "" : this.e112);
        notifyPropertyChanged(BR.e109);
    }

    @Bindable
    public String getE108() {
        return e108;
    }

    public void setE108(String e108) {
        this.e108 = e108;
        notifyPropertyChanged(BR.e108);
    }

    public String getFmuidE108() {
        return fmuidE108;
    }

    public void setFmuidE108(String fmuidE108) {
        this.fmuidE108 = fmuidE108;
    }

    public String getFmuidE108a() {
        return fmuidE108a;
    }

    public void setFmuidE108a(String fmuidE108a) {
        this.fmuidE108a = fmuidE108a;
    }


    @Bindable
    public String getE110y() {
        return e110y;
    }

    public void setE110y(String e110y) {
        this.e110y = e110y;
        notifyPropertyChanged(BR.e110y);
    }

    @Bindable
    public String getE110m() {
        return e110m;
    }

    public void setE110m(String e110m) {
        this.e110m = e110m;
        notifyPropertyChanged(BR.e110m);
    }

    @Bindable
    public String getE110d() {
        return e110d;
    }

    public void setE110d(String e110d) {
        this.e110d = e110d;
        notifyPropertyChanged(BR.e110d);
    }

    @Bindable
    public String getE111() {
        return e111;
    }

    public void setE111(String e111) {
        this.e111 = e111;
        setE11196x(e111.equals("96") ? this.e11196x : "");
        notifyPropertyChanged(BR.e111);
    }

    @Bindable
    public String getE11196x() {
        return e11196x;
    }

    public void setE11196x(String e11196x) {
        this.e11196x = e11196x;
        notifyPropertyChanged(BR.e11196x);
    }

    @Bindable
    public String getE111a() {
        return e111a;
    }

    public void setE111a(String e111a) {
        this.e111a = e111a;
        setE111a96x(e111a.equals("96") ? this.e111a96x : "");
        notifyPropertyChanged(BR.e111a);
    }

    @Bindable
    public String getE111a96x() {
        return e111a96x;
    }

    public void setE111a96x(String e111a96x) {
        this.e111a96x = e111a96x;
        notifyPropertyChanged(BR.e111a96x);
    }

    @Bindable
    public String getE112() {
        return e112;
    }

    public void setE112(String e112) {
        this.e112 = e112;
        notifyPropertyChanged(BR.e112);
    }

    @Bindable
    public String getE107a() {
        return e107a;
    }

    public void setE107a(String e107a) {
        this.e107a = e107a;
        notifyPropertyChanged(BR.e107a);
    }

    @Bindable
    public String getE109a() {
        return e109a;
    }

    public void setE109a(String e109a) {
        this.e109a = e109a;
        setE110ay(e109a.equals("2") ? this.e110ay : "");
        setE110am(e109a.equals("2") ? this.e110am : "");
        setE111c(e109a.equals("2") ? this.e111c : "");
        setE112a(e109a.equals("2") ? this.e112a : "");
        notifyPropertyChanged(BR.e109a);
    }

    @Bindable
    public String getE108a() {
        return e108a;
    }

    public void setE108a(String e108a) {
        this.e108a = e108a;
        notifyPropertyChanged(BR.e108a);
    }

    @Bindable
    public String getE110ay() {
        return e110ay;
    }

    public void setE110ay(String e110ay) {
        this.e110ay = e110ay;
        notifyPropertyChanged(BR.e110ay);
    }

    @Bindable
    public String getE110am() {
        return e110am;
    }

    public void setE110am(String e110am) {
        this.e110am = e110am;
        notifyPropertyChanged(BR.e110am);
    }

    @Bindable
    public String getE110ad() {
        return e110ad;
    }

    public void setE110ad(String e110ad) {
        this.e110ad = e110ad;
        notifyPropertyChanged(BR.e110ad);
    }

    @Bindable
    public String getE111c() {
        return e111c;
    }

    public void setE111c(String e111c) {
        this.e111c = e111c;
        setE111c96x(e111c.equals("96") ? this.e111c96x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.e111c);
    }

    @Bindable
    public String getE111c96x() {
        return e111c96x;
    }

    public void setE111c96x(String e111c96x) {
        this.e111c96x = e111c96x;
        notifyPropertyChanged(BR.e111c96x);
    }

    @Bindable
    public String getE112a() {
        return e112a;
    }

    public void setE112a(String e112a) {
        this.e112a = e112a;
        notifyPropertyChanged(BR.e112a);
    }

    @Bindable
    public String getE113y() {
        return e113y;
    }

    public void setE113y(String e113y) {
        this.e113y = e113y;
        notifyPropertyChanged(BR.e113y);
    }

    @Bindable
    public String getE113m() {
        return e113m;
    }

    public void setE113m(String e113m) {
        this.e113m = e113m;
        notifyPropertyChanged(BR.e113m);
    }

    @Bindable
    public String getE114() {
        return e114;
    }

    public void setE114(String e114) {
        this.e114 = e114;
        notifyPropertyChanged(BR.e114);
    }

    @Bindable
    public String getE115() {
        return e115;
    }

    public void setE115(String e115) {
        this.e115 = e115;
        notifyPropertyChanged(BR.e115);
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.PregnancyDetailsTable.COLUMN_ID, this.id);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_UID, this.uid);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_PSNO, this.pSno);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_MSNO, this.mSno);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_M_NAME, this.mName);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_SE1, new JSONObject(sE1toString()));
        return json;
    }

    public String sE1toString() throws JSONException {
        Log.d(TAG, "sE1toString: ");
        JSONObject json = new JSONObject();
        json
                .put("e103", e103)
                .put("e104", e104)
                .put("e105", e105)
                .put("e106d", e106d)
                .put("e106m", e106m)
                .put("e106y", e106y)
                .put("e107", e107)
                .put("e109", e109)
                .put("e108", e108)
                .put("fmuidE108", fmuidE108)
                .put("e110y", e110y)
                .put("e110m", e110m)
                .put("e110d", e110d)
                .put("e111", e111)
                .put("e11196x", e11196x)
                .put("e111a", e111a)
                .put("e111a96x", e111a96x)
                .put("e112", e112)
                .put("e107a", e107a)
                .put("e109a", e109a)
                .put("e108a", e108a)
                .put("fmuidE108a", fmuidE108a)
                .put("e110ay", e110ay)
                .put("e110am", e110am)
                .put("e110ad", e110ad)
                .put("e111c", e111c)
                .put("e111c96x", e111c96x)
                .put("e112a", e112a)
                .put("e113y", e113y)
                .put("e113m", e113m)
                .put("e114", e114)
                .put("e115", e115);
        return json.toString();
    }


    public PregnancyDetails Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_HHID));
        this.pSno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_PSNO));
        this.mSno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_MSNO));
        this.mName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_M_NAME));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_SYNC_DATE));

        sE1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_SE1)));
        return this;
    }

    public void sE1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.e103 = json.getString("e103");
            this.e104 = json.getString("e104");
            this.e105 = json.getString("e105");
            this.e106d = json.getString("e106d");
            this.e106m = json.getString("e106m");
            this.e106y = json.getString("e106y");
            this.e107 = json.getString("e107");
            this.e109 = json.getString("e109");
            this.e108 = json.getString("e108");
            this.fmuidE108 = json.getString("fmuidE108");
            this.e110y = json.getString("e110y");
            this.e110m = json.getString("e110m");
            this.e110d = json.getString("e110d");
            this.e111 = json.getString("e111");
            this.e11196x = json.getString("e11196x");
            this.e111a = json.getString("e111a");
            this.e111a96x = json.getString("e111a96x");
            this.e112 = json.getString("e112");
            this.e107a = json.getString("e107a");
            this.e109a = json.getString("e109a");
            this.e108a = json.getString("e108a");
            this.fmuidE108a = json.getString("fmuidE108a");
            this.e110ay = json.getString("e110ay");
            this.e110am = json.getString("e110am");
            this.e110ad = json.getString("e110ad");
            this.e111c = json.getString("e111c");
            this.e111c96x = json.getString("e111c96x");
            this.e112a = json.getString("e112a");
            this.e113y = json.getString("e113y");
            this.e113m = json.getString("e113m");
            this.e114 = json.getString("e114");
            this.e115 = json.getString("e115");
        }
    }


}
