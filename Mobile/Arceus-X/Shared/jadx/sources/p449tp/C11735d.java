package p449tp;

import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3875e;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3877g;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: tp.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11735d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3877g> f41395a;

    public C11735d(InterfaceC5835i<C3877g> interfaceC5835i) {
        this.f41395a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C11735d m43948a(InterfaceC5835i<C3877g> interfaceC5835i) {
        return new C11735d(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3875e m43949c(C3877g c3877g, PermissionRequestWorkflow.Props props) {
        return new C3875e(c3877g, props);
    }

    /* JADX INFO: renamed from: b */
    public C3875e m43950b(PermissionRequestWorkflow.Props props) {
        return m43949c(this.f41395a.get(), props);
    }
}
