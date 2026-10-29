package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements ft.d<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18357a;

    public r(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        this.f18357a = fVar;
    }

    public static r a(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        return new r(fVar);
    }

    public static String c(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        return (String) ft.h.e(fVar.getServerEndpoint());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f18357a);
    }
}
