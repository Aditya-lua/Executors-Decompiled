package d8;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements ft.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f14465c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ft.a<T> f14466a;
    public volatile Object b = f14465c;

    public a(ft.a<T> aVar) {
        this.f14466a = aVar;
    }

    public static <P extends ft.a<T>, T> ft.a<T> a(P p8) {
        d.b(p8);
        return p8 instanceof a ? p8 : new a(p8);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f14465c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ft.a
    public T get() {
        T t8;
        T t10 = (T) this.b;
        Object obj = f14465c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t8 = (T) this.b;
                if (t8 == obj) {
                    t8 = this.f14466a.get();
                    this.b = b(this.b, t8);
                    this.f14466a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }
}
