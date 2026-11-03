package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class pb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26680a;
    public final /* synthetic */ zzr b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc f26681c;

    public pb(tc tcVar, AtomicReference atomicReference, zzr zzrVar) {
        this.f26680a = atomicReference;
        this.b = zzrVar;
        Objects.requireNonNull(tcVar);
        this.f26681c = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f26680a;
        synchronized (atomicReference2) {
            try {
                try {
                    tc tcVar = this.f26681c;
                    g7 g7Var = tcVar.f26446a;
                    if (g7Var.x().w().o(p8.ANALYTICS_STORAGE)) {
                        d5 d5VarN = tcVar.N();
                        if (d5VarN != null) {
                            zzr zzrVar = this.b;
                            n9.m.l(zzrVar);
                            atomicReference2.set(d5VarN.A0(zzrVar));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                tcVar.f26446a.B().E(str);
                                g7Var.x().f26494h.b(str);
                            }
                            tcVar.J();
                            atomicReference = this.f26680a;
                            atomicReference.notify();
                            return;
                        }
                        g7Var.a().o().a("Failed to get app instance id");
                    } else {
                        g7Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                        tcVar.f26446a.B().E(null);
                        g7Var.x().f26494h.b(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (RemoteException e10) {
                    this.f26681c.f26446a.a().o().b("Failed to get app instance id", e10);
                    atomicReference = this.f26680a;
                }
            } catch (Throwable th2) {
                this.f26680a.notify();
                throw th2;
            }
        }
    }
}
