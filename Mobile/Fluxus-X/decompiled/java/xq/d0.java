package xq;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements wt.d<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f36968a;
    public final wt.i<x> b;

    public d0(c0 c0Var, wt.i<x> iVar) {
        this.f36968a = c0Var;
        this.b = iVar;
    }

    public static d0 a(c0 c0Var, wt.i<x> iVar) {
        return new d0(c0Var, iVar);
    }

    public static k b(c0 c0Var, x xVar) {
        return (k) wt.h.e(c0Var.a(xVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k get() {
        return b(this.f36968a, this.b.get());
    }
}
