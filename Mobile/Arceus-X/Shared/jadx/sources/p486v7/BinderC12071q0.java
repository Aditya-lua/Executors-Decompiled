package p486v7;

import android.os.Bundle;
import com.android.billingclient.api.C1746b;
import com.android.billingclient.api.C1748d;
import com.android.billingclient.api.C1752h;
import com.google.android.gms.internal.play_billing.AbstractBinderC2449b;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.C2626r0;
import com.google.android.gms.internal.play_billing.EnumC2644s7;
import java.util.Objects;

/* JADX INFO: renamed from: v7.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC12071q0 extends AbstractBinderC2449b {

    /* JADX INFO: renamed from: a */
    public final ServiceConnectionC12068p0 f42657a;

    /* JADX INFO: renamed from: b */
    public final Boolean f42658b;

    /* JADX INFO: renamed from: c */
    public final int f42659c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1746b f42660d;

    public /* synthetic */ BinderC12071q0(C1746b c1746b, ServiceConnectionC12068p0 serviceConnectionC12068p0, Boolean bool, int i10, C12077s0 c12077s0) {
        Objects.requireNonNull(c1746b);
        this.f42660d = c1746b;
        this.f42657a = serviceConnectionC12068p0;
        this.f42658b = bool;
        this.f42659c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2460c
    /* JADX INFO: renamed from: N1 */
    public final void mo11323N1(Bundle bundle) {
        if (bundle == null) {
            C2571m0.m11565m("BillingClient", "Response bundle is null.");
            m44921u2(this.f42657a, C1752h.f6762h, EnumC2644s7.NULL_BUNDLE_RETURNED_BY_PHONESKY, this.f42658b.booleanValue(), null, this.f42659c);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            C2571m0.m11565m("BillingClient", "Response bundle doesn't contain a response code");
            m44921u2(this.f42657a, C1752h.f6762h, EnumC2644s7.RESPONSE_CODE_NOT_SET_IN_BUNDLE, this.f42658b.booleanValue(), null, this.f42659c);
            return;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            m44921u2(this.f42657a, C1752h.m8675a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), EnumC2644s7.NON_OK_CODE_RETURNED_BY_PHONESKY, this.f42658b.booleanValue(), "Response code from Phonesky: " + bundle.getInt("RESPONSE_CODE"), this.f42659c);
            return;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            C2571m0.m11565m("BillingClient", "Billing API version not found in response bundle.");
            m44921u2(this.f42657a, C1752h.f6762h, EnumC2644s7.BILLING_API_VERSION_NOT_SET_IN_BUNDLE, this.f42658b.booleanValue(), null, this.f42659c);
            return;
        }
        int i10 = bundle.getInt("BILLING_API_VERSION_KEY");
        C1746b c1746b = this.f42660d;
        C1746b.m8492N(c1746b, i10);
        c1746b.f6635l = i10 >= 5;
        c1746b.f6634k = i10 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                C12057l1.m44896g(bundle2.getBoolean("DELEGATION_API_ENABLED_KEY"));
            } catch (Throwable th2) {
                C2571m0.m11566n("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                C12057l1.m44895f(bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY"));
            } catch (Throwable th3) {
                C2571m0.m11566n("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                C12057l1.m44893d(bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY"));
            } catch (Throwable th4) {
                C2571m0.m11566n("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th4);
            }
            try {
                C12057l1.m44894e(bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY"));
            } catch (Throwable th5) {
                C2571m0.m11566n("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th5);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            C2626r0 c2626r0 = new C2626r0();
            for (EnumC12045h2 enumC12045h2 : EnumC12045h2.values()) {
                if (bundle3.getBoolean(enumC12045h2.name(), false)) {
                    c2626r0.m11695b(enumC12045h2);
                }
            }
            C1746b c1746b2 = this.f42660d;
            c1746b2.f6619I = c2626r0.m11696c();
            if (c1746b2.f6629f != null) {
                c1746b2.f6629f.m44937i(c1746b2.f6619I);
            }
        }
        C1746b c1746b3 = this.f42660d;
        if (c1746b3.f6636m < 3) {
            C2571m0.m11565m("BillingClient", "In-app billing API version 3 is not supported on this device.");
            m44921u2(this.f42657a, C1752h.f6756b, EnumC2644s7.ONE_TIME_PRODUCT_NOT_SUPPORTED, this.f42658b.booleanValue(), null, this.f42659c);
            return;
        }
        ServiceConnectionC12068p0 serviceConnectionC12068p0 = this.f42657a;
        Boolean bool = this.f42658b;
        int i11 = this.f42659c;
        boolean zBooleanValue = bool.booleanValue();
        C1746b.m8496P(c1746b3, 0);
        synchronized (c1746b3.f6624a) {
            try {
                if (c1746b3.f6625b == 3) {
                    return;
                }
                serviceConnectionC12068p0.m44917j(zBooleanValue, i11);
                serviceConnectionC12068p0.m44918k(C1752h.f6763i);
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final void m44921u2(ServiceConnectionC12068p0 serviceConnectionC12068p0, C1748d c1748d, EnumC2644s7 enumC2644s7, boolean z10, String str, int i10) {
        this.f42660d.m8537f0(0);
        serviceConnectionC12068p0.m44916i(c1748d, enumC2644s7, str, z10, i10);
        serviceConnectionC12068p0.m44918k(c1748d);
    }
}
