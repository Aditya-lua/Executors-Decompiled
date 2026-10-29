package zo;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements ft.d<com.withpersona.sdk2.inquiry.internal.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<k0> f37912a;
    public final ft.i<ku.l0> b;

    public j0(ft.i<k0> iVar, ft.i<ku.l0> iVar2) {
        this.f37912a = iVar;
        this.b = iVar2;
    }

    public static j0 a(ft.i<k0> iVar, ft.i<ku.l0> iVar2) {
        return new j0(iVar, iVar2);
    }

    public static com.withpersona.sdk2.inquiry.internal.q c(k0 k0Var, ku.l0 l0Var) {
        return new com.withpersona.sdk2.inquiry.internal.q(k0Var, l0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.internal.q get() {
        return c(this.f37912a.get(), this.b.get());
    }
}
