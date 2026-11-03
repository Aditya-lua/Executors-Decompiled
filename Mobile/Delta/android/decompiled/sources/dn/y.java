package dn;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements dt.d<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<lu.b0<gt.n<j0>>> f15222a;

    public y(dt.i<lu.b0<gt.n<j0>>> iVar) {
        this.f15222a = iVar;
    }

    public static y a(dt.i<lu.b0<gt.n<j0>>> iVar) {
        return new y(iVar);
    }

    public static x c(lu.b0<gt.n<j0>> b0Var) {
        return new x(b0Var);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f15222a.get());
    }
}
