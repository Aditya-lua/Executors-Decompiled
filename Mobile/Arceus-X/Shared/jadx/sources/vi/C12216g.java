package vi;

import android.content.Context;
import androidx.annotation.NonNull;
import backtraceio.library.models.BacktraceAttributeConsts;
import com.roblox.engine.jni.NativeGLInterface;
import li.C8150a;
import p104ei.AsyncTaskC5140r;
import p105ej.C5150h;
import p151gk.C6110d0;
import p151gk.C6124q;
import p151gk.C6127t;
import p151gk.InterfaceC6108c0;
import sg.C11295a1;
import sg.C11356t0;
import sg.C11358u;
import sg.C11370y;

/* JADX INFO: renamed from: vi.g */
/* JADX INFO: loaded from: classes2.dex */
public class C12216g {

    /* JADX INFO: renamed from: d */
    public static C12216g f43074d;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final InterfaceC6108c0 f43075a;

    /* JADX INFO: renamed from: b */
    public long f43076b;

    /* JADX INFO: renamed from: c */
    public C5150h f43077c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12216g(@NonNull InterfaceC6108c0 interfaceC6108c0) {
        this.f43075a = interfaceC6108c0;
    }

    /* JADX INFO: renamed from: a */
    public static void m45227a(String str) {
        C11356t0.m42538h(str, "sessionCheck");
    }

    /* JADX INFO: renamed from: b */
    public static C12216g m45228b() {
        C12216g c12216g = f43074d;
        if (c12216g != null) {
            return c12216g;
        }
        synchronized (C12216g.class) {
            try {
                if (f43074d == null) {
                    f43074d = new C12216g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f43074d;
    }

    /* JADX INFO: renamed from: c */
    public static String m45229c(boolean z10) {
        if (C11295a1.m42471q0()) {
            return z10 ? "Quest-ROBLOXPlayer-Session-Inferred-Crash" : "Quest-ROBLOXPlayer-Session-Inferred-Success";
        }
        return z10 ? "Android-ROBLOXPlayer-Session-Inferred-Crash" : "Android-ROBLOXPlayer-Session-Inferred-Success";
    }

    /* JADX INFO: renamed from: d */
    public static String m45230d(String str) {
        String str2;
        String[] strArrSplit = str.split("\\.");
        String str3 = strArrSplit.length >= 2 ? strArrSplit[1] : "Unknown";
        if (C11295a1.m42471q0()) {
            str2 = "Quest-AppStartup-Version-";
        } else if (C6127t.m27090f()) {
            str2 = "Amazon-AppStartup-Version-";
        } else {
            str2 = C6127t.m27093i() ? "Galaxy-AppStartup-Version-" : "Android-AppStartup-Version-";
        }
        return str2 + str3;
    }

    /* JADX INFO: renamed from: e */
    public static String m45231e() {
        if (C11295a1.m42471q0()) {
            return "Quest-AppStartup-Version-Total";
        }
        if (C6127t.m27090f()) {
            return "Amazon-AppStartup-Version-Total";
        }
        return C6127t.m27093i() ? "Galaxy-AppStartup-Version-Total" : "Android-AppStartup-Version-Total";
    }

    /* JADX INFO: renamed from: h */
    public static void m45232h(String str, int i10) {
        new AsyncTaskC5140r(C11295a1.m42482w() + C11295a1.m42480v(str, i10)).m23953c();
    }

    /* JADX INFO: renamed from: A */
    public void m45233A() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Request" : "Android-Payments-Api-V1-Precheck-Request");
    }

    /* JADX INFO: renamed from: B */
    public void m45234B() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-200" : "Android-Payments-Api-V1-Precheck-Response-200");
    }

    /* JADX INFO: renamed from: C */
    public void m45235C() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-400" : "Android-Payments-Api-V1-Precheck-Response-400");
    }

