package aq;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements wt.d<g.d<b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3303a;

    public g(d dVar) {
        this.f3303a = dVar;
    }

    public static g a(d dVar) {
        return new g(dVar);
    }

    public static g.d<b> b(d dVar) {
        return (g.d) wt.h.e(dVar.a());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g.d<b> get() {
        return b(this.f3303a);
    }
}
