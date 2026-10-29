package p306nb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.vb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9338vb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33562a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f33563b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbe f33564c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f33565d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9307tc f33566e;

    public RunnableC9338vb(C9307tc c9307tc, boolean z10, zzr zzrVar, boolean z11, zzbe zzbeVar, Bundle bundle) {
        this.f33562a = zzrVar;
        this.f33563b = z11;
        this.f33564c = zzbeVar;
        this.f33565d = bundle;
        Objects.requireNonNull(c9307tc);
        this.f33566e = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9307tc c9307tc = this.f33566e;
        InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
        if (interfaceC9042d5M36873N == null) {
            c9307tc.f33067a.mo36321a().m37003o().m36911a("Failed to send default event parameters to service");
            return;
        }
        if (c9307tc.f33067a.m36338w().m36406H(null, C9395z4.f33765c1)) {
            zzr zzrVar = this.f33562a;
            C8953m.m36047l(zzrVar);
            this.f33566e.m36886b0(interfaceC9042d5M36873N, this.f33563b ? null : this.f33564c, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.f33562a;
            C8953m.m36047l(zzrVar2);
            interfaceC9042d5M36873N.mo36091E1(this.f33565d, zzrVar2);
            c9307tc.m36869J();
        } catch (RemoteException e10) {
            this.f33566e.f33067a.mo36321a().m37003o().m36912b("Failed to send default event parameters to service", e10);
        }
    }
}
