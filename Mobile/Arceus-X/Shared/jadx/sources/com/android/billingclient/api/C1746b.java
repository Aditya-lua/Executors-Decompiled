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
import com.android.billingclient.api.C1746b;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.play_billing.AbstractC2461c0;
import com.google.android.gms.internal.play_billing.AbstractC2582n0;
import com.google.android.gms.internal.play_billing.AbstractC2637s0;
import com.google.android.gms.internal.play_billing.C2438a;
import com.google.android.gms.internal.play_billing.C2474d2;
import com.google.android.gms.internal.play_billing.C2491e8;
import com.google.android.gms.internal.play_billing.C2524h8;
import com.google.android.gms.internal.play_billing.C2545j7;
import com.google.android.gms.internal.play_billing.C2567l7;
import com.google.android.gms.internal.play_billing.C2568l8;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.C2589n7;
import com.google.android.gms.internal.play_billing.C2591n9;
import com.google.android.gms.internal.play_billing.C2601o8;
import com.google.android.gms.internal.play_billing.C2611p7;
import com.google.android.gms.internal.play_billing.C2613p9;
import com.google.android.gms.internal.play_billing.C2622q7;
import com.google.android.gms.internal.play_billing.C2625r;
import com.google.android.gms.internal.play_billing.C2648t0;
import com.google.android.gms.internal.play_billing.C2657t9;
import com.google.android.gms.internal.play_billing.C2666u7;
import com.google.android.gms.internal.play_billing.C2712y9;
import com.google.android.gms.internal.play_billing.C2713z;
import com.google.android.gms.internal.play_billing.EnumC2644s7;
import com.google.android.gms.internal.play_billing.EnumC2721z7;
import com.google.android.gms.internal.play_billing.InterfaceC2493f;
import com.google.android.gms.internal.play_billing.InterfaceC2679v9;
import com.google.android.gms.internal.play_billing.InterfaceFutureC2529i2;
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
import p461u7.C11809a;
import p486v7.C12018b;
import p486v7.C12030e;
import p486v7.C12041g2;
import p486v7.C12044h1;
import p486v7.C12046i;
import p486v7.C12052k;
import p486v7.C12057l1;
import p486v7.C12059m0;
import p486v7.C12060m1;
import p486v7.C12061n;
import p486v7.C12064o;
import p486v7.C12067p;
import p486v7.C12074r0;
import p486v7.C12079t;
import p486v7.C12093x1;
import p486v7.CallableC12050j0;
import p486v7.InterfaceC12022c;
import p486v7.InterfaceC12023c0;
import p486v7.InterfaceC12026d;
import p486v7.InterfaceC12034f;
import p486v7.InterfaceC12048i1;
import p486v7.InterfaceC12049j;
import p486v7.InterfaceC12055l;
import p486v7.InterfaceC12058m;
import p486v7.InterfaceC12069p1;
import p486v7.ServiceConnectionC12068p0;
import p486v7.ThreadFactoryC12047i0;

/* JADX INFO: renamed from: com.android.billingclient.api.b */
/* JADX INFO: loaded from: classes.dex */
public class C1746b extends AbstractC1745a {

    /* JADX INFO: renamed from: A */
    public boolean f6611A;

    /* JADX INFO: renamed from: B */
    public boolean f6612B;

    /* JADX INFO: renamed from: C */
    public boolean f6613C;

    /* JADX INFO: renamed from: D */
    public boolean f6614D;

    /* JADX INFO: renamed from: E */
    public boolean f6615E;

    /* JADX INFO: renamed from: F */
    public C12046i f6616F;

    /* JADX INFO: renamed from: G */
    public boolean f6617G;

    /* JADX INFO: renamed from: H */
    public boolean f6618H;

    /* JADX INFO: renamed from: I */
    public AbstractC2637s0 f6619I;

    /* JADX INFO: renamed from: J */
    public volatile InterfaceC12026d f6620J;

    /* JADX INFO: renamed from: K */
    public ExecutorService f6621K;

    /* JADX INFO: renamed from: L */
    public final Long f6622L;

    /* JADX INFO: renamed from: M */
    public final AbstractC2461c0 f6623M;

    /* JADX INFO: renamed from: a */
    public final Object f6624a;

    /* JADX INFO: renamed from: b */
    public volatile int f6625b;

    /* JADX INFO: renamed from: c */
    public final String f6626c;

    /* JADX INFO: renamed from: d */
    public final String f6627d;

    /* JADX INFO: renamed from: e */
    public final Handler f6628e;

    /* JADX INFO: renamed from: f */
    public volatile C12079t f6629f;

    /* JADX INFO: renamed from: g */
    public Context f6630g;

    /* JADX INFO: renamed from: h */
    public InterfaceC12048i1 f6631h;

    /* JADX INFO: renamed from: i */
    public volatile InterfaceC2493f f6632i;

    /* JADX INFO: renamed from: j */
    public volatile ServiceConnectionC12068p0 f6633j;

    /* JADX INFO: renamed from: k */
    public boolean f6634k;

    /* JADX INFO: renamed from: l */
    public boolean f6635l;

    /* JADX INFO: renamed from: m */
    public int f6636m;

    /* JADX INFO: renamed from: n */
    public boolean f6637n;

    /* JADX INFO: renamed from: o */
    public boolean f6638o;

    /* JADX INFO: renamed from: p */
    public boolean f6639p;

    /* JADX INFO: renamed from: q */
    public boolean f6640q;

    /* JADX INFO: renamed from: r */
    public boolean f6641r;

    /* JADX INFO: renamed from: s */
    public boolean f6642s;

    /* JADX INFO: renamed from: t */
    public boolean f6643t;

    /* JADX INFO: renamed from: u */
    public boolean f6644u;

    /* JADX INFO: renamed from: v */
    public boolean f6645v;

    /* JADX INFO: renamed from: w */
    public boolean f6646w;

    /* JADX INFO: renamed from: x */
    public boolean f6647x;

    /* JADX INFO: renamed from: y */
    public boolean f6648y;

