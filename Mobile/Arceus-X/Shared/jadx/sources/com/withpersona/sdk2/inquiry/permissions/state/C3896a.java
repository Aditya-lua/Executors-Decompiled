package com.withpersona.sdk2.inquiry.permissions.state;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p474up.C11929l;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.state.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3896a implements PermissionRequestStateManager.InterfaceC3891c {

    /* JADX INFO: renamed from: a */
    public final C11929l f15938a;

    public C3896a(C11929l c11929l) {
        this.f15938a = c11929l;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<PermissionRequestStateManager.InterfaceC3891c> m19270b(C11929l c11929l) {
        return C5831e.m26182a(new C3896a(c11929l));
    }

    @Override // com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager.InterfaceC3891c
    /* JADX INFO: renamed from: a */
    public PermissionRequestStateManager mo19264a(PermissionRequestWorkflow.Props props, C0967l0 c0967l0) {
        return this.f15938a.m44525b(props, c0967l0);
    }
}
