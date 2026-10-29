package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ob implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f25822a;
    public final /* synthetic */ tc b;

    public ob(tc tcVar, zzr zzrVar) {
        this.f25822a = zzrVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f25625a.a().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            zzr zzrVar = this.f25822a;
            n9.m.l(zzrVar);
            d5VarN.Z0(zzrVar);
        } catch (RemoteException e10) {
            this.b.f25625a.a().o().b("Failed to reset data on the service: remote exception", e10);
        }
        this.b.J();
    }
}
