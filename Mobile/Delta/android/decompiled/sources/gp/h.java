package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements ft.d<ho.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18347a;
    public final ft.i<jv.y> b;

    public h(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        this.f18347a = fVar;
        this.b = iVar;
    }

    public static h a(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        return new h(fVar, iVar);
    }

    public static ho.a b(com.withpersona.sdk2.inquiry.internal.network.f fVar, jv.y yVar) {
        return (ho.a) ft.h.e(fVar.c(yVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ho.a get() {
        return b(this.f18347a, this.b.get());
    }
}
