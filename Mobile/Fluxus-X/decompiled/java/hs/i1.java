package hs;

import es.s6;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 implements g1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f18667a;

    public i1(h1 h1Var) {
        this.f18667a = h1Var;
    }

    public static wt.i<g1.e> b(h1 h1Var) {
        return wt.e.a(new i1(h1Var));
    }

    @Override // hs.g1.e
    public g1 a(s6.Input input, androidx.p000lifecycle.l0 l0Var) {
        return this.f18667a.b(input, l0Var);
    }
}
