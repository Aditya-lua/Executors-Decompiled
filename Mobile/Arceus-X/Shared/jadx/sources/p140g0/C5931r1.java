package p140g0;

import android.util.Log;

/* JADX INFO: renamed from: g0.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5931r1 {

    /* JADX INFO: renamed from: a */
    public static int f22600a = 3;

    /* JADX INFO: renamed from: a */
    public static void m26561a(String str, String str2) {
        String strM26571k = m26571k(str);
        if (m26567g(strM26571k, 3)) {
            Log.d(strM26571k, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m26562b(String str, String str2, Throwable th2) {
        String strM26571k = m26571k(str);
        if (m26567g(strM26571k, 3)) {
            Log.d(strM26571k, str2, th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m26563c(String str, String str2) {
        String strM26571k = m26571k(str);
        if (m26567g(strM26571k, 6)) {
            Log.e(strM26571k, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m26564d(String str, String str2, Throwable th2) {
        String strM26571k = m26571k(str);
        if (m26567g(strM26571k, 6)) {
            Log.e(strM26571k, str2, th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m26565e(String str, String str2) {
        String strM26571k = m26571k(str);
        if (m26567g(strM26571k, 4)) {
            Log.i(strM26571k, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m26566f(String str) {
        return m26567g(m26571k(str), 3);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m26567g(String str, int i10) {
        return f22600a <= i10 || Log.isLoggable(str, i10);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m26568h(String str) {
        return m26567g(m26571k(str), 2);
    }

    /* JADX INFO: renamed from: i */
    public static void m26569i() {
        f22600a = 3;
    }

    /* JADX INFO: renamed from: j */
    public static void m26570j(int i10) {
        f22600a = i10;
    }

    /* JADX INFO: renamed from: k */
    public static String m26571k(String str) {
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static void m26572l(String str, String str2) {
        String strM26571k = m26571k(str);
        if (m26567g(strM26571k, 5)) {
            Log.w(strM26571k, str2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m26573m(String str, String str2, Throwable th2) {
        String strM26571k = m26571k(str);
        if (m26567g(strM26571k, 5)) {
            Log.w(strM26571k, str2, th2);
        }
    }
}
