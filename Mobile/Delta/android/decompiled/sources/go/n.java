package go;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18306a;

    public n(g gVar) {
        this.f18306a = gVar;
    }

    public static n a(g gVar) {
        return new n(gVar);
    }

    public static d c(g gVar) {
        return (d) ft.h.e(gVar.g());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f18306a);
    }
}
