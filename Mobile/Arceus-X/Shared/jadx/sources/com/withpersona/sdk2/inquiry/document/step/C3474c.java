package com.withpersona.sdk2.inquiry.document.step;

import androidx.p616lifecycle.C0967l0;
import co.C1693c1;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3474c implements C3473b.c {

    /* JADX INFO: renamed from: a */
    public final C1693c1 f13498a;

    public C3474c(C1693c1 c1693c1) {
        this.f13498a = c1693c1;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3473b.c> m16902b(C1693c1 c1693c1) {
        return C5831e.m26182a(new C3474c(c1693c1));
    }

    @Override // com.withpersona.sdk2.inquiry.document.step.C3473b.c
    /* JADX INFO: renamed from: a */
    public C3473b mo16899a(DocumentWorkflow.Input input, C0967l0 c0967l0) {
        return this.f13498a.m8406b(input, c0967l0);
    }
}
