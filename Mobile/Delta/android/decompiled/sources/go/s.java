package go;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18311a;

    public s(g gVar) {
        this.f18311a = gVar;
    }

    public static s a(g gVar) {
        return new s(gVar);
    }

    public static d c(g gVar) {
        return (d) ft.h.e(gVar.l());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f18311a);
    }
}
