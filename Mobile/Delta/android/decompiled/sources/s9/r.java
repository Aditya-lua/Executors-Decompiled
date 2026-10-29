package s9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: loaded from: classes.dex */
public final class r extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f30564a;

    public r(u uVar, sb.k kVar) {
        this.f30564a = kVar;
    }

    @Override // s9.a, s9.g
    public final void u1(Status status, ModuleInstallResponse moduleInstallResponse) {
        l9.v.c(status, moduleInstallResponse, this.f30564a);
    }
}
