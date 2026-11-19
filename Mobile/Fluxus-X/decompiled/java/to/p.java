package to;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32626a;

    public p(g gVar) {
        this.f32626a = gVar;
    }

    public static p a(g gVar) {
        return new p(gVar);
    }

    public static d c(g gVar) {
        return (d) wt.h.e(gVar.i());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f32626a);
    }
}
