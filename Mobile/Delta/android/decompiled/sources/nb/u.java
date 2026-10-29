package nb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[Catch: SQLiteException -> 0x00b9, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:26:0x0046, B:28:0x0076, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00b8, B:38:0x00be, B:40:0x00c1, B:42:0x00c9, B:43:0x00d0, B:44:0x00d3, B:46:0x00d9, B:49:0x00ea, B:50:0x00ee, B:27:0x006f), top: B:60:0x0046, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: SQLiteException -> 0x00b9, LOOP:0: B:29:0x0082->B:32:0x008c, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:26:0x0046, B:28:0x0076, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00b8, B:38:0x00be, B:40:0x00c1, B:42:0x00c9, B:43:0x00d0, B:44:0x00d3, B:46:0x00d9, B:49:0x00ea, B:50:0x00ee, B:27:0x006f), top: B:60:0x0046, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00be A[Catch: SQLiteException -> 0x00b9, LOOP:1: B:38:0x00be->B:43:0x00d0, LOOP_START, PHI: r1
      0x00be: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00bc, B:43:0x00d0] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:26:0x0046, B:28:0x0076, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00b8, B:38:0x00be, B:40:0x00c1, B:42:0x00c9, B:43:0x00d0, B:44:0x00d3, B:46:0x00d9, B:49:0x00ea, B:50:0x00ee, B:27:0x006f), top: B:60:0x0046, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1 A[Catch: SQLiteException -> 0x00b9, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:26:0x0046, B:28:0x0076, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00b8, B:38:0x00be, B:40:0x00c1, B:42:0x00c9, B:43:0x00d0, B:44:0x00d3, B:46:0x00d9, B:49:0x00ea, B:50:0x00ee, B:27:0x006f), top: B:60:0x0046, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9 A[Catch: SQLiteException -> 0x00b9, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:26:0x0046, B:28:0x0076, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00b8, B:38:0x00be, B:40:0x00c1, B:42:0x00c9, B:43:0x00d0, B:44:0x00d3, B:46:0x00d9, B:49:0x00ea, B:50:0x00ee, B:27:0x006f), top: B:60:0x0046, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9 A[Catch: SQLiteException -> 0x00b9, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:26:0x0046, B:28:0x0076, B:30:0x0084, B:32:0x008c, B:33:0x008f, B:34:0x00b8, B:38:0x00be, B:40:0x00c1, B:42:0x00c9, B:43:0x00d0, B:44:0x00d3, B:46:0x00d9, B:49:0x00ea, B:50:0x00ee, B:27:0x006f), top: B:60:0x0046, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:69:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    public static void a(w5 w5Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th2;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i10;
        int i11;
        if (w5Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        sQLiteDatabase2 = sQLiteDatabase;
                        try {
                            cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                            try {
                                try {
                                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                                    cursorQuery.close();
                                    if (!zMoveToFirst) {
                                        sQLiteDatabase2.execSQL(str2);
                                    }
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    w5Var.r().c("Error querying for table", str, e);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
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
                            w5Var.r().c("Error querying for table", str, e);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            sQLiteDatabase2.execSQL(str2);
                            hashSet = new HashSet();
                            StringBuilder sb2 = new StringBuilder(str.length() + 22);
                            sb2.append("SELECT * FROM ");
                            sb2.append(str);
                            sb2.append(" LIMIT 0");
                            cursorRawQuery = sQLiteDatabase2.rawQuery(sb2.toString(), null);
                            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                            cursorRawQuery.close();
                            for (String str4 : str3.split(",")) {
                                if (hashSet.remove(str4)) {
                                    StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                    sb3.append("Table ");
                                    sb3.append(str);
                                    sb3.append(" is missing required column: ");
                                    sb3.append(str4);
                                    throw new SQLiteException(sb3.toString());
                                }
                            }
                            if (strArr != null) {
                                for (i10 = 0; i10 < strArr.length; i10 += 2) {
                                    if (!hashSet.remove(strArr[i10])) {
                                        sQLiteDatabase2.execSQL(strArr[i10 + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                return;
                            }
                            w5Var.r().c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                            return;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (cursor != null) {
                            throw th2;
                        }
                        cursor.close();
                        throw th2;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    sQLiteDatabase2 = sQLiteDatabase;
                }
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i11 < r0) {
                    if (hashSet.remove(str4)) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb4.append("Table ");
                        sb4.append(str);
                        sb4.append(" is missing required column: ");
                        sb4.append(str4);
                        throw new SQLiteException(sb4.toString());
                    }
                }
                if (strArr != null) {
                    while (i10 < strArr.length) {
                        if (!hashSet.remove(strArr[i10])) {
                            sQLiteDatabase2.execSQL(strArr[i10 + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    w5Var.r().c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                    return;
                }
                return;
            } catch (Throwable th5) {
                cursorRawQuery.close();
                throw th5;
            }
            hashSet = new HashSet();
            StringBuilder sb5 = new StringBuilder(str.length() + 22);
            sb5.append("SELECT * FROM ");
            sb5.append(str);
            sb5.append(" LIMIT 0");
            cursorRawQuery = sQLiteDatabase2.rawQuery(sb5.toString(), null);
        } catch (SQLiteException e13) {
            w5Var.o().b("Failed to verify columns on table that was just created", str);
            throw e13;
        }
    }

    public static void b(w5 w5Var, SQLiteDatabase sQLiteDatabase) {
        if (w5Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.y0.a();
        String path = sQLiteDatabase.getPath();
        com.google.android.gms.internal.measurement.e1 e1Var = com.google.android.gms.internal.measurement.e1.f6422a;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            w5Var.r().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            w5Var.r().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            w5Var.r().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        w5Var.r().a("Failed to turn on database write permission for owner");
    }
}
