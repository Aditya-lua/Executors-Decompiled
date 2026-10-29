package g0;

import android.graphics.Matrix;
import n0.z3;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1 implements i1 {
    public static i1 f(z3 z3Var, long j10, int i10, Matrix matrix, int i11) {
        return new g(z3Var, j10, i10, matrix, i11);
    }

    @Override // g0.i1
    public void a(p0.i.b bVar) {
        bVar.m(d());
    }

    @Override // g0.i1
    public abstract int b();

    @Override // g0.i1
    public abstract z3 c();

    @Override // g0.i1
    public abstract int d();

    @Override // g0.i1
    public abstract Matrix e();

    @Override // g0.i1
    public abstract long getTimestamp();
}
