package ep;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements dt.d<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16247a;
    public final dt.i<hv.y> b;

    public j(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        this.f16247a = fVar;
        this.b = iVar;
    }

    public static j a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        return new j(fVar, iVar);
    }

    public static w c(com.withpersona.sdk2.inquiry.internal.network.f fVar, hv.y yVar) {
        return (w) dt.h.e(fVar.e(yVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f16247a, this.b.get());
    }
}
