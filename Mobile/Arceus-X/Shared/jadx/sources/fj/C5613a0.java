package fj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.android.billingclient.api.AbstractC1745a;
import com.android.billingclient.api.C1747c;
import com.android.billingclient.api.C1748d;
import com.android.billingclient.api.C1749e;
import com.android.billingclient.api.C1750f;
import com.roblox.client.purchase.C3219a;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.purchase.model.PurchaseVerificationResponse;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.OOAPPurchaseFinishedParams;
import fk.C5654c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import p093e4.ActivityC4831q;
import p104ei.C5130h;
import p104ei.InterfaceC5128f;
import p105ej.AbstractC5153k;
import p105ej.C5155m;
import p105ej.InterfaceC5149g;
import p105ej.InterfaceC5152j;
import p151gk.C6112e0;
import p151gk.C6124q;
import p174hj.C6410a;
import p174hj.ValidatePurchaseResponsePayload;
import p486v7.C12014a;
import p486v7.C12018b;
import p486v7.C12030e;
import p486v7.C12046i;
import p486v7.C12052k;
import p486v7.C12061n;
import p486v7.C12064o;
import p486v7.InterfaceC12022c;
import p486v7.InterfaceC12026d;
import p486v7.InterfaceC12034f;
import p486v7.InterfaceC12049j;
import p486v7.InterfaceC12055l;
import p486v7.InterfaceC12058m;
import p517wh.InterfaceC12458r0;
import sg.C11295a1;
import th.C11659h;

/* JADX INFO: renamed from: fj.a0 */
/* JADX INFO: loaded from: classes2.dex */
public class C5613a0 implements InterfaceC5149g {

    /* JADX INFO: renamed from: q */
    public static volatile C5613a0 f21494q;

    /* JADX INFO: renamed from: a */
    public InterfaceC5627h0 f21495a;

    /* JADX INFO: renamed from: b */
    public final C5638n f21496b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5128f f21497c;

    /* JADX INFO: renamed from: d */
    public InterfaceC5152j f21498d;

    /* JADX INFO: renamed from: e */
    public final C5615b0 f21499e;

    /* JADX INFO: renamed from: f */
    public e f21500f;

    /* JADX INFO: renamed from: g */
    public e f21501g;

    /* JADX INFO: renamed from: h */
    public e f21502h;

    /* JADX INFO: renamed from: i */
    public final Hashtable<String, C1749e> f21503i;

    /* JADX INFO: renamed from: j */
    public final Hashtable<String, C1749e> f21504j;

    /* JADX INFO: renamed from: k */
    public final Hashtable<String, C12052k> f21505k;

    /* JADX INFO: renamed from: l */
    public final Hashtable<String, String> f21506l;

    /* JADX INFO: renamed from: m */
    public final C5623f0 f21507m;

    /* JADX INFO: renamed from: n */
    public CurrentPurchaseContext f21508n;

    /* JADX INFO: renamed from: o */
    public boolean f21509o;

    /* JADX INFO: renamed from: p */
    public final C3219a.f f21510p;

    /* JADX INFO: renamed from: fj.a0$a */
    public class a implements InterfaceC12026d {
        public a() {
        }

        @Override // p486v7.InterfaceC12026d
        /* JADX INFO: renamed from: a */
        public void mo25422a(C1748d c1748d) {
            int iM8610c = c1748d.m8610c();
            if (iM8610c == 0) {
                C6124q.m27063h("rbx.purchaseflow", "Google Billing Client for payments protocol is setup");
                C5613a0.this.f21500f = e.READY;
                return;
            }
            if (iM8610c == 3) {
                C6124q.m27066k("rbx.purchaseflow", "Google Billing Client unavailable (Play Store blocked). BillingResult: " + c1748d);
                C5613a0.this.f21496b.m25641f("Android-Billing-Unavailable-Store-Blocked");
            } else {
                C6124q.m27060e("rbx.purchaseflow", "Google Billing Client for payments protocol is not setup");
            }
            C5613a0.this.f21500f = e.NONE;
        }

        @Override // p486v7.InterfaceC12026d
        /* JADX INFO: renamed from: b */
        public void mo25423b() {
            C6124q.m27063h("rbx.purchaseflow", "Google Billing Client for payments protocol disconnected");
            C5613a0.this.f21500f = e.NONE;
        }
    }

    /* JADX INFO: renamed from: fj.a0$b */
    public class b implements InterfaceC12058m {
        public b() {
        }

