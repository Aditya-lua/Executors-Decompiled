package go;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18309a;

    public q(g gVar) {
        this.f18309a = gVar;
    }

    public static q a(g gVar) {
        return new q(gVar);
    }

    public static d c(g gVar) {
        return (d) ft.h.e(gVar.j());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f18309a);
    }
}
