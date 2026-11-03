package hq;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements dt.d<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f19609a;
    public final dt.i<x> b;

    public d0(c0 c0Var, dt.i<x> iVar) {
        this.f19609a = c0Var;
        this.b = iVar;
    }

    public static d0 a(c0 c0Var, dt.i<x> iVar) {
        return new d0(c0Var, iVar);
    }

    public static k b(c0 c0Var, x xVar) {
        return (k) dt.h.e(c0Var.a(xVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k get() {
        return b(this.f19609a, this.b.get());
    }
}
