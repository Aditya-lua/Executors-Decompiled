package yn;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ft.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f36001a;
    public final ft.i<t> b;

    public i(e eVar, ft.i<t> iVar) {
        this.f36001a = eVar;
        this.b = iVar;
    }

    public static i a(e eVar, ft.i<t> iVar) {
        return new i(eVar, iVar);
    }

    public static d b(e eVar, t tVar) {
        return (d) ft.h.e(eVar.d(tVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f36001a, this.b.get());
    }
}
