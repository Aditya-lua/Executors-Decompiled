package fn;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements ft.d<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<r0> f16953a;
    public final ft.i<nu.b0<kn.c>> b;

    public o0(ft.i<r0> iVar, ft.i<nu.b0<kn.c>> iVar2) {
        this.f16953a = iVar;
        this.b = iVar2;
    }

    public static o0 a(ft.i<r0> iVar, ft.i<nu.b0<kn.c>> iVar2) {
        return new o0(iVar, iVar2);
    }

    public static n0 c(r0 r0Var, nu.b0<kn.c> b0Var) {
        return new n0(r0Var, b0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f16953a.get(), this.b.get());
    }
}
