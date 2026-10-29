package go;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18307a;

    public o(g gVar) {
        this.f18307a = gVar;
    }

    public static o a(g gVar) {
        return new o(gVar);
    }

    public static d c(g gVar) {
        return (d) ft.h.e(gVar.h());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f18307a);
    }
}
