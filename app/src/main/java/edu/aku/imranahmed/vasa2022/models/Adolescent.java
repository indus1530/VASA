package edu.aku.imranahmed.vasa2022.models;

import static edu.aku.imranahmed.vasa2022.core.MainApp.PROJECT_NAME;
import static edu.aku.imranahmed.vasa2022.core.MainApp._EMPTY_;
import static edu.aku.imranahmed.vasa2022.core.MainApp.selectedAdol;
import static edu.aku.imranahmed.vasa2022.core.MainApp.selectedMWRA;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.imranahmed.vasa2022.BR;
import edu.aku.imranahmed.vasa2022.contracts.TableContracts.AdolescentTable;
import edu.aku.imranahmed.vasa2022.core.MainApp;

public class Adolescent extends BaseObservable implements Observable {

    private final String TAG = "Adolescent";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    private String muid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String indexed = _EMPTY_;
    private String name = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;


    // Field Variables
    private String n001 = _EMPTY_;
    private String n002 = _EMPTY_;
    private String n003 = _EMPTY_;
    private String n004 = _EMPTY_;
    private String n005 = _EMPTY_;
    private String n005ax = _EMPTY_;
    private String n005bx = _EMPTY_;
    private String n005cx = _EMPTY_;
    private String n006 = _EMPTY_;
    private String n006fx = _EMPTY_;
    private String n006jx = _EMPTY_;
    private String n00696x = _EMPTY_;
    private String n008 = _EMPTY_;
    private String n00896x = _EMPTY_;
    private String n0091 = _EMPTY_;
    private String n0092 = _EMPTY_;
    private String n0093 = _EMPTY_;
    private String n0094 = _EMPTY_;
    private String n010 = _EMPTY_;
    private String n011 = _EMPTY_;
    private String n012 = _EMPTY_;
    private String n013 = _EMPTY_;
    private String n014 = _EMPTY_;
    private String n015 = _EMPTY_;
    private String n016 = _EMPTY_;
    private String n017 = _EMPTY_;
    private String n018 = _EMPTY_;
    private String n019 = _EMPTY_;
    private String n019ax = _EMPTY_;
    private String n019bx = _EMPTY_;
    private String n020 = _EMPTY_;
    private String n021 = _EMPTY_;
    private String n022 = _EMPTY_;
    private String n0221 = _EMPTY_;
    private String n0222 = _EMPTY_;
    private String n0223 = _EMPTY_;
    private String n023 = _EMPTY_;
    private String n024 = _EMPTY_;
    private String n0241 = _EMPTY_;
    private String n025 = _EMPTY_;
    private String n025ax = _EMPTY_;
    private String n026 = _EMPTY_;
    private String n051 = _EMPTY_;
    private String n052 = _EMPTY_;
    private String n053a = _EMPTY_;
    private String n053b = _EMPTY_;
    private String n053c = _EMPTY_;
    private String n053d = _EMPTY_;
    private String n053e = _EMPTY_;
    private String n053f = _EMPTY_;
    private String n05398 = _EMPTY_;
    private String n05396 = _EMPTY_;
    private String n05396x = _EMPTY_;
    private String n054 = _EMPTY_;
    private String n055 = _EMPTY_;
    private String n056 = _EMPTY_;
    private String n0571 = _EMPTY_;
    private String n0572 = _EMPTY_;
    private String n0573 = _EMPTY_;
    private String n0574 = _EMPTY_;
    private String n0575 = _EMPTY_;
    private String n0576 = _EMPTY_;
    private String n058a = _EMPTY_;
    private String n058b = _EMPTY_;
    private String n058c = _EMPTY_;
    private String n058d = _EMPTY_;
    private String n058e = _EMPTY_;
    private String n058f = _EMPTY_;
    private String n058g = _EMPTY_;
    private String n058h = _EMPTY_;
    private String n058i = _EMPTY_;
    private String n058j = _EMPTY_;
    private String n059 = _EMPTY_;
    private String n060 = _EMPTY_;
    private String n061 = _EMPTY_;
    private String n062 = _EMPTY_;
    private String n063 = _EMPTY_;
    private String n064 = _EMPTY_;
    private String n065 = _EMPTY_;
    private String n066 = _EMPTY_;
    private String n067 = _EMPTY_;
    private String n068 = _EMPTY_;
    private String n0691 = _EMPTY_;
    private String n0692 = _EMPTY_;
    private String n0693 = _EMPTY_;
    private String n070 = _EMPTY_;
    private String n071 = _EMPTY_;
    private String n072 = _EMPTY_;
    private String n073 = _EMPTY_;
    private String n074 = _EMPTY_;
    private String n07496x = _EMPTY_;
    private String n075 = _EMPTY_;
    private String n076 = _EMPTY_;
    private String n076fx = _EMPTY_;
    private String n077 = _EMPTY_;
    private String n078a = _EMPTY_;
    private String n078b = _EMPTY_;
    private String n078c = _EMPTY_;
    private String n078d = _EMPTY_;
    private String n078e = _EMPTY_;
    private String n078f = _EMPTY_;
    private String n078g = _EMPTY_;
    private String n078h = _EMPTY_;
    private String n078i = _EMPTY_;
    private String n078j = _EMPTY_;
    private String n078k = _EMPTY_;
    private String n078l = _EMPTY_;
    private String n078m = _EMPTY_;
    private String n07898 = _EMPTY_;
    private String n07896 = _EMPTY_;
    private String n07896x = _EMPTY_;
    private String n080a = _EMPTY_;
    private String n080b = _EMPTY_;
    private String n080c = _EMPTY_;
    private String n080d = _EMPTY_;
    private String n080e = _EMPTY_;
    private String n080f = _EMPTY_;
    private String n080g = _EMPTY_;
    private String n080h = _EMPTY_;
    private String n080i = _EMPTY_;
    private String n080j = _EMPTY_;
    private String n080k = _EMPTY_;
    private String n080l = _EMPTY_;
    private String n080m = _EMPTY_;
    private String n080n = _EMPTY_;
    private String n080o = _EMPTY_;
    private String n080ox = _EMPTY_;
    private String n080p = _EMPTY_;
    private String n081 = _EMPTY_;
    private String n082a = _EMPTY_;
    private String n082b = _EMPTY_;
    private String n082c = _EMPTY_;
    private String n082d = _EMPTY_;
    private String n082e = _EMPTY_;
    private String n082f = _EMPTY_;
    private String n08298 = _EMPTY_;
    private String n08296 = _EMPTY_;
    private String n08296x = _EMPTY_;
    private String n083 = _EMPTY_;
    private String n084a = _EMPTY_;
    private String n084b = _EMPTY_;
    private String n084c = _EMPTY_;
    private String n084d = _EMPTY_;
    private String n084e = _EMPTY_;
    private String n084f = _EMPTY_;
    private String n084g = _EMPTY_;
    private String n084h = _EMPTY_;
    private String n084i = _EMPTY_;
    private String n084j = _EMPTY_;
    private String n084k = _EMPTY_;
    private String n084l = _EMPTY_;
    private String n084m = _EMPTY_;
    private String n084n = _EMPTY_;
    private String n08496 = _EMPTY_;
    private String n08496x = _EMPTY_;
    private String n085 = _EMPTY_;
    private String n086a = _EMPTY_;
    private String n086b = _EMPTY_;
    private String n086c = _EMPTY_;
    private String n086d = _EMPTY_;
    private String n086e = _EMPTY_;
    private String n086f = _EMPTY_;
    private String n086g = _EMPTY_;
    private String n086h = _EMPTY_;
    private String n086i = _EMPTY_;
    private String n086j = _EMPTY_;
    private String n086k = _EMPTY_;
    private String n086l = _EMPTY_;
    private String n08698 = _EMPTY_;
    private String n08696 = _EMPTY_;
    private String n08696x = _EMPTY_;
    private String n087 = _EMPTY_;
    private String n088a = _EMPTY_;
    private String n088b = _EMPTY_;
    private String n088c = _EMPTY_;
    private String n088d = _EMPTY_;
    private String n088e = _EMPTY_;
    private String n088f = _EMPTY_;
    private String n088g = _EMPTY_;
    private String n088h = _EMPTY_;
    private String n088i = _EMPTY_;
    private String n088j = _EMPTY_;
    private String n088k = _EMPTY_;
    private String n088l = _EMPTY_;
    private String n088m = _EMPTY_;
    private String n088n = _EMPTY_;
    private String n088o = _EMPTY_;
    private String n088p = _EMPTY_;
    private String n088q = _EMPTY_;
    private String n088r = _EMPTY_;
    private String n088rx = _EMPTY_;
    private String n088s = _EMPTY_;
    private String n089 = _EMPTY_;
    private String n08996x = _EMPTY_;
    private String n090 = _EMPTY_;
    private String n091a = _EMPTY_;
    private String n091b = _EMPTY_;
    private String n091c = _EMPTY_;
    private String n091d = _EMPTY_;
    private String n091e = _EMPTY_;
    private String n091f = _EMPTY_;
    private String n09198 = _EMPTY_;
    private String n09196 = _EMPTY_;
    private String n09196x = _EMPTY_;
    private String n092 = _EMPTY_;
    private String n092fx = _EMPTY_;
    private String n093 = _EMPTY_;
    private String n093fx = _EMPTY_;
    private String n093jx = _EMPTY_;
    private String n09396x = _EMPTY_;
    private String n094 = _EMPTY_;
    private String n095 = _EMPTY_;
    private String n096a = _EMPTY_;
    private String n096b = _EMPTY_;
    private String n096c = _EMPTY_;
    private String n096d = _EMPTY_;
    private String n096e = _EMPTY_;
    private String n096f = _EMPTY_;
    private String n096g = _EMPTY_;
    private String n096h = _EMPTY_;
    private String n096i = _EMPTY_;
    private String n096j = _EMPTY_;
    private String n096k = _EMPTY_;
    private String n096l = _EMPTY_;
    private String n096m = _EMPTY_;
    private String n096n = _EMPTY_;
    private String n096o = _EMPTY_;
    private String n096p = _EMPTY_;
    private String n096q = _EMPTY_;
    private String n096r = _EMPTY_;
    private String n097m = _EMPTY_;
    private String n097h = _EMPTY_;
    private String n097d = _EMPTY_;
    private String n098 = _EMPTY_;
    private String n09896x = _EMPTY_;
    private String n099 = _EMPTY_;
    private String n100a = _EMPTY_;
    private String n100b = _EMPTY_;
    private String n100c = _EMPTY_;
    private String n100d = _EMPTY_;
    private String n100e = _EMPTY_;
    private String n100f = _EMPTY_;
    private String n10098 = _EMPTY_;
    private String n10096 = _EMPTY_;
    private String n10096x = _EMPTY_;
    private String n101a = _EMPTY_;
    private String n101b = _EMPTY_;
    private String n101c = _EMPTY_;
    private String n101d = _EMPTY_;
    private String n101e = _EMPTY_;
    private String n101f = _EMPTY_;
    private String n10198 = _EMPTY_;
    private String n10196 = _EMPTY_;
    private String n10196x = _EMPTY_;
    private String n102 = _EMPTY_;
    private String n103 = _EMPTY_;


    // Field Variables
    //AH1
    private String ah1 = _EMPTY_;
    private String ah2 = _EMPTY_;
    private String ah3 = _EMPTY_;
    private String ah396x = _EMPTY_;
    private String ah4a = _EMPTY_;
    private String ah5 = _EMPTY_;
    private String ah6 = _EMPTY_;
    private String ah7a = _EMPTY_;
    private String ah7b = _EMPTY_;
    private String ah7c = _EMPTY_;
    private String ah7d = _EMPTY_;
    private String ah7e = _EMPTY_;
    private String ah7f = _EMPTY_;
    private String ah7g = _EMPTY_;
    private String ah7h = _EMPTY_;
    private String ah796 = _EMPTY_;
    private String ah796x = _EMPTY_;

    //AH2
    private String ah8 = _EMPTY_;
    private String ah9 = _EMPTY_;
    private String ah10 = _EMPTY_;
    private String ah11a = _EMPTY_;
    private String ah12 = _EMPTY_;
    private String ah13 = _EMPTY_;
    private String ah13aa = _EMPTY_;
    private String ah13ab = _EMPTY_;

    //AH3
    private String ah14 = _EMPTY_;
    private String ah15 = _EMPTY_;
    private String ah16 = _EMPTY_;
    private String ah17 = _EMPTY_;
    private String ah18 = _EMPTY_;
    private String ah19 = _EMPTY_;
    private String ah20 = _EMPTY_;
    private String ah21 = _EMPTY_;
    private String ah2102 = _EMPTY_;
    private String ah2201 = _EMPTY_;
    private String ah2202 = _EMPTY_;
    private String ah2203 = _EMPTY_;
    private String ah2296 = _EMPTY_;
    private String ah2296x = _EMPTY_;
    private String ah23 = _EMPTY_;
    private String ah2301x = _EMPTY_;
    private String ah2302x = _EMPTY_;
    private String ah2303x = _EMPTY_;
    private String ah2401 = _EMPTY_;
    private String ah2402 = _EMPTY_;
    private String ah2403 = _EMPTY_;
    private String ah2404 = _EMPTY_;
    private String ah2405 = _EMPTY_;
    private String ah2406 = _EMPTY_;
    private String ah2407 = _EMPTY_;
    private String ah2408 = _EMPTY_;
    private String ah2409 = _EMPTY_;
    private String ah2410 = _EMPTY_;
    private String ah2411 = _EMPTY_;
    private String ah24a = _EMPTY_;
    private String ah25 = _EMPTY_;
    private String ah26 = _EMPTY_;
    private String ah2696x = _EMPTY_;
    private String ah27 = _EMPTY_;
    private String ah28 = _EMPTY_;
    private String ah29 = _EMPTY_;
    private String ah3001 = _EMPTY_;
    private String ah3002 = _EMPTY_;
    private String ah3003 = _EMPTY_;
    private String ah31 = _EMPTY_;

    //AH4
    private String ah3201 = _EMPTY_;
    private String ah3202 = _EMPTY_;
    private String ah3203 = _EMPTY_;
    private String ah3204 = _EMPTY_;
    private String ah3205 = _EMPTY_;

    //AH5
    private String ah33a = _EMPTY_;
    private String ah33b = _EMPTY_;
    private String ah33c = _EMPTY_;
    private String ah3398 = _EMPTY_;
    private String ah34 = _EMPTY_;
    private String ah35a = _EMPTY_;
    private String ah35b = _EMPTY_;
    private String ah35c = _EMPTY_;
    private String ah35d = _EMPTY_;
    private String ah35e = _EMPTY_;
    private String ah35f = _EMPTY_;
    private String ah35g = _EMPTY_;
    private String ah35h = _EMPTY_;
    private String ah35i = _EMPTY_;
    private String ah35j = _EMPTY_;
    private String ah36 = _EMPTY_;
    private String ah36ax = _EMPTY_;

    //AH6
    private String ah3701 = _EMPTY_;
    private String ah3701a = _EMPTY_;
    private String ah3701b = _EMPTY_;
    private String ah3701c = _EMPTY_;
    private String ah3701d = _EMPTY_;
    private String ah3701e = _EMPTY_;
    private String ah3701f = _EMPTY_;
    private String ah3701x = _EMPTY_;
    private String ah3701xx = _EMPTY_;
    private String ah3702 = _EMPTY_;
    private String ah3702a = _EMPTY_;
    private String ah3702b = _EMPTY_;
    private String ah3702c = _EMPTY_;
    private String ah3702e = _EMPTY_;
    private String ah3702d = _EMPTY_;
    private String ah3702f = _EMPTY_;
    private String ah3702x = _EMPTY_;
    private String ah3702xx = _EMPTY_;
    private String ah3703 = _EMPTY_;
    private String ah3703a = _EMPTY_;
    private String ah3703b = _EMPTY_;
    private String ah3703c = _EMPTY_;
    private String ah3703e = _EMPTY_;
    private String ah3703d = _EMPTY_;
    private String ah3703f = _EMPTY_;
    private String ah3703x = _EMPTY_;
    private String ah3703xx = _EMPTY_;
    private String ah3704 = _EMPTY_;
    private String ah3704a = _EMPTY_;
    private String ah3704b = _EMPTY_;
    private String ah3704c = _EMPTY_;
    private String ah3704e = _EMPTY_;
    private String ah3704d = _EMPTY_;
    private String ah3704f = _EMPTY_;
    private String ah3704x = _EMPTY_;
    private String ah3704xx = _EMPTY_;
    private String ah3705 = _EMPTY_;
    private String ah3705a = _EMPTY_;
    private String ah3705b = _EMPTY_;
    private String ah3705c = _EMPTY_;
    private String ah3705e = _EMPTY_;
    private String ah3705d = _EMPTY_;
    private String ah3705f = _EMPTY_;
    private String ah3705x = _EMPTY_;
    private String ah3705xx = _EMPTY_;
    private String ah3706 = _EMPTY_;
    private String ah3706a = _EMPTY_;
    private String ah3706b = _EMPTY_;
    private String ah3706c = _EMPTY_;
    private String ah3706e = _EMPTY_;
    private String ah3706d = _EMPTY_;
    private String ah3706f = _EMPTY_;
    private String ah3706x = _EMPTY_;
    private String ah3706xx = _EMPTY_;
    private String ah37aa = _EMPTY_;
    private String ah37ab = _EMPTY_;
    private String ah37ac = _EMPTY_;
    private String ah38 = _EMPTY_;
    private String ah38aa = _EMPTY_;
    private String ah39 = _EMPTY_;
    private String ah39a = _EMPTY_;
    private String ah39b = _EMPTY_;
    private String ah39c = _EMPTY_;
    private String ah39d = _EMPTY_;
    private String ah39x = _EMPTY_;
    private String ah39xx = _EMPTY_;
    private String ah40 = _EMPTY_;
    private String ah40a = _EMPTY_;
    private String ah40b = _EMPTY_;
    private String ah40c = _EMPTY_;
    private String ah40d = _EMPTY_;
    private String ah40e = _EMPTY_;
    private String ah40f = _EMPTY_;
    private String ah40g = _EMPTY_;
    private String ah40h = _EMPTY_;
    private String ah40x = _EMPTY_;
    private String ah40xx = _EMPTY_;
    private String ah40aa = _EMPTY_;
    private String ah40aaa = _EMPTY_;
    private String ah40aab = _EMPTY_;
    private String ah40aac = _EMPTY_;
    private String ah40aad = _EMPTY_;
    private String ah40aae = _EMPTY_;
    private String ah40aaf = _EMPTY_;
    private String ah40aag = _EMPTY_;
    private String ah40aah = _EMPTY_;
    private String ah40aax = _EMPTY_;
    private String ah40aaxx = _EMPTY_;
    private String ah41 = _EMPTY_;
    private String ah42 = _EMPTY_;
    private String ah43 = _EMPTY_;
    private String ah44 = _EMPTY_;
    private String ah44a = _EMPTY_;
    private String ah44b = _EMPTY_;
    private String ah44c = _EMPTY_;
    private String ah44d = _EMPTY_;
    private String ah44e = _EMPTY_;
    private String ah44f = _EMPTY_;
    private String ah44g = _EMPTY_;
    private String ah44h = _EMPTY_;
    private String ah44i = _EMPTY_;
    private String ah45 = _EMPTY_;
    private String ah46 = _EMPTY_;
    private String ah47d = _EMPTY_;
    private String ah48 = _EMPTY_;

    //AH7
    private String ah49a = _EMPTY_;
    private String ah49b = _EMPTY_;
    private String ah49c = _EMPTY_;
    private String ah49ax = _EMPTY_;
    private String ah49bx = _EMPTY_;

    private String ah50 = _EMPTY_;
    private String ah50aaa = _EMPTY_;
    private String ah50aab = _EMPTY_;
    private String ah51 = _EMPTY_;
    private String ah52a = _EMPTY_;
    private String ah53 = _EMPTY_;
    private String ah54 = _EMPTY_;
    private String ah54ax = _EMPTY_;
    private String ah55 = _EMPTY_;
    private String ah56a = _EMPTY_;
    private String ah57 = _EMPTY_;
    private String ah57ax = _EMPTY_;
    private String ah58a = _EMPTY_;
    private String ah59a = _EMPTY_;
    private String ah59b = _EMPTY_;
    private String ah59c = _EMPTY_;
    private String ah59d = _EMPTY_;
    private String ah60a = _EMPTY_;

