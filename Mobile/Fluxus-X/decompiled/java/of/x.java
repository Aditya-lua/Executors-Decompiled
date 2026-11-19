package of;

/* JADX INFO: loaded from: classes2.dex */
public class x<T> implements ag.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28119c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f28120a = f28119c;
    public volatile ag.b<T> b;

    public x(ag.b<T> bVar) {
        this.b = bVar;
    }

    @Override // ag.b
    public T get() {
        T t8;
        T t10 = (T) this.f28120a;
        Object obj = f28119c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t8 = (T) this.f28120a;
                if (t8 == obj) {
                    t8 = this.b.get();
                    this.f28120a = t8;
                    this.b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }
}
