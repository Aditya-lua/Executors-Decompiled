package gb;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o9.k f17671a = new o9.k("Games");

    public static void a(String str, String str2) {
        f17671a.b(h(str), str2);
    }

    public static void b(String str, String str2, Throwable th2) {
        f17671a.c(h("GamesApiManager"), "Authentication task failed", th2);
    }

    public static void c(String str, String str2) {
        f17671a.g(h(str), str2);
    }

    public static void d(String str, String str2) {
        f17671a.h(h(str), str2);
    }

    public static void e(String str, String str2, Throwable th2) {
        f17671a.i(h(str), str2, th2);
    }

    public static void f(String str, String str2) {
        f17671a.d(h(str), str2);
    }

    public static void g(String str, String str2, Throwable th2) {
        f17671a.e(h(str), str2, th2);
    }

    public static String h(String str) {
        return String.format("%s[%s]", "PlayGamesServices", str);
    }
}
