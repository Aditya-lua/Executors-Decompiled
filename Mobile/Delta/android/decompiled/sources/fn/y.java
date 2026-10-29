package fn;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements ft.d<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<nu.b0<jt.n<j0>>> f17026a;

    public y(ft.i<nu.b0<jt.n<j0>>> iVar) {
        this.f17026a = iVar;
    }

    public static y a(ft.i<nu.b0<jt.n<j0>>> iVar) {
        return new y(iVar);
    }

    public static x c(nu.b0<jt.n<j0>> b0Var) {
        return new x(b0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f17026a.get());
    }
}
