package zp;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements wt.d<g.d<JpMyNumberNfcReaderConfig>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f39375a;

    public h(e eVar) {
        this.f39375a = eVar;
    }

    public static h a(e eVar) {
        return new h(eVar);
    }

    public static g.d<JpMyNumberNfcReaderConfig> c(e eVar) {
        return (g.d) wt.h.e(eVar.a());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.d<JpMyNumberNfcReaderConfig> get() {
        return c(this.f39375a);
    }
}
