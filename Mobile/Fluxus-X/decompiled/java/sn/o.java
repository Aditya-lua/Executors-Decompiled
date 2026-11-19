package sn;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements wt.d<yn.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f31656a;
    public final wt.i<yn.b> b;

    public o(n nVar, wt.i<yn.b> iVar) {
        this.f31656a = nVar;
        this.b = iVar;
    }

    public static yn.a a(n nVar, tt.a<yn.b> aVar) {
        return (yn.a) wt.h.e(nVar.a(aVar));
    }

    public static o b(n nVar, wt.i<yn.b> iVar) {
        return new o(nVar, iVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public yn.a get() {
        return a(this.f31656a, wt.c.b(this.b));
    }
}
