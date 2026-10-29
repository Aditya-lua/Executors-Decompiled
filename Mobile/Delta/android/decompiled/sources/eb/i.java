package eb;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f15276a = new Object();
    public static volatile h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f15277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile h f15278d;

    public static void a() {
        f15277c = true;
    }

    public static void b() {
        if (f15278d == null) {
            f15278d = new h(null);
        }
    }

    public static void c() {
        if (b == null) {
            b = new h(null);
        }
    }

    public static boolean d() {
        synchronized (f15276a) {
        }
        return false;
    }
}
