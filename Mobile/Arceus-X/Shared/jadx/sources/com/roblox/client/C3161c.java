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
import androidx.appcompat.app.DialogInterfaceC0408a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.C3161c;
import com.roblox.client.hybrid.RBHybridWebView;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.protocols.webview.DomainAllowListChecker;
import fj.C5613a0;
import fj.C5636m;
import fk.C5654c;
import km.C7630a;
import km.C7635f;
import nl.C9492a;
import om.EnumC9813n;
import org.greenrobot.eventbus.ThreadMode;
import p093e4.ActivityC4831q;
import p104ei.C5132j;
import p104ei.InterfaceC5135m;
import p105ej.AbstractC5153k;
import p105ej.InterfaceC5148f;
import p105ej.InterfaceC5152j;
import p138fv.C5840c;
import p138fv.InterfaceC5847j;
import p139g.AbstractC5854c;
import p139g.InterfaceC5852a;
import p151gk.C6112e0;
import p151gk.C6124q;
import p151gk.C6127t;
import p154h.C6255h;
import p197ii.C6812a;
import p198ij.C6813a;
import p198ij.C6814b;
import p261l2.C7975b;
import p308nh.C9476b;
import p337ol.EnumC9799a;
import p413ri.C10884a;
import p491vh.C12209m;
import p516wg.C12422d;
import p520wk.C12483e;
import p520wk.C12486h;
import p606zj.C13819b;
import sg.C11295a1;
import sg.C11312e2;
import sg.C11326j0;
import sg.C11335m0;
import sg.C11338n0;
import sg.C11347q0;
import sg.C11356t0;
import sg.C11367x;
import sg.C11368x0;
import sg.C11370y;
import th.C11659h;
import uk.C11862a;
import uk.C11863b;
import vg.C12173c0;
import vi.C12211b;
import vi.C12217h;

