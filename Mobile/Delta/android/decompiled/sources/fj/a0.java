package fj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams;
import hj.ValidatePurchaseResponsePayload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import sg.a1;
import wh.r0;

/* JADX INFO: loaded from: classes2.dex */
public class a0 implements ej.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile a0 f16626q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f16627a;
    public final n b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ei.f f16628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ej.j f16629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f16630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f16631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f16632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f16633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hashtable<String, com.android.billingclient.api.e> f16634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Hashtable<String, com.android.billingclient.api.e> f16635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Hashtable<String, v7.k> f16636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Hashtable<String, String> f16637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0 f16638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CurrentPurchaseContext f16639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.roblox.client.purchase.a.f f16641p;

    public class a implements v7.d {
        public a() {
        }

        @Override // v7.d
        public void a(com.android.billingclient.api.d dVar) {
            int iC = dVar.c();
            if (iC == 0) {
                gk.p.h("rbx.purchaseflow", "Google Billing Client for payments protocol is setup");
                a0.this.f16631f = e.READY;
                return;
            }
            if (iC == 3) {
                gk.p.k("rbx.purchaseflow", "Google Billing Client unavailable (Play Store blocked). BillingResult: " + dVar);
                a0.this.b.f("Android-Billing-Unavailable-Store-Blocked");
            } else {
                gk.p.e("rbx.purchaseflow", "Google Billing Client for payments protocol is not setup");
            }
            a0.this.f16631f = e.NONE;
        }

        @Override // v7.d
        public void b() {
            gk.p.h("rbx.purchaseflow", "Google Billing Client for payments protocol disconnected");
            a0.this.f16631f = e.NONE;
        }
    }

    public class b implements v7.m {
        public b() {
        }

        @Override // v7.m
        public void a(@NonNull com.android.billingclient.api.d dVar, List<v7.k> list) {
            if (a0.this.f16627a == null) {
                return;
            }
            int iC = dVar.c();
            if (iC == 0) {
                a0.this.V(list);
                return;
            }
            if (iC == 1) {
                a0 a0Var = a0.this;
                a0Var.p0(a0Var.f16639n.getProductId(), fj.e.b.USER_CANCELLED, "User cancelled");
                return;
            }
            if (iC == 3) {
                a0.this.b.f("Android-Billing-Unavailable-Store-Blocked");
                a0 a0Var2 = a0.this;
                a0Var2.p0(a0Var2.f16639n.getProductId(), fj.e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated: BILLING_UNAVAILABLE (Play Store blocked)");
            } else if (iC != 7) {
                a0 a0Var3 = a0.this;
                a0Var3.p0(a0Var3.f16639n.getProductId(), fj.e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
            } else {
                gk.p.k("rbx.purchaseflow", "onPurchasesUpdated: ITEM_ALREADY_OWNED.");
                a0.this.T();
            }
        }
    }

    public class c implements com.roblox.client.purchase.a.f {
        public c() {
        }

        @Override // com.roblox.client.purchase.a.f
        public void a(com.roblox.client.purchase.a.e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
            a0.this.b.a(a0.this.f16639n.j(), "ValidationCheck: " + eVar + ".");
            switch (d.f16645a[eVar.ordinal()]) {
                case 1:
                    if (validatePurchaseResponsePayload != null) {
                        a0 a0Var = a0.this;
                        a0Var.f16639n = a0Var.f16639n.a(a0.this.f16639n.getProductId(), a0.this.f16639n.getUserId(), a0.this.f16639n.getIsInAppPurchase(), a0.this.f16639n.getIsSubscriptionPurchase(), validatePurchaseResponsePayload.getCheckoutSessionId());
                        IAPPurchaseManager.nativeInvokeStore(str, validatePurchaseResponsePayload.getUserId().longValue(), validatePurchaseResponsePayload.getCheckoutSessionId());
                    } else {
                        a0.this.b.r(a0.this.f16639n.getIsInAppPurchase());
                        a0.this.p0(str, fj.e.b.VALIDATION_ERROR, "validatePurchaseResponsePayload is null");
                    }
                    break;
                case 2:
                    a0.this.b.r(a0.this.f16639n.getIsInAppPurchase());
                    a0.this.p0(str, fj.e.b.VALIDATION_ERROR, "PrePurchaseValidation error");
                    break;
                case 3:
                    a0.this.b.u(a0.this.f16639n.getIsInAppPurchase());
                    a0.this.p0(str, fj.e.b.VALIDATION_RETRY, "PrePurchaseValidation retry");
                    break;
                case 4:
                    a0.this.b.s(a0.this.f16639n.getIsInAppPurchase());
                    a0.this.p0(str, fj.e.b.VALIDATION_LIMIT, "PrePurchaseValidation limit");
                    break;
                case 5:
                    a0.this.b.s(a0.this.f16639n.getIsInAppPurchase());
                    a0.this.p0(str, fj.e.b.VALIDATION_LIMIT_UNDER_13, "PrePurchaseValidation limit");
                    break;
                case 6:
                    a0.this.b.q(a0.this.f16639n.getIsInAppPurchase());
                    a0.this.p0(str, fj.e.b.REQUEST_BALANCE_ERROR, "PrePurchaseValidation requestBalance failed.");
                    break;
                default:
                    a0.this.b.v(a0.this.f16639n.getIsInAppPurchase());
                    a0.this.p0(str, fj.e.b.UNKNOWN, "PrePurchaseValidation Unknown error.");
                    break;
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16645a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f16646c;

        static {
            int[] iArr = new int[ej.m.b.values().length];
            f16646c = iArr;
            try {
                iArr[ej.m.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16646c[ej.m.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16646c[ej.m.b.EMPTY_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[fj.e.b.values().length];
            b = iArr2;
            try {
                iArr2[fj.e.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[fj.e.b.USER_CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[fj.e.b.ALREADY_ACKNOWLEDGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.roblox.client.purchase.a.e.values().length];
            f16645a = iArr3;
            try {
                iArr3[com.roblox.client.purchase.a.e.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16645a[com.roblox.client.purchase.a.e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16645a[com.roblox.client.purchase.a.e.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16645a[com.roblox.client.purchase.a.e.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16645a[com.roblox.client.purchase.a.e.LIMIT_UNDER_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16645a[com.roblox.client.purchase.a.e.ERROR_CHECKING_BALANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum e {
        NONE,
        CONNECTING,
        READY
    }

    public a0(Context context) {
        e eVar = e.NONE;
        this.f16631f = eVar;
        this.f16632g = eVar;
        this.f16633h = eVar;
        this.f16634i = new Hashtable<>();
        this.f16635j = new Hashtable<>();
        this.f16636k = new Hashtable<>();
        this.f16637l = new Hashtable<>();
        this.f16639n = CurrentPurchaseContext.f16621g;
        this.f16640o = false;
        this.f16641p = new c();
        this.f16638m = new f0();
        this.f16627a = new fj.b();
        this.b = new n();
        this.f16628c = new ei.h();
        w0(com.android.billingclient.api.a.f(context).c(N()).b(v7.i.c().b().c().a()).a());
        this.f16630e = new b0(context);
    }

    private void H(final v7.k kVar, final PurchaseVerificationResponse purchaseVerificationResponse) {
        String strJ = fj.b.j(kVar);
        if (strJ == null) {
            gk.p.e("rbx.purchaseflow", "Failed to acknowledge purchase. Product ID is null. Purchase: " + kVar);
            this.b.d(this.f16639n.getIsInAppPurchase());
            return;
        }
        final boolean zM = e0.m(strJ);
        if (!kVar.i() || zM) {
            gk.p.h("rbx.purchaseflow", "Acknowledging Purchase");
            I(kVar, new v7.c() { // from class: fj.t
                @Override // v7.c
                public final void a(com.android.billingclient.api.d dVar) {
                    this.f16771a.b0(kVar, zM, purchaseVerificationResponse, dVar);
                }
            });
        } else {
            gk.p.h("rbx.purchaseflow", "Attempted to acknowledge an acknowledged purchase.");
            J(kVar, fj.e.b.ALREADY_ACKNOWLEDGED, n0.b(purchaseVerificationResponse));
        }
    }

    private void I(v7.k kVar, v7.c cVar) {
        gk.p.h("rbx.purchaseflow", "Start acknowledging Purchase");
        this.f16627a.d(v7.b.b().b(kVar.g()).a(), cVar);
    }

    private void J(v7.k kVar, fj.e.b bVar, RobloxPurchaseInfo robloxPurchaseInfo) {
        gk.p.h("rbx.purchaseflow", "Acknowledged Purchase");
        if (e0.o(kVar)) {
            this.f16636k.remove(j0.e(kVar));
            o0(fj.b.j(kVar), bVar);
            return;
        }
        String strJ = fj.b.j(kVar);
        if (strJ == null) {
            gk.p.e("rbx.purchaseflow", "Failed to complete acknowledge purchase. Product ID is null. Purchase: " + kVar);
            this.b.c(this.f16639n.getIsInAppPurchase());
            return;
        }
        String strE = j0.e(kVar);
        boolean zM = e0.m(strJ);
        boolean zC = this.f16630e.c(strE);
        if (zM) {
            if (zC) {
                this.b.f("Play-Points-Not-Show-Confirmation-Screen");
            } else {
                this.b.f("Play-Points-Show-Confirmation-Screen");
                com.android.billingclient.api.e eVarS = S(strJ, false);
                if (eVarS == null) {
                    gk.p.e("rbx.purchaseflow", "Failed to complete acknowledge purchase for a play point product. ProductDetails is null. Purchase: " + kVar);
                    return;
                }
                NativeGLInterface.nativeOOAPPurchaseFinished(OOAPPurchaseFinishedParams.builder().setProductId(strJ).setNativeProductId(strJ).setRobuxAmount(0).setDescription(eVarS.a()).setDisplayPrice(j0.c(eVarS)).setPrice(j0.f(eVarS)).setCurrencyCode(j0.b(eVarS)).setRobloxPurchaseInfo(n0.a(robloxPurchaseInfo)).build());
                this.f16630e.a(strE);
            }
        }
        M(kVar);
    }

    private void M(final v7.k kVar) {
        final String strJ = fj.b.j(kVar);
        if (strJ == null) {
            gk.p.e("rbx.purchaseflow", "Failed to consume purchase. Product ID is null. Purchase: " + kVar);
            return;
        }
        if (th.h.a().n0() || !e0.l(strJ)) {
            gk.p.h("rbx.purchaseflow", "Consuming Purchase");
            this.f16627a.c(v7.e.b().b(kVar.g()).a(), new v7.f() { // from class: fj.w
                @Override // v7.f
                public final void a(com.android.billingclient.api.d dVar, String str) {
                    this.f16776a.c0(strJ, kVar, dVar, str);
                }
            });
        } else if (e0.m(strJ)) {
            this.b.f("Play-Points-Not-Consume-Purchase");
        }
    }

    public static a0 R(Context context) {
        if (f16626q == null) {
            synchronized (a0.class) {
                try {
                    if (f16626q == null) {
                        f16626q = new a0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f16626q;
    }

    private com.android.billingclient.api.e S(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        return z10 ? this.f16635j.get(str) : this.f16634i.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        gk.p.h("rbx.purchaseflow", "Do Google Purchase GrantPending");
        if (a0()) {
            return;
        }
        v7.o oVarA = v7.o.b().b("inapp").a();
        v7.o oVarA2 = v7.o.b().b("subs").a();
        this.f16627a.g(oVarA, new v7.l() { // from class: fj.o
            @Override // v7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f16766a.e0(dVar, list);
            }
        });
        this.f16627a.g(oVarA2, new v7.l() { // from class: fj.r
            @Override // v7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f16769a.f0(dVar, list);
            }
        });
    }

    private void U(v7.k kVar, int i10) {
        gk.p.h("rbx.purchaseflow", "Acknowledge error, response code: " + i10 + ", skipping client side acknowledge purchase.");
        this.b.f("Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore");
        this.f16636k.remove(j0.e(kVar));
        String strJ = fj.b.j(kVar);
        if (!e0.o(kVar)) {
            com.android.billingclient.api.e eVarS = S(strJ, false);
            if (eVarS == null || !j0.i(eVarS, false)) {
                gk.p.h("rbx.purchaseflow", "Invalid product details for productId " + strJ + ". ProductDetails: " + j0.j(eVarS, false));
            } else {
                this.b.b(strJ, e0.g(eVarS, false), e0.i(eVarS, false), e0.h(eVarS, false));
            }
        }
        o0(strJ, fj.e.b.SUCCESS);
    }

    private void o0(String str, fj.e.b bVar) {
        int i10 = d.b[bVar.ordinal()];
        if (i10 == 1) {
            this.b.z(this.f16639n.getIsInAppPurchase());
        } else if (i10 == 2) {
            this.b.x(this.f16639n.getIsInAppPurchase());
        } else if (i10 != 3) {
            this.b.y(this.f16639n.getIsInAppPurchase());
        } else {
            this.b.w(this.f16639n.getIsInAppPurchase());
        }
        if (this.f16629d != null && e0.p(str, this.f16639n.getProductId())) {
            ej.j jVar = this.f16629d;
            if (jVar instanceof r0) {
                r0 r0Var = (r0) jVar;
                CurrentPurchaseContext currentPurchaseContext = this.f16639n;
                if (currentPurchaseContext != CurrentPurchaseContext.f16621g) {
                    String checkoutSessionId = currentPurchaseContext.getCheckoutSessionId() != null ? this.f16639n.getCheckoutSessionId() : "";
                    if (this.f16637l.containsKey(str)) {
                        r0Var.a(bVar == fj.e.b.SUCCESS, this.f16639n.getUserId(), this.f16637l.get(str), checkoutSessionId);
                    } else {
                        r0Var.a(bVar == fj.e.b.SUCCESS, this.f16639n.getUserId(), this.f16639n.getProductId(), checkoutSessionId);
                    }
                } else {
                    gk.p.k("rbx.purchaseflow", "CurrentPurchaseContext is empty. Unable to notify purchase finished with userId and productId.");
                    this.b.j(this.f16639n.getIsInAppPurchase());
                }
            } else {
                jVar.e(new fj.e(bVar, this.f16639n.getProductId(), this.f16639n.getCheckoutSessionId()));
            }
        }
        if (e0.p(str, this.f16639n.getProductId())) {
            u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(String str, fj.e.b bVar, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        this.b.a(this.f16639n.j(), str2);
        o0(str, bVar);
    }

    private void u0() {
        this.f16629d = null;
        this.f16639n = CurrentPurchaseContext.f16621g;
    }

    public void K(long j10, boolean z10) {
        CurrentPurchaseContext currentPurchaseContext = this.f16639n;
        this.f16639n = currentPurchaseContext.a(currentPurchaseContext.getProductId(), j10, this.f16639n.getIsInAppPurchase(), this.f16639n.getIsSubscriptionPurchase(), this.f16639n.getCheckoutSessionId());
        L(z10);
    }

    public void L(boolean z10) {
        CurrentPurchaseContext currentPurchaseContext = this.f16639n;
        this.f16639n = currentPurchaseContext.a(currentPurchaseContext.getProductId(), this.f16639n.getUserId(), this.f16639n.getIsInAppPurchase(), this.f16639n.getIsSubscriptionPurchase(), this.f16639n.getCheckoutSessionId());
        gk.p.h("rbx.purchaseflow", "attemptGrantPendingPurchases userId: " + this.f16639n.getUserId() + ", isAppResume:" + z10);
        if (!Z()) {
            gk.p.h("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchasing is not setup");
            return;
        }
        if (Y()) {
            gk.p.h("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchase already pending");
            return;
        }
        if (z10) {
            T();
            return;
        }
        if (!X()) {
            if (this.f16640o) {
                return;
            }
            T();
            this.f16640o = true;
            return;
        }
        gk.p.h("rbx.purchaseflow", "Found cached pending purchase. Count = " + this.f16636k.size());
        T();
    }

    public final v7.m N() {
        return new b();
    }

    public final ej.m.c O(final v7.k kVar) {
        return new ej.m.c() { // from class: fj.s
            @Override // ej.m.c
            public final void a(ej.m.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
                this.f16770a.d0(kVar, bVar, purchaseVerificationResponse);
            }
        };
    }

    public final void P(String str, String str2) {
        ej.j jVar = this.f16629d;
        if (jVar != null) {
            jVar.c();
        }
        com.roblox.client.purchase.a aVar = new com.roblox.client.purchase.a(this.f16628c);
        if (str2 == null || str2.isEmpty()) {
            str2 = null;
        }
        String str3 = str2;
        gk.p.h("rbx.purchaseflow", "doPrePurchaseValidation sending paymentSessionId: " + str3);
        if (this.f16639n.getIsInAppPurchase()) {
            aVar.d(a1.b1(), this.f16639n.getProductId(), str, str3, this.f16639n.getIsInAppPurchase(), this.f16641p);
        } else {
            aVar.b(a1.b1(), this.f16639n.getProductId(), str, str3, this.f16639n.getIsInAppPurchase(), this.f16641p);
        }
    }

    public void Q(Activity activity, ValidatePurchaseResponsePayload validatePurchaseResponsePayload, String str, List<String> list) {
        String strD;
        ej.j jVar = this.f16629d;
        if (jVar != null) {
            jVar.d();
        }
        this.b.a(this.f16639n.j(), "PurchaseStarted.");
        String productId = this.f16639n.getProductId();
        boolean isSubscriptionPurchase = this.f16639n.getIsSubscriptionPurchase();
        com.android.billingclient.api.e eVarS = S(productId, isSubscriptionPurchase);
        if (eVarS == null || !j0.i(eVarS, isSubscriptionPurchase)) {
            p0(productId, fj.e.b.FAILED_PRODUCT_NOT_FOUND, j0.j(eVarS, isSubscriptionPurchase));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f16639n.getIsSubscriptionPurchase()) {
            if (th.h.a().O3()) {
                strD = v0(eVarS, list);
                if (strD == null) {
                    p0(productId, fj.e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + productId);
                    return;
                }
            } else {
                strD = j0.d(eVarS);
            }
            arrayList.add(com.android.billingclient.api.c.b.b().c(eVarS).b(strD).a());
        } else {
            arrayList.add(com.android.billingclient.api.c.b.b().c(eVarS).a());
        }
        String strE = this.f16639n.f() ? this.f16639n.e() : "";
        if (validatePurchaseResponsePayload != null && validatePurchaseResponsePayload.e()) {
            strE = validatePurchaseResponsePayload.d();
        }
        com.android.billingclient.api.c.a aVarD = com.android.billingclient.api.c.b().b(strE).d(arrayList);
        if (str != null) {
            aVarD.c(str);
            this.b.f("Android-Purchase-Initiated-With-Charge-Request-Id");
        } else if (validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getCheckoutSessionId() == null) {
            gk.p.k("rbx.purchaseflow", "Both chargeRequestId and checkoutSessionId is null.");
            this.b.f("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
        } else {
            aVarD.c(validatePurchaseResponsePayload.getCheckoutSessionId());
            this.b.f("Android-Purchase-Initiated-With-Checkout-Session-Id");
        }
        com.android.billingclient.api.c cVarA = aVarD.a();
        if (activity.getIntent() == null) {
            activity.setIntent(new Intent());
        }
        if (this.f16627a.h(activity, cVarA).c() != 0) {
            p0(this.f16639n.getProductId(), fj.e.b.FAILED_PURCHASE_RESPONSE, "BillingClient.launchBillingFlow failed");
        }
    }

    public void V(List<v7.k> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final Hashtable hashtable = new Hashtable();
        for (v7.k kVar : list) {
            String strJ = fj.b.j(kVar);
            if (strJ == null) {
                gk.p.e("rbx.purchaseflow", "Failed in handling purchases. Product ID is null. Purchase: " + kVar);
            } else {
                boolean zO = e0.o(kVar);
                if (S(strJ, zO) != null) {
                    W(kVar);
                } else {
                    if (zO) {
                        arrayList2.add(new i0(strJ, "subs"));
                    } else {
                        arrayList.add(new i0(strJ, "inapp"));
                    }
                    hashtable.put(strJ, kVar);
                }
            }
        }
        Consumer<List<com.android.billingclient.api.e>> consumer = new Consumer() { // from class: fj.u
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f16774a.g0(hashtable, (List) obj);
            }
        };
        if (!arrayList.isEmpty()) {
            r0(arrayList, consumer);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        r0(arrayList2, consumer);
    }

    public final void W(v7.k kVar) {
        gk.p.h("rbx.purchaseflow", "Handle single purchase. Product id: " + fj.b.j(kVar) + ". Order id: " + kVar.b() + ". isAcknowledged: " + kVar.i());
        int iF = kVar.f();
        if (iF == 0) {
            this.b.B();
        } else if (iF == 2) {
            this.b.p();
        }
        if (kVar.f() != 1) {
            return;
        }
        this.f16636k.put(j0.e(kVar), kVar);
        String strJ = fj.b.j(kVar);
        if (strJ == null) {
            gk.p.e("rbx.purchaseflow", "Failed in handling single purchase. Product ID is null. Purchase: " + kVar);
            return;
        }
        if (!e0.m(strJ)) {
            v7.a aVarA = kVar.a();
            if (aVarA == null) {
                gk.p.e("rbx.purchaseflow", "Failed in handling single purchase. accountIdentifiers is null. Purchase: " + kVar);
                return;
            }
            String strA = aVarA.a();
            String strB = aVarA.b();
            if ((!this.f16639n.f() || !Objects.equals(this.f16639n.e(), strA)) && (strB == null || strB.isEmpty())) {
                this.b.g();
                if (!this.f16639n.f()) {
                    this.b.h();
                    return;
                } else {
                    if (Objects.equals(this.f16639n.e(), strA)) {
                        return;
                    }
                    this.b.i();
                    return;
                }
            }
        }
        y0(kVar, j0.e(kVar));
    }

    public boolean X() {
        return !this.f16636k.isEmpty();
    }

    public boolean Y() {
        return this.f16639n.getProductId() != null;
    }

    public boolean Z() {
        h0 h0Var = this.f16627a;
        return h0Var != null && this.f16631f == e.READY && h0Var.isReady();
    }

    @Override // ej.g
    @Deprecated
    public boolean a(String str, long j10, String str2, String str3, Activity activity) {
        return false;
    }

    public boolean a0() {
        return (this.f16639n.i() && Z()) ? false : true;
    }

    public final /* synthetic */ void b0(v7.k kVar, boolean z10, PurchaseVerificationResponse purchaseVerificationResponse, com.android.billingclient.api.d dVar) {
        int iC = dVar.c();
        boolean z11 = iC == 0;
        this.b.a(this.f16639n.j(), "OnAcknowledgePurchaseResponse. Success: " + z11 + ". Message: " + dVar + ".");
        boolean z12 = fj.b.i(kVar) != null;
        if (z12) {
            this.b.f("Android-Purchase-Completed-With-Checkout-Session-Id");
        }
        if (z11) {
            if (z10) {
                this.b.f("Play-Points-Ack-Purchase-Succeed");
            }
            J(kVar, fj.e.b.SUCCESS, n0.b(purchaseVerificationResponse));
            return;
        }
        if (z10) {
            this.b.f("Play-Points-Ack-Purchase-Fail");
        }
        gk.p.k("rbx.purchaseflow", "Failed to acknowledge Purchase");
        this.b.d(this.f16639n.getIsInAppPurchase());
        if (z12) {
            U(kVar, iC);
        }
    }

    @Override // ej.g
    @Deprecated
    public String c(String str) {
        return null;
    }

    public final /* synthetic */ void c0(String str, v7.k kVar, com.android.billingclient.api.d dVar, String str2) {
        boolean z10 = dVar.c() == 0;
        this.b.a(this.f16639n.j(), "OnConsumeResponse. Success: " + z10 + ". Message: " + dVar + ".");
        if (z10) {
            if (e0.m(str)) {
                this.b.f("Play-Points-Consume-Purchase-Succeed");
            }
            o0(str, fj.e.b.SUCCESS);
            com.android.billingclient.api.e eVarS = S(str, false);
            if (eVarS == null || !j0.i(eVarS, false)) {
                gk.p.h("rbx.purchaseflow", "Invalid product details for productId " + str + ". ProductDetails: " + j0.j(eVarS, false));
            } else {
                this.b.b(str, e0.g(eVarS, false), e0.i(eVarS, false), e0.h(eVarS, false));
            }
            this.f16636k.remove(j0.e(kVar));
        } else {
            if (e0.m(str)) {
                this.b.f("Play-Points-Consume-Purchase-Fail");
            }
            this.b.e(this.f16639n.getIsInAppPurchase());
            p0(fj.b.j(kVar), fj.e.b.CONSUME_ERROR, "OnAcknowledgePurchaseResponse failure");
        }
        gk.p.h("rbx.purchaseflow", "End consume flow.");
    }

    @Override // ej.g
    public boolean d(long j10, String str, String str2, final Activity activity, boolean z10, ej.j jVar) {
        final fj.c cVar = new fj.c(str2);
        if (!cVar.b()) {
            gk.p.e("rbx.purchaseflow", "Purchase request is invalid. Raw payload: " + str2);
            return false;
        }
        if (cVar.c() && this.f16627a.e("subscriptions").c() != 0) {
            gk.p.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return false;
        }
        if (cVar.f() == null) {
            gk.p.e("rbx.purchaseflow", "The provider product id is null.");
            return false;
        }
        this.f16639n = new CurrentPurchaseContext(cVar.f(), j10, !z10, cVar.c(), null);
        this.f16629d = jVar;
        gk.p.h("rbx.purchaseflow", "Initiated purchase. Params: " + cVar);
        if (a0()) {
            gk.p.e("rbx.purchaseflow", "Purchasing is not enabled. Params: " + cVar);
            return false;
        }
        if (cVar.c()) {
            this.f16637l.put(cVar.f(), str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i0(cVar.f(), cVar.g()));
        r0(arrayList, new Consumer() { // from class: fj.z
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f16783a.m0(cVar, activity, (List) obj);
            }
        });
        return true;
    }

    public final /* synthetic */ void d0(v7.k kVar, ej.m.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
        this.b.a(this.f16639n.j(), "VerifyPurchase. Response=" + bVar + ". ReceiptId=" + kVar.b());
        ej.j jVar = this.f16629d;
        if (jVar != null) {
            jVar.d();
        }
        if (bVar != ej.m.b.OK && !kVar.i()) {
            this.b.A();
        }
        int i10 = d.f16646c[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                this.b.D(this.f16639n.getIsInAppPurchase());
                p0(fj.b.j(kVar), fj.e.b.RECEIPT_VERIFICATION_ERROR, "launchVerifyPurchaseReceipt error");
                return;
            } else if (i10 != 3) {
                this.b.E(this.f16639n.getIsInAppPurchase());
                p0(fj.b.j(kVar), fj.e.b.UNKNOWN, "launchVerifyPurchaseReceipt unknown error");
                return;
            } else {
                this.b.C(this.f16639n.getIsInAppPurchase());
                p0(fj.b.j(kVar), fj.e.b.RECEIPT_EMPTY, "launchVerifyPurchaseReceipt empty response");
                return;
            }
        }
        String strJ = fj.b.j(kVar);
        if (e0.o(kVar)) {
            gk.p.h("rbx.purchaseflow", "Receipt Verification Successful for Subscription");
            if (strJ != null && e0.n(strJ)) {
                fk.c.c().t(fk.c.c().f() + ej.k.e(strJ));
            }
            boolean zO = e0.o(kVar);
            com.android.billingclient.api.e eVarS = S(strJ, zO);
            if (eVarS == null || !j0.i(eVarS, zO)) {
                gk.p.h("rbx.purchaseflow", "Invalid product details for productId " + strJ + ". ProductDetails: " + j0.j(eVarS, zO));
            } else {
                this.b.b(strJ, e0.g(eVarS, zO), e0.i(eVarS, zO), e0.h(eVarS, zO));
            }
        }
        H(kVar, purchaseVerificationResponse);
    }

    @Override // ej.g
    public void e(String str, Uri uri, String str2, @NonNull e4.q qVar, ej.j jVar, Runnable runnable) {
        if (uri == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        gk.p.h("rbx.purchaseflow", "UriObject: " + uri);
        if (h(str2, str, qVar, jVar, Boolean.TRUE.equals(gk.d0.a(uri, "recurring")), gk.d0.c(uri, "paymentSessionId")) || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final /* synthetic */ void e0(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            gk.p.d("Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.b.a(this.f16639n.j(), "QueryInAppPurchases. ItemsCount: " + list.size() + ". Items: " + l0.b(list));
        V(list);
    }

    @Override // ej.g
    @Deprecated
    public boolean f(String str, long j10, String str2, Activity activity, String str3) {
        return false;
    }

    public final /* synthetic */ void f0(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            gk.p.d("Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.b.a(this.f16639n.j(), "QuerySubsPurchases. ItemsCount: " + list.size() + ". Items: " + l0.b(list));
        V(list);
    }

    @Override // ej.g
    @Deprecated
    public boolean g(String str, long j10, long j11) {
        return false;
    }

    public final /* synthetic */ void g0(Map map, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) it.next();
            if (eVar == null) {
                gk.p.e("rbx.purchaseflow", "Null product details in list");
            } else {
                String strD = eVar.d();
                if (map.containsKey(strD)) {
                    W((v7.k) map.get(strD));
                } else {
                    gk.p.e("rbx.purchaseflow", "Cannot find purchase associated with product details. ProductId: " + strD);
                }
            }
        }
    }

    @Override // ej.g
    public boolean h(String str, String str2, Activity activity, ej.j jVar, boolean z10, String str3) {
        gk.p.h("rbx.purchaseflow", "startInAppPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + ", paymentSessionId: " + str3);
        return x0(str2, activity, fk.c.c().j(), jVar, z10, str3, true);
    }

    public final /* synthetic */ void h0(String str, String str2) {
        q0(new long[0], 500, str, str2);
    }

    @Override // ej.g
    public boolean i(String str, String str2, Activity activity, ej.j jVar, boolean z10) {
        return x0(str2, activity, fk.c.c().j(), jVar, z10, null, true);
    }

    public final /* synthetic */ void i0(List list, Consumer consumer, com.android.billingclient.api.d dVar, v7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        if (dVar.c() != 0) {
            gk.p.e("rbx.purchaseflow", "Failed queryProductDetails. Products: " + list + ", BillingResult: " + dVar);
        } else {
            if (listA.isEmpty()) {
                gk.p.h("rbx.purchaseflow", "Returned no ProductDetails for Products: " + list);
                return;
            }
            for (com.android.billingclient.api.e eVar : listA) {
                if (eVar.e().equals("subs")) {
                    this.f16635j.put(eVar.d(), eVar);
                } else {
                    this.f16634i.put(eVar.d(), eVar);
                }
            }
            gk.p.h("rbx.purchaseflow", "queryProductDetails Success. Products: " + list);
        }
        consumer.accept(listA);
    }

    @Override // ej.g
    @Deprecated
    public boolean j(String str) {
        return false;
    }

    public final /* synthetic */ void j0(Runnable runnable, com.android.billingclient.api.d dVar, v7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        if (dVar.c() == 0) {
            gk.p.h("rbx.purchaseflow", "Returned INAPP ProductDetails. Count = " + listA.size());
            for (com.android.billingclient.api.e eVar : listA) {
                this.f16634i.put(eVar.d(), eVar);
            }
            gk.p.h("rbx.purchaseflow", "queryInAppProduct Success. Count = " + this.f16634i.size());
            this.f16632g = e.READY;
        } else {
            gk.p.h("rbx.purchaseflow", "Failed queryInAppProduct. BillingResult: " + dVar);
            this.f16632g = e.NONE;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ej.g
    @Deprecated
    public void k(boolean z10) {
    }

    public final /* synthetic */ void k0(Runnable runnable, com.android.billingclient.api.d dVar, v7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        if (dVar.c() == 0) {
            gk.p.h("rbx.purchaseflow", "Returned SUBS ProductDetails. Count = " + listA.size());
            for (com.android.billingclient.api.e eVar : listA) {
                this.f16635j.put(eVar.d(), eVar);
            }
            gk.p.h("rbx.purchaseflow", "querySubsProduct Success. Count = " + this.f16635j.size());
            this.f16633h = e.READY;
        } else {
            gk.p.e("rbx.purchaseflow", "Failed querySubsProduct. BillingResult: " + dVar);
            this.f16633h = e.NONE;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ej.g
    @Deprecated
    public boolean l(String str) {
        return false;
    }

    public final /* synthetic */ void l0(String str, boolean z10, String str2) {
        com.android.billingclient.api.e eVarS = S(str, z10);
        if (eVarS == null || !j0.i(eVarS, z10)) {
            p0(str, fj.e.b.FAILED_PRODUCT_NOT_FOUND, j0.j(eVarS, z10));
        } else {
            P(e0.i(eVarS, this.f16639n.getIsSubscriptionPurchase()), str2);
        }
    }

    @Override // ej.g
    @Deprecated
    public void m(int i10) {
    }

    public final /* synthetic */ void m0(fj.c cVar, Activity activity, List list) {
        if (list == null || list.isEmpty()) {
            p0(cVar.f(), fj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            return;
        }
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) list.get(0);
        String strF = cVar.f();
        boolean zC = cVar.c();
        if (eVar == null || !j0.i(eVar, zC)) {
            p0(strF, fj.e.b.FAILED_PRODUCT_NOT_FOUND, j0.j(eVar, zC));
        } else {
            Q(activity, null, cVar.a(), cVar.d());
        }
    }

    @Override // ej.g
    public boolean n(String str, String str2, Activity activity, long j10, ej.j jVar) {
        return x0(str2, activity, j10, jVar, false, null, false);
    }

    public final void n0(v7.k kVar) {
        String strJ = fj.b.j(kVar);
        String strB = kVar.b();
        if (this.f16629d != null && e0.p(strJ, this.f16639n.getProductId())) {
            gk.p.h("rbx.purchaseflow", "launchVerifyPurchaseReceipt onPurchaseVerificationStart");
            this.f16629d.b();
        }
        if (strJ == null || strB == null) {
            gk.p.e("rbx.purchaseflow", "launchVerifyPurchaseReceipt failed. Invalid parameters: " + strB + ", " + strJ);
            return;
        }
        gk.p.h("rbx.purchaseflow", "Start launchVerifyPurchaseReceipt: " + strB + ", " + strJ);
        this.f16638m.a(kVar, strB, strJ, this.f16639n.getIsInAppPurchase(), new f0.b() { // from class: fj.v
            @Override // fj.f0.b
            public final void a(String str, String str2) {
                this.f16775a.h0(str, str2);
            }
        });
    }

    public void q0(long[] jArr, int i10, String str, String str2) {
        ej.m.b bVar;
        gk.p.h("rbx.purchaseflow", "Verify Purchase callback. response code " + i10 + " grantedAssetIds = " + Arrays.toString(jArr) + ".");
        if (i10 == 200) {
            gk.p.h("rbx.purchaseflow", "Verification success");
            bVar = ej.m.b.OK;
            this.b.k();
        } else if (i10 == 500) {
            gk.p.e("rbx.purchaseflow", "Server error");
            bVar = ej.m.b.ERROR;
            this.b.n();
        } else if (i10 == 400) {
            gk.p.e("rbx.purchaseflow", "Service was unable to validate receiptId.");
            bVar = ej.m.b.ERROR;
            this.b.l();
        } else if (i10 != 401) {
            gk.p.e("rbx.purchaseflow", "Unknown");
            bVar = ej.m.b.UNKNOWN;
            this.b.o();
        } else {
            gk.p.e("rbx.purchaseflow", "Unauthorized to make request.");
            bVar = ej.m.b.BOGUS;
            this.b.m();
        }
        PurchaseVerificationResponse purchaseVerificationResponse = new PurchaseVerificationResponse(hj.a.b(jArr));
        if (str == null) {
            str = str2;
        }
        v7.k kVar = this.f16636k.get(str);
        if (kVar == null) {
            gk.p.e("rbx.purchaseflow", "Verify Purchase callback. purchaseKey: " + str + "not found.");
            this.b.A();
            return;
        }
        gk.p.h("rbx.purchaseflow", "Verify Purchase callback. purchaseKey: " + str + ", purchase: " + kVar.b());
        O(kVar).a(bVar, purchaseVerificationResponse);
    }

    public final void r0(final List<i0> list, final Consumer<List<com.android.billingclient.api.e>> consumer) {
        if (this.f16627a.e("fff").c() != 0) {
            gk.p.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.b.t(this.f16639n.getIsInAppPurchase());
            consumer.accept(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (i0 i0Var : list) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(i0Var.getProviderProductId()).c(i0Var.getProductType()).a());
        }
        this.f16627a.a(com.android.billingclient.api.f.a().b(arrayList).a(), new v7.j() { // from class: fj.x
            @Override // v7.j
            public final void a(com.android.billingclient.api.d dVar, v7.n nVar) {
                this.f16778a.i0(list, consumer, dVar, nVar);
            }
        });
    }

    public final void s0(final Runnable runnable) {
        gk.p.h("rbx.purchaseflow", "Attempt queryInAppProduct");
        if (this.f16627a.e("fff").c() != 0) {
            gk.p.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.b.t(this.f16639n.getIsInAppPurchase());
            return;
        }
        e eVar = this.f16632g;
        if (eVar == e.READY) {
            gk.p.h("rbx.purchaseflow", "queryInAppProduct is setup already");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (eVar != e.NONE) {
            gk.p.h("rbx.purchaseflow", "queryInAppProduct is pending");
            return;
        }
        List<String> listE = e0.e();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(it.next()).c("inapp").a());
        }
        com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f16632g = e.CONNECTING;
        gk.p.h("rbx.purchaseflow", "Querying INAPP ProductDetails. Count = " + arrayList.size());
        this.f16627a.a(fVarA, new v7.j() { // from class: fj.q
            @Override // v7.j
            public final void a(com.android.billingclient.api.d dVar, v7.n nVar) {
                this.f16768a.j0(runnable, dVar, nVar);
            }
        });
    }

    public final void t0(final Runnable runnable) {
        gk.p.h("rbx.purchaseflow", "Attempt querySubsProduct");
        if (this.f16627a.e("subscriptions").c() != 0) {
            gk.p.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return;
        }
        if (this.f16627a.e("fff").c() != 0) {
            gk.p.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.b.t(this.f16639n.getIsInAppPurchase());
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        e eVar = this.f16633h;
        if (eVar == e.READY) {
            gk.p.h("rbx.purchaseflow", "querySubsProduct is setup already");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (eVar != e.NONE) {
            gk.p.h("rbx.purchaseflow", "querySubsProduct is pending");
            return;
        }
        List<String> listF = e0.f();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(it.next()).c("subs").a());
        }
        com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f16633h = e.CONNECTING;
        gk.p.h("rbx.purchaseflow", "Querying SUBS ProductDetails. Count = " + arrayList.size());
        this.f16627a.a(fVarA, new v7.j() { // from class: fj.p
            @Override // v7.j
            public final void a(com.android.billingclient.api.d dVar, v7.n nVar) {
                this.f16767a.k0(runnable, dVar, nVar);
            }
        });
    }

    public final String v0(com.android.billingclient.api.e eVar, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String strH = j0.h(eVar, list);
            if (strH != null) {
                return strH;
            }
            this.b.f("Android-Subscription-Offer-Id-Not-Found");
            if (th.h.a().v0()) {
                return null;
            }
        }
        String strA = j0.a(eVar);
        if (strA != null) {
            return strA;
        }
        this.b.f("Android-Subscription-Offer-No-Base-Plan-Available");
        return null;
    }

    public void w0(com.android.billingclient.api.a aVar) {
        e eVar = this.f16631f;
        if (eVar == e.READY) {
            gk.p.h("rbx.purchaseflow", "Google Billing Client for payments protocol is already setup");
            return;
        }
        e eVar2 = e.CONNECTING;
        if (eVar == eVar2) {
            gk.p.h("rbx.purchaseflow", "Google Billing Client for payments protocol is already connecting");
            return;
        }
        this.f16627a.f(aVar);
        this.f16631f = eVar2;
        gk.p.h("rbx.purchaseflow", "Connecting Google Billing's Client for payments protocol");
        this.f16627a.b(new a());
    }

    public final boolean x0(final String str, Activity activity, long j10, ej.j jVar, final boolean z10, final String str2, boolean z11) {
        gk.p.h("rbx.purchaseflow", "startPurchase productId: " + str + ", isSubscriptionPurchase: " + z10 + ", isInApp: " + z11 + ", userId: " + j10);
        if (str == null) {
            gk.p.e("rbx.purchaseflow", "Purchase product id is null.");
            return false;
        }
        this.f16639n = new CurrentPurchaseContext(str, j10, z11, e0.n(str), null);
        this.f16629d = jVar;
        if (a0()) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: fj.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f16780a.l0(str, z10, str2);
            }
        };
        if (this.f16639n.getIsSubscriptionPurchase()) {
            t0(runnable);
            return true;
        }
        s0(runnable);
        return true;
    }

    public final void y0(v7.k kVar, String str) {
        String strJ = fj.b.j(kVar);
        if (strJ == null) {
            gk.p.e("rbx.purchaseflow", "Failed to verify purchase. Product ID is null. Purchase: " + kVar);
            return;
        }
        boolean zM = e0.m(strJ);
        b0 b0Var = this.f16630e;
        boolean z10 = b0Var != null && b0Var.c(str);
        if (!kVar.i() || (zM && !z10)) {
            n0(kVar);
        } else {
            J(kVar, fj.e.b.ALREADY_ACKNOWLEDGED, new RobloxPurchaseInfo());
        }
    }
}
