package nb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26029a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbe f26030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f26031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f26032e;

    public vb(tc tcVar, boolean z10, zzr zzrVar, boolean z11, zzbe zzbeVar, Bundle bundle) {
        this.f26029a = zzrVar;
        this.b = z11;
        this.f26030c = zzbeVar;
        this.f26031d = bundle;
        Objects.requireNonNull(tcVar);
        this.f26032e = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f26032e;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f25625a.a().o().a("Failed to send default event parameters to service");
            return;
        }
        if (tcVar.f25625a.w().H(null, z4.f26156c1)) {
            zzr zzrVar = this.f26029a;
            n9.m.l(zzrVar);
            this.f26032e.b0(d5VarN, this.b ? null : this.f26030c, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.f26029a;
            n9.m.l(zzrVar2);
            d5VarN.F1(this.f26031d, zzrVar2);
            tcVar.J();
        } catch (RemoteException e10) {
            this.f26032e.f25625a.a().o().b("Failed to send default event parameters to service", e10);
        }
    }
}
