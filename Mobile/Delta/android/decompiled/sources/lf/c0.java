package lf;

/* JADX INFO: loaded from: classes2.dex */
public class c0<T> implements xf.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xf.a<Object> f23142c = new xf.a() { // from class: lf.a0
        @Override // xf.a
        public final void a(xf.b bVar) {
            c0.b(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xf.b<Object> f23143d = new xf.b() { // from class: lf.b0
        @Override // xf.b
        public final Object get() {
            return c0.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xf.a<T> f23144a;
    public volatile xf.b<T> b;

    public c0(xf.a<T> aVar, xf.b<T> bVar) {
        this.f23144a = aVar;
        this.b = bVar;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public static /* synthetic */ void b(xf.b bVar) {
    }

    public static <T> c0<T> c() {
        return new c0<>(f23142c, f23143d);
    }

    public void d(xf.b<T> bVar) {
        xf.a<T> aVar;
        if (this.b != f23143d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f23144a;
            this.f23144a = null;
            this.b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // xf.b
    public T get() {
        return this.b.get();
    }
}
