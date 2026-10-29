package n0;

/* JADX INFO: loaded from: classes.dex */
public final class b4 implements g0.c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0.c2 f24613e;

    public b4(long j10, g0.c2 c2Var) {
        x2.g.b(j10 >= 0, "Timeout must be non-negative.");
        this.f24612d = j10;
        this.f24613e = c2Var;
    }

    @Override // g0.c2
    public long a() {
        return this.f24612d;
    }

    @Override // g0.c2
    public g0.c2.c e(g0.c2.b bVar) {
        g0.c2.c cVarE = this.f24613e.e(bVar);
        return (a() <= 0 || bVar.o() < a() - cVarE.b()) ? cVarE : g0.c2.c.f17354d;
    }
}