    /* JADX INFO: renamed from: D */
    public void m45236D() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-401" : "Android-Payments-Api-V1-Precheck-Response-401");
    }

    /* JADX INFO: renamed from: E */
    public void m45237E() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-403" : "Android-Payments-Api-V1-Precheck-Response-403");
    }

    /* JADX INFO: renamed from: F */
    public void m45238F() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-404" : "Android-Payments-Api-V1-Precheck-Response-404");
    }

    /* JADX INFO: renamed from: G */
    public void m45239G() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-429" : "Android-Payments-Api-V1-Precheck-Response-429");
    }

    /* JADX INFO: renamed from: H */
    public void m45240H() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-500" : "Android-Payments-Api-V1-Precheck-Response-500");
    }

    /* JADX INFO: renamed from: I */
    public void m45241I() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-503" : "Android-Payments-Api-V1-Precheck-Response-503");
    }

    /* JADX INFO: renamed from: J */
    public void m45242J() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-Unknown" : "Android-Payments-Api-V1-Precheck-Response-Unknown");
    }

    /* JADX INFO: renamed from: K */
    public void m45243K() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Verify-Request" : "Android-Payments-Api-V1-Verify-Request");
    }

    /* JADX INFO: renamed from: L */
    public void m45244L() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Verify-Response-200" : "Android-Payments-Api-V1-Verify-Response-200");
    }

    /* JADX INFO: renamed from: M */
    public void m45245M() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Verify-Response-400" : "Android-Payments-Api-V1-Verify-Response-400");
    }

    /* JADX INFO: renamed from: N */
    public void m45246N() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Verify-Response-401" : "Android-Payments-Api-V1-Verify-Response-401");
    }

    /* JADX INFO: renamed from: O */
    public void m45247O() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Verify-Response-500" : "Android-Payments-Api-V1-Verify-Response-500");
    }

    /* JADX INFO: renamed from: P */
    public void m45248P() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Verify-Response-Unknown" : "Android-Payments-Api-V1-Verify-Response-Unknown");
    }

    /* JADX INFO: renamed from: Q */
    public void m45249Q(boolean z10) {
        m45278q(z10 ? "Android-Payments-PaymentsProtocolUseQueryPurchases-Subs" : "Android-Payments-PaymentsProtocolUseQueryPurchases-InApp");
    }

    /* JADX INFO: renamed from: R */
    public void m45250R() {
        m45278q("Android-Payments-Pending-Purchase");
    }

    /* JADX INFO: renamed from: S */
    public void m45251S(boolean z10, boolean z11) {
        String str;
        if (z10) {
            str = z11 ? "Amazon-Payments-PrecheckBalanceError-InApp" : "Android-Payments-PrecheckBalanceError-InApp";
        } else {
            str = z11 ? "Amazon-Payments-PrecheckBalanceError-InGame" : "Android-Payments-PrecheckBalanceError-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: T */
    public void m45252T(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PrecheckError-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-PrecheckError-InApp" : "Android-Payments-PrecheckError-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PrecheckError-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-PrecheckError-InGame" : "Android-Payments-PrecheckError-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: U */
    public void m45253U(boolean z10, boolean z11) {
        String str;
        if (z10) {
            str = z11 ? "Amazon-Payments-PrecheckProductDetailsNotSupported-InApp" : "Android-Payments-PrecheckProductDetailsNotSupported-InApp";
        } else {
            str = z11 ? "Amazon-Payments-PrecheckProductDetailsNotSupported-InGame" : "Android-Payments-PrecheckProductDetailsNotSupported-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: V */
    public void m45254V(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PrecheckRetry-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-PrecheckRetry-InApp" : "Android-Payments-PrecheckRetry-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PrecheckRetry-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-PrecheckRetry-InGame" : "Android-Payments-PrecheckRetry-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: W */
    public void m45255W(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PrecheckUnknownError-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-PrecheckUnknownError-InApp" : "Android-Payments-PrecheckUnknownError-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PrecheckUnknownError-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkYWay-Payments-PrecheckUnknownError-InGame" : "Android-Payments-PrecheckUnknownError-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: X */
    public void m45256X(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PurchaseAlreadyAcknowledged-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-PurchaseAlreadyAcknowledged-InApp" : "Android-Payments-PurchaseAlreadyAcknowledged-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PurchaseAlreadyAcknowledged-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-PurchaseAlreadyAcknowledged-InGame" : "Android-Payments-PurchaseAlreadyAcknowledged-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: Y */
    public void m45257Y(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PurchaseCancelled-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-PurchaseCancelled-InApp" : "Android-Payments-PurchaseCancelled-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PurchaseCancelled-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-PurchaseCancelled-InGame" : "Android-Payments-PurchaseCancelled-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: Z */
    public void m45258Z(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PurchaseFailed-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-PurchaseFailed-InApp" : "Android-Payments-PurchaseFailed-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PurchaseFailed-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-PurchaseFailed-InGame" : "Android-Payments-PurchaseFailed-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: a0 */
    public void m45259a0(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PurchaseFlooded-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-PurchaseFlooded-InApp" : "Android-Payments-PurchaseFlooded-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PurchaseFlooded-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-PurchaseFlooded-InGame" : "Android-Payments-PurchaseFlooded-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: b0 */
    public void m45260b0(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PurchaseSuccess-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-PurchaseSuccess-InApp" : "Android-Payments-PurchaseSuccess-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PurchaseSuccess-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-PurchaseSuccess-InGame" : "Android-Payments-PurchaseSuccess-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: c0 */
    public void m45261c0() {
        m45278q("Android-Payments-Unacknowledged-Purchase-Failure");
    }

    /* JADX INFO: renamed from: d0 */
    public void m45262d0() {
        m45278q("Android-Payments-Unknown-State-Purchase");
    }

    /* JADX INFO: renamed from: e0 */
    public void m45263e0(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-VerificationEmptyError-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-VerificationEmptyError-InApp" : "Android-Payments-VerificationEmptyError-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-VerificationEmptyError-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-VerificationEmptyError-InGame" : "Android-Payments-VerificationEmptyError-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: f */
    public void m45264f() {
        if (C6127t.m27090f()) {
            m45278q("Mobile-DownloadCount-Amazon");
        } else if (C6127t.m27093i()) {
            m45278q("Mobile-DownloadCount-Galaxy");
        } else {
            m45278q("Mobile-DownloadCount-Android");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m45265f0(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-VerificationError-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-VerificationError-InApp" : "Android-Payments-VerificationError-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-VerificationError-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-VerificationError-InGame" : "Android-Payments-VerificationError-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: g */
    public void m45266g() {
        m45278q(m45231e());
        m45278q(m45230d(C11295a1.m42445d1()));
    }

    /* JADX INFO: renamed from: g0 */
    public void m45267g0(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-VerificationUnknownError-InApp";
            } else {
                str = C6127t.m27093i() ? "MilkyWay-Payments-VerificationUnknownError-InApp" : "Android-Payments-VerificationUnknownError-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-VerificationUnknownError-InGame";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-VerificationUnknownError-InGame" : "Android-Payments-VerificationUnknownError-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: h0 */
    public void m45268h0(C5150h c5150h) {
        this.f43077c = c5150h;
    }

    /* JADX INFO: renamed from: i */
    public void m45269i(boolean z10) {
        new C8150a("Android-RobloxPlayer-SessionReport-Inferred").m33404d("Session", z10 ? BacktraceAttributeConsts.CrashAttributeType : "Success").m33407g();
        m45278q(m45229c(z10));
    }

    /* JADX INFO: renamed from: i0 */
    public void m45270i0() {
        long jMo27017b = this.f43075a.mo27017b();
        long j10 = this.f43076b;
        long j11 = jMo27017b - j10;
        if (j10 == 0 || j11 >= 3600000) {
            m45266g();
            this.f43076b = jMo27017b;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m45271j(Context context) {
        if (context != null) {
            C11370y.m42581h().m42585d().mo14927c(context);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m45272k(Context context, long j10) {
        if (context != null) {
            C11370y.m42581h().m42585d().mo14929e(context, j10);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m45273l(String str) {
        C6124q.m27063h("rbx.purchaseflow", str);
        C5150h c5150h = this.f43077c;
        if (c5150h != null) {
            c5150h.f20051d++;
            new C8150a("Android-PurchaseFlow").m33411m(true).m33404d("Username", this.f43077c.f20048a).m33405e("InAppPurchase", this.f43077c.f20050c).m33404d("ProductId", this.f43077c.f20049b).m33404d(BacktraceAttributeConsts.MessageAttributeType, this.f43077c.f20051d + "- " + str).m33406f("Rooted", Boolean.valueOf(C11358u.m42560g().m42564h())).m33407g();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m45274m(String str, String str2, String str3, long j10) {
        C11370y.m42581h().m42585d().mo14931f(str, str2, str3, j10, C6127t.m27090f());
    }

    /* JADX INFO: renamed from: n */
    public void m45275n(boolean z10) {
        m45278q(z10 ? "Android-Payments-AcknowledgeCompleteError-InApp" : "Android-Payments-AcknowledgeCompleteError-InGame");
    }

    /* JADX INFO: renamed from: o */
    public void m45276o(boolean z10) {
        m45278q(z10 ? "Android-Payments-AcknowledgeError-InApp" : "Android-Payments-AcknowledgeError-InGame");
    }

    /* JADX INFO: renamed from: p */
    public void m45277p(boolean z10) {
        String str;
        if (z10) {
            str = C6127t.m27093i() ? "MilkyWay-Payments-ConsumeError-InApp" : "Android-Payments-ConsumeError-InApp";
        } else {
            str = C6127t.m27093i() ? "MilkyWay-Payments-ConsumeError-InGame" : "Android-Payments-ConsumeError-InGame";
        }
        m45278q(str);
    }

    /* JADX INFO: renamed from: q */
    public void m45278q(String str) {
        m45232h(str, 1);
    }

    /* JADX INFO: renamed from: r */
    public void m45279r(String str, long j10) {
        new AsyncTaskC5140r(C11295a1.m42486y() + C11295a1.m42484x(str, j10)).m23953c();
        m45280s(str, j10);
    }

    /* JADX INFO: renamed from: s */
    public void m45280s(String str, long j10) {
        NativeGLInterface.nativeReportToDiagByCountryCode("Mobile", str, j10);
    }

    /* JADX INFO: renamed from: t */
    public void m45281t() {
        m45278q("Android-Payments-Incorrect-User-Purchase");
    }

    /* JADX INFO: renamed from: u */
    public void m45282u() {
        m45278q("Android-Payments-Incorrect-User-Purchase-Userid-Invalid");
    }

    /* JADX INFO: renamed from: v */
    public void m45283v() {
        m45278q("Android-Payments-Incorrect-User-Purchase-Userid-Mismatch");
    }

    /* JADX INFO: renamed from: w */
    public void m45284w() {
        m45278q("Android-Payments-Incorrect-User-Purchase-Username-Mismatch");
    }

    /* JADX INFO: renamed from: x */
    public void m45285x() {
        m45278q("Android-Payments-Incorrect-User-Purchase-Username-Null");
    }

    /* JADX INFO: renamed from: y */
    public void m45286y(boolean z10) {
        m45278q(z10 ? "Android-Payments-NotifyPurchaseFinishedInvalidUserIdError-InApp" : "Android-Payments-NotifyPurchaseFinishedInvalidUserIdError-InGame");
    }

    /* JADX INFO: renamed from: z */
    public void m45287z() {
        m45278q(C6127t.m27093i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-Payload-Parse-Error" : "Android-Payments-Api-V1-Precheck-Response-Payload-Parse-Error");
    }

    public C12216g() {
        this(new C6110d0());
    }
}
