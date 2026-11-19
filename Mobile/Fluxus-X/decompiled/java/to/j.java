package to;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32620a;

    public j(g gVar) {
        this.f32620a = gVar;
    }

    public static j a(g gVar) {
        return new j(gVar);
    }

    public static d b(g gVar) {
        return (d) wt.h.e(gVar.c());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return b(this.f32620a);
    }
}
