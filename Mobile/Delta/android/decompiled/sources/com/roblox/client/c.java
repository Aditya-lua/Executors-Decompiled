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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.hybrid.RBHybridWebView;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.protocols.webview.DomainAllowListChecker;
import e4.q;
import ei.m;
import fj.a0;
import gk.d0;
import gk.p;
import gk.s;
import om.n;
import org.greenrobot.eventbus.ThreadMode;
import sg.a1;
import sg.e2;
import sg.j0;
import sg.m0;
import sg.n0;
import sg.q0;
import sg.t0;
import sg.x;
import sg.x0;
import sg.y;
import vg.c0;

/* JADX INFO: loaded from: classes2.dex */
public class c extends x0 implements SwipeRefreshLayout.j {
    public String O0;
    public ProgressDialog P0;
    public FrameLayout Q0;
    public boolean R0;
    public j S0;
    public i T0;
    public ValueCallback<Uri[]> U0;
    public wg.d Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public PermissionRequest f8960a1;
    public TextView H0 = null;
    public RBHybridWebView I0 = null;
    public SwipeRefreshLayout J0 = null;
    public String K0 = null;
    public int L0 = 0;
    public int M0 = 0;
    public String N0 = null;
    public boolean V0 = false;
    public boolean W0 = false;
    public boolean X0 = true;
    public String Y0 = null;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final g.c<String> f8961b1 = h(new h.h(), new g.a() { // from class: sg.c1
        @Override // g.a
        public final void a(Object obj) {
            this.f30747a.n3((Boolean) obj);
        }
    });

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final ej.j f8962c1 = new C0134c();

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final ej.j f8963d1 = new d();

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final ej.j f8964e1 = new e();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final ej.j f8965f1 = new f();

    public class a implements ii.a.b {
        public a() {
        }

