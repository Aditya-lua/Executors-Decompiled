package qr;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import dt.i;
import pr.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<g1.e> f30039a;

    public d(i<g1.e> iVar) {
        this.f30039a = iVar;
    }

    public static d a(i<g1.e> iVar) {
        return new d(iVar);
    }

    public static com.withpersona.sdk2.inquiry.ui.uiStep.b c(l0 l0Var, UiWorkflow.Input input, g1.e eVar) {
        return new com.withpersona.sdk2.inquiry.ui.uiStep.b(l0Var, input, eVar);
    }

    public com.withpersona.sdk2.inquiry.ui.uiStep.b b(l0 l0Var, UiWorkflow.Input input) {
        return c(l0Var, input, this.f30039a.get());
    }
}
