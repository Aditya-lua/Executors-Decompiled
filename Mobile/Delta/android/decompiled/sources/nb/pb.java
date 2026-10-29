package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class pb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f25859a;
    public final /* synthetic */ zzr b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc f25860c;

    public pb(tc tcVar, AtomicReference atomicReference, zzr zzrVar) {
        this.f25859a = atomicReference;
        this.b = zzrVar;
        Objects.requireNonNull(tcVar);
        this.f25860c = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f25859a;
        synchronized (atomicReference2) {
            try {
                try {
                    tc tcVar = this.f25860c;
                    g7 g7Var = tcVar.f25625a;
                    if (g7Var.x().w().o(p8.ANALYTICS_STORAGE)) {
                        d5 d5VarN = tcVar.N();
                        if (d5VarN != null) {
                            zzr zzrVar = this.b;
                            n9.m.l(zzrVar);
                            atomicReference2.set(d5VarN.E0(zzrVar));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                tcVar.f25625a.B().E(str);
                                g7Var.x().f25673h.b(str);
                            }
                            tcVar.J();
                            atomicReference = this.f25859a;
                            atomicReference.notify();
                            return;
                        }
                        g7Var.a().o().a("Failed to get app instance id");
                    } else {
                        g7Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                        tcVar.f25625a.B().E(null);
                        g7Var.x().f25673h.b(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (RemoteException e10) {
                    this.f25860c.f25625a.a().o().b("Failed to get app instance id", e10);
                    atomicReference = this.f25859a;
                }
            } catch (Throwable th2) {
                this.f25859a.notify();
                throw th2;
            }
        }
    }
}
