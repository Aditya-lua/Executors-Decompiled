package to;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32625a;

    public o(g gVar) {
        this.f32625a = gVar;
    }

    public static o a(g gVar) {
        return new o(gVar);
    }

    public static d c(g gVar) {
        return (d) wt.h.e(gVar.h());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f32625a);
    }
}
