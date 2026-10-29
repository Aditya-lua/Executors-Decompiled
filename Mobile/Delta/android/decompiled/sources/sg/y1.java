package sg;

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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.hybrid.RBHybridWebView;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.protocols.webview.DomainAllowListChecker;
import il.AndroidColorToken;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class y1 extends androidx.fragment.app.c implements SwipeRefreshLayout.j {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public String f31093m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ProgressDialog f31094n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public FrameLayout f31095o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f31096p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ValueCallback<Uri[]> f31097q0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ImageView f31100t0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f31086f0 = null;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public RBHybridWebView f31087g0 = null;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public SwipeRefreshLayout f31088h0 = null;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f31089i0 = null;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f31090j0 = 0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f31091k0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f31092l0 = null;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f31098r0 = false;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f31099s0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f31101u0 = false;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f31102v0 = true;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public il.c f31103w0 = il.b.tokens;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f31104x0 = null;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final ej.j f31105y0 = new b();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final ej.j f31106z0 = new c();
    public final ej.j A0 = new d();
    public final ej.j B0 = new e();

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
                    if (l2.b.a(y1.this.p(), y.h().k().s(om.n.CAMERA)) != 0) {
                        gk.p.h("rbx.web", "No permission granted for camera");
                        permissionRequest.deny();
                    } else {
                        gk.p.h("rbx.web", "Permission granted for camera");
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
            y1.this.f31097q0 = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            y1.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    public class b implements ej.j {
        public b() {
        }

        @Override // ej.j
        public void b() {
            y1.this.d3();
        }

        @Override // ej.j
        public void c() {
            y1.this.d3();
        }

        @Override // ej.j
        public void d() {
            y1.this.I2();
        }

        @Override // ej.j
        public void e(ej.k kVar) {
            y1.this.x2(kVar);
        }
    }

    public class c implements ej.j {
        public c() {
        }

        @Override // ej.j
        public void b() {
            y1.this.d3();
        }

        @Override // ej.j
        public void c() {
            y1.this.d3();
        }

        @Override // ej.j
        public void d() {
            y1.this.I2();
        }

        @Override // ej.j
        public void e(ej.k kVar) {
            y1.this.x2(kVar);
        }
    }

    public class d implements ej.j {
        public d() {
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
            gk.p.h("rbx.amazon.purchaseflow", "onPurchaseFinishedListener: Result=" + kVar + ".");
            y1.this.x2(kVar);
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
            y1.this.d3();
        }

        @Override // ej.j
        public void d() {
        }

        @Override // ej.j
        public void e(ej.k kVar) {
            y1.this.x2(kVar);
        }
    }

    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31112a;

        static {
            int[] iArr = new int[DomainAllowListChecker.a.values().length];
            f31112a = iArr;
            try {
                iArr[DomainAllowListChecker.a.FirstParty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31112a[DomainAllowListChecker.a.SecondParty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31112a[DomainAllowListChecker.a.ThirdParty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31112a[DomainAllowListChecker.a.Unknown.ordinal()] = 4;
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
        public String f31114a = null;

        public class a implements ei.m {
            public a() {
            }

            @Override // ei.m
            public void a(ei.j jVar) {
            }
        }

        public i() {
        }

        public final boolean d(final WebView webView, final String str) {
            String queryParameter;
            String queryParameter2;
            gk.p.h("rbx.web", "-> " + str);
            if (str == null) {
                gk.p.e("rbx.web", "RWF.shouldOverrideUrlLoading() urlString is null!");
                return false;
            }
            final e4.q qVarP = y1.this.p();
            if (qVarP == null || qVarP.isFinishing()) {
                gk.p.h("rbx.web", "RWF.shouldOverrideUrlLoading() activity is null or finishing");
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
            if (!DomainAllowListChecker.f9727a.enableDomainAllowListChecker() && y1.this.V2(str)) {
                gk.p.h("rbx.web", "Navigating social media Link...");
                return true;
            }
            if (str.equalsIgnoreCase(a1.z0())) {
                y1.o2(y1.this);
                return true;
            }
            if (a1.m0(str) && !y1.this.f31096p0) {
                gk.p.h("rbx.web", "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!");
                try {
                    y1.this.D2().L1(ri.a.c(y1.this.x(), q0.f30954o, new Object[0]), 1);
                } catch (u0 unused2) {
                    y1.U2();
                }
                vi.b.f().i(qVarP, vi.b.d.LOGOUT_BY_401_ERROR_IN_WEB);
                a1.V(str);
                vi.h.e().d(new a());
                return true;
            }
            String queryParameter3 = null;
            y1.this.f31087g0.setOnTouchListener(null);
            y1.this.c3(str, true);
            if (!str.contains("mobile-app-upgrades/buy?")) {
                km.f.v().i(str, new km.f.k() { // from class: sg.a2
                    @Override // km.f.k
                    public final void a(boolean z10) {
                        this.f30735a.g(str, qVarP, webView, z10);
                    }
                });
                return true;
            }
            com.roblox.client.a aVar = (com.roblox.client.a) qVarP;
            String strK = fk.c.c().k();
            Uri uri = Uri.parse(str);
            String queryParameter4 = uri.getQueryParameter("id");
            if (!gk.s.i()) {
                if (th.h.a().L()) {
                    String queryParameter5 = uri.getQueryParameter("ctx");
                    String queryParameter6 = uri.getQueryParameter(Payload.TYPE);
                    String strC = gk.d0.c(uri, "paymentSessionId");
                    if (queryParameter5 != null && queryParameter6 != null && queryParameter5.equals("subscription")) {
                        gk.p.h("rbx.purchaseflow", "RobloxWebFragment to start an in-app subscription purchase.");
                        IAPPurchaseManager.nativePerformSubscriptionPurchase(queryParameter6, queryParameter4, BuildConfig.STORE_TYPE, strC);
                        return true;
                    }
                }
                if (th.h.a().B1()) {
                    gk.p.h("rbx.purchaseflow", "PaymentsProtocolV2: tryStartInAppPurchase.");
                    fj.a0 a0VarR = fj.a0.R(aVar);
                    t0.d(y1.this.F2(), "purchaseStart" + queryParameter4);
                    a0VarR.e(queryParameter4, uri, strK, aVar, y1.this.f31105y0, new Runnable() { // from class: sg.z1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f31116a.e();
                        }
                    });
                } else if (th.h.a().g3()) {
                    IAPPurchaseManager.nativeSetMetricsPurchaseType(IAPPurchaseManager.f9186l);
                    try {
                        queryParameter2 = uri.getQueryParameter("paymentSessionId");
                    } catch (NullPointerException unused3) {
                        gk.p.h("rbx.purchaseflow", "NullPointerException thrown while parsing paymentSession parameter for purchase url");
                        queryParameter2 = "";
                    } catch (UnsupportedOperationException unused4) {
                        gk.p.h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url");
                        queryParameter2 = "";
                    }
                    fj.m mVarF0 = fj.m.F0(aVar);
                    mVarF0.j(null);
                    mVarF0.k(true);
                    IAPPurchaseManager.nativeSetPaymentsProtocolIsInApp(true);
                    IAPPurchaseManager.nativeSetPaymentSessionId(queryParameter2);
                    IAPPurchaseManager.nativeSetProviderCurrencyCode(mVarF0.c(queryParameter4));
                    IAPPurchaseManager.nativeBeginPaymentsProtocolPurchase(queryParameter4);
                } else {
                    fj.m mVarF1 = fj.m.F0(aVar);
                    if (mVarF1 == null) {
                        try {
                            y1.this.D2().U(q0.f30977v1);
                        } catch (u0 unused5) {
                            y1.U2();
                        }
                    } else {
                        t0.d(y1.this.F2(), "purchaseStart" + queryParameter4);
                        try {
                            queryParameter = uri.getQueryParameter("recurring");
                        } catch (NullPointerException unused6) {
                            gk.p.h("rbx.purchaseflow", "NullPointerException thrown while parsing recurring parameter for purchase url");
                            queryParameter = null;
                        } catch (UnsupportedOperationException unused7) {
                            gk.p.h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing recurring parameter for purchase url");
                            queryParameter = null;
                        }
                        boolean zBooleanValue = Boolean.valueOf(queryParameter).booleanValue();
                        try {
                            queryParameter3 = uri.getQueryParameter("paymentSessionId");
                        } catch (NullPointerException unused8) {
                            gk.p.h("rbx.purchaseflow", "NullPointerException thrown while parsing paymentSession parameter for purchase url");
                        } catch (UnsupportedOperationException unused9) {
                            gk.p.h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url");
                        }
                        if (!mVarF1.h(strK, queryParameter4, aVar, y1.this.f31105y0, zBooleanValue, queryParameter3)) {
                            try {
                                y1.this.D2().U(q0.f30962q1);
                            } catch (u0 unused10) {
                                y1.U2();
                            }
                        }
                    }
                }
            } else if (th.h.a().C5()) {
                if (th.h.a().O2()) {
                    gk.d0.c(uri, "paymentSessionId");
                } else {
                    try {
                        uri.getQueryParameter("paymentSessionId");
                    } catch (NullPointerException unused11) {
                        gk.p.h("rbx.purchaseflow", "NullPointerException thrown while parsing paymentSession parameter for purchase url");
                    } catch (UnsupportedOperationException e10) {
                        gk.p.f("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url " + str, e10);
                    }
                }
                ij.b.a(aVar);
                try {
                    y1.this.D2().U(q0.f30965r1);
                } catch (u0 unused12) {
                    y1.U2();
                }
            } else {
                gk.p.h("rbx.purchaseflow", "RobloxWebFragment to start an in-app purchase. Username = " + strK);
                ij.a.a(aVar);
                try {
                    y1.this.D2().U(q0.f30977v1);
                } catch (u0 unused13) {
                    y1.U2();
                }
            }
            return true;
        }

        public final /* synthetic */ void e() {
            try {
                y1.this.D2().U(q0.f30962q1);
            } catch (u0 unused) {
                y1.U2();
            }
        }

        public final /* synthetic */ void f(e4.q qVar, String str, WebView webView) {
            if (qVar.isFinishing() || qVar.isDestroyed()) {
                return;
            }
            y1.this.f31086f0.setText(str);
            webView.loadUrl(str);
        }

        public final /* synthetic */ void g(final String str, final e4.q qVar, final WebView webView, boolean z10) {
            if (z10) {
                fv.c.d().j(y1.this.new g());
                km.f.v().q(str, "android_webview", false);
                km.f.v().e(str);
            } else if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
                y1.this.a3(str);
            } else {
                qVar.runOnUiThread(new Runnable() { // from class: sg.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30741a.f(qVar, str, webView);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            wk.h.h().k(a1.g());
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            y1.this.f31088h0.setRefreshing(false);
            gk.p.h("rbx.web", "onPageFinished. url=" + str);
            y1.this.X2(str);
            if (th.h.a().d2() && !webView.hasFocus()) {
                webView.requestFocus();
            }
            if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
                this.f31114a = null;
            }
            if (vh.m.b().a(str)) {
                y1.this.f31087g0.reload();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            gk.p.h("rbx.web", "-> " + str);
            y1.this.W2(str);
            y1.this.f31088h0.setRefreshing(true);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
                return d(webView, webResourceRequest.getUrl().toString());
            }
            String string = webResourceRequest.getUrl().toString();
            if (!string.equals(this.f31114a) || webResourceRequest.hasGesture()) {
                this.f31114a = string;
                return d(webView, string);
            }
            gk.p.h("rbx.web", "Skipping duplicate shouldOverrideUrlLoading call for URL: " + string);
            return true;
        }
    }

    private void C2(final String str, boolean z10) {
        final e4.q qVarP = p();
        if (qVarP == null || qVarP.isFinishing() || qVarP.isDestroyed()) {
            return;
        }
        qVarP.runOnUiThread(new Runnable() { // from class: sg.t1
            @Override // java.lang.Runnable
            public final void run() {
                this.f31060a.N2(qVarP, str);
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
        if (gk.s.a(x(), intent)) {
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
        final e4.q qVarP = p();
        if (qVarP != null) {
            qVarP.runOnUiThread(new Runnable() { // from class: sg.r1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30994a.O2(qVarP);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K2(e4.q qVar, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(this.f31087g0.getUrl())) {
            qVar.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L2(final e4.q qVar, final String str) {
        new androidx.appcompat.app.a.C0013a(qVar).d(false).p(q0.f30958p0).g(q0.f30955o0).i(q0.f30963r, null).m(q0.f30966s, new DialogInterface.OnClickListener() { // from class: sg.v1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                e4.q qVar2 = qVar;
                String str2 = str;
                new km.a("rbx.web").e(qVar2, str2, str2);
            }
        }).k(new DialogInterface.OnDismissListener() { // from class: sg.w1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f31072a.K2(qVar, dialogInterface);
            }
        }).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M2(e4.q qVar, ej.k kVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        I2();
        e3(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N2(e4.q qVar, String str) {
        if (qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        this.f31086f0.setText(str);
        this.f31087g0.loadUrl(str);
    }

    public static void U2() {
        gk.p.k("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V2(String str) {
        zj.b bVar = new zj.b("rbx.web");
        if (!bVar.b(str)) {
            return false;
        }
        bVar.a(p(), str, str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a3(final String str) {
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f9727a;
        if (domainAllowListChecker.isKnownTrustedDomain(str, this.f31104x0)) {
            C2(str, false);
        } else {
            domainAllowListChecker.checkDomainAllowList(str, this.f31104x0, new DomainAllowListChecker.Callback() { // from class: sg.s1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.a aVar) {
                    this.f31057a.P2(str, aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c3(String str, boolean z10) {
        if (str.contains("sponsored")) {
            this.f31087g0.getSettings().setBuiltInZoomControls(z10);
        } else {
            this.f31087g0.getSettings().setBuiltInZoomControls(!z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        final e4.q qVarP = p();
        if (qVarP != null) {
            qVarP.runOnUiThread(new Runnable() { // from class: sg.x1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31080a.S2(qVarP);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e3(ej.k kVar) {
        boolean zContains;
        e4.q qVarP = p();
        if (qVarP == null) {
            return;
        }
        if (th.h.a().g5()) {
            zContains = th.h.a().J0().contains(((ej.f) kVar).a());
        } else {
            zContains = false;
        }
        gk.p.b("rbx.web", "isBonusItemEnabled = " + zContains);
        CharSequence charSequenceC = kVar.c(qVarP);
        if (kVar.f()) {
            y2(charSequenceC);
            return;
        }
        try {
            if (!zContains) {
                D2().W(charSequenceC.toString());
                return;
            }
            D2().F1(e0(q0.f30971t1), e0(q0.f30974u1));
        } catch (u0 unused) {
            U2();
        }
    }

    public static /* bridge */ /* synthetic */ h o2(y1 y1Var) {
        y1Var.getClass();
        return null;
    }

    private void w2(final String str) {
        final e4.q qVarP = p();
        if (qVarP == null || qVarP.isFinishing() || qVarP.isDestroyed()) {
            return;
        }
        qVarP.runOnUiThread(new Runnable() { // from class: sg.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f31068a.L2(qVarP, str);
            }
        });
    }

    private synchronized void y2(CharSequence charSequence) {
        e4.q qVarP = p();
        if (qVarP == null) {
            return;
        }
        androidx.appcompat.app.a aVarA = new androidx.appcompat.app.a.C0013a(qVarP).a();
        TextView textView = new TextView(qVarP);
        String string = qVarP.getString(q0.W);
        int iIndexOf = charSequence.toString().indexOf(string);
        hk.b.b(textView, charSequence.toString(), new hk.c(qVarP, null, string, iIndexOf, iIndexOf + string.length()));
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

    @Override // androidx.fragment.app.c
    public void A0(int i10, int i11, Intent intent) {
        if (i10 == 20123) {
            if (i11 == -1) {
                this.f31097q0.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                gk.p.h("rbx.web", "Result of file chooser invalid.");
                this.f31097q0.onReceiveValue(null);
            }
        }
    }

    public RBHybridWebView A2() {
        RBHybridWebView aVar = this.f31098r0 ? new ii.a(x()) : new RBHybridWebView(x());
        if (th.h.a().M1()) {
            wk.e.r(a1.O());
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
        e4.q qVarP = p();
        if (qVarP instanceof com.roblox.client.a) {
            return (com.roblox.client.a) qVarP;
        }
        throw new u0();
    }

    public boolean E2(String str, boolean z10) {
        Bundle bundleT = t();
        return bundleT != null ? bundleT.getBoolean(str, z10) : z10;
    }

    @Override // androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        uk.b.a().n(this);
        Bundle bundleT = t();
        if (bundleT != null) {
            String string = bundleT.getString("DEFAULT_URL", null);
            gk.p.b("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                this.f31092l0 = string;
                if (this.f31089i0 == null) {
                    this.f31089i0 = string;
                    if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
                        this.f31104x0 = string;
                    }
                }
            }
            this.f31093m0 = bundleT.getString("WEB_VIEW_TAG", null);
            this.f31098r0 = bundleT.getBoolean("USE_APP_HYBRID");
        }
    }

    public String F2() {
        return "undefinedWebContext";
    }

    public boolean G2() {
        RBHybridWebView rBHybridWebView = this.f31087g0;
        if (rBHybridWebView == null || !rBHybridWebView.canGoBack()) {
            return false;
        }
        c3(this.f31087g0.getUrl(), false);
        this.f31087g0.goBack();
        return true;
    }

    @Override // androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z10 = th.h.a().A0() && E2("hideNativeHeader", false);
        this.f31099s0 = z10;
        View viewInflate = layoutInflater.inflate(z10 ? n0.f30888n : n0.f30887m, viewGroup, false);
        int i10 = m0.f30841i0;
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(i10);
        this.f31086f0 = (TextView) viewInflate.findViewById(m0.f30867v0);
        i iVar = new i();
        this.f31087g0 = A2();
        if (th.h.a().e2()) {
            this.f31087g0.setCommandListener(new x());
        }
        viewGroup2.addView(this.f31087g0, new ViewGroup.LayoutParams(-1, -1));
        this.f31087g0.setTag(this.f31093m0);
        this.f31087g0.setWebViewClient(iVar);
        this.f31087g0.getSettings().setSupportMultipleWindows(true);
        this.f31087g0.setWebChromeClient(new a());
        this.f31087g0.getSettings().setJavaScriptEnabled(true);
        this.f31087g0.getSettings().setDomStorageEnabled(true);
        this.f31087g0.getSettings().setUserAgentString(a1.Z0());
        this.f31087g0.getSettings().setCacheMode(-1);
        this.f31087g0.setHorizontalScrollBarEnabled(false);
        this.f31087g0.setVerticalScrollBarEnabled(false);
        if (nh.b.a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (this.f31089i0 != null) {
            if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
                a3(this.f31089i0);
            } else {
                this.f31087g0.loadUrl(this.f31089i0);
            }
            this.f31089i0 = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(i10);
        this.f31088h0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f31088h0;
        int i11 = j0.b;
        int i12 = j0.f30788q;
        swipeRefreshLayout2.setColorSchemeResources(i11, i11, i12, i12);
        this.f31095o0 = (FrameLayout) viewInflate.findViewById(m0.f30843j0);
        Bundle bundleT = t();
        if (bundleT != null) {
            this.f31090j0 = bundleT.getInt("dialogHeight", 0);
            this.f31091k0 = bundleT.getInt("dialogWidth", 0);
            if (!bundleT.getBoolean("enablePullToRefresh", true)) {
                this.f31088h0.setEnabled(false);
            }
            this.f31096p0 = bundleT.getBoolean("USING_LOGIN_WEB_URL", false);
            this.f31102v0 = bundleT.getBoolean("VISIBLE", true);
            this.f31101u0 = bundleT.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        try {
            D2().N1();
        } catch (u0 unused) {
            U2();
        }
        this.f31087g0.h();
        if (this.f31099s0) {
            b3(viewInflate);
        }
        return viewInflate;
    }

    public boolean J2() {
        return this.f31101u0;
    }

    @Override // androidx.fragment.app.c
    public void K0() {
        uk.b.a().p(this);
        super.K0();
    }

    @Override // androidx.fragment.app.c
    public void M0() {
        super.M0();
        this.f31087g0.i();
    }

    public final /* synthetic */ void O2(e4.q qVar) {
        ProgressDialog progressDialog;
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed() || (progressDialog = this.f31094n0) == null || !progressDialog.isShowing()) {
            return;
        }
        this.f31094n0.dismiss();
    }

    @Override // androidx.fragment.app.c
    public void P0(boolean z10) {
        super.P0(z10);
        if (z10 || !vh.m.b().a(this.f31087g0.getUrl())) {
            return;
        }
        this.f31087g0.reload();
    }

    public final /* synthetic */ void P2(String str, DomainAllowListChecker.a aVar) {
        int i10 = f.f31112a[aVar.ordinal()];
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31100t0.getLayoutParams();
        layoutParams.topMargin = i10 + insets.top;
        this.f31100t0.setLayoutParams(layoutParams);
        return windowInsetsCompat;
    }

    public final /* synthetic */ void S2(e4.q qVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        if (this.f31094n0 == null) {
            this.f31094n0 = z2(qVar, null, e0(q0.P));
        }
        this.f31094n0.show();
    }

    public void T2(String str) {
        vg.c0.w(g3(), str);
        if (this.f31087g0 == null) {
            this.f31089i0 = str;
        } else if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
            a3(str);
        } else {
            this.f31087g0.loadUrl(str);
        }
        if (DomainAllowListChecker.f9727a.enableDomainAllowListChecker()) {
            this.f31104x0 = str;
        }
    }

    @Override // androidx.fragment.app.c
    public void V0() {
        super.V0();
        RBHybridWebView rBHybridWebView = this.f31087g0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onPause();
        }
    }

    public void W2(String str) {
    }

    public void X2(String str) {
    }

    public void Y2(WebView webView, int i10) {
    }

    public final int Z2(ol.a aVar) {
        int iC;
        boolean z10 = aVar == ol.a.DARK;
        AndroidColorToken androidColorTokenB = this.f31103w0.b("Surface.Surface_0");
        if (androidColorTokenB != null) {
            iC = z10 ? androidColorTokenB.getDark() : androidColorTokenB.getLight();
        } else {
            iC = z10 ? l2.b.c(x(), j0.f30779h) : l2.b.c(x(), j0.f30788q);
        }
        return androidx.core.graphics.c.l(iC, 235);
    }

    @Override // androidx.fragment.app.c
    public void a1() {
        super.a1();
        RBHybridWebView rBHybridWebView = this.f31087g0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onResume();
        }
    }

    public void b3(View view) {
        ImageView imageView = (ImageView) view.findViewById(m0.D);
        this.f31100t0 = imageView;
        if (!this.f31099s0 || imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f31100t0.setImageResource(new RobloxToolbar.c().a(fk.c.c().g()));
        this.f31100t0.setOnClickListener(new View.OnClickListener() { // from class: sg.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f30912a.Q2(view2);
            }
        });
        f3(fk.c.c().g());
        final int i10 = (int) (T().getDisplayMetrics().density * 10.0f);
        androidx.core.view.o0.A0(view, new androidx.core.view.y() { // from class: sg.q1
            @Override // androidx.core.view.y
            public final WindowInsetsCompat K(View view2, WindowInsetsCompat windowInsetsCompat) {
                return this.f30990a.R2(i10, view2, windowInsetsCompat);
            }
        });
    }

    @Override // androidx.fragment.app.c
    public void c1() {
        super.c1();
    }

    @Override // androidx.fragment.app.c
    public void d1() {
        super.d1();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void e() {
        if (p() != null) {
            if (((com.roblox.client.a) p()).N1()) {
                this.f31088h0.setRefreshing(false);
            } else {
                this.f31087g0.reload();
            }
        }
    }

    public void f3(ol.a aVar) {
        if (this.f31100t0 == null) {
            return;
        }
        int iZ2 = Z2(aVar);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(iZ2);
        this.f31100t0.setBackground(gradientDrawable);
    }

    public vg.c0.b g3() {
        return vg.c0.b.WEB_FRAGMENT;
    }

    @fv.j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(uk.a aVar) {
        if (this.f31087g0 != null) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void x2(final ej.k kVar) {
        if (th.h.a().l1() && (kVar instanceof ej.f)) {
            ej.f fVar = (ej.f) kVar;
            String strB = fVar.b();
            if (!strB.isEmpty()) {
                NativeGLInterface.nativeMarketplacePurchaseFinished(kVar.d(), fVar.a().toString(), strB);
            }
        }
        final e4.q qVarP = p();
        if (qVarP != null) {
            qVarP.runOnUiThread(new Runnable() { // from class: sg.o1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30908a.M2(qVarP, kVar);
                }
            });
        }
    }
}
