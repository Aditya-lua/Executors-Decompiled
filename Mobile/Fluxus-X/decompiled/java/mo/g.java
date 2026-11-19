package mo;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements wt.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23412a;
    public final wt.i<p> b;

    public g(e eVar, wt.i<p> iVar) {
        this.f23412a = eVar;
        this.b = iVar;
    }

    public static g a(e eVar, wt.i<p> iVar) {
        return new g(eVar, iVar);
    }

    public static a b(e eVar, p pVar) {
        return (a) wt.h.e(eVar.b(pVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a get() {
        return b(this.f23412a, this.b.get());
    }
}
