package tp;

import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.g;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<g> f31948a;

    public d(i<g> iVar) {
        this.f31948a = iVar;
    }

    public static d a(i<g> iVar) {
        return new d(iVar);
    }

    public static com.withpersona.sdk2.inquiry.permissions.permissionRequest.e c(g gVar, PermissionRequestWorkflow.Props props) {
        return new com.withpersona.sdk2.inquiry.permissions.permissionRequest.e(gVar, props);
    }

    public com.withpersona.sdk2.inquiry.permissions.permissionRequest.e b(PermissionRequestWorkflow.Props props) {
        return c(this.f31948a.get(), props);
    }
}
