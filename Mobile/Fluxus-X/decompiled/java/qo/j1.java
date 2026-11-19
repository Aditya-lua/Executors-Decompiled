package qo;

import no.u2;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements h1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f30127a;

    public j1(i1 i1Var) {
        this.f30127a = i1Var;
    }

    public static wt.i<h1.a> b(i1 i1Var) {
        return wt.e.a(new j1(i1Var));
    }

    @Override // qo.h1.a
    public h1 a(androidx.p000lifecycle.l0 l0Var, u2.Input input) {
        return this.f30127a.b(l0Var, input);
    }
}
