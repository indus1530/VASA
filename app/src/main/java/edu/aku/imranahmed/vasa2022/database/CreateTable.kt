package edu.aku.imranahmed.vasa2022.database


import edu.aku.imranahmed.vasa2022.contracts.TableContracts.*


object CreateTable {


    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_CLUSTER_CODE + " TEXT,"
            + FormsTable.COLUMN_HHID + " TEXT,"
            + FormsTable.COLUMN_SNO + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNC_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_SA + " TEXT,"
            + FormsTable.COLUMN_SM + " TEXT,"
            + FormsTable.COLUMN_SN + " TEXT,"
            + FormsTable.COLUMN_SO + " TEXT,"
            + FormsTable.COLUMN_SE2 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_EB_CODE + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNC_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_FAMILYMEMBERS = ("CREATE TABLE "
            + FamilyMembersTable.TABLE_NAME + "("
            + FamilyMembersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FamilyMembersTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FamilyMembersTable.COLUMN_UID + " TEXT,"
            + FamilyMembersTable.COLUMN_UUID + " TEXT,"
            + FamilyMembersTable.COLUMN_CLUSTER_CODE + " TEXT,"
            + FamilyMembersTable.COLUMN_HHID + " TEXT,"
            + FamilyMembersTable.COLUMN_SNO + " TEXT,"
            + FamilyMembersTable.COLUMN_AGE_MONTHS + " TEXT,"
            + FamilyMembersTable.COLUMN_MUID + " TEXT,"
            + FamilyMembersTable.COLUMN_MOTHER_PRESENT + " TEXT,"
            + FamilyMembersTable.COLUMN_USERNAME + " TEXT,"
            + FamilyMembersTable.COLUMN_SYSDATE + " TEXT,"
            + FamilyMembersTable.COLUMN_INDEXED + " TEXT,"
            + FamilyMembersTable.COLUMN_ISTATUS + " TEXT,"
            + FamilyMembersTable.COLUMN_DEVICEID + " TEXT,"
            + FamilyMembersTable.COLUMN_DEVICETAGID + " TEXT,"
            + FamilyMembersTable.COLUMN_SYNCED + " TEXT,"
            + FamilyMembersTable.COLUMN_SYNC_DATE + " TEXT,"
            + FamilyMembersTable.COLUMN_APPVERSION + " TEXT,"
            + FamilyMembersTable.COLUMN_SD + " TEXT"
            + " );"
            )


    const val SQL_CREATE_MWRA = ("CREATE TABLE "
            + MwraTable.TABLE_NAME + "("
            + MwraTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + MwraTable.COLUMN_PROJECT_NAME + " TEXT,"
            + MwraTable.COLUMN_UID + " TEXT,"
            + MwraTable.COLUMN_UUID + " TEXT,"
            + MwraTable.COLUMN_FMUID + " TEXT,"
            + MwraTable.COLUMN_SNO + " TEXT,"
            + MwraTable.COLUMN_PSU_CODE + " TEXT,"
            + MwraTable.COLUMN_HHID + " TEXT,"
            + MwraTable.COLUMN_USERNAME + " TEXT,"
            + MwraTable.COLUMN_SYSDATE + " TEXT,"
            + MwraTable.COLUMN_INDEXED + " TEXT,"
            + MwraTable.COLUMN_NAME + " TEXT,"
            + MwraTable.COLUMN_ISTATUS + " TEXT,"
            + MwraTable.COLUMN_DEVICEID + " TEXT,"
            + MwraTable.COLUMN_DEVICETAGID + " TEXT,"
            + MwraTable.COLUMN_SYNCED + " TEXT,"
            + MwraTable.COLUMN_SYNC_DATE + " TEXT,"
            + MwraTable.COLUMN_APPVERSION + " TEXT,"
            + MwraTable.COLUMN_SF1 + " TEXT,"
            + MwraTable.COLUMN_SF2 + " TEXT,"
            + MwraTable.COLUMN_SG + " TEXT,"
            + MwraTable.COLUMN_SH1A + " TEXT,"
            + MwraTable.COLUMN_SH1B + " TEXT,"
            + MwraTable.COLUMN_SH2 + " TEXT,"
            + MwraTable.COLUMN_SK + " TEXT,"
            + MwraTable.COLUMN_SL + " TEXT,"
            + MwraTable.COLUMN_UN + " TEXT"
            + " );"
            )