/* JADX INFO: renamed from: com.roblox.client.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3161c extends C11368x0 implements SwipeRefreshLayout.InterfaceC1088j {

    /* JADX INFO: renamed from: O0 */
    public String f11691O0;

    /* JADX INFO: renamed from: P0 */
    public ProgressDialog f11692P0;

    /* JADX INFO: renamed from: Q0 */
    public FrameLayout f11693Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f11694R0;

    /* JADX INFO: renamed from: S0 */
    public j f11695S0;

    /* JADX INFO: renamed from: T0 */
    public i f11696T0;

    /* JADX INFO: renamed from: U0 */
    public ValueCallback<Uri[]> f11697U0;

    /* JADX INFO: renamed from: Z0 */
    public C12422d f11702Z0;

    /* JADX INFO: renamed from: a1 */
    public PermissionRequest f11703a1;

    /* JADX INFO: renamed from: H0 */
    public TextView f11684H0 = null;

    /* JADX INFO: renamed from: I0 */
    public RBHybridWebView f11685I0 = null;

    /* JADX INFO: renamed from: J0 */
    public SwipeRefreshLayout f11686J0 = null;

    /* JADX INFO: renamed from: K0 */
    public String f11687K0 = null;

    /* JADX INFO: renamed from: L0 */
    public int f11688L0 = 0;

    /* JADX INFO: renamed from: M0 */
    public int f11689M0 = 0;

    /* JADX INFO: renamed from: N0 */
    public String f11690N0 = null;

    /* JADX INFO: renamed from: V0 */
    public boolean f11698V0 = false;

    /* JADX INFO: renamed from: W0 */
    public boolean f11699W0 = false;

    /* JADX INFO: renamed from: X0 */
    public boolean f11700X0 = true;

    /* JADX INFO: renamed from: Y0 */
    public String f11701Y0 = null;

    /* JADX INFO: renamed from: b1 */
    public final AbstractC5854c<String> f11704b1 = mo4671h(new C6255h(), new InterfaceC5852a() { // from class: sg.c1
        @Override // p139g.InterfaceC5852a
        /* JADX INFO: renamed from: a */
        public final void mo4481a(Object obj) {
            this.f39676a.m15018n3((Boolean) obj);
        }
    });

    /* JADX INFO: renamed from: c1 */
    public final InterfaceC5152j f11705c1 = new c();

    /* JADX INFO: renamed from: d1 */
    public final InterfaceC5152j f11706d1 = new d();

    /* JADX INFO: renamed from: e1 */
    public final InterfaceC5152j f11707e1 = new e();

    /* JADX INFO: renamed from: f1 */
    public final InterfaceC5152j f11708f1 = new f();

    /* JADX INFO: renamed from: com.roblox.client.c$a */
    public class a implements C6812a.b {
        public a() {
        }

        @Override // p197ii.C6812a.b
        /* JADX INFO: renamed from: a */
        public void mo15031a(String str) {
            if (C3161c.this.f11696T0 != null) {
                C3161c.this.f11696T0.mo1374a(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.c$b */
    public class b extends WebChromeClient {

        /* JADX INFO: renamed from: com.roblox.client.c$b$a */
        public class a extends WebViewClient {
            public a() {
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                C3161c.this.m15022r3(str);
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
                    int iM33003a = C7975b.m33003a(C3161c.this.m4693p(), C11370y.m42581h().m42591k().mo38655s(EnumC9813n.CAMERA));
                    if (C11659h.m43403a().mo43534S5()) {
                        if (iM33003a == 0) {
                            C6124q.m27063h("rbx.web", "Camera permission already granted");
                            permissionRequest.grant(new String[]{str});
                        } else {
                            C6124q.m27063h("rbx.web", "Camera permission not granted, requesting via ActivityResultLauncher");
                            C3161c.this.f11703a1 = permissionRequest;
                            C3161c.this.f11704b1.m26240b("android.permission.CAMERA");
                        }
                    } else if (iM33003a != 0) {
                        C6124q.m27063h("rbx.web", "No permission granted for camera");
                        permissionRequest.deny();
                    } else {
                        C6124q.m27063h("rbx.web", "Permission granted for camera");
                        permissionRequest.grant(new String[]{str});
                    }
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            C3161c.this.mo15028x3(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            C3161c.this.f11697U0 = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            C3161c.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.c$c */
    public class c implements InterfaceC5152j {
        public c() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: b */
        public void mo15032b() {
            C3161c.this.m14998F3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: c */
        public void mo15033c() {
            C3161c.this.m14998F3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: d */
        public void mo15034d() {
            C3161c.this.m15011g3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: e */
        public void mo15035e(AbstractC5153k abstractC5153k) {
            C3161c.this.mo15003Y2(abstractC5153k);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.c$d */
    public class d implements InterfaceC5152j {
        public d() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: b */
        public void mo15032b() {
            C3161c.this.m14998F3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: c */
        public void mo15033c() {
            C3161c.this.m14998F3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: d */
        public void mo15034d() {
            C3161c.this.m15011g3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: e */
        public void mo15035e(AbstractC5153k abstractC5153k) {
            C3161c.this.mo15003Y2(abstractC5153k);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.c$e */
    public class e implements InterfaceC5152j {
        public e() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: b */
        public void mo15032b() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: c */
        public void mo15033c() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: d */
        public void mo15034d() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: e */
        public void mo15035e(AbstractC5153k abstractC5153k) {
            C6124q.m27063h("rbx.amazon.purchaseflow", "onPurchaseFinishedListener: Result=" + abstractC5153k + ".");
            C3161c.this.mo15003Y2(abstractC5153k);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.c$f */
    public class f implements InterfaceC5152j {
        public f() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: b */
        public void mo15032b() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: c */
        public void mo15033c() {
            C3161c.this.m14998F3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: d */
        public void mo15034d() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: e */
        public void mo15035e(AbstractC5153k abstractC5153k) {
            C3161c.this.mo15003Y2(abstractC5153k);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.c$g */
    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11716a;

        static {
            int[] iArr = new int[DomainAllowListChecker.EnumC3335a.values().length];
            f11716a = iArr;
            try {
                iArr[DomainAllowListChecker.EnumC3335a.FirstParty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11716a[DomainAllowListChecker.EnumC3335a.SecondParty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11716a[DomainAllowListChecker.EnumC3335a.ThirdParty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11716a[DomainAllowListChecker.EnumC3335a.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.c$h */
    public class h {
        public h() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.c$i */
    public interface i {
        /* JADX INFO: renamed from: a */
        void mo1374a(String str);
    }

    /* JADX INFO: renamed from: com.roblox.client.c$j */
    public interface j {
        /* JADX INFO: renamed from: a */
        default void m15036a() {
        }

        /* JADX INFO: renamed from: b */
        default void mo1229b(String str) {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.c$k */
    public class k extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public String f11718a = null;

        /* JADX INFO: renamed from: com.roblox.client.c$k$a */
        public class a implements InterfaceC5135m {
            public a() {
            }

            @Override // p104ei.InterfaceC5135m
            /* JADX INFO: renamed from: a */
            public void mo14796a(C5132j c5132j) {
            }
        }

        public k() {
        }

        /* JADX INFO: renamed from: d */
        public final boolean m15040d(final WebView webView, final String str) {
            String strM27027c;
            C6124q.m27063h("rbx.web", "-> " + str);
            if (str == null) {
                C6124q.m27060e("rbx.web", "RWF.shouldOverrideUrlLoading() urlString is null!");
                C12173c0.m45033v(C12173c0.c.URL_NULL);
                return false;
            }
            final ActivityC4831q activityC4831qM4693p = C3161c.this.m4693p();
            if (activityC4831qM4693p == null || activityC4831qM4693p.isFinishing()) {
                C6124q.m27063h("rbx.web", "RWF.shouldOverrideUrlLoading() activity is null or finishing");
                C12173c0.m45033v(C12173c0.c.ACTIVITY_FINISHING);
                return true;
            }
            if (C3161c.this.mo1226u2()) {
                C12173c0.m45033v(C12173c0.c.NETWORK_DISCONNECTED);
                return true;
            }
            if (C3161c.this.m15010f3(str)) {
                C12173c0.m45033v(C12173c0.c.WEB_LINK);
                return true;
            }
            if (!DomainAllowListChecker.f12674a.enableDomainAllowListChecker() && C3161c.this.m15023s3(str)) {
                C6124q.m27063h("rbx.web", "Navigating social media Link...");
                C12173c0.m45033v(C12173c0.c.SOCIAL_MEDIA);
                return true;
            }
            if (str.equalsIgnoreCase(C11295a1.m42489z0())) {
                if (C3161c.this.f11695S0 != null) {
                    C3161c.this.f11695S0.m15036a();
                }
                C12173c0.m45033v(C12173c0.c.PASSWORD_RESET);
                return true;
            }
            if (C11295a1.m42463m0(str) && !C3161c.this.f11694R0) {
                C6124q.m27063h("rbx.web", "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!");
                C3161c c3161c = C3161c.this;
                c3161c.m42580z2(C10884a.m41438c(c3161c.mo4715x(), C11347q0.f39995o, new Object[0]), 1);
                C12211b.m45200f().m45207i(activityC4831qM4693p, C12211b.d.LOGOUT_BY_401_ERROR_IN_WEB);
                C11295a1.m42424V(str);
                C12217h.m45288e().m45294d(new a());
                C12173c0.m45033v(C12173c0.c.SESSION_EXPIRED);
                return true;
            }
            String queryParameter = null;
            C3161c.this.f11685I0.setOnTouchListener(null);
            C3161c.this.m14997E3(str, true);
            if (!str.contains("mobile-app-upgrades/buy?")) {
                C7635f.m31524D().m31548p(str, new C7635f.k() { // from class: sg.m1
                    @Override // km.C7635f.k
                    /* JADX INFO: renamed from: a */
                    public final void mo31562a(boolean z10) {
                        this.f39843a.m15043g(str, activityC4831qM4693p, webView, z10);
                    }
                });
                return true;
            }
            C12173c0.m45033v(C12173c0.c.PURCHASE);
            String strM25679k = C5654c.m25669c().m25679k();
            Uri uri = Uri.parse(str);
            String queryParameter2 = uri.getQueryParameter("id");
            if (C6127t.m27093i()) {
                C6124q.m27063h("rbx.purchaseflow", "RobloxWebDialogFragment to start an in-app purchase. Username = " + strM25679k);
                if (C11659h.m43403a().mo43466I5()) {
                    C6814b.m29184a(activityC4831qM4693p);
                    C3161c.this.mo15184U(C11347q0.f40018v1);
                } else {
                    C6813a.m29183a(activityC4831qM4693p);
                    C3161c.this.mo15184U(C11347q0.f40018v1);
                }
            } else {
                if (C11659h.m43403a().mo43501O()) {
                    String queryParameter3 = uri.getQueryParameter("ctx");
                    String queryParameter4 = uri.getQueryParameter(Payload.TYPE);
                    String strM27027c2 = C6112e0.m27027c(uri, "paymentSessionId");
                    if (queryParameter3 != null && queryParameter4 != null && queryParameter3.equals("subscription")) {
                        C6124q.m27063h("rbx.purchaseflow", "RobloxWebDialogFragment to start an in-app subscription purchase.");
                        IAPPurchaseManager.nativePerformSubscriptionPurchase(queryParameter4, queryParameter2, BuildConfig.STORE_TYPE, strM27027c2);
                        return true;
                    }
                }
                if (C11659h.m43403a().mo43455H1()) {
                    C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocol: tryStartInAppPurchase in RobloxWebDialogFragment.");
                    C5613a0 c5613a0M25370R = C5613a0.m25370R(activityC4831qM4693p);
                    C11356t0.m42534d(C3161c.this.mo15007c3(), "purchaseStart" + queryParameter2);
                    c5613a0M25370R.mo23970e(queryParameter2, uri, strM25679k, activityC4831qM4693p, C3161c.this.f11705c1, new Runnable() { // from class: sg.l1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f39767a.m15041e();
                        }
                    });
                } else if (C11659h.m43403a().mo43677m3()) {
                    IAPPurchaseManager.nativeSetMetricsPurchaseType(IAPPurchaseManager.f11975l);
                    if (!C11659h.m43403a().mo43642h3() || (strM27027c = C6112e0.m27027c(uri, "paymentSessionId")) == null) {
                        strM27027c = "";
                    }
                    C5636m c5636mM25494F0 = C5636m.m25494F0(activityC4831qM4693p);
                    c5636mM25494F0.mo23975j(null);
                    c5636mM25494F0.mo23976k(true);
                    IAPPurchaseManager.nativeSetPaymentsProtocolIsInApp(true);
                    IAPPurchaseManager.nativeSetPaymentSessionId(strM27027c);
                    IAPPurchaseManager.nativeSetProviderCurrencyCode(c5636mM25494F0.mo23968c(queryParameter2));
                    IAPPurchaseManager.nativeBeginPaymentsProtocolPurchase(queryParameter2);
                } else {
                    C5636m c5636mM25494F1 = C5636m.m25494F0(activityC4831qM4693p);
                    if (c5636mM25494F1 == null) {
                        C3161c.this.mo15184U(C11347q0.f40018v1);
                    } else {
                        C11356t0.m42534d(C3161c.this.mo15007c3(), "purchaseStart" + queryParameter2);
                        try {
                            queryParameter = uri.getQueryParameter("recurring");
                        } catch (NullPointerException unused) {
                            C6124q.m27063h("rbx.purchaseflow", "NullPointerException thrown while parsing recurring parameter for purchase url");
                        } catch (UnsupportedOperationException unused2) {
                            C6124q.m27063h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing recurring parameter for purchase url");
                        }
                        if (!c5636mM25494F1.mo23974i(strM25679k, queryParameter2, activityC4831qM4693p, C3161c.this.f11705c1, Boolean.valueOf(queryParameter).booleanValue())) {
                            C3161c.this.mo15184U(C11347q0.f40003q1);
                        }
                    }
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m15041e() {
            C3161c.this.mo15184U(C11347q0.f40003q1);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m15042f(ActivityC4831q activityC4831q, String str, WebView webView) {
            if (activityC4831q.isFinishing() || activityC4831q.isDestroyed()) {
                return;
            }
            C3161c.this.f11684H0.setText(str);
            webView.loadUrl(str);
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m15043g(final String str, final ActivityC4831q activityC4831q, final WebView webView, boolean z10) {
            if (!z10) {
                if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
                    C3161c.this.m15029y3(str);
                    return;
                } else {
                    C12173c0.m45033v(C12173c0.c.DEFAULT_LOAD);
                    activityC4831q.runOnUiThread(new Runnable() { // from class: sg.n1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f39880a.m15042f(activityC4831q, str, webView);
                        }
                    });
                    return;
                }
            }
            C12173c0.m45033v(C12173c0.c.DEEPLINK_INTERCEPT);
            if (C11659h.m43403a().mo43490M1()) {
                C3161c.this.f11695S0.mo1229b(str);
                return;
            }
            if (!C11659h.m43403a().mo43610d1()) {
                C5840c.m26204d().m26211j(C3161c.this.new h());
                C7635f.m31524D().m31538f(str, "android_webview", false);
                C7635f.m31524D().m31543k(str);
                return;
            }
            C7635f c7635fM31524D = C7635f.m31524D();
            c7635fM31524D.m31556x(str, "android_webview", false);
            String strM31541i = c7635fM31524D.m31541i(str, "android_webview");
            C5840c.m26204d().m26211j(C3161c.this.new h());
            if (strM31541i == null || strM31541i.isEmpty()) {
                c7635fM31524D.m31545m(str);
            } else {
                c7635fM31524D.m31542j(strM31541i);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            C12486h.m46774h().m46778k(C11295a1.m42450g());
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            C3161c.this.mo15026v3(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C3161c.this.f11686J0.setRefreshing(false);
            C6124q.m27063h("rbx.web", "onPageFinished. url=" + str);
            C3161c.this.m15027w3(str);
            if (C11659h.m43403a().mo43655j2() && !webView.hasFocus()) {
                webView.requestFocus();
            }
            if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
                this.f11718a = null;
            }
            if (C12209m.m45193b().m45194a(str)) {
                C3161c.this.f11685I0.reload();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C6124q.m27063h("rbx.web", "-> " + str);
            C3161c.this.mo15024t3(str);
            C3161c.this.f11686J0.setRefreshing(true);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest.isForMainFrame()) {
                C6124q.m27066k("rbx.web", "onReceivedMainFrameError: suppressing impression. error=" + webResourceError.getErrorCode() + ": " + ((Object) webResourceError.getDescription()));
                C3161c.this.mo15025u3();
                if (C11312e2.m42506j(RobloxApplication.m14834f())) {
                    return;
                }
                C12173c0.m45033v(C12173c0.c.NETWORK_DISCONNECTED);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
                return m15040d(webView, webResourceRequest.getUrl().toString());
            }
            String string = webResourceRequest.getUrl().toString();
            if (!string.equals(this.f11718a) || webResourceRequest.hasGesture()) {
                this.f11718a = string;
                return m15040d(webView, string);
            }
            C6124q.m27063h("rbx.web", "Skipping duplicate shouldOverrideUrlLoading call for URL: " + string);
            return true;
        }
    }

    /* JADX INFO: renamed from: J2 */
    public static /* synthetic */ void m14979J2(DomainAllowListChecker.EnumC3335a enumC3335a) {
        int i10 = g.f11716a[enumC3335a.ordinal()];
        if (i10 == 1) {
            C12173c0.m45033v(C12173c0.c.FIRST_PARTY_LOAD);
            return;
        }
        if (i10 == 2) {
            C12173c0.m45033v(C12173c0.c.SECOND_PARTY_LOAD);
        } else if (i10 == 3 || i10 == 4) {
            C12173c0.m45033v(C12173c0.c.THIRD_PARTY_EXTERNAL);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: A0 */
    public void mo4584A0(int i10, int i11, Intent intent) {
        if (i10 == 20123) {
            if (i11 == -1) {
                this.f11697U0.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                C6124q.m27063h("rbx.web", "Result of file chooser invalid.");
                this.f11697U0.onReceiveValue(null);
            }
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m14993A3(boolean z10) {
        this.f11699W0 = z10;
    }

    /* JADX INFO: renamed from: B3 */
    public void m14994B3(i iVar) {
        this.f11696T0 = iVar;
    }

    /* JADX INFO: renamed from: C3 */
    public void m14995C3(j jVar) {
        this.f11695S0 = jVar;
    }

    /* JADX INFO: renamed from: D3 */
    public void mo14996D3(boolean z10) {
        this.f11700X0 = z10;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m14997E3(String str, boolean z10) {
        if (str.contains("sponsored")) {
            this.f11685I0.getSettings().setBuiltInZoomControls(z10);
        } else {
            this.f11685I0.getSettings().setBuiltInZoomControls(!z10);
        }
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        C11863b.m44278a().m26215n(this);
        Bundle bundleM4704t = m4704t();
        if (bundleM4704t != null) {
            String string = bundleM4704t.getString("DEFAULT_URL", null);
            C6124q.m27057b("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                if (string.contains("/giftcards?")) {
                    string = string.replace("/giftcards?", "/shopgiftcards?");
                }
                C6124q.m27057b("rbx.web", "onCreate: default-URL = " + string + ".");
                this.f11690N0 = string;
                if (this.f11687K0 == null) {
                    this.f11687K0 = string;
                    if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
                        this.f11701Y0 = string;
                    }
                }
            }
            this.f11691O0 = bundleM4704t.getString("WEB_VIEW_TAG", null);
            this.f11698V0 = bundleM4704t.getBoolean("USE_APP_HYBRID");
        }
        this.f11702Z0 = new C12422d(mo4715x());
    }

    /* JADX INFO: renamed from: F3 */
    public final void m14998F3() {
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: sg.k1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39736a.m15020p3(activityC4831qM4693p);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final void m14999G3(AbstractC5153k abstractC5153k) {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p == null) {
            return;
        }
        CharSequence charSequenceMo23984c = abstractC5153k.mo23984c(activityC4831qM4693p);
        if (abstractC5153k.mo23986f()) {
            m42577v2(charSequenceMo23984c);
        } else {
            mo15185W(charSequenceMo23984c.toString());
        }
    }

    /* JADX INFO: renamed from: H3 */
    public void mo15000H3(C9492a c9492a) {
        Boolean bool = c9492a.f34110c;
        if (bool != null) {
            mo14996D3(bool.booleanValue());
        }
        Boolean bool2 = c9492a.f34112e;
        if (bool2 != null) {
            m14993A3(bool2.booleanValue());
        }
    }

    /* JADX INFO: renamed from: I3 */
    public C12173c0.b mo15001I3() {
        return C12173c0.b.WEB_DIALOG_FRAGMENT;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C11338n0.f39862i, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(C11335m0.f39812i0);
        this.f11684H0 = (TextView) viewInflate.findViewById(C11335m0.f39838v0);
        k kVar = new k();
        this.f11685I0 = m15005a3();
        if (C11659h.m43403a().mo43662k2()) {
            this.f11685I0.setCommandListener(new C11367x());
        }
        viewGroup2.addView(this.f11685I0, new ViewGroup.LayoutParams(-1, -1));
        this.f11685I0.setTag(this.f11691O0);
        this.f11685I0.setWebViewClient(kVar);
        this.f11685I0.getSettings().setSupportMultipleWindows(true);
        this.f11685I0.setWebChromeClient(new b());
        try {
            this.f11685I0.getSettings().setJavaScriptEnabled(true);
            this.f11685I0.getSettings().setDomStorageEnabled(true);
            this.f11685I0.getSettings().setUserAgentString(C11295a1.m42433Z0());
            this.f11685I0.getSettings().setCacheMode(-1);
            this.f11685I0.setHorizontalScrollBarEnabled(false);
            this.f11685I0.setVerticalScrollBarEnabled(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (C9476b.m37333a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (this.f11687K0 != null) {
            if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
                m15030z3(this.f11687K0, true);
            } else {
                C12173c0.m45033v(C12173c0.c.DEFAULT_LOAD);
                this.f11685I0.loadUrl(this.f11687K0);
            }
            this.f11687K0 = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(C11335m0.f39812i0);
        this.f11686J0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f11686J0;
        int i10 = C11326j0.f39711b;
        int i11 = C11326j0.f39726q;
        swipeRefreshLayout2.setColorSchemeResources(i10, i10, i11, i11);
        this.f11693Q0 = (FrameLayout) viewInflate.findViewById(C11335m0.f39814j0);
        Bundle bundleM4704t = m4704t();
        if (bundleM4704t != null) {
            this.f11688L0 = bundleM4704t.getInt("dialogHeight", 0);
            this.f11689M0 = bundleM4704t.getInt("dialogWidth", 0);
            this.f11686J0.setEnabled(false);
            this.f11694R0 = bundleM4704t.getBoolean("USING_LOGIN_WEB_URL", false);
            this.f11700X0 = bundleM4704t.getBoolean("VISIBLE", true);
            this.f11699W0 = bundleM4704t.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        mo1226u2();
        this.f11685I0.mo15288h();
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: K0 */
    public void mo4613K0() {
        C11863b.m44278a().m26217p(this);
        if (C11659h.m43403a().mo43534S5() && this.f11703a1 != null) {
            C6124q.m27063h("rbx.web", "onDestroy: Cleaning up pending permission request");
            this.f11703a1.deny();
            this.f11703a1 = null;
        }
        super.mo4613K0();
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: M0 */
    public void mo4618M0() {
        super.mo4618M0();
        this.f11685I0.mo15289i();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: P0 */
    public void mo4627P0(boolean z10) {
        super.mo4627P0(z10);
        if (z10 || !C12209m.m45193b().m45194a(this.f11685I0.getUrl())) {
            return;
        }
        this.f11685I0.reload();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: V0 */
    public void mo4643V0() {
        super.mo4643V0();
        RBHybridWebView rBHybridWebView = this.f11685I0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onPause();
        }
    }

    /* JADX INFO: renamed from: X2 */
    public final void m15002X2(final String str) {
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p == null || activityC4831qM4693p.isFinishing() || activityC4831qM4693p.isDestroyed()) {
            return;
        }
        activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: sg.e1
            @Override // java.lang.Runnable
            public final void run() {
                this.f39689a.m15014j3(activityC4831qM4693p, str);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ej.k */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y2 */
    public void mo15003Y2(final AbstractC5153k abstractC5153k) {
        if (C11659h.m43403a().mo43703q1() && (abstractC5153k instanceof InterfaceC5148f)) {
            InterfaceC5148f interfaceC5148f = (InterfaceC5148f) abstractC5153k;
            String strMo23965b = interfaceC5148f.mo23965b();
            if (!strMo23965b.isEmpty()) {
                NativeGLInterface.nativeMarketplacePurchaseFinished(abstractC5153k.mo23985d(), interfaceC5148f.mo23964a().toString(), strMo23965b);
            }
        }
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: sg.f1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39694a.m15015k3(activityC4831qM4693p, abstractC5153k);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public final ProgressDialog m15004Z2(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: a1 */
    public void mo4658a1() {
        Window window;
        super.mo4658a1();
        if (m23328h2() != null && this.f11688L0 != 0 && (window = m23328h2().getWindow()) != null) {
            int i10 = this.f11689M0;
            if (i10 == 0) {
                window.setLayout(-2, this.f11688L0);
            } else {
                window.setLayout(i10, this.f11688L0);
            }
        }
        RBHybridWebView rBHybridWebView = this.f11685I0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onResume();
        }
    }

    /* JADX INFO: renamed from: a3 */
    public RBHybridWebView m15005a3() {
        RBHybridWebView rBHybridWebView;
        if (this.f11698V0) {
            rBHybridWebView = C11659h.m43403a().mo43594b1() ? new C6812a(mo4715x(), new a()) : new C6812a(mo4715x());
        } else {
            rBHybridWebView = new RBHybridWebView(mo4715x());
        }
        if (C11659h.m43403a().mo43530S1()) {
            C12483e.m46756r(C11295a1.m42410O());
        }
        return rBHybridWebView;
    }

    /* JADX INFO: renamed from: b3 */
    public final void m15006b3(final String str, boolean z10) {
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p == null || activityC4831qM4693p.isFinishing() || activityC4831qM4693p.isDestroyed()) {
            return;
        }
        activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: sg.d1
            @Override // java.lang.Runnable
            public final void run() {
                this.f39683a.m15016l3(activityC4831qM4693p, str);
            }
        });
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
    }

    /* JADX INFO: renamed from: c3 */
    public String mo15007c3() {
        return "undefinedWebContext";
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        super.mo4665d1();
    }

    /* JADX INFO: renamed from: d3 */
    public String m15008d3() {
        RBHybridWebView rBHybridWebView = this.f11685I0;
        return rBHybridWebView == null ? this.f11687K0 : rBHybridWebView.getUrl();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1088j
    /* JADX INFO: renamed from: e */
    public void mo6173e() {
        if (m4693p() != null) {
            if (((AbstractActivityC3152a) m4693p()).m14844N1()) {
                this.f11686J0.setRefreshing(false);
            } else {
                this.f11685I0.reload();
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public boolean mo15009e3() {
        RBHybridWebView rBHybridWebView = this.f11685I0;
        if (rBHybridWebView == null || !rBHybridWebView.canGoBack()) {
            return false;
        }
        m14997E3(this.f11685I0.getUrl(), false);
        this.f11685I0.goBack();
        return true;
    }

    /* JADX INFO: renamed from: f3 */
    public final boolean m15010f3(String str) {
        Intent intent;
        if (str.startsWith("mailto:")) {
            intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        } else {
            intent = str.startsWith("tel:") ? new Intent("android.intent.action.DIAL", Uri.parse(str)) : null;
        }
        if (intent == null) {
            return false;
        }
        if (C6127t.m27085a(mo4715x(), intent)) {
            m4649X1(intent);
            return true;
        }
        m42579y2(C11347q0.f39941U, 1);
        return true;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m15011g3() {
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: sg.g1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39701a.m15017m3(activityC4831qM4693p);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m15012h3() {
        return this.f11699W0;
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m15013i3(ActivityC4831q activityC4831q, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(this.f11685I0.getUrl())) {
            activityC4831q.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m15014j3(final ActivityC4831q activityC4831q, final String str) {
        new DialogInterfaceC0408a.a(activityC4831q).m1520d(false).m1532p(C11347q0.f39999p0).m1523g(C11347q0.f39996o0).m1525i(C11347q0.f40004r, null).m1529m(C11347q0.f40007s, new DialogInterface.OnClickListener() { // from class: sg.i1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ActivityC4831q activityC4831q2 = activityC4831q;
                String str2 = str;
                new C7630a("rbx.web").m31518e(activityC4831q2, str2, str2);
            }
        }).m1527k(new DialogInterface.OnDismissListener() { // from class: sg.j1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f39727a.m15013i3(activityC4831q, dialogInterface);
            }
        }).m1534r();
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m15015k3(ActivityC4831q activityC4831q, AbstractC5153k abstractC5153k) {
        if (activityC4831q == null || activityC4831q.isFinishing() || activityC4831q.isDestroyed()) {
            return;
        }
        m15011g3();
        m14999G3(abstractC5153k);
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m15016l3(ActivityC4831q activityC4831q, String str) {
        if (activityC4831q.isFinishing() || activityC4831q.isDestroyed()) {
            return;
        }
        this.f11684H0.setText(str);
        this.f11685I0.loadUrl(str);
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m15017m3(ActivityC4831q activityC4831q) {
        ProgressDialog progressDialog;
        if (activityC4831q == null || activityC4831q.isFinishing() || activityC4831q.isDestroyed() || (progressDialog = this.f11692P0) == null || !progressDialog.isShowing()) {
            return;
        }
        this.f11692P0.dismiss();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m15018n3(Boolean bool) {
        C6124q.m27063h("rbx.web", "Camera permission result: " + bool);
        if (this.f11703a1 == null) {
            C6124q.m27066k("rbx.web", "Camera permission callback received but no pending request");
            return;
        }
        if (bool.booleanValue()) {
            C6124q.m27063h("rbx.web", "Camera permission granted by user, granting to webview");
            this.f11703a1.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
        } else {
            C6124q.m27063h("rbx.web", "Camera permission denied by user, denying to webview");
            this.f11703a1.deny();
        }
        this.f11703a1 = null;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m15019o3(boolean z10, String str, DomainAllowListChecker.EnumC3335a enumC3335a) {
        int i10 = g.f11716a[enumC3335a.ordinal()];
        if (i10 == 1) {
            if (z10) {
                C12173c0.m45033v(C12173c0.c.FIRST_PARTY_LOAD);
            }
            m15006b3(str, false);
        } else if (i10 == 2) {
            if (z10) {
                C12173c0.m45033v(C12173c0.c.SECOND_PARTY_LOAD);
            }
            m15006b3(str, true);
        } else if (i10 == 3 || i10 == 4) {
            if (z10) {
                C12173c0.m45033v(C12173c0.c.THIRD_PARTY_EXTERNAL);
            }
            m15002X2(str);
        }
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(C11862a c11862a) {
        if (this.f11685I0 != null) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ void m15020p3(ActivityC4831q activityC4831q) {
        if (activityC4831q == null || activityC4831q.isFinishing() || activityC4831q.isDestroyed()) {
            return;
        }
        if (this.f11692P0 == null) {
            this.f11692P0 = m15004Z2(activityC4831q, null, m4666e0(C11347q0.f39931P));
        }
        this.f11692P0.show();
    }

    /* JADX INFO: renamed from: q3 */
    public void m15021q3(String str) {
        C12173c0.m45034w(mo15001I3(), str);
        if (this.f11685I0 == null) {
            this.f11687K0 = str;
        } else if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
            m15030z3(str, true);
        } else {
            C12173c0.m45033v(C12173c0.c.DEFAULT_LOAD);
            this.f11685I0.loadUrl(str);
        }
        if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
            this.f11701Y0 = str;
        }
    }

    /* JADX INFO: renamed from: r3 */
    public final void m15022r3(String str) {
        if (str == null) {
            return;
        }
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f12674a;
        if (domainAllowListChecker.isKnownTrustedDomain(str, this.f11701Y0)) {
            C12173c0.m45033v(C12173c0.c.FIRST_PARTY_LOAD);
        } else {
            domainAllowListChecker.checkDomainAllowList(str, this.f11701Y0, new DomainAllowListChecker.Callback() { // from class: sg.h1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.EnumC3335a enumC3335a) {
                    C3161c.m14979J2(enumC3335a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final boolean m15023s3(String str) {
        C13819b c13819b = new C13819b("rbx.web");
        if (!c13819b.m50303b(str)) {
            return false;
        }
        c13819b.m50302a(m4693p(), str, str);
        return true;
    }

    /* JADX INFO: renamed from: t3 */
    public void mo15024t3(String str) {
    }

    @Override // sg.C11368x0, dk.C4636e.b
    /* JADX INFO: renamed from: u */
    public void mo14822u(EnumC9799a enumC9799a) {
        super.mo14822u(enumC9799a);
        this.f11685I0.setBackgroundColor(this.f11702Z0.mo22857a(C5654c.m25669c().m25675g()));
    }

    /* JADX INFO: renamed from: u3 */
    public void mo15025u3() {
    }

    /* JADX INFO: renamed from: v3 */
    public void mo15026v3(String str) {
    }

    /* JADX INFO: renamed from: w3 */
    public void m15027w3(String str) {
    }

    /* JADX INFO: renamed from: x3 */
    public void mo15028x3(WebView webView, int i10) {
    }

    /* JADX INFO: renamed from: y3 */
    public void m15029y3(String str) {
        m15030z3(str, false);
    }

    /* JADX INFO: renamed from: z3 */
    public final void m15030z3(final String str, final boolean z10) {
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f12674a;
        if (!domainAllowListChecker.isKnownTrustedDomain(str, this.f11701Y0)) {
            domainAllowListChecker.checkDomainAllowList(str, this.f11701Y0, new DomainAllowListChecker.Callback() { // from class: sg.b1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.EnumC3335a enumC3335a) {
                    this.f39665a.m15019o3(z10, str, enumC3335a);
                }
            });
            return;
        }
        if (z10) {
            C12173c0.m45033v(C12173c0.c.FIRST_PARTY_LOAD);
        }
        m15006b3(str, false);
    }
}
