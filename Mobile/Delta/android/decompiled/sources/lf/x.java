package lf;

/* JADX INFO: loaded from: classes2.dex */
public class x<T> implements xf.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f23182c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f23183a = f23182c;
    public volatile xf.b<T> b;

    public x(xf.b<T> bVar) {
        this.b = bVar;
    }

    @Override // xf.b
    public T get() {
        T t8;
        T t10 = (T) this.f23183a;
        Object obj = f23182c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t8 = (T) this.f23183a;
                if (t8 == obj) {
                    t8 = this.b.get();
                    this.f23183a = t8;
                    this.b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }
}
