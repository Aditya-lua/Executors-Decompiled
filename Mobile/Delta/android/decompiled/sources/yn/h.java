package yn;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements ft.d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f36000a;
    public final ft.i<r> b;

    public h(e eVar, ft.i<r> iVar) {
        this.f36000a = eVar;
        this.b = iVar;
    }

    public static h a(e eVar, ft.i<r> iVar) {
        return new h(eVar, iVar);
    }

    public static b b(e eVar, r rVar) {
        return (b) ft.h.e(eVar.c(rVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b get() {
        return b(this.f36000a, this.b.get());
    }
}
