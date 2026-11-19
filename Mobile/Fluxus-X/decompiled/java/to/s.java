package to;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32629a;

    public s(g gVar) {
        this.f32629a = gVar;
    }

    public static s a(g gVar) {
        return new s(gVar);
    }

    public static d c(g gVar) {
        return (d) wt.h.e(gVar.l());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f32629a);
    }
}
