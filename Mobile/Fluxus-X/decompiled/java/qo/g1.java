package qo;

import no.u2;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements e1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f30118a;

    public g1(f1 f1Var) {
        this.f30118a = f1Var;
    }

    public static wt.i<e1.c> b(f1 f1Var) {
        return wt.e.a(new g1(f1Var));
    }

    @Override // qo.e1.c
    public e1 a(u2.Input input, androidx.p000lifecycle.l0 l0Var) {
        return this.f30118a.b(input, l0Var);
    }
}
