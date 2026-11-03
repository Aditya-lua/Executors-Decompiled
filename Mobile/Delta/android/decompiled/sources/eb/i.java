package eb;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f15890a = new Object();
    public static volatile h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f15891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile h f15892d;

    public static void a() {
        f15891c = true;
    }

    public static void b() {
        if (f15892d == null) {
            f15892d = new h(null);
        }
    }

    public static void c() {
        if (b == null) {
            b = new h(null);
        }
    }

    public static boolean d() {
        synchronized (f15890a) {
        }
        return false;
    }
}
