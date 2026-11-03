package ti;

import android.content.Context;
import androidx.annotation.NonNull;
import backtraceio.library.models.BacktraceAttributeConsts;
import ci.r;
import cj.m;
import com.roblox.engine.jni.NativeGLInterface;
import ek.c0;
import ek.d0;
import ek.q;
import ek.t;
import rg.a1;
import rg.t0;
import rg.u;
import rg.y;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g f32399d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final c0 f32400a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f32401c;

    public g(@NonNull c0 c0Var) {
        this.f32400a = c0Var;
    }

    public static void a(String str) {
        t0.h(str, "sessionCheck");
    }

    public static g b() {
        g gVar = f32399d;
        if (gVar != null) {
            return gVar;
        }
        synchronized (g.class) {
            try {
                if (f32399d == null) {
                    f32399d = new g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f32399d;
    }

    public static String c(boolean z10) {
        if (a1.q0()) {
            return z10 ? "Quest-ROBLOXPlayer-Session-Inferred-Crash" : "Quest-ROBLOXPlayer-Session-Inferred-Success";
        }
        return z10 ? "Android-ROBLOXPlayer-Session-Inferred-Crash" : "Android-ROBLOXPlayer-Session-Inferred-Success";
    }

    public static String d(String str) {
        String str2;
        String[] strArrSplit = str.split("\\.");
        String str3 = strArrSplit.length >= 2 ? strArrSplit[1] : "Unknown";
        if (a1.q0()) {
            str2 = "Quest-AppStartup-Version-";
        } else if (t.f()) {
            str2 = "Amazon-AppStartup-Version-";
        } else {
            str2 = t.i() ? "Galaxy-AppStartup-Version-" : "Android-AppStartup-Version-";
        }
        return str2 + str3;
    }

    public static String e() {
        if (a1.q0()) {
            return "Quest-AppStartup-Version-Total";
        }
        if (t.f()) {
            return "Amazon-AppStartup-Version-Total";
        }
        return t.i() ? "Galaxy-AppStartup-Version-Total" : "Android-AppStartup-Version-Total";
    }

    public static void h(String str, int i10) {
        new r(a1.w() + a1.v(str, i10)).c();
    }

    public void A() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Request" : "Android-Payments-Api-V1-Precheck-Request");
    }

    public void B() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-200" : "Android-Payments-Api-V1-Precheck-Response-200");
    }

    public void C() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-400" : "Android-Payments-Api-V1-Precheck-Response-400");
    }

    public void D() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-401" : "Android-Payments-Api-V1-Precheck-Response-401");
    }

    public void E() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-403" : "Android-Payments-Api-V1-Precheck-Response-403");
    }

    public void F() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-404" : "Android-Payments-Api-V1-Precheck-Response-404");
    }

    public void G() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-429" : "Android-Payments-Api-V1-Precheck-Response-429");
    }

    public void H() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-500" : "Android-Payments-Api-V1-Precheck-Response-500");
    }

    public void I() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-503" : "Android-Payments-Api-V1-Precheck-Response-503");
    }

    public void J() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-Unknown" : "Android-Payments-Api-V1-Precheck-Response-Unknown");
    }

    public void K() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Request" : "Android-Payments-Api-V1-Verify-Request");
    }

    public void L() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Response-200" : "Android-Payments-Api-V1-Verify-Response-200");
    }

    public void M() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Response-400" : "Android-Payments-Api-V1-Verify-Response-400");
    }

    public void N() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Response-401" : "Android-Payments-Api-V1-Verify-Response-401");
    }

    public void O() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Response-500" : "Android-Payments-Api-V1-Verify-Response-500");
    }

    public void P() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Verify-Response-Unknown" : "Android-Payments-Api-V1-Verify-Response-Unknown");
    }

    public void Q(boolean z10) {
        q(z10 ? "Android-Payments-PaymentsProtocolUseQueryPurchases-Subs" : "Android-Payments-PaymentsProtocolUseQueryPurchases-InApp");
    }

    public void R() {
        q("Android-Payments-Pending-Purchase");
    }

    public void S(boolean z10, boolean z11) {
        String str;
        if (z10) {
            str = z11 ? "Amazon-Payments-PrecheckBalanceError-InApp" : "Android-Payments-PrecheckBalanceError-InApp";
        } else {
            str = z11 ? "Amazon-Payments-PrecheckBalanceError-InGame" : "Android-Payments-PrecheckBalanceError-InGame";
        }
        q(str);
    }

    public void T(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PrecheckError-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-PrecheckError-InApp" : "Android-Payments-PrecheckError-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PrecheckError-InGame";
        } else {
            str = t.i() ? "MilkyWay-Payments-PrecheckError-InGame" : "Android-Payments-PrecheckError-InGame";
        }
        q(str);
    }

    public void U(boolean z10, boolean z11) {
        String str;
        if (z10) {
            str = z11 ? "Amazon-Payments-PrecheckProductDetailsNotSupported-InApp" : "Android-Payments-PrecheckProductDetailsNotSupported-InApp";
        } else {
            str = z11 ? "Amazon-Payments-PrecheckProductDetailsNotSupported-InGame" : "Android-Payments-PrecheckProductDetailsNotSupported-InGame";
        }
        q(str);
    }

    public void V(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PrecheckRetry-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-PrecheckRetry-InApp" : "Android-Payments-PrecheckRetry-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PrecheckRetry-InGame";
        } else {
            str = t.i() ? "MilkyWay-Payments-PrecheckRetry-InGame" : "Android-Payments-PrecheckRetry-InGame";
        }
        q(str);
    }

    public void W(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PrecheckUnknownError-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-PrecheckUnknownError-InApp" : "Android-Payments-PrecheckUnknownError-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PrecheckUnknownError-InGame";
        } else {
            str = t.i() ? "MilkYWay-Payments-PrecheckUnknownError-InGame" : "Android-Payments-PrecheckUnknownError-InGame";
        }
        q(str);
    }

    public void X(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PurchaseAlreadyAcknowledged-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-PurchaseAlreadyAcknowledged-InApp" : "Android-Payments-PurchaseAlreadyAcknowledged-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PurchaseAlreadyAcknowledged-InGame";
        } else {
            str = t.i() ? "MilkyWay-Payments-PurchaseAlreadyAcknowledged-InGame" : "Android-Payments-PurchaseAlreadyAcknowledged-InGame";
        }
        q(str);
    }

    public void Y(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PurchaseCancelled-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-PurchaseCancelled-InApp" : "Android-Payments-PurchaseCancelled-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PurchaseCancelled-InGame";
        } else {
            str = t.i() ? "MilkyWay-Payments-PurchaseCancelled-InGame" : "Android-Payments-PurchaseCancelled-InGame";
        }
        q(str);
    }

    public void Z(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PurchaseFailed-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-PurchaseFailed-InApp" : "Android-Payments-PurchaseFailed-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PurchaseFailed-InGame";
        } else {
            str = t.i() ? "MilkyWay-Payments-PurchaseFailed-InGame" : "Android-Payments-PurchaseFailed-InGame";
        }
        q(str);
    }

    public void a0(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PurchaseFlooded-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-PurchaseFlooded-InApp" : "Android-Payments-PurchaseFlooded-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PurchaseFlooded-InGame";
        } else {
            str = t.i() ? "MilkyWay-Payments-PurchaseFlooded-InGame" : "Android-Payments-PurchaseFlooded-InGame";
        }
        q(str);
    }

    public void b0(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-PurchaseSuccess-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-PurchaseSuccess-InApp" : "Android-Payments-PurchaseSuccess-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-PurchaseSuccess-InGame";
        } else {
            str = t.i() ? "MilkyWay-Payments-PurchaseSuccess-InGame" : "Android-Payments-PurchaseSuccess-InGame";
        }
        q(str);
    }

    public void c0() {
        q("Android-Payments-Unacknowledged-Purchase-Failure");
    }

    public void d0() {
        q("Android-Payments-Unknown-State-Purchase");
    }

    public void e0(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-VerificationEmptyError-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-VerificationEmptyError-InApp" : "Android-Payments-VerificationEmptyError-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-VerificationEmptyError-InGame";
        } else {
            str = t.i() ? "MilkyWay-Payments-VerificationEmptyError-InGame" : "Android-Payments-VerificationEmptyError-InGame";
        }
        q(str);
    }

    public void f() {
        if (t.f()) {
            q("Mobile-DownloadCount-Amazon");
        } else if (t.i()) {
            q("Mobile-DownloadCount-Galaxy");
        } else {
            q("Mobile-DownloadCount-Android");
        }
    }

    public void f0(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-VerificationError-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-VerificationError-InApp" : "Android-Payments-VerificationError-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-VerificationError-InGame";
        } else {
            str = t.i() ? "MilkyWay-Payments-VerificationError-InGame" : "Android-Payments-VerificationError-InGame";
        }
        q(str);
    }

    public void g() {
        q(e());
        q(d(a1.e1()));
    }

    public void g0(boolean z10, boolean z11) {
        String str;
        if (z10) {
            if (z11) {
                str = "Amazon-Payments-VerificationUnknownError-InApp";
            } else {
                str = t.i() ? "MilkyWay-Payments-VerificationUnknownError-InApp" : "Android-Payments-VerificationUnknownError-InApp";
            }
        } else if (z11) {
            str = "Amazon-Payments-VerificationUnknownError-InGame";
        } else {
            str = t.i() ? "MilkyWay-Payments-VerificationUnknownError-InGame" : "Android-Payments-VerificationUnknownError-InGame";
        }
        q(str);
    }

    public void h0(m mVar) {
        this.f32401c = mVar;
    }

    public void i(boolean z10) {
        new ji.a("Android-RobloxPlayer-SessionReport-Inferred").d("Session", z10 ? BacktraceAttributeConsts.CrashAttributeType : "Success").g();
        q(c(z10));
    }

    public void i0() {
        long jB = this.f32400a.b();
        long j10 = this.b;
        long j11 = jB - j10;
        if (j10 == 0 || j11 >= 3600000) {
            g();
            this.b = jB;
        }
    }

    public void j(Context context) {
        if (context != null) {
            y.h().d().c(context);
        }
    }

    public void k(Context context, long j10) {
        if (context != null) {
            y.h().d().e(context, j10);
        }
    }

    public void l(String str) {
        q.h("rbx.purchaseflow", str);
        m mVar = this.f32401c;
        if (mVar != null) {
            mVar.f5033d++;
            new ji.a("Android-PurchaseFlow").m(true).d("Username", this.f32401c.f5031a).e("InAppPurchase", this.f32401c.f5032c).d("ProductId", this.f32401c.b).d(BacktraceAttributeConsts.MessageAttributeType, this.f32401c.f5033d + "- " + str).f("Rooted", Boolean.valueOf(u.g().h())).g();
        }
    }

    public void m(String str, String str2, String str3, long j10) {
        y.h().d().f(str, str2, str3, j10, t.f());
    }

    public void n(boolean z10) {
        q(z10 ? "Android-Payments-AcknowledgeCompleteError-InApp" : "Android-Payments-AcknowledgeCompleteError-InGame");
    }

    public void o(boolean z10) {
        q(z10 ? "Android-Payments-AcknowledgeError-InApp" : "Android-Payments-AcknowledgeError-InGame");
    }

    public void p(boolean z10) {
        String str;
        if (z10) {
            str = t.i() ? "MilkyWay-Payments-ConsumeError-InApp" : "Android-Payments-ConsumeError-InApp";
        } else {
            str = t.i() ? "MilkyWay-Payments-ConsumeError-InGame" : "Android-Payments-ConsumeError-InGame";
        }
        q(str);
    }

    public void q(String str) {
        h(str, 1);
    }

    public void r(String str, long j10) {
        new r(a1.y() + a1.x(str, j10)).c();
        s(str, j10);
    }

    public void s(String str, long j10) {
        NativeGLInterface.nativeReportToDiagByCountryCode("Mobile", str, j10);
    }

    public void t() {
        q("Android-Payments-Incorrect-User-Purchase");
    }

    public void u() {
        q("Android-Payments-Incorrect-User-Purchase-Userid-Invalid");
    }

    public void v() {
        q("Android-Payments-Incorrect-User-Purchase-Userid-Mismatch");
    }

    public void w() {
        q("Android-Payments-Incorrect-User-Purchase-Username-Mismatch");
    }

    public void x() {
        q("Android-Payments-Incorrect-User-Purchase-Username-Null");
    }

    public void y(boolean z10) {
        q(z10 ? "Android-Payments-NotifyPurchaseFinishedInvalidUserIdError-InApp" : "Android-Payments-NotifyPurchaseFinishedInvalidUserIdError-InGame");
    }

    public void z() {
        q(t.i() ? "MilkyWay-Payments-Api-V1-Precheck-Response-Payload-Parse-Error" : "Android-Payments-Api-V1-Precheck-Response-Payload-Parse-Error");
    }

    public g() {
        this(new d0());
    }
}
