package p449tp;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3873c;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: tp.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11734c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<PermissionRequestStateManager.InterfaceC3891c> f41394a;

    public C11734c(InterfaceC5835i<PermissionRequestStateManager.InterfaceC3891c> interfaceC5835i) {
        this.f41394a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C11734c m43945a(InterfaceC5835i<PermissionRequestStateManager.InterfaceC3891c> interfaceC5835i) {
        return new C11734c(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3873c m43946c(C0967l0 c0967l0, PermissionRequestStateManager.InterfaceC3891c interfaceC3891c) {
        return new C3873c(c0967l0, interfaceC3891c);
    }

    /* JADX INFO: renamed from: b */
    public C3873c m43947b(C0967l0 c0967l0) {
        return m43946c(c0967l0, this.f41394a.get());
    }
}
