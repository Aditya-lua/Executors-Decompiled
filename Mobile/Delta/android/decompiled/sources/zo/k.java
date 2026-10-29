package zo;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.network.e> f37913a;

    public k(ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f37913a = iVar;
    }

    public static k a(ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new k(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.f c(String str, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.f(str, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.f b(String str) {
        return c(str, this.f37913a.get());
    }
}
