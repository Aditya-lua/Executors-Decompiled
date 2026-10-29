package p112eq;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.C3982b;
import p134fq.C5772k2;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: eq.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C5191l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C5772k2.d> f20205a;

    public C5191l(InterfaceC5835i<C5772k2.d> interfaceC5835i) {
        this.f20205a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C5191l m24086a(InterfaceC5835i<C5772k2.d> interfaceC5835i) {
        return new C5191l(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3982b m24087c(C0967l0 c0967l0, SelfieWorkflow.Input input, C5772k2.d dVar) {
        return new C3982b(c0967l0, input, dVar);
    }

    /* JADX INFO: renamed from: b */
    public C3982b m24088b(C0967l0 c0967l0, SelfieWorkflow.Input input) {
        return m24087c(c0967l0, input, this.f20205a.get());
    }
}
