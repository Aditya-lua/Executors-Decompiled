package mp;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements ft.d<g.c<String[]>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f24484a;

    public t(q qVar) {
        this.f24484a = qVar;
    }

    public static t a(q qVar) {
        return new t(qVar);
    }

    public static g.c<String[]> c(q qVar) {
        return (g.c) ft.h.e(qVar.a());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.c<String[]> get() {
        return c(this.f24484a);
    }
}
