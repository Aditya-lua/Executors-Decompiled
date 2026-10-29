package fj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
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
import sg.a1;
import wh.r0;

/* JADX INFO: loaded from: classes2.dex */
public class m implements ej.g {
    public static m E;
    public static List<String> G;
    public static List<String> I;
    public String A;
    public List<String> B;
    public com.roblox.client.purchase.a.f C;
    public v7.m D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f16717a;
    public o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f16718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f16719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hashtable<String, com.android.billingclient.api.e> f16720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Hashtable<String, com.android.billingclient.api.e> f16721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Hashtable<String, v7.k> f16722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b0 f16724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Activity f16725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f16727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f16728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f16729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16730o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f16733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public vi.g f16734s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ei.f f16735t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ej.j f16736u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Hashtable<String, String> f16737v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f16738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f16739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f16740y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f16741z;
    public static List<String> F = new ArrayList(Arrays.asList("com.roblox.client.robux40", "com.roblox.robloxmobile.premium80robux", "com.roblox.robloxmobile.premium160robux", "com.roblox.robloxmobile.premium240robux", "com.roblox.robloxmobile.premium320robux", "com.roblox.robloxmobile.premium400robux", "com.roblox.robloxmobile.premium800robux", "com.roblox.robloxmobile.premium1700robux", "com.roblox.robloxmobile.premium4500robux", "com.roblox.robloxmobile.premium10000robux", "com.roblox.robloxmobile.premium88subscribed", "com.roblox.robloxmobile.premium175subscribed", "com.roblox.robloxmobile.premium265subscribed", "com.roblox.robloxmobile.premium350subscribed", "com.roblox.robloxmobile.premium440subscribed2", "com.roblox.robloxmobile.premium880subscribed", "com.roblox.robloxmobile.premium1870subscribed", "com.roblox.robloxmobile.premium4950subscribed", "com.roblox.robloxmobile.premium11000subscribed"));
    public static List<String> H = new ArrayList(Arrays.asList("com.roblox.robloxmobile.robloxpremium450", "com.roblox.robloxmobile.robloxpremium1000", "com.roblox.robloxmobile.robloxpremium2200"));

    public class a implements v7.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16742a;

        public a(String str) {
            this.f16742a = str;
        }

