package xo;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements dt.d<com.withpersona.sdk2.inquiry.internal.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<k0> f36035a;
    public final dt.i<iu.l0> b;

    public j0(dt.i<k0> iVar, dt.i<iu.l0> iVar2) {
        this.f36035a = iVar;
        this.b = iVar2;
    }

    public static j0 a(dt.i<k0> iVar, dt.i<iu.l0> iVar2) {
        return new j0(iVar, iVar2);
    }

    public static com.withpersona.sdk2.inquiry.internal.q c(k0 k0Var, iu.l0 l0Var) {
        return new com.withpersona.sdk2.inquiry.internal.q(k0Var, l0Var);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.internal.q get() {
        return c(this.f36035a.get(), this.b.get());
    }
}
