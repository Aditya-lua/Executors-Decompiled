package z;

/* JADX INFO: loaded from: classes.dex */
public class b1 implements n0.l1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f36442a = new b1();

    @Override // n0.l1.b
    public void a(n0.i4<?> i4Var, n0.l1.a aVar) {
        n0.l1 l1VarS = i4Var.s(null);
        n0.n1 n1VarI0 = n0.c3.i0();
        int iK = n0.l1.b().k();
        if (l1VarS != null) {
            iK = l1VarS.k();
            aVar.a(l1VarS.c());
            n1VarI0 = l1VarS.g();
        }
        aVar.s(n1VarI0);
        y.a aVar2 = new y.a(i4Var);
        aVar.v(aVar2.j0(iK));
        aVar.c(c3.e(aVar2.m0(a1.c())));
        aVar.e(aVar2.i0());
    }
}
