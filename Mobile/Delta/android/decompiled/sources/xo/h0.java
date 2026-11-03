package xo;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.network.e> f36010a;

    public h0(dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f36010a = iVar;
    }

    public static h0 a(dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new h0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.m c(String str, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.m(str, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.m b(String str) {
        return c(str, this.f36010a.get());
    }
}
