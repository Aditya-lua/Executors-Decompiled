package fn;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements ft.d<ln.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f16936a;
    public final ft.i<ln.b> b;

    public l(k kVar, ft.i<ln.b> iVar) {
        this.f16936a = kVar;
        this.b = iVar;
    }

    public static ln.a a(k kVar, ct.a<ln.b> aVar) {
        return (ln.a) ft.h.e(kVar.a(aVar));
    }

    public static l b(k kVar, ft.i<ln.b> iVar) {
        return new l(kVar, iVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ln.a get() {
        return a(this.f16936a, ft.c.b(this.b));
    }
}
