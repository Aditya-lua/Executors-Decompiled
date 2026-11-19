package up;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements wt.d<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33818a;
    public final wt.i<sw.y> b;

    public j(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        this.f33818a = fVar;
        this.b = iVar;
    }

    public static j a(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        return new j(fVar, iVar);
    }

    public static w c(com.withpersona.sdk2.inquiry.internal.network.f fVar, sw.y yVar) {
        return (w) wt.h.e(fVar.e(yVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f33818a, this.b.get());
    }
}
