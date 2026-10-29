package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f25931a;
    public final /* synthetic */ tc b;

    public rb(tc tcVar, zzr zzrVar, boolean z10) {
        this.f25931a = zzrVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f25625a.a().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzr zzrVar = this.f25931a;
            n9.m.l(zzrVar);
            g7 g7Var = tcVar.f25625a;
            k kVarW = g7Var.w();
            y4 y4Var = z4.f26156c1;
            if (kVarW.H(null, y4Var)) {
                tcVar.b0(d5VarN, null, zzrVar);
            }
            d5VarN.K1(zzrVar);
            tcVar.f25625a.E().v();
            g7Var.w().H(null, y4Var);
            tcVar.b0(d5VarN, null, zzrVar);
            tcVar.J();
        } catch (RemoteException e10) {
            this.b.f25625a.a().o().b("Failed to send app launch to the service", e10);
        }
    }
}