        @Override // ii.a.b
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
                    int iA = l2.b.a(c.this.p(), y.h().k().s(n.CAMERA));
                    if (th.h.a().M5()) {
                        if (iA == 0) {
                            p.h("rbx.web", "Camera permission already granted");
                            permissionRequest.grant(new String[]{str});
                        } else {
                            p.h("rbx.web", "Camera permission not granted, requesting via ActivityResultLauncher");
                            c.this.f8960a1 = permissionRequest;
                            c.this.f8961b1.b("android.permission.CAMERA");
                        }
                    } else if (iA != 0) {
                        p.h("rbx.web", "No permission granted for camera");
                        permissionRequest.deny();
                    } else {
                        p.h("rbx.web", "Permission granted for camera");
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
    public class C0134c implements ej.j {
        public C0134c() {
        }

        @Override // ej.j
        public void b() {
            c.this.F3();
        }

        @Override // ej.j
        public void c() {
            c.this.F3();
        }

        @Override // ej.j
        public void d() {
            c.this.g3();
        }

        @Override // ej.j
        public void e(ej.k kVar) {
            c.this.Y2(kVar);
        }
    }

    public class d implements ej.j {
        public d() {
        }

        @Override // ej.j
        public void b() {
            c.this.F3();
        }

        @Override // ej.j
        public void c() {
            c.this.F3();
        }

        @Override // ej.j
        public void d() {
            c.this.g3();
        }

        @Override // ej.j
        public void e(ej.k kVar) {
            c.this.Y2(kVar);
        }
    }

    public class e implements ej.j {
        public e() {
        }

        @Override // ej.j
        public void b() {
        }

        @Override // ej.j
        public void c() {
        }

        @Override // ej.j
        public void d() {
        }

        @Override // ej.j
        public void e(ej.k kVar) {
            p.h("rbx.amazon.purchaseflow", "onPurchaseFinishedListener: Result=" + kVar + ".");
            c.this.Y2(kVar);
        }
    }

    public class f implements ej.j {
        public f() {
        }

        @Override // ej.j
        public void b() {
        }

        @Override // ej.j
        public void c() {
            c.this.F3();
        }

        @Override // ej.j
        public void d() {
        }

        @Override // ej.j
        public void e(ej.k kVar) {
            c.this.Y2(kVar);
        }
    }

    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8973a;

        static {
            int[] iArr = new int[DomainAllowListChecker.a.values().length];
            f8973a = iArr;
            try {
                iArr[DomainAllowListChecker.a.FirstParty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8973a[DomainAllowListChecker.a.SecondParty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8973a[DomainAllowListChecker.a.ThirdParty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8973a[DomainAllowListChecker.a.Unknown.ordinal()] = 4;
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
    }

    public class k extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8975a = null;

        public class a implements m {
            public a() {
            }

            @Override // ei.m
            public void a(ei.j jVar) {
            }
        }

        public k() {
        }

        public final boolean d(final WebView webView, final String str) {
            String strC;
            p.h("rbx.web", "-> " + str);
            if (str == null) {
                p.e("rbx.web", "RWF.shouldOverrideUrlLoading() urlString is null!");
                c0.v(c0.c.URL_NULL);
                return false;
            }
            final q qVarP = c.this.p();
            if (qVarP == null || qVarP.isFinishing()) {
                p.h("rbx.web", "RWF.shouldOverrideUrlLoading() activity is null or finishing");
                c0.v(c0.c.ACTIVITY_FINISHING);
                return true;
            }
            if (c.this.u2()) {
                c0.v(c0.c.NETWORK_DISCONNECTED);
                return true;
            }
            if (c.this.f3(str)) {
                c0.v(c0.c.WEB_LINK);
                return true;
            }
            if (!DomainAllowListChecker.f9727a.enableDomainAllowListChecker() && c.this.s3(str)) {
                p.h("rbx.web", "Navigating social media Link...");
                c0.v(c0.c.SOCIAL_MEDIA);
                return true;
            }
            if (str.equalsIgnoreCase(a1.z0())) {
                if (c.this.S0 != null) {
                    c.this.S0.a();
                }
                c0.v(c0.c.PASSWORD_RESET);
                return true;
            }
            if (a1.m0(str) && !c.this.R0) {
                p.h("rbx.web", "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!");
                c cVar = c.this;
                cVar.z2(ri.a.c(cVar.x(), q0.f30954o, new Object[0]), 1);
                vi.b.f().i(qVarP, vi.b.d.LOGOUT_BY_401_ERROR_IN_WEB);
                a1.V(str);
                vi.h.e().d(new a());
                c0.v(c0.c.SESSION_EXPIRED);
                return true;
            }
            String queryParameter = null;
            c.this.I0.setOnTouchListener(null);
            c.this.E3(str, true);
            if (!str.contains("mobile-app-upgrades/buy?")) {
                km.f.v().i(str, new km.f.k() { // from class: sg.m1
                    @Override // km.f.k
                    public final void a(boolean z10) {
                        this.f30872a.g(str, qVarP, webView, z10);
                    }
                });
                return true;
            }
            c0.v(c0.c.PURCHASE);
            String strK = fk.c.c().k();
            Uri uri = Uri.parse(str);
            String queryParameter2 = uri.getQueryParameter("id");
            if (s.i()) {
                p.h("rbx.purchaseflow", "RobloxWebDialogFragment to start an in-app purchase. Username = " + strK);
                if (th.h.a().C5()) {
                    ij.b.a(qVarP);
                    c.this.U(q0.f30977v1);
                } else {
                    ij.a.a(qVarP);
                    c.this.U(q0.f30977v1);
                }
            } else {
                if (th.h.a().L()) {
                    String queryParameter3 = uri.getQueryParameter("ctx");
                    String queryParameter4 = uri.getQueryParameter(Payload.TYPE);
                    String strC2 = d0.c(uri, "paymentSessionId");
                    if (queryParameter3 != null && queryParameter4 != null && queryParameter3.equals("subscription")) {
                        p.h("rbx.purchaseflow", "RobloxWebDialogFragment to start an in-app subscription purchase.");
                        IAPPurchaseManager.nativePerformSubscriptionPurchase(queryParameter4, queryParameter2, BuildConfig.STORE_TYPE, strC2);
                        return true;
                    }
                }
                if (th.h.a().B1()) {
                    p.h("rbx.purchaseflow", "PaymentsProtocol: tryStartInAppPurchase in RobloxWebDialogFragment.");
                    a0 a0VarR = a0.R(qVarP);
                    t0.d(c.this.c3(), "purchaseStart" + queryParameter2);
                    a0VarR.e(queryParameter2, uri, strK, qVarP, c.this.f8962c1, new Runnable() { // from class: sg.l1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f30823a.e();
                        }
                    });
                } else if (th.h.a().g3()) {
                    IAPPurchaseManager.nativeSetMetricsPurchaseType(IAPPurchaseManager.f9186l);
                    if (!th.h.a().b3() || (strC = d0.c(uri, "paymentSessionId")) == null) {
                        strC = "";
                    }
                    fj.m mVarF0 = fj.m.F0(qVarP);
                    mVarF0.j(null);
                    mVarF0.k(true);
                    IAPPurchaseManager.nativeSetPaymentsProtocolIsInApp(true);
                    IAPPurchaseManager.nativeSetPaymentSessionId(strC);
                    IAPPurchaseManager.nativeSetProviderCurrencyCode(mVarF0.c(queryParameter2));
                    IAPPurchaseManager.nativeBeginPaymentsProtocolPurchase(queryParameter2);
                } else {
                    fj.m mVarF1 = fj.m.F0(qVarP);
                    if (mVarF1 == null) {
                        c.this.U(q0.f30977v1);
                    } else {
                        t0.d(c.this.c3(), "purchaseStart" + queryParameter2);
                        try {
                            queryParameter = uri.getQueryParameter("recurring");
                        } catch (NullPointerException unused) {
                            p.h("rbx.purchaseflow", "NullPointerException thrown while parsing recurring parameter for purchase url");
                        } catch (UnsupportedOperationException unused2) {
                            p.h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing recurring parameter for purchase url");
                        }
                        if (!mVarF1.i(strK, queryParameter2, qVarP, c.this.f8962c1, Boolean.valueOf(queryParameter).booleanValue())) {
                            c.this.U(q0.f30962q1);
                        }
                    }
                }
            }
            return true;
        }

        public final /* synthetic */ void e() {
            c.this.U(q0.f30962q1);
        }

        public final /* synthetic */ void f(q qVar, String str, WebView webView) {
            if (qVar.isFinishing() || qVar.isDestroyed()) {
                return;
            }
            c.this.H0.setText(str);
            webView.loadUrl(str);
        }

        public final /* synthetic */ void g(final String str, final q qVar, final WebView webView, boolean z10) {
            if (!z10) {
                if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
                    c.this.y3(str);
                    return;
                } else {
                    c0.v(c0.c.DEFAULT_LOAD);
                    qVar.runOnUiThread(new Runnable() { // from class: sg.n1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f30901a.f(qVar, str, webView);
                        }
                    });
                    return;
                }
            }
            c0.v(c0.c.DEEPLINK_INTERCEPT);
            if (th.h.a().G1()) {
                c.this.S0.b(str);
                return;
            }
            fv.c.d().j(c.this.new h());
            km.f.v().q(str, "android_webview", false);
            km.f.v().e(str);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            wk.h.h().k(a1.g());
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            c.this.v3(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            c.this.J0.setRefreshing(false);
            p.h("rbx.web", "onPageFinished. url=" + str);
            c.this.w3(str);
            if (th.h.a().d2() && !webView.hasFocus()) {
                webView.requestFocus();
            }
            if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
                this.f8975a = null;
            }
            if (vh.m.b().a(str)) {
                c.this.I0.reload();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            p.h("rbx.web", "-> " + str);
            c.this.t3(str);
            c.this.J0.setRefreshing(true);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                p.k("rbx.web", "onReceivedMainFrameError: suppressing impression. error=" + webResourceError.getErrorCode() + ": " + ((Object) webResourceError.getDescription()));
                c.this.u3();
                if (e2.j(RobloxApplication.f())) {
                    return;
                }
                c0.v(c0.c.NETWORK_DISCONNECTED);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
                return d(webView, webResourceRequest.getUrl().toString());
            }
            String string = webResourceRequest.getUrl().toString();
            if (!string.equals(this.f8975a) || webResourceRequest.hasGesture()) {
                this.f8975a = string;
                return d(webView, string);
            }
            p.h("rbx.web", "Skipping duplicate shouldOverrideUrlLoading call for URL: " + string);
            return true;
        }
    }

    public static /* synthetic */ void J2(DomainAllowListChecker.a aVar) {
        int i10 = g.f8973a[aVar.ordinal()];
        if (i10 == 1) {
            c0.v(c0.c.FIRST_PARTY_LOAD);
            return;
        }
        if (i10 == 2) {
            c0.v(c0.c.SECOND_PARTY_LOAD);
        } else if (i10 == 3 || i10 == 4) {
            c0.v(c0.c.THIRD_PARTY_EXTERNAL);
        }
    }

    @Override // androidx.fragment.app.c
    public void A0(int i10, int i11, Intent intent) {
        if (i10 == 20123) {
            if (i11 == -1) {
                this.U0.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                p.h("rbx.web", "Result of file chooser invalid.");
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

    @Override // sg.x0, e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        uk.b.a().n(this);
        Bundle bundleT = t();
        if (bundleT != null) {
            String string = bundleT.getString("DEFAULT_URL", null);
            p.b("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                if (string.contains("/giftcards?")) {
                    string = string.replace("/giftcards?", "/shopgiftcards?");
                }
                p.b("rbx.web", "onCreate: default-URL = " + string + ".");
                this.N0 = string;
                if (this.K0 == null) {
                    this.K0 = string;
                    if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
                        this.Y0 = string;
                    }
                }
            }
            this.O0 = bundleT.getString("WEB_VIEW_TAG", null);
            this.V0 = bundleT.getBoolean("USE_APP_HYBRID");
        }
        this.Z0 = new wg.d(x());
    }

    public final void F3() {
        final q qVarP = p();
        if (qVarP != null) {
            qVarP.runOnUiThread(new Runnable() { // from class: sg.k1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30796a.p3(qVarP);
                }
            });
        }
    }

