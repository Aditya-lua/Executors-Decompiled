package dq;

import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 implements k2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f15371a;

    public n2(m2 m2Var) {
        this.f15371a = m2Var;
    }

    public static dt.i<k2.d> b(m2 m2Var) {
        return dt.e.a(new n2(m2Var));
    }

    @Override // dq.k2.d
    public k2 a(SelfieWorkflow.Input input, androidx.p000lifecycle.l0 l0Var) {
        return this.f15371a.b(input, l0Var);
    }
}
