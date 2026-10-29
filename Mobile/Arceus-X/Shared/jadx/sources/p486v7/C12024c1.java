package p486v7;

import com.android.billingclient.api.C1751g;
import com.android.billingclient.api.C1752h;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.EnumC2644s7;
import com.google.android.gms.internal.play_billing.InterfaceC2452b2;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: v7.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C12024c1 implements InterfaceC2452b2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC12631a f42582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f42583b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1751g f42584c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f42585d;

    public C12024c1(C1751g c1751g, int i10, InterfaceC12631a interfaceC12631a, Runnable runnable) {
        this.f42585d = i10;
        this.f42582a = interfaceC12631a;
        this.f42583b = runnable;
        Objects.requireNonNull(c1751g);
        this.f42584c = c1751g;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2452b2
    public final void zza(Throwable th2) {
        if (th2 instanceof TimeoutException) {
            this.f42584c.m8672g1(EnumC2644s7.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, C1752h.f6751F);
            C2571m0.m11566n("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            this.f42584c.m8672g1(EnumC2644s7.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, C1752h.f6751F);
            C2571m0.m11566n("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        this.f42583b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2452b2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        C1751g c1751g = this.f42584c;
        if (!C1751g.m8662d1(iIntValue)) {
            this.f42583b.run();
        } else {
            this.f42582a.accept(c1751g.m8670e1(this.f42585d, num.intValue()));
        }
    }
}
