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
import androidx.appcompat.app.DialogInterfaceC0408a;
import androidx.core.graphics.C0546c;
import androidx.core.graphics.Insets;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.hybrid.RBHybridWebView;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.protocols.webview.DomainAllowListChecker;
import fj.C5613a0;
import fj.C5636m;
import fk.C5654c;
import hk.C6413b;
import hk.C6414c;
import il.AndroidColorToken;
import il.C6817b;
import il.InterfaceC6818c;
import km.C7630a;
import km.C7635f;
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
import p151gk.C6112e0;
import p151gk.C6124q;
import p151gk.C6127t;
import p197ii.C6812a;
import p198ij.C6813a;
import p198ij.C6814b;
import p261l2.C7975b;
import p308nh.C9476b;
import p337ol.EnumC9799a;
import p413ri.C10884a;
import p491vh.C12209m;
import p520wk.C12483e;
import p520wk.C12486h;
import p606zj.C13819b;
import th.C11659h;
import uk.C11862a;
import uk.C11863b;
import vg.C12173c0;
import vi.C12211b;
import vi.C12217h;

/* JADX INFO: renamed from: sg.y1 */
/* JADX INFO: loaded from: classes2.dex */
public class C11372y1 extends ComponentCallbacksC0929c implements SwipeRefreshLayout.InterfaceC1088j {

    /* JADX INFO: renamed from: m0 */
    public String f40209m0;

    /* JADX INFO: renamed from: n0 */
    public ProgressDialog f40210n0;

    /* JADX INFO: renamed from: o0 */
    public FrameLayout f40211o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f40212p0;

    /* JADX INFO: renamed from: q0 */
    public ValueCallback<Uri[]> f40213q0;

    /* JADX INFO: renamed from: t0 */
    public ImageView f40216t0;

    /* JADX INFO: renamed from: f0 */
    public TextView f40202f0 = null;

    /* JADX INFO: renamed from: g0 */
    public RBHybridWebView f40203g0 = null;

    /* JADX INFO: renamed from: h0 */
    public SwipeRefreshLayout f40204h0 = null;

    /* JADX INFO: renamed from: i0 */
    public String f40205i0 = null;

    /* JADX INFO: renamed from: j0 */
    public int f40206j0 = 0;

    /* JADX INFO: renamed from: k0 */
    public int f40207k0 = 0;

    /* JADX INFO: renamed from: l0 */
    public String f40208l0 = null;

    /* JADX INFO: renamed from: r0 */
    public boolean f40214r0 = false;

    /* JADX INFO: renamed from: s0 */
    public boolean f40215s0 = false;

    /* JADX INFO: renamed from: u0 */
    public boolean f40217u0 = false;

    /* JADX INFO: renamed from: v0 */
    public boolean f40218v0 = true;

    /* JADX INFO: renamed from: w0 */
    public InterfaceC6818c f40219w0 = C6817b.tokens;

    /* JADX INFO: renamed from: x0 */
    public String f40220x0 = null;

    /* JADX INFO: renamed from: y0 */
    public final InterfaceC5152j f40221y0 = new b();

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC5152j f40222z0 = new c();

    /* JADX INFO: renamed from: A0 */
    public final InterfaceC5152j f40200A0 = new d();

    /* JADX INFO: renamed from: B0 */
    public final InterfaceC5152j f40201B0 = new e();

