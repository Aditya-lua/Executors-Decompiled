package up;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements wt.d<uo.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33816a;
    public final wt.i<sw.y> b;

    public h(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        this.f33816a = fVar;
        this.b = iVar;
    }

    public static h a(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        return new h(fVar, iVar);
    }

    public static uo.b b(com.withpersona.sdk2.inquiry.internal.network.f fVar, sw.y yVar) {
        return (uo.b) wt.h.e(fVar.c(yVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public uo.b get() {
        return b(this.f33816a, this.b.get());
    }
}