    public void Adolescent() {
    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setpsuCode(MainApp.currentHousehold.getClusterCode());
        setHhid(MainApp.currentHousehold.getHhno());
        setSno(selectedAdol);
        setFmuid(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getUid()); //// not applicable in Form table
        setIndexed(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getIndexed());
        setName(MainApp.familyList.get(Integer.parseInt(selectedAdol.isEmpty() ? selectedMWRA : selectedAdol) - 1).getD102());


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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getpsuCode() {
        return psuCode;
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

    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }


    @Bindable
    public String getN001() {
        return n001;
    }

    public void setN001(String n001) {
        this.n001 = n001;
        notifyPropertyChanged(BR.n001);
    }


    @Bindable
    public String getN002() {
        return n002;
    }

    public void setN002(String n002) {
        this.n002 = n002;
        notifyPropertyChanged(BR.n002);
    }

    @Bindable
    public String getN003() {
        return n003;
    }

    public void setN003(String n003) {
        this.n003 = n003;
        notifyPropertyChanged(BR.n003);
    }

    @Bindable
    public String getN004() {
        return n004;
    }

    public void setN004(String n004) {
        this.n004 = n004;
        notifyPropertyChanged(BR.n004);
    }


    @Bindable
    public String getN005() {
        return n005;
    }

    public void setN005(String n005) {
        this.n005 = n005;
        setN005ax(n005.equals("1") ? this.n005ax : "");
        setN005bx(n005.equals("2") ? this.n005bx : "");
        setN005cx(n005.equals("3") ? this.n005cx : "");
        notifyPropertyChanged(BR.n005);
    }


    @Bindable
    public String getN005ax() {
        return n005ax;
    }

    public void setN005ax(String n005ax) {
        this.n005ax = n005ax;
        notifyPropertyChanged(BR.n005ax);
    }


    @Bindable
    public String getN005bx() {
        return n005bx;
    }

    public void setN005bx(String n005bx) {
        this.n005bx = n005bx;
        notifyPropertyChanged(BR.n005bx);
    }


    @Bindable
    public String getN005cx() {
        return n005cx;
    }

    public void setN005cx(String n005cx) {
        this.n005cx = n005cx;
        notifyPropertyChanged(BR.n005cx);
    }


    @Bindable
    public String getN006() {
        return n006;
    }

    public void setN006(String n006) {
        this.n006 = n006;
        setN006fx(n006.equals("6") ? this.n006fx : "");
        setN006jx(n006.equals("10") ? this.n006jx : "");
        setN00696x(n006.equals("96") ? this.n00696x : "");
        notifyPropertyChanged(BR.n006);
    }


    @Bindable
    public String getN006fx() {
        return n006fx;
    }

    public void setN006fx(String n006fx) {
        this.n006fx = n006fx;
        notifyPropertyChanged(BR.n006fx);
    }


    @Bindable
    public String getN006jx() {
        return n006jx;
    }

    public void setN006jx(String n006jx) {
        this.n006jx = n006jx;
        notifyPropertyChanged(BR.n006jx);
    }


    @Bindable
    public String getN00696x() {
        return n00696x;
    }

    public void setN00696x(String n00696x) {
        this.n00696x = n00696x;
        notifyPropertyChanged(BR.n00696x);
    }


    @Bindable
    public String getN008() {
        return n008;
    }

    public void setN008(String n008) {
        this.n008 = n008;
        setN00896x(n008.equals("96") ? this.n00896x : "");
        notifyPropertyChanged(BR.n008);
    }


    @Bindable
    public String getN00896x() {
        return n00896x;
    }

    public void setN00896x(String n00896x) {
        this.n00896x = n00896x;
        notifyPropertyChanged(BR.n00896x);
    }


    @Bindable
    public String getN0091() {
        return n0091;
    }

    public void setN0091(String n0091) {
        this.n0091 = n0091;
        notifyPropertyChanged(BR.n0091);
    }


    @Bindable
    public String getN0092() {
        return n0092;
    }

    public void setN0092(String n0092) {
        this.n0092 = n0092;
        notifyPropertyChanged(BR.n0092);
    }


    @Bindable
    public String getN0093() {
        return n0093;
    }

    public void setN0093(String n0093) {
        this.n0093 = n0093;
        notifyPropertyChanged(BR.n0093);
    }


    @Bindable
    public String getN0094() {
        return n0094;
    }

    public void setN0094(String n0094) {
        this.n0094 = n0094;
        notifyPropertyChanged(BR.n0094);
    }


    @Bindable
    public String getN010() {
        return n010;
    }

    public void setN010(String n010) {
        this.n010 = n010;
        notifyPropertyChanged(BR.n010);
    }


    @Bindable
    public String getN011() {
        return n011;
    }

    public void setN011(String n011) {
        this.n011 = n011;
        notifyPropertyChanged(BR.n011);
    }


    @Bindable
    public String getN012() {
        return n012;
    }

    public void setN012(String n012) {
        this.n012 = n012;
        notifyPropertyChanged(BR.n012);
    }


    @Bindable
    public String getN013() {
        return n013;
    }

    public void setN013(String n013) {
        this.n013 = n013;
        notifyPropertyChanged(BR.n013);
    }


    @Bindable
    public String getN014() {
        return n014;
    }

    public void setN014(String n014) {
        this.n014 = n014;
        notifyPropertyChanged(BR.n014);
    }


    @Bindable
    public String getN015() {
        return n015;
    }

    public void setN015(String n015) {
        this.n015 = n015;
        notifyPropertyChanged(BR.n015);
    }


    @Bindable
    public String getN016() {
        return n016;
    }

    public void setN016(String n016) {
        this.n016 = n016;
        notifyPropertyChanged(BR.n016);
    }


    @Bindable
    public String getN017() {
        return n017;
    }

    public void setN017(String n017) {
        this.n017 = n017;
        notifyPropertyChanged(BR.n017);
    }


    @Bindable
    public String getN018() {
        return n018;
    }

    public void setN018(String n018) {
        this.n018 = n018;
        notifyPropertyChanged(BR.n018);
    }


    @Bindable
    public String getN019() {
        return n019;
    }

    public void setN019(String n019) {
        this.n019 = n019;
        setN019ax(n019.equals("1") ? this.n019ax : "");
        setN019bx(n019.equals("2") ? this.n019bx : "");
        notifyPropertyChanged(BR.n019);
    }


    @Bindable
    public String getN019ax() {
        return n019ax;
    }

    public void setN019ax(String n019ax) {
        this.n019ax = n019ax;
        notifyPropertyChanged(BR.n019ax);
    }


    @Bindable
    public String getN019bx() {
        return n019bx;
    }

    public void setN019bx(String n019bx) {
        this.n019bx = n019bx;
        notifyPropertyChanged(BR.n019bx);
    }


    @Bindable
    public String getN020() {
        return n020;
    }

    public void setN020(String n020) {
        this.n020 = n020;
        notifyPropertyChanged(BR.n020);
    }


    @Bindable
    public String getN021() {
        return n021;
    }

    public void setN021(String n021) {
        this.n021 = n021;
        notifyPropertyChanged(BR.n021);
    }


    @Bindable
    public String getN022() {
        return n022;
    }

    public void setN022(String n022) {
        this.n022 = n022;
        notifyPropertyChanged(BR.n022);
    }


    @Bindable
    public String getN0221() {
        return n0221;
    }

    public void setN0221(String n0221) {
        this.n0221 = n0221;
        notifyPropertyChanged(BR.n0221);
    }


    @Bindable
    public String getN0222() {
        return n0222;
    }

    public void setN0222(String n0222) {
        this.n0222 = n0222;
        notifyPropertyChanged(BR.n0222);
    }


    @Bindable
    public String getN0223() {
        return n0223;
    }

    public void setN0223(String n0223) {
        this.n0223 = n0223;
        notifyPropertyChanged(BR.n0223);
    }


    @Bindable
    public String getN023() {
        return n023;
    }

    public void setN023(String n023) {
        this.n023 = n023;
        notifyPropertyChanged(BR.n023);
    }


    @Bindable
    public String getN024() {
        return n024;
    }

    public void setN024(String n024) {
        this.n024 = n024;
        notifyPropertyChanged(BR.n024);
    }


    @Bindable
    public String getN0241() {
        return n0241;
    }

    public void setN0241(String n0241) {
        this.n0241 = n0241;
        notifyPropertyChanged(BR.n0241);
    }


    @Bindable
    public String getN025() {
        return n025;
    }

    public void setN025(String n025) {
        this.n025 = n025;
        setN025ax(n025.equals("1") ? this.n025ax : "");
        notifyPropertyChanged(BR.n025);
    }


    @Bindable
    public String getN025ax() {
        return n025ax;
    }

    public void setN025ax(String n025ax) {
        this.n025ax = n025ax;
        notifyPropertyChanged(BR.n025ax);
    }


    @Bindable
    public String getN026() {
        return n026;
    }

    public void setN026(String n026) {
        this.n026 = n026;
        notifyPropertyChanged(BR.n026);
    }


    @Bindable
    public String getN051() {
        return n051;
    }

    public void setN051(String n051) {
        this.n051 = n051;
        notifyPropertyChanged(BR.n051);
    }


    @Bindable
    public String getN052() {
        return n052;
    }

    public void setN052(String n052) {
        this.n052 = n052;
        notifyPropertyChanged(BR.n052);
    }


    @Bindable
    public String getN053a() {
        return n053a;
    }

    public void setN053a(String n053a) {
        if (this.n053a.equals(n053a)) return;
        this.n053a = n053a;
        notifyPropertyChanged(BR.n053a);
    }


    @Bindable
    public String getN053b() {
        return n053b;
    }

    public void setN053b(String n053b) {
        if (this.n053b.equals(n053b)) return;
        this.n053b = n053b;
        notifyPropertyChanged(BR.n053b);
    }


    @Bindable
    public String getN053c() {
        return n053c;
    }

    public void setN053c(String n053c) {
        if (this.n053c.equals(n053c)) return;
        this.n053c = n053c;
        notifyPropertyChanged(BR.n053c);
    }


    @Bindable
    public String getN053d() {
        return n053d;
    }

    public void setN053d(String n053d) {
        if (this.n053d.equals(n053d)) return;
        this.n053d = n053d;
        notifyPropertyChanged(BR.n053d);
    }


    @Bindable
    public String getN053e() {
        return n053e;
    }

    public void setN053e(String n053e) {
        if (this.n053e.equals(n053e)) return;
        this.n053e = n053e;
        notifyPropertyChanged(BR.n053e);
    }


    @Bindable
    public String getN053f() {
        return n053f;
    }

    public void setN053f(String n053f) {
        if (this.n053f.equals(n053f)) return;
        this.n053f = n053f;
        notifyPropertyChanged(BR.n053f);
    }


    @Bindable
    public String getN05398() {
        return n05398;
    }

    public void setN05398(String n05398) {
        if (this.n05398.equals(n05398)) return;
        this.n05398 = n05398;
        setN053a(n05398.equals("98") ? "" : this.n053a);
        setN053b(n05398.equals("98") ? "" : this.n053b);
        setN053c(n05398.equals("98") ? "" : this.n053c);
        setN053d(n05398.equals("98") ? "" : this.n053d);
        setN053e(n05398.equals("98") ? "" : this.n053e);
        setN053f(n05398.equals("98") ? "" : this.n053f);
        setN05396(n05398.equals("98") ? "" : this.n05396);
        notifyPropertyChanged(BR.n05398);
    }


    @Bindable
    public String getN05396() {
        return n05396;
    }

    public void setN05396(String n05396) {
        if (this.n05396.equals(n05396)) return;
        this.n05396 = n05396;
        setN05396x(n05396.equals("96") ? this.n05396x : "");
        notifyPropertyChanged(BR.n05396);
    }


    @Bindable
    public String getN05396x() {
        return n05396x;
    }

    public void setN05396x(String n05396x) {
        this.n05396x = n05396x;
        notifyPropertyChanged(BR.n05396x);
    }


    @Bindable
    public String getN054() {
        return n054;
    }

    public void setN054(String n054) {
        this.n054 = n054;
        notifyPropertyChanged(BR.n054);
    }


    @Bindable
    public String getN055() {
        return n055;
    }

    public void setN055(String n055) {
        this.n055 = n055;
        notifyPropertyChanged(BR.n055);
    }


    @Bindable
    public String getN056() {
        return n056;
    }

    public void setN056(String n056) {
        this.n056 = n056;
        notifyPropertyChanged(BR.n056);
    }


    @Bindable
    public String getN0571() {
        return n0571;
    }

    public void setN0571(String n0571) {
        this.n0571 = n0571;
        notifyPropertyChanged(BR.n0571);
    }


    @Bindable
    public String getN0572() {
        return n0572;
    }

    public void setN0572(String n0572) {
        this.n0572 = n0572;
        notifyPropertyChanged(BR.n0572);
    }


    @Bindable
    public String getN0573() {
        return n0573;
    }

    public void setN0573(String n0573) {
        this.n0573 = n0573;
        notifyPropertyChanged(BR.n0573);
    }


    @Bindable
    public String getN0574() {
        return n0574;
    }

    public void setN0574(String n0574) {
        this.n0574 = n0574;
        notifyPropertyChanged(BR.n0574);
    }


    @Bindable
    public String getN0575() {
        return n0575;
    }

    public void setN0575(String n0575) {
        this.n0575 = n0575;
        notifyPropertyChanged(BR.n0575);
    }


    @Bindable
    public String getN0576() {
        return n0576;
    }

    public void setN0576(String n0576) {
        this.n0576 = n0576;
        notifyPropertyChanged(BR.n0576);
    }


    @Bindable
    public String getN058a() {
        return n058a;
    }

    public void setN058a(String n058a) {
        if (this.n058a.equals(n058a)) return;
        this.n058a = n058a;
        notifyPropertyChanged(BR.n058a);
    }


    @Bindable
    public String getN058b() {
        return n058b;
    }

    public void setN058b(String n058b) {
        if (this.n058b.equals(n058b)) return;
        this.n058b = n058b;
        notifyPropertyChanged(BR.n058b);
    }


    @Bindable
    public String getN058c() {
        return n058c;
    }

    public void setN058c(String n058c) {
        if (this.n058c.equals(n058c)) return;
        this.n058c = n058c;
        notifyPropertyChanged(BR.n058c);
    }


    @Bindable
    public String getN058d() {
        return n058d;
    }

    public void setN058d(String n058d) {
        if (this.n058d.equals(n058d)) return;
        this.n058d = n058d;
        notifyPropertyChanged(BR.n058d);
    }


    @Bindable
    public String getN058e() {
        return n058e;
    }

    public void setN058e(String n058e) {
        if (this.n058e.equals(n058e)) return;
        this.n058e = n058e;
        notifyPropertyChanged(BR.n058e);
    }


    @Bindable
    public String getN058f() {
        return n058f;
    }

    public void setN058f(String n058f) {
        if (this.n058f.equals(n058f)) return;
        this.n058f = n058f;
        notifyPropertyChanged(BR.n058f);
    }


    @Bindable
    public String getN058g() {
        return n058g;
    }

    public void setN058g(String n058g) {
        if (this.n058g.equals(n058g)) return;
        this.n058g = n058g;
        notifyPropertyChanged(BR.n058g);
    }


    @Bindable
    public String getN058h() {
        return n058h;
    }

    public void setN058h(String n058h) {
        if (this.n058h.equals(n058h)) return;
        this.n058h = n058h;
        notifyPropertyChanged(BR.n058h);
    }


    @Bindable
    public String getN058i() {
        return n058i;
    }

    public void setN058i(String n058i) {
        if (this.n058i.equals(n058i)) return;
        this.n058i = n058i;
        notifyPropertyChanged(BR.n058i);
    }


    @Bindable
    public String getN058j() {
        return n058j;
    }

    public void setN058j(String n058j) {
        if (this.n058j.equals(n058j)) return;
        this.n058j = n058j;
        setN058a(n058j.equals("10") ? "" : this.n058a);
        setN058b(n058j.equals("10") ? "" : this.n058b);
        setN058c(n058j.equals("10") ? "" : this.n058c);
        setN058d(n058j.equals("10") ? "" : this.n058d);
        setN058e(n058j.equals("10") ? "" : this.n058e);
        setN058f(n058j.equals("10") ? "" : this.n058f);
        setN058g(n058j.equals("10") ? "" : this.n058g);
        setN058h(n058j.equals("10") ? "" : this.n058h);
        setN058i(n058j.equals("10") ? "" : this.n058i);
        notifyPropertyChanged(BR.n058j);
    }


    @Bindable
    public String getN059() {
        return n059;
    }

    public void setN059(String n059) {
        this.n059 = n059;
        notifyPropertyChanged(BR.n059);
    }


    @Bindable
    public String getN060() {
        return n060;
    }

    public void setN060(String n060) {
        this.n060 = n060;
        notifyPropertyChanged(BR.n060);
    }


    @Bindable
    public String getN061() {
        return n061;
    }

    public void setN061(String n061) {
        this.n061 = n061;
        notifyPropertyChanged(BR.n061);
    }


    @Bindable
    public String getN062() {
        return n062;
    }

    public void setN062(String n062) {
        this.n062 = n062;
        notifyPropertyChanged(BR.n062);
    }


    @Bindable
    public String getN063() {
        return n063;
    }

    public void setN063(String n063) {
        this.n063 = n063;
        notifyPropertyChanged(BR.n063);
    }


    @Bindable
    public String getN064() {
        return n064;
    }

    public void setN064(String n064) {
        this.n064 = n064;
        notifyPropertyChanged(BR.n064);
    }


    @Bindable
    public String getN065() {
        return n065;
    }

    public void setN065(String n065) {
        this.n065 = n065;
        notifyPropertyChanged(BR.n065);
    }

    @Bindable
    public String getN066() {
        return n066;
    }

    public void setN066(String n066) {
        this.n066 = n066;
        notifyPropertyChanged(BR.n066);
    }

    @Bindable
    public String getN067() {
        return n067;
    }

    public void setN067(String n067) {
        this.n067 = n067;
        notifyPropertyChanged(BR.n067);
    }

    @Bindable
    public String getN068() {
        return n068;
    }

    public void setN068(String n068) {
        this.n068 = n068;
        notifyPropertyChanged(BR.n068);
    }

    @Bindable
    public String getN0691() {
        return n0691;
    }

    public void setN0691(String n0691) {
        this.n0691 = n0691;
        notifyPropertyChanged(BR.n0691);
    }

    @Bindable
    public String getN0692() {
        return n0692;
    }

    public void setN0692(String n0692) {
        this.n0692 = n0692;
        notifyPropertyChanged(BR.n0692);
    }

    @Bindable
    public String getN0693() {
        return n0693;
    }

    public void setN0693(String n0693) {
        this.n0693 = n0693;
        notifyPropertyChanged(BR.n0693);
    }

    @Bindable
    public String getN070() {
        return n070;
    }

    public void setN070(String n070) {
        this.n070 = n070;
        notifyPropertyChanged(BR.n070);
    }

    @Bindable
    public String getN071() {
        return n071;
    }

    public void setN071(String n071) {
        this.n071 = n071;
        notifyPropertyChanged(BR.n071);
    }

    @Bindable
    public String getN072() {
        return n072;
    }

    public void setN072(String n072) {
        this.n072 = n072;
        notifyPropertyChanged(BR.n072);
    }

    @Bindable
    public String getN073() {
        return n073;
    }

    public void setN073(String n073) {
        this.n073 = n073;
        notifyPropertyChanged(BR.n073);
    }

    @Bindable
    public String getN074() {
        return n074;
    }

    public void setN074(String n074) {
        this.n074 = n074;
        notifyPropertyChanged(BR.n074);
    }

    @Bindable
    public String getN07496x() {
        return n07496x;
    }

    public void setN07496x(String n07496x) {
        this.n07496x = n07496x;
        notifyPropertyChanged(BR.n07496x);
    }

    @Bindable
    public String getN075() {
        return n075;
    }

    public void setN075(String n075) {
        this.n075 = n075;
        notifyPropertyChanged(BR.n075);
    }

    @Bindable
    public String getN076() {
        return n076;
    }

    public void setN076(String n076) {
        this.n076 = n076;
        setN076fx(n076.equals("6") ? this.n076fx : "");
        notifyPropertyChanged(BR.n076);
    }

    @Bindable
    public String getN076fx() {
        return n076fx;
    }

    public void setN076fx(String n076fx) {
        this.n076fx = n076fx;
        notifyPropertyChanged(BR.n076fx);
    }

    @Bindable
    public String getN077() {
        return n077;
    }

    public void setN077(String n077) {
        this.n077 = n077;
        notifyPropertyChanged(BR.n077);
    }

    @Bindable
    public String getN078a() {
        return n078a;
    }

    public void setN078a(String n078a) {
        if (this.n078a.equals(n078a)) return;
        this.n078a = n078a;
        notifyPropertyChanged(BR.n078a);
    }

    @Bindable
    public String getN078b() {
        return n078b;
    }

    public void setN078b(String n078b) {
        if (this.n078b.equals(n078b)) return;
        this.n078b = n078b;
        notifyPropertyChanged(BR.n078b);
    }

    @Bindable
    public String getN078c() {
        return n078c;
    }

    public void setN078c(String n078c) {
        if (this.n078c.equals(n078c)) return;
        this.n078c = n078c;
        notifyPropertyChanged(BR.n078c);
    }

    @Bindable
    public String getN078d() {
        return n078d;
    }

    public void setN078d(String n078d) {
        if (this.n078d.equals(n078d)) return;
        this.n078d = n078d;
        notifyPropertyChanged(BR.n078d);
    }

    @Bindable
    public String getN078e() {
        return n078e;
    }

    public void setN078e(String n078e) {
        if (this.n078e.equals(n078e)) return;
        this.n078e = n078e;
        notifyPropertyChanged(BR.n078e);
    }

    @Bindable
    public String getN078f() {
        return n078f;
    }

    public void setN078f(String n078f) {
        if (this.n078f.equals(n078f)) return;
        this.n078f = n078f;
        notifyPropertyChanged(BR.n078f);
    }

    @Bindable
    public String getN078g() {
        return n078g;
    }

    public void setN078g(String n078g) {
        if (this.n078g.equals(n078g)) return;
        this.n078g = n078g;
        notifyPropertyChanged(BR.n078g);
    }

    @Bindable
    public String getN078h() {
        return n078h;
    }

    public void setN078h(String n078h) {
        if (this.n078h.equals(n078h)) return;
        this.n078h = n078h;
        notifyPropertyChanged(BR.n078h);
    }

    @Bindable
    public String getN078i() {
        return n078i;
    }

    public void setN078i(String n078i) {
        if (this.n078i.equals(n078i)) return;
        this.n078i = n078i;
        notifyPropertyChanged(BR.n078i);
    }

    @Bindable
    public String getN078j() {
        return n078j;
    }

    public void setN078j(String n078j) {
        if (this.n078j.equals(n078j)) return;
        this.n078j = n078j;
        notifyPropertyChanged(BR.n078j);
    }

    @Bindable
    public String getN078k() {
        return n078k;
    }

    public void setN078k(String n078k) {
        if (this.n078k.equals(n078k)) return;
        this.n078k = n078k;
        notifyPropertyChanged(BR.n078k);
    }

    @Bindable
    public String getN078l() {
        return n078l;
    }

    public void setN078l(String n078l) {
        if (this.n078l.equals(n078l)) return;
        this.n078l = n078l;
        notifyPropertyChanged(BR.n078l);
    }

    @Bindable
    public String getN078m() {
        return n078m;
    }

    public void setN078m(String n078m) {
        if (this.n078m.equals(n078m)) return;
        this.n078m = n078m;
        notifyPropertyChanged(BR.n078m);
    }

    @Bindable
    public String getN07898() {
        return n07898;
    }

    public void setN07898(String n07898) {
        if (this.n07898.equals(n07898)) return;
        this.n07898 = n07898;
        setN078a(n07898.equals("98") ? "" : this.n078a);
        setN078b(n07898.equals("98") ? "" : this.n078b);
        setN078c(n07898.equals("98") ? "" : this.n078c);
        setN078d(n07898.equals("98") ? "" : this.n078d);
        setN078e(n07898.equals("98") ? "" : this.n078e);
        setN078f(n07898.equals("98") ? "" : this.n078f);
        setN078g(n07898.equals("98") ? "" : this.n078g);
        setN078h(n07898.equals("98") ? "" : this.n078h);
        setN078i(n07898.equals("98") ? "" : this.n078i);
        setN078j(n07898.equals("98") ? "" : this.n078j);
        setN078k(n07898.equals("98") ? "" : this.n078k);
        setN078l(n07898.equals("98") ? "" : this.n078l);
        setN078m(n07898.equals("98") ? "" : this.n078m);
        setN07896(n07898.equals("98") ? "" : this.n07896);
        notifyPropertyChanged(BR.n07898);
    }

    @Bindable
    public String getN07896() {
        return n07896;
    }

    public void setN07896(String n07896) {
        if (this.n07896.equals(n07896)) return;
        this.n07896 = n07896;
        setN07896x(n07896.equals("96") ? this.n07896x : "");
        notifyPropertyChanged(BR.n07896);
    }

    @Bindable
    public String getN07896x() {
        return n07896x;
    }

    public void setN07896x(String n07896x) {
        this.n07896x = n07896x;
        notifyPropertyChanged(BR.n07896x);
    }

    @Bindable
    public String getN080a() {
        return n080a;
    }

    public void setN080a(String n080a) {
        this.n080a = n080a;
        notifyPropertyChanged(BR.n080a);
    }

    @Bindable
    public String getN080b() {
        return n080b;
    }

    public void setN080b(String n080b) {
        this.n080b = n080b;
        notifyPropertyChanged(BR.n080b);
    }

    @Bindable
    public String getN080c() {
        return n080c;
    }

    public void setN080c(String n080c) {
        this.n080c = n080c;
        notifyPropertyChanged(BR.n080c);
    }

    @Bindable
    public String getN080d() {
        return n080d;
    }

    public void setN080d(String n080d) {
        this.n080d = n080d;
        notifyPropertyChanged(BR.n080d);
    }

    @Bindable
    public String getN080e() {
        return n080e;
    }

    public void setN080e(String n080e) {
        this.n080e = n080e;
        notifyPropertyChanged(BR.n080e);
    }

    @Bindable
    public String getN080f() {
        return n080f;
    }

    public void setN080f(String n080f) {
        this.n080f = n080f;
        notifyPropertyChanged(BR.n080f);
    }

    @Bindable
    public String getN080g() {
        return n080g;
    }

    public void setN080g(String n080g) {
        this.n080g = n080g;
        notifyPropertyChanged(BR.n080g);
    }

    @Bindable
    public String getN080h() {
        return n080h;
    }

    public void setN080h(String n080h) {
        this.n080h = n080h;
        notifyPropertyChanged(BR.n080h);
    }

    @Bindable
    public String getN080i() {
        return n080i;
    }

    public void setN080i(String n080i) {
        this.n080i = n080i;
        notifyPropertyChanged(BR.n080i);
    }

    @Bindable
    public String getN080j() {
        return n080j;
    }

    public void setN080j(String n080j) {
        this.n080j = n080j;
        notifyPropertyChanged(BR.n080j);
    }

    @Bindable
    public String getN080k() {
        return n080k;
    }

    public void setN080k(String n080k) {
        this.n080k = n080k;
        notifyPropertyChanged(BR.n080k);
    }

    @Bindable
    public String getN080l() {
        return n080l;
    }

    public void setN080l(String n080l) {
        this.n080l = n080l;
        notifyPropertyChanged(BR.n080l);
    }

    @Bindable
    public String getN080m() {
        return n080m;
    }

    public void setN080m(String n080m) {
        this.n080m = n080m;
        notifyPropertyChanged(BR.n080m);
    }

    @Bindable
    public String getN080n() {
        return n080n;
    }

    public void setN080n(String n080n) {
        this.n080n = n080n;
        notifyPropertyChanged(BR.n080n);
    }

    @Bindable
    public String getN080o() {
        return n080o;
    }

    public void setN080o(String n080o) {
        this.n080o = n080o;
        setN080ox(n080o.equals("1") ? this.n080ox : "");
        notifyPropertyChanged(BR.n080o);
    }

    @Bindable
    public String getN080ox() {
        return n080ox;
    }

    public void setN080ox(String n080ox) {
        this.n080ox = n080ox;
        notifyPropertyChanged(BR.n080ox);
    }

    @Bindable
    public String getN080p() {
        return n080p;
    }

    public void setN080p(String n080p) {
        if (this.n080p.equals(n080p)) return;
        this.n080p = n080p;
        setN080a(n080p.equals("16") ? "" : this.n080a);
        setN080b(n080p.equals("16") ? "" : this.n080b);
        setN080c(n080p.equals("16") ? "" : this.n080c);
        setN080d(n080p.equals("16") ? "" : this.n080d);
        setN080e(n080p.equals("16") ? "" : this.n080e);
        setN080f(n080p.equals("16") ? "" : this.n080f);
        setN080g(n080p.equals("16") ? "" : this.n080g);
        setN080h(n080p.equals("16") ? "" : this.n080h);
        setN080i(n080p.equals("16") ? "" : this.n080i);
        setN080j(n080p.equals("16") ? "" : this.n080j);
        setN080k(n080p.equals("16") ? "" : this.n080k);
        setN080l(n080p.equals("16") ? "" : this.n080l);
        setN080m(n080p.equals("16") ? "" : this.n080m);
        setN080n(n080p.equals("16") ? "" : this.n080n);
        setN080o(n080p.equals("16") ? "" : this.n080o);
        notifyPropertyChanged(BR.n080p);
    }

    @Bindable
    public String getN081() {
        return n081;
    }

    public void setN081(String n081) {
        this.n081 = n081;
        notifyPropertyChanged(BR.n081);
    }


    @Bindable
    public String getN082a() {
        return n082a;
    }

    public void setN082a(String n082a) {
        if (this.n082a.equals(n082a)) return;
        this.n082a = n082a;
        notifyPropertyChanged(BR.n082a);
    }

    @Bindable
    public String getN082b() {
        return n082b;
    }

    public void setN082b(String n082b) {
        if (this.n082b.equals(n082b)) return;
        this.n082b = n082b;
        notifyPropertyChanged(BR.n082b);
    }

    @Bindable
    public String getN082c() {
        return n082c;
    }

    public void setN082c(String n082c) {
        if (this.n082c.equals(n082c)) return;
        this.n082c = n082c;
        notifyPropertyChanged(BR.n082c);
    }

    @Bindable
    public String getN082d() {
        return n082d;
    }

    public void setN082d(String n082d) {
        if (this.n082d.equals(n082d)) return;
        this.n082d = n082d;
        notifyPropertyChanged(BR.n082d);
    }

    @Bindable
    public String getN082e() {
        return n082e;
    }

    public void setN082e(String n082e) {
        if (this.n082e.equals(n082e)) return;
        this.n082e = n082e;
        notifyPropertyChanged(BR.n082e);
    }

    @Bindable
    public String getN082f() {
        return n082f;
    }

    public void setN082f(String n082f) {
        if (this.n082f.equals(n082f)) return;
        this.n082f = n082f;
        notifyPropertyChanged(BR.n082f);
    }

    @Bindable
    public String getN08298() {
        return n08298;
    }

    public void setN08298(String n08298) {
        if (this.n08298.equals(n08298)) return;
        this.n08298 = n08298;
        setN082a(n08298.equals("98") ? "" : this.n082a);
        setN082b(n08298.equals("98") ? "" : this.n082b);
        setN082c(n08298.equals("98") ? "" : this.n082c);
        setN082d(n08298.equals("98") ? "" : this.n082d);
        setN082e(n08298.equals("98") ? "" : this.n082e);
        setN082f(n08298.equals("98") ? "" : this.n082f);
        setN08296(n08298.equals("98") ? "" : this.n08296);
        notifyPropertyChanged(BR.n08298);
    }

    @Bindable
    public String getN08296() {
        return n08296;
    }

    public void setN08296(String n08296) {
        if (this.n08296.equals(n08296)) return;
        this.n08296 = n08296;
        setN08296x(n08296.equals("96") ? this.n08296x : "");
        notifyPropertyChanged(BR.n08296);
    }

    @Bindable
    public String getN08296x() {
        return n08296x;
    }

    public void setN08296x(String n08296x) {
        this.n08296x = n08296x;
        notifyPropertyChanged(BR.n08296x);
    }

    @Bindable
    public String getN083() {
        return n083;
    }

    public void setN083(String n083) {
        this.n083 = n083;
        notifyPropertyChanged(BR.n083);
    }

    @Bindable
    public String getN084a() {
        return n084a;
    }

    public void setN084a(String n084a) {
        if (this.n084a.equals(n084a)) return;
        this.n084a = n084a;
        notifyPropertyChanged(BR.n084a);
    }

    @Bindable
    public String getN084b() {
        return n084b;
    }

    public void setN084b(String n084b) {
        if (this.n084b.equals(n084b)) return;
        this.n084b = n084b;
        notifyPropertyChanged(BR.n084b);
    }

    @Bindable
    public String getN084c() {
        return n084c;
    }

    public void setN084c(String n084c) {
        if (this.n084c.equals(n084c)) return;
        this.n084c = n084c;
        notifyPropertyChanged(BR.n084c);
    }

    @Bindable
    public String getN084d() {
        return n084d;
    }

    public void setN084d(String n084d) {
        if (this.n084d.equals(n084d)) return;
        this.n084d = n084d;
        notifyPropertyChanged(BR.n084d);
    }

    @Bindable
    public String getN084e() {
        return n084e;
    }

    public void setN084e(String n084e) {
        if (this.n084e.equals(n084e)) return;
        this.n084e = n084e;
        notifyPropertyChanged(BR.n084e);
    }

    @Bindable
    public String getN084f() {
        return n084f;
    }

    public void setN084f(String n084f) {
        if (this.n084f.equals(n084f)) return;
        this.n084f = n084f;
        notifyPropertyChanged(BR.n084f);
    }

    @Bindable
    public String getN084g() {
        return n084g;
    }

    public void setN084g(String n084g) {
        if (this.n084g.equals(n084g)) return;
        this.n084g = n084g;
        notifyPropertyChanged(BR.n084g);
    }

    @Bindable
    public String getN084h() {
        return n084h;
    }

    public void setN084h(String n084h) {
        if (this.n084h.equals(n084h)) return;
        this.n084h = n084h;
        notifyPropertyChanged(BR.n084h);
    }

    @Bindable
    public String getN084i() {
        return n084i;
    }

    public void setN084i(String n084i) {
        if (this.n084i.equals(n084i)) return;
        this.n084i = n084i;
        notifyPropertyChanged(BR.n084i);
    }

    @Bindable
    public String getN084j() {
        return n084j;
    }

    public void setN084j(String n084j) {
        if (this.n084j.equals(n084j)) return;
        this.n084j = n084j;
        notifyPropertyChanged(BR.n084j);
    }

    @Bindable
    public String getN084k() {
        return n084k;
    }

    public void setN084k(String n084k) {
        if (this.n084k.equals(n084k)) return;
        this.n084k = n084k;
        notifyPropertyChanged(BR.n084k);
    }

    @Bindable
    public String getN084l() {
        return n084l;
    }

    public void setN084l(String n084l) {
        if (this.n084l.equals(n084l)) return;
        this.n084l = n084l;
        notifyPropertyChanged(BR.n084l);
    }

    @Bindable
    public String getN084m() {
        return n084m;
    }

    public void setN084m(String n084m) {
        if (this.n084m.equals(n084m)) return;
        this.n084m = n084m;
        notifyPropertyChanged(BR.n084m);
    }

    @Bindable
    public String getN084n() {
        return n084n;
    }

    public void setN084n(String n084n) {
        if (this.n084n.equals(n084n)) return;
        this.n084n = n084n;
        notifyPropertyChanged(BR.n084n);
    }


    @Bindable
    public String getN08496() {
        return n08496;
    }

    public void setN08496(String n08496) {
        if (this.n08496.equals(n08496)) return;
        this.n08496 = n08496;
        setN08496x(n08496.equals("96") ? this.n08496x : "");
        notifyPropertyChanged(BR.n08496);
    }

    @Bindable
    public String getN08496x() {
        return n08496x;
    }

    public void setN08496x(String n08496x) {
        this.n08496x = n08496x;
        notifyPropertyChanged(BR.n08496x);
    }


    @Bindable
    public String getN085() {
        return n085;
    }

    public void setN085(String n085) {
        this.n085 = n085;
        notifyPropertyChanged(BR.n085);
    }


    @Bindable
    public String getN086a() {
        return n086a;
    }

    public void setN086a(String n086a) {
        if (this.n086a.equals(n086a)) return;
        this.n086a = n086a;
        notifyPropertyChanged(BR.n086a);
    }

    @Bindable
    public String getN086b() {
        return n086b;
    }

    public void setN086b(String n086b) {
        if (this.n086b.equals(n086b)) return;
        this.n086b = n086b;
        notifyPropertyChanged(BR.n086b);
    }

    @Bindable
    public String getN086c() {
        return n086c;
    }

    public void setN086c(String n086c) {
        if (this.n086c.equals(n086c)) return;
        this.n086c = n086c;
        notifyPropertyChanged(BR.n086c);
    }

    @Bindable
    public String getN086d() {
        return n086d;
    }

    public void setN086d(String n086d) {
        if (this.n086d.equals(n086d)) return;
        this.n086d = n086d;
        notifyPropertyChanged(BR.n086d);
    }

    @Bindable
    public String getN086e() {
        return n086e;
    }

    public void setN086e(String n086e) {
        if (this.n086e.equals(n086e)) return;
        this.n086e = n086e;
        notifyPropertyChanged(BR.n086e);
    }

    @Bindable
    public String getN086f() {
        return n086f;
    }

    public void setN086f(String n086f) {
        if (this.n086f.equals(n086f)) return;
        this.n086f = n086f;
        notifyPropertyChanged(BR.n086f);
    }


    @Bindable
    public String getN086g() {
        return n086g;
    }

    public void setN086g(String n086g) {
        if (this.n086g.equals(n086g)) return;
        this.n086g = n086g;
        notifyPropertyChanged(BR.n086g);
    }

    @Bindable
    public String getN086h() {
        return n086h;
    }

    public void setN086h(String n086h) {
        if (this.n086h.equals(n086h)) return;
        this.n086h = n086h;
        notifyPropertyChanged(BR.n086h);
    }

    @Bindable
    public String getN086i() {
        return n086i;
    }

    public void setN086i(String n086i) {
        if (this.n086i.equals(n086i)) return;
        this.n086i = n086i;
        notifyPropertyChanged(BR.n086i);
    }

    @Bindable
    public String getN086j() {
        return n086j;
    }

    public void setN086j(String n086j) {
        if (this.n086j.equals(n086j)) return;
        this.n086j = n086j;
        notifyPropertyChanged(BR.n086j);
    }

    @Bindable
    public String getN086k() {
        return n086k;
    }

    public void setN086k(String n086k) {
        if (this.n086k.equals(n086k)) return;
        this.n086k = n086k;
        notifyPropertyChanged(BR.n086k);
    }

    @Bindable
    public String getN086l() {
        return n086l;
    }

    public void setN086l(String n086l) {
        if (this.n086l.equals(n086l)) return;
        this.n086l = n086l;
        notifyPropertyChanged(BR.n086l);
    }

    @Bindable
    public String getN08698() {
        return n08698;
    }

    public void setN08698(String n08698) {
        if (this.n08698.equals(n08698)) return;
        this.n08698 = n08698;
        setN086a(n08698.equals("98") ? "" : this.n086a);
        setN086b(n08698.equals("98") ? "" : this.n086b);
        setN086c(n08698.equals("98") ? "" : this.n086c);
        setN086d(n08698.equals("98") ? "" : this.n086d);
        setN086e(n08698.equals("98") ? "" : this.n086e);
        setN086f(n08698.equals("98") ? "" : this.n086f);
        setN086g(n08698.equals("98") ? "" : this.n086g);
        setN086h(n08698.equals("98") ? "" : this.n086h);
        setN086i(n08698.equals("98") ? "" : this.n086i);
        setN086j(n08698.equals("98") ? "" : this.n086j);
        setN086k(n08698.equals("98") ? "" : this.n086k);
        setN086l(n08698.equals("98") ? "" : this.n086l);
        setN08696(n08698.equals("98") ? "" : this.n08696);
        notifyPropertyChanged(BR.n08698);
    }

    @Bindable
    public String getN08696() {
        return n08696;
    }

    public void setN08696(String n08696) {
        if (this.n08696.equals(n08696)) return;
        this.n08696 = n08696;
        setN08696x(n08696.equals("96") ? this.n08696x : "");
        notifyPropertyChanged(BR.n08696);
    }

    @Bindable
    public String getN08696x() {
        return n08696x;
    }

    public void setN08696x(String n08696x) {
        this.n08696x = n08696x;
        notifyPropertyChanged(BR.n08696x);
    }

    @Bindable
    public String getN087() {
        return n087;
    }

    public void setN087(String n087) {
        this.n087 = n087;
        notifyPropertyChanged(BR.n087);
    }


    @Bindable
    public String getN088a() {
        return n088a;
    }

    public void setN088a(String n088a) {
        this.n088a = n088a;
        notifyPropertyChanged(BR.n088a);
    }

    @Bindable
    public String getN088b() {
        return n088b;
    }

    public void setN088b(String n088b) {
        this.n088b = n088b;
        notifyPropertyChanged(BR.n088b);
    }

    @Bindable
    public String getN088c() {
        return n088c;
    }

    public void setN088c(String n088c) {
        this.n088c = n088c;
        notifyPropertyChanged(BR.n088c);
    }

    @Bindable
    public String getN088d() {
        return n088d;
    }

    public void setN088d(String n088d) {
        this.n088d = n088d;
        notifyPropertyChanged(BR.n088d);
    }

    @Bindable
    public String getN088e() {
        return n088e;
    }

    public void setN088e(String n088e) {
        this.n088e = n088e;
        notifyPropertyChanged(BR.n088e);
    }

    @Bindable
    public String getN088f() {
        return n088f;
    }

    public void setN088f(String n088f) {
        this.n088f = n088f;
        notifyPropertyChanged(BR.n088f);
    }

    @Bindable
    public String getN088g() {
        return n088g;
    }

    public void setN088g(String n088g) {
        this.n088g = n088g;
        notifyPropertyChanged(BR.n088g);
    }

    @Bindable
    public String getN088h() {
        return n088h;
    }

    public void setN088h(String n088h) {
        this.n088h = n088h;
        notifyPropertyChanged(BR.n088h);
    }

    @Bindable
    public String getN088i() {
        return n088i;
    }

    public void setN088i(String n088i) {
        this.n088i = n088i;
        notifyPropertyChanged(BR.n088i);
    }

    @Bindable
    public String getN088j() {
        return n088j;
    }

    public void setN088j(String n088j) {
        this.n088j = n088j;
        notifyPropertyChanged(BR.n088j);
    }

    @Bindable
    public String getN088k() {
        return n088k;
    }

    public void setN088k(String n088k) {
        this.n088k = n088k;
        notifyPropertyChanged(BR.n088k);
    }

    @Bindable
    public String getN088l() {
        return n088l;
    }

    public void setN088l(String n088l) {
        this.n088l = n088l;
        notifyPropertyChanged(BR.n088l);
    }

    @Bindable
    public String getN088m() {
        return n088m;
    }

    public void setN088m(String n088m) {
        this.n088m = n088m;
        notifyPropertyChanged(BR.n088m);
    }

    @Bindable
    public String getN088n() {
        return n088n;
    }

    public void setN088n(String n088n) {
        this.n088n = n088n;
        notifyPropertyChanged(BR.n088n);
    }

    @Bindable
    public String getN088o() {
        return n088o;
    }

    public void setN088o(String n088o) {
        this.n088o = n088o;
        notifyPropertyChanged(BR.n088o);
    }

    @Bindable
    public String getN088p() {
        return n088p;
    }

    public void setN088p(String n088p) {
        this.n088p = n088p;
        notifyPropertyChanged(BR.n088p);
    }

    @Bindable
    public String getN088q() {
        return n088q;
    }

    public void setN088q(String n088q) {
        this.n088q = n088q;
        notifyPropertyChanged(BR.n088q);
    }

    @Bindable
    public String getN088r() {
        return n088r;
    }

    public void setN088r(String n088r) {
        this.n088r = n088r;
        setN088rx(n088r.equals("1") ? this.n088rx : "");
        notifyPropertyChanged(BR.n088r);
    }

    @Bindable
    public String getN088rx() {
        return n088rx;
    }

    public void setN088rx(String n088rx) {
        this.n088rx = n088rx;
        notifyPropertyChanged(BR.n088rx);
    }

    @Bindable
    public String getN088s() {
        return n088s;
    }

    public void setN088s(String n088s) {
        if (this.n088s.equals(n088s)) return;
        this.n088s = n088s;
        setN088a(n088s.equals("19") ? "" : this.n088a);
        setN088b(n088s.equals("19") ? "" : this.n088b);
        setN088c(n088s.equals("19") ? "" : this.n088c);
        setN088d(n088s.equals("19") ? "" : this.n088d);
        setN088e(n088s.equals("19") ? "" : this.n088e);
        setN088f(n088s.equals("19") ? "" : this.n088f);
        setN088g(n088s.equals("19") ? "" : this.n088g);
        setN088h(n088s.equals("19") ? "" : this.n088h);
        setN088i(n088s.equals("19") ? "" : this.n088i);
        setN088j(n088s.equals("19") ? "" : this.n088j);
        setN088k(n088s.equals("19") ? "" : this.n088k);
        setN088l(n088s.equals("19") ? "" : this.n088l);
        setN088m(n088s.equals("19") ? "" : this.n088m);
        setN088n(n088s.equals("19") ? "" : this.n088n);
        setN088o(n088s.equals("19") ? "" : this.n088o);
        setN088p(n088s.equals("19") ? "" : this.n088p);
        setN088q(n088s.equals("19") ? "" : this.n088q);
        setN088r(n088s.equals("19") ? "" : this.n088r);
        notifyPropertyChanged(BR.n088s);
    }


    @Bindable
    public String getN089() {
        return n089;
    }

    public void setN089(String n089) {
        this.n089 = n089;
        setN08996x(n089.equals("96") ? this.n08996x : "");
        notifyPropertyChanged(BR.n089);
    }

    @Bindable
    public String getN08996x() {
        return n08996x;
    }

    public void setN08996x(String n08996x) {
        this.n08996x = n08996x;
        notifyPropertyChanged(BR.n08996x);
    }

    @Bindable
    public String getN090() {
        return n090;
    }

    public void setN090(String n090) {
        this.n090 = n090;
        notifyPropertyChanged(BR.n090);
    }


    @Bindable
    public String getN091a() {
        return n091a;
    }

    public void setN091a(String n091a) {
        if (this.n091a.equals(n091a)) return;
        this.n091a = n091a;
        notifyPropertyChanged(BR.n091a);
    }

    @Bindable
    public String getN091b() {
        return n091b;
    }

    public void setN091b(String n091b) {
        if (this.n091b.equals(n091b)) return;
        this.n091b = n091b;
        notifyPropertyChanged(BR.n091b);
    }

    @Bindable
    public String getN091c() {
        return n091c;
    }

    public void setN091c(String n091c) {
        if (this.n091c.equals(n091c)) return;
        this.n091c = n091c;
        notifyPropertyChanged(BR.n091c);
    }

    @Bindable
    public String getN091d() {
        return n091d;
    }

    public void setN091d(String n091d) {
        if (this.n091d.equals(n091d)) return;
        this.n091d = n091d;
        notifyPropertyChanged(BR.n091d);
    }

    @Bindable
    public String getN091e() {
        return n091e;
    }

    public void setN091e(String n091e) {
        if (this.n091e.equals(n091e)) return;
        this.n091e = n091e;
        notifyPropertyChanged(BR.n091e);
    }

    @Bindable
    public String getN091f() {
        return n091f;
    }

    public void setN091f(String n091f) {
        if (this.n091f.equals(n091f)) return;
        this.n091f = n091f;
        notifyPropertyChanged(BR.n091f);
    }

    @Bindable
    public String getN09198() {
        return n09198;
    }

    public void setN09198(String n09198) {
        if (this.n09198.equals(n09198)) return;
        this.n09198 = n09198;
        setN091a(n09198.equals("98") ? "" : this.n091a);
        setN091b(n09198.equals("98") ? "" : this.n091b);
        setN091c(n09198.equals("98") ? "" : this.n091c);
        setN091d(n09198.equals("98") ? "" : this.n091d);
        setN091e(n09198.equals("98") ? "" : this.n091e);
        setN091f(n09198.equals("98") ? "" : this.n091f);
        setN09196(n09198.equals("98") ? "" : this.n09196);
        notifyPropertyChanged(BR.n09198);
    }

    @Bindable
    public String getN09196() {
        return n09196;
    }

    public void setN09196(String n09196) {
        if (this.n09196.equals(n09196)) return;
        this.n09196 = n09196;
        setN09196x(n09196.equals("96") ? this.n09196x : "");
        notifyPropertyChanged(BR.n09196);
    }

    @Bindable
    public String getN09196x() {
        return n09196x;
    }

    public void setN09196x(String n09196x) {
        this.n09196x = n09196x;
        notifyPropertyChanged(BR.n09196x);
    }

    @Bindable
    public String getN092() {
        return n092;
    }

    public void setN092(String n092) {
        this.n092 = n092;
        setN092fx(n092.equals("6") ? this.n092fx : "");
        notifyPropertyChanged(BR.n092);
    }

    @Bindable
    public String getN092fx() {
        return n092fx;
    }

    public void setN092fx(String n092fx) {
        this.n092fx = n092fx;
        notifyPropertyChanged(BR.n092fx);
    }

    @Bindable
    public String getN093() {
        return n093;
    }

    public void setN093(String n093) {
        this.n093 = n093;
        setN093fx(n093.equals("6") ? this.n093fx : "");
        setN093jx(n093.equals("10") ? this.n093jx : "");
        setN09396x(n093.equals("96") ? this.n09396x : "");
        notifyPropertyChanged(BR.n093);
    }

    @Bindable
    public String getN093fx() {
        return n093fx;
    }

    public void setN093fx(String n093fx) {
        this.n093fx = n093fx;
        notifyPropertyChanged(BR.n093fx);
    }

    @Bindable
    public String getN093jx() {
        return n093jx;
    }

    public void setN093jx(String n093jx) {
        this.n093jx = n093jx;
        notifyPropertyChanged(BR.n093jx);
    }

    @Bindable
    public String getN09396x() {
        return n09396x;
    }

    public void setN09396x(String n09396x) {
        this.n09396x = n09396x;
        notifyPropertyChanged(BR.n09396x);
    }

    @Bindable
    public String getN094() {
        return n094;
    }

    public void setN094(String n094) {
        this.n094 = n094;
        notifyPropertyChanged(BR.n094);
    }

    @Bindable
    public String getN095() {
        return n095;
    }

    public void setN095(String n095) {
        this.n095 = n095;
        notifyPropertyChanged(BR.n095);
    }

    @Bindable
    public String getN096a() {
        return n096a;
    }

    public void setN096a(String n096a) {
        if (this.n096a.equals(n096a)) return;
        this.n096a = n096a;
        notifyPropertyChanged(BR.n096a);
    }

    @Bindable
    public String getN096b() {
        return n096b;
    }

    public void setN096b(String n096b) {
        if (this.n096b.equals(n096b)) return;
        this.n096b = n096b;
        notifyPropertyChanged(BR.n096b);
    }

    @Bindable
    public String getN096c() {
        return n096c;
    }

    public void setN096c(String n096c) {
        if (this.n096c.equals(n096c)) return;
        this.n096c = n096c;
        notifyPropertyChanged(BR.n096c);
    }

    @Bindable
    public String getN096d() {
        return n096d;
    }

    public void setN096d(String n096d) {
        if (this.n096d.equals(n096d)) return;
        this.n096d = n096d;
        notifyPropertyChanged(BR.n096d);
    }

    @Bindable
    public String getN096e() {
        return n096e;
    }

    public void setN096e(String n096e) {
        if (this.n096e.equals(n096e)) return;
        this.n096e = n096e;
        notifyPropertyChanged(BR.n096e);
    }

    @Bindable
    public String getN096f() {
        return n096f;
    }

    public void setN096f(String n096f) {
        if (this.n096f.equals(n096f)) return;
        this.n096f = n096f;
        notifyPropertyChanged(BR.n096f);
    }

    @Bindable
    public String getN096g() {
        return n096g;
    }

    public void setN096g(String n096g) {
        if (this.n096g.equals(n096g)) return;
        this.n096g = n096g;
        notifyPropertyChanged(BR.n096g);
    }

    @Bindable
    public String getN096h() {
        return n096h;
    }

    public void setN096h(String n096h) {
        if (this.n096h.equals(n096h)) return;
        this.n096h = n096h;
        notifyPropertyChanged(BR.n096h);
    }

    @Bindable
    public String getN096i() {
        return n096i;
    }

    public void setN096i(String n096i) {
        if (this.n096i.equals(n096i)) return;
        this.n096i = n096i;
        notifyPropertyChanged(BR.n096i);
    }

    @Bindable
    public String getN096j() {
        return n096j;
    }

    public void setN096j(String n096j) {
        if (this.n096j.equals(n096j)) return;
        this.n096j = n096j;
        notifyPropertyChanged(BR.n096j);
    }

    @Bindable
    public String getN096k() {
        return n096k;
    }

    public void setN096k(String n096k) {
        if (this.n096k.equals(n096k)) return;
        this.n096k = n096k;
        notifyPropertyChanged(BR.n096k);
    }

    @Bindable
    public String getN096l() {
        return n096l;
    }

    public void setN096l(String n096l) {
        if (this.n096l.equals(n096l)) return;
        this.n096l = n096l;
        notifyPropertyChanged(BR.n096l);
    }

    @Bindable
    public String getN096m() {
        return n096m;
    }

    public void setN096m(String n096m) {
        if (this.n096m.equals(n096m)) return;
        this.n096m = n096m;
        notifyPropertyChanged(BR.n096m);
    }

    @Bindable
    public String getN096n() {
        return n096n;
    }

    public void setN096n(String n096n) {
        if (this.n096n.equals(n096n)) return;
        this.n096n = n096n;
        notifyPropertyChanged(BR.n096n);
    }

    @Bindable
    public String getN096o() {
        return n096o;
    }

    public void setN096o(String n096o) {
        if (this.n096o.equals(n096o)) return;
        this.n096o = n096o;
        notifyPropertyChanged(BR.n096o);
    }

    @Bindable
    public String getN096p() {
        return n096p;
    }

    public void setN096p(String n096p) {
        if (this.n096p.equals(n096p)) return;
        this.n096p = n096p;
        notifyPropertyChanged(BR.n096p);
    }

    @Bindable
    public String getN096q() {
        return n096q;
    }

    public void setN096q(String n096q) {
        if (this.n096q.equals(n096q)) return;
        this.n096q = n096q;
        notifyPropertyChanged(BR.n096q);
    }

    @Bindable
    public String getN096r() {
        return n096r;
    }

    public void setN096r(String n096r) {
        if (this.n096r.equals(n096r)) return;
        this.n096r = n096r;
        notifyPropertyChanged(BR.n096r);
    }

    @Bindable
    public String getN097m() {
        return n097m;
    }

    public void setN097m(String n097m) {
        this.n097m = n097m;
        notifyPropertyChanged(BR.n097m);
    }

    @Bindable
    public String getN097h() {
        return n097h;
    }

    public void setN097h(String n097h) {
        this.n097h = n097h;
        notifyPropertyChanged(BR.n097h);
    }

    @Bindable
    public String getN097d() {
        return n097d;
    }

    public void setN097d(String n097d) {
        this.n097d = n097d;
        notifyPropertyChanged(BR.n097d);
    }


    @Bindable
    public String getN098() {
        return n098;
    }

    public void setN098(String n098) {
        this.n098 = n098;
        setN09896x(n098.equals("96") ? this.n09896x : "");
        notifyPropertyChanged(BR.n098);
    }

    @Bindable
    public String getN09896x() {
        return n09896x;
    }

    public void setN09896x(String n09896x) {
        this.n09896x = n09896x;
        notifyPropertyChanged(BR.n09896x);
    }

    @Bindable
    public String getN099() {
        return n099;
    }

    public void setN099(String n099) {
        this.n099 = n099;
        notifyPropertyChanged(BR.n099);
    }


    @Bindable
    public String getN100a() {
        return n100a;
    }

    public void setN100a(String n100a) {
        if (this.n100a.equals(n100a)) return;
        this.n100a = n100a;
        notifyPropertyChanged(BR.n100a);
    }

    @Bindable
    public String getN100b() {
        return n100b;
    }

    public void setN100b(String n100b) {
        if (this.n100b.equals(n100b)) return;
        this.n100b = n100b;
        notifyPropertyChanged(BR.n100b);
    }

    @Bindable
    public String getN100c() {
        return n100c;
    }

    public void setN100c(String n100c) {
        if (this.n100c.equals(n100c)) return;
        this.n100c = n100c;
        notifyPropertyChanged(BR.n100c);
    }

    @Bindable
    public String getN100d() {
        return n100d;
    }

    public void setN100d(String n100d) {
        if (this.n100d.equals(n100d)) return;
        this.n100d = n100d;
        notifyPropertyChanged(BR.n100d);
    }

    @Bindable
    public String getN100e() {
        return n100e;
    }

    public void setN100e(String n100e) {
        if (this.n100e.equals(n100e)) return;
        this.n100e = n100e;
        notifyPropertyChanged(BR.n100e);
    }

    @Bindable
    public String getN100f() {
        return n100f;
    }

    public void setN100f(String n100f) {
        if (this.n100f.equals(n100f)) return;
        this.n100f = n100f;
        notifyPropertyChanged(BR.n100f);
    }

    @Bindable
    public String getN10098() {
        return n10098;
    }

    public void setN10098(String n10098) {
        if (this.n10098.equals(n10098)) return;
        this.n10098 = n10098;
        setN100a(n10098.equals("98") ? "" : this.n100a);
        setN100b(n10098.equals("98") ? "" : this.n100b);
        setN100c(n10098.equals("98") ? "" : this.n100c);
        setN100d(n10098.equals("98") ? "" : this.n100d);
        setN100e(n10098.equals("98") ? "" : this.n100e);
        setN100f(n10098.equals("98") ? "" : this.n100f);
        setN10096(n10098.equals("98") ? "" : this.n10096);
        notifyPropertyChanged(BR.n10098);
    }

    @Bindable
    public String getN10096() {
        return n10096;
    }

    public void setN10096(String n10096) {
        if (this.n10096.equals(n10096)) return;
        this.n10096 = n10096;
        setN10096x(n10096.equals("96") ? this.n10096x : "");
        notifyPropertyChanged(BR.n10096);
    }

    @Bindable
    public String getN10096x() {
        return n10096x;
    }

    public void setN10096x(String n10096x) {
        this.n10096x = n10096x;
        notifyPropertyChanged(BR.n10096x);
    }


    @Bindable
    public String getN101a() {
        return n101a;
    }

    public void setN101a(String n101a) {
        if (this.n101a.equals(n101a)) return;
        this.n101a = n101a;
        notifyPropertyChanged(BR.n101a);
    }

    @Bindable
    public String getN101b() {
        return n101b;
    }

    public void setN101b(String n101b) {
        if (this.n101b.equals(n101b)) return;
        this.n101b = n101b;
        notifyPropertyChanged(BR.n101b);
    }

    @Bindable
    public String getN101c() {
        return n101c;
    }

    public void setN101c(String n101c) {
        if (this.n101c.equals(n101c)) return;
        this.n101c = n101c;
        notifyPropertyChanged(BR.n101c);
    }

    @Bindable
    public String getN101d() {
        return n101d;
    }

    public void setN101d(String n101d) {
        if (this.n101d.equals(n101d)) return;
        this.n101d = n101d;
        notifyPropertyChanged(BR.n101d);
    }

    @Bindable
    public String getN101e() {
        return n101e;
    }

    public void setN101e(String n101e) {
        if (this.n101e.equals(n101e)) return;
        this.n101e = n101e;
        notifyPropertyChanged(BR.n101e);
    }

    @Bindable
    public String getN101f() {
        return n101f;
    }

    public void setN101f(String n101f) {
        if (this.n101f.equals(n101f)) return;
        this.n101f = n101f;
        notifyPropertyChanged(BR.n101f);
    }

    @Bindable
    public String getN10198() {
        return n10198;
    }

    public void setN10198(String n10198) {
        if (this.n10198.equals(n10198)) return;
        this.n10198 = n10198;
        setN101a(n10198.equals("98") ? "" : this.n101a);
        setN101b(n10198.equals("98") ? "" : this.n101b);
        setN101c(n10198.equals("98") ? "" : this.n101c);
        setN101d(n10198.equals("98") ? "" : this.n101d);
        setN101e(n10198.equals("98") ? "" : this.n101e);
        setN101f(n10198.equals("98") ? "" : this.n101f);
        setN10196(n10198.equals("98") ? "" : this.n10196);
        notifyPropertyChanged(BR.n10198);
    }

    @Bindable
    public String getN10196() {
        return n10196;
    }

    public void setN10196(String n10196) {
        if (this.n10196.equals(n10196)) return;
        this.n10196 = n10196;
        setN10196x(n10196.equals("96") ? this.n10196x : "");
        notifyPropertyChanged(BR.n10196);
    }

    @Bindable
    public String getN10196x() {
        return n10196x;
    }

    public void setN10196x(String n10196x) {
        this.n10196x = n10196x;
        notifyPropertyChanged(BR.n10196x);
    }

    @Bindable
    public String getN102() {
        return n102;
    }

    public void setN102(String n102) {
        this.n102 = n102;
        notifyPropertyChanged(BR.n102);
    }

    @Bindable
    public String getN103() {
        return n103;
    }

    public void setN103(String n103) {
        this.n103 = n103;
        notifyPropertyChanged(BR.n103);
    }


    @Bindable
    public String getAh1() {
        return ah1;
    }

    public void setAh1(String ah1) {
        this.ah1 = ah1;
        setAh2(ah1.equals("0") || ah1.equals("99") ? "" : this.ah2);
        setAh3(ah1.equals("0") || ah1.equals("99") ? "" : this.ah3);
        setAh4a(ah1.equals("0") || ah1.equals("99") ? "" : this.ah4a);
        setAh5(ah1.equals("0") || ah1.equals("99") ? "" : this.ah5);
        setAh6(ah1.equals("0") || ah1.equals("99") ? "" : this.ah6);
        setAh7a(ah1.equals("0") || ah1.equals("99") ? this.ah7a : "");
        setAh7b(ah1.equals("0") || ah1.equals("99") ? this.ah7b : "");
        setAh7c(ah1.equals("0") || ah1.equals("99") ? this.ah7c : "");
        setAh7d(ah1.equals("0") || ah1.equals("99") ? this.ah7d : "");
        setAh7e(ah1.equals("0") || ah1.equals("99") ? this.ah7e : "");
        setAh7f(ah1.equals("0") || ah1.equals("99") ? this.ah7f : "");
        setAh7g(ah1.equals("0") || ah1.equals("99") ? this.ah7g : "");
        setAh7h(ah1.equals("0") || ah1.equals("99") ? this.ah7h : "");
        setAh796(ah1.equals("0") || ah1.equals("99") ? this.ah796 : "");
        notifyPropertyChanged(BR.ah1);
    }

    @Bindable
    public String getAh2() {
        return ah2;
    }

    public void setAh2(String ah2) {
        this.ah2 = ah2;
        setAh3(ah2.equals("1") ? this.ah3 : "");
        notifyPropertyChanged(BR.ah2);
    }

    @Bindable
    public String getAh3() {
        return ah3;
    }

    public void setAh3(String ah3) {
        this.ah3 = ah3;
        setAh396x(ah3.equals("96") ? this.ah396x : "");
        notifyPropertyChanged(BR.ah3);
    }

    @Bindable
    public String getAh396x() {
        return ah396x;
    }

    public void setAh396x(String ah396x) {
        this.ah396x = ah396x;
        notifyPropertyChanged(BR.ah396x);
    }

    @Bindable
    public String getAh4a() {
        return ah4a;
    }

    public void setAh4a(String ah4a) {
        this.ah4a = ah4a;
        notifyPropertyChanged(BR.ah4a);
    }

    @Bindable
    public String getAh5() {
        return ah5;
    }

    public void setAh5(String ah5) {
        this.ah5 = ah5;
        notifyPropertyChanged(BR.ah5);
    }

    @Bindable
    public String getAh6() {
        return ah6;
    }

    public void setAh6(String ah6) {
        this.ah6 = ah6;
        notifyPropertyChanged(BR.ah6);
    }

    @Bindable
    public String getAh7a() {
        return ah7a;
    }

    public void setAh7a(String ah7a) {
        if (this.ah7a.equals(ah7a)) return;      //For all checkboxes
        this.ah7a = ah7a;
        notifyPropertyChanged(BR.ah7a);
    }

    @Bindable
    public String getAh7b() {
        return ah7b;
    }

    public void setAh7b(String ah7b) {
        if (this.ah7b.equals(ah7b)) return;      //For all checkboxes
        this.ah7b = ah7b;
        notifyPropertyChanged(BR.ah7b);
    }

    @Bindable
    public String getAh7c() {
        return ah7c;
    }

    public void setAh7c(String ah7c) {
        if (this.ah7c.equals(ah7c)) return;      //For all checkboxes
        this.ah7c = ah7c;
        notifyPropertyChanged(BR.ah7c);
    }

    @Bindable
    public String getAh7d() {
        return ah7d;
    }

    public void setAh7d(String ah7d) {
        if (this.ah7d.equals(ah7d)) return;      //For all checkboxes
        this.ah7d = ah7d;
        notifyPropertyChanged(BR.ah7d);
    }

    @Bindable
    public String getAh7e() {
        return ah7e;
    }

    public void setAh7e(String ah7e) {
        if (this.ah7e.equals(ah7e)) return;      //For all checkboxes
        this.ah7e = ah7e;
        notifyPropertyChanged(BR.ah7e);
    }

    @Bindable
    public String getAh7f() {
        return ah7f;
    }

    public void setAh7f(String ah7f) {
        if (this.ah7f.equals(ah7f)) return;      //For all checkboxes
        this.ah7f = ah7f;
        notifyPropertyChanged(BR.ah7f);
    }

    @Bindable
    public String getAh7g() {
        return ah7g;
    }

    public void setAh7g(String ah7g) {
        if (this.ah7g.equals(ah7g)) return;      //For all checkboxes
        this.ah7g = ah7g;
        notifyPropertyChanged(BR.ah7g);
    }

    @Bindable
    public String getAh7h() {
        return ah7h;
    }

    public void setAh7h(String ah7h) {
        if (this.ah7h.equals(ah7h)) return;      //For all checkboxes
        this.ah7h = ah7h;
        setAh7a(ah7h.equals("8") ? "" : this.ah7a);
        setAh7b(ah7h.equals("8") ? "" : this.ah7b);
        setAh7c(ah7h.equals("8") ? "" : this.ah7c);
        setAh7d(ah7h.equals("8") ? "" : this.ah7d);
        setAh7e(ah7h.equals("8") ? "" : this.ah7e);
        setAh7f(ah7h.equals("8") ? "" : this.ah7f);
        setAh7g(ah7h.equals("8") ? "" : this.ah7g);
        setAh796(ah7h.equals("8") ? "" : this.ah796);
        notifyPropertyChanged(BR.ah7h);
    }

    @Bindable
    public String getAh796() {
        return ah796;
    }

    public void setAh796(String ah796) {
        if (this.ah796.equals(ah796)) return;      //For all checkboxes
        this.ah796 = ah796;
        setAh796x(ah796.equals("96") ? this.ah796x : "");
        notifyPropertyChanged(BR.ah796);
    }

    @Bindable
    public String getAh796x() {
        return ah796x;
    }

    public void setAh796x(String ah796x) {
        this.ah796x = ah796x;
        notifyPropertyChanged(BR.ah796x);
    }

    @Bindable
    public String getAh8() {
        return ah8;
    }

    public void setAh8(String ah8) {
        this.ah8 = ah8;
        setAh9(ah8.equals("3") ? "" : this.ah9);
        setAh10(ah8.equals("3") ? "" : this.ah10);
        setAh11a(ah8.equals("3") ? "" : this.ah11a);
        setAh12(ah8.equals("3") ? "" : this.ah12);
        notifyPropertyChanged(BR.ah8);
    }

    @Bindable
    public String getAh9() {
        return ah9;
    }

    public void setAh9(String ah9) {
        this.ah9 = ah9;
        notifyPropertyChanged(BR.ah9);
    }

    @Bindable
    public String getAh10() {
        return ah10;
    }

    public void setAh10(String ah10) {
        this.ah10 = ah10;
        notifyPropertyChanged(BR.ah10);
    }

    @Bindable
    public String getAh11a() {
        return ah11a;
    }

    public void setAh11a(String ah11a) {
        this.ah11a = ah11a;
        notifyPropertyChanged(BR.ah11a);
    }

    @Bindable
    public String getAh12() {
        return ah12;
    }

    public void setAh12(String ah12) {
        this.ah12 = ah12;
        setAh13(ah12.equals("2") ? this.ah13 : "");
        setAh13aa(ah12.equals("2") ? this.ah13aa : "");
        setAh13ab(ah12.equals("2") ? this.ah13ab : "");
        notifyPropertyChanged(BR.ah12);
    }

    @Bindable
    public String getAh13() {
        return ah13;
    }

    public void setAh13(String ah13) {
        this.ah13 = ah13;
        notifyPropertyChanged(BR.ah13);
    }

    @Bindable
    public String getAh13aa() {
        return ah13aa;
    }

    public void setAh13aa(String ah13aa) {
        this.ah13aa = ah13aa;
        notifyPropertyChanged(BR.ah13aa);
    }

    @Bindable
    public String getAh13ab() {
        return ah13ab;
    }

    public void setAh13ab(String ah13ab) {
        this.ah13ab = ah13ab;
        notifyPropertyChanged(BR.ah13ab);
    }

    @Bindable
    public String getAh14() {
        return ah14;
    }

    public void setAh14(String ah14) {
        this.ah14 = ah14;
        notifyPropertyChanged(BR.ah14);
    }

    @Bindable
    public String getAh15() {
        return ah15;
    }

    public void setAh15(String ah15) {
        this.ah15 = ah15;
        notifyPropertyChanged(BR.ah15);
    }

    @Bindable
    public String getAh16() {
        return ah16;
    }

    public void setAh16(String ah16) {
        this.ah16 = ah16;
        setAh17(ah16.equals("2") ? "" : this.ah17);
        setAh18(ah16.equals("2") ? "" : this.ah18);
        notifyPropertyChanged(BR.ah16);
    }

    @Bindable
    public String getAh17() {
        return ah17;
    }

    public void setAh17(String ah17) {
        this.ah17 = ah17;
        notifyPropertyChanged(BR.ah17);
    }

    @Bindable
    public String getAh18() {
        return ah18;
    }

    public void setAh18(String ah18) {
        this.ah18 = ah18;
        notifyPropertyChanged(BR.ah18);
    }

    @Bindable
    public String getAh19() {
        return ah19;
    }

    public void setAh19(String ah19) {
        this.ah19 = ah19;
        setAh20(ah19.equals("1") ? this.ah20 : "");
        setAh21(ah19.equals("1") ? this.ah21 : "");
        notifyPropertyChanged(BR.ah19);
    }

    @Bindable
    public String getAh20() {
        return ah20;
    }

    public void setAh20(String ah20) {
        this.ah20 = ah20;
        notifyPropertyChanged(BR.ah20);
    }

    @Bindable
    public String getAh21() {
        return ah21;
    }

    public void setAh21(String ah21) {
        this.ah21 = ah21;
        notifyPropertyChanged(BR.ah21);
    }

    @Bindable
    public String getAh2102() {
        return ah2102;
    }

    public void setAh2102(String ah2102) {
        this.ah2102 = ah2102;
        notifyPropertyChanged(BR.ah2102);
    }

    @Bindable
    public String getAh2201() {
        return ah2201;
    }

    public void setAh2201(String ah2201) {
        this.ah2201 = ah2201;
        setAh23(ah2201.equals("1") || this.ah2202.equals("1") || this.ah2203.equals("1") || this.ah2296.equals("1") ? this.ah23 : "");
        notifyPropertyChanged(BR.ah2201);
    }

    @Bindable
    public String getAh2202() {
        return ah2202;
    }

    public void setAh2202(String ah2202) {
        this.ah2202 = ah2202;
        setAh23(ah2202.equals("1") || this.ah2201.equals("1") || this.ah2203.equals("1") || this.ah2296.equals("1") ? this.ah23 : "");
/*        setAh23(ah2202.equals("2") ? "" : this.ah23);
        setAh2401(ah2202.equals("2") ? "" : this.ah2401);
        setAh2402(ah2202.equals("2") ? "" : this.ah2402);
        setAh2403(ah2202.equals("2") ? "" : this.ah2403);
        setAh2404(ah2202.equals("2") ? "" : this.ah2404);
        setAh2405(ah2202.equals("2") ? "" : this.ah2405);
        setAh2406(ah2202.equals("2") ? "" : this.ah2406);
        setAh2407(ah2202.equals("2") ? "" : this.ah2407);
        setAh2408(ah2202.equals("2") ? "" : this.ah2408);
        setAh2409(ah2202.equals("2") ? "" : this.ah2409);
        setAh2410(ah2202.equals("2") ? "" : this.ah2410);
        setAh2411(ah2202.equals("2") ? "" : this.ah2411);*/
        notifyPropertyChanged(BR.ah2202);
    }

    @Bindable
    public String getAh2203() {
        return ah2203;
    }

    public void setAh2203(String ah2203) {
        this.ah2203 = ah2203;
        setAh23(ah2203.equals("1") || this.ah2202.equals("1") || this.ah2201.equals("1") || this.ah2296.equals("1") ? this.ah23 : "");
        notifyPropertyChanged(BR.ah2203);
    }

    @Bindable
    public String getAh2296() {
        return ah2296;
    }

    public void setAh2296(String ah2296) {
        this.ah2296 = ah2296;
        setAh23(ah2296.equals("1") || this.ah2202.equals("1") || this.ah2203.equals("1") || this.ah2201.equals("1") ? this.ah23 : "");
        setAh2296x(ah2296.equals("96") ? this.ah2296x : "");
        notifyPropertyChanged(BR.ah2296);
    }

    @Bindable
    public String getAh2296x() {
        return ah2296x;
    }

    public void setAh2296x(String ah2296x) {
        this.ah2296x = ah2296x;
        notifyPropertyChanged(BR.ah2296x);
    }

    @Bindable
    public String getAh23() {
        return ah23;
    }

    public void setAh23(String ah23) {
        this.ah23 = ah23;
        setAh2301x(ah23.equals("1") ? this.ah2301x : "");
        setAh2302x(ah23.equals("2") ? this.ah2302x : "");
        setAh2303x(ah23.equals("3") ? this.ah2303x : "");
        notifyPropertyChanged(BR.ah23);
    }

    @Bindable
    public String getAh2301x() {
        return ah2301x;
    }

    public void setAh2301x(String ah2301x) {
        this.ah2301x = ah2301x;
        notifyPropertyChanged(BR.ah2301x);
    }

    @Bindable
    public String getAh2302x() {
        return ah2302x;
    }

    public void setAh2302x(String ah2302x) {
        this.ah2302x = ah2302x;
        notifyPropertyChanged(BR.ah2302x);
    }

    @Bindable
    public String getAh2303x() {
        return ah2303x;
    }

    public void setAh2303x(String ah2303x) {
        this.ah2303x = ah2303x;
        notifyPropertyChanged(BR.ah2303x);
    }


    @Bindable
    public String getAh2401() {
        return ah2401;
    }

    public void setAh2401(String ah2401) {
        this.ah2401 = ah2401;
        notifyPropertyChanged(BR.ah2401);
    }


    @Bindable
    public String getAh2402() {
        return ah2402;
    }

    public void setAh2402(String ah2402) {
        this.ah2402 = ah2402;
        notifyPropertyChanged(BR.ah2402);
    }


    @Bindable
    public String getAh2403() {
        return ah2403;
    }

    public void setAh2403(String ah2403) {
        this.ah2403 = ah2403;
        notifyPropertyChanged(BR.ah2403);
    }


    @Bindable
    public String getAh2404() {
        return ah2404;
    }

    public void setAh2404(String ah2404) {
        this.ah2404 = ah2404;
        notifyPropertyChanged(BR.ah2404);
    }


    @Bindable
    public String getAh2405() {
        return ah2405;
    }

    public void setAh2405(String ah2405) {
        this.ah2405 = ah2405;
        notifyPropertyChanged(BR.ah2405);
    }


    @Bindable
    public String getAh2406() {
        return ah2406;
    }

    public void setAh2406(String ah2406) {
        this.ah2406 = ah2406;
        notifyPropertyChanged(BR.ah2406);
    }


    @Bindable
    public String getAh2407() {
        return ah2407;
    }

    public void setAh2407(String ah2407) {
        this.ah2407 = ah2407;
        notifyPropertyChanged(BR.ah2407);
    }


    @Bindable
    public String getAh2408() {
        return ah2408;
    }

    public void setAh2408(String ah2408) {
        this.ah2408 = ah2408;
        notifyPropertyChanged(BR.ah2408);
    }


    @Bindable
    public String getAh2409() {
        return ah2409;
    }

    public void setAh2409(String ah2409) {
        this.ah2409 = ah2409;
        notifyPropertyChanged(BR.ah2409);
    }


    @Bindable
    public String getAh2410() {
        return ah2410;
    }

    public void setAh2410(String ah2410) {
        this.ah2410 = ah2410;
        notifyPropertyChanged(BR.ah2410);
    }


    @Bindable
    public String getAh2411() {
        return ah2411;
    }

    public void setAh2411(String ah2411) {
        if (this.ah2411.equals(ah2411)) return;
        this.ah2411 = ah2411;
        setAh24a(ah2411.equals("11") ? "" : this.ah24a);
        setAh2401(ah2411.equals("11") ? "" : this.ah2401);
        setAh2402(ah2411.equals("11") ? "" : this.ah2402);
        setAh2403(ah2411.equals("11") ? "" : this.ah2403);
        setAh2404(ah2411.equals("11") ? "" : this.ah2404);
        setAh2405(ah2411.equals("11") ? "" : this.ah2405);
        setAh2406(ah2411.equals("11") ? "" : this.ah2406);
        setAh2407(ah2411.equals("11") ? "" : this.ah2407);
        setAh2408(ah2411.equals("11") ? "" : this.ah2408);
        setAh2409(ah2411.equals("11") ? "" : this.ah2409);
        setAh2410(ah2411.equals("11") ? "" : this.ah2410);
        setAh24a(ah2411.equals("11") ? "" : this.ah24a);
        setAh25(ah2411.equals("11") ? "" : this.ah25);
        setAh26(ah2411.equals("11") ? "" : this.ah26);
        notifyPropertyChanged(BR.ah2411);
    }


    @Bindable
    public String getAh24a() {
        return ah24a;
    }

    public void setAh24a(String ah24a) {
        this.ah24a = ah24a;
        notifyPropertyChanged(BR.ah24a);
    }


    @Bindable
    public String getAh25() {
        return ah25;
    }

    public void setAh25(String ah25) {
        this.ah25 = ah25;
        setAh26(ah25.equals("2") ? "" : this.ah26);
        notifyPropertyChanged(BR.ah25);
    }

    @Bindable
    public String getAh26() {
        return ah26;
    }

    public void setAh26(String ah26) {
        this.ah26 = ah26;
        setAh2696x(ah26.equals("96") ? this.ah2696x : "");
        notifyPropertyChanged(BR.ah26);
    }

    @Bindable
    public String getAh2696x() {
        return ah2696x;
    }

    public void setAh2696x(String ah2696x) {
        this.ah2696x = ah2696x;
        notifyPropertyChanged(BR.ah2696x);
    }

    @Bindable
    public String getAh27() {
        return ah27;
    }

    public void setAh27(String ah27) {
        this.ah27 = ah27;
        setAh28(ah27.equals("2") ? "" : this.ah28);
        notifyPropertyChanged(BR.ah27);
    }

    @Bindable
    public String getAh28() {
        return ah28;
    }

    public void setAh28(String ah28) {
        this.ah28 = ah28;
        notifyPropertyChanged(BR.ah28);
    }

    @Bindable
    public String getAh29() {
        return ah29;
    }

    public void setAh29(String ah29) {
        this.ah29 = ah29;
        notifyPropertyChanged(BR.ah29);
    }

    @Bindable
    public String getAh3001() {
        return ah3001;
    }

    public void setAh3001(String ah3001) {
        this.ah3001 = ah3001;
        notifyPropertyChanged(BR.ah3001);
    }

    @Bindable
    public String getAh3002() {
        return ah3002;
    }

    public void setAh3002(String ah3002) {
        this.ah3002 = ah3002;
        notifyPropertyChanged(BR.ah3002);
    }

    @Bindable
    public String getAh3003() {
        return ah3003;
    }

    public void setAh3003(String ah3003) {
        this.ah3003 = ah3003;
        setAh31(ah3003.equals("1") ? this.ah31 : "");
        notifyPropertyChanged(BR.ah3003);
    }

    @Bindable
    public String getAh31() {
        return ah31;
    }

    public void setAh31(String ah31) {
        this.ah31 = ah31;
        notifyPropertyChanged(BR.ah31);
    }

    @Bindable
    public String getAh3201() {
        return ah3201;
    }

    public void setAh3201(String ah3201) {
        this.ah3201 = ah3201;
        notifyPropertyChanged(BR.ah3201);
    }

    @Bindable
    public String getAh3202() {
        return ah3202;
    }

    public void setAh3202(String ah3202) {
        this.ah3202 = ah3202;
        notifyPropertyChanged(BR.ah3202);
    }

    @Bindable
    public String getAh3203() {
        return ah3203;
    }

    public void setAh3203(String ah3203) {
        this.ah3203 = ah3203;
        notifyPropertyChanged(BR.ah3203);
    }

    @Bindable
    public String getAh3204() {
        return ah3204;
    }

    public void setAh3204(String ah3204) {
        this.ah3204 = ah3204;
        notifyPropertyChanged(BR.ah3204);
    }

    @Bindable
    public String getAh3205() {
        return ah3205;
    }

    public void setAh3205(String ah3205) {
        this.ah3205 = ah3205;
        notifyPropertyChanged(BR.ah3205);
    }

    @Bindable
    public String getAh33a() {
        return ah33a;
    }

    public void setAh33a(String ah33a) {
        if (this.ah33a.equals(ah33a)) return;
        this.ah33a = ah33a;
        notifyPropertyChanged(BR.ah33a);
    }

    @Bindable
    public String getAh33b() {
        return ah33b;
    }

    public void setAh33b(String ah33b) {
        if (this.ah33b.equals(ah33b)) return;
        this.ah33b = ah33b;
        notifyPropertyChanged(BR.ah33b);
    }

    @Bindable
    public String getAh33c() {
        return ah33c;
    }

    public void setAh33c(String ah33c) {
        if (this.ah33c.equals(ah33c)) return;
        this.ah33c = ah33c;
        notifyPropertyChanged(BR.ah33c);
    }

    @Bindable
    public String getAh3398() {
        return ah3398;
    }

    public void setAh3398(String ah3398) {
        if (this.ah3398.equals(ah3398)) return;
        this.ah3398 = ah3398;
        setAh33a(ah3398.equals("98") ? "" : this.ah33a);
        setAh33b(ah3398.equals("98") ? "" : this.ah33b);
        setAh33c(ah3398.equals("98") ? "" : this.ah33c);
        notifyPropertyChanged(BR.ah3398);
    }

    @Bindable
    public String getAh34() {
        return ah34;
    }

    public void setAh34(String ah34) {
        this.ah34 = ah34;
        notifyPropertyChanged(BR.ah34);
    }

    @Bindable
    public String getAh35a() {
        return ah35a;
    }

    public void setAh35a(String ah35a) {
        if (this.ah35a.equals(ah35a)) return;
        this.ah35a = ah35a;
        notifyPropertyChanged(BR.ah35a);
    }

    @Bindable
    public String getAh35b() {
        return ah35b;
    }

    public void setAh35b(String ah35b) {
        if (this.ah35b.equals(ah35b)) return;
        this.ah35b = ah35b;
        notifyPropertyChanged(BR.ah35b);
    }

    @Bindable
    public String getAh35c() {
        return ah35c;
    }

    public void setAh35c(String ah35c) {
        if (this.ah35c.equals(ah35c)) return;
        this.ah35c = ah35c;
        notifyPropertyChanged(BR.ah35c);
    }

    @Bindable
    public String getAh35d() {
        return ah35d;
    }

    public void setAh35d(String ah35d) {
        if (this.ah35d.equals(ah35d)) return;
        this.ah35d = ah35d;
        notifyPropertyChanged(BR.ah35d);
    }

    @Bindable
    public String getAh35e() {
        return ah35e;
    }

    public void setAh35e(String ah35e) {
        if (this.ah35e.equals(ah35e)) return;
        this.ah35e = ah35e;
        notifyPropertyChanged(BR.ah35e);
    }

    @Bindable
    public String getAh35f() {
        return ah35f;
    }

    public void setAh35f(String ah35f) {
        if (this.ah35f.equals(ah35f)) return;
        this.ah35f = ah35f;
        notifyPropertyChanged(BR.ah35f);
    }

    @Bindable
    public String getAh35g() {
        return ah35g;
    }

    public void setAh35g(String ah35g) {
        if (this.ah35g.equals(ah35g)) return;
        this.ah35g = ah35g;
        notifyPropertyChanged(BR.ah35g);
    }

    @Bindable
    public String getAh35h() {
        return ah35h;
    }

    public void setAh35h(String ah35h) {
        if (this.ah35h.equals(ah35h)) return;
        this.ah35h = ah35h;
        notifyPropertyChanged(BR.ah35h);
    }

    @Bindable
    public String getAh35i() {
        return ah35i;
    }

    public void setAh35i(String ah35i) {
        if (this.ah35i.equals(ah35i)) return;
        this.ah35i = ah35i;
        notifyPropertyChanged(BR.ah35i);
    }

    @Bindable
    public String getAh35j() {
        return ah35j;
    }

    public void setAh35j(String ah35j) {
        if (this.ah35j.equals(ah35j)) return;
        this.ah35j = ah35j;
        notifyPropertyChanged(BR.ah35j);
    }

    @Bindable
    public String getAh36() {
        return ah36;
    }

    public void setAh36(String ah36) {
        this.ah36 = ah36;
        setAh36ax(ah36.equals("1") ? this.ah36ax : "");
        notifyPropertyChanged(BR.ah36);
    }

    @Bindable
    public String getAh36ax() {
        return ah36ax;
    }

    public void setAh36ax(String ah36ax) {
        this.ah36ax = ah36ax;
        notifyPropertyChanged(BR.ah36ax);
    }

    @Bindable
    public String getAh3701() {
        return ah3701;
    }

    public void setAh3701(String ah3701) {
        this.ah3701 = ah3701;
        notifyPropertyChanged(BR.ah3701);
    }

    @Bindable
    public String getAh3701a() {
        return ah3701a;
    }

    public void setAh3701a(String ah3701a) {
        if (this.ah3701a.equals(ah3701a)) return;     // For all checkboxes
        this.ah3701a = ah3701a;
        notifyPropertyChanged(BR.ah3701a);
    }

    @Bindable
    public String getAh3701b() {
        return ah3701b;
    }

    public void setAh3701b(String ah3701b) {
        if (this.ah3701b.equals(ah3701b)) return;     // For all checkboxes
        this.ah3701b = ah3701b;
        notifyPropertyChanged(BR.ah3701b);
    }

    @Bindable
    public String getAh3701c() {
        return ah3701c;
    }

    public void setAh3701c(String ah3701c) {
        if (this.ah3701c.equals(ah3701c)) return;     // For all checkboxes
        this.ah3701c = ah3701c;
        notifyPropertyChanged(BR.ah3701c);
    }

    @Bindable
    public String getAh3701d() {
        return ah3701d;
    }

    public void setAh3701d(String ah3701d) {
        if (this.ah3701d.equals(ah3701d)) return;     // For all checkboxes
        this.ah3701d = ah3701d;
        notifyPropertyChanged(BR.ah3701d);
    }

    @Bindable
    public String getAh3701e() {
        return ah3701e;
    }

    public void setAh3701e(String ah3701e) {
        if (this.ah3701e.equals(ah3701e)) return;     // For all checkboxes
        this.ah3701e = ah3701e;
        setAh3701a(ah3701e.equals("5") ? "" : this.ah3701a);
        setAh3701b(ah3701e.equals("5") ? "" : this.ah3701b);
        setAh3701c(ah3701e.equals("5") ? "" : this.ah3701c);
        setAh3701d(ah3701e.equals("5") ? "" : this.ah3701d);
        setAh3701f(ah3701e.equals("5") ? "" : this.ah3701f);
        setAh3701x(ah3701e.equals("5") ? "" : this.ah3701x);
        notifyPropertyChanged(BR.ah3701e);
    }

    @Bindable
    public String getAh3701f() {
        return ah3701f;
    }

    public void setAh3701f(String ah3701f) {
        if (this.ah3701f.equals(ah3701f)) return;     // For all checkboxes
        this.ah3701f = ah3701f;
        notifyPropertyChanged(BR.ah3701f);
    }

    @Bindable
    public String getAh3701x() {
        return ah3701x;
    }

    public void setAh3701x(String ah3701x) {
        if (this.ah3701x.equals(ah3701x)) return;     // For all checkboxes
        this.ah3701x = ah3701x;
        setAh3701xx(ah3701x.equals("96") ? this.ah3701xx : "");
        notifyPropertyChanged(BR.ah3701x);
    }

    @Bindable
    public String getAh3701xx() {
        return ah3701xx;
    }

    public void setAh3701xx(String ah3701xx) {
        this.ah3701xx = ah3701xx;
        notifyPropertyChanged(BR.ah3701xx);
    }

    @Bindable
    public String getAh3702() {
        return ah3702;
    }

    public void setAh3702(String ah3702) {
        this.ah3702 = ah3702;
        notifyPropertyChanged(BR.ah3702);
    }

    @Bindable
    public String getAh3702a() {
        return ah3702a;
    }

    public void setAh3702a(String ah3702a) {
        if (this.ah3702a.equals(ah3702a)) return;     // For all checkboxes
        this.ah3702a = ah3702a;
        notifyPropertyChanged(BR.ah3702a);
    }

    @Bindable
    public String getAh3702b() {
        return ah3702b;
    }

    public void setAh3702b(String ah3702b) {
        if (this.ah3702b.equals(ah3702b)) return;     // For all checkboxes
        this.ah3702b = ah3702b;
        notifyPropertyChanged(BR.ah3702b);
    }

    @Bindable
    public String getAh3702c() {
        return ah3702c;
    }

    public void setAh3702c(String ah3702c) {
        if (this.ah3702c.equals(ah3702c)) return;     // For all checkboxes
        this.ah3702c = ah3702c;
        notifyPropertyChanged(BR.ah3702c);
    }

    @Bindable
    public String getAh3702e() {
        return ah3702e;
    }

    public void setAh3702e(String ah3702e) {
        if (this.ah3702e.equals(ah3702e)) return;     // For all checkboxes
        this.ah3702e = ah3702e;
        notifyPropertyChanged(BR.ah3702e);
    }

    @Bindable
    public String getAh3702d() {
        return ah3702d;
    }

    public void setAh3702d(String ah3702d) {
        if (this.ah3702d.equals(ah3702d)) return;     // For all checkboxes
        this.ah3702d = ah3702d;
        notifyPropertyChanged(BR.ah3702d);
    }

    @Bindable
    public String getAh3702f() {
        return ah3702f;
    }

    public void setAh3702f(String ah3702f) {
        if (this.ah3702f.equals(ah3702f)) return;     // For all checkboxes
        this.ah3702f = ah3702f;
        notifyPropertyChanged(BR.ah3702f);
    }

    @Bindable
    public String getAh3702x() {
        return ah3702x;
    }

    public void setAh3702x(String ah3702x) {
        if (this.ah3702x.equals(ah3702x)) return;     // For all checkboxes
        this.ah3702x = ah3702x;
        setAh3702xx(ah3702x.equals("96") ? this.ah3702xx : "");
        notifyPropertyChanged(BR.ah3702x);
    }

    @Bindable
    public String getAh3702xx() {
        return ah3702xx;
    }

    public void setAh3702xx(String ah3702xx) {
        this.ah3702xx = ah3702xx;
        notifyPropertyChanged(BR.ah3702xx);
    }

    @Bindable
    public String getAh3703() {
        return ah3703;
    }

    public void setAh3703(String ah3703) {
        this.ah3703 = ah3703;
        notifyPropertyChanged(BR.ah3703);
    }

    @Bindable
    public String getAh3703a() {
        return ah3703a;
    }

    public void setAh3703a(String ah3703a) {
        if (this.ah3703a.equals(ah3703a)) return;     // For all checkboxes
        this.ah3703a = ah3703a;
        notifyPropertyChanged(BR.ah3703a);
    }

    @Bindable
    public String getAh3703b() {
        return ah3703b;
    }

    public void setAh3703b(String ah3703b) {
        if (this.ah3703b.equals(ah3703b)) return;     // For all checkboxes
        this.ah3703b = ah3703b;
        notifyPropertyChanged(BR.ah3703b);
    }

    @Bindable
    public String getAh3703c() {
        return ah3703c;
    }

    public void setAh3703c(String ah3703c) {
        if (this.ah3703c.equals(ah3703c)) return;     // For all checkboxes
        this.ah3703c = ah3703c;
        notifyPropertyChanged(BR.ah3703c);
    }

    @Bindable
    public String getAh3703e() {
        return ah3703e;
    }

    public void setAh3703e(String ah3703e) {
        if (this.ah3703e.equals(ah3703e)) return;     // For all checkboxes
        this.ah3703e = ah3703e;
        notifyPropertyChanged(BR.ah3703e);
    }

    @Bindable
    public String getAh3703d() {
        return ah3703d;
    }

    public void setAh3703d(String ah3703d) {
        if (this.ah3703d.equals(ah3703d)) return;     // For all checkboxes
        this.ah3703d = ah3703d;
        notifyPropertyChanged(BR.ah3703d);
    }

    @Bindable
    public String getAh3703f() {
        return ah3703f;
    }

    public void setAh3703f(String ah3703f) {
        if (this.ah3703f.equals(ah3703f)) return;     // For all checkboxes
        this.ah3703f = ah3703f;
        notifyPropertyChanged(BR.ah3703f);
    }

    @Bindable
    public String getAh3703x() {
        return ah3703x;
    }

    public void setAh3703x(String ah3703x) {
        if (this.ah3703x.equals(ah3703x)) return;     // For all checkboxes
        this.ah3703x = ah3703x;
        setAh3703xx(ah3703x.equals("96") ? this.ah3703xx : "");
        notifyPropertyChanged(BR.ah3703x);
    }

    @Bindable
    public String getAh3703xx() {
        return ah3703xx;
    }

    public void setAh3703xx(String ah3703xx) {
        this.ah3703xx = ah3703xx;
        notifyPropertyChanged(BR.ah3703xx);
    }

    @Bindable
    public String getAh3704() {
        return ah3704;
    }

    public void setAh3704(String ah3704) {
        this.ah3704 = ah3704;
        notifyPropertyChanged(BR.ah3704);
    }

    @Bindable
    public String getAh3704a() {
        return ah3704a;
    }

    public void setAh3704a(String ah3704a) {
        if (this.ah3704a.equals(ah3704a)) return;     // For all checkboxes
        this.ah3704a = ah3704a;
        notifyPropertyChanged(BR.ah3704a);
    }

    @Bindable
    public String getAh3704b() {
        return ah3704b;
    }

    public void setAh3704b(String ah3704b) {
        if (this.ah3704b.equals(ah3704b)) return;     // For all checkboxes
        this.ah3704b = ah3704b;
        notifyPropertyChanged(BR.ah3704b);
    }

    @Bindable
    public String getAh3704c() {
        return ah3704c;
    }

    public void setAh3704c(String ah3704c) {
        if (this.ah3704c.equals(ah3704c)) return;     // For all checkboxes
        this.ah3704c = ah3704c;
        notifyPropertyChanged(BR.ah3704c);
    }

    @Bindable
    public String getAh3704e() {
        return ah3704e;
    }

    public void setAh3704e(String ah3704e) {
        if (this.ah3704e.equals(ah3704e)) return;     // For all checkboxes
        this.ah3704e = ah3704e;
        notifyPropertyChanged(BR.ah3704e);
    }

    @Bindable
    public String getAh3704d() {
        return ah3704d;
    }

    public void setAh3704d(String ah3704d) {
        if (this.ah3704d.equals(ah3704d)) return;     // For all checkboxes
        this.ah3704d = ah3704d;
        notifyPropertyChanged(BR.ah3704d);
    }

    @Bindable
    public String getAh3704f() {
        return ah3704f;
    }

    public void setAh3704f(String ah3704f) {
        if (this.ah3704f.equals(ah3704f)) return;     // For all checkboxes
        this.ah3704f = ah3704f;
        notifyPropertyChanged(BR.ah3704f);
    }

    @Bindable
    public String getAh3704x() {
        return ah3704x;
    }

    public void setAh3704x(String ah3704x) {
        if (this.ah3704x.equals(ah3704x)) return;     // For all checkboxes
        this.ah3704x = ah3704x;
        setAh3704xx(ah3704x.equals("96") ? this.ah3704xx : "");
        notifyPropertyChanged(BR.ah3704x);
    }

    @Bindable
    public String getAh3704xx() {
        return ah3704xx;
    }

    public void setAh3704xx(String ah3704xx) {
        this.ah3704xx = ah3704xx;
        notifyPropertyChanged(BR.ah3704xx);
    }

    @Bindable
    public String getAh3705() {
        return ah3705;
    }

    public void setAh3705(String ah3705) {
        this.ah3705 = ah3705;
        notifyPropertyChanged(BR.ah3705);
    }

    @Bindable
    public String getAh3705a() {
        return ah3705a;
    }

    public void setAh3705a(String ah3705a) {
        if (this.ah3705a.equals(ah3705a)) return;     // For all checkboxes
        this.ah3705a = ah3705a;
        notifyPropertyChanged(BR.ah3705a);
    }

    @Bindable
    public String getAh3705b() {
        return ah3705b;
    }

    public void setAh3705b(String ah3705b) {
        if (this.ah3705b.equals(ah3705b)) return;     // For all checkboxes
        this.ah3705b = ah3705b;
        notifyPropertyChanged(BR.ah3705b);
    }

    @Bindable
    public String getAh3705c() {
        return ah3705c;
    }

    public void setAh3705c(String ah3705c) {
        if (this.ah3705c.equals(ah3705c)) return;     // For all checkboxes
        this.ah3705c = ah3705c;
        notifyPropertyChanged(BR.ah3705c);
    }

    @Bindable
    public String getAh3705e() {
        return ah3705e;
    }

    public void setAh3705e(String ah3705e) {
        if (this.ah3705e.equals(ah3705e)) return;     // For all checkboxes
        this.ah3705e = ah3705e;
        notifyPropertyChanged(BR.ah3705e);
    }

    @Bindable
    public String getAh3705d() {
        return ah3705d;
    }

    public void setAh3705d(String ah3705d) {
        if (this.ah3705d.equals(ah3705d)) return;     // For all checkboxes
        this.ah3705d = ah3705d;
        notifyPropertyChanged(BR.ah3705d);
    }

    @Bindable
    public String getAh3705f() {
        return ah3705f;
    }

    public void setAh3705f(String ah3705f) {
        if (this.ah3705f.equals(ah3705f)) return;     // For all checkboxes
        this.ah3705f = ah3705f;
        notifyPropertyChanged(BR.ah3705f);
    }

    @Bindable
    public String getAh3705x() {
        return ah3705x;
    }

    public void setAh3705x(String ah3705x) {
        if (this.ah3705x.equals(ah3705x)) return;     // For all checkboxes
        this.ah3705x = ah3705x;
        setAh3705xx(ah3705x.equals("96") ? this.ah3705xx : "");
        notifyPropertyChanged(BR.ah3705x);
    }

    @Bindable
    public String getAh3705xx() {
        return ah3705xx;
    }

    public void setAh3705xx(String ah3705xx) {
        this.ah3705xx = ah3705xx;
        notifyPropertyChanged(BR.ah3705xx);
    }

    @Bindable
    public String getAh3706() {
        return ah3706;
    }

    public void setAh3706(String ah3706) {
        this.ah3706 = ah3706;
        notifyPropertyChanged(BR.ah3706);
    }

    @Bindable
    public String getAh3706a() {
        return ah3706a;
    }

    public void setAh3706a(String ah3706a) {
        if (this.ah3706a.equals(ah3706a)) return;     // For all checkboxes
        this.ah3706a = ah3706a;
        notifyPropertyChanged(BR.ah3706a);
    }

    @Bindable
    public String getAh3706b() {
        return ah3706b;
    }

    public void setAh3706b(String ah3706b) {
        if (this.ah3706b.equals(ah3706b)) return;     // For all checkboxes
        this.ah3706b = ah3706b;
        notifyPropertyChanged(BR.ah3706b);
    }

    @Bindable
    public String getAh3706c() {
        return ah3706c;
    }

    public void setAh3706c(String ah3706c) {
        if (this.ah3706c.equals(ah3706c)) return;     // For all checkboxes
        this.ah3706c = ah3706c;
        notifyPropertyChanged(BR.ah3706c);
    }

    @Bindable
    public String getAh3706e() {
        return ah3706e;
    }

    public void setAh3706e(String ah3706e) {
        if (this.ah3706e.equals(ah3706e)) return;     // For all checkboxes
        this.ah3706e = ah3706e;
        notifyPropertyChanged(BR.ah3706e);
    }

    @Bindable
    public String getAh3706d() {
        return ah3706d;
    }

    public void setAh3706d(String ah3706d) {
        if (this.ah3706d.equals(ah3706d)) return;     // For all checkboxes
        this.ah3706d = ah3706d;
        notifyPropertyChanged(BR.ah3706d);
    }

    @Bindable
    public String getAh3706f() {
        return ah3706f;
    }

    public void setAh3706f(String ah3706f) {
        if (this.ah3706f.equals(ah3706f)) return;     // For all checkboxes
        this.ah3706f = ah3706f;
        notifyPropertyChanged(BR.ah3706f);
    }

    @Bindable
    public String getAh3706x() {
        return ah3706x;
    }

    public void setAh3706x(String ah3706x) {
        if (this.ah3706x.equals(ah3706x)) return;     // For all checkboxes
        this.ah3706x = ah3706x;
        setAh3706xx(ah3706x.equals("96") ? this.ah3706xx : "");
        notifyPropertyChanged(BR.ah3706x);
    }

    @Bindable
    public String getAh3706xx() {
        return ah3706xx;
    }

    public void setAh3706xx(String ah3706xx) {
        this.ah3706xx = ah3706xx;
        notifyPropertyChanged(BR.ah3706xx);
    }

    @Bindable
    public String getAh37aa() {
        return ah37aa;
    }

    public void setAh37aa(String ah37aa) {
        if (this.ah37aa.equals(ah37aa)) return;     // For all checkboxes
        this.ah37aa = ah37aa;
        notifyPropertyChanged(BR.ah37aa);
    }

    @Bindable
    public String getAh37ab() {
        return ah37ab;
    }

    public void setAh37ab(String ah37ab) {
        if (this.ah37ab.equals(ah37ab)) return;     // For all checkboxes
        this.ah37ab = ah37ab;
        notifyPropertyChanged(BR.ah37ab);
    }

    @Bindable
    public String getAh37ac() {
        return ah37ac;
    }

    public void setAh37ac(String ah37ac) {
        if (this.ah37ac.equals(ah37ac)) return;     // For all checkboxes
        this.ah37ac = ah37ac;
        boolean b = ah37ac.length() > 0 && Integer.parseInt(ah37ac) < 14;
        setAh38(b ? "" : this.ah38);
        setAh38aa(b ? "" : this.ah38aa);

        setAh39a(b ? "" : this.ah39a);
        setAh39b(b ? "" : this.ah39b);
        setAh39c(b ? "" : this.ah39c);
        setAh39d(b ? "" : this.ah39d);
        setAh39x(b ? "" : this.ah39x);

        setAh40a(b ? "" : this.ah40a);
        setAh40b(b ? "" : this.ah40b);
        setAh40c(b ? "" : this.ah40c);
        setAh40d(b ? "" : this.ah40d);
        setAh40e(b ? "" : this.ah40e);

        setAh40aaa(b ? "" : this.ah40aaa);
        setAh40aab(b ? "" : this.ah40aab);
        setAh40aac(b ? "" : this.ah40aac);
        setAh40aad(b ? "" : this.ah40aad);
        setAh40aae(b ? "" : this.ah40aae);
        setAh40aaf(b ? "" : this.ah40aaf);
        setAh40aag(b ? "" : this.ah40aag);
        setAh40aah(b ? "" : this.ah40aah);
        setAh40aax(b ? "" : this.ah40aax);

        setAh41(b ? "" : this.ah41);
        setAh42(b ? "" : this.ah42);
        setAh43(b ? "" : this.ah43);

        setAh44a(b ? "" : this.ah44a);
        setAh44b(b ? "" : this.ah44b);
        setAh44c(b ? "" : this.ah44c);
        setAh44d(b ? "" : this.ah44d);
        setAh44e(b ? "" : this.ah44e);
        setAh44f(b ? "" : this.ah44f);
        setAh44g(b ? "" : this.ah44g);
        setAh44h(b ? "" : this.ah44h);
        setAh44i(b ? "" : this.ah44i);

        setAh45(b ? "" : this.ah45);
        setAh46(b ? "" : this.ah46);
        setAh47d(b ? "" : this.ah47d);
        setAh48(b ? "" : this.ah48);

        notifyPropertyChanged(BR.ah37ac);
    }

    @Bindable
    public String getAh38() {
        return ah38;
    }

    public void setAh38(String ah38) {
        this.ah38 = ah38;
        notifyPropertyChanged(BR.ah38);
    }

    @Bindable
    public String getAh38aa() {
        return ah38aa;
    }

    public void setAh38aa(String ah38aa) {
        this.ah38aa = ah38aa;
        notifyPropertyChanged(BR.ah38aa);
    }

    @Bindable
    public String getAh39() {
        return ah39;
    }

    public void setAh39(String ah39) {
        this.ah39 = ah39;
        notifyPropertyChanged(BR.ah39);
    }

    @Bindable
    public String getAh39a() {
        return ah39a;
    }

    public void setAh39a(String ah39a) {
        if (this.ah39a.equals(ah39a)) return;     // For all checkboxes
        this.ah39a = ah39a;
        notifyPropertyChanged(BR.ah39a);
    }

    @Bindable
    public String getAh39b() {
        return ah39b;
    }

    public void setAh39b(String ah39b) {
        if (this.ah39b.equals(ah39b)) return;     // For all checkboxes
        this.ah39b = ah39b;
        notifyPropertyChanged(BR.ah39b);
    }

    @Bindable
    public String getAh39c() {
        return ah39c;
    }

    public void setAh39c(String ah39c) {
        if (this.ah39c.equals(ah39c)) return;     // For all checkboxes
        this.ah39c = ah39c;
        notifyPropertyChanged(BR.ah39c);
    }

    @Bindable
    public String getAh39d() {
        return ah39d;
    }

    public void setAh39d(String ah39d) {
        if (this.ah39d.equals(ah39d)) return;     // For all checkboxes
        this.ah39d = ah39d;
        setAh39a(ah39d.equals("4") ? "" : this.ah39a);
        setAh39b(ah39d.equals("4") ? "" : this.ah39b);
        setAh39c(ah39d.equals("4") ? "" : this.ah39c);
        setAh39x(ah39d.equals("4") ? "" : this.ah39x);
        notifyPropertyChanged(BR.ah39d);
    }

    @Bindable
    public String getAh39x() {
        return ah39x;
    }

    public void setAh39x(String ah39x) {
        if (this.ah39x.equals(ah39x)) return;     // For all checkboxes
        this.ah39x = ah39x;
        setAh39xx(ah39x.equals("96") ? this.ah39xx : "");
        notifyPropertyChanged(BR.ah39x);
    }

    @Bindable
    public String getAh39xx() {
        return ah39xx;
    }

    public void setAh39xx(String ah39xx) {
        this.ah39xx = ah39xx;
        notifyPropertyChanged(BR.ah39xx);
    }

    @Bindable
    public String getAh40() {
        return ah40;
    }

    public void setAh40(String ah40) {
        this.ah40 = ah40;
        notifyPropertyChanged(BR.ah40);
    }

    @Bindable
    public String getAh40a() {
        return ah40a;
    }

    public void setAh40a(String ah40a) {
        if (this.ah40a.equals(ah40a)) return;     // For all checkboxes
        this.ah40a = ah40a;
        notifyPropertyChanged(BR.ah40a);
    }

    @Bindable
    public String getAh40b() {
        return ah40b;
    }

    public void setAh40b(String ah40b) {
        if (this.ah40b.equals(ah40b)) return;     // For all checkboxes
        this.ah40b = ah40b;
        notifyPropertyChanged(BR.ah40b);
    }

    @Bindable
    public String getAh40c() {
        return ah40c;
    }

    public void setAh40c(String ah40c) {
        if (this.ah40c.equals(ah40c)) return;     // For all checkboxes
        this.ah40c = ah40c;
        notifyPropertyChanged(BR.ah40c);
    }

    @Bindable
    public String getAh40d() {
        return ah40d;
    }

    public void setAh40d(String ah40d) {
        if (this.ah40d.equals(ah40d)) return;     // For all checkboxes
        this.ah40d = ah40d;
        notifyPropertyChanged(BR.ah40d);
    }

    @Bindable
    public String getAh40e() {
        return ah40e;
    }

    public void setAh40e(String ah40e) {
        if (this.ah40e.equals(ah40e)) return;     // For all checkboxes
        this.ah40e = ah40e;
        notifyPropertyChanged(BR.ah40e);
    }

    @Bindable
    public String getAh40f() {
        return ah40f;
    }

    public void setAh40f(String ah40f) {
        if (this.ah40f.equals(ah40f)) return;     // For all checkboxes
        this.ah40f = ah40f;
        notifyPropertyChanged(BR.ah40f);
    }

    @Bindable
    public String getAh40g() {
        return ah40g;
    }

    public void setAh40g(String ah40g) {
        if (this.ah40g.equals(ah40g)) return;     // For all checkboxes
        this.ah40g = ah40g;
        notifyPropertyChanged(BR.ah40g);
    }

    @Bindable
    public String getAh40h() {
        return ah40h;
    }

    public void setAh40h(String ah40h) {
        if (this.ah40h.equals(ah40h)) return;     // For all checkboxes
        this.ah40h = ah40h;
        notifyPropertyChanged(BR.ah40h);
    }

    @Bindable
    public String getAh40x() {
        return ah40x;
    }

    public void setAh40x(String ah40x) {
        if (this.ah40x.equals(ah40x)) return;     // For all checkboxes
        this.ah40x = ah40x;
        setAh40xx(ah40x.equals("96") ? this.ah40xx : "");
        notifyPropertyChanged(BR.ah40x);
    }

    @Bindable
    public String getAh40xx() {
        return ah40xx;
    }

    public void setAh40xx(String ah40xx) {
        this.ah40xx = ah40xx;
        notifyPropertyChanged(BR.ah40xx);
    }

    @Bindable
    public String getAh40aa() {
        return ah40aa;
    }

    public void setAh40aa(String ah40aa) {
        this.ah40aa = ah40aa;
        notifyPropertyChanged(BR.ah40aa);
    }

    @Bindable
    public String getAh40aaa() {
        return ah40aaa;
    }

    public void setAh40aaa(String ah40aaa) {
        if (this.ah40aaa.equals(ah40aaa)) return;     // For all checkboxes
        this.ah40aaa = ah40aaa;
        notifyPropertyChanged(BR.ah40aaa);
    }

    @Bindable
    public String getAh40aab() {
        return ah40aab;
    }

    public void setAh40aab(String ah40aab) {
        if (this.ah40aab.equals(ah40aab)) return;     // For all checkboxes
        this.ah40aab = ah40aab;
        notifyPropertyChanged(BR.ah40aab);
    }

    @Bindable
    public String getAh40aac() {
        return ah40aac;
    }

    public void setAh40aac(String ah40aac) {
        if (this.ah40aac.equals(ah40aac)) return;     // For all checkboxes
        this.ah40aac = ah40aac;
        notifyPropertyChanged(BR.ah40aac);
    }

    @Bindable
    public String getAh40aad() {
        return ah40aad;
    }

    public void setAh40aad(String ah40aad) {
        if (this.ah40aad.equals(ah40aad)) return;     // For all checkboxes
        this.ah40aad = ah40aad;
        notifyPropertyChanged(BR.ah40aad);
    }

    @Bindable
    public String getAh40aae() {
        return ah40aae;
    }

    public void setAh40aae(String ah40aae) {
        if (this.ah40aae.equals(ah40aae)) return;     // For all checkboxes
        this.ah40aae = ah40aae;
        notifyPropertyChanged(BR.ah40aae);
    }

    @Bindable
    public String getAh40aaf() {
        return ah40aaf;
    }

    public void setAh40aaf(String ah40aaf) {
        if (this.ah40aaf.equals(ah40aaf)) return;     // For all checkboxes
        this.ah40aaf = ah40aaf;
        notifyPropertyChanged(BR.ah40aaf);
    }

    @Bindable
    public String getAh40aag() {
        return ah40aag;
    }

    public void setAh40aag(String ah40aag) {
        if (this.ah40aag.equals(ah40aag)) return;     // For all checkboxes
        this.ah40aag = ah40aag;
        notifyPropertyChanged(BR.ah40aag);
    }

    @Bindable
    public String getAh40aah() {
        return ah40aah;
    }

    public void setAh40aah(String ah40aah) {
        if (this.ah40aah.equals(ah40aah)) return;     // For all checkboxes
        this.ah40aah = ah40aah;
        notifyPropertyChanged(BR.ah40aah);
    }

    @Bindable
    public String getAh40aax() {
        return ah40aax;
    }

    public void setAh40aax(String ah40aax) {
        if (this.ah40aax.equals(ah40aax)) return;     // For all checkboxes
        this.ah40aax = ah40aax;
        setAh40aaxx(ah40aax.equals("96") ? this.ah40aaxx : "");
        notifyPropertyChanged(BR.ah40aax);
    }

    @Bindable
    public String getAh40aaxx() {
        return ah40aaxx;
    }

    public void setAh40aaxx(String ah40aaxx) {
        this.ah40aaxx = ah40aaxx;
        notifyPropertyChanged(BR.ah40aaxx);
    }

    @Bindable
    public String getAh41() {
        return ah41;
    }

    public void setAh41(String ah41) {
        this.ah41 = ah41;
        setAh42(ah41.equals("1") ? this.ah42 : "");
        notifyPropertyChanged(BR.ah41);
    }

    @Bindable
    public String getAh42() {
        return ah42;
    }

    public void setAh42(String ah42) {
        this.ah42 = ah42;
        setAh43(ah42.equals(2) ? "" : this.ah43);
        setAh44a(ah42.equals("2") ? "" : this.ah44a);
        setAh44b(ah42.equals("2") ? "" : this.ah44b);
        setAh44c(ah42.equals("2") ? "" : this.ah44c);
        setAh44d(ah42.equals("2") ? "" : this.ah44d);
        setAh44e(ah42.equals("2") ? "" : this.ah44e);
        setAh44f(ah42.equals("2") ? "" : this.ah44f);
        setAh44g(ah42.equals("2") ? "" : this.ah44g);
        setAh44h(ah42.equals("2") ? "" : this.ah44h);
        setAh44i(ah42.equals("2") ? "" : this.ah44i);
        notifyPropertyChanged(BR.ah42);
    }

    @Bindable
    public String getAh43() {
        return ah43;
    }

    public void setAh43(String ah43) {
        this.ah43 = ah43;
        setAh44a(ah43.equals("1") ? this.ah44a : "");
        setAh44b(ah43.equals("1") ? this.ah44b : "");
        setAh44c(ah43.equals("1") ? this.ah44c : "");
        setAh44d(ah43.equals("1") ? this.ah44d : "");
        setAh44e(ah43.equals("1") ? this.ah44e : "");
        setAh44f(ah43.equals("1") ? this.ah44f : "");
        setAh44g(ah43.equals("1") ? this.ah44g : "");
        setAh44h(ah43.equals("1") ? this.ah44h : "");
        setAh44i(ah43.equals("1") ? this.ah44i : "");
        notifyPropertyChanged(BR.ah43);
    }

    @Bindable
    public String getAh44() {
        return ah44;
    }

    public void setAh44(String ah44) {
        this.ah44 = ah44;
        notifyPropertyChanged(BR.ah44);
    }

    @Bindable
    public String getAh44a() {
        return ah44a;
    }

    public void setAh44a(String ah44a) {
        if (this.ah44a.equals(ah44a)) return;     // For all checkboxes
        this.ah44a = ah44a;
        notifyPropertyChanged(BR.ah44a);
    }

    @Bindable
    public String getAh44b() {
        return ah44b;
    }

    public void setAh44b(String ah44b) {
        if (this.ah44b.equals(ah44b)) return;     // For all checkboxes
        this.ah44b = ah44b;
        notifyPropertyChanged(BR.ah44b);
    }

    @Bindable
    public String getAh44c() {
        return ah44c;
    }

    public void setAh44c(String ah44c) {
        if (this.ah44c.equals(ah44c)) return;     // For all checkboxes
        this.ah44c = ah44c;
        notifyPropertyChanged(BR.ah44c);
    }

    @Bindable
    public String getAh44d() {
        return ah44d;
    }

    public void setAh44d(String ah44d) {
        if (this.ah44d.equals(ah44d)) return;     // For all checkboxes
        this.ah44d = ah44d;
        notifyPropertyChanged(BR.ah44d);
    }

    @Bindable
    public String getAh44e() {
        return ah44e;
    }

    public void setAh44e(String ah44e) {
        if (this.ah44e.equals(ah44e)) return;     // For all checkboxes
        this.ah44e = ah44e;
        notifyPropertyChanged(BR.ah44e);
    }

    @Bindable
    public String getAh44f() {
        return ah44f;
    }

    public void setAh44f(String ah44f) {
        if (this.ah44f.equals(ah44f)) return;     // For all checkboxes
        this.ah44f = ah44f;
        notifyPropertyChanged(BR.ah44f);
    }

    @Bindable
    public String getAh44g() {
        return ah44g;
    }

    public void setAh44g(String ah44g) {
        if (this.ah44g.equals(ah44g)) return;     // For all checkboxes
        this.ah44g = ah44g;
        notifyPropertyChanged(BR.ah44g);
    }

    @Bindable
    public String getAh44h() {
        return ah44h;
    }

    public void setAh44h(String ah44h) {
        if (this.ah44h.equals(ah44h)) return;     // For all checkboxes
        this.ah44h = ah44h;
        notifyPropertyChanged(BR.ah44h);
    }

    @Bindable
    public String getAh44i() {
        return ah44i;
    }

    public void setAh44i(String ah44i) {
        if (this.ah44i.equals(ah44i)) return;     // For all checkboxes
        this.ah44i = ah44i;
        notifyPropertyChanged(BR.ah44i);
    }

    @Bindable
    public String getAh45() {
        return ah45;
    }

    public void setAh45(String ah45) {
        this.ah45 = ah45;
        setAh46(ah45.equals("1") ? this.ah46 : "");
        setAh47d(ah45.equals("1") ? this.ah47d : "");
        setAh48(ah45.equals("1") ? this.ah48 : "");
        notifyPropertyChanged(BR.ah45);
    }

    @Bindable
    public String getAh46() {
        return ah46;
    }

    public void setAh46(String ah46) {
        this.ah46 = ah46;
        notifyPropertyChanged(BR.ah46);
    }

    @Bindable
    public String getAh47d() {
        return ah47d;
    }

    public void setAh47d(String ah47d) {
        this.ah47d = ah47d;
        notifyPropertyChanged(BR.ah47d);
    }

    @Bindable
    public String getAh48() {
        return ah48;
    }

    public void setAh48(String ah48) {
        this.ah48 = ah48;
        notifyPropertyChanged(BR.ah48);
    }

    @Bindable
    public String getAh49a() {
        return ah49a;
    }

    public void setAh49a(String ah49a) {
        if (this.ah49a.equals(ah49a)) return;
        this.ah49a = ah49a;
        setAh49ax(ah49a.equals("1") ? this.ah49ax : "");
        notifyPropertyChanged(BR.ah49a);
    }

    @Bindable
    public String getAh49ax() {
        return ah49ax;
    }

    public void setAh49ax(String ah49ax) {
        this.ah49ax = ah49ax;
        notifyPropertyChanged(BR.ah49ax);
    }

    @Bindable
    public String getAh49b() {
        return ah49b;
    }

    public void setAh49b(String ah49b) {
        if (this.ah49b.equals(ah49b)) return;
        this.ah49b = ah49b;
        setAh49bx(ah49b.equals("2") ? this.ah49bx : "");
        notifyPropertyChanged(BR.ah49b);
    }

    @Bindable
    public String getAh49bx() {
        return ah49bx;
    }

    public void setAh49bx(String ah49bx) {
        this.ah49bx = ah49bx;
        notifyPropertyChanged(BR.ah49bx);
    }

    @Bindable
    public String getAh49c() {
        return ah49c;
    }

    public void setAh49c(String ah49c) {
        if (this.ah49c.equals(ah49c)) return;
        this.ah49c = ah49c;
        setAh49a(ah49c.equals("98") ? "" : this.ah49a);
        setAh49b(ah49c.equals("98") ? "" : this.ah49b);
        notifyPropertyChanged(BR.ah49c);
    }

    @Bindable
    public String getAh50() {
        return ah50;
    }

    public void setAh50(String ah50) {
        this.ah50 = ah50;
        notifyPropertyChanged(BR.ah50);
    }

    @Bindable
    public String getAh50aaa() {
        return ah50aaa;
    }

    public void setAh50aaa(String ah50aaa) {
        this.ah50aaa = ah50aaa;
        notifyPropertyChanged(BR.ah50aaa);
    }

    @Bindable
    public String getAh50aab() {
        return ah50aab;
    }

    public void setAh50aab(String ah50aab) {
        this.ah50aab = ah50aab;
        notifyPropertyChanged(BR.ah50aab);
    }

    @Bindable
    public String getAh51() {
        return ah51;
    }

    public void setAh51(String ah51) {
        this.ah51 = ah51;
        notifyPropertyChanged(BR.ah51);
    }

    @Bindable
    public String getAh52a() {
        return ah52a;
    }

    public void setAh52a(String ah52a) {
        this.ah52a = ah52a;
        notifyPropertyChanged(BR.ah52a);
    }

    @Bindable
    public String getAh53() {
        return ah53;
    }

    public void setAh53(String ah53) {
        this.ah53 = ah53;
        notifyPropertyChanged(BR.ah53);
    }

    @Bindable
    public String getAh54() {
        return ah54;
    }

    public void setAh54(String ah54) {
        this.ah54 = ah54;
        notifyPropertyChanged(BR.ah54);
    }

    @Bindable
    public String getAh54ax() {
        return ah54ax;
    }

    public void setAh54ax(String ah54ax) {
        this.ah54ax = ah54ax;
        notifyPropertyChanged(BR.ah54ax);
    }

    @Bindable
    public String getAh55() {
        return ah55;
    }

    public void setAh55(String ah55) {
        this.ah55 = ah55;
        notifyPropertyChanged(BR.ah55);
    }

    @Bindable
    public String getAh56a() {
        return ah56a;
    }

    public void setAh56a(String ah56a) {
        this.ah56a = ah56a;
        notifyPropertyChanged(BR.ah56a);
    }

    @Bindable
    public String getAh57() {
        return ah57;
    }

    public void setAh57(String ah57) {
        this.ah57 = ah57;
        notifyPropertyChanged(BR.ah57);
    }

    @Bindable
    public String getAh57ax() {
        return ah57ax;
    }

    public void setAh57ax(String ah57ax) {
        this.ah57ax = ah57ax;
        notifyPropertyChanged(BR.ah57ax);
    }

    @Bindable
    public String getAh58a() {
        return ah58a;
    }

    public void setAh58a(String ah58a) {
        this.ah58a = ah58a;
        notifyPropertyChanged(BR.ah58a);
    }

    @Bindable
    public String getAh59a() {
        return ah59a;
    }

    public void setAh59a(String ah59a) {
        this.ah59a = ah59a;
        notifyPropertyChanged(BR.ah59a);
    }

    @Bindable
    public String getAh59b() {
        return ah59b;
    }

    public void setAh59b(String ah59b) {
        this.ah59b = ah59b;
        notifyPropertyChanged(BR.ah59b);
    }

    @Bindable
    public String getAh59c() {
        return ah59c;
    }

    public void setAh59c(String ah59c) {
        this.ah59c = ah59c;
        notifyPropertyChanged(BR.ah59c);
    }

    @Bindable
    public String getAh59d() {
        return ah59d;
    }

    public void setAh59d(String ah59d) {
        this.ah59d = ah59d;
        setAh59a(ah59d.equals("98") ? "" : this.ah59a);
        setAh59b(ah59d.equals("98") ? "" : this.ah59b);
        setAh59c(ah59d.equals("98") ? "" : this.ah59c);
        notifyPropertyChanged(BR.ah59d);
    }

    @Bindable
    public String getAh60a() {
        return ah60a;
    }

    public void setAh60a(String ah60a) {
        this.ah60a = ah60a;
        notifyPropertyChanged(BR.ah60a);
    }


    public Adolescent Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_FMUID));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_MUID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_INDEXED));
        this.name = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SYNC_DATE));

        sAH1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH1)));
        sAH2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH2)));
        sAH3Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH3)));
        sAH4Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH4)));
        sAH5Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH5)));
        sAH6Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH6)));
        sAH7Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(AdolescentTable.COLUMN_SAH7)));

        return this;
    }

    public void sAH1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah1 = json.getString("ah1");
            this.ah2 = json.getString("ah2");
            this.ah3 = json.getString("ah3");
            this.ah396x = json.getString("ah396x");
            this.ah4a = json.getString("ah4a");
            this.ah5 = json.getString("ah5");
            this.ah6 = json.getString("ah6");
            this.ah7a = json.getString("ah7a");
            this.ah7b = json.getString("ah7b");
            this.ah7c = json.getString("ah7c");
            this.ah7d = json.getString("ah7d");
            this.ah7e = json.getString("ah7e");
            this.ah7f = json.getString("ah7f");
            this.ah7g = json.getString("ah7g");
            this.ah7h = json.getString("ah7h");
            this.ah796 = json.getString("ah796");
            this.ah796x = json.getString("ah796x");
        }
    }

    public void sAH2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah8 = json.getString("ah8");
            this.ah9 = json.getString("ah9");
            this.ah10 = json.getString("ah10");
            this.ah11a = json.getString("ah11a");
            this.ah12 = json.getString("ah12");
            this.ah13 = json.getString("ah13");
            this.ah13aa = json.getString("ah13aa");
            this.ah13ab = json.getString("ah13ab");
        }
    }

    public void sAH3Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH3Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah14 = json.getString("ah14");
            this.ah15 = json.getString("ah15");
            this.ah16 = json.getString("ah16");
            this.ah17 = json.getString("ah17");
            this.ah18 = json.getString("ah18");
            this.ah19 = json.getString("ah19");
            this.ah20 = json.getString("ah20");
            this.ah21 = json.getString("ah21");
            this.ah2102 = json.getString("ah2102");
            this.ah2201 = json.getString("ah2201");
            this.ah2202 = json.getString("ah2202");
            this.ah2203 = json.getString("ah2203");
            this.ah2296 = json.getString("ah2296");
            this.ah2296x = json.getString("ah2296x");
            this.ah23 = json.getString("ah23");
            this.ah2301x = json.getString("ah2301x");
            this.ah2302x = json.getString("ah2302x");
            this.ah2303x = json.getString("ah2303x");
            this.ah2401 = json.getString("ah2401");
            this.ah2402 = json.getString("ah2402");
            this.ah2403 = json.getString("ah2403");
            this.ah2404 = json.getString("ah2404");
            this.ah2405 = json.getString("ah2405");
            this.ah2406 = json.getString("ah2406");
            this.ah2407 = json.getString("ah2407");
            this.ah2408 = json.getString("ah2408");
            this.ah2409 = json.getString("ah2409");
            this.ah2410 = json.getString("ah2410");
            this.ah2411 = json.getString("ah2411");
            this.ah24a = json.getString("ah24a");
            this.ah25 = json.getString("ah25");
            this.ah26 = json.getString("ah26");
            this.ah2696x = json.getString("ah2696x");
            this.ah27 = json.getString("ah27");
            this.ah28 = json.getString("ah28");
            this.ah29 = json.getString("ah29");
            this.ah3001 = json.getString("ah3001");
            this.ah3002 = json.getString("ah3002");
            this.ah3003 = json.getString("ah3003");
            this.ah31 = json.getString("ah31");
        }
    }

    public void sAH4Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH4Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah3201 = json.getString("ah3201");
            this.ah3202 = json.getString("ah3202");
            this.ah3203 = json.getString("ah3203");
            this.ah3204 = json.getString("ah3204");
            this.ah3205 = json.getString("ah3205");
        }
    }

    public void sAH5Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH5Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah33a = json.getString("ah33a");
            this.ah33b = json.getString("ah33b");
            this.ah33c = json.getString("ah33c");
            this.ah3398 = json.getString("ah3398");
            this.ah34 = json.getString("ah34");
            this.ah35a = json.getString("ah35a");
            this.ah35b = json.getString("ah35b");
            this.ah35c = json.getString("ah35c");
            this.ah35d = json.getString("ah35d");
            this.ah35e = json.getString("ah35e");
            this.ah35f = json.getString("ah35f");
            this.ah35g = json.getString("ah35g");
            this.ah35h = json.getString("ah35h");
            this.ah35i = json.getString("ah35i");
            this.ah35j = json.getString("ah35j");
            this.ah36 = json.getString("ah36");
            this.ah36ax = json.getString("ah36ax");
        }
    }

    public void sAH6Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH6Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah3701 = json.getString("ah3701");
            this.ah3701a = json.getString("ah3701a");
            this.ah3701b = json.getString("ah3701b");
            this.ah3701c = json.getString("ah3701c");
            this.ah3701d = json.getString("ah3701d");
            this.ah3701e = json.getString("ah3701e");
            this.ah3701f = json.getString("ah3701f");
            this.ah3701x = json.getString("ah3701x");
            this.ah3701xx = json.getString("ah3701xx");
            this.ah3702 = json.getString("ah3702");
            this.ah3702a = json.getString("ah3702a");
            this.ah3702b = json.getString("ah3702b");
            this.ah3702c = json.getString("ah3702c");
            this.ah3702e = json.getString("ah3702e");
            this.ah3702d = json.getString("ah3702d");
            this.ah3702f = json.getString("ah3702f");
            this.ah3702x = json.getString("ah3702x");
            this.ah3702xx = json.getString("ah3702xx");
            this.ah3703 = json.getString("ah3703");
            this.ah3703a = json.getString("ah3703a");
            this.ah3703b = json.getString("ah3703b");
            this.ah3703c = json.getString("ah3703c");
            this.ah3703e = json.getString("ah3703e");
            this.ah3703d = json.getString("ah3703d");
            this.ah3703f = json.getString("ah3703f");
            this.ah3703x = json.getString("ah3703x");
            this.ah3703xx = json.getString("ah3703xx");
            this.ah3704 = json.getString("ah3704");
            this.ah3704a = json.getString("ah3704a");
            this.ah3704b = json.getString("ah3704b");
            this.ah3704c = json.getString("ah3704c");
            this.ah3704e = json.getString("ah3704e");
            this.ah3704d = json.getString("ah3704d");
            this.ah3704f = json.getString("ah3704f");
            this.ah3704x = json.getString("ah3704x");
            this.ah3704xx = json.getString("ah3704xx");
            this.ah3705 = json.getString("ah3705");
            this.ah3705a = json.getString("ah3705a");
            this.ah3705b = json.getString("ah3705b");
            this.ah3705c = json.getString("ah3705c");
            this.ah3705e = json.getString("ah3705e");
            this.ah3705d = json.getString("ah3705d");
            this.ah3705f = json.getString("ah3705f");
            this.ah3705x = json.getString("ah3705x");
            this.ah3705xx = json.getString("ah3705xx");
            this.ah3706 = json.getString("ah3706");
            this.ah3706a = json.getString("ah3706a");
            this.ah3706b = json.getString("ah3706b");
            this.ah3706c = json.getString("ah3706c");
            this.ah3706e = json.getString("ah3706e");
            this.ah3706d = json.getString("ah3706d");
            this.ah3706f = json.getString("ah3706f");
            this.ah3706x = json.getString("ah3706x");
            this.ah3706xx = json.getString("ah3706xx");
            this.ah37aa = json.getString("ah37aa");
            this.ah37ab = json.getString("ah37ab");
            this.ah37ac = json.getString("ah37ac");
            this.ah38 = json.getString("ah38");
            this.ah38aa = json.getString("ah38aa");
            this.ah39 = json.getString("ah39");
            this.ah39a = json.getString("ah39a");
            this.ah39b = json.getString("ah39b");
            this.ah39c = json.getString("ah39c");
            this.ah39d = json.getString("ah39d");
            this.ah39x = json.getString("ah39x");
            this.ah39xx = json.getString("ah39xx");
            this.ah40 = json.getString("ah40");
            this.ah40a = json.getString("ah40a");
            this.ah40b = json.getString("ah40b");
            this.ah40c = json.getString("ah40c");
            this.ah40d = json.getString("ah40d");
            this.ah40e = json.getString("ah40e");
            this.ah40f = json.getString("ah40f");
            this.ah40g = json.getString("ah40g");
            this.ah40h = json.getString("ah40h");
            this.ah40x = json.getString("ah40x");
            this.ah40xx = json.getString("ah40xx");
            this.ah40aa = json.getString("ah40aa");
            this.ah40aaa = json.getString("ah40aaa");
            this.ah40aab = json.getString("ah40aab");
            this.ah40aac = json.getString("ah40aac");
            this.ah40aad = json.getString("ah40aad");
            this.ah40aae = json.getString("ah40aae");
            this.ah40aaf = json.getString("ah40aaf");
            this.ah40aag = json.getString("ah40aag");
            this.ah40aah = json.getString("ah40aah");
            this.ah40aax = json.getString("ah40aax");
            this.ah40aaxx = json.getString("ah40aaxx");
            this.ah41 = json.getString("ah41");
            this.ah42 = json.getString("ah42");
            this.ah43 = json.getString("ah43");
            this.ah44 = json.getString("ah44");
            this.ah44a = json.getString("ah44a");
            this.ah44b = json.getString("ah44b");
            this.ah44c = json.getString("ah44c");
            this.ah44d = json.getString("ah44d");
            this.ah44e = json.getString("ah44e");
            this.ah44f = json.getString("ah44f");
            this.ah44g = json.getString("ah44g");
            this.ah44h = json.getString("ah44h");
            this.ah44i = json.getString("ah44i");
            this.ah45 = json.getString("ah45");
            this.ah46 = json.getString("ah46");
            this.ah47d = json.getString("ah47d");
            this.ah48 = json.getString("ah48");
        }
    }

    public void sAH7Hydrate(String string) throws JSONException {
        Log.d(TAG, "sAH7Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.ah49a = json.getString("ah49a");
            this.ah49b = json.getString("ah49b");
            this.ah49c = json.getString("ah49c");
            this.ah49ax = json.getString("ah49ax");
            this.ah49bx = json.getString("ah49bx");

            this.ah50 = json.getString("ah50");
            this.ah50aaa = json.getString("ah50aaa");
            this.ah50aab = json.getString("ah50aab");
            this.ah51 = json.getString("ah51");
            this.ah52a = json.getString("ah52a");
            this.ah53 = json.getString("ah53");
            this.ah54 = json.getString("ah54");
            this.ah54ax = json.getString("ah54ax");
            this.ah55 = json.getString("ah55");
            this.ah56a = json.getString("ah56a");
            this.ah57 = json.getString("ah57");
            this.ah57ax = json.getString("ah57ax");
            this.ah58a = json.getString("ah58a");
            this.ah59a = json.getString("ah59a");
            this.ah59b = json.getString("ah59b");
            this.ah59c = json.getString("ah59c");
            this.ah59d = json.getString("ah59d");
            this.ah60a = json.getString("ah60a");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(AdolescentTable.COLUMN_ID, this.id);
        json.put(AdolescentTable.COLUMN_UID, this.uid);
        json.put(AdolescentTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(AdolescentTable.COLUMN_HHID, this.hhid);
        json.put(AdolescentTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(AdolescentTable.COLUMN_UUID, this.uuid);
        json.put(AdolescentTable.COLUMN_FMUID, this.fmuid);
        json.put(AdolescentTable.COLUMN_MUID, this.muid);
        json.put(AdolescentTable.COLUMN_INDEXED, this.indexed);
        json.put(AdolescentTable.COLUMN_NAME, this.name);
        json.put(AdolescentTable.COLUMN_SNO, this.sno);
        json.put(AdolescentTable.COLUMN_USERNAME, this.userName);
        json.put(AdolescentTable.COLUMN_SYSDATE, this.sysDate);
        json.put(AdolescentTable.COLUMN_DEVICEID, this.deviceId);
        json.put(AdolescentTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(AdolescentTable.COLUMN_ISTATUS, this.iStatus);
        json.put(AdolescentTable.COLUMN_SYNCED, this.synced);
        json.put(AdolescentTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(AdolescentTable.COLUMN_APPVERSION, this.appver);
        json.put(AdolescentTable.COLUMN_SAH1, new JSONObject(sAH1toString()));
        json.put(AdolescentTable.COLUMN_SAH2, new JSONObject(sAH2toString()));
        json.put(AdolescentTable.COLUMN_SAH3, new JSONObject(sAH3toString()));
        json.put(AdolescentTable.COLUMN_SAH4, new JSONObject(sAH4toString()));
        json.put(AdolescentTable.COLUMN_SAH5, new JSONObject(sAH5toString()));
        json.put(AdolescentTable.COLUMN_SAH6, new JSONObject(sAH6toString()));
        json.put(AdolescentTable.COLUMN_SAH7, new JSONObject(sAH7toString()));

        return json;
    }

    public String sAH1toString() throws JSONException {
        Log.d(TAG, "sAH1toString: ");
        JSONObject json = new JSONObject();
        json.put("ah1", ah1)
                .put("ah2", ah2)
                .put("ah3", ah3)
                .put("ah396x", ah396x)
                .put("ah4a", ah4a)
                .put("ah5", ah5)
                .put("ah6", ah6)
                .put("ah7a", ah7a)
                .put("ah7b", ah7b)
                .put("ah7c", ah7c)
                .put("ah7d", ah7d)
                .put("ah7e", ah7e)
                .put("ah7f", ah7f)
                .put("ah7g", ah7g)
                .put("ah7h", ah7h)
                .put("ah796", ah796)
                .put("ah796x", ah796x);
        return json.toString();
    }

    public String sAH2toString() throws JSONException {
        Log.d(TAG, "sAH2toString: ");
        JSONObject json = new JSONObject();
        json.put("ah8", ah8)
                .put("ah9", ah9)
                .put("ah10", ah10)
                .put("ah11a", ah11a)
                .put("ah12", ah12)
                .put("ah13", ah13)
                .put("ah13aa", ah13aa)
                .put("ah13ab", ah13ab);
        return json.toString();
    }

    public String sAH3toString() throws JSONException {
        Log.d(TAG, "sAH3toString: ");
        JSONObject json = new JSONObject();
        json.put("ah14", ah14)
                .put("ah15", ah15)
                .put("ah16", ah16)
                .put("ah17", ah17)
                .put("ah18", ah18)
                .put("ah19", ah19)
                .put("ah20", ah20)
                .put("ah21", ah21)
                .put("ah2102", ah2102)
                .put("ah2201", ah2201)
                .put("ah2202", ah2202)
                .put("ah2203", ah2203)
                .put("ah2296", ah2296)
                .put("ah2296x", ah2296x)
                .put("ah23", ah23)
                .put("ah2301x", ah2301x)
                .put("ah2302x", ah2302x)
                .put("ah2303x", ah2303x)
                .put("ah2401", ah2401)
                .put("ah2402", ah2402)
                .put("ah2403", ah2403)
                .put("ah2404", ah2404)
                .put("ah2405", ah2405)
                .put("ah2406", ah2406)
                .put("ah2407", ah2407)
                .put("ah2408", ah2408)
                .put("ah2409", ah2409)
                .put("ah2410", ah2410)
                .put("ah2411", ah2411)
                .put("ah24a", ah24a)
                .put("ah25", ah25)
                .put("ah26", ah26)
                .put("ah2696x", ah2696x)
                .put("ah27", ah27)
                .put("ah28", ah28)
                .put("ah29", ah29)
                .put("ah3001", ah3001)
                .put("ah3002", ah3002)
                .put("ah3003", ah3003)
                .put("ah31", ah31);
        return json.toString();
    }

    public String sAH4toString() throws JSONException {
        Log.d(TAG, "sAH4toString: ");
        JSONObject json = new JSONObject();
        json.put("ah3201", ah3201)
                .put("ah3202", ah3202)
                .put("ah3203", ah3203)
                .put("ah3204", ah3204)
                .put("ah3205", ah3205);
        return json.toString();
    }

    public String sAH5toString() throws JSONException {
        Log.d(TAG, "sAH5toString: ");
        JSONObject json = new JSONObject();
        json.put("ah33a", ah33a)
                .put("ah33b", ah33b)
                .put("ah33c", ah33c)
                .put("ah3398", ah3398)
                .put("ah34", ah34)
                .put("ah35a", ah35a)
                .put("ah35b", ah35b)
                .put("ah35c", ah35c)
                .put("ah35d", ah35d)
                .put("ah35e", ah35e)
                .put("ah35f", ah35f)
                .put("ah35g", ah35g)
                .put("ah35h", ah35h)
                .put("ah35i", ah35i)
                .put("ah35j", ah35j)
                .put("ah36", ah36)
                .put("ah36ax", ah36ax);
        return json.toString();
    }

    public String sAH6toString() throws JSONException {
        Log.d(TAG, "sAH6toString: ");
        JSONObject json = new JSONObject();
        json.put("ah3701", ah3701)
                .put("ah3701a", ah3701a)
                .put("ah3701b", ah3701b)
                .put("ah3701c", ah3701c)
                .put("ah3701d", ah3701d)
                .put("ah3701e", ah3701e)
                .put("ah3701f", ah3701f)
                .put("ah3701x", ah3701x)
                .put("ah3701xx", ah3701xx)
                .put("ah3702", ah3702)
                .put("ah3702a", ah3702a)
                .put("ah3702b", ah3702b)
                .put("ah3702c", ah3702c)
                .put("ah3702e", ah3702e)
                .put("ah3702d", ah3702d)
                .put("ah3702f", ah3702f)
                .put("ah3702x", ah3702x)
                .put("ah3702xx", ah3702xx)
                .put("ah3703", ah3703)
                .put("ah3703a", ah3703a)
                .put("ah3703b", ah3703b)
                .put("ah3703c", ah3703c)
                .put("ah3703e", ah3703e)
                .put("ah3703d", ah3703d)
                .put("ah3703f", ah3703f)
                .put("ah3703x", ah3703x)
                .put("ah3703xx", ah3703xx)
                .put("ah3704", ah3704)
                .put("ah3704a", ah3704a)
                .put("ah3704b", ah3704b)
                .put("ah3704c", ah3704c)
                .put("ah3704e", ah3704e)
                .put("ah3704d", ah3704d)
                .put("ah3704f", ah3704f)
                .put("ah3704x", ah3704x)
                .put("ah3704xx", ah3704xx)
                .put("ah3705", ah3705)
                .put("ah3705a", ah3705a)
                .put("ah3705b", ah3705b)
                .put("ah3705c", ah3705c)
                .put("ah3705e", ah3705e)
                .put("ah3705d", ah3705d)
                .put("ah3705f", ah3705f)
                .put("ah3705x", ah3705x)
                .put("ah3705xx", ah3705xx)
                .put("ah3706", ah3706)
                .put("ah3706a", ah3706a)
                .put("ah3706b", ah3706b)
                .put("ah3706c", ah3706c)
                .put("ah3706e", ah3706e)
                .put("ah3706d", ah3706d)
                .put("ah3706f", ah3706f)
                .put("ah3706x", ah3706x)
                .put("ah3706xx", ah3706xx)
                .put("ah37aa", ah37aa)
                .put("ah37ab", ah37ab)
                .put("ah37ac", ah37ac)
                .put("ah38", ah38)
                .put("ah38aa", ah38aa)
                .put("ah39", ah39)
                .put("ah39a", ah39a)
                .put("ah39b", ah39b)
                .put("ah39c", ah39c)
                .put("ah39d", ah39d)
                .put("ah39x", ah39x)
                .put("ah39xx", ah39xx)
                .put("ah40", ah40)
                .put("ah40a", ah40a)
                .put("ah40b", ah40b)
                .put("ah40c", ah40c)
                .put("ah40d", ah40d)
                .put("ah40e", ah40e)
                .put("ah40f", ah40f)
                .put("ah40g", ah40g)
                .put("ah40h", ah40h)
                .put("ah40x", ah40x)
                .put("ah40xx", ah40xx)
                .put("ah40aa", ah40aa)
                .put("ah40aaa", ah40aaa)
                .put("ah40aab", ah40aab)
                .put("ah40aac", ah40aac)
                .put("ah40aad", ah40aad)
                .put("ah40aae", ah40aae)
                .put("ah40aaf", ah40aaf)
                .put("ah40aag", ah40aag)
                .put("ah40aah", ah40aah)
                .put("ah40aax", ah40aax)
                .put("ah40aaxx", ah40aaxx)
                .put("ah41", ah41)
                .put("ah42", ah42)
                .put("ah43", ah43)
                .put("ah44", ah44)
                .put("ah44a", ah44a)
                .put("ah44b", ah44b)
                .put("ah44c", ah44c)
                .put("ah44d", ah44d)
                .put("ah44e", ah44e)
                .put("ah44f", ah44f)
                .put("ah44g", ah44g)
                .put("ah44h", ah44h)
                .put("ah44i", ah44i)
                .put("ah45", ah45)
                .put("ah46", ah46)
                .put("ah47d", ah47d)
                .put("ah48", ah48);
        return json.toString();
    }

    public String sAH7toString() throws JSONException {
        Log.d(TAG, "sAH7toString: ");
        JSONObject json = new JSONObject();
        json.put("ah49a", ah49a)
                .put("ah49b", ah49b)
                .put("ah49c", ah49c)
                .put("ah49ax", ah49ax)
                .put("ah49bx", ah49bx)
                .put("ah50", ah50)
                .put("ah50aaa", ah50aaa)
                .put("ah50aab", ah50aab)
                .put("ah51", ah51)
                .put("ah52a", ah52a)
                .put("ah53", ah53)
                .put("ah54", ah54)
                .put("ah54ax", ah54ax)
                .put("ah55", ah55)
                .put("ah56a", ah56a)
                .put("ah57", ah57)
                .put("ah57ax", ah57ax)
                .put("ah58a", ah58a)
                .put("ah59a", ah59a)
                .put("ah59b", ah59b)
                .put("ah59c", ah59c)
                .put("ah59d", ah59d)
                .put("ah60a", ah60a);
        return json.toString();
    }

}