package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ft.d<bo.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18345a;
    public final ft.i<jv.y> b;

    public f(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        this.f18345a = fVar;
        this.b = iVar;
    }

    public static f a(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        return new f(fVar, iVar);
    }

    public static bo.c b(com.withpersona.sdk2.inquiry.internal.network.f fVar, jv.y yVar) {
        return (bo.c) ft.h.e(fVar.a(yVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public bo.c get() {
        return b(this.f18345a, this.b.get());
    }
}
