package wk;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f34440a = new Object();
    public static a b;

    public static a a() {
        synchronized (f34440a) {
            try {
                a aVar = b;
                if (aVar != null) {
                    return aVar;
                }
                b bVar = new b();
                b = bVar;
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(a aVar) {
        synchronized (f34440a) {
            b = aVar;
        }
    }
}
