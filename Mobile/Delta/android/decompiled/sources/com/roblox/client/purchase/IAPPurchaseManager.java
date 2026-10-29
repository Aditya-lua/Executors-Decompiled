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
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.PreparePaymentParams;
import com.roblox.engine.jni.autovalue.ProcessPaymentParams;
import ej.k;
import fj.a0;
import fj.m;
import gk.p;
import gk.s;
import hj.ValidatePurchaseResponsePayload;
import java.util.HashMap;
import sg.q0;
import sg.y;
import th.h;
import vi.g;
import wh.r0;

/* JADX INFO: loaded from: classes2.dex */
public class IAPPurchaseManager {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static ej.a f9182h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9183i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ProgressDialog f9184j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Activity f9185k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f9186l = "buyRobuxPage";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f9187m = "buyUpsell";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f9188n = "buyDevSub";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ej.a f9191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f9192e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9189a = 0;
    public String b = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f9193f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r0 f9194g = new f();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.n(q0.f30962q1);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.n(q0.f30962q1);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.n(q0.f30965r1);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.n(q0.f30962q1);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f9199a;
        public final /* synthetic */ CharSequence b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f9200c;

        public e(k kVar, CharSequence charSequence, Activity activity) {
            this.f9199a = kVar;
            this.b = charSequence;
            this.f9200c = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9199a.f()) {
                IAPPurchaseManager.p(this.b, this.f9200c);
                return;
            }
            if (IAPPurchaseManager.f9183i) {
                IAPPurchaseManager.f9182h.W(this.b.toString());
                return;
            }
            if (!h.a().c1()) {
                IAPPurchaseManager.f9182h.q0().W(this.b.toString());
                return;
            }
            com.roblox.client.b bVarQ0 = IAPPurchaseManager.f9182h.q0();
            if (bVarQ0 instanceof com.roblox.client.a) {
                ((com.roblox.client.a) bVarQ0).W(this.b.toString());
            } else {
                p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolPurchaseFinished stored_mActivityInterface.getRobloxActivity() is null.");
                g.b().q("Payments-Protocol-Purchase-Finished-Null-Activity");
            }
        }
    }

    public class f implements r0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f9202a;
            public final /* synthetic */ CharSequence b;

            public a(k kVar, CharSequence charSequence) {
                this.f9202a = kVar;
                this.b = charSequence;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f9202a.f()) {
                    IAPPurchaseManager.this.o(this.b);
                } else {
                    IAPPurchaseManager.this.m(this.b.toString());
                }
            }
        }

        public f() {
        }

        @Override // wh.r0
        public void a(boolean z10, long j10, String str, String str2) {
            IAPPurchaseManager.this.t(z10, j10, str, str2);
        }

        @Override // ej.j
        public void b() {
        }

        @Override // ej.j
        public void c() {
        }

        @Override // ej.j
        public void d() {
        }

        @Override // ej.j
        public void e(k kVar) {
            Activity activityF0 = IAPPurchaseManager.this.f9190c ? IAPPurchaseManager.this.f9191d.f0() : IAPPurchaseManager.this.f9191d.q0();
            if (activityF0 == null) {
                return;
            }
            IAPPurchaseManager.this.x(new a(kVar, kVar.d() ? IAPPurchaseManager.this.r(q0.f30968s1) : kVar.c(activityF0)));
        }
    }

    public IAPPurchaseManager(ej.a aVar, boolean z10) {
        this.f9191d = aVar;
        this.f9190c = z10;
        f9182h = aVar;
        f9183i = z10;
        this.f9192e = new Handler(Looper.getMainLooper());
    }

    public static void D(Context context, boolean z10) {
        if (!s.g()) {
            if (s.i()) {
                String strK = fk.c.c().k();
                long j10 = fk.c.c().j();
                p.h("rbx.purchaseflow", "tryGrantPendingPurchases: username = " + strK + ", userId = " + j10);
                if (TextUtils.isEmpty(strK)) {
                    return;
                }
                if (h.a().C5()) {
                    ij.b.a(context);
                    throw null;
                }
                if (j10 > 0) {
                    ij.a.a(context);
                    throw null;
                }
                ij.a.a(context);
                throw null;
            }
            return;
        }
        String strK2 = fk.c.c().k();
        long j11 = fk.c.c().j();
        if (TextUtils.isEmpty(strK2)) {
            return;
        }
        p.h("rbx.purchaseflow", "tryGrantPendingPurchases: username = " + strK2 + ", userId = " + j11);
        if (h.a().B1()) {
            p.h("rbx.purchaseflow", "PaymentsProtocol: tryGrantPendingPurchases");
            if (j11 > 0) {
                a0.R(context).K(j11, z10);
                return;
            } else {
                a0.R(context).L(z10);
                return;
            }
        }
        if (h.a().g3() && h.a().p()) {
            m.F0(context).m1(j11, strK2, z10);
        } else if (j11 > 0) {
            m.F0(context).A0(j11, strK2, z10);
        } else {
            m.F0(context).B0(strK2, z10);
        }
    }

    public static /* synthetic */ void d(boolean z10) {
        Activity activity = f9185k;
        if (activity == null || activity.isFinishing() || f9185k.isDestroyed()) {
            return;
        }
        if (f9184j == null) {
            Activity activity2 = f9185k;
            f9184j = q(activity2, null, activity2.getString(q0.P));
        }
        if (z10) {
            p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay show.");
            f9184j.show();
        } else {
            p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay hide.");
            f9184j.dismiss();
        }
    }

    @Keep
    public static String getPlatformPaymentMethod() {
        if (s.g()) {
            return BuildConfig.STORE_TYPE;
        }
        return (s.i() && h.a().C5()) ? "MilkyWayStore" : "";
    }

    @Keep
    public static String getPlatformPaymentProviderType() {
        if (s.g()) {
            return BuildConfig.STORE_TYPE;
        }
        return (s.i() && h.a().C5()) ? "MilkyWayStore" : "";
    }

    @Keep
    public static boolean invokeStore(String str, String str2) {
        p.h("rbx.purchaseflow", "PaymentsProtocol: invokeStore attempt.");
        if (s.g()) {
            Activity activityF0 = f9183i ? f9182h.f0() : f9182h.q0();
            m.F0(activityF0).a(str, fk.c.c().j(), fk.c.c().k(), str2, activityF0);
            return false;
        }
        if (!s.i()) {
            return false;
        }
        ij.b.a(f9183i ? f9182h.f0() : f9182h.q0());
        fk.c.c().j();
        fk.c.c().k();
        throw null;
    }

    @Keep
    public static void invokeStoreV2(String str, long j10, String str2) {
        p.h("rbx.purchaseflow", "PaymentsProtocolV2: invokeStoreV2 attempt:" + str + ", " + j10 + ", " + str2);
        if (s.g()) {
            Activity activityF0 = f9183i ? f9182h.f0() : f9182h.q0();
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

    public static void p(CharSequence charSequence, Activity activity) {
        androidx.appcompat.app.a aVarA = new androidx.appcompat.app.a.C0013a(activity).a();
        TextView textView = new TextView(activity);
        String string = activity.getString(q0.W);
        int iIndexOf = charSequence.toString().indexOf(string);
        hk.b.b(textView, charSequence.toString(), new hk.c(activity, null, string, iIndexOf, iIndexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        aVarA.w(textView, 150, 100, 150, 100);
        aVarA.setCanceledOnTouchOutside(true);
        try {
            aVarA.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    @Keep
    public static boolean paymentsProtocolConcludeTransaction(String str, long j10, long j11) {
        p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolConcludeTransaction attempt.");
        if (s.g()) {
            m.F0(f9183i ? f9182h.f0() : f9182h.q0()).g(str, j10, fk.c.c().j());
            return true;
        }
        if (!s.i()) {
            return false;
        }
        ij.b.a(f9183i ? f9182h.f0() : f9182h.q0());
        fk.c.c().j();
        throw null;
    }

    @Keep
    public static void paymentsProtocolHandlePreparePaymentErrorCode(int i10) {
        if (h.a().B2()) {
            if (s.g()) {
                m.F0(f9183i ? f9182h.f0() : f9182h.q0()).m(i10);
            } else if (s.i()) {
                ij.b.a(f9183i ? f9182h.f0() : f9182h.q0());
                throw null;
            }
        }
    }

    @Keep
    public static void paymentsProtocolProcessPaymentCallback(long[] jArr, int i10, String str, String str2) {
        p.h("rbx.purchaseflow", "PaymentsProtocolV2: paymentsProtocolProcessPaymentCallback attempt.");
        if (s.g()) {
            a0.R(f9183i ? f9182h.f0() : f9182h.q0()).q0(jArr, i10, str, str2);
        }
    }

    @Keep
    public static void paymentsProtocolPurchaseFinished(k kVar) {
        p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolPurchaseFinished attempt.");
        Activity activityF0 = f9183i ? f9182h.f0() : f9182h.q0();
        if (activityF0 == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new e(kVar, kVar.c(activityF0), activityF0));
    }

    @Keep
    public static void paymentsProtocolSetProgressBarDisplay(final boolean z10) {
        if (h.a().d5()) {
            p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay attempt.");
            if (z10 || f9185k != null) {
                if (f9185k == null) {
                    p.h("rbx.purchaseflow", "PaymentsProtocol: initializing mPaymentsProtocolActivity");
                    f9185k = f9182h.q0();
                }
                Activity activity = f9185k;
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: ej.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            IAPPurchaseManager.d(z10);
                        }
                    });
                }
            }
        }
    }

    public static ProgressDialog q(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    @Keep
    public static boolean setCheckoutSessionId(String str) {
        if (s.g()) {
            return m.F0(f9183i ? f9182h.f0() : f9182h.q0()).l(str);
        }
        if (!s.i() || !h.a().C5()) {
            return false;
        }
        ij.b.a(f9183i ? f9182h.f0() : f9182h.q0());
        throw null;
    }

    public void A(long j10, String str, String str2) {
        p.h("rbx.purchaseflow", "promptNativePurchaseWithPayload: userId = " + j10 + ", roblox-native-productId = " + str);
        this.f9189a = j10;
        if (s.j()) {
            p.e("rbx.purchaseflow", "Luobu purchasing not enabled");
            s(false, j10, str);
            return;
        }
        Activity activityF0 = this.f9190c ? this.f9191d.f0() : this.f9191d.q0();
        if (s.i()) {
            if (!h.a().C5()) {
                ij.a.a(activityF0);
                throw null;
            }
            x(new c());
            s(false, j10, str);
            return;
        }
        if (h.a().B1()) {
            p.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchaseWithPayload.");
            if (a0.R(activityF0).d(j10, str, str2, activityF0, true, this.f9193f)) {
                return;
            }
            x(new Runnable() { // from class: ej.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15610a.u();
                }
            });
            s(false, j10, str);
            return;
        }
        if (!h.a().g3()) {
            if (m.F0(activityF0).d(j10, str, str2, activityF0, true, this.f9193f)) {
                return;
            }
            x(new d());
            s(false, j10, str);
            return;
        }
        p.h("rbx.purchaseflow", "PaymentsProtocol: promptNativePurchaseWithPayload.");
        nativeSetMetricsPurchaseType(f9188n);
        m mVarF0 = m.F0(activityF0);
        mVarF0.k(false);
        if (h.a().R()) {
            mVarF0.b(this.f9193f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        nativeSetPaymentSessionId("");
        nativeSetUserId(j10);
        mVarF0.f(str, j10, fk.c.c().k(), activityF0, str2);
    }

    public void B(long j10, String str, String str2) {
        p.h("rbx.purchaseflow", "promptNativePurchase: userId = " + j10 + ", productId = " + str);
        this.f9189a = j10;
        this.b = str;
        if (s.j()) {
            Activity activityF0 = this.f9190c ? this.f9191d.f0() : this.f9191d.q0();
            if (activityF0 == null || activityF0.isFinishing()) {
                return;
            }
            y.h().j(activityF0).a(activityF0, str, j10, this.f9193f);
            return;
        }
        if (s.i()) {
            Activity activityF1 = this.f9190c ? this.f9191d.f0() : this.f9191d.q0();
            if (h.a().C5()) {
                nativeSetMetricsPurchaseType(f9187m);
                ij.b.a(activityF1);
                throw null;
            }
            ij.a.a(activityF1);
            Long.toString(j10);
            throw null;
        }
        Activity activityF2 = this.f9190c ? this.f9191d.f0() : this.f9191d.q0();
        if (h.a().B1()) {
            p.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchase.");
            if (a0.R(activityF2).n(Long.toString(j10), str, activityF2, j10, this.f9193f)) {
                return;
            }
            x(new Runnable() { // from class: ej.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15611a.w();
                }
            });
            s(false, j10, str);
            return;
        }
        if (!h.a().g3()) {
            if (m.F0(activityF2).n(Long.toString(j10), str, activityF2, j10, this.f9193f)) {
                return;
            }
            x(new b());
            s(false, j10, str);
            return;
        }
        nativeSetMetricsPurchaseType(f9187m);
        m mVarF0 = m.F0(activityF2);
        mVarF0.j(null);
        mVarF0.k(false);
        if (h.a().R()) {
            mVarF0.b(this.f9193f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        if (h.a().F1()) {
            nativeSetPaymentSessionId(str2);
        } else {
            nativeSetPaymentSessionId("");
        }
        nativeSetProviderCurrencyCode(mVarF0.c(str));
        nativeBeginPaymentsProtocolPurchase(str);
    }

    public void C(long j10, String str, String str2, String str3) {
        p.h("rbx.purchaseflow", "promptNativePurchase: player = " + j10 + ", productId = " + str);
        this.f9189a = j10;
        this.b = str;
        if (s.j()) {
            Activity activityF0 = this.f9190c ? this.f9191d.f0() : this.f9191d.q0();
            if (activityF0 == null || activityF0.isFinishing()) {
                return;
            }
            y.h().j(activityF0).a(activityF0, str, j10, this.f9193f);
            return;
        }
        if (s.i()) {
            Activity activityF1 = this.f9190c ? this.f9191d.f0() : this.f9191d.q0();
            if (!h.a().C5()) {
                ij.a.a(activityF1);
                throw null;
            }
            nativeSetMetricsPurchaseType(f9187m);
            ij.b.a(activityF1);
            throw null;
        }
        Activity activityF2 = this.f9190c ? this.f9191d.f0() : this.f9191d.q0();
        if (h.a().B1()) {
            p.h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchase.");
            if (a0.R(activityF2).n(str2, str, activityF2, j10, this.f9193f)) {
                return;
            }
            x(new Runnable() { // from class: ej.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15612a.v();
                }
            });
            s(false, j10, str);
            return;
        }
        if (!h.a().g3()) {
            if (m.F0(activityF2).n(str2, str, activityF2, j10, this.f9193f)) {
                return;
            }
            x(new a());
            s(false, j10, str);
            return;
        }
        nativeSetMetricsPurchaseType(f9187m);
        m mVarF0 = m.F0(activityF2);
        mVarF0.j(null);
        mVarF0.k(false);
        if (h.a().R()) {
            mVarF0.b(this.f9193f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        if (h.a().F1()) {
            nativeSetPaymentSessionId(str3);
        } else {
            nativeSetPaymentSessionId("");
        }
        nativeSetProviderCurrencyCode(mVarF0.c(str));
        nativeBeginPaymentsProtocolPurchase(str);
    }

    public final void m(String str) {
        if (this.f9190c) {
            this.f9191d.W(str);
        } else {
            this.f9191d.q0().W(str);
        }
    }

    public final void n(int i10) {
        if (this.f9190c) {
            this.f9191d.U(i10);
        } else {
            this.f9191d.q0().U(i10);
        }
    }

    public void o(CharSequence charSequence) {
        Activity activityF0 = this.f9190c ? this.f9191d.f0() : this.f9191d.q0();
        if (activityF0 == null) {
            return;
        }
        p(charSequence, activityF0);
    }

    public String r(int i10) {
        return this.f9190c ? this.f9191d.f0().getString(i10) : this.f9191d.q0().getString(i10);
    }

    public final void s(boolean z10, long j10, String str) {
        t(z10, j10, str, "");
    }

    public final void t(boolean z10, long j10, String str, String str2) {
        p.h("rbx.purchaseflow", "In-App purchase finished: success = " + z10 + ", player=" + j10 + ", productId=" + str + ", checkoutSessionId=" + str2);
        if (this.f9189a == 0) {
            p.h("rbx.purchaseflow", "AppShellFragment.inAppPurchaseFinished: userId == 0.");
            return;
        }
        p.h("rbx.purchaseflow", "Native call. Success=" + z10 + ", player=" + j10 + ", productId=" + str + ", checkoutSessionId" + str2);
        if (h.a().l1()) {
            if (str2 == null) {
                str2 = "";
            }
            NativeGLInterface.nativeInGamePurchaseFinishedV2(z10, j10, str, str2);
        } else {
            NativeGLInterface.nativeInGamePurchaseFinished(z10, j10, str);
        }
        this.b = "";
        this.f9189a = 0L;
    }

    public final /* synthetic */ void u() {
        n(q0.f30962q1);
    }

    public final /* synthetic */ void v() {
        n(q0.f30962q1);
    }

    public final /* synthetic */ void w() {
        n(q0.f30962q1);
    }

    public void x(Runnable runnable) {
        this.f9192e.post(runnable);
    }

    public void y(long j10, String str) {
        B(j10, str, "");
    }

    public void z(long j10, String str, String str2) {
        C(j10, str, str2, "");
    }
}
