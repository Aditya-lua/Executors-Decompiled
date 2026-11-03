package dj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams;
import fj.ValidatePurchaseResponsePayload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import rg.a1;
import uh.s0;

/* JADX INFO: loaded from: classes2.dex */
public class a0 implements cj.k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile a0 f14822q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f14823a;
    public final n b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ci.f f14824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cj.o f14825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f14826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f14827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f14828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f14829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hashtable<String, com.android.billingclient.api.e> f14830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Hashtable<String, com.android.billingclient.api.e> f14831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Hashtable<String, v7.k> f14832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Hashtable<String, String> f14833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0 f14834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CurrentPurchaseContext f14835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.roblox.client.purchase.a.f f14837p;

    public class a implements v7.d {
        public a() {
        }

        @Override // v7.d
        public void a(com.android.billingclient.api.d dVar) {
            int iC = dVar.c();
            if (iC == 0) {
                ek.q.h("rbx.purchaseflow", "Google Billing Client for payments protocol is setup");
                a0.this.f14827f = e.READY;
                return;
            }
            if (iC == 3) {
                ek.q.k("rbx.purchaseflow", "Google Billing Client unavailable (Play Store blocked). BillingResult: " + dVar);
                a0.this.b.f("Android-Billing-Unavailable-Store-Blocked");
            } else {
                ek.q.e("rbx.purchaseflow", "Google Billing Client for payments protocol is not setup");
            }
            a0.this.f14827f = e.NONE;
        }

        @Override // v7.d
        public void b() {
            ek.q.h("rbx.purchaseflow", "Google Billing Client for payments protocol disconnected");
            a0.this.f14827f = e.NONE;
        }
    }

    public class b implements v7.m {
        public b() {
        }

        @Override // v7.m
        public void a(@NonNull com.android.billingclient.api.d dVar, List<v7.k> list) {
            if (a0.this.f14823a == null) {
                return;
            }
            int iC = dVar.c();
            if (iC == 0) {
                a0.this.V(list);
                return;
            }
            if (iC == 1) {
                a0 a0Var = a0.this;
                a0Var.p0(a0Var.f14835n.getProductId(), dj.e.b.USER_CANCELLED, "User cancelled");
                return;
            }
            if (iC == 3) {
                a0.this.b.f("Android-Billing-Unavailable-Store-Blocked");
                a0 a0Var2 = a0.this;
                a0Var2.p0(a0Var2.f14835n.getProductId(), dj.e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated: BILLING_UNAVAILABLE (Play Store blocked)");
            } else if (iC != 7) {
                a0 a0Var3 = a0.this;
                a0Var3.p0(a0Var3.f14835n.getProductId(), dj.e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
            } else {
                ek.q.k("rbx.purchaseflow", "onPurchasesUpdated: ITEM_ALREADY_OWNED.");
                a0.this.T();
            }
        }
    }

    public class c implements com.roblox.client.purchase.a.f {
        public c() {
        }

        @Override // com.roblox.client.purchase.a.f
        public void a(com.roblox.client.purchase.a.e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
            a0.this.b.a(a0.this.f14835n.j(), "ValidationCheck: " + eVar + ".");
            switch (d.f14841a[eVar.ordinal()]) {
                case 1:
                    if (validatePurchaseResponsePayload != null) {
                        a0 a0Var = a0.this;
                        a0Var.f14835n = a0Var.f14835n.a(a0.this.f14835n.getProductId(), a0.this.f14835n.getUserId(), a0.this.f14835n.getIsInAppPurchase(), a0.this.f14835n.getIsSubscriptionPurchase(), validatePurchaseResponsePayload.getCheckoutSessionId());
                        IAPPurchaseManager.nativeInvokeStore(str, validatePurchaseResponsePayload.getUserId().longValue(), validatePurchaseResponsePayload.getCheckoutSessionId());
                    } else {
                        a0.this.b.r(a0.this.f14835n.getIsInAppPurchase());
                        a0.this.p0(str, dj.e.b.VALIDATION_ERROR, "validatePurchaseResponsePayload is null");
                    }
                    break;
                case 2:
                    a0.this.b.r(a0.this.f14835n.getIsInAppPurchase());
                    a0.this.p0(str, dj.e.b.VALIDATION_ERROR, "PrePurchaseValidation error");
                    break;
                case 3:
                    a0.this.b.u(a0.this.f14835n.getIsInAppPurchase());
                    a0.this.p0(str, dj.e.b.VALIDATION_RETRY, "PrePurchaseValidation retry");
                    break;
                case 4:
                    a0.this.b.s(a0.this.f14835n.getIsInAppPurchase());
                    a0.this.p0(str, dj.e.b.VALIDATION_LIMIT, "PrePurchaseValidation limit");
                    break;
                case 5:
                    a0.this.b.s(a0.this.f14835n.getIsInAppPurchase());
                    a0.this.p0(str, dj.e.b.VALIDATION_LIMIT_UNDER_13, "PrePurchaseValidation limit");
                    break;
                case 6:
                    a0.this.b.q(a0.this.f14835n.getIsInAppPurchase());
                    a0.this.p0(str, dj.e.b.REQUEST_BALANCE_ERROR, "PrePurchaseValidation requestBalance failed.");
                    break;
                default:
                    a0.this.b.v(a0.this.f14835n.getIsInAppPurchase());
                    a0.this.p0(str, dj.e.b.UNKNOWN, "PrePurchaseValidation Unknown error.");
                    break;
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14841a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f14842c;

        static {
            int[] iArr = new int[cj.r.b.values().length];
            f14842c = iArr;
            try {
                iArr[cj.r.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14842c[cj.r.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14842c[cj.r.b.EMPTY_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[dj.e.b.values().length];
            b = iArr2;
            try {
                iArr2[dj.e.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[dj.e.b.USER_CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[dj.e.b.ALREADY_ACKNOWLEDGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.roblox.client.purchase.a.e.values().length];
            f14841a = iArr3;
            try {
                iArr3[com.roblox.client.purchase.a.e.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14841a[com.roblox.client.purchase.a.e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14841a[com.roblox.client.purchase.a.e.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14841a[com.roblox.client.purchase.a.e.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14841a[com.roblox.client.purchase.a.e.LIMIT_UNDER_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14841a[com.roblox.client.purchase.a.e.ERROR_CHECKING_BALANCE.ordinal()] = 6;
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
        this.f14827f = eVar;
        this.f14828g = eVar;
        this.f14829h = eVar;
        this.f14830i = new Hashtable<>();
        this.f14831j = new Hashtable<>();
        this.f14832k = new Hashtable<>();
        this.f14833l = new Hashtable<>();
        this.f14835n = CurrentPurchaseContext.f14817g;
        this.f14836o = false;
        this.f14837p = new c();
        this.f14834m = new f0();
        this.f14823a = new dj.b();
        this.b = new n();
        this.f14824c = new ci.h();
        w0(com.android.billingclient.api.a.f(context).c(N()).b(v7.i.c().b().c().a()).a());
        this.f14826e = new b0(context);
    }

    private void H(final v7.k kVar, final PurchaseVerificationResponse purchaseVerificationResponse) {
        String strJ = dj.b.j(kVar);
        if (strJ == null) {
            ek.q.e("rbx.purchaseflow", "Failed to acknowledge purchase. Product ID is null. Purchase: " + kVar);
            this.b.d(this.f14835n.getIsInAppPurchase());
            return;
        }
        final boolean zM = e0.m(strJ);
        if (!kVar.i() || zM) {
            ek.q.h("rbx.purchaseflow", "Acknowledging Purchase");
            I(kVar, new v7.c() { // from class: dj.t
                @Override // v7.c
                public final void a(com.android.billingclient.api.d dVar) {
                    this.f14967a.b0(kVar, zM, purchaseVerificationResponse, dVar);
                }
            });
        } else {
            ek.q.h("rbx.purchaseflow", "Attempted to acknowledge an acknowledged purchase.");
            J(kVar, dj.e.b.ALREADY_ACKNOWLEDGED, n0.b(purchaseVerificationResponse));
        }
    }

    private void I(v7.k kVar, v7.c cVar) {
        ek.q.h("rbx.purchaseflow", "Start acknowledging Purchase");
        this.f14823a.d(v7.b.b().b(kVar.g()).a(), cVar);
    }

    private void J(v7.k kVar, dj.e.b bVar, RobloxPurchaseInfo robloxPurchaseInfo) {
        ek.q.h("rbx.purchaseflow", "Acknowledged Purchase");
        if (e0.o(kVar)) {
            this.f14832k.remove(j0.e(kVar));
            o0(dj.b.j(kVar), bVar);
            return;
        }
        String strJ = dj.b.j(kVar);
        if (strJ == null) {
            ek.q.e("rbx.purchaseflow", "Failed to complete acknowledge purchase. Product ID is null. Purchase: " + kVar);
            this.b.c(this.f14835n.getIsInAppPurchase());
            return;
        }
        String strE = j0.e(kVar);
        boolean zM = e0.m(strJ);
        boolean zC = this.f14826e.c(strE);
        if (zM) {
            if (zC) {
                this.b.f("Play-Points-Not-Show-Confirmation-Screen");
            } else {
                this.b.f("Play-Points-Show-Confirmation-Screen");
                com.android.billingclient.api.e eVarS = S(strJ, false);
                if (eVarS == null) {
                    ek.q.e("rbx.purchaseflow", "Failed to complete acknowledge purchase for a play point product. ProductDetails is null. Purchase: " + kVar);
                    return;
                }
                NativeGLInterface.nativeOOAPPurchaseFinished(OOAPPurchaseFinishedParams.builder().setProductId(strJ).setNativeProductId(strJ).setRobuxAmount(0).setDescription(eVarS.a()).setDisplayPrice(j0.c(eVarS)).setPrice(j0.f(eVarS)).setCurrencyCode(j0.b(eVarS)).setRobloxPurchaseInfo(n0.a(robloxPurchaseInfo)).build());
                this.f14826e.a(strE);
            }
        }
        M(kVar);
    }

    private void M(final v7.k kVar) {
        final String strJ = dj.b.j(kVar);
        if (strJ == null) {
            ek.q.e("rbx.purchaseflow", "Failed to consume purchase. Product ID is null. Purchase: " + kVar);
            return;
        }
        if (rh.h.a().s0() || !e0.l(strJ)) {
            ek.q.h("rbx.purchaseflow", "Consuming Purchase");
            this.f14823a.c(v7.e.b().b(kVar.g()).a(), new v7.f() { // from class: dj.w
                @Override // v7.f
                public final void a(com.android.billingclient.api.d dVar, String str) {
                    this.f14972a.c0(strJ, kVar, dVar, str);
                }
            });
        } else if (e0.m(strJ)) {
            this.b.f("Play-Points-Not-Consume-Purchase");
        }
    }

    public static a0 R(Context context) {
        if (f14822q == null) {
            synchronized (a0.class) {
                try {
                    if (f14822q == null) {
                        f14822q = new a0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f14822q;
    }

    private com.android.billingclient.api.e S(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        return z10 ? this.f14831j.get(str) : this.f14830i.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        ek.q.h("rbx.purchaseflow", "Do Google Purchase GrantPending");
        if (a0()) {
            return;
        }
        v7.o oVarA = v7.o.b().b("inapp").a();
        v7.o oVarA2 = v7.o.b().b("subs").a();
        this.f14823a.g(oVarA, new v7.l() { // from class: dj.o
            @Override // v7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f14962a.e0(dVar, list);
            }
        });
        this.f14823a.g(oVarA2, new v7.l() { // from class: dj.r
            @Override // v7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f14965a.f0(dVar, list);
            }
        });
    }

    private void U(v7.k kVar, int i10) {
        ek.q.h("rbx.purchaseflow", "Acknowledge error, response code: " + i10 + ", skipping client side acknowledge purchase.");
        this.b.f("Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore");
        this.f14832k.remove(j0.e(kVar));
        String strJ = dj.b.j(kVar);
        if (!e0.o(kVar)) {
            com.android.billingclient.api.e eVarS = S(strJ, false);
            if (eVarS == null || !j0.i(eVarS, false)) {
                ek.q.h("rbx.purchaseflow", "Invalid product details for productId " + strJ + ". ProductDetails: " + j0.j(eVarS, false));
            } else {
                this.b.b(strJ, e0.g(eVarS, false), e0.i(eVarS, false), e0.h(eVarS, false));
            }
        }
        o0(strJ, dj.e.b.SUCCESS);
    }

    private void o0(String str, dj.e.b bVar) {
        int i10 = d.b[bVar.ordinal()];
        if (i10 == 1) {
            this.b.z(this.f14835n.getIsInAppPurchase());
        } else if (i10 == 2) {
            this.b.x(this.f14835n.getIsInAppPurchase());
        } else if (i10 != 3) {
            this.b.y(this.f14835n.getIsInAppPurchase());
        } else {
            this.b.w(this.f14835n.getIsInAppPurchase());
        }
        if (this.f14825d != null && e0.p(str, this.f14835n.getProductId())) {
            cj.o oVar = this.f14825d;
            if (oVar instanceof s0) {
                s0 s0Var = (s0) oVar;
                CurrentPurchaseContext currentPurchaseContext = this.f14835n;
                if (currentPurchaseContext != CurrentPurchaseContext.f14817g) {
                    String checkoutSessionId = currentPurchaseContext.getCheckoutSessionId() != null ? this.f14835n.getCheckoutSessionId() : "";
                    if (this.f14833l.containsKey(str)) {
                        s0Var.a(bVar == dj.e.b.SUCCESS, this.f14835n.getUserId(), this.f14833l.get(str), checkoutSessionId);
                    } else {
                        s0Var.a(bVar == dj.e.b.SUCCESS, this.f14835n.getUserId(), this.f14835n.getProductId(), checkoutSessionId);
                    }
                } else {
                    ek.q.k("rbx.purchaseflow", "CurrentPurchaseContext is empty. Unable to notify purchase finished with userId and productId.");
                    this.b.j(this.f14835n.getIsInAppPurchase());
                }
            } else {
                oVar.c(new dj.e(bVar, this.f14835n.getProductId(), this.f14835n.getCheckoutSessionId()));
            }
        }
        if (e0.p(str, this.f14835n.getProductId())) {
            u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(String str, dj.e.b bVar, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        this.b.a(this.f14835n.j(), str2);
        o0(str, bVar);
    }

    private void u0() {
        this.f14825d = null;
        this.f14835n = CurrentPurchaseContext.f14817g;
    }

    public void K(long j10, boolean z10) {
        CurrentPurchaseContext currentPurchaseContext = this.f14835n;
        this.f14835n = currentPurchaseContext.a(currentPurchaseContext.getProductId(), j10, this.f14835n.getIsInAppPurchase(), this.f14835n.getIsSubscriptionPurchase(), this.f14835n.getCheckoutSessionId());
        L(z10);
    }

    public void L(boolean z10) {
        CurrentPurchaseContext currentPurchaseContext = this.f14835n;
        this.f14835n = currentPurchaseContext.a(currentPurchaseContext.getProductId(), this.f14835n.getUserId(), this.f14835n.getIsInAppPurchase(), this.f14835n.getIsSubscriptionPurchase(), this.f14835n.getCheckoutSessionId());
        ek.q.h("rbx.purchaseflow", "attemptGrantPendingPurchases userId: " + this.f14835n.getUserId() + ", isAppResume:" + z10);
        if (!Z()) {
            ek.q.h("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchasing is not setup");
            return;
        }
        if (Y()) {
            ek.q.h("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchase already pending");
            return;
        }
        if (z10) {
            T();
            return;
        }
        if (!X()) {
            if (this.f14836o) {
                return;
            }
            T();
            this.f14836o = true;
            return;
        }
        ek.q.h("rbx.purchaseflow", "Found cached pending purchase. Count = " + this.f14832k.size());
        T();
    }

    public final v7.m N() {
        return new b();
    }

    public final cj.r.c O(final v7.k kVar) {
        return new cj.r.c() { // from class: dj.s
            @Override // cj.r.c
            public final void a(cj.r.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
                this.f14966a.d0(kVar, bVar, purchaseVerificationResponse);
            }
        };
    }

    public final void P(String str, String str2) {
        cj.o oVar = this.f14825d;
        if (oVar != null) {
            oVar.d();
        }
        com.roblox.client.purchase.a aVar = new com.roblox.client.purchase.a(this.f14824c);
        if (str2 == null || str2.isEmpty()) {
            str2 = null;
        }
        String str3 = str2;
        ek.q.h("rbx.purchaseflow", "doPrePurchaseValidation sending paymentSessionId: " + str3);
        if (this.f14835n.getIsInAppPurchase()) {
            aVar.d(a1.c1(), this.f14835n.getProductId(), str, str3, this.f14835n.getIsInAppPurchase(), this.f14837p);
        } else {
            aVar.b(a1.c1(), this.f14835n.getProductId(), str, str3, this.f14835n.getIsInAppPurchase(), this.f14837p);
        }
    }

    public void Q(Activity activity, ValidatePurchaseResponsePayload validatePurchaseResponsePayload, String str, List<String> list) {
        String strD;
        cj.o oVar = this.f14825d;
        if (oVar != null) {
            oVar.e();
        }
        this.b.a(this.f14835n.j(), "PurchaseStarted.");
        String productId = this.f14835n.getProductId();
        boolean isSubscriptionPurchase = this.f14835n.getIsSubscriptionPurchase();
        com.android.billingclient.api.e eVarS = S(productId, isSubscriptionPurchase);
        if (eVarS == null || !j0.i(eVarS, isSubscriptionPurchase)) {
            p0(productId, dj.e.b.FAILED_PRODUCT_NOT_FOUND, j0.j(eVarS, isSubscriptionPurchase));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f14835n.getIsSubscriptionPurchase()) {
            if (rh.h.a().Z3()) {
                strD = v0(eVarS, list);
                if (strD == null) {
                    p0(productId, dj.e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + productId);
                    return;
                }
            } else {
                strD = j0.d(eVarS);
            }
            arrayList.add(com.android.billingclient.api.c.b.b().c(eVarS).b(strD).a());
        } else {
            arrayList.add(com.android.billingclient.api.c.b.b().c(eVarS).a());
        }
        String strE = this.f14835n.f() ? this.f14835n.e() : "";
        if (validatePurchaseResponsePayload != null && validatePurchaseResponsePayload.e()) {
            strE = validatePurchaseResponsePayload.d();
        }
        com.android.billingclient.api.c.a aVarD = com.android.billingclient.api.c.b().b(strE).d(arrayList);
        if (str != null) {
            aVarD.c(str);
            this.b.f("Android-Purchase-Initiated-With-Charge-Request-Id");
        } else if (validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getCheckoutSessionId() == null) {
            ek.q.k("rbx.purchaseflow", "Both chargeRequestId and checkoutSessionId is null.");
            this.b.f("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
        } else {
            aVarD.c(validatePurchaseResponsePayload.getCheckoutSessionId());
            this.b.f("Android-Purchase-Initiated-With-Checkout-Session-Id");
        }
        com.android.billingclient.api.c cVarA = aVarD.a();
        if (activity.getIntent() == null) {
            activity.setIntent(new Intent());
        }
        if (this.f14823a.h(activity, cVarA).c() != 0) {
            p0(this.f14835n.getProductId(), dj.e.b.FAILED_PURCHASE_RESPONSE, "BillingClient.launchBillingFlow failed");
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
            String strJ = dj.b.j(kVar);
            if (strJ == null) {
                ek.q.e("rbx.purchaseflow", "Failed in handling purchases. Product ID is null. Purchase: " + kVar);
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
        Consumer<List<com.android.billingclient.api.e>> consumer = new Consumer() { // from class: dj.u
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f14970a.g0(hashtable, (List) obj);
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
        ek.q.h("rbx.purchaseflow", "Handle single purchase. Product id: " + dj.b.j(kVar) + ". Order id: " + kVar.b() + ". isAcknowledged: " + kVar.i());
        int iF = kVar.f();
        if (iF == 0) {
            this.b.B();
        } else if (iF == 2) {
            this.b.p();
        }
        if (kVar.f() != 1) {
            return;
        }
        this.f14832k.put(j0.e(kVar), kVar);
        String strJ = dj.b.j(kVar);
        if (strJ == null) {
            ek.q.e("rbx.purchaseflow", "Failed in handling single purchase. Product ID is null. Purchase: " + kVar);
            return;
        }
        if (!e0.m(strJ)) {
            v7.a aVarA = kVar.a();
            if (aVarA == null) {
                ek.q.e("rbx.purchaseflow", "Failed in handling single purchase. accountIdentifiers is null. Purchase: " + kVar);
                return;
            }
            String strA = aVarA.a();
            String strB = aVarA.b();
            if ((!this.f14835n.f() || !Objects.equals(this.f14835n.e(), strA)) && (strB == null || strB.isEmpty())) {
                this.b.g();
                if (!this.f14835n.f()) {
                    this.b.h();
                    return;
                } else {
                    if (Objects.equals(this.f14835n.e(), strA)) {
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
        return !this.f14832k.isEmpty();
    }

    public boolean Y() {
        return this.f14835n.getProductId() != null;
    }

    public boolean Z() {
        h0 h0Var = this.f14823a;
        return h0Var != null && this.f14827f == e.READY && h0Var.isReady();
    }

    @Override // cj.k
    @Deprecated
    public boolean a(String str, long j10, String str2, String str3, Activity activity) {
        return false;
    }

    public boolean a0() {
        return (this.f14835n.i() && Z()) ? false : true;
    }

    @Override // cj.k
    public boolean b(String str, String str2, Activity activity, cj.o oVar, boolean z10, String str3) {
        ek.q.h("rbx.purchaseflow", "startInAppPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + ", paymentSessionId: " + str3);
        return x0(str2, activity, dk.c.c().j(), oVar, z10, str3, true);
    }

    public final /* synthetic */ void b0(v7.k kVar, boolean z10, PurchaseVerificationResponse purchaseVerificationResponse, com.android.billingclient.api.d dVar) {
        int iC = dVar.c();
        boolean z11 = iC == 0;
        this.b.a(this.f14835n.j(), "OnAcknowledgePurchaseResponse. Success: " + z11 + ". Message: " + dVar + ".");
        boolean z12 = dj.b.i(kVar) != null;
        if (z12) {
            this.b.f("Android-Purchase-Completed-With-Checkout-Session-Id");
        }
        if (z11) {
            if (z10) {
                this.b.f("Play-Points-Ack-Purchase-Succeed");
            }
            J(kVar, dj.e.b.SUCCESS, n0.b(purchaseVerificationResponse));
            return;
        }
        if (z10) {
            this.b.f("Play-Points-Ack-Purchase-Fail");
        }
        ek.q.k("rbx.purchaseflow", "Failed to acknowledge Purchase");
        this.b.d(this.f14835n.getIsInAppPurchase());
        if (z12) {
            U(kVar, iC);
        }
    }

    @Override // cj.k
    @Deprecated
    public String c(String str) {
        return null;
    }

    public final /* synthetic */ void c0(String str, v7.k kVar, com.android.billingclient.api.d dVar, String str2) {
        boolean z10 = dVar.c() == 0;
        this.b.a(this.f14835n.j(), "OnConsumeResponse. Success: " + z10 + ". Message: " + dVar + ".");
        if (z10) {
            if (e0.m(str)) {
                this.b.f("Play-Points-Consume-Purchase-Succeed");
            }
            o0(str, dj.e.b.SUCCESS);
            com.android.billingclient.api.e eVarS = S(str, false);
            if (eVarS == null || !j0.i(eVarS, false)) {
                ek.q.h("rbx.purchaseflow", "Invalid product details for productId " + str + ". ProductDetails: " + j0.j(eVarS, false));
            } else {
                this.b.b(str, e0.g(eVarS, false), e0.i(eVarS, false), e0.h(eVarS, false));
            }
            this.f14832k.remove(j0.e(kVar));
        } else {
            if (e0.m(str)) {
                this.b.f("Play-Points-Consume-Purchase-Fail");
            }
            this.b.e(this.f14835n.getIsInAppPurchase());
            p0(dj.b.j(kVar), dj.e.b.CONSUME_ERROR, "OnAcknowledgePurchaseResponse failure");
        }
        ek.q.h("rbx.purchaseflow", "End consume flow.");
    }

    @Override // cj.k
    public boolean d(String str, String str2, Activity activity, cj.o oVar, boolean z10) {
        return x0(str2, activity, dk.c.c().j(), oVar, z10, null, true);
    }

    public final /* synthetic */ void d0(v7.k kVar, cj.r.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
        this.b.a(this.f14835n.j(), "VerifyPurchase. Response=" + bVar + ". ReceiptId=" + kVar.b());
        cj.o oVar = this.f14825d;
        if (oVar != null) {
            oVar.e();
        }
        if (bVar != cj.r.b.OK && !kVar.i()) {
            this.b.A();
        }
        int i10 = d.f14842c[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                this.b.D(this.f14835n.getIsInAppPurchase());
                p0(dj.b.j(kVar), dj.e.b.RECEIPT_VERIFICATION_ERROR, "launchVerifyPurchaseReceipt error");
                return;
            } else if (i10 != 3) {
                this.b.E(this.f14835n.getIsInAppPurchase());
                p0(dj.b.j(kVar), dj.e.b.UNKNOWN, "launchVerifyPurchaseReceipt unknown error");
                return;
            } else {
                this.b.C(this.f14835n.getIsInAppPurchase());
                p0(dj.b.j(kVar), dj.e.b.RECEIPT_EMPTY, "launchVerifyPurchaseReceipt empty response");
                return;
            }
        }
        String strJ = dj.b.j(kVar);
        if (e0.o(kVar)) {
            ek.q.h("rbx.purchaseflow", "Receipt Verification Successful for Subscription");
            if (strJ != null && e0.n(strJ)) {
                dk.c.c().t(dk.c.c().f() + cj.p.e(strJ));
            }
            boolean zO = e0.o(kVar);
            com.android.billingclient.api.e eVarS = S(strJ, zO);
            if (eVarS == null || !j0.i(eVarS, zO)) {
                ek.q.h("rbx.purchaseflow", "Invalid product details for productId " + strJ + ". ProductDetails: " + j0.j(eVarS, zO));
            } else {
                this.b.b(strJ, e0.g(eVarS, zO), e0.i(eVarS, zO), e0.h(eVarS, zO));
            }
        }
        H(kVar, purchaseVerificationResponse);
    }

    @Override // cj.k
    public void e(String str, Uri uri, String str2, @NonNull e4.q qVar, cj.o oVar, Runnable runnable) {
        if (uri == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ek.q.h("rbx.purchaseflow", "UriObject: " + uri);
        if (b(str2, str, qVar, oVar, Boolean.TRUE.equals(ek.e0.a(uri, "recurring")), ek.e0.c(uri, "paymentSessionId")) || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final /* synthetic */ void e0(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            ek.q.d("Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.b.a(this.f14835n.j(), "QueryInAppPurchases. ItemsCount: " + list.size() + ". Items: " + l0.b(list));
        V(list);
    }

    @Override // cj.k
    @Deprecated
    public boolean f(String str, long j10, String str2, Activity activity, String str3) {
        return false;
    }

    public final /* synthetic */ void f0(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            ek.q.d("Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.b.a(this.f14835n.j(), "QuerySubsPurchases. ItemsCount: " + list.size() + ". Items: " + l0.b(list));
        V(list);
    }

    @Override // cj.k
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
                ek.q.e("rbx.purchaseflow", "Null product details in list");
            } else {
                String strD = eVar.d();
                if (map.containsKey(strD)) {
                    W((v7.k) map.get(strD));
                } else {
                    ek.q.e("rbx.purchaseflow", "Cannot find purchase associated with product details. ProductId: " + strD);
                }
            }
        }
    }

    @Override // cj.k
    public boolean h(long j10, String str, String str2, final Activity activity, boolean z10, cj.o oVar) {
        final dj.c cVar = new dj.c(str2);
        if (!cVar.b()) {
            ek.q.e("rbx.purchaseflow", "Purchase request is invalid. Raw payload: " + str2);
            return false;
        }
        if (cVar.c() && this.f14823a.e("subscriptions").c() != 0) {
            ek.q.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return false;
        }
        if (cVar.f() == null) {
            ek.q.e("rbx.purchaseflow", "The provider product id is null.");
            return false;
        }
        this.f14835n = new CurrentPurchaseContext(cVar.f(), j10, !z10, cVar.c(), null);
        this.f14825d = oVar;
        ek.q.h("rbx.purchaseflow", "Initiated purchase. Params: " + cVar);
        if (a0()) {
            ek.q.e("rbx.purchaseflow", "Purchasing is not enabled. Params: " + cVar);
            return false;
        }
        if (cVar.c()) {
            this.f14833l.put(cVar.f(), str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i0(cVar.f(), cVar.g()));
        r0(arrayList, new Consumer() { // from class: dj.z
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f14979a.m0(cVar, activity, (List) obj);
            }
        });
        return true;
    }

    public final /* synthetic */ void h0(String str, String str2) {
        q0(new long[0], 500, str, str2);
    }

    @Override // cj.k
    @Deprecated
    public boolean i(String str) {
        return false;
    }

    public final /* synthetic */ void i0(List list, Consumer consumer, com.android.billingclient.api.d dVar, v7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        if (dVar.c() != 0) {
            ek.q.e("rbx.purchaseflow", "Failed queryProductDetails. Products: " + list + ", BillingResult: " + dVar);
        } else {
            if (listA.isEmpty()) {
                ek.q.h("rbx.purchaseflow", "Returned no ProductDetails for Products: " + list);
                return;
            }
            for (com.android.billingclient.api.e eVar : listA) {
                if (eVar.e().equals("subs")) {
                    this.f14831j.put(eVar.d(), eVar);
                } else {
                    this.f14830i.put(eVar.d(), eVar);
                }
            }
            ek.q.h("rbx.purchaseflow", "queryProductDetails Success. Products: " + list);
        }
        consumer.accept(listA);
    }

    public final /* synthetic */ void j0(Runnable runnable, com.android.billingclient.api.d dVar, v7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        if (dVar.c() == 0) {
            ek.q.h("rbx.purchaseflow", "Returned INAPP ProductDetails. Count = " + listA.size());
            for (com.android.billingclient.api.e eVar : listA) {
                this.f14830i.put(eVar.d(), eVar);
            }
            ek.q.h("rbx.purchaseflow", "queryInAppProduct Success. Count = " + this.f14830i.size());
            this.f14828g = e.READY;
        } else {
            ek.q.h("rbx.purchaseflow", "Failed queryInAppProduct. BillingResult: " + dVar);
            this.f14828g = e.NONE;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // cj.k
    @Deprecated
    public void k(boolean z10) {
    }

    public final /* synthetic */ void k0(Runnable runnable, com.android.billingclient.api.d dVar, v7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        if (dVar.c() == 0) {
            ek.q.h("rbx.purchaseflow", "Returned SUBS ProductDetails. Count = " + listA.size());
            for (com.android.billingclient.api.e eVar : listA) {
                this.f14831j.put(eVar.d(), eVar);
            }
            ek.q.h("rbx.purchaseflow", "querySubsProduct Success. Count = " + this.f14831j.size());
            this.f14829h = e.READY;
        } else {
            ek.q.e("rbx.purchaseflow", "Failed querySubsProduct. BillingResult: " + dVar);
            this.f14829h = e.NONE;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // cj.k
    @Deprecated
    public boolean l(String str) {
        return false;
    }

    public final /* synthetic */ void l0(String str, boolean z10, String str2) {
        com.android.billingclient.api.e eVarS = S(str, z10);
        if (eVarS == null || !j0.i(eVarS, z10)) {
            p0(str, dj.e.b.FAILED_PRODUCT_NOT_FOUND, j0.j(eVarS, z10));
        } else {
            P(e0.i(eVarS, this.f14835n.getIsSubscriptionPurchase()), str2);
        }
    }

    @Override // cj.k
    @Deprecated
    public void m(int i10) {
    }

    public final /* synthetic */ void m0(dj.c cVar, Activity activity, List list) {
        if (list == null || list.isEmpty()) {
            p0(cVar.f(), dj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            return;
        }
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) list.get(0);
        String strF = cVar.f();
        boolean zC = cVar.c();
        if (eVar == null || !j0.i(eVar, zC)) {
            p0(strF, dj.e.b.FAILED_PRODUCT_NOT_FOUND, j0.j(eVar, zC));
        } else {
            Q(activity, null, cVar.a(), cVar.d());
        }
    }

    @Override // cj.k
    public boolean n(String str, String str2, Activity activity, long j10, cj.o oVar) {
        return x0(str2, activity, j10, oVar, false, null, false);
    }

    public final void n0(v7.k kVar) {
        String strJ = dj.b.j(kVar);
        String strB = kVar.b();
        if (this.f14825d != null && e0.p(strJ, this.f14835n.getProductId())) {
            ek.q.h("rbx.purchaseflow", "launchVerifyPurchaseReceipt onPurchaseVerificationStart");
            this.f14825d.b();
        }
        if (strJ == null || strB == null) {
            ek.q.e("rbx.purchaseflow", "launchVerifyPurchaseReceipt failed. Invalid parameters: " + strB + ", " + strJ);
            return;
        }
        ek.q.h("rbx.purchaseflow", "Start launchVerifyPurchaseReceipt: " + strB + ", " + strJ);
        this.f14834m.a(kVar, strB, strJ, this.f14835n.getIsInAppPurchase(), new f0.b() { // from class: dj.v
            @Override // dj.f0.b
            public final void a(String str, String str2) {
                this.f14971a.h0(str, str2);
            }
        });
    }

    public void q0(long[] jArr, int i10, String str, String str2) {
        cj.r.b bVar;
        ek.q.h("rbx.purchaseflow", "Verify Purchase callback. response code " + i10 + " grantedAssetIds = " + Arrays.toString(jArr) + ".");
        if (i10 == 200) {
            ek.q.h("rbx.purchaseflow", "Verification success");
            bVar = cj.r.b.OK;
            this.b.k();
        } else if (i10 == 500) {
            ek.q.e("rbx.purchaseflow", "Server error");
            bVar = cj.r.b.ERROR;
            this.b.n();
        } else if (i10 == 400) {
            ek.q.e("rbx.purchaseflow", "Service was unable to validate receiptId.");
            bVar = cj.r.b.ERROR;
            this.b.l();
        } else if (i10 != 401) {
            ek.q.e("rbx.purchaseflow", "Unknown");
            bVar = cj.r.b.UNKNOWN;
            this.b.o();
        } else {
            ek.q.e("rbx.purchaseflow", "Unauthorized to make request.");
            bVar = cj.r.b.BOGUS;
            this.b.m();
        }
        PurchaseVerificationResponse purchaseVerificationResponse = new PurchaseVerificationResponse(fj.a.b(jArr));
        if (str == null) {
            str = str2;
        }
        v7.k kVar = this.f14832k.get(str);
        if (kVar == null) {
            ek.q.e("rbx.purchaseflow", "Verify Purchase callback. purchaseKey: " + str + "not found.");
            this.b.A();
            return;
        }
        ek.q.h("rbx.purchaseflow", "Verify Purchase callback. purchaseKey: " + str + ", purchase: " + kVar.b());
        O(kVar).a(bVar, purchaseVerificationResponse);
    }

    public final void r0(final List<i0> list, final Consumer<List<com.android.billingclient.api.e>> consumer) {
        if (this.f14823a.e("fff").c() != 0) {
            ek.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.b.t(this.f14835n.getIsInAppPurchase());
            consumer.accept(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (i0 i0Var : list) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(i0Var.getProviderProductId()).c(i0Var.getProductType()).a());
        }
        this.f14823a.a(com.android.billingclient.api.f.a().b(arrayList).a(), new v7.j() { // from class: dj.x
            @Override // v7.j
            public final void a(com.android.billingclient.api.d dVar, v7.n nVar) {
                this.f14974a.i0(list, consumer, dVar, nVar);
            }
        });
    }

    public final void s0(final Runnable runnable) {
        ek.q.h("rbx.purchaseflow", "Attempt queryInAppProduct");
        if (this.f14823a.e("fff").c() != 0) {
            ek.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.b.t(this.f14835n.getIsInAppPurchase());
            return;
        }
        e eVar = this.f14828g;
        if (eVar == e.READY) {
            ek.q.h("rbx.purchaseflow", "queryInAppProduct is setup already");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (eVar != e.NONE) {
            ek.q.h("rbx.purchaseflow", "queryInAppProduct is pending");
            return;
        }
        List<String> listE = e0.e();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(it.next()).c("inapp").a());
        }
        com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f14828g = e.CONNECTING;
        ek.q.h("rbx.purchaseflow", "Querying INAPP ProductDetails. Count = " + arrayList.size());
        this.f14823a.a(fVarA, new v7.j() { // from class: dj.q
            @Override // v7.j
            public final void a(com.android.billingclient.api.d dVar, v7.n nVar) {
                this.f14964a.j0(runnable, dVar, nVar);
            }
        });
    }

    public final void t0(final Runnable runnable) {
        ek.q.h("rbx.purchaseflow", "Attempt querySubsProduct");
        if (this.f14823a.e("subscriptions").c() != 0) {
            ek.q.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return;
        }
        if (this.f14823a.e("fff").c() != 0) {
            ek.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.b.t(this.f14835n.getIsInAppPurchase());
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        e eVar = this.f14829h;
        if (eVar == e.READY) {
            ek.q.h("rbx.purchaseflow", "querySubsProduct is setup already");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (eVar != e.NONE) {
            ek.q.h("rbx.purchaseflow", "querySubsProduct is pending");
            return;
        }
        List<String> listF = e0.f();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(it.next()).c("subs").a());
        }
        com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f14829h = e.CONNECTING;
        ek.q.h("rbx.purchaseflow", "Querying SUBS ProductDetails. Count = " + arrayList.size());
        this.f14823a.a(fVarA, new v7.j() { // from class: dj.p
            @Override // v7.j
            public final void a(com.android.billingclient.api.d dVar, v7.n nVar) {
                this.f14963a.k0(runnable, dVar, nVar);
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
            if (rh.h.a().A0()) {
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
        e eVar = this.f14827f;
        if (eVar == e.READY) {
            ek.q.h("rbx.purchaseflow", "Google Billing Client for payments protocol is already setup");
            return;
        }
        e eVar2 = e.CONNECTING;
        if (eVar == eVar2) {
            ek.q.h("rbx.purchaseflow", "Google Billing Client for payments protocol is already connecting");
            return;
        }
        this.f14823a.f(aVar);
        this.f14827f = eVar2;
        ek.q.h("rbx.purchaseflow", "Connecting Google Billing's Client for payments protocol");
        this.f14823a.b(new a());
    }

    public final boolean x0(final String str, Activity activity, long j10, cj.o oVar, final boolean z10, final String str2, boolean z11) {
        ek.q.h("rbx.purchaseflow", "startPurchase productId: " + str + ", isSubscriptionPurchase: " + z10 + ", isInApp: " + z11 + ", userId: " + j10);
        if (str == null) {
            ek.q.e("rbx.purchaseflow", "Purchase product id is null.");
            return false;
        }
        this.f14835n = new CurrentPurchaseContext(str, j10, z11, e0.n(str), null);
        this.f14825d = oVar;
        if (a0()) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: dj.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f14976a.l0(str, z10, str2);
            }
        };
        if (this.f14835n.getIsSubscriptionPurchase()) {
            t0(runnable);
            return true;
        }
        s0(runnable);
        return true;
    }

    public final void y0(v7.k kVar, String str) {
        String strJ = dj.b.j(kVar);
        if (strJ == null) {
            ek.q.e("rbx.purchaseflow", "Failed to verify purchase. Product ID is null. Purchase: " + kVar);
            return;
        }
        boolean zM = e0.m(strJ);
        b0 b0Var = this.f14826e;
        boolean z10 = b0Var != null && b0Var.c(str);
        if (!kVar.i() || (zM && !z10)) {
            n0(kVar);
        } else {
            J(kVar, dj.e.b.ALREADY_ACKNOWLEDGED, new RobloxPurchaseInfo());
        }
    }
}
