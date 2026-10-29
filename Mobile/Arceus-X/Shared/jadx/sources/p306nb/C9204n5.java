package p306nb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;
import p325o9.C9717a;

/* JADX INFO: renamed from: nb.n5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9204n5 extends AbstractC9008b5 {

    /* JADX INFO: renamed from: e */
    public static final String[] f33258e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: c */
    public final C9172l5 f33259c;

    /* JADX INFO: renamed from: d */
    public boolean f33260d;

    public C9204n5(C9094g7 c9094g7) {
        super(c9094g7);
        Context contextMo36324d = this.f33067a.mo36324d();
        this.f33067a.m36338w();
        this.f33259c = new C9172l5(this, contextMo36324d, "google_app_measurement_local.db");
    }

    @Override // p306nb.AbstractC9008b5
    /* JADX INFO: renamed from: m */
    public final boolean mo36124m() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m36582o() {
        int iDelete;
        mo36088h();
        try {
            SQLiteDatabase sQLiteDatabaseM36590w = m36590w();
            if (sQLiteDatabaseM36590w == null || (iDelete = sQLiteDatabaseM36590w.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f33067a.mo36321a().m37011w().m36912b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Error resetting local analytics data. error", e10);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m36583p(zzbg zzbgVar) {
        Parcel parcelObtain = Parcel.obtain();
        C9054e0.m36287a(zzbgVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return m36592z(0, bArrMarshall);
        }
        this.f33067a.mo36321a().m37004p().m36911a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m36584q(zzpl zzplVar) {
        Parcel parcelObtain = Parcel.obtain();
        C9293se.m36777a(zzplVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return m36592z(1, bArrMarshall);
        }
        this.f33067a.mo36321a().m37004p().m36911a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m36585r(zzah zzahVar) {
        C9094g7 c9094g7 = this.f33067a;
        byte[] bArrM36951T = c9094g7.m36308C().m36951T(zzahVar);
        if (bArrM36951T.length <= 131072) {
            return m36592z(2, bArrM36951T);
        }
        c9094g7.mo36321a().m37004p().m36911a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m36586s(zzbe zzbeVar) {
        C9094g7 c9094g7 = this.f33067a;
        byte[] bArrM36951T = c9094g7.m36308C().m36951T(zzbeVar);
        if (bArrM36951T == null) {
            c9094g7.mo36321a().m37004p().m36911a("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrM36951T.length <= 131072) {
            return m36592z(4, bArrM36951T);
        }
        c9094g7.mo36321a().m37004p().m36911a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:130:0x0243 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:132:0x0246 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:187:0x034d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:217:0x0359 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:221:0x031a */
    /* JADX WARN: Code duplicated, block: B:183:0x0335 A[Catch: all -> 0x036a, TryCatch #4 {all -> 0x036a, blocks: (B:38:0x00de, B:40:0x00e4, B:42:0x00f7, B:44:0x00fd, B:56:0x0134, B:61:0x014c, B:63:0x0151, B:181:0x032f, B:183:0x0335, B:184:0x0338, B:191:0x035a, B:201:0x0376, B:78:0x0186, B:79:0x0189, B:77:0x0182, B:87:0x019c, B:89:0x01b0, B:96:0x01cb, B:97:0x01d4, B:98:0x01d7, B:94:0x01c5, B:101:0x01db, B:105:0x01f1, B:119:0x0218, B:120:0x0222, B:121:0x0225, B:117:0x0212, B:124:0x022b, B:128:0x023f, B:142:0x0264, B:144:0x026e, B:145:0x0271, B:140:0x025e, B:148:0x0276, B:149:0x0286, B:156:0x02c5, B:158:0x02e2, B:159:0x02f1), top: B:222:0x032f }] */
    /* JADX WARN: Code duplicated, block: B:186:0x034a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0361  */
    /* JADX WARN: Code duplicated, block: B:196:0x0366 A[PHI: r6 r11 r13 r17 r19 r21
      0x0366: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r13v9 ??) = (r13v5 ??), (r13v7 ??), (r13v10 ??) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x0388  */
    /* JADX WARN: Code duplicated, block: B:208:0x039d  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:222:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x038e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [nb.k] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX INFO: renamed from: t */
    public final List m36587t(int i10) {
        Cursor cursor;
        ?? r13;
        ?? M36590w;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j10;
        ?? r17;
        ?? r16;
        long j11;
        String string;
        C9094g7 c9094g7;
        int i11;
        int i12;
        zzbe zzbeVarCreateFromParcel;
        zzah zzahVarCreateFromParcel;
        zzpl zzplVarCreateFromParcel;
        String str = "entry";
        String str2 = Payload.TYPE;
        String str3 = "rowid";
        mo36088h();
        ?? r8 = 0;
        if (this.f33260d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!m36591x()) {
            return arrayList;
        }
        int i13 = 0;
        int i14 = 5;
        int i15 = 0;
        for (int i16 = 5; i15 < i16; i16 = 5) {
            try {
                M36590w = m36590w();
                try {
                    if (M36590w == 0) {
                        this.f33260d = true;
                        return r8;
                    }
                    try {
                        M36590w.beginTransaction();
                        try {
                            cursorQuery2 = M36590w.query("messages", new String[]{str3}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                            try {
                                long j12 = -1;
                                if (cursorQuery2.moveToFirst()) {
                                    j10 = cursorQuery2.getLong(i13);
                                    cursorQuery2.close();
                                } else {
                                    cursorQuery2.close();
                                    j10 = -1;
                                }
                                if (j10 != -1) {
                                    String[] strArr = new String[1];
                                    strArr[i13] = String.valueOf(j10);
                                    r16 = "rowid<?";
                                    r17 = strArr;
                                } else {
                                    ?? r18 = r8;
                                    r17 = r18;
                                    r16 = r18;
                                }
                                String[] strArr2 = {str3, str2, str};
                                C9094g7 c9094g8 = this.f33067a;
                                ?? M36338w = c9094g8.m36338w();
                                int i17 = 1;
                                C9379y4 c9379y4 = C9395z4.f33765c1;
                                boolean zM36406H = M36338w.m36406H(r8, c9379y4);
                                int i18 = 4;
                                int i19 = 3;
                                int i20 = 2;
                                if (zM36406H) {
                                    strArr2 = new String[i16];
                                    strArr2[i13] = str3;
                                    strArr2[1] = str2;
                                    strArr2[2] = str;
                                    strArr2[3] = "app_version";
                                    strArr2[4] = "app_version_int";
                                }
                                String[] strArr3 = strArr2;
                                C9094g7 c9094g9 = c9094g8;
                                cursorQuery = M36590w.query("messages", strArr3, r16, r17, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j12 = cursorQuery.getLong(i13);
                                        int i21 = cursorQuery.getInt(i17);
                                        byte[] blob = cursorQuery.getBlob(i20);
                                        try {
                                            if (c9094g9.m36338w().m36406H(null, c9379y4)) {
                                                string = cursorQuery.getString(i19);
                                                j11 = cursorQuery.getLong(i18);
                                            } else {
                                                j11 = 0;
                                                string = null;
                                            }
                                            String str4 = str;
                                            long j13 = j11;
                                            str2 = str2;
                                            if (i21 == 0) {
                                                try {
                                                    Parcel parcelObtain = Parcel.obtain();
                                                    c9094g7 = c9094g9;
                                                    try {
                                                        str3 = str3;
                                                        try {
                                                            try {
                                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                                parcelObtain.setDataPosition(0);
                                                                zzbg zzbgVarCreateFromParcel = zzbg.CREATOR.createFromParcel(parcelObtain);
                                                                try {
                                                                    parcelObtain.recycle();
                                                                    if (zzbgVarCreateFromParcel != null) {
                                                                        arrayList.add(new C9188m5(zzbgVarCreateFromParcel, string, j13));
                                                                    }
                                                                    str = str4;
                                                                    i12 = 2;
                                                                    i11 = 3;
                                                                    i13 = 0;
                                                                } catch (SQLiteDatabaseLockedException unused) {
                                                                    str = str4;
                                                                    i13 = 0;
                                                                    SystemClock.sleep(i14);
                                                                    i14 += 20;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (M36590w != 0) {
                                                                        M36590w.close();
                                                                    }
                                                                    i15++;
                                                                    i13 = i13;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r8 = 0;
                                                                } catch (SQLiteFullException e10) {
                                                                    e = e10;
                                                                    str = str4;
                                                                    i13 = 0;
                                                                    this.f33067a.mo36321a().m37003o().m36912b("Error reading entries from local database", e);
                                                                    this.f33260d = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (M36590w != 0) {
                                                                        M36590w.close();
                                                                    }
                                                                    i15++;
                                                                    i13 = i13;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r8 = 0;
                                                                } catch (SQLiteException e11) {
                                                                    e = e11;
                                                                    str = str4;
                                                                    i13 = 0;
                                                                    if (M36590w != 0) {
                                                                        try {
                                                                            if (M36590w.inTransaction()) {
                                                                                M36590w.endTransaction();
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            cursor = cursorQuery;
                                                                            r13 = M36590w;
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                            if (r13 != 0) {
                                                                                r13.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    this.f33067a.mo36321a().m37003o().m36912b("Error reading entries from local database", e);
                                                                    this.f33260d = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (M36590w != 0) {
                                                                        M36590w.close();
                                                                    }
                                                                    i15++;
                                                                    i13 = i13;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r8 = 0;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                parcelObtain.recycle();
                                                                throw th;
                                                            }
                                                        } catch (C9717a.a unused2) {
                                                            this.f33067a.mo36321a().m37003o().m36911a("Failed to load event from local database");
                                                            parcelObtain.recycle();
                                                        }
                                                    } catch (C9717a.a unused3) {
                                                        str3 = str3;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                    str3 = str3;
                                                } catch (SQLiteFullException e12) {
                                                    e = e12;
                                                    str3 = str3;
                                                } catch (SQLiteException e13) {
                                                    e = e13;
                                                    str3 = str3;
                                                }
                                            } else {
                                                c9094g7 = c9094g9;
                                                str3 = str3;
                                                if (i21 == 1) {
                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                    try {
                                                        try {
                                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                                            parcelObtain2.setDataPosition(0);
                                                            zzplVarCreateFromParcel = zzpl.CREATOR.createFromParcel(parcelObtain2);
                                                            parcelObtain2.recycle();
                                                        } catch (C9717a.a unused5) {
                                                            this.f33067a.mo36321a().m37003o().m36911a("Failed to load user property from local database");
                                                            parcelObtain2.recycle();
                                                            zzplVarCreateFromParcel = null;
                                                        }
                                                        if (zzplVarCreateFromParcel != null) {
                                                            arrayList.add(new C9188m5(zzplVarCreateFromParcel, string, j13));
                                                        }
                                                        str = str4;
                                                        i12 = 2;
                                                        i11 = 3;
                                                        i13 = 0;
                                                    } catch (Throwable th5) {
                                                        parcelObtain2.recycle();
                                                        throw th5;
                                                    }
                                                } else {
                                                    i12 = 2;
                                                    if (i21 == 2) {
                                                        Parcel parcelObtain3 = Parcel.obtain();
                                                        try {
                                                            str = str4;
                                                            try {
                                                                try {
                                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain3.setDataPosition(0);
                                                                    zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                    try {
                                                                        parcelObtain3.recycle();
                                                                        if (zzahVarCreateFromParcel != null) {
                                                                            arrayList.add(new C9188m5(zzahVarCreateFromParcel, string, j13));
                                                                        }
                                                                        i11 = 3;
                                                                        i13 = 0;
                                                                    } catch (SQLiteDatabaseLockedException unused6) {
                                                                        i13 = 0;
                                                                        SystemClock.sleep(i14);
                                                                        i14 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (M36590w != 0) {
                                                                            M36590w.close();
                                                                        }
                                                                        i15++;
                                                                        i13 = i13;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r8 = 0;
                                                                    } catch (SQLiteFullException e14) {
                                                                        e = e14;
                                                                        i13 = 0;
                                                                        this.f33067a.mo36321a().m37003o().m36912b("Error reading entries from local database", e);
                                                                        this.f33260d = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (M36590w != 0) {
                                                                            M36590w.close();
                                                                        }
                                                                        i15++;
                                                                        i13 = i13;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r8 = 0;
                                                                    } catch (SQLiteException e15) {
                                                                        e = e15;
                                                                        i13 = 0;
                                                                        if (M36590w != 0) {
                                                                            if (M36590w.inTransaction()) {
                                                                                M36590w.endTransaction();
                                                                            }
                                                                        }
                                                                        this.f33067a.mo36321a().m37003o().m36912b("Error reading entries from local database", e);
                                                                        this.f33260d = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (M36590w != 0) {
                                                                            M36590w.close();
                                                                        }
                                                                        i15++;
                                                                        i13 = i13;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r8 = 0;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    parcelObtain3.recycle();
                                                                    throw th;
                                                                }
                                                            } catch (C9717a.a unused7) {
                                                                this.f33067a.mo36321a().m37003o().m36911a("Failed to load conditional user property from local database");
                                                                parcelObtain3.recycle();
                                                                zzahVarCreateFromParcel = null;
                                                            }
                                                        } catch (C9717a.a unused8) {
                                                            str = str4;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            str = str4;
                                                        }
                                                    } else {
                                                        str = str4;
                                                        if (i21 == 4) {
                                                            Parcel parcelObtain4 = Parcel.obtain();
                                                            try {
                                                                i13 = 0;
                                                                try {
                                                                    try {
                                                                        parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                        parcelObtain4.setDataPosition(0);
                                                                        zzbeVarCreateFromParcel = zzbe.CREATOR.createFromParcel(parcelObtain4);
                                                                        try {
                                                                            parcelObtain4.recycle();
                                                                            if (zzbeVarCreateFromParcel != null) {
                                                                                arrayList.add(new C9188m5(zzbeVarCreateFromParcel, string, j13));
                                                                            }
                                                                            i11 = 3;
                                                                        } catch (SQLiteDatabaseLockedException unused9) {
                                                                            SystemClock.sleep(i14);
                                                                            i14 += 20;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (M36590w != 0) {
                                                                                M36590w.close();
                                                                            }
                                                                            i15++;
                                                                            i13 = i13;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r8 = 0;
                                                                        } catch (SQLiteFullException e16) {
                                                                            e = e16;
                                                                            this.f33067a.mo36321a().m37003o().m36912b("Error reading entries from local database", e);
                                                                            this.f33260d = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (M36590w != 0) {
                                                                                M36590w.close();
                                                                            }
                                                                            i15++;
                                                                            i13 = i13;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r8 = 0;
                                                                        } catch (SQLiteException e17) {
                                                                            e = e17;
                                                                            if (M36590w != 0) {
                                                                                if (M36590w.inTransaction()) {
                                                                                    M36590w.endTransaction();
                                                                                }
                                                                            }
                                                                            this.f33067a.mo36321a().m37003o().m36912b("Error reading entries from local database", e);
                                                                            this.f33260d = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (M36590w != 0) {
                                                                                M36590w.close();
                                                                            }
                                                                            i15++;
                                                                            i13 = i13;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r8 = 0;
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        parcelObtain4.recycle();
                                                                        throw th;
                                                                    }
                                                                } catch (C9717a.a unused10) {
                                                                    this.f33067a.mo36321a().m37003o().m36911a("Failed to load default event parameters from local database");
                                                                    parcelObtain4.recycle();
                                                                    zzbeVarCreateFromParcel = null;
                                                                }
                                                            } catch (C9717a.a unused11) {
                                                                i13 = 0;
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } else {
                                                            i11 = 3;
                                                            i13 = 0;
                                                            if (i21 == 3) {
                                                                this.f33067a.mo36321a().m37011w().m36911a("Skipping app launch break");
                                                            } else {
                                                                this.f33067a.mo36321a().m37003o().m36911a("Unknown record type in local database");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i19 = i11;
                                            i13 = i13;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                            i17 = 1;
                                            i18 = 4;
                                            i20 = i12;
                                            c9094g9 = c9094g7;
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteFullException e18) {
                                            e = e18;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteException e19) {
                                            e = e19;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused13) {
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i13 = i13;
                                    } catch (SQLiteFullException e20) {
                                        e = e20;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i13 = i13;
                                    } catch (SQLiteException e21) {
                                        e = e21;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i13 = i13;
                                    }
                                }
                                if (M36590w.delete("messages", "rowid <= ?", new String[]{Long.toString(j12)}) < arrayList.size()) {
                                    this.f33067a.mo36321a().m37003o().m36911a("Fewer entries removed from local database than expected");
                                }
                                M36590w.setTransactionSuccessful();
                                M36590w.endTransaction();
                                cursorQuery.close();
                                M36590w.close();
                                return arrayList;
                            } catch (Throwable th10) {
                                th = th10;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused14) {
                                        cursorQuery = null;
                                        SystemClock.sleep(i14);
                                        i14 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (M36590w != 0) {
                                            M36590w.close();
                                        }
                                        i15++;
                                        i13 = i13;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r8 = 0;
                                    } catch (SQLiteFullException e22) {
                                        e = e22;
                                        M36590w = M36590w;
                                        cursorQuery = null;
                                        this.f33067a.mo36321a().m37003o().m36912b("Error reading entries from local database", e);
                                        this.f33260d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (M36590w != 0) {
                                            M36590w.close();
                                        }
                                        i15++;
                                        i13 = i13;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r8 = 0;
                                    } catch (SQLiteException e23) {
                                        e = e23;
                                        M36590w = M36590w;
                                        cursorQuery = null;
                                        if (M36590w != 0) {
                                            if (M36590w.inTransaction()) {
                                                M36590w.endTransaction();
                                            }
                                        }
                                        this.f33067a.mo36321a().m37003o().m36912b("Error reading entries from local database", e);
                                        this.f33260d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (M36590w != 0) {
                                            M36590w.close();
                                        }
                                        i15++;
                                        i13 = i13;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r8 = 0;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            cursorQuery2 = null;
                        }
                    } catch (SQLiteDatabaseLockedException unused15) {
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i13 = i13;
                    } catch (SQLiteFullException e24) {
                        e = e24;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i13 = i13;
                        M36590w = M36590w;
                    } catch (SQLiteException e25) {
                        e = e25;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i13 = i13;
                        M36590w = M36590w;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    cursor = null;
                    r13 = M36590w;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (r13 != 0) {
                        r13.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused16) {
                str = str;
                str2 = str2;
                str3 = str3;
                i13 = i13;
                M36590w = 0;
            } catch (SQLiteFullException e26) {
                e = e26;
                str = str;
                str2 = str2;
                str3 = str3;
                i13 = i13;
                M36590w = 0;
            } catch (SQLiteException e27) {
                e = e27;
                str = str;
                str2 = str2;
                str3 = str3;
                i13 = i13;
                M36590w = 0;
            } catch (Throwable th13) {
                th = th13;
                cursor = null;
                r13 = 0;
            }
        }
        this.f33067a.mo36321a().m37006r().m36911a("Failed to read events from database in reasonable time");
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m36588u() {
        return m36592z(3, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[PHI: r4
      0x0068: PHI (r4v4 int) = (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:28:0x0066, B:25:0x005f, B:32:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: v */
    public final boolean m36589v() {
        mo36088h();
        if (!this.f33260d && m36591x()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseM36590w = m36590w();
                            if (sQLiteDatabaseM36590w != null) {
                                sQLiteDatabaseM36590w.beginTransaction();
                                sQLiteDatabaseM36590w.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseM36590w.setTransactionSuccessful();
                                sQLiteDatabaseM36590w.endTransaction();
                                sQLiteDatabaseM36590w.close();
                                return true;
                            }
                            this.f33260d = true;
                        } catch (SQLiteFullException e10) {
                            this.f33067a.mo36321a().m37003o().m36912b("Error deleting app launch break from local database", e10);
                            this.f33260d = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteException e11) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th2) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th2;
                            }
                        }
                        this.f33067a.mo36321a().m37003o().m36912b("Error deleting app launch break from local database", e11);
                        this.f33260d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i10);
                    i10 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f33067a.mo36321a().m37006r().m36911a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final SQLiteDatabase m36590w() {
        if (this.f33260d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f33259c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f33260d = true;
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m36591x() {
        C9094g7 c9094g7 = this.f33067a;
        Context contextMo36324d = c9094g7.mo36324d();
        c9094g7.m36338w();
        return contextMo36324d.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0193  */
    /* JADX WARN: Code duplicated, block: B:107:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131 A[Catch: all -> 0x0164, TryCatch #1 {all -> 0x0164, blocks: (B:30:0x008d, B:32:0x0093, B:43:0x00b3, B:45:0x00d7, B:47:0x00e1, B:49:0x00e9, B:59:0x0103, B:73:0x012b, B:75:0x0131, B:76:0x0134, B:93:0x016b, B:83:0x0154), top: B:107:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:86:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160 A[PHI: r8 r10 r17
      0x0160: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v7 android.database.sqlite.SQLiteDatabase)
      (r10v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x017f  */
    /* JADX INFO: renamed from: z */
    public final boolean m36592z(int i10, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM36590w;
        boolean z10;
        boolean z11;
        Cursor cursorRawQuery;
        mo36088h();
        boolean z12 = false;
        z12 = false;
        if (!this.f33260d) {
            C9094g7 c9094g7 = this.f33067a;
            C9150k c9150kM36338w = c9094g7.m36338w();
            C9379y4 c9379y4 = C9395z4.f33765c1;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarM36430o = c9150kM36338w.m36406H(null, c9379y4) ? this.f33067a.m36317L().m36430o(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put(Payload.TYPE, Integer.valueOf(i10));
            contentValues.put("entry", bArr);
            if (c9094g7.m36338w().m36406H(null, c9379y4) && zzrVarM36430o != null) {
                contentValues.put("app_version", zzrVarM36430o.f9537h);
                contentValues.put("app_version_int", Long.valueOf(zzrVarM36430o.f9544o));
            }
            c9094g7.m36338w();
            int i11 = 0;
            int i12 = 5;
            for (int i13 = 5; i11 < i13; i13 = 5) {
                try {
                    sQLiteDatabaseM36590w = m36590w();
                    if (sQLiteDatabaseM36590w == null) {
                        this.f33260d = true;
                    } else {
                        try {
                            sQLiteDatabaseM36590w.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseM36590w.rawQuery("select count(1) from messages", null);
                            long j10 = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    if (cursorRawQuery.moveToFirst()) {
                                        j10 = cursorRawQuery.getLong(z12 ? 1 : 0);
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z10 = z12 ? 1 : 0;
                                    SystemClock.sleep(i12);
                                    i12 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM36590w != null) {
                                        sQLiteDatabaseM36590w.close();
                                    }
                                    i11++;
                                    z12 = z10;
                                } catch (SQLiteFullException e10) {
                                    e = e10;
                                    z10 = z12 ? 1 : 0;
                                    this.f33067a.mo36321a().m37003o().m36912b("Error writing entry; local database full", e);
                                    this.f33260d = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM36590w != null) {
                                        sQLiteDatabaseM36590w.close();
                                    }
                                    i11++;
                                    z12 = z10;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                    if (sQLiteDatabaseM36590w != null) {
                                        try {
                                            if (sQLiteDatabaseM36590w.inTransaction()) {
                                                sQLiteDatabaseM36590w.endTransaction();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursorRawQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM36590w != null) {
                                                sQLiteDatabaseM36590w.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.f33067a.mo36321a().m37003o().m36912b("Error writing entry to local database", e);
                                    this.f33260d = z11;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM36590w != null) {
                                        sQLiteDatabaseM36590w.close();
                                    }
                                    i11++;
                                    z12 = z10;
                                }
                            }
                            if (j10 >= 100000) {
                                c9094g7.mo36321a().m37003o().m36911a("Data loss, local db full");
                                long j11 = 100001 - j10;
                                long jDelete = sQLiteDatabaseM36590w.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j11)});
                                if (jDelete != j11) {
                                    C9316u5 c9316u5M37003o = c9094g7.mo36321a().m37003o();
                                    z10 = z12 ? 1 : 0;
                                    try {
                                        try {
                                            z11 = true;
                                            try {
                                                c9316u5M37003o.m36914d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j11), Long.valueOf(jDelete), Long.valueOf(j11 - jDelete));
                                            } catch (SQLiteFullException e12) {
                                                e = e12;
                                                this.f33067a.mo36321a().m37003o().m36912b("Error writing entry; local database full", e);
                                                this.f33260d = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM36590w != null) {
                                                    sQLiteDatabaseM36590w.close();
                                                }
                                                i11++;
                                                z12 = z10;
                                            } catch (SQLiteException e13) {
                                                e = e13;
                                                if (sQLiteDatabaseM36590w != null) {
                                                    if (sQLiteDatabaseM36590w.inTransaction()) {
                                                        sQLiteDatabaseM36590w.endTransaction();
                                                    }
                                                }
                                                this.f33067a.mo36321a().m37003o().m36912b("Error writing entry to local database", e);
                                                this.f33260d = z11;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM36590w != null) {
                                                    sQLiteDatabaseM36590w.close();
                                                }
                                                i11++;
                                                z12 = z10;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i12);
                                            i12 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM36590w != null) {
                                                sQLiteDatabaseM36590w.close();
                                            }
                                            i11++;
                                            z12 = z10;
                                        }
                                    } catch (SQLiteFullException e14) {
                                        e = e14;
                                        this.f33067a.mo36321a().m37003o().m36912b("Error writing entry; local database full", e);
                                        this.f33260d = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM36590w != null) {
                                            sQLiteDatabaseM36590w.close();
                                        }
                                        i11++;
                                        z12 = z10;
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        z11 = true;
                                        if (sQLiteDatabaseM36590w != null) {
                                            if (sQLiteDatabaseM36590w.inTransaction()) {
                                                sQLiteDatabaseM36590w.endTransaction();
                                            }
                                        }
                                        this.f33067a.mo36321a().m37003o().m36912b("Error writing entry to local database", e);
                                        this.f33260d = z11;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM36590w != null) {
                                            sQLiteDatabaseM36590w.close();
                                        }
                                        i11++;
                                        z12 = z10;
                                    }
                                } else {
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                }
                            } else {
                                z10 = z12 ? 1 : 0;
                                z11 = true;
                            }
                            sQLiteDatabaseM36590w.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseM36590w.setTransactionSuccessful();
                            sQLiteDatabaseM36590w.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseM36590w.close();
                            return z11;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z10 = z12 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e16) {
                            e = e16;
                            z10 = z12 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e17) {
                            e = e17;
                            z10 = z12 ? 1 : 0;
                            z11 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabaseM36590w != null) {
                                sQLiteDatabaseM36590w.close();
                            }
                            throw th;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabaseM36590w = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e18) {
                    e = e18;
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabaseM36590w = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e19) {
                    e = e19;
                    z10 = z12 ? 1 : 0;
                    z11 = true;
                    sQLiteDatabaseM36590w = null;
                    cursorRawQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabaseM36590w = null;
                }
            }
            boolean z13 = z12 ? 1 : 0;
            this.f33067a.mo36321a().m37011w().m36911a("Failed to write entry to local database");
            return z13;
        }
        return z12;
    }
}
