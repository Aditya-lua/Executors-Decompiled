package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.d2;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.m;
import com.google.android.gms.internal.play_billing.m0;
import com.google.android.gms.internal.play_billing.p7;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.t9;
import com.google.android.gms.internal.play_billing.v9;
import com.google.android.gms.internal.play_billing.y9;
import com.google.android.gms.internal.play_billing.z7;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v7.c0;
import v7.c1;
import v7.d1;
import v7.e1;
import v7.h1;
import v7.i1;
import v7.p1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public final Context N;
    public volatile int O;
    public volatile m P;
    public volatile e1 Q;
    public volatile ScheduledExecutorService R;

    public g(String str, Context context, i1 i1Var, ExecutorService executorService, a.C0108a c0108a) {
        super(null, context, null, null, c0108a);
        this.O = 0;
        this.N = context;
    }

    public static /* synthetic */ Object X0(g gVar, int i10, t9 t9Var) {
        String str;
        try {
            if (gVar.P == null) {
                throw null;
            }
            m mVar = gVar.P;
            String packageName = gVar.N.getPackageName();
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
            mVar.j1(packageName, str, new d1(t9Var));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            gVar.g1(s7.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, h.F);
            m0.n("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            t9Var.b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public static final boolean d1(int i10) {
        return i10 > 0;
    }

    public final synchronized boolean V0() {
        return (this.O != 2 || this.P == null || this.Q == null) ? false : true;
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void a(final v7.b bVar, final v7.c cVar) {
        Objects.requireNonNull(cVar);
        i1(3, new x2.a() { // from class: v7.y0
            @Override // x2.a
            public final void accept(Object obj) {
                cVar.a((com.android.billingclient.api.d) obj);
            }
        }, new Runnable() { // from class: v7.z0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.a(bVar, cVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a1(i2 i2Var) {
        try {
            return ((Integer) i2Var.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            g1(s7.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, h.F);
            m0.n("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
            return 0;
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            g1(s7.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, h.F);
            m0.n("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
            return 0;
        }
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void b(final v7.e eVar, final v7.f fVar) {
        i1(4, new x2.a() { // from class: v7.v0
            @Override // x2.a
            public final void accept(Object obj) {
                fVar.a((com.android.billingclient.api.d) obj, eVar.a());
            }
        }, new Runnable() { // from class: v7.w0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.b(eVar, fVar);
            }
        });
    }

    public final synchronized ScheduledExecutorService b1() {
        try {
            if (this.R == null) {
                this.R = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.R;
    }

    public final synchronized void c1() {
        if (V0()) {
            m0.l("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            h1(26);
            return;
        }
        if (this.O == 1) {
            m0.m("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.O == 3) {
            m0.m("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            g1(s7.BILLING_CLIENT_CLOSED, 26, h.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.O = 1;
        m0.l("BillingClientTesting", "Starting Billing Override Service setup.");
        this.Q = new e1(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.N;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        s7 s7Var = s7.REASON_UNSPECIFIED;
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            s7Var = s7.INTENT_SERVICE_NOT_FOUND;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    s7Var = s7.BILLING_SERVICE_BLOCKED;
                    m0.m("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.Q, 1)) {
                        m0.l("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        s7Var = s7.BILLING_SERVICE_BLOCKED;
                        m0.m("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.O = 0;
        m0.l("BillingClientTesting", "Billing Override Service unavailable on device.");
        g1(s7Var, 26, h.a(2, "Billing Override Service unavailable on device."));
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final d e(final Activity activity, final c cVar) {
        x2.a aVar = new x2.a() { // from class: v7.a1
            @Override // x2.a
            public final void accept(Object obj) {
                super/*com.android.billingclient.api.b*/.G0((com.android.billingclient.api.d) obj);
            }
        };
        Callable callable = new Callable() { // from class: v7.b1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return super/*com.android.billingclient.api.b*/.e(activity, cVar);
            }
        };
        int iA1 = a1(f1(2));
        if (d1(iA1)) {
            d dVarE1 = e1(2, iA1);
            aVar.accept(dVarE1);
            return dVarE1;
        }
        try {
            return (d) callable.call();
        } catch (Exception e10) {
            s7 s7Var = s7.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            d dVar = h.f5171h;
            g1(s7Var, 2, dVar);
            m0.n("BillingClientTesting", "An internal error occurred.", e10);
            return dVar;
        }
    }

    public final d e1(int i10, int i11) {
        d dVarA = h.a(i11, "Billing override value was set by a license tester.");
        g1(s7.LICENSE_TESTER_BILLING_OVERRIDE, i10, dVarA);
        return dVarA;
    }

    public final i2 f1(final int i10) {
        if (V0()) {
            return y9.a(new v9() { // from class: v7.x0
                @Override // com.google.android.gms.internal.play_billing.v9
                public final Object a(t9 t9Var) {
                    return com.android.billingclient.api.g.X0(this.f32860a, i10, t9Var);
                }
            });
        }
        m0.m("BillingClientTesting", "Billing Override Service is not ready.");
        g1(s7.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, h.a(-1, "Billing Override Service connection is disconnected."));
        return d2.a(0);
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void g(final f fVar, final v7.j jVar) {
        i1(7, new x2.a() { // from class: v7.t0
            @Override // x2.a
            public final void accept(Object obj) {
                n nVar = new n(new ArrayList(), new ArrayList());
                jVar.a((com.android.billingclient.api.d) obj, nVar);
            }
        }, new Runnable() { // from class: v7.u0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.g(fVar, jVar);
            }
        });
    }

    public final void g1(s7 s7Var, int i10, d dVar) {
        int i11 = h1.f32789a;
        l7 l7VarB = h1.b(s7Var, i10, dVar, null, z7.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(l7VarB, "ApiFailure should not be null");
        D0().j(l7VarB);
    }

    public final void h1(int i10) {
        int i11 = h1.f32789a;
        p7 p7VarC = h1.c(i10, z7.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(p7VarC, "ApiSuccess should not be null");
        D0().c(p7VarC);
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void i(v7.d dVar) {
        c1();
        super.i(dVar);
    }

    public final void i1(int i10, x2.a aVar, Runnable runnable) {
        d2.c(d2.b(f1(i10), 28500L, TimeUnit.MILLISECONDS, b1()), new c1(this, i10, aVar, runnable), n());
    }

    public g(String str, v7.i iVar, Context context, p1 p1Var, i1 i1Var, ExecutorService executorService, a.C0108a c0108a) {
        super(null, iVar, context, null, null, null, c0108a);
        this.O = 0;
        this.N = context;
    }

    public g(String str, v7.i iVar, Context context, v7.m mVar, c0 c0Var, i1 i1Var, ExecutorService executorService, a.C0108a c0108a) {
        super(null, iVar, context, mVar, null, null, null, c0108a);
        this.O = 0;
        this.N = context;
    }
}
