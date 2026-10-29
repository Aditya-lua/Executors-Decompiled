package p306nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.ob */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9226ob implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33308a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9307tc f33309b;

    public RunnableC9226ob(C9307tc c9307tc, zzr zzrVar) {
        this.f33308a = zzrVar;
        Objects.requireNonNull(c9307tc);
        this.f33309b = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9307tc c9307tc = this.f33309b;
        InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
        if (interfaceC9042d5M36873N == null) {
            c9307tc.f33067a.mo36321a().m37003o().m36911a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            zzr zzrVar = this.f33308a;
            C8953m.m36047l(zzrVar);
            interfaceC9042d5M36873N.mo36100W0(zzrVar);
        } catch (RemoteException e10) {
            this.f33309b.f33067a.mo36321a().m37003o().m36912b("Failed to reset data on the service: remote exception", e10);
        }
        this.f33309b.m36869J();
    }
}
