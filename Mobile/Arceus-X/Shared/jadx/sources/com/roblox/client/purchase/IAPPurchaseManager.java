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
import androidx.appcompat.app.DialogInterfaceC0408a;
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.AbstractActivityC3160b;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.PreparePaymentParams;
import com.roblox.engine.jni.autovalue.ProcessPaymentParams;
import fj.C5613a0;
import fj.C5636m;
import fk.C5654c;
import hk.C6413b;
import hk.C6414c;
import java.util.HashMap;
import p105ej.AbstractC5153k;
import p105ej.InterfaceC5143a;
import p151gk.C6124q;
import p151gk.C6127t;
import p174hj.ValidatePurchaseResponsePayload;
import p198ij.C6813a;
import p198ij.C6814b;
import p517wh.InterfaceC12458r0;
import sg.C11347q0;
import sg.C11370y;
import th.C11659h;
import vi.C12216g;

/* JADX INFO: loaded from: classes2.dex */
public class IAPPurchaseManager {

    /* JADX INFO: renamed from: h */
    public static InterfaceC5143a f11971h = null;

    /* JADX INFO: renamed from: i */
    public static boolean f11972i = false;

    /* JADX INFO: renamed from: j */
    public static ProgressDialog f11973j = null;

    /* JADX INFO: renamed from: k */
    public static Activity f11974k = null;

    /* JADX INFO: renamed from: l */
    public static String f11975l = "buyRobuxPage";

    /* JADX INFO: renamed from: m */
    public static String f11976m = "buyUpsell";

    /* JADX INFO: renamed from: n */
    public static String f11977n = "buyDevSub";

    /* JADX INFO: renamed from: c */
    public final boolean f11980c;

    /* JADX INFO: renamed from: d */
    public InterfaceC5143a f11981d;

    /* JADX INFO: renamed from: e */
    public Handler f11982e;

    /* JADX INFO: renamed from: a */
    public long f11978a = 0;

    /* JADX INFO: renamed from: b */
    public String f11979b = "";

    /* JADX INFO: renamed from: f */
    public InterfaceC12458r0 f11983f = new C3218f();

    /* JADX INFO: renamed from: g */
    public InterfaceC12458r0 f11984g = new C3218f();

