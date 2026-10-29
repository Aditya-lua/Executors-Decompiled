package p015ak;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0934h;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.AbstractC0966l;
import com.roblox.client.C3161c;
import com.roblox.protocols.webview.C3340a;
import com.roblox.protocols.webview.WebViewProtocol;
import km.C7635f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nl.C9492a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p088e.AbstractC4717m0;
import p088e.C4725q0;
import p151gk.C6124q;
import p203j.ActivityC6992b;
import p293mi.C8527c;
import p491vh.C12201e;
import p516wg.C12419a;
import p516wg.C12420b;
import p516wg.C12421c;
import p517wh.EnumC12462t0;
import p577yi.C13192a;
import sg.C11317g0;
import sg.C11371y0;
import th.C11659h;

/* JADX INFO: renamed from: ak.a0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002\u0018\u001aB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 ¨\u0006#"}, m31665d2 = {"Lak/a0;", "Lwg/c$d;", "Lcom/roblox/protocols/webview/a$f;", "Lj/b;", "activity", "", "containerViewId", "Lkm/f;", "linkingProtocol", "Lyi/a;", "nativeViewModel", "<init>", "(Lj/b;ILkm/f;Lyi/a;)V", "", "i", "()Z", "Lnl/a;", "params", "", "g", "(Lnl/a;)V", "d", "e", "()V", "a", "Lj/b;", "b", "I", "c", "Lkm/f;", "Lyi/a;", "Lcom/roblox/protocols/webview/WebViewProtocol;", "Lcom/roblox/protocols/webview/WebViewProtocol;", "webViewProtocol", "f", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C0265a0 implements C12421c.d, C3340a.f {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ActivityC6992b activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int containerViewId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C7635f linkingProtocol;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C13192a nativeViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final WebViewProtocol webViewProtocol;

    /* JADX INFO: renamed from: ak.a0$a */
    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lak/a0$a;", "Lvh/e;", "<init>", "()V", "Lmi/c;", "w2", "()Lmi/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "u2", "()Z", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends C12201e {
        @Override // p491vh.C12201e, com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
        @NotNull
        /* JADX INFO: renamed from: J0 */
        public View mo1225J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            C8527c c8527c = this.f40185G0;
            Bundle bundleM4704t = m4704t();
            c8527c.m34408o(Intrinsics.m31980c(bundleM4704t != null ? Boolean.valueOf(bundleM4704t.getBoolean("KEY_APP_MODE")) : null, Boolean.TRUE) ? EnumC12462t0.EXPERIENCE : EnumC12462t0.APP);
            View viewM42578x2 = m42578x2(inflater, super.mo1225J0(inflater, container, savedInstanceState));
            Intrinsics.checkNotNullExpressionValue(viewM42578x2, "createInsetView(...)");
            return viewM42578x2;
        }

        @Override // sg.C11368x0
        /* JADX INFO: renamed from: u2 */
        public boolean mo1226u2() {
            return false;
        }

        @Override // sg.C11368x0
        @NotNull
        /* JADX INFO: renamed from: w2 */
        public C8527c mo1227w2() {
            return new C8527c();
        }
    }

    /* JADX INFO: renamed from: ak.a0$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m31665d2 = {"Lak/a0$b;", "", "<init>", "()V", "Lnl/a;", "params", "", "isInExperience", "Landroid/os/Bundle;", "a", "(Lnl/a;Z)Landroid/os/Bundle;", "", "TAG", "Ljava/lang/String;", "FRAGMENT_TAG", "APP_MODE", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: ak.a0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Bundle m1228a(@NotNull C9492a params, boolean isInExperience) {
            Intrinsics.checkNotNullParameter(params, "params");
            Bundle bundle = new Bundle();
            bundle.putString("DEFAULT_URL", params.f34108a);
            bundle.putBoolean("USE_APP_HYBRID", true);
            Boolean visible = params.f34110c;
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            bundle.putBoolean("VISIBLE", visible.booleanValue());
            Boolean backNavigationDisabled = params.f34112e;
            Intrinsics.checkNotNullExpressionValue(backNavigationDisabled, "backNavigationDisabled");
            bundle.putBoolean("BACK_NAVIGATION_DISABLED", backNavigationDisabled.booleanValue());
            bundle.putString("TITLE_STRING", params.f34109b);
            bundle.putBoolean("HAS_PARENT", true);
            bundle.putBoolean("HIDE_ACCESSORY_BUTTONS", true);
            Boolean showDomainAsTitle = params.f34113f;
            Intrinsics.checkNotNullExpressionValue(showDomainAsTitle, "showDomainAsTitle");
            bundle.putBoolean("SHOW_DOMAIN_AS_TITLE", showDomainAsTitle.booleanValue());
            if (C11659h.m43403a().mo43594b1()) {
                bundle.putBoolean("CLOSE_FRAGMENT_ON_RESTORED", true);
                bundle.putBoolean("ENABLE_WEB_VIEW_SERVICE", true);
                Boolean bool = params.f34114g;
                bundle.putBoolean("hideNativeHeader", bool != null ? bool.booleanValue() : false);
            }
            bundle.putBoolean("KEY_APP_MODE", isInExperience);
            return bundle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: ak.a0$c */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"ak/a0$c", "Lcom/roblox/client/c$j;", "", "url", "", "b", "(Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements C3161c.j {
        public c() {
        }

        @Override // com.roblox.client.C3161c.j
        /* JADX INFO: renamed from: b */
        public void mo1229b(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            C0265a0.this.mo1223e();
            if (!C11659h.m43403a().mo43610d1()) {
                if (C11659h.m43403a().mo43757y() && C11659h.m43403a().mo43637g5()) {
                    C0265a0.this.linkingProtocol.m31536d(url, "android_webview");
                }
                C0265a0.this.linkingProtocol.m31543k(url);
                return;
            }
            C0265a0.this.linkingProtocol.m31556x(url, "android_webview", false);
            String strM31541i = C0265a0.this.linkingProtocol.m31541i(url, "android_webview");
            if (strM31541i == null || strM31541i.length() == 0) {
                C0265a0.this.linkingProtocol.m31545m(url);
            } else {
                C0265a0.this.linkingProtocol.m31542j(strM31541i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0265a0(@NotNull ActivityC6992b activity, int i10, @NotNull C7635f linkingProtocol, @NotNull C13192a nativeViewModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(linkingProtocol, "linkingProtocol");
        Intrinsics.checkNotNullParameter(nativeViewModel, "nativeViewModel");
        this.activity = activity;
        this.containerViewId = i10;
        this.linkingProtocol = linkingProtocol;
        this.nativeViewModel = nativeViewModel;
        this.webViewProtocol = new WebViewProtocol(this);
    }

    /* JADX INFO: renamed from: f */
    public static final void m1219f(C0265a0 c0265a0, String str) {
        c0265a0.webViewProtocol.m15914u(str);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m1220h(C3161c c3161c, C0265a0 c0265a0, AbstractC4717m0 addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        C6124q.m27057b("BrowserServiceAdapter", "handleOnBackPressed: ... (1) It is RobloxWebDialogFragment:");
        if (c3161c.m15012h3() || !c3161c.mo15009e3()) {
            c0265a0.webViewProtocol.m15915v();
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m1221i() {
        FragmentManager fragmentManagerM23360l1 = this.activity.m23360l1();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerM23360l1, "getSupportFragmentManager(...)");
        if (fragmentManagerM23360l1.m4404U0() || fragmentManagerM23360l1.m4462u0() == 0) {
            return false;
        }
        if (C11659h.m43403a().mo43594b1()) {
            fragmentManagerM23360l1.m4420c1(null, 1);
        } else {
            fragmentManagerM23360l1.m4416a1();
        }
        return true;
    }

    @Override // p516wg.C12421c.d, com.roblox.protocols.webview.C3340a.f
    /* JADX INFO: renamed from: d */
    public void mo1222d(@NotNull C9492a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ComponentCallbacksC0929c componentCallbacksC0929cM4444n0 = this.activity.m23360l1().m4444n0("WebDialogFragment_BrowserService");
        C3161c c3161c = componentCallbacksC0929cM4444n0 instanceof C3161c ? (C3161c) componentCallbacksC0929cM4444n0 : null;
        if (c3161c != null) {
            C6124q.m27063h("BrowserServiceAdapter", "updateWebView: Found the fragment. Updating...");
            c3161c.mo15000H3(params);
        }
    }

    @Override // p516wg.C12421c.d, com.roblox.protocols.webview.C3340a.f
    /* JADX INFO: renamed from: e */
    public void mo1223e() {
        WebViewProtocol webViewProtocol;
        C6124q.m27063h("BrowserServiceAdapter", "closeWebView:");
        if (!C11659h.m43403a().mo43594b1()) {
            m1221i();
        } else {
            if (!m1221i() || (webViewProtocol = this.webViewProtocol) == null) {
                return;
            }
            webViewProtocol.m15915v();
        }
    }

    @Override // p516wg.C12421c.d, com.roblox.protocols.webview.C3340a.f
    /* JADX INFO: renamed from: g */
    public void mo1224g(@NotNull C9492a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C6124q.m27057b("BrowserServiceAdapter", "openWebView: params = " + params);
        boolean zM31980c = Intrinsics.m31980c(params.f34111d, Boolean.TRUE);
        final C3161c c11371y0 = zM31980c ? new C11371y0() : new a();
        AbstractC0966l abstractC0966lMo4656a = c11371y0.mo4656a();
        abstractC0966lMo4656a.mo4935a(new C12420b());
        abstractC0966lMo4656a.mo4935a(new C12419a());
        c11371y0.m4625O1(INSTANCE.m1228a(params, this.nativeViewModel.m48803a().getValue().booleanValue()));
        if (C11659h.m43403a().mo43594b1()) {
            c11371y0.m14994B3(new C3161c.i() { // from class: ak.y
                @Override // com.roblox.client.C3161c.i
                /* JADX INFO: renamed from: a */
                public final void mo1374a(String str) {
                    C0265a0.m1219f(this.f866a, str);
                }
            });
            C4725q0.m23086b(this.activity.mo23043Q(), c11371y0, false, new Function1() { // from class: ak.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C0265a0.m1220h(c11371y0, this, (AbstractC4717m0) obj);
                }
            }, 2, null);
        }
        c11371y0.m14995C3(new c());
        FragmentManager fragmentManagerM23360l1 = this.activity.m23360l1();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerM23360l1, "getSupportFragmentManager(...)");
        AbstractC0934h abstractC0934hM4452r = fragmentManagerM23360l1.m4452r();
        if (!zM31980c) {
            abstractC0934hM4452r.m4784q(C11317g0.f39699b, C11317g0.f39698a);
        }
        abstractC0934hM4452r.m4782o(this.containerViewId, c11371y0, "WebDialogFragment_BrowserService");
        abstractC0934hM4452r.m4779f(null);
        abstractC0934hM4452r.mo4509h();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0265a0(ActivityC6992b activityC6992b, int i10, C7635f c7635f, C13192a c13192a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 4) != 0) {
            c7635f = C7635f.m31524D();
            Intrinsics.checkNotNullExpressionValue(c7635f, "sharedInstance(...)");
        }
        this(activityC6992b, i10, c7635f, (i11 & 8) != 0 ? C13192a.f46459a : c13192a);
    }
}
