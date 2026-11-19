package ep;

import vo.d2;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements i1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f13968a;

    public k1(j1 j1Var) {
        this.f13968a = j1Var;
    }

    public static wt.i<i1.a> b(j1 j1Var) {
        return wt.e.a(new k1(j1Var));
    }

    @Override // ep.i1.a
    public i1 a(androidx.p000lifecycle.l0 l0Var, d2.a aVar) {
        return this.f13968a.b(l0Var, aVar);
    }
}
