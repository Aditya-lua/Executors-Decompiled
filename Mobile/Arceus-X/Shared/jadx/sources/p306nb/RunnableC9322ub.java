package p306nb;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: renamed from: nb.ub */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9322ub implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9014bb f33542a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9307tc f33543b;

    public RunnableC9322ub(C9307tc c9307tc, C9014bb c9014bb) {
        this.f33542a = c9014bb;
        Objects.requireNonNull(c9307tc);
        this.f33543b = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9307tc c9307tc = this.f33543b;
        InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
        if (interfaceC9042d5M36873N == null) {
            c9307tc.f33067a.mo36321a().m37003o().m36911a("Failed to send current screen to service");
            return;
        }
        try {
            C9014bb c9014bb = this.f33542a;
            if (c9014bb == null) {
                interfaceC9042d5M36873N.mo36098V0(0L, null, null, c9307tc.f33067a.mo36324d().getPackageName());
            } else {
                interfaceC9042d5M36873N.mo36098V0(c9014bb.f32726c, c9014bb.f32724a, c9014bb.f32725b, c9307tc.f33067a.mo36324d().getPackageName());
            }
            c9307tc.m36869J();
        } catch (RemoteException e10) {
            this.f33543b.f33067a.mo36321a().m37003o().m36912b("Failed to send current screen to the service", e10);
        }
    }
}
