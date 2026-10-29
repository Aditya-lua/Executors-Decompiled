package ak;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.roblox.protocols.webview.WebViewProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002\u0018\u001aB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 ¨\u0006#"}, d2 = {"Lak/a0;", "Lwg/c$d;", "Lcom/roblox/protocols/webview/a$f;", "Lj/b;", "activity", "", "containerViewId", "Lkm/f;", "linkingProtocol", "Lyi/a;", "nativeViewModel", "<init>", "(Lj/b;ILkm/f;Lyi/a;)V", "", "i", "()Z", "Lnl/a;", "params", "", "g", "(Lnl/a;)V", "d", "e", "()V", "a", "Lj/b;", "b", "I", "c", "Lkm/f;", "Lyi/a;", "Lcom/roblox/protocols/webview/WebViewProtocol;", "Lcom/roblox/protocols/webview/WebViewProtocol;", "webViewProtocol", "f", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 implements wg.c.d, com.roblox.protocols.webview.a.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j.b activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int containerViewId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final km.f linkingProtocol;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yi.a nativeViewModel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WebViewProtocol webViewProtocol;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lak/a0$a;", "Lvh/e;", "<init>", "()V", "Lmi/c;", "w2", "()Lmi/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "u2", "()Z", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends vh.e {
        @Override // vh.e, com.roblox.client.c, androidx.fragment.app.c
        @NotNull
        public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            mi.c cVar = this.G0;
            Bundle bundleT = t();
            cVar.o(Intrinsics.c(bundleT != null ? Boolean.valueOf(bundleT.getBoolean("KEY_APP_MODE")) : null, Boolean.TRUE) ? wh.t0.EXPERIENCE : wh.t0.APP);
            View viewX2 = x2(inflater, super.J0(inflater, container, savedInstanceState));
            Intrinsics.checkNotNullExpressionValue(viewX2, "createInsetView(...)");
            return viewX2;
        }

        @Override // sg.x0
        public boolean u2() {
            return false;
        }

        @Override // sg.x0
        @NotNull
        public mi.c w2() {
            return new mi.c();
        }
    }

    /* JADX INFO: renamed from: ak.a0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lak/a0$b;", "", "<init>", "()V", "Lnl/a;", "params", "", "isInExperience", "Landroid/os/Bundle;", "a", "(Lnl/a;Z)Landroid/os/Bundle;", "", "TAG", "Ljava/lang/String;", "FRAGMENT_TAG", "APP_MODE", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle a(@NotNull nl.a params, boolean isInExperience) {
            Intrinsics.checkNotNullParameter(params, "params");
            Bundle bundle = new Bundle();
            bundle.putString("DEFAULT_URL", params.f26298a);
            bundle.putBoolean("USE_APP_HYBRID", true);
            Boolean visible = params.f26299c;
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            bundle.putBoolean("VISIBLE", visible.booleanValue());
            Boolean backNavigationDisabled = params.f26301e;
            Intrinsics.checkNotNullExpressionValue(backNavigationDisabled, "backNavigationDisabled");
            bundle.putBoolean("BACK_NAVIGATION_DISABLED", backNavigationDisabled.booleanValue());
            bundle.putString("TITLE_STRING", params.b);
            bundle.putBoolean("HAS_PARENT", true);
            bundle.putBoolean("HIDE_ACCESSORY_BUTTONS", true);
            Boolean showDomainAsTitle = params.f26302f;
            Intrinsics.checkNotNullExpressionValue(showDomainAsTitle, "showDomainAsTitle");
            bundle.putBoolean("SHOW_DOMAIN_AS_TITLE", showDomainAsTitle.booleanValue());
            if (th.h.a().X0()) {
                bundle.putBoolean("CLOSE_FRAGMENT_ON_RESTORED", true);
                bundle.putBoolean("ENABLE_WEB_VIEW_SERVICE", true);
                Boolean bool = params.f26303g;
                bundle.putBoolean("hideNativeHeader", bool != null ? bool.booleanValue() : false);
            }
            bundle.putBoolean("KEY_APP_MODE", isInExperience);
            return bundle;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ak/a0$c", "Lcom/roblox/client/c$j;", "", "url", "", "b", "(Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements com.roblox.client.c.j {
        public c() {
        }

        @Override // com.roblox.client.c.j
        public void b(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            a0.this.e();
            if (th.h.a().w() && th.h.a().a5()) {
                a0.this.linkingProtocol.d(url, "android_webview");
            }
            a0.this.linkingProtocol.e(url);
        }
    }

    public a0(@NotNull j.b activity, int i10, @NotNull km.f linkingProtocol, @NotNull yi.a nativeViewModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(linkingProtocol, "linkingProtocol");
        Intrinsics.checkNotNullParameter(nativeViewModel, "nativeViewModel");
        this.activity = activity;
        this.containerViewId = i10;
        this.linkingProtocol = linkingProtocol;
        this.nativeViewModel = nativeViewModel;
        this.webViewProtocol = new WebViewProtocol(this);
    }

    public static final void f(a0 a0Var, String str) {
        a0Var.webViewProtocol.u(str);
    }

    public static final Unit h(com.roblox.client.c cVar, a0 a0Var, e.m0 addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        gk.p.b("BrowserServiceAdapter", "handleOnBackPressed: ... (1) It is RobloxWebDialogFragment:");
        if (cVar.h3() || !cVar.e3()) {
            a0Var.webViewProtocol.v();
        }
        return Unit.f22483a;
    }

    private final boolean i() {
        FragmentManager fragmentManagerL1 = this.activity.l1();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerL1, "getSupportFragmentManager(...)");
        if (fragmentManagerL1.U0() || fragmentManagerL1.u0() == 0) {
            return false;
        }
        if (th.h.a().X0()) {
            fragmentManagerL1.c1(null, 1);
        } else {
            fragmentManagerL1.a1();
        }
        return true;
    }

    @Override // wg.c.d, com.roblox.protocols.webview.a.f
    public void d(@NotNull nl.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        androidx.fragment.app.c cVarN0 = this.activity.l1().n0("WebDialogFragment_BrowserService");
        com.roblox.client.c cVar = cVarN0 instanceof com.roblox.client.c ? (com.roblox.client.c) cVarN0 : null;
        if (cVar != null) {
            gk.p.h("BrowserServiceAdapter", "updateWebView: Found the fragment. Updating...");
            cVar.H3(params);
        }
    }

    @Override // wg.c.d, com.roblox.protocols.webview.a.f
    public void e() {
        WebViewProtocol webViewProtocol;
        gk.p.h("BrowserServiceAdapter", "closeWebView:");
        if (!th.h.a().X0()) {
            i();
        } else {
            if (!i() || (webViewProtocol = this.webViewProtocol) == null) {
                return;
            }
            webViewProtocol.v();
        }
    }

    @Override // wg.c.d, com.roblox.protocols.webview.a.f
    public void g(@NotNull nl.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        gk.p.b("BrowserServiceAdapter", "openWebView: params = " + params);
        boolean zC = Intrinsics.c(params.f26300d, Boolean.TRUE);
        final com.roblox.client.c y0Var = zC ? new sg.y0() : new a();
        androidx.p000lifecycle.l lVarA = y0Var.a();
        lVarA.a(new wg.b());
        lVarA.a(new wg.a());
        y0Var.O1(INSTANCE.a(params, this.nativeViewModel.a().getValue().booleanValue()));
        if (th.h.a().X0()) {
            y0Var.B3(new com.roblox.client.c.i() { // from class: ak.y
                @Override // com.roblox.client.c.i
                public final void a(String str) {
                    a0.f(this.f662a, str);
                }
            });
            e.q0.b(this.activity.Q(), y0Var, false, new Function1() { // from class: ak.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return a0.h(y0Var, this, (e.m0) obj);
                }
            }, 2, null);
        }
        y0Var.C3(new c());
        FragmentManager fragmentManagerL1 = this.activity.l1();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerL1, "getSupportFragmentManager(...)");
        androidx.fragment.app.h hVarR = fragmentManagerL1.r();
        if (!zC) {
            hVarR.q(sg.g0.b, sg.g0.f30764a);
        }
        hVarR.o(this.containerViewId, y0Var, "WebDialogFragment_BrowserService");
        hVarR.f(null);
        hVarR.h();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a0(j.b bVar, int i10, km.f fVar, yi.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 4) != 0) {
            fVar = km.f.v();
            Intrinsics.checkNotNullExpressionValue(fVar, "sharedInstance(...)");
        }
        this(bVar, i10, fVar, (i11 & 8) != 0 ? yi.a.f35889a : aVar);
    }
}
