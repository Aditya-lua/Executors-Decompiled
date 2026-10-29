package yn;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ft.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f35999a;
    public final ft.i<p> b;

    public g(e eVar, ft.i<p> iVar) {
        this.f35999a = eVar;
        this.b = iVar;
    }

    public static g a(e eVar, ft.i<p> iVar) {
        return new g(eVar, iVar);
    }

    public static a b(e eVar, p pVar) {
        return (a) ft.h.e(eVar.b(pVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a get() {
        return b(this.f35999a, this.b.get());
    }
}
