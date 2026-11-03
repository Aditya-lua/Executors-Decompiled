package mf;

/* JADX INFO: loaded from: classes2.dex */
public class x<T> implements yf.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f24756c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f24757a = f24756c;
    public volatile yf.b<T> b;

    public x(yf.b<T> bVar) {
        this.b = bVar;
    }

    @Override // yf.b
    public T get() {
        T t8;
        T t10 = (T) this.f24757a;
        Object obj = f24756c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t8 = (T) this.f24757a;
                if (t8 == obj) {
                    t8 = this.b.get();
                    this.f24757a = t8;
                    this.b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }
}
