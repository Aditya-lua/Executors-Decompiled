package zo;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ft.d<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<yn.d> f37881a;
    public final ft.i<com.withpersona.sdk2.inquiry.internal.network.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<ku.l0> f37882c;

    public g(ft.i<yn.d> iVar, ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar2, ft.i<ku.l0> iVar3) {
        this.f37881a = iVar;
        this.b = iVar2;
        this.f37882c = iVar3;
    }

    public static g a(ft.i<yn.d> iVar, ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar2, ft.i<ku.l0> iVar3) {
        return new g(iVar, iVar2, iVar3);
    }

    public static f c(yn.d dVar, com.withpersona.sdk2.inquiry.internal.network.e eVar, ku.l0 l0Var) {
        return new f(dVar, eVar, l0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f37881a.get(), this.b.get(), this.f37882c.get());
    }
}
