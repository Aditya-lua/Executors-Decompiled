package p122f8;

import android.util.Log;

/* JADX INFO: renamed from: f8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5488a {
    /* JADX INFO: renamed from: a */
    public static void m25128a(String str, String str2, Object obj) {
        String strM25131d = m25131d(str);
        if (Log.isLoggable(strM25131d, 3)) {
            Log.d(strM25131d, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25129b(String str, String str2, Object... objArr) {
        String strM25131d = m25131d(str);
        if (Log.isLoggable(strM25131d, 3)) {
            Log.d(strM25131d, String.format(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m25130c(String str, String str2, Throwable th2) {
        String strM25131d = m25131d(str);
        if (Log.isLoggable(strM25131d, 6)) {
            Log.e(strM25131d, str2, th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m25131d(String str) {
        return "TRuntime." + str;
    }

    /* JADX INFO: renamed from: e */
    public static void m25132e(String str, String str2, Object obj) {
        String strM25131d = m25131d(str);
        if (Log.isLoggable(strM25131d, 4)) {
            Log.i(strM25131d, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m25133f(String str, String str2, Object obj) {
        String strM25131d = m25131d(str);
        if (Log.isLoggable(strM25131d, 5)) {
            Log.w(strM25131d, String.format(str2, obj));
        }
    }
}
