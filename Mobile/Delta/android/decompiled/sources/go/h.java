package go;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18300a;

    public h(g gVar) {
        this.f18300a = gVar;
    }

    public static d a(g gVar) {
        return (d) ft.h.e(gVar.a());
    }

    public static h b(g gVar) {
        return new h(gVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return a(this.f18300a);
    }
}
