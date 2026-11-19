package xq;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements wt.d<jr.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f36990a;

    public f0(c0 c0Var) {
        this.f36990a = c0Var;
    }

    public static f0 a(c0 c0Var) {
        return new f0(c0Var);
    }

    public static jr.a c(c0 c0Var) {
        return (jr.a) wt.h.e(c0Var.c());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public jr.a get() {
        return c(this.f36990a);
    }
}
