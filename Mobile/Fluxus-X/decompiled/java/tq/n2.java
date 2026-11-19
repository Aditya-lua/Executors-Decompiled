package tq;

import mq.q5;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 implements k2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f32792a;

    public n2(m2 m2Var) {
        this.f32792a = m2Var;
    }

    public static wt.i<k2.d> b(m2 m2Var) {
        return wt.e.a(new n2(m2Var));
    }

    @Override // tq.k2.d
    public k2 a(q5.Input input, androidx.p000lifecycle.l0 l0Var) {
        return this.f32792a.b(input, l0Var);
    }
}
