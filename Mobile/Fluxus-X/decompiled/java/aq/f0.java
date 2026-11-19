package aq;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements wt.d<g.d<g.i>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f3302a;

    public f0(c0 c0Var) {
        this.f3302a = c0Var;
    }

    public static f0 a(c0 c0Var) {
        return new f0(c0Var);
    }

    public static g.d<g.i> c(c0 c0Var) {
        return (g.d) wt.h.e(c0Var.a());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.d<g.i> get() {
        return c(this.f3302a);
    }
}
