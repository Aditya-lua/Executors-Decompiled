package v7;

import com.google.android.gms.internal.play_billing.s7;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements com.google.android.gms.internal.play_billing.b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2.a f32774a;
    public final /* synthetic */ Runnable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.g f32775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32776d;

    public c1(com.android.billingclient.api.g gVar, int i10, x2.a aVar, Runnable runnable) {
        this.f32776d = i10;
        this.f32774a = aVar;
        this.b = runnable;
        Objects.requireNonNull(gVar);
        this.f32775c = gVar;
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    public final void zza(Throwable th2) {
        if (th2 instanceof TimeoutException) {
            this.f32775c.g1(s7.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, com.android.billingclient.api.h.F);
            com.google.android.gms.internal.play_billing.m0.n("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            this.f32775c.g1(s7.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, com.android.billingclient.api.h.F);
            com.google.android.gms.internal.play_billing.m0.n("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        this.b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        com.android.billingclient.api.g gVar = this.f32775c;
        if (!com.android.billingclient.api.g.d1(iIntValue)) {
            this.b.run();
        } else {
            this.f32774a.accept(gVar.e1(this.f32776d, num.intValue()));
        }
    }
}
