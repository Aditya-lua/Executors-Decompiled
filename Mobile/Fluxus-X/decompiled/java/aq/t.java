package aq;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements wt.d<g.d<String[]>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f3316a;

    public t(q qVar) {
        this.f3316a = qVar;
    }

    public static t a(q qVar) {
        return new t(qVar);
    }

    public static g.d<String[]> c(q qVar) {
        return (g.d) wt.h.e(qVar.a());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.d<String[]> get() {
        return c(this.f3316a);
    }
}
