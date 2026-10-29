package w0;

import g0.i1;
import n0.a0;
import n0.c0;
import n0.e0;
import n0.f0;
import n0.y;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a<androidx.camera.core.d> {
    public f(int i10, c.a<androidx.camera.core.d> aVar) {
        super(i10, aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // w0.a, w0.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(androidx.camera.core.d dVar) {
        if (d(dVar.H2())) {
            super.b(dVar);
        } else {
            this.f33578d.a((T) dVar);
        }
    }

    public final boolean d(i1 i1Var) {
        e0 e0VarA = f0.a(i1Var);
        if (e0VarA == null) {
            return false;
        }
        return (e0VarA.g() == a0.LOCKED_FOCUSED || e0VarA.g() == a0.PASSIVE_FOCUSED) && e0VarA.j() == y.CONVERGED && e0VarA.h() == c0.CONVERGED;
    }
}
