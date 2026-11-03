package ep;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements dt.d<rr.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16259a;
    public final dt.i<hv.y> b;

    public v(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        this.f16259a = fVar;
        this.b = iVar;
    }

    public static v a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        return new v(fVar, iVar);
    }

    public static rr.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, hv.y yVar) {
        return (rr.a) dt.h.e(fVar.q(yVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public rr.a get() {
        return c(this.f16259a, this.b.get());
    }
}
