package f8;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static void a(String str, String str2, Object obj) {
        String strD = d(str);
        if (Log.isLoggable(strD, 3)) {
            Log.d(strD, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        String strD = d(str);
        if (Log.isLoggable(strD, 3)) {
            Log.d(strD, String.format(str2, objArr));
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        String strD = d(str);
        if (Log.isLoggable(strD, 6)) {
            Log.e(strD, str2, th2);
        }
    }

    public static String d(String str) {
        return "TRuntime." + str;
    }

    public static void e(String str, String str2, Object obj) {
        String strD = d(str);
        if (Log.isLoggable(strD, 4)) {
            Log.i(strD, String.format(str2, obj));
        }
    }

    public static void f(String str, String str2, Object obj) {
        String strD = d(str);
        if (Log.isLoggable(strD, 5)) {
            Log.w(strD, String.format(str2, obj));
        }
    }
}
