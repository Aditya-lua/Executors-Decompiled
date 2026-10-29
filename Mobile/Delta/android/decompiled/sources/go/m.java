package go;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18305a;

    public m(g gVar) {
        this.f18305a = gVar;
    }

    public static m a(g gVar) {
        return new m(gVar);
    }

    public static d c(g gVar) {
        return (d) ft.h.e(gVar.f());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f18305a);
    }
}
