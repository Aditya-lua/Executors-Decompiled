package fj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
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
import p104ei.C5130h;
import p104ei.InterfaceC5128f;
import p105ej.AbstractC5153k;
import p105ej.C5150h;
import p105ej.C5155m;
import p105ej.InterfaceC5149g;
import p105ej.InterfaceC5152j;
import p151gk.C6124q;
import p174hj.ValidatePurchaseResponsePayload;
import p308nh.C9476b;
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
import vi.C12216g;

/* JADX INFO: renamed from: fj.m */
/* JADX INFO: loaded from: classes2.dex */
public class C5636m implements InterfaceC5149g {

    /* JADX INFO: renamed from: E */
    public static C5636m f21599E;

    /* JADX INFO: renamed from: G */
    public static List<String> f21601G;

    /* JADX INFO: renamed from: I */
    public static List<String> f21603I;

    /* JADX INFO: renamed from: A */
    public String f21604A;

    /* JADX INFO: renamed from: B */
    public List<String> f21605B;

    /* JADX INFO: renamed from: C */
    public C3219a.f f21606C;

    /* JADX INFO: renamed from: D */
    public InterfaceC12058m f21607D;

    /* JADX INFO: renamed from: a */
    public InterfaceC5627h0 f21608a;

    /* JADX INFO: renamed from: b */
    public o f21609b;

    /* JADX INFO: renamed from: c */
    public o f21610c;

    /* JADX INFO: renamed from: d */
    public o f21611d;

    /* JADX INFO: renamed from: e */
    public Hashtable<String, C1749e> f21612e;

    /* JADX INFO: renamed from: f */
    public Hashtable<String, C1749e> f21613f;

    /* JADX INFO: renamed from: g */
    public Hashtable<String, C12052k> f21614g;

    /* JADX INFO: renamed from: h */
    public boolean f21615h;

    /* JADX INFO: renamed from: i */
    public C5615b0 f21616i;

    /* JADX INFO: renamed from: j */
    public Activity f21617j;

    /* JADX INFO: renamed from: k */
    public String f21618k;

    /* JADX INFO: renamed from: l */
    public String f21619l;

    /* JADX INFO: renamed from: m */
    public String f21620m;

    /* JADX INFO: renamed from: n */
    public String f21621n;

    /* JADX INFO: renamed from: o */
    public boolean f21622o;

    /* JADX INFO: renamed from: p */
    public long f21623p;

    /* JADX INFO: renamed from: q */
    public boolean f21624q;

    /* JADX INFO: renamed from: r */
    public String f21625r;

    /* JADX INFO: renamed from: s */
    public C12216g f21626s;

    /* JADX INFO: renamed from: t */
    public InterfaceC5128f f21627t;

    /* JADX INFO: renamed from: u */
    public InterfaceC5152j f21628u;

    /* JADX INFO: renamed from: v */
    public final Hashtable<String, String> f21629v;

    /* JADX INFO: renamed from: w */
    public String f21630w;

    /* JADX INFO: renamed from: x */
    public String f21631x;

    /* JADX INFO: renamed from: y */
    public String f21632y;

    /* JADX INFO: renamed from: z */
    public String f21633z;

    /* JADX INFO: renamed from: F */
    public static List<String> f21600F = new ArrayList(Arrays.asList("com.roblox.client.robux40", "com.roblox.robloxmobile.premium80robux", "com.roblox.robloxmobile.premium160robux", "com.roblox.robloxmobile.premium240robux", "com.roblox.robloxmobile.premium320robux", "com.roblox.robloxmobile.premium400robux", "com.roblox.robloxmobile.premium800robux", "com.roblox.robloxmobile.premium1700robux", "com.roblox.robloxmobile.premium4500robux", "com.roblox.robloxmobile.premium10000robux", "com.roblox.robloxmobile.premium88subscribed", "com.roblox.robloxmobile.premium175subscribed", "com.roblox.robloxmobile.premium265subscribed", "com.roblox.robloxmobile.premium350subscribed", "com.roblox.robloxmobile.premium440subscribed2", "com.roblox.robloxmobile.premium880subscribed", "com.roblox.robloxmobile.premium1870subscribed", "com.roblox.robloxmobile.premium4950subscribed", "com.roblox.robloxmobile.premium11000subscribed"));

    /* JADX INFO: renamed from: H */
    public static List<String> f21602H = new ArrayList(Arrays.asList("com.roblox.robloxmobile.robloxpremium450", "com.roblox.robloxmobile.robloxpremium1000", "com.roblox.robloxmobile.robloxpremium2200"));

    /* JADX INFO: renamed from: fj.m$a */
    public class a implements InterfaceC12055l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21634a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(String str) {
            this.f21634a = str;
        }

