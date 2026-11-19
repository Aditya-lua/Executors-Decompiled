package com.roblox.client.purchase;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.Keep;
import bh.q0;
import bh.y;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.NativePurchaseContext;
import com.roblox.engine.jni.autovalue.PreparePaymentParams;
import com.roblox.engine.jni.autovalue.ProcessPaymentParams;
import ei.s0;
import java.util.HashMap;
import mj.j;
import mj.l;
import mj.o;
import mj.p;
import nj.a0;
import nj.m;
import ok.q;
import ok.t;
import pj.ValidatePurchaseResponsePayload;

/* JADX INFO: loaded from: classes2.dex */
public class IAPPurchaseManager {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static mj.a f9072h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9073i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ProgressDialog f9074j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Activity f9075k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f9076l = "buyRobuxPage";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f9077m = "buyUpsell";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f9078n = "buyDevSub";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mj.a f9081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f9082e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9079a = 0;
    public String b = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f9083f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f9084g = new f();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.A1);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.A1);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.B1);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.A1);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f9089a;
        public final /* synthetic */ CharSequence b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f9090c;

        public e(p pVar, CharSequence charSequence, Activity activity) {
            this.f9089a = pVar;
            this.b = charSequence;
            this.f9090c = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9089a.f()) {
                IAPPurchaseManager.t(this.b, this.f9090c);
                return;
            }
            if (IAPPurchaseManager.f9073i) {
                IAPPurchaseManager.f9072h.V(this.b.toString());
                return;
            }
            if (!h.a().k1()) {
                IAPPurchaseManager.f9072h.q0().V(this.b.toString());
                return;
            }
            com.roblox.client.b bVarQ0 = IAPPurchaseManager.f9072h.q0();
            if (bVarQ0 instanceof com.roblox.client.a) {
                ((com.roblox.client.a) bVarQ0).V(this.b.toString());
            } else {
                q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolPurchaseFinished stored_mActivityInterface.getRobloxActivity() is null.");
                dj.g.b().q("Payments-Protocol-Purchase-Finished-Null-Activity");
            }
        }
    }

    public class f implements s0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p f9092a;
            public final /* synthetic */ CharSequence b;

            public a(p pVar, CharSequence charSequence) {
                this.f9092a = pVar;
                this.b = charSequence;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f9092a.f()) {
                    IAPPurchaseManager.this.s(this.b);
                } else {
                    IAPPurchaseManager.this.q(this.b.toString());
                }
            }
        }

        public f() {
        }

        @Override // ei.s0
        public void a(boolean z10, long j10, String str, String str2) {
            IAPPurchaseManager.this.x(z10, j10, str, str2);
        }

        @Override // mj.o
        public void b() {
        }

        @Override // mj.o
        public void c() {
        }

        @Override // mj.o
        public void d() {
        }

        @Override // mj.o
        public void e(p pVar) {
            Activity activityE0 = IAPPurchaseManager.this.f9080c ? IAPPurchaseManager.this.f9081d.e0() : IAPPurchaseManager.this.f9081d.q0();
            if (activityE0 == null) {
                return;
            }
            IAPPurchaseManager.this.E(new a(pVar, pVar.d() ? IAPPurchaseManager.this.v(q0.C1) : pVar.c(activityE0)));
        }
    }

    public class g implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9094a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f9095c;

        public g(long j10, String str, String str2) {
            this.f9094a = j10;
            this.b = str;
            this.f9095c = str2;
        }

        @Override // mj.o
        public void b() {
        }

        @Override // mj.o
        public void c() {
        }

        @Override // mj.o
        public void d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mj.o
        public void e(final p pVar) {
            String strB;
            if (!(pVar instanceof j) || (strB = ((j) pVar).b()) == null) {
                strB = BuildConfig.FLAVOR;
            }
            String str = strB;
            if (IAPPurchaseManager.f9076l.equals(this.f9095c)) {
                final Activity activityE0 = IAPPurchaseManager.this.f9080c ? IAPPurchaseManager.this.f9081d.e0() : IAPPurchaseManager.this.f9081d.q0();
                if (activityE0 != null) {
                    IAPPurchaseManager.this.E(new Runnable() { // from class: mj.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f23304a.g(activityE0, pVar);
                        }
                    });
                }
            } else {
                IAPPurchaseManager.this.f9083f.e(pVar);
            }
            IAPPurchaseManager.this.x(pVar.d(), this.f9094a, this.b, str);
        }

        public final /* synthetic */ void g(Activity activity, p pVar) {
            l.c(activity, pVar, this.b);
        }
    }

    public IAPPurchaseManager(mj.a aVar, boolean z10) {
        this.f9081d = aVar;
        this.f9080c = z10;
        f9072h = aVar;
        f9073i = z10;
        this.f9082e = new Handler(Looper.getMainLooper());
    }

    public static void M(Context context, boolean z10) {
        if (!t.g()) {
            if (t.i()) {
                String strK = nk.c.c().k();
                long j10 = nk.c.c().j();
                q.h("rbx.purchaseflow", "tryGrantPendingPurchases: username = " + strK + ", userId = " + j10);
                if (TextUtils.isEmpty(strK)) {
                    return;
                }
                if (h.a().L5()) {
                    qj.b.a(context);
                    throw null;
                }
                if (j10 > 0) {
                    qj.a.a(context);
                    throw null;
                }
                qj.a.a(context);
                throw null;
            }
            return;
        }
        String strK2 = nk.c.c().k();
        long j11 = nk.c.c().j();
        if (TextUtils.isEmpty(strK2)) {
            return;
        }
        q.h("rbx.purchaseflow", "tryGrantPendingPurchases: username = " + strK2 + ", userId = " + j11);
        if (h.a().L1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocol: tryGrantPendingPurchases");
            if (j11 > 0) {
                a0.R(context).K(j11, z10);
                return;
            } else {
                a0.R(context).L(z10);
                return;
            }
        }
        if (h.a().t3() && h.a().q()) {
            m.F0(context).m1(j11, strK2, z10);
        } else if (j11 > 0) {
            m.F0(context).A0(j11, strK2, z10);
        } else {
            m.F0(context).B0(strK2, z10);
        }
    }

    public static /* synthetic */ void d(boolean z10) {
        Activity activity = f9075k;
        if (activity == null || activity.isFinishing() || f9075k.isDestroyed()) {
            return;
        }
        if (f9074j == null) {
            Activity activity2 = f9075k;
            f9074j = u(activity2, null, activity2.getString(q0.P));
        }
        if (z10) {
            q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay show.");
            f9074j.show();
        } else {
            q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay hide.");
            f9074j.dismiss();
        }
    }

    @Keep
    public static String getPlatformPaymentMethod() {
        if (t.g()) {
            return "GooglePlayStore";
        }
        return (t.i() && h.a().L5()) ? "MilkyWayStore" : BuildConfig.FLAVOR;
    }

    @Keep
    public static String getPlatformPaymentProviderType() {
        if (t.g()) {
            return "GooglePlayStore";
        }
        return (t.i() && h.a().L5()) ? "MilkyWayStore" : BuildConfig.FLAVOR;
    }

    @Keep
    public static boolean invokeStore(String str, String str2) {
        q.h("rbx.purchaseflow", "PaymentsProtocol: invokeStore attempt.");
        if (t.g()) {
            Activity activityE0 = f9073i ? f9072h.e0() : f9072h.q0();
            m.F0(activityE0).a(str, nk.c.c().j(), nk.c.c().k(), str2, activityE0);
            return false;
        }
        if (!t.i()) {
            return false;
        }
        qj.b.a(f9073i ? f9072h.e0() : f9072h.q0());
        nk.c.c().j();
        nk.c.c().k();
        throw null;
    }

    @Keep
    public static void invokeStoreV2(String str, long j10, String str2) {
        q.h("rbx.purchaseflow", "PaymentsProtocolV2: invokeStoreV2 attempt:" + str + ", " + j10 + ", " + str2);
        if (t.g()) {
            Activity activityE0 = f9073i ? f9072h.e0() : f9072h.q0();
            a0.R(activityE0).Q(activityE0, new ValidatePurchaseResponsePayload(Long.valueOf(j10), str2, null), null, null);
        }
    }

    public static native void nativeBeginPaymentsProtocolPurchase(String str);

    public static native HashMap<String, String> nativeBeginPaymentsProtocolPurchaseV2(PreparePaymentParams preparePaymentParams);

    public static native void nativeFinishPaymentsProtocolPurchase(String str, int i10, String str2);

    public static native void nativeFinishPaymentsProtocolPurchaseV2(ProcessPaymentParams processPaymentParams);

    public static native void nativeInvokeStore(String str, long j10, String str2);

    public static native void nativePerformSubscriptionPurchase(String str, String str2, String str3, String str4);

    public static native void nativeSetMetricsPurchaseType(String str);

    public static native void nativeSetPaymentSessionId(String str);

    public static native void nativeSetPaymentsProtocolIsInApp(boolean z10);

    public static native void nativeSetProviderCurrencyCode(String str);

    public static native void nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(String str, String str2);

    public static native void nativeSetUserId(long j10);

    @Keep
    public static boolean paymentsProtocolConcludeTransaction(String str, long j10, long j11) {
        q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolConcludeTransaction attempt.");
        if (t.g()) {
            m.F0(f9073i ? f9072h.e0() : f9072h.q0()).h(str, j10, nk.c.c().j());
            return true;
        }
        if (!t.i()) {
            return false;
        }
        qj.b.a(f9073i ? f9072h.e0() : f9072h.q0());
        nk.c.c().j();
        throw null;
    }

    @Keep
    public static void paymentsProtocolHandlePreparePaymentErrorCode(int i10) {
        if (h.a().O2()) {
            if (t.g()) {
                m.F0(f9073i ? f9072h.e0() : f9072h.q0()).n(i10);
            } else if (t.i()) {
                qj.b.a(f9073i ? f9072h.e0() : f9072h.q0());
                throw null;
            }
        }
    }

    @Keep
    public static void paymentsProtocolProcessPaymentCallback(long[] jArr, int i10, String str, String str2) {
        q.h("rbx.purchaseflow", "PaymentsProtocolV2: paymentsProtocolProcessPaymentCallback attempt.");
        if (t.g()) {
            a0.R(f9073i ? f9072h.e0() : f9072h.q0()).q0(jArr, i10, str, str2);
        }
    }

    @Keep
    public static void paymentsProtocolPurchaseFinished(p pVar) {
        q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolPurchaseFinished attempt.");
        Activity activityE0 = f9073i ? f9072h.e0() : f9072h.q0();
        if (activityE0 == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new e(pVar, pVar.c(activityE0), activityE0));
    }

    @Keep
    public static void paymentsProtocolSetProgressBarDisplay(final boolean z10) {
        if (h.a().p5()) {
            q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay attempt.");
            if (z10 || f9075k != null) {
                if (f9075k == null) {
                    q.h("rbx.purchaseflow", "PaymentsProtocol: initializing mPaymentsProtocolActivity");
                    f9075k = f9072h.q0();
                }
                Activity activity = f9075k;
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: mj.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            IAPPurchaseManager.d(z10);
                        }
                    });
                }
            }
        }
    }

    @Keep
    public static boolean setCheckoutSessionId(String str) {
        if (t.g()) {
            return m.F0(f9073i ? f9072h.e0() : f9072h.q0()).m(str);
        }
        if (!t.i() || !h.a().L5()) {
            return false;
        }
        qj.b.a(f9073i ? f9072h.e0() : f9072h.q0());
        throw null;
    }

    public static void t(CharSequence charSequence, Activity activity) {
        androidx.appcompat.app.a aVarA = new androidx.appcompat.app.a.C0021a(activity).a();
        TextView textView = new TextView(activity);
        String string = activity.getString(q0.W);
        int iIndexOf = charSequence.toString().indexOf(string);
        pk.b.b(textView, charSequence.toString(), new pk.c(activity, null, string, iIndexOf, iIndexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        aVarA.w(textView, 150, 100, 150, 100);
        aVarA.setCanceledOnTouchOutside(true);
        try {
            aVarA.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public static ProgressDialog u(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    public final /* synthetic */ void A() {
        r(q0.F1);
    }

    public final /* synthetic */ void B() {
        r(q0.A1);
    }

    public final /* synthetic */ void C() {
        r(q0.F1);
    }

    public final /* synthetic */ void D() {
        r(q0.A1);
    }

    public void E(Runnable runnable) {
        this.f9082e.post(runnable);
    }

    public void F(long j10, String str) {
        J(j10, str, BuildConfig.FLAVOR);
    }

    public void G(long j10, String str, String str2) {
        K(j10, str, str2, BuildConfig.FLAVOR);
    }

    public void H(long j10, String str, NativePurchaseContext nativePurchaseContext) {
        String strPaymentSessionId = nativePurchaseContext.paymentSessionId();
        if (strPaymentSessionId == null) {
            strPaymentSessionId = BuildConfig.FLAVOR;
        }
        L(j10, str, strPaymentSessionId, nativePurchaseContext.purchaseType(), nativePurchaseContext.isInApp());
    }

    public void I(long j10, String str, String str2) {
        q.h("rbx.purchaseflow", "promptNativePurchaseWithPayload: userId = " + j10 + ", roblox-native-productId = " + str);
        this.f9079a = j10;
        if (t.j()) {
            q.e("rbx.purchaseflow", "Luobu purchasing not enabled");
            w(false, j10, str);
            return;
        }
        Activity activityE0 = this.f9080c ? this.f9081d.e0() : this.f9081d.q0();
        if (t.i()) {
            if (!h.a().L5()) {
                qj.a.a(activityE0);
                throw null;
            }
            E(new c());
            w(false, j10, str);
            return;
        }
        if (h.a().L1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchaseWithPayload.");
            if (a0.R(activityE0).d(j10, str, str2, activityE0, true, this.f9083f)) {
                return;
            }
            E(new Runnable() { // from class: mj.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23302a.y();
                }
            });
            w(false, j10, str);
            return;
        }
        if (!h.a().t3()) {
            if (m.F0(activityE0).d(j10, str, str2, activityE0, true, this.f9083f)) {
                return;
            }
            E(new d());
            w(false, j10, str);
            return;
        }
        q.h("rbx.purchaseflow", "PaymentsProtocol: promptNativePurchaseWithPayload.");
        nativeSetMetricsPurchaseType(f9078n);
        m mVarF0 = m.F0(activityE0);
        mVarF0.k(false);
        if (h.a().V()) {
            mVarF0.j(this.f9083f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        nativeSetPaymentSessionId(BuildConfig.FLAVOR);
        nativeSetUserId(j10);
        mVarF0.g(str, j10, nk.c.c().k(), activityE0, str2);
    }

    public void J(long j10, String str, String str2) {
        L(j10, str, str2, f9077m, false);
    }

    public void K(long j10, String str, String str2, String str3) {
        q.h("rbx.purchaseflow", "promptNativePurchase: player = " + j10 + ", productId = " + str);
        this.f9079a = j10;
        this.b = str;
        if (t.j()) {
            Activity activityE0 = this.f9080c ? this.f9081d.e0() : this.f9081d.q0();
            if (activityE0 == null || activityE0.isFinishing()) {
                return;
            }
            y.h().j(activityE0).b(activityE0, str, j10, this.f9083f);
            return;
        }
        if (t.i()) {
            Activity activityE1 = this.f9080c ? this.f9081d.e0() : this.f9081d.q0();
            if (!h.a().L5()) {
                qj.a.a(activityE1);
                throw null;
            }
            nativeSetMetricsPurchaseType(f9077m);
            qj.b.a(activityE1);
            throw null;
        }
        Activity activityE2 = this.f9080c ? this.f9081d.e0() : this.f9081d.q0();
        if (h.a().L1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchase.");
            if (a0.R(activityE2).b(str2, str, activityE2, j10, this.f9083f)) {
                return;
            }
            E(new Runnable() { // from class: mj.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23303a.z();
                }
            });
            w(false, j10, str);
            return;
        }
        if (!h.a().t3()) {
            if (m.F0(activityE2).b(str2, str, activityE2, j10, this.f9083f)) {
                return;
            }
            E(new a());
            w(false, j10, str);
            return;
        }
        nativeSetMetricsPurchaseType(f9077m);
        m mVarF0 = m.F0(activityE2);
        mVarF0.i(null);
        mVarF0.k(false);
        if (h.a().V()) {
            mVarF0.j(this.f9083f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        if (h.a().P1()) {
            nativeSetPaymentSessionId(str3);
        } else {
            nativeSetPaymentSessionId(BuildConfig.FLAVOR);
        }
        nativeSetProviderCurrencyCode(mVarF0.e(str));
        nativeBeginPaymentsProtocolPurchase(str);
    }

    public final void L(long j10, String str, String str2, String str3, boolean z10) {
        q.h("rbx.purchaseflow", "promptNativePurchase: userId = " + j10 + ", productId = " + str);
        this.f9079a = j10;
        this.b = str;
        if (t.j()) {
            Activity activityE0 = this.f9080c ? this.f9081d.e0() : this.f9081d.q0();
            if (activityE0 == null || activityE0.isFinishing()) {
                return;
            }
            if (h.a().E4() && z10) {
                y.h().j(activityE0).a(activityE0, str, new g(j10, str, str3));
                return;
            } else {
                y.h().j(activityE0).b(activityE0, str, j10, this.f9083f);
                return;
            }
        }
        if (t.i()) {
            Activity activityE1 = this.f9080c ? this.f9081d.e0() : this.f9081d.q0();
            if (h.a().L5()) {
                nativeSetMetricsPurchaseType(f9077m);
                qj.b.a(activityE1);
                throw null;
            }
            qj.a.a(activityE1);
            if (!h.a().E4() || !z10) {
                Long.toString(j10);
                throw null;
            }
            E(new Runnable() { // from class: mj.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23298a.A();
                }
            });
            w(false, j10, str);
            return;
        }
        Activity activityE2 = this.f9080c ? this.f9081d.e0() : this.f9081d.q0();
        if (h.a().L1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchase.");
            if (a0.R(activityE2).b(Long.toString(j10), str, activityE2, j10, this.f9083f)) {
                return;
            }
            E(new Runnable() { // from class: mj.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23299a.B();
                }
            });
            w(false, j10, str);
            return;
        }
        if (!h.a().t3()) {
            m mVarF0 = m.F0(activityE2);
            if (!h.a().E4() || !z10) {
                if (mVarF0.b(Long.toString(j10), str, activityE2, j10, this.f9083f)) {
                    return;
                }
                E(new b());
                w(false, j10, str);
                return;
            }
            if (mVarF0 == null) {
                E(new Runnable() { // from class: mj.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23300a.C();
                    }
                });
                w(false, j10, str);
                return;
            } else {
                if (mVarF0.l(nk.c.c().k(), str, activityE2, new g(j10, str, str3), false, str2)) {
                    return;
                }
                E(new Runnable() { // from class: mj.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23301a.D();
                    }
                });
                w(false, j10, str);
                return;
            }
        }
        if (h.a().E4()) {
            nativeSetMetricsPurchaseType(str3);
        } else {
            nativeSetMetricsPurchaseType(f9077m);
        }
        m mVarF1 = m.F0(activityE2);
        mVarF1.i(null);
        if (h.a().E4()) {
            mVarF1.k(z10);
        } else {
            mVarF1.k(false);
        }
        if (h.a().V()) {
            mVarF1.j(this.f9083f);
        }
        if (h.a().E4()) {
            nativeSetPaymentsProtocolIsInApp(z10);
        } else {
            nativeSetPaymentsProtocolIsInApp(false);
        }
        if (h.a().P1()) {
            nativeSetPaymentSessionId(str2);
        } else {
            nativeSetPaymentSessionId(BuildConfig.FLAVOR);
        }
        nativeSetProviderCurrencyCode(mVarF1.e(str));
        nativeBeginPaymentsProtocolPurchase(str);
    }

    public final void q(String str) {
        if (this.f9080c) {
            this.f9081d.V(str);
        } else {
            this.f9081d.q0().V(str);
        }
    }

    public final void r(int i10) {
        if (this.f9080c) {
            this.f9081d.T(i10);
        } else {
            this.f9081d.q0().T(i10);
        }
    }

    public void s(CharSequence charSequence) {
        Activity activityE0 = this.f9080c ? this.f9081d.e0() : this.f9081d.q0();
        if (activityE0 == null) {
            return;
        }
        t(charSequence, activityE0);
    }

    public String v(int i10) {
        return this.f9080c ? this.f9081d.e0().getString(i10) : this.f9081d.q0().getString(i10);
    }

    public final void w(boolean z10, long j10, String str) {
        x(z10, j10, str, BuildConfig.FLAVOR);
    }

    public final void x(boolean z10, long j10, String str, String str2) {
        q.h("rbx.purchaseflow", "In-App purchase finished: success = " + z10 + ", player=" + j10 + ", productId=" + str + ", checkoutSessionId=" + str2);
        if (this.f9079a == 0) {
            q.h("rbx.purchaseflow", "AppShellFragment.inAppPurchaseFinished: userId == 0.");
            return;
        }
        q.h("rbx.purchaseflow", "Native call. Success=" + z10 + ", player=" + j10 + ", productId=" + str + ", checkoutSessionId" + str2);
        if (h.a().u1()) {
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            NativeGLInterface.nativeInGamePurchaseFinishedV2(z10, j10, str, str2);
        } else {
            NativeGLInterface.nativeInGamePurchaseFinished(z10, j10, str);
        }
        this.b = BuildConfig.FLAVOR;
        this.f9079a = 0L;
    }

    public final /* synthetic */ void y() {
        r(q0.A1);
    }

    public final /* synthetic */ void z() {
        r(q0.A1);
    }
}
