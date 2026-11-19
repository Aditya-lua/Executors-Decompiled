package fb;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f15746a = new Object();
    public static volatile h b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f15747c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile h f15748d;

    public static void a() {
        f15747c = true;
    }

    public static void b() {
        if (f15748d == null) {
            f15748d = new h(null);
        }
    }

    public static void c() {
        if (b == null) {
            b = new h(null);
        }
    }

    public static boolean d() {
        synchronized (f15746a) {
        }
        return false;
    }
}
