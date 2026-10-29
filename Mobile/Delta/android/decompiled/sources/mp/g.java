package mp;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ft.d<g.c<b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f24471a;

    public g(d dVar) {
        this.f24471a = dVar;
    }

    public static g a(d dVar) {
        return new g(dVar);
    }

    public static g.c<b> b(d dVar) {
        return (g.c) ft.h.e(dVar.a());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g.c<b> get() {
        return b(this.f24471a);
    }
}
