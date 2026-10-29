package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p449tp.C11735d;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3876f implements C3875e.a {

    /* JADX INFO: renamed from: a */
    public final C11735d f15900a;

    public C3876f(C11735d c11735d) {
        this.f15900a = c11735d;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3875e.a> m19205b(C11735d c11735d) {
        return C5831e.m26182a(new C3876f(c11735d));
    }

    @Override // com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3875e.a
    /* JADX INFO: renamed from: a */
    public C3875e mo19201a(PermissionRequestWorkflow.Props props) {
        return this.f15900a.m43950b(props);
    }
}
