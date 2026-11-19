package to;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32621a;

    public k(g gVar) {
        this.f32621a = gVar;
    }

    public static k a(g gVar) {
        return new k(gVar);
    }

    public static d b(g gVar) {
        return (d) wt.h.e(gVar.d());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f32621a);
    }
}
