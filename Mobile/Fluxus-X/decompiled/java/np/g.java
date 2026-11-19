package np;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements wt.d<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<mo.d> f26306a;
    public final wt.i<com.withpersona.sdk2.inquiry.internal.network.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<av.l0> f26307c;

    public g(wt.i<mo.d> iVar, wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar2, wt.i<av.l0> iVar3) {
        this.f26306a = iVar;
        this.b = iVar2;
        this.f26307c = iVar3;
    }

    public static g a(wt.i<mo.d> iVar, wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar2, wt.i<av.l0> iVar3) {
        return new g(iVar, iVar2, iVar3);
    }

    public static f c(mo.d dVar, com.withpersona.sdk2.inquiry.internal.network.e eVar, av.l0 l0Var) {
        return new f(dVar, eVar, l0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f26306a.get(), this.b.get(), this.f26307c.get());
    }
}
