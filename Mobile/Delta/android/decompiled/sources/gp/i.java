package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ft.d<com.withpersona.sdk2.inquiry.governmentid.network.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18348a;
    public final ft.i<jv.y> b;

    public i(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        this.f18348a = fVar;
        this.b = iVar;
    }

    public static i a(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        return new i(fVar, iVar);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.network.b c(com.withpersona.sdk2.inquiry.internal.network.f fVar, jv.y yVar) {
        return (com.withpersona.sdk2.inquiry.governmentid.network.b) ft.h.e(fVar.d(yVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.governmentid.network.b get() {
        return c(this.f18348a, this.b.get());
    }
}
