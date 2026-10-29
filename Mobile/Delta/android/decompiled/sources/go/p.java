package go;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18308a;

    public p(g gVar) {
        this.f18308a = gVar;
    }

    public static p a(g gVar) {
        return new p(gVar);
    }

    public static d c(g gVar) {
        return (d) ft.h.e(gVar.i());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f18308a);
    }
}
