package m0;

import g0.h2;
import g0.o1;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements x0.a0<x0.b0<androidx.camera.core.d>, androidx.camera.core.d> {
    @Override // x0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public androidx.camera.core.d apply(x0.b0<androidx.camera.core.d> b0Var) {
        androidx.camera.core.d dVarC = b0Var.c();
        h2 h2Var = new h2(dVarC, b0Var.h(), o1.f(dVarC.H2().c(), dVarC.H2().getTimestamp(), b0Var.f(), b0Var.g(), dVarC.H2().b()));
        h2Var.M0(b0Var.b());
        return h2Var;
    }
}
