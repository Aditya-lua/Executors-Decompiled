package zd;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class z extends ae.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k f37518a;
    public final /* synthetic */ a0 b;

    public z(a0 a0Var, sb.k kVar) {
        this.b = a0Var;
        this.f37518a = kVar;
    }

    public void U0(Bundle bundle) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onDeferredUninstall", new Object[0]);
    }

    @Override // ae.m0
    public final void b0(int i10, Bundle bundle) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onCompleteInstall(%d)", Integer.valueOf(i10));
    }

    @Override // ae.m0
    public final void d0(Bundle bundle) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onGetSplitsForAppUpdate", new Object[0]);
    }

    @Override // ae.m0
    public void h1(Bundle bundle) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // ae.m0
    public void i(int i10, Bundle bundle) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onCancelInstall(%d)", Integer.valueOf(i10));
    }

    @Override // ae.m0
    public void j(Bundle bundle) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onDeferredLanguageUninstall", new Object[0]);
    }

    @Override // ae.m0
    public final void k0(Bundle bundle) {
        this.b.b.u(this.f37518a);
        int i10 = bundle.getInt("error_code");
        a0.f37447c.b("onError(%d)", Integer.valueOf(i10));
        this.f37518a.d(new a(i10));
    }

    public void n0(int i10, Bundle bundle) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onStartInstall(%d)", Integer.valueOf(i10));
    }

    @Override // ae.m0
    public void r(List list) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onGetSessionStates", new Object[0]);
    }

    @Override // ae.m0
    public final void s0(Bundle bundle) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    public void v1(Bundle bundle) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onDeferredInstall", new Object[0]);
    }

    @Override // ae.m0
    public void x0(int i10, Bundle bundle) {
        this.b.b.u(this.f37518a);
        a0.f37447c.d("onGetSession(%d)", Integer.valueOf(i10));
    }
}