        @Override // p486v7.InterfaceC12058m
        /* JADX INFO: renamed from: a */
        public void mo25424a(@NonNull C1748d c1748d, List<C12052k> list) {
            if (C5613a0.this.f21495a == null) {
                return;
            }
            int iM8610c = c1748d.m8610c();
            if (iM8610c == 0) {
                C5613a0.this.m25395V(list);
                return;
            }
            if (iM8610c == 1) {
                C5613a0 c5613a0 = C5613a0.this;
                c5613a0.m25377p0(c5613a0.f21508n.getProductId(), C5620e.b.USER_CANCELLED, "User cancelled");
                return;
            }
            if (iM8610c == 3) {
                C5613a0.this.f21496b.m25641f("Android-Billing-Unavailable-Store-Blocked");
                C5613a0 c5613a1 = C5613a0.this;
                c5613a1.m25377p0(c5613a1.f21508n.getProductId(), C5620e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated: BILLING_UNAVAILABLE (Play Store blocked)");
            } else if (iM8610c != 7) {
                C5613a0 c5613a2 = C5613a0.this;
                c5613a2.m25377p0(c5613a2.f21508n.getProductId(), C5620e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
            } else {
                C6124q.m27066k("rbx.purchaseflow", "onPurchasesUpdated: ITEM_ALREADY_OWNED.");
                C5613a0.this.m25372T();
            }
        }
    }

    /* JADX INFO: renamed from: fj.a0$c */
    public class c implements C3219a.f {
        public c() {
        }

        @Override // com.roblox.client.purchase.C3219a.f
        /* JADX INFO: renamed from: a */
        public void mo15396a(C3219a.e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
            C5613a0.this.f21496b.m25636a(C5613a0.this.f21508n.m25358j(), "ValidationCheck: " + eVar + ".");
            switch (d.f21514a[eVar.ordinal()]) {
                case 1:
                    if (validatePurchaseResponsePayload != null) {
                        C5613a0 c5613a0 = C5613a0.this;
                        c5613a0.f21508n = c5613a0.f21508n.m25349a(C5613a0.this.f21508n.getProductId(), C5613a0.this.f21508n.getUserId(), C5613a0.this.f21508n.getIsInAppPurchase(), C5613a0.this.f21508n.getIsSubscriptionPurchase(), validatePurchaseResponsePayload.getCheckoutSessionId());
                        IAPPurchaseManager.nativeInvokeStore(str, validatePurchaseResponsePayload.getUserId().longValue(), validatePurchaseResponsePayload.getCheckoutSessionId());
                    } else {
                        C5613a0.this.f21496b.m25653r(C5613a0.this.f21508n.getIsInAppPurchase());
                        C5613a0.this.m25377p0(str, C5620e.b.VALIDATION_ERROR, "validatePurchaseResponsePayload is null");
                    }
                    break;
                case 2:
                    C5613a0.this.f21496b.m25653r(C5613a0.this.f21508n.getIsInAppPurchase());
                    C5613a0.this.m25377p0(str, C5620e.b.VALIDATION_ERROR, "PrePurchaseValidation error");
                    break;
                case 3:
                    C5613a0.this.f21496b.m25656u(C5613a0.this.f21508n.getIsInAppPurchase());
                    C5613a0.this.m25377p0(str, C5620e.b.VALIDATION_RETRY, "PrePurchaseValidation retry");
                    break;
                case 4:
                    C5613a0.this.f21496b.m25654s(C5613a0.this.f21508n.getIsInAppPurchase());
                    C5613a0.this.m25377p0(str, C5620e.b.VALIDATION_LIMIT, "PrePurchaseValidation limit");
                    break;
                case 5:
                    C5613a0.this.f21496b.m25654s(C5613a0.this.f21508n.getIsInAppPurchase());
                    C5613a0.this.m25377p0(str, C5620e.b.VALIDATION_LIMIT_UNDER_13, "PrePurchaseValidation limit");
                    break;
                case 6:
                    C5613a0.this.f21496b.m25652q(C5613a0.this.f21508n.getIsInAppPurchase());
                    C5613a0.this.m25377p0(str, C5620e.b.REQUEST_BALANCE_ERROR, "PrePurchaseValidation requestBalance failed.");
                    break;
                default:
                    C5613a0.this.f21496b.m25657v(C5613a0.this.f21508n.getIsInAppPurchase());
                    C5613a0.this.m25377p0(str, C5620e.b.UNKNOWN, "PrePurchaseValidation Unknown error.");
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: fj.a0$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21514a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f21515b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f21516c;

        static {
            int[] iArr = new int[C5155m.b.values().length];
            f21516c = iArr;
            try {
                iArr[C5155m.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21516c[C5155m.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21516c[C5155m.b.EMPTY_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C5620e.b.values().length];
            f21515b = iArr2;
            try {
                iArr2[C5620e.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21515b[C5620e.b.USER_CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21515b[C5620e.b.ALREADY_ACKNOWLEDGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[C3219a.e.values().length];
            f21514a = iArr3;
            try {
                iArr3[C3219a.e.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21514a[C3219a.e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21514a[C3219a.e.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21514a[C3219a.e.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21514a[C3219a.e.LIMIT_UNDER_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21514a[C3219a.e.ERROR_CHECKING_BALANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: fj.a0$e */
    public enum e {
        NONE,
        CONNECTING,
        READY
    }

    public C5613a0(Context context) {
        e eVar = e.NONE;
        this.f21500f = eVar;
        this.f21501g = eVar;
        this.f21502h = eVar;
        this.f21503i = new Hashtable<>();
        this.f21504j = new Hashtable<>();
        this.f21505k = new Hashtable<>();
        this.f21506l = new Hashtable<>();
        this.f21508n = CurrentPurchaseContext.f21488g;
        this.f21509o = false;
        this.f21510p = new c();
        this.f21507m = new C5623f0();
        this.f21495a = new C5614b();
        this.f21496b = new C5638n();
        this.f21497c = new C5130h();
        m25419w0(AbstractC1745a.m8460f(context).m8471c(m25391N()).m8470b(C12046i.m44860c().m44864b().m44865c().m44863a()).m8469a());
        this.f21499e = new C5615b0(context);
    }

    /* JADX INFO: renamed from: H */
    private void m25366H(final C12052k c12052k, final PurchaseVerificationResponse purchaseVerificationResponse) {
        String strM25427j = C5614b.m25427j(c12052k);
        if (strM25427j == null) {
            C6124q.m27060e("rbx.purchaseflow", "Failed to acknowledge purchase. Product ID is null. Purchase: " + c12052k);
            this.f21496b.m25639d(this.f21508n.getIsInAppPurchase());
            return;
        }
        final boolean zM25460m = C5621e0.m25460m(strM25427j);
        if (!c12052k.m44888i() || zM25460m) {
            C6124q.m27063h("rbx.purchaseflow", "Acknowledging Purchase");
            m25367I(c12052k, new InterfaceC12022c() { // from class: fj.t
                @Override // p486v7.InterfaceC12022c
                /* JADX INFO: renamed from: a */
                public final void mo25628a(C1748d c1748d) {
                    this.f21677a.m25401b0(c12052k, zM25460m, purchaseVerificationResponse, c1748d);
                }
            });
        } else {
            C6124q.m27063h("rbx.purchaseflow", "Attempted to acknowledge an acknowledged purchase.");
            m25368J(c12052k, C5620e.b.ALREADY_ACKNOWLEDGED, C5639n0.m25663b(purchaseVerificationResponse));
        }
    }

    /* JADX INFO: renamed from: I */
    private void m25367I(C12052k c12052k, InterfaceC12022c interfaceC12022c) {
        C6124q.m27063h("rbx.purchaseflow", "Start acknowledging Purchase");
        this.f21495a.mo25431d(C12018b.m44842b().m44846b(c12052k.m44886g()).m44845a(), interfaceC12022c);
    }

    /* JADX INFO: renamed from: J */
    private void m25368J(C12052k c12052k, C5620e.b bVar, RobloxPurchaseInfo robloxPurchaseInfo) {
        C6124q.m27063h("rbx.purchaseflow", "Acknowledged Purchase");
        if (C5621e0.m25462o(c12052k)) {
            this.f21505k.remove(C5631j0.m25479e(c12052k));
            m25375o0(C5614b.m25427j(c12052k), bVar);
            return;
        }
        String strM25427j = C5614b.m25427j(c12052k);
        if (strM25427j == null) {
            C6124q.m27060e("rbx.purchaseflow", "Failed to complete acknowledge purchase. Product ID is null. Purchase: " + c12052k);
            this.f21496b.m25638c(this.f21508n.getIsInAppPurchase());
            return;
        }
        String strM25479e = C5631j0.m25479e(c12052k);
        boolean zM25460m = C5621e0.m25460m(strM25427j);
        boolean zM25438c = this.f21499e.m25438c(strM25479e);
        if (zM25460m) {
            if (zM25438c) {
                this.f21496b.m25641f("Play-Points-Not-Show-Confirmation-Screen");
            } else {
                this.f21496b.m25641f("Play-Points-Show-Confirmation-Screen");
                C1749e c1749eM25371S = m25371S(strM25427j, false);
                if (c1749eM25371S == null) {
                    C6124q.m27060e("rbx.purchaseflow", "Failed to complete acknowledge purchase for a play point product. ProductDetails is null. Purchase: " + c12052k);
                    return;
                }
                NativeGLInterface.nativeOOAPPurchaseFinished(OOAPPurchaseFinishedParams.builder().setProductId(strM25427j).setNativeProductId(strM25427j).setRobuxAmount(0).setDescription(c1749eM25371S.m8615a()).setDisplayPrice(C5631j0.m25477c(c1749eM25371S)).setPrice(C5631j0.m25480f(c1749eM25371S)).setCurrencyCode(C5631j0.m25476b(c1749eM25371S)).setRobloxPurchaseInfo(C5639n0.m25662a(robloxPurchaseInfo)).build());
                this.f21499e.m25436a(strM25479e);
            }
        }
        m25369M(c12052k);
    }

    /* JADX INFO: renamed from: M */
    private void m25369M(final C12052k c12052k) {
        final String strM25427j = C5614b.m25427j(c12052k);
        if (strM25427j == null) {
            C6124q.m27060e("rbx.purchaseflow", "Failed to consume purchase. Product ID is null. Purchase: " + c12052k);
            return;
        }
        if (C11659h.m43403a().mo43709r0() || !C5621e0.m25459l(strM25427j)) {
            C6124q.m27063h("rbx.purchaseflow", "Consuming Purchase");
            this.f21495a.mo25430c(C12030e.m44847b().m44851b(c12052k.m44886g()).m44850a(), new InterfaceC12034f() { // from class: fj.w
                @Override // p486v7.InterfaceC12034f
                /* JADX INFO: renamed from: a */
                public final void mo25629a(C1748d c1748d, String str) {
                    this.f21684a.m25402c0(strM25427j, c12052k, c1748d, str);
                }
            });
        } else if (C5621e0.m25460m(strM25427j)) {
            this.f21496b.m25641f("Play-Points-Not-Consume-Purchase");
        }
    }

    /* JADX INFO: renamed from: R */
    public static C5613a0 m25370R(Context context) {
        if (f21494q == null) {
            synchronized (C5613a0.class) {
                try {
                    if (f21494q == null) {
                        f21494q = new C5613a0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21494q;
    }

    /* JADX INFO: renamed from: S */
    private C1749e m25371S(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        return z10 ? this.f21504j.get(str) : this.f21503i.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m25372T() {
        C6124q.m27063h("rbx.purchaseflow", "Do Google Purchase GrantPending");
        if (m25400a0()) {
            return;
        }
        C12064o c12064oM44905a = C12064o.m44900b().m44906b("inapp").m44905a();
        C12064o c12064oM44905a2 = C12064o.m44900b().m44906b("subs").m44905a();
        this.f21495a.mo25434g(c12064oM44905a, new InterfaceC12055l() { // from class: fj.o
            @Override // p486v7.InterfaceC12055l
            /* JADX INFO: renamed from: a */
            public final void mo25471a(C1748d c1748d, List list) {
                this.f21669a.m25404e0(c1748d, list);
            }
        });
        this.f21495a.mo25434g(c12064oM44905a2, new InterfaceC12055l() { // from class: fj.r
            @Override // p486v7.InterfaceC12055l
            /* JADX INFO: renamed from: a */
            public final void mo25471a(C1748d c1748d, List list) {
                this.f21674a.m25405f0(c1748d, list);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    private void m25373U(C12052k c12052k, int i10) {
        C6124q.m27063h("rbx.purchaseflow", "Acknowledge error, response code: " + i10 + ", skipping client side acknowledge purchase.");
        this.f21496b.m25641f("Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore");
        this.f21505k.remove(C5631j0.m25479e(c12052k));
        String strM25427j = C5614b.m25427j(c12052k);
        if (!C5621e0.m25462o(c12052k)) {
            C1749e c1749eM25371S = m25371S(strM25427j, false);
            if (c1749eM25371S == null || !C5631j0.m25483i(c1749eM25371S, false)) {
                C6124q.m27063h("rbx.purchaseflow", "Invalid product details for productId " + strM25427j + ". ProductDetails: " + C5631j0.m25484j(c1749eM25371S, false));
            } else {
                this.f21496b.m25637b(strM25427j, C5621e0.m25454g(c1749eM25371S, false), C5621e0.m25456i(c1749eM25371S, false), C5621e0.m25455h(c1749eM25371S, false));
            }
        }
        m25375o0(strM25427j, C5620e.b.SUCCESS);
    }

    /* JADX INFO: renamed from: o0 */
    private void m25375o0(String str, C5620e.b bVar) {
        int i10 = d.f21515b[bVar.ordinal()];
        if (i10 == 1) {
            this.f21496b.m25661z(this.f21508n.getIsInAppPurchase());
        } else if (i10 == 2) {
            this.f21496b.m25659x(this.f21508n.getIsInAppPurchase());
        } else if (i10 != 3) {
            this.f21496b.m25660y(this.f21508n.getIsInAppPurchase());
        } else {
            this.f21496b.m25658w(this.f21508n.getIsInAppPurchase());
        }
        if (this.f21498d != null && C5621e0.m25463p(str, this.f21508n.getProductId())) {
            InterfaceC5152j interfaceC5152j = this.f21498d;
            if (interfaceC5152j instanceof InterfaceC12458r0) {
                InterfaceC12458r0 interfaceC12458r0 = (InterfaceC12458r0) interfaceC5152j;
                CurrentPurchaseContext currentPurchaseContext = this.f21508n;
                if (currentPurchaseContext != CurrentPurchaseContext.f21488g) {
                    String checkoutSessionId = currentPurchaseContext.getCheckoutSessionId() != null ? this.f21508n.getCheckoutSessionId() : "";
                    if (this.f21506l.containsKey(str)) {
                        interfaceC12458r0.mo15386a(bVar == C5620e.b.SUCCESS, this.f21508n.getUserId(), this.f21506l.get(str), checkoutSessionId);
                    } else {
                        interfaceC12458r0.mo15386a(bVar == C5620e.b.SUCCESS, this.f21508n.getUserId(), this.f21508n.getProductId(), checkoutSessionId);
                    }
                } else {
                    C6124q.m27066k("rbx.purchaseflow", "CurrentPurchaseContext is empty. Unable to notify purchase finished with userId and productId.");
                    this.f21496b.m25645j(this.f21508n.getIsInAppPurchase());
                }
            } else {
                interfaceC5152j.mo15035e(new C5620e(bVar, this.f21508n.getProductId(), this.f21508n.getCheckoutSessionId()));
            }
        }
        if (C5621e0.m25463p(str, this.f21508n.getProductId())) {
            m25383u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public void m25377p0(String str, C5620e.b bVar, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        this.f21496b.m25636a(this.f21508n.m25358j(), str2);
        m25375o0(str, bVar);
    }

    /* JADX INFO: renamed from: u0 */
    private void m25383u0() {
        this.f21498d = null;
        this.f21508n = CurrentPurchaseContext.f21488g;
    }

    /* JADX INFO: renamed from: K */
    public void m25389K(long j10, boolean z10) {
        CurrentPurchaseContext currentPurchaseContext = this.f21508n;
        this.f21508n = currentPurchaseContext.m25349a(currentPurchaseContext.getProductId(), j10, this.f21508n.getIsInAppPurchase(), this.f21508n.getIsSubscriptionPurchase(), this.f21508n.getCheckoutSessionId());
        m25390L(z10);
    }

    /* JADX INFO: renamed from: L */
    public void m25390L(boolean z10) {
        CurrentPurchaseContext currentPurchaseContext = this.f21508n;
        this.f21508n = currentPurchaseContext.m25349a(currentPurchaseContext.getProductId(), this.f21508n.getUserId(), this.f21508n.getIsInAppPurchase(), this.f21508n.getIsSubscriptionPurchase(), this.f21508n.getCheckoutSessionId());
        C6124q.m27063h("rbx.purchaseflow", "attemptGrantPendingPurchases userId: " + this.f21508n.getUserId() + ", isAppResume:" + z10);
        if (!m25399Z()) {
            C6124q.m27063h("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchasing is not setup");
            return;
        }
        if (m25398Y()) {
            C6124q.m27063h("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchase already pending");
            return;
        }
        if (z10) {
            m25372T();
            return;
        }
        if (!m25397X()) {
            if (this.f21509o) {
                return;
            }
            m25372T();
            this.f21509o = true;
            return;
        }
        C6124q.m27063h("rbx.purchaseflow", "Found cached pending purchase. Count = " + this.f21505k.size());
        m25372T();
    }

    /* JADX INFO: renamed from: N */
    public final InterfaceC12058m m25391N() {
        return new b();
    }

    /* JADX INFO: renamed from: O */
    public final C5155m.c m25392O(final C12052k c12052k) {
        return new C5155m.c() { // from class: fj.s
            @Override // p105ej.C5155m.c
            /* JADX INFO: renamed from: a */
            public final void mo23991a(C5155m.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
                this.f21675a.m25403d0(c12052k, bVar, purchaseVerificationResponse);
            }
        };
    }

    /* JADX INFO: renamed from: P */
    public final void m25393P(String str, String str2) {
        InterfaceC5152j interfaceC5152j = this.f21498d;
        if (interfaceC5152j != null) {
            interfaceC5152j.mo15033c();
        }
        C3219a c3219a = new C3219a(this.f21497c);
        if (str2 == null || str2.isEmpty()) {
            str2 = null;
        }
        String str3 = str2;
        C6124q.m27063h("rbx.purchaseflow", "doPrePurchaseValidation sending paymentSessionId: " + str3);
        if (this.f21508n.getIsInAppPurchase()) {
            c3219a.m15390d(C11295a1.m42439b1(), this.f21508n.getProductId(), str, str3, this.f21508n.getIsInAppPurchase(), this.f21510p);
        } else {
            c3219a.m15388b(C11295a1.m42439b1(), this.f21508n.getProductId(), str, str3, this.f21508n.getIsInAppPurchase(), this.f21510p);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m25394Q(Activity activity, ValidatePurchaseResponsePayload validatePurchaseResponsePayload, String str, List<String> list) {
        String strM25478d;
        InterfaceC5152j interfaceC5152j = this.f21498d;
        if (interfaceC5152j != null) {
            interfaceC5152j.mo15034d();
        }
        this.f21496b.m25636a(this.f21508n.m25358j(), "PurchaseStarted.");
        String productId = this.f21508n.getProductId();
        boolean isSubscriptionPurchase = this.f21508n.getIsSubscriptionPurchase();
        C1749e c1749eM25371S = m25371S(productId, isSubscriptionPurchase);
        if (c1749eM25371S == null || !C5631j0.m25483i(c1749eM25371S, isSubscriptionPurchase)) {
            m25377p0(productId, C5620e.b.FAILED_PRODUCT_NOT_FOUND, C5631j0.m25484j(c1749eM25371S, isSubscriptionPurchase));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f21508n.getIsSubscriptionPurchase()) {
            if (C11659h.m43403a().mo43539T3()) {
                strM25478d = m25418v0(c1749eM25371S, list);
                if (strM25478d == null) {
                    m25377p0(productId, C5620e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + productId);
                    return;
                }
            } else {
                strM25478d = C5631j0.m25478d(c1749eM25371S);
            }
            arrayList.add(C1747c.b.m8585b().m8594c(c1749eM25371S).m8593b(strM25478d).m8592a());
        } else {
            arrayList.add(C1747c.b.m8585b().m8594c(c1749eM25371S).m8592a());
        }
        String strM25353e = this.f21508n.m25354f() ? this.f21508n.m25353e() : "";
        if (validatePurchaseResponsePayload != null && validatePurchaseResponsePayload.m27998e()) {
            strM25353e = validatePurchaseResponsePayload.m27997d();
        }
        C1747c.a aVarM8584d = C1747c.m8558b().m8582b(strM25353e).m8584d(arrayList);
        if (str != null) {
            aVarM8584d.m8583c(str);
            this.f21496b.m25641f("Android-Purchase-Initiated-With-Charge-Request-Id");
        } else if (validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getCheckoutSessionId() == null) {
            C6124q.m27066k("rbx.purchaseflow", "Both chargeRequestId and checkoutSessionId is null.");
            this.f21496b.m25641f("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
        } else {
            aVarM8584d.m8583c(validatePurchaseResponsePayload.getCheckoutSessionId());
            this.f21496b.m25641f("Android-Purchase-Initiated-With-Checkout-Session-Id");
        }
        C1747c c1747cM8581a = aVarM8584d.m8581a();
        if (activity.getIntent() == null) {
            activity.setIntent(new Intent());
        }
        if (this.f21495a.mo25435h(activity, c1747cM8581a).m8610c() != 0) {
            m25377p0(this.f21508n.getProductId(), C5620e.b.FAILED_PURCHASE_RESPONSE, "BillingClient.launchBillingFlow failed");
        }
    }

    /* JADX INFO: renamed from: V */
    public void m25395V(List<C12052k> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final Hashtable hashtable = new Hashtable();
        for (C12052k c12052k : list) {
            String strM25427j = C5614b.m25427j(c12052k);
            if (strM25427j == null) {
                C6124q.m27060e("rbx.purchaseflow", "Failed in handling purchases. Product ID is null. Purchase: " + c12052k);
            } else {
                boolean zM25462o = C5621e0.m25462o(c12052k);
                if (m25371S(strM25427j, zM25462o) != null) {
                    m25396W(c12052k);
                } else {
                    if (zM25462o) {
                        arrayList2.add(new C5629i0(strM25427j, "subs"));
                    } else {
                        arrayList.add(new C5629i0(strM25427j, "inapp"));
                    }
                    hashtable.put(strM25427j, c12052k);
                }
            }
        }
        Consumer<List<C1749e>> consumer = new Consumer() { // from class: fj.u
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f21681a.m25406g0(hashtable, (List) obj);
            }
        };
        if (!arrayList.isEmpty()) {
            m25415r0(arrayList, consumer);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        m25415r0(arrayList2, consumer);
    }

    /* JADX INFO: renamed from: W */
    public final void m25396W(C12052k c12052k) {
        C6124q.m27063h("rbx.purchaseflow", "Handle single purchase. Product id: " + C5614b.m25427j(c12052k) + ". Order id: " + c12052k.m44881b() + ". isAcknowledged: " + c12052k.m44888i());
        int iM44885f = c12052k.m44885f();
        if (iM44885f == 0) {
            this.f21496b.m25632B();
        } else if (iM44885f == 2) {
            this.f21496b.m25651p();
        }
        if (c12052k.m44885f() != 1) {
            return;
        }
        this.f21505k.put(C5631j0.m25479e(c12052k), c12052k);
        String strM25427j = C5614b.m25427j(c12052k);
        if (strM25427j == null) {
            C6124q.m27060e("rbx.purchaseflow", "Failed in handling single purchase. Product ID is null. Purchase: " + c12052k);
            return;
        }
        if (!C5621e0.m25460m(strM25427j)) {
            C12014a c12014aM44880a = c12052k.m44880a();
            if (c12014aM44880a == null) {
                C6124q.m27060e("rbx.purchaseflow", "Failed in handling single purchase. accountIdentifiers is null. Purchase: " + c12052k);
                return;
            }
            String strM44840a = c12014aM44880a.m44840a();
            String strM44841b = c12014aM44880a.m44841b();
            if ((!this.f21508n.m25354f() || !Objects.equals(this.f21508n.m25353e(), strM44840a)) && (strM44841b == null || strM44841b.isEmpty())) {
                this.f21496b.m25642g();
                if (!this.f21508n.m25354f()) {
                    this.f21496b.m25643h();
                    return;
                } else {
                    if (Objects.equals(this.f21508n.m25353e(), strM44840a)) {
                        return;
                    }
                    this.f21496b.m25644i();
                    return;
                }
            }
        }
        m25421y0(c12052k, C5631j0.m25479e(c12052k));
    }

    /* JADX INFO: renamed from: X */
    public boolean m25397X() {
        return !this.f21505k.isEmpty();
    }

    /* JADX INFO: renamed from: Y */
    public boolean m25398Y() {
        return this.f21508n.getProductId() != null;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m25399Z() {
        InterfaceC5627h0 interfaceC5627h0 = this.f21495a;
        return interfaceC5627h0 != null && this.f21500f == e.READY && interfaceC5627h0.isReady();
    }

    @Override // p105ej.InterfaceC5149g
    @Deprecated
    /* JADX INFO: renamed from: a */
    public boolean mo23966a(String str, long j10, String str2, String str3, Activity activity) {
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m25400a0() {
        return (this.f21508n.m25357i() && m25399Z()) ? false : true;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m25401b0(C12052k c12052k, boolean z10, PurchaseVerificationResponse purchaseVerificationResponse, C1748d c1748d) {
        int iM8610c = c1748d.m8610c();
        boolean z11 = iM8610c == 0;
        this.f21496b.m25636a(this.f21508n.m25358j(), "OnAcknowledgePurchaseResponse. Success: " + z11 + ". Message: " + c1748d + ".");
        boolean z12 = C5614b.m25426i(c12052k) != null;
        if (z12) {
            this.f21496b.m25641f("Android-Purchase-Completed-With-Checkout-Session-Id");
        }
        if (z11) {
            if (z10) {
                this.f21496b.m25641f("Play-Points-Ack-Purchase-Succeed");
            }
            m25368J(c12052k, C5620e.b.SUCCESS, C5639n0.m25663b(purchaseVerificationResponse));
            return;
        }
        if (z10) {
            this.f21496b.m25641f("Play-Points-Ack-Purchase-Fail");
        }
        C6124q.m27066k("rbx.purchaseflow", "Failed to acknowledge Purchase");
        this.f21496b.m25639d(this.f21508n.getIsInAppPurchase());
        if (z12) {
            m25373U(c12052k, iM8610c);
        }
    }

    @Override // p105ej.InterfaceC5149g
    @Deprecated
    /* JADX INFO: renamed from: c */
    public String mo23968c(String str) {
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m25402c0(String str, C12052k c12052k, C1748d c1748d, String str2) {
        boolean z10 = c1748d.m8610c() == 0;
        this.f21496b.m25636a(this.f21508n.m25358j(), "OnConsumeResponse. Success: " + z10 + ". Message: " + c1748d + ".");
        if (z10) {
            if (C5621e0.m25460m(str)) {
                this.f21496b.m25641f("Play-Points-Consume-Purchase-Succeed");
            }
            m25375o0(str, C5620e.b.SUCCESS);
            C1749e c1749eM25371S = m25371S(str, false);
            if (c1749eM25371S == null || !C5631j0.m25483i(c1749eM25371S, false)) {
                C6124q.m27063h("rbx.purchaseflow", "Invalid product details for productId " + str + ". ProductDetails: " + C5631j0.m25484j(c1749eM25371S, false));
            } else {
                this.f21496b.m25637b(str, C5621e0.m25454g(c1749eM25371S, false), C5621e0.m25456i(c1749eM25371S, false), C5621e0.m25455h(c1749eM25371S, false));
            }
            this.f21505k.remove(C5631j0.m25479e(c12052k));
        } else {
            if (C5621e0.m25460m(str)) {
                this.f21496b.m25641f("Play-Points-Consume-Purchase-Fail");
            }
            this.f21496b.m25640e(this.f21508n.getIsInAppPurchase());
            m25377p0(C5614b.m25427j(c12052k), C5620e.b.CONSUME_ERROR, "OnAcknowledgePurchaseResponse failure");
        }
        C6124q.m27063h("rbx.purchaseflow", "End consume flow.");
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: d */
    public boolean mo23969d(long j10, String str, String str2, final Activity activity, boolean z10, InterfaceC5152j interfaceC5152j) {
        final C5616c c5616c = new C5616c(str2);
        if (!c5616c.m25440b()) {
            C6124q.m27060e("rbx.purchaseflow", "Purchase request is invalid. Raw payload: " + str2);
            return false;
        }
        if (c5616c.m25441c() && this.f21495a.mo25432e("subscriptions").m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return false;
        }
        if (c5616c.m25444f() == null) {
            C6124q.m27060e("rbx.purchaseflow", "The provider product id is null.");
            return false;
        }
        this.f21508n = new CurrentPurchaseContext(c5616c.m25444f(), j10, !z10, c5616c.m25441c(), null);
        this.f21498d = interfaceC5152j;
        C6124q.m27063h("rbx.purchaseflow", "Initiated purchase. Params: " + c5616c);
        if (m25400a0()) {
            C6124q.m27060e("rbx.purchaseflow", "Purchasing is not enabled. Params: " + c5616c);
            return false;
        }
        if (c5616c.m25441c()) {
            this.f21506l.put(c5616c.m25444f(), str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5629i0(c5616c.m25444f(), c5616c.m25445g()));
        m25415r0(arrayList, new Consumer() { // from class: fj.z
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f21694a.m25412m0(c5616c, activity, (List) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m25403d0(C12052k c12052k, C5155m.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
        this.f21496b.m25636a(this.f21508n.m25358j(), "VerifyPurchase. Response=" + bVar + ". ReceiptId=" + c12052k.m44881b());
        InterfaceC5152j interfaceC5152j = this.f21498d;
        if (interfaceC5152j != null) {
            interfaceC5152j.mo15034d();
        }
        if (bVar != C5155m.b.OK && !c12052k.m44888i()) {
            this.f21496b.m25631A();
        }
        int i10 = d.f21516c[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                this.f21496b.m25634D(this.f21508n.getIsInAppPurchase());
                m25377p0(C5614b.m25427j(c12052k), C5620e.b.RECEIPT_VERIFICATION_ERROR, "launchVerifyPurchaseReceipt error");
                return;
            } else if (i10 != 3) {
                this.f21496b.m25635E(this.f21508n.getIsInAppPurchase());
                m25377p0(C5614b.m25427j(c12052k), C5620e.b.UNKNOWN, "launchVerifyPurchaseReceipt unknown error");
                return;
            } else {
                this.f21496b.m25633C(this.f21508n.getIsInAppPurchase());
                m25377p0(C5614b.m25427j(c12052k), C5620e.b.RECEIPT_EMPTY, "launchVerifyPurchaseReceipt empty response");
                return;
            }
        }
        String strM25427j = C5614b.m25427j(c12052k);
        if (C5621e0.m25462o(c12052k)) {
            C6124q.m27063h("rbx.purchaseflow", "Receipt Verification Successful for Subscription");
            if (strM25427j != null && C5621e0.m25461n(strM25427j)) {
                C5654c.m25669c().m25688t(C5654c.m25669c().m25674f() + AbstractC5153k.m23983e(strM25427j));
            }
            boolean zM25462o = C5621e0.m25462o(c12052k);
            C1749e c1749eM25371S = m25371S(strM25427j, zM25462o);
            if (c1749eM25371S == null || !C5631j0.m25483i(c1749eM25371S, zM25462o)) {
                C6124q.m27063h("rbx.purchaseflow", "Invalid product details for productId " + strM25427j + ". ProductDetails: " + C5631j0.m25484j(c1749eM25371S, zM25462o));
            } else {
                this.f21496b.m25637b(strM25427j, C5621e0.m25454g(c1749eM25371S, zM25462o), C5621e0.m25456i(c1749eM25371S, zM25462o), C5621e0.m25455h(c1749eM25371S, zM25462o));
            }
        }
        m25366H(c12052k, purchaseVerificationResponse);
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: e */
    public void mo23970e(String str, Uri uri, String str2, @NonNull ActivityC4831q activityC4831q, InterfaceC5152j interfaceC5152j, Runnable runnable) {
        if (uri == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        C6124q.m27063h("rbx.purchaseflow", "UriObject: " + uri);
        if (mo23973h(str2, str, activityC4831q, interfaceC5152j, Boolean.TRUE.equals(C6112e0.m27025a(uri, "recurring")), C6112e0.m27027c(uri, "paymentSessionId")) || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m25404e0(C1748d c1748d, List list) {
        if (c1748d.m8610c() != 0) {
            C6124q.m27059d("Failed QueryPurchases. BillingResult: " + c1748d);
            return;
        }
        this.f21496b.m25636a(this.f21508n.m25358j(), "QueryInAppPurchases. ItemsCount: " + list.size() + ". Items: " + C5635l0.m25486b(list));
        m25395V(list);
    }

    @Override // p105ej.InterfaceC5149g
    @Deprecated
    /* JADX INFO: renamed from: f */
    public boolean mo23971f(String str, long j10, String str2, Activity activity, String str3) {
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m25405f0(C1748d c1748d, List list) {
        if (c1748d.m8610c() != 0) {
            C6124q.m27059d("Failed QueryPurchases. BillingResult: " + c1748d);
            return;
        }
        this.f21496b.m25636a(this.f21508n.m25358j(), "QuerySubsPurchases. ItemsCount: " + list.size() + ". Items: " + C5635l0.m25486b(list));
        m25395V(list);
    }

    @Override // p105ej.InterfaceC5149g
    @Deprecated
    /* JADX INFO: renamed from: g */
    public boolean mo23972g(String str, long j10, long j11) {
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m25406g0(Map map, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1749e c1749e = (C1749e) it.next();
            if (c1749e == null) {
                C6124q.m27060e("rbx.purchaseflow", "Null product details in list");
            } else {
                String strM8618d = c1749e.m8618d();
                if (map.containsKey(strM8618d)) {
                    m25396W((C12052k) map.get(strM8618d));
                } else {
                    C6124q.m27060e("rbx.purchaseflow", "Cannot find purchase associated with product details. ProductId: " + strM8618d);
                }
            }
        }
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: h */
    public boolean mo23973h(String str, String str2, Activity activity, InterfaceC5152j interfaceC5152j, boolean z10, String str3) {
        C6124q.m27063h("rbx.purchaseflow", "startInAppPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + ", paymentSessionId: " + str3);
        return m25420x0(str2, activity, C5654c.m25669c().m25678j(), interfaceC5152j, z10, str3, true);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m25407h0(String str, String str2) {
        m25414q0(new long[0], 500, str, str2);
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: i */
    public boolean mo23974i(String str, String str2, Activity activity, InterfaceC5152j interfaceC5152j, boolean z10) {
        return m25420x0(str2, activity, C5654c.m25669c().m25678j(), interfaceC5152j, z10, null, true);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m25408i0(List list, Consumer consumer, C1748d c1748d, C12061n c12061n) {
        List<C1749e> listM44899a = c12061n.m44899a();
        if (c1748d.m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "Failed queryProductDetails. Products: " + list + ", BillingResult: " + c1748d);
        } else {
            if (listM44899a.isEmpty()) {
                C6124q.m27063h("rbx.purchaseflow", "Returned no ProductDetails for Products: " + list);
                return;
            }
            for (C1749e c1749e : listM44899a) {
                if (c1749e.m8619e().equals("subs")) {
                    this.f21504j.put(c1749e.m8618d(), c1749e);
                } else {
                    this.f21503i.put(c1749e.m8618d(), c1749e);
                }
            }
            C6124q.m27063h("rbx.purchaseflow", "queryProductDetails Success. Products: " + list);
        }
        consumer.accept(listM44899a);
    }

    @Override // p105ej.InterfaceC5149g
    @Deprecated
    /* JADX INFO: renamed from: j */
    public boolean mo23975j(String str) {
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m25409j0(Runnable runnable, C1748d c1748d, C12061n c12061n) {
        List<C1749e> listM44899a = c12061n.m44899a();
        if (c1748d.m8610c() == 0) {
            C6124q.m27063h("rbx.purchaseflow", "Returned INAPP ProductDetails. Count = " + listM44899a.size());
            for (C1749e c1749e : listM44899a) {
                this.f21503i.put(c1749e.m8618d(), c1749e);
            }
            C6124q.m27063h("rbx.purchaseflow", "queryInAppProduct Success. Count = " + this.f21503i.size());
            this.f21501g = e.READY;
        } else {
            C6124q.m27063h("rbx.purchaseflow", "Failed queryInAppProduct. BillingResult: " + c1748d);
            this.f21501g = e.NONE;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p105ej.InterfaceC5149g
    @Deprecated
    /* JADX INFO: renamed from: k */
    public void mo23976k(boolean z10) {
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m25410k0(Runnable runnable, C1748d c1748d, C12061n c12061n) {
        List<C1749e> listM44899a = c12061n.m44899a();
        if (c1748d.m8610c() == 0) {
            C6124q.m27063h("rbx.purchaseflow", "Returned SUBS ProductDetails. Count = " + listM44899a.size());
            for (C1749e c1749e : listM44899a) {
                this.f21504j.put(c1749e.m8618d(), c1749e);
            }
            C6124q.m27063h("rbx.purchaseflow", "querySubsProduct Success. Count = " + this.f21504j.size());
            this.f21502h = e.READY;
        } else {
            C6124q.m27060e("rbx.purchaseflow", "Failed querySubsProduct. BillingResult: " + c1748d);
            this.f21502h = e.NONE;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p105ej.InterfaceC5149g
    @Deprecated
    /* JADX INFO: renamed from: l */
    public boolean mo23977l(String str) {
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m25411l0(String str, boolean z10, String str2) {
        C1749e c1749eM25371S = m25371S(str, z10);
        if (c1749eM25371S == null || !C5631j0.m25483i(c1749eM25371S, z10)) {
            m25377p0(str, C5620e.b.FAILED_PRODUCT_NOT_FOUND, C5631j0.m25484j(c1749eM25371S, z10));
        } else {
            m25393P(C5621e0.m25456i(c1749eM25371S, this.f21508n.getIsSubscriptionPurchase()), str2);
        }
    }

    @Override // p105ej.InterfaceC5149g
    @Deprecated
    /* JADX INFO: renamed from: m */
    public void mo23978m(int i10) {
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m25412m0(C5616c c5616c, Activity activity, List list) {
        if (list == null || list.isEmpty()) {
            m25377p0(c5616c.m25444f(), C5620e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            return;
        }
        C1749e c1749e = (C1749e) list.get(0);
        String strM25444f = c5616c.m25444f();
        boolean zM25441c = c5616c.m25441c();
        if (c1749e == null || !C5631j0.m25483i(c1749e, zM25441c)) {
            m25377p0(strM25444f, C5620e.b.FAILED_PRODUCT_NOT_FOUND, C5631j0.m25484j(c1749e, zM25441c));
        } else {
            m25394Q(activity, null, c5616c.m25439a(), c5616c.m25442d());
        }
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: n */
    public boolean mo23979n(String str, String str2, Activity activity, long j10, InterfaceC5152j interfaceC5152j) {
        return m25420x0(str2, activity, j10, interfaceC5152j, false, null, false);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m25413n0(C12052k c12052k) {
        String strM25427j = C5614b.m25427j(c12052k);
        String strM44881b = c12052k.m44881b();
        if (this.f21498d != null && C5621e0.m25463p(strM25427j, this.f21508n.getProductId())) {
            C6124q.m27063h("rbx.purchaseflow", "launchVerifyPurchaseReceipt onPurchaseVerificationStart");
            this.f21498d.mo15032b();
        }
        if (strM25427j == null || strM44881b == null) {
            C6124q.m27060e("rbx.purchaseflow", "launchVerifyPurchaseReceipt failed. Invalid parameters: " + strM44881b + ", " + strM25427j);
            return;
        }
        C6124q.m27063h("rbx.purchaseflow", "Start launchVerifyPurchaseReceipt: " + strM44881b + ", " + strM25427j);
        this.f21507m.m25467a(c12052k, strM44881b, strM25427j, this.f21508n.getIsInAppPurchase(), new C5623f0.b() { // from class: fj.v
            @Override // fj.C5623f0.b
            /* JADX INFO: renamed from: a */
            public final void mo25468a(String str, String str2) {
                this.f21683a.m25407h0(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public void m25414q0(long[] jArr, int i10, String str, String str2) {
        C5155m.b bVar;
        C6124q.m27063h("rbx.purchaseflow", "Verify Purchase callback. response code " + i10 + " grantedAssetIds = " + Arrays.toString(jArr) + ".");
        if (i10 == 200) {
            C6124q.m27063h("rbx.purchaseflow", "Verification success");
            bVar = C5155m.b.OK;
            this.f21496b.m25646k();
        } else if (i10 == 500) {
            C6124q.m27060e("rbx.purchaseflow", "Server error");
            bVar = C5155m.b.ERROR;
            this.f21496b.m25649n();
        } else if (i10 == 400) {
            C6124q.m27060e("rbx.purchaseflow", "Service was unable to validate receiptId.");
            bVar = C5155m.b.ERROR;
            this.f21496b.m25647l();
        } else if (i10 != 401) {
            C6124q.m27060e("rbx.purchaseflow", "Unknown");
            bVar = C5155m.b.UNKNOWN;
            this.f21496b.m25650o();
        } else {
            C6124q.m27060e("rbx.purchaseflow", "Unauthorized to make request.");
            bVar = C5155m.b.BOGUS;
            this.f21496b.m25648m();
        }
        PurchaseVerificationResponse purchaseVerificationResponse = new PurchaseVerificationResponse(C6410a.m27993b(jArr));
        if (str == null) {
            str = str2;
        }
        C12052k c12052k = this.f21505k.get(str);
        if (c12052k == null) {
            C6124q.m27060e("rbx.purchaseflow", "Verify Purchase callback. purchaseKey: " + str + "not found.");
            this.f21496b.m25631A();
            return;
        }
        C6124q.m27063h("rbx.purchaseflow", "Verify Purchase callback. purchaseKey: " + str + ", purchase: " + c12052k.m44881b());
        m25392O(c12052k).mo23991a(bVar, purchaseVerificationResponse);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m25415r0(final List<C5629i0> list, final Consumer<List<C1749e>> consumer) {
        if (this.f21495a.mo25432e("fff").m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.f21496b.m25655t(this.f21508n.getIsInAppPurchase());
            consumer.accept(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C5629i0 c5629i0 : list) {
            arrayList.add(C1750f.b.m8643b().m8651b(c5629i0.getProviderProductId()).m8652c(c5629i0.getProductType()).m8650a());
        }
        this.f21495a.mo25428a(C1750f.m8637a().m8642b(arrayList).m8641a(), new InterfaceC12049j() { // from class: fj.x
            @Override // p486v7.InterfaceC12049j
            /* JADX INFO: renamed from: a */
            public final void mo25466a(C1748d c1748d, C12061n c12061n) {
                this.f21687a.m25408i0(list, consumer, c1748d, c12061n);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final void m25416s0(final Runnable runnable) {
        C6124q.m27063h("rbx.purchaseflow", "Attempt queryInAppProduct");
        if (this.f21495a.mo25432e("fff").m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.f21496b.m25655t(this.f21508n.getIsInAppPurchase());
            return;
        }
        e eVar = this.f21501g;
        if (eVar == e.READY) {
            C6124q.m27063h("rbx.purchaseflow", "queryInAppProduct is setup already");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (eVar != e.NONE) {
            C6124q.m27063h("rbx.purchaseflow", "queryInAppProduct is pending");
            return;
        }
        List<String> listM25452e = C5621e0.m25452e();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listM25452e.iterator();
        while (it.hasNext()) {
            arrayList.add(C1750f.b.m8643b().m8651b(it.next()).m8652c("inapp").m8650a());
        }
        C1750f c1750fM8641a = C1750f.m8637a().m8642b(arrayList).m8641a();
        this.f21501g = e.CONNECTING;
        C6124q.m27063h("rbx.purchaseflow", "Querying INAPP ProductDetails. Count = " + arrayList.size());
        this.f21495a.mo25428a(c1750fM8641a, new InterfaceC12049j() { // from class: fj.q
            @Override // p486v7.InterfaceC12049j
            /* JADX INFO: renamed from: a */
            public final void mo25466a(C1748d c1748d, C12061n c12061n) {
                this.f21672a.m25409j0(runnable, c1748d, c12061n);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final void m25417t0(final Runnable runnable) {
        C6124q.m27063h("rbx.purchaseflow", "Attempt querySubsProduct");
        if (this.f21495a.mo25432e("subscriptions").m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return;
        }
        if (this.f21495a.mo25432e("fff").m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            this.f21496b.m25655t(this.f21508n.getIsInAppPurchase());
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        e eVar = this.f21502h;
        if (eVar == e.READY) {
            C6124q.m27063h("rbx.purchaseflow", "querySubsProduct is setup already");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (eVar != e.NONE) {
            C6124q.m27063h("rbx.purchaseflow", "querySubsProduct is pending");
            return;
        }
        List<String> listM25453f = C5621e0.m25453f();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listM25453f.iterator();
        while (it.hasNext()) {
            arrayList.add(C1750f.b.m8643b().m8651b(it.next()).m8652c("subs").m8650a());
        }
        C1750f c1750fM8641a = C1750f.m8637a().m8642b(arrayList).m8641a();
        this.f21502h = e.CONNECTING;
        C6124q.m27063h("rbx.purchaseflow", "Querying SUBS ProductDetails. Count = " + arrayList.size());
        this.f21495a.mo25428a(c1750fM8641a, new InterfaceC12049j() { // from class: fj.p
            @Override // p486v7.InterfaceC12049j
            /* JADX INFO: renamed from: a */
            public final void mo25466a(C1748d c1748d, C12061n c12061n) {
                this.f21670a.m25410k0(runnable, c1748d, c12061n);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final String m25418v0(C1749e c1749e, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String strM25482h = C5631j0.m25482h(c1749e, list);
            if (strM25482h != null) {
                return strM25482h;
            }
            this.f21496b.m25641f("Android-Subscription-Offer-Id-Not-Found");
            if (C11659h.m43403a().mo43765z0()) {
                return null;
            }
        }
        String strM25475a = C5631j0.m25475a(c1749e);
        if (strM25475a != null) {
            return strM25475a;
        }
        this.f21496b.m25641f("Android-Subscription-Offer-No-Base-Plan-Available");
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public void m25419w0(AbstractC1745a abstractC1745a) {
        e eVar = this.f21500f;
        if (eVar == e.READY) {
            C6124q.m27063h("rbx.purchaseflow", "Google Billing Client for payments protocol is already setup");
            return;
        }
        e eVar2 = e.CONNECTING;
        if (eVar == eVar2) {
            C6124q.m27063h("rbx.purchaseflow", "Google Billing Client for payments protocol is already connecting");
            return;
        }
        this.f21495a.mo25433f(abstractC1745a);
        this.f21500f = eVar2;
        C6124q.m27063h("rbx.purchaseflow", "Connecting Google Billing's Client for payments protocol");
        this.f21495a.mo25429b(new a());
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m25420x0(final String str, Activity activity, long j10, InterfaceC5152j interfaceC5152j, final boolean z10, final String str2, boolean z11) {
        C6124q.m27063h("rbx.purchaseflow", "startPurchase productId: " + str + ", isSubscriptionPurchase: " + z10 + ", isInApp: " + z11 + ", userId: " + j10);
        if (str == null) {
            C6124q.m27060e("rbx.purchaseflow", "Purchase product id is null.");
            return false;
        }
        this.f21508n = new CurrentPurchaseContext(str, j10, z11, C5621e0.m25461n(str), null);
        this.f21498d = interfaceC5152j;
        if (m25400a0()) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: fj.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f21690a.m25411l0(str, z10, str2);
            }
        };
        if (this.f21508n.getIsSubscriptionPurchase()) {
            m25417t0(runnable);
            return true;
        }
        m25416s0(runnable);
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m25421y0(C12052k c12052k, String str) {
        String strM25427j = C5614b.m25427j(c12052k);
        if (strM25427j == null) {
            C6124q.m27060e("rbx.purchaseflow", "Failed to verify purchase. Product ID is null. Purchase: " + c12052k);
            return;
        }
        boolean zM25460m = C5621e0.m25460m(strM25427j);
        C5615b0 c5615b0 = this.f21499e;
        boolean z10 = c5615b0 != null && c5615b0.m25438c(str);
        if (!c12052k.m44888i() || (zM25460m && !z10)) {
            m25413n0(c12052k);
        } else {
            m25368J(c12052k, C5620e.b.ALREADY_ACKNOWLEDGED, new RobloxPurchaseInfo());
        }
    }
}
