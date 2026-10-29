package p432s9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.concurrent.atomic.AtomicReference;
import p268l9.C8051l;
import p268l9.C8081v;
import p405r9.InterfaceC10797a;
import sb.C11264k;

/* JADX INFO: renamed from: s9.s */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC11216s extends BinderC11198a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f39547a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11264k f39548b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC10797a f39549c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C11218u f39550d;

    public BinderC11216s(C11218u c11218u, AtomicReference atomicReference, C11264k c11264k, InterfaceC10797a interfaceC10797a) {
        this.f39550d = c11218u;
        this.f39547a = atomicReference;
        this.f39548b = c11264k;
        this.f39549c = interfaceC10797a;
    }

    @Override // p432s9.BinderC11198a, p432s9.InterfaceC11204g
    /* JADX INFO: renamed from: s1 */
    public final void mo42233s1(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f39547a.set(moduleInstallResponse);
        }
        C8081v.m33292c(status, null, this.f39548b);
        if (!status.m9163A3() || (moduleInstallResponse != null && moduleInstallResponse.m9226w3())) {
            this.f39550d.m31134B(C8051l.m33235c(this.f39549c, InterfaceC10797a.class.getSimpleName()), 27306);
        }
    }
}
