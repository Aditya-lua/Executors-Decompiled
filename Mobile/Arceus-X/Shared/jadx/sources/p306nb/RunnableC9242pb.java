package p306nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.pb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9242pb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f33352a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f33353b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9307tc f33354c;

    public RunnableC9242pb(C9307tc c9307tc, AtomicReference atomicReference, zzr zzrVar) {
        this.f33352a = atomicReference;
        this.f33353b = zzrVar;
        Objects.requireNonNull(c9307tc);
        this.f33354c = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f33352a;
        synchronized (atomicReference2) {
            try {
                try {
                    C9307tc c9307tc = this.f33354c;
                    C9094g7 c9094g7 = c9307tc.f33067a;
                    if (c9094g7.m36339x().m36450w().m36656o(EnumC9239p8.ANALYTICS_STORAGE)) {
                        InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
                        if (interfaceC9042d5M36873N != null) {
                            zzr zzrVar = this.f33353b;
                            C8953m.m36047l(zzrVar);
                            atomicReference2.set(interfaceC9042d5M36873N.mo36089A0(zzrVar));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                c9307tc.f33067a.m36307B().m36666E(str);
                                c9094g7.m36339x().f33120h.m36370b(str);
                            }
                            c9307tc.m36869J();
                            atomicReference = this.f33352a;
                            atomicReference.notify();
                            return;
                        }
                        c9094g7.mo36321a().m37003o().m36911a("Failed to get app instance id");
                    } else {
                        c9094g7.mo36321a().m37008t().m36911a("Analytics storage consent denied; will not get app instance id");
                        c9307tc.f33067a.m36307B().m36666E(null);
                        c9094g7.m36339x().f33120h.m36370b(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (RemoteException e10) {
                    this.f33354c.f33067a.mo36321a().m37003o().m36912b("Failed to get app instance id", e10);
                    atomicReference = this.f33352a;
                }
            } catch (Throwable th2) {
                this.f33352a.notify();
                throw th2;
            }
        }
    }
}
