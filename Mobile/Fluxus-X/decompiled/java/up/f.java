package up;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements wt.d<po.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33814a;
    public final wt.i<sw.y> b;

    public f(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        this.f33814a = fVar;
        this.b = iVar;
    }

    public static f a(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        return new f(fVar, iVar);
    }

    public static po.c b(com.withpersona.sdk2.inquiry.internal.network.f fVar, sw.y yVar) {
        return (po.c) wt.h.e(fVar.a(yVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public po.c get() {
        return b(this.f33814a, this.b.get());
    }
}
