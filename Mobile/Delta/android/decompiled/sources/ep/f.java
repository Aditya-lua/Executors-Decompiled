package ep;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements dt.d<zn.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16243a;
    public final dt.i<hv.y> b;

    public f(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        this.f16243a = fVar;
        this.b = iVar;
    }

    public static f a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        return new f(fVar, iVar);
    }

    public static zn.c b(com.withpersona.sdk2.inquiry.internal.network.f fVar, hv.y yVar) {
        return (zn.c) dt.h.e(fVar.a(yVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public zn.c get() {
        return b(this.f16243a, this.b.get());
    }
}
