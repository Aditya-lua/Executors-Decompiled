package go;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18310a;

    public r(g gVar) {
        this.f18310a = gVar;
    }

    public static r a(g gVar) {
        return new r(gVar);
    }

    public static d c(g gVar) {
        return (d) ft.h.e(gVar.k());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f18310a);
    }
}
