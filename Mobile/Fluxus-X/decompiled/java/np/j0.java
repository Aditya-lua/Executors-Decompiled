package np;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<com.withpersona.sdk2.inquiry.internal.network.e> f26353a;

    public j0(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f26353a = iVar;
    }

    public static j0 a(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new j0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.p c(String str, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.p(str, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.p b(String str) {
        return c(str, this.f26353a.get());
    }
}
