package xo;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements dt.d<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<wn.d> f36004a;
    public final dt.i<com.withpersona.sdk2.inquiry.internal.network.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<iu.l0> f36005c;

    public g(dt.i<wn.d> iVar, dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar2, dt.i<iu.l0> iVar3) {
        this.f36004a = iVar;
        this.b = iVar2;
        this.f36005c = iVar3;
    }

    public static g a(dt.i<wn.d> iVar, dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar2, dt.i<iu.l0> iVar3) {
        return new g(iVar, iVar2, iVar3);
    }

    public static f c(wn.d dVar, com.withpersona.sdk2.inquiry.internal.network.e eVar, iu.l0 l0Var) {
        return new f(dVar, eVar, l0Var);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f36004a.get(), this.b.get(), this.f36005c.get());
    }
}
