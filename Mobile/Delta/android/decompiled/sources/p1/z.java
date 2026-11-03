package p1;

import g0.w2;
import g0.x2;

/* JADX INFO: loaded from: classes.dex */
public class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1.k f28418a;

    public z(d1.k kVar) {
        this.f28418a = kVar;
    }

    @Override // p1.y
    public g0.t a(g0.v vVar) {
        return this.f28418a.d(vVar);
    }

    @Override // p1.y
    public g0.l b(androidx.p000lifecycle.s sVar, g0.v vVar, x2 x2Var) {
        return this.f28418a.c(sVar, vVar, x2Var);
    }

    @Override // p1.y
    public void c(w2... w2VarArr) {
        this.f28418a.g(w2VarArr);
    }
}
