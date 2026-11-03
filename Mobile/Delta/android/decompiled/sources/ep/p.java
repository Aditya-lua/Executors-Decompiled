package ep;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements dt.d<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16253a;
    public final dt.i<hv.y> b;

    public p(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        this.f16253a = fVar;
        this.b = iVar;
    }

    public static p a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        return new p(fVar, iVar);
    }

    public static y c(com.withpersona.sdk2.inquiry.internal.network.f fVar, hv.y yVar) {
        return (y) dt.h.e(fVar.k(yVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f16253a, this.b.get());
    }
}