    /* JADX INFO: renamed from: z */
    public boolean f6649z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1746b(String str, Context context, InterfaceC12048i1 interfaceC12048i1, ExecutorService executorService, AbstractC1745a.a aVar) {
        this.f6624a = new Object();
        this.f6625b = 0;
        this.f6628e = new Handler(Looper.getMainLooper());
        this.f6636m = 0;
        this.f6619I = AbstractC2637s0.m11707k();
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f6622L = lValueOf;
        this.f6623M = C2625r.m11694a();
        this.f6626c = C11809a.f41567a;
        String strM8473B = m8473B();
        this.f6627d = strM8473B;
        this.f6630g = context.getApplicationContext();
        C2491e8 c2491e8M11459L = C2524h8.m11459L();
        c2491e8M11459L.m11385E(C11809a.f41567a);
        if (strM8473B != null) {
            c2491e8M11459L.m11386G(strM8473B);
        }
        c2491e8M11459L.m11393v(this.f6630g.getPackageName());
        c2491e8M11459L.m11390r(lValueOf.longValue());
        c2491e8M11459L.m11384D(aVar.f6610j);
        c2491e8M11459L.m11387o(Build.VERSION.SDK_INT);
        c2491e8M11459L.m11392t(912213584L);
        m8508m0(c2491e8M11459L, context);
        try {
            c2491e8M11459L.m11388p(this.f6630g.getPackageManager().getPackageInfo(this.f6630g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Error getting app version code.", th2);
        }
        this.f6631h = new C12060m1(this.f6630g, (C2524h8) c2491e8M11459L.m11645i());
        this.f6630g.getPackageName();
        this.f6617G = aVar.f6610j;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: B */
    public static String m8473B() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap boolean:0x0000: INSTANCE_OF (r0v0 java.lang.Exception) A[WRAPPED] android.os.DeadObjectException) != false) ? (wrap com.android.billingclient.api.d:0x0004: SGET  A[WRAPPED] com.android.billingclient.api.h.j com.android.billingclient.api.d) : (wrap com.android.billingclient.api.d:0x0007: SGET  A[WRAPPED] com.android.billingclient.api.h.h com.android.billingclient.api.d) */
    /* JADX INFO: renamed from: F0 */
    public static /* bridge */ /* synthetic */ C1748d m8478F0(Exception exc) {
        return exc instanceof DeadObjectException ? C1752h.f6764j : C1752h.f6762h;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ Object m8491M0(C1746b c1746b, int i10, C2657t9 c2657t9) {
        c1746b.m8538g0(new C12059m0(c1746b, c2657t9), i10);
        return "reconnectIfNeeded";
    }

    /* JADX INFO: renamed from: N */
    public static /* bridge */ /* synthetic */ void m8492N(C1746b c1746b, int i10) {
        c1746b.f6636m = i10;
        c1746b.f6615E = i10 >= 28;
        c1746b.f6614D = i10 >= 27;
        c1746b.f6613C = i10 >= 26;
        c1746b.f6612B = i10 >= 24;
        c1746b.f6611A = i10 >= 23;
        c1746b.f6649z = i10 >= 22;
        c1746b.f6648y = i10 >= 21;
        c1746b.f6647x = i10 >= 20;
        c1746b.f6646w = i10 >= 19;
        c1746b.f6645v = i10 >= 18;
        c1746b.f6644u = i10 >= 17;
        c1746b.f6643t = i10 >= 16;
        c1746b.f6642s = i10 >= 15;
        c1746b.f6641r = i10 >= 14;
        c1746b.f6640q = i10 >= 12;
        c1746b.f6639p = i10 >= 9;
        c1746b.f6638o = i10 >= 8;
        c1746b.f6637n = i10 >= 6;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ Object m8493N0(C1746b c1746b, InterfaceC12034f interfaceC12034f, C12030e c12030e) throws Throwable {
        if (c1746b.m8542j0(C12057l1.m44891b())) {
            c1746b.m8523C(c12030e, interfaceC12034f);
            return null;
        }
        EnumC2644s7 enumC2644s7 = EnumC2644s7.SERVICE_CONNECTION_NOT_READY;
        C1748d c1748d = C1752h.f6764j;
        c1746b.m8548q0(enumC2644s7, 4, c1748d);
        interfaceC12034f.mo25629a(c1748d, c12030e.m44849a());
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ Object m8495O0(C1746b c1746b, InterfaceC12049j interfaceC12049j, C1750f c1750f) {
        if (!c1746b.m8542j0(C12057l1.m44891b())) {
            EnumC2644s7 enumC2644s7 = EnumC2644s7.SERVICE_CONNECTION_NOT_READY;
            C1748d c1748d = C1752h.f6764j;
            c1746b.m8548q0(enumC2644s7, 7, c1748d);
            interfaceC12049j.mo25466a(c1748d, new C12061n(AbstractC2582n0.m11599k(), AbstractC2582n0.m11599k()));
            return null;
        }
        if (c1746b.f6644u) {
            C12074r0 c12074r0M8522A0 = c1746b.m8522A0(c1750f);
            interfaceC12049j.mo25466a(C1752h.m8675a(c12074r0M8522A0.m44922a(), c12074r0M8522A0.m44923b()), new C12061n(c12074r0M8522A0.m44924c(), c12074r0M8522A0.m44925d()));
            return null;
        }
        C2571m0.m11565m("BillingClient", "Querying product details is not supported.");
        EnumC2644s7 enumC2644s8 = EnumC2644s7.PRODUCT_DETAILS_NOT_SUPPORTED;
        C1748d c1748d2 = C1752h.f6773s;
        c1746b.m8548q0(enumC2644s8, 7, c1748d2);
        interfaceC12049j.mo25466a(c1748d2, new C12061n(AbstractC2582n0.m11599k(), AbstractC2582n0.m11599k()));
        return null;
    }

    /* JADX INFO: renamed from: P */
    public static /* bridge */ /* synthetic */ void m8496P(C1746b c1746b, int i10) {
        if (i10 != 0) {
            c1746b.m8537f0(0);
            return;
        }
        synchronized (c1746b.f6624a) {
            try {
                if (c1746b.f6625b == 3) {
                    return;
                }
                c1746b.m8537f0(2);
                C12079t c12079t = c1746b.f6629f != null ? c1746b.f6629f : null;
                if (c12079t != null) {
                    c12079t.m44936h(c1746b.f6648y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ Object m8497P0(C1746b c1746b, InterfaceC12022c interfaceC12022c, C12018b c12018b) {
        c1746b.m8557z(interfaceC12022c, c12018b);
        return null;
    }

    /* JADX INFO: renamed from: T */
    public static /* bridge */ /* synthetic */ boolean m8500T(C1746b c1746b) {
        boolean z10;
        synchronized (c1746b.f6624a) {
            z10 = true;
            if (c1746b.f6625b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: l0 */
    public static final String m8506l0(int i10) {
        if (i10 == 0) {
            return "DISCONNECTED";
        }
        if (i10 != 1) {
            return i10 != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m8508m0(C2491e8 c2491e8, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                c2491e8.m11383C((int) (memoryInfo.totalMem / 1048576));
                c2491e8.m11394w(Build.BRAND);
                c2491e8.m11382A(Build.MODEL);
                c2491e8.m11396z(Build.MANUFACTURER);
                c2491e8.m11395x(Build.FINGERPRINT);
            }
        } catch (RuntimeException e10) {
            C2571m0.m11566n("BillingClient", "Runtime error while populating device info.", e10);
        }
    }

    /* JADX INFO: renamed from: o */
    public static Future m8509o(Callable callable, long j10, final Runnable runnable, Handler handler, ExecutorService executorService) {
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
                    C2571m0.m11565m("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            C2571m0.m11566n("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m8510p(C1746b c1746b, InterfaceC12034f interfaceC12034f, C12030e c12030e) {
        EnumC2644s7 enumC2644s7 = EnumC2644s7.EXECUTE_ASYNC_TIMEOUT;
        C1748d c1748d = C1752h.f6765k;
        c1746b.m8548q0(enumC2644s7, 4, c1748d);
        interfaceC12034f.mo25629a(c1748d, c12030e.m44849a());
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m8511q(C1746b c1746b, InterfaceC12055l interfaceC12055l) {
        EnumC2644s7 enumC2644s7 = EnumC2644s7.EXECUTE_ASYNC_TIMEOUT;
        C1748d c1748d = C1752h.f6765k;
        c1746b.m8548q0(enumC2644s7, 9, c1748d);
        interfaceC12055l.mo25471a(c1748d, AbstractC2582n0.m11599k());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m8512r(C1746b c1746b, InterfaceC12022c interfaceC12022c) {
        EnumC2644s7 enumC2644s7 = EnumC2644s7.EXECUTE_ASYNC_TIMEOUT;
        C1748d c1748d = C1752h.f6765k;
        c1746b.m8548q0(enumC2644s7, 3, c1748d);
        interfaceC12022c.mo25628a(c1748d);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m8513s(C1746b c1746b, InterfaceC12049j interfaceC12049j) {
        EnumC2644s7 enumC2644s7 = EnumC2644s7.EXECUTE_ASYNC_TIMEOUT;
        C1748d c1748d = C1752h.f6765k;
        c1746b.m8548q0(enumC2644s7, 7, c1748d);
        interfaceC12049j.mo25466a(c1748d, new C12061n(AbstractC2582n0.m11599k(), AbstractC2582n0.m11599k()));
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m8514t(C1746b c1746b, C1748d c1748d) {
        if (c1746b.f6629f.m44935e() != null) {
            c1746b.f6629f.m44935e().mo25424a(c1748d, null);
        } else {
            C2571m0.m11565m("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    /* JADX INFO: renamed from: A */
    public final String m8521A(C1750f c1750f) {
        if (TextUtils.isEmpty(null)) {
            return this.f6630g.getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public final C12074r0 m8522A0(C1750f c1750f) {
        InterfaceC2493f interfaceC2493f;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM8639c = c1750f.m8639c();
        AbstractC2582n0 abstractC2582n0M8638b = c1750f.m8638b();
        int size = abstractC2582n0M8638b.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 20;
            ArrayList arrayList3 = new ArrayList(abstractC2582n0M8638b.subList(i12, i13 > size ? size : i13));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList4.add(((C1750f.b) arrayList3.get(i14)).m8645c());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.f6626c;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.f6624a) {
                    interfaceC2493f = this.f6632i;
                }
                if (interfaceC2493f == null) {
                    return m8553v(C1752h.f6764j, EnumC2644s7.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z10 = this.f6646w && this.f6616F.m44862b();
                m8521A(c1750f);
                m8521A(c1750f);
                m8521A(c1750f);
                m8521A(c1750f);
                Bundle bundleMo11348a2 = interfaceC2493f.mo11348a2(true != this.f6647x ? 17 : 20, this.f6630g.getPackageName(), strM8639c, bundle, C2571m0.m11559g(str, this.f6627d, arrayList3, null, null, C2438a.m11163a(z10, true, true, true, false, true), this.f6622L.longValue()));
                if (bundleMo11348a2 == null) {
                    return m8553v(C1752h.f6747B, EnumC2644s7.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleMo11348a2.containsKey("DETAILS_LIST")) {
                    int iM11554b = C2571m0.m11554b(bundleMo11348a2, "BillingClient");
                    String strM11561i = C2571m0.m11561i(bundleMo11348a2, "BillingClient");
                    if (iM11554b == 0) {
                        return m8553v(C1752h.m8675a(6, strM11561i), EnumC2644s7.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return m8553v(C1752h.m8675a(iM11554b, strM11561i), EnumC2644s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iM11554b, null);
                }
                ArrayList<String> stringArrayList = bundleMo11348a2.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return m8553v(C1752h.f6747B, EnumC2644s7.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    try {
                        C1749e c1749e = new C1749e(stringArrayList.get(i15));
                        C2571m0.m11564l("BillingClient", "Got product details: ".concat(c1749e.toString()));
                        arrayList5.add(c1749e);
                    } catch (JSONException e10) {
                        return m8553v(C1752h.m8675a(6, "Error trying to decode SkuDetails."), EnumC2644s7.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                ArrayList<String> stringArrayList2 = bundleMo11348a2.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 != null) {
                        int size4 = stringArrayList2.size();
                        int i16 = 0;
                        while (i16 < size4) {
                            String str2 = stringArrayList2.get(i16);
                            i16++;
                            C12067p c12067p = new C12067p(str2);
                            C2571m0.m11564l("BillingClient", "Got unfetchedProduct: ".concat(c12067p.toString()));
                            arrayList6.add(c12067p);
                        }
                    } else {
                        int size5 = arrayList3.size();
                        int i17 = 0;
                        while (i17 < size5) {
                            Object obj = arrayList3.get(i17);
                            int i18 = i17 + 1;
                            C1750f.b bVar = (C1750f.b) obj;
                            int size6 = arrayList5.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size6) {
                                    i10 = size5;
                                    i11 = i18;
                                    arrayList6.add(new C12067p(new JSONObject().put("productId", bVar.m8645c()).put(Payload.TYPE, bVar.m8646d()).put("statusCode", 0).toString()));
                                    break;
                                }
                                Object obj2 = arrayList5.get(i19);
                                i19++;
                                C1749e c1749e2 = (C1749e) obj2;
                                i10 = size5;
                                i11 = i18;
                                if (bVar.m8645c().equals(c1749e2.m8618d()) && bVar.m8646d().equals(c1749e2.m8619e())) {
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
                    return m8553v(C1752h.m8675a(6, "Error trying to decode SkuDetails."), EnumC2644s7.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                }
            } catch (DeadObjectException e12) {
                return m8553v(C1752h.f6764j, EnumC2644s7.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            } catch (Exception e13) {
                return m8553v(C1752h.f6762h, EnumC2644s7.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e13);
            }
        }
        return new C12074r0(0, "", arrayList, arrayList2);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b1 */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8523C(C12030e c12030e, InterfaceC12034f interfaceC12034f) throws Throwable {
        InterfaceC2493f interfaceC2493f;
        int iMo11352u;
        String strM11561i;
        String strM44849a = c12030e.m44849a();
        try {
            C2571m0.m11564l("BillingClient", "Consuming purchase with token: " + strM44849a);
            synchronized (this.f6624a) {
                try {
                    try {
                        interfaceC2493f = this.f6632i;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            throw th;
                        }
                    }
                } catch (DeadObjectException e10) {
                    e = e10;
                    m8526E(interfaceC12034f, strM44849a, C1752h.f6764j, EnumC2644s7.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e11) {
                    e = e11;
                    m8526E(interfaceC12034f, strM44849a, C1752h.f6762h, EnumC2644s7.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (interfaceC2493f == null) {
                try {
                    m8526E(interfaceC12034f, strM44849a, C1752h.f6764j, EnumC2644s7.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e12) {
                    e = e12;
                    m8526E(interfaceC12034f, strM44849a, C1752h.f6764j, EnumC2644s7.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e13) {
                    e = e13;
                    m8526E(interfaceC12034f, strM44849a, C1752h.f6762h, EnumC2644s7.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.f6639p) {
                String packageName = this.f6630g.getPackageName();
                boolean z10 = this.f6639p;
                String str = this.f6627d;
                long jLongValue = this.f6622L.longValue();
                Bundle bundle = new Bundle();
                if (z10) {
                    C2571m0.m11555c(bundle, C11809a.f41567a, str, jLongValue);
                }
                Bundle bundleMo11344O0 = interfaceC2493f.mo11344O0(9, packageName, strM44849a, bundle);
                iMo11352u = bundleMo11344O0.getInt("RESPONSE_CODE");
                strM11561i = C2571m0.m11561i(bundleMo11344O0, "BillingClient");
            } else {
                iMo11352u = interfaceC2493f.mo11352u(3, this.f6630g.getPackageName(), strM44849a);
                strM11561i = "";
            }
            C1748d c1748dM8675a = C1752h.m8675a(iMo11352u, strM11561i);
            if (iMo11352u == 0) {
                C2571m0.m11564l("BillingClient", "Successfully consumed purchase.");
                interfaceC12034f.mo25629a(c1748dM8675a, strM44849a);
                return;
            }
            m8526E(interfaceC12034f, strM44849a, c1748dM8675a, EnumC2644s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + iMo11352u, null);
        } catch (DeadObjectException e14) {
            e = e14;
        } catch (Exception e15) {
            e = e15;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m8524D(InterfaceC12022c interfaceC12022c, C1748d c1748d, EnumC2644s7 enumC2644s7, Exception exc) {
        C2571m0.m11566n("BillingClient", "Error in acknowledge purchase!", exc);
        m8550s0(enumC2644s7, 3, c1748d, C12044h1.m44857a(exc));
        interfaceC12022c.mo25628a(c1748d);
    }

    /* JADX INFO: renamed from: D0 */
    public final InterfaceC12048i1 m8525D0() {
        return this.f6631h;
    }

    /* JADX INFO: renamed from: E */
    public final void m8526E(InterfaceC12034f interfaceC12034f, String str, C1748d c1748d, EnumC2644s7 enumC2644s7, String str2, Exception exc) {
        C2571m0.m11566n("BillingClient", str2, exc);
        m8550s0(enumC2644s7, 4, c1748d, C12044h1.m44857a(exc));
        interfaceC12034f.mo25629a(c1748d, str);
    }

    /* JADX INFO: renamed from: G0 */
    public final C1748d m8527G0(final C1748d c1748d) {
        if (Thread.interrupted()) {
            return c1748d;
        }
        this.f6628e.post(new Runnable() { // from class: v7.a0
            @Override // java.lang.Runnable
            public final void run() {
                C1746b.m8514t(this.f42572a, c1748d);
            }
        });
        return c1748d;
    }

    /* JADX INFO: renamed from: R */
    public final void m8528R(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f6628e.post(runnable);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ Bundle m8529W(int i10, String str, String str2, C1747c c1747c, Bundle bundle) {
        InterfaceC2493f interfaceC2493f;
        try {
            synchronized (this.f6624a) {
                interfaceC2493f = this.f6632i;
            }
            return interfaceC2493f == null ? C2571m0.m11556d(C1752h.f6764j, EnumC2644s7.SERVICE_RESET_TO_NULL) : interfaceC2493f.mo11350l0(i10, this.f6630g.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e10) {
            return C2571m0.m11557e(C1752h.f6764j, EnumC2644s7.LAUNCH_BILLING_FLOW_EXCEPTION, C12044h1.m44857a(e10));
        } catch (Exception e11) {
            return C2571m0.m11557e(C1752h.f6762h, EnumC2644s7.LAUNCH_BILLING_FLOW_EXCEPTION, C12044h1.m44857a(e11));
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ Bundle m8530X(String str, String str2) {
        InterfaceC2493f interfaceC2493f;
        try {
            synchronized (this.f6624a) {
                interfaceC2493f = this.f6632i;
            }
            return interfaceC2493f == null ? C2571m0.m11556d(C1752h.f6764j, EnumC2644s7.SERVICE_RESET_TO_NULL) : interfaceC2493f.mo11349e1(3, this.f6630g.getPackageName(), str, str2, null);
        } catch (DeadObjectException e10) {
            return C2571m0.m11557e(C1752h.f6764j, EnumC2644s7.LAUNCH_BILLING_FLOW_EXCEPTION, C12044h1.m44857a(e10));
        } catch (Exception e11) {
            return C2571m0.m11557e(C1752h.f6762h, EnumC2644s7.LAUNCH_BILLING_FLOW_EXCEPTION, C12044h1.m44857a(e11));
        }
    }

    /* JADX INFO: renamed from: Y */
    public final Handler m8531Y() {
        return Looper.myLooper() == null ? this.f6628e : new Handler(Looper.myLooper());
    }

    @Override // com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: a */
    public void mo8461a(final C12018b c12018b, final InterfaceC12022c interfaceC12022c) {
        if (m8509o(new Callable() { // from class: v7.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1746b.m8497P0(this.f42708a, interfaceC12022c, c12018b);
                return null;
            }
        }, 30000L, new Runnable() { // from class: v7.b0
            @Override // java.lang.Runnable
            public final void run() {
                C1746b.m8512r(this.f42577a, interfaceC12022c);
            }
        }, m8531Y(), m8544n()) == null) {
            C1748d c1748dM8555x = m8555x();
            m8548q0(EnumC2644s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, c1748dM8555x);
            interfaceC12022c.mo25628a(c1748dM8555x);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m8532a0(int i10) {
        try {
            int i11 = C12044h1.f42603a;
            m8535d0(C12044h1.m44859c(i10, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: b */
    public void mo8462b(final C12030e c12030e, final InterfaceC12034f interfaceC12034f) {
        if (m8509o(new Callable() { // from class: v7.e0
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                C1746b.m8493N0(this.f42591a, interfaceC12034f, c12030e);
                return null;
            }
        }, 30000L, new Runnable() { // from class: v7.f0
            @Override // java.lang.Runnable
            public final void run() {
                C1746b.m8510p(this.f42595a, interfaceC12034f, c12030e);
            }
        }, m8531Y(), m8544n()) == null) {
            C1748d c1748dM8555x = m8555x();
            m8548q0(EnumC2644s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, c1748dM8555x);
            interfaceC12034f.mo25629a(c1748dM8555x, c12030e.m44849a());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m8533b0(C2567l7 c2567l7) {
        try {
            this.f6631h.mo44876k(c2567l7, this.f6636m);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: c */
    public final C1748d mo8463c(String str) {
        if (!m8540i0(C12057l1.m44892c())) {
            C1748d c1748d = C1752h.f6764j;
            EnumC2644s7 enumC2644s7 = EnumC2644s7.SERVICE_CONNECTION_NOT_READY;
            if (c1748d.m8610c() != 0) {
                m8548q0(enumC2644s7, 5, c1748d);
                return c1748d;
            }
            m8532a0(5);
            return c1748d;
        }
        C1748d c1748d2 = C1752h.f6755a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    C1748d c1748d3 = this.f6635l ? C1752h.f6763i : C1752h.f6767m;
                    m8547p0(c1748d3, EnumC2644s7.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED, 3);
                    return c1748d3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    C1748d c1748d4 = this.f6642s ? C1752h.f6763i : C1752h.f6769o;
                    m8547p0(c1748d4, EnumC2644s7.CROSS_APP_NOT_SUPPORTED, 6);
                    return c1748d4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    C1748d c1748d5 = this.f6640q ? C1752h.f6763i : C1752h.f6774t;
                    m8547p0(c1748d5, EnumC2644s7.IN_APP_MESSAGE_NOT_SUPPORTED, 5);
                    return c1748d5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    C1748d c1748d6 = this.f6643t ? C1752h.f6763i : C1752h.f6770p;
                    m8547p0(c1748d6, EnumC2644s7.MULTI_ITEM_NOT_SUPPORTED, 8);
                    return c1748d6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    C1748d c1748d7 = this.f6641r ? C1752h.f6763i : C1752h.f6771q;
                    m8547p0(c1748d7, EnumC2644s7.OFFER_ID_TOKEN_NOT_SUPPORTED, 7);
                    return c1748d7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    C1748d c1748d8 = this.f6643t ? C1752h.f6763i : C1752h.f6770p;
                    m8547p0(c1748d8, EnumC2644s7.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED, 9);
                    return c1748d8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    C1748d c1748d9 = this.f6644u ? C1752h.f6763i : C1752h.f6773s;
                    m8547p0(c1748d9, EnumC2644s7.PRODUCT_DETAILS_NOT_SUPPORTED, 10);
                    return c1748d9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    C1748d c1748d10 = this.f6645v ? C1752h.f6763i : C1752h.f6780z;
                    m8547p0(c1748d10, EnumC2644s7.GET_BILLING_CONFIG_NOT_SUPPORTED, 11);
                    return c1748d10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    C1748d c1748d11 = this.f6645v ? C1752h.f6763i : C1752h.f6746A;
                    m8547p0(c1748d11, EnumC2644s7.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED, 12);
                    return c1748d11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    C1748d c1748d12 = this.f6647x ? C1752h.f6763i : C1752h.f6748C;
                    m8547p0(c1748d12, EnumC2644s7.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED, 13);
                    return c1748d12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    C1748d c1748d13 = this.f6648y ? C1752h.f6763i : C1752h.f6749D;
                    m8547p0(c1748d13, EnumC2644s7.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, 14);
                    return c1748d13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    C1748d c1748d14 = this.f6612B ? C1752h.f6763i : C1752h.f6775u;
                    m8547p0(c1748d14, EnumC2644s7.EXTERNAL_OFFER_NOT_SUPPORTED, 18);
                    return c1748d14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    C1748d c1748d15 = this.f6611A ? C1752h.f6763i : C1752h.f6776v;
                    m8547p0(c1748d15, EnumC2644s7.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED, 19);
                    return c1748d15;
                }
                break;
            case 108237:
                if (str.equals("mmm")) {
                    C1748d c1748d16 = this.f6612B ? C1752h.f6763i : C1752h.f6777w;
                    m8547p0(c1748d16, EnumC2644s7.AUTO_PAY_NOT_SUPPORTED, 20);
                    return c1748d16;
                }
                break;
            case 109230:
                if (str.equals("nnn")) {
                    C1748d c1748d17 = this.f6613C ? C1752h.f6763i : C1752h.f6778x;
                    m8547p0(c1748d17, EnumC2644s7.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, 21);
                    return c1748d17;
                }
                break;
            case 110223:
                if (str.equals("ooo")) {
                    C1748d c1748d18 = this.f6615E ? C1752h.f6763i : C1752h.f6772r;
                    m8547p0(c1748d18, EnumC2644s7.GIFT_CODE_PURCHASE_NOT_SUPPORTED, 22);
                    return c1748d18;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    C1748d c1748d19 = this.f6638o ? C1752h.f6763i : C1752h.f6768n;
                    m8547p0(c1748d19, EnumC2644s7.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED, 4);
                    return c1748d19;
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    C1748d c1748d20 = this.f6634k ? C1752h.f6763i : C1752h.f6766l;
                    m8547p0(c1748d20, EnumC2644s7.SUBSCRIPTIONS_NOT_SUPPORTED, 2);
                    return c1748d20;
                }
                break;
        }
        C2571m0.m11565m("BillingClient", "Unsupported feature: ".concat(str));
        C1748d c1748d21 = C1752h.f6779y;
        m8547p0(c1748d21, EnumC2644s7.UNKNOWN_FEATURE, 1);
        return c1748d21;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m8534c0(C2567l7 c2567l7, long j10, boolean z10) {
        try {
            this.f6631h.mo44867b(c2567l7, this.f6636m, j10, z10);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: d */
    public final boolean mo8464d() {
        if (this.f6617G) {
            return true;
        }
        return m8543k0();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m8535d0(C2611p7 c2611p7) {
        try {
            this.f6631h.mo44870e(c2611p7, this.f6636m);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
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
    @Override // com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: e */
    public C1748d mo8465e(Activity activity, C1747c c1747c) {
        boolean zM44914g;
        long j10;
        Future futureM8509o;
        ?? r8;
        ?? r10;
        ?? r11;
        EnumC2644s7 enumC2644s7M11724a;
        String string;
        Object obj;
        boolean z10;
        int i10;
        long jNextLong = new Random().nextLong();
        if (this.f6629f == null || this.f6629f.m44935e() == null) {
            EnumC2644s7 enumC2644s7 = EnumC2644s7.MISSING_LISTENER;
            C1748d c1748d = C1752h.f6750E;
            m8549r0(enumC2644s7, 2, c1748d, jNextLong);
            return c1748d;
        }
        c1747c.m8567a();
        if (!m8540i0(C12057l1.m44892c())) {
            EnumC2644s7 enumC2644s8 = EnumC2644s7.SERVICE_CONNECTION_NOT_READY;
            C1748d c1748d2 = C1752h.f6764j;
            m8549r0(enumC2644s8, 2, c1748d2, jNextLong);
            m8527G0(c1748d2);
            return c1748d2;
        }
        synchronized (this.f6624a) {
            try {
                zM44914g = this.f6633j != null ? this.f6633j.m44914g() : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayListM8577l = c1747c.m8577l();
        List listM8578m = c1747c.m8578m();
        C12041g2 c12041g2 = (C12041g2) C2648t0.m11734a(arrayListM8577l, null);
        C1747c.b bVar = (C1747c.b) C2648t0.m11734a(listM8578m, null);
        if (c12041g2 != null) {
            throw null;
        }
        final String strM8618d = bVar.m8587c().m8618d();
        final String strM8619e = bVar.m8587c().m8619e();
        if (strM8619e.equals("subs") && !this.f6634k) {
            C2571m0.m11565m("BillingClient", "Current client doesn't support subscriptions.");
            EnumC2644s7 enumC2644s9 = EnumC2644s7.SUBSCRIPTIONS_NOT_SUPPORTED;
            C1748d c1748d3 = C1752h.f6766l;
            m8551t0(enumC2644s9, 2, c1748d3, jNextLong, zM44914g);
            m8527G0(c1748d3);
            return c1748d3;
        }
        if (c1747c.m8580w() && !this.f6637n) {
            C2571m0.m11565m("BillingClient", "Current client doesn't support extra params for buy intent.");
            EnumC2644s7 enumC2644s10 = EnumC2644s7.EXTRA_PARAMS_NOT_SUPPORTED;
            C1748d c1748d4 = C1752h.f6760f;
            m8551t0(enumC2644s10, 2, c1748d4, jNextLong, zM44914g);
            m8527G0(c1748d4);
            return c1748d4;
        }
        if (arrayListM8577l.size() > 1 && !this.f6643t) {
            C2571m0.m11565m("BillingClient", "Current client doesn't support multi-item purchases.");
            EnumC2644s7 enumC2644s11 = EnumC2644s7.MULTI_ITEM_NOT_SUPPORTED;
            C1748d c1748d5 = C1752h.f6770p;
            m8551t0(enumC2644s11, 2, c1748d5, jNextLong, zM44914g);
            m8527G0(c1748d5);
            return c1748d5;
        }
        if (!listM8578m.isEmpty() && !this.f6644u) {
            C2571m0.m11565m("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            EnumC2644s7 enumC2644s12 = EnumC2644s7.PRODUCT_DETAILS_NOT_SUPPORTED;
            C1748d c1748d6 = C1752h.f6773s;
            m8551t0(enumC2644s12, 2, c1748d6, jNextLong, zM44914g);
            m8527G0(c1748d6);
            return c1748d6;
        }
        Iterator it = listM8578m.iterator();
        while (it.hasNext()) {
            String strM8588d = ((C1747c.b) it.next()).m8588d();
            if (strM8588d != null && strM8588d.contains(":") && !this.f6615E) {
                C2571m0.m11565m("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                EnumC2644s7 enumC2644s13 = EnumC2644s7.GIFT_CODE_PURCHASE_NOT_SUPPORTED;
                C1748d c1748d7 = C1752h.f6772r;
                m8551t0(enumC2644s13, 2, c1748d7, jNextLong, zM44914g);
                m8527G0(c1748d7);
                return c1748d7;
            }
        }
        C1748d c1748dM8571f = c1747c.m8571f();
        if (c1748dM8571f != C1752h.f6763i) {
            m8551t0(EnumC2644s7.INVALID_BILLING_FLOW_PARAMS, 2, c1748dM8571f, jNextLong, zM44914g);
            m8527G0(c1748dM8571f);
            return c1748dM8571f;
        }
        boolean z11 = zM44914g;
        if (this.f6637n) {
            long j11 = jNextLong;
            final Bundle bundleM11558f = C2571m0.m11558f(c1747c, this.f6639p, this.f6646w, this.f6616F.m44861a(), this.f6616F.m44862b(), this.f6618H, this.f6626c, this.f6627d, this.f6622L.longValue(), this.f6630g.getPackageName(), j11);
            if (arrayListM8577l.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(listM8578m.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listM8578m.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                for (int i11 = 0; i11 < listM8578m.size(); i11++) {
                    C1747c.b bVar2 = (C1747c.b) listM8578m.get(i11);
                    C1749e c1749eM8587c = bVar2.m8587c();
                    if (!c1749eM8587c.m8622h().isEmpty()) {
                        arrayList3.add(c1749eM8587c.m8622h());
                    }
                    String strM8588d2 = bVar2.m8588d();
                    arrayList4.add(strM8588d2);
                    String strM8623i = c1749eM8587c.m8623i(strM8588d2);
                    if (!TextUtils.isEmpty(strM8623i)) {
                        arrayList5.add(strM8623i);
                    }
                    if (i11 > 0) {
                        arrayList.add(((C1747c.b) listM8578m.get(i11)).m8587c().m8618d());
                        arrayList2.add(((C1747c.b) listM8578m.get(i11)).m8587c().m8619e());
                    }
                }
                bundleM11558f.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList6.isEmpty()) {
                    bundleM11558f.putIntegerArrayList("autoPayBalanceThresholdList", arrayList6);
                }
                if (!arrayList3.isEmpty()) {
                    bundleM11558f.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundleM11558f.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundleM11558f.putStringArrayList("additionalSkus", arrayList);
                    bundleM11558f.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = arrayListM8577l.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
                if (!arrayList7.isEmpty()) {
                    bundleM11558f.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (arrayListM8577l.size() > 1) {
                    ArrayList<String> arrayList8 = new ArrayList<>(arrayListM8577l.size() - 1);
                    ArrayList<String> arrayList9 = new ArrayList<>(arrayListM8577l.size() - 1);
                    if (arrayListM8577l.size() > 1) {
                        throw null;
                    }
                    bundleM11558f.putStringArrayList("additionalSkus", arrayList8);
                    bundleM11558f.putStringArrayList("additionalSkuTypes", arrayList9);
                }
            }
            if (bundleM11558f.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f6641r) {
                EnumC2644s7 enumC2644s14 = EnumC2644s7.OFFER_ID_TOKEN_NOT_SUPPORTED;
                C1748d c1748d8 = C1752h.f6771q;
                m8551t0(enumC2644s14, 2, c1748d8, j11, z11);
                m8527G0(c1748d8);
                return c1748d8;
            }
            if (TextUtils.isEmpty(bVar.m8587c().m8621g())) {
                z10 = false;
            } else {
                bundleM11558f.putString("skuPackageName", bVar.m8587c().m8621g());
                z10 = true;
            }
            if (!TextUtils.isEmpty(null)) {
                bundleM11558f.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                C2571m0.m11565m("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundleM11558f.putString("proxyPackage", stringExtra);
                try {
                    bundleM11558f.putString("proxyPackageVersion", this.f6630g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundleM11558f.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.f6615E) {
                i10 = 28;
            } else if (this.f6644u && !listM8578m.isEmpty()) {
                i10 = 17;
            } else if (this.f6642s && z10) {
                i10 = 15;
            } else {
                i10 = this.f6639p ? 9 : 6;
            }
            final int i12 = i10;
            final C1747c c1747c2 = c1747c;
            futureM8509o = m8509o(new Callable() { // from class: v7.x
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f42694a.m8529W(i12, strM8618d, strM8619e, c1747c2, bundleM11558f);
                }
            }, 5000L, null, this.f6628e, m8544n());
            r8 = c1747c2;
            j10 = j11;
        } else {
            j10 = jNextLong;
            futureM8509o = m8509o(new Callable() { // from class: v7.y
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f42704a.m8530X(strM8618d, strM8619e);
                }
            }, 5000L, null, this.f6628e, m8544n());
            r8 = jNextLong;
        }
        try {
            if (futureM8509o == null) {
                try {
                    EnumC2644s7 enumC2644s15 = EnumC2644s7.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    C1748d c1748d9 = C1752h.f6757c;
                    m8551t0(enumC2644s15, 2, c1748d9, j10, z11);
                    m8527G0(c1748d9);
                    return c1748d9;
                } catch (CancellationException e10) {
                    e = e10;
                    r11 = j10;
                    C2571m0.m11566n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    EnumC2644s7 enumC2644s16 = EnumC2644s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C1748d c1748d10 = C1752h.f6765k;
                    m8552u0(enumC2644s16, 2, c1748d10, C12044h1.m44857a(e), r11, z11);
                    m8527G0(c1748d10);
                    return c1748d10;
                } catch (TimeoutException e11) {
                    e = e11;
                    r11 = j10;
                    C2571m0.m11566n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    EnumC2644s7 enumC2644s17 = EnumC2644s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C1748d c1748d11 = C1752h.f6765k;
                    m8552u0(enumC2644s17, 2, c1748d11, C12044h1.m44857a(e), r11, z11);
                    m8527G0(c1748d11);
                    return c1748d11;
                } catch (Exception e12) {
                    e = e12;
                    r10 = j10;
                    C2571m0.m11566n("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    EnumC2644s7 enumC2644s18 = EnumC2644s7.LAUNCH_BILLING_FLOW_EXCEPTION;
                    C1748d c1748d12 = C1752h.f6764j;
                    m8552u0(enumC2644s18, 2, c1748d12, C12044h1.m44857a(e), r10, z11);
                    m8527G0(c1748d12);
                    return c1748d12;
                }
            }
            long j12 = j10;
            Bundle bundle = (Bundle) futureM8509o.get(5000L, TimeUnit.MILLISECONDS);
            int iM11554b = C2571m0.m11554b(bundle, "BillingClient");
            String strM11561i = C2571m0.m11561i(bundle, "BillingClient");
            if (iM11554b == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j12);
                intent2.putExtra("wasServiceAutoReconnected", z11);
                activity.startActivity(intent2);
                return C1752h.f6763i;
            }
            C2571m0.m11565m("BillingClient", "Unable to buy item, Error response code: " + iM11554b);
            C1748d c1748dM8675a = C1752h.m8675a(iM11554b, strM11561i);
            try {
                if (bundle == null || (obj = bundle.get("LOG_REASON")) == null) {
                    enumC2644s7M11724a = EnumC2644s7.REASON_UNSPECIFIED;
                } else if (obj instanceof Integer) {
                    enumC2644s7M11724a = EnumC2644s7.m11724a(((Integer) obj).intValue());
                } else {
                    C2571m0.m11565m("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                    enumC2644s7M11724a = EnumC2644s7.REASON_UNSPECIFIED;
                }
            } catch (Throwable th3) {
                C2571m0.m11565m("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th3.getMessage())));
                enumC2644s7M11724a = EnumC2644s7.REASON_UNSPECIFIED;
            }
            if (enumC2644s7M11724a == EnumC2644s7.REASON_UNSPECIFIED) {
                enumC2644s7M11724a = EnumC2644s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            EnumC2644s7 enumC2644s19 = enumC2644s7M11724a;
            if (bundle == null) {
                string = null;
            } else {
                try {
                    string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th4) {
                    C2571m0.m11565m("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th4.getMessage())));
                    string = null;
                }
            }
            try {
                m8552u0(enumC2644s19, 2, c1748dM8675a, string, j12, z11);
                m8527G0(c1748dM8675a);
                return c1748dM8675a;
            } catch (CancellationException e13) {
                e = e13;
                r11 = j12;
                z11 = z11;
                C2571m0.m11566n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                EnumC2644s7 enumC2644s110 = EnumC2644s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                C1748d c1748d13 = C1752h.f6765k;
                m8552u0(enumC2644s110, 2, c1748d13, C12044h1.m44857a(e), r11, z11);
                m8527G0(c1748d13);
                return c1748d13;
            } catch (TimeoutException e14) {
                e = e14;
                r11 = j12;
                z11 = z11;
                C2571m0.m11566n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                EnumC2644s7 enumC2644s111 = EnumC2644s7.LAUNCH_BILLING_FLOW_TIMEOUT;
                C1748d c1748d14 = C1752h.f6765k;
                m8552u0(enumC2644s111, 2, c1748d14, C12044h1.m44857a(e), r11, z11);
                m8527G0(c1748d14);
                return c1748d14;
            } catch (Exception e15) {
                e = e15;
                r10 = j12;
                z11 = z11;
                C2571m0.m11566n("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                EnumC2644s7 enumC2644s112 = EnumC2644s7.LAUNCH_BILLING_FLOW_EXCEPTION;
                C1748d c1748d15 = C1752h.f6764j;
                m8552u0(enumC2644s112, 2, c1748d15, C12044h1.m44857a(e), r10, z11);
                m8527G0(c1748d15);
                return c1748d15;
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

    /* JADX INFO: renamed from: e0 */
    public final void m8536e0(EnumC2644s7 enumC2644s7, C1748d c1748d, int i10) {
        try {
            int i11 = C12044h1.f42603a;
            C2545j7 c2545j7 = (C2545j7) C12044h1.m44858b(enumC2644s7, 6, c1748d, null, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED).m11757s();
            C2591n9 c2591n9M11672B = C2613p9.m11672B();
            c2591n9M11672B.m11625o(i10 > 0);
            c2591n9M11672B.m11626p(i10);
            c2545j7.m11514s(c2591n9M11672B);
            m8533b0((C2567l7) c2545j7.m11645i());
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m8537f0(int i10) {
        synchronized (this.f6624a) {
            try {
                if (this.f6625b == 3) {
                    return;
                }
                C2571m0.m11564l("BillingClient", "Setting clientState from " + m8506l0(this.f6625b) + " to " + m8506l0(i10));
                this.f6625b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: g */
    public void mo8466g(final C1750f c1750f, final InterfaceC12049j interfaceC12049j) {
        if (m8509o(new Callable() { // from class: v7.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1746b.m8495O0(this.f42598a, interfaceC12049j, c1750f);
                return null;
            }
        }, 30000L, new Runnable() { // from class: v7.h0
            @Override // java.lang.Runnable
            public final void run() {
                C1746b.m8513s(this.f42601a, interfaceC12049j);
            }
        }, m8531Y(), m8544n()) == null) {
            C1748d c1748dM8555x = m8555x();
            m8548q0(EnumC2644s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, c1748dM8555x);
            interfaceC12049j.mo25466a(c1748dM8555x, new C12061n(AbstractC2582n0.m11599k(), AbstractC2582n0.m11599k()));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m8538g0(InterfaceC12026d interfaceC12026d, int i10) {
        EnumC2644s7 enumC2644s7;
        C1748d c1748dM8554w;
        C1748d c1748d;
        synchronized (this.f6624a) {
            try {
                if (m8543k0()) {
                    c1748dM8554w = m8554w(i10);
                } else {
                    if (this.f6625b == 1) {
                        C2571m0.m11565m("BillingClient", "Client is already in the process of connecting to billing service.");
                        EnumC2644s7 enumC2644s8 = EnumC2644s7.BILLING_CLIENT_CONNECTING;
                        c1748d = C1752h.f6758d;
                        m8536e0(enumC2644s8, c1748d, i10);
                    } else if (this.f6625b == 3) {
                        C2571m0.m11565m("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        EnumC2644s7 enumC2644s9 = EnumC2644s7.BILLING_CLIENT_CLOSED;
                        c1748d = C1752h.f6764j;
                        m8536e0(enumC2644s9, c1748d, i10);
                    } else {
                        m8537f0(1);
                        if (i10 == 0) {
                            this.f6620J = interfaceC12026d;
                            i10 = 0;
                        }
                        m8539h0();
                        C2571m0.m11564l("BillingClient", "Starting in-app billing setup.");
                        this.f6633j = new ServiceConnectionC12068p0(this, interfaceC12026d, i10, null);
                        this.f6633j.m44913f();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage(BuildConfig.STORE_PACKAGE);
                        List<ResolveInfo> listQueryIntentServices = this.f6630g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            enumC2644s7 = EnumC2644s7.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, BuildConfig.STORE_PACKAGE) || str2 == null) {
                                    enumC2644s7 = EnumC2644s7.INVALID_PHONESKY_PACKAGE;
                                    C2571m0.m11565m("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f6626c);
                                    synchronized (this.f6624a) {
                                        try {
                                            if (this.f6625b == 2) {
                                                c1748dM8554w = m8554w(i10);
                                            } else if (this.f6625b != 1) {
                                                C2571m0.m11565m("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                EnumC2644s7 enumC2644s10 = EnumC2644s7.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                c1748d = C1752h.f6764j;
                                                m8536e0(enumC2644s10, c1748d, i10);
                                            } else {
                                                ServiceConnectionC12068p0 serviceConnectionC12068p0 = this.f6633j;
                                                if ((i10 <= 0 || Build.VERSION.SDK_INT < 29) ? this.f6630g.bindService(intent2, serviceConnectionC12068p0, 1) : this.f6630g.bindService(intent2, 1, m8544n(), serviceConnectionC12068p0)) {
                                                    C2571m0.m11564l("BillingClient", "Service was bonded successfully.");
                                                    c1748dM8554w = null;
                                                } else {
                                                    enumC2644s7 = EnumC2644s7.BILLING_SERVICE_BLOCKED;
                                                    C2571m0.m11565m("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                enumC2644s7 = EnumC2644s7.INVALID_PHONESKY_PACKAGE;
                                C2571m0.m11565m("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        m8537f0(0);
                        C2571m0.m11564l("BillingClient", "Billing service unavailable on device.");
                        C1748d c1748d2 = C1752h.f6756b;
                        m8536e0(enumC2644s7, c1748d2, i10);
                        c1748dM8554w = c1748d2;
                    }
                    c1748dM8554w = c1748d;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c1748dM8554w != null) {
            interfaceC12026d.mo25422a(c1748dM8554w);
        }
    }

    @Override // com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: h */
    public final void mo8467h(C12064o c12064o, final InterfaceC12055l interfaceC12055l) {
        if (m8509o(new CallableC12050j0(this, interfaceC12055l, c12064o.m44902c(), c12064o.m44901a()), 30000L, new Runnable() { // from class: v7.w
            @Override // java.lang.Runnable
            public final void run() {
                C1746b.m8511q(this.f42688a, interfaceC12055l);
            }
        }, m8531Y(), m8544n()) == null) {
            C1748d c1748dM8555x = m8555x();
            m8548q0(EnumC2644s7.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, c1748dM8555x);
            interfaceC12055l.mo25471a(c1748dM8555x, AbstractC2582n0.m11599k());
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8539h0() {
        synchronized (this.f6624a) {
            if (this.f6633j != null) {
                try {
                    this.f6630g.unbindService(this.f6633j);
                    this.f6632i = null;
                    this.f6633j = null;
                } catch (Throwable th2) {
                    try {
                        C2571m0.m11566n("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f6632i = null;
                        this.f6633j = null;
                    } catch (Throwable th3) {
                        this.f6632i = null;
                        this.f6633j = null;
                        throw th3;
                    }
                }
            }
        }
    }

    @Override // com.android.billingclient.api.AbstractC1745a
    /* JADX INFO: renamed from: i */
    public void mo8468i(InterfaceC12026d interfaceC12026d) {
        m8538g0(interfaceC12026d, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public final boolean m8540i0(long j10) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                j10 = 0;
            }
            C1748d c1748d = (C1748d) m8556y(1).get(j10, TimeUnit.MILLISECONDS);
            if (c1748d.m8610c() == 0) {
                C2571m0.m11564l("BillingClient", "Reconnection succeeded with result: " + c1748d.m8610c());
            } else {
                C2571m0.m11565m("BillingClient", "Reconnection failed with result: " + c1748d.m8610c());
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            C2571m0.m11566n("BillingClient", "Error during reconnection attempt: ", e10);
        }
        return m8543k0();
    }

    /* JADX INFO: renamed from: j */
    public final void m8541j(Context context, InterfaceC12058m interfaceC12058m, C12046i c12046i, InterfaceC12023c0 interfaceC12023c0, String str, InterfaceC12048i1 interfaceC12048i1, AbstractC1745a.a aVar) {
        this.f6630g = context.getApplicationContext();
        C2491e8 c2491e8M11459L = C2524h8.m11459L();
        c2491e8M11459L.m11385E(str);
        String str2 = this.f6627d;
        if (str2 != null) {
            c2491e8M11459L.m11386G(str2);
        }
        c2491e8M11459L.m11393v(this.f6630g.getPackageName());
        c2491e8M11459L.m11390r(this.f6622L.longValue());
        c2491e8M11459L.m11384D(aVar.f6610j);
        c2491e8M11459L.m11387o(Build.VERSION.SDK_INT);
        c2491e8M11459L.m11392t(912213584L);
        m8508m0(c2491e8M11459L, context);
        try {
            c2491e8M11459L.m11388p(this.f6630g.getPackageManager().getPackageInfo(this.f6630g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Error getting app version code.", th2);
        }
        if (interfaceC12048i1 != null) {
            this.f6631h = interfaceC12048i1;
        } else {
            this.f6631h = new C12060m1(this.f6630g, (C2524h8) c2491e8M11459L.m11645i());
        }
        if (interfaceC12058m == null) {
            C2571m0.m11565m("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f6629f = new C12079t(this.f6630g, interfaceC12058m, null, interfaceC12023c0, null, null, this.f6631h);
        this.f6616F = c12046i;
        this.f6618H = interfaceC12023c0 != null;
        this.f6630g.getPackageName();
        this.f6617G = aVar.f6610j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final boolean m8542j0(long j10) {
        C2713z c2713zM11849b = C2713z.m11849b(this.f6623M);
        int iM44890a = C12057l1.m44890a();
        long jM11851a = j10;
        for (int i10 = 1; i10 <= iM44890a; i10++) {
            try {
                long jMax = Math.max(0L, jM11851a);
                if (jMax <= 0) {
                    C2571m0.m11565m("BillingClient", "No time remaining for reconnection attempt.");
                    return m8543k0();
                }
                C1748d c1748d = (C1748d) m8556y(i10).get(jMax, TimeUnit.MILLISECONDS);
                if (c1748d.m8610c() == 0) {
                    C2571m0.m11564l("BillingClient", "Reconnection succeeded with result: " + c1748d.m8610c());
                    return m8543k0();
                }
                C2571m0.m11565m("BillingClient", "Reconnection failed with result: " + c1748d.m8610c());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jM11851a = j10 - c2713zM11849b.m11851a(timeUnit);
                long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (jM11851a < jPow) {
                    C2571m0.m11565m("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return m8543k0();
                }
                if (i10 < iM44890a && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jM11851a = j10 - c2713zM11849b.m11851a(timeUnit);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        C2571m0.m11566n("BillingClient", "Error sleeping during reconnection attempt: ", e10);
                    }
                }
            } catch (Exception e11) {
                if (e11 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                C2571m0.m11566n("BillingClient", "Error during reconnection attempt: ", e11);
            }
        }
        C2571m0.m11565m("BillingClient", "Max retries reached.");
        return m8543k0();
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m8543k0() {
        boolean z10;
        synchronized (this.f6624a) {
            try {
                z10 = false;
                if (this.f6625b == 2 && this.f6632i != null && this.f6633j != null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized ExecutorService m8544n() {
        try {
            if (this.f6621K == null) {
                this.f6621K = Executors.newFixedThreadPool(C2571m0.f9152a, new ThreadFactoryC12047i0(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6621K;
    }

    /* JADX INFO: renamed from: n0 */
    public final C12093x1 m8545n0(int i10, C1748d c1748d, EnumC2644s7 enumC2644s7, String str, Exception exc) {
        m8550s0(enumC2644s7, 9, c1748d, C12044h1.m44857a(exc));
        C2571m0.m11566n("BillingClient", str, exc);
        return new C12093x1(c1748d, null);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fc  */
    /* JADX INFO: renamed from: o0 */
    public final C12093x1 m8546o0(String str, boolean z10, int i10) {
        InterfaceC2493f interfaceC2493f;
        int i11;
        int i12;
        Bundle bundleMo11353u0;
        C1748d c1748dM8611a;
        EnumC2644s7 enumC2644s7;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        ArrayList<String> stringArrayList3;
        int i13;
        boolean z11;
        C12052k c12052k;
        C2571m0.m11564l("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z12 = this.f6639p;
        boolean z13 = this.f6646w;
        boolean zM44861a = this.f6616F.m44861a();
        boolean zM44862b = this.f6616F.m44862b();
        long jLongValue = this.f6622L.longValue();
        Bundle bundle = new Bundle();
        C2571m0.m11555c(bundle, C11809a.f41567a, this.f6627d, jLongValue);
        if (z12 && zM44861a) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z13 && zM44862b) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z10) {
            bundle.putBoolean("includeSuspendedSubscriptions", true);
        }
        String string = null;
        do {
            try {
                synchronized (this.f6624a) {
                    interfaceC2493f = this.f6632i;
                }
                if (interfaceC2493f == null) {
                    return m8545n0(9, C1752h.f6764j, EnumC2644s7.SERVICE_RESET_TO_NULL, "Service has been reset to null", null);
                }
                if (z10 && !this.f6613C) {
                    return m8545n0(9, C1752h.f6778x, EnumC2644s7.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, "Include suspended subscriptions is not supported", null);
                }
                if (this.f6639p) {
                    if (this.f6613C) {
                        i12 = 26;
                    } else if (this.f6612B) {
                        i12 = 24;
                    } else {
                        if (this.f6646w) {
                            i12 = 19;
                        } else {
                            i11 = 9;
                        }
                        bundleMo11353u0 = interfaceC2493f.mo11353u0(i11, this.f6630g.getPackageName(), str, string, bundle);
                    }
                    i11 = i12;
                    bundleMo11353u0 = interfaceC2493f.mo11353u0(i11, this.f6630g.getPackageName(), str, string, bundle);
                } else {
                    bundleMo11353u0 = interfaceC2493f.mo11347Y(3, this.f6630g.getPackageName(), str, string);
                }
                C1748d c1748d = C1752h.f6762h;
                if (bundleMo11353u0 == null) {
                    C2571m0.m11565m("BillingClient", String.format("%s got null owned items list", "getPurchase()"));
                    enumC2644s7 = EnumC2644s7.NULL_OWNED_ITEMS_LIST;
                } else {
                    int iM11554b = C2571m0.m11554b(bundleMo11353u0, "BillingClient");
                    String strM11561i = C2571m0.m11561i(bundleMo11353u0, "BillingClient");
                    C1748d.a aVarM8604d = C1748d.m8604d();
                    aVarM8604d.m8614d(iM11554b);
                    aVarM8604d.m8612b(strM11561i);
                    c1748dM8611a = aVarM8604d.m8611a();
                    if (iM11554b != 0) {
                        C2571m0.m11565m("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(iM11554b)));
                        enumC2644s7 = EnumC2644s7.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                    } else if (bundleMo11353u0.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleMo11353u0.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleMo11353u0.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList4 = bundleMo11353u0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList5 = bundleMo11353u0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList6 = bundleMo11353u0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList4 == null) {
                            C2571m0.m11565m("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                            enumC2644s7 = EnumC2644s7.NULL_SKUS_LIST;
                        } else if (stringArrayList5 == null) {
                            C2571m0.m11565m("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                            enumC2644s7 = EnumC2644s7.NULL_PURCHASES_LIST;
                        } else if (stringArrayList6 == null) {
                            C2571m0.m11565m("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                            enumC2644s7 = EnumC2644s7.NULL_SIGNATURES_LIST;
                        } else {
                            c1748dM8611a = C1752h.f6763i;
                            enumC2644s7 = EnumC2644s7.REASON_UNSPECIFIED;
                        }
                    } else {
                        C2571m0.m11565m("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                        enumC2644s7 = EnumC2644s7.MISSING_REQUIRED_PURCHASE_KEY;
                    }
                    if (c1748dM8611a != C1752h.f6763i) {
                        return m8545n0(9, c1748dM8611a, enumC2644s7, "Purchase bundle invalid", null);
                    }
                    stringArrayList = bundleMo11353u0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    stringArrayList2 = bundleMo11353u0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    stringArrayList3 = bundleMo11353u0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    z11 = false;
                    for (i13 = 0; i13 < stringArrayList2.size(); i13++) {
                        String str2 = stringArrayList2.get(i13);
                        String str3 = stringArrayList3.get(i13);
                        C2571m0.m11564l("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i13))));
                        try {
                            c12052k = new C12052k(str2, str3);
                            this.f6619I.isEmpty();
                            if (TextUtils.isEmpty(c12052k.m44886g())) {
                                C2571m0.m11565m("BillingClient", "BUG: empty/null token!");
                                z11 = true;
                            }
                            arrayList.add(c12052k);
                        } catch (JSONException e10) {
                            return m8545n0(9, C1752h.f6762h, EnumC2644s7.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e10);
                        }
                    }
                    if (z11) {
                        m8548q0(EnumC2644s7.EMPTY_PURCHASE_TOKEN, 9, c1748d);
                    }
                    string = bundleMo11353u0.getString("INAPP_CONTINUATION_TOKEN");
                    C2571m0.m11564l("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                }
                c1748dM8611a = c1748d;
                if (c1748dM8611a != C1752h.f6763i) {
                    return m8545n0(9, c1748dM8611a, enumC2644s7, "Purchase bundle invalid", null);
                }
                stringArrayList = bundleMo11353u0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                stringArrayList2 = bundleMo11353u0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                stringArrayList3 = bundleMo11353u0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                z11 = false;
                while (i13 < stringArrayList2.size()) {
                    String str4 = stringArrayList2.get(i13);
                    String str5 = stringArrayList3.get(i13);
                    C2571m0.m11564l("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i13))));
                    c12052k = new C12052k(str4, str5);
                    this.f6619I.isEmpty();
                    if (TextUtils.isEmpty(c12052k.m44886g())) {
                        C2571m0.m11565m("BillingClient", "BUG: empty/null token!");
                        z11 = true;
                    }
                    arrayList.add(c12052k);
                }
                if (z11) {
                    m8548q0(EnumC2644s7.EMPTY_PURCHASE_TOKEN, 9, c1748d);
                }
                string = bundleMo11353u0.getString("INAPP_CONTINUATION_TOKEN");
                C2571m0.m11564l("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e11) {
                return m8545n0(9, C1752h.f6764j, EnumC2644s7.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e11);
            } catch (Exception e12) {
                return m8545n0(9, C1752h.f6762h, EnumC2644s7.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e12);
            }
        } while (!TextUtils.isEmpty(string));
        return new C12093x1(C1752h.f6763i, arrayList);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m8547p0(C1748d c1748d, EnumC2644s7 enumC2644s7, int i10) {
        C2611p7 c2611p7 = null;
        C2567l7 c2567l7 = null;
        if (c1748d.m8610c() == 0) {
            int i11 = C12044h1.f42603a;
            try {
                C2589n7 c2589n7M11664C = C2611p7.m11664C();
                c2589n7M11664C.m11624s(5);
                C2568l8 c2568l8M11635B = C2601o8.m11635B();
                c2568l8M11635B.m11552o(i10);
                c2589n7M11664C.m11621p((C2601o8) c2568l8M11635B.m11645i());
                c2611p7 = (C2611p7) c2589n7M11664C.m11645i();
            } catch (Exception e10) {
                C2571m0.m11566n("BillingLogger", "Unable to create logging payload", e10);
            }
            m8535d0(c2611p7);
            return;
        }
        int i12 = C12044h1.f42603a;
        try {
            C2545j7 c2545j7M11545E = C2567l7.m11545E();
            C2622q7 c2622q7M11790C = C2666u7.m11790C();
            c2622q7M11790C.m11693t(c1748d.m8610c());
            c2622q7M11790C.m11689p(c1748d.m8608a());
            c2622q7M11790C.m11692s(enumC2644s7);
            c2545j7M11545E.m11511p(c2622q7M11790C);
            c2545j7M11545E.m11515t(5);
            C2568l8 c2568l8M11635B2 = C2601o8.m11635B();
            c2568l8M11635B2.m11552o(i10);
            c2545j7M11545E.m11512q((C2601o8) c2568l8M11635B2.m11645i());
            c2567l7 = (C2567l7) c2545j7M11545E.m11645i();
        } catch (Exception e11) {
            C2571m0.m11566n("BillingLogger", "Unable to create logging payload", e11);
        }
        m8533b0(c2567l7);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m8548q0(EnumC2644s7 enumC2644s7, int i10, C1748d c1748d) {
        try {
            int i11 = C12044h1.f42603a;
            m8533b0(C12044h1.m44858b(enumC2644s7, i10, c1748d, null, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m8549r0(EnumC2644s7 enumC2644s7, int i10, C1748d c1748d, long j10) {
        try {
            int i11 = C12044h1.f42603a;
            try {
                this.f6631h.mo44879n(C12044h1.m44858b(enumC2644s7, 2, c1748d, null, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED), this.f6636m, j10);
            } catch (Throwable th2) {
                C2571m0.m11566n("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th3);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m8550s0(EnumC2644s7 enumC2644s7, int i10, C1748d c1748d, String str) {
        try {
            int i11 = C12044h1.f42603a;
            m8533b0(C12044h1.m44858b(enumC2644s7, i10, c1748d, str, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m8551t0(EnumC2644s7 enumC2644s7, int i10, C1748d c1748d, long j10, boolean z10) {
        try {
            int i11 = C12044h1.f42603a;
            m8534c0(C12044h1.m44858b(enumC2644s7, 2, c1748d, null, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m8552u0(EnumC2644s7 enumC2644s7, int i10, C1748d c1748d, String str, long j10, boolean z10) {
        try {
            int i11 = C12044h1.f42603a;
            m8534c0(C12044h1.m44858b(enumC2644s7, 2, c1748d, str, EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: v */
    public final C12074r0 m8553v(C1748d c1748d, EnumC2644s7 enumC2644s7, String str, Exception exc) {
        C2571m0.m11566n("BillingClient", str, exc);
        m8550s0(enumC2644s7, 7, c1748d, C12044h1.m44857a(exc));
        return new C12074r0(c1748d.m8610c(), c1748d.m8608a(), new ArrayList(), new ArrayList());
    }

    /* JADX INFO: renamed from: w */
    public final C1748d m8554w(int i10) {
        C2571m0.m11564l("BillingClient", "Service connection is valid. No need to re-initialize.");
        C2589n7 c2589n7M11664C = C2611p7.m11664C();
        c2589n7M11664C.m11624s(6);
        C2591n9 c2591n9M11672B = C2613p9.m11672B();
        c2591n9M11672B.m11629s(true);
        c2591n9M11672B.m11625o(i10 > 0);
        c2591n9M11672B.m11626p(i10);
        c2589n7M11664C.m11623r(c2591n9M11672B);
        m8535d0((C2611p7) c2589n7M11664C.m11645i());
        return C1752h.f6763i;
    }

    /* JADX INFO: renamed from: x */
    public final C1748d m8555x() {
        int[] iArr = {0, 3};
        synchronized (this.f6624a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f6625b == iArr[i10]) {
                    return C1752h.f6764j;
                }
            }
            return C1752h.f6762h;
        }
    }

    /* JADX INFO: renamed from: y */
    public final InterfaceFutureC2529i2 m8556y(final int i10) {
        if (this.f6617G && !m8543k0()) {
            return C2712y9.m11848a(new InterfaceC2679v9() { // from class: v7.v
                @Override // com.google.android.gms.internal.play_billing.InterfaceC2679v9
                /* JADX INFO: renamed from: a */
                public final Object mo11811a(C2657t9 c2657t9) {
                    return C1746b.m8491M0(this.f42683a, i10, c2657t9);
                }
            });
        }
        C2571m0.m11564l("BillingClient", "Already connected or not opted into auto reconnection.");
        return C2474d2.m11355a(C1752h.f6763i);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object m8557z(InterfaceC12022c interfaceC12022c, C12018b c12018b) {
        InterfaceC2493f interfaceC2493f;
        try {
            if (!m8542j0(C12057l1.m44891b())) {
                EnumC2644s7 enumC2644s7 = EnumC2644s7.SERVICE_CONNECTION_NOT_READY;
                C1748d c1748d = C1752h.f6764j;
                m8548q0(enumC2644s7, 3, c1748d);
                interfaceC12022c.mo25628a(c1748d);
            } else if (TextUtils.isEmpty(c12018b.m44844a())) {
                C2571m0.m11565m("BillingClient", "Please provide a valid purchase token.");
                EnumC2644s7 enumC2644s8 = EnumC2644s7.EMPTY_PURCHASE_TOKEN;
                C1748d c1748d2 = C1752h.f6761g;
                m8548q0(enumC2644s8, 3, c1748d2);
                interfaceC12022c.mo25628a(c1748d2);
            } else if (this.f6639p) {
                synchronized (this.f6624a) {
                    interfaceC2493f = this.f6632i;
                }
                if (interfaceC2493f != null) {
                    String packageName = this.f6630g.getPackageName();
                    String strM44844a = c12018b.m44844a();
                    String str = this.f6627d;
                    long jLongValue = this.f6622L.longValue();
                    int i10 = C2571m0.f9152a;
                    Bundle bundle = new Bundle();
                    C2571m0.m11555c(bundle, C11809a.f41567a, str, jLongValue);
                    Bundle bundleMo11351o2 = interfaceC2493f.mo11351o2(9, packageName, strM44844a, bundle);
                    interfaceC12022c.mo25628a(C1752h.m8675a(C2571m0.m11554b(bundleMo11351o2, "BillingClient"), C2571m0.m11561i(bundleMo11351o2, "BillingClient")));
                    return null;
                }
                m8524D(interfaceC12022c, C1752h.f6764j, EnumC2644s7.SERVICE_RESET_TO_NULL, null);
            } else {
                EnumC2644s7 enumC2644s9 = EnumC2644s7.API_VERSION_NOT_V9;
                C1748d c1748d3 = C1752h.f6755a;
                m8548q0(enumC2644s9, 3, c1748d3);
                interfaceC12022c.mo25628a(c1748d3);
            }
            return null;
        } catch (DeadObjectException e10) {
            m8524D(interfaceC12022c, C1752h.f6764j, EnumC2644s7.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e10);
            return null;
        } catch (Exception e11) {
            m8524D(interfaceC12022c, C1752h.f6762h, EnumC2644s7.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
            return null;
        }
    }

    public C1746b(String str, C12046i c12046i, Context context, InterfaceC12069p1 interfaceC12069p1, InterfaceC12048i1 interfaceC12048i1, ExecutorService executorService, AbstractC1745a.a aVar) {
        this.f6624a = new Object();
        this.f6625b = 0;
        this.f6628e = new Handler(Looper.getMainLooper());
        this.f6636m = 0;
        this.f6619I = AbstractC2637s0.m11707k();
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f6622L = lValueOf;
        this.f6623M = C2625r.m11694a();
        this.f6626c = C11809a.f41567a;
        String strM8473B = m8473B();
        this.f6627d = strM8473B;
        this.f6630g = context.getApplicationContext();
        C2491e8 c2491e8M11459L = C2524h8.m11459L();
        c2491e8M11459L.m11385E(C11809a.f41567a);
        if (strM8473B != null) {
            c2491e8M11459L.m11386G(strM8473B);
        }
        c2491e8M11459L.m11393v(this.f6630g.getPackageName());
        c2491e8M11459L.m11390r(lValueOf.longValue());
        c2491e8M11459L.m11384D(aVar.f6610j);
        c2491e8M11459L.m11387o(Build.VERSION.SDK_INT);
        c2491e8M11459L.m11392t(912213584L);
        m8508m0(c2491e8M11459L, context);
        try {
            c2491e8M11459L.m11388p(this.f6630g.getPackageManager().getPackageInfo(this.f6630g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingClient", "Error getting app version code.", th2);
        }
        this.f6631h = new C12060m1(this.f6630g, (C2524h8) c2491e8M11459L.m11645i());
        C2571m0.m11565m("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f6629f = new C12079t(this.f6630g, null, null, null, null, null, this.f6631h);
        this.f6616F = c12046i;
        this.f6630g.getPackageName();
        this.f6617G = aVar.f6610j;
    }

    public C1746b(String str, C12046i c12046i, Context context, InterfaceC12058m interfaceC12058m, InterfaceC12023c0 interfaceC12023c0, InterfaceC12048i1 interfaceC12048i1, ExecutorService executorService, AbstractC1745a.a aVar) {
        this.f6624a = new Object();
        this.f6625b = 0;
        this.f6628e = new Handler(Looper.getMainLooper());
        this.f6636m = 0;
        this.f6619I = AbstractC2637s0.m11707k();
        this.f6622L = Long.valueOf(new Random().nextLong());
        this.f6623M = C2625r.m11694a();
        this.f6626c = C11809a.f41567a;
        this.f6627d = m8473B();
        m8541j(context, interfaceC12058m, c12046i, null, C11809a.f41567a, null, aVar);
    }
}
