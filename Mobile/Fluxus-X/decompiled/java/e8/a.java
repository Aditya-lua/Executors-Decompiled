package e8;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements yt.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f13234c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile yt.a<T> f13235a;
    public volatile Object b = f13234c;

    public a(yt.a<T> aVar) {
        this.f13235a = aVar;
    }

    public static <P extends yt.a<T>, T> yt.a<T> a(P p8) {
        d.b(p8);
        return p8 instanceof a ? p8 : new a(p8);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f13234c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // yt.a
    public T get() {
        T t8;
        T t10 = (T) this.b;
        Object obj = f13234c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t8 = (T) this.b;
                if (t8 == obj) {
                    t8 = this.f13235a.get();
                    this.b = b(this.b, t8);
                    this.f13235a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }
}
