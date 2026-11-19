package w7;

import com.google.android.gms.internal.play_billing.t9;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t9 f35628a;
    public final /* synthetic */ com.android.billingclient.api.b b;

    public m0(com.android.billingclient.api.b bVar, t9 t9Var) {
        this.f35628a = t9Var;
        Objects.requireNonNull(bVar);
        this.b = bVar;
    }

    @Override // w7.d
    public final void a(final com.android.billingclient.api.d dVar) {
        com.google.android.gms.internal.play_billing.m0.l("BillingClient", "Reconnection finished with result: " + dVar.c());
        try {
            this.f35628a.b(dVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception setting completer.", th2);
        }
        com.android.billingclient.api.b bVar = this.b;
        if (bVar.J != null) {
            bVar.R(new Runnable() { // from class: w7.l0
                @Override // java.lang.Runnable
                public final void run() {
                    m0 m0Var = this.f35624a;
                    try {
                        m0Var.b.J.a(dVar);
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception calling onBillingSetupFinished.", th3);
                    }
                }
            });
        }
    }

    @Override // w7.d
    public final void b() {
        com.google.android.gms.internal.play_billing.m0.l("BillingClient", "Reconnection attempt failed.");
        try {
            this.f35628a.b(com.android.billingclient.api.h.f5689j);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception setting completer.", th2);
        }
        com.android.billingclient.api.b bVar = this.b;
        if (bVar.J != null) {
            bVar.R(new Runnable() { // from class: w7.k0
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f35623a.b.J.b();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Exception calling onBillingServiceDisconnected.", th3);
                    }
                }
            });
        }
    }
}
