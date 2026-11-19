package eq;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements wt.d<g.d<PassportNfcReaderConfig>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f14068a;

    public k(h hVar) {
        this.f14068a = hVar;
    }

    public static k a(h hVar) {
        return new k(hVar);
    }

    public static g.d<PassportNfcReaderConfig> c(h hVar) {
        return (g.d) wt.h.e(hVar.a());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.d<PassportNfcReaderConfig> get() {
        return c(this.f14068a);
    }
}
