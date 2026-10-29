package eq;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import fq.k2;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<k2.d> f15741a;

    public l(ft.i<k2.d> iVar) {
        this.f15741a = iVar;
    }

    public static l a(ft.i<k2.d> iVar) {
        return new l(iVar);
    }

    public static com.withpersona.sdk2.inquiry.selfie.selfieStep.b c(l0 l0Var, SelfieWorkflow.Input input, k2.d dVar) {
        return new com.withpersona.sdk2.inquiry.selfie.selfieStep.b(l0Var, input, dVar);
    }

    public com.withpersona.sdk2.inquiry.selfie.selfieStep.b b(l0 l0Var, SelfieWorkflow.Input input) {
        return c(l0Var, input, this.f15741a.get());
    }
}
