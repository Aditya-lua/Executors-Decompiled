package wt;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements i<T>, tt.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f36000c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile i<T> f36001a;
    public volatile Object b = f36000c;

    public c(i<T> iVar) {
        this.f36001a = iVar;
    }

    public static <T> tt.a<T> b(i<T> iVar) {
        return iVar instanceof tt.a ? (tt.a) iVar : new c((i) h.b(iVar));
    }

    public static <T> i<T> c(i<T> iVar) {
        h.b(iVar);
        return iVar instanceof c ? iVar : new c(iVar);
    }

    private static Object d(Object obj, Object obj2) {
        if (obj == f36000c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public final synchronized Object a() {
        Object obj;
        obj = this.b;
        if (obj == f36000c) {
            obj = this.f36001a.get();
            this.b = d(this.b, obj);
            this.f36001a = null;
        }
        return obj;
    }

    @Override // yt.a
    public T get() {
        T t8 = (T) this.b;
        return t8 == f36000c ? (T) a() : t8;
    }
}
