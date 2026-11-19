package up;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements wt.d<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33824a;
    public final wt.i<sw.y> b;

    public p(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        this.f33824a = fVar;
        this.b = iVar;
    }

    public static p a(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        return new p(fVar, iVar);
    }

    public static y c(com.withpersona.sdk2.inquiry.internal.network.f fVar, sw.y yVar) {
        return (y) wt.h.e(fVar.k(yVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f33824a, this.b.get());
    }
}
