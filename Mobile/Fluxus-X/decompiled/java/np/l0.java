package np;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements wt.d<com.withpersona.sdk2.inquiry.internal.t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<m0> f26357a;
    public final wt.i<av.l0> b;

    public l0(wt.i<m0> iVar, wt.i<av.l0> iVar2) {
        this.f26357a = iVar;
        this.b = iVar2;
    }

    public static l0 a(wt.i<m0> iVar, wt.i<av.l0> iVar2) {
        return new l0(iVar, iVar2);
    }

    public static com.withpersona.sdk2.inquiry.internal.t c(m0 m0Var, av.l0 l0Var) {
        return new com.withpersona.sdk2.inquiry.internal.t(m0Var, l0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.internal.t get() {
        return c(this.f26357a.get(), this.b.get());
    }
}
