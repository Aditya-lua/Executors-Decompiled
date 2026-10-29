package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.play_billing.c0;
import com.google.android.gms.internal.play_billing.d2;
import com.google.android.gms.internal.play_billing.e8;
import com.google.android.gms.internal.play_billing.h8;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.j7;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.l8;
import com.google.android.gms.internal.play_billing.m0;
import com.google.android.gms.internal.play_billing.n0;
import com.google.android.gms.internal.play_billing.n7;
import com.google.android.gms.internal.play_billing.n9;
import com.google.android.gms.internal.play_billing.o8;
import com.google.android.gms.internal.play_billing.p7;
import com.google.android.gms.internal.play_billing.p9;
import com.google.android.gms.internal.play_billing.q7;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.s0;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.t0;
import com.google.android.gms.internal.play_billing.t9;
import com.google.android.gms.internal.play_billing.u7;
import com.google.android.gms.internal.play_billing.v9;
import com.google.android.gms.internal.play_billing.y9;
import com.google.android.gms.internal.play_billing.z;
import com.google.android.gms.internal.play_billing.z7;
import com.roblox.client.personasdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import v7.g2;
import v7.h1;
import v7.i0;
import v7.i1;
import v7.j0;
import v7.k;
import v7.l;
import v7.l1;
import v7.m;
import v7.m1;
import v7.n;
import v7.o;
import v7.p;
import v7.p0;
import v7.p1;
import v7.r0;
import v7.t;
import v7.x1;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public v7.i F;
    public boolean G;
    public boolean H;
    public s0 I;
    public volatile v7.d J;
    public ExecutorService K;
    public final Long L;
    public final c0 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5070a;
    public volatile int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f5073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile t f5074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f5075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i1 f5076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.f f5077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile p0 f5078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5089u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5090v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5093y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5094z;

    public b(String str, Context context, i1 i1Var, ExecutorService executorService, a.C0108a c0108a) {
        this.f5070a = new Object();
        this.b = 0;
        this.f5073e = new Handler(Looper.getMainLooper());
        this.f5081m = 0;
        this.I = s0.k();
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.L = lValueOf;
        this.M = r.a();
        this.f5071c = u7.a.f32091a;
        String strB = B();
        this.f5072d = strB;
        this.f5075g = context.getApplicationContext();
        e8 e8VarL = h8.L();
        e8VarL.E(u7.a.f32091a);
        if (strB != null) {
            e8VarL.G(strB);
        }
        e8VarL.v(this.f5075g.getPackageName());
        e8VarL.r(lValueOf.longValue());
        e8VarL.D(c0108a.f5069j);
        e8VarL.o(Build.VERSION.SDK_INT);
        e8VarL.t(912213584L);
        m0(e8VarL, context);
        try {
            e8VarL.p(this.f5075g.getPackageManager().getPackageInfo(this.f5075g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Error getting app version code.", th2);
        }
        this.f5076h = new m1(this.f5075g, (h8) e8VarL.i());
        this.f5075g.getPackageName();
        this.G = c0108a.f5069j;
    }

    @SuppressLint({"PrivateApi"})
    public static String B() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ d F0(Exception exc) {
        return exc instanceof DeadObjectException ? h.f5173j : h.f5171h;
    }

    public static /* synthetic */ Object M0(b bVar, int i10, t9 t9Var) {
        bVar.g0(new v7.m0(bVar, t9Var), i10);
        return "reconnectIfNeeded";
    }

    public static /* bridge */ /* synthetic */ void N(b bVar, int i10) {
        bVar.f5081m = i10;
        bVar.E = i10 >= 28;
        bVar.D = i10 >= 27;
        bVar.C = i10 >= 26;
        bVar.B = i10 >= 24;
        bVar.A = i10 >= 23;
        bVar.f5094z = i10 >= 22;
        bVar.f5093y = i10 >= 21;
        bVar.f5092x = i10 >= 20;
        bVar.f5091w = i10 >= 19;
        bVar.f5090v = i10 >= 18;
        bVar.f5089u = i10 >= 17;
        bVar.f5088t = i10 >= 16;
        bVar.f5087s = i10 >= 15;
        bVar.f5086r = i10 >= 14;
        bVar.f5085q = i10 >= 12;
        bVar.f5084p = i10 >= 9;
        bVar.f5083o = i10 >= 8;
        bVar.f5082n = i10 >= 6;
    }

    public static /* synthetic */ Object N0(b bVar, v7.f fVar, v7.e eVar) throws Throwable {
        if (bVar.j0(l1.b())) {
            bVar.C(eVar, fVar);
            return null;
        }
        s7 s7Var = s7.SERVICE_CONNECTION_NOT_READY;
        d dVar = h.f5173j;
        bVar.q0(s7Var, 4, dVar);
        fVar.a(dVar, eVar.a());
        return null;
    }

    public static /* synthetic */ Object O0(b bVar, v7.j jVar, f fVar) {
        if (!bVar.j0(l1.b())) {
            s7 s7Var = s7.SERVICE_CONNECTION_NOT_READY;
            d dVar = h.f5173j;
            bVar.q0(s7Var, 7, dVar);
            jVar.a(dVar, new n(n0.k(), n0.k()));
            return null;
        }
        if (bVar.f5089u) {
            r0 r0VarA0 = bVar.A0(fVar);
            jVar.a(h.a(r0VarA0.a(), r0VarA0.b()), new n(r0VarA0.c(), r0VarA0.d()));
            return null;
        }
        m0.m("BillingClient", "Querying product details is not supported.");
        s7 s7Var2 = s7.PRODUCT_DETAILS_NOT_SUPPORTED;
        d dVar2 = h.f5182s;
        bVar.q0(s7Var2, 7, dVar2);
        jVar.a(dVar2, new n(n0.k(), n0.k()));
        return null;
    }

    public static /* bridge */ /* synthetic */ void P(b bVar, int i10) {
        if (i10 != 0) {
            bVar.f0(0);
            return;
        }
        synchronized (bVar.f5070a) {
            try {
                if (bVar.b == 3) {
                    return;
                }
                bVar.f0(2);
                t tVar = bVar.f5074f != null ? bVar.f5074f : null;
                if (tVar != null) {
                    tVar.h(bVar.f5093y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object P0(b bVar, v7.c cVar, v7.b bVar2) {
        bVar.z(cVar, bVar2);
        return null;
    }

    public static /* bridge */ /* synthetic */ boolean T(b bVar) {
        boolean z10;
        synchronized (bVar.f5070a) {
            z10 = true;
            if (bVar.b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public static final String l0(int i10) {
        if (i10 == 0) {
            return "DISCONNECTED";
        }
        if (i10 != 1) {
            return i10 != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    public static final void m0(e8 e8Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                e8Var.C((int) (memoryInfo.totalMem / 1048576));
                e8Var.w(Build.BRAND);
                e8Var.A(Build.MODEL);
                e8Var.z(Build.MANUFACTURER);
                e8Var.x(Build.FINGERPRINT);
            }
        } catch (RuntimeException e10) {
            m0.n("BillingClient", "Runtime error while populating device info.", e10);
        }
    }

    public static Future o(Callable callable, long j10, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: v7.d0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            m0.n("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static /* synthetic */ void p(b bVar, v7.f fVar, v7.e eVar) {
        s7 s7Var = s7.EXECUTE_ASYNC_TIMEOUT;
        d dVar = h.f5174k;
        bVar.q0(s7Var, 4, dVar);
        fVar.a(dVar, eVar.a());
    }

    public static /* synthetic */ void q(b bVar, l lVar) {
        s7 s7Var = s7.EXECUTE_ASYNC_TIMEOUT;
        d dVar = h.f5174k;
        bVar.q0(s7Var, 9, dVar);
        lVar.a(dVar, n0.k());
    }

    public static /* synthetic */ void r(b bVar, v7.c cVar) {
        s7 s7Var = s7.EXECUTE_ASYNC_TIMEOUT;
        d dVar = h.f5174k;
        bVar.q0(s7Var, 3, dVar);
        cVar.a(dVar);
    }

    public static /* synthetic */ void s(b bVar, v7.j jVar) {
        s7 s7Var = s7.EXECUTE_ASYNC_TIMEOUT;
        d dVar = h.f5174k;
        bVar.q0(s7Var, 7, dVar);
        jVar.a(dVar, new n(n0.k(), n0.k()));
    }

    public static /* synthetic */ void t(b bVar, d dVar) {
        if (bVar.f5074f.e() != null) {
            bVar.f5074f.e().a(dVar, null);
        } else {
            m0.m("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final String A(f fVar) {
        if (TextUtils.isEmpty(null)) {
            return this.f5075g.getPackageName();
        }
        return null;
    }

    public final r0 A0(f fVar) {
        com.google.android.gms.internal.play_billing.f fVar2;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strC = fVar.c();
        n0 n0VarB = fVar.b();
        int size = n0VarB.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 20;
            ArrayList arrayList3 = new ArrayList(n0VarB.subList(i12, i13 > size ? size : i13));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList4.add(((f.b) arrayList3.get(i14)).c());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.f5071c;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.f5070a) {
                    fVar2 = this.f5077i;
                }
                if (fVar2 == null) {
                    return v(h.f5173j, s7.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z10 = this.f5091w && this.F.b();
                A(fVar);
                A(fVar);
                A(fVar);
                A(fVar);
                Bundle bundleA2 = fVar2.a2(true != this.f5092x ? 17 : 20, this.f5075g.getPackageName(), strC, bundle, m0.g(str, this.f5072d, arrayList3, null, null, com.google.android.gms.internal.play_billing.a.a(z10, true, true, true, false, true), this.L.longValue()));
                if (bundleA2 == null) {
                    return v(h.B, s7.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleA2.containsKey("DETAILS_LIST")) {
                    int iB = m0.b(bundleA2, "BillingClient");
                    String strI = m0.i(bundleA2, "BillingClient");
                    if (iB == 0) {
                        return v(h.a(6, strI), s7.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return v(h.a(iB, strI), s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iB, null);
                }
                ArrayList<String> stringArrayList = bundleA2.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return v(h.B, s7.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    try {
                        e eVar = new e(stringArrayList.get(i15));
                        m0.l("BillingClient", "Got product details: ".concat(eVar.toString()));
                        arrayList5.add(eVar);
                    } catch (JSONException e10) {
                        return v(h.a(6, "Error trying to decode SkuDetails."), s7.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                ArrayList<String> stringArrayList2 = bundleA2.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 != null) {
                        int size4 = stringArrayList2.size();
                        int i16 = 0;
                        while (i16 < size4) {
                            String str2 = stringArrayList2.get(i16);
                            i16++;
                            p pVar = new p(str2);
                            m0.l("BillingClient", "Got unfetchedProduct: ".concat(pVar.toString()));
                            arrayList6.add(pVar);
                        }
                    } else {
                        int size5 = arrayList3.size();
                        int i17 = 0;
                        while (i17 < size5) {
                            Object obj = arrayList3.get(i17);
                            int i18 = i17 + 1;
                            f.b bVar = (f.b) obj;
                            int size6 = arrayList5.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size6) {
                                    i10 = size5;
                                    i11 = i18;
                                    arrayList6.add(new p(new JSONObject().put("productId", bVar.c()).put(Payload.TYPE, bVar.d()).put("statusCode", 0).toString()));
                                    break;
                                }
                                Object obj2 = arrayList5.get(i19);
                                i19++;
                                e eVar2 = (e) obj2;
                                i10 = size5;
                                i11 = i18;
                                if (bVar.c().equals(eVar2.d()) && bVar.d().equals(eVar2.e())) {
                                    break;
                                }
                                size5 = i10;
                                i18 = i11;
                            }
                            size5 = i10;
                            i17 = i11;
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i12 = i13;
                } catch (JSONException e11) {
                    return v(h.a(6, "Error trying to decode SkuDetails."), s7.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                }
            } catch (DeadObjectException e12) {
                return v(h.f5173j, s7.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            } catch (Exception e13) {
                return v(h.f5171h, s7.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e13);
            }
        }
        return new r0(0, "", arrayList, arrayList2);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(v7.e r10, v7.f r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.C(v7.e, v7.f):void");
    }

    public final void D(v7.c cVar, d dVar, s7 s7Var, Exception exc) {
        m0.n("BillingClient", "Error in acknowledge purchase!", exc);
        s0(s7Var, 3, dVar, h1.a(exc));
        cVar.a(dVar);
    }

    public final i1 D0() {
        return this.f5076h;
    }

    public final void E(v7.f fVar, String str, d dVar, s7 s7Var, String str2, Exception exc) {
        m0.n("BillingClient", str2, exc);
        s0(s7Var, 4, dVar, h1.a(exc));
        fVar.a(dVar, str);
    }

    public final d G0(final d dVar) {
        if (Thread.interrupted()) {
            return dVar;
        }
        this.f5073e.post(new Runnable() { // from class: v7.a0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.t(this.f32767a, dVar);
            }
        });
        return dVar;
    }

    public final void R(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f5073e.post(runnable);
        }
    }

    public final /* synthetic */ Bundle W(int i10, String str, String str2, c cVar, Bundle bundle) {
        com.google.android.gms.internal.play_billing.f fVar;
        try {
            synchronized (this.f5070a) {
                fVar = this.f5077i;
            }
            return fVar == null ? m0.d(h.f5173j, s7.SERVICE_RESET_TO_NULL) : fVar.o0(i10, this.f5075g.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e10) {
            return m0.e(h.f5173j, s7.LAUNCH_BILLING_FLOW_EXCEPTION, h1.a(e10));
        } catch (Exception e11) {
            return m0.e(h.f5171h, s7.LAUNCH_BILLING_FLOW_EXCEPTION, h1.a(e11));
        }
    }

    public final /* synthetic */ Bundle X(String str, String str2) {
        com.google.android.gms.internal.play_billing.f fVar;
        try {
            synchronized (this.f5070a) {
                fVar = this.f5077i;
            }
            return fVar == null ? m0.d(h.f5173j, s7.SERVICE_RESET_TO_NULL) : fVar.i1(3, this.f5075g.getPackageName(), str, str2, null);
        } catch (DeadObjectException e10) {
            return m0.e(h.f5173j, s7.LAUNCH_BILLING_FLOW_EXCEPTION, h1.a(e10));
        } catch (Exception e11) {
            return m0.e(h.f5171h, s7.LAUNCH_BILLING_FLOW_EXCEPTION, h1.a(e11));
        }
    }

    public final Handler Y() {
        return Looper.myLooper() == null ? this.f5073e : new Handler(Looper.myLooper());
    }

    @Override // com.android.billingclient.api.a
    public void a(final v7.b bVar, final v7.c cVar) {
        if (o(new Callable() { // from class: v7.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.P0(this.f32865a, cVar, bVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: v7.b0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.r(this.f32771a, cVar);
            }
        }, Y(), n()) == null) {
            d dVarX = x();
            q0(s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, dVarX);
            cVar.a(dVarX);
        }
    }

    public final void a0(int i10) {
        try {
            int i11 = h1.f32789a;
            d0(h1.c(i10, z7.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.a
    public void b(final v7.e eVar, final v7.f fVar) {
        if (o(new Callable() { // from class: v7.e0
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                com.android.billingclient.api.b.N0(this.f32781a, fVar, eVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: v7.f0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.p(this.f32784a, fVar, eVar);
            }
        }, Y(), n()) == null) {
            d dVarX = x();
            q0(s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, dVarX);
            fVar.a(dVarX, eVar.a());
        }
    }

    public final void b0(l7 l7Var) {
        try {
            this.f5076h.k(l7Var, this.f5081m);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.android.billingclient.api.a
    public final d c(String str) {
        if (!i0(l1.c())) {
            d dVar = h.f5173j;
            s7 s7Var = s7.SERVICE_CONNECTION_NOT_READY;
            if (dVar.c() != 0) {
                q0(s7Var, 5, dVar);
                return dVar;
            }
            a0(5);
            return dVar;
        }
        d dVar2 = h.f5165a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    d dVar3 = this.f5080l ? h.f5172i : h.f5176m;
                    p0(dVar3, s7.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED, 3);
                    return dVar3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    d dVar4 = this.f5087s ? h.f5172i : h.f5178o;
                    p0(dVar4, s7.CROSS_APP_NOT_SUPPORTED, 6);
                    return dVar4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    d dVar5 = this.f5085q ? h.f5172i : h.f5183t;
                    p0(dVar5, s7.IN_APP_MESSAGE_NOT_SUPPORTED, 5);
                    return dVar5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    d dVar6 = this.f5088t ? h.f5172i : h.f5179p;
                    p0(dVar6, s7.MULTI_ITEM_NOT_SUPPORTED, 8);
                    return dVar6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    d dVar7 = this.f5086r ? h.f5172i : h.f5180q;
                    p0(dVar7, s7.OFFER_ID_TOKEN_NOT_SUPPORTED, 7);
                    return dVar7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    d dVar8 = this.f5088t ? h.f5172i : h.f5179p;
                    p0(dVar8, s7.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED, 9);
                    return dVar8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    d dVar9 = this.f5089u ? h.f5172i : h.f5182s;
                    p0(dVar9, s7.PRODUCT_DETAILS_NOT_SUPPORTED, 10);
                    return dVar9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    d dVar10 = this.f5090v ? h.f5172i : h.f5189z;
                    p0(dVar10, s7.GET_BILLING_CONFIG_NOT_SUPPORTED, 11);
                    return dVar10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    d dVar11 = this.f5090v ? h.f5172i : h.A;
                    p0(dVar11, s7.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED, 12);
                    return dVar11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    d dVar12 = this.f5092x ? h.f5172i : h.C;
                    p0(dVar12, s7.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED, 13);
                    return dVar12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    d dVar13 = this.f5093y ? h.f5172i : h.D;
                    p0(dVar13, s7.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, 14);
                    return dVar13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    d dVar14 = this.B ? h.f5172i : h.f5184u;
                    p0(dVar14, s7.EXTERNAL_OFFER_NOT_SUPPORTED, 18);
                    return dVar14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    d dVar15 = this.A ? h.f5172i : h.f5185v;
                    p0(dVar15, s7.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED, 19);
                    return dVar15;
                }
                break;
            case 108237:
                if (str.equals("mmm")) {
                    d dVar16 = this.B ? h.f5172i : h.f5186w;
                    p0(dVar16, s7.AUTO_PAY_NOT_SUPPORTED, 20);
                    return dVar16;
                }
                break;
            case 109230:
                if (str.equals("nnn")) {
                    d dVar17 = this.C ? h.f5172i : h.f5187x;
                    p0(dVar17, s7.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, 21);
                    return dVar17;
                }
                break;
            case 110223:
                if (str.equals("ooo")) {
                    d dVar18 = this.E ? h.f5172i : h.f5181r;
                    p0(dVar18, s7.GIFT_CODE_PURCHASE_NOT_SUPPORTED, 22);
                    return dVar18;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    d dVar19 = this.f5083o ? h.f5172i : h.f5177n;
                    p0(dVar19, s7.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED, 4);
                    return dVar19;
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    d dVar20 = this.f5079k ? h.f5172i : h.f5175l;
                    p0(dVar20, s7.SUBSCRIPTIONS_NOT_SUPPORTED, 2);
                    return dVar20;
                }
                break;
        }
        m0.m("BillingClient", "Unsupported feature: ".concat(str));
        d dVar21 = h.f5188y;
        p0(dVar21, s7.UNKNOWN_FEATURE, 1);
        return dVar21;
    }

    public final void c0(l7 l7Var, long j10, boolean z10) {
        try {
            this.f5076h.b(l7Var, this.f5081m, j10, z10);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.a
    public final boolean d() {
        if (this.G) {
            return true;
        }
        return k0();
    }

    public final void d0(p7 p7Var) {
        try {
            this.f5076h.e(p7Var, this.f5081m);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.android.billingclient.api.b] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [long] */
    @Override // com.android.billingclient.api.a
    public d e(Activity activity, c cVar) {
        boolean zG;
        long j10;
        Future futureO;
        ?? r8;
        ?? r10;
        ?? r11;
        s7 s7VarA;
        String string;
        Object obj;
        boolean z10;
        int i10;
        long jNextLong = new Random().nextLong();
        if (this.f5074f == null || this.f5074f.e() == null) {
            s7 s7Var = s7.MISSING_LISTENER;
            d dVar = h.E;
            r0(s7Var, 2, dVar, jNextLong);
            return dVar;
        }
        cVar.a();
        if (!i0(l1.c())) {
            s7 s7Var2 = s7.SERVICE_CONNECTION_NOT_READY;
            d dVar2 = h.f5173j;
            r0(s7Var2, 2, dVar2, jNextLong);
            G0(dVar2);
            return dVar2;
        }
        synchronized (this.f5070a) {
            try {
                zG = this.f5078j != null ? this.f5078j.g() : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayListL = cVar.l();
        List listM = cVar.m();
        g2 g2Var = (g2) t0.a(arrayListL, null);
        c.b bVar = (c.b) t0.a(listM, null);
        if (g2Var != null) {
            throw null;
        }
        final String strD = bVar.c().d();
        final String strE = bVar.c().e();
        if (strE.equals("subs") && !this.f5079k) {
            m0.m("BillingClient", "Current client doesn't support subscriptions.");
            s7 s7Var3 = s7.SUBSCRIPTIONS_NOT_SUPPORTED;
            d dVar3 = h.f5175l;
            t0(s7Var3, 2, dVar3, jNextLong, zG);
            G0(dVar3);
            return dVar3;
        }
        if (cVar.w() && !this.f5082n) {
            m0.m("BillingClient", "Current client doesn't support extra params for buy intent.");
            s7 s7Var4 = s7.EXTRA_PARAMS_NOT_SUPPORTED;
            d dVar4 = h.f5169f;
            t0(s7Var4, 2, dVar4, jNextLong, zG);
            G0(dVar4);
            return dVar4;
        }
        if (arrayListL.size() > 1 && !this.f5088t) {
            m0.m("BillingClient", "Current client doesn't support multi-item purchases.");
            s7 s7Var5 = s7.MULTI_ITEM_NOT_SUPPORTED;
            d dVar5 = h.f5179p;
            t0(s7Var5, 2, dVar5, jNextLong, zG);
            G0(dVar5);
            return dVar5;
        }
        if (!listM.isEmpty() && !this.f5089u) {
            m0.m("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            s7 s7Var6 = s7.PRODUCT_DETAILS_NOT_SUPPORTED;
            d dVar6 = h.f5182s;
            t0(s7Var6, 2, dVar6, jNextLong, zG);
            G0(dVar6);
            return dVar6;
        }
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            String strD2 = ((c.b) it.next()).d();
            if (strD2 != null && strD2.contains(":") && !this.E) {
                m0.m("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                s7 s7Var7 = s7.GIFT_CODE_PURCHASE_NOT_SUPPORTED;
                d dVar7 = h.f5181r;
                t0(s7Var7, 2, dVar7, jNextLong, zG);
                G0(dVar7);
                return dVar7;
            }
        }
        d dVarF = cVar.f();
        if (dVarF != h.f5172i) {
            t0(s7.INVALID_BILLING_FLOW_PARAMS, 2, dVarF, jNextLong, zG);
            G0(dVarF);
            return dVarF;
        }
        boolean z11 = zG;
        if (this.f5082n) {
            long j11 = jNextLong;
            final Bundle bundleF = m0.f(cVar, this.f5084p, this.f5091w, this.F.a(), this.F.b(), this.H, this.f5071c, this.f5072d, this.L.longValue(), this.f5075g.getPackageName(), j11);
            if (arrayListL.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(listM.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listM.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                for (int i11 = 0; i11 < listM.size(); i11++) {
                    c.b bVar2 = (c.b) listM.get(i11);
                    e eVarC = bVar2.c();
                    if (!eVarC.h().isEmpty()) {
                        arrayList3.add(eVarC.h());
                    }
                    String strD3 = bVar2.d();
                    arrayList4.add(strD3);
                    String strI = eVarC.i(strD3);
                    if (!TextUtils.isEmpty(strI)) {
                        arrayList5.add(strI);
                    }
                    if (i11 > 0) {
                        arrayList.add(((c.b) listM.get(i11)).c().d());
                        arrayList2.add(((c.b) listM.get(i11)).c().e());
                    }
                }
                bundleF.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList6.isEmpty()) {
                    bundleF.putIntegerArrayList("autoPayBalanceThresholdList", arrayList6);
                }
                if (!arrayList3.isEmpty()) {
                    bundleF.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundleF.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundleF.putStringArrayList("additionalSkus", arrayList);
                    bundleF.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = arrayListL.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
                if (!arrayList7.isEmpty()) {
                    bundleF.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (arrayListL.size() > 1) {
                    ArrayList<String> arrayList8 = new ArrayList<>(arrayListL.size() - 1);
                    ArrayList<String> arrayList9 = new ArrayList<>(arrayListL.size() - 1);
                    if (arrayListL.size() > 1) {
                        throw null;
                    }
                    bundleF.putStringArrayList("additionalSkus", arrayList8);
                    bundleF.putStringArrayList("additionalSkuTypes", arrayList9);
                }
            }
            if (bundleF.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f5086r) {
                s7 s7Var8 = s7.OFFER_ID_TOKEN_NOT_SUPPORTED;
                d dVar8 = h.f5180q;
                t0(s7Var8, 2, dVar8, j11, z11);
                G0(dVar8);
                return dVar8;
            }
            if (TextUtils.isEmpty(bVar.c().g())) {
                z10 = false;
            } else {
                bundleF.putString("skuPackageName", bVar.c().g());
                z10 = true;
            }
            if (!TextUtils.isEmpty(null)) {
                bundleF.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                m0.m("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundleF.putString("proxyPackage", stringExtra);
                try {
                    bundleF.putString("proxyPackageVersion", this.f5075g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundleF.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.E) {
                i10 = 28;
            } else if (this.f5089u && !listM.isEmpty()) {
                i10 = 17;
            } else if (this.f5087s && z10) {
                i10 = 15;
            } else {
                i10 = this.f5084p ? 9 : 6;
            }
            final int i12 = i10;
            final c cVar2 = cVar;
            futureO = o(new Callable() { // from class: v7.x
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f32855a.W(i12, strD, strE, cVar2, bundleF);
                }
            }, 5000L, null, this.f5073e, n());
            r8 = cVar2;
            j10 = j11;
        } else {
            j10 = jNextLong;
            futureO = o(new Callable() { // from class: v7.y
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f32862a.X(strD, strE);
                }
            }, 5000L, null, this.f5073e, n());
            r8 = jNextLong;
        }
        try {
            if (futureO == null) {
                try {
                    s7 s7Var9 = s7.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    d dVar9 = h.f5166c;
                    t0(s7Var9, 2, dVar9, j10, z11);
                    G0(dVar9);
                    return dVar9;
                } catch (CancellationException e10) {
                    e = e10;
                    r11 = j10;
                    m0.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    s7 s7Var10 = s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                    d dVar10 = h.f5174k;
                    u0(s7Var10, 2, dVar10, h1.a(e), r11, z11);
                    G0(dVar10);
                    return dVar10;
                } catch (TimeoutException e11) {
                    e = e11;
                    r11 = j10;
                    m0.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    s7 s7Var11 = s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                    d dVar11 = h.f5174k;
                    u0(s7Var11, 2, dVar11, h1.a(e), r11, z11);
                    G0(dVar11);
                    return dVar11;
                } catch (Exception e12) {
                    e = e12;
                    r10 = j10;
                    m0.n("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    s7 s7Var12 = s7.LAUNCH_BILLING_FLOW_EXCEPTION;
                    d dVar12 = h.f5173j;
                    u0(s7Var12, 2, dVar12, h1.a(e), r10, z11);
                    G0(dVar12);
                    return dVar12;
                }
            }
            long j12 = j10;
            Bundle bundle = (Bundle) futureO.get(5000L, TimeUnit.MILLISECONDS);
            int iB = m0.b(bundle, "BillingClient");
            String strI2 = m0.i(bundle, "BillingClient");
            if (iB == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j12);
                intent2.putExtra("wasServiceAutoReconnected", z11);
                activity.startActivity(intent2);
                return h.f5172i;
            }
            m0.m("BillingClient", "Unable to buy item, Error response code: " + iB);
            d dVarA = h.a(iB, strI2);
            try {
                if (bundle == null || (obj = bundle.get("LOG_REASON")) == null) {
                    s7VarA = s7.REASON_UNSPECIFIED;
                } else if (obj instanceof Integer) {
                    s7VarA = s7.a(((Integer) obj).intValue());
                } else {
                    m0.m("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                    s7VarA = s7.REASON_UNSPECIFIED;
                }
            } catch (Throwable th3) {
                m0.m("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th3.getMessage())));
                s7VarA = s7.REASON_UNSPECIFIED;
            }
            if (s7VarA == s7.REASON_UNSPECIFIED) {
                s7VarA = s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            s7 s7Var13 = s7VarA;
            if (bundle == null) {
                string = null;
            } else {
                try {
                    string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th4) {
                    m0.m("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th4.getMessage())));
                    string = null;
                }
            }
            try {
                u0(s7Var13, 2, dVarA, string, j12, z11);
                G0(dVarA);
                return dVarA;
            } catch (CancellationException e13) {
                e = e13;
                r11 = j12;
                z11 = z11;
                m0.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                s7 s7Var14 = s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                d dVar13 = h.f5174k;
                u0(s7Var14, 2, dVar13, h1.a(e), r11, z11);
                G0(dVar13);
                return dVar13;
            } catch (TimeoutException e14) {
                e = e14;
                r11 = j12;
                z11 = z11;
                m0.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                s7 s7Var15 = s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                d dVar14 = h.f5174k;
                u0(s7Var15, 2, dVar14, h1.a(e), r11, z11);
                G0(dVar14);
                return dVar14;
            } catch (Exception e15) {
                e = e15;
                r10 = j12;
                z11 = z11;
                m0.n("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                s7 s7Var16 = s7.LAUNCH_BILLING_FLOW_EXCEPTION;
                d dVar15 = h.f5173j;
                u0(s7Var16, 2, dVar15, h1.a(e), r10, z11);
                G0(dVar15);
                return dVar15;
            }
        } catch (CancellationException e16) {
            e = e16;
            r11 = r8;
        } catch (TimeoutException e17) {
            e = e17;
            r11 = r8;
        } catch (Exception e18) {
            e = e18;
            r10 = r8;
        }
    }

    public final void e0(s7 s7Var, d dVar, int i10) {
        try {
            int i11 = h1.f32789a;
            j7 j7Var = (j7) h1.b(s7Var, 6, dVar, null, z7.BROADCAST_ACTION_UNSPECIFIED).s();
            n9 n9VarB = p9.B();
            n9VarB.o(i10 > 0);
            n9VarB.p(i10);
            j7Var.s(n9VarB);
            b0((l7) j7Var.i());
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void f0(int i10) {
        synchronized (this.f5070a) {
            try {
                if (this.b == 3) {
                    return;
                }
                m0.l("BillingClient", "Setting clientState from " + l0(this.b) + " to " + l0(i10));
                this.b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.android.billingclient.api.a
    public void g(final f fVar, final v7.j jVar) {
        if (o(new Callable() { // from class: v7.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.android.billingclient.api.b.O0(this.f32786a, jVar, fVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: v7.h0
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.s(this.f32788a, jVar);
            }
        }, Y(), n()) == null) {
            d dVarX = x();
            q0(s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, dVarX);
            jVar.a(dVarX, new n(n0.k(), n0.k()));
        }
    }

    public final void g0(v7.d dVar, int i10) {
        s7 s7Var;
        d dVarW;
        d dVar2;
        synchronized (this.f5070a) {
            try {
                if (k0()) {
                    dVarW = w(i10);
                } else {
                    if (this.b == 1) {
                        m0.m("BillingClient", "Client is already in the process of connecting to billing service.");
                        s7 s7Var2 = s7.BILLING_CLIENT_CONNECTING;
                        dVar2 = h.f5167d;
                        e0(s7Var2, dVar2, i10);
                    } else if (this.b == 3) {
                        m0.m("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        s7 s7Var3 = s7.BILLING_CLIENT_CLOSED;
                        dVar2 = h.f5173j;
                        e0(s7Var3, dVar2, i10);
                    } else {
                        f0(1);
                        if (i10 == 0) {
                            this.J = dVar;
                            i10 = 0;
                        }
                        h0();
                        m0.l("BillingClient", "Starting in-app billing setup.");
                        this.f5078j = new p0(this, dVar, i10, null);
                        this.f5078j.f();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage(BuildConfig.STORE_PACKAGE);
                        List<ResolveInfo> listQueryIntentServices = this.f5075g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            s7Var = s7.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, BuildConfig.STORE_PACKAGE) || str2 == null) {
                                    s7Var = s7.INVALID_PHONESKY_PACKAGE;
                                    m0.m("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f5071c);
                                    synchronized (this.f5070a) {
                                        try {
                                            if (this.b == 2) {
                                                dVarW = w(i10);
                                            } else if (this.b != 1) {
                                                m0.m("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                s7 s7Var4 = s7.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                dVar2 = h.f5173j;
                                                e0(s7Var4, dVar2, i10);
                                            } else {
                                                p0 p0Var = this.f5078j;
                                                if ((i10 <= 0 || Build.VERSION.SDK_INT < 29) ? this.f5075g.bindService(intent2, p0Var, 1) : this.f5075g.bindService(intent2, 1, n(), p0Var)) {
                                                    m0.l("BillingClient", "Service was bonded successfully.");
                                                    dVarW = null;
                                                } else {
                                                    s7Var = s7.BILLING_SERVICE_BLOCKED;
                                                    m0.m("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                s7Var = s7.INVALID_PHONESKY_PACKAGE;
                                m0.m("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        f0(0);
                        m0.l("BillingClient", "Billing service unavailable on device.");
                        d dVar3 = h.b;
                        e0(s7Var, dVar3, i10);
                        dVarW = dVar3;
                    }
                    dVarW = dVar2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (dVarW != null) {
            dVar.a(dVarW);
        }
    }

    @Override // com.android.billingclient.api.a
    public final void h(o oVar, final l lVar) {
        if (o(new j0(this, lVar, oVar.c(), oVar.a()), 30000L, new Runnable() { // from class: v7.w
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.b.q(this.f32851a, lVar);
            }
        }, Y(), n()) == null) {
            d dVarX = x();
            q0(s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, dVarX);
            lVar.a(dVarX, n0.k());
        }
    }

    public final void h0() {
        synchronized (this.f5070a) {
            if (this.f5078j != null) {
                try {
                    this.f5075g.unbindService(this.f5078j);
                    this.f5077i = null;
                    this.f5078j = null;
                } catch (Throwable th2) {
                    try {
                        m0.n("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f5077i = null;
                        this.f5078j = null;
                    } catch (Throwable th3) {
                        this.f5077i = null;
                        this.f5078j = null;
                        throw th3;
                    }
                }
            }
        }
    }

    @Override // com.android.billingclient.api.a
    public void i(v7.d dVar) {
        g0(dVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i0(long j10) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                j10 = 0;
            }
            d dVar = (d) y(1).get(j10, TimeUnit.MILLISECONDS);
            if (dVar.c() == 0) {
                m0.l("BillingClient", "Reconnection succeeded with result: " + dVar.c());
            } else {
                m0.m("BillingClient", "Reconnection failed with result: " + dVar.c());
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m0.n("BillingClient", "Error during reconnection attempt: ", e10);
        }
        return k0();
    }

    public final void j(Context context, m mVar, v7.i iVar, v7.c0 c0Var, String str, i1 i1Var, a.C0108a c0108a) {
        this.f5075g = context.getApplicationContext();
        e8 e8VarL = h8.L();
        e8VarL.E(str);
        String str2 = this.f5072d;
        if (str2 != null) {
            e8VarL.G(str2);
        }
        e8VarL.v(this.f5075g.getPackageName());
        e8VarL.r(this.L.longValue());
        e8VarL.D(c0108a.f5069j);
        e8VarL.o(Build.VERSION.SDK_INT);
        e8VarL.t(912213584L);
        m0(e8VarL, context);
        try {
            e8VarL.p(this.f5075g.getPackageManager().getPackageInfo(this.f5075g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Error getting app version code.", th2);
        }
        if (i1Var != null) {
            this.f5076h = i1Var;
        } else {
            this.f5076h = new m1(this.f5075g, (h8) e8VarL.i());
        }
        if (mVar == null) {
            m0.m("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f5074f = new t(this.f5075g, mVar, null, c0Var, null, null, this.f5076h);
        this.F = iVar;
        this.H = c0Var != null;
        this.f5075g.getPackageName();
        this.G = c0108a.f5069j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j0(long j10) {
        z zVarB = z.b(this.M);
        int iA = l1.a();
        long jA = j10;
        for (int i10 = 1; i10 <= iA; i10++) {
            try {
                long jMax = Math.max(0L, jA);
                if (jMax <= 0) {
                    m0.m("BillingClient", "No time remaining for reconnection attempt.");
                    return k0();
                }
                d dVar = (d) y(i10).get(jMax, TimeUnit.MILLISECONDS);
                if (dVar.c() == 0) {
                    m0.l("BillingClient", "Reconnection succeeded with result: " + dVar.c());
                    return k0();
                }
                m0.m("BillingClient", "Reconnection failed with result: " + dVar.c());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jA = j10 - zVarB.a(timeUnit);
                long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (jA < jPow) {
                    m0.m("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return k0();
                }
                if (i10 < iA && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jA = j10 - zVarB.a(timeUnit);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        m0.n("BillingClient", "Error sleeping during reconnection attempt: ", e10);
                    }
                }
            } catch (Exception e11) {
                if (e11 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                m0.n("BillingClient", "Error during reconnection attempt: ", e11);
            }
        }
        m0.m("BillingClient", "Max retries reached.");
        return k0();
    }

    public final boolean k0() {
        boolean z10;
        synchronized (this.f5070a) {
            try {
                z10 = false;
                if (this.b == 2 && this.f5077i != null && this.f5078j != null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final synchronized ExecutorService n() {
        try {
            if (this.K == null) {
                this.K = Executors.newFixedThreadPool(m0.f7176a, new i0(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.K;
    }

    public final x1 n0(int i10, d dVar, s7 s7Var, String str, Exception exc) {
        s0(s7Var, 9, dVar, h1.a(exc));
        m0.n("BillingClient", str, exc);
        return new x1(dVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fc  */
    public final x1 o0(String str, boolean z10, int i10) {
        com.google.android.gms.internal.play_billing.f fVar;
        int i11;
        int i12;
        Bundle bundleW0;
        d dVarA;
        s7 s7Var;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        ArrayList<String> stringArrayList3;
        int i13;
        boolean z11;
        k kVar;
        m0.l("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z12 = this.f5084p;
        boolean z13 = this.f5091w;
        boolean zA = this.F.a();
        boolean zB = this.F.b();
        long jLongValue = this.L.longValue();
        Bundle bundle = new Bundle();
        m0.c(bundle, u7.a.f32091a, this.f5072d, jLongValue);
        if (z12 && zA) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z13 && zB) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z10) {
            bundle.putBoolean("includeSuspendedSubscriptions", true);
        }
        String string = null;
        do {
            try {
                synchronized (this.f5070a) {
                    fVar = this.f5077i;
                }
                if (fVar == null) {
                    return n0(9, h.f5173j, s7.SERVICE_RESET_TO_NULL, "Service has been reset to null", null);
                }
                if (z10 && !this.C) {
                    return n0(9, h.f5187x, s7.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, "Include suspended subscriptions is not supported", null);
                }
                if (this.f5084p) {
                    if (this.C) {
                        i12 = 26;
                    } else if (this.B) {
                        i12 = 24;
                    } else {
                        if (this.f5091w) {
                            i12 = 19;
                        } else {
                            i11 = 9;
                        }
                        bundleW0 = fVar.w0(i11, this.f5075g.getPackageName(), str, string, bundle);
                    }
                    i11 = i12;
                    bundleW0 = fVar.w0(i11, this.f5075g.getPackageName(), str, string, bundle);
                } else {
                    bundleW0 = fVar.a0(3, this.f5075g.getPackageName(), str, string);
                }
                d dVar = h.f5171h;
                if (bundleW0 == null) {
                    m0.m("BillingClient", String.format("%s got null owned items list", "getPurchase()"));
                    s7Var = s7.NULL_OWNED_ITEMS_LIST;
                } else {
                    int iB = m0.b(bundleW0, "BillingClient");
                    String strI = m0.i(bundleW0, "BillingClient");
                    d.a aVarD = d.d();
                    aVarD.d(iB);
                    aVarD.b(strI);
                    dVarA = aVarD.a();
                    if (iB != 0) {
                        m0.m("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(iB)));
                        s7Var = s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                    } else if (bundleW0.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleW0.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleW0.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList4 = bundleW0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList5 = bundleW0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList6 = bundleW0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList4 == null) {
                            m0.m("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                            s7Var = s7.NULL_SKUS_LIST;
                        } else if (stringArrayList5 == null) {
                            m0.m("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                            s7Var = s7.NULL_PURCHASES_LIST;
                        } else if (stringArrayList6 == null) {
                            m0.m("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                            s7Var = s7.NULL_SIGNATURES_LIST;
                        } else {
                            dVarA = h.f5172i;
                            s7Var = s7.REASON_UNSPECIFIED;
                        }
                    } else {
                        m0.m("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                        s7Var = s7.MISSING_REQUIRED_PURCHASE_KEY;
                    }
                    if (dVarA != h.f5172i) {
                        return n0(9, dVarA, s7Var, "Purchase bundle invalid", null);
                    }
                    stringArrayList = bundleW0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    stringArrayList2 = bundleW0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    stringArrayList3 = bundleW0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    z11 = false;
                    for (i13 = 0; i13 < stringArrayList2.size(); i13++) {
                        String str2 = stringArrayList2.get(i13);
                        String str3 = stringArrayList3.get(i13);
                        m0.l("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i13))));
                        try {
                            kVar = new k(str2, str3);
                            this.I.isEmpty();
                            if (TextUtils.isEmpty(kVar.g())) {
                                m0.m("BillingClient", "BUG: empty/null token!");
                                z11 = true;
                            }
                            arrayList.add(kVar);
                        } catch (JSONException e10) {
                            return n0(9, h.f5171h, s7.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e10);
                        }
                    }
                    if (z11) {
                        q0(s7.EMPTY_PURCHASE_TOKEN, 9, dVar);
                    }
                    string = bundleW0.getString("INAPP_CONTINUATION_TOKEN");
                    m0.l("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                }
                dVarA = dVar;
                if (dVarA != h.f5172i) {
                    return n0(9, dVarA, s7Var, "Purchase bundle invalid", null);
                }
                stringArrayList = bundleW0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                stringArrayList2 = bundleW0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                stringArrayList3 = bundleW0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                z11 = false;
                while (i13 < stringArrayList2.size()) {
                    String str4 = stringArrayList2.get(i13);
                    String str5 = stringArrayList3.get(i13);
                    m0.l("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i13))));
                    kVar = new k(str4, str5);
                    this.I.isEmpty();
                    if (TextUtils.isEmpty(kVar.g())) {
                        m0.m("BillingClient", "BUG: empty/null token!");
                        z11 = true;
                    }
                    arrayList.add(kVar);
                }
                if (z11) {
                    q0(s7.EMPTY_PURCHASE_TOKEN, 9, dVar);
                }
                string = bundleW0.getString("INAPP_CONTINUATION_TOKEN");
                m0.l("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e11) {
                return n0(9, h.f5173j, s7.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e11);
            } catch (Exception e12) {
                return n0(9, h.f5171h, s7.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e12);
            }
        } while (!TextUtils.isEmpty(string));
        return new x1(h.f5172i, arrayList);
    }

    public final void p0(d dVar, s7 s7Var, int i10) {
        p7 p7Var = null;
        l7 l7Var = null;
        if (dVar.c() == 0) {
            int i11 = h1.f32789a;
            try {
                n7 n7VarC = p7.C();
                n7VarC.s(5);
                l8 l8VarB = o8.B();
                l8VarB.o(i10);
                n7VarC.p((o8) l8VarB.i());
                p7Var = (p7) n7VarC.i();
            } catch (Exception e10) {
                m0.n("BillingLogger", "Unable to create logging payload", e10);
            }
            d0(p7Var);
            return;
        }
        int i12 = h1.f32789a;
        try {
            j7 j7VarE = l7.E();
            q7 q7VarC = u7.C();
            q7VarC.t(dVar.c());
            q7VarC.p(dVar.a());
            q7VarC.s(s7Var);
            j7VarE.p(q7VarC);
            j7VarE.t(5);
            l8 l8VarB2 = o8.B();
            l8VarB2.o(i10);
            j7VarE.q((o8) l8VarB2.i());
            l7Var = (l7) j7VarE.i();
        } catch (Exception e11) {
            m0.n("BillingLogger", "Unable to create logging payload", e11);
        }
        b0(l7Var);
    }

    public final void q0(s7 s7Var, int i10, d dVar) {
        try {
            int i11 = h1.f32789a;
            b0(h1.b(s7Var, i10, dVar, null, z7.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void r0(s7 s7Var, int i10, d dVar, long j10) {
        try {
            int i11 = h1.f32789a;
            try {
                this.f5076h.n(h1.b(s7Var, 2, dVar, null, z7.BROADCAST_ACTION_UNSPECIFIED), this.f5081m, j10);
            } catch (Throwable th2) {
                m0.n("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            m0.n("BillingClient", "Unable to log.", th3);
        }
    }

    public final void s0(s7 s7Var, int i10, d dVar, String str) {
        try {
            int i11 = h1.f32789a;
            b0(h1.b(s7Var, i10, dVar, str, z7.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void t0(s7 s7Var, int i10, d dVar, long j10, boolean z10) {
        try {
            int i11 = h1.f32789a;
            c0(h1.b(s7Var, 2, dVar, null, z7.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void u0(s7 s7Var, int i10, d dVar, String str, long j10, boolean z10) {
        try {
            int i11 = h1.f32789a;
            c0(h1.b(s7Var, 2, dVar, str, z7.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final r0 v(d dVar, s7 s7Var, String str, Exception exc) {
        m0.n("BillingClient", str, exc);
        s0(s7Var, 7, dVar, h1.a(exc));
        return new r0(dVar.c(), dVar.a(), new ArrayList(), new ArrayList());
    }

    public final d w(int i10) {
        m0.l("BillingClient", "Service connection is valid. No need to re-initialize.");
        n7 n7VarC = p7.C();
        n7VarC.s(6);
        n9 n9VarB = p9.B();
        n9VarB.s(true);
        n9VarB.o(i10 > 0);
        n9VarB.p(i10);
        n7VarC.r(n9VarB);
        d0((p7) n7VarC.i());
        return h.f5172i;
    }

    public final d x() {
        int[] iArr = {0, 3};
        synchronized (this.f5070a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.b == iArr[i10]) {
                    return h.f5173j;
                }
            }
            return h.f5171h;
        }
    }

    public final i2 y(final int i10) {
        if (this.G && !k0()) {
            return y9.a(new v9() { // from class: v7.v
                @Override // com.google.android.gms.internal.play_billing.v9
                public final Object a(t9 t9Var) {
                    return com.android.billingclient.api.b.M0(this.f32848a, i10, t9Var);
                }
            });
        }
        m0.l("BillingClient", "Already connected or not opted into auto reconnection.");
        return d2.a(h.f5172i);
    }

    public final /* synthetic */ Object z(v7.c cVar, v7.b bVar) {
        com.google.android.gms.internal.play_billing.f fVar;
        try {
            if (!j0(l1.b())) {
                s7 s7Var = s7.SERVICE_CONNECTION_NOT_READY;
                d dVar = h.f5173j;
                q0(s7Var, 3, dVar);
                cVar.a(dVar);
            } else if (TextUtils.isEmpty(bVar.a())) {
                m0.m("BillingClient", "Please provide a valid purchase token.");
                s7 s7Var2 = s7.EMPTY_PURCHASE_TOKEN;
                d dVar2 = h.f5170g;
                q0(s7Var2, 3, dVar2);
                cVar.a(dVar2);
            } else if (this.f5084p) {
                synchronized (this.f5070a) {
                    fVar = this.f5077i;
                }
                if (fVar != null) {
                    String packageName = this.f5075g.getPackageName();
                    String strA = bVar.a();
                    String str = this.f5072d;
                    long jLongValue = this.L.longValue();
                    int i10 = m0.f7176a;
                    Bundle bundle = new Bundle();
                    m0.c(bundle, u7.a.f32091a, str, jLongValue);
                    Bundle bundleO2 = fVar.o2(9, packageName, strA, bundle);
                    cVar.a(h.a(m0.b(bundleO2, "BillingClient"), m0.i(bundleO2, "BillingClient")));
                    return null;
                }
                D(cVar, h.f5173j, s7.SERVICE_RESET_TO_NULL, null);
            } else {
                s7 s7Var3 = s7.API_VERSION_NOT_V9;
                d dVar3 = h.f5165a;
                q0(s7Var3, 3, dVar3);
                cVar.a(dVar3);
            }
            return null;
        } catch (DeadObjectException e10) {
            D(cVar, h.f5173j, s7.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e10);
            return null;
        } catch (Exception e11) {
            D(cVar, h.f5171h, s7.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
            return null;
        }
    }

    public b(String str, v7.i iVar, Context context, p1 p1Var, i1 i1Var, ExecutorService executorService, a.C0108a c0108a) {
        this.f5070a = new Object();
        this.b = 0;
        this.f5073e = new Handler(Looper.getMainLooper());
        this.f5081m = 0;
        this.I = s0.k();
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.L = lValueOf;
        this.M = r.a();
        this.f5071c = u7.a.f32091a;
        String strB = B();
        this.f5072d = strB;
        this.f5075g = context.getApplicationContext();
        e8 e8VarL = h8.L();
        e8VarL.E(u7.a.f32091a);
        if (strB != null) {
            e8VarL.G(strB);
        }
        e8VarL.v(this.f5075g.getPackageName());
        e8VarL.r(lValueOf.longValue());
        e8VarL.D(c0108a.f5069j);
        e8VarL.o(Build.VERSION.SDK_INT);
        e8VarL.t(912213584L);
        m0(e8VarL, context);
        try {
            e8VarL.p(this.f5075g.getPackageManager().getPackageInfo(this.f5075g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            m0.n("BillingClient", "Error getting app version code.", th2);
        }
        this.f5076h = new m1(this.f5075g, (h8) e8VarL.i());
        m0.m("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f5074f = new t(this.f5075g, null, null, null, null, null, this.f5076h);
        this.F = iVar;
        this.f5075g.getPackageName();
        this.G = c0108a.f5069j;
    }

    public b(String str, v7.i iVar, Context context, m mVar, v7.c0 c0Var, i1 i1Var, ExecutorService executorService, a.C0108a c0108a) {
        this.f5070a = new Object();
        this.b = 0;
        this.f5073e = new Handler(Looper.getMainLooper());
        this.f5081m = 0;
        this.I = s0.k();
        this.L = Long.valueOf(new Random().nextLong());
        this.M = r.a();
        this.f5071c = u7.a.f32091a;
        this.f5072d = B();
        j(context, mVar, iVar, null, u7.a.f32091a, null, c0108a);
    }
}
