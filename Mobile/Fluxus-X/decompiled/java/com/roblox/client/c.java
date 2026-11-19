package com.roblox.client;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import bh.a1;
import bh.e2;
import bh.f2;
import bh.j0;
import bh.m0;
import bh.n0;
import bh.q0;
import bh.t0;
import bh.x;
import bh.x0;
import bh.y;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.protocols.webview.DomainAllowListChecker;
import eh.v0;
import f4.v;
import mi.m;
import mj.o;
import mj.p;
import nj.a0;
import ok.e0;
import ok.q;
import ok.t;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class c extends x0 implements n5.d.j {
    public String O0;
    public ProgressDialog P0;
    public FrameLayout Q0;
    public boolean R0;
    public j S0;
    public i T0;
    public ValueCallback<Uri[]> U0;
    public fh.c Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public PermissionRequest f8856a1;
    public TextView H0 = null;
    public qi.b I0 = null;
    public n5.d J0 = null;
    public String K0 = null;
    public int L0 = 0;
    public int M0 = 0;
    public String N0 = null;
    public boolean V0 = false;
    public boolean W0 = false;
    public boolean X0 = true;
    public String Y0 = null;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final g.d<String> f8857b1 = h(new h.h(), new g.b() { // from class: bh.c1
        @Override // g.b
        public final void a(Object obj) {
            this.f4052a.n3((Boolean) obj);
        }
    });

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final o f8858c1 = new C0140c();

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final o f8859d1 = new d();

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final o f8860e1 = new e();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final o f8861f1 = new f();

    public class a implements qi.a.b {
        public a() {
        }

        @Override // qi.a.b
        public void a(String str) {
            if (c.this.T0 != null) {
                c.this.T0.a(str);
            }
        }
    }

    public class b extends WebChromeClient {

        public class a extends WebViewClient {
            public a() {
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                c.this.r3(str);
            }
        }

        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            if (!z11) {
                return super.onCreateWindow(webView, z10, z11, message);
            }
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new a());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            for (String str : permissionRequest.getResources()) {
                if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    int iA = l2.b.a(c.this.p(), y.h().k().k(bn.o.CAMERA));
                    if (bi.h.a().U5()) {
                        if (iA == 0) {
                            q.h("rbx.web", "Camera permission already granted");
                            permissionRequest.grant(new String[]{str});
                        } else {
                            q.h("rbx.web", "Camera permission not granted, requesting via ActivityResultLauncher");
                            c.this.f8856a1 = permissionRequest;
                            c.this.f8857b1.b("android.permission.CAMERA");
                        }
                    } else if (iA != 0) {
                        q.h("rbx.web", "No permission granted for camera");
                        permissionRequest.deny();
                    } else {
                        q.h("rbx.web", "Permission granted for camera");
                        permissionRequest.grant(new String[]{str});
                    }
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            c.this.x3(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            c.this.U0 = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            c.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.c$c, reason: collision with other inner class name */
    public class C0140c implements o {
        public C0140c() {
        }

        @Override // mj.o
        public void b() {
            c.this.F3();
        }

        @Override // mj.o
        public void c() {
            c.this.F3();
        }

        @Override // mj.o
        public void d() {
            c.this.g3();
        }

        @Override // mj.o
        public void e(p pVar) {
            c.this.Y2(pVar);
        }
    }

    public class d implements o {
        public d() {
        }

        @Override // mj.o
        public void b() {
            c.this.F3();
        }

        @Override // mj.o
        public void c() {
            c.this.F3();
        }

        @Override // mj.o
        public void d() {
            c.this.g3();
        }

        @Override // mj.o
        public void e(p pVar) {
            c.this.Y2(pVar);
        }
    }

    public class e implements o {
        public e() {
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
        public void e(p pVar) {
            q.h("rbx.amazon.purchaseflow", "onPurchaseFinishedListener: Result=" + pVar + ".");
            c.this.Y2(pVar);
        }
    }

    public class f implements o {
        public f() {
        }

        @Override // mj.o
        public void b() {
        }

        @Override // mj.o
        public void c() {
            c.this.F3();
        }

        @Override // mj.o
        public void d() {
        }

        @Override // mj.o
        public void e(p pVar) {
            c.this.Y2(pVar);
        }
    }

    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8869a;

        static {
            int[] iArr = new int[DomainAllowListChecker.a.values().length];
            f8869a = iArr;
            try {
                iArr[DomainAllowListChecker.a.FirstParty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8869a[DomainAllowListChecker.a.SecondParty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8869a[DomainAllowListChecker.a.ThirdParty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8869a[DomainAllowListChecker.a.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class h {
        public h() {
        }
    }

    public interface i {
        void a(String str);
    }

    public interface j {
        default void a() {
        }

        default void b(String str) {
        }

        default void c(String str, String str2) {
            ym.g.G().o(str2, "failed", "unhandled_by_host");
        }
    }

    public class k extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8871a = null;

        public class a implements m {
            public a() {
            }

            @Override // mi.m
            public void a(mi.j jVar) {
            }
        }

        public k() {
        }

        public final boolean d(final WebView webView, final String str, boolean z10, boolean z11) {
            String strC;
            q.h("rbx.web", "-> " + str);
            if (str == null) {
                q.e("rbx.web", "RWF.shouldOverrideUrlLoading() urlString is null!");
                v0.v(v0.c.URL_NULL);
                return false;
            }
            final v vVarP = c.this.p();
            if (vVarP == null || vVarP.isFinishing()) {
                q.h("rbx.web", "RWF.shouldOverrideUrlLoading() activity is null or finishing");
                v0.v(v0.c.ACTIVITY_FINISHING);
                return true;
            }
            if (c.this.u2()) {
                v0.v(v0.c.NETWORK_DISCONNECTED);
                return true;
            }
            if (c.this.f3(str)) {
                v0.v(v0.c.WEB_LINK);
                return true;
            }
            if (!DomainAllowListChecker.f9747a.enableDomainAllowListChecker() && c.this.s3(str)) {
                q.h("rbx.web", "Navigating social media Link...");
                v0.v(v0.c.SOCIAL_MEDIA);
                return true;
            }
            if (str.equalsIgnoreCase(a1.z0())) {
                if (c.this.S0 != null) {
                    c.this.S0.a();
                }
                v0.v(v0.c.PASSWORD_RESET);
                return true;
            }
            if (a1.m0(str) && !c.this.R0) {
                q.h("rbx.web", "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!");
                c cVar = c.this;
                cVar.z2(zi.a.c(cVar.v(), q0.f4261o, new Object[0]), 1);
                dj.b.f().i(vVarP, dj.b.d.LOGOUT_BY_401_ERROR_IN_WEB);
                a1.V(str);
                dj.h.e().d(new a());
                v0.v(v0.c.SESSION_EXPIRED);
                return true;
            }
            String queryParameter = null;
            c.this.I0.setOnTouchListener(null);
            c.this.E3(str, true);
            if (!str.contains("mobile-app-upgrades/buy?")) {
                String strA = f2.a(str, z10);
                if (strA == null && bi.h.a().M0() && f2.c(str, z11)) {
                    strA = ym.g.G().k(str, "android_webview");
                }
                final String str2 = strA;
                ym.g.k kVar = new ym.g.k() { // from class: bh.m1
                    @Override // ym.g.k
                    public final void a(boolean z12) {
                        this.f4178a.g(str2, str, vVarP, webView, z12);
                    }
                };
                if (!bi.h.a().M0() || str2 == null) {
                    ym.g.G().s(str, kVar);
                } else {
                    ym.g.G().p(str2, kVar);
                }
                return true;
            }
            v0.v(v0.c.PURCHASE);
            String strK = nk.c.c().k();
            Uri uri = Uri.parse(str);
            String queryParameter2 = uri.getQueryParameter("id");
            if (t.i()) {
                q.h("rbx.purchaseflow", "RobloxWebDialogFragment to start an in-app purchase. Username = " + strK);
                if (bi.h.a().L5()) {
                    qj.b.a(vVarP);
                    c.this.T(q0.F1);
                } else {
                    qj.a.a(vVarP);
                    c.this.T(q0.F1);
                }
            } else {
                if (bi.h.a().P()) {
                    String queryParameter3 = uri.getQueryParameter("ctx");
                    String queryParameter4 = uri.getQueryParameter(Payload.TYPE);
                    String strC2 = e0.c(uri, "paymentSessionId");
                    if (queryParameter3 != null && queryParameter4 != null && queryParameter3.equals("subscription")) {
                        q.h("rbx.purchaseflow", "RobloxWebDialogFragment to start an in-app subscription purchase.");
                        IAPPurchaseManager.nativePerformSubscriptionPurchase(queryParameter4, queryParameter2, "GooglePlayStore", strC2);
                        return true;
                    }
                }
                if (bi.h.a().L1()) {
                    q.h("rbx.purchaseflow", "PaymentsProtocol: tryStartInAppPurchase in RobloxWebDialogFragment.");
                    a0 a0VarR = a0.R(vVarP);
                    t0.d(c.this.c3(), "purchaseStart" + queryParameter2);
                    a0VarR.c(queryParameter2, uri, strK, vVarP, c.this.f8858c1, new Runnable() { // from class: bh.l1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4127a.e();
                        }
                    });
                } else if (bi.h.a().t3()) {
                    IAPPurchaseManager.nativeSetMetricsPurchaseType(IAPPurchaseManager.f9076l);
                    if (!bi.h.a().n3() || (strC = e0.c(uri, "paymentSessionId")) == null) {
                        strC = BuildConfig.FLAVOR;
                    }
                    nj.m mVarF0 = nj.m.F0(vVarP);
                    mVarF0.i(null);
                    mVarF0.k(true);
                    IAPPurchaseManager.nativeSetPaymentsProtocolIsInApp(true);
                    IAPPurchaseManager.nativeSetPaymentSessionId(strC);
                    IAPPurchaseManager.nativeSetProviderCurrencyCode(mVarF0.e(queryParameter2));
                    IAPPurchaseManager.nativeBeginPaymentsProtocolPurchase(queryParameter2);
                } else {
                    nj.m mVarF1 = nj.m.F0(vVarP);
                    if (mVarF1 == null) {
                        c.this.T(q0.F1);
                    } else {
                        t0.d(c.this.c3(), "purchaseStart" + queryParameter2);
                        try {
                            queryParameter = uri.getQueryParameter("recurring");
                        } catch (NullPointerException unused) {
                            q.h("rbx.purchaseflow", "NullPointerException thrown while parsing recurring parameter for purchase url");
                        } catch (UnsupportedOperationException unused2) {
                            q.h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing recurring parameter for purchase url");
                        }
                        if (!mVarF1.f(strK, queryParameter2, vVarP, c.this.f8858c1, Boolean.valueOf(queryParameter).booleanValue())) {
                            c.this.T(q0.A1);
                        }
                    }
                }
            }
            return true;
        }

        public final /* synthetic */ void e() {
            c.this.T(q0.A1);
        }

        public final /* synthetic */ void f(v vVar, String str, WebView webView) {
            if (vVar.isFinishing() || vVar.isDestroyed()) {
                return;
            }
            c.this.H0.setText(str);
            webView.loadUrl(str);
        }

        public final /* synthetic */ void g(String str, final String str2, final v vVar, final WebView webView, boolean z10) {
            if (!z10) {
                if (str != null) {
                    ym.g.G().o(str, "success", "handled_in_webview");
                }
                if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
                    c.this.y3(str2);
                    return;
                } else {
                    v0.v(v0.c.DEFAULT_LOAD);
                    vVar.runOnUiThread(new Runnable() { // from class: bh.n1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4208a.f(vVar, str2, webView);
                        }
                    });
                    return;
                }
            }
            v0.v(v0.c.DEEPLINK_INTERCEPT);
            ym.g gVarG = ym.g.G();
            if (str == null) {
                str = gVarG.k(str2, "android_webview");
            }
            boolean z11 = (str == null || str.isEmpty()) ? false : true;
            if (bi.h.a().Q1()) {
                if (!z11) {
                    c.this.S0.b(str2);
                    return;
                } else {
                    gVarG.A(str2, "android_webview", false);
                    c.this.S0.c(str2, str);
                    return;
                }
            }
            if (z11) {
                gVarG.A(str2, "android_webview", false);
                mw.c.d().j(c.this.new h());
                gVarG.l(str);
            } else {
                mw.c.d().j(c.this.new h());
                ym.g.G().h(str2, "android_webview", false);
                ym.g.G().m(str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            dl.h.j().n(a1.g());
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            c.this.v3(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            c.this.J0.setRefreshing(false);
            q.h("rbx.web", "onPageFinished. url=" + str);
            c.this.w3(str);
            if (bi.h.a().W1()) {
                dl.h.j().n(a1.g());
            }
            if (bi.h.a().p2() && !webView.hasFocus()) {
                webView.requestFocus();
            }
            if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
                this.f8871a = null;
            }
            if (di.m.b().a(str)) {
                c.this.I0.reload();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q.h("rbx.web", "-> " + str);
            c.this.t3(str);
            c.this.J0.setRefreshing(true);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                q.k("rbx.web", "onReceivedMainFrameError: suppressing impression. error=" + webResourceError.getErrorCode() + ": " + ((Object) webResourceError.getDescription()));
                c.this.u3();
                if (e2.j(RobloxApplication.f())) {
                    return;
                }
                v0.v(v0.c.NETWORK_DISCONNECTED);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
                return d(webView, webResourceRequest.getUrl().toString(), webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame());
            }
            String string = webResourceRequest.getUrl().toString();
            if (!string.equals(this.f8871a) || webResourceRequest.hasGesture()) {
                this.f8871a = string;
                return d(webView, string, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame());
            }
            q.h("rbx.web", "Skipping duplicate shouldOverrideUrlLoading call for URL: " + string);
            return true;
        }
    }

    public static /* synthetic */ void J2(DomainAllowListChecker.a aVar) {
        int i10 = g.f8869a[aVar.ordinal()];
        if (i10 == 1) {
            v0.v(v0.c.FIRST_PARTY_LOAD);
            return;
        }
        if (i10 == 2) {
            v0.v(v0.c.SECOND_PARTY_LOAD);
        } else if (i10 == 3 || i10 == 4) {
            v0.v(v0.c.THIRD_PARTY_EXTERNAL);
        }
    }

    @Override // f4.q
    public void A0(int i10, int i11, Intent intent) {
        if (i10 == 20123) {
            if (i11 == -1) {
                this.U0.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                q.h("rbx.web", "Result of file chooser invalid.");
                this.U0.onReceiveValue(null);
            }
        }
    }

    public void A3(boolean z10) {
        this.W0 = z10;
    }

    public void B3(i iVar) {
        this.T0 = iVar;
    }

    public void C3(j jVar) {
        this.S0 = jVar;
    }

    public void D3(boolean z10) {
        this.X0 = z10;
    }

    public final void E3(String str, boolean z10) {
        if (str.contains("sponsored")) {
            this.I0.getSettings().setBuiltInZoomControls(z10);
        } else {
            this.I0.getSettings().setBuiltInZoomControls(!z10);
        }
    }

    @Override // bh.x0, f4.o, f4.q
    public void F0(Bundle bundle) {
        super.F0(bundle);
        bl.b.a().n(this);
        Bundle bundleT = t();
        if (bundleT != null) {
            String string = bundleT.getString("DEFAULT_URL", null);
            q.b("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                if (string.contains("/giftcards?")) {
                    string = string.replace("/giftcards?", "/shopgiftcards?");
                }
                q.b("rbx.web", "onCreate: default-URL = " + string + ".");
                this.N0 = string;
                if (this.K0 == null) {
                    this.K0 = string;
                    if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
                        this.Y0 = string;
                    }
                }
            }
            this.O0 = bundleT.getString("WEB_VIEW_TAG", null);
            this.V0 = bundleT.getBoolean("USE_APP_HYBRID");
        }
        this.Z0 = new fh.c(v());
    }

    public final void F3() {
        final v vVarP = p();
        if (vVarP != null) {
            vVarP.runOnUiThread(new Runnable() { // from class: bh.k1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4100a.p3(vVarP);
                }
            });
        }
    }

    public final void G3(p pVar) {
        v vVarP = p();
        if (vVarP == null) {
            return;
        }
        CharSequence charSequenceC = pVar.c(vVarP);
        if (pVar.f()) {
            v2(charSequenceC);
        } else {
            V(charSequenceC.toString());
        }
    }

    public void H3(bm.a aVar) {
        Boolean bool = aVar.f4457c;
        if (bool != null) {
            D3(bool.booleanValue());
        }
        Boolean bool2 = aVar.f4459e;
        if (bool2 != null) {
            A3(bool2.booleanValue());
        }
    }

    public v0.b I3() {
        return v0.b.WEB_DIALOG_FRAGMENT;
    }

    @Override // f4.q
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(n0.f4190i, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(m0.f4151l0);
        this.H0 = (TextView) viewInflate.findViewById(m0.f4175x0);
        k kVar = new k();
        this.I0 = a3();
        if (bi.h.a().q2()) {
            this.I0.setCommandListener(new x());
        }
        viewGroup2.addView(this.I0, new ViewGroup.LayoutParams(-1, -1));
        this.I0.setTag(this.O0);
        this.I0.setWebViewClient(kVar);
        this.I0.getSettings().setSupportMultipleWindows(true);
        this.I0.setWebChromeClient(new b());
        try {
            this.I0.getSettings().setJavaScriptEnabled(true);
            this.I0.getSettings().setDomStorageEnabled(true);
            this.I0.getSettings().setUserAgentString(a1.a1());
            this.I0.getSettings().setCacheMode(-1);
            this.I0.setHorizontalScrollBarEnabled(false);
            this.I0.setVerticalScrollBarEnabled(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (wh.b.a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (this.K0 != null) {
            if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
                z3(this.K0, true);
            } else {
                v0.v(v0.c.DEFAULT_LOAD);
                this.I0.loadUrl(this.K0);
            }
            this.K0 = null;
        }
        n5.d dVar = (n5.d) viewInflate.findViewById(m0.f4151l0);
        this.J0 = dVar;
        dVar.setOnRefreshListener(this);
        n5.d dVar2 = this.J0;
        int i10 = j0.b;
        int i11 = j0.f4092o;
        dVar2.setColorSchemeResources(i10, i10, i11, i11);
        this.Q0 = (FrameLayout) viewInflate.findViewById(m0.f4153m0);
        Bundle bundleT = t();
        if (bundleT != null) {
            this.L0 = bundleT.getInt("dialogHeight", 0);
            this.M0 = bundleT.getInt("dialogWidth", 0);
            this.J0.setEnabled(false);
            this.R0 = bundleT.getBoolean("USING_LOGIN_WEB_URL", false);
            this.X0 = bundleT.getBoolean("VISIBLE", true);
            this.W0 = bundleT.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        u2();
        this.I0.h();
        return viewInflate;
    }

    @Override // f4.q
    public void K0() {
        bl.b.a().p(this);
        if (bi.h.a().U5() && this.f8856a1 != null) {
            q.h("rbx.web", "onDestroy: Cleaning up pending permission request");
            this.f8856a1.deny();
            this.f8856a1 = null;
        }
        super.K0();
    }

    @Override // f4.o, f4.q
    public void M0() {
        super.M0();
        this.I0.i();
    }

    @Override // f4.q
    public void P0(boolean z10) {
        super.P0(z10);
        if (z10 || !di.m.b().a(this.I0.getUrl())) {
            return;
        }
        this.I0.reload();
    }

    @Override // f4.q
    public void V0() {
        super.V0();
        qi.b bVar = this.I0;
        if (bVar != null) {
            bVar.onPause();
        }
    }

    public final void X2(final String str) {
        final v vVarP = p();
        if (vVarP == null || vVarP.isFinishing() || vVarP.isDestroyed()) {
            return;
        }
        vVarP.runOnUiThread(new Runnable() { // from class: bh.e1
            @Override // java.lang.Runnable
            public final void run() {
                this.f4062a.j3(vVarP, str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Y2(final p pVar) {
        if (bi.h.a().u1() && (pVar instanceof mj.j)) {
            mj.j jVar = (mj.j) pVar;
            String strB = jVar.b();
            if (!strB.isEmpty()) {
                NativeGLInterface.nativeMarketplacePurchaseFinished(pVar.d(), jVar.a().toString(), strB);
            }
        }
        final v vVarP = p();
        if (vVarP != null) {
            vVarP.runOnUiThread(new Runnable() { // from class: bh.f1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4066a.k3(vVarP, pVar);
                }
            });
        }
    }

    public final ProgressDialog Z2(Context context, String str, String str2) {
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
    public void a1() {
        Window window;
        super.a1();
        if (h2() != null && this.L0 != 0 && (window = h2().getWindow()) != null) {
            int i10 = this.M0;
            if (i10 == 0) {
                window.setLayout(-2, this.L0);
            } else {
                window.setLayout(i10, this.L0);
            }
        }
        qi.b bVar = this.I0;
        if (bVar != null) {
            bVar.onResume();
        }
    }

    public qi.b a3() {
        qi.b aVar = this.V0 ? new qi.a(v(), new a()) : new qi.b(v());
        if (bi.h.a().W1()) {
            dl.e.A(a1.O());
        }
        return aVar;
    }

    public final void b3(final String str, boolean z10) {
        final v vVarP = p();
        if (vVarP == null || vVarP.isFinishing() || vVarP.isDestroyed()) {
            return;
        }
        vVarP.runOnUiThread(new Runnable() { // from class: bh.d1
            @Override // java.lang.Runnable
            public final void run() {
                this.f4058a.l3(vVarP, str);
            }
        });
    }

    @Override // bh.x0, f4.o, f4.q
    public void c1() {
        super.c1();
    }

    public String c3() {
        return "undefinedWebContext";
    }

    @Override // bh.x0, f4.o, f4.q
    public void d1() {
        super.d1();
    }

    public String d3() {
        qi.b bVar = this.I0;
        return bVar == null ? this.K0 : bVar.getUrl();
    }

    @Override // n5.d.j
    public void e() {
        if (p() != null) {
            if (((com.roblox.client.a) p()).N1()) {
                this.J0.setRefreshing(false);
            } else {
                this.I0.reload();
            }
        }
    }

    public boolean e3() {
        qi.b bVar = this.I0;
        if (bVar == null || !bVar.canGoBack()) {
            return false;
        }
        E3(this.I0.getUrl(), false);
        this.I0.goBack();
        return true;
    }

    public final boolean f3(String str) {
        Intent intent;
        if (str.startsWith("mailto:")) {
            intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        } else {
            intent = str.startsWith("tel:") ? new Intent("android.intent.action.DIAL", Uri.parse(str)) : null;
        }
        if (intent == null) {
            return false;
        }
        if (t.a(v(), intent)) {
            X1(intent);
            return true;
        }
        y2(q0.U, 1);
        return true;
    }

    @Override // bh.x0, lk.e.b
    public void g0(cm.a aVar) {
        super.g0(aVar);
        this.I0.setBackgroundColor(this.Z0.a(nk.c.c().g()));
    }

    public final void g3() {
        final v vVarP = p();
        if (vVarP != null) {
            vVarP.runOnUiThread(new Runnable() { // from class: bh.g1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4072a.m3(vVarP);
                }
            });
        }
    }

    public boolean h3() {
        return this.W0;
    }

    public final /* synthetic */ void i3(v vVar, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(this.I0.getUrl())) {
            vVar.onBackPressed();
        }
    }

    public final /* synthetic */ void j3(final v vVar, final String str) {
        new androidx.appcompat.app.a.C0021a(vVar).d(false).p(q0.f4274s0).g(q0.f4271r0).i(q0.f4270r, null).m(q0.f4273s, new DialogInterface.OnClickListener() { // from class: bh.i1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                f4.v vVar2 = vVar;
                String str2 = str;
                new ym.a("rbx.web").e(vVar2, str2, str2);
            }
        }).k(new DialogInterface.OnDismissListener() { // from class: bh.j1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f4093a.i3(vVar, dialogInterface);
            }
        }).r();
    }

    public final /* synthetic */ void k3(v vVar, p pVar) {
        if (vVar == null || vVar.isFinishing() || vVar.isDestroyed()) {
            return;
        }
        g3();
        G3(pVar);
    }

    public final /* synthetic */ void l3(v vVar, String str) {
        if (vVar.isFinishing() || vVar.isDestroyed()) {
            return;
        }
        this.H0.setText(str);
        this.I0.loadUrl(str);
    }

    public final /* synthetic */ void m3(v vVar) {
        ProgressDialog progressDialog;
        if (vVar == null || vVar.isFinishing() || vVar.isDestroyed() || (progressDialog = this.P0) == null || !progressDialog.isShowing()) {
            return;
        }
        this.P0.dismiss();
    }

    public final /* synthetic */ void n3(Boolean bool) {
        q.h("rbx.web", "Camera permission result: " + bool);
        if (this.f8856a1 == null) {
            q.k("rbx.web", "Camera permission callback received but no pending request");
            return;
        }
        if (bool.booleanValue()) {
            q.h("rbx.web", "Camera permission granted by user, granting to webview");
            this.f8856a1.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
        } else {
            q.h("rbx.web", "Camera permission denied by user, denying to webview");
            this.f8856a1.deny();
        }
        this.f8856a1 = null;
    }

    public final /* synthetic */ void o3(boolean z10, String str, DomainAllowListChecker.a aVar) {
        int i10 = g.f8869a[aVar.ordinal()];
        if (i10 == 1) {
            if (z10) {
                v0.v(v0.c.FIRST_PARTY_LOAD);
            }
            b3(str, false);
        } else if (i10 == 2) {
            if (z10) {
                v0.v(v0.c.SECOND_PARTY_LOAD);
            }
            b3(str, true);
        } else if (i10 == 3 || i10 == 4) {
            if (z10) {
                v0.v(v0.c.THIRD_PARTY_EXTERNAL);
            }
            X2(str);
        }
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(bl.a aVar) {
        if (this.I0 != null) {
            throw null;
        }
    }

    public final /* synthetic */ void p3(v vVar) {
        if (vVar == null || vVar.isFinishing() || vVar.isDestroyed()) {
            return;
        }
        if (this.P0 == null) {
            this.P0 = Z2(vVar, null, d0(q0.P));
        }
        this.P0.show();
    }

    public void q3(String str) {
        v0.w(I3(), str);
        if (this.I0 == null) {
            this.K0 = str;
        } else if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
            z3(str, true);
        } else {
            v0.v(v0.c.DEFAULT_LOAD);
            this.I0.loadUrl(str);
        }
        if (DomainAllowListChecker.f9747a.enableDomainAllowListChecker()) {
            this.Y0 = str;
        }
    }

    public final void r3(String str) {
        if (str == null) {
            return;
        }
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f9747a;
        if (domainAllowListChecker.isKnownTrustedDomain(str, this.Y0)) {
            v0.v(v0.c.FIRST_PARTY_LOAD);
        } else {
            domainAllowListChecker.checkDomainAllowList(str, this.Y0, new DomainAllowListChecker.Callback() { // from class: bh.h1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.a aVar) {
                    com.roblox.client.c.J2(aVar);
                }
            });
        }
    }

    public final boolean s3(String str) {
        hk.b bVar = new hk.b("rbx.web");
        if (!bVar.b(str)) {
            return false;
        }
        bVar.a(p(), str, str);
        return true;
    }

    public void t3(String str) {
    }

    public void u3() {
    }

    public void v3(String str) {
    }

    public void w3(String str) {
    }

    public void x3(WebView webView, int i10) {
    }

    public void y3(String str) {
        z3(str, false);
    }

    public final void z3(final String str, final boolean z10) {
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f9747a;
        if (!domainAllowListChecker.isKnownTrustedDomain(str, this.Y0)) {
            domainAllowListChecker.checkDomainAllowList(str, this.Y0, new DomainAllowListChecker.Callback() { // from class: bh.b1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.a aVar) {
                    this.f4044a.o3(z10, str, aVar);
                }
            });
            return;
        }
        if (z10) {
            v0.v(v0.c.FIRST_PARTY_LOAD);
        }
        b3(str, false);
    }
}
