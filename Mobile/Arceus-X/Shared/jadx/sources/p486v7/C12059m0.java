package p486v7;

import com.android.billingclient.api.C1746b;
import com.android.billingclient.api.C1748d;
import com.android.billingclient.api.C1752h;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.C2657t9;
import java.util.Objects;

/* JADX INFO: renamed from: v7.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12059m0 implements InterfaceC12026d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2657t9 f42633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1746b f42634b;

    public C12059m0(C1746b c1746b, C2657t9 c2657t9) {
        this.f42633a = c2657t9;
        Objects.requireNonNull(c1746b);
        this.f42634b = c1746b;
    }

    @Override // p486v7.InterfaceC12026d
    /* JADX INFO: renamed from: a */
    public final void mo25422a(final C1748d c1748d) {
        C2571m0.m11564l("BillingClient", "Reconnection finished with result: " + c1748d.m8610c());
        try {
            this.f42633a.m11763b(c1748d);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Exception setting completer.", th2);
        }
        C1746b c1746b = this.f42634b;
        if (c1746b.f6620J != null) {
            c1746b.m8528R(new Runnable() { // from class: v7.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C12059m0 c12059m0 = this.f42627a;
                    try {
                        c12059m0.f42634b.f6620J.mo25422a(c1748d);
                    } catch (Throwable th3) {
                        C2571m0.m11566n("BillingClient", "Exception calling onBillingSetupFinished.", th3);
                    }
                }
            });
        }
    }

    @Override // p486v7.InterfaceC12026d
    /* JADX INFO: renamed from: b */
    public final void mo25423b() {
        C2571m0.m11564l("BillingClient", "Reconnection attempt failed.");
        try {
            this.f42633a.m11763b(C1752h.f6764j);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Exception setting completer.", th2);
        }
        C1746b c1746b = this.f42634b;
        if (c1746b.f6620J != null) {
            c1746b.m8528R(new Runnable() { // from class: v7.k0
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f42626a.f42634b.f6620J.mo25423b();
                    } catch (Throwable th3) {
                        C2571m0.m11566n("BillingClient", "Exception calling onBillingServiceDisconnected.", th3);
                    }
                }
            });
        }
    }
}
