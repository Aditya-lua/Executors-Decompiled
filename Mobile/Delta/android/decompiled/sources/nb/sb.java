package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f25950a;
    public final /* synthetic */ tc b;

    public sb(tc tcVar, zzr zzrVar) {
        this.f25950a = zzrVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f25625a.a().r().a("Failed to send app backgrounded");
            return;
        }
        try {
            zzr zzrVar = this.f25950a;
            n9.m.l(zzrVar);
            d5VarN.S1(zzrVar);
            tcVar.J();
        } catch (RemoteException e10) {
            this.b.f25625a.a().o().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
