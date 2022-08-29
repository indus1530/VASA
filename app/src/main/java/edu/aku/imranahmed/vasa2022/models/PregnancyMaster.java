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

public class PregnancyMaster extends BaseObservable implements Observable {

    private final String TAG = "Pregnancy";
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String clusterCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
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

    private String e101a = _EMPTY_;
    private String e101b = _EMPTY_;
    private String e101 = _EMPTY_;
    private String e102 = _EMPTY_;
    private String e102a = _EMPTY_;


    public void PregnancyMaster() {
    }

    public void populateMeta() {
        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setClusterCode(MainApp.currentHousehold.getClusterCode());
        setHhid(MainApp.currentHousehold.getHhno());
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

    public String getClusterCode() {
        return clusterCode;
    }

    public void setClusterCode(String psuCode) {
        this.clusterCode = psuCode;
    }

    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
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
    public String getE101a() {
        return e101a;
    }

    public void setE101a(String e101a) {
        this.e101a = e101a;
        this.mName = e101a;
        notifyPropertyChanged(BR.e101a);
    }

    @Bindable
    public String getE101b() {
        return e101b;
    }

    public void setE101b(String e101b) {
        this.e101b = e101b;
        this.sno = e101b;
        notifyPropertyChanged(BR.e101b);
    }

    @Bindable
    public String getE101() {
        return e101;
    }

    public void setE101(String e101) {
        this.e101 = e101;
        setE102(e101.equals("2") ? "" : this.e102);
        setE102a(e101.equals("2") ? "" : this.e102a);
        notifyPropertyChanged(BR.e101);
    }

    @Bindable
    public String getE102() {
        return e102;
    }

    public void setE102(String e102) {
        this.e102 = e102;
        notifyPropertyChanged(BR.e102);
    }

    @Bindable
    public String getE102a() {
        return e102a;
    }

    public void setE102a(String e102a) {
        this.e102a = e102a;
        notifyPropertyChanged(BR.e102a);
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.PregnancyMasterTable.COLUMN_ID, this.id);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_UID, this.uid);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_PSU_CODE, this.clusterCode);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_M_NAME, this.mName);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_SYSDATE, this.syncDate);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.PregnancyMasterTable.COLUMN_SE1, new JSONObject(sE1toString()));
        return json;
    }

    public String sE1toString() throws JSONException {
        Log.d(TAG, "sE1toString: ");
        JSONObject json = new JSONObject();
        json
                .put("e101a", e101a)
                .put("e101b", e101b)
                .put("e101", e101)
                .put("e102", e102)
                .put("e102a", e102a);

        return json.toString();
    }


    public PregnancyMaster Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_PROJECT_NAME));
        this.clusterCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_SNO));
        this.mName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_M_NAME));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_SYNC_DATE));

        sE1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyMasterTable.COLUMN_SE1)));
        return this;
    }

    public void sE1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e101a = json.getString("e101a");
            this.e101b = json.has("e101b") ? json.getString("e101b") : "";
            this.e101 = json.getString("e101");
            this.e102 = json.getString("e102");
            this.e102a = json.getString("e102a");
        }
    }


}
