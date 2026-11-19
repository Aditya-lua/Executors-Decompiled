package sn;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements wt.d<h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<dv.b0<zt.n<w0>>> f31633a;

    public i0(wt.i<dv.b0<zt.n<w0>>> iVar) {
        this.f31633a = iVar;
    }

    public static i0 a(wt.i<dv.b0<zt.n<w0>>> iVar) {
        return new i0(iVar);
    }

    public static h0 c(dv.b0<zt.n<w0>> b0Var) {
        return new h0(b0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return c(this.f31633a.get());
    }
}
