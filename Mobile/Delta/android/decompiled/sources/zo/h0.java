package zo;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.network.e> f37887a;

    public h0(ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f37887a = iVar;
    }

    public static h0 a(ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new h0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.m c(String str, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.m(str, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.m b(String str) {
        return c(str, this.f37887a.get());
    }
}
