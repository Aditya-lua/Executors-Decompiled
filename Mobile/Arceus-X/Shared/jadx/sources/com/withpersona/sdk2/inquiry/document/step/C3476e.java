package com.withpersona.sdk2.inquiry.document.step;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3476e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3473b.c> f13502a;

    public C3476e(InterfaceC5835i<C3473b.c> interfaceC5835i) {
        this.f13502a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C3476e m16906a(InterfaceC5835i<C3473b.c> interfaceC5835i) {
        return new C3476e(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3475d m16907c(C0967l0 c0967l0, DocumentWorkflow.Input input, C3473b.c cVar) {
        return new C3475d(c0967l0, input, cVar);
    }

    /* JADX INFO: renamed from: b */
    public C3475d m16908b(C0967l0 c0967l0, DocumentWorkflow.Input input) {
        return m16907c(c0967l0, input, this.f13502a.get());
    }
}
