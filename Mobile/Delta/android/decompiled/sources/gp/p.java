package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements ft.d<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18355a;
    public final ft.i<jv.y> b;

    public p(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        this.f18355a = fVar;
        this.b = iVar;
    }

    public static p a(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        return new p(fVar, iVar);
    }

    public static y c(com.withpersona.sdk2.inquiry.internal.network.f fVar, jv.y yVar) {
        return (y) ft.h.e(fVar.k(yVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f18355a, this.b.get());
    }
}
