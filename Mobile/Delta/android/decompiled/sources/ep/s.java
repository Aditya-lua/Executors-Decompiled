package ep;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements dt.d<or.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16256a;
    public final dt.i<hv.y> b;

    public s(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        this.f16256a = fVar;
        this.b = iVar;
    }

    public static s a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        return new s(fVar, iVar);
    }

    public static or.c c(com.withpersona.sdk2.inquiry.internal.network.f fVar, hv.y yVar) {
        return (or.c) dt.h.e(fVar.n(yVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public or.c get() {
        return c(this.f16256a, this.b.get());
    }
}
