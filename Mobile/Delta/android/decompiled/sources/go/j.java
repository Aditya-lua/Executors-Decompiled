package go;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18302a;

    public j(g gVar) {
        this.f18302a = gVar;
    }

    public static j a(g gVar) {
        return new j(gVar);
    }

    public static d b(g gVar) {
        return (d) ft.h.e(gVar.c());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f18302a);
    }
}
