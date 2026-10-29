package ae;

import android.os.Bundle;
import be.AbstractBinderC1339l0;
import java.util.List;
import sb.C11264k;

/* JADX INFO: renamed from: ae.z */
/* JADX INFO: loaded from: classes2.dex */
public class BinderC0201z extends AbstractBinderC1339l0 {

    /* JADX INFO: renamed from: a */
    public final C11264k f603a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0150a0 f604b;

    public BinderC0201z(C0150a0 c0150a0, C11264k c11264k) {
        this.f604b = c0150a0;
        this.f603a = c11264k;
    }

    /* JADX INFO: renamed from: R0 */
    public void mo546R0(Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onDeferredUninstall", new Object[0]);
    }

    @Override // be.InterfaceC1342m0
    /* JADX INFO: renamed from: Z */
    public final void mo549Z(int i10, Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onCompleteInstall(%d)", Integer.valueOf(i10));
    }

    @Override // be.InterfaceC1342m0
    /* JADX INFO: renamed from: b0 */
    public final void mo550b0(Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onGetSplitsForAppUpdate", new Object[0]);
    }

    @Override // be.InterfaceC1342m0
    /* JADX INFO: renamed from: d1 */
    public void mo551d1(Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // be.InterfaceC1342m0
    /* JADX INFO: renamed from: h0 */
    public final void mo552h0(Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        int i10 = bundle.getInt("error_code");
        C0150a0.f515c.m7208b("onError(%d)", Integer.valueOf(i10));
        this.f603a.m42329d(new C0149a(i10));
    }

    @Override // be.InterfaceC1342m0
    /* JADX INFO: renamed from: i */
    public void mo553i(int i10, Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onCancelInstall(%d)", Integer.valueOf(i10));
    }

    @Override // be.InterfaceC1342m0
    /* JADX INFO: renamed from: j */
    public void mo554j(Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onDeferredLanguageUninstall", new Object[0]);
    }

    /* JADX INFO: renamed from: k0 */
    public void mo548k0(int i10, Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onStartInstall(%d)", Integer.valueOf(i10));
    }

    @Override // be.InterfaceC1342m0
    /* JADX INFO: renamed from: q0 */
    public final void mo555q0(Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // be.InterfaceC1342m0
    /* JADX INFO: renamed from: r */
    public void mo556r(List list) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onGetSessionStates", new Object[0]);
    }

    /* JADX INFO: renamed from: t1 */
    public void mo537t1(Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onDeferredInstall", new Object[0]);
    }

    @Override // be.InterfaceC1342m0
    /* JADX INFO: renamed from: v0 */
    public void mo557v0(int i10, Bundle bundle) {
        this.f604b.f518b.m7154u(this.f603a);
        C0150a0.f515c.m7210d("onGetSession(%d)", Integer.valueOf(i10));
    }
}