    public final void G3(ej.k kVar) {
        q qVarP = p();
        if (qVarP == null) {
            return;
        }
        CharSequence charSequenceC = kVar.c(qVarP);
        if (kVar.f()) {
            v2(charSequenceC);
        } else {
            W(charSequenceC.toString());
        }
    }

    public void H3(nl.a aVar) {
        Boolean bool = aVar.f26299c;
        if (bool != null) {
            D3(bool.booleanValue());
        }
        Boolean bool2 = aVar.f26301e;
        if (bool2 != null) {
            A3(bool2.booleanValue());
        }
    }

    public c0.b I3() {
        return c0.b.WEB_DIALOG_FRAGMENT;
    }

    @Override // androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(n0.f30883i, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(m0.f30841i0);
        this.H0 = (TextView) viewInflate.findViewById(m0.f30867v0);
        k kVar = new k();
        this.I0 = a3();
        if (th.h.a().e2()) {
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
            this.I0.getSettings().setUserAgentString(a1.Z0());
            this.I0.getSettings().setCacheMode(-1);
            this.I0.setHorizontalScrollBarEnabled(false);
            this.I0.setVerticalScrollBarEnabled(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (nh.b.a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (this.K0 != null) {
            if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
                z3(this.K0, true);
            } else {
                c0.v(c0.c.DEFAULT_LOAD);
                this.I0.loadUrl(this.K0);
            }
            this.K0 = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(m0.f30841i0);
        this.J0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        SwipeRefreshLayout swipeRefreshLayout2 = this.J0;
        int i10 = j0.b;
        int i11 = j0.f30788q;
        swipeRefreshLayout2.setColorSchemeResources(i10, i10, i11, i11);
        this.Q0 = (FrameLayout) viewInflate.findViewById(m0.f30843j0);
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

    @Override // androidx.fragment.app.c
    public void K0() {
        uk.b.a().p(this);
        if (th.h.a().M5() && this.f8960a1 != null) {
            p.h("rbx.web", "onDestroy: Cleaning up pending permission request");
            this.f8960a1.deny();
            this.f8960a1 = null;
        }
        super.K0();
    }

    @Override // e4.k, androidx.fragment.app.c
    public void M0() {
        super.M0();
        this.I0.i();
    }

    @Override // androidx.fragment.app.c
    public void P0(boolean z10) {
        super.P0(z10);
        if (z10 || !vh.m.b().a(this.I0.getUrl())) {
            return;
        }
        this.I0.reload();
    }

    @Override // androidx.fragment.app.c
    public void V0() {
        super.V0();
        RBHybridWebView rBHybridWebView = this.I0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onPause();
        }
    }

    public final void X2(final String str) {
        final q qVarP = p();
        if (qVarP == null || qVarP.isFinishing() || qVarP.isDestroyed()) {
            return;
        }
        qVarP.runOnUiThread(new Runnable() { // from class: sg.e1
            @Override // java.lang.Runnable
            public final void run() {
                this.f30757a.j3(qVarP, str);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Y2(final ej.k kVar) {
        if (th.h.a().l1() && (kVar instanceof ej.f)) {
            ej.f fVar = (ej.f) kVar;
            String strB = fVar.b();
            if (!strB.isEmpty()) {
                NativeGLInterface.nativeMarketplacePurchaseFinished(kVar.d(), fVar.a().toString(), strB);
            }
        }
        final q qVarP = p();
        if (qVarP != null) {
            qVarP.runOnUiThread(new Runnable() { // from class: sg.f1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30761a.k3(qVarP, kVar);
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

    @Override // androidx.fragment.app.c
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
        RBHybridWebView rBHybridWebView = this.I0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onResume();
        }
    }

    public RBHybridWebView a3() {
        RBHybridWebView rBHybridWebView;
        if (this.V0) {
            rBHybridWebView = th.h.a().X0() ? new ii.a(x(), new a()) : new ii.a(x());
        } else {
            rBHybridWebView = new RBHybridWebView(x());
        }
        if (th.h.a().M1()) {
            wk.e.r(a1.O());
        }
        return rBHybridWebView;
    }

    public final void b3(final String str, boolean z10) {
        final q qVarP = p();
        if (qVarP == null || qVarP.isFinishing() || qVarP.isDestroyed()) {
            return;
        }
        qVarP.runOnUiThread(new Runnable() { // from class: sg.d1
            @Override // java.lang.Runnable
            public final void run() {
                this.f30753a.l3(qVarP, str);
            }
        });
    }

    @Override // sg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
    }

    public String c3() {
        return "undefinedWebContext";
    }

    @Override // sg.x0, e4.k, androidx.fragment.app.c
    public void d1() {
        super.d1();
    }

    public String d3() {
        RBHybridWebView rBHybridWebView = this.I0;
        return rBHybridWebView == null ? this.K0 : rBHybridWebView.getUrl();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
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
        RBHybridWebView rBHybridWebView = this.I0;
        if (rBHybridWebView == null || !rBHybridWebView.canGoBack()) {
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
        if (s.a(x(), intent)) {
            X1(intent);
            return true;
        }
        y2(q0.U, 1);
        return true;
    }

    public final void g3() {
        final q qVarP = p();
        if (qVarP != null) {
            qVarP.runOnUiThread(new Runnable() { // from class: sg.g1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30766a.m3(qVarP);
                }
            });
        }
    }

    public boolean h3() {
        return this.W0;
    }

    public final /* synthetic */ void i3(q qVar, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(this.I0.getUrl())) {
            qVar.onBackPressed();
        }
    }

    public final /* synthetic */ void j3(final q qVar, final String str) {
        new androidx.appcompat.app.a.C0013a(qVar).d(false).p(q0.f30958p0).g(q0.f30955o0).i(q0.f30963r, null).m(q0.f30966s, new DialogInterface.OnClickListener() { // from class: sg.i1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                e4.q qVar2 = qVar;
                String str2 = str;
                new km.a("rbx.web").e(qVar2, str2, str2);
            }
        }).k(new DialogInterface.OnDismissListener() { // from class: sg.j1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f30789a.i3(qVar, dialogInterface);
            }
        }).r();
    }

    public final /* synthetic */ void k3(q qVar, ej.k kVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        g3();
        G3(kVar);
    }

    public final /* synthetic */ void l3(q qVar, String str) {
        if (qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        this.H0.setText(str);
        this.I0.loadUrl(str);
    }

    public final /* synthetic */ void m3(q qVar) {
        ProgressDialog progressDialog;
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed() || (progressDialog = this.P0) == null || !progressDialog.isShowing()) {
            return;
        }
        this.P0.dismiss();
    }

    public final /* synthetic */ void n3(Boolean bool) {
        p.h("rbx.web", "Camera permission result: " + bool);
        if (this.f8960a1 == null) {
            p.k("rbx.web", "Camera permission callback received but no pending request");
            return;
        }
        if (bool.booleanValue()) {
            p.h("rbx.web", "Camera permission granted by user, granting to webview");
            this.f8960a1.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
        } else {
            p.h("rbx.web", "Camera permission denied by user, denying to webview");
            this.f8960a1.deny();
        }
        this.f8960a1 = null;
    }

    public final /* synthetic */ void o3(boolean z10, String str, DomainAllowListChecker.a aVar) {
        int i10 = g.f8973a[aVar.ordinal()];
        if (i10 == 1) {
            if (z10) {
                c0.v(c0.c.FIRST_PARTY_LOAD);
            }
            b3(str, false);
        } else if (i10 == 2) {
            if (z10) {
                c0.v(c0.c.SECOND_PARTY_LOAD);
            }
            b3(str, true);
        } else if (i10 == 3 || i10 == 4) {
            if (z10) {
                c0.v(c0.c.THIRD_PARTY_EXTERNAL);
            }
            X2(str);
        }
    }

    @fv.j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(uk.a aVar) {
        if (this.I0 != null) {
            throw null;
        }
    }

    public final /* synthetic */ void p3(q qVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        if (this.P0 == null) {
            this.P0 = Z2(qVar, null, e0(q0.P));
        }
        this.P0.show();
    }

    public void q3(String str) {
        c0.w(I3(), str);
        if (this.I0 == null) {
            this.K0 = str;
        } else if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
            z3(str, true);
        } else {
            c0.v(c0.c.DEFAULT_LOAD);
            this.I0.loadUrl(str);
        }
        if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
            this.Y0 = str;
        }
    }

    public final void r3(String str) {
        if (str == null) {
            return;
        }
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f9727a;
        if (domainAllowListChecker.isKnownTrustedDomain(str, this.Y0)) {
            c0.v(c0.c.FIRST_PARTY_LOAD);
        } else {
            domainAllowListChecker.checkDomainAllowList(str, this.Y0, new DomainAllowListChecker.Callback() { // from class: sg.h1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.a aVar) {
                    com.roblox.client.c.J2(aVar);
                }
            });
        }
    }

    public final boolean s3(String str) {
        zj.b bVar = new zj.b("rbx.web");
        if (!bVar.b(str)) {
            return false;
        }
        bVar.a(p(), str, str);
        return true;
    }

    public void t3(String str) {
    }

    @Override // sg.x0, dk.e.b
    public void u(ol.a aVar) {
        super.u(aVar);
        this.I0.setBackgroundColor(this.Z0.a(fk.c.c().g()));
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
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f9727a;
        if (!domainAllowListChecker.isKnownTrustedDomain(str, this.Y0)) {
            domainAllowListChecker.checkDomainAllowList(str, this.Y0, new DomainAllowListChecker.Callback() { // from class: sg.b1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.a aVar) {
                    this.f30739a.o3(z10, str, aVar);
                }
            });
            return;
        }
        if (z10) {
            c0.v(c0.c.FIRST_PARTY_LOAD);
        }
        b3(str, false);
    }
}
