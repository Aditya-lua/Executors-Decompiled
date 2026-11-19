package qo;

import no.u2;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<e1.c> f30125a;

    public i1(wt.i<e1.c> iVar) {
        this.f30125a = iVar;
    }

    public static i1 a(wt.i<e1.c> iVar) {
        return new i1(iVar);
    }

    public static h1 c(androidx.p000lifecycle.l0 l0Var, u2.Input input, e1.c cVar) {
        return new h1(l0Var, input, cVar);
    }

    public h1 b(androidx.p000lifecycle.l0 l0Var, u2.Input input) {
        return c(l0Var, input, this.f30125a.get());
    }
}