        @Override // p486v7.InterfaceC12055l
        /* JADX INFO: renamed from: a */
        public void mo25471a(@NonNull C1748d c1748d, @NonNull List<C12052k> list) {
            if (c1748d.m8610c() != 0) {
                C6124q.m27059d("Failed QueryPurchases. BillingResult: " + c1748d);
                return;
            }
            C5636m.this.f21626s.m45273l("QueryPurchases. ProductType: " + this.f21634a + ". ItemsCount: " + list.size() + ". Items: " + C5636m.this.m25565H0(list));
            C5636m.this.m25582R0(list, true);
        }
    }

    /* JADX INFO: renamed from: fj.m$b */
    public class b implements InterfaceC12055l {
        public b() {
        }

        @Override // p486v7.InterfaceC12055l
        /* JADX INFO: renamed from: a */
        public void mo25471a(@NonNull C1748d c1748d, @NonNull List<C12052k> list) {
            C5636m.this.m25580Q0(c1748d, list);
        }
    }

    /* JADX INFO: renamed from: fj.m$c */
    public class c implements InterfaceC12055l {
        public c() {
        }

        @Override // p486v7.InterfaceC12055l
        /* JADX INFO: renamed from: a */
        public void mo25471a(@NonNull C1748d c1748d, @NonNull List<C12052k> list) {
            if (c1748d.m8610c() != 0) {
                C6124q.m27060e("rbx.purchaseflow", "Failed QueryInAppPurchases in grantPendingPurchases. BillingResult: " + c1748d);
                return;
            }
            C5636m.this.f21626s.m45273l("QueryInAppPurchases in grantPendingPurchases. ItemsCount: " + list.size() + ". Items: " + C5636m.this.m25565H0(list));
            C5636m.this.m25582R0(list, true);
        }
    }

    /* JADX INFO: renamed from: fj.m$d */
    public class d implements InterfaceC12055l {
        public d() {
        }

        @Override // p486v7.InterfaceC12055l
        /* JADX INFO: renamed from: a */
        public void mo25471a(@NonNull C1748d c1748d, @NonNull List<C12052k> list) {
            if (c1748d.m8610c() != 0) {
                C6124q.m27060e("rbx.purchaseflow", "Failed QuerySubsPurchases in grantPendingPurchases. BillingResult: " + c1748d);
                return;
            }
            C5636m.this.f21626s.m45273l("QuerySubsPurchases in grantPendingPurchases. ItemsCount: " + list.size() + ". Items: " + C5636m.this.m25565H0(list));
            C5636m.this.m25582R0(list, true);
        }
    }

    /* JADX INFO: renamed from: fj.m$e */
    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21639a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f21640b;

        static {
            int[] iArr = new int[C5155m.b.values().length];
            f21640b = iArr;
            try {
                iArr[C5155m.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21640b[C5155m.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21640b[C5155m.b.EMPTY_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C3219a.e.values().length];
            f21639a = iArr2;
            try {
                iArr2[C3219a.e.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21639a[C3219a.e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21639a[C3219a.e.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21639a[C3219a.e.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21639a[C3219a.e.LIMIT_UNDER_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21639a[C3219a.e.ERROR_CHECKING_BALANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: fj.m$f */
    public class f implements InterfaceC12026d {
        public f() {
        }

        @Override // p486v7.InterfaceC12026d
        /* JADX INFO: renamed from: a */
        public void mo25422a(C1748d c1748d) {
            if (c1748d.m8610c() == 0) {
                C6124q.m27063h("rbx.purchaseflow", "Google Billing Client is setup");
                C5636m.this.f21609b = o.READY;
            } else {
                C6124q.m27060e("rbx.purchaseflow", "Google Billing Client is not setup");
                C5636m.this.f21609b = o.NONE;
            }
            if (C11659h.m43403a().mo43677m3() && C5636m.this.f21608a.mo25432e("fff").m8610c() == 0) {
                if (C5636m.this.f21608a.mo25432e("subscriptions").m8610c() == 0) {
                    C5636m.this.m25614s1(null);
                }
                C5636m.this.m25612q1(null);
            }
        }

        @Override // p486v7.InterfaceC12026d
        /* JADX INFO: renamed from: b */
        public void mo25423b() {
            C6124q.m27063h("rbx.purchaseflow", "Google Billing Client disconnected");
            C5636m.this.f21609b = o.NONE;
        }
    }

    /* JADX INFO: renamed from: fj.m$g */
    public class g implements InterfaceC12049j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r f21642a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public g(r rVar) {
            this.f21642a = rVar;
        }

        @Override // p486v7.InterfaceC12049j
        /* JADX INFO: renamed from: a */
        public void mo25466a(@NonNull C1748d c1748d, @NonNull C12061n c12061n) {
            List<C1749e> listM44899a = c12061n.m44899a();
            if (c1748d.m8610c() == 0) {
                C6124q.m27057b("rbx.purchaseflow", "Returned INAPP ProductDetails. Count = " + listM44899a.size());
                for (C1749e c1749e : listM44899a) {
                    if (c1749e != C5636m.this.f21612e.put(c1749e.m8618d(), c1749e)) {
                        C5636m.this.f21612e.remove(c1749e.m8618d());
                        C5636m.this.f21612e.put(c1749e.m8618d(), c1749e);
                    }
                }
                C6124q.m27057b("rbx.purchaseflow", "queryInAppProduct Success. Count = " + C5636m.this.f21612e.size());
                C5636m.this.f21610c = o.READY;
            } else {
                C6124q.m27060e("rbx.purchaseflow", "Failed queryInAppProduct. BillingResult: " + c1748d);
                C5636m.this.f21610c = o.NONE;
            }
            r rVar = this.f21642a;
            if (rVar != null) {
                rVar.mo25627a();
            }
        }
    }

    /* JADX INFO: renamed from: fj.m$h */
    public class h implements InterfaceC12049j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r f21644a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public h(r rVar) {
            this.f21644a = rVar;
        }

        @Override // p486v7.InterfaceC12049j
        /* JADX INFO: renamed from: a */
        public void mo25466a(@NonNull C1748d c1748d, @NonNull C12061n c12061n) {
            List<C1749e> listM44899a = c12061n.m44899a();
            if (c1748d.m8610c() == 0) {
                C6124q.m27057b("rbx.purchaseflow", "Returned SUBS ProductDetails. Count = " + listM44899a.size());
                for (C1749e c1749e : listM44899a) {
                    if (c1749e != C5636m.this.f21613f.put(c1749e.m8618d(), c1749e)) {
                        C5636m.this.f21613f.remove(c1749e.m8618d());
                        C5636m.this.f21613f.put(c1749e.m8618d(), c1749e);
                    }
                }
                C6124q.m27057b("rbx.purchaseflow", "querySubsProduct Success. Count = " + C5636m.this.f21613f.size());
                C5636m.this.f21611d = o.READY;
            } else {
                C6124q.m27060e("rbx.purchaseflow", "Failed querySubsProduct. BillingResult: " + c1748d);
                C5636m.this.f21611d = o.NONE;
            }
            r rVar = this.f21644a;
            if (rVar != null) {
                rVar.mo25627a();
            }
        }
    }

    /* JADX INFO: renamed from: fj.m$i */
    public class i implements r {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21646a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public i(String str) {
            this.f21646a = str;
        }

        @Override // fj.C5636m.r
        /* JADX INFO: renamed from: a */
        public void mo25627a() {
            C5636m c5636m = C5636m.this;
            C1749e c1749eM25569J0 = c5636m.m25569J0(this.f21646a, c5636m.f21622o);
            C5636m c5636m2 = C5636m.this;
            if (c5636m2.m25596a1(this.f21646a, c1749eM25569J0, c5636m2.f21622o)) {
                C5636m c5636m3 = C5636m.this;
                c5636m3.f21620m = c5636m3.m25573M0(c1749eM25569J0, c5636m3.f21622o);
                C5636m.this.f21626s.m45268h0(new C5150h(C5636m.this.f21621n, this.f21646a, false));
                C5636m.this.m25559D0();
            }
        }
    }

    /* JADX INFO: renamed from: fj.m$j */
    public class j implements C3219a.f {
        public j() {
        }

        @Override // com.roblox.client.purchase.C3219a.f
        /* JADX INFO: renamed from: a */
        public void mo15396a(C3219a.e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
            C5636m.this.f21626s.m45273l("ValidationCheck: " + eVar + ".");
            switch (e.f21639a[eVar.ordinal()]) {
                case 1:
                    C5636m.this.m25561E0(validatePurchaseResponsePayload);
                    break;
                case 2:
                    C5636m.this.m25563F1();
                    C5636m.this.m25607l1(str, C5620e.b.VALIDATION_ERROR, "PrePurchaseValidation error");
                    break;
                case 3:
                    C5636m.this.m25568I1();
                    C5636m.this.m25607l1(str, C5620e.b.VALIDATION_RETRY, "PrePurchaseValidation retry");
                    break;
                case 4:
                    C5636m.this.m25564G1();
                    C5636m.this.m25607l1(str, C5620e.b.VALIDATION_LIMIT, "PrePurchaseValidation limit");
                    break;
                case 5:
                    C5636m.this.m25564G1();
                    C5636m.this.m25607l1(str, C5620e.b.VALIDATION_LIMIT_UNDER_13, "PrePurchaseValidation limit");
                    break;
                case 6:
                    C5636m.this.m25562E1();
                    C5636m.this.m25607l1(str, C5620e.b.REQUEST_BALANCE_ERROR, "PrePurchaseValidation requestBalance failed.");
                    break;
                default:
                    C5636m.this.m25570J1();
                    C5636m.this.m25607l1(str, C5620e.b.UNKNOWN, "PrePurchaseValidation Unknown error.");
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: fj.m$k */
    public class k implements InterfaceC12058m {
        public k() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0116  */
        /* JADX WARN: Code duplicated, block: B:47:0x0118  */
        /* JADX WARN: Code duplicated, block: B:49:0x0122  */
        /* JADX WARN: Code duplicated, block: B:50:0x0134  */
        @Override // p486v7.InterfaceC12058m
        /* JADX INFO: renamed from: a */
        public void mo25424a(C1748d c1748d, List<C12052k> list) {
            boolean z10;
            if (C5636m.this.f21608a == null) {
                return;
            }
            int iM8610c = c1748d.m8610c();
            if (!C11659h.m43403a().mo43677m3()) {
                if (iM8610c == 0) {
                    C5636m.this.m25582R0(list, false);
                    return;
                }
                if (iM8610c == 1) {
                    C5636m c5636m = C5636m.this;
                    c5636m.m25607l1(c5636m.f21618k, C5620e.b.USER_CANCELLED, "User cancelled");
                    return;
                } else if (iM8610c == 7) {
                    C5636m.this.m25576O0();
                    return;
                } else {
                    C5636m c5636m2 = C5636m.this;
                    c5636m2.m25607l1(c5636m2.f21618k, C5620e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
                    return;
                }
            }
            String str = null;
            if (iM8610c == 0) {
                if (list != null) {
                    z10 = false;
                    for (C12052k c12052k : list) {
                        int iM44885f = c12052k.m44885f();
                        String strM25617v0 = C5636m.this.m25617v0(c12052k);
                        if (iM44885f == 0) {
                            C5636m.this.m25579P1();
                            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: unspecified state!");
                        } else if (iM44885f != 2) {
                            z10 = true;
                        } else {
                            C5636m.this.m25560D1();
                            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: Pending purchase!");
                        }
                        if (z10) {
                            IAPPurchaseManager.nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(c12052k.m44886g(), c12052k.m44883d());
                            IAPPurchaseManager.nativeFinishPaymentsProtocolPurchase(C5636m.this.m25617v0(c12052k), iM8610c, C11659h.m43403a().mo43603c2() ? C5636m.this.m25567I0(c12052k) : c12052k.m44880a().m44840a());
                        }
                        str = strM25617v0;
                    }
                }
                if (C5636m.this.m25595Z0(str)) {
                    if (!z10) {
                        if (C11659h.m43403a().mo43703q1()) {
                            NativeGLInterface.nativeInGamePurchaseFinishedV2(false, C5636m.this.f21623p, C5636m.this.f21618k, "");
                        } else {
                            NativeGLInterface.nativeInGamePurchaseFinished(false, C5636m.this.f21623p, C5636m.this.f21618k);
                        }
                    }
                    C5636m.this.m25615t1();
                }
                C5636m.this.f21615h = false;
            }
            if (iM8610c == 1) {
                if (C11659h.m43403a().mo43542U()) {
                    C5636m c5636m3 = C5636m.this;
                    c5636m3.m25607l1(c5636m3.f21618k, C5620e.b.USER_CANCELLED, "User cancelled");
                } else {
                    C5636m.this.m25572L1();
                }
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new C5620e(C5620e.b.USER_CANCELLED, C5636m.this.f21618k));
            } else if (iM8610c != 7) {
                if (C11659h.m43403a().mo43542U()) {
                    C5636m c5636m4 = C5636m.this;
                    c5636m4.m25607l1(c5636m4.f21618k, C5620e.b.FAILED_PURCHASE_RESPONSE, "onPurchasesUpdated failed");
                } else {
                    C5636m.this.m25574M1();
                }
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new C5620e(C5620e.b.FAILED_PURCHASE_RESPONSE, C5636m.this.f21618k));
            } else if (C11659h.m43403a().mo43708r()) {
                C5636m c5636m5 = C5636m.this;
                c5636m5.m25608m1(c5636m5.f21623p, C5636m.this.f21621n, false);
            } else {
                C5636m.this.m25576O0();
            }
            z10 = false;
            if (C5636m.this.m25595Z0(str)) {
                if (!z10) {
                    if (C11659h.m43403a().mo43703q1()) {
                        NativeGLInterface.nativeInGamePurchaseFinishedV2(false, C5636m.this.f21623p, C5636m.this.f21618k, "");
                    } else {
                        NativeGLInterface.nativeInGamePurchaseFinished(false, C5636m.this.f21623p, C5636m.this.f21618k);
                    }
                }
                C5636m.this.m25615t1();
            }
            C5636m.this.f21615h = false;
        }
    }

    /* JADX INFO: renamed from: fj.m$l */
    public class l implements C5155m.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12052k f21650a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public l(C12052k c12052k) {
            this.f21650a = c12052k;
        }

        @Override // p105ej.C5155m.c
        /* JADX INFO: renamed from: a */
        public void mo23991a(C5155m.b bVar, PurchaseVerificationResponse purchaseVerificationResponse) {
            C5636m.this.f21626s.m45273l("VerifyPurchase. Response=" + bVar + ".ReceiptId=" + this.f21650a.m44881b());
            if (C5636m.this.f21628u != null) {
                C5636m.this.f21628u.mo15034d();
            }
            if (bVar != C5155m.b.OK && !this.f21650a.m44888i()) {
                C5636m.this.m25577O1();
            }
            int i10 = e.f21640b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    C5636m.this.m25583R1();
                    C5636m c5636m = C5636m.this;
                    c5636m.m25607l1(c5636m.m25617v0(this.f21650a), C5620e.b.RECEIPT_VERIFICATION_ERROR, "launchVerifyPurchaseReceipt error");
                    return;
                } else if (i10 != 3) {
                    C5636m.this.m25585S1();
                    C5636m c5636m2 = C5636m.this;
                    c5636m2.m25607l1(c5636m2.m25617v0(this.f21650a), C5620e.b.UNKNOWN, "launchVerifyPurchaseReceipt unknown error");
                    return;
                } else {
                    C5636m.this.m25581Q1();
                    C5636m c5636m3 = C5636m.this;
                    c5636m3.m25607l1(c5636m3.m25617v0(this.f21650a), C5620e.b.RECEIPT_EMPTY, "launchVerifyPurchaseReceipt empty response");
                    return;
                }
            }
            String strM25617v0 = C5636m.this.m25617v0(this.f21650a);
            if (C5636m.this.m25594Y0(this.f21650a)) {
                C6124q.m27063h("rbx.purchaseflow", "Receipt Verification Successful for Subscription");
                if (C5636m.this.m25589V0(strM25617v0)) {
                    C5654c.m25669c().m25688t(C5654c.m25669c().m25674f() + AbstractC5153k.m23983e(strM25617v0));
                }
                boolean zM25594Y0 = C5636m.this.m25594Y0(this.f21650a);
                C1749e c1749eM25569J0 = C5636m.this.m25569J0(strM25617v0, zM25594Y0);
                if (C5636m.this.m25597b1(strM25617v0, c1749eM25569J0, zM25594Y0, false)) {
                    C5636m.this.f21626s.m45274m(strM25617v0, C5636m.m25501K0(c1749eM25569J0, zM25594Y0), C5636m.this.m25573M0(c1749eM25569J0, zM25594Y0), C5636m.m25503L0(c1749eM25569J0, zM25594Y0));
                } else {
                    C6124q.m27063h("rbx.purchaseflow", "Unable to find skuDetails: " + strM25617v0);
                }
            }
            C5636m.this.m25621x0(this.f21650a, purchaseVerificationResponse);
        }
    }

    /* JADX INFO: renamed from: fj.m$m */
    public class m implements InterfaceC12022c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12052k f21652a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f21653b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ PurchaseVerificationResponse f21654c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public m(C12052k c12052k, boolean z10, PurchaseVerificationResponse purchaseVerificationResponse) {
            this.f21652a = c12052k;
            this.f21653b = z10;
            this.f21654c = purchaseVerificationResponse;
        }

        @Override // p486v7.InterfaceC12022c
        /* JADX INFO: renamed from: a */
        public void mo25628a(C1748d c1748d) {
            int iM8610c = c1748d.m8610c();
            boolean z10 = iM8610c == 0;
            C5636m.this.f21626s.m45273l("OnAcknowledgePurchaseResponse. Success: " + z10 + ". Message: " + c1748d.toString() + ".");
            boolean z11 = C5614b.m25426i(this.f21652a) != null;
            if (z11) {
                C5636m.this.f21626s.m45278q("Android-Purchase-Completed-With-Checkout-Session-Id");
            }
            if (z10) {
                if (this.f21653b) {
                    C5636m.this.f21626s.m45278q("Play-Points-Ack-Purchase-Succeed");
                }
                C5636m.this.m25625z0(this.f21652a, C5620e.b.SUCCESS, C5639n0.m25663b(this.f21654c));
                return;
            }
            if (this.f21653b) {
                C5636m.this.f21626s.m45278q("Play-Points-Ack-Purchase-Fail");
            }
            C6124q.m27066k("rbx.purchaseflow", "Failed to acknowledge Purchase");
            C5636m.this.m25616u1();
            if (z11) {
                C5636m.this.m25578P0(this.f21652a, iM8610c);
            }
        }
    }

    /* JADX INFO: renamed from: fj.m$n */
    public class n implements InterfaceC12034f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21656a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C12052k f21657b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public n(String str, C12052k c12052k) {
            this.f21656a = str;
            this.f21657b = c12052k;
        }

        @Override // p486v7.InterfaceC12034f
        /* JADX INFO: renamed from: a */
        public void mo25629a(C1748d c1748d, String str) {
            boolean z10 = c1748d.m8610c() == 0;
            C5636m.this.f21626s.m45273l("OnConsumeResponse. Success: " + z10 + ". Message: " + c1748d.toString() + ".");
            if (z10) {
                if (C5621e0.m25460m(this.f21656a)) {
                    C5636m.this.f21626s.m45278q("Play-Points-Consume-Purchase-Succeed");
                }
                C5636m.this.m25606k1(this.f21656a, C5620e.b.SUCCESS);
                C1749e c1749eM25569J0 = C5636m.this.m25569J0(this.f21656a, false);
                if (C5636m.this.m25597b1(this.f21656a, c1749eM25569J0, false, false)) {
                    C5636m.this.f21626s.m45274m(this.f21656a, C5636m.m25501K0(c1749eM25569J0, false), C5636m.this.m25573M0(c1749eM25569J0, false), C5636m.m25503L0(c1749eM25569J0, false));
                } else {
                    C6124q.m27063h("rbx.purchaseflow", "Unable to find skuDetails: " + this.f21656a);
                }
                String strM25479e = C5631j0.m25479e(this.f21657b);
                if (C5636m.this.f21614g.containsKey(strM25479e)) {
                    C5636m.this.f21614g.remove(strM25479e);
                }
            } else {
                if (C5621e0.m25460m(this.f21656a)) {
                    C5636m.this.f21626s.m45278q("Play-Points-Consume-Purchase-Fail");
                }
                C5636m.this.m25618v1();
                C5636m c5636m = C5636m.this;
                c5636m.m25607l1(c5636m.m25617v0(this.f21657b), C5620e.b.CONSUME_ERROR, "OnAcknowledgePurchaseResponse failure");
            }
            C6124q.m27063h("rbx.purchaseflow", "End consume flow.");
        }
    }

    /* JADX INFO: renamed from: fj.m$o */
    public enum o {
        NONE,
        CONNECTING,
        READY
    }

    /* JADX INFO: renamed from: fj.m$p */
    public class p {

        /* JADX INFO: renamed from: a */
        public String f21663a;

        /* JADX INFO: renamed from: b */
        public String f21664b;

        public p(String str, String str2) {
            this.f21663a = str;
            this.f21664b = str2;
        }

        @NonNull
        public String toString() {
            return "{ productType: " + this.f21664b + ", providerProductId: " + this.f21663a + " }";
        }
    }

    /* JADX INFO: renamed from: fj.m$q */
    public interface q {
        /* JADX INFO: renamed from: a */
        void mo25472a(List<C1749e> list);
    }

    /* JADX INFO: renamed from: fj.m$r */
    public interface r {
        /* JADX INFO: renamed from: a */
        void mo25627a();
    }

    public C5636m(InterfaceC5627h0 interfaceC5627h0, InterfaceC5128f interfaceC5128f, C12216g c12216g) {
        o oVar = o.NONE;
        this.f21609b = oVar;
        this.f21610c = oVar;
        this.f21611d = oVar;
        this.f21612e = new Hashtable<>();
        this.f21613f = new Hashtable<>();
        this.f21614g = new Hashtable<>();
        this.f21615h = false;
        this.f21616i = null;
        this.f21618k = null;
        this.f21619l = null;
        this.f21620m = null;
        this.f21621n = "";
        this.f21623p = 0L;
        this.f21624q = true;
        this.f21625r = null;
        this.f21629v = new Hashtable<>();
        this.f21631x = null;
        this.f21632y = null;
        this.f21633z = null;
        this.f21604A = null;
        this.f21605B = null;
        this.f21606C = new j();
        this.f21607D = new k();
        this.f21608a = interfaceC5627h0;
        this.f21627t = interfaceC5128f;
        this.f21626s = c12216g;
    }

    /* JADX INFO: renamed from: F0 */
    public static C5636m m25494F0(Context context) {
        if (f21599E == null) {
            f21599E = new C5636m(new C5614b(), new C5130h(), C12216g.m45228b());
            f21599E.m25588U1(AbstractC1745a.m8460f(context).m8471c(f21599E.f21607D).m8470b(C12046i.m44860c().m44864b().m44865c().m44863a()).m8469a());
            f21599E.m25586T1(new C5615b0(context));
        }
        return f21599E;
    }

    /* JADX INFO: renamed from: G0 */
    public static List<String> m25496G0() {
        String strMo43478K3 = C11659h.m43403a().mo43478K3();
        if (strMo43478K3.isEmpty()) {
            return f21600F;
        }
        if (f21601G == null) {
            f21601G = Arrays.asList(strMo43478K3.split(","));
        }
        return f21601G;
    }

    /* JADX INFO: renamed from: K0 */
    public static String m25501K0(C1749e c1749e, boolean z10) {
        if (z10) {
            List<C1749e.e> listM8620f = c1749e.m8620f();
            Objects.requireNonNull(listM8620f);
            return listM8620f.get(0).m8636c().m8633a().get(0).m8630a();
        }
        C1749e.b bVarM8616b = c1749e.m8616b();
        Objects.requireNonNull(bVarM8616b);
        return bVarM8616b.m8624a();
    }

    /* JADX INFO: renamed from: L0 */
    public static long m25503L0(C1749e c1749e, boolean z10) {
        if (z10) {
            List<C1749e.e> listM8620f = c1749e.m8620f();
            Objects.requireNonNull(listM8620f);
            return listM8620f.get(0).m8636c().m8633a().get(0).m8631b();
        }
        C1749e.b bVarM8616b = c1749e.m8616b();
        Objects.requireNonNull(bVarM8616b);
        return bVarM8616b.m8626c();
    }

    /* JADX INFO: renamed from: N0 */
    public static List<String> m25506N0() {
        String strMo43440F0 = C11659h.m43403a().mo43440F0();
        if (strMo43440F0.isEmpty()) {
            return f21602H;
        }
        if (f21603I == null) {
            f21603I = Arrays.asList(strMo43440F0.split(","));
        }
        return f21603I;
    }

    /* JADX INFO: renamed from: T0 */
    private boolean m25513T0() {
        return this.f21614g.size() > 0;
    }

    /* JADX INFO: renamed from: A0 */
    public void m25553A0(long j10, String str, boolean z10) {
        this.f21623p = j10;
        m25555B0(str, z10);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m25554A1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45285x();
    }

    /* JADX INFO: renamed from: B0 */
    public void m25555B0(String str, boolean z10) {
        this.f21621n = str;
        C6124q.m27057b("rbx.purchaseflow", "attemptGrantPendingPurchases isAppResume:" + z10);
        if (!m25593X0()) {
            C6124q.m27057b("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchasing is not setup");
            return;
        }
        if (m25587U0()) {
            C6124q.m27057b("rbx.purchaseflow", "attemptGrantPendingPurchases failed: purchase already pending");
            return;
        }
        if (z10) {
            m25576O0();
            return;
        }
        if (!m25513T0()) {
            if (this.f21615h) {
                return;
            }
            m25576O0();
            this.f21615h = true;
            return;
        }
        C6124q.m27057b("rbx.purchaseflow", "Found cached pending purchase. Count = " + this.f21614g.size());
        m25576O0();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m25556B1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45278q("Payments-Protocol-Query-Product-Details-Failed");
    }

    /* JADX INFO: renamed from: C0 */
    public final void m25557C0(C12052k c12052k) {
        String strM25617v0 = m25617v0(c12052k);
        if (C11659h.m43403a().mo43709r0() || !C5621e0.m25459l(strM25617v0)) {
            C6124q.m27063h("rbx.purchaseflow", "Consuming Purchase");
            this.f21608a.mo25430c(C12030e.m44847b().m44851b(c12052k.m44886g()).m44850a(), new n(strM25617v0, c12052k));
        } else if (C5621e0.m25460m(strM25617v0)) {
            this.f21626s.m45278q("Play-Points-Not-Consume-Purchase");
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m25558C1(boolean z10) {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45249Q(z10);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m25559D0() {
        InterfaceC5152j interfaceC5152j = this.f21628u;
        if (interfaceC5152j != null) {
            interfaceC5152j.mo15033c();
        }
        C3219a c3219a = new C3219a(this.f21627t);
        String str = this.f21625r;
        String str2 = (str == null || str.isEmpty()) ? null : this.f21625r;
        if (this.f21624q) {
            c3219a.m15391e(C11295a1.m42439b1(), this.f21618k, this.f21620m, str2, this.f21606C);
        } else {
            c3219a.m15389c(C11295a1.m42439b1(), this.f21618k, this.f21620m, str2, this.f21606C);
        }
    }

    /* JADX INFO: renamed from: D1 */
    public final void m25560D1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45250R();
    }

    /* JADX INFO: renamed from: E0 */
    public final void m25561E0(ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
        String strM8635b;
        InterfaceC5152j interfaceC5152j = this.f21628u;
        if (interfaceC5152j != null) {
            interfaceC5152j.mo15034d();
        }
        this.f21626s.m45273l("PurchaseStarted.");
        C1749e c1749eM25569J0 = m25569J0(this.f21618k, this.f21622o);
        if (m25596a1(this.f21618k, c1749eM25569J0, this.f21622o)) {
            ArrayList arrayList = new ArrayList();
            if (this.f21622o) {
                if (C11659h.m43403a().mo43539T3()) {
                    strM8635b = m25619w0(c1749eM25569J0);
                    if (strM8635b == null) {
                        m25607l1(this.f21618k, C5620e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + this.f21618k);
                        return;
                    }
                } else {
                    strM8635b = c1749eM25569J0.m8620f().get(0).m8635b();
                }
                arrayList.add(C1747c.b.m8585b().m8594c(c1749eM25569J0).m8593b(strM8635b).m8592a());
            } else {
                arrayList.add(C1747c.b.m8585b().m8594c(c1749eM25569J0).m8592a());
            }
            C1747c.a aVarM8584d = C1747c.m8558b().m8582b((validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getUserId() == null || validatePurchaseResponsePayload.getUserId().longValue() <= 0) ? this.f21621n : String.valueOf(validatePurchaseResponsePayload.getUserId())).m8584d(arrayList);
            String str = this.f21630w;
            if (str != null) {
                aVarM8584d.m8583c(str);
                this.f21626s.m45278q("Android-Purchase-Initiated-With-Charge-Request-Id");
            } else if (validatePurchaseResponsePayload == null || validatePurchaseResponsePayload.getCheckoutSessionId() == null) {
                C6124q.m27066k("rbx.purchaseflow", "Both mCurrentChargeRequestId and mCurrentCheckoutSessionId is null.");
                this.f21626s.m45278q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
            } else {
                aVarM8584d.m8583c(validatePurchaseResponsePayload.getCheckoutSessionId());
                this.f21626s.m45278q("Android-Purchase-Initiated-With-Checkout-Session-Id");
            }
            C1747c c1747cM8581a = aVarM8584d.m8581a();
            if (this.f21617j.getIntent() == null) {
                this.f21617j.setIntent(new Intent());
            }
            if (this.f21608a.mo25435h(this.f21617j, c1747cM8581a).m8610c() != 0) {
                m25607l1(this.f21618k, C5620e.b.FAILED_PURCHASE_RESPONSE, "BillingClient.launchBillingFlow failed");
            }
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m25562E1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45251S(this.f21624q, false);
    }

    /* JADX INFO: renamed from: F1 */
    public final void m25563F1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45252T(this.f21624q, false);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m25564G1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45259a0(this.f21624q, false);
    }

    /* JADX INFO: renamed from: H0 */
    public final String m25565H0(List<C12052k> list) {
        Iterator<C12052k> it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + m25617v0(it.next()) + "; ";
        }
        return str;
    }

    /* JADX INFO: renamed from: H1 */
    public final void m25566H1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45253U(this.f21624q, false);
    }

    /* JADX INFO: renamed from: I0 */
    public final String m25567I0(C12052k c12052k) {
        try {
            Long.parseLong(c12052k.m44880a().m44841b());
            return c12052k.m44880a().m44841b();
        } catch (Exception unused) {
            C6124q.m27066k("rbx.purchaseflow", "PaymentsProtocol: purchase.getAccountIdentifiers().getObfuscatedProfileId() did not return an integer and is not a valid checkoutSessionId.");
            return "";
        }
    }

    /* JADX INFO: renamed from: I1 */
    public final void m25568I1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45254V(this.f21624q, false);
    }

    /* JADX INFO: renamed from: J0 */
    public final C1749e m25569J0(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        if (z10 && this.f21613f.containsKey(str)) {
            return this.f21613f.get(str);
        }
        if (!z10 && this.f21612e.containsKey(str)) {
            return this.f21612e.get(str);
        }
        C6124q.m27060e("rbx.purchaseflow", "Unable to get product details for productId: " + str);
        return null;
    }

    /* JADX INFO: renamed from: J1 */
    public final void m25570J1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45255W(this.f21624q, false);
    }

    /* JADX INFO: renamed from: K1 */
    public final void m25571K1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45256X(this.f21624q, false);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m25572L1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45257Y(this.f21624q, false);
    }

    /* JADX INFO: renamed from: M0 */
    public final String m25573M0(C1749e c1749e, boolean z10) {
        if (z10) {
            List<C1749e.e> listM8620f = c1749e.m8620f();
            Objects.requireNonNull(listM8620f);
            return listM8620f.get(0).m8636c().m8633a().get(0).m8632c();
        }
        C1749e.b bVarM8616b = c1749e.m8616b();
        Objects.requireNonNull(bVarM8616b);
        return bVarM8616b.m8627d();
    }

    /* JADX INFO: renamed from: M1 */
    public final void m25574M1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45258Z(this.f21624q, false);
    }

    /* JADX INFO: renamed from: N1 */
    public final void m25575N1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45260b0(this.f21624q, false);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m25576O0() {
        C6124q.m27063h("rbx.purchaseflow", "Do Google Purchase GrantPending");
        if (!C11659h.m43403a().mo43432E()) {
            m25613r1("inapp");
            m25613r1("subs");
        } else if (m25591W0()) {
            C12064o c12064oM44905a = C12064o.m44900b().m44906b("inapp").m44905a();
            C12064o c12064oM44905a2 = C12064o.m44900b().m44906b("subs").m44905a();
            m25558C1(false);
            this.f21608a.mo25434g(c12064oM44905a, new c());
            m25558C1(true);
            this.f21608a.mo25434g(c12064oM44905a2, new d());
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final void m25577O1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45261c0();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m25578P0(C12052k c12052k, int i10) {
        C6124q.m27063h("rbx.purchaseflow", "Acknowledge error, response code: " + i10 + ", skipping client side acknowledge purchase.");
        this.f21626s.m45278q("Android-Purchase-With-Checkout-Session-Id-Acknowledge-Error-Ignore");
        String strM25479e = C5631j0.m25479e(c12052k);
        if (this.f21614g.containsKey(strM25479e)) {
            this.f21614g.remove(strM25479e);
        }
        String strM25617v0 = m25617v0(c12052k);
        if (!m25594Y0(c12052k)) {
            C1749e c1749eM25569J0 = m25569J0(strM25617v0, false);
            if (m25597b1(strM25617v0, c1749eM25569J0, false, false)) {
                this.f21626s.m45274m(strM25617v0, m25501K0(c1749eM25569J0, false), m25573M0(c1749eM25569J0, false), m25503L0(c1749eM25569J0, false));
            } else {
                C6124q.m27063h("rbx.purchaseflow", "Unable to find skuDetails: " + strM25617v0);
            }
        }
        m25606k1(strM25617v0, C5620e.b.SUCCESS);
    }

    /* JADX INFO: renamed from: P1 */
    public final void m25579P1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45262d0();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m25580Q0(C1748d c1748d, List<C12052k> list) {
        int iM8610c = c1748d.m8610c();
        if (iM8610c != 0) {
            C6124q.m27056a("Failed QueryPurchases. BillingResult: " + c1748d);
            return;
        }
        for (C12052k c12052k : list) {
            int iM44885f = c12052k.m44885f();
            if (iM44885f == 0) {
                m25579P1();
            } else if (iM44885f == 1) {
                C6124q.m27057b("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases for purchase " + c12052k);
                IAPPurchaseManager.nativeSetPurchaseTokenAndPackageNamePaymentsProtocol(c12052k.m44886g(), c12052k.m44883d());
                IAPPurchaseManager.nativeFinishPaymentsProtocolPurchase(m25617v0(c12052k), iM8610c, C11659h.m43403a().mo43603c2() ? m25567I0(c12052k) : c12052k.m44880a().m44840a());
            } else if (iM44885f == 2) {
                m25560D1();
            }
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m25581Q1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45263e0(this.f21624q, false);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m25582R0(List<C12052k> list, final boolean z10) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final Hashtable hashtable = new Hashtable();
        for (C12052k c12052k : list) {
            String strM25617v0 = m25617v0(c12052k);
            boolean zM25594Y0 = m25594Y0(c12052k);
            if (m25569J0(strM25617v0, zM25594Y0) != null) {
                m25584S0(c12052k, z10);
            } else {
                if (zM25594Y0) {
                    arrayList2.add(new p(strM25617v0, "subs"));
                } else {
                    arrayList.add(new p(strM25617v0, "inapp"));
                }
                hashtable.put(strM25617v0, c12052k);
            }
        }
        q qVar = new q() { // from class: fj.i
            @Override // fj.C5636m.q
            /* JADX INFO: renamed from: a */
            public final void mo25472a(List list2) {
                this.f21581a.m25598c1(hashtable, z10, list2);
            }
        };
        if (!arrayList.isEmpty()) {
            m25611p1(arrayList, qVar);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        m25611p1(arrayList2, qVar);
    }

    /* JADX INFO: renamed from: R1 */
    public final void m25583R1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45265f0(this.f21624q, false);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m25584S0(C12052k c12052k, boolean z10) {
        C6124q.m27063h("rbx.purchaseflow", "Handle single purchase. Product id: " + m25617v0(c12052k) + ". Order id: " + c12052k.m44881b() + ". isAcknowledged: " + c12052k.m44888i());
        int iM44885f = c12052k.m44885f();
        if (iM44885f == 0) {
            m25579P1();
        } else if (iM44885f == 2) {
            m25560D1();
        }
        if (c12052k.m44885f() != 1) {
            return;
        }
        this.f21614g.put(C5631j0.m25479e(c12052k), c12052k);
        if (!C5621e0.m25460m(m25617v0(c12052k))) {
            C12014a c12014aM44880a = c12052k.m44880a();
            String strM44840a = c12014aM44880a.m44840a();
            String strM44841b = c12014aM44880a.m44841b();
            String str = this.f21621n;
            if (str == null || !str.equals(strM44840a)) {
                long j10 = this.f21623p;
                if ((j10 <= 0 || !Long.toString(j10).equals(strM44840a)) && (strM44841b == null || strM44841b.equals(""))) {
                    m25620w1();
                    if (C11659h.m43403a().mo43447G0()) {
                        String str2 = this.f21621n;
                        if (str2 == null) {
                            m25554A1();
                        } else if (!str2.equals(strM44840a)) {
                            m25626z1();
                        }
                        long j11 = this.f21623p;
                        if (j11 <= 0) {
                            m25622x1();
                            return;
                        } else {
                            if (Long.toString(j11).equals(strM44840a)) {
                                return;
                            }
                            m25624y1();
                            return;
                        }
                    }
                    return;
                }
            }
        }
        m25592W1(c12052k, C5631j0.m25479e(c12052k), z10);
    }

    /* JADX INFO: renamed from: S1 */
    public final void m25585S1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45267g0(this.f21624q, false);
    }

    /* JADX INFO: renamed from: T1 */
    public void m25586T1(C5615b0 c5615b0) {
        this.f21616i = c5615b0;
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m25587U0() {
        return this.f21618k != null;
    }

    /* JADX INFO: renamed from: U1 */
    public void m25588U1(AbstractC1745a abstractC1745a) {
        o oVar = this.f21609b;
        if (oVar == o.READY) {
            C6124q.m27063h("rbx.purchaseflow", "Google Billing Client is already setup");
            return;
        }
        o oVar2 = o.CONNECTING;
        if (oVar == oVar2) {
            C6124q.m27063h("rbx.purchaseflow", "Google Billing Client is already connecting");
            return;
        }
        this.f21608a.mo25433f(abstractC1745a);
        this.f21609b = oVar2;
        C6124q.m27063h("rbx.purchaseflow", "Connecting Google Billing's Client");
        this.f21608a.mo25429b(new f());
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m25589V0(String str) {
        return m25506N0().contains(str);
    }

    /* JADX INFO: renamed from: V1 */
    public final boolean m25590V1(String str, String str2, Activity activity, long j10, InterfaceC5152j interfaceC5152j, boolean z10) {
        C6124q.m27063h("rbx.purchaseflow", "startPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + "isInApp: " + this.f21624q);
        this.f21621n = str;
        if (!m25591W0()) {
            return false;
        }
        this.f21628u = interfaceC5152j;
        this.f21623p = j10;
        this.f21618k = str2;
        this.f21617j = activity;
        this.f21622o = m25589V0(str2);
        i iVar = new i(str2);
        if (this.f21622o) {
            m25614s1(iVar);
            return true;
        }
        m25612q1(iVar);
        return true;
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m25591W0() {
        return !this.f21621n.isEmpty() && m25593X0();
    }

    /* JADX INFO: renamed from: W1 */
    public final void m25592W1(C12052k c12052k, String str, boolean z10) {
        boolean zM25460m = C5621e0.m25460m(m25617v0(c12052k));
        C5615b0 c5615b0 = this.f21616i;
        boolean z11 = c5615b0 != null && c5615b0.m25438c(str);
        if (!c12052k.m44888i() || (zM25460m && !z11)) {
            m25605j1(c12052k, z10);
        } else {
            m25625z0(c12052k, C5620e.b.ALREADY_ACKNOWLEDGED, new RobloxPurchaseInfo());
        }
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m25593X0() {
        InterfaceC5627h0 interfaceC5627h0 = this.f21608a;
        return interfaceC5627h0 != null && this.f21609b == o.READY && interfaceC5627h0.isReady();
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m25594Y0(C12052k c12052k) {
        String strM25617v0 = m25617v0(c12052k);
        return m25589V0(strM25617v0) || !(m25496G0().contains(strM25617v0) || C5621e0.m25460m(strM25617v0));
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m25595Z0(String str) {
        String str2 = this.f21618k;
        if (str2 == null || str == null) {
            return false;
        }
        return str2.equals(str);
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: a */
    public boolean mo23966a(final String str, final long j10, final String str2, final String str3, final Activity activity) {
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase.");
        this.f21626s.m45273l("PurchaseStarted.");
        final boolean zM25589V0 = m25589V0(str);
        if (zM25589V0 && this.f21608a.mo25432e("subscriptions").m8610c() != 0) {
            return false;
        }
        if (this.f21608a.mo25432e("fff").m8610c() != 0) {
            m25566H1();
            return false;
        }
        IAPPurchaseManager.nativeSetUserId(j10);
        this.f21623p = j10;
        this.f21621n = str2;
        this.f21618k = str;
        String str4 = zM25589V0 ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1750f.b.m8643b().m8651b(str).m8652c(str4).m8650a());
        this.f21608a.mo25428a(C1750f.m8637a().m8642b(arrayList).m8641a(), new InterfaceC12049j() { // from class: fj.f
            @Override // p486v7.InterfaceC12049j
            /* JADX INFO: renamed from: a */
            public final void mo25466a(C1748d c1748d, C12061n c12061n) {
                this.f21561a.m25602g1(zM25589V0, j10, str2, str, activity, str3, c1748d, c12061n);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m25596a1(String str, C1749e c1749e, boolean z10) {
        return m25597b1(str, c1749e, z10, true);
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: b */
    public void mo23967b(InterfaceC12458r0 interfaceC12458r0) {
        this.f21628u = interfaceC12458r0;
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m25597b1(String str, C1749e c1749e, boolean z10, boolean z11) {
        if (c1749e == null) {
            C6124q.m27063h("rbx.purchaseflow", "Product details not found after query.");
            if (z11) {
                m25607l1(str, C5620e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            }
            return false;
        }
        if (z10 && c1749e.m8620f() == null) {
            if (z11) {
                m25607l1(this.f21618k, C5620e.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
            }
            return false;
        }
        if (z10 || c1749e.m8616b() != null) {
            return true;
        }
        if (z11) {
            m25607l1(this.f21618k, C5620e.b.FAILED_PRODUCT_NOT_FOUND, "Product subscription offer details not found");
        }
        return false;
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: c */
    public String mo23968c(String str) {
        boolean zM25589V0 = m25589V0(str);
        this.f21622o = zM25589V0;
        C1749e c1749eM25569J0 = m25569J0(str, zM25589V0);
        return !m25596a1(str, c1749eM25569J0, this.f21622o) ? "" : m25573M0(c1749eM25569J0, this.f21622o);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m25598c1(Map map, boolean z10, List list) {
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
                    m25584S0((C12052k) map.get(strM8618d), z10);
                } else {
                    C6124q.m27060e("rbx.purchaseflow", "Cannot find purchase associated with product details. ProductId: " + strM8618d);
                }
            }
        }
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: d */
    public boolean mo23969d(long j10, String str, String str2, Activity activity, final boolean z10, InterfaceC5152j interfaceC5152j) {
        final C5616c c5616c = new C5616c(str2);
        if (!c5616c.m25440b()) {
            C6124q.m27060e("rbx.purchaseflow", "Purchase request is invalid. Raw payload: " + str2);
            return false;
        }
        if (c5616c.m25441c() && this.f21608a.mo25432e("subscriptions").m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return false;
        }
        C6124q.m27063h("rbx.purchaseflow", "Initiated purchase. Params: " + c5616c);
        this.f21621n = Long.toString(j10);
        if (!m25591W0()) {
            C6124q.m27060e("rbx.purchaseflow", "Purchasing is not enabled. Params: " + c5616c);
            return false;
        }
        this.f21623p = j10;
        this.f21618k = c5616c.m25444f();
        this.f21630w = c5616c.m25439a();
        this.f21605B = c5616c.m25442d();
        this.f21617j = activity;
        this.f21624q = !z10;
        this.f21628u = interfaceC5152j;
        this.f21622o = c5616c.m25441c();
        if (c5616c.m25441c()) {
            this.f21629v.put(c5616c.m25444f(), str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(c5616c.m25444f(), c5616c.m25445g()));
        m25611p1(arrayList, new q() { // from class: fj.l
            @Override // fj.C5636m.q
            /* JADX INFO: renamed from: a */
            public final void mo25472a(List list) {
                this.f21595a.m25604i1(c5616c, z10, list);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m25599d1(C1748d c1748d, List list) {
        if (c1748d.m8610c() != 0) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: Failed QueryPurchases. BillingResult: " + c1748d);
            return;
        }
        this.f21626s.m45273l("PaymentsProtocol: QueryInAppPurchases. ItemsCount: " + list.size() + ". Items: " + m25565H0(list));
        m25580Q0(c1748d, list);
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m25600e1(C1748d c1748d, List list) {
        if (c1748d.m8610c() != 0) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: Failed QueryPurchases. BillingResult: " + c1748d);
            return;
        }
        this.f21626s.m45273l("PaymentsProtocol: QuerySubsPurchases. ItemsCount: " + list.size() + ". Items: " + m25565H0(list));
        m25580Q0(c1748d, list);
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: f */
    public boolean mo23971f(final String str, final long j10, final String str2, final Activity activity, String str3) {
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase with payload string.");
        this.f21626s.m45273l("PurchaseStarted.");
        final C5616c c5616c = new C5616c(str3);
        if (c5616c.m25441c() && this.f21608a.mo25432e("subscriptions").m8610c() != 0) {
            return false;
        }
        if (this.f21608a.mo25432e("fff").m8610c() != 0) {
            m25566H1();
            return false;
        }
        IAPPurchaseManager.nativeSetUserId(j10);
        this.f21623p = j10;
        this.f21621n = str2;
        this.f21618k = str;
        this.f21633z = c5616c.m25444f();
        this.f21604A = c5616c.m25445g();
        this.f21631x = c5616c.m25439a();
        this.f21605B = c5616c.m25442d();
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: " + this.f21633z + ", " + this.f21604A);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p(this.f21633z, this.f21604A));
        m25611p1(arrayList, new q() { // from class: fj.k
            @Override // fj.C5636m.q
            /* JADX INFO: renamed from: a */
            public final void mo25472a(List list) {
                this.f21589a.m25601f1(c5616c, j10, str2, str, activity, list);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m25601f1(C5616c c5616c, long j10, String str, String str2, Activity activity, List list) {
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: trying with dynamic query.");
        if (list == null || list.isEmpty()) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: dynamic query dynamicProductDetailsList is empty.");
            return;
        }
        this.f21622o = this.f21604A.equals("subs");
        C1749e c1749e = (C1749e) list.get(0);
        if (!m25597b1(this.f21633z, c1749e, this.f21622o, false)) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: invalid dynamic productDetails.");
            return;
        }
        String strM25573M0 = m25573M0(c1749e, c5616c.m25441c());
        this.f21620m = strM25573M0;
        IAPPurchaseManager.nativeSetProviderCurrencyCode(strM25573M0);
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolStartPurchase with payload string opening billing.");
        m25609n1(c1749e, this.f21622o, j10, str, str2, activity, c5616c.m25439a(), "");
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: g */
    public boolean mo23972g(String str, long j10, long j11) {
        boolean z10;
        if (((int) j10) != 0) {
            m25574M1();
            IAPPurchaseManager.paymentsProtocolPurchaseFinished(new C5620e(C5620e.b.FAILED_PURCHASE_RESPONSE, this.f21618k));
            z10 = false;
        } else {
            m25575N1();
            IAPPurchaseManager.paymentsProtocolPurchaseFinished(new C5620e(C5620e.b.SUCCESS, this.f21618k));
            z10 = true;
        }
        if (C11659h.m43403a().mo43703q1()) {
            String str2 = this.f21632y;
            if (str2 == null) {
                str2 = "";
            }
            NativeGLInterface.nativeInGamePurchaseFinishedV2(z10, j11, str, str2);
        } else {
            NativeGLInterface.nativeInGamePurchaseFinished(z10, j11, str);
        }
        return true;
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m25602g1(boolean z10, long j10, String str, String str2, Activity activity, String str3, C1748d c1748d, C12061n c12061n) {
        List<C1749e> listM44899a = c12061n.m44899a();
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: queryProductDetailsAsync.");
        if (c1748d.m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "PaymentsProtocol: Failed to get product details. BillingResult: " + c1748d);
            if (C11659h.m43403a().mo43447G0()) {
                m25556B1();
                return;
            }
            return;
        }
        if (listM44899a.isEmpty()) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: productDetailsList is empty.");
            return;
        }
        Iterator<C1749e> it = listM44899a.iterator();
        C1749e next = null;
        while (it.hasNext()) {
            next = it.next();
            next.m8619e().equals("subs");
        }
        m25609n1(next, z10, j10, str, str2, activity, "", str3);
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: h */
    public boolean mo23973h(String str, String str2, Activity activity, InterfaceC5152j interfaceC5152j, boolean z10, String str3) {
        this.f21624q = true;
        if (str3 != null) {
            this.f21625r = str3;
        }
        C6124q.m27063h("rbx.purchaseflow", "startInAppPurchase productId: " + str2 + ", isSubscriptionPurchase: " + z10 + ", paymentSessionId: " + this.f21625r);
        return m25590V1(str, str2, activity, 0L, interfaceC5152j, z10);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m25603h1(List list, q qVar, C1748d c1748d, C12061n c12061n) {
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
                    this.f21613f.put(c1749e.m8618d(), c1749e);
                } else {
                    this.f21612e.put(c1749e.m8618d(), c1749e);
                }
            }
            C6124q.m27063h("rbx.purchaseflow", "queryProductDetails Success. Products: " + list);
        }
        qVar.mo25472a(listM44899a);
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: i */
    public boolean mo23974i(String str, String str2, Activity activity, InterfaceC5152j interfaceC5152j, boolean z10) {
        this.f21624q = true;
        return m25590V1(str, str2, activity, 0L, interfaceC5152j, z10);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m25604i1(C5616c c5616c, boolean z10, List list) {
        if (list == null || list.isEmpty()) {
            m25607l1(c5616c.m25444f(), C5620e.b.FAILED_PRODUCT_NOT_FOUND, "Product details not found");
            return;
        }
        C1749e c1749e = (C1749e) list.get(0);
        if (m25596a1(c5616c.m25444f(), c1749e, c5616c.m25441c())) {
            this.f21620m = m25573M0(c1749e, c5616c.m25441c());
            this.f21626s.m45268h0(new C5150h(this.f21621n, c5616c.m25444f(), !z10));
            m25561E0(null);
        }
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: j */
    public boolean mo23975j(String str) {
        this.f21631x = str;
        return !TextUtils.isEmpty(str);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m25605j1(C12052k c12052k, boolean z10) {
        if (this.f21628u != null && m25595Z0(m25617v0(c12052k))) {
            this.f21628u.mo15032b();
        }
        new C5155m(this.f21627t).m23989b(C11295a1.m42442c1(), new C5618d(c12052k, z10, this.f21624q), new l(c12052k));
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: k */
    public void mo23976k(boolean z10) {
        this.f21624q = z10;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m25606k1(String str, C5620e.b bVar) {
        C5620e.b bVar2 = C5620e.b.SUCCESS;
        if (bVar == bVar2) {
            m25575N1();
        } else if (bVar == C5620e.b.USER_CANCELLED) {
            m25572L1();
        } else if (bVar == C5620e.b.ALREADY_ACKNOWLEDGED) {
            m25571K1();
        } else {
            m25574M1();
        }
        if (this.f21628u != null && m25595Z0(str)) {
            InterfaceC5152j interfaceC5152j = this.f21628u;
            if (interfaceC5152j instanceof InterfaceC12458r0) {
                if (this.f21623p != 0) {
                    String str2 = this.f21632y;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    if (this.f21629v.containsKey(str)) {
                        ((InterfaceC12458r0) this.f21628u).mo15386a(bVar == bVar2, this.f21623p, this.f21629v.get(str), str3);
                        return;
                    }
                    ((InterfaceC12458r0) this.f21628u).mo15386a(bVar == bVar2, this.f21623p, this.f21618k, str3);
                } else {
                    C6124q.m27066k("rbx.purchaseflow", "Ignore calling inGamePurchaseFinished: mUserId=" + this.f21623p + ". mProductId=" + this.f21618k + ".. checkoutSessionId=" + this.f21632y + ".");
                }
            } else if (interfaceC5152j != null) {
                interfaceC5152j.mo15035e(new C5620e(bVar, this.f21618k));
            }
        }
        if (m25595Z0(str)) {
            m25615t1();
        }
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: l */
    public boolean mo23977l(String str) {
        this.f21632y = str;
        return !TextUtils.isEmpty(str);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m25607l1(String str, C5620e.b bVar, String str2) {
        if (str2 != null && str2.length() > 0) {
            this.f21626s.m45273l(str2);
        }
        m25606k1(str, bVar);
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: m */
    public void mo23978m(int i10) {
        C3219a.e eVar;
        if (i10 == 200) {
            C6124q.m27063h("rbx.purchaseflow", "Validation successful");
            eVar = C3219a.e.OK;
            this.f21626s.m45234B();
        } else if (i10 == 429) {
            C6124q.m27060e("rbx.purchaseflow", "Service has been rate limited to user.");
            eVar = C3219a.e.LIMIT;
            this.f21626s.m45239G();
        } else if (i10 == 500) {
            C6124q.m27060e("rbx.purchaseflow", "Server Error");
            eVar = C3219a.e.UNKNOWN_ERROR;
            this.f21626s.m45240H();
        } else if (i10 == 400) {
            C6124q.m27060e("rbx.purchaseflow", "Service has thrown an uknown exception.");
            eVar = C3219a.e.ERROR;
            this.f21626s.m45235C();
        } else if (i10 == 401) {
            C6124q.m27060e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
            eVar = C3219a.e.ERROR;
            this.f21626s.m45236D();
        } else if (i10 == 403) {
            C6124q.m27060e("rbx.purchaseflow", "Unauthorized to make request. XSRF token is needed.");
            eVar = C3219a.e.ERROR;
            this.f21626s.m45237E();
        } else if (i10 != 404) {
            C6124q.m27060e("rbx.purchaseflow", "Validation unknown error: " + i10);
            eVar = C3219a.e.UNKNOWN_ERROR;
            this.f21626s.m45242J();
        } else {
            C6124q.m27060e("rbx.purchaseflow", "{validateModel} is invalid.");
            eVar = C3219a.e.ERROR;
            this.f21626s.m45238F();
        }
        int i11 = e.f21639a[eVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                m25563F1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new C5620e(C5620e.b.VALIDATION_ERROR, this.f21618k));
                return;
            }
            if (i11 == 3) {
                m25568I1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new C5620e(C5620e.b.VALIDATION_RETRY, this.f21618k));
            } else if (i11 == 4) {
                m25564G1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new C5620e(C5620e.b.VALIDATION_LIMIT, this.f21618k));
            } else if (i11 != 5) {
                m25570J1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new C5620e(C5620e.b.UNKNOWN, this.f21618k));
            } else {
                m25564G1();
                IAPPurchaseManager.paymentsProtocolPurchaseFinished(new C5620e(C5620e.b.VALIDATION_LIMIT_UNDER_13, this.f21618k));
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m25608m1(long j10, String str, boolean z10) {
        if (j10 > 0) {
            IAPPurchaseManager.nativeSetUserId(j10);
        }
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases attempt.");
        if (!m25593X0()) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchasing is not setup.");
            return;
        }
        if (m25587U0()) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because purchase is currently in progress.");
            return;
        }
        if (!z10 && this.f21615h) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolGrantPendingPurchases failed because it should only be triggered if queried history is stale or during app resume.");
            return;
        }
        if (!C11659h.m43403a().mo43432E()) {
            m25610o1("inapp");
            m25610o1("subs");
            this.f21615h = true;
            return;
        }
        C12064o c12064oM44905a = C12064o.m44900b().m44906b("inapp").m44905a();
        C12064o c12064oM44905a2 = C12064o.m44900b().m44906b("subs").m44905a();
        m25558C1(false);
        this.f21608a.mo25434g(c12064oM44905a, new InterfaceC12055l() { // from class: fj.g
            @Override // p486v7.InterfaceC12055l
            /* JADX INFO: renamed from: a */
            public final void mo25471a(C1748d c1748d, List list) {
                this.f21578a.m25599d1(c1748d, list);
            }
        });
        m25558C1(true);
        this.f21608a.mo25434g(c12064oM44905a2, new InterfaceC12055l() { // from class: fj.h
            @Override // p486v7.InterfaceC12055l
            /* JADX INFO: renamed from: a */
            public final void mo25471a(C1748d c1748d, List list) {
                this.f21580a.m25600e1(c1748d, list);
            }
        });
        this.f21615h = true;
    }

    @Override // p105ej.InterfaceC5149g
    /* JADX INFO: renamed from: n */
    public boolean mo23979n(String str, String str2, Activity activity, long j10, InterfaceC5152j interfaceC5152j) {
        this.f21624q = false;
        return m25590V1(str, str2, activity, j10, interfaceC5152j, false);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m25609n1(C1749e c1749e, boolean z10, long j10, String str, String str2, Activity activity, String str3, String str4) {
        String strM8635b;
        C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: paymentsProtocolOpenBillingFlow");
        ArrayList arrayList = new ArrayList();
        if (z10) {
            if (C11659h.m43403a().mo43539T3()) {
                strM8635b = m25619w0(c1749e);
                if (strM8635b == null) {
                    m25607l1(str2, C5620e.b.FAILED_PRODUCT_NOT_FOUND, "No matching or base plan offer available for subscription product: " + str2);
                    return;
                }
            } else {
                strM8635b = c1749e.m8620f().get(0).m8635b();
            }
            arrayList.add(C1747c.b.m8585b().m8594c(c1749e).m8593b(strM8635b).m8592a());
        } else {
            arrayList.add(C1747c.b.m8585b().m8594c(c1749e).m8592a());
        }
        if (j10 > 0) {
            str = Long.toString(j10);
        }
        C1747c.a aVarM8584d = C1747c.m8558b().m8582b(str).m8584d(arrayList);
        if (!C11659h.m43403a().mo43603c2()) {
            String str5 = this.f21631x;
            if (str5 != null) {
                aVarM8584d.m8583c(str5);
                this.f21626s.m45278q("Android-Purchase-Initiated-With-Charge-Request-Id");
            } else {
                String str6 = this.f21632y;
                if (str6 != null) {
                    aVarM8584d.m8583c(str6);
                    this.f21626s.m45278q("Android-Purchase-Initiated-With-Checkout-Session-Id");
                } else {
                    C6124q.m27066k("rbx.purchaseflow", "Both mStoredChargeRequestId and mCurrentCheckoutSessionId are null.");
                    this.f21626s.m45278q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
                }
            }
        } else if (str3 != null && !str3.isEmpty()) {
            aVarM8584d.m8583c(str3);
            this.f21626s.m45278q("Android-Purchase-Initiated-With-Charge-Request-Id");
        } else if (str4 == null || str4.isEmpty()) {
            C6124q.m27066k("rbx.purchaseflow", "Both chargeRequestId and checkoutSessionId are empty.");
            this.f21626s.m45278q("Android-Purchase-Initiated-Without-Obfuscated-Profile-Id");
        } else {
            aVarM8584d.m8583c(str4);
            this.f21626s.m45278q("Android-Purchase-Initiated-With-Checkout-Session-Id");
        }
        C1747c c1747cM8581a = aVarM8584d.m8581a();
        this.f21619l = str2;
        if (this.f21608a.mo25435h(activity, c1747cM8581a).m8610c() != 0) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: launchBillingFlow failed!");
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m25610o1(String str) {
        if (m25591W0()) {
            this.f21608a.mo25434g(C12064o.m44900b().m44906b(str).m44905a(), new b());
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m25611p1(final List<p> list, final q qVar) {
        if (this.f21608a.mo25432e("fff").m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            m25566H1();
            qVar.mo25472a(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (p pVar : list) {
            arrayList.add(C1750f.b.m8643b().m8651b(pVar.f21663a).m8652c(pVar.f21664b).m8650a());
        }
        this.f21608a.mo25428a(C1750f.m8637a().m8642b(arrayList).m8641a(), new InterfaceC12049j() { // from class: fj.j
            @Override // p486v7.InterfaceC12049j
            /* JADX INFO: renamed from: a */
            public final void mo25466a(C1748d c1748d, C12061n c12061n) {
                this.f21586a.m25603h1(list, qVar, c1748d, c12061n);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public final void m25612q1(r rVar) {
        C6124q.m27057b("rbx.purchaseflow", "Attempt queryInAppProduct");
        if (this.f21608a.mo25432e("fff").m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            m25566H1();
            if (rVar != null) {
                rVar.mo25627a();
                return;
            }
            return;
        }
        o oVar = this.f21610c;
        if (oVar == o.READY) {
            C6124q.m27057b("rbx.purchaseflow", "queryInAppProduct is setup already");
            if (rVar != null) {
                rVar.mo25627a();
                return;
            }
            return;
        }
        if (oVar != o.NONE) {
            C6124q.m27057b("rbx.purchaseflow", "queryInAppProduct is pending");
            return;
        }
        List<String> listM25496G0 = m25496G0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listM25496G0.iterator();
        while (it.hasNext()) {
            arrayList.add(C1750f.b.m8643b().m8651b(it.next()).m8652c("inapp").m8650a());
        }
        C1750f c1750fM8641a = C1750f.m8637a().m8642b(arrayList).m8641a();
        this.f21610c = o.CONNECTING;
        this.f21608a.mo25428a(c1750fM8641a, new g(rVar));
    }

    /* JADX INFO: renamed from: r1 */
    public final void m25613r1(String str) {
        if (m25591W0()) {
            this.f21608a.mo25434g(C12064o.m44900b().m44906b(str).m44905a(), new a(str));
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m25614s1(r rVar) {
        C6124q.m27057b("rbx.purchaseflow", "Attempt querySubsProduct");
        if (this.f21608a.mo25432e("subscriptions").m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "Google Billing Client does not support subscription purchases.");
            return;
        }
        if (this.f21608a.mo25432e("fff").m8610c() != 0) {
            C6124q.m27060e("rbx.purchaseflow", "ProductDetails feature is not supported.");
            m25566H1();
            if (rVar != null) {
                rVar.mo25627a();
                return;
            }
            return;
        }
        C6124q.m27057b("rbx.purchaseflow", "Attempt querySubsProduct");
        o oVar = this.f21611d;
        if (oVar == o.READY) {
            C6124q.m27057b("rbx.purchaseflow", "querySubsProduct is setup already");
            if (rVar != null) {
                rVar.mo25627a();
                return;
            }
            return;
        }
        if (oVar != o.NONE) {
            C6124q.m27057b("rbx.purchaseflow", "querySubsProduct is pending");
            return;
        }
        List<String> listM25506N0 = m25506N0();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listM25506N0.iterator();
        while (it.hasNext()) {
            arrayList.add(C1750f.b.m8643b().m8651b(it.next()).m8652c("subs").m8650a());
        }
        C1750f c1750fM8641a = C1750f.m8637a().m8642b(arrayList).m8641a();
        this.f21611d = o.CONNECTING;
        C6124q.m27057b("rbx.purchaseflow", "Querying SUBS ProductDetails. Count = " + arrayList.size());
        this.f21608a.mo25428a(c1750fM8641a, new h(rVar));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m25615t1() {
        this.f21617j = null;
        this.f21628u = null;
        this.f21618k = null;
        this.f21623p = 0L;
        this.f21630w = null;
        this.f21620m = null;
        this.f21624q = true;
        this.f21625r = null;
        this.f21631x = null;
        this.f21632y = null;
        this.f21633z = null;
        this.f21604A = null;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m25616u1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45276o(this.f21624q);
    }

    /* JADX INFO: renamed from: v0 */
    public String m25617v0(C12052k c12052k) {
        return C5614b.m25427j(c12052k);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m25618v1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45277p(this.f21624q);
    }

    /* JADX INFO: renamed from: w0 */
    public final String m25619w0(C1749e c1749e) {
        List<String> list = this.f21605B;
        if (list != null && !list.isEmpty()) {
            String strM25482h = C5631j0.m25482h(c1749e, this.f21605B);
            if (strM25482h != null) {
                return strM25482h;
            }
            this.f21626s.m45278q("Android-Subscription-Offer-Id-Not-Found");
            if (C11659h.m43403a().mo43765z0()) {
                return null;
            }
        }
        String strM25475a = C5631j0.m25475a(c1749e);
        if (strM25475a != null) {
            return strM25475a;
        }
        this.f21626s.m45278q("Android-Subscription-Offer-No-Base-Plan-Available");
        return null;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m25620w1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45281t();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m25621x0(C12052k c12052k, PurchaseVerificationResponse purchaseVerificationResponse) {
        boolean zM25460m = C5621e0.m25460m(m25617v0(c12052k));
        if (!c12052k.m44888i() || zM25460m) {
            C6124q.m27063h("rbx.purchaseflow", "Acknowledging Purchase");
            m25623y0(c12052k, new m(c12052k, zM25460m, purchaseVerificationResponse));
        } else {
            C6124q.m27063h("rbx.purchaseflow", "Attempted to acknowledge an acknowledged purchase.");
            m25625z0(c12052k, C5620e.b.ALREADY_ACKNOWLEDGED, C5639n0.m25663b(purchaseVerificationResponse));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25622x1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45282u();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m25623y0(C12052k c12052k, InterfaceC12022c interfaceC12022c) {
        C6124q.m27063h("rbx.purchaseflow", "Start acknowledging Purchase");
        this.f21608a.mo25431d(C12018b.m44842b().m44846b(c12052k.m44886g()).m44845a(), interfaceC12022c);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m25624y1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45283v();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m25625z0(C12052k c12052k, C5620e.b bVar, RobloxPurchaseInfo robloxPurchaseInfo) {
        C6124q.m27063h("rbx.purchaseflow", "Acknowledged Purchase");
        if (m25594Y0(c12052k)) {
            this.f21614g.remove(C5631j0.m25479e(c12052k));
            m25606k1(m25617v0(c12052k), bVar);
            return;
        }
        String strM25617v0 = m25617v0(c12052k);
        String strM25479e = C5631j0.m25479e(c12052k);
        boolean zM25460m = C5621e0.m25460m(strM25617v0);
        C5615b0 c5615b0 = this.f21616i;
        boolean z10 = c5615b0 != null && c5615b0.m25438c(strM25479e);
        if (zM25460m) {
            if (z10) {
                this.f21626s.m45278q("Play-Points-Not-Show-Confirmation-Screen");
            } else {
                this.f21626s.m45278q("Play-Points-Show-Confirmation-Screen");
                C1749e c1749eM25569J0 = m25569J0(strM25617v0, false);
                NativeGLInterface.nativeOOAPPurchaseFinished(OOAPPurchaseFinishedParams.builder().setProductId(strM25617v0).setNativeProductId(strM25617v0).setRobuxAmount(0).setDescription(c1749eM25569J0.m8615a()).setDisplayPrice(C5631j0.m25477c(c1749eM25569J0)).setPrice(C5631j0.m25480f(c1749eM25569J0)).setCurrencyCode(C5631j0.m25476b(c1749eM25569J0)).setRobloxPurchaseInfo(C5639n0.m25662a(robloxPurchaseInfo)).build());
                C5615b0 c5615b1 = this.f21616i;
                if (c5615b1 != null) {
                    c5615b1.m25436a(strM25479e);
                }
            }
        }
        m25557C0(c12052k);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m25626z1() {
        if (C9476b.m37333a()) {
            return;
        }
        this.f21626s.m45284w();
    }
}
