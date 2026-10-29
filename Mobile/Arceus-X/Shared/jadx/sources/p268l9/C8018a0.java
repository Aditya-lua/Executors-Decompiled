package p268l9;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import p213j9.C7089c;
import p305n9.C8953m;
import p504w1.C12278b;

/* JADX INFO: renamed from: l9.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8018a0 extends AbstractDialogInterfaceOnCancelListenerC8077t1 {

    /* JADX INFO: renamed from: f */
    public final C12278b f29969f;

    /* JADX INFO: renamed from: g */
    public final C8033f f29970g;

    public C8018a0(InterfaceC8045j interfaceC8045j, C8033f c8033f, C7089c c7089c) {
        super(interfaceC8045j, c7089c);
        this.f29969f = new C12278b();
        this.f29970g = c8033f;
        this.f30023a.mo33114g("ConnectionlessLifecycleHelper", this);
    }

    /* JADX INFO: renamed from: u */
    public static void m33103u(Activity activity, C8033f c8033f, C8021b c8021b) {
        InterfaceC8045j interfaceC8045jM33175c = C8042i.m33175c(activity);
        C8018a0 c8018a0 = (C8018a0) interfaceC8045jM33175c.mo33112d("ConnectionlessLifecycleHelper", C8018a0.class);
        if (c8018a0 == null) {
            c8018a0 = new C8018a0(interfaceC8045jM33175c, c8033f, C7089c.m29849o());
        }
        C8953m.m36048m(c8021b, "ApiKey cannot be null");
        c8018a0.f29969f.add(c8021b);
        c8033f.m33151b(c8018a0);
    }

    @Override // p268l9.C8042i
    /* JADX INFO: renamed from: h */
    public final void mo33104h() {
        super.mo33104h();
        m33110v();
    }

    @Override // p268l9.AbstractDialogInterfaceOnCancelListenerC8077t1, p268l9.C8042i
    /* JADX INFO: renamed from: j */
    public final void mo33105j() {
        super.mo33105j();
        m33110v();
    }

    @Override // p268l9.AbstractDialogInterfaceOnCancelListenerC8077t1, p268l9.C8042i
    /* JADX INFO: renamed from: k */
    public final void mo33106k() {
        super.mo33106k();
        this.f29970g.m33152c(this);
    }

    @Override // p268l9.AbstractDialogInterfaceOnCancelListenerC8077t1
    /* JADX INFO: renamed from: m */
    public final void mo33107m(ConnectionResult connectionResult, int i10) {
        this.f29970g.m33148H(connectionResult, i10);
    }

    @Override // p268l9.AbstractDialogInterfaceOnCancelListenerC8077t1
    /* JADX INFO: renamed from: n */
    public final void mo33108n() {
        this.f29970g.m33149I();
    }

    /* JADX INFO: renamed from: t */
    public final C12278b m33109t() {
        return this.f29969f;
    }

    /* JADX INFO: renamed from: v */
    public final void m33110v() {
        if (this.f29969f.isEmpty()) {
            return;
        }
        this.f29970g.m33151b(this);
    }
}