    /* JADX INFO: renamed from: sg.y1$a */
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
                    if (C7975b.m33003a(C11372y1.this.m4693p(), C11370y.m42581h().m42591k().mo38655s(EnumC9813n.CAMERA)) != 0) {
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
            C11372y1.this.m42652Y2(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            C11372y1.this.f40213q0 = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            C11372y1.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    /* JADX INFO: renamed from: sg.y1$b */
    public class b implements InterfaceC5152j {
        public b() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: b */
        public void mo15032b() {
            C11372y1.this.m42614d3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: c */
        public void mo15033c() {
            C11372y1.this.m42614d3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: d */
        public void mo15034d() {
            C11372y1.this.m42602I2();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: e */
        public void mo15035e(AbstractC5153k abstractC5153k) {
            C11372y1.this.mo42657x2(abstractC5153k);
        }
    }

    /* JADX INFO: renamed from: sg.y1$c */
    public class c implements InterfaceC5152j {
        public c() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: b */
        public void mo15032b() {
            C11372y1.this.m42614d3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: c */
        public void mo15033c() {
            C11372y1.this.m42614d3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: d */
        public void mo15034d() {
            C11372y1.this.m42602I2();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: e */
        public void mo15035e(AbstractC5153k abstractC5153k) {
            C11372y1.this.mo42657x2(abstractC5153k);
        }
    }

    /* JADX INFO: renamed from: sg.y1$d */
    public class d implements InterfaceC5152j {
        public d() {
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
            C11372y1.this.mo42657x2(abstractC5153k);
        }
    }

    /* JADX INFO: renamed from: sg.y1$e */
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
            C11372y1.this.m42614d3();
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: d */
        public void mo15034d() {
        }

        @Override // p105ej.InterfaceC5152j
        /* JADX INFO: renamed from: e */
        public void mo15035e(AbstractC5153k abstractC5153k) {
            C11372y1.this.mo42657x2(abstractC5153k);
        }
    }

    /* JADX INFO: renamed from: sg.y1$f */
    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40228a;

        static {
            int[] iArr = new int[DomainAllowListChecker.EnumC3335a.values().length];
            f40228a = iArr;
            try {
                iArr[DomainAllowListChecker.EnumC3335a.FirstParty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40228a[DomainAllowListChecker.EnumC3335a.SecondParty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40228a[DomainAllowListChecker.EnumC3335a.ThirdParty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40228a[DomainAllowListChecker.EnumC3335a.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: sg.y1$g */
    public class g {
        public g() {
        }
    }

    /* JADX INFO: renamed from: sg.y1$h */
    public interface h {
    }

    /* JADX INFO: renamed from: sg.y1$i */
    public class i extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public String f40230a = null;

        /* JADX INFO: renamed from: sg.y1$i$a */
        public class a implements InterfaceC5135m {
            public a() {
            }

            @Override // p104ei.InterfaceC5135m
            /* JADX INFO: renamed from: a */
            public void mo14796a(C5132j c5132j) {
            }
        }

        public i() {
        }

        /* JADX INFO: renamed from: d */
        public final boolean m42661d(final WebView webView, final String str) {
            String queryParameter;
            String queryParameter2;
            C6124q.m27063h("rbx.web", "-> " + str);
            if (str == null) {
                C6124q.m27060e("rbx.web", "RWF.shouldOverrideUrlLoading() urlString is null!");
                return false;
            }
            final ActivityC4831q activityC4831qM4693p = C11372y1.this.m4693p();
            if (activityC4831qM4693p == null || activityC4831qM4693p.isFinishing()) {
                C6124q.m27063h("rbx.web", "RWF.shouldOverrideUrlLoading() activity is null or finishing");
                return true;
            }
            try {
                if (C11372y1.this.m42639D2().m14844N1()) {
                    return true;
                }
            } catch (C11359u0 unused) {
                C11372y1.m42607U2();
            }
            if (C11372y1.this.m42601H2(str)) {
                return true;
            }
            if (!DomainAllowListChecker.f12674a.enableDomainAllowListChecker() && C11372y1.this.m42608V2(str)) {
                C6124q.m27063h("rbx.web", "Navigating social media Link...");
                return true;
            }
            if (str.equalsIgnoreCase(C11295a1.m42489z0())) {
                C11372y1.m42626o2(C11372y1.this);
                return true;
            }
            if (C11295a1.m42463m0(str) && !C11372y1.this.f40212p0) {
                C6124q.m27063h("rbx.web", "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!");
                try {
                    C11372y1.this.m42639D2().m14967L1(C10884a.m41438c(C11372y1.this.mo4715x(), C11347q0.f39995o, new Object[0]), 1);
                } catch (C11359u0 unused2) {
                    C11372y1.m42607U2();
                }
                C12211b.m45200f().m45207i(activityC4831qM4693p, C12211b.d.LOGOUT_BY_401_ERROR_IN_WEB);
                C11295a1.m42424V(str);
                C12217h.m45288e().m45294d(new a());
                return true;
            }
            String queryParameter3 = null;
            C11372y1.this.f40203g0.setOnTouchListener(null);
            C11372y1.this.m42612c3(str, true);
            if (!str.contains("mobile-app-upgrades/buy?")) {
                C7635f.m31524D().m31548p(str, new C7635f.k() { // from class: sg.a2
                    @Override // km.C7635f.k
                    /* JADX INFO: renamed from: a */
                    public final void mo31562a(boolean z10) {
                        this.f39659a.m42664g(str, activityC4831qM4693p, webView, z10);
                    }
                });
                return true;
            }
            AbstractActivityC3152a abstractActivityC3152a = (AbstractActivityC3152a) activityC4831qM4693p;
            String strM25679k = C5654c.m25669c().m25679k();
            Uri uri = Uri.parse(str);
            String queryParameter4 = uri.getQueryParameter("id");
            if (!C6127t.m27093i()) {
                if (C11659h.m43403a().mo43501O()) {
                    String queryParameter5 = uri.getQueryParameter("ctx");
                    String queryParameter6 = uri.getQueryParameter(Payload.TYPE);
                    String strM27027c = C6112e0.m27027c(uri, "paymentSessionId");
                    if (queryParameter5 != null && queryParameter6 != null && queryParameter5.equals("subscription")) {
                        C6124q.m27063h("rbx.purchaseflow", "RobloxWebFragment to start an in-app subscription purchase.");
                        IAPPurchaseManager.nativePerformSubscriptionPurchase(queryParameter6, queryParameter4, BuildConfig.STORE_TYPE, strM27027c);
                        return true;
                    }
                }
                if (C11659h.m43403a().mo43455H1()) {
                    C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocolV2: tryStartInAppPurchase.");
                    C5613a0 c5613a0M25370R = C5613a0.m25370R(abstractActivityC3152a);
                    C11356t0.m42534d(C11372y1.this.mo42641F2(), "purchaseStart" + queryParameter4);
                    c5613a0M25370R.mo23970e(queryParameter4, uri, strM25679k, abstractActivityC3152a, C11372y1.this.f40221y0, new Runnable() { // from class: sg.z1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f40233a.m42662e();
                        }
                    });
                } else if (C11659h.m43403a().mo43677m3()) {
                    IAPPurchaseManager.nativeSetMetricsPurchaseType(IAPPurchaseManager.f11975l);
                    try {
                        queryParameter2 = uri.getQueryParameter("paymentSessionId");
                    } catch (NullPointerException unused3) {
                        C6124q.m27063h("rbx.purchaseflow", "NullPointerException thrown while parsing paymentSession parameter for purchase url");
                        queryParameter2 = "";
                    } catch (UnsupportedOperationException unused4) {
                        C6124q.m27063h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url");
                        queryParameter2 = "";
                    }
                    C5636m c5636mM25494F0 = C5636m.m25494F0(abstractActivityC3152a);
                    c5636mM25494F0.mo23975j(null);
                    c5636mM25494F0.mo23976k(true);
                    IAPPurchaseManager.nativeSetPaymentsProtocolIsInApp(true);
                    IAPPurchaseManager.nativeSetPaymentSessionId(queryParameter2);
                    IAPPurchaseManager.nativeSetProviderCurrencyCode(c5636mM25494F0.mo23968c(queryParameter4));
                    IAPPurchaseManager.nativeBeginPaymentsProtocolPurchase(queryParameter4);
                } else {
                    C5636m c5636mM25494F1 = C5636m.m25494F0(abstractActivityC3152a);
                    if (c5636mM25494F1 == null) {
                        try {
                            C11372y1.this.m42639D2().m14968U(C11347q0.f40018v1);
                        } catch (C11359u0 unused5) {
                            C11372y1.m42607U2();
                        }
                    } else {
                        C11356t0.m42534d(C11372y1.this.mo42641F2(), "purchaseStart" + queryParameter4);
                        try {
                            queryParameter = uri.getQueryParameter("recurring");
                        } catch (NullPointerException unused6) {
                            C6124q.m27063h("rbx.purchaseflow", "NullPointerException thrown while parsing recurring parameter for purchase url");
                            queryParameter = null;
                        } catch (UnsupportedOperationException unused7) {
                            C6124q.m27063h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing recurring parameter for purchase url");
                            queryParameter = null;
                        }
                        boolean zBooleanValue = Boolean.valueOf(queryParameter).booleanValue();
                        try {
                            queryParameter3 = uri.getQueryParameter("paymentSessionId");
                        } catch (NullPointerException unused8) {
                            C6124q.m27063h("rbx.purchaseflow", "NullPointerException thrown while parsing paymentSession parameter for purchase url");
                        } catch (UnsupportedOperationException unused9) {
                            C6124q.m27063h("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url");
                        }
                        if (!c5636mM25494F1.mo23973h(strM25679k, queryParameter4, abstractActivityC3152a, C11372y1.this.f40221y0, zBooleanValue, queryParameter3)) {
                            try {
                                C11372y1.this.m42639D2().m14968U(C11347q0.f40003q1);
                            } catch (C11359u0 unused10) {
                                C11372y1.m42607U2();
                            }
                        }
                    }
                }
            } else if (C11659h.m43403a().mo43466I5()) {
                if (C11659h.m43403a().mo43545U2()) {
                    C6112e0.m27027c(uri, "paymentSessionId");
                } else {
                    try {
                        uri.getQueryParameter("paymentSessionId");
                    } catch (NullPointerException unused11) {
                        C6124q.m27063h("rbx.purchaseflow", "NullPointerException thrown while parsing paymentSession parameter for purchase url");
                    } catch (UnsupportedOperationException e10) {
                        C6124q.m27061f("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url " + str, e10);
                    }
                }
                C6814b.m29184a(abstractActivityC3152a);
                try {
                    C11372y1.this.m42639D2().m14968U(C11347q0.f40006r1);
                } catch (C11359u0 unused12) {
                    C11372y1.m42607U2();
                }
            } else {
                C6124q.m27063h("rbx.purchaseflow", "RobloxWebFragment to start an in-app purchase. Username = " + strM25679k);
                C6813a.m29183a(abstractActivityC3152a);
                try {
                    C11372y1.this.m42639D2().m14968U(C11347q0.f40018v1);
                } catch (C11359u0 unused13) {
                    C11372y1.m42607U2();
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m42662e() {
            try {
                C11372y1.this.m42639D2().m14968U(C11347q0.f40003q1);
            } catch (C11359u0 unused) {
                C11372y1.m42607U2();
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m42663f(ActivityC4831q activityC4831q, String str, WebView webView) {
            if (activityC4831q.isFinishing() || activityC4831q.isDestroyed()) {
                return;
            }
            C11372y1.this.f40202f0.setText(str);
            webView.loadUrl(str);
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m42664g(final String str, final ActivityC4831q activityC4831q, final WebView webView, boolean z10) {
            if (!z10) {
                if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
                    C11372y1.this.m42609a3(str);
                    return;
                } else {
                    activityC4831q.runOnUiThread(new Runnable() { // from class: sg.b2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f39668a.m42663f(activityC4831q, str, webView);
                        }
                    });
                    return;
                }
            }
            if (!C11659h.m43403a().mo43610d1()) {
                C5840c.m26204d().m26211j(C11372y1.this.new g());
                C7635f.m31524D().m31538f(str, "android_webview", false);
                C7635f.m31524D().m31543k(str);
                return;
            }
            C7635f c7635fM31524D = C7635f.m31524D();
            c7635fM31524D.m31556x(str, "android_webview", false);
            String strM31541i = c7635fM31524D.m31541i(str, "android_webview");
            C5840c.m26204d().m26211j(C11372y1.this.new g());
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
        public void onPageFinished(WebView webView, String str) {
            C11372y1.this.f40204h0.setRefreshing(false);
            C6124q.m27063h("rbx.web", "onPageFinished. url=" + str);
            C11372y1.this.m42651X2(str);
            if (C11659h.m43403a().mo43655j2() && !webView.hasFocus()) {
                webView.requestFocus();
            }
            if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
                this.f40230a = null;
            }
            if (C12209m.m45193b().m45194a(str)) {
                C11372y1.this.f40203g0.reload();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C6124q.m27063h("rbx.web", "-> " + str);
            C11372y1.this.m42650W2(str);
            C11372y1.this.f40204h0.setRefreshing(true);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (!DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
                return m42661d(webView, webResourceRequest.getUrl().toString());
            }
            String string = webResourceRequest.getUrl().toString();
            if (!string.equals(this.f40230a) || webResourceRequest.hasGesture()) {
                this.f40230a = string;
                return m42661d(webView, string);
            }
            C6124q.m27063h("rbx.web", "Skipping duplicate shouldOverrideUrlLoading call for URL: " + string);
            return true;
        }
    }

    /* JADX INFO: renamed from: C2 */
    private void m42600C2(final String str, boolean z10) {
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p == null || activityC4831qM4693p.isFinishing() || activityC4831qM4693p.isDestroyed()) {
            return;
        }
        activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: sg.t1
            @Override // java.lang.Runnable
            public final void run() {
                this.f40158a.m42606N2(activityC4831qM4693p, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public boolean m42601H2(String str) {
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
        try {
            m42639D2().m14966K1(C11347q0.f39941U, 1);
        } catch (C11359u0 unused) {
            m42607U2();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public void m42602I2() {
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: sg.r1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40037a.m42644O2(activityC4831qM4693p);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public /* synthetic */ void m42603K2(ActivityC4831q activityC4831q, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(this.f40203g0.getUrl())) {
            activityC4831q.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public /* synthetic */ void m42604L2(final ActivityC4831q activityC4831q, final String str) {
        new DialogInterfaceC0408a.a(activityC4831q).m1520d(false).m1532p(C11347q0.f39999p0).m1523g(C11347q0.f39996o0).m1525i(C11347q0.f40004r, null).m1529m(C11347q0.f40007s, new DialogInterface.OnClickListener() { // from class: sg.v1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ActivityC4831q activityC4831q2 = activityC4831q;
                String str2 = str;
                new C7630a("rbx.web").m31518e(activityC4831q2, str2, str2);
            }
        }).m1527k(new DialogInterface.OnDismissListener() { // from class: sg.w1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f40176a.m42603K2(activityC4831q, dialogInterface);
            }
        }).m1534r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public /* synthetic */ void m42605M2(ActivityC4831q activityC4831q, AbstractC5153k abstractC5153k) {
        if (activityC4831q == null || activityC4831q.isFinishing() || activityC4831q.isDestroyed()) {
            return;
        }
        m42602I2();
        m42616e3(abstractC5153k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public /* synthetic */ void m42606N2(ActivityC4831q activityC4831q, String str) {
        if (activityC4831q.isFinishing() || activityC4831q.isDestroyed()) {
            return;
        }
        this.f40202f0.setText(str);
        this.f40203g0.loadUrl(str);
    }

    /* JADX INFO: renamed from: U2 */
    public static void m42607U2() {
        C6124q.m27066k("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public boolean m42608V2(String str) {
        C13819b c13819b = new C13819b("rbx.web");
        if (!c13819b.m50303b(str)) {
            return false;
        }
        c13819b.m50302a(m4693p(), str, str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public void m42609a3(final String str) {
        DomainAllowListChecker domainAllowListChecker = DomainAllowListChecker.f12674a;
        if (domainAllowListChecker.isKnownTrustedDomain(str, this.f40220x0)) {
            m42600C2(str, false);
        } else {
            domainAllowListChecker.checkDomainAllowList(str, this.f40220x0, new DomainAllowListChecker.Callback() { // from class: sg.s1
                @Override // com.roblox.protocols.webview.DomainAllowListChecker.Callback
                public final void onResult(DomainAllowListChecker.EnumC3335a enumC3335a) {
                    this.f40154a.m42645P2(str, enumC3335a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public void m42612c3(String str, boolean z10) {
        if (str.contains("sponsored")) {
            this.f40203g0.getSettings().setBuiltInZoomControls(z10);
        } else {
            this.f40203g0.getSettings().setBuiltInZoomControls(!z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public void m42614d3() {
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: sg.x1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40192a.m42648S2(activityC4831qM4693p);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: ej.k */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e3 */
    private void m42616e3(AbstractC5153k abstractC5153k) {
        boolean zContains;
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p == null) {
            return;
        }
        if (C11659h.m43403a().mo43679m5()) {
            zContains = C11659h.m43403a().mo43489M0().contains(((InterfaceC5148f) abstractC5153k).mo23964a());
        } else {
            zContains = false;
        }
        C6124q.m27057b("rbx.web", "isBonusItemEnabled = " + zContains);
        CharSequence charSequenceMo23984c = abstractC5153k.mo23984c(activityC4831qM4693p);
        if (abstractC5153k.mo23986f()) {
            m42635y2(charSequenceMo23984c);
            return;
        }
        try {
            if (!zContains) {
                m42639D2().m14969W(charSequenceMo23984c.toString());
                return;
            }
            m42639D2().m14961F1(m4666e0(C11347q0.f40012t1), m4666e0(C11347q0.f40015u1));
        } catch (C11359u0 unused) {
            m42607U2();
        }
    }

    /* JADX INFO: renamed from: o2 */
    public static /* bridge */ /* synthetic */ h m42626o2(C11372y1 c11372y1) {
        c11372y1.getClass();
        return null;
    }

    /* JADX INFO: renamed from: w2 */
    private void m42634w2(final String str) {
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p == null || activityC4831qM4693p.isFinishing() || activityC4831qM4693p.isDestroyed()) {
            return;
        }
        activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: sg.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f40169a.m42604L2(activityC4831qM4693p, str);
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    private synchronized void m42635y2(CharSequence charSequence) {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p == null) {
            return;
        }
        DialogInterfaceC0408a dialogInterfaceC0408aM1517a = new DialogInterfaceC0408a.a(activityC4831qM4693p).m1517a();
        TextView textView = new TextView(activityC4831qM4693p);
        String string = activityC4831qM4693p.getString(C11347q0.f39945W);
        int iIndexOf = charSequence.toString().indexOf(string);
        C6413b.m28003b(textView, charSequence.toString(), new C6414c(activityC4831qM4693p, null, string, iIndexOf, iIndexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        dialogInterfaceC0408aM1517a.m1516w(textView, 150, 100, 150, 100);
        dialogInterfaceC0408aM1517a.setCanceledOnTouchOutside(true);
        try {
            dialogInterfaceC0408aM1517a.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* JADX INFO: renamed from: z2 */
    private ProgressDialog m42636z2(Context context, String str, String str2) {
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
    /* JADX INFO: renamed from: A0 */
    public void mo4584A0(int i10, int i11, Intent intent) {
        if (i10 == 20123) {
            if (i11 == -1) {
                this.f40213q0.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                C6124q.m27063h("rbx.web", "Result of file chooser invalid.");
                this.f40213q0.onReceiveValue(null);
            }
        }
    }

    /* JADX INFO: renamed from: A2 */
    public RBHybridWebView m42637A2() {
        RBHybridWebView c6812a = this.f40214r0 ? new C6812a(mo4715x()) : new RBHybridWebView(mo4715x());
        if (C11659h.m43403a().mo43530S1()) {
            C12483e.m46756r(C11295a1.m42410O());
        }
        return c6812a;
    }

    /* JADX INFO: renamed from: B2 */
    public void m42638B2() {
        if (m4693p() != null) {
            m4693p().m23360l1().m4416a1();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: D2 */
    public AbstractActivityC3152a m42639D2() throws C11359u0 {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p instanceof AbstractActivityC3152a) {
            return (AbstractActivityC3152a) activityC4831qM4693p;
        }
        throw new C11359u0();
    }

    /* JADX INFO: renamed from: E2 */
    public boolean m42640E2(String str, boolean z10) {
        Bundle bundleM4704t = m4704t();
        return bundleM4704t != null ? bundleM4704t.getBoolean(str, z10) : z10;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        C11863b.m44278a().m26215n(this);
        Bundle bundleM4704t = m4704t();
        if (bundleM4704t != null) {
            String string = bundleM4704t.getString("DEFAULT_URL", null);
            C6124q.m27057b("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                this.f40208l0 = string;
                if (this.f40205i0 == null) {
                    this.f40205i0 = string;
                    if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
                        this.f40220x0 = string;
                    }
                }
            }
            this.f40209m0 = bundleM4704t.getString("WEB_VIEW_TAG", null);
            this.f40214r0 = bundleM4704t.getBoolean("USE_APP_HYBRID");
        }
    }

    /* JADX INFO: renamed from: F2 */
    public String mo42641F2() {
        return "undefinedWebContext";
    }

    /* JADX INFO: renamed from: G2 */
    public boolean m42642G2() {
        RBHybridWebView rBHybridWebView = this.f40203g0;
        if (rBHybridWebView == null || !rBHybridWebView.canGoBack()) {
            return false;
        }
        m42612c3(this.f40203g0.getUrl(), false);
        this.f40203g0.goBack();
        return true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z10 = C11659h.m43403a().mo43426D0() && m42640E2("hideNativeHeader", false);
        this.f40215s0 = z10;
        View viewInflate = layoutInflater.inflate(z10 ? C11338n0.f39867n : C11338n0.f39866m, viewGroup, false);
        int i10 = C11335m0.f39812i0;
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(i10);
        this.f40202f0 = (TextView) viewInflate.findViewById(C11335m0.f39838v0);
        i iVar = new i();
        this.f40203g0 = m42637A2();
        if (C11659h.m43403a().mo43662k2()) {
            this.f40203g0.setCommandListener(new C11367x());
        }
        viewGroup2.addView(this.f40203g0, new ViewGroup.LayoutParams(-1, -1));
        this.f40203g0.setTag(this.f40209m0);
        this.f40203g0.setWebViewClient(iVar);
        this.f40203g0.getSettings().setSupportMultipleWindows(true);
        this.f40203g0.setWebChromeClient(new a());
        this.f40203g0.getSettings().setJavaScriptEnabled(true);
        this.f40203g0.getSettings().setDomStorageEnabled(true);
        this.f40203g0.getSettings().setUserAgentString(C11295a1.m42433Z0());
        this.f40203g0.getSettings().setCacheMode(-1);
        this.f40203g0.setHorizontalScrollBarEnabled(false);
        this.f40203g0.setVerticalScrollBarEnabled(false);
        if (C9476b.m37333a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (this.f40205i0 != null) {
            if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
                m42609a3(this.f40205i0);
            } else {
                this.f40203g0.loadUrl(this.f40205i0);
            }
            this.f40205i0 = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(i10);
        this.f40204h0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f40204h0;
        int i11 = C11326j0.f39711b;
        int i12 = C11326j0.f39726q;
        swipeRefreshLayout2.setColorSchemeResources(i11, i11, i12, i12);
        this.f40211o0 = (FrameLayout) viewInflate.findViewById(C11335m0.f39814j0);
        Bundle bundleM4704t = m4704t();
        if (bundleM4704t != null) {
            this.f40206j0 = bundleM4704t.getInt("dialogHeight", 0);
            this.f40207k0 = bundleM4704t.getInt("dialogWidth", 0);
            if (!bundleM4704t.getBoolean("enablePullToRefresh", true)) {
                this.f40204h0.setEnabled(false);
            }
            this.f40212p0 = bundleM4704t.getBoolean("USING_LOGIN_WEB_URL", false);
            this.f40218v0 = bundleM4704t.getBoolean("VISIBLE", true);
            this.f40217u0 = bundleM4704t.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        try {
            m42639D2().m14844N1();
        } catch (C11359u0 unused) {
            m42607U2();
        }
        this.f40203g0.mo15288h();
        if (this.f40215s0) {
            m42654b3(viewInflate);
        }
        return viewInflate;
    }

    /* JADX INFO: renamed from: J2 */
    public boolean m42643J2() {
        return this.f40217u0;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: K0 */
    public void mo4613K0() {
        C11863b.m44278a().m26217p(this);
        super.mo4613K0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: M0 */
    public void mo4618M0() {
        super.mo4618M0();
        this.f40203g0.mo15289i();
    }

    /* JADX INFO: renamed from: O2 */
    public final /* synthetic */ void m42644O2(ActivityC4831q activityC4831q) {
        ProgressDialog progressDialog;
        if (activityC4831q == null || activityC4831q.isFinishing() || activityC4831q.isDestroyed() || (progressDialog = this.f40210n0) == null || !progressDialog.isShowing()) {
            return;
        }
        this.f40210n0.dismiss();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: P0 */
    public void mo4627P0(boolean z10) {
        super.mo4627P0(z10);
        if (z10 || !C12209m.m45193b().m45194a(this.f40203g0.getUrl())) {
            return;
        }
        this.f40203g0.reload();
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m42645P2(String str, DomainAllowListChecker.EnumC3335a enumC3335a) {
        int i10 = f.f40228a[enumC3335a.ordinal()];
        if (i10 == 1) {
            m42600C2(str, false);
            return;
        }
        if (i10 == 2) {
            m42600C2(str, true);
        } else if (i10 == 3 || i10 == 4) {
            m42634w2(str);
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m42646Q2(View view) {
        m42638B2();
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ WindowInsetsCompat m42647R2(int i10, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40216t0.getLayoutParams();
        layoutParams.topMargin = i10 + insets.top;
        this.f40216t0.setLayoutParams(layoutParams);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m42648S2(ActivityC4831q activityC4831q) {
        if (activityC4831q == null || activityC4831q.isFinishing() || activityC4831q.isDestroyed()) {
            return;
        }
        if (this.f40210n0 == null) {
            this.f40210n0 = m42636z2(activityC4831q, null, m4666e0(C11347q0.f39931P));
        }
        this.f40210n0.show();
    }

    /* JADX INFO: renamed from: T2 */
    public void m42649T2(String str) {
        C12173c0.m45034w(mo42656g3(), str);
        if (this.f40203g0 == null) {
            this.f40205i0 = str;
        } else if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
            m42609a3(str);
        } else {
            this.f40203g0.loadUrl(str);
        }
        if (DomainAllowListChecker.f12674a.enableDomainAllowListChecker()) {
            this.f40220x0 = str;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: V0 */
    public void mo4643V0() {
        super.mo4643V0();
        RBHybridWebView rBHybridWebView = this.f40203g0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onPause();
        }
    }

    /* JADX INFO: renamed from: W2 */
    public void m42650W2(String str) {
    }

    /* JADX INFO: renamed from: X2 */
    public void m42651X2(String str) {
    }

    /* JADX INFO: renamed from: Y2 */
    public void m42652Y2(WebView webView, int i10) {
    }

    /* JADX INFO: renamed from: Z2 */
    public final int m42653Z2(EnumC9799a enumC9799a) {
        int iM33005c;
        boolean z10 = enumC9799a == EnumC9799a.DARK;
        AndroidColorToken androidColorTokenMo29191b = this.f40219w0.mo29191b("Surface.Surface_0");
        if (androidColorTokenMo29191b != null) {
            iM33005c = z10 ? androidColorTokenMo29191b.getDark() : androidColorTokenMo29191b.getLight();
        } else {
            iM33005c = z10 ? C7975b.m33005c(mo4715x(), C11326j0.f39717h) : C7975b.m33005c(mo4715x(), C11326j0.f39726q);
        }
        return C0546c.m2678l(iM33005c, 235);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: a1 */
    public void mo4658a1() {
        super.mo4658a1();
        RBHybridWebView rBHybridWebView = this.f40203g0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onResume();
        }
    }

    /* JADX INFO: renamed from: b3 */
    public void m42654b3(View view) {
        ImageView imageView = (ImageView) view.findViewById(C11335m0.f39772D);
        this.f40216t0 = imageView;
        if (!this.f40215s0 || imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f40216t0.setImageResource(new RobloxToolbar.C3171c().mo15079a(C5654c.m25669c().m25675g()));
        this.f40216t0.setOnClickListener(new View.OnClickListener() { // from class: sg.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f39895a.m42646Q2(view2);
            }
        });
        m42655f3(C5654c.m25669c().m25675g());
        final int i10 = (int) (m4637T().getDisplayMetrics().density * 10.0f);
        C0625o0.m2979A0(view, new InterfaceC0644y() { // from class: sg.q1
            @Override // androidx.core.view.InterfaceC0644y
            /* JADX INFO: renamed from: K */
            public final WindowInsetsCompat mo460K(View view2, WindowInsetsCompat windowInsetsCompat) {
                return this.f40031a.m42647R2(i10, view2, windowInsetsCompat);
            }
        });
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        super.mo4665d1();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1088j
    /* JADX INFO: renamed from: e */
    public void mo6173e() {
        if (m4693p() != null) {
            if (((AbstractActivityC3152a) m4693p()).m14844N1()) {
                this.f40204h0.setRefreshing(false);
            } else {
                this.f40203g0.reload();
            }
        }
    }

    /* JADX INFO: renamed from: f3 */
    public void m42655f3(EnumC9799a enumC9799a) {
        if (this.f40216t0 == null) {
            return;
        }
        int iM42653Z2 = m42653Z2(enumC9799a);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(iM42653Z2);
        this.f40216t0.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: g3 */
    public C12173c0.b mo42656g3() {
        return C12173c0.b.WEB_FRAGMENT;
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(C11862a c11862a) {
        if (this.f40203g0 != null) {
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ej.k */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x2 */
    public void mo42657x2(final AbstractC5153k abstractC5153k) {
        if (C11659h.m43403a().mo43703q1() && (abstractC5153k instanceof InterfaceC5148f)) {
            InterfaceC5148f interfaceC5148f = (InterfaceC5148f) abstractC5153k;
            String strMo23965b = interfaceC5148f.mo23965b();
            if (!strMo23965b.isEmpty()) {
                NativeGLInterface.nativeMarketplacePurchaseFinished(abstractC5153k.mo23985d(), interfaceC5148f.mo23964a().toString(), strMo23965b);
            }
        }
        final ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            activityC4831qM4693p.runOnUiThread(new Runnable() { // from class: sg.o1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39889a.m42605M2(activityC4831qM4693p, abstractC5153k);
                }
            });
        }
    }
}
