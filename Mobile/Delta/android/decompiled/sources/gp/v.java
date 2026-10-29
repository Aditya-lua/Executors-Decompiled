package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements ft.d<tr.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18361a;
    public final ft.i<jv.y> b;

    public v(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        this.f18361a = fVar;
        this.b = iVar;
    }

    public static v a(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        return new v(fVar, iVar);
    }

    public static tr.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, jv.y yVar) {
        return (tr.a) ft.h.e(fVar.q(yVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public tr.a get() {
        return c(this.f18361a, this.b.get());
    }
}
