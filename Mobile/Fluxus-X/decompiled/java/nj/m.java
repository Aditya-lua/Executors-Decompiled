package nj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
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
import pj.ValidatePurchaseResponsePayload;

/* JADX INFO: loaded from: classes2.dex */
public class m implements mj.k {
    public static m E;
    public static List<String> G;
    public static List<String> I;
    public String A;
    public List<String> B;
    public com.roblox.client.purchase.a.f C;
    public w7.m D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f25729a;
    public o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f25730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f25731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hashtable<String, com.android.billingclient.api.e> f25732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Hashtable<String, com.android.billingclient.api.e> f25733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Hashtable<String, w7.k> f25734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b0 f25736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Activity f25737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f25739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f25740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f25741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f25743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f25745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public dj.g f25746s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public mi.f f25747t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public mj.o f25748u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Hashtable<String, String> f25749v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f25750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f25751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f25752y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f25753z;
    public static List<String> F = new ArrayList(Arrays.asList("com.roblox.client.robux40", "com.roblox.robloxmobile.premium80robux", "com.roblox.robloxmobile.premium160robux", "com.roblox.robloxmobile.premium240robux", "com.roblox.robloxmobile.premium320robux", "com.roblox.robloxmobile.premium400robux", "com.roblox.robloxmobile.premium800robux", "com.roblox.robloxmobile.premium1700robux", "com.roblox.robloxmobile.premium4500robux", "com.roblox.robloxmobile.premium10000robux", "com.roblox.robloxmobile.premium88subscribed", "com.roblox.robloxmobile.premium175subscribed", "com.roblox.robloxmobile.premium265subscribed", "com.roblox.robloxmobile.premium350subscribed", "com.roblox.robloxmobile.premium440subscribed2", "com.roblox.robloxmobile.premium880subscribed", "com.roblox.robloxmobile.premium1870subscribed", "com.roblox.robloxmobile.premium4950subscribed", "com.roblox.robloxmobile.premium11000subscribed"));
    public static List<String> H = new ArrayList(Arrays.asList("com.roblox.robloxmobile.robloxpremium450", "com.roblox.robloxmobile.robloxpremium1000", "com.roblox.robloxmobile.robloxpremium2200"));

    public class a implements w7.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f25754a;

        public a(String str) {
            this.f25754a = str;
        }