    const val SQL_CREATE_PREGNANCY_DETAILS = ("CREATE TABLE "
            + PregnancyDetailsTable.TABLE_NAME + "("
            + PregnancyDetailsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PregnancyDetailsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PregnancyDetailsTable.COLUMN_UID + " TEXT,"
            + PregnancyDetailsTable.COLUMN_UUID + " TEXT,"
            + PregnancyDetailsTable.COLUMN_FMUID + " TEXT,"
            + PregnancyDetailsTable.COLUMN_PSU_CODE + " TEXT,"
            + PregnancyDetailsTable.COLUMN_PSNO + " TEXT,"
            + PregnancyDetailsTable.COLUMN_MSNO + " TEXT,"
            + PregnancyDetailsTable.COLUMN_M_NAME + " TEXT,"
            + PregnancyDetailsTable.COLUMN_HHID + " TEXT,"
            + PregnancyDetailsTable.COLUMN_USERNAME + " TEXT,"
            + PregnancyDetailsTable.COLUMN_SYSDATE + " TEXT,"
            + PregnancyDetailsTable.COLUMN_ISTATUS + " TEXT,"
            + PregnancyDetailsTable.COLUMN_DEVICEID + " TEXT,"
            + PregnancyDetailsTable.COLUMN_DEVICETAGID + " TEXT,"
            + PregnancyDetailsTable.COLUMN_SYNCED + " TEXT,"
            + PregnancyDetailsTable.COLUMN_SYNC_DATE + " TEXT,"
            + PregnancyDetailsTable.COLUMN_APPVERSION + " TEXT,"
            + PregnancyDetailsTable.COLUMN_SE1 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_PREGNANCY_MASTER = ("CREATE TABLE "
            + PregnancyMasterTable.TABLE_NAME + "("
            + PregnancyMasterTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PregnancyMasterTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PregnancyMasterTable.COLUMN_UID + " TEXT,"
            + PregnancyMasterTable.COLUMN_UUID + " TEXT,"
            + PregnancyMasterTable.COLUMN_FMUID + " TEXT,"
            + PregnancyMasterTable.COLUMN_PSU_CODE + " TEXT,"
            + PregnancyMasterTable.COLUMN_SNO + " TEXT,"
            + PregnancyMasterTable.COLUMN_M_NAME + " TEXT,"
            + PregnancyMasterTable.COLUMN_HHID + " TEXT,"
            + PregnancyMasterTable.COLUMN_USERNAME + " TEXT,"
            + PregnancyMasterTable.COLUMN_SYSDATE + " TEXT,"
            + PregnancyMasterTable.COLUMN_ISTATUS + " TEXT,"
            + PregnancyMasterTable.COLUMN_DEVICEID + " TEXT,"
            + PregnancyMasterTable.COLUMN_DEVICETAGID + " TEXT,"
            + PregnancyMasterTable.COLUMN_SYNCED + " TEXT,"
            + PregnancyMasterTable.COLUMN_SYNC_DATE + " TEXT,"
            + PregnancyMasterTable.COLUMN_APPVERSION + " TEXT,"
            + PregnancyMasterTable.COLUMN_SE1 + " TEXT"

            + " );"
            )

    const val SQL_CREATE_MATERNAL_MORTIALITY = ("CREATE TABLE "
            + MaternalMortalityTable.TABLE_NAME + "("
            + MaternalMortalityTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + MaternalMortalityTable.COLUMN_PROJECT_NAME + " TEXT,"
            + MaternalMortalityTable.COLUMN_UID + " TEXT,"
            + MaternalMortalityTable.COLUMN_UUID + " TEXT,"
            + MaternalMortalityTable.COLUMN_PSU_CODE + " TEXT,"
            + MaternalMortalityTable.COLUMN_SNO + " TEXT,"
            + MaternalMortalityTable.COLUMN_HHID + " TEXT,"
            + MaternalMortalityTable.COLUMN_USERNAME + " TEXT,"
            + MaternalMortalityTable.COLUMN_SYSDATE + " TEXT,"
            + MaternalMortalityTable.COLUMN_ISTATUS + " TEXT,"
            + MaternalMortalityTable.COLUMN_DEVICEID + " TEXT,"
            + MaternalMortalityTable.COLUMN_DEVICETAGID + " TEXT,"
            + MaternalMortalityTable.COLUMN_SYNCED + " TEXT,"
            + MaternalMortalityTable.COLUMN_SYNC_DATE + " TEXT,"
            + MaternalMortalityTable.COLUMN_APPVERSION + " TEXT,"
            + MaternalMortalityTable.COLUMN_SE2 + " TEXT"

            + " );"
            )

    const val SQL_CREATE_CHILD = ("CREATE TABLE "
            + ChildTable.TABLE_NAME + "("
            + ChildTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ChildTable.COLUMN_PROJECT_NAME + " TEXT, "
            + ChildTable.COLUMN_UID + " TEXT, "
            + ChildTable.COLUMN_UUID + " TEXT, "
            + ChildTable.COLUMN_FMUID + " TEXT, "
            + ChildTable.COLUMN_MUID + " TEXT, "
            + ChildTable.COLUMN_PSU_CODE + " TEXT, "
            + ChildTable.COLUMN_HHID + " TEXT, "
            + ChildTable.COLUMN_SNO + " TEXT, "
            + ChildTable.COLUMN_USERNAME + " TEXT, "
            + ChildTable.COLUMN_SYSDATE + " TEXT, "
            + ChildTable.COLUMN_INDEXED + " TEXT, "
            + ChildTable.COLUMN_NAME + " TEXT, "
            + ChildTable.COLUMN_ISTATUS + " TEXT, "
            + ChildTable.COLUMN_DEVICEID + " TEXT, "
            + ChildTable.COLUMN_DEVICETAGID + " TEXT, "
            + ChildTable.COLUMN_SYNCED + " TEXT, "
            + ChildTable.COLUMN_SYNC_DATE + " TEXT, "
            + ChildTable.COLUMN_APPVERSION + " TEXT, "
            + ChildTable.COLUMN_SIM + " TEXT "
            + " );"
            )

    const val SQL_CREATE_ADOLESCENT = ("CREATE TABLE "
            + AdolescentTable.TABLE_NAME + "("
            + AdolescentTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + AdolescentTable.COLUMN_PROJECT_NAME + " TEXT, "
            + AdolescentTable.COLUMN_UID + " TEXT, "
            + AdolescentTable.COLUMN_UUID + " TEXT, "
            + AdolescentTable.COLUMN_FMUID + " TEXT, "
            + AdolescentTable.COLUMN_MUID + " TEXT, "
            + AdolescentTable.COLUMN_PSU_CODE + " TEXT, "
            + AdolescentTable.COLUMN_HHID + " TEXT, "
            + AdolescentTable.COLUMN_SNO + " TEXT, "
            + AdolescentTable.COLUMN_USERNAME + " TEXT, "
            + AdolescentTable.COLUMN_SYSDATE + " TEXT, "
            + AdolescentTable.COLUMN_INDEXED + " TEXT, "
            + AdolescentTable.COLUMN_NAME + " TEXT, "
            + AdolescentTable.COLUMN_ISTATUS + " TEXT, "
            + AdolescentTable.COLUMN_DEVICEID + " TEXT, "
            + AdolescentTable.COLUMN_DEVICETAGID + " TEXT, "
            + AdolescentTable.COLUMN_SYNCED + " TEXT, "
            + AdolescentTable.COLUMN_SYNC_DATE + " TEXT, "
            + AdolescentTable.COLUMN_APPVERSION + " TEXT, "
            + AdolescentTable.COLUMN_SAH1 + " TEXT, "
            + AdolescentTable.COLUMN_SAH2 + " TEXT, "
            + AdolescentTable.COLUMN_SAH3 + " TEXT, "
            + AdolescentTable.COLUMN_SAH4 + " TEXT, "
            + AdolescentTable.COLUMN_SAH5 + " TEXT, "
            + AdolescentTable.COLUMN_SAH6 + " TEXT, "
            + AdolescentTable.COLUMN_SAH7 + " TEXT "
            + " );"
            )


    const val SQL_CREATE_USERS = ("CREATE TABLE "
            + UsersTable.TABLE_NAME + "("
            + UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersTable.COLUMN_FULLNAME + " TEXT,"
            + UsersTable.COLUMN_DIST_ID + " TEXT,"
            + UsersTable.COLUMN_ENABLED + " TEXT,"
            + UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + UsersTable.COLUMN_DESIGNATION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_CLUSTERS = ("CREATE TABLE "
            + ClusterTable.TABLE_NAME + "("
            + ClusterTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ClusterTable.COLUMN_GEOAREA + " TEXT,"
            + ClusterTable.COLUMN_DIST_ID + " TEXT,"
            + ClusterTable.COLUMN_CLUSTER_CODE + " TEXT"
            + " );"
            )

    const val SQL_CREATE_RANDOM_HH = ("CREATE TABLE "
            + RandomHHTable.TABLE_NAME + "("
            + RandomHHTable.COLUMN_ID + " INTEGER PRIMARY KEY,"
            + RandomHHTable.COLUMN_SNO + " TEXT,"
            + RandomHHTable.COLUMN_CLUSTER_CODE + " TEXT,"
            + RandomHHTable.COLUMN_HH_NO + " TEXT,"
            + RandomHHTable.COLUMN_HEAD_HH + " TEXT"
            + " );"
            )

/*    const val SQL_CREATE_VERSIONAPP = ("CREATE TABLE "
            + VersionTable.TABLE_NAME + " ("
            + VersionTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VersionTable.COLUMN_VERSION_CODE + " TEXT, "
            + VersionTable.COLUMN_VERSION_NAME + " TEXT, "
            + VersionTable.COLUMN_PATH_NAME + " TEXT "
            + ");"
            )*/

    /*const val SQL_ALTER_FORMS_GPS_LAT =
        ("ALTER TABLE " + FormsTable.TABLE_NAME + " ADD " + FormsTable.COLUMN_GPSLAT + " TEXT; ")
    const val SQL_ALTER_FORMS_GPS_LNG =
        ("ALTER TABLE " + FormsTable.TABLE_NAME + " ADD " + FormsTable.COLUMN_GPSLNG + " TEXT; ")
    const val SQL_ALTER_FORMS_GPS_DATE =
        ("ALTER TABLE " + FormsTable.TABLE_NAME + " ADD " + FormsTable.COLUMN_GPSDATE + " TEXT; ")
    const val SQL_ALTER_FORMS_GPS_ACC =
        ("ALTER TABLE " + FormsTable.TABLE_NAME + " ADD " + FormsTable.COLUMN_GPSACC + " TEXT; ")

    const val SQL_ALTER_CHILD_GPS_LAT =
        ("ALTER TABLE " + ChildTable.TABLE_NAME + " ADD " + ChildTable.COLUMN_GPSLAT + " TEXT; ")
    const val SQL_ALTER_CHILD_GPS_LNG =
        ("ALTER TABLE " + ChildTable.TABLE_NAME + " ADD " + ChildTable.COLUMN_GPSLNG + " TEXT; ")
    const val SQL_ALTER_CHILD_GPS_DATE =
        ("ALTER TABLE " + ChildTable.TABLE_NAME + " ADD " + ChildTable.COLUMN_GPSDATE + " TEXT; ")
    const val SQL_ALTER_CHILD_GPS_ACC =
        ("ALTER TABLE " + ChildTable.TABLE_NAME + " ADD " + ChildTable.COLUMN_GPSACC + " TEXT; ")*/

}