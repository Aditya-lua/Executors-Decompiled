package p125fb;

import p305n9.C8935g;

/* JADX INFO: renamed from: fb.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5560s0 {

    /* JADX INFO: renamed from: a */
    public static final C8935g f21353a = new C8935g("Games");

    /* JADX INFO: renamed from: a */
    public static void m25220a(String str, String str2) {
        f21353a.m36002b(m25227h(str), str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m25221b(String str, String str2, Throwable th2) {
        f21353a.m36003c(m25227h("GamesApiManager"), "Authentication task failed", th2);
    }

    /* JADX INFO: renamed from: c */
    public static void m25222c(String str, String str2) {
        f21353a.m36007g(m25227h(str), str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m25223d(String str, String str2) {
        f21353a.m36008h(m25227h(str), str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m25224e(String str, String str2, Throwable th2) {
        f21353a.m36009i(m25227h(str), str2, th2);
    }

    /* JADX INFO: renamed from: f */
    public static void m25225f(String str, String str2) {
        f21353a.m36004d(m25227h(str), str2);
    }

    /* JADX INFO: renamed from: g */
    public static void m25226g(String str, String str2, Throwable th2) {
        f21353a.m36005e(m25227h(str), str2, th2);
    }

    /* JADX INFO: renamed from: h */
    public static String m25227h(String str) {
        return String.format("%s[%s]", "PlayGamesServices", str);
    }
}