        @Override // v7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<v7.k> list) {
            if (dVar.c() != 0) {
                gk.p.d("Failed QueryPurchases. BillingResult: " + dVar);
                return;
            }
            m.this.f16734s.l("QueryPurchases. ProductType: " + this.f16742a + ". ItemsCount: " + list.size() + ". Items: " + m.this.H0(list));
            m.this.R0(list, true);
        }
    }

    public class b implements v7.l {
        public b() {
        }

        @Override // v7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<v7.k> list) {
            m.this.Q0(dVar, list);
        }
    }

    public class c implements v7.l {
        public c() {
        }

        @Override // v7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<v7.k> list) {
            if (dVar.c() != 0) {
                gk.p.e("rbx.purchaseflow", "Failed QueryInAppPurchases in grantPendingPurchases. BillingResult: " + dVar);
                return;
            }
            m.this.f16734s.l("QueryInAppPurchases in grantPendingPurchases. ItemsCount: " + list.size() + ". Items: " + m.this.H0(list));
            m.this.R0(list, true);
        }
    }

    public class d implements v7.l {
        public d() {
        }

        @Override // v7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<v7.k> list) {
            if (dVar.c() != 0) {
                gk.p.e("rbx.purchaseflow", "Failed QuerySubsPurchases in grantPendingPurchases. BillingResult: " + dVar);
                return;
            }
            m.this.f16734s.l("QuerySubsPurchases in grantPendingPurchases. ItemsCount: " + list.size() + ". Items: " + m.this.H0(list));
            m.this.R0(list, true);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16746a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ej.m.b.values().length];
            b = iArr;
            try {
                iArr[ej.m.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ej.m.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ej.m.b.EMPTY_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.roblox.client.purchase.a.e.values().length];
            f16746a = iArr2;
            try {
                iArr2[com.roblox.client.purchase.a.e.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16746a[com.roblox.client.purchase.a.e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16746a[com.roblox.client.purchase.a.e.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16746a[com.roblox.client.purchase.a.e.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16746a[com.roblox.client.purchase.a.e.LIMIT_UNDER_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16746a[com.roblox.client.purchase.a.e.ERROR_CHECKING_BALANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public class f implements v7.d {
        public f() {
        }

        @Override // v7.d
        public void a(com.android.billingclient.api.d dVar) {
            if (dVar.c() == 0) {
                gk.p.h("rbx.purchaseflow", "Google Billing Client is setup");
                m.this.b = o.READY;
            } else {
                gk.p.e("rbx.purchaseflow", "Google Billing Client is not setup");
                m.this.b = o.NONE;
            }
            if (th.h.a().g3() && m.this.f16717a.e("fff").c() == 0) {
                if (m.this.f16717a.e("subscriptions").c() == 0) {
                    m.this.s1(null);
                }
                m.this.q1(null);
            }
        }

        @Override // v7.d
        public void b() {
            gk.p.h("rbx.purchaseflow", "Google Billing Client disconnected");
            m.this.b = o.NONE;
        }
    }

    public class g implements v7.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f16748a;

        public g(r rVar) {
            this.f16748a = rVar;
        }

        @Override // v7.j
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull v7.n nVar) {
            List<com.android.billingclient.api.e> listA = nVar.a();
            if (dVar.c() == 0) {
                gk.p.b("rbx.purchaseflow", "Returned INAPP ProductDetails. Count = " + listA.size());
                for (com.android.billingclient.api.e eVar : listA) {
                    if (eVar != m.this.f16720e.put(eVar.d(), eVar)) {
                        m.this.f16720e.remove(eVar.d());
                        m.this.f16720e.put(eVar.d(), eVar);
                    }
                }
                gk.p.b("rbx.purchaseflow", "queryInAppProduct Success. Count = " + m.this.f16720e.size());
                m.this.f16718c = o.READY;
            } else {
                gk.p.e("rbx.purchaseflow", "Failed queryInAppProduct. BillingResult: " + dVar);
                m.this.f16718c = o.NONE;
            }
            r rVar = this.f16748a;
            if (rVar != null) {
                rVar.a();
            }
        }
    }

    public class h implements v7.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f16749a;

        public h(r rVar) {
            this.f16749a = rVar;
        }

        @Override // v7.j
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull v7.n nVar) {
            List<com.android.billingclient.api.e> listA = nVar.a();
            if (dVar.c() == 0) {
                gk.p.b("rbx.purchaseflow", "Returned SUBS ProductDetails. Count = " + listA.size());
                for (com.android.billingclient.api.e eVar : listA) {
                    if (eVar != m.this.f16721f.put(eVar.d(), eVar)) {
                        m.this.f16721f.remove(eVar.d());
                        m.this.f16721f.put(eVar.d(), eVar);
                    }
                }
                gk.p.b("rbx.purchaseflow", "querySubsProduct Success. Count = " + m.this.f16721f.size());
                m.this.f16719d = o.READY;
            } else {
                gk.p.e("rbx.purchaseflow", "Failed querySubsProduct. BillingResult: " + dVar);
                m.this.f16719d = o.NONE;
            }
            r rVar = this.f16749a;
            if (rVar != null) {
                rVar.a();
            }
        }
    }

    public class i implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16750a;

        public i(String str) {
            this.f16750a = str;
        }

        @Override // fj.m.r
        public void a() {
            m mVar = m.this;
            com.android.billingclient.api.e eVarJ0 = mVar.J0(this.f16750a, mVar.f16730o);
            m mVar2 = m.this;
            if (mVar2.a1(this.f16750a, eVarJ0, mVar2.f16730o)) {
                m mVar3 = m.this;
                mVar3.f16728m = mVar3.M0(eVarJ0, mVar3.f16730o);
                m.this.f16734s.h0(new ej.h(m.this.f16729n, this.f16750a, false));
                m.this.D0();
            }
        }
    }

    public class j implements com.roblox.client.purchase.a.f {
        public j() {
        }

        @Override // com.roblox.client.purchase.a.f
        public void a(com.roblox.client.purchase.a.e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
            m.this.f16734s.l("ValidationCheck: " + eVar + ".");
            switch (e.f16746a[eVar.ordinal()]) {
                case 1:
                    m.this.E0(validatePurchaseResponsePayload);
                    break;
                case 2:
                    m.this.F1();
                    m.this.l1(str, fj.e.b.VALIDATION_ERROR, "PrePurchaseValidation error");
                    break;
                case 3:
                    m.this.I1();
                    m.this.l1(str, fj.e.b.VALIDATION_RETRY, "PrePurchaseValidation retry");
                    break;
                case 4:
                    m.this.G1();
                    m.this.l1(str, fj.e.b.VALIDATION_LIMIT, "PrePurchaseValidation limit");
                    break;
                case 5:
                    m.this.G1();
                    m.this.l1(str, fj.e.b.VALIDATION_LIMIT_UNDER_13, "PrePurchaseValidation limit");
                    break;
                case 6:
                    m.this.E1();
                    m.this.l1(str, fj.e.b.REQUEST_BALANCE_ERROR, "PrePurchaseValidation requestBalance failed.");
                    break;
                default:
                    m.this.J1();
                    m.this.l1(str, fj.e.b.UNKNOWN, "PrePurchaseValidation Unknown error.");
                    break;
            }
        }
    }

    public class k implements v7.m {
        public k() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0116  */
        /* JADX WARN: Code duplicated, block: B:47:0x0118  */
        /* JADX WARN: Code duplicated, block: B:49:0x0122  */
        /* JADX WARN: Code duplicated, block: B:50:0x0134  */
        @Override // v7.m
        public void a(com.android.billingclient.api.d dVar, List<v7.k> list) {
            boolean z10;
            if (m.this.f16717a == null) {
                return;
            }
            int iC = dVar.c();
            if (!th.h.a().g3()) {
                if (iC == 0) {
                    m.this.R0(list, false);
                    return;
                }
                if (iC == 1) {
                    m mVar = m.this;
                    mVar.l1(mVar.f16726k, fj.e.b.USER_CANCELLED, "User cancelled");
                    return;
                } else if (iC == 7) {
                    m.this.O0();
                    return;
                } else {
                    m mVar2 = m.this;
                    mVar2.l1(mVar2.f16726k, fj.e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
                    return;
                }
            }
            String str = null;
            if (iC == 0) {
                if (list != null) {
                    z10 = false;
                    for (v7.k kVar : list) {
                        int iF = kVar.f();
                        String strV0 = m.this.v0(kVar);
                        if (iF == 0) {
                            m.this.P1();
                            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: unspecified state!");
                        } else if (iF != 2) {
                            z10 = true;
                        } else {
                            m.this.D1();
                            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: Pending purchase!");
                        }
                        if (z10) {
                            IAPPurchaseManager.nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(kVar.g(), kVar.d());
                            IAPPurchaseManager.nativeFinishPaymentsProtocolPurchase(m.this.v0(kVar), iC, th.h.a().W1() ? m.this.I0(kVar) : kVar.a().a());
                        }
                        str = strV0;
                    }
                }
                if (m.this.Z0(str)) {
                    if (!z10) {
                        if (th.h.a().l1()) {
                            NativeGLInterface.nativeInGamePurchaseFinishedV2(false, m.this.f16731p, m.this.f16726k, "");
                        } else {
                            NativeGLInterface.nativeInGamePurchaseFinished(false, m.this.f16731p, m.this.f16726k);
                        }
                    }
                    m.this.t1();
                }
                m.this.f16723h = false;
            }
            if (iC == 1) {
                if (th.h.a().R()) {
                    m mVar3 = m.this;
                    mVar3.l1(mVar3.f16726k, fj.e.b.USER_CANCELLED, "User cancelled");
                } else {
                    m.this.L1();
                }
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new fj.e(fj.e.b.USER_CANCELLED, m.this.f16726k));
            } else if (iC != 7) {
                if (th.h.a().R()) {
                    m mVar4 = m.this;
                    mVar4.l1(mVar4.f16726k, fj.e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
                } else {
                    m.this.M1();
                }
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new fj.e(fj.e.b.FAILED_PURCHASE_RESPONSE, m.this.f16726k));
            } else if (th.h.a().p()) {
                m mVar5 = m.this;
                mVar5.m1(mVar5.f16731p, m.this.f16729n, false);
            } else {
                m.this.O0();
            }
            z10 = false;
            if (m.this.Z0(str)) {
                if (!z10) {
                    if (th.h.a().l1()) {
                        NativeGLInterface.nativeInGamePurchaseFinishedV2(false, m.this.f16731p, m.this.f16726k, "");
                    } else {
                        NativeGLInterface.nativeInGamePurchaseFinished(false, m.this.f16731p, m.this.f16726k);
                    }
                }
                m.this.t1();
            }
            m.this.f16723h = false;
        }
    }

    public class l implements ej.m.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v7.k f16753a;

        public l(v7.k kVar) {
            this.f16753a = kVar;
        }

        @Override // ej.m.c
        public void a(ej.m.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
            m.this.f16734s.l("VerifyPurchase. Response=" + bVar + ".ReceiptId=" + this.f16753a.b());
            if (m.this.f16736u != null) {
                m.this.f16736u.d();
            }
            if (bVar != ej.m.b.OK && !this.f16753a.i()) {
                m.this.O1();
            }
            int i10 = e.b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    m.this.R1();
                    m mVar = m.this;
                    mVar.l1(mVar.v0(this.f16753a), fj.e.b.RECEIPT_VERIFICATION_ERROR, "launchVerifyPurchaseReceipt error");
                    return;
                } else if (i10 != 3) {
                    m.this.S1();
                    m mVar2 = m.this;
                    mVar2.l1(mVar2.v0(this.f16753a), fj.e.b.UNKNOWN, "launchVerifyPurchaseReceipt unknown error");
                    return;
                } else {
                    m.this.Q1();
                    m mVar3 = m.this;
                    mVar3.l1(mVar3.v0(this.f16753a), fj.e.b.RECEIPT_EMPTY, "launchVerifyPurchaseReceipt empty response");
                    return;
                }
            }
            String strV0 = m.this.v0(this.f16753a);
            if (m.this.Y0(this.f16753a)) {
                gk.p.h("rbx.purchaseflow", "Receipt Verification Successful for Subscription");
                if (m.this.V0(strV0)) {
                    fk.c.c().t(fk.c.c().f() + ej.k.e(strV0));
                }
                boolean zY0 = m.this.Y0(this.f16753a);
                com.android.billingclient.api.e eVarJ0 = m.this.J0(strV0, zY0);
                if (m.this.b1(strV0, eVarJ0, zY0, false)) {
                    m.this.f16734s.m(strV0, m.K0(eVarJ0, zY0), m.this.M0(eVarJ0, zY0), m.L0(eVarJ0, zY0));
                } else {
                    gk.p.h("rbx.purchaseflow", "Unable to find skuDetails: " + strV0);
                }
            }
            m.this.x0(this.f16753a, purchaseVerificationResponse);
        }
    }

    /* JADX INFO: renamed from: fj.m$m, reason: collision with other inner class name */
    public class C0309m implements v7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v7.k f16754a;
        public final /* synthetic */ boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PurchaseVerificationResponse f16755c;

        public C0309m(v7.k kVar, boolean z10, PurchaseVerificationResponse purchaseVerificationResponse) {
            this.f16754a = kVar;
            this.b = z10;
            this.f16755c = purchaseVerificationResponse;
        }

        @Override // v7.c
        public void a(com.android.billingclient.api.d dVar) {
            int iC = dVar.c();
            boolean z10 = iC == 0;
            m.this.f16734s.l("OnAcknowledgePurchaseResponse. Success: " + z10 + ". Message: " + dVar.toString() + ".");
            boolean z11 = fj.b.i(this.f16754a) != null;
            if (z11) {
                m.this.f16734s.q("Android-Purchase-Completed-With-Checkout-Session-Id");
            }
            if (z10) {
                if (this.b) {
                    m.this.f16734s.q("Play-Points-Ack-Purchase-Succeed");
                }
                m.this.z0(this.f16754a, fj.e.b.SUCCESS, n0.b(this.f16755c));
                return;
            }
            if (this.b) {
                m.this.f16734s.q("Play-Points-Ack-Purchase-Fail");
            }
            gk.p.k("rbx.purchaseflow", "Failed to acknowledge Purchase");
            m.this.u1();
            if (z11) {
                m.this.P0(this.f16754a, iC);
            }
        }
    }

    public class n implements v7.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16757a;
        public final /* synthetic */ v7.k b;

        public n(String str, v7.k kVar) {
            this.f16757a = str;
            this.b = kVar;
        }

        @Override // v7.f
        public void a(com.android.billingclient.api.d dVar, String str) {
            boolean z10 = dVar.c() == 0;
            m.this.f16734s.l("OnConsumeResponse. Success: " + z10 + ". Message: " + dVar.toString() + ".");
            if (z10) {
                if (e0.m(this.f16757a)) {
                    m.this.f16734s.q("Play-Points-Consume-Purchase-Succeed");
                }
                m.this.k1(this.f16757a, fj.e.b.SUCCESS);
                com.android.billingclient.api.e eVarJ0 = m.this.J0(this.f16757a, false);
                if (m.this.b1(this.f16757a, eVarJ0, false, false)) {
                    m.this.f16734s.m(this.f16757a, m.K0(eVarJ0, false), m.this.M0(eVarJ0, false), m.L0(eVarJ0, false));
                } else {
                    gk.p.h("rbx.purchaseflow", "Unable to find skuDetails: " + this.f16757a);
                }
                String strE = j0.e(this.b);
                if (m.this.f16722g.containsKey(strE)) {
                    m.this.f16722g.remove(strE);
                }
            } else {
                if (e0.m(this.f16757a)) {
                    m.this.f16734s.q("Play-Points-Consume-Purchase-Fail");
                }
                m.this.v1();
                m mVar = m.this;
                mVar.l1(mVar.v0(this.b), fj.e.b.CONSUME_ERROR, "OnAcknowledgePurchaseResponse failure");
            }
            gk.p.h("rbx.purchaseflow", "End consume flow.");
        }
    }

    public enum o {
        NONE,
        CONNECTING,
        READY
    }

    public class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16762a;
        public String b;

        public p(String str, String str2) {
            this.f16762a = str;
            this.b = str2;
        }

        @NonNull
        public String toString() {
            return "{ productType: " + this.b + ", providerProductId: " + this.f16762a + " }";
        }
    }

    public interface q {
        void a(List<com.android.billingclient.api.e> list);
    }

    public interface r {
        void a();
    }

    public m(h0 h0Var, ei.f fVar, vi.g gVar) {
        o oVar = o.NONE;
        this.b = oVar;
        this.f16718c = oVar;
        this.f16719d = oVar;
        this.f16720e = new Hashtable<>();
        this.f16721f = new Hashtable<>();
        this.f16722g = new Hashtable<>();
        this.f16723h = false;
        this.f16724i = null;
        this.f16726k = null;
        this.f16727l = null;
        this.f16728m = null;
        this.f16729n = "";
        this.f16731p = 0L;
        this.f16732q = true;
        this.f16733r = null;
        this.f16737v = new Hashtable<>();
        this.f16739x = null;
        this.f16740y = null;
        this.f16741z = null;
        this.A = null;
        this.B = null;
        this.C = new j();
        this.D = new k();
        this.f16717a = h0Var;
        this.f16735t = fVar;
        this.f16734s = gVar;
    }

    public static m F0(Context context) {
        if (E == null) {
            E = new m(new fj.b(), new ei.h(), vi.g.b());
            E.U1(com.android.billingclient.api.a.f(context).c(E.D).b(v7.i.c().b().c().a()).a());
            E.T1(new b0(context));
        }
        return E;
    }

    public static List<String> G0() {
        String strF3 = th.h.a().F3();
        if (strF3.isEmpty()) {
            return F;
        }
        if (G == null) {
            G = Arrays.asList(strF3.split(","));
        }
        return G;
    }

    public static String K0(com.android.billingclient.api.e eVar, boolean z10) {
        if (z10) {
            List<com.android.billingclient.api.e.C0114e> listF = eVar.f();
            Objects.requireNonNull(listF);
            return listF.get(0).c().a().get(0).a();
        }
        com.android.billingclient.api.e.b bVarB = eVar.b();
        Objects.requireNonNull(bVarB);
        return bVarB.a();
    }

    public static long L0(com.android.billingclient.api.e eVar, boolean z10) {
        if (z10) {
            List<com.android.billingclient.api.e.C0114e> listF = eVar.f();
            Objects.requireNonNull(listF);
            return listF.get(0).c().a().get(0).b();
        }
        com.android.billingclient.api.e.b bVarB = eVar.b();
        Objects.requireNonNull(bVarB);
        return bVarB.c();
    }

    public static List<String> N0() {
        String strC0 = th.h.a().C0();
        if (strC0.isEmpty()) {
            return H;
        }
        if (I == null) {
            I = Arrays.asList(strC0.split(","));
        }
        return I;
    }

    private boolean T0() {
        return this.f16722g.size() > 0;
    }

    public void A0(long j10, String str, boolean z10) {
        this.f16731p = j10;
        B0(str, z10);
    }

    public final void A1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.x();
    }

    public void B0(String str, boolean z10) {
        this.f16729n = str;
        gk.p.b("rbx.purchaseflow", "attemptGrantPendingPurchases isAppResume:" + z10);
        if (!X0()) {
            gk.p.b("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchasing is not setup");
            return;
        }
        if (U0()) {
            gk.p.b("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchase already pending");
            return;
        }
        if (z10) {
            O0();
            return;
        }
        if (!T0()) {
            if (this.f16723h) {
                return;
            }
            O0();
            this.f16723h = true;
            return;
        }
        gk.p.b("rbx.purchaseflow", "Found cached pending purchase. Count = " + this.f16722g.size());
        O0();
    }

    public final void B1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.q("Payments-Protocol-Query-Product-Details-Failed");
    }

    public final void C0(v7.k kVar) {
        String strV0 = v0(kVar);
        if (th.h.a().n0() || !e0.l(strV0)) {
            gk.p.h("rbx.purchaseflow", "Consuming Purchase");
            this.f16717a.c(v7.e.b().b(kVar.g()).a(), new n(strV0, kVar));
        } else if (e0.m(strV0)) {
            this.f16734s.q("Play-Points-Not-Consume-Purchase");
        }
    }

    public final void C1(boolean z10) {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.Q(z10);
    }

    public final void D0() {
        ej.j jVar = this.f16736u;
        if (jVar != null) {
            jVar.c();
        }
        com.roblox.client.purchase.a aVar = new com.roblox.client.purchase.a(this.f16735t);
        String str = this.f16733r;
        String str2 = (str == null || str.isEmpty()) ? null : this.f16733r;
        if (this.f16732q) {
            aVar.e(a1.b1(), this.f16726k, this.f16728m, str2, this.C);
        } else {
            aVar.c(a1.b1(), this.f16726k, this.f16728m, str2, this.C);
        }
    }

    public final void D1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.R();
    }

    public final void E0(ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
        String strB;
        ej.j jVar = this.f16736u;
        if (jVar != null) {
            jVar.d();
        }
        this.f16734s.l("PurchaseStarted.");
        com.android.billingclient.api.e eVarJ0 = J0(this.f16726k, this.f16730o);
        if (a1(this.f16726k, eVarJ0, this.f16730o)) {
            ArrayList arrayList = new ArrayList();
            if (this.f16730o) {
                if (th.h.a().O3()) {
                    strB = w0(eVarJ0);
                    if (strB == null) {
                        l1(this.f16726k, fj.e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + this.f16726k);
                        return;
                    }
                } else {
                    strB = eVarJ0.f().get(0).b();
                }
                arrayList.add(com.android.billingclient.api.c.b.b().c(eVarJ0).b(strB).a());
            } else {
                arrayList.add(com.android.billingclient.api.c.b.b().c(eVarJ0).a());
            }
            com.android.billingclient.api.c.a aVarD = com.android.billingclient.api.c.b().b((validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getUserId() == null || validatePurchaseResponsePayload.getUserId().longValue() <= 0) ? this.f16729n : String.valueOf(validatePurchaseResponsePayload.getUserId())).d(arrayList);
            String str = this.f16738w;
            if (str != null) {
                aVarD.c(str);
                this.f16734s.q("Android-Purchase-Initiated-With-Charge-Request-Id");
            } else if (validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getCheckoutSessionId() == null) {
                gk.p.k("rbx.purchaseflow", "Both mCurrentChargeRequestId and mCurrentCheckoutSessionId is null.");
                this.f16734s.q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
            } else {
                aVarD.c(validatePurchaseResponsePayload.getCheckoutSessionId());
                this.f16734s.q("Android-Purchase-Initiated-With-Checkout-Session-Id");
            }
            com.android.billingclient.api.c cVarA = aVarD.a();
            if (this.f16725j.getIntent() == null) {
                this.f16725j.setIntent(new Intent());
            }
            if (this.f16717a.h(this.f16725j, cVarA).c() != 0) {
                l1(this.f16726k, fj.e.b.FAILED_PURCHASE_RESPONSE, "BillingClient.launchBillingFlow failed");
            }
        }
    }

    public final void E1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.S(this.f16732q, false);
    }

    public final void F1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.T(this.f16732q, false);
    }

    public final void G1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.a0(this.f16732q, false);
    }

    public final String H0(List<v7.k> list) {
        Iterator<v7.k> it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + v0(it.next()) + "; ";
        }
        return str;
    }

    public final void H1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.U(this.f16732q, false);
    }

    public final String I0(v7.k kVar) {
        try {
            Long.parseLong(kVar.a().b());
            return kVar.a().b();
        } catch (Exception unused) {
            gk.p.k("rbx.purchaseflow", "PaymentsProtocol: purchase.getAccountIdentifiers().getObfuscatedProfileId() did not return an integer and is not a valid checkoutSessionId.");
            return "";
        }
    }

    public final void I1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.V(this.f16732q, false);
    }

    public final com.android.billingclient.api.e J0(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (z10 && this.f16721f.containsKey(str)) {
            return this.f16721f.get(str);
        }
        if (!z10 && this.f16720e.containsKey(str)) {
            return this.f16720e.get(str);
        }
        gk.p.e("rbx.purchaseflow", "Unable to get product details for productId: " + str);
        return null;
    }

    public final void J1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.W(this.f16732q, false);
    }

    public final void K1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.X(this.f16732q, false);
    }

    public final void L1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.Y(this.f16732q, false);
    }

    public final String M0(com.android.billingclient.api.e eVar, boolean z10) {
        if (z10) {
            List<com.android.billingclient.api.e.C0114e> listF = eVar.f();
            Objects.requireNonNull(listF);
            return listF.get(0).c().a().get(0).c();
        }
        com.android.billingclient.api.e.b bVarB = eVar.b();
        Objects.requireNonNull(bVarB);
        return bVarB.d();
    }

    public final void M1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.Z(this.f16732q, false);
    }

    public final void N1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.b0(this.f16732q, false);
    }

    public final void O0() {
        gk.p.h("rbx.purchaseflow", "Do Google Purchase GrantPending");
        if (!th.h.a().B()) {
            r1("inapp");
            r1("subs");
        } else if (W0()) {
            v7.o oVarA = v7.o.b().b("inapp").a();
            v7.o oVarA2 = v7.o.b().b("subs").a();
            C1(false);
            this.f16717a.g(oVarA, new c());
            C1(true);
            this.f16717a.g(oVarA2, new d());
        }
    }

    public final void O1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.c0();
    }

    public final void P0(v7.k kVar, int i10) {
        gk.p.h("rbx.purchaseflow", "Acknowledge error, response code: " + i10 + ", skipping client side acknowledge purchase.");
        this.f16734s.q("Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore");
        String strE = j0.e(kVar);
        if (this.f16722g.containsKey(strE)) {
            this.f16722g.remove(strE);
        }
        String strV0 = v0(kVar);
        if (!Y0(kVar)) {
            com.android.billingclient.api.e eVarJ0 = J0(strV0, false);
            if (b1(strV0, eVarJ0, false, false)) {
                this.f16734s.m(strV0, K0(eVarJ0, false), M0(eVarJ0, false), L0(eVarJ0, false));
            } else {
                gk.p.h("rbx.purchaseflow", "Unable to find skuDetails: " + strV0);
            }
        }
        k1(strV0, fj.e.b.SUCCESS);
    }

    public final void P1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.d0();
    }

    public final void Q0(com.android.billingclient.api.d dVar, List<v7.k> list) {
        int iC = dVar.c();
        if (iC != 0) {
            gk.p.a("Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        for (v7.k kVar : list) {
            int iF = kVar.f();
            if (iF == 0) {
                P1();
            } else if (iF == 1) {
                gk.p.b("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases for purchase " + kVar);
                IAPPurchaseManager.nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(kVar.g(), kVar.d());
                IAPPurchaseManager.nativeFinishPaymentsProtocolPurchase(v0(kVar), iC, th.h.a().W1() ? I0(kVar) : kVar.a().a());
            } else if (iF == 2) {
                D1();
            }
        }
    }

    public final void Q1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.e0(this.f16732q, false);
    }

    public final void R0(List<v7.k> list, final boolean z10) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final Hashtable hashtable = new Hashtable();
        for (v7.k kVar : list) {
            String strV0 = v0(kVar);
            boolean zY0 = Y0(kVar);
            if (J0(strV0, zY0) != null) {
                S0(kVar, z10);
            } else {
                if (zY0) {
                    arrayList2.add(new p(strV0, "subs"));
                } else {
                    arrayList.add(new p(strV0, "inapp"));
                }
                hashtable.put(strV0, kVar);
            }
        }
        q qVar = new q() { // from class: fj.i
            @Override // fj.m.q
            public final void a(List list2) {
                this.f16704a.c1(hashtable, z10, list2);
            }
        };
        if (!arrayList.isEmpty()) {
            p1(arrayList, qVar);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        p1(arrayList2, qVar);
    }

    public final void R1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.f0(this.f16732q, false);
    }

    public final void S0(v7.k kVar, boolean z10) {
        gk.p.h("rbx.purchaseflow", "Handle single purchase. Product id: " + v0(kVar) + ". Order id: " + kVar.b() + ". isAcknowledged: " + kVar.i());
        int iF = kVar.f();
        if (iF == 0) {
            P1();
        } else if (iF == 2) {
            D1();
        }
        if (kVar.f() != 1) {
            return;
        }
        this.f16722g.put(j0.e(kVar), kVar);
        if (!e0.m(v0(kVar))) {
            v7.a aVarA = kVar.a();
            String strA = aVarA.a();
            String strB = aVarA.b();
            String str = this.f16729n;
            if (str == null || !str.equals(strA)) {
                long j10 = this.f16731p;
                if ((j10 <= 0 || !Long.toString(j10).equals(strA)) && (strB == null || strB.equals(""))) {
                    w1();
                    if (th.h.a().D0()) {
                        String str2 = this.f16729n;
                        if (str2 == null) {
                            A1();
                        } else if (!str2.equals(strA)) {
                            z1();
                        }
                        long j11 = this.f16731p;
                        if (j11 <= 0) {
                            x1();
                            return;
                        } else {
                            if (Long.toString(j11).equals(strA)) {
                                return;
                            }
                            y1();
                            return;
                        }
                    }
                    return;
                }
            }
        }
        W1(kVar, j0.e(kVar), z10);
    }

    public final void S1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.g0(this.f16732q, false);
    }

    public void T1(b0 b0Var) {
        this.f16724i = b0Var;
    }

    public boolean U0() {
        return this.f16726k != null;
    }

    public void U1(com.android.billingclient.api.a aVar) {
        o oVar = this.b;
        if (oVar == o.READY) {
            gk.p.h("rbx.purchaseflow", "Google Billing Client is already setup");
            return;
        }
        o oVar2 = o.CONNECTING;
        if (oVar == oVar2) {
            gk.p.h("rbx.purchaseflow", "Google Billing Client is already connecting");
            return;
        }
        this.f16717a.f(aVar);
        this.b = oVar2;
        gk.p.h("rbx.purchaseflow", "Connecting Google Billing's Client");
        this.f16717a.b(new f());
    }

    public final boolean V0(String str) {
        return N0().contains(str);
    }

    public final boolean V1(String str, String str2, Activity activity, long j10, ej.j jVar, boolean z10) {
        gk.p.h("rbx.purchaseflow", "startPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + "isInApp: " + this.f16732q);
        this.f16729n = str;
        if (!W0()) {
            return false;
        }
        this.f16736u = jVar;
        this.f16731p = j10;
        this.f16726k = str2;
        this.f16725j = activity;
        this.f16730o = V0(str2);
        i iVar = new i(str2);
        if (this.f16730o) {
            s1(iVar);
            return true;
        }
        q1(iVar);
        return true;
    }

    public boolean W0() {
        return !this.f16729n.isEmpty() && X0();
    }

    public final void W1(v7.k kVar, String str, boolean z10) {
        boolean zM = e0.m(v0(kVar));
        b0 b0Var = this.f16724i;
        boolean z11 = b0Var != null && b0Var.c(str);
        if (!kVar.i() || (zM && !z11)) {
            j1(kVar, z10);
        } else {
            z0(kVar, fj.e.b.ALREADY_ACKNOWLEDGED, new RobloxPurchaseInfo());
        }
    }

    public boolean X0() {
        h0 h0Var = this.f16717a;
        return h0Var != null && this.b == o.READY && h0Var.isReady();
    }

    public final boolean Y0(v7.k kVar) {
        String strV0 = v0(kVar);
        return V0(strV0) || !(G0().contains(strV0) || e0.m(strV0));
    }

    public final boolean Z0(String str) {
        String str2 = this.f16726k;
        if (str2 == null || str == null) {
            return false;
        }
        return str2.equals(str);
    }

    @Override // ej.g
    public boolean a(final String str, final long j10, final String str2, final String str3, final Activity activity) {
        gk.p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase.");
        this.f16734s.l("PurchaseStarted.");
        final boolean zV0 = V0(str);
        if (zV0 && this.f16717a.e("subscriptions").c() != 0) {
            return false;
        }
        if (this.f16717a.e("fff").c() != 0) {
            H1();
            return false;
        }
        IAPPurchaseManager.nativeSetUserId(j10);
        this.f16731p = j10;
        this.f16729n = str2;
        this.f16726k = str;
        String str4 = zV0 ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.android.billingclient.api.f.b.b().b(str).c(str4).a());
        this.f16717a.a(com.android.billingclient.api.f.a().b(arrayList).a(), new v7.j() { // from class: fj.f
            @Override // v7.j
            public final void a(com.android.billingclient.api.d dVar, v7.n nVar) {
                this.f16685a.g1(zV0, j10, str2, str, activity, str3, dVar, nVar);
            }
        });
        return true;
    }

    public final boolean a1(String str, com.android.billingclient.api.e eVar, boolean z10) {
        return b1(str, eVar, z10, true);
    }

    @Override // ej.g
    public void b(r0 r0Var) {
        this.f16736u = r0Var;
    }

    public final boolean b1(String str, com.android.billingclient.api.e eVar, boolean z10, boolean z11) {
        if (eVar == null) {
            gk.p.h("rbx.purchaseflow", "Product details not found after query.");
            if (z11) {
                l1(str, fj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            }
            return false;
        }
        if (z10 && eVar.f() == null) {
            if (z11) {
                l1(this.f16726k, fj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
            }
            return false;
        }
        if (z10 || eVar.b() != null) {
            return true;
        }
        if (z11) {
            l1(this.f16726k, fj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
        }
        return false;
    }

    @Override // ej.g
    public String c(String str) {
        boolean zV0 = V0(str);
        this.f16730o = zV0;
        com.android.billingclient.api.e eVarJ0 = J0(str, zV0);
        return !a1(str, eVarJ0, this.f16730o) ? "" : M0(eVarJ0, this.f16730o);
    }

    public final /* synthetic */ void c1(Map map, boolean z10, List list) {
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
                    S0((v7.k) map.get(strD), z10);
                } else {
                    gk.p.e("rbx.purchaseflow", "Cannot find purchase associated with product details. ProductId: " + strD);
                }
            }
        }
    }

    @Override // ej.g
    public boolean d(long j10, String str, String str2, Activity activity, final boolean z10, ej.j jVar) {
        final fj.c cVar = new fj.c(str2);
        if (!cVar.b()) {
            gk.p.e("rbx.purchaseflow", "Purchase request is invalid. Raw payload: " + str2);
            return false;
        }
        if (cVar.c() && this.f16717a.e("subscriptions").c() != 0) {
            gk.p.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return false;
        }
        gk.p.h("rbx.purchaseflow", "Initiated purchase. Params: " + cVar);
        this.f16729n = Long.toString(j10);
        if (!W0()) {
            gk.p.e("rbx.purchaseflow", "Purchasing is not enabled. Params: " + cVar);
            return false;
        }
        this.f16731p = j10;
        this.f16726k = cVar.f();
        this.f16738w = cVar.a();
        this.B = cVar.d();
        this.f16725j = activity;
        this.f16732q = !z10;
        this.f16736u = jVar;
        this.f16730o = cVar.c();
        if (cVar.c()) {
            this.f16737v.put(cVar.f(), str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(cVar.f(), cVar.g()));
        p1(arrayList, new q() { // from class: fj.l
            @Override // fj.m.q
            public final void a(List list) {
                this.f16714a.i1(cVar, z10, list);
            }
        });
        return true;
    }

    public final /* synthetic */ void d1(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.f16734s.l("PaymentsProtocol: QueryInAppPurchases. ItemsCount: " + list.size() + ". Items: " + H0(list));
        Q0(dVar, list);
    }

    public final /* synthetic */ void e1(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.f16734s.l("PaymentsProtocol: QuerySubsPurchases. ItemsCount: " + list.size() + ". Items: " + H0(list));
        Q0(dVar, list);
    }

    @Override // ej.g
    public boolean f(final String str, final long j10, final String str2, final Activity activity, String str3) {
        gk.p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase with payload string.");
        this.f16734s.l("PurchaseStarted.");
        final fj.c cVar = new fj.c(str3);
        if (cVar.c() && this.f16717a.e("subscriptions").c() != 0) {
            return false;
        }
        if (this.f16717a.e("fff").c() != 0) {
            H1();
            return false;
        }
        IAPPurchaseManager.nativeSetUserId(j10);
        this.f16731p = j10;
        this.f16729n = str2;
        this.f16726k = str;
        this.f16741z = cVar.f();
        this.A = cVar.g();
        this.f16739x = cVar.a();
        this.B = cVar.d();
        gk.p.h("rbx.purchaseflow", "PaymentsProtocol: " + this.f16741z + ", " + this.A);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(this.f16741z, this.A));
        p1(arrayList, new q() { // from class: fj.k
            @Override // fj.m.q
            public final void a(List list) {
                this.f16709a.f1(cVar, j10, str2, str, activity, list);
            }
        });
        return true;
    }

    public final /* synthetic */ void f1(fj.c cVar, long j10, String str, String str2, Activity activity, List list) {
        gk.p.h("rbx.purchaseflow", "PaymentsProtocol: trying with dynamic query.");
        if (list == null || list.isEmpty()) {
            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: dynamic query dynamicProductDetailsList is empty.");
            return;
        }
        this.f16730o = this.A.equals("subs");
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) list.get(0);
        if (!b1(this.f16741z, eVar, this.f16730o, false)) {
            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: invalid dynamic productDetails.");
            return;
        }
        String strM0 = M0(eVar, cVar.c());
        this.f16728m = strM0;
        IAPPurchaseManager.nativeSetProviderCurrencyCode(strM0);
        gk.p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase with payload string opening billing.");
        n1(eVar, this.f16730o, j10, str, str2, activity, cVar.a(), "");
    }

    @Override // ej.g
    public boolean g(String str, long j10, long j11) {
        boolean z10;
        if (((int) j10) != 0) {
            M1();
            IAPPurchaseManager.paymentsProtocolPurchaseFinished(new fj.e(fj.e.b.FAILED_PURCHASE_RESPONSE, this.f16726k));
            z10 = false;
        } else {
            N1();
            IAPPurchaseManager.paymentsProtocolPurchaseFinished(new fj.e(fj.e.b.SUCCESS, this.f16726k));
            z10 = true;
        }
        if (th.h.a().l1()) {
            String str2 = this.f16740y;
            if (str2 == null) {
                str2 = "";
            }
            NativeGLInterface.nativeInGamePurchaseFinishedV2(z10, j11, str, str2);
        } else {
            NativeGLInterface.nativeInGamePurchaseFinished(z10, j11, str);
        }
        return true;
    }

    public final /* synthetic */ void g1(boolean z10, long j10, String str, String str2, Activity activity, String str3, com.android.billingclient.api.d dVar, v7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        gk.p.h("rbx.purchaseflow", "PaymentsProtocol: queryProductDetailsAsync.");
        if (dVar.c() != 0) {
            gk.p.e("rbx.purchaseflow", "PaymentsProtocol: Failed to get product details. BillingResult: " + dVar);
            if (th.h.a().D0()) {
                B1();
                return;
            }
            return;
        }
        if (listA.isEmpty()) {
            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: productDetailsList is empty.");
            return;
        }
        Iterator<com.android.billingclient.api.e> it = listA.iterator();
        com.android.billingclient.api.e next = null;
        while (it.hasNext()) {
            next = it.next();
            next.e().equals("subs");
        }
        n1(next, z10, j10, str, str2, activity, "", str3);
    }

    @Override // ej.g
    public boolean h(String str, String str2, Activity activity, ej.j jVar, boolean z10, String str3) {
        this.f16732q = true;
        if (str3 != null) {
            this.f16733r = str3;
        }
        gk.p.h("rbx.purchaseflow", "startInAppPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + ", paymentSessionId: " + this.f16733r);
        return V1(str, str2, activity, 0L, jVar, z10);
    }

    public final /* synthetic */ void h1(List list, q qVar, com.android.billingclient.api.d dVar, v7.n nVar) {
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
                    this.f16721f.put(eVar.d(), eVar);
                } else {
                    this.f16720e.put(eVar.d(), eVar);
                }
            }
            gk.p.h("rbx.purchaseflow", "queryProductDetails Success. Products: " + list);
        }
        qVar.a(listA);
    }

    @Override // ej.g
    public boolean i(String str, String str2, Activity activity, ej.j jVar, boolean z10) {
        this.f16732q = true;
        return V1(str, str2, activity, 0L, jVar, z10);
    }

    public final /* synthetic */ void i1(fj.c cVar, boolean z10, List list) {
        if (list == null || list.isEmpty()) {
            l1(cVar.f(), fj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            return;
        }
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) list.get(0);
        if (a1(cVar.f(), eVar, cVar.c())) {
            this.f16728m = M0(eVar, cVar.c());
            this.f16734s.h0(new ej.h(this.f16729n, cVar.f(), !z10));
            E0(null);
        }
    }

    @Override // ej.g
    public boolean j(String str) {
        this.f16739x = str;
        return !TextUtils.isEmpty(str);
    }

    public final void j1(v7.k kVar, boolean z10) {
        if (this.f16736u != null && Z0(v0(kVar))) {
            this.f16736u.b();
        }
        new ej.m(this.f16735t).b(a1.c1(), new fj.d(kVar, z10, this.f16732q), new l(kVar));
    }

    @Override // ej.g
    public void k(boolean z10) {
        this.f16732q = z10;
    }

    public final void k1(String str, fj.e.b bVar) {
        fj.e.b bVar2 = fj.e.b.SUCCESS;
        if (bVar == bVar2) {
            N1();
        } else if (bVar == fj.e.b.USER_CANCELLED) {
            L1();
        } else if (bVar == fj.e.b.ALREADY_ACKNOWLEDGED) {
            K1();
        } else {
            M1();
        }
        if (this.f16736u != null && Z0(str)) {
            ej.j jVar = this.f16736u;
            if (jVar instanceof r0) {
                if (this.f16731p != 0) {
                    String str2 = this.f16740y;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    if (this.f16737v.containsKey(str)) {
                        ((r0) this.f16736u).a(bVar == bVar2, this.f16731p, this.f16737v.get(str), str3);
                        return;
                    }
                    ((r0) this.f16736u).a(bVar == bVar2, this.f16731p, this.f16726k, str3);
                } else {
                    gk.p.k("rbx.purchaseflow", "Ignore calling inGamePurchaseFinished: mUserId=" + this.f16731p + ". mProductId=" + this.f16726k + ".. checkoutSessionId=" + this.f16740y + ".");
                }
            } else if (jVar != null) {
                jVar.e(new fj.e(bVar, this.f16726k));
            }
        }
        if (Z0(str)) {
            t1();
        }
    }

    @Override // ej.g
    public boolean l(String str) {
        this.f16740y = str;
        return !TextUtils.isEmpty(str);
    }

    public final void l1(String str, fj.e.b bVar, String str2) {
        if (str2 != null && str2.length() > 0) {
            this.f16734s.l(str2);
        }
        k1(str, bVar);
    }

    @Override // ej.g
    public void m(int i10) {
        com.roblox.client.purchase.a.e eVar;
        if (i10 == 200) {
            gk.p.h("rbx.purchaseflow", "Validation successful");
            eVar = com.roblox.client.purchase.a.e.OK;
            this.f16734s.B();
        } else if (i10 == 429) {
            gk.p.e("rbx.purchaseflow", "Service has been rate limited to user.");
            eVar = com.roblox.client.purchase.a.e.LIMIT;
            this.f16734s.G();
        } else if (i10 == 500) {
            gk.p.e("rbx.purchaseflow", "Server Error");
            eVar = com.roblox.client.purchase.a.e.UNKNOWN_ERROR;
            this.f16734s.H();
        } else if (i10 == 400) {
            gk.p.e("rbx.purchaseflow", "Service has thrown an uknown exception.");
            eVar = com.roblox.client.purchase.a.e.ERROR;
            this.f16734s.C();
        } else if (i10 == 401) {
            gk.p.e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
            eVar = com.roblox.client.purchase.a.e.ERROR;
            this.f16734s.D();
        } else if (i10 == 403) {
            gk.p.e("rbx.purchaseflow", "Unauthorized to make request. XSRF token is needed.");
            eVar = com.roblox.client.purchase.a.e.ERROR;
            this.f16734s.E();
        } else if (i10 != 404) {
            gk.p.e("rbx.purchaseflow", "Validation unknown error: " + i10);
            eVar = com.roblox.client.purchase.a.e.UNKNOWN_ERROR;
            this.f16734s.J();
        } else {
            gk.p.e("rbx.purchaseflow", "{validateModel} is invalid.");
            eVar = com.roblox.client.purchase.a.e.ERROR;
            this.f16734s.F();
        }
        int i11 = e.f16746a[eVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                F1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new fj.e(fj.e.b.VALIDATION_ERROR, this.f16726k));
                return;
            }
            if (i11 == 3) {
                I1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new fj.e(fj.e.b.VALIDATION_RETRY, this.f16726k));
            } else if (i11 == 4) {
                G1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new fj.e(fj.e.b.VALIDATION_LIMIT, this.f16726k));
            } else if (i11 != 5) {
                J1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new fj.e(fj.e.b.UNKNOWN, this.f16726k));
            } else {
                G1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new fj.e(fj.e.b.VALIDATION_LIMIT_UNDER_13, this.f16726k));
            }
        }
    }

    public void m1(long j10, String str, boolean z10) {
        if (j10 > 0) {
            IAPPurchaseManager.nativeSetUserId(j10);
        }
        gk.p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases attempt.");
        if (!X0()) {
            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchasing is not setup.");
            return;
        }
        if (U0()) {
            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchase is currently in progress.");
            return;
        }
        if (!z10 && this.f16723h) {
            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because it should only be triggered if queried history is stale or during app resume.");
            return;
        }
        if (!th.h.a().B()) {
            o1("inapp");
            o1("subs");
            this.f16723h = true;
            return;
        }
        v7.o oVarA = v7.o.b().b("inapp").a();
        v7.o oVarA2 = v7.o.b().b("subs").a();
        C1(false);
        this.f16717a.g(oVarA, new v7.l() { // from class: fj.g
            @Override // v7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f16701a.d1(dVar, list);
            }
        });
        C1(true);
        this.f16717a.g(oVarA2, new v7.l() { // from class: fj.h
            @Override // v7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f16703a.e1(dVar, list);
            }
        });
        this.f16723h = true;
    }

    @Override // ej.g
    public boolean n(String str, String str2, Activity activity, long j10, ej.j jVar) {
        this.f16732q = false;
        return V1(str, str2, activity, j10, jVar, false);
    }

    public final void n1(com.android.billingclient.api.e eVar, boolean z10, long j10, String str, String str2, Activity activity, String str3, String str4) {
        String strB;
        gk.p.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolOpenBillingFlow");
        ArrayList arrayList = new ArrayList();
        if (z10) {
            if (th.h.a().O3()) {
                strB = w0(eVar);
                if (strB == null) {
                    l1(str2, fj.e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + str2);
                    return;
                }
            } else {
                strB = eVar.f().get(0).b();
            }
            arrayList.add(com.android.billingclient.api.c.b.b().c(eVar).b(strB).a());
        } else {
            arrayList.add(com.android.billingclient.api.c.b.b().c(eVar).a());
        }
        if (j10 > 0) {
            str = Long.toString(j10);
        }
        com.android.billingclient.api.c.a aVarD = com.android.billingclient.api.c.b().b(str).d(arrayList);
        if (!th.h.a().W1()) {
            String str5 = this.f16739x;
            if (str5 != null) {
                aVarD.c(str5);
                this.f16734s.q("Android-Purchase-Initiated-With-Charge-Request-Id");
            } else {
                String str6 = this.f16740y;
                if (str6 != null) {
                    aVarD.c(str6);
                    this.f16734s.q("Android-Purchase-Initiated-With-Checkout-Session-Id");
                } else {
                    gk.p.k("rbx.purchaseflow", "Both mStoredChargeRequestId and mCurrentCheckoutSessionId are null.");
                    this.f16734s.q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
                }
            }
        } else if (str3 != null && !str3.isEmpty()) {
            aVarD.c(str3);
            this.f16734s.q("Android-Purchase-Initiated-With-Charge-Request-Id");
        } else if (str4 == null || str4.isEmpty()) {
            gk.p.k("rbx.purchaseflow", "Both chargeRequestId and checkoutSessionId are empty.");
            this.f16734s.q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
        } else {
            aVarD.c(str4);
            this.f16734s.q("Android-Purchase-Initiated-With-Checkout-Session-Id");
        }
        com.android.billingclient.api.c cVarA = aVarD.a();
        this.f16727l = str2;
        if (this.f16717a.h(activity, cVarA).c() != 0) {
            gk.p.h("rbx.purchaseflow", "PaymentsProtocol: launchBillingFlow failed!");
        }
    }

    public final void o1(String str) {
        if (W0()) {
            this.f16717a.g(v7.o.b().b(str).a(), new b());
        }
    }

    public final void p1(final List<p> list, final q qVar) {
        if (this.f16717a.e("fff").c() != 0) {
            gk.p.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            H1();
            qVar.a(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (p pVar : list) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(pVar.f16762a).c(pVar.b).a());
        }
        this.f16717a.a(com.android.billingclient.api.f.a().b(arrayList).a(), new v7.j() { // from class: fj.j
            @Override // v7.j
            public final void a(com.android.billingclient.api.d dVar, v7.n nVar) {
                this.f16707a.h1(list, qVar, dVar, nVar);
            }
        });
    }

    public final void q1(r rVar) {
        gk.p.b("rbx.purchaseflow", "Attempt queryInAppProduct");
        if (this.f16717a.e("fff").c() != 0) {
            gk.p.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            H1();
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        o oVar = this.f16718c;
        if (oVar == o.READY) {
            gk.p.b("rbx.purchaseflow", "queryInAppProduct is setup already");
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        if (oVar != o.NONE) {
            gk.p.b("rbx.purchaseflow", "queryInAppProduct is pending");
            return;
        }
        List<String> listG0 = G0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listG0.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(it.next()).c("inapp").a());
        }
        com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f16718c = o.CONNECTING;
        this.f16717a.a(fVarA, new g(rVar));
    }

    public final void r1(String str) {
        if (W0()) {
            this.f16717a.g(v7.o.b().b(str).a(), new a(str));
        }
    }

    public final void s1(r rVar) {
        gk.p.b("rbx.purchaseflow", "Attempt querySubsProduct");
        if (this.f16717a.e("subscriptions").c() != 0) {
            gk.p.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return;
        }
        if (this.f16717a.e("fff").c() != 0) {
            gk.p.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            H1();
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        gk.p.b("rbx.purchaseflow", "Attempt querySubsProduct");
        o oVar = this.f16719d;
        if (oVar == o.READY) {
            gk.p.b("rbx.purchaseflow", "querySubsProduct is setup already");
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        if (oVar != o.NONE) {
            gk.p.b("rbx.purchaseflow", "querySubsProduct is pending");
            return;
        }
        List<String> listN0 = N0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listN0.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(it.next()).c("subs").a());
        }
        com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f16719d = o.CONNECTING;
        gk.p.b("rbx.purchaseflow", "Querying SUBS ProductDetails. Count = " + arrayList.size());
        this.f16717a.a(fVarA, new h(rVar));
    }

    public final void t1() {
        this.f16725j = null;
        this.f16736u = null;
        this.f16726k = null;
        this.f16731p = 0L;
        this.f16738w = null;
        this.f16728m = null;
        this.f16732q = true;
        this.f16733r = null;
        this.f16739x = null;
        this.f16740y = null;
        this.f16741z = null;
        this.A = null;
    }

    public final void u1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.o(this.f16732q);
    }

    public String v0(v7.k kVar) {
        return fj.b.j(kVar);
    }

    public final void v1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.p(this.f16732q);
    }

    public final String w0(com.android.billingclient.api.e eVar) {
        List<String> list = this.B;
        if (list != null && !list.isEmpty()) {
            String strH = j0.h(eVar, this.B);
            if (strH != null) {
                return strH;
            }
            this.f16734s.q("Android-Subscription-Offer-Id-Not-Found");
            if (th.h.a().v0()) {
                return null;
            }
        }
        String strA = j0.a(eVar);
        if (strA != null) {
            return strA;
        }
        this.f16734s.q("Android-Subscription-Offer-No-Base-Plan-Available");
        return null;
    }

    public final void w1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.t();
    }

    public final void x0(v7.k kVar, PurchaseVerificationResponse purchaseVerificationResponse) {
        boolean zM = e0.m(v0(kVar));
        if (!kVar.i() || zM) {
            gk.p.h("rbx.purchaseflow", "Acknowledging Purchase");
            y0(kVar, new C0309m(kVar, zM, purchaseVerificationResponse));
        } else {
            gk.p.h("rbx.purchaseflow", "Attempted to acknowledge an acknowledged purchase.");
            z0(kVar, fj.e.b.ALREADY_ACKNOWLEDGED, n0.b(purchaseVerificationResponse));
        }
    }

    public final void x1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.u();
    }

    public final void y0(v7.k kVar, v7.c cVar) {
        gk.p.h("rbx.purchaseflow", "Start acknowledging Purchase");
        this.f16717a.d(v7.b.b().b(kVar.g()).a(), cVar);
    }

    public final void y1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.v();
    }

    public final void z0(v7.k kVar, fj.e.b bVar, RobloxPurchaseInfo robloxPurchaseInfo) {
        gk.p.h("rbx.purchaseflow", "Acknowledged Purchase");
        if (Y0(kVar)) {
            this.f16722g.remove(j0.e(kVar));
            k1(v0(kVar), bVar);
            return;
        }
        String strV0 = v0(kVar);
        String strE = j0.e(kVar);
        boolean zM = e0.m(strV0);
        b0 b0Var = this.f16724i;
        boolean z10 = b0Var != null && b0Var.c(strE);
        if (zM) {
            if (z10) {
                this.f16734s.q("Play-Points-Not-Show-Confirmation-Screen");
            } else {
                this.f16734s.q("Play-Points-Show-Confirmation-Screen");
                com.android.billingclient.api.e eVarJ0 = J0(strV0, false);
                NativeGLInterface.nativeOOAPPurchaseFinished(OOAPPurchaseFinishedParams.builder().setProductId(strV0).setNativeProductId(strV0).setRobuxAmount(0).setDescription(eVarJ0.a()).setDisplayPrice(j0.c(eVarJ0)).setPrice(j0.f(eVarJ0)).setCurrencyCode(j0.b(eVarJ0)).setRobloxPurchaseInfo(n0.a(robloxPurchaseInfo)).build());
                b0 b0Var2 = this.f16724i;
                if (b0Var2 != null) {
                    b0Var2.a(strE);
                }
            }
        }
        C0(kVar);
    }

    public final void z1() {
        if (nh.b.a()) {
            return;
        }
        this.f16734s.w();
    }
}
