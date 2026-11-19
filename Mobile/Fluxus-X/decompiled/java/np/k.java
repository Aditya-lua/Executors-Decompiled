package np;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<com.withpersona.sdk2.inquiry.internal.network.e> f26354a;

    public k(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f26354a = iVar;
    }

    public static k a(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new k(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.f c(String str, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.f(str, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.f b(String str) {
        return c(str, this.f26354a.get());
    }
}
