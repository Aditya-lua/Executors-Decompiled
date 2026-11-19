package ob;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ub implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27851a;
    public final /* synthetic */ hf b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc f27852c;

    public ub(yc ycVar, AtomicReference atomicReference, hf hfVar) {
        this.f27851a = atomicReference;
        this.b = hfVar;
        Objects.requireNonNull(ycVar);
        this.f27852c = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f27851a;
        synchronized (atomicReference2) {
            try {
                try {
                    yc ycVar = this.f27852c;
                    l7 l7Var = ycVar.f27641a;
                    if (l7Var.x().w().o(u8.ANALYTICS_STORAGE)) {
                        i5 i5VarN = ycVar.N();
                        if (i5VarN != null) {
                            hf hfVar = this.b;
                            o9.s.l(hfVar);
                            atomicReference2.set(i5VarN.Y0(hfVar));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                ycVar.f27641a.B().E(str);
                                l7Var.x().f27688h.b(str);
                            }
                            ycVar.J();
                            atomicReference = this.f27851a;
                            atomicReference.notify();
                            return;
                        }
                        l7Var.a().o().a("Failed to get app instance id");
                    } else {
                        l7Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                        ycVar.f27641a.B().E(null);
                        l7Var.x().f27688h.b(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (RemoteException e10) {
                    this.f27852c.f27641a.a().o().b("Failed to get app instance id", e10);
                    atomicReference = this.f27851a;
                }
            } catch (Throwable th2) {
                this.f27851a.notify();
                throw th2;
            }
        }
    }
}
