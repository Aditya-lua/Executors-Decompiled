package up;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements wt.d<gs.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33827a;
    public final wt.i<sw.y> b;

    public s(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        this.f33827a = fVar;
        this.b = iVar;
    }

    public static s a(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        return new s(fVar, iVar);
    }

    public static gs.c c(com.withpersona.sdk2.inquiry.internal.network.f fVar, sw.y yVar) {
        return (gs.c) wt.h.e(fVar.n(yVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public gs.c get() {
        return c(this.f33827a, this.b.get());
    }
}
