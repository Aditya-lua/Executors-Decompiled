package to;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32624a;

    public n(g gVar) {
        this.f32624a = gVar;
    }

    public static n a(g gVar) {
        return new n(gVar);
    }

    public static d c(g gVar) {
        return (d) wt.h.e(gVar.g());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f32624a);
    }
}
