package nb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26850a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbe f26851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f26852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f26853e;

    public vb(tc tcVar, boolean z10, zzr zzrVar, boolean z11, zzbe zzbeVar, Bundle bundle) {
        this.f26850a = zzrVar;
        this.b = z11;
        this.f26851c = zzbeVar;
        this.f26852d = bundle;
        Objects.requireNonNull(tcVar);
        this.f26853e = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f26853e;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f26446a.a().o().a("Failed to send default event parameters to service");
            return;
        }
        if (tcVar.f26446a.w().H(null, z4.f26977c1)) {
            zzr zzrVar = this.f26850a;
            n9.m.l(zzrVar);
            this.f26853e.b0(d5VarN, this.b ? null : this.f26851c, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.f26850a;
            n9.m.l(zzrVar2);
            d5VarN.E1(this.f26852d, zzrVar2);
            tcVar.J();
        } catch (RemoteException e10) {
            this.f26853e.f26446a.a().o().b("Failed to send default event parameters to service", e10);
        }
    }
}
