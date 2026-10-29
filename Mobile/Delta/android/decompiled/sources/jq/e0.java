package jq;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements ft.d<rq.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f21617a;
    public final ft.i<rq.c> b;

    public e0(c0 c0Var, ft.i<rq.c> iVar) {
        this.f21617a = c0Var;
        this.b = iVar;
    }

    public static e0 a(c0 c0Var, ft.i<rq.c> iVar) {
        return new e0(c0Var, iVar);
    }

    public static rq.a c(c0 c0Var, rq.c cVar) {
        return (rq.a) ft.h.e(c0Var.b(cVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public rq.a get() {
        return c(this.f21617a, this.b.get());
    }
}
