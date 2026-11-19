package aq;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements wt.d<g.d<String[]>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3312a;

    public n(i iVar) {
        this.f3312a = iVar;
    }

    public static n a(i iVar) {
        return new n(iVar);
    }

    public static g.d<String[]> c(i iVar) {
        return (g.d) wt.h.e(iVar.a());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.d<String[]> get() {
        return c(this.f3312a);
    }
}