        @Override // w7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<w7.k> list) {
            if (dVar.c() != 0) {
                ok.q.d("Failed QueryPurchases. BillingResult: " + dVar);
                return;
            }
            m.this.f25746s.l("QueryPurchases. ProductType: " + this.f25754a + ". ItemsCount: " + list.size() + ". Items: " + m.this.H0(list));
            m.this.R0(list, true);
        }
    }

    public class b implements w7.l {
        public b() {
        }

        @Override // w7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<w7.k> list) {
            m.this.Q0(dVar, list);
        }
    }

    public class c implements w7.l {
        public c() {
        }

        @Override // w7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<w7.k> list) {
            if (dVar.c() != 0) {
                ok.q.e("rbx.purchaseflow", "Failed QueryInAppPurchases in grantPendingPurchases. BillingResult: " + dVar);
                return;
            }
            m.this.f25746s.l("QueryInAppPurchases in grantPendingPurchases. ItemsCount: " + list.size() + ". Items: " + m.this.H0(list));
            m.this.R0(list, true);
        }
    }

    public class d implements w7.l {
        public d() {
        }

        @Override // w7.l
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull List<w7.k> list) {
            if (dVar.c() != 0) {
                ok.q.e("rbx.purchaseflow", "Failed QuerySubsPurchases in grantPendingPurchases. BillingResult: " + dVar);
                return;
            }
            m.this.f25746s.l("QuerySubsPurchases in grantPendingPurchases. ItemsCount: " + list.size() + ". Items: " + m.this.H0(list));
            m.this.R0(list, true);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25758a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[mj.r.b.values().length];
            b = iArr;
            try {
                iArr[mj.r.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[mj.r.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[mj.r.b.EMPTY_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.roblox.client.purchase.a.e.values().length];
            f25758a = iArr2;
            try {
                iArr2[com.roblox.client.purchase.a.e.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25758a[com.roblox.client.purchase.a.e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25758a[com.roblox.client.purchase.a.e.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25758a[com.roblox.client.purchase.a.e.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25758a[com.roblox.client.purchase.a.e.LIMIT_UNDER_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25758a[com.roblox.client.purchase.a.e.ERROR_CHECKING_BALANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public class f implements w7.d {
        public f() {
        }

        @Override // w7.d
        public void a(com.android.billingclient.api.d dVar) {
            if (dVar.c() == 0) {
                ok.q.h("rbx.purchaseflow", "Google Billing Client is setup");
                m.this.b = o.READY;
            } else {
                ok.q.e("rbx.purchaseflow", "Google Billing Client is not setup");
                m.this.b = o.NONE;
            }
            if (bi.h.a().t3() && m.this.f25729a.b("fff").c() == 0) {
                if (m.this.f25729a.b("subscriptions").c() == 0) {
                    m.this.s1(null);
                }
                m.this.q1(null);
            }
        }

        @Override // w7.d
        public void b() {
            ok.q.h("rbx.purchaseflow", "Google Billing Client disconnected");
            m.this.b = o.NONE;
        }
    }

    public class g implements w7.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f25760a;

        public g(r rVar) {
            this.f25760a = rVar;
        }

        @Override // w7.j
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull w7.n nVar) {
            List<com.android.billingclient.api.e> listA = nVar.a();
            if (dVar.c() == 0) {
                ok.q.b("rbx.purchaseflow", "Returned INAPP ProductDetails. Count = " + listA.size());
                for (com.android.billingclient.api.e eVar : listA) {
                    if (eVar != m.this.f25732e.put(eVar.d(), eVar)) {
                        m.this.f25732e.remove(eVar.d());
                        m.this.f25732e.put(eVar.d(), eVar);
                    }
                }
                ok.q.b("rbx.purchaseflow", "queryInAppProduct Success. Count = " + m.this.f25732e.size());
                m.this.f25730c = o.READY;
            } else {
                ok.q.e("rbx.purchaseflow", "Failed queryInAppProduct. BillingResult: " + dVar);
                m.this.f25730c = o.NONE;
            }
            r rVar = this.f25760a;
            if (rVar != null) {
                rVar.a();
            }
        }
    }

    public class h implements w7.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f25761a;

        public h(r rVar) {
            this.f25761a = rVar;
        }

        @Override // w7.j
        public void a(@NonNull com.android.billingclient.api.d dVar, @NonNull w7.n nVar) {
            List<com.android.billingclient.api.e> listA = nVar.a();
            if (dVar.c() == 0) {
                ok.q.b("rbx.purchaseflow", "Returned SUBS ProductDetails. Count = " + listA.size());
                for (com.android.billingclient.api.e eVar : listA) {
                    if (eVar != m.this.f25733f.put(eVar.d(), eVar)) {
                        m.this.f25733f.remove(eVar.d());
                        m.this.f25733f.put(eVar.d(), eVar);
                    }
                }
                ok.q.b("rbx.purchaseflow", "querySubsProduct Success. Count = " + m.this.f25733f.size());
                m.this.f25731d = o.READY;
            } else {
                ok.q.e("rbx.purchaseflow", "Failed querySubsProduct. BillingResult: " + dVar);
                m.this.f25731d = o.NONE;
            }
            r rVar = this.f25761a;
            if (rVar != null) {
                rVar.a();
            }
        }
    }

    public class i implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f25762a;

        public i(String str) {
            this.f25762a = str;
        }

        @Override // nj.m.r
        public void a() {
            m mVar = m.this;
            com.android.billingclient.api.e eVarJ0 = mVar.J0(this.f25762a, mVar.f25742o);
            m mVar2 = m.this;
            if (mVar2.a1(this.f25762a, eVarJ0, mVar2.f25742o)) {
                m mVar3 = m.this;
                mVar3.f25740m = mVar3.M0(eVarJ0, mVar3.f25742o);
                m.this.f25746s.h0(new mj.m(m.this.f25741n, this.f25762a, false));
                m.this.D0();
            }
        }
    }

    public class j implements com.roblox.client.purchase.a.f {
        public j() {
        }

        @Override // com.roblox.client.purchase.a.f
        public void a(com.roblox.client.purchase.a.e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
            m.this.f25746s.l("ValidationCheck: " + eVar + ".");
            switch (e.f25758a[eVar.ordinal()]) {
                case 1:
                    m.this.E0(validatePurchaseResponsePayload);
                    break;
                case 2:
                    m.this.F1();
                    m.this.l1(str, nj.e.b.VALIDATION_ERROR, "PrePurchaseValidation error");
                    break;
                case 3:
                    m.this.I1();
                    m.this.l1(str, nj.e.b.VALIDATION_RETRY, "PrePurchaseValidation retry");
                    break;
                case 4:
                    m.this.G1();
                    m.this.l1(str, nj.e.b.VALIDATION_LIMIT, "PrePurchaseValidation limit");
                    break;
                case 5:
                    m.this.G1();
                    m.this.l1(str, nj.e.b.VALIDATION_LIMIT_UNDER_13, "PrePurchaseValidation limit");
                    break;
                case 6:
                    m.this.E1();
                    m.this.l1(str, nj.e.b.REQUEST_BALANCE_ERROR, "PrePurchaseValidation requestBalance failed.");
                    break;
                default:
                    m.this.J1();
                    m.this.l1(str, nj.e.b.UNKNOWN, "PrePurchaseValidation Unknown error.");
                    break;
            }
        }
    }

    public class k implements w7.m {
        public k() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0116  */
        /* JADX WARN: Code duplicated, block: B:47:0x0118  */
        /* JADX WARN: Code duplicated, block: B:49:0x0122  */
        /* JADX WARN: Code duplicated, block: B:50:0x0134  */
        @Override // w7.m
        public void a(com.android.billingclient.api.d dVar, List<w7.k> list) {
            boolean z10;
            if (m.this.f25729a == null) {
                return;
            }
            int iC = dVar.c();
            if (!bi.h.a().t3()) {
                if (iC == 0) {
                    m.this.R0(list, false);
                    return;
                }
                if (iC == 1) {
                    m mVar = m.this;
                    mVar.l1(mVar.f25738k, nj.e.b.USER_CANCELLED, "User cancelled");
                    return;
                } else if (iC == 7) {
                    m.this.O0();
                    return;
                } else {
                    m mVar2 = m.this;
                    mVar2.l1(mVar2.f25738k, nj.e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
                    return;
                }
            }
            String str = null;
            if (iC == 0) {
                if (list != null) {
                    z10 = false;
                    for (w7.k kVar : list) {
                        int iF = kVar.f();
                        String strV0 = m.this.v0(kVar);
                        if (iF == 0) {
                            m.this.P1();
                            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: unspecified state!");
                        } else if (iF != 2) {
                            z10 = true;
                        } else {
                            m.this.D1();
                            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: Pending purchase!");
                        }
                        if (z10) {
                            IAPPurchaseManager.nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(kVar.g(), kVar.d());
                            IAPPurchaseManager.nativeFinishPaymentsProtocolPurchase(m.this.v0(kVar), iC, bi.h.a().h2() ? m.this.I0(kVar) : kVar.a().a());
                        }
                        str = strV0;
                    }
                }
                if (m.this.Z0(str)) {
                    if (!z10) {
                        if (bi.h.a().u1()) {
                            NativeGLInterface.nativeInGamePurchaseFinishedV2(false, m.this.f25743p, m.this.f25738k, BuildConfig.FLAVOR);
                        } else {
                            NativeGLInterface.nativeInGamePurchaseFinished(false, m.this.f25743p, m.this.f25738k);
                        }
                    }
                    m.this.t1();
                }
                m.this.f25735h = false;
            }
            if (iC == 1) {
                if (bi.h.a().V()) {
                    m mVar3 = m.this;
                    mVar3.l1(mVar3.f25738k, nj.e.b.USER_CANCELLED, "User cancelled");
                } else {
                    m.this.L1();
                }
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new nj.e(nj.e.b.USER_CANCELLED, m.this.f25738k));
            } else if (iC != 7) {
                if (bi.h.a().V()) {
                    m mVar4 = m.this;
                    mVar4.l1(mVar4.f25738k, nj.e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
                } else {
                    m.this.M1();
                }
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new nj.e(nj.e.b.FAILED_PURCHASE_RESPONSE, m.this.f25738k));
            } else if (bi.h.a().q()) {
                m mVar5 = m.this;
                mVar5.m1(mVar5.f25743p, m.this.f25741n, false);
            } else {
                m.this.O0();
            }
            z10 = false;
            if (m.this.Z0(str)) {
                if (!z10) {
                    if (bi.h.a().u1()) {
                        NativeGLInterface.nativeInGamePurchaseFinishedV2(false, m.this.f25743p, m.this.f25738k, BuildConfig.FLAVOR);
                    } else {
                        NativeGLInterface.nativeInGamePurchaseFinished(false, m.this.f25743p, m.this.f25738k);
                    }
                }
                m.this.t1();
            }
            m.this.f25735h = false;
        }
    }

    public class l implements mj.r.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w7.k f25765a;

        public l(w7.k kVar) {
            this.f25765a = kVar;
        }

        @Override // mj.r.c
        public void a(mj.r.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
            m.this.f25746s.l("VerifyPurchase. Response=" + bVar + ".ReceiptId=" + this.f25765a.b());
            if (m.this.f25748u != null) {
                m.this.f25748u.d();
            }
            if (bVar != mj.r.b.OK && !this.f25765a.i()) {
                m.this.O1();
            }
            int i10 = e.b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    m.this.R1();
                    m mVar = m.this;
                    mVar.l1(mVar.v0(this.f25765a), nj.e.b.RECEIPT_VERIFICATION_ERROR, "launchVerifyPurchaseReceipt error");
                    return;
                } else if (i10 != 3) {
                    m.this.S1();
                    m mVar2 = m.this;
                    mVar2.l1(mVar2.v0(this.f25765a), nj.e.b.UNKNOWN, "launchVerifyPurchaseReceipt unknown error");
                    return;
                } else {
                    m.this.Q1();
                    m mVar3 = m.this;
                    mVar3.l1(mVar3.v0(this.f25765a), nj.e.b.RECEIPT_EMPTY, "launchVerifyPurchaseReceipt empty response");
                    return;
                }
            }
            String strV0 = m.this.v0(this.f25765a);
            if (m.this.Y0(this.f25765a)) {
                ok.q.h("rbx.purchaseflow", "Receipt Verification Successful for Subscription");
                if (m.this.V0(strV0)) {
                    nk.c.c().t(nk.c.c().f() + mj.p.e(strV0));
                }
                boolean zY0 = m.this.Y0(this.f25765a);
                com.android.billingclient.api.e eVarJ0 = m.this.J0(strV0, zY0);
                if (m.this.b1(strV0, eVarJ0, zY0, false)) {
                    m.this.f25746s.m(strV0, m.K0(eVarJ0, zY0), m.this.M0(eVarJ0, zY0), m.L0(eVarJ0, zY0));
                } else {
                    ok.q.h("rbx.purchaseflow", "Unable to find skuDetails: " + strV0);
                }
            }
            m.this.x0(this.f25765a, purchaseVerificationResponse);
        }
    }

    /* JADX INFO: renamed from: nj.m$m, reason: collision with other inner class name */
    public class C0499m implements w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w7.k f25766a;
        public final /* synthetic */ boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PurchaseVerificationResponse f25767c;

        public C0499m(w7.k kVar, boolean z10, PurchaseVerificationResponse purchaseVerificationResponse) {
            this.f25766a = kVar;
            this.b = z10;
            this.f25767c = purchaseVerificationResponse;
        }

        @Override // w7.c
        public void a(com.android.billingclient.api.d dVar) {
            int iC = dVar.c();
            boolean z10 = iC == 0;
            m.this.f25746s.l("OnAcknowledgePurchaseResponse. Success: " + z10 + ". Message: " + dVar.toString() + ".");
            boolean z11 = nj.b.j(this.f25766a) != null;
            if (z11) {
                m.this.f25746s.q("Android-Purchase-Completed-With-Checkout-Session-Id");
            }
            if (z10) {
                if (this.b) {
                    m.this.f25746s.q("Play-Points-Ack-Purchase-Succeed");
                }
                m.this.z0(this.f25766a, nj.e.b.SUCCESS, n0.b(this.f25767c));
                return;
            }
            if (this.b) {
                m.this.f25746s.q("Play-Points-Ack-Purchase-Fail");
            }
            ok.q.k("rbx.purchaseflow", "Failed to acknowledge Purchase");
            m.this.u1();
            if (z11) {
                m.this.P0(this.f25766a, iC);
            }
        }
    }

    public class n implements w7.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f25769a;
        public final /* synthetic */ w7.k b;

        public n(String str, w7.k kVar) {
            this.f25769a = str;
            this.b = kVar;
        }

        @Override // w7.f
        public void a(com.android.billingclient.api.d dVar, String str) {
            boolean z10 = dVar.c() == 0;
            m.this.f25746s.l("OnConsumeResponse. Success: " + z10 + ". Message: " + dVar.toString() + ".");
            if (z10) {
                if (e0.m(this.f25769a)) {
                    m.this.f25746s.q("Play-Points-Consume-Purchase-Succeed");
                }
                m.this.k1(this.f25769a, nj.e.b.SUCCESS);
                com.android.billingclient.api.e eVarJ0 = m.this.J0(this.f25769a, false);
                if (m.this.b1(this.f25769a, eVarJ0, false, false)) {
                    m.this.f25746s.m(this.f25769a, m.K0(eVarJ0, false), m.this.M0(eVarJ0, false), m.L0(eVarJ0, false));
                } else {
                    ok.q.h("rbx.purchaseflow", "Unable to find skuDetails: " + this.f25769a);
                }
                String strE = j0.e(this.b);
                if (m.this.f25734g.containsKey(strE)) {
                    m.this.f25734g.remove(strE);
                }
            } else {
                if (e0.m(this.f25769a)) {
                    m.this.f25746s.q("Play-Points-Consume-Purchase-Fail");
                }
                m.this.v1();
                m mVar = m.this;
                mVar.l1(mVar.v0(this.b), nj.e.b.CONSUME_ERROR, "OnAcknowledgePurchaseResponse failure");
            }
            ok.q.h("rbx.purchaseflow", "End consume flow.");
        }
    }

    public enum o {
        NONE,
        CONNECTING,
        READY
    }

    public class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25774a;
        public String b;

        public p(String str, String str2) {
            this.f25774a = str;
            this.b = str2;
        }

        @NonNull
        public String toString() {
            return "{ productType: " + this.b + ", providerProductId: " + this.f25774a + " }";
        }
    }

    public interface q {
        void a(List<com.android.billingclient.api.e> list);
    }

    public interface r {
        void a();
    }

    public m(h0 h0Var, mi.f fVar, dj.g gVar) {
        o oVar = o.NONE;
        this.b = oVar;
        this.f25730c = oVar;
        this.f25731d = oVar;
        this.f25732e = new Hashtable<>();
        this.f25733f = new Hashtable<>();
        this.f25734g = new Hashtable<>();
        this.f25735h = false;
        this.f25736i = null;
        this.f25738k = null;
        this.f25739l = null;
        this.f25740m = null;
        this.f25741n = BuildConfig.FLAVOR;
        this.f25743p = 0L;
        this.f25744q = true;
        this.f25745r = null;
        this.f25749v = new Hashtable<>();
        this.f25751x = null;
        this.f25752y = null;
        this.f25753z = null;
        this.A = null;
        this.B = null;
        this.C = new j();
        this.D = new k();
        this.f25729a = h0Var;
        this.f25747t = fVar;
        this.f25746s = gVar;
    }

    public static m F0(Context context) {
        if (E == null) {
            E = new m(new nj.b(), new mi.h(), dj.g.b());
            E.U1(com.android.billingclient.api.a.f(context).c(E.D).b(w7.i.c().b().c().a()).a());
            E.T1(new b0(context));
        }
        return E;
    }

    public static List<String> G0() {
        String strV3 = bi.h.a().V3();
        if (strV3.isEmpty()) {
            return F;
        }
        if (G == null) {
            G = Arrays.asList(strV3.split(","));
        }
        return G;
    }

    public static String K0(com.android.billingclient.api.e eVar, boolean z10) {
        if (z10) {
            List<com.android.billingclient.api.e.C0118e> listF = eVar.f();
            Objects.requireNonNull(listF);
            return listF.get(0).c().a().get(0).a();
        }
        com.android.billingclient.api.e.b bVarB = eVar.b();
        Objects.requireNonNull(bVarB);
        return bVarB.a();
    }

    public static long L0(com.android.billingclient.api.e eVar, boolean z10) {
        if (z10) {
            List<com.android.billingclient.api.e.C0118e> listF = eVar.f();
            Objects.requireNonNull(listF);
            return listF.get(0).c().a().get(0).b();
        }
        com.android.billingclient.api.e.b bVarB = eVar.b();
        Objects.requireNonNull(bVarB);
        return bVarB.c();
    }

    public static List<String> N0() {
        String strK0 = bi.h.a().K0();
        if (strK0.isEmpty()) {
            return H;
        }
        if (I == null) {
            I = Arrays.asList(strK0.split(","));
        }
        return I;
    }

    private boolean T0() {
        return this.f25734g.size() > 0;
    }

    public void A0(long j10, String str, boolean z10) {
        this.f25743p = j10;
        B0(str, z10);
    }

    public final void A1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.x();
    }

    public void B0(String str, boolean z10) {
        this.f25741n = str;
        ok.q.b("rbx.purchaseflow", "attemptGrantPendingPurchases isAppResume:" + z10);
        if (!X0()) {
            ok.q.b("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchasing is not setup");
            return;
        }
        if (U0()) {
            ok.q.b("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchase already pending");
            return;
        }
        if (z10) {
            O0();
            return;
        }
        if (!T0()) {
            if (this.f25735h) {
                return;
            }
            O0();
            this.f25735h = true;
            return;
        }
        ok.q.b("rbx.purchaseflow", "Found cached pending purchase. Count = " + this.f25734g.size());
        O0();
    }

    public final void B1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.q("Payments-Protocol-Query-Product-Details-Failed");
    }

    public final void C0(w7.k kVar) {
        String strV0 = v0(kVar);
        if (bi.h.a().u0() || !e0.l(strV0)) {
            ok.q.h("rbx.purchaseflow", "Consuming Purchase");
            this.f25729a.g(w7.e.b().b(kVar.g()).a(), new n(strV0, kVar));
        } else if (e0.m(strV0)) {
            this.f25746s.q("Play-Points-Not-Consume-Purchase");
        }
    }

    public final void C1(boolean z10) {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.Q(z10);
    }

    public final void D0() {
        mj.o oVar = this.f25748u;
        if (oVar != null) {
            oVar.c();
        }
        com.roblox.client.purchase.a aVar = new com.roblox.client.purchase.a(this.f25747t);
        String str = this.f25745r;
        String str2 = (str == null || str.isEmpty()) ? null : this.f25745r;
        if (this.f25744q) {
            aVar.e(a1.c1(), this.f25738k, this.f25740m, str2, this.C);
        } else {
            aVar.c(a1.c1(), this.f25738k, this.f25740m, str2, this.C);
        }
    }

    public final void D1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.R();
    }

    public final void E0(ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
        String strB;
        mj.o oVar = this.f25748u;
        if (oVar != null) {
            oVar.d();
        }
        this.f25746s.l("PurchaseStarted.");
        com.android.billingclient.api.e eVarJ0 = J0(this.f25738k, this.f25742o);
        if (a1(this.f25738k, eVarJ0, this.f25742o)) {
            ArrayList arrayList = new ArrayList();
            if (this.f25742o) {
                if (bi.h.a().d4()) {
                    strB = w0(eVarJ0);
                    if (strB == null) {
                        l1(this.f25738k, nj.e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + this.f25738k);
                        return;
                    }
                } else {
                    strB = eVarJ0.f().get(0).b();
                }
                arrayList.add(com.android.billingclient.api.c.b.b().c(eVarJ0).b(strB).a());
            } else {
                arrayList.add(com.android.billingclient.api.c.b.b().c(eVarJ0).a());
            }
            com.android.billingclient.api.c.a aVarD = com.android.billingclient.api.c.b().b((validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getUserId() == null || validatePurchaseResponsePayload.getUserId().longValue() <= 0) ? this.f25741n : String.valueOf(validatePurchaseResponsePayload.getUserId())).d(arrayList);
            String str = this.f25750w;
            if (str != null) {
                aVarD.c(str);
                this.f25746s.q("Android-Purchase-Initiated-With-Charge-Request-Id");
            } else if (validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getCheckoutSessionId() == null) {
                ok.q.k("rbx.purchaseflow", "Both mCurrentChargeRequestId and mCurrentCheckoutSessionId is null.");
                this.f25746s.q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
            } else {
                aVarD.c(validatePurchaseResponsePayload.getCheckoutSessionId());
                this.f25746s.q("Android-Purchase-Initiated-With-Checkout-Session-Id");
            }
            com.android.billingclient.api.c cVarA = aVarD.a();
            if (this.f25737j.getIntent() == null) {
                this.f25737j.setIntent(new Intent());
            }
            if (this.f25729a.h(this.f25737j, cVarA).c() != 0) {
                l1(this.f25738k, nj.e.b.FAILED_PURCHASE_RESPONSE, "BillingClient.launchBillingFlow failed");
            }
        }
    }

    public final void E1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.S(this.f25744q, false);
    }

    public final void F1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.T(this.f25744q, false);
    }

    public final void G1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.a0(this.f25744q, false);
    }

    public final String H0(List<w7.k> list) {
        Iterator<w7.k> it = list.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            str = str + v0(it.next()) + "; ";
        }
        return str;
    }

    public final void H1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.U(this.f25744q, false);
    }

    public final String I0(w7.k kVar) {
        try {
            Long.parseLong(kVar.a().b());
            return kVar.a().b();
        } catch (Exception unused) {
            ok.q.k("rbx.purchaseflow", "PaymentsProtocol: purchase.getAccountIdentifiers().getObfuscatedProfileId() did not return an integer and is not a valid checkoutSessionId.");
            return BuildConfig.FLAVOR;
        }
    }

    public final void I1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.V(this.f25744q, false);
    }

    public final com.android.billingclient.api.e J0(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (z10 && this.f25733f.containsKey(str)) {
            return this.f25733f.get(str);
        }
        if (!z10 && this.f25732e.containsKey(str)) {
            return this.f25732e.get(str);
        }
        ok.q.e("rbx.purchaseflow", "Unable to get product details for productId: " + str);
        return null;
    }

    public final void J1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.W(this.f25744q, false);
    }

    public final void K1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.X(this.f25744q, false);
    }

    public final void L1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.Y(this.f25744q, false);
    }

    public final String M0(com.android.billingclient.api.e eVar, boolean z10) {
        if (z10) {
            List<com.android.billingclient.api.e.C0118e> listF = eVar.f();
            Objects.requireNonNull(listF);
            return listF.get(0).c().a().get(0).c();
        }
        com.android.billingclient.api.e.b bVarB = eVar.b();
        Objects.requireNonNull(bVarB);
        return bVarB.d();
    }

    public final void M1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.Z(this.f25744q, false);
    }

    public final void N1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.b0(this.f25744q, false);
    }

    public final void O0() {
        ok.q.h("rbx.purchaseflow", "Do Google Purchase GrantPending");
        if (!bi.h.a().D()) {
            r1("inapp");
            r1("subs");
        } else if (W0()) {
            w7.o oVarA = w7.o.b().b("inapp").a();
            w7.o oVarA2 = w7.o.b().b("subs").a();
            C1(false);
            this.f25729a.f(oVarA, new c());
            C1(true);
            this.f25729a.f(oVarA2, new d());
        }
    }

    public final void O1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.c0();
    }

    public final void P0(w7.k kVar, int i10) {
        ok.q.h("rbx.purchaseflow", "Acknowledge error, response code: " + i10 + ", skipping client side acknowledge purchase.");
        this.f25746s.q("Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore");
        String strE = j0.e(kVar);
        if (this.f25734g.containsKey(strE)) {
            this.f25734g.remove(strE);
        }
        String strV0 = v0(kVar);
        if (!Y0(kVar)) {
            com.android.billingclient.api.e eVarJ0 = J0(strV0, false);
            if (b1(strV0, eVarJ0, false, false)) {
                this.f25746s.m(strV0, K0(eVarJ0, false), M0(eVarJ0, false), L0(eVarJ0, false));
            } else {
                ok.q.h("rbx.purchaseflow", "Unable to find skuDetails: " + strV0);
            }
        }
        k1(strV0, nj.e.b.SUCCESS);
    }

    public final void P1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.d0();
    }

    public final void Q0(com.android.billingclient.api.d dVar, List<w7.k> list) {
        int iC = dVar.c();
        if (iC != 0) {
            ok.q.a("Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        for (w7.k kVar : list) {
            int iF = kVar.f();
            if (iF == 0) {
                P1();
            } else if (iF == 1) {
                ok.q.b("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases for purchase " + kVar);
                IAPPurchaseManager.nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(kVar.g(), kVar.d());
                IAPPurchaseManager.nativeFinishPaymentsProtocolPurchase(v0(kVar), iC, bi.h.a().h2() ? I0(kVar) : kVar.a().a());
            } else if (iF == 2) {
                D1();
            }
        }
    }

    public final void Q1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.e0(this.f25744q, false);
    }

    public final void R0(List<w7.k> list, final boolean z10) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final Hashtable hashtable = new Hashtable();
        for (w7.k kVar : list) {
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
        q qVar = new q() { // from class: nj.i
            @Override // nj.m.q
            public final void a(List list2) {
                this.f25716a.c1(hashtable, z10, list2);
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
        if (wh.b.a()) {
            return;
        }
        this.f25746s.f0(this.f25744q, false);
    }

    public final void S0(w7.k kVar, boolean z10) {
        ok.q.h("rbx.purchaseflow", "Handle single purchase. Product id: " + v0(kVar) + ". Order id: " + kVar.b() + ". isAcknowledged: " + kVar.i());
        int iF = kVar.f();
        if (iF == 0) {
            P1();
        } else if (iF == 2) {
            D1();
        }
        if (kVar.f() != 1) {
            return;
        }
        this.f25734g.put(j0.e(kVar), kVar);
        if (!e0.m(v0(kVar))) {
            w7.a aVarA = kVar.a();
            String strA = aVarA.a();
            String strB = aVarA.b();
            String str = this.f25741n;
            if (str == null || !str.equals(strA)) {
                long j10 = this.f25743p;
                if ((j10 <= 0 || !Long.toString(j10).equals(strA)) && (strB == null || strB.equals(BuildConfig.FLAVOR))) {
                    w1();
                    if (bi.h.a().L0()) {
                        String str2 = this.f25741n;
                        if (str2 == null) {
                            A1();
                        } else if (!str2.equals(strA)) {
                            z1();
                        }
                        long j11 = this.f25743p;
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
        if (wh.b.a()) {
            return;
        }
        this.f25746s.g0(this.f25744q, false);
    }

    public void T1(b0 b0Var) {
        this.f25736i = b0Var;
    }

    public boolean U0() {
        return this.f25738k != null;
    }

    public void U1(com.android.billingclient.api.a aVar) {
        o oVar = this.b;
        if (oVar == o.READY) {
            ok.q.h("rbx.purchaseflow", "Google Billing Client is already setup");
            return;
        }
        o oVar2 = o.CONNECTING;
        if (oVar == oVar2) {
            ok.q.h("rbx.purchaseflow", "Google Billing Client is already connecting");
            return;
        }
        this.f25729a.e(aVar);
        this.b = oVar2;
        ok.q.h("rbx.purchaseflow", "Connecting Google Billing's Client");
        this.f25729a.i(new f());
    }

    public final boolean V0(String str) {
        return N0().contains(str);
    }

    public final boolean V1(String str, String str2, Activity activity, long j10, mj.o oVar, boolean z10) {
        ok.q.h("rbx.purchaseflow", "startPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + "isInApp: " + this.f25744q);
        this.f25741n = str;
        if (!W0()) {
            return false;
        }
        this.f25748u = oVar;
        this.f25743p = j10;
        this.f25738k = str2;
        this.f25737j = activity;
        this.f25742o = V0(str2);
        i iVar = new i(str2);
        if (this.f25742o) {
            s1(iVar);
            return true;
        }
        q1(iVar);
        return true;
    }

    public boolean W0() {
        return !this.f25741n.isEmpty() && X0();
    }

    public final void W1(w7.k kVar, String str, boolean z10) {
        boolean zM = e0.m(v0(kVar));
        b0 b0Var = this.f25736i;
        boolean z11 = b0Var != null && b0Var.c(str);
        if (!kVar.i() || (zM && !z11)) {
            j1(kVar, z10);
        } else {
            z0(kVar, nj.e.b.ALREADY_ACKNOWLEDGED, new RobloxPurchaseInfo());
        }
    }

    public boolean X0() {
        h0 h0Var = this.f25729a;
        return h0Var != null && this.b == o.READY && h0Var.a();
    }

    public final boolean Y0(w7.k kVar) {
        String strV0 = v0(kVar);
        return V0(strV0) || !(G0().contains(strV0) || e0.m(strV0));
    }

    public final boolean Z0(String str) {
        String str2 = this.f25738k;
        if (str2 == null || str == null) {
            return false;
        }
        return str2.equals(str);
    }

    @Override // mj.k
    public boolean a(final String str, final long j10, final String str2, final String str3, final Activity activity) {
        ok.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase.");
        this.f25746s.l("PurchaseStarted.");
        final boolean zV0 = V0(str);
        if (zV0 && this.f25729a.b("subscriptions").c() != 0) {
            return false;
        }
        if (this.f25729a.b("fff").c() != 0) {
            H1();
            return false;
        }
        IAPPurchaseManager.nativeSetUserId(j10);
        this.f25743p = j10;
        this.f25741n = str2;
        this.f25738k = str;
        String str4 = zV0 ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.android.billingclient.api.f.b.b().b(str).c(str4).a());
        this.f25729a.c(com.android.billingclient.api.f.a().b(arrayList).a(), new w7.j() { // from class: nj.f
            @Override // w7.j
            public final void a(com.android.billingclient.api.d dVar, w7.n nVar) {
                this.f25697a.g1(zV0, j10, str2, str, activity, str3, dVar, nVar);
            }
        });
        return true;
    }

    public final boolean a1(String str, com.android.billingclient.api.e eVar, boolean z10) {
        return b1(str, eVar, z10, true);
    }

    @Override // mj.k
    public boolean b(String str, String str2, Activity activity, long j10, mj.o oVar) {
        this.f25744q = false;
        return V1(str, str2, activity, j10, oVar, false);
    }

    public final boolean b1(String str, com.android.billingclient.api.e eVar, boolean z10, boolean z11) {
        if (eVar == null) {
            ok.q.h("rbx.purchaseflow", "Product details not found after query.");
            if (z11) {
                l1(str, nj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            }
            return false;
        }
        if (z10 && eVar.f() == null) {
            if (z11) {
                l1(this.f25738k, nj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
            }
            return false;
        }
        if (z10 || eVar.b() != null) {
            return true;
        }
        if (z11) {
            l1(this.f25738k, nj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
        }
        return false;
    }

    public final /* synthetic */ void c1(Map map, boolean z10, List list) {
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
                    S0((w7.k) map.get(strD), z10);
                } else {
                    ok.q.e("rbx.purchaseflow", "Cannot find purchase associated with product details. ProductId: " + strD);
                }
            }
        }
    }

    @Override // mj.k
    public boolean d(long j10, String str, String str2, Activity activity, final boolean z10, mj.o oVar) {
        final nj.c cVar = new nj.c(str2);
        if (!cVar.b()) {
            ok.q.e("rbx.purchaseflow", "Purchase request is invalid. Raw payload: " + str2);
            return false;
        }
        if (cVar.c() && this.f25729a.b("subscriptions").c() != 0) {
            ok.q.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return false;
        }
        ok.q.h("rbx.purchaseflow", "Initiated purchase. Params: " + cVar);
        this.f25741n = Long.toString(j10);
        if (!W0()) {
            ok.q.e("rbx.purchaseflow", "Purchasing is not enabled. Params: " + cVar);
            return false;
        }
        this.f25743p = j10;
        this.f25738k = cVar.f();
        this.f25750w = cVar.a();
        this.B = cVar.d();
        this.f25737j = activity;
        this.f25744q = !z10;
        this.f25748u = oVar;
        this.f25742o = cVar.c();
        if (cVar.c()) {
            this.f25749v.put(cVar.f(), str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(cVar.f(), cVar.g()));
        p1(arrayList, new q() { // from class: nj.l
            @Override // nj.m.q
            public final void a(List list) {
                this.f25726a.i1(cVar, z10, list);
            }
        });
        return true;
    }

    public final /* synthetic */ void d1(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.f25746s.l("PaymentsProtocol: QueryInAppPurchases. ItemsCount: " + list.size() + ". Items: " + H0(list));
        Q0(dVar, list);
    }

    @Override // mj.k
    public String e(String str) {
        boolean zV0 = V0(str);
        this.f25742o = zV0;
        com.android.billingclient.api.e eVarJ0 = J0(str, zV0);
        return !a1(str, eVarJ0, this.f25742o) ? BuildConfig.FLAVOR : M0(eVarJ0, this.f25742o);
    }

    public final /* synthetic */ void e1(com.android.billingclient.api.d dVar, List list) {
        if (dVar.c() != 0) {
            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: Failed QueryPurchases. BillingResult: " + dVar);
            return;
        }
        this.f25746s.l("PaymentsProtocol: QuerySubsPurchases. ItemsCount: " + list.size() + ". Items: " + H0(list));
        Q0(dVar, list);
    }

    @Override // mj.k
    public boolean f(String str, String str2, Activity activity, mj.o oVar, boolean z10) {
        this.f25744q = true;
        return V1(str, str2, activity, 0L, oVar, z10);
    }

    public final /* synthetic */ void f1(nj.c cVar, long j10, String str, String str2, Activity activity, List list) {
        ok.q.h("rbx.purchaseflow", "PaymentsProtocol: trying with dynamic query.");
        if (list == null || list.isEmpty()) {
            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: dynamic query dynamicProductDetailsList is empty.");
            return;
        }
        this.f25742o = this.A.equals("subs");
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) list.get(0);
        if (!b1(this.f25753z, eVar, this.f25742o, false)) {
            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: invalid dynamic productDetails.");
            return;
        }
        String strM0 = M0(eVar, cVar.c());
        this.f25740m = strM0;
        IAPPurchaseManager.nativeSetProviderCurrencyCode(strM0);
        ok.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase with payload string opening billing.");
        n1(eVar, this.f25742o, j10, str, str2, activity, cVar.a(), BuildConfig.FLAVOR);
    }

    @Override // mj.k
    public boolean g(final String str, final long j10, final String str2, final Activity activity, String str3) {
        ok.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase with payload string.");
        this.f25746s.l("PurchaseStarted.");
        final nj.c cVar = new nj.c(str3);
        if (cVar.c() && this.f25729a.b("subscriptions").c() != 0) {
            return false;
        }
        if (this.f25729a.b("fff").c() != 0) {
            H1();
            return false;
        }
        IAPPurchaseManager.nativeSetUserId(j10);
        this.f25743p = j10;
        this.f25741n = str2;
        this.f25738k = str;
        this.f25753z = cVar.f();
        this.A = cVar.g();
        this.f25751x = cVar.a();
        this.B = cVar.d();
        ok.q.h("rbx.purchaseflow", "PaymentsProtocol: " + this.f25753z + ", " + this.A);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(this.f25753z, this.A));
        p1(arrayList, new q() { // from class: nj.k
            @Override // nj.m.q
            public final void a(List list) {
                this.f25721a.f1(cVar, j10, str2, str, activity, list);
            }
        });
        return true;
    }

    public final /* synthetic */ void g1(boolean z10, long j10, String str, String str2, Activity activity, String str3, com.android.billingclient.api.d dVar, w7.n nVar) {
        List<com.android.billingclient.api.e> listA = nVar.a();
        ok.q.h("rbx.purchaseflow", "PaymentsProtocol: queryProductDetailsAsync.");
        if (dVar.c() != 0) {
            ok.q.e("rbx.purchaseflow", "PaymentsProtocol: Failed to get product details. BillingResult: " + dVar);
            if (bi.h.a().L0()) {
                B1();
                return;
            }
            return;
        }
        if (listA.isEmpty()) {
            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: productDetailsList is empty.");
            return;
        }
        Iterator<com.android.billingclient.api.e> it = listA.iterator();
        com.android.billingclient.api.e next = null;
        while (it.hasNext()) {
            next = it.next();
            next.e().equals("subs");
        }
        n1(next, z10, j10, str, str2, activity, BuildConfig.FLAVOR, str3);
    }

    @Override // mj.k
    public boolean h(String str, long j10, long j11) {
        boolean z10;
        if (((int) j10) != 0) {
            M1();
            IAPPurchaseManager.paymentsProtocolPurchaseFinished(new nj.e(nj.e.b.FAILED_PURCHASE_RESPONSE, this.f25738k));
            z10 = false;
        } else {
            N1();
            IAPPurchaseManager.paymentsProtocolPurchaseFinished(new nj.e(nj.e.b.SUCCESS, this.f25738k));
            z10 = true;
        }
        if (bi.h.a().u1()) {
            String str2 = this.f25752y;
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            NativeGLInterface.nativeInGamePurchaseFinishedV2(z10, j11, str, str2);
        } else {
            NativeGLInterface.nativeInGamePurchaseFinished(z10, j11, str);
        }
        return true;
    }

    public final /* synthetic */ void h1(List list, q qVar, com.android.billingclient.api.d dVar, w7.n nVar) {
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
                    this.f25733f.put(eVar.d(), eVar);
                } else {
                    this.f25732e.put(eVar.d(), eVar);
                }
            }
            ok.q.h("rbx.purchaseflow", "queryProductDetails Success. Products: " + list);
        }
        qVar.a(listA);
    }

    @Override // mj.k
    public boolean i(String str) {
        this.f25751x = str;
        return !TextUtils.isEmpty(str);
    }

    public final /* synthetic */ void i1(nj.c cVar, boolean z10, List list) {
        if (list == null || list.isEmpty()) {
            l1(cVar.f(), nj.e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            return;
        }
        com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) list.get(0);
        if (a1(cVar.f(), eVar, cVar.c())) {
            this.f25740m = M0(eVar, cVar.c());
            this.f25746s.h0(new mj.m(this.f25741n, cVar.f(), !z10));
            E0(null);
        }
    }

    @Override // mj.k
    public void j(s0 s0Var) {
        this.f25748u = s0Var;
    }

    public final void j1(w7.k kVar, boolean z10) {
        if (this.f25748u != null && Z0(v0(kVar))) {
            this.f25748u.b();
        }
        new mj.r(this.f25747t).b(a1.d1(), new nj.d(kVar, z10, this.f25744q), new l(kVar));
    }

    @Override // mj.k
    public void k(boolean z10) {
        this.f25744q = z10;
    }

    public final void k1(String str, nj.e.b bVar) {
        nj.e.b bVar2 = nj.e.b.SUCCESS;
        if (bVar == bVar2) {
            N1();
        } else if (bVar == nj.e.b.USER_CANCELLED) {
            L1();
        } else if (bVar == nj.e.b.ALREADY_ACKNOWLEDGED) {
            K1();
        } else {
            M1();
        }
        if (this.f25748u != null && Z0(str)) {
            mj.o oVar = this.f25748u;
            if (oVar instanceof s0) {
                if (this.f25743p != 0) {
                    String str2 = this.f25752y;
                    if (str2 == null) {
                        str2 = BuildConfig.FLAVOR;
                    }
                    String str3 = str2;
                    if (this.f25749v.containsKey(str)) {
                        ((s0) this.f25748u).a(bVar == bVar2, this.f25743p, this.f25749v.get(str), str3);
                        return;
                    }
                    ((s0) this.f25748u).a(bVar == bVar2, this.f25743p, this.f25738k, str3);
                } else {
                    ok.q.k("rbx.purchaseflow", "Ignore calling inGamePurchaseFinished: mUserId=" + this.f25743p + ". mProductId=" + this.f25738k + ".. checkoutSessionId=" + this.f25752y + ".");
                }
            } else if (oVar != null) {
                oVar.e(new nj.e(bVar, this.f25738k));
            }
        }
        if (Z0(str)) {
            t1();
        }
    }

    @Override // mj.k
    public boolean l(String str, String str2, Activity activity, mj.o oVar, boolean z10, String str3) {
        this.f25744q = true;
        if (str3 != null) {
            this.f25745r = str3;
        }
        ok.q.h("rbx.purchaseflow", "startInAppPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + ", paymentSessionId: " + this.f25745r);
        return V1(str, str2, activity, 0L, oVar, z10);
    }

    public final void l1(String str, nj.e.b bVar, String str2) {
        if (str2 != null && str2.length() > 0) {
            this.f25746s.l(str2);
        }
        k1(str, bVar);
    }

    @Override // mj.k
    public boolean m(String str) {
        this.f25752y = str;
        return !TextUtils.isEmpty(str);
    }

    public void m1(long j10, String str, boolean z10) {
        if (j10 > 0) {
            IAPPurchaseManager.nativeSetUserId(j10);
        }
        ok.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases attempt.");
        if (!X0()) {
            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchasing is not setup.");
            return;
        }
        if (U0()) {
            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchase is currently in progress.");
            return;
        }
        if (!z10 && this.f25735h) {
            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because it should only be triggered if queried history is stale or during app resume.");
            return;
        }
        if (!bi.h.a().D()) {
            o1("inapp");
            o1("subs");
            this.f25735h = true;
            return;
        }
        w7.o oVarA = w7.o.b().b("inapp").a();
        w7.o oVarA2 = w7.o.b().b("subs").a();
        C1(false);
        this.f25729a.f(oVarA, new w7.l() { // from class: nj.g
            @Override // w7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f25713a.d1(dVar, list);
            }
        });
        C1(true);
        this.f25729a.f(oVarA2, new w7.l() { // from class: nj.h
            @Override // w7.l
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f25715a.e1(dVar, list);
            }
        });
        this.f25735h = true;
    }

    @Override // mj.k
    public void n(int i10) {
        com.roblox.client.purchase.a.e eVar;
        if (i10 == 200) {
            ok.q.h("rbx.purchaseflow", "Validation successful");
            eVar = com.roblox.client.purchase.a.e.OK;
            this.f25746s.B();
        } else if (i10 == 429) {
            ok.q.e("rbx.purchaseflow", "Service has been rate limited to user.");
            eVar = com.roblox.client.purchase.a.e.LIMIT;
            this.f25746s.G();
        } else if (i10 == 500) {
            ok.q.e("rbx.purchaseflow", "Server Error");
            eVar = com.roblox.client.purchase.a.e.UNKNOWN_ERROR;
            this.f25746s.H();
        } else if (i10 == 400) {
            ok.q.e("rbx.purchaseflow", "Service has thrown an uknown exception.");
            eVar = com.roblox.client.purchase.a.e.ERROR;
            this.f25746s.C();
        } else if (i10 == 401) {
            ok.q.e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
            eVar = com.roblox.client.purchase.a.e.ERROR;
            this.f25746s.D();
        } else if (i10 == 403) {
            ok.q.e("rbx.purchaseflow", "Unauthorized to make request. XSRF token is needed.");
            eVar = com.roblox.client.purchase.a.e.ERROR;
            this.f25746s.E();
        } else if (i10 != 404) {
            ok.q.e("rbx.purchaseflow", "Validation unknown error: " + i10);
            eVar = com.roblox.client.purchase.a.e.UNKNOWN_ERROR;
            this.f25746s.J();
        } else {
            ok.q.e("rbx.purchaseflow", "{validateModel} is invalid.");
            eVar = com.roblox.client.purchase.a.e.ERROR;
            this.f25746s.F();
        }
        int i11 = e.f25758a[eVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                F1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new nj.e(nj.e.b.VALIDATION_ERROR, this.f25738k));
                return;
            }
            if (i11 == 3) {
                I1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new nj.e(nj.e.b.VALIDATION_RETRY, this.f25738k));
            } else if (i11 == 4) {
                G1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new nj.e(nj.e.b.VALIDATION_LIMIT, this.f25738k));
            } else if (i11 != 5) {
                J1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new nj.e(nj.e.b.UNKNOWN, this.f25738k));
            } else {
                G1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new nj.e(nj.e.b.VALIDATION_LIMIT_UNDER_13, this.f25738k));
            }
        }
    }

    public final void n1(com.android.billingclient.api.e eVar, boolean z10, long j10, String str, String str2, Activity activity, String str3, String str4) {
        String strB;
        ok.q.h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolOpenBillingFlow");
        ArrayList arrayList = new ArrayList();
        if (z10) {
            if (bi.h.a().d4()) {
                strB = w0(eVar);
                if (strB == null) {
                    l1(str2, nj.e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + str2);
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
        if (!bi.h.a().h2()) {
            String str5 = this.f25751x;
            if (str5 != null) {
                aVarD.c(str5);
                this.f25746s.q("Android-Purchase-Initiated-With-Charge-Request-Id");
            } else {
                String str6 = this.f25752y;
                if (str6 != null) {
                    aVarD.c(str6);
                    this.f25746s.q("Android-Purchase-Initiated-With-Checkout-Session-Id");
                } else {
                    ok.q.k("rbx.purchaseflow", "Both mStoredChargeRequestId and mCurrentCheckoutSessionId are null.");
                    this.f25746s.q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
                }
            }
        } else if (str3 != null && !str3.isEmpty()) {
            aVarD.c(str3);
            this.f25746s.q("Android-Purchase-Initiated-With-Charge-Request-Id");
        } else if (str4 == null || str4.isEmpty()) {
            ok.q.k("rbx.purchaseflow", "Both chargeRequestId and checkoutSessionId are empty.");
            this.f25746s.q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
        } else {
            aVarD.c(str4);
            this.f25746s.q("Android-Purchase-Initiated-With-Checkout-Session-Id");
        }
        com.android.billingclient.api.c cVarA = aVarD.a();
        this.f25739l = str2;
        if (this.f25729a.h(activity, cVarA).c() != 0) {
            ok.q.h("rbx.purchaseflow", "PaymentsProtocol: launchBillingFlow failed!");
        }
    }

    public final void o1(String str) {
        if (W0()) {
            this.f25729a.f(w7.o.b().b(str).a(), new b());
        }
    }

    public final void p1(final List<p> list, final q qVar) {
        if (this.f25729a.b("fff").c() != 0) {
            ok.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            H1();
            qVar.a(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (p pVar : list) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(pVar.f25774a).c(pVar.b).a());
        }
        this.f25729a.c(com.android.billingclient.api.f.a().b(arrayList).a(), new w7.j() { // from class: nj.j
            @Override // w7.j
            public final void a(com.android.billingclient.api.d dVar, w7.n nVar) {
                this.f25719a.h1(list, qVar, dVar, nVar);
            }
        });
    }

    public final void q1(r rVar) {
        ok.q.b("rbx.purchaseflow", "Attempt queryInAppProduct");
        if (this.f25729a.b("fff").c() != 0) {
            ok.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            H1();
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        o oVar = this.f25730c;
        if (oVar == o.READY) {
            ok.q.b("rbx.purchaseflow", "queryInAppProduct is setup already");
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        if (oVar != o.NONE) {
            ok.q.b("rbx.purchaseflow", "queryInAppProduct is pending");
            return;
        }
        List<String> listG0 = G0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listG0.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(it.next()).c("inapp").a());
        }
        com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f25730c = o.CONNECTING;
        this.f25729a.c(fVarA, new g(rVar));
    }

    public final void r1(String str) {
        if (W0()) {
            this.f25729a.f(w7.o.b().b(str).a(), new a(str));
        }
    }

    public final void s1(r rVar) {
        ok.q.b("rbx.purchaseflow", "Attempt querySubsProduct");
        if (this.f25729a.b("subscriptions").c() != 0) {
            ok.q.e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return;
        }
        if (this.f25729a.b("fff").c() != 0) {
            ok.q.e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            H1();
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        ok.q.b("rbx.purchaseflow", "Attempt querySubsProduct");
        o oVar = this.f25731d;
        if (oVar == o.READY) {
            ok.q.b("rbx.purchaseflow", "querySubsProduct is setup already");
            if (rVar != null) {
                rVar.a();
                return;
            }
            return;
        }
        if (oVar != o.NONE) {
            ok.q.b("rbx.purchaseflow", "querySubsProduct is pending");
            return;
        }
        List<String> listN0 = N0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listN0.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.f.b.b().b(it.next()).c("subs").a());
        }
        com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.a().b(arrayList).a();
        this.f25731d = o.CONNECTING;
        ok.q.b("rbx.purchaseflow", "Querying SUBS ProductDetails. Count = " + arrayList.size());
        this.f25729a.c(fVarA, new h(rVar));
    }

    public final void t1() {
        this.f25737j = null;
        this.f25748u = null;
        this.f25738k = null;
        this.f25743p = 0L;
        this.f25750w = null;
        this.f25740m = null;
        this.f25744q = true;
        this.f25745r = null;
        this.f25751x = null;
        this.f25752y = null;
        this.f25753z = null;
        this.A = null;
    }

    public final void u1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.o(this.f25744q);
    }

    public String v0(w7.k kVar) {
        return nj.b.k(kVar);
    }

    public final void v1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.p(this.f25744q);
    }

    public final String w0(com.android.billingclient.api.e eVar) {
        List<String> list = this.B;
        if (list != null && !list.isEmpty()) {
            String strH = j0.h(eVar, this.B);
            if (strH != null) {
                return strH;
            }
            this.f25746s.q("Android-Subscription-Offer-Id-Not-Found");
            if (bi.h.a().D0()) {
                return null;
            }
        }
        String strA = j0.a(eVar);
        if (strA != null) {
            return strA;
        }
        this.f25746s.q("Android-Subscription-Offer-No-Base-Plan-Available");
        return null;
    }

    public final void w1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.t();
    }

    public final void x0(w7.k kVar, PurchaseVerificationResponse purchaseVerificationResponse) {
        boolean zM = e0.m(v0(kVar));
        if (!kVar.i() || zM) {
            ok.q.h("rbx.purchaseflow", "Acknowledging Purchase");
            y0(kVar, new C0499m(kVar, zM, purchaseVerificationResponse));
        } else {
            ok.q.h("rbx.purchaseflow", "Attempted to acknowledge an acknowledged purchase.");
            z0(kVar, nj.e.b.ALREADY_ACKNOWLEDGED, n0.b(purchaseVerificationResponse));
        }
    }

    public final void x1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.u();
    }

    public final void y0(w7.k kVar, w7.c cVar) {
        ok.q.h("rbx.purchaseflow", "Start acknowledging Purchase");
        this.f25729a.d(w7.b.b().b(kVar.g()).a(), cVar);
    }

    public final void y1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.v();
    }

    public final void z0(w7.k kVar, nj.e.b bVar, RobloxPurchaseInfo robloxPurchaseInfo) {
        ok.q.h("rbx.purchaseflow", "Acknowledged Purchase");
        if (Y0(kVar)) {
            this.f25734g.remove(j0.e(kVar));
            k1(v0(kVar), bVar);
            return;
        }
        String strV0 = v0(kVar);
        String strE = j0.e(kVar);
        boolean zM = e0.m(strV0);
        b0 b0Var = this.f25736i;
        boolean z10 = b0Var != null && b0Var.c(strE);
        if (zM) {
            if (z10) {
                this.f25746s.q("Play-Points-Not-Show-Confirmation-Screen");
            } else {
                this.f25746s.q("Play-Points-Show-Confirmation-Screen");
                com.android.billingclient.api.e eVarJ0 = J0(strV0, false);
                NativeGLInterface.nativeOOAPPurchaseFinished(OOAPPurchaseFinishedParams.builder().g(strV0).e(strV0).i(0).c(eVarJ0.a()).d(j0.c(eVarJ0)).f(j0.f(eVarJ0)).b(j0.b(eVarJ0)).h(n0.a(robloxPurchaseInfo)).a());
                b0 b0Var2 = this.f25736i;
                if (b0Var2 != null) {
                    b0Var2.a(strE);
                }
            }
        }
        C0(kVar);
    }

    public final void z1() {
        if (wh.b.a()) {
            return;
        }
        this.f25746s.w();
    }
}
