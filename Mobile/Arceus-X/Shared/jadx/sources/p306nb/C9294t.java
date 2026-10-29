package p306nb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.C1965a4;
import com.google.android.gms.internal.measurement.C1968a7;
import com.google.android.gms.internal.measurement.C1984b4;
import com.google.android.gms.internal.measurement.C2079g4;
import com.google.android.gms.internal.measurement.C2098h4;
import com.google.android.gms.internal.measurement.C2208n6;
import com.google.android.gms.internal.measurement.C2226o6;
import com.google.android.gms.internal.measurement.C2281r7;
import com.google.android.gms.internal.measurement.C2298s6;
import com.google.android.gms.internal.measurement.C2352v6;
import com.google.android.gms.internal.measurement.C2360ve;
import com.google.android.gms.internal.measurement.C2361vf;
import com.google.android.gms.internal.measurement.C2367w3;
import com.google.android.gms.internal.measurement.C2385x3;
import com.google.android.gms.internal.measurement.C2403y3;
import com.google.android.gms.internal.measurement.C2406y6;
import com.google.android.gms.internal.measurement.C2421z3;
import com.google.android.gms.internal.measurement.C2424z6;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.t */
/* JADX INFO: loaded from: classes.dex */
public final class C9294t extends AbstractC9372xd {

    /* JADX INFO: renamed from: f */
    public static final String[] f33470f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g */
    public static final String[] f33471g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: h */
    public static final String[] f33472h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: i */
    public static final String[] f33473i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* JADX INFO: renamed from: j */
    public static final String[] f33474j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: k */
    public static final String[] f33475k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: l */
    public static final String[] f33476l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m */
    public static final String[] f33477m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: n */
    public static final String[] f33478n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: o */
    public static final String[] f33479o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: p */
    public static final String[] f33480p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d */
    public final C9278s f33481d;

    /* JADX INFO: renamed from: e */
    public final C9244pd f33482e;

    public C9294t(C9197me c9197me) {
        super(c9197me);
        this.f33482e = new C9244pd(this.f33067a.mo36325e());
        this.f33067a.m36338w();
        this.f33481d = new C9278s(this, this.f33067a.mo36324d(), "google_app_measurement.db");
    }

