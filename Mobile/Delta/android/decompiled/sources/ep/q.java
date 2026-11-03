package ep;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements dt.d<aq.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16254a;
    public final dt.i<hv.y> b;

    public q(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        this.f16254a = fVar;
        this.b = iVar;
    }

    public static q a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        return new q(fVar, iVar);
    }

    public static aq.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, hv.y yVar) {
        return (aq.a) dt.h.e(fVar.l(yVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public aq.a get() {
        return c(this.f16254a, this.b.get());
    }
}
