package up;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements wt.d<js.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33830a;
    public final wt.i<sw.y> b;

    public v(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        this.f33830a = fVar;
        this.b = iVar;
    }

    public static v a(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        return new v(fVar, iVar);
    }

    public static js.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, sw.y yVar) {
        return (js.a) wt.h.e(fVar.q(yVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public js.a get() {
        return c(this.f33830a, this.b.get());
    }
}
