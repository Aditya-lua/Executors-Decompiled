package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp.d f12444a;

    public f(rp.d dVar) {
        this.f12444a = dVar;
    }

    public static i<e.a> b(rp.d dVar) {
        return dt.e.a(new f(dVar));
    }

    @Override // com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a
    public e a(PermissionRequestWorkflow.Props props) {
        return this.f12444a.b(props);
    }
}
