package ft;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements i<T>, ct.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17226c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile i<T> f17227a;
    public volatile Object b = f17226c;

    public c(i<T> iVar) {
        this.f17227a = iVar;
    }

    public static <T> ct.a<T> b(i<T> iVar) {
        return iVar instanceof ct.a ? (ct.a) iVar : new c((i) h.b(iVar));
    }

    public static <T> i<T> c(i<T> iVar) {
        h.b(iVar);
        return iVar instanceof c ? iVar : new c(iVar);
    }

    private static Object d(Object obj, Object obj2) {
        if (obj == f17226c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public final synchronized Object a() {
        Object obj;
        obj = this.b;
        if (obj == f17226c) {
            obj = this.f17227a.get();
            this.b = d(this.b, obj);
            this.f17227a = null;
        }
        return obj;
    }

    @Override // ht.a
    public T get() {
        T t8 = (T) this.b;
        return t8 == f17226c ? (T) a() : t8;
    }
}
