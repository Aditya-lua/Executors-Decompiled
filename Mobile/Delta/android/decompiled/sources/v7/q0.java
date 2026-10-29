package v7;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.s7;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends com.google.android.gms.internal.play_billing.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f32827a;
    public final Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.b f32829d;

    public /* synthetic */ q0(com.android.billingclient.api.b bVar, p0 p0Var, Boolean bool, int i10, s0 s0Var) {
        Objects.requireNonNull(bVar);
        this.f32829d = bVar;
        this.f32827a = p0Var;
        this.b = bool;
        this.f32828c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.c
    public final void N1(Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Response bundle is null.");
            u2(this.f32827a, com.android.billingclient.api.h.f5171h, s7.NULL_BUNDLE_RETURNED_BY_PHONESKY, this.b.booleanValue(), null, this.f32828c);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Response bundle doesn't contain a response code");
            u2(this.f32827a, com.android.billingclient.api.h.f5171h, s7.RESPONSE_CODE_NOT_SET_IN_BUNDLE, this.b.booleanValue(), null, this.f32828c);
            return;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            u2(this.f32827a, com.android.billingclient.api.h.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), s7.NON_OK_CODE_RETURNED_BY_PHONESKY, this.b.booleanValue(), "Response code from Phonesky: " + bundle.getInt("RESPONSE_CODE"), this.f32828c);
            return;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Billing API version not found in response bundle.");
            u2(this.f32827a, com.android.billingclient.api.h.f5171h, s7.BILLING_API_VERSION_NOT_SET_IN_BUNDLE, this.b.booleanValue(), null, this.f32828c);
            return;
        }
        int i10 = bundle.getInt("BILLING_API_VERSION_KEY");
        com.android.billingclient.api.b bVar = this.f32829d;
        com.android.billingclient.api.b.N(bVar, i10);
        bVar.f5080l = i10 >= 5;
        bVar.f5079k = i10 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                l1.g(bundle2.getBoolean("DELEGATION_API_ENABLED_KEY"));
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                l1.f(bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY"));
            } catch (Throwable th3) {
                com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                l1.d(bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY"));
            } catch (Throwable th4) {
                com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th4);
            }
            try {
                l1.e(bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY"));
            } catch (Throwable th5) {
                com.google.android.gms.internal.play_billing.m0.n("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th5);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            com.google.android.gms.internal.play_billing.r0 r0Var = new com.google.android.gms.internal.play_billing.r0();
            for (h2 h2Var : h2.values()) {
                if (bundle3.getBoolean(h2Var.name(), false)) {
                    r0Var.b(h2Var);
                }
            }
            com.android.billingclient.api.b bVar2 = this.f32829d;
            bVar2.I = r0Var.c();
            if (bVar2.f5074f != null) {
                bVar2.f5074f.i(bVar2.I);
            }
        }
        com.android.billingclient.api.b bVar3 = this.f32829d;
        if (bVar3.f5081m < 3) {
            com.google.android.gms.internal.play_billing.m0.m("BillingClient", "In-app billing API version 3 is not supported on this device.");
            u2(this.f32827a, com.android.billingclient.api.h.b, s7.ONE_TIME_PRODUCT_NOT_SUPPORTED, this.b.booleanValue(), null, this.f32828c);
            return;
        }
        p0 p0Var = this.f32827a;
        Boolean bool = this.b;
        int i11 = this.f32828c;
        boolean zBooleanValue = bool.booleanValue();
        com.android.billingclient.api.b.P(bVar3, 0);
        synchronized (bVar3.f5070a) {
            try {
                if (bVar3.b == 3) {
                    return;
                }
                p0Var.j(zBooleanValue, i11);
                p0Var.k(com.android.billingclient.api.h.f5172i);
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    public final void u2(p0 p0Var, com.android.billingclient.api.d dVar, s7 s7Var, boolean z10, String str, int i10) {
        this.f32829d.f0(0);
        p0Var.i(dVar, s7Var, str, z10, i10);
        p0Var.k(dVar);
    }
}
