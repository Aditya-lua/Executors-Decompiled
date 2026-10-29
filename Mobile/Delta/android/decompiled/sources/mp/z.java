package mp;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements ft.d<g.c<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f24490a;

    public z(w wVar) {
        this.f24490a = wVar;
    }

    public static z a(w wVar) {
        return new z(wVar);
    }

    public static g.c<String> c(w wVar) {
        return (g.c) ft.h.e(wVar.a());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.c<String> get() {
        return c(this.f24490a);
    }
}
