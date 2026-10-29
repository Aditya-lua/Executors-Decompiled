package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3594e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3591b.c> f14278a;

    public C3594e(InterfaceC5835i<C3591b.c> interfaceC5835i) {
        this.f14278a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C3594e m17917a(InterfaceC5835i<C3591b.c> interfaceC5835i) {
        return new C3594e(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3593d m17918c(C0967l0 c0967l0, GovernmentIdWorkflow.Input input, C3591b.c cVar) {
        return new C3593d(c0967l0, input, cVar);
    }

    /* JADX INFO: renamed from: b */
    public C3593d m17919b(C0967l0 c0967l0, GovernmentIdWorkflow.Input input) {
        return m17918c(c0967l0, input, this.f14278a.get());
    }
}
