package ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.internal.measurement.zf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w extends ge {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f27928f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f27929g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f27930h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f27931i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f27932j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f27933k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f27934l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f27935m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f27936n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f27937o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f27938p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f27939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ud f27940e;

    public w(ve veVar) {
        super(veVar);
        this.f27940e = new ud(this.f27641a.e());
        this.f27641a.w();
        this.f27939d = new v(this, this.f27641a.d(), "google_app_measurement.db");
    }

    public static final String T(List list) {
        return list.isEmpty() ? BuildConfig.FLAVOR : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    public static final void o0(ContentValues contentValues, String str, Object obj) {
        o9.s.f("value");
        o9.s.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final long A() {
        return q0("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean A0(df dfVar) {
        o9.s.l(dfVar);
        h();
        j();
        String str = dfVar.f27201a;
        String str2 = dfVar.f27202c;
        if (B0(str, str2) == null) {
            if (ff.r0(str2)) {
                if (p0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f27641a.w().F(str, e5.W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jP0 = p0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, dfVar.b});
                this.f27641a.w();
                if (jP0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", dfVar.b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(dfVar.f27203d));
        o0(contentValues, "value", dfVar.f27204e);
        try {
            if (u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f27641a.a().o().b("Failed to insert/update user property (got -1). appId", b6.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f27641a.a().o().c("Error storing user property. appId", b6.x(dfVar.f27201a), e10);
            return true;
        }
    }

    public final boolean B() {
        return p0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final df B0(String str, String str2) {
        Throwable th2;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        o9.s.f(str);
        o9.s.f(str2);
        h();
        j();
        Cursor cursor = null;
        try {
            cursorQuery = u0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j10 = cursorQuery.getLong(0);
                        Object objX = x(cursorQuery, 1);
                        if (objX != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                df dfVar = new df(str3, cursorQuery.getString(2), str4, j10, objX);
                                if (cursorQuery.moveToNext()) {
                                    this.f27641a.a().o().b("Got multiple records for user property, expected one. appId", b6.x(str3));
                                }
                                cursorQuery.close();
                                return dfVar;
                            } catch (SQLiteException e10) {
                                e = e10;
                            }
                        }
                        sQLiteException = e;
                        l7 l7Var = this.f27641a;
                        l7Var.a().o().d("Error querying user property. appId", b6.x(str3), l7Var.D().c(str4), sQLiteException);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
            } catch (SQLiteException e11) {
                e = e11;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e12) {
            str3 = str;
            str4 = str2;
            sQLiteException = e12;
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final boolean C(String str, String str2) {
        return p0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final List C0(String str) {
        String str2;
        o9.s.f(str);
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                l7 l7Var = this.f27641a;
                l7Var.w();
                cursorQuery = u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = BuildConfig.FLAVOR;
                            }
                            String str3 = string2;
                            long j10 = cursorQuery.getLong(2);
                            Object objX = x(cursorQuery, 3);
                            if (objX == null) {
                                l7Var.a().o().b("Read invalid user property value, ignoring it. appId", b6.x(str));
                                str2 = str;
                            } else {
                                str2 = str;
                                arrayList.add(new df(str2, str3, string, j10, objX));
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str = str2;
                            } catch (SQLiteException e10) {
                                e = e10;
                                this.f27641a.a().o().c("Error querying user properties. appId", b6.x(str2), e);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        }
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str2 = str;
                }
            } catch (SQLiteException e12) {
                e = e12;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final boolean D() {
        return p0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    public final List D0(String str, String str2, String str3) throws Throwable {
        String str4;
        Cursor cursor;
        Cursor cursorQuery;
        String str5;
        o9.s.f(str);
        h();
        j();
        List arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str6 = str;
                arrayList2.add(str6);
                StringBuilder sb2 = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb2.append(" and origin=?");
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor = null;
                        try {
                            this.f27641a.a().o().d("(2)Error querying user properties", b6.x(str), str4, e);
                            arrayList = Collections.EMPTY_LIST;
                            cursorQuery = cursor;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                    sb3.append(str3);
                    sb3.append("*");
                    arrayList2.add(sb3.toString());
                    sb2.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                String string = sb2.toString();
                l7 l7Var = this.f27641a;
                l7Var.w();
                cursorQuery = u0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                l7Var.w();
                                if (size >= 1000) {
                                    z5 z5VarO = l7Var.a().o();
                                    l7Var.w();
                                    z5VarO.b("Read more than the max allowed user properties, ignoring excess", 1000);
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j10 = cursorQuery.getLong(1);
                                Object objX = x(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objX == null) {
                                    try {
                                        l7Var.a().o().d("(2)Read invalid user property value, ignoring it", b6.x(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        this.f27641a.a().o().d("(2)Error querying user properties", b6.x(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursorQuery = cursor;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        return arrayList;
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new df(str6, str5, string2, j10, objX));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    this.f27641a.a().o().d("(2)Error querying user properties", b6.x(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            }
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        cursor = cursorQuery;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
            }
        } catch (SQLiteException e14) {
            e = e14;
            str4 = str2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final long E(String str) {
        o9.s.f(str);
        return q0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean E0(i iVar) {
        o9.s.l(iVar);
        h();
        j();
        String str = iVar.f27445f;
        o9.s.l(str);
        if (B0(str, iVar.f27447h.f27127g) == null) {
            long jP0 = p0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f27641a.w();
            if (jP0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", iVar.f27446g);
        contentValues.put("name", iVar.f27447h.f27127g);
        o0(contentValues, "value", o9.s.l(iVar.f27447h.zza()));
        contentValues.put("active", Boolean.valueOf(iVar.f27449j));
        contentValues.put("trigger_event_name", iVar.f27450k);
        contentValues.put("trigger_timeout", Long.valueOf(iVar.f27452m));
        l7 l7Var = this.f27641a;
        contentValues.put("timed_out_event", l7Var.C().T(iVar.f27451l));
        contentValues.put("creation_timestamp", Long.valueOf(iVar.f27448i));
        contentValues.put("triggered_event", l7Var.C().T(iVar.f27453n));
        contentValues.put("triggered_timestamp", Long.valueOf(iVar.f27447h.f27128h));
        contentValues.put("time_to_live", Long.valueOf(iVar.f27454o));
        contentValues.put("expired_event", l7Var.C().T(iVar.f27455p));
        try {
            if (u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            l7Var.a().o().b("Failed to insert/update conditional user property (got -1)", b6.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f27641a.a().o().c("Error storing conditional user property", b6.x(str), e10);
            return true;
        }
    }

    public final boolean F(String str, Long l10, long j10, com.google.android.gms.internal.measurement.s6 s6Var) {
        h();
        j();
        o9.s.l(s6Var);
        o9.s.f(str);
        o9.s.l(l10);
        l7 l7Var = this.f27641a;
        byte[] bArrD = s6Var.d();
        l7Var.a().w().c("Saving complex main event, appId, data size", l7Var.D().a(str), Integer.valueOf(bArrD.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrD);
        try {
            if (u0().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            l7Var.a().o().b("Failed to insert complex main event (got -1). appId", b6.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f27641a.a().o().c("Error storing complex main event. appId", b6.x(str), e10);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:29:0x00f6 */
    public final i F0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        o9.s.f(str);
        o9.s.f(str2);
        h();
        j();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = u0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = BuildConfig.FLAVOR;
                    }
                    String str4 = string;
                    Object objX = x(cursorQuery, 1);
                    boolean z10 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j10 = cursorQuery.getLong(4);
                    ve veVar = this.b;
                    af afVarK0 = veVar.K0();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<i0> creator = i0.CREATOR;
                    i0 i0Var = (i0) afVarK0.N(blob, creator);
                    str3 = str2;
                    try {
                        i iVar = new i(str, str4, new bf(str3, cursorQuery.getLong(8), objX, str4), cursorQuery.getLong(6), z10, string2, i0Var, j10, (i0) veVar.K0().N(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (i0) veVar.K0().N(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            l7 l7Var = this.f27641a;
                            l7Var.a().o().c("Got multiple records for conditional property, expected one", b6.x(str), l7Var.D().c(str3));
                        }
                        cursorQuery.close();
                        return iVar;
                    } catch (SQLiteException e10) {
                        e = e10;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        l7 l7Var2 = this.f27641a;
        l7Var2.a().o().d("Error querying conditional property", b6.x(str), l7Var2.D().c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:19:0x006a */
    public final Bundle G(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        h();
        j();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = u0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            com.google.android.gms.internal.measurement.s6 s6Var = (com.google.android.gms.internal.measurement.s6) ((com.google.android.gms.internal.measurement.r6) af.W(com.google.android.gms.internal.measurement.s6.P(), cursorRawQuery.getBlob(0))).v();
                            this.b.K0();
                            Bundle bundleQ = af.q(s6Var.F());
                            cursorRawQuery.close();
                            return bundleQ;
                        } catch (IOException e10) {
                            this.f27641a.a().o().c("Failed to retrieve default event parameters. appId", b6.x(str), e10);
                        }
                    } else {
                        this.f27641a.a().w().a("Default event parameters not found");
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    this.f27641a.a().o().b("Error selecting default event parameters", e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final int G0(String str, String str2) {
        o9.s.f(str);
        o9.s.f(str2);
        h();
        j();
        try {
            return u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            l7 l7Var = this.f27641a;
            l7Var.a().o().d("Error deleting conditional property", b6.x(str), l7Var.D().c(str2), e10);
            return 0;
        }
    }

    public final boolean H(String str, long j10) {
        try {
            return q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) <= 0 && q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            this.f27641a.a().o().b("Error checking backfill conditions", e10);
            return false;
        }
    }

    public final List H0(String str, String str2, String str3) {
        o9.s.f(str);
        h();
        j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return I0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code duplicated, block: B:115:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:2: B:51:0x0104->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    public final void I(String str, Long l10, String str2, Bundle bundle) {
        l7 l7Var;
        Bundle bundle2;
        d0 d0Var;
        long j10;
        String str3;
        ContentValues contentValues;
        com.google.android.gms.internal.measurement.e7 e7Var;
        Iterator it;
        String str4 = str;
        o9.s.l(bundle);
        h();
        j();
        u uVar = l10 != null ? new u(this, str4, l10.longValue()) : new u(this, str4);
        List<t> listA = uVar.a();
        while (!listA.isEmpty()) {
            for (t tVar : listA) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        com.google.android.gms.internal.measurement.e7 e7Var2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = u0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(tVar.b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                e7Var = (com.google.android.gms.internal.measurement.e7) ((com.google.android.gms.internal.measurement.d7) af.W(com.google.android.gms.internal.measurement.e7.m0(), cursorQuery.getBlob(0))).v();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        this.f27641a.a().r().b("Get multiple raw event metadata records, expected one. appId", b6.x(str4));
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    cursor2 = cursorQuery;
                                                    this.f27641a.a().o().c("Data loss. Error selecting raw event. appId", b6.x(str4), e);
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                }
                                                e7Var2 = e7Var;
                                            } catch (IOException e11) {
                                                this.f27641a.a().o().c("Data loss. Failed to merge raw event metadata. appId", b6.x(str4), e11);
                                                cursorQuery.close();
                                            }
                                            if (e7Var2 != null) {
                                                it = e7Var2.p2().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((com.google.android.gms.internal.measurement.v7) it.next()).H().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f27641a.a().o().b("Raw event metadata record is missing. appId", b6.x(str4));
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    e7Var = null;
                                }
                            } catch (SQLiteException e13) {
                                e = e13;
                                e7Var = null;
                            }
                            if (e7Var2 != null) {
                                it = e7Var2.p2().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((com.google.android.gms.internal.measurement.v7) it.next()).H().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    long jUpdate = u0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
                    if (jUpdate != 1) {
                        l7Var.a().o().c("Failed to update raw event. appId, updatedRows", b6.x(str3), Long.valueOf(jUpdate));
                    }
                } catch (SQLiteException e14) {
                    this.f27641a.a().o().c("Error updating raw event. appId", b6.x(d0Var.f27173a), e14);
                }
                ve veVar = this.b;
                af afVarK0 = veVar.K0();
                com.google.android.gms.internal.measurement.s6 s6Var = tVar.f27810d;
                Bundle bundle3 = new Bundle();
                for (com.google.android.gms.internal.measurement.w6 w6Var : s6Var.F()) {
                    if (w6Var.N()) {
                        bundle3.putDouble(w6Var.G(), w6Var.O());
                    } else if (w6Var.L()) {
                        bundle3.putFloat(w6Var.G(), w6Var.M());
                    } else if (w6Var.J()) {
                        bundle3.putLong(w6Var.G(), w6Var.K());
                    } else if (w6Var.H()) {
                        bundle3.putString(w6Var.G(), w6Var.I());
                    } else if (w6Var.P().isEmpty()) {
                        afVarK0.f27641a.a().o().b("Unexpected parameter type for parameter", w6Var);
                    } else {
                        bundle3.putParcelableArray(w6Var.G(), af.Y(w6Var.P()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strI = s6Var.I();
                if (string == null) {
                    string = BuildConfig.FLAVOR;
                }
                c6 c6Var = new c6(strI, string, bundle3, s6Var.K());
                l7Var = this.f27641a;
                Bundle bundle4 = c6Var.f27147d;
                String str5 = c6Var.f27145a;
                ff ffVarC = l7Var.C();
                if (str5.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str6 : bundle.keySet()) {
                        ve veVar2 = veVar;
                        if (str6.startsWith("gad_")) {
                            bundle2.remove(str6);
                        }
                        veVar = veVar2;
                    }
                } else {
                    bundle2 = bundle;
                }
                ve veVar3 = veVar;
                ffVarC.w(bundle4, bundle2);
                d0Var = new d0(this.f27641a, c6Var.b, str4, s6Var.I(), s6Var.K(), s6Var.M(), bundle4);
                j10 = tVar.f27808a;
                long j11 = tVar.b;
                boolean z10 = tVar.f27809c;
                h();
                j();
                o9.s.l(d0Var);
                str3 = d0Var.f27173a;
                o9.s.f(str3);
                byte[] bArrD = veVar3.K0().J(d0Var).d();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", d0Var.b);
                contentValues.put("timestamp", Long.valueOf(d0Var.f27175d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j11));
                contentValues.put("data", bArrD);
                contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
                str4 = str;
            }
            listA = uVar.a();
            str4 = str;
        }
    }

    public final List I0(String str, String[] strArr) {
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                l7 l7Var = this.f27641a;
                l7Var.w();
                cursorQuery = u0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        int size = arrayList.size();
                        l7Var.w();
                        if (size >= 1000) {
                            z5 z5VarO = l7Var.a().o();
                            l7Var.w();
                            z5VarO.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objX = x(cursorQuery, 3);
                        boolean z10 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j10 = cursorQuery.getLong(6);
                        ve veVar = this.b;
                        af afVarK0 = veVar.K0();
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<i0> creator = i0.CREATOR;
                        i0 i0Var = (i0) afVarK0.N(blob, creator);
                        arrayList.add(new i(string, string2, new bf(string3, cursorQuery.getLong(10), objX, string2), cursorQuery.getLong(8), z10, string4, i0Var, j10, (i0) veVar.K0().N(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (i0) veVar.K0().N(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f27641a.a().o().b("Error querying conditional user property value", e10);
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    public final v8 J(String str) {
        Throwable th2;
        SQLiteException e10;
        o9.s.l(str);
        h();
        j();
        ?? RawQuery = {str};
        ?? r10 = 0;
        v8VarF = null;
        v8VarF = null;
        v8 v8VarF = null;
        try {
            try {
                RawQuery = u0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (RawQuery.moveToFirst()) {
                        v8VarF = v8.f(RawQuery.getString(0), RawQuery.getInt(1));
                    } else {
                        this.f27641a.a().w().a("No data found");
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f27641a.a().o().b("Error querying database.", e10);
                    if (RawQuery != 0) {
                    }
                    if (v8VarF == null) {
                        return v8.f27868c;
                    }
                    return v8VarF;
                }
            } catch (Throwable th3) {
                th2 = th3;
                r10 = RawQuery;
                if (r10 != 0) {
                    r10.close();
                }
                throw th2;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            RawQuery = 0;
        } catch (Throwable th4) {
            th2 = th4;
            if (r10 != 0) {
                r10.close();
            }
            throw th2;
        }
        RawQuery.close();
        if (v8VarF == null) {
            return v8.f27868c;
        }
        return v8VarF;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0306  */
    public final h6 J0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        o9.s.f(str);
        h();
        j();
        Cursor cursor = null;
        try {
            cursorQuery = u0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        ve veVar = this.b;
                        h6 h6Var = new h6(veVar.g0(), str);
                        v8 v8VarG = veVar.g(str);
                        u8 u8Var = u8.ANALYTICS_STORAGE;
                        if (v8VarG.o(u8Var)) {
                            h6Var.q0(cursorQuery.getString(0));
                        }
                        h6Var.s0(cursorQuery.getString(1));
                        if (veVar.g(str).o(u8.AD_STORAGE)) {
                            h6Var.w0(cursorQuery.getString(2));
                        }
                        h6Var.f(cursorQuery.getLong(3));
                        h6Var.A0(cursorQuery.getLong(4));
                        h6Var.C0(cursorQuery.getLong(5));
                        h6Var.E0(cursorQuery.getString(6));
                        h6Var.I0(cursorQuery.getString(7));
                        h6Var.K0(cursorQuery.getLong(8));
                        h6Var.a(cursorQuery.getLong(9));
                        h6Var.e(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        h6Var.o(cursorQuery.getLong(11));
                        h6Var.q(cursorQuery.getLong(12));
                        h6Var.s(cursorQuery.getLong(13));
                        h6Var.u(cursorQuery.getLong(14));
                        h6Var.i(cursorQuery.getLong(15));
                        h6Var.k(cursorQuery.getLong(16));
                        h6Var.G0(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        h6Var.y0(cursorQuery.getString(18));
                        h6Var.y(cursorQuery.getLong(19));
                        h6Var.w(cursorQuery.getLong(20));
                        h6Var.O(cursorQuery.getString(21));
                        h6Var.Q(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        h6Var.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            h6Var.U(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (veVar.g(str).o(u8Var)) {
                            h6Var.u0(cursorQuery.getString(28));
                        }
                        h6Var.W((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                        h6Var.F(cursorQuery.getLong(39));
                        h6Var.m0(cursorQuery.getString(36));
                        h6Var.Y(cursorQuery.getLong(30));
                        h6Var.a0(cursorQuery.getLong(31));
                        zf.a();
                        l7 l7Var = this.f27641a;
                        if (l7Var.w().H(str, e5.Q0)) {
                            h6Var.c0(cursorQuery.getInt(32));
                            h6Var.k0(cursorQuery.getLong(35));
                        }
                        h6Var.e0((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        h6Var.S(boolValueOf);
                        h6Var.C(cursorQuery.getInt(37));
                        h6Var.E(cursorQuery.getInt(38));
                        h6Var.H(cursorQuery.isNull(40) ? BuildConfig.FLAVOR : (String) o9.s.l(cursorQuery.getString(40)));
                        if (!cursorQuery.isNull(41)) {
                            h6Var.g0(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            h6Var.i0(Long.valueOf(cursorQuery.getLong(42)));
                        }
                        h6Var.J(cursorQuery.getBlob(43));
                        if (!cursorQuery.isNull(44)) {
                            h6Var.L(cursorQuery.getInt(44));
                        }
                        h6Var.n0();
                        if (cursorQuery.moveToNext()) {
                            l7Var.a().o().b("Got multiple records for app, expected one. appId", b6.x(str));
                        }
                        cursorQuery.close();
                        return h6Var;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    this.f27641a.a().o().c("Error querying app. appId", b6.x(str), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final boolean K(String str, vd vdVar) {
        h();
        j();
        o9.s.l(vdVar);
        o9.s.f(str);
        l7 l7Var = this.f27641a;
        long jA = l7Var.e().a();
        d5 d5Var = e5.f27280w0;
        long jLongValue = jA - ((Long) d5Var.b(null)).longValue();
        long j10 = vdVar.f27901g;
        if (j10 < jLongValue || j10 > ((Long) d5Var.b(null)).longValue() + jA) {
            l7Var.a().r().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", b6.x(str), Long.valueOf(jA), Long.valueOf(j10));
        }
        l7Var.a().w().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", vdVar.f27900f);
        contentValues.put(Payload.SOURCE, Integer.valueOf(vdVar.f27902h));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (u0().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            l7Var.a().o().b("Failed to insert trigger URI (got -1). appId", b6.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f27641a.a().o().c("Error storing trigger URI. appId", b6.x(str), e10);
            return false;
        }
    }

    public final void K0(h6 h6Var, boolean z10, boolean z11) {
        o9.s.l(h6Var);
        h();
        j();
        String strO0 = h6Var.o0();
        o9.s.l(strO0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strO0);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.b.g(strO0).o(u8.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", h6Var.p0());
        }
        contentValues.put("gmp_app_id", h6Var.r0());
        ve veVar = this.b;
        if (veVar.g(strO0).o(u8.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", h6Var.v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(h6Var.g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(h6Var.z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(h6Var.B0()));
        contentValues.put("app_version", h6Var.D0());
        contentValues.put("app_store", h6Var.H0());
        contentValues.put("gmp_version", Long.valueOf(h6Var.J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(h6Var.L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(h6Var.d()));
        contentValues.put("day", Long.valueOf(h6Var.n()));
        contentValues.put("daily_public_events_count", Long.valueOf(h6Var.p()));
        contentValues.put("daily_events_count", Long.valueOf(h6Var.r()));
        contentValues.put("daily_conversions_count", Long.valueOf(h6Var.t()));
        contentValues.put("config_fetched_time", Long.valueOf(h6Var.h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(h6Var.j()));
        contentValues.put("app_version_int", Long.valueOf(h6Var.F0()));
        contentValues.put("firebase_instance_id", h6Var.x0());
        contentValues.put("daily_error_events_count", Long.valueOf(h6Var.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(h6Var.v()));
        contentValues.put("health_monitor_sample", h6Var.z());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(h6Var.P()));
        contentValues.put("dynamite_version", Long.valueOf(h6Var.b()));
        if (veVar.g(strO0).o(u8.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", h6Var.t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(h6Var.V()));
        contentValues.put("target_os_version", Long.valueOf(h6Var.X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(h6Var.Z()));
        zf.a();
        l7 l7Var = this.f27641a;
        if (l7Var.w().H(strO0, e5.Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(h6Var.b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(h6Var.j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(h6Var.d0()));
        contentValues.put("npa_metadata_value", h6Var.R());
        contentValues.put("bundle_delivery_index", Long.valueOf(h6Var.G()));
        contentValues.put("sgtm_preview_key", h6Var.l0());
        contentValues.put("dma_consent_state", Integer.valueOf(h6Var.B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(h6Var.D()));
        contentValues.put("serialized_npa_metadata", h6Var.I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(h6Var.M()));
        List listT = h6Var.T();
        if (listT != null) {
            if (listT.isEmpty()) {
                l7Var.a().r().b("Safelisted events should not be an empty list. appId", strO0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listT));
            }
        }
        com.google.android.gms.internal.measurement.ze.a();
        if (l7Var.w().H(null, e5.L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", h6Var.f0());
        contentValues.put("unmatched_uwa", h6Var.h0());
        contentValues.put("ad_campaign_info", h6Var.K());
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            if (sQLiteDatabaseU0.update("apps", contentValues, "app_id = ?", new String[]{strO0}) == 0 && sQLiteDatabaseU0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                l7Var.a().o().b("Failed to insert/update app (got -1). appId", b6.x(strO0));
            }
        } catch (SQLiteException e10) {
            this.f27641a.a().o().c("Error storing app. appId", b6.x(strO0), e10);
        }
    }

    public final void L(String str, v8 v8Var) {
        o9.s.l(str);
        o9.s.l(v8Var);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", v8Var.l());
        contentValues.put("consent_source", Integer.valueOf(v8Var.b()));
        N("consent_settings", "app_id", contentValues);
    }

    public final s L0(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return M0(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    public final String M(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return BuildConfig.FLAVOR;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                this.f27641a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th2;
    }

    public final s M0(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        o9.s.f(str);
        h();
        j();
        String[] strArr = {str};
        s sVar = new s();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                cursorQuery = sQLiteDatabaseU0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j10) {
                        sVar.b = cursorQuery.getLong(1);
                        sVar.f27773a = cursorQuery.getLong(2);
                        sVar.f27774c = cursorQuery.getLong(3);
                        sVar.f27775d = cursorQuery.getLong(4);
                        sVar.f27776e = cursorQuery.getLong(5);
                        sVar.f27777f = cursorQuery.getLong(6);
                        sVar.f27778g = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        sVar.b += j11;
                    }
                    if (z11) {
                        sVar.f27773a += j11;
                    }
                    if (z12) {
                        sVar.f27774c += j11;
                    }
                    if (z13) {
                        sVar.f27775d += j11;
                    }
                    if (z14) {
                        sVar.f27776e += j11;
                    }
                    if (z15) {
                        sVar.f27777f += j11;
                    }
                    if (z16) {
                        sVar.f27778g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(sVar.f27773a));
                    contentValues.put("daily_events_count", Long.valueOf(sVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(sVar.f27774c));
                    contentValues.put("daily_error_events_count", Long.valueOf(sVar.f27775d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(sVar.f27776e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(sVar.f27777f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(sVar.f27778g));
                    sQLiteDatabaseU0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.f27641a.a().r().b("Not updating daily counts, app is not known. appId", b6.x(str));
                }
            } catch (SQLiteException e10) {
                this.f27641a.a().o().c("Error updating daily counts. appId", b6.x(str), e10);
            }
            return sVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public final void N(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                this.f27641a.a().q().b("Value of the primary key is not set.", b6.x("app_id"));
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id");
            sb2.append(" = ?");
            if (sQLiteDatabaseU0.update("consent_settings", contentValues, sb2.toString(), new String[]{asString}) == 0 && sQLiteDatabaseU0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f27641a.a().o().c("Failed to insert/update table (got -1). key", b6.x("consent_settings"), b6.x("app_id"));
            }
        } catch (SQLiteException e10) {
            this.f27641a.a().o().d("Error storing into table. key", b6.x("consent_settings"), b6.x("app_id"), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    public final r N0(String str) throws Throwable {
        Throwable th2;
        Cursor cursorQuery;
        o9.s.f(str);
        h();
        j();
        Cursor cursor = null;
        try {
            cursorQuery = u0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            this.f27641a.a().o().b("Got multiple records for app config, expected one. appId", b6.x(str));
                        }
                        if (blob != null) {
                            r rVar = new r(blob, string, string2);
                            cursorQuery.close();
                            return rVar;
                        }
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    this.f27641a.a().o().c("Error querying remote config. appId", b6.x(str), e);
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012f  */
    public final e0 O(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        o9.s.f(str2);
        o9.s.f(str3);
        h();
        j();
        Cursor cursor = null;
        try {
            cursorQuery = u0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(1);
                        long j12 = cursorQuery.getLong(2);
                        long j13 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        e0 e0Var = new e0(str2, str3, j10, j11, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j12, j13, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            this.f27641a.a().o().b("Got multiple records for event aggregates, expected one. appId", b6.x(str2));
                        }
                        cursorQuery.close();
                        return e0Var;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    l7 l7Var = this.f27641a;
                    l7Var.a().o().d("Error querying events. appId", b6.x(str2), l7Var.D().a(str3), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0045  */
    public final boolean O0(com.google.android.gms.internal.measurement.e7 e7Var, boolean z10) {
        h();
        j();
        o9.s.l(e7Var);
        o9.s.f(e7Var.F());
        o9.s.p(e7Var.w2());
        u();
        l7 l7Var = this.f27641a;
        long jA = l7Var.e().a();
        long jX2 = e7Var.x2();
        l7Var.w();
        if (jX2 >= jA - m.q()) {
            long jX3 = e7Var.x2();
            l7Var.w();
            if (jX3 > m.q() + jA) {
                l7Var.a().r().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", b6.x(e7Var.F()), Long.valueOf(jA), Long.valueOf(e7Var.x2()));
            }
        } else {
            l7Var.a().r().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", b6.x(e7Var.F()), Long.valueOf(jA), Long.valueOf(e7Var.x2()));
        }
        try {
            byte[] bArrV = this.b.K0().V(e7Var.d());
            l7 l7Var2 = this.f27641a;
            l7Var2.a().w().b("Saving bundle, size", Integer.valueOf(bArrV.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", e7Var.F());
            contentValues.put("bundle_end_timestamp", Long.valueOf(e7Var.x2()));
            contentValues.put("data", bArrV);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (e7Var.I0()) {
                contentValues.put("retry_count", Integer.valueOf(e7Var.J0()));
            }
            try {
                if (u0().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                l7Var2.a().o().b("Failed to insert bundle (got -1). appId", b6.x(e7Var.F()));
                return false;
            } catch (SQLiteException e10) {
                this.f27641a.a().o().c("Error storing bundle. appId", b6.x(e7Var.F()), e10);
                return false;
            }
        } catch (IOException e11) {
            this.f27641a.a().o().c("Data loss. Failed to serialize bundle. appId", b6.x(e7Var.F()), e11);
            return false;
        }
    }

    public final void P(String str, e0 e0Var) {
        o9.s.l(e0Var);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        String str2 = e0Var.f27210a;
        contentValues.put("app_id", str2);
        contentValues.put("name", e0Var.b);
        contentValues.put("lifetime_count", Long.valueOf(e0Var.f27211c));
        contentValues.put("current_bundle_count", Long.valueOf(e0Var.f27212d));
        contentValues.put("last_fire_timestamp", Long.valueOf(e0Var.f27214f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(e0Var.f27215g));
        contentValues.put("last_bundled_day", e0Var.f27216h);
        contentValues.put("last_sampled_complex_event_id", e0Var.f27217i);
        contentValues.put("last_sampling_rate", e0Var.f27218j);
        contentValues.put("current_session_count", Long.valueOf(e0Var.f27213e));
        Boolean bool = e0Var.f27219k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f27641a.a().o().b("Failed to insert/update event aggregates (got -1). appId", b6.x(str2));
            }
        } catch (SQLiteException e10) {
            this.f27641a.a().o().c("Error storing event aggregates. appId", b6.x(e0Var.f27210a), e10);
        }
    }

    public final void Q(String str, String str2) {
        o9.s.f(str2);
        h();
        j();
        try {
            u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            this.f27641a.a().o().c("Error deleting snapshot. appId", b6.x(str2), e10);
        }
    }

    public final ye R(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        if (TextUtils.isEmpty(str2)) {
            this.f27641a.a().v().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.z6 z6Var = (com.google.android.gms.internal.measurement.z6) af.W(com.google.android.gms.internal.measurement.c7.M(), bArr);
            eb ebVarA = eb.a(i10);
            if (ebVarA != eb.GOOGLE_SIGNAL && ebVarA != eb.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = z6Var.z().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.d7 d7Var = (com.google.android.gms.internal.measurement.d7) ((com.google.android.gms.internal.measurement.e7) it.next()).q();
                    d7Var.O0(i11);
                    arrayList.add((com.google.android.gms.internal.measurement.e7) d7Var.v());
                }
                z6Var.H();
                z6Var.G(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        this.f27641a.a().o().b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            xe xeVar = new xe();
            xeVar.b(j10);
            xeVar.c((com.google.android.gms.internal.measurement.c7) z6Var.v());
            xeVar.d(str2);
            xeVar.e(map);
            xeVar.f(ebVarA);
            xeVar.g(j11);
            xeVar.h(j12);
            xeVar.i(j13);
            xeVar.j(i11);
            return xeVar.a();
        } catch (IOException e10) {
            this.f27641a.a().o().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    public final String S() {
        l7 l7Var = this.f27641a;
        long jA = l7Var.e().a();
        Locale locale = Locale.US;
        eb ebVar = eb.GOOGLE_SIGNAL;
        Integer numValueOf = Integer.valueOf(ebVar.zza());
        Long lValueOf = Long.valueOf(jA);
        l7Var.w();
        Long l10 = (Long) e5.T.b(null);
        l10.longValue();
        String str = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l10);
        Integer numValueOf2 = Integer.valueOf(ebVar.zza());
        l7Var.w();
        String str2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", numValueOf2, lValueOf, Long.valueOf(m.q()));
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb2.append("(");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }

    public final a0 U(String str) {
        o9.s.l(str);
        h();
        j();
        return a0.g(M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, BuildConfig.FLAVOR));
    }

    public final void V(String str, a0 a0Var) {
        o9.s.l(str);
        o9.s.l(a0Var);
        h();
        j();
        v8 v8VarJ = J(str);
        v8 v8Var = v8.f27868c;
        if (v8VarJ == v8Var) {
            L(str, v8Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", a0Var.e());
        N("consent_settings", "app_id", contentValues);
    }

    public final void W(String str, v8 v8Var) {
        o9.s.l(str);
        o9.s.l(v8Var);
        h();
        j();
        L(str, J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", v8Var.l());
        N("consent_settings", "app_id", contentValues);
    }

    public final v8 X(String str) {
        o9.s.l(str);
        h();
        j();
        return v8.f(M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, BuildConfig.FLAVOR), 100);
    }

    public final void Y(String str, List list) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        boolean z10;
        o9.s.l(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.android.gms.internal.measurement.a4 a4Var = (com.google.android.gms.internal.measurement.a4) ((com.google.android.gms.internal.measurement.b4) list.get(i10)).q();
            if (a4Var.D() != 0) {
                for (int i11 = 0; i11 < a4Var.D(); i11++) {
                    com.google.android.gms.internal.measurement.c4 c4Var = (com.google.android.gms.internal.measurement.c4) a4Var.F(i11).q();
                    com.google.android.gms.internal.measurement.c4 c4Var2 = (com.google.android.gms.internal.measurement.c4) c4Var.clone();
                    String strB = w8.b(c4Var.z());
                    if (strB != null) {
                        c4Var2.B(strB);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = 0;
                    while (i12 < c4Var.C()) {
                        com.google.android.gms.internal.measurement.f4 f4VarD = c4Var.D(i12);
                        com.google.android.gms.internal.measurement.c4 c4Var3 = c4Var;
                        boolean z11 = z10;
                        String strB2 = fb.b(f4VarD.M(), x8.f27967a, x8.b);
                        if (strB2 != null) {
                            com.google.android.gms.internal.measurement.e4 e4Var = (com.google.android.gms.internal.measurement.e4) f4VarD.q();
                            e4Var.z(strB2);
                            c4Var2.F(i12, (com.google.android.gms.internal.measurement.f4) e4Var.v());
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        i12++;
                        c4Var = c4Var3;
                    }
                    if (z10) {
                        a4Var.G(i11, c4Var2);
                        list.set(i10, (com.google.android.gms.internal.measurement.b4) a4Var.v());
                    }
                }
            }
            if (a4Var.z() != 0) {
                for (int i13 = 0; i13 < a4Var.z(); i13++) {
                    com.google.android.gms.internal.measurement.l4 l4VarB = a4Var.B(i13);
                    String strB3 = fb.b(l4VarB.H(), y8.f27995a, y8.b);
                    if (strB3 != null) {
                        com.google.android.gms.internal.measurement.k4 k4Var = (com.google.android.gms.internal.measurement.k4) l4VarB.q();
                        k4Var.z(strB3);
                        a4Var.C(i13, k4Var);
                        list.set(i10, (com.google.android.gms.internal.measurement.b4) a4Var.v());
                    }
                }
            }
        }
        j();
        h();
        o9.s.f(str);
        o9.s.l(list);
        SQLiteDatabase sQLiteDatabaseU0 = u0();
        sQLiteDatabaseU0.beginTransaction();
        try {
            j();
            h();
            o9.s.f(str);
            SQLiteDatabase sQLiteDatabaseU1 = u0();
            sQLiteDatabaseU1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseU1.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.b4 b4Var = (com.google.android.gms.internal.measurement.b4) it.next();
                j();
                h();
                o9.s.f(str);
                o9.s.l(b4Var);
                if (b4Var.F()) {
                    int iG = b4Var.G();
                    Iterator it2 = b4Var.K().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.d4) it2.next()).F()) {
                                this.f27641a.a().r().c("Event filter with no ID. Audience definition ignored. appId, audienceId", b6.x(str), Integer.valueOf(iG));
                                break;
                            }
                        } else {
                            Iterator it3 = b4Var.H().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    Iterator it4 = b4Var.K().iterator();
                                    while (true) {
                                        com.google.android.gms.internal.measurement.b4 b4Var2 = b4Var;
                                        String str2 = "app_id";
                                        try {
                                            if (!it4.hasNext()) {
                                                sQLiteDatabase = sQLiteDatabaseU0;
                                                Iterator it5 = b4Var2.H().iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        com.google.android.gms.internal.measurement.l4 l4Var = (com.google.android.gms.internal.measurement.l4) it5.next();
                                                        j();
                                                        h();
                                                        o9.s.f(str);
                                                        o9.s.l(l4Var);
                                                        if (l4Var.H().isEmpty()) {
                                                            this.f27641a.a().r().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", b6.x(str), Integer.valueOf(iG), String.valueOf(l4Var.F() ? Integer.valueOf(l4Var.G()) : null));
                                                        } else {
                                                            byte[] bArrD = l4Var.d();
                                                            ContentValues contentValues = new ContentValues();
                                                            contentValues.put(str2, str);
                                                            String str3 = str2;
                                                            contentValues.put("audience_id", Integer.valueOf(iG));
                                                            contentValues.put("filter_id", l4Var.F() ? Integer.valueOf(l4Var.G()) : null);
                                                            Iterator it6 = it5;
                                                            contentValues.put("property_name", l4Var.H());
                                                            contentValues.put("session_scoped", l4Var.L() ? Boolean.valueOf(l4Var.M()) : null);
                                                            contentValues.put("data", bArrD);
                                                            try {
                                                                if (u0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                    this.f27641a.a().o().b("Failed to insert property filter (got -1). appId", b6.x(str));
                                                                } else {
                                                                    str2 = str3;
                                                                    it5 = it6;
                                                                }
                                                            } catch (SQLiteException e10) {
                                                                this.f27641a.a().o().c("Error storing property filter. appId", b6.x(str), e10);
                                                            }
                                                        }
                                                    }
                                                    sQLiteDatabaseU0 = sQLiteDatabase;
                                                    break;
                                                }
                                            }
                                            com.google.android.gms.internal.measurement.d4 d4Var = (com.google.android.gms.internal.measurement.d4) it4.next();
                                            j();
                                            h();
                                            o9.s.f(str);
                                            o9.s.l(d4Var);
                                            if (!d4Var.H().isEmpty()) {
                                                byte[] bArrD2 = d4Var.d();
                                                sQLiteDatabase = sQLiteDatabaseU0;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iG));
                                                contentValues2.put("filter_id", d4Var.F() ? Integer.valueOf(d4Var.G()) : null);
                                                contentValues2.put("event_name", d4Var.H());
                                                contentValues2.put("session_scoped", d4Var.P() ? Boolean.valueOf(d4Var.R()) : null);
                                                contentValues2.put("data", bArrD2);
                                                try {
                                                    if (u0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        this.f27641a.a().o().b("Failed to insert event filter (got -1). appId", b6.x(str));
                                                    }
                                                    b4Var = b4Var2;
                                                    sQLiteDatabaseU0 = sQLiteDatabase;
                                                } catch (SQLiteException e11) {
                                                    this.f27641a.a().o().c("Error storing event filter. appId", b6.x(str), e11);
                                                    j();
                                                    h();
                                                    o9.s.f(str);
                                                    SQLiteDatabase sQLiteDatabaseU2 = u0();
                                                    sQLiteDatabaseU2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iG)});
                                                    sQLiteDatabaseU2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iG)});
                                                    sQLiteDatabaseU0 = sQLiteDatabase;
                                                    break;
                                                }
                                            } else {
                                                this.f27641a.a().r().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", b6.x(str), Integer.valueOf(iG), String.valueOf(d4Var.F() ? Integer.valueOf(d4Var.G()) : null));
                                                sQLiteDatabase = sQLiteDatabaseU0;
                                            }
                                            j();
                                            h();
                                            o9.s.f(str);
                                            SQLiteDatabase sQLiteDatabaseU3 = u0();
                                            sQLiteDatabaseU3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iG)});
                                            sQLiteDatabaseU3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iG)});
                                            sQLiteDatabaseU0 = sQLiteDatabase;
                                            break;
                                            break;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                    }
                                }
                                if (!((com.google.android.gms.internal.measurement.l4) it3.next()).F()) {
                                    this.f27641a.a().r().c("Property filter with no ID. Audience definition ignored. appId, audienceId", b6.x(str), Integer.valueOf(iG));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.f27641a.a().r().b("Audience with no ID. appId", b6.x(str));
                }
            }
            sQLiteDatabase = sQLiteDatabaseU0;
            ArrayList arrayList = new ArrayList();
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                com.google.android.gms.internal.measurement.b4 b4Var3 = (com.google.android.gms.internal.measurement.b4) it7.next();
                arrayList.add(b4Var3.F() ? Integer.valueOf(b4Var3.G()) : null);
            }
            o9.s.f(str);
            j();
            h();
            SQLiteDatabase sQLiteDatabaseU4 = u0();
            try {
                long jP0 = p0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int i14 = 0;
                int iMax = Math.max(0, Math.min(2000, this.f27641a.w().E(str, e5.V)));
                if (jP0 > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb2.append("(");
                            sb2.append(strJoin);
                            sb2.append(")");
                            String string = sb2.toString();
                            StringBuilder sb3 = new StringBuilder(string.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(string);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseU4.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i14);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i14++;
                    }
                }
            } catch (SQLiteException e12) {
                this.f27641a.a().o().c("Database error querying filters. appId", b6.x(str), e12);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseU0;
        }
    }

    public final e0 Z(String str, com.google.android.gms.internal.measurement.s6 s6Var, String str2) throws Throwable {
        e0 e0VarO = O("events", str, s6Var.I());
        if (e0VarO == null) {
            l7 l7Var = this.f27641a;
            l7Var.a().r().c("Event aggregate wasn't created during raw event logging. appId, event", b6.x(str), l7Var.D().a(str2));
            return new e0(str, s6Var.I(), 1L, 1L, 1L, s6Var.K(), 0L, null, null, null, null);
        }
        long j10 = e0VarO.f27213e + 1;
        long j11 = e0VarO.f27212d + 1;
        return new e0(e0VarO.f27210a, e0VarO.b, e0VarO.f27211c + 1, j11, j10, e0VarO.f27214f, e0VarO.f27215g, e0VarO.f27216h, e0VarO.f27217i, e0VarO.f27218j, e0VarO.f27219k);
    }

    public final boolean a0() {
        l7 l7Var = this.f27641a;
        Context contextD = l7Var.d();
        l7Var.w();
        return contextD.getDatabasePath("google_app_measurement.db").exists();
    }

    public final /* synthetic */ long b0(String str, String[] strArr, long j10) {
        return q0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    @Override // ob.ge
    public final boolean l() {
        return false;
    }

    public final long m(String str, com.google.android.gms.internal.measurement.c7 c7Var, String str2, Map map, eb ebVar, Long l10) {
        int iDelete;
        h();
        j();
        o9.s.l(c7Var);
        o9.s.f(str);
        h();
        j();
        if (a0()) {
            ve veVar = this.b;
            long jA = veVar.L0().f27084f.a();
            l7 l7Var = this.f27641a;
            long jB = l7Var.e().b();
            long jAbs = Math.abs(jB - jA);
            l7Var.w();
            if (jAbs > m.r()) {
                veVar.L0().f27084f.b(jB);
                h();
                j();
                if (a0() && (iDelete = u0().delete("upload_queue", S(), new String[0])) > 0) {
                    l7Var.a().w().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                o9.s.f(str);
                h();
                j();
                try {
                    int iE = l7Var.w().E(str, e5.A);
                    if (iE > 0) {
                        u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iE)});
                    }
                } catch (SQLiteException e10) {
                    this.f27641a.a().o().c("Error deleting over the limit queued batches. appId", b6.x(str), e10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrD = c7Var.d();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrD);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(ebVar.zza()));
        l7 l7Var2 = this.f27641a;
        contentValues.put("creation_timestamp", Long.valueOf(l7Var2.e().a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = u0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            l7Var2.a().o().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e11) {
            this.f27641a.a().o().c("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    public final /* synthetic */ ud m0() {
        return this.f27940e;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    public final ye n(long j10) throws Throwable {
        Cursor cursorQuery;
        h();
        j();
        Cursor cursor = null;
        try {
            cursorQuery = u0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j10)}, null, null, null, "1");
            try {
                if (cursorQuery.moveToFirst()) {
                    ye yeVarR = R((String) o9.s.l(cursorQuery.getString(1)), j10, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    cursorQuery.close();
                    return yeVarR;
                }
            } catch (SQLiteException e10) {
                e = e10;
                try {
                    this.f27641a.a().o().c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j10), e);
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x024e  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010a A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0124 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0151 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TRY_ENTER, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0161  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0192 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x019b A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd A[Catch: all -> 0x01ed, SQLiteException -> 0x01ef, LOOP:0: B:80:0x01bd->B:127:?, LOOP_START, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x01ef, blocks: (B:78:0x01b7, B:80:0x01bd, B:81:0x01c6, B:83:0x01d1, B:92:0x0206, B:91:0x01f2, B:95:0x020d), top: B:120:0x01b7 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0206 A[Catch: all -> 0x01ed, SQLiteException -> 0x01ef, TryCatch #6 {SQLiteException -> 0x01ef, blocks: (B:78:0x01b7, B:80:0x01bd, B:81:0x01c6, B:83:0x01d1, B:92:0x0206, B:91:0x01f2, B:95:0x020d), top: B:120:0x01b7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x020d A[Catch: all -> 0x01ed, SQLiteException -> 0x01ef, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x01ef, blocks: (B:78:0x01b7, B:80:0x01bd, B:81:0x01c6, B:83:0x01d1, B:92:0x0206, B:91:0x01f2, B:95:0x020d), top: B:120:0x01b7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final void n0(String str, long j10, long j11, re reVar) throws Throwable {
        ?? r10;
        ?? r11;
        Cursor cursorRawQuery;
        String[] strArr;
        String string;
        ?? r12;
        l7 l7Var;
        String str2;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        long j12;
        com.google.android.gms.internal.measurement.r6 r6Var;
        long jQ0;
        long j13;
        String string2;
        o9.s.l(reVar);
        h();
        j();
        ?? r13 = 0;
        cursorQuery = null;
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                ?? IsEmpty = TextUtils.isEmpty(str);
                String str3 = BuildConfig.FLAVOR;
                try {
                    if (IsEmpty != 0) {
                        String[] strArr5 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                        if (j11 != -1) {
                            str3 = "rowid <= ? and ";
                        }
                        StringBuilder sb2 = new StringBuilder(str3.length() + 148);
                        sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb2.append(str3);
                        sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseU0.rawQuery(sb2.toString(), strArr5);
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                string2 = cursorRawQuery.getString(0);
                                try {
                                    string = cursorRawQuery.getString(1);
                                    cursorRawQuery.close();
                                    r12 = string2;
                                    cursorRawQuery = sQLiteDatabaseU0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r12, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        try {
                                            com.google.android.gms.internal.measurement.e7 e7Var = (com.google.android.gms.internal.measurement.e7) ((com.google.android.gms.internal.measurement.d7) af.W(com.google.android.gms.internal.measurement.e7.m0(), cursorRawQuery.getBlob(0))).v();
                                            if (cursorRawQuery.moveToNext()) {
                                                this.f27641a.a().r().b("Get multiple raw event metadata records, expected one. appId", b6.x(r12));
                                            }
                                            cursorRawQuery.close();
                                            o9.s.l(e7Var);
                                            reVar.f27769a = e7Var;
                                            l7Var = this.f27641a;
                                            str2 = "app_id = ? and metadata_fingerprint = ?";
                                            if (l7Var.w().H(null, e5.f27258l1)) {
                                                jQ0 = q0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r12, string}, -1L);
                                                if (j11 == -1) {
                                                    j13 = j11;
                                                } else if (jQ0 != -1) {
                                                    j13 = -1;
                                                } else {
                                                    strArr2 = new String[]{r12, string};
                                                    strArr4 = strArr2;
                                                }
                                                if (j13 == -1 && jQ0 != -1) {
                                                    jQ0 = Math.min(j13, jQ0);
                                                } else if (j13 != -1) {
                                                    jQ0 = j13;
                                                }
                                                strArr3 = new String[]{r12, string, String.valueOf(jQ0)};
                                                strArr4 = strArr3;
                                                str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else if (j11 != -1) {
                                                strArr3 = new String[]{r12, string, String.valueOf(j11)};
                                                strArr4 = strArr3;
                                                str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else {
                                                strArr2 = new String[]{r12, string};
                                                strArr4 = strArr2;
                                            }
                                            cursorQuery = sQLiteDatabaseU0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr4, null, null, "rowid", null);
                                            try {
                                                if (cursorQuery.moveToFirst()) {
                                                    do {
                                                        j12 = cursorQuery.getLong(0);
                                                        try {
                                                            r6Var = (com.google.android.gms.internal.measurement.r6) af.W(com.google.android.gms.internal.measurement.s6.P(), cursorQuery.getBlob(3));
                                                            r6Var.R(cursorQuery.getString(1));
                                                            r6Var.V(cursorQuery.getLong(2));
                                                            if (!reVar.a(j12, (com.google.android.gms.internal.measurement.s6) r6Var.v())) {
                                                                break;
                                                            }
                                                        } catch (IOException e10) {
                                                            this.f27641a.a().o().c("Data loss. Failed to merge raw event. appId", b6.x(r12), e10);
                                                        }
                                                    } while (cursorQuery.moveToNext());
                                                } else {
                                                    l7Var.a().r().b("Raw event data disappeared while in transaction. appId", b6.x(r12));
                                                }
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                r11 = r12;
                                                this.f27641a.a().o().c("Data loss. Error selecting raw event. appId", b6.x(r11), e);
                                            }
                                            cursorRawQuery = cursorQuery;
                                        } catch (IOException e12) {
                                            this.f27641a.a().o().c("Data loss. Failed to merge raw event metadata. appId", b6.x(r12), e12);
                                        }
                                    } else {
                                        this.f27641a.a().o().b("Raw event metadata record is missing. appId", b6.x(r12));
                                    }
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    cursorQuery = cursorRawQuery;
                                    r11 = string2;
                                    this.f27641a.a().o().c("Data loss. Error selecting raw event. appId", b6.x(r11), e);
                                    cursorRawQuery = cursorQuery;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            }
                        } catch (SQLiteException e14) {
                            e = e14;
                            string2 = str;
                        }
                    } else {
                        try {
                            if (j11 != -1) {
                                String str4 = str;
                                strArr = new String[]{str4, String.valueOf(j11)};
                                IsEmpty = str4;
                            } else {
                                String str5 = str;
                                strArr = new String[]{str5};
                                IsEmpty = str5;
                            }
                            if (j11 != -1) {
                                str3 = " and rowid <= ?";
                            }
                            StringBuilder sb3 = new StringBuilder(str3.length() + 84);
                            sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                            sb3.append(str3);
                            sb3.append(" order by rowid limit 1;");
                            cursorRawQuery = sQLiteDatabaseU0.rawQuery(sb3.toString(), strArr);
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    string = cursorRawQuery.getString(0);
                                    cursorRawQuery.close();
                                    r12 = IsEmpty;
                                    cursorRawQuery = sQLiteDatabaseU0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r12, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        this.f27641a.a().o().b("Raw event metadata record is missing. appId", b6.x(r12));
                                    } else {
                                        com.google.android.gms.internal.measurement.e7 e7Var2 = (com.google.android.gms.internal.measurement.e7) ((com.google.android.gms.internal.measurement.d7) af.W(com.google.android.gms.internal.measurement.e7.m0(), cursorRawQuery.getBlob(0))).v();
                                        if (cursorRawQuery.moveToNext()) {
                                            this.f27641a.a().r().b("Get multiple raw event metadata records, expected one. appId", b6.x(r12));
                                        }
                                        cursorRawQuery.close();
                                        o9.s.l(e7Var2);
                                        reVar.f27769a = e7Var2;
                                        l7Var = this.f27641a;
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        if (l7Var.w().H(null, e5.f27258l1)) {
                                            jQ0 = q0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r12, string}, -1L);
                                            if (j11 == -1) {
                                                j13 = j11;
                                            } else if (jQ0 != -1) {
                                                j13 = -1;
                                            } else {
                                                strArr2 = new String[]{r12, string};
                                                strArr4 = strArr2;
                                            }
                                            if (j13 == -1) {
                                                if (j13 != -1) {
                                                    jQ0 = j13;
                                                }
                                            } else if (j13 != -1) {
                                                jQ0 = j13;
                                            }
                                            strArr3 = new String[]{r12, string, String.valueOf(jQ0)};
                                            strArr4 = strArr3;
                                            str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else if (j11 != -1) {
                                            strArr3 = new String[]{r12, string, String.valueOf(j11)};
                                            strArr4 = strArr3;
                                            str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else {
                                            strArr2 = new String[]{r12, string};
                                            strArr4 = strArr2;
                                        }
                                        cursorQuery = sQLiteDatabaseU0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr4, null, null, "rowid", null);
                                        if (cursorQuery.moveToFirst()) {
                                            do {
                                                j12 = cursorQuery.getLong(0);
                                                r6Var = (com.google.android.gms.internal.measurement.r6) af.W(com.google.android.gms.internal.measurement.s6.P(), cursorQuery.getBlob(3));
                                                r6Var.R(cursorQuery.getString(1));
                                                r6Var.V(cursorQuery.getLong(2));
                                                if (!reVar.a(j12, (com.google.android.gms.internal.measurement.s6) r6Var.v())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorQuery.moveToNext());
                                        } else {
                                            l7Var.a().r().b("Raw event data disappeared while in transaction. appId", b6.x(r12));
                                        }
                                        cursorRawQuery = cursorQuery;
                                    }
                                }
                            } catch (SQLiteException e15) {
                                e = e15;
                                cursorQuery = cursorRawQuery;
                                r10 = IsEmpty;
                                r11 = r10;
                                this.f27641a.a().o().c("Data loss. Error selecting raw event. appId", b6.x(r11), e);
                                cursorRawQuery = cursorQuery;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            r10 = IsEmpty;
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r13 = "select metadata_fingerprint from raw_events where app_id = ?";
                    if (r13 != 0) {
                        r13.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e17) {
                e = e17;
                r10 = str;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    public final List o(String str, ce ceVar, int i10) {
        List arrayList;
        o9.s.f(str);
        h();
        j();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strT = T(ceVar.f27170f);
            String strS = S();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 17 + strS.length());
            sb2.append("app_id=?");
            sb2.append(strT);
            sb2.append(" AND NOT ");
            sb2.append(strS);
            cursorQuery = sQLiteDatabaseU0.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                ye yeVarR = R(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (yeVarR != null) {
                    arrayList.add(yeVarR);
                }
            }
        } catch (SQLiteException e10) {
            try {
                this.f27641a.a().o().c("Error to querying MeasurementBatch from upload_queue. appId", str, e10);
                arrayList = Collections.EMPTY_LIST;
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final boolean p(String str) {
        eb[] ebVarArr = {eb.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(ebVarArr[0].zza()));
        String strT = T(arrayList);
        String strS = S();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 61 + strS.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(strT);
        sb2.append(" AND NOT ");
        sb2.append(strS);
        return p0(sb2.toString(), new String[]{str}) != 0;
    }

    public final long p0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f27641a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void q(Long l10) {
        h();
        j();
        o9.s.l(l10);
        try {
            if (u0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                this.f27641a.a().r().a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f27641a.a().o().b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
            throw e10;
        }
    }

    public final long q0(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = u0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f27641a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final String r() throws Throwable {
        SQLiteException e10;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseU0 = u0();
        ?? r10 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseU0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f27641a.a().o().b("Database error getting next bundle app id", e10);
                }
            } catch (Throwable th2) {
                r10 = sQLiteDatabaseU0;
                th = th2;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final void r0() {
        j();
        u0().beginTransaction();
    }

    public final boolean s() {
        return p0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void s0() {
        j();
        u0().setTransactionSuccessful();
    }

    public final void t(long j10) {
        h();
        j();
        try {
            if (u0().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f27641a.a().o().b("Failed to delete a bundle in a queue table", e10);
            throw e10;
        }
    }

    public final void t0() {
        j();
        u0().endTransaction();
    }

    public final void u() {
        h();
        j();
        if (a0()) {
            ve veVar = this.b;
            long jA = veVar.L0().f27083e.a();
            l7 l7Var = this.f27641a;
            long jB = l7Var.e().b();
            long jAbs = Math.abs(jB - jA);
            l7Var.w();
            if (jAbs > m.r()) {
                veVar.L0().f27083e.b(jB);
                h();
                j();
                if (a0()) {
                    SQLiteDatabase sQLiteDatabaseU0 = u0();
                    String strValueOf = String.valueOf(l7Var.e().a());
                    l7Var.w();
                    int iDelete = sQLiteDatabaseU0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(m.q())});
                    if (iDelete > 0) {
                        l7Var.a().w().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    public final SQLiteDatabase u0() {
        h();
        try {
            return this.f27939d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f27641a.a().r().b("Error opening database", e10);
            throw e10;
        }
    }

    public final void v(List list) {
        h();
        j();
        o9.s.l(list);
        o9.s.n(list.size());
        if (a0()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb2.append("(");
            sb2.append(strJoin);
            sb2.append(")");
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(string);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb3.toString(), null) > 0) {
                this.f27641a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                StringBuilder sb4 = new StringBuilder(string.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(string);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseU0.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.f27641a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final e0 v0(String str, String str2) {
        return O("events", str, str2);
    }

    public final void w(Long l10) {
        h();
        j();
        o9.s.l(l10);
        if (a0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb2.toString(), null) > 0) {
                this.f27641a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                long jA = this.f27641a.e().a();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jA).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jA);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l10);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseU0.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.f27641a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void w0(e0 e0Var) {
        P("events", e0Var);
    }

    public final Object x(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f27641a.a().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.f27641a.a().o().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f27641a.a().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final void x0(String str) {
        e0 e0VarO;
        Q("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (e0VarO = O("events", str, string)) != null) {
                            P("events_snapshot", e0VarO);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f27641a.a().o().c("Error creating snapshot. appId", b6.x(str), e10);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final long y() {
        return q0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void y0(String str) throws Throwable {
        boolean z10;
        e0 e0VarO;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        e0 e0VarO2 = O("events", str, "_f");
        e0 e0VarO3 = O("events", str, "_v");
        Q("events", str);
        Cursor cursorQuery = null;
        boolean z11 = false;
        try {
            cursorQuery = u0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z12 = false;
                z10 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z12 = true;
                            } else if ("_v".equals(string)) {
                                z10 = true;
                            }
                        }
                        if (string != null && (e0VarO = O("events_snapshot", str, string)) != null) {
                            P("events", e0VarO);
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        z11 = z12;
                        try {
                            this.f27641a.a().o().c("Error querying snapshot. appId", b6.x(str), e);
                            z12 = z11;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z11 && e0VarO2 != null) {
                                P("events", e0VarO2);
                            } else if (!z10 && e0VarO3 != null) {
                                P("events", e0VarO3);
                            }
                            Q("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z11 = z12;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z11) {
                            if (!z10) {
                                P("events", e0VarO3);
                            }
                        } else if (!z10) {
                            P("events", e0VarO3);
                        }
                        Q("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z12 && e0VarO2 != null) {
                    P("events", e0VarO2);
                } else if (!z10 && e0VarO3 != null) {
                    P("events", e0VarO3);
                }
            } else {
                cursorQuery.close();
                if (e0VarO2 != null) {
                    P("events", e0VarO2);
                } else if (e0VarO3 != null) {
                    P("events", e0VarO3);
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
        }
        Q("events_snapshot", str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009a A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b0 A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    public final long z(String str, String str2) {
        SQLiteException e10;
        long jQ0;
        long j10;
        ContentValues contentValues;
        o9.s.f(str);
        o9.s.f("first_open_count");
        h();
        j();
        SQLiteDatabase sQLiteDatabaseU0 = u0();
        sQLiteDatabaseU0.beginTransaction();
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                j10 = -1;
                jQ0 = q0(sb2.toString(), new String[]{str}, -1L);
                if (jQ0 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseU0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f27641a.a().o().c("Failed to insert column (got -1). appId", b6.x(str), "first_open_count");
                    } else {
                        jQ0 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jQ0));
                            if (sQLiteDatabaseU0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                this.f27641a.a().o().c("Failed to update column (got 0). appId", b6.x(str), "first_open_count");
                            } else {
                                sQLiteDatabaseU0.setTransactionSuccessful();
                                j10 = jQ0;
                            }
                        } catch (SQLiteException e11) {
                            e10 = e11;
                            this.f27641a.a().o().d("Error inserting column. appId", b6.x(str), "first_open_count", e10);
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jQ0));
                    if (sQLiteDatabaseU0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        this.f27641a.a().o().c("Failed to update column (got 0). appId", b6.x(str), "first_open_count");
                    } else {
                        sQLiteDatabaseU0.setTransactionSuccessful();
                        j10 = jQ0;
                    }
                }
            } finally {
                sQLiteDatabaseU0.endTransaction();
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            jQ0 = 0;
        }
        return j10;
    }

    public final void z0(String str, String str2) {
        o9.s.f(str);
        o9.s.f(str2);
        h();
        j();
        try {
            u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            l7 l7Var = this.f27641a;
            l7Var.a().o().d("Error deleting user property. appId", b6.x(str), l7Var.D().c(str2), e10);
        }
    }
}
