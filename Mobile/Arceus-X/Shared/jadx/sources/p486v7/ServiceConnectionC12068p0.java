package p486v7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.C1746b;
import com.android.billingclient.api.C1748d;
import com.android.billingclient.api.C1752h;
import com.google.android.gms.internal.play_billing.AbstractBinderC2482e;
import com.google.android.gms.internal.play_billing.C2503f9;
import com.google.android.gms.internal.play_billing.C2536i9;
import com.google.android.gms.internal.play_billing.C2545j7;
import com.google.android.gms.internal.play_billing.C2567l7;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.C2580m9;
import com.google.android.gms.internal.play_billing.C2589n7;
import com.google.android.gms.internal.play_billing.C2591n9;
import com.google.android.gms.internal.play_billing.C2611p7;
import com.google.android.gms.internal.play_billing.C2613p9;
import com.google.android.gms.internal.play_billing.C2622q7;
import com.google.android.gms.internal.play_billing.C2666u7;
import com.google.android.gms.internal.play_billing.C2699x7;
import com.google.android.gms.internal.play_billing.C2713z;
import com.google.android.gms.internal.play_billing.EnumC2644s7;
import com.google.android.gms.internal.play_billing.InterfaceC2493f;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: v7.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC12068p0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12026d f42652a;

    /* JADX INFO: renamed from: b */
    public final C2713z f42653b;

    /* JADX INFO: renamed from: c */
    public final C2713z f42654c;

    /* JADX INFO: renamed from: d */
    public final int f42655d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1746b f42656e;

    public /* synthetic */ ServiceConnectionC12068p0(C1746b c1746b, InterfaceC12026d interfaceC12026d, int i10, C12077s0 c12077s0) {
        Objects.requireNonNull(c1746b);
        this.f42656e = c1746b;
        this.f42653b = C2713z.m11850c(c1746b.f6623M);
        this.f42654c = C2713z.m11850c(c1746b.f6623M);
        this.f42652a = interfaceC12026d;
        this.f42655d = i10;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x017f A[EDGE_INSN: B:152:0x017f->B:77:0x017f BREAK  A[LOOP:0: B:29:0x00a9->B:74:0x015e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0140, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m44908a(ServiceConnectionC12068p0 serviceConnectionC12068p0) {
        Bundle bundle;
        InterfaceC2493f interfaceC2493f;
        int i10;
        long j10;
        long j11;
        C1746b c1746b = serviceConnectionC12068p0.f42656e;
        synchronized (c1746b.f6624a) {
            try {
                if (c1746b.f6625b != 3) {
                    int i11 = 0;
                    boolean z10 = true;
                    boolean z11 = c1746b.f6625b == 1;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        C2571m0.m11555c(bundle, c1746b.f6626c, c1746b.f6627d, c1746b.f6622L.longValue());
                    }
                    EnumC2644s7 enumC2644s7 = EnumC2644s7.REASON_UNSPECIFIED;
                    synchronized (c1746b.f6624a) {
                        interfaceC2493f = c1746b.f6632i;
                    }
                    if (interfaceC2493f != null) {
                        String packageName = serviceConnectionC12068p0.f42656e.f6630g.getPackageName();
                        try {
                            if (interfaceC2493f.mo11345T(25, packageName, "inapp") != 0) {
                                Bundle bundle2 = bundle;
                                boolean z12 = z11;
                                int iMo11345T = 3;
                                int i12 = 28;
                                while (true) {
                                    if (i12 < 3) {
                                        i12 = 0;
                                        break;
                                    }
                                    try {
                                        C2571m0.m11564l("BillingClient", "trying subs apiVersion: " + i12);
                                        iMo11345T = bundle2 == null ? interfaceC2493f.mo11345T(i12, packageName, "subs") : interfaceC2493f.mo11346W1(i12, packageName, "subs", bundle2);
                                        if (iMo11345T == 0) {
                                            C2571m0.m11564l("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                            break;
                                        }
                                        i12--;
                                    } catch (Exception e10) {
                                        serviceConnectionC12068p0.m44920m(e10, z12);
                                        return null;
                                    }
                                }
                                C1746b c1746b2 = serviceConnectionC12068p0.f42656e;
                                c1746b2.f6635l = i12 >= 5;
                                if (i12 < 3) {
                                    z10 = false;
                                }
                                c1746b2.f6634k = z10;
                                if (i12 < 3) {
                                    enumC2644s7 = EnumC2644s7.SUBSCRIPTIONS_NOT_SUPPORTED;
                                    C2571m0.m11564l("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                for (int i13 = 28; i13 >= 3; i13--) {
                                    C2571m0.m11564l("BillingClient", "trying inapp apiVersion: " + i13);
                                    iMo11345T = bundle2 == null ? interfaceC2493f.mo11345T(i13, packageName, "inapp") : interfaceC2493f.mo11346W1(i13, packageName, "inapp", bundle2);
                                    if (iMo11345T == 0) {
                                        c1746b2.f6636m = i13;
                                        C2571m0.m11564l("BillingClient", "mHighestLevelSupportedForInApp: " + c1746b2.f6636m);
                                        break;
                                    }
                                }
                                C1746b.m8492N(c1746b2, c1746b2.f6636m);
                                if (c1746b2.f6636m < 3) {
                                    enumC2644s7 = EnumC2644s7.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                    C2571m0.m11565m("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                }
                                C1746b.m8496P(c1746b2, iMo11345T);
                                if (iMo11345T == 0) {
                                    serviceConnectionC12068p0.m44917j(z12, 0);
                                    serviceConnectionC12068p0.m44918k(C1752h.f6763i);
                                    return null;
                                }
                                C1748d c1748d = C1752h.f6756b;
                                serviceConnectionC12068p0.m44916i(c1748d, enumC2644s7, null, z12, 0);
                                serviceConnectionC12068p0.m44918k(c1748d);
                                return null;
                            }
                            C1746b c1746b3 = serviceConnectionC12068p0.f42656e;
                            long jM44853b = C12037f2.m44853b(c1746b3.f6630g);
                            long jM44854c = C12037f2.m44854c(c1746b3.f6630g);
                            double dM44852a = C12037f2.m44852a(c1746b3.f6630g);
                            boolean z13 = z11;
                            long jM44855d = C12037f2.m44855d(c1746b3.f6630g);
                            Exception e11 = null;
                            while (true) {
                                long j12 = i11;
                                if (j12 > jM44853b) {
                                    i10 = i11;
                                    break;
                                }
                                j10 = jM44854c;
                                try {
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(z13);
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putString("callingPackage", c1746b3.f6630g.getPackageName());
                                        j11 = jM44855d;
                                        try {
                                            C2571m0.m11555c(bundle3, c1746b3.f6626c, c1746b3.f6627d, c1746b3.f6622L.longValue());
                                            if (c1746b3.f6616F != null && c1746b3.f6616F.m44861a()) {
                                                bundle3.putBoolean("enablePendingPurchases", true);
                                            }
                                            if (c1746b3.f6616F != null) {
                                                try {
                                                    if (c1746b3.f6616F.m44862b()) {
                                                        try {
                                                            bundle3.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                                        } catch (Exception e12) {
                                                            e11 = e12;
                                                            i10 = i11;
                                                            if (j12 == jM44853b) {
                                                                serviceConnectionC12068p0.m44919l(e11, z13, i10);
                                                                return null;
                                                            }
                                                            C2571m0.m11566n("BillingClient", "Transient error during initialize(), retrying in " + j10 + "ms", e11);
                                                            try {
                                                                Thread.sleep(j10);
                                                                long j13 = j11;
                                                                i11 = i10 + 1;
                                                                jM44854c = (long) Math.min(j10 * dM44852a, j13);
                                                                jM44855d = j13;
                                                                interfaceC2493f = interfaceC2493f;
                                                            } catch (InterruptedException e13) {
                                                                Thread.currentThread().interrupt();
                                                                serviceConnectionC12068p0.m44919l(e13, z13, i10);
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e14) {
                                                    e11 = e14;
                                                }
                                            }
                                            i10 = i11;
                                            try {
                                                try {
                                                    try {
                                                        interfaceC2493f.mo11343D1(25, c1746b3.f6630g.getPackageName(), bundle3, new BinderC12071q0(c1746b3, serviceConnectionC12068p0, boolValueOf, i10, null));
                                                        return null;
                                                    } catch (Exception e15) {
                                                        e11 = e15;
                                                        if (j12 == jM44853b) {
                                                            serviceConnectionC12068p0.m44919l(e11, z13, i10);
                                                            return null;
                                                        }
                                                        C2571m0.m11566n("BillingClient", "Transient error during initialize(), retrying in " + j10 + "ms", e11);
                                                        Thread.sleep(j10);
                                                        long j14 = j11;
                                                        i11 = i10 + 1;
                                                        jM44854c = (long) Math.min(j10 * dM44852a, j14);
                                                        jM44855d = j14;
                                                        interfaceC2493f = interfaceC2493f;
                                                    }
                                                } catch (Exception e16) {
                                                    e11 = e16;
                                                    if (j12 == jM44853b) {
                                                        serviceConnectionC12068p0.m44919l(e11, z13, i10);
                                                        return null;
                                                    }
                                                    C2571m0.m11566n("BillingClient", "Transient error during initialize(), retrying in " + j10 + "ms", e11);
                                                    Thread.sleep(j10);
                                                    long j15 = j11;
                                                    i11 = i10 + 1;
                                                    jM44854c = (long) Math.min(j10 * dM44852a, j15);
                                                    jM44855d = j15;
                                                    interfaceC2493f = interfaceC2493f;
                                                }
                                            } catch (SecurityException e17) {
                                                e = e17;
                                                serviceConnectionC12068p0.m44919l(e, z13, i10);
                                                return null;
                                            }
                                        } catch (Exception e18) {
                                            e11 = e18;
                                            i10 = i11;
                                        }
                                    } catch (SecurityException e19) {
                                        e = e19;
                                        i10 = i11;
                                    }
                                } catch (Exception e20) {
                                    e11 = e20;
                                    i10 = i11;
                                    j11 = jM44855d;
                                }
                                long j16 = j11;
                                i11 = i10 + 1;
                                jM44854c = (long) Math.min(j10 * dM44852a, j16);
                                jM44855d = j16;
                                interfaceC2493f = interfaceC2493f;
                            }
                            serviceConnectionC12068p0.m44919l(e11, z13, i10);
                            return null;
                        } catch (Exception e21) {
                            serviceConnectionC12068p0.m44920m(e21, z11);
                            return null;
                        }
                    }
                    C1746b c1746b4 = serviceConnectionC12068p0.f42656e;
                    c1746b4.m8537f0(0);
                    int i14 = serviceConnectionC12068p0.f42655d;
                    EnumC2644s7 enumC2644s8 = EnumC2644s7.SERVICE_RESET_TO_NULL;
                    C1748d c1748d2 = C1752h.f6764j;
                    c1746b4.m8536e0(enumC2644s8, c1748d2, i14);
                    serviceConnectionC12068p0.m44918k(c1748d2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m44909b(ServiceConnectionC12068p0 serviceConnectionC12068p0) {
        C1746b c1746b = serviceConnectionC12068p0.f42656e;
        c1746b.m8537f0(0);
        EnumC2644s7 enumC2644s7 = EnumC2644s7.EXECUTE_ASYNC_TIMEOUT;
        C1748d c1748d = C1752h.f6765k;
        c1746b.m8536e0(enumC2644s7, c1748d, serviceConnectionC12068p0.f42655d);
        serviceConnectionC12068p0.m44918k(c1748d);
    }

    /* JADX INFO: renamed from: f */
    public final void m44913f() {
        synchronized (this.f42656e.f6624a) {
            C2713z c2713z = this.f42653b;
            c2713z.m11852d();
            c2713z.m11853e();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m44914g() {
        return this.f42655d > 0;
    }

    /* JADX INFO: renamed from: h */
    public final Long m44915h(boolean z10) {
        try {
            if (z10) {
                synchronized (this.f42656e.f6624a) {
                    try {
                        C2713z c2713z = this.f42653b;
                        if (!c2713z.m11855g()) {
                            return null;
                        }
                        c2713z.m11854f();
                        return Long.valueOf(c2713z.m11851a(TimeUnit.MILLISECONDS));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (this.f42656e.f6624a) {
                try {
                    C2713z c2713z2 = this.f42654c;
                    if (!c2713z2.m11855g()) {
                        return null;
                    }
                    c2713z2.m11854f();
                    return Long.valueOf(c2713z2.m11851a(TimeUnit.MILLISECONDS));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            C2571m0.m11566n("BillingClient", "Exception getting connection establishment duration.", th4);
        }
        C2571m0.m11566n("BillingClient", "Exception getting connection establishment duration.", th4);
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m44916i(C1748d c1748d, EnumC2644s7 enumC2644s7, String str, boolean z10, int i10) {
        try {
            C2622q7 c2622q7M11790C = C2666u7.m11790C();
            c2622q7M11790C.m11693t(c1748d.m8610c());
            c2622q7M11790C.m11689p(c1748d.m8608a());
            c2622q7M11790C.m11692s(enumC2644s7);
            c2622q7M11790C.m11690q(i10);
            if (str != null) {
                c2622q7M11790C.m11688o(str);
            }
            Long lM44915h = m44915h(z10);
            if (!z10) {
                C2503f9 c2503f9M11502B = C2536i9.m11502B();
                c2503f9M11502B.m11413o(c2622q7M11790C);
                if (lM44915h != null) {
                    c2503f9M11502B.m11414p(lM44915h.longValue());
                }
                this.f42656e.f6631h.mo44874i((C2536i9) c2503f9M11502B.m11645i());
                return;
            }
            C2591n9 c2591n9M11672B = C2613p9.m11672B();
            int i11 = this.f42655d;
            c2591n9M11672B.m11625o(i11 > 0);
            c2591n9M11672B.m11626p(i11);
            c2591n9M11672B.m11628r(i10);
            if (lM44915h != null) {
                c2591n9M11672B.m11627q(lM44915h.longValue());
            }
            C1746b c1746b = this.f42656e;
            C2545j7 c2545j7M11545E = C2567l7.m11545E();
            c2545j7M11545E.m11511p(c2622q7M11790C);
            c2545j7M11545E.m11515t(6);
            c2545j7M11545E.m11514s(c2591n9M11672B);
            c1746b.m8533b0((C2567l7) c2545j7M11545E.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m44917j(boolean z10, int i10) {
        try {
            Long lM44915h = m44915h(z10);
            if (!z10) {
                C2503f9 c2503f9M11502B = C2536i9.m11502B();
                C2622q7 c2622q7M11790C = C2666u7.m11790C();
                c2622q7M11790C.m11693t(0);
                c2622q7M11790C.m11690q(i10);
                c2503f9M11502B.m11413o(c2622q7M11790C);
                if (lM44915h != null) {
                    c2503f9M11502B.m11414p(lM44915h.longValue());
                }
                this.f42656e.f6631h.mo44874i((C2536i9) c2503f9M11502B.m11645i());
                return;
            }
            C2589n7 c2589n7M11664C = C2611p7.m11664C();
            c2589n7M11664C.m11624s(6);
            C2591n9 c2591n9M11672B = C2613p9.m11672B();
            int i11 = this.f42655d;
            c2591n9M11672B.m11625o(i11 > 0);
            c2591n9M11672B.m11626p(i11);
            c2591n9M11672B.m11628r(i10);
            if (lM44915h != null) {
                c2591n9M11672B.m11627q(lM44915h.longValue());
            }
            C1746b c1746b = this.f42656e;
            c2589n7M11664C.m11623r(c2591n9M11672B);
            c1746b.m8535d0((C2611p7) c2589n7M11664C.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m44918k(C1748d c1748d) {
        C1746b c1746b = this.f42656e;
        synchronized (c1746b.f6624a) {
            try {
                if (c1746b.f6625b == 3) {
                    return;
                }
                try {
                    this.f42652a.mo25422a(c1748d);
                } catch (Throwable th2) {
                    C2571m0.m11566n("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m44919l(Exception exc, boolean z10, int i10) {
        EnumC2644s7 enumC2644s7;
        C2571m0.m11566n("BillingClient", "Exception while invoking initialize AIDL method", exc);
        if (exc instanceof DeadObjectException) {
            enumC2644s7 = EnumC2644s7.INITIALIZE_DEAD_OBJECT_EXCEPTION;
        } else if (exc instanceof RemoteException) {
            enumC2644s7 = EnumC2644s7.INITIALIZE_REMOTE_EXCEPTION;
        } else {
            enumC2644s7 = exc instanceof SecurityException ? EnumC2644s7.INITIALIZE_SECURITY_EXCEPTION : EnumC2644s7.INITIALIZE_SERVICE_CALL_EXCEPTION;
        }
        EnumC2644s7 enumC2644s8 = enumC2644s7;
        String strM44857a = C12044h1.m44857a(exc);
        this.f42656e.m8537f0(0);
        m44916i(C1746b.m8478F0(exc), enumC2644s8, strM44857a, z10, i10);
        m44918k(C1746b.m8478F0(exc));
    }

    /* JADX INFO: renamed from: m */
    public final void m44920m(Exception exc, boolean z10) {
        EnumC2644s7 enumC2644s7;
        C2571m0.m11566n("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        if (exc instanceof DeadObjectException) {
            enumC2644s7 = EnumC2644s7.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
        } else if (exc instanceof RemoteException) {
            enumC2644s7 = EnumC2644s7.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
        } else {
            enumC2644s7 = exc instanceof SecurityException ? EnumC2644s7.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : EnumC2644s7.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
        }
        EnumC2644s7 enumC2644s8 = enumC2644s7;
        String strM44857a = enumC2644s8.equals(EnumC2644s7.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? C12044h1.m44857a(exc) : null;
        this.f42656e.m8537f0(0);
        m44916i(C1746b.m8478F0(exc), enumC2644s8, strM44857a, z10, 0);
        m44918k(C1746b.m8478F0(exc));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        C2571m0.m11565m("BillingClient", "Billing service died.");
        try {
            C1746b c1746b = this.f42656e;
            if (C1746b.m8500T(c1746b)) {
                InterfaceC12048i1 interfaceC12048i1 = c1746b.f6631h;
                C2545j7 c2545j7M11545E = C2567l7.m11545E();
                c2545j7M11545E.m11515t(6);
                C2622q7 c2622q7M11790C = C2666u7.m11790C();
                c2622q7M11790C.m11692s(EnumC2644s7.BINDING_DIED);
                c2545j7M11545E.m11511p(c2622q7M11790C);
                C2591n9 c2591n9M11672B = C2613p9.m11672B();
                int i10 = this.f42655d;
                c2591n9M11672B.m11625o(i10 > 0);
                c2591n9M11672B.m11626p(i10);
                c2545j7M11545E.m11514s(c2591n9M11672B);
                interfaceC12048i1.mo44875j((C2567l7) c2545j7M11545E.m11645i());
            } else {
                c1746b.f6631h.mo44878m(C2699x7.m11834C());
            }
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
        C1746b c1746b2 = this.f42656e;
        synchronized (c1746b2.f6624a) {
            if (c1746b2.f6625b != 3 && c1746b2.f6625b != 0) {
                c1746b2.m8537f0(0);
                c1746b2.m8539h0();
                try {
                    this.f42652a.mo25423b();
                } catch (Throwable th3) {
                    C2571m0.m11566n("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2571m0.m11564l("BillingClient", "Billing service connected.");
        C1746b c1746b = this.f42656e;
        synchronized (c1746b.f6624a) {
            try {
                if (c1746b.f6625b == 3) {
                    return;
                }
                c1746b.f6632i = AbstractBinderC2482e.m11374u2(iBinder);
                if (C1746b.m8509o(new Callable() { // from class: v7.n0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ServiceConnectionC12068p0.m44908a(this.f42639a);
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: v7.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC12068p0.m44909b(this.f42644a);
                    }
                }, c1746b.m8531Y(), c1746b.m8544n()) == null) {
                    int i10 = this.f42655d;
                    C1748d c1748dM8555x = c1746b.m8555x();
                    c1746b.m8536e0(EnumC2644s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, c1748dM8555x, i10);
                    m44918k(c1748dM8555x);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2571m0.m11565m("BillingClient", "Billing service disconnected.");
        try {
            C1746b c1746b = this.f42656e;
            if (C1746b.m8500T(c1746b)) {
                InterfaceC12048i1 interfaceC12048i1 = c1746b.f6631h;
                C2545j7 c2545j7M11545E = C2567l7.m11545E();
                c2545j7M11545E.m11515t(6);
                C2622q7 c2622q7M11790C = C2666u7.m11790C();
                c2622q7M11790C.m11692s(EnumC2644s7.SERVICE_DISCONNECTED);
                c2545j7M11545E.m11511p(c2622q7M11790C);
                C2591n9 c2591n9M11672B = C2613p9.m11672B();
                int i10 = this.f42655d;
                c2591n9M11672B.m11625o(i10 > 0);
                c2591n9M11672B.m11626p(i10);
                c2545j7M11545E.m11514s(c2591n9M11672B);
                interfaceC12048i1.mo44875j((C2567l7) c2545j7M11545E.m11645i());
            } else {
                c1746b.f6631h.mo44866a(C2580m9.m11596C());
            }
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
        C1746b c1746b2 = this.f42656e;
        synchronized (c1746b2.f6624a) {
            try {
                C2713z c2713z = this.f42654c;
                c2713z.m11852d();
                c2713z.m11853e();
                if (c1746b2.f6625b == 3) {
                    return;
                }
                c1746b2.m8537f0(0);
                try {
                    this.f42652a.mo25423b();
                } catch (Throwable th3) {
                    C2571m0.m11566n("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
