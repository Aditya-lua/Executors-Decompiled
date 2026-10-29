package p306nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.rb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9274rb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9307tc f33440b;

    public RunnableC9274rb(C9307tc c9307tc, zzr zzrVar, boolean z10) {
        this.f33439a = zzrVar;
        Objects.requireNonNull(c9307tc);
        this.f33440b = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9307tc c9307tc = this.f33440b;
        InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
        if (interfaceC9042d5M36873N == null) {
            c9307tc.f33067a.mo36321a().m37003o().m36911a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.f33439a;
            C8953m.m36047l(zzrVar);
            C9094g7 c9094g7 = c9307tc.f33067a;
            C9150k c9150kM36338w = c9094g7.m36338w();
            C9379y4 c9379y4 = C9395z4.f33765c1;
            if (c9150kM36338w.m36406H(null, c9379y4)) {
                c9307tc.m36886b0(interfaceC9042d5M36873N, null, zzrVar);
            }
            interfaceC9042d5M36873N.mo36094K1(zzrVar);
            c9307tc.f33067a.m36310E().m36589v();
            c9094g7.m36338w().m36406H(null, c9379y4);
            c9307tc.m36886b0(interfaceC9042d5M36873N, null, zzrVar);
            c9307tc.m36869J();
        } catch (RemoteException e10) {
            this.f33440b.f33067a.mo36321a().m37003o().m36912b("Failed to send app launch to the service", e10);
        }
    }
}
