package ep;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements dt.d<fo.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16245a;
    public final dt.i<hv.y> b;

    public h(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        this.f16245a = fVar;
        this.b = iVar;
    }

    public static h a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        return new h(fVar, iVar);
    }

    public static fo.a b(com.withpersona.sdk2.inquiry.internal.network.f fVar, hv.y yVar) {
        return (fo.a) dt.h.e(fVar.c(yVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fo.a get() {
        return b(this.f16245a, this.b.get());
    }
}
