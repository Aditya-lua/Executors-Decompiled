package s9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f31112a;
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r9.a f31113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f31114d;

    public s(u uVar, AtomicReference atomicReference, sb.k kVar, r9.a aVar) {
        this.f31114d = uVar;
        this.f31112a = atomicReference;
        this.b = kVar;
        this.f31113c = aVar;
    }

    @Override // s9.a, s9.g
    public final void s1(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f31112a.set(moduleInstallResponse);
        }
        l9.v.c(status, null, this.b);
        if (!status.A3() || (moduleInstallResponse != null && moduleInstallResponse.w3())) {
            this.f31114d.B(l9.l.c(this.f31113c, r9.a.class.getSimpleName()), 27306);
        }
    }
}
