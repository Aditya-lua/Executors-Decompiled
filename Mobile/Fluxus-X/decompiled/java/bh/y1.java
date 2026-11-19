package bh;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.protocols.webview.DomainAllowListChecker;
import org.greenrobot.eventbus.ThreadMode;
import wl.AndroidColorToken;

/* JADX INFO: loaded from: classes2.dex */
public class y1 extends f4.q implements n5.d.j {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f4399m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ProgressDialog f4400n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public FrameLayout f4401o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f4402p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ValueCallback<Uri[]> f4403q0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ImageView f4406t0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f4392f0 = null;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public qi.b f4393g0 = null;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public n5.d f4394h0 = null;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f4395i0 = null;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f4396j0 = 0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f4397k0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f4398l0 = null;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f4404r0 = false;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f4405s0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f4407u0 = false;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f4408v0 = true;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public wl.c f4409w0 = wl.b.tokens;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f4410x0 = null;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final mj.o f4411y0 = new b();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final mj.o f4412z0 = new c();
    public final mj.o A0 = new d();
    public final mj.o B0 = new e();

    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            if (!z11) {
                return super.onCreateWindow(webView, z10, z11, message);
            }
            ((WebView.WebViewTransport) message.obj).setWebView(new WebView(webView.getContext()));
            message.sendToTarget();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            for (String str : permissionRequest.getResources()) {
                if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (l2.b.a(y1.this.p(), y.h().k().k(bn.o.CAMERA)) != 0) {
                        ok.q.h("rbx.web", "No permission granted for camera");
                        permissionRequest.deny();
                    } else {
                        ok.q.h("rbx.web", "Permission granted for camera");
                        permissionRequest.grant(new String[]{str});
                    }
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            y1.this.Y2(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            y1.this.f4403q0 = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            y1.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    public class b implements mj.o {
        public b() {
        }

        @Override // mj.o
        public void b() {
            y1.this.d3();
        }

        @Override // mj.o
        public void c() {
            y1.this.d3();
        }

        @Override // mj.o
        public void d() {
            y1.this.I2();
        }

        @Override // mj.o
        public void e(mj.p pVar) {
            y1.this.x2(pVar);
        }
    }

    public class c implements mj.o {
        public c() {
        }

        @Override // mj.o
        public void b() {
            y1.this.d3();
        }

        @Override // mj.o
        public void c() {
            y1.this.d3();
        }

        @Override // mj.o
        public void d() {
            y1.this.I2();
        }

        @Override // mj.o
        public void e(mj.p pVar) {
            y1.this.x2(pVar);
        }
    }

    public class d implements mj.o {
        public d() {
        }

        @Override // mj.o
        public void b() {
        }

        @Override // mj.o
        public void c() {
        }

        @Override // mj.o
        public void d() {
        }

        @Override // mj.o
        public void e(mj.p pVar) {
            ok.q.h("rbx.amazon.purchaseflow", "onPurchaseFinishedListener: Result=" + pVar + ".");
            y1.this.x2(pVar);
        }
    }

    public class e implements mj.o {
        public e() {
        }

        @Override // mj.o
        public void b() {
        }

        @Override // mj.o
        public void c() {
            y1.this.d3();
        }

        @Override // mj.o
        public void d() {
        }

        @Override // mj.o
        public void e(mj.p pVar) {
            y1.this.x2(pVar);
        }
    }

    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4418a;

        static {
            int[] iArr = new int[DomainAllowListChecker.a.values().length];
            f4418a = iArr;
            try {
                iArr[DomainAllowListChecker.a.FirstParty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4418a[DomainAllowListChecker.a.SecondParty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4418a[DomainAllowListChecker.a.ThirdParty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4418a[DomainAllowListChecker.a.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class g {
        public g() {
        }
    }

    public interface h {
    }

    public class i extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4420a = null;

        public class a implements mi.m {
            public a() {
            }

            @Override // mi.m
            public void a(mi.j jVar) {
            }
        }

        public i() {
        }

        public final boolean d(final WebView webView, final String str, boolean z10, boolean z11) {
            String queryParameter;
            String queryParameter2;
            ok.q.h("rbx.web", "-> " + str);
            if (str == null) {
                ok.q.e("rbx.web", "RWF.shouldOverrideUrlLoading() urlString is null!");
                return false;
            }
            final f4.v vVarP = y1.this.p();
            if (vVarP == null || vVarP.isFinishing()) {
                ok.q.h("rbx.web", "RWF.shouldOverrideUrlLoading() activity is null or finishing");
                return true;
            }
            try {
                if (y1.this.D2().N1()) {
                    return true;
                }
            } catch (u0 unused) {
                y1.U2();
            }
            if (y1.this.H2(str)) {
                return true;
            }
            if (!DomainAllowListChecker.f9747a.enableDomainAllowListChecker() && y1.this.V2(str)) {
                ok.q.h("rbx.web", "Navigating social media Link...");
                return true;
            }
            if (str.equalsIgnoreCase(a1.z0())) {
                y1.o2(y1.this);
                return true;
            }
            if (a1.m0(str) && !y1.this.f4402p0) {
                ok.q.h("rbx.web", "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!");
                try {
                    y1.this.D2().L1(zi.a.c(y1.this.v(), q0.f4261o, new Object[0]), 1);
                } catch (u0 unused2) {
                    y1.U2();
                }
                dj.b.f().i(vVarP, dj.b.d.LOGOUT_BY_401_ERROR_IN_WEB);
                a1.V(str);
                dj.h.e().d(new a());
                return true;
            }
            String queryParameter3 = null;
            y1.this.f4393g0.setOnTouchListener(null);
            y1.this.c3(str, true);
            if (!str.contains("mobile-app-upgrades/buy?")) {
                String strA = f2.a(str, z10);
                if (strA == null && bi.h.a().M0() && f2.c(str, z11)) {
                    strA = ym.g.G().k(str, "android_webview");
                }
                final String str2 = strA;
                ym.g.k kVar = new ym.g.k() { // from class: bh.a2
                    @Override // ym.g.k
                    public final void a(boolean z12) {
                        this.f4039a.g(str2, str, vVarP, webView, z12);
                    }
                };
                if (!bi.h.a().M0() || str2 == null) {
                    ym.g.G().s(str, kVar);
                } else {
                    ym.g.G().p(str2, kVar);
                }
                return true;
            }
            com.roblox.client.a aVar = (com.roblox.client.a) vVarP;
            String strK = nk.c.c().k();
            Uri uri = Uri.parse(str);
            String queryParameter4 = uri.getQueryParameter("id");
            if (!ok.t.i()) {
                if (bi.h.a().P()) {
                    String queryParameter5 = uri.getQueryParameter("ctx");
                    String queryParameter6 = uri.getQueryParameter(Payload.TYPE);
                    String strC = ok.e0.c(uri, "paymentSessionId");
                    if (queryParameter5 != null && queryParameter6 != null && queryParameter5.equals("subscription")) {
                        ok.q.h("rbx.purchaseflow", "RobloxWebFragment to start an in-app subscription purchase.");
                        IAPPurchaseManager.nativePerformSubscriptionPurchase(queryParameter6, queryParameter4, "GooglePlayStore", strC);
                        return true;
                    }
                }
                if (bi.h.a().L1()) {
                    ok.q.h("rbx.purchaseflow", "PaymentsProtocolV2: tryStartInAppPurchase.");
                    nj.a0 a0VarR = nj.a0.R(aVar);
                    t0.d(y1.this.F2(), "purchaseStart" + queryParameter4);
                    a0VarR.c(queryParameter4, uri, strK, aVar, y1.this.f4411y0, new Runnable() { // from class: bh.z1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4422a.e();
                        }
                    });
                } else if (bi.h.a().t3()) {
                    IAPPurchaseManager.nativeSetMetricsPurchaseType(IAPPurchaseManager.f9076l);
                    try {
                        queryParameter2 = uri.getQueryParameter("paymentSessionId");
                    } catch (NullPointerException unused3) {
                        ok.q.h("rbx.purchaseflow", "NullPointerException thrown while parsing paymentSession parameter for purchase url");
                        queryParameter2 = BuildConfig.FLAVOR;
                    } catch (UnsupportedOperationException unused4) {
                        ok.q.h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url");
                        queryParameter2 = BuildConfig.FLAVOR;
                    }
                    nj.m mVarF0 = nj.m.F0(aVar);
                    mVarF0.i(null);
                    mVarF0.k(true);
                    IAPPurchaseManager.nativeSetPaymentsProtocolIsInApp(true);
                    IAPPurchaseManager.nativeSetPaymentSessionId(queryParameter2);
                    IAPPurchaseManager.nativeSetProviderCurrencyCode(mVarF0.e(queryParameter4));
                    IAPPurchaseManager.nativeBeginPaymentsProtocolPurchase(queryParameter4);
                } else {
                    nj.m mVarF1 = nj.m.F0(aVar);
                    if (mVarF1 == null) {
                        try {
                            y1.this.D2().T(q0.F1);
                        } catch (u0 unused5) {
                            y1.U2();
                        }
                    } else {
                        t0.d(y1.this.F2(), "purchaseStart" + queryParameter4);
                        try {
                            queryParameter = uri.getQueryParameter("recurring");
                        } catch (NullPointerException unused6) {
                            ok.q.h("rbx.purchaseflow", "NullPointerException thrown while parsing recurring parameter for purchase url");
                            queryParameter = null;
                        } catch (UnsupportedOperationException unused7) {
                            ok.q.h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing recurring parameter for purchase url");
                            queryParameter = null;
                        }
                        boolean zBooleanValue = Boolean.valueOf(queryParameter).booleanValue();
                        try {
                            queryParameter3 = uri.getQueryParameter("paymentSessionId");
                        } catch (NullPointerException unused8) {
                            ok.q.h("rbx.purchaseflow", "NullPointerException thrown while parsing paymentSession parameter for purchase url");
                        } catch (UnsupportedOperationException unused9) {
                            ok.q.h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url");
                        }
                        if (!mVarF1.l(strK, queryParameter4, aVar, y1.this.f4411y0, zBooleanValue, queryParameter3)) {
                            try {
                                y1.this.D2().T(q0.A1);
                            } catch (u0 unused10) {
                                y1.U2();
                            }
                        }
                    }
                }
            } else if (bi.h.a().L5()) {
                if (bi.h.a().b3()) {
                    ok.e0.c(uri, "paymentSessionId");
                } else {
                    try {
                        uri.getQueryParameter("paymentSessionId");
                    } catch (NullPointerException unused11) {
                        ok.q.h("rbx.purchaseflow", "NullPointerException thrown while parsing paymentSession parameter for purchase url");
                    } catch (UnsupportedOperationException e10) {
                        ok.q.f("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url " + str, e10);
                    }
                }
                qj.b.a(aVar);
                try {
                    y1.this.D2().T(q0.B1);
                } catch (u0 unused12) {
                    y1.U2();
                }
            } else {
                ok.q.h("rbx.purchaseflow", "RobloxWebFragment to start an in-app purchase. Username = " + strK);
                qj.a.a(aVar);
                try {
                    y1.this.D2().T(q0.F1);
                } catch (u0 unused13) {
                    y1.U2();
                }
            }
            return true;
        }

        public final /* synthetic */ void e() {
            try {
                y1.this.D2().T(q0.A1);
            } catch (u0 unused) {
                y1.U2();
            }
        }

        public final /* synthetic */ void f(f4.v vVar, String str, WebView webView) {
            if (vVar.isFinishing() || vVar.isDestroyed()) {
                return;
            }
            y1.this.f4392f0.setText(str);
            webView.loadUrl(str);
        }

        public final /* synthetic */ void g(String str, final String str2, final f4.v vVar, final WebView webView, boolean z10) {
            if (!z10) {
                if (str != null) {
                    ym.g.G().o(str, "success", "handled_in_webview");
                }
                if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
                    y1.this.a3(str2);
                    return;
                } else {
                    vVar.runOnUiThread(new Runnable() { // from class: bh.b2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4046a.f(vVar, str2, webView);
                        }
                    });
                    return;
                }
            }
            ym.g gVarG = ym.g.G();
            if (str == null) {
                str = gVarG.k(str2, "android_webview");
            }
            if (str == null || str.isEmpty()) {
                mw.c.d().j(y1.this.new g());
                ym.g.G().h(str2, "android_webview", false);
                ym.g.G().m(str2);
            } else {
                gVarG.A(str2, "android_webview", false);
                mw.c.d().j(y1.this.new g());
                gVarG.l(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            dl.h.j().n(a1.g());
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            y1.this.f4394h0.setRefreshing(false);
            ok.q.h("rbx.web", "onPageFinished. url=" + str);
            y1.this.X2(str);
            if (bi.h.a().W1()) {
                dl.h.j().n(a1.g());
            }
            if (bi.h.a().p2() && !webView.hasFocus()) {
                webView.requestFocus();
            }
            if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
                this.f4420a = null;
            }
            if (di.m.b().a(str)) {
                y1.this.f4393g0.reload();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ok.q.h("rbx.web", "-> " + str);
            y1.this.W2(str);
            y1.this.f4394h0.setRefreshing(true);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
                return d(webView, webResourceRequest.getUrl().toString(), webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame());
            }
            String string = webResourceRequest.getUrl().toString();
            if (!string.equals(this.f4420a) || webResourceRequest.hasGesture()) {
                this.f4420a = string;
                return d(webView, string, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame());
            }
            ok.q.h("rbx.web", "Skipping duplicate shouldOverrideUrlLoading call for URL: " + string);
            return true;
        }
    }

    private void C2(final String str, boolean z10) {
        final f4.v vVarP = p();
        if (vVarP == null || vVarP.isFinishing() || vVarP.isDestroyed()) {
            return;
        }
        vVarP.runOnUiThread(new Runnable() { // from class: bh.t1
            @Override // java.lang.Runnable
            public final void run() {
                this.f4366a.N2(vVarP, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H2(String str) {
        Intent intent;
        if (str.startsWith("mailto:")) {
            intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        } else {
            intent = str.startsWith("tel:") ? new Intent("android.intent.action.DIAL", Uri.parse(str)) : null;
        }
        if (intent == null) {
            return false;
        }
        if (ok.t.a(v(), intent)) {
            X1(intent);
            return true;
        }
        try {
            D2().K1(q0.U, 1);
        } catch (u0 unused) {
            U2();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        final f4.v vVarP = p();
        if (vVarP != null) {
            vVarP.runOnUiThread(new Runnable() { // from class: bh.r1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4302a.O2(vVarP);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K2(f4.v vVar, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(this.f4393g0.getUrl())) {
            vVar.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L2(final f4.v vVar, final String str) {
        new androidx.appcompat.app.a.C0021a(vVar).d(false).p(q0.f4274s0).g(q0.f4271r0).i(q0.f4270r, null).m(q0.f4273s, new DialogInterface.OnClickListener() { // from class: bh.v1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                f4.v vVar2 = vVar;
                String str2 = str;
                new ym.a("rbx.web").e(vVar2, str2, str2);
            }
        }).k(new DialogInterface.OnDismissListener() { // from class: bh.w1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f4378a.K2(vVar, dialogInterface);
            }
        }).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M2(f4.v vVar, mj.p pVar) {
        if (vVar == null || vVar.isFinishing() || vVar.isDestroyed()) {
            return;
        }
        I2();
        e3(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N2(f4.v vVar, String str) {
        if (vVar.isFinishing() || vVar.isDestroyed()) {
            return;
        }
        this.f4392f0.setText(str);
        this.f4393g0.loadUrl(str);
    }

    public static void U2() {
        ok.q.k("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V2(String str) {
        hk.b bVar = new hk.b("rbx.web");
        if (!bVar.b(str)) {
            return false;
        }
        bVar.a(p(), str, str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3(final String str) {
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f9747a;
        if (domainAllowListChecker.isKnownTrustedDomain(str, this.f4410x0)) {
            C2(str, false);
        } else {
            domainAllowListChecker.checkDomainAllowList(str, this.f4410x0, new DomainAllowListChecker.Callback() { // from class: bh.s1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.a aVar) {
                    this.f4363a.P2(str, aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(String str, boolean z10) {
        if (str.contains("sponsored")) {
            this.f4393g0.getSettings().setBuiltInZoomControls(z10);
        } else {
            this.f4393g0.getSettings().setBuiltInZoomControls(!z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        final f4.v vVarP = p();
        if (vVarP != null) {
            vVarP.runOnUiThread(new Runnable() { // from class: bh.x1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4386a.S2(vVarP);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e3(mj.p pVar) {
        boolean zContains;
        f4.v vVarP = p();
        if (vVarP == null) {
            return;
        }
        if (bi.h.a().r5()) {
            zContains = bi.h.a().Q0().contains(((mj.j) pVar).a());
        } else {
            zContains = false;
        }
        ok.q.b("rbx.web", "isBonusItemEnabled = " + zContains);
        CharSequence charSequenceC = pVar.c(vVarP);
        if (pVar.f()) {
            y2(charSequenceC);
            return;
        }
        try {
            if (!zContains) {
                D2().V(charSequenceC.toString());
                return;
            }
            D2().F1(d0(q0.D1), d0(q0.E1));
        } catch (u0 unused) {
            U2();
        }
    }

    public static /* bridge */ /* synthetic */ h o2(y1 y1Var) {
        y1Var.getClass();
        return null;
    }

    private void w2(final String str) {
        final f4.v vVarP = p();
        if (vVarP == null || vVarP.isFinishing() || vVarP.isDestroyed()) {
            return;
        }
        vVarP.runOnUiThread(new Runnable() { // from class: bh.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f4374a.L2(vVarP, str);
            }
        });
    }

    private synchronized void y2(CharSequence charSequence) {
        f4.v vVarP = p();
        if (vVarP == null) {
            return;
        }
        androidx.appcompat.app.a aVarA = new androidx.appcompat.app.a.C0021a(vVarP).a();
        TextView textView = new TextView(vVarP);
        String string = vVarP.getString(q0.W);
        int iIndexOf = charSequence.toString().indexOf(string);
        pk.b.b(textView, charSequence.toString(), new pk.c(vVarP, null, string, iIndexOf, iIndexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        aVarA.w(textView, 150, 100, 150, 100);
        aVarA.setCanceledOnTouchOutside(true);
        try {
            aVarA.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    private ProgressDialog z2(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    @Override // f4.q
    public void A0(int i10, int i11, Intent intent) {
        if (i10 == 20123) {
            if (i11 == -1) {
                this.f4403q0.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                ok.q.h("rbx.web", "Result of file chooser invalid.");
                this.f4403q0.onReceiveValue(null);
            }
        }
    }

    public qi.b A2() {
        qi.b aVar = this.f4404r0 ? new qi.a(v()) : new qi.b(v());
        if (bi.h.a().W1()) {
            dl.e.A(a1.O());
        }
        return aVar;
    }

    public void B2() {
        if (p() != null) {
            p().l1().a1();
        }
    }

    @NonNull
    public com.roblox.client.a D2() throws u0 {
        f4.v vVarP = p();
        if (vVarP instanceof com.roblox.client.a) {
            return (com.roblox.client.a) vVarP;
        }
        throw new u0();
    }

    public boolean E2(String str, boolean z10) {
        Bundle bundleT = t();
        return bundleT != null ? bundleT.getBoolean(str, z10) : z10;
    }

    @Override // f4.q
    public void F0(Bundle bundle) {
        super.F0(bundle);
        bl.b.a().n(this);
        Bundle bundleT = t();
        if (bundleT != null) {
            String string = bundleT.getString("DEFAULT_URL", null);
            ok.q.b("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                this.f4398l0 = string;
                if (this.f4395i0 == null) {
                    this.f4395i0 = string;
                    if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
                        this.f4410x0 = string;
                    }
                }
            }
            this.f4399m0 = bundleT.getString("WEB_VIEW_TAG", null);
            this.f4404r0 = bundleT.getBoolean("USE_APP_HYBRID");
        }
    }

    public String F2() {
        return "undefinedWebContext";
    }

    public boolean G2() {
        qi.b bVar = this.f4393g0;
        if (bVar == null || !bVar.canGoBack()) {
            return false;
        }
        c3(this.f4393g0.getUrl(), false);
        this.f4393g0.goBack();
        return true;
    }

    @Override // f4.q
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z10 = bi.h.a().I0() && E2("hideNativeHeader", false);
        this.f4405s0 = z10;
        View viewInflate = layoutInflater.inflate(z10 ? n0.f4195n : n0.f4194m, viewGroup, false);
        if (bi.h.a().K3() && !this.f4405s0) {
            ui.g.b(viewInflate);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(m0.f4151l0);
        this.f4392f0 = (TextView) viewInflate.findViewById(m0.f4175x0);
        i iVar = new i();
        this.f4393g0 = A2();
        if (bi.h.a().q2()) {
            this.f4393g0.setCommandListener(new x());
        }
        viewGroup2.addView(this.f4393g0, new ViewGroup.LayoutParams(-1, -1));
        this.f4393g0.setTag(this.f4399m0);
        this.f4393g0.setWebViewClient(iVar);
        this.f4393g0.getSettings().setSupportMultipleWindows(true);
        this.f4393g0.setWebChromeClient(new a());
        this.f4393g0.getSettings().setJavaScriptEnabled(true);
        this.f4393g0.getSettings().setDomStorageEnabled(true);
        this.f4393g0.getSettings().setUserAgentString(a1.a1());
        this.f4393g0.getSettings().setCacheMode(-1);
        this.f4393g0.setHorizontalScrollBarEnabled(false);
        this.f4393g0.setVerticalScrollBarEnabled(false);
        if (wh.b.a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (this.f4395i0 != null) {
            if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
                a3(this.f4395i0);
            } else {
                this.f4393g0.loadUrl(this.f4395i0);
            }
            this.f4395i0 = null;
        }
        n5.d dVar = (n5.d) viewInflate.findViewById(m0.f4151l0);
        this.f4394h0 = dVar;
        dVar.setOnRefreshListener(this);
        n5.d dVar2 = this.f4394h0;
        int i10 = j0.b;
        int i11 = j0.f4092o;
        dVar2.setColorSchemeResources(i10, i10, i11, i11);
        this.f4401o0 = (FrameLayout) viewInflate.findViewById(m0.f4153m0);
        Bundle bundleT = t();
        if (bundleT != null) {
            this.f4396j0 = bundleT.getInt("dialogHeight", 0);
            this.f4397k0 = bundleT.getInt("dialogWidth", 0);
            if (!bundleT.getBoolean("enablePullToRefresh", true)) {
                this.f4394h0.setEnabled(false);
            }
            this.f4402p0 = bundleT.getBoolean("USING_LOGIN_WEB_URL", false);
            this.f4408v0 = bundleT.getBoolean("VISIBLE", true);
            this.f4407u0 = bundleT.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        try {
            D2().N1();
        } catch (u0 unused) {
            U2();
        }
        this.f4393g0.h();
        if (this.f4405s0) {
            b3(viewInflate);
        }
        return viewInflate;
    }

    public boolean J2() {
        return this.f4407u0;
    }

    @Override // f4.q
    public void K0() {
        bl.b.a().p(this);
        super.K0();
    }

    @Override // f4.q
    public void M0() {
        super.M0();
        this.f4393g0.i();
    }

    public final /* synthetic */ void O2(f4.v vVar) {
        ProgressDialog progressDialog;
        if (vVar == null || vVar.isFinishing() || vVar.isDestroyed() || (progressDialog = this.f4400n0) == null || !progressDialog.isShowing()) {
            return;
        }
        this.f4400n0.dismiss();
    }

    @Override // f4.q
    public void P0(boolean z10) {
        super.P0(z10);
        if (z10 || !di.m.b().a(this.f4393g0.getUrl())) {
            return;
        }
        this.f4393g0.reload();
    }

    public final /* synthetic */ void P2(String str, DomainAllowListChecker.a aVar) {
        int i10 = f.f4418a[aVar.ordinal()];
        if (i10 == 1) {
            C2(str, false);
            return;
        }
        if (i10 == 2) {
            C2(str, true);
        } else if (i10 == 3 || i10 == 4) {
            w2(str);
        }
    }

    public final /* synthetic */ void Q2(View view) {
        B2();
    }

    public final /* synthetic */ WindowInsetsCompat R2(int i10, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4406t0.getLayoutParams();
        layoutParams.topMargin = i10 + insets.top;
        this.f4406t0.setLayoutParams(layoutParams);
        return windowInsetsCompat;
    }

    public final /* synthetic */ void S2(f4.v vVar) {
        if (vVar == null || vVar.isFinishing() || vVar.isDestroyed()) {
            return;
        }
        if (this.f4400n0 == null) {
            this.f4400n0 = z2(vVar, null, d0(q0.P));
        }
        this.f4400n0.show();
    }

    public void T2(String str) {
        eh.v0.w(g3(), str);
        if (this.f4393g0 == null) {
            this.f4395i0 = str;
        } else if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
            a3(str);
        } else {
            this.f4393g0.loadUrl(str);
        }
        if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
            this.f4410x0 = str;
        }
    }

    @Override // f4.q
    public void V0() {
        super.V0();
        qi.b bVar = this.f4393g0;
        if (bVar != null) {
            bVar.onPause();
        }
    }

    public void W2(String str) {
    }

    public void X2(String str) {
    }

    public void Y2(WebView webView, int i10) {
    }

    public final int Z2(cm.a aVar) {
        int iC;
        boolean z10 = aVar == cm.a.DARK;
        AndroidColorToken androidColorTokenB = this.f4409w0.b("Surface.Surface_0");
        if (androidColorTokenB != null) {
            iC = z10 ? androidColorTokenB.getDark() : androidColorTokenB.getLight();
        } else {
            iC = z10 ? l2.b.c(v(), j0.f4084g) : l2.b.c(v(), j0.f4092o);
        }
        return androidx.core.graphics.c.l(iC, 235);
    }

    @Override // f4.q
    public void a1() {
        super.a1();
        qi.b bVar = this.f4393g0;
        if (bVar != null) {
            bVar.onResume();
        }
    }

    public void b3(View view) {
        ImageView imageView = (ImageView) view.findViewById(m0.D);
        this.f4406t0 = imageView;
        if (!this.f4405s0 || imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f4406t0.setImageResource(new RobloxToolbar.c().a(nk.c.c().g()));
        this.f4406t0.setOnClickListener(new View.OnClickListener() { // from class: bh.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f4219a.Q2(view2);
            }
        });
        f3(nk.c.c().g());
        final int i10 = (int) (S().getDisplayMetrics().density * 10.0f);
        androidx.core.view.o0.A0(view, new androidx.core.view.y() { // from class: bh.q1
            @Override // androidx.core.view.y
            public final WindowInsetsCompat J(View view2, WindowInsetsCompat windowInsetsCompat) {
                return this.f4297a.R2(i10, view2, windowInsetsCompat);
            }
        });
    }

    @Override // f4.q
    public void c1() {
        super.c1();
    }

    @Override // f4.q
    public void d1() {
        super.d1();
    }

    @Override // n5.d.j
    public void e() {
        if (p() != null) {
            if (((com.roblox.client.a) p()).N1()) {
                this.f4394h0.setRefreshing(false);
            } else {
                this.f4393g0.reload();
            }
        }
    }

    public void f3(cm.a aVar) {
        if (this.f4406t0 == null) {
            return;
        }
        int iZ2 = Z2(aVar);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(iZ2);
        this.f4406t0.setBackground(gradientDrawable);
    }

    public eh.v0.b g3() {
        return eh.v0.b.WEB_FRAGMENT;
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(bl.a aVar) {
        if (this.f4393g0 != null) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void x2(final mj.p pVar) {
        if (bi.h.a().u1() && (pVar instanceof mj.j)) {
            mj.j jVar = (mj.j) pVar;
            String strB = jVar.b();
            if (!strB.isEmpty()) {
                NativeGLInterface.nativeMarketplacePurchaseFinished(pVar.d(), jVar.a().toString(), strB);
            }
        }
        final f4.v vVarP = p();
        if (vVarP != null) {
            vVarP.runOnUiThread(new Runnable() { // from class: bh.o1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4215a.M2(vVarP, pVar);
                }
            });
        }
    }
}
