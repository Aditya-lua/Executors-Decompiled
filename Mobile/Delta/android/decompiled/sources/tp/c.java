package tp;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<PermissionRequestStateManager.c> f31947a;

    public c(i<PermissionRequestStateManager.c> iVar) {
        this.f31947a = iVar;
    }

    public static c a(i<PermissionRequestStateManager.c> iVar) {
        return new c(iVar);
    }

    public static com.withpersona.sdk2.inquiry.permissions.permissionRequest.c c(l0 l0Var, PermissionRequestStateManager.c cVar) {
        return new com.withpersona.sdk2.inquiry.permissions.permissionRequest.c(l0Var, cVar);
    }

    public com.withpersona.sdk2.inquiry.permissions.permissionRequest.c b(l0 l0Var) {
        return c(l0Var, this.f31947a.get());
    }
}
