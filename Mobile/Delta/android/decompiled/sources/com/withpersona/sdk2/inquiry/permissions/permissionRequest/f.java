package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tp.d f12363a;

    public f(tp.d dVar) {
        this.f12363a = dVar;
    }

    public static i<e.a> b(tp.d dVar) {
        return ft.e.a(new f(dVar));
    }

    @Override // com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a
    public e a(PermissionRequestWorkflow.Props props) {
        return this.f12363a.b(props);
    }
}
