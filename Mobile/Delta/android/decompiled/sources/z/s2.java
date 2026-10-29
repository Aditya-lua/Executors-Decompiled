package z;

import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class s2 implements n0.o3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2 f36808a = new s2();

    @Override // n0.o3.e
    public void a(Size size, n0.i4<?> i4Var, n0.o3.b bVar) {
        n0.o3 o3VarJ = i4Var.j(null);
        n0.n1 n1VarI0 = n0.c3.i0();
        int iQ = n0.o3.b().q();
        if (o3VarJ != null) {
            iQ = o3VarJ.q();
            bVar.b(o3VarJ.c());
            bVar.d(o3VarJ.m());
            bVar.c(o3VarJ.k());
            n1VarI0 = o3VarJ.g();
        }
        bVar.w(n1VarI0);
        if (i4Var instanceof n0.f3) {
            d0.o.b(size, bVar);
        }
        y.a aVar = new y.a(i4Var);
        bVar.B(aVar.j0(iQ));
        bVar.f(aVar.k0(w2.b()));
        bVar.k(aVar.n0(v2.b()));
        bVar.e(c3.e(aVar.m0(a1.c())));
        bVar.C(i4Var.x());
        bVar.z(i4Var.E());
        n0.x2 x2VarK0 = n0.x2.k0();
        x2VarK0.G(y.a.W, aVar.l0(null));
        x2VarK0.G(y.a.R, Long.valueOf(aVar.o0(-1L)));
        bVar.g(x2VarK0);
        bVar.g(aVar.i0());
    }
}
