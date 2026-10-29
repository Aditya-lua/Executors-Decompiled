package p306nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.zb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9402zb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9307tc f33846b;

    public RunnableC9402zb(C9307tc c9307tc, zzr zzrVar) {
        this.f33845a = zzrVar;
        Objects.requireNonNull(c9307tc);
        this.f33846b = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9307tc c9307tc = this.f33846b;
        InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
        if (interfaceC9042d5M36873N == null) {
            c9307tc.f33067a.mo36321a().m37003o().m36911a("Failed to send consent settings to service");
            return;
        }
        try {
            zzr zzrVar = this.f33845a;
            C8953m.m36047l(zzrVar);
            interfaceC9042d5M36873N.mo36108p2(zzrVar);
            c9307tc.m36869J();
        } catch (RemoteException e10) {
            this.f33846b.f33067a.mo36321a().m37003o().m36912b("Failed to send consent settings to the service", e10);
        }
    }
}
