package up;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements wt.d<com.withpersona.sdk2.inquiry.governmentid.network.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33817a;
    public final wt.i<sw.y> b;

    public i(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        this.f33817a = fVar;
        this.b = iVar;
    }

    public static i a(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        return new i(fVar, iVar);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.network.b c(com.withpersona.sdk2.inquiry.internal.network.f fVar, sw.y yVar) {
        return (com.withpersona.sdk2.inquiry.governmentid.network.b) wt.h.e(fVar.d(yVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.governmentid.network.b get() {
        return c(this.f33817a, this.b.get());
    }
}
