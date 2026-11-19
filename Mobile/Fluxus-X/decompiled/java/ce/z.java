package ce;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class z extends de.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.k f5021a;
    public final /* synthetic */ a0 b;

    public z(a0 a0Var, tb.k kVar) {
        this.b = a0Var;
        this.f5021a = kVar;
    }

    @Override // de.m0
    public void A0(int i10, Bundle bundle) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onGetSession(%d)", Integer.valueOf(i10));
    }

    @Override // de.m0
    public final void V(int i10, Bundle bundle) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onCompleteInstall(%d)", Integer.valueOf(i10));
    }

    @Override // de.m0
    public final void X(Bundle bundle) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onGetSplitsForAppUpdate", new Object[0]);
    }

    public void Z0(Bundle bundle) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onDeferredUninstall", new Object[0]);
    }

    @Override // de.m0
    public final void g0(Bundle bundle) {
        this.b.b.u(this.f5021a);
        int i10 = bundle.getInt("error_code");
        a0.f4950c.b("onError(%d)", Integer.valueOf(i10));
        this.f5021a.d(new a(i10));
    }

    @Override // de.m0
    public void i(int i10, Bundle bundle) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onCancelInstall(%d)", Integer.valueOf(i10));
    }

    @Override // de.m0
    public void j(Bundle bundle) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onDeferredLanguageUninstall", new Object[0]);
    }

    public void j0(int i10, Bundle bundle) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onStartInstall(%d)", Integer.valueOf(i10));
    }

    @Override // de.m0
    public void m1(Bundle bundle) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // de.m0
    public final void r0(Bundle bundle) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // de.m0
    public void s(List list) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onGetSessionStates", new Object[0]);
    }

    public void z1(Bundle bundle) {
        this.b.b.u(this.f5021a);
        a0.f4950c.d("onDeferredInstall", new Object[0]);
    }
}
