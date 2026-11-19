package xq;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements wt.d<fr.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f36984a;
    public final wt.i<fr.c> b;

    public e0(c0 c0Var, wt.i<fr.c> iVar) {
        this.f36984a = c0Var;
        this.b = iVar;
    }

    public static e0 a(c0 c0Var, wt.i<fr.c> iVar) {
        return new e0(c0Var, iVar);
    }

    public static fr.a c(c0 c0Var, fr.c cVar) {
        return (fr.a) wt.h.e(c0Var.b(cVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public fr.a get() {
        return c(this.f36984a, this.b.get());
    }
}
