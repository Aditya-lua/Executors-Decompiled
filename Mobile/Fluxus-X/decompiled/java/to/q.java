package to;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32627a;

    public q(g gVar) {
        this.f32627a = gVar;
    }

    public static q a(g gVar) {
        return new q(gVar);
    }

    public static d c(g gVar) {
        return (d) wt.h.e(gVar.j());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f32627a);
    }
}
