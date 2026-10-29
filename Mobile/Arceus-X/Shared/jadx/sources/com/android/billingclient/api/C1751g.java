package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.android.billingclient.api.C1748d;
import com.android.billingclient.api.C1751g;
import com.google.android.gms.internal.play_billing.C2474d2;
import com.google.android.gms.internal.play_billing.C2567l7;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.C2611p7;
import com.google.android.gms.internal.play_billing.C2657t9;
import com.google.android.gms.internal.play_billing.C2712y9;
import com.google.android.gms.internal.play_billing.EnumC2644s7;
import com.google.android.gms.internal.play_billing.EnumC2721z7;
import com.google.android.gms.internal.play_billing.InterfaceC2570m;
import com.google.android.gms.internal.play_billing.InterfaceC2679v9;
import com.google.android.gms.internal.play_billing.InterfaceFutureC2529i2;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p486v7.BinderC12028d1;
import p486v7.C12018b;
import p486v7.C12024c1;
import p486v7.C12030e;
import p486v7.C12044h1;
import p486v7.C12046i;
import p486v7.InterfaceC12022c;
import p486v7.InterfaceC12023c0;
import p486v7.InterfaceC12026d;
import p486v7.InterfaceC12034f;
import p486v7.InterfaceC12048i1;
import p486v7.InterfaceC12049j;
import p486v7.InterfaceC12058m;
import p486v7.InterfaceC12069p1;
import p486v7.ServiceConnectionC12032e1;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: com.android.billingclient.api.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1751g extends C1746b {

    /* JADX INFO: renamed from: N */
    public final Context f6741N;

    /* JADX INFO: renamed from: O */
    public volatile int f6742O;

    /* JADX INFO: renamed from: P */
    public volatile InterfaceC2570m f6743P;

    /* JADX INFO: renamed from: Q */
    public volatile ServiceConnectionC12032e1 f6744Q;

    /* JADX INFO: renamed from: R */
    public volatile ScheduledExecutorService f6745R;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1751g(String str, Context context, InterfaceC12048i1 interfaceC12048i1, ExecutorService executorService, AbstractC1745a.a aVar) {
        super(null, context, null, null, aVar);
        this.f6742O = 0;
        this.f6741N = context;
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ Object m8659X0(C1751g c1751g, int i10, C2657t9 c2657t9) {
        String str;
        try {
            if (c1751g.f6743P == null) {
                throw null;
            }
            InterfaceC2570m interfaceC2570m = c1751g.f6743P;
            String packageName = c1751g.f6741N.getPackageName();
            if (i10 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i10 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i10 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i10 != 5) {
                str = i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            interfaceC2570m.mo11506f1(packageName, str, new BinderC12028d1(c2657t9));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            c1751g.m8672g1(EnumC2644s7.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, C1752h.f6751F);
            C2571m0.m11566n("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            c2657t9.m11763b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static final boolean m8662d1(int i10) {
        return i10 > 0;
    }

    /* JADX INFO: renamed from: V0 */
    public final synchronized boolean m8666V0() {
        return (this.f6742O != 2 || this.f6743P == null || this.f6744Q == null) ? false : true;
    }

    @Override // com.android.billingclient.api.C1746b, com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: a */
    public final void mo8461a(final C12018b c12018b, final InterfaceC12022c interfaceC12022c) {
        Objects.requireNonNull(interfaceC12022c);
        m8674i1(3, new InterfaceC12631a() { // from class: v7.y0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                interfaceC12022c.mo25628a((C1748d) obj);
            }
        }, new Runnable() { // from class: v7.z0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.mo8461a(c12018b, interfaceC12022c);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a1 */
    public final int m8667a1(InterfaceFutureC2529i2 interfaceFutureC2529i2) {
        try {
            return ((Integer) interfaceFutureC2529i2.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            m8672g1(EnumC2644s7.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, C1752h.f6751F);
            C2571m0.m11566n("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
            return 0;
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m8672g1(EnumC2644s7.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, C1752h.f6751F);
            C2571m0.m11566n("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
            return 0;
        }
    }

    @Override // com.android.billingclient.api.C1746b, com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: b */
    public final void mo8462b(final C12030e c12030e, final InterfaceC12034f interfaceC12034f) {
        m8674i1(4, new InterfaceC12631a() { // from class: v7.v0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                interfaceC12034f.mo25629a((C1748d) obj, c12030e.m44849a());
            }
        }, new Runnable() { // from class: v7.w0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.mo8462b(c12030e, interfaceC12034f);
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public final synchronized ScheduledExecutorService m8668b1() {
        try {
            if (this.f6745R == null) {
                this.f6745R = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6745R;
    }

    /* JADX INFO: renamed from: c1 */
    public final synchronized void m8669c1() {
        if (m8666V0()) {
            C2571m0.m11564l("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            m8673h1(26);
            return;
        }
        if (this.f6742O == 1) {
            C2571m0.m11565m("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f6742O == 3) {
            C2571m0.m11565m("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            m8672g1(EnumC2644s7.BILLING_CLIENT_CLOSED, 26, C1752h.m8675a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f6742O = 1;
        C2571m0.m11564l("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f6744Q = new ServiceConnectionC12032e1(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.f6741N;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        EnumC2644s7 enumC2644s7 = EnumC2644s7.REASON_UNSPECIFIED;
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            enumC2644s7 = EnumC2644s7.INTENT_SERVICE_NOT_FOUND;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    enumC2644s7 = EnumC2644s7.BILLING_SERVICE_BLOCKED;
                    C2571m0.m11565m("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.f6744Q, 1)) {
                        C2571m0.m11564l("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        enumC2644s7 = EnumC2644s7.BILLING_SERVICE_BLOCKED;
                        C2571m0.m11565m("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.f6742O = 0;
        C2571m0.m11564l("BillingClientTesting", "Billing Override Service unavailable on device.");
        m8672g1(enumC2644s7, 26, C1752h.m8675a(2, "Billing Override Service unavailable on device."));
    }

    @Override // com.android.billingclient.api.C1746b, com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: e */
    public final C1748d mo8465e(final Activity activity, final C1747c c1747c) {
        InterfaceC12631a interfaceC12631a = new InterfaceC12631a() { // from class: v7.a1
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                super/*com.android.billingclient.api.b*/.m8527G0((C1748d) obj);
            }
        };
        Callable callable = new Callable() { // from class: v7.b1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return super/*com.android.billingclient.api.b*/.mo8465e(activity, c1747c);
            }
        };
        int iM8667a1 = m8667a1(m8671f1(2));
        if (m8662d1(iM8667a1)) {
            C1748d c1748dM8670e1 = m8670e1(2, iM8667a1);
            interfaceC12631a.accept(c1748dM8670e1);
            return c1748dM8670e1;
        }
        try {
            return (C1748d) callable.call();
        } catch (Exception e10) {
            EnumC2644s7 enumC2644s7 = EnumC2644s7.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            C1748d c1748d = C1752h.f6762h;
            m8672g1(enumC2644s7, 2, c1748d);
            C2571m0.m11566n("BillingClientTesting", "An internal error occurred.", e10);
            return c1748d;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final C1748d m8670e1(int i10, int i11) {
        C1748d c1748dM8675a = C1752h.m8675a(i11, "Billing override value was set by a license tester.");
        m8672g1(EnumC2644s7.LICENSE_TESTER_BILLING_OVERRIDE, i10, c1748dM8675a);
        return c1748dM8675a;
    }

    /* JADX INFO: renamed from: f1 */
    public final InterfaceFutureC2529i2 m8671f1(final int i10) {
        if (m8666V0()) {
            return C2712y9.m11848a(new InterfaceC2679v9() { // from class: v7.x0
                @Override // com.google.android.gms.internal.play_billing.InterfaceC2679v9
                /* JADX INFO: renamed from: a */
                public final Object mo11811a(C2657t9 c2657t9) {
                    return C1751g.m8659X0(this.f42700a, i10, c2657t9);
                }
            });
        }
        C2571m0.m11565m("BillingClientTesting", "Billing Override Service is not ready.");
        m8672g1(EnumC2644s7.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, C1752h.m8675a(-1, "Billing Override Service connection is disconnected."));
        return C2474d2.m11355a(0);
    }

    @Override // com.android.billingclient.api.C1746b, com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: g */
    public final void mo8466g(final C1750f c1750f, final InterfaceC12049j interfaceC12049j) {
        m8674i1(7, new InterfaceC12631a() { // from class: v7.t0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C12061n c12061n = new C12061n(new ArrayList(), new ArrayList());
                interfaceC12049j.mo25466a((C1748d) obj, c12061n);
            }
        }, new Runnable() { // from class: v7.u0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.mo8466g(c1750f, interfaceC12049j);
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final void m8672g1(EnumC2644s7 enumC2644s7, int i10, C1748d c1748d) {
        int i11 = C12044h1.f42603a;
        C2567l7 c2567l7M44858b = C12044h1.m44858b(enumC2644s7, i10, c1748d, null, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(c2567l7M44858b, "ApiFailure should not be null");
        m8525D0().mo44875j(c2567l7M44858b);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m8673h1(int i10) {
        int i11 = C12044h1.f42603a;
        C2611p7 c2611p7M44859c = C12044h1.m44859c(i10, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(c2611p7M44859c, "ApiSuccess should not be null");
        m8525D0().mo44868c(c2611p7M44859c);
    }

    @Override // com.android.billingclient.api.C1746b, com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: i */
    public final void mo8468i(InterfaceC12026d interfaceC12026d) {
        m8669c1();
        super.mo8468i(interfaceC12026d);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m8674i1(int i10, InterfaceC12631a interfaceC12631a, Runnable runnable) {
        C2474d2.m11357c(C2474d2.m11356b(m8671f1(i10), 28500L, TimeUnit.MILLISECONDS, m8668b1()), new C12024c1(this, i10, interfaceC12631a, runnable), m8544n());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1751g(String str, C12046i c12046i, Context context, InterfaceC12069p1 interfaceC12069p1, InterfaceC12048i1 interfaceC12048i1, ExecutorService executorService, AbstractC1745a.a aVar) {
        super(null, c12046i, context, null, null, null, aVar);
        this.f6742O = 0;
        this.f6741N = context;
    }

    public C1751g(String str, C12046i c12046i, Context context, InterfaceC12058m interfaceC12058m, InterfaceC12023c0 interfaceC12023c0, InterfaceC12048i1 interfaceC12048i1, ExecutorService executorService, AbstractC1745a.a aVar) {
        super(null, c12046i, context, interfaceC12058m, null, null, null, aVar);
        this.f6742O = 0;
        this.f6741N = context;
    }
}