    /* JADX INFO: renamed from: T */
    public static final String m36778T(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m36789o0(ContentValues contentValues, String str, Object obj) {
        C8953m.m36041f("value");
        C8953m.m36047l(obj);
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

    /* JADX INFO: renamed from: A */
    public final long m36790A() {
        return m36840q0("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m36791A0(C9309te c9309te) {
        C8953m.m36047l(c9309te);
        mo36088h();
        m37067j();
        String str = c9309te.f33517a;
        String str2 = c9309te.f33519c;
        if (m36793B0(str, str2) == null) {
            if (C9341ve.m36933r0(str2)) {
                if (m36838p0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f33067a.m36338w().m36404F(str, C9395z4.f33749W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jM36838p0 = m36838p0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, c9309te.f33518b});
                this.f33067a.m36338w();
                if (jM36838p0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c9309te.f33518b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(c9309te.f33520d));
        m36789o0(contentValues, "value", c9309te.f33521e);
        try {
            if (m36848u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f33067a.mo36321a().m37003o().m36912b("Failed to insert/update user property (got -1). appId", C9348w5.m36998x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36913c("Error storing user property. appId", C9348w5.m36998x(c9309te.f33517a), e10);
            return true;
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m36792B() {
        return m36838p0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: B0 */
    public final C9309te m36793B0(String str, String str2) {
        Throwable th2;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        C8953m.m36041f(str);
        C8953m.m36041f(str2);
        mo36088h();
        m37067j();
        Cursor cursor = null;
        try {
            cursorQuery = m36848u0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j10 = cursorQuery.getLong(0);
                        Object objM36853x = m36853x(cursorQuery, 1);
                        if (objM36853x != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                C9309te c9309te = new C9309te(str3, cursorQuery.getString(2), str4, j10, objM36853x);
                                if (cursorQuery.moveToNext()) {
                                    this.f33067a.mo36321a().m37003o().m36912b("Got multiple records for user property, expected one. appId", C9348w5.m36998x(str3));
                                }
                                cursorQuery.close();
                                return c9309te;
                            } catch (SQLiteException e10) {
                                e = e10;
                            }
                        }
                        sQLiteException = e;
                        C9094g7 c9094g7 = this.f33067a;
                        c9094g7.mo36321a().m37003o().m36914d("Error querying user property. appId", C9348w5.m36998x(str3), c9094g7.m36309D().m36622c(str4), sQLiteException);
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

    /* JADX INFO: renamed from: C */
    public final boolean m36794C(String str, String str2) {
        return m36838p0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX INFO: renamed from: C0 */
    public final List m36795C0(String str) {
        String str2;
        C8953m.m36041f(str);
        mo36088h();
        m37067j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                C9094g7 c9094g7 = this.f33067a;
                c9094g7.m36338w();
                cursorQuery = m36848u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j10 = cursorQuery.getLong(2);
                            Object objM36853x = m36853x(cursorQuery, 3);
                            if (objM36853x == null) {
                                c9094g7.mo36321a().m37003o().m36912b("Read invalid user property value, ignoring it. appId", C9348w5.m36998x(str));
                                str2 = str;
                            } else {
                                str2 = str;
                                arrayList.add(new C9309te(str2, str3, string, j10, objM36853x));
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str = str2;
                            } catch (SQLiteException e10) {
                                e = e10;
                                this.f33067a.mo36321a().m37003o().m36913c("Error querying user properties. appId", C9348w5.m36998x(str2), e);
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

    /* JADX INFO: renamed from: D */
    public final boolean m36796D() {
        return m36838p0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX INFO: renamed from: D0 */
    public final List m36797D0(String str, String str2, String str3) throws Throwable {
        String str4;
        Cursor cursor;
        Cursor cursorQuery;
        String str5;
        C8953m.m36041f(str);
        mo36088h();
        m37067j();
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
                            this.f33067a.mo36321a().m37003o().m36914d("(2)Error querying user properties", C9348w5.m36998x(str), str4, e);
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
                C9094g7 c9094g7 = this.f33067a;
                c9094g7.m36338w();
                cursorQuery = m36848u0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                c9094g7.m36338w();
                                if (size >= 1000) {
                                    C9316u5 c9316u5M37003o = c9094g7.mo36321a().m37003o();
                                    c9094g7.m36338w();
                                    c9316u5M37003o.m36912b("Read more than the max allowed user properties, ignoring excess", 1000);
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j10 = cursorQuery.getLong(1);
                                Object objM36853x = m36853x(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objM36853x == null) {
                                    try {
                                        c9094g7.mo36321a().m37003o().m36914d("(2)Read invalid user property value, ignoring it", C9348w5.m36998x(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        this.f33067a.mo36321a().m37003o().m36914d("(2)Error querying user properties", C9348w5.m36998x(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursorQuery = cursor;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        return arrayList;
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new C9309te(str6, str5, string2, j10, objM36853x));
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
                                    this.f33067a.mo36321a().m37003o().m36914d("(2)Error querying user properties", C9348w5.m36998x(str), str4, e);
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

    /* JADX INFO: renamed from: E */
    public final long m36798E(String str) {
        C8953m.m36041f(str);
        return m36840q0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m36799E0(zzah zzahVar) {
        C8953m.m36047l(zzahVar);
        mo36088h();
        m37067j();
        String str = zzahVar.f9489f;
        C8953m.m36047l(str);
        if (m36793B0(str, zzahVar.f9491h.f9519g) == null) {
            long jM36838p0 = m36838p0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f33067a.m36338w();
            if (jM36838p0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.f9490g);
        contentValues.put("name", zzahVar.f9491h.f9519g);
        m36789o0(contentValues, "value", C8953m.m36047l(zzahVar.f9491h.zza()));
        contentValues.put("active", Boolean.valueOf(zzahVar.f9493j));
        contentValues.put("trigger_event_name", zzahVar.f9494k);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.f9496m));
        C9094g7 c9094g7 = this.f33067a;
        contentValues.put("timed_out_event", c9094g7.m36308C().m36951T(zzahVar.f9495l));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.f9492i));
        contentValues.put("triggered_event", c9094g7.m36308C().m36951T(zzahVar.f9497n));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.f9491h.f9520h));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.f9498o));
        contentValues.put("expired_event", c9094g7.m36308C().m36951T(zzahVar.f9499p));
        try {
            if (m36848u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            c9094g7.mo36321a().m37003o().m36912b("Failed to insert/update conditional user property (got -1)", C9348w5.m36998x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36913c("Error storing conditional user property", C9348w5.m36998x(str), e10);
            return true;
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m36800F(String str, Long l10, long j10, C2226o6 c2226o6) {
        mo36088h();
        m37067j();
        C8953m.m36047l(c2226o6);
        C8953m.m36041f(str);
        C8953m.m36047l(l10);
        C9094g7 c9094g7 = this.f33067a;
        byte[] bArrM10628d = c2226o6.m10628d();
        c9094g7.mo36321a().m37011w().m36913c("Saving complex main event, appId, data size", c9094g7.m36309D().m36620a(str), Integer.valueOf(bArrM10628d.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrM10628d);
        try {
            if (m36848u0().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            c9094g7.mo36321a().m37003o().m36912b("Failed to insert complex main event (got -1). appId", C9348w5.m36998x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36913c("Error storing complex main event. appId", C9348w5.m36998x(str), e10);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:29:0x00f6 */
    /* JADX INFO: renamed from: F0 */
    public final zzah m36801F0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        C8953m.m36041f(str);
        C8953m.m36041f(str2);
        mo36088h();
        m37067j();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m36848u0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objM36853x = m36853x(cursorQuery, 1);
                    boolean z10 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j10 = cursorQuery.getLong(4);
                    C9197me c9197me = this.f33516b;
                    C9277re c9277reM36515K0 = c9197me.m36515K0();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                    zzbg zzbgVar = (zzbg) c9277reM36515K0.m36757N(blob, creator);
                    str3 = str2;
                    try {
                        zzah zzahVar = new zzah(str, str4, new zzpl(str3, cursorQuery.getLong(8), objM36853x, str4), cursorQuery.getLong(6), z10, string2, zzbgVar, j10, (zzbg) c9197me.m36515K0().m36757N(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzbg) c9197me.m36515K0().m36757N(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            C9094g7 c9094g7 = this.f33067a;
                            c9094g7.mo36321a().m37003o().m36913c("Got multiple records for conditional property, expected one", C9348w5.m36998x(str), c9094g7.m36309D().m36622c(str3));
                        }
                        cursorQuery.close();
                        return zzahVar;
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
        C9094g7 c9094g8 = this.f33067a;
        c9094g8.mo36321a().m37003o().m36914d("Error querying conditional property", C9348w5.m36998x(str), c9094g8.m36309D().m36622c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:19:0x006a */
    /* JADX INFO: renamed from: G */
    public final Bundle m36802G(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        mo36088h();
        m37067j();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = m36848u0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            C2226o6 c2226o6 = (C2226o6) ((C2208n6) C9277re.m36737W(C2226o6.m10484R(), cursorRawQuery.getBlob(0))).m9882t();
                            this.f33516b.m36515K0();
                            Bundle bundleM36742q = C9277re.m36742q(c2226o6.m10487F());
                            cursorRawQuery.close();
                            return bundleM36742q;
                        } catch (IOException e10) {
                            this.f33067a.mo36321a().m37003o().m36913c("Failed to retrieve default event parameters. appId", C9348w5.m36998x(str), e10);
                        }
                    } else {
                        this.f33067a.mo36321a().m37011w().m36911a("Default event parameters not found");
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    this.f33067a.mo36321a().m37003o().m36912b("Error selecting default event parameters", e);
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

    /* JADX INFO: renamed from: G0 */
    public final int m36803G0(String str, String str2) {
        C8953m.m36041f(str);
        C8953m.m36041f(str2);
        mo36088h();
        m37067j();
        try {
            return m36848u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C9094g7 c9094g7 = this.f33067a;
            c9094g7.mo36321a().m37003o().m36914d("Error deleting conditional property", C9348w5.m36998x(str), c9094g7.m36309D().m36622c(str2), e10);
            return 0;
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m36804H(String str, long j10) {
        try {
            return m36840q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) <= 0 && m36840q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Error checking backfill conditions", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final List m36805H0(String str, String str2, String str3) {
        C8953m.m36041f(str);
        mo36088h();
        m37067j();
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
        return m36807I0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code duplicated, block: B:115:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:2: B:51:0x0104->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    /* JADX INFO: renamed from: I */
    public final void m36806I(String str, Long l10, String str2, Bundle bundle) {
        C9094g7 c9094g7;
        Bundle bundle2;
        C8986a0 c8986a0;
        long j10;
        String str3;
        ContentValues contentValues;
        C1968a7 c1968a7;
        Iterator it;
        String str4 = str;
        C8953m.m36047l(bundle);
        mo36088h();
        m37067j();
        C9262r c9262r = l10 != null ? new C9262r(this, str4, l10.longValue()) : new C9262r(this, str4);
        List<C9246q> listM36725a = c9262r.m36725a();
        while (!listM36725a.isEmpty()) {
            for (C9246q c9246q : listM36725a) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        C1968a7 c1968a8 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = m36848u0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(c9246q.f33371b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                c1968a7 = (C1968a7) ((C2424z6) C9277re.m36737W(C1968a7.m9604m0(), cursorQuery.getBlob(0))).m9882t();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        this.f33067a.mo36321a().m37006r().m36912b("Get multiple raw event metadata records, expected one. appId", C9348w5.m36998x(str4));
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    cursor2 = cursorQuery;
                                                    this.f33067a.mo36321a().m37003o().m36913c("Data loss. Error selecting raw event. appId", C9348w5.m36998x(str4), e);
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                }
                                                c1968a8 = c1968a7;
                                            } catch (IOException e11) {
                                                this.f33067a.mo36321a().m37003o().m36913c("Data loss. Failed to merge raw event metadata. appId", C9348w5.m36998x(str4), e11);
                                                cursorQuery.close();
                                            }
                                            if (c1968a8 != null) {
                                                it = c1968a8.m9730p2().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((C2281r7) it.next()).m10609H().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f33067a.mo36321a().m37003o().m36912b("Raw event metadata record is missing. appId", C9348w5.m36998x(str4));
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
                                    c1968a7 = null;
                                }
                            } catch (SQLiteException e13) {
                                e = e13;
                                c1968a7 = null;
                            }
                            if (c1968a8 != null) {
                                it = c1968a8.m9730p2().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((C2281r7) it.next()).m10609H().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    long jUpdate = m36848u0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
                    if (jUpdate != 1) {
                        c9094g7.mo36321a().m37003o().m36913c("Failed to update raw event. appId, updatedRows", C9348w5.m36998x(str3), Long.valueOf(jUpdate));
                    }
                } catch (SQLiteException e14) {
                    this.f33067a.mo36321a().m37003o().m36913c("Error updating raw event. appId", C9348w5.m36998x(c8986a0.f32660a), e14);
                }
                C9197me c9197me = this.f33516b;
                C9277re c9277reM36515K0 = c9197me.m36515K0();
                C2226o6 c2226o6 = c9246q.f33373d;
                Bundle bundle3 = new Bundle();
                for (C2298s6 c2298s6 : c2226o6.m10487F()) {
                    if (c2298s6.m10704P()) {
                        bundle3.putDouble(c2298s6.m10697G(), c2298s6.m10705Q());
                    } else if (c2298s6.m10702N()) {
                        bundle3.putFloat(c2298s6.m10697G(), c2298s6.m10703O());
                    } else if (c2298s6.m10700K()) {
                        bundle3.putLong(c2298s6.m10697G(), c2298s6.m10701M());
                    } else if (c2298s6.m10698H()) {
                        bundle3.putString(c2298s6.m10697G(), c2298s6.m10699J());
                    } else if (c2298s6.m10706R().isEmpty()) {
                        c9277reM36515K0.f33067a.mo36321a().m37003o().m36912b("Unexpected parameter type for parameter", c2298s6);
                    } else {
                        bundle3.putParcelableArray(c2298s6.m10697G(), C9277re.m36739Y(c2298s6.m10706R()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strM10490J = c2226o6.m10490J();
                if (string == null) {
                    string = "";
                }
                C9364x5 c9364x5 = new C9364x5(strM10490J, string, bundle3, c2226o6.m10492M());
                c9094g7 = this.f33067a;
                Bundle bundle4 = c9364x5.f33634d;
                String str5 = c9364x5.f33631a;
                C9341ve c9341veM36308C = c9094g7.m36308C();
                if (str5.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str6 : bundle.keySet()) {
                        C9197me c9197me2 = c9197me;
                        if (str6.startsWith("gad_")) {
                            bundle2.remove(str6);
                        }
                        c9197me = c9197me2;
                    }
                } else {
                    bundle2 = bundle;
                }
                C9197me c9197me3 = c9197me;
                c9341veM36308C.m36982w(bundle4, bundle2);
                c8986a0 = new C8986a0(this.f33067a, c9364x5.f33632b, str4, c2226o6.m10490J(), c2226o6.m10492M(), c2226o6.m10494O(), bundle4);
                j10 = c9246q.f33370a;
                long j11 = c9246q.f33371b;
                boolean z10 = c9246q.f33372c;
                mo36088h();
                m37067j();
                C8953m.m36047l(c8986a0);
                str3 = c8986a0.f32660a;
                C8953m.m36041f(str3);
                byte[] bArrM10628d = c9197me3.m36515K0().m36753J(c8986a0).m10628d();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", c8986a0.f32661b);
                contentValues.put("timestamp", Long.valueOf(c8986a0.f32663d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j11));
                contentValues.put("data", bArrM10628d);
                contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
                str4 = str;
            }
            listM36725a = c9262r.m36725a();
            str4 = str;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final List m36807I0(String str, String[] strArr) {
        mo36088h();
        m37067j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                C9094g7 c9094g7 = this.f33067a;
                c9094g7.m36338w();
                cursorQuery = m36848u0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        int size = arrayList.size();
                        c9094g7.m36338w();
                        if (size >= 1000) {
                            C9316u5 c9316u5M37003o = c9094g7.mo36321a().m37003o();
                            c9094g7.m36338w();
                            c9316u5M37003o.m36912b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objM36853x = m36853x(cursorQuery, 3);
                        boolean z10 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j10 = cursorQuery.getLong(6);
                        C9197me c9197me = this.f33516b;
                        C9277re c9277reM36515K0 = c9197me.m36515K0();
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                        zzbg zzbgVar = (zzbg) c9277reM36515K0.m36757N(blob, creator);
                        arrayList.add(new zzah(string, string2, new zzpl(string3, cursorQuery.getLong(10), objM36853x, string2), cursorQuery.getLong(8), z10, string4, zzbgVar, j10, (zzbg) c9197me.m36515K0().m36757N(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzbg) c9197me.m36515K0().m36757N(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f33067a.mo36321a().m37003o().m36912b("Error querying conditional user property value", e10);
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x0033 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0010 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x002d */
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
    /* JADX INFO: renamed from: J */
    public final C9255q8 m36808J(String str) {
        Throwable th2;
        SQLiteException e10;
        C8953m.m36047l(str);
        mo36088h();
        m37067j();
        ?? RawQuery = {str};
        ?? r8 = 0;
        c9255q8M36644f = null;
        c9255q8M36644f = null;
        C9255q8 c9255q8M36644f = null;
        try {
            try {
                RawQuery = m36848u0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (RawQuery.moveToFirst()) {
                        c9255q8M36644f = C9255q8.m36644f(RawQuery.getString(0), RawQuery.getInt(1));
                    } else {
                        this.f33067a.mo36321a().m37011w().m36911a("No data found");
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f33067a.mo36321a().m37003o().m36912b("Error querying database.", e10);
                    if (RawQuery != 0) {
                    }
                    if (c9255q8M36644f == null) {
                        return C9255q8.f33384c;
                    }
                    return c9255q8M36644f;
                }
            } catch (Throwable th3) {
                th2 = th3;
                r8 = RawQuery;
                if (r8 != 0) {
                    r8.close();
                }
                throw th2;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            RawQuery = 0;
        } catch (Throwable th4) {
            th2 = th4;
            if (r8 != 0) {
                r8.close();
            }
            throw th2;
        }
        RawQuery.close();
        if (c9255q8M36644f == null) {
            return C9255q8.f33384c;
        }
        return c9255q8M36644f;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0306  */
    /* JADX INFO: renamed from: J0 */
    public final C9026c6 m36809J0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        C8953m.m36041f(str);
        mo36088h();
        m37067j();
        Cursor cursor = null;
        try {
            cursorQuery = m36848u0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        C9197me c9197me = this.f33516b;
                        C9026c6 c9026c6 = new C9026c6(c9197me.m36543g0(), str);
                        C9255q8 c9255q8M36542g = c9197me.m36542g(str);
                        EnumC9239p8 enumC9239p8 = EnumC9239p8.ANALYTICS_STORAGE;
                        if (c9255q8M36542g.m36656o(enumC9239p8)) {
                            c9026c6.m36231q0(cursorQuery.getString(0));
                        }
                        c9026c6.m36235s0(cursorQuery.getString(1));
                        if (c9197me.m36542g(str).m36656o(EnumC9239p8.AD_STORAGE)) {
                            c9026c6.m36243w0(cursorQuery.getString(2));
                        }
                        c9026c6.m36208f(cursorQuery.getLong(3));
                        c9026c6.m36161A0(cursorQuery.getLong(4));
                        c9026c6.m36165C0(cursorQuery.getLong(5));
                        c9026c6.m36169E0(cursorQuery.getString(6));
                        c9026c6.m36177I0(cursorQuery.getString(7));
                        c9026c6.m36181K0(cursorQuery.getLong(8));
                        c9026c6.m36198a(cursorQuery.getLong(9));
                        c9026c6.m36206e(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        c9026c6.m36226o(cursorQuery.getLong(11));
                        c9026c6.m36230q(cursorQuery.getLong(12));
                        c9026c6.m36234s(cursorQuery.getLong(13));
                        c9026c6.m36238u(cursorQuery.getLong(14));
                        c9026c6.m36214i(cursorQuery.getLong(15));
                        c9026c6.m36218k(cursorQuery.getLong(16));
                        c9026c6.m36173G0(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        c9026c6.m36247y0(cursorQuery.getString(18));
                        c9026c6.m36246y(cursorQuery.getLong(19));
                        c9026c6.m36242w(cursorQuery.getLong(20));
                        c9026c6.m36186O(cursorQuery.getString(21));
                        c9026c6.m36188Q(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        c9026c6.m36202c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            c9026c6.m36192U(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (c9197me.m36542g(str).m36656o(enumC9239p8)) {
                            c9026c6.m36239u0(cursorQuery.getString(28));
                        }
                        c9026c6.m36194W((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                        c9026c6.m36170F(cursorQuery.getLong(39));
                        c9026c6.m36223m0(cursorQuery.getString(36));
                        c9026c6.m36196Y(cursorQuery.getLong(30));
                        c9026c6.m36199a0(cursorQuery.getLong(31));
                        C2361vf.m10862a();
                        C9094g7 c9094g7 = this.f33067a;
                        if (c9094g7.m36338w().m36406H(str, C9395z4.f33738Q0)) {
                            c9026c6.m36203c0(cursorQuery.getInt(32));
                            c9026c6.m36219k0(cursorQuery.getLong(35));
                        }
                        c9026c6.m36207e0((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        c9026c6.m36190S(boolValueOf);
                        c9026c6.m36164C(cursorQuery.getInt(37));
                        c9026c6.m36168E(cursorQuery.getInt(38));
                        c9026c6.m36174H(cursorQuery.isNull(40) ? "" : (String) C8953m.m36047l(cursorQuery.getString(40)));
                        if (!cursorQuery.isNull(41)) {
                            c9026c6.m36211g0(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            c9026c6.m36215i0(Long.valueOf(cursorQuery.getLong(42)));
                        }
                        c9026c6.m36178J(cursorQuery.getBlob(43));
                        if (!cursorQuery.isNull(44)) {
                            c9026c6.m36182L(cursorQuery.getInt(44));
                        }
                        c9026c6.m36225n0();
                        if (cursorQuery.moveToNext()) {
                            c9094g7.mo36321a().m37003o().m36912b("Got multiple records for app, expected one. appId", C9348w5.m36998x(str));
                        }
                        cursorQuery.close();
                        return c9026c6;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    this.f33067a.mo36321a().m37003o().m36913c("Error querying app. appId", C9348w5.m36998x(str), e);
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

    /* JADX INFO: renamed from: K */
    public final boolean m36810K(String str, zzoh zzohVar) {
        mo36088h();
        m37067j();
        C8953m.m36047l(zzohVar);
        C8953m.m36041f(str);
        C9094g7 c9094g7 = this.f33067a;
        long jMo44175a = c9094g7.mo36325e().mo44175a();
        C9379y4 c9379y4 = C9395z4.f33814w0;
        long jLongValue = jMo44175a - ((Long) c9379y4.m37079b(null)).longValue();
        long j10 = zzohVar.f9507g;
        if (j10 < jLongValue || j10 > ((Long) c9379y4.m37079b(null)).longValue() + jMo44175a) {
            c9094g7.mo36321a().m37006r().m36914d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C9348w5.m36998x(str), Long.valueOf(jMo44175a), Long.valueOf(j10));
        }
        c9094g7.mo36321a().m37011w().m36911a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzohVar.f9506f);
        contentValues.put(Payload.SOURCE, Integer.valueOf(zzohVar.f9508h));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (m36848u0().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            c9094g7.mo36321a().m37003o().m36912b("Failed to insert trigger URI (got -1). appId", C9348w5.m36998x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36913c("Error storing trigger URI. appId", C9348w5.m36998x(str), e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m36811K0(C9026c6 c9026c6, boolean z10, boolean z11) {
        C8953m.m36047l(c9026c6);
        mo36088h();
        m37067j();
        String strM36227o0 = c9026c6.m36227o0();
        C8953m.m36047l(strM36227o0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strM36227o0);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f33516b.m36542g(strM36227o0).m36656o(EnumC9239p8.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", c9026c6.m36229p0());
        }
        contentValues.put("gmp_app_id", c9026c6.m36233r0());
        C9197me c9197me = this.f33516b;
        if (c9197me.m36542g(strM36227o0).m36656o(EnumC9239p8.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", c9026c6.m36241v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(c9026c6.m36210g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c9026c6.m36249z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c9026c6.m36163B0()));
        contentValues.put("app_version", c9026c6.m36167D0());
        contentValues.put("app_store", c9026c6.m36175H0());
        contentValues.put("gmp_version", Long.valueOf(c9026c6.m36179J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c9026c6.m36183L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c9026c6.m36204d()));
        contentValues.put("day", Long.valueOf(c9026c6.m36224n()));
        contentValues.put("daily_public_events_count", Long.valueOf(c9026c6.m36228p()));
        contentValues.put("daily_events_count", Long.valueOf(c9026c6.m36232r()));
        contentValues.put("daily_conversions_count", Long.valueOf(c9026c6.m36236t()));
        contentValues.put("config_fetched_time", Long.valueOf(c9026c6.m36212h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c9026c6.m36216j()));
        contentValues.put("app_version_int", Long.valueOf(c9026c6.m36171F0()));
        contentValues.put("firebase_instance_id", c9026c6.m36245x0());
        contentValues.put("daily_error_events_count", Long.valueOf(c9026c6.m36244x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c9026c6.m36240v()));
        contentValues.put("health_monitor_sample", c9026c6.m36248z());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c9026c6.m36187P()));
        contentValues.put("dynamite_version", Long.valueOf(c9026c6.m36200b()));
        if (c9197me.m36542g(strM36227o0).m36656o(EnumC9239p8.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", c9026c6.m36237t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c9026c6.m36193V()));
        contentValues.put("target_os_version", Long.valueOf(c9026c6.m36195X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c9026c6.m36197Z()));
        C2361vf.m10862a();
        C9094g7 c9094g7 = this.f33067a;
        if (c9094g7.m36338w().m36406H(strM36227o0, C9395z4.f33738Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(c9026c6.m36201b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(c9026c6.m36217j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c9026c6.m36205d0()));
        contentValues.put("npa_metadata_value", c9026c6.m36189R());
        contentValues.put("bundle_delivery_index", Long.valueOf(c9026c6.m36172G()));
        contentValues.put("sgtm_preview_key", c9026c6.m36221l0());
        contentValues.put("dma_consent_state", Integer.valueOf(c9026c6.m36162B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c9026c6.m36166D()));
        contentValues.put("serialized_npa_metadata", c9026c6.m36176I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c9026c6.m36184M()));
        List listM36191T = c9026c6.m36191T();
        if (listM36191T != null) {
            if (listM36191T.isEmpty()) {
                c9094g7.mo36321a().m37006r().m36912b("Safelisted events should not be an empty list. appId", strM36227o0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listM36191T));
            }
        }
        C2360ve.m10858a();
        if (c9094g7.m36338w().m36406H(null, C9395z4.f33728L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", c9026c6.m36209f0());
        contentValues.put("unmatched_uwa", c9026c6.m36213h0());
        contentValues.put("ad_campaign_info", c9026c6.m36180K());
        try {
            SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
            if (sQLiteDatabaseM36848u0.update("apps", contentValues, "app_id = ?", new String[]{strM36227o0}) == 0 && sQLiteDatabaseM36848u0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                c9094g7.mo36321a().m37003o().m36912b("Failed to insert/update app (got -1). appId", C9348w5.m36998x(strM36227o0));
            }
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36913c("Error storing app. appId", C9348w5.m36998x(strM36227o0), e10);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m36812L(String str, C9255q8 c9255q8) {
        C8953m.m36047l(str);
        C8953m.m36047l(c9255q8);
        mo36088h();
        m37067j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c9255q8.m36654l());
        contentValues.put("consent_source", Integer.valueOf(c9255q8.m36651b()));
        m36816N("consent_settings", "app_id", contentValues);
    }

    /* JADX INFO: renamed from: L0 */
    public final C9230p m36813L0(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return m36815M0(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX INFO: renamed from: M */
    public final String m36814M(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m36848u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                this.f33067a.mo36321a().m37003o().m36913c("Database error", str, e10);
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

    /* JADX INFO: renamed from: M0 */
    public final C9230p m36815M0(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        C8953m.m36041f(str);
        mo36088h();
        m37067j();
        String[] strArr = {str};
        C9230p c9230p = new C9230p();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
                cursorQuery = sQLiteDatabaseM36848u0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j10) {
                        c9230p.f33322b = cursorQuery.getLong(1);
                        c9230p.f33321a = cursorQuery.getLong(2);
                        c9230p.f33323c = cursorQuery.getLong(3);
                        c9230p.f33324d = cursorQuery.getLong(4);
                        c9230p.f33325e = cursorQuery.getLong(5);
                        c9230p.f33326f = cursorQuery.getLong(6);
                        c9230p.f33327g = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        c9230p.f33322b += j11;
                    }
                    if (z11) {
                        c9230p.f33321a += j11;
                    }
                    if (z12) {
                        c9230p.f33323c += j11;
                    }
                    if (z13) {
                        c9230p.f33324d += j11;
                    }
                    if (z14) {
                        c9230p.f33325e += j11;
                    }
                    if (z15) {
                        c9230p.f33326f += j11;
                    }
                    if (z16) {
                        c9230p.f33327g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(c9230p.f33321a));
                    contentValues.put("daily_events_count", Long.valueOf(c9230p.f33322b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c9230p.f33323c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c9230p.f33324d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c9230p.f33325e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c9230p.f33326f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c9230p.f33327g));
                    sQLiteDatabaseM36848u0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.f33067a.mo36321a().m37006r().m36912b("Not updating daily counts, app is not known. appId", C9348w5.m36998x(str));
                }
            } catch (SQLiteException e10) {
                this.f33067a.mo36321a().m37003o().m36913c("Error updating daily counts. appId", C9348w5.m36998x(str), e10);
            }
            return c9230p;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m36816N(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                this.f33067a.mo36321a().m37005q().m36912b("Value of the primary key is not set.", C9348w5.m36998x("app_id"));
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id");
            sb2.append(" = ?");
            if (sQLiteDatabaseM36848u0.update("consent_settings", contentValues, sb2.toString(), new String[]{asString}) == 0 && sQLiteDatabaseM36848u0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f33067a.mo36321a().m37003o().m36913c("Failed to insert/update table (got -1). key", C9348w5.m36998x("consent_settings"), C9348w5.m36998x("app_id"));
            }
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36914d("Error storing into table. key", C9348w5.m36998x("consent_settings"), C9348w5.m36998x("app_id"), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: N0 */
    public final C9214o m36817N0(String str) throws Throwable {
        Throwable th2;
        Cursor cursorQuery;
        C8953m.m36041f(str);
        mo36088h();
        m37067j();
        Cursor cursor = null;
        try {
            cursorQuery = m36848u0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            this.f33067a.mo36321a().m37003o().m36912b("Got multiple records for app config, expected one. appId", C9348w5.m36998x(str));
                        }
                        if (blob != null) {
                            C9214o c9214o = new C9214o(blob, string, string2);
                            cursorQuery.close();
                            return c9214o;
                        }
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    this.f33067a.mo36321a().m37003o().m36913c("Error querying remote config. appId", C9348w5.m36998x(str), e);
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
    /* JADX INFO: renamed from: O */
    public final C9003b0 m36818O(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        C8953m.m36041f(str2);
        C8953m.m36041f(str3);
        mo36088h();
        m37067j();
        Cursor cursor = null;
        try {
            cursorQuery = m36848u0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
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
                        C9003b0 c9003b0 = new C9003b0(str2, str3, j10, j11, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j12, j13, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            this.f33067a.mo36321a().m37003o().m36912b("Got multiple records for event aggregates, expected one. appId", C9348w5.m36998x(str2));
                        }
                        cursorQuery.close();
                        return c9003b0;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    C9094g7 c9094g7 = this.f33067a;
                    c9094g7.mo36321a().m37003o().m36914d("Error querying events. appId", C9348w5.m36998x(str2), c9094g7.m36309D().m36620a(str3), e);
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
    /* JADX INFO: renamed from: O0 */
    public final boolean m36819O0(C1968a7 c1968a7, boolean z10) {
        mo36088h();
        m37067j();
        C8953m.m36047l(c1968a7);
        C8953m.m36041f(c1968a7.m9621F());
        C8953m.m36051p(c1968a7.m9751w2());
        m36847u();
        C9094g7 c9094g7 = this.f33067a;
        long jMo44175a = c9094g7.mo36325e().mo44175a();
        long jM9754x2 = c1968a7.m9754x2();
        c9094g7.m36338w();
        if (jM9754x2 >= jMo44175a - C9150k.m36397q()) {
            long jM9754x3 = c1968a7.m9754x2();
            c9094g7.m36338w();
            if (jM9754x3 > C9150k.m36397q() + jMo44175a) {
                c9094g7.mo36321a().m37006r().m36914d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C9348w5.m36998x(c1968a7.m9621F()), Long.valueOf(jMo44175a), Long.valueOf(c1968a7.m9754x2()));
            }
        } else {
            c9094g7.mo36321a().m37006r().m36914d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C9348w5.m36998x(c1968a7.m9621F()), Long.valueOf(jMo44175a), Long.valueOf(c1968a7.m9754x2()));
        }
        try {
            byte[] bArrM36762V = this.f33516b.m36515K0().m36762V(c1968a7.m10628d());
            C9094g7 c9094g8 = this.f33067a;
            c9094g8.mo36321a().m37011w().m36912b("Saving bundle, size", Integer.valueOf(bArrM36762V.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c1968a7.m9621F());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c1968a7.m9754x2()));
            contentValues.put("data", bArrM36762V);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (c1968a7.m9633I0()) {
                contentValues.put("retry_count", Integer.valueOf(c1968a7.m9637J0()));
            }
            try {
                if (m36848u0().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                c9094g8.mo36321a().m37003o().m36912b("Failed to insert bundle (got -1). appId", C9348w5.m36998x(c1968a7.m9621F()));
                return false;
            } catch (SQLiteException e10) {
                this.f33067a.mo36321a().m37003o().m36913c("Error storing bundle. appId", C9348w5.m36998x(c1968a7.m9621F()), e10);
                return false;
            }
        } catch (IOException e11) {
            this.f33067a.mo36321a().m37003o().m36913c("Data loss. Failed to serialize bundle. appId", C9348w5.m36998x(c1968a7.m9621F()), e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m36820P(String str, C9003b0 c9003b0) {
        C8953m.m36047l(c9003b0);
        mo36088h();
        m37067j();
        ContentValues contentValues = new ContentValues();
        String str2 = c9003b0.f32700a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c9003b0.f32701b);
        contentValues.put("lifetime_count", Long.valueOf(c9003b0.f32702c));
        contentValues.put("current_bundle_count", Long.valueOf(c9003b0.f32703d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c9003b0.f32705f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c9003b0.f32706g));
        contentValues.put("last_bundled_day", c9003b0.f32707h);
        contentValues.put("last_sampled_complex_event_id", c9003b0.f32708i);
        contentValues.put("last_sampling_rate", c9003b0.f32709j);
        contentValues.put("current_session_count", Long.valueOf(c9003b0.f32704e));
        Boolean bool = c9003b0.f32710k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m36848u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f33067a.mo36321a().m37003o().m36912b("Failed to insert/update event aggregates (got -1). appId", C9348w5.m36998x(str2));
            }
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36913c("Error storing event aggregates. appId", C9348w5.m36998x(c9003b0.f32700a), e10);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m36821Q(String str, String str2) {
        C8953m.m36041f(str2);
        mo36088h();
        m37067j();
        try {
            m36848u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36913c("Error deleting snapshot. appId", C9348w5.m36998x(str2), e10);
        }
    }

    /* JADX INFO: renamed from: R */
    public final C9245pe m36822R(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        if (TextUtils.isEmpty(str2)) {
            this.f33067a.mo36321a().m37010v().m36911a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            C2352v6 c2352v6 = (C2352v6) C9277re.m36737W(C2406y6.m10998O(), bArr);
            EnumC9401za enumC9401zaM37094a = EnumC9401za.m37094a(i10);
            if (enumC9401zaM37094a != EnumC9401za.GOOGLE_SIGNAL && enumC9401zaM37094a != EnumC9401za.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = c2352v6.m10848x().iterator();
                while (it.hasNext()) {
                    C2424z6 c2424z6 = (C2424z6) ((C1968a7) it.next()).m10075q();
                    c2424z6.m11078K0(i11);
                    arrayList.add((C1968a7) c2424z6.m9882t());
                }
                c2352v6.m10844G();
                c2352v6.m10843E(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        this.f33067a.mo36321a().m37003o().m36912b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            C9229oe c9229oe = new C9229oe();
            c9229oe.m36610b(j10);
            c9229oe.m36611c((C2406y6) c2352v6.m9882t());
            c9229oe.m36612d(str2);
            c9229oe.m36613e(map);
            c9229oe.m36614f(enumC9401zaM37094a);
            c9229oe.m36615g(j11);
            c9229oe.m36616h(j12);
            c9229oe.m36617i(j13);
            c9229oe.m36618j(i11);
            return c9229oe.m36609a();
        } catch (IOException e10) {
            this.f33067a.mo36321a().m37003o().m36913c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: S */
    public final String m36823S() {
        C9094g7 c9094g7 = this.f33067a;
        long jMo44175a = c9094g7.mo36325e().mo44175a();
        Locale locale = Locale.US;
        EnumC9401za enumC9401za = EnumC9401za.GOOGLE_SIGNAL;
        Integer numValueOf = Integer.valueOf(enumC9401za.zza());
        Long lValueOf = Long.valueOf(jMo44175a);
        c9094g7.m36338w();
        Long l10 = (Long) C9395z4.f33743T.m37079b(null);
        l10.longValue();
        String str = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l10);
        Integer numValueOf2 = Integer.valueOf(enumC9401za.zza());
        c9094g7.m36338w();
        String str2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", numValueOf2, lValueOf, Long.valueOf(C9150k.m36397q()));
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb2.append("(");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: U */
    public final C9358x m36824U(String str) {
        C8953m.m36047l(str);
        mo36088h();
        m37067j();
        return C9358x.m37016g(m36814M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    /* JADX INFO: renamed from: V */
    public final void m36825V(String str, C9358x c9358x) {
        C8953m.m36047l(str);
        C8953m.m36047l(c9358x);
        mo36088h();
        m37067j();
        C9255q8 c9255q8M36808J = m36808J(str);
        C9255q8 c9255q8 = C9255q8.f33384c;
        if (c9255q8M36808J == c9255q8) {
            m36812L(str, c9255q8);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c9358x.m37022e());
        m36816N("consent_settings", "app_id", contentValues);
    }

    /* JADX INFO: renamed from: W */
    public final void m36826W(String str, C9255q8 c9255q8) {
        C8953m.m36047l(str);
        C8953m.m36047l(c9255q8);
        mo36088h();
        m37067j();
        m36812L(str, m36808J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c9255q8.m36654l());
        m36816N("consent_settings", "app_id", contentValues);
    }

    /* JADX INFO: renamed from: X */
    public final C9255q8 m36827X(String str) {
        C8953m.m36047l(str);
        mo36088h();
        m37067j();
        return C9255q8.m36644f(m36814M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    /* JADX INFO: renamed from: Y */
    public final void m36828Y(String str, List list) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        boolean z10;
        C8953m.m36047l(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            C2367w3 c2367w3 = (C2367w3) ((C2385x3) list.get(i10)).m10075q();
            if (c2367w3.m10874C() != 0) {
                for (int i11 = 0; i11 < c2367w3.m10874C(); i11++) {
                    C2403y3 c2403y3 = (C2403y3) c2367w3.m10875D(i11).m10075q();
                    C2403y3 c2403y4 = (C2403y3) c2403y3.clone();
                    String strM36727b = C9271r8.m36727b(c2403y3.m10995x());
                    if (strM36727b != null) {
                        c2403y4.m10996z(strM36727b);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = 0;
                    while (i12 < c2403y3.m10992A()) {
                        C1984b4 c1984b4M10993C = c2403y3.m10993C(i12);
                        C2403y3 c2403y5 = c2403y3;
                        boolean z11 = z10;
                        String strM36112b = C8997ab.m36112b(c1984b4M10993C.m9784O(), C9287s8.f33459a, C9287s8.f33460b);
                        if (strM36112b != null) {
                            C1965a4 c1965a4 = (C1965a4) c1984b4M10993C.m10075q();
                            c1965a4.m9576x(strM36112b);
                            c2403y4.m10994D(i12, (C1984b4) c1965a4.m9882t());
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        i12++;
                        c2403y3 = c2403y5;
                    }
                    if (z10) {
                        c2367w3.m10876E(i11, c2403y4);
                        list.set(i10, (C2385x3) c2367w3.m9882t());
                    }
                }
            }
            if (c2367w3.m10877x() != 0) {
                for (int i13 = 0; i13 < c2367w3.m10877x(); i13++) {
                    C2098h4 c2098h4M10878z = c2367w3.m10878z(i13);
                    String strM36112b2 = C8997ab.m36112b(c2098h4M10878z.m10163H(), C9303t8.f33498a, C9303t8.f33499b);
                    if (strM36112b2 != null) {
                        C2079g4 c2079g4 = (C2079g4) c2098h4M10878z.m10075q();
                        c2079g4.m10018x(strM36112b2);
                        c2367w3.m10873A(i13, c2079g4);
                        list.set(i10, (C2385x3) c2367w3.m9882t());
                    }
                }
            }
        }
        m37067j();
        mo36088h();
        C8953m.m36041f(str);
        C8953m.m36047l(list);
        SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
        sQLiteDatabaseM36848u0.beginTransaction();
        try {
            m37067j();
            mo36088h();
            C8953m.m36041f(str);
            SQLiteDatabase sQLiteDatabaseM36848u1 = m36848u0();
            sQLiteDatabaseM36848u1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM36848u1.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2385x3 c2385x3 = (C2385x3) it.next();
                m37067j();
                mo36088h();
                C8953m.m36041f(str);
                C8953m.m36047l(c2385x3);
                if (c2385x3.m10959F()) {
                    int iM10960G = c2385x3.m10960G();
                    Iterator it2 = c2385x3.m10964M().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((C2421z3) it2.next()).m11039F()) {
                                this.f33067a.mo36321a().m37006r().m36913c("Event filter with no ID. Audience definition ignored. appId, audienceId", C9348w5.m36998x(str), Integer.valueOf(iM10960G));
                                break;
                            }
                        } else {
                            Iterator it3 = c2385x3.m10961H().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    Iterator it4 = c2385x3.m10964M().iterator();
                                    while (true) {
                                        C2385x3 c2385x4 = c2385x3;
                                        String str2 = "app_id";
                                        try {
                                            if (!it4.hasNext()) {
                                                sQLiteDatabase = sQLiteDatabaseM36848u0;
                                                Iterator it5 = c2385x4.m10961H().iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        C2098h4 c2098h4 = (C2098h4) it5.next();
                                                        m37067j();
                                                        mo36088h();
                                                        C8953m.m36041f(str);
                                                        C8953m.m36047l(c2098h4);
                                                        if (c2098h4.m10163H().isEmpty()) {
                                                            this.f33067a.mo36321a().m37006r().m36914d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C9348w5.m36998x(str), Integer.valueOf(iM10960G), String.valueOf(c2098h4.m10161F() ? Integer.valueOf(c2098h4.m10162G()) : null));
                                                        } else {
                                                            byte[] bArrM10628d = c2098h4.m10628d();
                                                            ContentValues contentValues = new ContentValues();
                                                            contentValues.put(str2, str);
                                                            String str3 = str2;
                                                            contentValues.put("audience_id", Integer.valueOf(iM10960G));
                                                            contentValues.put("filter_id", c2098h4.m10161F() ? Integer.valueOf(c2098h4.m10162G()) : null);
                                                            Iterator it6 = it5;
                                                            contentValues.put("property_name", c2098h4.m10163H());
                                                            contentValues.put("session_scoped", c2098h4.m10167N() ? Boolean.valueOf(c2098h4.m10168O()) : null);
                                                            contentValues.put("data", bArrM10628d);
                                                            try {
                                                                if (m36848u0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                    this.f33067a.mo36321a().m37003o().m36912b("Failed to insert property filter (got -1). appId", C9348w5.m36998x(str));
                                                                } else {
                                                                    str2 = str3;
                                                                    it5 = it6;
                                                                }
                                                            } catch (SQLiteException e10) {
                                                                this.f33067a.mo36321a().m37003o().m36913c("Error storing property filter. appId", C9348w5.m36998x(str), e10);
                                                            }
                                                        }
                                                    }
                                                    sQLiteDatabaseM36848u0 = sQLiteDatabase;
                                                    break;
                                                }
                                            }
                                            C2421z3 c2421z3 = (C2421z3) it4.next();
                                            m37067j();
                                            mo36088h();
                                            C8953m.m36041f(str);
                                            C8953m.m36047l(c2421z3);
                                            if (!c2421z3.m11041H().isEmpty()) {
                                                byte[] bArrM10628d2 = c2421z3.m10628d();
                                                sQLiteDatabase = sQLiteDatabaseM36848u0;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iM10960G));
                                                contentValues2.put("filter_id", c2421z3.m11039F() ? Integer.valueOf(c2421z3.m11040G()) : null);
                                                contentValues2.put("event_name", c2421z3.m11041H());
                                                contentValues2.put("session_scoped", c2421z3.m11049R() ? Boolean.valueOf(c2421z3.m11050S()) : null);
                                                contentValues2.put("data", bArrM10628d2);
                                                try {
                                                    if (m36848u0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        this.f33067a.mo36321a().m37003o().m36912b("Failed to insert event filter (got -1). appId", C9348w5.m36998x(str));
                                                    }
                                                    c2385x3 = c2385x4;
                                                    sQLiteDatabaseM36848u0 = sQLiteDatabase;
                                                } catch (SQLiteException e11) {
                                                    this.f33067a.mo36321a().m37003o().m36913c("Error storing event filter. appId", C9348w5.m36998x(str), e11);
                                                    m37067j();
                                                    mo36088h();
                                                    C8953m.m36041f(str);
                                                    SQLiteDatabase sQLiteDatabaseM36848u2 = m36848u0();
                                                    sQLiteDatabaseM36848u2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM10960G)});
                                                    sQLiteDatabaseM36848u2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM10960G)});
                                                    sQLiteDatabaseM36848u0 = sQLiteDatabase;
                                                    break;
                                                }
                                            } else {
                                                this.f33067a.mo36321a().m37006r().m36914d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C9348w5.m36998x(str), Integer.valueOf(iM10960G), String.valueOf(c2421z3.m11039F() ? Integer.valueOf(c2421z3.m11040G()) : null));
                                                sQLiteDatabase = sQLiteDatabaseM36848u0;
                                            }
                                            m37067j();
                                            mo36088h();
                                            C8953m.m36041f(str);
                                            SQLiteDatabase sQLiteDatabaseM36848u3 = m36848u0();
                                            sQLiteDatabaseM36848u3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM10960G)});
                                            sQLiteDatabaseM36848u3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM10960G)});
                                            sQLiteDatabaseM36848u0 = sQLiteDatabase;
                                            break;
                                            break;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                    }
                                }
                                if (!((C2098h4) it3.next()).m10161F()) {
                                    this.f33067a.mo36321a().m37006r().m36913c("Property filter with no ID. Audience definition ignored. appId, audienceId", C9348w5.m36998x(str), Integer.valueOf(iM10960G));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.f33067a.mo36321a().m37006r().m36912b("Audience with no ID. appId", C9348w5.m36998x(str));
                }
            }
            sQLiteDatabase = sQLiteDatabaseM36848u0;
            ArrayList arrayList = new ArrayList();
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                C2385x3 c2385x5 = (C2385x3) it7.next();
                arrayList.add(c2385x5.m10959F() ? Integer.valueOf(c2385x5.m10960G()) : null);
            }
            C8953m.m36041f(str);
            m37067j();
            mo36088h();
            SQLiteDatabase sQLiteDatabaseM36848u4 = m36848u0();
            try {
                long jM36838p0 = m36838p0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int i14 = 0;
                int iMax = Math.max(0, Math.min(2000, this.f33067a.m36338w().m36403E(str, C9395z4.f33747V)));
                if (jM36838p0 > iMax) {
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
                            sQLiteDatabaseM36848u4.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(iMax)});
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
                this.f33067a.mo36321a().m37003o().m36913c("Database error querying filters. appId", C9348w5.m36998x(str), e12);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseM36848u0;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final C9003b0 m36829Z(String str, C2226o6 c2226o6, String str2) throws Throwable {
        C9003b0 c9003b0M36818O = m36818O("events", str, c2226o6.m10490J());
        if (c9003b0M36818O == null) {
            C9094g7 c9094g7 = this.f33067a;
            c9094g7.mo36321a().m37006r().m36913c("Event aggregate wasn't created during raw event logging. appId, event", C9348w5.m36998x(str), c9094g7.m36309D().m36620a(str2));
            return new C9003b0(str, c2226o6.m10490J(), 1L, 1L, 1L, c2226o6.m10492M(), 0L, null, null, null, null);
        }
        long j10 = c9003b0M36818O.f32704e + 1;
        long j11 = c9003b0M36818O.f32703d + 1;
        return new C9003b0(c9003b0M36818O.f32700a, c9003b0M36818O.f32701b, c9003b0M36818O.f32702c + 1, j11, j10, c9003b0M36818O.f32705f, c9003b0M36818O.f32706g, c9003b0M36818O.f32707h, c9003b0M36818O.f32708i, c9003b0M36818O.f32709j, c9003b0M36818O.f32710k);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m36830a0() {
        C9094g7 c9094g7 = this.f33067a;
        Context contextMo36324d = c9094g7.mo36324d();
        c9094g7.m36338w();
        return contextMo36324d.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ long m36831b0(String str, String[] strArr, long j10) {
        return m36840q0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    @Override // p306nb.AbstractC9372xd
    /* JADX INFO: renamed from: l */
    public final boolean mo36126l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final long m36832m(String str, C2406y6 c2406y6, String str2, Map map, EnumC9401za enumC9401za, Long l10) {
        int iDelete;
        mo36088h();
        m37067j();
        C8953m.m36047l(c2406y6);
        C8953m.m36041f(str);
        mo36088h();
        m37067j();
        if (m36830a0()) {
            C9197me c9197me = this.f33516b;
            long jM36345a = c9197me.m36517L0().f33569f.m36345a();
            C9094g7 c9094g7 = this.f33067a;
            long jMo44176b = c9094g7.mo36325e().mo44176b();
            long jAbs = Math.abs(jMo44176b - jM36345a);
            c9094g7.m36338w();
            if (jAbs > C9150k.m36398r()) {
                c9197me.m36517L0().f33569f.m36346b(jMo44176b);
                mo36088h();
                m37067j();
                if (m36830a0() && (iDelete = m36848u0().delete("upload_queue", m36823S(), new String[0])) > 0) {
                    c9094g7.mo36321a().m37011w().m36912b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                C8953m.m36041f(str);
                mo36088h();
                m37067j();
                try {
                    int iM36403E = c9094g7.m36338w().m36403E(str, C9395z4.f33705A);
                    if (iM36403E > 0) {
                        m36848u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM36403E)});
                    }
                } catch (SQLiteException e10) {
                    this.f33067a.mo36321a().m37003o().m36913c("Error deleting over the limit queued batches. appId", C9348w5.m36998x(str), e10);
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
        byte[] bArrM10628d = c2406y6.m10628d();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrM10628d);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(enumC9401za.zza()));
        C9094g7 c9094g8 = this.f33067a;
        contentValues.put("creation_timestamp", Long.valueOf(c9094g8.mo36325e().mo44175a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = m36848u0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            c9094g8.mo36321a().m37003o().m36912b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e11) {
            this.f33067a.mo36321a().m37003o().m36913c("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ C9244pd m36833m0() {
        return this.f33482e;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX INFO: renamed from: n */
    public final C9245pe m36834n(long j10) throws Throwable {
        Cursor cursorQuery;
        mo36088h();
        m37067j();
        Cursor cursor = null;
        try {
            cursorQuery = m36848u0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j10)}, null, null, null, "1");
            try {
                if (cursorQuery.moveToFirst()) {
                    C9245pe c9245peM36822R = m36822R((String) C8953m.m36047l(cursorQuery.getString(1)), j10, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    cursorQuery.close();
                    return c9245peM36822R;
                }
            } catch (SQLiteException e10) {
                e = e10;
                try {
                    this.f33067a.mo36321a().m37003o().m36913c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j10), e);
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

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:115:0x0088 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x007a */
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
    /* JADX INFO: renamed from: n0 */
    public final void m36835n0(String str, long j10, long j11, C9133ie c9133ie) throws Throwable {
        ?? r8;
        ?? r10;
        Cursor cursorRawQuery;
        String str2;
        String[] strArr;
        String string;
        ?? r11;
        C9094g7 c9094g7;
        String str3;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        long j12;
        C2208n6 c2208n6;
        long jM36840q0;
        long j13;
        String string2;
        C8953m.m36047l(c9133ie);
        mo36088h();
        m37067j();
        ?? r12 = 0;
        cursorQuery = null;
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
                ?? IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                try {
                    if (IsEmpty != 0) {
                        String[] strArr5 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                        str4 = j11 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb2 = new StringBuilder(str4.length() + 148);
                        sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb2.append(str4);
                        sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseM36848u0.rawQuery(sb2.toString(), strArr5);
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                string2 = cursorRawQuery.getString(0);
                                try {
                                    string = cursorRawQuery.getString(1);
                                    cursorRawQuery.close();
                                    r11 = string2;
                                    cursorRawQuery = sQLiteDatabaseM36848u0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r11, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        try {
                                            C1968a7 c1968a7 = (C1968a7) ((C2424z6) C9277re.m36737W(C1968a7.m9604m0(), cursorRawQuery.getBlob(0))).m9882t();
                                            if (cursorRawQuery.moveToNext()) {
                                                this.f33067a.mo36321a().m37006r().m36912b("Get multiple raw event metadata records, expected one. appId", C9348w5.m36998x(r11));
                                            }
                                            cursorRawQuery.close();
                                            C8953m.m36047l(c1968a7);
                                            c9133ie.f33051a = c1968a7;
                                            c9094g7 = this.f33067a;
                                            str3 = "app_id = ? and metadata_fingerprint = ?";
                                            if (c9094g7.m36338w().m36406H(null, C9395z4.f33792l1)) {
                                                jM36840q0 = m36840q0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r11, string}, -1L);
                                                if (j11 == -1) {
                                                    j13 = j11;
                                                } else if (jM36840q0 != -1) {
                                                    j13 = -1;
                                                } else {
                                                    strArr2 = new String[]{r11, string};
                                                    strArr4 = strArr2;
                                                }
                                                if (j13 == -1 && jM36840q0 != -1) {
                                                    jM36840q0 = Math.min(j13, jM36840q0);
                                                } else if (j13 != -1) {
                                                    jM36840q0 = j13;
                                                }
                                                strArr3 = new String[]{r11, string, String.valueOf(jM36840q0)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else if (j11 != -1) {
                                                strArr3 = new String[]{r11, string, String.valueOf(j11)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else {
                                                strArr2 = new String[]{r11, string};
                                                strArr4 = strArr2;
                                            }
                                            cursorQuery = sQLiteDatabaseM36848u0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr4, null, null, "rowid", null);
                                            try {
                                                if (cursorQuery.moveToFirst()) {
                                                    do {
                                                        j12 = cursorQuery.getLong(0);
                                                        try {
                                                            c2208n6 = (C2208n6) C9277re.m36737W(C2226o6.m10484R(), cursorQuery.getBlob(3));
                                                            c2208n6.m10419P(cursorQuery.getString(1));
                                                            c2208n6.m10422S(cursorQuery.getLong(2));
                                                            if (!c9133ie.m36368a(j12, (C2226o6) c2208n6.m9882t())) {
                                                                break;
                                                            }
                                                        } catch (IOException e10) {
                                                            this.f33067a.mo36321a().m37003o().m36913c("Data loss. Failed to merge raw event. appId", C9348w5.m36998x(r11), e10);
                                                        }
                                                    } while (cursorQuery.moveToNext());
                                                } else {
                                                    c9094g7.mo36321a().m37006r().m36912b("Raw event data disappeared while in transaction. appId", C9348w5.m36998x(r11));
                                                }
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                r10 = r11;
                                                this.f33067a.mo36321a().m37003o().m36913c("Data loss. Error selecting raw event. appId", C9348w5.m36998x(r10), e);
                                            }
                                            cursorRawQuery = cursorQuery;
                                        } catch (IOException e12) {
                                            this.f33067a.mo36321a().m37003o().m36913c("Data loss. Failed to merge raw event metadata. appId", C9348w5.m36998x(r11), e12);
                                        }
                                    } else {
                                        this.f33067a.mo36321a().m37003o().m36912b("Raw event metadata record is missing. appId", C9348w5.m36998x(r11));
                                    }
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    cursorQuery = cursorRawQuery;
                                    r10 = string2;
                                    this.f33067a.mo36321a().m37003o().m36913c("Data loss. Error selecting raw event. appId", C9348w5.m36998x(r10), e);
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
                                String str5 = str;
                                strArr = new String[]{str5, String.valueOf(j11)};
                                IsEmpty = str5;
                            } else {
                                str2 = str;
                                strArr = new String[]{str2};
                            }
                            if (j11 != -1) {
                                IsEmpty = str2;
                                str4 = " and rowid <= ?";
                            }
                            IsEmpty = str2;
                            StringBuilder sb3 = new StringBuilder(str4.length() + 84);
                            sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                            sb3.append(str4);
                            sb3.append(" order by rowid limit 1;");
                            cursorRawQuery = sQLiteDatabaseM36848u0.rawQuery(sb3.toString(), strArr);
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    string = cursorRawQuery.getString(0);
                                    cursorRawQuery.close();
                                    r11 = IsEmpty;
                                    cursorRawQuery = sQLiteDatabaseM36848u0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r11, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        this.f33067a.mo36321a().m37003o().m36912b("Raw event metadata record is missing. appId", C9348w5.m36998x(r11));
                                    } else {
                                        C1968a7 c1968a8 = (C1968a7) ((C2424z6) C9277re.m36737W(C1968a7.m9604m0(), cursorRawQuery.getBlob(0))).m9882t();
                                        if (cursorRawQuery.moveToNext()) {
                                            this.f33067a.mo36321a().m37006r().m36912b("Get multiple raw event metadata records, expected one. appId", C9348w5.m36998x(r11));
                                        }
                                        cursorRawQuery.close();
                                        C8953m.m36047l(c1968a8);
                                        c9133ie.f33051a = c1968a8;
                                        c9094g7 = this.f33067a;
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        if (c9094g7.m36338w().m36406H(null, C9395z4.f33792l1)) {
                                            jM36840q0 = m36840q0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r11, string}, -1L);
                                            if (j11 == -1) {
                                                j13 = j11;
                                            } else if (jM36840q0 != -1) {
                                                j13 = -1;
                                            } else {
                                                strArr2 = new String[]{r11, string};
                                                strArr4 = strArr2;
                                            }
                                            if (j13 == -1) {
                                                if (j13 != -1) {
                                                    jM36840q0 = j13;
                                                }
                                            } else if (j13 != -1) {
                                                jM36840q0 = j13;
                                            }
                                            strArr3 = new String[]{r11, string, String.valueOf(jM36840q0)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else if (j11 != -1) {
                                            strArr3 = new String[]{r11, string, String.valueOf(j11)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else {
                                            strArr2 = new String[]{r11, string};
                                            strArr4 = strArr2;
                                        }
                                        cursorQuery = sQLiteDatabaseM36848u0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr4, null, null, "rowid", null);
                                        if (cursorQuery.moveToFirst()) {
                                            do {
                                                j12 = cursorQuery.getLong(0);
                                                c2208n6 = (C2208n6) C9277re.m36737W(C2226o6.m10484R(), cursorQuery.getBlob(3));
                                                c2208n6.m10419P(cursorQuery.getString(1));
                                                c2208n6.m10422S(cursorQuery.getLong(2));
                                                if (!c9133ie.m36368a(j12, (C2226o6) c2208n6.m9882t())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorQuery.moveToNext());
                                        } else {
                                            c9094g7.mo36321a().m37006r().m36912b("Raw event data disappeared while in transaction. appId", C9348w5.m36998x(r11));
                                        }
                                        cursorRawQuery = cursorQuery;
                                    }
                                }
                            } catch (SQLiteException e15) {
                                e = e15;
                                cursorQuery = cursorRawQuery;
                                r8 = IsEmpty;
                                r10 = r8;
                                this.f33067a.mo36321a().m37003o().m36913c("Data loss. Error selecting raw event. appId", C9348w5.m36998x(r10), e);
                                cursorRawQuery = cursorQuery;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            r8 = IsEmpty;
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r12 = "select metadata_fingerprint from raw_events where app_id = ?";
                    if (r12 != 0) {
                        r12.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e17) {
                e = e17;
                r8 = str;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX INFO: renamed from: o */
    public final List m36836o(String str, zzoo zzooVar, int i10) {
        List arrayList;
        C8953m.m36041f(str);
        mo36088h();
        m37067j();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strM36778T = m36778T(zzooVar.f9516f);
            String strM36823S = m36823S();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strM36778T).length() + 17 + strM36823S.length());
            sb2.append("app_id=?");
            sb2.append(strM36778T);
            sb2.append(" AND NOT ");
            sb2.append(strM36823S);
            cursorQuery = sQLiteDatabaseM36848u0.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                C9245pe c9245peM36822R = m36822R(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (c9245peM36822R != null) {
                    arrayList.add(c9245peM36822R);
                }
            }
        } catch (SQLiteException e10) {
            try {
                this.f33067a.mo36321a().m37003o().m36913c("Error to querying MeasurementBatch from upload_queue. appId", str, e10);
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

    /* JADX INFO: renamed from: p */
    public final boolean m36837p(String str) {
        EnumC9401za[] enumC9401zaArr = {EnumC9401za.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC9401zaArr[0].zza()));
        String strM36778T = m36778T(arrayList);
        String strM36823S = m36823S();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strM36778T).length() + 61 + strM36823S.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(strM36778T);
        sb2.append(" AND NOT ");
        sb2.append(strM36823S);
        return m36838p0(sb2.toString(), new String[]{str}) != 0;
    }

    /* JADX INFO: renamed from: p0 */
    public final long m36838p0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m36848u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f33067a.mo36321a().m37003o().m36913c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m36839q(Long l10) {
        mo36088h();
        m37067j();
        C8953m.m36047l(l10);
        try {
            if (m36848u0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                this.f33067a.mo36321a().m37006r().m36911a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final long m36840q0(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m36848u0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f33067a.mo36321a().m37003o().m36913c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0022 */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX INFO: renamed from: r */
    public final String m36841r() throws Throwable {
        SQLiteException e10;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
        ?? r8 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM36848u0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f33067a.mo36321a().m37003o().m36912b("Database error getting next bundle app id", e10);
                }
            } catch (Throwable th2) {
                r8 = sQLiteDatabaseM36848u0;
                th = th2;
                if (r8 != 0) {
                    r8.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r8 != 0) {
                r8.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m36842r0() {
        m37067j();
        m36848u0().beginTransaction();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m36843s() {
        return m36838p0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m36844s0() {
        m37067j();
        m36848u0().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: t */
    public final void m36845t(long j10) {
        mo36088h();
        m37067j();
        try {
            if (m36848u0().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Failed to delete a bundle in a queue table", e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m36846t0() {
        m37067j();
        m36848u0().endTransaction();
    }

    /* JADX INFO: renamed from: u */
    public final void m36847u() {
        mo36088h();
        m37067j();
        if (m36830a0()) {
            C9197me c9197me = this.f33516b;
            long jM36345a = c9197me.m36517L0().f33568e.m36345a();
            C9094g7 c9094g7 = this.f33067a;
            long jMo44176b = c9094g7.mo36325e().mo44176b();
            long jAbs = Math.abs(jMo44176b - jM36345a);
            c9094g7.m36338w();
            if (jAbs > C9150k.m36398r()) {
                c9197me.m36517L0().f33568e.m36346b(jMo44176b);
                mo36088h();
                m37067j();
                if (m36830a0()) {
                    SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
                    String strValueOf = String.valueOf(c9094g7.mo36325e().mo44175a());
                    c9094g7.m36338w();
                    int iDelete = sQLiteDatabaseM36848u0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(C9150k.m36397q())});
                    if (iDelete > 0) {
                        c9094g7.mo36321a().m37011w().m36912b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final SQLiteDatabase m36848u0() {
        mo36088h();
        try {
            return this.f33481d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37006r().m36912b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m36849v(List list) {
        mo36088h();
        m37067j();
        C8953m.m36047l(list);
        C8953m.m36049n(list.size());
        if (m36830a0()) {
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
            if (m36838p0(sb3.toString(), null) > 0) {
                this.f33067a.mo36321a().m37006r().m36911a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
                StringBuilder sb4 = new StringBuilder(string.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(string);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM36848u0.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.f33067a.mo36321a().m37003o().m36912b("Error incrementing retry count. error", e10);
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final C9003b0 m36850v0(String str, String str2) {
        return m36818O("events", str, str2);
    }

    /* JADX INFO: renamed from: w */
    public final void m36851w(Long l10) {
        mo36088h();
        m37067j();
        C8953m.m36047l(l10);
        if (m36830a0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m36838p0(sb2.toString(), null) > 0) {
                this.f33067a.mo36321a().m37006r().m36911a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
                long jMo44175a = this.f33067a.mo36325e().mo44175a();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jMo44175a).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jMo44175a);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l10);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseM36848u0.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.f33067a.mo36321a().m37003o().m36912b("Error incrementing retry count. error", e10);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m36852w0(C9003b0 c9003b0) {
        m36820P("events", c9003b0);
    }

    /* JADX INFO: renamed from: x */
    public final Object m36853x(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f33067a.mo36321a().m37003o().m36911a("Loaded invalid null value from database");
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
            this.f33067a.mo36321a().m37003o().m36912b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f33067a.mo36321a().m37003o().m36911a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m36854x0(String str) {
        C9003b0 c9003b0M36818O;
        m36821Q("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m36848u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (c9003b0M36818O = m36818O("events", str, string)) != null) {
                            m36820P("events_snapshot", c9003b0M36818O);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f33067a.mo36321a().m37003o().m36913c("Error creating snapshot. appId", C9348w5.m36998x(str), e10);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final long m36855y() {
        return m36840q0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    /* JADX INFO: renamed from: y0 */
    public final void m36856y0(String str) throws Throwable {
        boolean z10;
        C9003b0 c9003b0M36818O;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        C9003b0 c9003b0M36818O2 = m36818O("events", str, "_f");
        C9003b0 c9003b0M36818O3 = m36818O("events", str, "_v");
        m36821Q("events", str);
        Cursor cursorQuery = null;
        boolean z11 = false;
        try {
            cursorQuery = m36848u0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
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
                        if (string != null && (c9003b0M36818O = m36818O("events_snapshot", str, string)) != null) {
                            m36820P("events", c9003b0M36818O);
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        z11 = z12;
                        try {
                            this.f33067a.mo36321a().m37003o().m36913c("Error querying snapshot. appId", C9348w5.m36998x(str), e);
                            z12 = z11;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z11 && c9003b0M36818O2 != null) {
                                m36820P("events", c9003b0M36818O2);
                            } else if (!z10 && c9003b0M36818O3 != null) {
                                m36820P("events", c9003b0M36818O3);
                            }
                            m36821Q("events_snapshot", str);
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
                                m36820P("events", c9003b0M36818O3);
                            }
                        } else if (!z10) {
                            m36820P("events", c9003b0M36818O3);
                        }
                        m36821Q("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z12 && c9003b0M36818O2 != null) {
                    m36820P("events", c9003b0M36818O2);
                } else if (!z10 && c9003b0M36818O3 != null) {
                    m36820P("events", c9003b0M36818O3);
                }
            } else {
                cursorQuery.close();
                if (c9003b0M36818O2 != null) {
                    m36820P("events", c9003b0M36818O2);
                } else if (c9003b0M36818O3 != null) {
                    m36820P("events", c9003b0M36818O3);
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
        }
        m36821Q("events_snapshot", str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009a A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b0 A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    /* JADX INFO: renamed from: z */
    public final long m36857z(String str, String str2) {
        SQLiteException e10;
        long jM36840q0;
        long j10;
        ContentValues contentValues;
        C8953m.m36041f(str);
        C8953m.m36041f("first_open_count");
        mo36088h();
        m37067j();
        SQLiteDatabase sQLiteDatabaseM36848u0 = m36848u0();
        sQLiteDatabaseM36848u0.beginTransaction();
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                j10 = -1;
                jM36840q0 = m36840q0(sb2.toString(), new String[]{str}, -1L);
                if (jM36840q0 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM36848u0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f33067a.mo36321a().m37003o().m36913c("Failed to insert column (got -1). appId", C9348w5.m36998x(str), "first_open_count");
                    } else {
                        jM36840q0 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jM36840q0));
                            if (sQLiteDatabaseM36848u0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                this.f33067a.mo36321a().m37003o().m36913c("Failed to update column (got 0). appId", C9348w5.m36998x(str), "first_open_count");
                            } else {
                                sQLiteDatabaseM36848u0.setTransactionSuccessful();
                                j10 = jM36840q0;
                            }
                        } catch (SQLiteException e11) {
                            e10 = e11;
                            this.f33067a.mo36321a().m37003o().m36914d("Error inserting column. appId", C9348w5.m36998x(str), "first_open_count", e10);
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jM36840q0));
                    if (sQLiteDatabaseM36848u0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        this.f33067a.mo36321a().m37003o().m36913c("Failed to update column (got 0). appId", C9348w5.m36998x(str), "first_open_count");
                    } else {
                        sQLiteDatabaseM36848u0.setTransactionSuccessful();
                        j10 = jM36840q0;
                    }
                }
            } finally {
                sQLiteDatabaseM36848u0.endTransaction();
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            jM36840q0 = 0;
        }
        return j10;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m36858z0(String str, String str2) {
        C8953m.m36041f(str);
        C8953m.m36041f(str2);
        mo36088h();
        m37067j();
        try {
            m36848u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C9094g7 c9094g7 = this.f33067a;
            c9094g7.mo36321a().m37003o().m36914d("Error deleting user property. appId", C9348w5.m36998x(str), c9094g7.m36309D().m36622c(str2), e10);
        }
    }
}
