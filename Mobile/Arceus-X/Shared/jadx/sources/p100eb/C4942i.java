package p100eb;

/* JADX INFO: renamed from: eb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4942i {

    /* JADX INFO: renamed from: a */
    public static final Object f19664a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile C4936h f19665b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f19666c;

    /* JADX INFO: renamed from: d */
    public static volatile C4936h f19667d;

    /* JADX INFO: renamed from: a */
    public static void m23630a() {
        f19666c = true;
    }

    /* JADX INFO: renamed from: b */
    public static void m23631b() {
        if (f19667d == null) {
            f19667d = new C4936h(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m23632c() {
        if (f19665b == null) {
            f19665b = new C4936h(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m23633d() {
        synchronized (f19664a) {
        }
        return false;
    }
}
