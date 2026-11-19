package aq;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements wt.d<g.d<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f3322a;

    public z(w wVar) {
        this.f3322a = wVar;
    }

    public static z a(w wVar) {
        return new z(wVar);
    }

    public static g.d<String> c(w wVar) {
        return (g.d) wt.h.e(wVar.a());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.d<String> get() {
        return c(this.f3322a);
    }
}
