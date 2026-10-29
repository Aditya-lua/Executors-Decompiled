package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26231a;
    public final /* synthetic */ tc b;

    public zb(tc tcVar, zzr zzrVar) {
        this.f26231a = zzrVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f25625a.a().o().a("Failed to send consent settings to service");
            return;
        }
        try {
            zzr zzrVar = this.f26231a;
            n9.m.l(zzrVar);
            d5VarN.p2(zzrVar);
            tcVar.J();
        } catch (RemoteException e10) {
            this.b.f25625a.a().o().b("Failed to send consent settings to the service", e10);
        }
    }
}
