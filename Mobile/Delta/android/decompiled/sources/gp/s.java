package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements ft.d<qr.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18358a;
    public final ft.i<jv.y> b;

    public s(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        this.f18358a = fVar;
        this.b = iVar;
    }

    public static s a(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        return new s(fVar, iVar);
    }

    public static qr.c c(com.withpersona.sdk2.inquiry.internal.network.f fVar, jv.y yVar) {
        return (qr.c) ft.h.e(fVar.n(yVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public qr.c get() {
        return c(this.f18358a, this.b.get());
    }
}
