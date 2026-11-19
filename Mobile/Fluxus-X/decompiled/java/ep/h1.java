package ep;

import vo.d2;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 implements f1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f13962a;

    public h1(g1 g1Var) {
        this.f13962a = g1Var;
    }

    public static wt.i<f1.c> b(g1 g1Var) {
        return wt.e.a(new h1(g1Var));
    }

    @Override // ep.f1.c
    public f1 a(d2.a aVar, androidx.p000lifecycle.l0 l0Var) {
        return this.f13962a.b(aVar, l0Var);
    }
}
