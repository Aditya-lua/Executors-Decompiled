package to;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32623a;

    public m(g gVar) {
        this.f32623a = gVar;
    }

    public static m a(g gVar) {
        return new m(gVar);
    }

    public static d c(g gVar) {
        return (d) wt.h.e(gVar.f());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f32623a);
    }
}
