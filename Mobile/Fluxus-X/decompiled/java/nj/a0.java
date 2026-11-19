package nj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import bh.a1;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams;
import ei.s0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import pj.ValidatePurchaseResponsePayload;

/* JADX INFO: loaded from: classes2.dex */
public class a0 implements mj.k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile a0 f25638q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f25639a;
    public final n b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mi.f f25640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mj.o f25641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f25642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f25643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f25644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f25645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Hashtable<String, com.android.billingclient.api.e> f25646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Hashtable<String, com.android.billingclient.api.e> f25647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Hashtable<String, w7.k> f25648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Hashtable<String, String> f25649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0 f25650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CurrentPurchaseContext f25651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.roblox.client.purchase.a.f f25653p;

    public class a implements w7.d {
        public a() {
        }

        @Override // w7.d
        public void a(com.android.billingclient.api.d dVar) {
            int iC = dVar.c();
            if (iC == 0) {
                ok.q.h("rbx.purchaseflow", "Google Billing Client for payments protocol is setup");
                a0.this.f25643f = e.READY;
                return;
            }
            if (iC == 3) {
                ok.q.k("rbx.purchaseflow", "Google Billing Client unavailable (Play Store blocked). BillingResult: " + dVar);
                a0.this.b.f("Android-Billing-Unavailable-Store-Blocked");
            } else {
                ok.q.e("rbx.purchaseflow", "Google Billing Client for payments protocol is not setup");
            }
            a0.this.f25643f = e.NONE;
        }

        @Override // w7.d
        public void b() {
            ok.q.h("rbx.purchaseflow", "Google Billing Client for payments protocol disconnected");
            a0.this.f25643f = e.NONE;
        }
    }

    public class b implements w7.m {
        public b() {
        }

        @Override // w7.m
        public void a(@NonNull com.android.billingclient.api.d dVar, List<w7.k> list) {
            if (a0.this.f25639a == null) {
                return;
            }
            int iC = dVar.c();
            if (iC == 0) {
                a0.this.V(list);
                return;
            }
            if (iC == 1) {
                a0 a0Var = a0.this;
                a0Var.p0(a0Var.f25651n.getProductId(), nj.e.b.USER_CANCELLED, "User cancelled");
                return;
            }
            if (iC == 3) {
                a0.this.b.f("Android-Billing-Unavailable-Store-Blocked");
                a0 a0Var2 = a0.this;
                a0Var2.p0(a0Var2.f25651n.getProductId(), nj.e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated: BILLING_UNAVAILABLE (Play Store blocked)");
            } else if (iC != 7) {
                a0 a0Var3 = a0.this;
                a0Var3.p0(a0Var3.f25651n.getProductId(), nj.e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
            } else {
                ok.q.k("rbx.purchaseflow", "onPurchasesUpdated: ITEM_ALREADY_OWNED.");
                a0.this.T();
            }
        }
    }

    public class c implements com.roblox.client.purchase.a.f {
        public c() {
        }

        @Override // com.roblox.client.purchase.a.f
        public void a(com.roblox.client.purchase.a.e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
            a0.this.b.a(a0.this.f25651n.j(), "ValidationCheck: " + eVar + ".");
            switch (d.f25657a[eVar.ordinal()]) {
                case 1:
                    if (validatePurchaseResponsePayload != null) {
                        a0 a0Var = a0.this;
                        a0Var.f25651n = a0Var.f25651n.a(a0.this.f25651n.getProductId(), a0.this.f25651n.getUserId(), a0.this.f25651n.getIsInAppPurchase(), a0.this.f25651n.getIsSubscriptionPurchase(), validatePurchaseResponsePayload.getCheckoutSessionId());
                        IAPPurchaseManager.nativeInvokeStore(str, validatePurchaseResponsePayload.getUserId().longValue(), validatePurchaseResponsePayload.getCheckoutSessionId());
                    } else {
                        a0.this.b.r(a0.this.f25651n.getIsInAppPurchase());
                        a0.this.p0(str, nj.e.b.VALIDATION_ERROR, "validatePurchaseResponsePayload is null");
                    }
                    break;
                case 2:
                    a0.this.b.r(a0.this.f25651n.getIsInAppPurchase());
                    a0.this.p0(str, nj.e.b.VALIDATION_ERROR, "PrePurchaseValidation error");
                    break;
                case 3:
                    a0.this.b.u(a0.this.f25651n.getIsInAppPurchase());
                    a0.this.p0(str, nj.e.b.VALIDATION_RETRY, "PrePurchaseValidation retry");
                    break;
                case 4:
                    a0.this.b.s(a0.this.f25651n.getIsInAppPurchase());
                    a0.this.p0(str, nj.e.b.VALIDATION_LIMIT, "PrePurchaseValidation limit");
                    break;
                case 5:
                    a0.this.b.s(a0.this.f25651n.getIsInAppPurchase());
                    a0.this.p0(str, nj.e.b.VALIDATION_LIMIT_UNDER_13, "PrePurchaseValidation limit");
                    break;
                case 6:
                    a0.this.b.q(a0.this.f25651n.getIsInAppPurchase());
                    a0.this.p0(str, nj.e.b.REQUEST_BALANCE_ERROR, "PrePurchaseValidation requestBalance failed.");
                    break;
                default:
                    a0.this.b.v(a0.this.f25651n.getIsInAppPurchase());
                    a0.this.p0(str, nj.e.b.UNKNOWN, "PrePurchaseValidation Unknown error.");
                    break;
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25657a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f25658c;

        static {
            int[] iArr = new int[mj.r.b.values().length];
            f25658c = iArr;
            try {
                iArr[mj.r.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25658c[mj.r.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25658c[mj.r.b.EMPTY_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[nj.e.b.values().length];
            b = iArr2;
            try {
                iArr2[nj.e.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[nj.e.b.USER_CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[nj.e.b.ALREADY_ACKNOWLEDGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.roblox.client.purchase.a.e.values().length];
            f25657a = iArr3;
            try {
                iArr3[com.roblox.client.purchase.a.e.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25657a[com.roblox.client.purchase.a.e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25657a[com.roblox.client.purchase.a.e.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25657a[com.roblox.client.purchase.a.e.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25657a[com.roblox.client.purchase.a.e.LIMIT_UNDER_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f25657a[com.roblox.client.purchase.a.e.ERROR_CHECKING_BALANCE.ordinal()] = 6;
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
        this.f25643f = eVar;
        this.f25644g = eVar;
        this.f25645h = eVar;
        this.f25646i = new Hashtable<>();
        this.f25647j = new Hashtable<>();
        this.f25648k = new Hashtable<>();
        this.f25649l = new Hashtable<>();
        this.f25651n = CurrentPurchaseContext.f25633g;
        this.f25652o = false;
        this.f25653p = new c();
        this.f25650m = new f0();
        this.f25639a = new nj.b();
        this.b = new n();
        this.f25640c = new mi.h();
        w0(com.android.billingclient.api.a.f(context).c(N()).b(w7.i.c().b().c().a()).a());
        this.f25642e = new b0(context);
    }

    private void H(final w7.k kVar, final PurchaseVerificationResponse purchaseVerificationResponse) {
        String strK = nj.b.k(kVar);
        if (strK == null) {
            ok.q.e("rbx.purchaseflow", "Failed to acknowledge purchase. Product ID is null. Purchase: " + kVar);
            this.b.d(this.f25651n.getIsInAppPurchase());
            return;
        }
        final boolean zM = e0.m(strK);
        if (!kVar.i() || zM) {
            ok.q.h("rbx.purchaseflow", "Acknowledging Purchase");
            I(kVar, new w7.c() { // from class: nj.t
                @Override // w7.c
                public final void a(com.android.billingclient.api.d dVar) {
                    this.f25783a.b0(kVar, zM, purchaseVerificationResponse, dVar);
                }
            });
        } else {
            ok.q.h("rbx.purchaseflow", "Attempted to acknowledge an acknowledged purchase.");
            J(kVar, nj.e.b.ALREADY_ACKNOWLEDGED, n0.b(purchaseVerificationResponse));
        }
    }

    private void I(w7.k kVar, w7.c cVar) {
        ok.q.h("rbx.purchaseflow", "Start acknowledging Purchase");
        this.f25639a.d(w7.b.b().b(kVar.g()).a(), cVar);
    }

    private void J(w7.k kVar, nj.e.b bVar, RobloxPurchaseInfo robloxPurchaseInfo) {
        ok.q.h("rbx.purchaseflow", "Acknowledged Purchase");
        if (e0.o(kVar)) {
            this.f25648k.remove(j0.e(kVar));
            o0(nj.b.k(kVar), bVar);
            return;
        }
        String strK = nj.b.k(kVar);
        if (strK == null) {
            ok.q.e("rbx.purchaseflow", "Failed to complete acknowledge purchase. Product ID is null. Purchase: " + kVar);
            this.b.c(this.f25651n.getIsInAppPurchase());
            return;
        }
        String strE = j0.e(kVar);
        boolean zM = e0.m(strK);
        boolean zC = this.f25642e.c(strE);
        if (zM) {
            if (zC) {
                this.b.f("Play-Points-Not-Show-Confirmation-Screen");
            } else {
                this.b.f("Play-Points-Show-Confirmation-Screen");
                com.android.billingclient.api.e eVarS = S(strK, false);
                if (eVarS == null) {
                    ok.q.e("rbx.purchaseflow", "Failed to complete acknowledge purchase for a play point product. ProductDetails is null. Purchase: " + kVar);
                    return;
                }
                NativeGLInterface.nativeOOAPPurchaseFinished(OOAPPurchaseFinishedParams.builder().g(strK).e(strK).i(0).c(eVarS.a()).d(j0.c(eVarS)).f(j0.f(eVarS)).b(j0.b(eVarS)).h(n0.a(robloxPurchaseInfo)).a());
                this.f25642e.a(strE);
            }
        }
        M(kVar);
    }

    private void M(final w7.k kVar) {
        final String strK = nj.b.k(kVar);
        if (strK == null) {
            ok.q.e("rbx.purchaseflow", "Failed to consume purchase. Product ID is null. Purchase: " + kVar);
            return;
        }
        if (bi.h.a().u0() || !e0.l(strK)) {
            ok.q.h("rbx.purchaseflow", "Consuming Purchase");
            this.f25639a.g(w7.e.b().b(kVar.g()).a(), new w7.f() { // from class: nj.w
                @Override // w7.f
                public final void a(com.android.billingclient.api.d dVar, String str) {
                    this.f25788a.c0(strK, kVar, dVar, str);
                }
            });
        } else if (e0.m(strK)) {
            this.b.f("Play-Points-Not-Consume-Purchase");
        }
    }

    public static a0 R(Context context) {
        if (f25638q == null) {
            synchronized (a0.class) {
                try {
                    if (f25638q == null) {
                        f25638q = new a0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f25638q;
    }

    private com.android.billingclient.api.e S(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        return z10 ? this.f25647j.get(str) : this.f25646i.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        ok.q.h("rbx.purchaseflow", "Do Google Purchase GrantPending");
        if (a0()) {
            return;
        }
        w7.o oVarA = w7.o.b().b("inapp").a();
        w7.o oVarA2 = w7.o.b().b("subs").a();
        this.f25639a.f(oVarA, new w7.l() { // from class: nj.o
            @Override // w7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f25778a.e0(dVar, list);
            }
        });
        this.f25639a.f(oVarA2, new w7.l() { // from class: nj.r
            @Override // w7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f25781a.f0(dVar, list);
            }
        });
    }

    private void U(w7.k kVar, int i10) {
        ok.q.h("rbx.purchaseflow", "Acknowledge error, response code: " + i10 + ", skipping client side acknowledge purchase.");
        this.b.f("Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore");
        this.f25648k.remove(j0.e(kVar));
        String strK = nj.b.k(kVar);
        if (!e0.o(kVar)) {
            com.android.billingclient.api.e eVarS = S(strK, false);
            if (eVarS == null || !j0.i(eVarS, false)) {
                ok.q.h("rbx.purchaseflow", "Invalid product details for productId " + strK + ". ProductDetails: " + j0.j(eVarS, false));
            } else {
                this.b.b(strK, e0.g(eVarS, false), e0.i(eVarS, false), e0.h(eVarS, false));
            }
        }
        o0(strK, nj.e.b.SUCCESS);
    }

    private void o0(String str, nj.e.b bVar) {
        int i10 = d.b[bVar.ordinal()];
        if (i10 == 1) {
            this.b.z(this.f25651n.getIsInAppPurchase());
        } else if (i10 == 2) {
            this.b.x(this.f25651n.getIsInAppPurchase());
        } else if (i10 != 3) {
            this.b.y(this.f25651n.getIsInAppPurchase());
        } else {
            this.b.w(this.f25651n.getIsInAppPurchase());
        }
        if (this.f25641d != null && e0.p(str, this.f25651n.getProductId())) {
            mj.o oVar = this.f25641d;
            if (oVar instanceof s0) {
                s0 s0Var = (s0) oVar;
                CurrentPurchaseContext currentPurchaseContext = this.f25651n;
                if (currentPurchaseContext != CurrentPurchaseContext.f25633g) {
                    String checkoutSessionId = currentPurchaseContext.getCheckoutSessionId() != null ? this.f25651n.getCheckoutSessionId() : BuildConfig.FLAVOR;
                    if (this.f25649l.containsKey(str)) {
                        s0Var.a(bVar == nj.e.b.SUCCESS, this.f25651n.getUserId(), this.f25649l.get(str), checkoutSessionId);
                    } else {
                        s0Var.a(bVar == nj.e.b.SUCCESS, this.f25651n.getUserId(), this.f25651n.getProductId(), checkoutSessionId);
                    }
                } else {
                    ok.q.k("rbx.purchaseflow", "CurrentPurchaseContext is empty. Unable to notify purchase finished with userId and productId.");
                    this.b.j(this.f25651n.getIsInAppPurchase());
                }
            } else {
                oVar.e(new nj.e(bVar, this.f25651n.getProductId(), this.f25651n.getCheckoutSessionId()));
            }
        }
        if (e0.p(str, this.f25651n.getProductId())) {
            u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(String str, nj.e.b bVar, String str2) {
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        this.b.a(this.f25651n.j(), str2);
        o0(str, bVar);
    }

    private void u0() {
        this.f25641d = null;
        this.f25651n = CurrentPurchaseContext.f25633g;
    }

    public void K(long j10, boolean z10) {
        CurrentPurchaseContext currentPurchaseContext = this.f25651n;
        this.f25651n = currentPurchaseContext.a(currentPurchaseContext.getProductId(), j10, this.f25651n.getIsInAppPurchase(), this.f25651n.getIsSubscriptionPurchase(), this.f25651n.getCheckoutSessionId());
        L(z10);
    }

    public void L(boolean z10) {
        CurrentPurchaseContext currentPurchaseContext = this.f25651n;
        this.f25651n = currentPurchaseContext.a(currentPurchaseContext.getProductId(), this.f25651n.getUserId(), this.f25651n.getIsInAppPurchase(), this.f25651n.getIsSubscriptionPurchase(), this.f25651n.getCheckoutSessionId());
        ok.q.h("rbx.purchaseflow", "attemptGrantPendingPurchases userId: " + this.f25651n.getUserId() + ", isAppResume:" + z10);
        if (!Z()) {
            ok.q.h("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchasing is not setup");
            return;
        }
        if (Y()) {
            ok.q.h("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchase already pending");
            return;
        }
        if (z10) {
            T();
            return;
        }
        if (!X()) {
            if (this.f25652o) {
                return;
            }
            T();
            this.f25652o = true;
            return;
        }
        ok.q.h("rbx.purchaseflow", "Found cached pending purchase. Count = " + this.f25648k.size());
        T();
    }

    public final w7.m N() {
        return new b();
    }

    public final mj.r.c O(final w7.k kVar) {
        return new mj.r.c() { // from class: nj.s
            @Override // mj.r.c
            public final void a(mj.r.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
                this.f25782a.d0(kVar, bVar, purchaseVerificationResponse);
            }
        };
    }

    public final void P(String str, String str2) {
        mj.o oVar = this.f25641d;
        if (oVar != null) {
            oVar.c();
        }
        com.roblox.client.purchase.a aVar = new com.roblox.client.purchase.a(this.f25640c);
        if (str2 == null || str2.isEmpty()) {
            str2 = null;
        }
        String str3 = str2;
        ok.q.h("rbx.purchaseflow", "doPrePurchaseValidation sending paymentSessionId: " + str3);
        if (this.f25651n.getIsInAppPurchase()) {
            aVar.d(a1.c1(), this.f25651n.getProductId(), str, str3, this.f25651n.getIsInAppPurchase(), this.f25653p);
        } else {
            aVar.b(a1.c1(), this.f25651n.getProductId(), str, str3, this.f25651n.getIsInAppPurchase(), this.f25653p);
        }
    }

    public void Q(Activity activity, ValidatePurchaseResponsePayload validatePurchaseResponsePayload, String str, List<String> list) {
        String strD;
        mj.o oVar = this.f25641d;
        if (oVar != null) {
            oVar.d();
        }
        this.b.a(this.f25651n.j(), "PurchaseStarted.");
        String productId = this.f25651n.getProductId();
        boolean isSubscriptionPurchase = this.f25651n.getIsSubscriptionPurchase();
        com.android.billingclient.api.e eVarS = S(productId, isSubscriptionPurchase);
        if (eVarS == null || !j0.i(eVarS, isSubscriptionPurchase)) {
            p0(productId, nj.e.b.FAILED_PRODUCT_NOT_FOUND, j0.j(eVarS, isSubscriptionPurchase));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f25651n.getIsSubscriptionPurchase()) {
            if (bi.h.a().d4()) {
                strD = v0(eVarS, list);
                if (strD == null) {
                    p0(productId, nj.e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + productId);
                    return;
                }
            } else {
                strD = j0.d(eVarS);
            }
            arrayList.add(com.android.billingclient.api.c.b.b().c(eVarS).b(strD).a());
        } else {
            arrayList.add(com.android.billingclient.api.c.b.b().c(eVarS).a());
        }
        String strE = this.f25651n.f() ? this.f25651n.e() : BuildConfig.FLAVOR;
        if (validatePurchaseResponsePayload != null && validatePurchaseResponsePayload.e()) {
            strE = validatePurchaseResponsePayload.d();
        }
        com.android.billingclient.api.c.a aVarD = com.android.billingclient.api.c.b().b(strE).d(arrayList);
        if (str != null) {
            aVarD.c(str);
            this.b.f("Android-Purchase-Initiated-With-Charge-Request-Id");
        } else if (validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getCheckoutSessionId() == null) {
            ok.q.k("rbx.purchaseflow", "Both chargeRequestId and checkoutSessionId is null.");
            this.b.f("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
        } else {
            aVarD.c(validatePurchaseResponsePayload.getCheckoutSessionId());
            this.b.f("Android-Purchase-Initiated-With-Checkout-Session-Id");
        }
        com.android.billingclient.api.c cVarA = aVarD.a();
        if (activity.getIntent() == null) {
            activity.setIntent(new Intent());
        }
        if (this.f25639a.h(activity, cVarA).c() != 0) {
            p0(this.f25651n.getProductId(), nj.e.b.FAILED_PURCHASE_RESPONSE, "BillingClient.launchBillingFlow failed");
        }
    }

    public void V(List<w7.k> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final Hashtable hashtable = new Hashtable();
        for (w7.k kVar : list) {
            String strK = nj.b.k(kVar);
            if (strK == null) {
                ok.q.e("rbx.purchaseflow", "Failed in handling purchases. Product ID is null. Purchase: " + kVar);
            } else {
                boolean zO = e0.o(kVar);
                if (S(strK, zO) != null) {
                    W(kVar);
                } else {
                    if (zO) {
                        arrayList2.add(new i0(strK, "subs"));
                    } else {
                        arrayList.add(new i0(strK, "inapp"));
                    }
                    hashtable.put(strK, kVar);
                }
            }
        }
        Consumer<List<com.android.billingclient.api.e>> consumer = new Consumer() { // from class: nj.u
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f25786a.g0(hashtable, (List) obj);
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

    public final void W(w7.k kVar) {
        ok.q.h("rbx.purchaseflow", "Handle single purchase. Product id: " + nj.b.k(kVar) + ". Order id: " + kVar.b() + ". isAcknowledged: " + kVar.i());
        int iF = kVar.f();
        if (iF == 0) {
            this.b.B();
        } else if (iF == 2) {
            this.b.p();
        }
        if (kVar.f() != 1) {
            return;
        }
        this.f25648k.put(j0.e(kVar), kVar);
        String strK = nj.b.k(kVar);
        if (strK == null) {
            ok.q.e("rbx.purchaseflow", "Failed in handling single purchase. Product ID is null. Purchase: " + kVar);
            return;
        }
        if (!e0.m(strK)) {
            w7.a aVarA = kVar.a();
            if (aVarA == null) {
                ok.q.e("rbx.purchaseflow", "Failed in handling single purchase. accountIdentifiers is null. Purchase: " + kVar);
                return;
            }
            String strA = aVarA.a();
            String strB = aVarA.b();
            if ((!this.f25651n.f() || !Objects.equals(this.f25651n.e(), strA)) && (strB == null || strB.isEmpty())) {
                this.b.g();
                if (!this.f25651n.f()) {
                    this.b.h();
                    return;
                } else {
                    if (Objects.equals(this.f25651n.e(), strA)) {
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
        return !this.f25648k.isEmpty();
    }

    public boolean Y() {
        return this.f25651n.getProductId() != null;
    }

    public boolean Z() {
        h0 h0Var = this.f25639a;
        return h0Var != null && this.f25643f == e.READY && h0Var.a();
    }

    @Override // mj.k
    @Deprecated
    public boolean a(String str, long j10, String str2, String str3, Activity activity) {
        return false;
    }

    public boolean a0() {
        return (this.f25651n.i() && Z()) ? false : true;
    }

    @Override // mj.k
    public boolean b(String str, String str2, Activity activity, long j10, mj.o oVar) {
        return x0(str2, activity, j10, oVar, false, null, false);
    }

    public final /* synthetic */ void b0(w7.k kVar, boolean z10, PurchaseVerificationResponse purchaseVerificationResponse, com.android.billingclient.api.d dVar) {
        int iC = dVar.c();
        boolean z11 = iC == 0;
        this.b.a(this.f25651n.j(), "OnAcknowledgePurchaseResponse. Success: " + z11 + ". Message: " + dVar + ".");
        boolean z12 = nj.b.j(kVar) != null;
        if (z12) {
            this.b.f("Android-Purchase-Completed-With-Checkout-Session-Id");
        }
        if (z11) {
            if (z10) {
                this.b.f("Play-Points-Ack-Purchase-Succeed");
            }
            J(kVar, nj.e.b.SUCCESS, n0.b(purchaseVerificationResponse));
            return;
        }
        if (z10) {
            this.b.f("Play-Points-Ack-Purchase-Fail");
        }
        ok.q.k("rbx.purchaseflow", "Failed to acknowledge Purchase");
        this.b.d(this.f25651n.getIsInAppPurchase());
        if (z12) {
            U(kVar, iC);
        }
    }

    @Override // mj.k
    public void c(String str, Uri uri, String str2, @NonNull f4.v vVar, mj.o oVar, Runnable runnable) {
        if (uri == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ok.q.h("rbx.purchaseflow", "UriObject: " + uri);
        if (l(str2, str, vVar, oVar, Boolean.TRUE.equals(ok.e0.a(uri, "recurring")), ok.e0.c(uri, "paymentSessionId")) || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final /* synthetic */ void c0(String str, w7.k kVar, com.android.billingclient.api.d dVar, String str2) {
        boolean z10 = dVar.c() == 0;
        this.b.a(this.f25651n.j(), "OnConsumeResponse. Success: " + z10 + ". Message: " + dVar + ".");
        if (z10) {
            if (e0.m(str)) {
                this.b.f("Play-Points-Consume-Purchase-Succeed");
            }
            o0(str, nj.e.b.SUCCESS);
            com.android.billingclient.api.e eVarS = S(str, false);
            if (eVarS == null || !j0.i(eVarS, false)) {
                ok.q.h("rbx.purchaseflow", "Invalid product details for productId " + str + ". ProductDetails: " + j0.j(eVarS, false));
            } else {
                this.b.b(str, e0.g(eVarS, false), e0.i(eVarS, false), e0.h(eVarS, false));
            }
            this.f25648k.remove(j0.e(kVar));
        } else {
            if (e0.m(str)) {
                this.b.f("Play-Points-Consume-Purchase-Fail");
            }
            this.b.e(this.f25651n.getIsInAppPurchase());
            p0(nj.b.k(kVar), nj.e.b.CONSUME_ERROR, "OnAcknowledgePurchaseResponse failure");
        }
        ok.q.h("rbx.purchaseflow", "End consume flow.");
    }

    @Override // mj.k
    public boolean d(long j10, String str, String str2, final Activity activity, boolean z10, mj.o oVar) {
        final nj.c cVar = new nj.c(str2);
        if (!cVar.b()) {
            ok.q.e("rbx.purchaseflow", "Purchase request is invalid. Raw payload: " + str2);
            return false;
        }
        if (cVar.c() && this.f25639a.b("subscriptions").c() != 0) {
            ok.q.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return false;
        }
        if (cVar.f() == null) {
            ok.q.e("rbx.purchaseflow", "The provider product id is null.");
            return false;
        }
        this.f25651n = new CurrentPurchaseContext(cVar.f(), j10, !z10, cVar.c(), null);
        this.f25641d = oVar;
        ok.q.h("rbx.purchaseflow", "Initiated purchase. Params: " + cVar);
        if (a0()) {
            ok.q.e("rbx.purchaseflow", "Purchasing is not enabled. Params: " + cVar);
            return false;
        }
        if (cVar.c()) {
            this.f25649l.put(cVar.f(), str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i0(cVar.f(), cVar.g()));
        r0(arrayList, new Consumer() { // from class: nj.z
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f25795a.m0(cVar, activity, (List) obj);
            }
        });
        return true;
    }

    public final /* synthetic */ void d0(w7.k kVar, mj.r.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
        this.b.a(this.f25651n.j(), "VerifyPurchase. Response=" + bVar + ". ReceiptId=" + kVar.b());
        mj.o oVar = this.f25641d;
        if (oVar != null) {
            oVar.d();
        }
        if (bVar != mj.r.b.OK && !kVar.i()) {
            this.b.A();
        }
        int i10 = d.f25658c[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                this.b.D(this.f25651n.getIsInAppPurchase());
                p0(nj.b.k(kVar), nj.e.b.RECEIPT_VERIFICATION_ERROR, "launchVerifyPurchaseReceipt error");
                return;
            } else if (i10 != 3) {
                this.b.E(this.f25651n.getIsInAppPurchase());
                p0(nj.b.k(kVar), nj.e.b.UNKNOWN, "launchVerifyPurchaseReceipt unknown error");
                return;
            } else {
                this.b.C(this.f25651n.getIsInAppPurchase());
                p0(nj.b.k(kVar), nj.e.b.RECEIPT_EMPTY, "launchVerifyPurchaseReceipt empty response");
                return;
            }
        }
        String strK = nj.b.k(kVar);
        if (e0.o(kVar)) {
            ok.q.h("rbx.purchaseflow", "Receipt Verification Successful for Subscription");
            if (strK != null && e0.n(strK)) {
                nk.c.c().t(nk.c.c().f() + mj.p.e(strK));
            }
            boolean zO = e0.o(kVar);
            com.android.billingclient.api.e eVarS = S(strK, zO);
            if (eVarS == null || !j0.i(eVarS, zO)) {
                ok.q.h("rbx.purchaseflow", "Invalid product details for productId " + strK + ". ProductDetails: " + j0.j(eVarS, zO));
            } else {
                this.b.b(strK, e0.g(eVarS, zO), e0.i(eVarS, zO), e0.h(eVarS, zO));
            }
        }
        H(kVar, purchaseVerificationResponse);
    }

    @Override // mj.k
    @Deprecated
    public String e(String str) {
        return null;
    }

    public final /* synthetic */ void e0(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            ok.q.d("Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.b.a(this.f25651n.j(), "QueryInAppPurchases. ItemsCount: " + list.size() + ". Items: " + l0.b(list));
        V(list);
    }

    @Override // mj.k
    public boolean f(String str, String str2, Activity activity, mj.o oVar, boolean z10) {
        return x0(str2, activity, nk.c.c().j(), oVar, z10, null, true);
    }

    public final /* synthetic */ void f0(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            ok.q.d("Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.b.a(this.f25651n.j(), "QuerySubsPurchases. ItemsCount: " + list.size() + ". Items: " + l0.b(list));
        V(list);
    }

    @Override // mj.k
    @Deprecated
    public boolean g(String str, long j10, String str2, Activity activity, String str3) {
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
                ok.q.e("rbx.purchaseflow", "Null product details in list");
            } else {
                String strD = eVar.d();
                if (map.containsKey(strD)) {
                    W((w7.k) map.get(strD));
                } else {
                    ok.q.e("rbx.purchaseflow", "Cannot find purchase associated with product details. ProductId: " + strD);
                }
            }
        }
    }

    @Override // mj.k
    @Deprecated
    public boolean h(String str, long j10, long j11) {
        return false;
    }

    public final /* synthetic */ void h0(String str, String str2) {
        q0(new long[0], 500, str, str2);
    }

    @Override // mj.k
    @Deprecated
    public boolean i(String str) {
        return false;
    }

    public final /* synthetic */ void i0(List list, Consumer consumer, com.android.billingclient.api.d dVar, w7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        if (dVar.c() != 0) {
            ok.q.e("rbx.purchaseflow", "Failed queryProductDetails. Products: " + list + ", BillingResult: " + dVar);
        } else {
            if (listA.isEmpty()) {
                ok.q.h("rbx.purchaseflow", "Returned no ProductDetails for Products: " + list);
                return;
            }
            for (com.android.billingclient.api.e eVar : listA) {
                if (eVar.e().equals("subs")) {
                    this.f25647j.put(eVar.d(), eVar);
                } else {
                    this.f25646i.put(eVar.d(), eVar);
                }
            }
            ok.q.h("rbx.purchaseflow", "queryProductDetails Success. Products: " + list);
        }
        consumer.accept(listA);
    }

    public final /* synthetic */ void j0(Runnable runnable, com.android.billingclient.api.d dVar, w7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        if (dVar.c() == 0) {
            ok.q.h("rbx.purchaseflow", "Returned INAPP ProductDetails. Count = " + listA.size());
            for (com.android.billingclient.api.e eVar : listA) {
                this.f25646i.put(eVar.d(), eVar);
            }
            ok.q.h("rbx.purchaseflow", "queryInAppProduct Success. Count = " + this.f25646i.size());
            this.f25644g = e.READY;
        } else {
            ok.q.h("rbx.purchaseflow", "Failed queryInAppProduct. BillingResult: " + dVar);
            this.f25644g = e.NONE;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // mj.k
    @Deprecated
    public void k(boolean z10) {
    }

    public final /* synthetic */ void k0(Runnable runnable, com.android.billingclient.api.d dVar, w7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        if (dVar.c() == 0) {
            ok.q.h("rbx.purchaseflow", "Returned SUBS ProductDetails. Count = " + listA.size());
            for (com.android.billingclient.api.e eVar : listA) {
                this.f25647j.put(eVar.d(), eVar);
            }
            ok.q.h("rbx.purchaseflow", "querySubsProduct Success. Count = " + this.f25647j.size());
            this.f25645h = e.READY;
        } else {
            ok.q.e("rbx.purchaseflow", "Failed querySubsProduct. BillingResult: " + dVar);
            this.f25645h = e.NONE;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // mj.k
    public boolean l(String str, String str2, Activity activity, mj.o oVar, boolean z10, String str3) {
        ok.q.h("rbx.purchaseflow", "startInAppPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + ", paymentSessionId: " + str3);
        return x0(str2, activity, nk.c.c().j(), oVar, z10, str3, true);
    }

    public final /* synthetic */ void l0(String str, boolean z10, String str2) {
        com.android.billingclient.api.e eVarS = S(str, z10);
        if (eVarS == null || !j0.i(eVarS, z10)) {
            p0(str, nj.e.b.FAILED_PRODUCT_NOT_FOUND, j0.j(eVarS, z10));
        } else {
            P(e0.i(eVarS, this.f25651n.getIsSubscriptionPurchase()), str2);
        }
    }

    @Override // mj.k
    @Deprecated
    public boolean m(String str) {
        return false;
    }

    public final /* synthetic */ void m0(nj.c cVar, Activity activity, List list) {
        if (list == null || list.isEmpty()) {
            p0(cVar.f(), nj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            return;
        }
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) list.get(0);
        String strF = cVar.f();
        boolean zC = cVar.c();
        if (eVar == null || !j0.i(eVar, zC)) {
            p0(strF, nj.e.b.FAILED_PRODUCT_NOT_FOUND, j0.j(eVar, zC));
        } else {
            Q(activity, null, cVar.a(), cVar.d());
        }
    }

    @Override // mj.k
    @Deprecated
    public void n(int i10) {
    }

    public final void n0(w7.k kVar) {
        String strK = nj.b.k(kVar);
        String strB = kVar.b();
        if (this.f25641d != null && e0.p(strK, this.f25651n.getProductId())) {
            ok.q.h("rbx.purchaseflow", "launchVerifyPurchaseReceipt onPurchaseVerificationStart");
            this.f25641d.b();
        }
        if (strK == null || strB == null) {
            ok.q.e("rbx.purchaseflow", "launchVerifyPurchaseReceipt failed. Invalid parameters: " + strB + ", " + strK);
            return;
        }
        ok.q.h("rbx.purchaseflow", "Start launchVerifyPurchaseReceipt: " + strB + ", " + strK);
        this.f25650m.a(kVar, strB, strK, this.f25651n.getIsInAppPurchase(), new f0.b() { // from class: nj.v
            @Override // nj.f0.b
            public final void a(String str, String str2) {
                this.f25787a.h0(str, str2);
            }
        });
    }

    public void q0(long[] jArr, int i10, String str, String str2) {
        mj.r.b bVar;
        ok.q.h("rbx.purchaseflow", "Verify Purchase callback. response code " + i10 + " grantedAssetIds = " + Arrays.toString(jArr) + ".");
        if (i10 == 200) {
            ok.q.h("rbx.purchaseflow", "Verification success");
            bVar = mj.r.b.OK;
            this.b.k();
        } else if (i10 == 500) {
            ok.q.e("rbx.purchaseflow", "Server error");
            bVar = mj.r.b.ERROR;
            this.b.n();
        } else if (i10 == 400) {
            ok.q.e("rbx.purchaseflow", "Service was unable to validate receiptId.");
            bVar = mj.r.b.ERROR;
            this.b.l();
        } else if (i10 != 401) {
            ok.q.e("rbx.purchaseflow", "Unknown");
            bVar = mj.r.b.UNKNOWN;
            this.b.o();
        } else {
            ok.q.e("rbx.purchaseflow", "Unauthorized to make request.");
            bVar = mj.r.b.BOGUS;
            this.b.m();
        }
        PurchaseVerificationResponse purchaseVerificationResponse = new PurchaseVerificationResponse(pj.a.b(jArr));
        if (str == null) {
            str = str2;
        }
        w7.k kVar = this.f25648k.get(str);
        if (kVar == null) {
            ok.q.e("rbx.purchaseflow", "Verify Purchase callback. purchaseKey: " + str + "not found.");
            this.b.A();
            return;
        }
        ok.q.h("rbx.purchaseflow", "Verify Purchase callback. purchaseKey: " + str + ", purchase: " + kVar.b());
        O(kVar).a(bVar, purchaseVerificationResponse);
    }

    public final void r0(final List<i0> list, final Consumer<List<com.android.billingclient.api.e>> consumer) {
        if (this.f25639a.b("fff").c() != 0) {
            ok.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.b.t(this.f25651n.getIsInAppPurchase());
            consumer.accept(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (i0 i0Var : list) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(i0Var.getProviderProductId()).c(i0Var.getProductType()).a());
        }
        this.f25639a.c(com.android.billingclient.api.f.a().b(arrayList).a(), new w7.j() { // from class: nj.x
            @Override // w7.j
            public final void a(com.android.billingclient.api.d dVar, w7.n nVar) {
                this.f25790a.i0(list, consumer, dVar, nVar);
            }
        });
    }

    public final void s0(final Runnable runnable) {
        ok.q.h("rbx.purchaseflow", "Attempt queryInAppProduct");
        if (this.f25639a.b("fff").c() != 0) {
            ok.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.b.t(this.f25651n.getIsInAppPurchase());
            return;
        }
        e eVar = this.f25644g;
        if (eVar == e.READY) {
            ok.q.h("rbx.purchaseflow", "queryInAppProduct is setup already");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (eVar != e.NONE) {
            ok.q.h("rbx.purchaseflow", "queryInAppProduct is pending");
            return;
        }
        List<String> listE = e0.e();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(it.next()).c("inapp").a());
        }
        com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f25644g = e.CONNECTING;
        ok.q.h("rbx.purchaseflow", "Querying INAPP ProductDetails. Count = " + arrayList.size());
        this.f25639a.c(fVarA, new w7.j() { // from class: nj.q
            @Override // w7.j
            public final void a(com.android.billingclient.api.d dVar, w7.n nVar) {
                this.f25780a.j0(runnable, dVar, nVar);
            }
        });
    }

    public final void t0(final Runnable runnable) {
        ok.q.h("rbx.purchaseflow", "Attempt querySubsProduct");
        if (this.f25639a.b("subscriptions").c() != 0) {
            ok.q.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return;
        }
        if (this.f25639a.b("fff").c() != 0) {
            ok.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.b.t(this.f25651n.getIsInAppPurchase());
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        e eVar = this.f25645h;
        if (eVar == e.READY) {
            ok.q.h("rbx.purchaseflow", "querySubsProduct is setup already");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (eVar != e.NONE) {
            ok.q.h("rbx.purchaseflow", "querySubsProduct is pending");
            return;
        }
        List<String> listF = e0.f();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(it.next()).c("subs").a());
        }
        com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f25645h = e.CONNECTING;
        ok.q.h("rbx.purchaseflow", "Querying SUBS ProductDetails. Count = " + arrayList.size());
        this.f25639a.c(fVarA, new w7.j() { // from class: nj.p
            @Override // w7.j
            public final void a(com.android.billingclient.api.d dVar, w7.n nVar) {
                this.f25779a.k0(runnable, dVar, nVar);
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
            if (bi.h.a().D0()) {
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
        e eVar = this.f25643f;
        if (eVar == e.READY) {
            ok.q.h("rbx.purchaseflow", "Google Billing Client for payments protocol is already setup");
            return;
        }
        e eVar2 = e.CONNECTING;
        if (eVar == eVar2) {
            ok.q.h("rbx.purchaseflow", "Google Billing Client for payments protocol is already connecting");
            return;
        }
        this.f25639a.e(aVar);
        this.f25643f = eVar2;
        ok.q.h("rbx.purchaseflow", "Connecting Google Billing's Client for payments protocol");
        this.f25639a.i(new a());
    }

    public final boolean x0(final String str, Activity activity, long j10, mj.o oVar, final boolean z10, final String str2, boolean z11) {
        ok.q.h("rbx.purchaseflow", "startPurchase productId: " + str + ", isSubscriptionPurchase: " + z10 + ", isInApp: " + z11 + ", userId: " + j10);
        if (str == null) {
            ok.q.e("rbx.purchaseflow", "Purchase product id is null.");
            return false;
        }
        this.f25651n = new CurrentPurchaseContext(str, j10, z11, e0.n(str), null);
        this.f25641d = oVar;
        if (a0()) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: nj.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f25792a.l0(str, z10, str2);
            }
        };
        if (this.f25651n.getIsSubscriptionPurchase()) {
            t0(runnable);
            return true;
        }
        s0(runnable);
        return true;
    }

    public final void y0(w7.k kVar, String str) {
        String strK = nj.b.k(kVar);
        if (strK == null) {
            ok.q.e("rbx.purchaseflow", "Failed to verify purchase. Product ID is null. Purchase: " + kVar);
            return;
        }
        boolean zM = e0.m(strK);
        b0 b0Var = this.f25642e;
        boolean z10 = b0Var != null && b0Var.c(str);
        if (!kVar.i() || (zM && !z10)) {
            n0(kVar);
        } else {
            J(kVar, nj.e.b.ALREADY_ACKNOWLEDGED, new RobloxPurchaseInfo());
        }
    }
}
