package p432s9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import p268l9.C8081v;
import sb.C11264k;

/* JADX INFO: renamed from: s9.r */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC11215r extends BinderC11198a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11264k f39546a;

    public BinderC11215r(C11218u c11218u, C11264k c11264k) {
        this.f39546a = c11264k;
    }

    @Override // p432s9.BinderC11198a, p432s9.InterfaceC11204g
    /* JADX INFO: renamed from: s1 */
    public final void mo42233s1(Status status, ModuleInstallResponse moduleInstallResponse) {
        C8081v.m33292c(status, moduleInstallResponse, this.f39546a);
    }
}
