package sn;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements wt.d<b1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<f1> f31564a;
    public final wt.i<dv.b0<xn.d>> b;

    public c1(wt.i<f1> iVar, wt.i<dv.b0<xn.d>> iVar2) {
        this.f31564a = iVar;
        this.b = iVar2;
    }

    public static c1 a(wt.i<f1> iVar, wt.i<dv.b0<xn.d>> iVar2) {
        return new c1(iVar, iVar2);
    }

    public static b1 c(f1 f1Var, dv.b0<xn.d> b0Var) {
        return new b1(f1Var, b0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b1 get() {
        return c(this.f31564a.get(), this.b.get());
    }
}
