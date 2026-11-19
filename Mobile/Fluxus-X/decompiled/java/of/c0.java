package of;

/* JADX INFO: loaded from: classes2.dex */
public class c0<T> implements ag.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ag.a<Object> f28079c = new ag.a() { // from class: of.a0
        @Override // ag.a
        public final void a(ag.b bVar) {
            c0.b(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ag.b<Object> f28080d = new ag.b() { // from class: of.b0
        @Override // ag.b
        public final Object get() {
            return c0.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ag.a<T> f28081a;
    public volatile ag.b<T> b;

    public c0(ag.a<T> aVar, ag.b<T> bVar) {
        this.f28081a = aVar;
        this.b = bVar;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public static /* synthetic */ void b(ag.b bVar) {
    }

    public static <T> c0<T> c() {
        return new c0<>(f28079c, f28080d);
    }

    public void d(ag.b<T> bVar) {
        ag.a<T> aVar;
        if (this.b != f28080d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f28081a;
            this.f28081a = null;
            this.b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // ag.b
    public T get() {
        return this.b.get();
    }
}
