package ae;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class z extends be.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k f474a;
    public final /* synthetic */ a0 b;

    public z(a0 a0Var, sb.k kVar) {
        this.b = a0Var;
        this.f474a = kVar;
    }

    public void R0(Bundle bundle) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onDeferredUninstall", new Object[0]);
    }

    @Override // be.m0
    public final void Z(int i10, Bundle bundle) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onCompleteInstall(%d)", Integer.valueOf(i10));
    }

    @Override // be.m0
    public final void b0(Bundle bundle) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onGetSplitsForAppUpdate", new Object[0]);
    }

    @Override // be.m0
    public void d1(Bundle bundle) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // be.m0
    public final void h0(Bundle bundle) {
        this.b.b.u(this.f474a);
        int i10 = bundle.getInt("error_code");
        a0.f403c.b("onError(%d)", Integer.valueOf(i10));
        this.f474a.d(new a(i10));
    }

    @Override // be.m0
    public void i(int i10, Bundle bundle) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onCancelInstall(%d)", Integer.valueOf(i10));
    }

    @Override // be.m0
    public void j(Bundle bundle) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onDeferredLanguageUninstall", new Object[0]);
    }

    public void k0(int i10, Bundle bundle) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onStartInstall(%d)", Integer.valueOf(i10));
    }

    @Override // be.m0
    public final void q0(Bundle bundle) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // be.m0
    public void r(List list) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onGetSessionStates", new Object[0]);
    }

    public void t1(Bundle bundle) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onDeferredInstall", new Object[0]);
    }

    @Override // be.m0
    public void v0(int i10, Bundle bundle) {
        this.b.b.u(this.f474a);
        a0.f403c.d("onGetSession(%d)", Integer.valueOf(i10));
    }
}
