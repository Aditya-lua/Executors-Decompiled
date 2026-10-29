package f1;

import g0.v2;
import n0.a3;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public interface a2 {

    public enum a {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    void a(v2 v2Var);

    default void b(v2 v2Var, a4 a4Var, boolean z10) {
        a(v2Var);
    }

    default a3<s> c() {
        return n0.p1.f(null);
    }

    default void d(a aVar) {
    }

    default a3<g1> e() {
        return g1.f15857c;
    }

    default h1 f(g0.t tVar, int i10) {
        return h1.f15862a;
    }

    default a3<Boolean> g() {
        return n0.p1.f(Boolean.FALSE);
    }
}
