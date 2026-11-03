package wn;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements dt.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34628a;
    public final dt.i<p> b;

    public g(e eVar, dt.i<p> iVar) {
        this.f34628a = eVar;
        this.b = iVar;
    }

    public static g a(e eVar, dt.i<p> iVar) {
        return new g(eVar, iVar);
    }

    public static a b(e eVar, p pVar) {
        return (a) dt.h.e(eVar.b(pVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a get() {
        return b(this.f34628a, this.b.get());
    }
}
