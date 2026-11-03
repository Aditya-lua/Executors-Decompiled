package z;

/* JADX INFO: loaded from: classes.dex */
public final class n4 extends b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n4 f37413c = new n4(new d0.j());
    public final d0.j b;

    public n4(d0.j jVar) {
        this.b = jVar;
    }

    @Override // z.b1, n0.l1.b
    public void a(n0.i4<?> i4Var, n0.l1.a aVar) {
        super.a(i4Var, aVar);
        if (!(i4Var instanceof n0.g2)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        n0.g2 g2Var = (n0.g2) i4Var;
        y.a.C0662a c0662a = new y.a.C0662a();
        if (g2Var.p0()) {
            this.b.a(g2Var.i0(), c0662a);
        }
        aVar.e(c0662a.b());
    }
}
