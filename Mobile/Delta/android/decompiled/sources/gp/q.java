package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements ft.d<cq.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18356a;
    public final ft.i<jv.y> b;

    public q(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        this.f18356a = fVar;
        this.b = iVar;
    }

    public static q a(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        return new q(fVar, iVar);
    }

    public static cq.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, jv.y yVar) {
        return (cq.a) ft.h.e(fVar.l(yVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public cq.a get() {
        return c(this.f18356a, this.b.get());
    }
}
