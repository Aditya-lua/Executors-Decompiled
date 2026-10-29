package go;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18304a;

    public l(g gVar) {
        this.f18304a = gVar;
    }

    public static l a(g gVar) {
        return new l(gVar);
    }

    public static d b(g gVar) {
        return (d) ft.h.e(gVar.e());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f18304a);
    }
}
