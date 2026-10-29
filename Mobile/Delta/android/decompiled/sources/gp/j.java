package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements ft.d<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18349a;
    public final ft.i<jv.y> b;

    public j(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        this.f18349a = fVar;
        this.b = iVar;
    }

    public static j a(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        return new j(fVar, iVar);
    }

    public static w c(com.withpersona.sdk2.inquiry.internal.network.f fVar, jv.y yVar) {
        return (w) ft.h.e(fVar.e(yVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f18349a, this.b.get());
    }
}
