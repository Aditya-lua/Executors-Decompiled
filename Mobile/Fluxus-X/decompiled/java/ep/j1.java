package ep;

import vo.d2;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<f1.c> f13966a;

    public j1(wt.i<f1.c> iVar) {
        this.f13966a = iVar;
    }

    public static j1 a(wt.i<f1.c> iVar) {
        return new j1(iVar);
    }

    public static i1 c(androidx.p000lifecycle.l0 l0Var, d2.a aVar, f1.c cVar) {
        return new i1(l0Var, aVar, cVar);
    }

    public i1 b(androidx.p000lifecycle.l0 l0Var, d2.a aVar) {
        return c(l0Var, aVar, this.f13966a.get());
    }
}
