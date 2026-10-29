package go;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18301a;

    public i(g gVar) {
        this.f18301a = gVar;
    }

    public static i a(g gVar) {
        return new i(gVar);
    }

    public static d b(g gVar) {
        return (d) ft.h.e(gVar.b());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f18301a);
    }
}