    /* JADX INFO: renamed from: com.roblox.client.purchase.IAPPurchaseManager$a */
    public class RunnableC3213a implements Runnable {
        public RunnableC3213a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.m15375n(C11347q0.f40003q1);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.purchase.IAPPurchaseManager$b */
    public class RunnableC3214b implements Runnable {
        public RunnableC3214b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.m15375n(C11347q0.f40003q1);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.purchase.IAPPurchaseManager$c */
    public class RunnableC3215c implements Runnable {
        public RunnableC3215c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.m15375n(C11347q0.f40006r1);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.purchase.IAPPurchaseManager$d */
    public class RunnableC3216d implements Runnable {
        public RunnableC3216d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAPPurchaseManager.this.m15375n(C11347q0.f40003q1);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.purchase.IAPPurchaseManager$e */
    public class RunnableC3217e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC5153k f11989a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CharSequence f11990b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Activity f11991c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC3217e(AbstractC5153k abstractC5153k, CharSequence charSequence, Activity activity) {
            this.f11989a = abstractC5153k;
            this.f11990b = charSequence;
            this.f11991c = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11989a.mo23986f()) {
                IAPPurchaseManager.m15369p(this.f11990b, this.f11991c);
                return;
            }
            if (IAPPurchaseManager.f11972i) {
                IAPPurchaseManager.f11971h.mo15185W(this.f11990b.toString());
                return;
            }
            if (!C11659h.m43403a().mo43640h1()) {
                IAPPurchaseManager.f11971h.mo15213q0().m14969W(this.f11990b.toString());
                return;
            }
            AbstractActivityC3160b abstractActivityC3160bMo15213q0 = IAPPurchaseManager.f11971h.mo15213q0();
            if (abstractActivityC3160bMo15213q0 instanceof AbstractActivityC3152a) {
                ((AbstractActivityC3152a) abstractActivityC3160bMo15213q0).m14969W(this.f11990b.toString());
            } else {
                C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolPurchaseFinished stored_mActivityInterface.getRobloxActivity() is null.");
                C12216g.m45228b().m45278q("Payments-Protocol-Purchase-Finished-Null-Activity");
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.purchase.IAPPurchaseManager$f */
    public class C3218f implements InterfaceC12458r0 {

        /* JADX INFO: renamed from: com.roblox.client.purchase.IAPPurchaseManager$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC5153k f11993a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CharSequence f11994b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(AbstractC5153k abstractC5153k, CharSequence charSequence) {
                this.f11993a = abstractC5153k;
                this.f11994b = charSequence;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f11993a.mo23986f()) {
                    IAPPurchaseManager.this.m15376o(this.f11994b);
                } else {
                    IAPPurchaseManager.this.m15374m(this.f11994b.toString());
                }
            }
        }

        public C3218f() {
        }

        @Override // p517wh.InterfaceC12458r0
        /* JADX INFO: renamed from: a */
        public void mo15386a(boolean z10, long j10, String str, String str2) {
            IAPPurchaseManager.this.m15379t(z10, j10, str, str2);
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: b */
        public void mo15032b() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: c */
        public void mo15033c() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: d */
        public void mo15034d() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: e */
        public void mo15035e(AbstractC5153k abstractC5153k) {
            Activity activityMo15198f0 = IAPPurchaseManager.this.f11980c ? IAPPurchaseManager.this.f11981d.mo15198f0() : IAPPurchaseManager.this.f11981d.mo15213q0();
            if (activityMo15198f0 == null) {
                return;
            }
            IAPPurchaseManager.this.m15383x(new a(abstractC5153k, abstractC5153k.mo23985d() ? IAPPurchaseManager.this.m15377r(C11347q0.f40009s1) : abstractC5153k.mo23984c(activityMo15198f0)));
        }
    }

    public IAPPurchaseManager(InterfaceC5143a interfaceC5143a, boolean z10) {
        this.f11981d = interfaceC5143a;
        this.f11980c = z10;
        f11971h = interfaceC5143a;
        f11972i = z10;
        this.f11982e = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: D */
    public static void m15356D(Context context, boolean z10) {
        if (!C6127t.m27091g()) {
            if (C6127t.m27093i()) {
                String strM25679k = C5654c.m25669c().m25679k();
                long jM25678j = C5654c.m25669c().m25678j();
                C6124q.m27063h("rbx.purchaseflow", "tryGrantPendingPurchases: username = " + strM25679k + ", userId = " + jM25678j);
                if (TextUtils.isEmpty(strM25679k)) {
                    return;
                }
                if (C11659h.m43403a().mo43466I5()) {
                    C6814b.m29184a(context);
                    throw null;
                }
                if (jM25678j > 0) {
                    C6813a.m29183a(context);
                    throw null;
                }
                C6813a.m29183a(context);
                throw null;
            }
            return;
        }
        String strM25679k2 = C5654c.m25669c().m25679k();
        long jM25678j2 = C5654c.m25669c().m25678j();
        if (TextUtils.isEmpty(strM25679k2)) {
            return;
        }
        C6124q.m27063h("rbx.purchaseflow", "tryGrantPendingPurchases: username = " + strM25679k2 + ", userId = " + jM25678j2);
        if (C11659h.m43403a().mo43455H1()) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: tryGrantPendingPurchases");
            if (jM25678j2 > 0) {
                C5613a0.m25370R(context).m25389K(jM25678j2, z10);
                return;
            } else {
                C5613a0.m25370R(context).m25390L(z10);
                return;
            }
        }
        if (C11659h.m43403a().mo43677m3() && C11659h.m43403a().mo43708r()) {
            C5636m.m25494F0(context).m25608m1(jM25678j2, strM25679k2, z10);
        } else if (jM25678j2 > 0) {
            C5636m.m25494F0(context).m25553A0(jM25678j2, strM25679k2, z10);
        } else {
            C5636m.m25494F0(context).m25555B0(strM25679k2, z10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m15360d(boolean z10) {
        Activity activity = f11974k;
        if (activity == null || activity.isFinishing() || f11974k.isDestroyed()) {
            return;
        }
        if (f11973j == null) {
            Activity activity2 = f11974k;
            f11973j = m15370q(activity2, null, activity2.getString(C11347q0.f39931P));
        }
        if (z10) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay show.");
            f11973j.show();
        } else {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay hide.");
            f11973j.dismiss();
        }
    }

    @Keep
    public static String getPlatformPaymentMethod() {
        if (C6127t.m27091g()) {
            return BuildConfig.STORE_TYPE;
        }
        return (C6127t.m27093i() && C11659h.m43403a().mo43466I5()) ? "MilkyWayStore" : "";
    }

    @Keep
    public static String getPlatformPaymentProviderType() {
        if (C6127t.m27091g()) {
            return BuildConfig.STORE_TYPE;
        }
        return (C6127t.m27093i() && C11659h.m43403a().mo43466I5()) ? "MilkyWayStore" : "";
    }

    @Keep
    public static boolean invokeStore(String str, String str2) {
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: invokeStore attempt.");
        if (C6127t.m27091g()) {
            Activity activityMo15198f0 = f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0();
            C5636m.m25494F0(activityMo15198f0).mo23966a(str, C5654c.m25669c().m25678j(), C5654c.m25669c().m25679k(), str2, activityMo15198f0);
            return false;
        }
        if (!C6127t.m27093i()) {
            return false;
        }
        C6814b.m29184a(f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0());
        C5654c.m25669c().m25678j();
        C5654c.m25669c().m25679k();
        throw null;
    }

    @Keep
    public static void invokeStoreV2(String str, long j10, String str2) {
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocolV2: invokeStoreV2 attempt:" + str + ", " + j10 + ", " + str2);
        if (C6127t.m27091g()) {
            Activity activityMo15198f0 = f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0();
            C5613a0.m25370R(activityMo15198f0).m25394Q(activityMo15198f0, new ValidatePurchaseResponsePayload(Long.valueOf(j10), str2, null), null, null);
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

    /* JADX INFO: renamed from: p */
    public static void m15369p(CharSequence charSequence, Activity activity) {
        DialogInterfaceC0408a dialogInterfaceC0408aM1517a = new DialogInterfaceC0408a.a(activity).m1517a();
        TextView textView = new TextView(activity);
        String string = activity.getString(C11347q0.f39945W);
        int iIndexOf = charSequence.toString().indexOf(string);
        C6413b.m28003b(textView, charSequence.toString(), new C6414c(activity, null, string, iIndexOf, iIndexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        dialogInterfaceC0408aM1517a.m1516w(textView, 150, 100, 150, 100);
        dialogInterfaceC0408aM1517a.setCanceledOnTouchOutside(true);
        try {
            dialogInterfaceC0408aM1517a.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    @Keep
    public static boolean paymentsProtocolConcludeTransaction(String str, long j10, long j11) {
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolConcludeTransaction attempt.");
        if (C6127t.m27091g()) {
            C5636m.m25494F0(f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0()).mo23972g(str, j10, C5654c.m25669c().m25678j());
            return true;
        }
        if (!C6127t.m27093i()) {
            return false;
        }
        C6814b.m29184a(f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0());
        C5654c.m25669c().m25678j();
        throw null;
    }

    @Keep
    public static void paymentsProtocolHandlePreparePaymentErrorCode(int i10) {
        if (C11659h.m43403a().mo43456H2()) {
            if (C6127t.m27091g()) {
                C5636m.m25494F0(f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0()).mo23978m(i10);
            } else if (C6127t.m27093i()) {
                C6814b.m29184a(f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0());
                throw null;
            }
        }
    }

    @Keep
    public static void paymentsProtocolProcessPaymentCallback(long[] jArr, int i10, String str, String str2) {
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocolV2: paymentsProtocolProcessPaymentCallback attempt.");
        if (C6127t.m27091g()) {
            C5613a0.m25370R(f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0()).m25414q0(jArr, i10, str, str2);
        }
    }

    @Keep
    public static void paymentsProtocolPurchaseFinished(AbstractC5153k abstractC5153k) {
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolPurchaseFinished attempt.");
        Activity activityMo15198f0 = f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0();
        if (activityMo15198f0 == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC3217e(abstractC5153k, abstractC5153k.mo23984c(activityMo15198f0), activityMo15198f0));
    }

    @Keep
    public static void paymentsProtocolSetProgressBarDisplay(final boolean z10) {
        if (C11659h.m43403a().mo43658j5()) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolSetProgressBarDisplay attempt.");
            if (z10 || f11974k != null) {
                if (f11974k == null) {
                    C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: initializing mPaymentsProtocolActivity");
                    f11974k = f11971h.mo15213q0();
                }
                Activity activity = f11974k;
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: ej.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            IAPPurchaseManager.m15360d(z10);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static ProgressDialog m15370q(Context context, String str, String str2) {
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
        if (C6127t.m27091g()) {
            return C5636m.m25494F0(f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0()).mo23977l(str);
        }
        if (!C6127t.m27093i() || !C11659h.m43403a().mo43466I5()) {
            return false;
        }
        C6814b.m29184a(f11972i ? f11971h.mo15198f0() : f11971h.mo15213q0());
        throw null;
    }

    /* JADX INFO: renamed from: A */
    public void m15371A(long j10, String str, String str2) {
        C6124q.m27063h("rbx.purchaseflow", "promptNativePurchaseWithPayload: userId = " + j10 + ", roblox-native-productId = " + str);
        this.f11978a = j10;
        if (C6127t.m27094j()) {
            C6124q.m27060e("rbx.purchaseflow", "Luobu purchasing not enabled");
            m15378s(false, j10, str);
            return;
        }
        Activity activityMo15198f0 = this.f11980c ? this.f11981d.mo15198f0() : this.f11981d.mo15213q0();
        if (C6127t.m27093i()) {
            if (!C11659h.m43403a().mo43466I5()) {
                C6813a.m29183a(activityMo15198f0);
                throw null;
            }
            m15383x(new RunnableC3215c());
            m15378s(false, j10, str);
            return;
        }
        if (C11659h.m43403a().mo43455H1()) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchaseWithPayload.");
            if (C5613a0.m25370R(activityMo15198f0).mo23969d(j10, str, str2, activityMo15198f0, true, this.f11983f)) {
                return;
            }
            m15383x(new Runnable() { // from class: ej.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20045a.m15380u();
                }
            });
            m15378s(false, j10, str);
            return;
        }
        if (!C11659h.m43403a().mo43677m3()) {
            if (C5636m.m25494F0(activityMo15198f0).mo23969d(j10, str, str2, activityMo15198f0, true, this.f11983f)) {
                return;
            }
            m15383x(new RunnableC3216d());
            m15378s(false, j10, str);
            return;
        }
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: promptNativePurchaseWithPayload.");
        nativeSetMetricsPurchaseType(f11977n);
        C5636m c5636mM25494F0 = C5636m.m25494F0(activityMo15198f0);
        c5636mM25494F0.mo23976k(false);
        if (C11659h.m43403a().mo43542U()) {
            c5636mM25494F0.mo23967b(this.f11983f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        nativeSetPaymentSessionId("");
        nativeSetUserId(j10);
        c5636mM25494F0.mo23971f(str, j10, C5654c.m25669c().m25679k(), activityMo15198f0, str2);
    }

    /* JADX INFO: renamed from: B */
    public void m15372B(long j10, String str, String str2) {
        C6124q.m27063h("rbx.purchaseflow", "promptNativePurchase: userId = " + j10 + ", productId = " + str);
        this.f11978a = j10;
        this.f11979b = str;
        if (C6127t.m27094j()) {
            Activity activityMo15198f0 = this.f11980c ? this.f11981d.mo15198f0() : this.f11981d.mo15213q0();
            if (activityMo15198f0 == null || activityMo15198f0.isFinishing()) {
                return;
            }
            C11370y.m42581h().m42590j(activityMo15198f0).m26998a(activityMo15198f0, str, j10, this.f11983f);
            return;
        }
        if (C6127t.m27093i()) {
            Activity activityMo15198f1 = this.f11980c ? this.f11981d.mo15198f0() : this.f11981d.mo15213q0();
            if (C11659h.m43403a().mo43466I5()) {
                nativeSetMetricsPurchaseType(f11976m);
                C6814b.m29184a(activityMo15198f1);
                throw null;
            }
            C6813a.m29183a(activityMo15198f1);
            Long.toString(j10);
            throw null;
        }
        Activity activityMo15198f2 = this.f11980c ? this.f11981d.mo15198f0() : this.f11981d.mo15213q0();
        if (C11659h.m43403a().mo43455H1()) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchase.");
            if (C5613a0.m25370R(activityMo15198f2).mo23979n(Long.toString(j10), str, activityMo15198f2, j10, this.f11983f)) {
                return;
            }
            m15383x(new Runnable() { // from class: ej.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20046a.m15382w();
                }
            });
            m15378s(false, j10, str);
            return;
        }
        if (!C11659h.m43403a().mo43677m3()) {
            if (C5636m.m25494F0(activityMo15198f2).mo23979n(Long.toString(j10), str, activityMo15198f2, j10, this.f11983f)) {
                return;
            }
            m15383x(new RunnableC3214b());
            m15378s(false, j10, str);
            return;
        }
        nativeSetMetricsPurchaseType(f11976m);
        C5636m c5636mM25494F0 = C5636m.m25494F0(activityMo15198f2);
        c5636mM25494F0.mo23975j(null);
        c5636mM25494F0.mo23976k(false);
        if (C11659h.m43403a().mo43542U()) {
            c5636mM25494F0.mo23967b(this.f11983f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        if (C11659h.m43403a().mo43483L1()) {
            nativeSetPaymentSessionId(str2);
        } else {
            nativeSetPaymentSessionId("");
        }
        nativeSetProviderCurrencyCode(c5636mM25494F0.mo23968c(str));
        nativeBeginPaymentsProtocolPurchase(str);
    }

    /* JADX INFO: renamed from: C */
    public void m15373C(long j10, String str, String str2, String str3) {
        C6124q.m27063h("rbx.purchaseflow", "promptNativePurchase: player = " + j10 + ", productId = " + str);
        this.f11978a = j10;
        this.f11979b = str;
        if (C6127t.m27094j()) {
            Activity activityMo15198f0 = this.f11980c ? this.f11981d.mo15198f0() : this.f11981d.mo15213q0();
            if (activityMo15198f0 == null || activityMo15198f0.isFinishing()) {
                return;
            }
            C11370y.m42581h().m42590j(activityMo15198f0).m26998a(activityMo15198f0, str, j10, this.f11983f);
            return;
        }
        if (C6127t.m27093i()) {
            Activity activityMo15198f1 = this.f11980c ? this.f11981d.mo15198f0() : this.f11981d.mo15213q0();
            if (!C11659h.m43403a().mo43466I5()) {
                C6813a.m29183a(activityMo15198f1);
                throw null;
            }
            nativeSetMetricsPurchaseType(f11976m);
            C6814b.m29184a(activityMo15198f1);
            throw null;
        }
        Activity activityMo15198f2 = this.f11980c ? this.f11981d.mo15198f0() : this.f11981d.mo15213q0();
        if (C11659h.m43403a().mo43455H1()) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocolV2: promptNativePurchase.");
            if (C5613a0.m25370R(activityMo15198f2).mo23979n(str2, str, activityMo15198f2, j10, this.f11983f)) {
                return;
            }
            m15383x(new Runnable() { // from class: ej.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20047a.m15381v();
                }
            });
            m15378s(false, j10, str);
            return;
        }
        if (!C11659h.m43403a().mo43677m3()) {
            if (C5636m.m25494F0(activityMo15198f2).mo23979n(str2, str, activityMo15198f2, j10, this.f11983f)) {
                return;
            }
            m15383x(new RunnableC3213a());
            m15378s(false, j10, str);
            return;
        }
        nativeSetMetricsPurchaseType(f11976m);
        C5636m c5636mM25494F0 = C5636m.m25494F0(activityMo15198f2);
        c5636mM25494F0.mo23975j(null);
        c5636mM25494F0.mo23976k(false);
        if (C11659h.m43403a().mo43542U()) {
            c5636mM25494F0.mo23967b(this.f11983f);
        }
        nativeSetPaymentsProtocolIsInApp(false);
        if (C11659h.m43403a().mo43483L1()) {
            nativeSetPaymentSessionId(str3);
        } else {
            nativeSetPaymentSessionId("");
        }
        nativeSetProviderCurrencyCode(c5636mM25494F0.mo23968c(str));
        nativeBeginPaymentsProtocolPurchase(str);
    }

    /* JADX INFO: renamed from: m */
    public final void m15374m(String str) {
        if (this.f11980c) {
            this.f11981d.mo15185W(str);
        } else {
            this.f11981d.mo15213q0().m14969W(str);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m15375n(int i10) {
        if (this.f11980c) {
            this.f11981d.mo15184U(i10);
        } else {
            this.f11981d.mo15213q0().m14968U(i10);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m15376o(CharSequence charSequence) {
        Activity activityMo15198f0 = this.f11980c ? this.f11981d.mo15198f0() : this.f11981d.mo15213q0();
        if (activityMo15198f0 == null) {
            return;
        }
        m15369p(charSequence, activityMo15198f0);
    }

    /* JADX INFO: renamed from: r */
    public String m15377r(int i10) {
        return this.f11980c ? this.f11981d.mo15198f0().getString(i10) : this.f11981d.mo15213q0().getString(i10);
    }

    /* JADX INFO: renamed from: s */
    public final void m15378s(boolean z10, long j10, String str) {
        m15379t(z10, j10, str, "");
    }

    /* JADX INFO: renamed from: t */
    public final void m15379t(boolean z10, long j10, String str, String str2) {
        C6124q.m27063h("rbx.purchaseflow", "In-App purchase finished: success = " + z10 + ", player=" + j10 + ", productId=" + str + ", checkoutSessionId=" + str2);
        if (this.f11978a == 0) {
            C6124q.m27063h("rbx.purchaseflow", "AppShellFragment.inAppPurchaseFinished: userId == 0.");
            return;
        }
        C6124q.m27063h("rbx.purchaseflow", "Native call. Success=" + z10 + ", player=" + j10 + ", productId=" + str + ", checkoutSessionId" + str2);
        if (C11659h.m43403a().mo43703q1()) {
            if (str2 == null) {
                str2 = "";
            }
            NativeGLInterface.nativeInGamePurchaseFinishedV2(z10, j10, str, str2);
        } else {
            NativeGLInterface.nativeInGamePurchaseFinished(z10, j10, str);
        }
        this.f11979b = "";
        this.f11978a = 0L;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m15380u() {
        m15375n(C11347q0.f40003q1);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m15381v() {
        m15375n(C11347q0.f40003q1);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m15382w() {
        m15375n(C11347q0.f40003q1);
    }

    /* JADX INFO: renamed from: x */
    public void m15383x(Runnable runnable) {
        this.f11982e.post(runnable);
    }

    /* JADX INFO: renamed from: y */
    public void m15384y(long j10, String str) {
        m15372B(j10, str, "");
    }

    /* JADX INFO: renamed from: z */
    public void m15385z(long j10, String str, String str2) {
        m15373C(j10, str, str2, "");
    }
}
