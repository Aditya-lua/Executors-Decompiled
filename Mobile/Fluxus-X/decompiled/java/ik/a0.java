package ik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.webview.WebViewProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002\u0018\u001aB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 ¨\u0006#"}, d2 = {"Lik/a0;", "Lfh/b$d;", "Lcom/roblox/protocols/webview/a$d;", "Lj/b;", "activity", BuildConfig.FLAVOR, "containerViewId", "Lym/g;", "linkingProtocol", "Lgj/a;", "nativeViewModel", "<init>", "(Lj/b;ILym/g;Lgj/a;)V", BuildConfig.FLAVOR, "i", "()Z", "Lbm/a;", "params", BuildConfig.FLAVOR, "d", "(Lbm/a;)V", "g", "e", "()V", "a", "Lj/b;", "b", "I", "c", "Lym/g;", "Lgj/a;", "Lcom/roblox/protocols/webview/WebViewProtocol;", "Lcom/roblox/protocols/webview/WebViewProtocol;", "webViewProtocol", "f", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 implements fh.b.d, com.roblox.protocols.webview.a.d {

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
    public final ym.g linkingProtocol;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gj.a nativeViewModel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WebViewProtocol webViewProtocol;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lik/a0$a;", "Ldi/d;", "<init>", "()V", "Lui/c;", "w2", "()Lui/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", BuildConfig.FLAVOR, "u2", "()Z", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends di.d {
        @Override // di.d, com.roblox.client.c, f4.q
        @NotNull
        public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            ui.c cVar = this.G0;
            Bundle bundleT = t();
            cVar.o(Intrinsics.c(bundleT != null ? Boolean.valueOf(bundleT.getBoolean("KEY_APP_MODE")) : null, Boolean.TRUE) ? ei.u0.EXPERIENCE : ei.u0.APP);
            View viewX2 = x2(inflater, super.J0(inflater, container, savedInstanceState));
            Intrinsics.checkNotNullExpressionValue(viewX2, "createInsetView(...)");
            return viewX2;
        }

        @Override // bh.x0
        public boolean u2() {
            return false;
        }

        @Override // bh.x0
        @NotNull
        public ui.c w2() {
            return new ui.c();
        }
    }

    /* JADX INFO: renamed from: ik.a0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lik/a0$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lbm/a;", "params", BuildConfig.FLAVOR, "isInExperience", "Landroid/os/Bundle;", "a", "(Lbm/a;Z)Landroid/os/Bundle;", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "FRAGMENT_TAG", "APP_MODE", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle a(@NotNull bm.a params, boolean isInExperience) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(params, "params");
            Bundle bundle = new Bundle();
            boolean zD3 = bi.h.a().D3();
            bundle.putString("DEFAULT_URL", params.f4456a);
            bundle.putBoolean("USE_APP_HYBRID", true);
            Boolean boolValueOf2 = params.f4457c;
            if (zD3) {
                boolValueOf2 = Boolean.valueOf(boolValueOf2 != null ? boolValueOf2.booleanValue() : true);
            }
            Intrinsics.checkNotNull(boolValueOf2);
            bundle.putBoolean("VISIBLE", boolValueOf2.booleanValue());
            Boolean boolValueOf3 = params.f4459e;
            if (zD3) {
                boolValueOf3 = Boolean.valueOf(boolValueOf3 != null ? boolValueOf3.booleanValue() : false);
            }
            Intrinsics.checkNotNull(boolValueOf3);
            bundle.putBoolean("BACK_NAVIGATION_DISABLED", boolValueOf3.booleanValue());
            bundle.putString("TITLE_STRING", params.b);
            bundle.putBoolean("HAS_PARENT", true);
            bundle.putBoolean("HIDE_ACCESSORY_BUTTONS", true);
            if (zD3) {
                Boolean bool = params.f4460f;
                boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            } else {
                boolValueOf = params.f4460f;
            }
            Intrinsics.checkNotNull(boolValueOf);
            bundle.putBoolean("SHOW_DOMAIN_AS_TITLE", boolValueOf.booleanValue());
            bundle.putBoolean("CLOSE_FRAGMENT_ON_RESTORED", true);
            Boolean bool2 = params.f4461g;
            bundle.putBoolean("hideNativeHeader", bool2 != null ? bool2.booleanValue() : false);
            bundle.putBoolean("KEY_APP_MODE", isInExperience);
            return bundle;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ik/a0$c", "Lcom/roblox/client/c$j;", BuildConfig.FLAVOR, "url", BuildConfig.FLAVOR, "b", "(Ljava/lang/String;)V", "deeplinkId", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements com.roblox.client.c.j {
        public c() {
        }

        @Override // com.roblox.client.c.j
        public void b(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            a0.this.e();
            if (bi.h.a().x() && bi.h.a().m5()) {
                a0.this.linkingProtocol.f(url, "android_webview");
            }
            a0.this.linkingProtocol.m(url);
        }

        @Override // com.roblox.client.c.j
        public void c(String url, String deeplinkId) {
            Intrinsics.checkNotNullParameter(url, "url");
            a0.this.e();
            a0.this.linkingProtocol.l(deeplinkId);
        }
    }

    public a0(@NotNull j.b activity, int i10, @NotNull ym.g linkingProtocol, @NotNull gj.a nativeViewModel) {
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
        a0Var.webViewProtocol.s(str);
    }

    public static final Unit h(com.roblox.client.c cVar, a0 a0Var, e.m0 addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        ok.q.b("BrowserServiceAdapter", "handleOnBackPressed: ... (1) It is RobloxWebDialogFragment:");
        if (cVar.h3() || !cVar.e3()) {
            a0Var.webViewProtocol.t();
        }
        return Unit.f21506a;
    }

    private final boolean i() {
        f4.k0 k0VarL1 = this.activity.l1();
        Intrinsics.checkNotNullExpressionValue(k0VarL1, "getSupportFragmentManager(...)");
        if (k0VarL1.U0() || k0VarL1.u0() == 0) {
            return false;
        }
        k0VarL1.c1(null, 1);
        return true;
    }

    @Override // fh.b.d, com.roblox.protocols.webview.a.d
    public void d(@NotNull bm.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        ok.q.b("BrowserServiceAdapter", "openWebView: params = " + params);
        boolean zC = Intrinsics.c(params.f4458d, Boolean.TRUE);
        final com.roblox.client.c y0Var = zC ? new bh.y0() : new a();
        y0Var.a().a(new fh.a());
        y0Var.O1(INSTANCE.a(params, this.nativeViewModel.a().getValue().booleanValue()));
        y0Var.B3(new com.roblox.client.c.i() { // from class: ik.y
            @Override // com.roblox.client.c.i
            public final void a(String str) {
                a0.f(this.f19625a, str);
            }
        });
        e.q0.b(this.activity.P(), y0Var, false, new Function1() { // from class: ik.z
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a0.h(y0Var, this, (e.m0) obj);
            }
        }, 2, null);
        y0Var.C3(new c());
        f4.k0 k0VarL1 = this.activity.l1();
        Intrinsics.checkNotNullExpressionValue(k0VarL1, "getSupportFragmentManager(...)");
        f4.t0 t0VarR = k0VarL1.r();
        if (!zC) {
            t0VarR.q(bh.g0.b, bh.g0.f4070a);
        }
        t0VarR.o(this.containerViewId, y0Var, "WebDialogFragment_BrowserService");
        t0VarR.f(null);
        t0VarR.h();
    }

    @Override // fh.b.d, com.roblox.protocols.webview.a.d
    public void e() {
        ok.q.h("BrowserServiceAdapter", "closeWebView:");
        if (i()) {
            this.webViewProtocol.t();
        }
    }

    @Override // fh.b.d, com.roblox.protocols.webview.a.d
    public void g(@NotNull bm.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        f4.q qVarN0 = this.activity.l1().n0("WebDialogFragment_BrowserService");
        com.roblox.client.c cVar = qVarN0 instanceof com.roblox.client.c ? (com.roblox.client.c) qVarN0 : null;
        if (cVar != null) {
            ok.q.h("BrowserServiceAdapter", "updateWebView: Found the fragment. Updating...");
            cVar.H3(params);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a0(j.b bVar, int i10, ym.g gVar, gj.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 4) != 0) {
            gVar = ym.g.G();
            Intrinsics.checkNotNullExpressionValue(gVar, "sharedInstance(...)");
        }
        this(bVar, i10, gVar, (i11 & 8) != 0 ? gj.a.f17755a : aVar);
    }
}
