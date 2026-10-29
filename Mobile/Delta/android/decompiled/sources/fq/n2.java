package fq;

import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 implements k2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f17175a;

    public n2(m2 m2Var) {
        this.f17175a = m2Var;
    }

    public static ft.i<k2.d> b(m2 m2Var) {
        return ft.e.a(new n2(m2Var));
    }

    @Override // fq.k2.d
    public k2 a(SelfieWorkflow.Input input, androidx.p000lifecycle.l0 l0Var) {
        return this.f17175a.b(input, l0Var);
    }
}
