package np;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<q0> f26355a;

    public k0(wt.i<q0> iVar) {
        this.f26355a = iVar;
    }

    public static k0 a(wt.i<q0> iVar) {
        return new k0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.r c(q0 q0Var, String str, String str2, String str3) {
        return new com.withpersona.sdk2.inquiry.internal.r(q0Var, str, str2, str3);
    }

    public com.withpersona.sdk2.inquiry.internal.r b(String str, String str2, String str3) {
        return c(this.f26355a.get(), str, str2, str3);
    }
}
