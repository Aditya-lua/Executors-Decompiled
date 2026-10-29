package v7;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f32808a = false;
    public static long b = 3000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f32809c = 30000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f32810d = 3;

    public static int a() {
        return f32810d;
    }

    public static long b() {
        return f32809c;
    }

    public static long c() {
        return b;
    }

    public static void d(long j10) {
        f32809c = j10;
    }

    public static void e(int i10) {
        f32810d = i10;
    }

    public static void f(long j10) {
        b = j10;
    }

    public static void g(boolean z10) {
        f32808a = z10;
    }
}
