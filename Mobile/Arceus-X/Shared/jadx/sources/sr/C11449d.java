package sr;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.p057ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p057ui.uiStep.C4191b;
import p136ft.InterfaceC5835i;
import p421rr.C11091g1;

/* JADX INFO: renamed from: sr.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11449d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C11091g1.e> f40461a;

    public C11449d(InterfaceC5835i<C11091g1.e> interfaceC5835i) {
        this.f40461a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C11449d m42866a(InterfaceC5835i<C11091g1.e> interfaceC5835i) {
        return new C11449d(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C4191b m42867c(C0967l0 c0967l0, UiWorkflow.Input input, C11091g1.e eVar) {
        return new C4191b(c0967l0, input, eVar);
    }

    /* JADX INFO: renamed from: b */
    public C4191b m42868b(C0967l0 c0967l0, UiWorkflow.Input input) {
        return m42867c(c0967l0, input, this.f40461a.get());
    }
}
