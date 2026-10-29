package go;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18303a;

    public k(g gVar) {
        this.f18303a = gVar;
    }

    public static k a(g gVar) {
        return new k(gVar);
    }

    public static d b(g gVar) {
        return (d) ft.h.e(gVar.d());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f18303a);
    }
}
