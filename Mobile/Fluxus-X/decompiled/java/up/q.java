package up;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements wt.d<qq.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33825a;
    public final wt.i<sw.y> b;

    public q(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        this.f33825a = fVar;
        this.b = iVar;
    }

    public static q a(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        return new q(fVar, iVar);
    }

    public static qq.a c(com.withpersona.sdk2.inquiry.internal.network.f fVar, sw.y yVar) {
        return (qq.a) wt.h.e(fVar.l(yVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public qq.a get() {
        return c(this.f33825a, this.b.get());
    }
}
