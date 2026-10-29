package jq;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements ft.d<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f21601a;
    public final ft.i<x> b;

    public d0(c0 c0Var, ft.i<x> iVar) {
        this.f21601a = c0Var;
        this.b = iVar;
    }

    public static d0 a(c0 c0Var, ft.i<x> iVar) {
        return new d0(c0Var, iVar);
    }

    public static k b(c0 c0Var, x xVar) {
        return (k) ft.h.e(c0Var.a(xVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k get() {
        return b(this.f21601a, this.b.get());
    }
}
