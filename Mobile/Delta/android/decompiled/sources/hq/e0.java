package hq;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements dt.d<pq.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f19625a;
    public final dt.i<pq.c> b;

    public e0(c0 c0Var, dt.i<pq.c> iVar) {
        this.f19625a = c0Var;
        this.b = iVar;
    }

    public static e0 a(c0 c0Var, dt.i<pq.c> iVar) {
        return new e0(c0Var, iVar);
    }

    public static pq.a c(c0 c0Var, pq.c cVar) {
        return (pq.a) dt.h.e(c0Var.b(cVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pq.a get() {
        return c(this.f19625a, this.b.get());
    }
}
