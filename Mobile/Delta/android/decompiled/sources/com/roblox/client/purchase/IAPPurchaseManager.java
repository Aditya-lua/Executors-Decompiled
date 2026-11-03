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
import cj.j;
import cj.l;
import cj.o;
import cj.p;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.NativePurchaseContext;
import com.roblox.engine.jni.autovalue.PreparePaymentParams;
import com.roblox.engine.jni.autovalue.ProcessPaymentParams;
import dj.a0;
import dj.m;
import ek.q;
import ek.t;
import fj.ValidatePurchaseResponsePayload;
import java.util.HashMap;
import rg.q0;
import rg.y;
import rh.h;
import uh.s0;

/* JADX INFO: loaded from: classes2.dex */
public class IAPPurchaseManager {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static cj.a f9255h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9256i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ProgressDialog f9257j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Activity f9258k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f9259l = "buyRobuxPage";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f9260m = "buyUpsell";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f9261n = "buyDevSub";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cj.a f9264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f9265e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9262a = 0;
    public String b = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f9266f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f9267g = new f();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.f30567q1);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.f30567q1);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.f30570r1);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.r(q0.f30567q1);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f9272a;
        public final /* synthetic */ CharSequence b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f9273c;

        public e(p pVar, CharSequence charSequence, Activity activity) {
            this.f9272a = pVar;
            this.b = charSequence;
            this.f9273c = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9272a.f()) {
                IAPPurchaseManager.t(this.b, this.f9273c);
                return;
            }
            if (IAPPurchaseManager.f9256i) {
                IAPPurchaseManager.f9255h.V(this.b.toString());
                return;
            }
            if (!h.a().k1()) {
                IAPPurchaseManager.f9255h.q0().V(this.b.toString());
                return;
            }
            com.roblox.client.b bVarQ0 = IAPPurchaseManager.f9255h.q0();
            if (bVarQ0 instanceof com.roblox.client.a) {
                ((com.roblox.client.a) bVarQ0).V(this.b.toString());
            } else {
                q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolPurchaseFinished stored_mActivityInterface.getRobloxActivity() is null.");
                ti.g.b().q("Payments-Protocol-Purchase-Finished-Null-Activity");
            }
        }
    }

    public class f implements s0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p f9275a;
            public final /* synthetic */ CharSequence b;

            public a(p pVar, CharSequence charSequence) {
                this.f9275a = pVar;
                this.b = charSequence;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f9275a.f()) {
                    IAPPurchaseManager.this.s(this.b);
                } else {
                    IAPPurchaseManager.this.q(this.b.toString());
                }
            }
        }

        public f() {
        }

        @Override // uh.s0
        public void a(boolean z10, long j10, String str, String str2) {
            IAPPurchaseManager.this.x(z10, j10, str, str2);
        }

        @Override // cj.o
        public void b() {
        }

        @Override // cj.o
        public void c(p pVar) {
            Activity activityF0 = IAPPurchaseManager.this.f9263c ? IAPPurchaseManager.this.f9264d.f0() : IAPPurchaseManager.this.f9264d.q0();
            if (activityF0 == null) {
                return;
            }
            IAPPurchaseManager.this.E(new a(pVar, pVar.d() ? IAPPurchaseManager.this.v(q0.f30573s1) : pVar.c(activityF0)));
        }

        @Override // cj.o
        public void d() {
        }

        @Override // cj.o
        public void e() {
        }
    }

    public class g implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9277a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f9278c;

        public g(long j10, String str, String str2) {
            this.f9277a = j10;
            this.b = str;
            this.f9278c = str2;
        }

        @Override // cj.o
        public void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // cj.o
        public void c(final p pVar) {
            String strB;
            if (!(pVar instanceof j) || (strB = ((j) pVar).b()) == null) {
                strB = "";
            }
            String str = strB;
            if (IAPPurchaseManager.f9259l.equals(this.f9278c)) {
                final Activity activityF0 = IAPPurchaseManager.this.f9263c ? IAPPurchaseManager.this.f9264d.f0() : IAPPurchaseManager.this.f9264d.q0();
                if (activityF0 != null) {
                    IAPPurchaseManager.this.E(new Runnable() { // from class: cj.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f5028a.g(activityF0, pVar);
                        }
                    });
                }
            } else {
                IAPPurchaseManager.this.f9266f.c(pVar);
            }
            IAPPurchaseManager.this.x(pVar.d(), this.f9277a, this.b, str);
        }

        @Override // cj.o
        public void d() {
        }

        @Override // cj.o
        public void e() {
        }

        public final /* synthetic */ void g(Activity activity, p pVar) {
            l.c(activity, pVar, this.b);
        }
    }

    public IAPPurchaseManager(cj.a aVar, boolean z10) {
        this.f9264d = aVar;
        this.f9263c = z10;
        f9255h = aVar;
        f9256i = z10;
        this.f9265e = new Handler(Looper.getMainLooper());
    }

    public static void M(Context context, boolean z10) {
        if (!t.g()) {
            if (t.i()) {
                String strK = dk.c.c().k();
                long j10 = dk.c.c().j();
                q.h("rbx.purchaseflow", "tryGrantPendingPurchases: username = " + strK + ", userId = " + j10);
                if (TextUtils.isEmpty(strK)) {
                    return;
                }
                if (h.a().M5()) {
                    gj.b.a(context);
                    throw null;
                }
                if (j10 > 0) {
                    gj.a.a(context);
                    throw null;
                }
                gj.a.a(context);
                throw null;
            }
            return;
        }
        String strK2 = dk.c.c().k();
        long j11 = dk.c.c().j();
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
        if (h.a().q3() && h.a().q()) {
            m.F0(context).m1(j11, strK2, z10);
        } else if (j11 > 0) {
            m.F0(context).A0(j11, strK2, z10);
        } else {
            m.F0(context).B0(strK2, z10);
        }
    }

    public static /* synthetic */ void d(boolean z10) {
        Activity activity = f9258k;
        if (activity == null || activity.isFinishing() || f9258k.isDestroyed()) {
            return;
        }
        if (f9257j == null) {
            Activity activity2 = f9258k;
            f9257j = u(activity2, null, activity2.getString(q0.P));
        }
        if (z10) {
            q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay show.");
            f9257j.show();
        } else {
            q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay hide.");
            f9257j.dismiss();
        }
    }

    @Keep
    public static String getPlatformPaymentMethod() {
        if (t.g()) {
            return BuildConfig.STORE_TYPE;
        }
        return (t.i() && h.a().M5()) ? "MilkyWayStore" : "";
    }

    @Keep
    public static String getPlatformPaymentProviderType() {
        if (t.g()) {
            return BuildConfig.STORE_TYPE;
        }
        return (t.i() && h.a().M5()) ? "MilkyWayStore" : "";
    }

    @Keep
    public static boolean invokeStore(String str, String str2) {
        q.h("rbx.purchaseflow", "PaymentsProtocol: invokeStore attempt.");
        if (t.g()) {
            Activity activityF0 = f9256i ? f9255h.f0() : f9255h.q0();
            m.F0(activityF0).a(str, dk.c.c().j(), dk.c.c().k(), str2, activityF0);
            return false;
        }
        if (!t.i()) {
            return false;
        }
        gj.b.a(f9256i ? f9255h.f0() : f9255h.q0());
        dk.c.c().j();
        dk.c.c().k();
        throw null;
    }

    @Keep
    public static void invokeStoreV2(String str, long j10, String str2) {
        q.h("rbx.purchaseflow", "PaymentsProtocolV2: invokeStoreV2 attempt:" + str + ", " + j10 + ", " + str2);
        if (t.g()) {
            Activity activityF0 = f9256i ? f9255h.f0() : f9255h.q0();
            a0.R(activityF0).Q(activityF0, new ValidatePurchaseResponsePayload(Long.valueOf(j10), str2, null), null, null);
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
            m.F0(f9256i ? f9255h.f0() : f9255h.q0()).g(str, j10, dk.c.c().j());
            return true;
        }
        if (!t.i()) {
            return false;
        }
        gj.b.a(f9256i ? f9255h.f0() : f9255h.q0());
        dk.c.c().j();
        throw null;
    }

    @Keep
    public static void paymentsProtocolHandlePreparePaymentErrorCode(int i10) {
        if (h.a().M2()) {
            if (t.g()) {
                m.F0(f9256i ? f9255h.f0() : f9255h.q0()).m(i10);
            } else if (t.i()) {
                gj.b.a(f9256i ? f9255h.f0() : f9255h.q0());
                throw null;
            }
        }
    }

    @Keep
    public static void paymentsProtocolProcessPaymentCallback(long[] jArr, int i10, String str, String str2) {
        q.h("rbx.purchaseflow", "PaymentsProtocolV2: paymentsProtocolProcessPaymentCallback attempt.");
        if (t.g()) {
            a0.R(f9256i ? f9255h.f0() : f9255h.q0()).q0(jArr, i10, str, str2);
        }
    }

    @Keep
    public static void paymentsProtocolPurchaseFinished(p pVar) {
        q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolPurchaseFinished attempt.");
        Activity activityF0 = f9256i ? f9255h.f0() : f9255h.q0();
        if (activityF0 == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new e(pVar, pVar.c(activityF0), activityF0));
    }

    @Keep
    public static void paymentsProtocolSetProgressBarDisplay(final boolean z10) {
        if (h.a().q5()) {
            q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay attempt.");
            if (z10 || f9258k != null) {
                if (f9258k == null) {
                    q.h("rbx.purchaseflow", "PaymentsProtocol: initializing mPaymentsProtocolActivity");
                    f9258k = f9255h.q0();
                }
                Activity activity = f9258k;
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: cj.b
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
            return m.F0(f9256i ? f9255h.f0() : f9255h.q0()).l(str);
        }
        if (!t.i() || !h.a().M5()) {
            return false;
        }
        gj.b.a(f9256i ? f9255h.f0() : f9255h.q0());
        throw null;
    }

    public static void t(CharSequence charSequence, Activity activity) {
        androidx.appcompat.app.a aVarA = new androidx.appcompat.app.a.C0009a(activity).a();
        TextView textView = new TextView(activity);
        String string = activity.getString(q0.W);
        int iIndexOf = charSequence.toString().indexOf(string);
        fk.b.b(textView, charSequence.toString(), new fk.c(activity, null, string, iIndexOf, iIndexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        aVarA.x(textView, 150, 100, 150, 100);
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
        r(q0.f30582v1);
    }

    public final /* synthetic */ void B() {
        r(q0.f30567q1);
    }

    public final /* synthetic */ void C() {
        r(q0.f30582v1);
    }

    public final /* synthetic */ void D() {
        r(q0.f30567q1);
    }

    public void E(Runnable runnable) {
        this.f9265e.post(runnable);
    }

    public void F(long j10, String str) {
        J(j10, str, "");
    }

    public void G(long j10, String str, String str2) {
        K(j10, str, str2, "");
    }

    public void H(long j10, String str, NativePurchaseContext nativePurchaseContext) {
        String strPaymentSessionId = nativePurchaseContext.paymentSessionId();
        if (strPaymentSessionId == null) {
            strPaymentSessionId = "";
        }
        L(j10, str, strPaymentSessionId, nativePurchaseContext.purchaseType(), nativePurchaseContext.isInApp());
    }

    public void I(long j10, String str, String str2) {
        q.h("rbx.purchaseflow", "promptNativePurchaseWithPayload: userId = " + j10 + ", roblox-native-productId = " + str);
        this.f9262a = j10;
        if (t.j()) {
            q.e("rbx.purchaseflow", "Luobu purchasing not enabled");
            w(false, j10, str);
            return;
        }
        Activity activityF0 = this.f9263c ? this.f9264d.f0() : this.f9264d.q0();
        if (t.i()) {
            if (!h.a().M5()) {
                gj.a.a(activityF0);
                throw null;
            }
            E(new c());
            w(false, j10, str);
            return;
        }
        if (h.a().L1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchaseWithPayload.");
            if (a0.R(activityF0).h(j10, str, str2, activityF0, true, this.f9266f)) {
                return;
            }
            E(new Runnable() { // from class: cj.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5026a.y();
                }
            });
            w(false, j10, str);
            return;
        }
        if (!h.a().q3()) {
            if (m.F0(activityF0).h(j10, str, str2, activityF0, true, this.f9266f)) {
                return;
            }
            E(new d());
            w(false, j10, str);
            return;
        }
        q.h("rbx.purchaseflow", "PaymentsProtocol: promptNativePurchaseWithPayload.");
        nativeSetMetricsPurchaseType(f9261n);
        m mVarF0 = m.F0(activityF0);
        mVarF0.k(false);
        if (h.a().T()) {
            mVarF0.j(this.f9266f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        nativeSetPaymentSessionId("");
        nativeSetUserId(j10);
        mVarF0.f(str, j10, dk.c.c().k(), activityF0, str2);
    }

    public void J(long j10, String str, String str2) {
        L(j10, str, str2, f9260m, false);
    }

    public void K(long j10, String str, String str2, String str3) {
        q.h("rbx.purchaseflow", "promptNativePurchase: player = " + j10 + ", productId = " + str);
        this.f9262a = j10;
        this.b = str;
        if (t.j()) {
            Activity activityF0 = this.f9263c ? this.f9264d.f0() : this.f9264d.q0();
            if (activityF0 == null || activityF0.isFinishing()) {
                return;
            }
            y.h().j(activityF0).b(activityF0, str, j10, this.f9266f);
            return;
        }
        if (t.i()) {
            Activity activityF1 = this.f9263c ? this.f9264d.f0() : this.f9264d.q0();
            if (!h.a().M5()) {
                gj.a.a(activityF1);
                throw null;
            }
            nativeSetMetricsPurchaseType(f9260m);
            gj.b.a(activityF1);
            throw null;
        }
        Activity activityF2 = this.f9263c ? this.f9264d.f0() : this.f9264d.q0();
        if (h.a().L1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchase.");
            if (a0.R(activityF2).n(str2, str, activityF2, j10, this.f9266f)) {
                return;
            }
            E(new Runnable() { // from class: cj.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5027a.z();
                }
            });
            w(false, j10, str);
            return;
        }
        if (!h.a().q3()) {
            if (m.F0(activityF2).n(str2, str, activityF2, j10, this.f9266f)) {
                return;
            }
            E(new a());
            w(false, j10, str);
            return;
        }
        nativeSetMetricsPurchaseType(f9260m);
        m mVarF0 = m.F0(activityF2);
        mVarF0.i(null);
        mVarF0.k(false);
        if (h.a().T()) {
            mVarF0.j(this.f9266f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        if (h.a().P1()) {
            nativeSetPaymentSessionId(str3);
        } else {
            nativeSetPaymentSessionId("");
        }
        nativeSetProviderCurrencyCode(mVarF0.c(str));
        nativeBeginPaymentsProtocolPurchase(str);
    }

    public final void L(long j10, String str, String str2, String str3, boolean z10) {
        q.h("rbx.purchaseflow", "promptNativePurchase: userId = " + j10 + ", productId = " + str);
        this.f9262a = j10;
        this.b = str;
        if (t.j()) {
            Activity activityF0 = this.f9263c ? this.f9264d.f0() : this.f9264d.q0();
            if (activityF0 == null || activityF0.isFinishing()) {
                return;
            }
            if (h.a().D4() && z10) {
                y.h().j(activityF0).a(activityF0, str, new g(j10, str, str3));
                return;
            } else {
                y.h().j(activityF0).b(activityF0, str, j10, this.f9266f);
                return;
            }
        }
        if (t.i()) {
            Activity activityF1 = this.f9263c ? this.f9264d.f0() : this.f9264d.q0();
            if (h.a().M5()) {
                nativeSetMetricsPurchaseType(f9260m);
                gj.b.a(activityF1);
                throw null;
            }
            gj.a.a(activityF1);
            if (!h.a().D4() || !z10) {
                Long.toString(j10);
                throw null;
            }
            E(new Runnable() { // from class: cj.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5022a.A();
                }
            });
            w(false, j10, str);
            return;
        }
        Activity activityF2 = this.f9263c ? this.f9264d.f0() : this.f9264d.q0();
        if (h.a().L1()) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchase.");
            if (a0.R(activityF2).n(Long.toString(j10), str, activityF2, j10, this.f9266f)) {
                return;
            }
            E(new Runnable() { // from class: cj.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5023a.B();
                }
            });
            w(false, j10, str);
            return;
        }
        if (!h.a().q3()) {
            m mVarF0 = m.F0(activityF2);
            if (!h.a().D4() || !z10) {
                if (mVarF0.n(Long.toString(j10), str, activityF2, j10, this.f9266f)) {
                    return;
                }
                E(new b());
                w(false, j10, str);
                return;
            }
            if (mVarF0 == null) {
                E(new Runnable() { // from class: cj.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5024a.C();
                    }
                });
                w(false, j10, str);
                return;
            } else {
                if (mVarF0.b(dk.c.c().k(), str, activityF2, new g(j10, str, str3), false, str2)) {
                    return;
                }
                E(new Runnable() { // from class: cj.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5025a.D();
                    }
                });
                w(false, j10, str);
                return;
            }
        }
        if (h.a().D4()) {
            nativeSetMetricsPurchaseType(str3);
        } else {
            nativeSetMetricsPurchaseType(f9260m);
        }
        m mVarF1 = m.F0(activityF2);
        mVarF1.i(null);
        if (h.a().D4()) {
            mVarF1.k(z10);
        } else {
            mVarF1.k(false);
        }
        if (h.a().T()) {
            mVarF1.j(this.f9266f);
        }
        if (h.a().D4()) {
            nativeSetPaymentsProtocolIsInApp(z10);
        } else {
            nativeSetPaymentsProtocolIsInApp(false);
        }
        if (h.a().P1()) {
            nativeSetPaymentSessionId(str2);
        } else {
            nativeSetPaymentSessionId("");
        }
        nativeSetProviderCurrencyCode(mVarF1.c(str));
        nativeBeginPaymentsProtocolPurchase(str);
    }

    public final void q(String str) {
        if (this.f9263c) {
            this.f9264d.V(str);
        } else {
            this.f9264d.q0().V(str);
        }
    }

    public final void r(int i10) {
        if (this.f9263c) {
            this.f9264d.T(i10);
        } else {
            this.f9264d.q0().T(i10);
        }
    }

    public void s(CharSequence charSequence) {
        Activity activityF0 = this.f9263c ? this.f9264d.f0() : this.f9264d.q0();
        if (activityF0 == null) {
            return;
        }
        t(charSequence, activityF0);
    }

    public String v(int i10) {
        return this.f9263c ? this.f9264d.f0().getString(i10) : this.f9264d.q0().getString(i10);
    }

    public final void w(boolean z10, long j10, String str) {
        x(z10, j10, str, "");
    }

    public final void x(boolean z10, long j10, String str, String str2) {
        q.h("rbx.purchaseflow", "In-App purchase finished: success = " + z10 + ", player=" + j10 + ", productId=" + str + ", checkoutSessionId=" + str2);
        if (this.f9262a == 0) {
            q.h("rbx.purchaseflow", "AppShellFragment.inAppPurchaseFinished: userId == 0.");
            return;
        }
        q.h("rbx.purchaseflow", "Native call. Success=" + z10 + ", player=" + j10 + ", productId=" + str + ", checkoutSessionId" + str2);
        if (h.a().u1()) {
            if (str2 == null) {
                str2 = "";
            }
            NativeGLInterface.nativeInGamePurchaseFinishedV2(z10, j10, str, str2);
        } else {
            NativeGLInterface.nativeInGamePurchaseFinished(z10, j10, str);
        }
        this.b = "";
        this.f9262a = 0L;
    }

    public final /* synthetic */ void y() {
        r(q0.f30567q1);
    }

    public final /* synthetic */ void z() {
        r(q0.f30567q1);
    }
}
