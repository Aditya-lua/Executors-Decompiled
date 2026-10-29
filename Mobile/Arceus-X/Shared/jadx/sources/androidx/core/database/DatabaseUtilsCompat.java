package androidx.core.database;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class DatabaseUtilsCompat {
    private DatabaseUtilsCompat() {
    }

    @Deprecated
    public static String concatenateWhere(String a10, String b) {
        if (TextUtils.isEmpty(a10)) {
            return b;
        }
        if (TextUtils.isEmpty(b)) {
            return a10;
        }
        return "(" + a10 + ") AND (" + b + ")";
    }

    @Deprecated
    public static String[] appendSelectionArgs(String[] originalValues, String[] newValues) {
        if (originalValues == null || originalValues.length == 0) {
            return newValues;
        }
        String[] result = new String[originalValues.length + newValues.length];
        System.arraycopy(originalValues, 0, result, 0, originalValues.length);
        System.arraycopy(newValues, 0, result, originalValues.length, newValues.length);
        return result;
    }
}
