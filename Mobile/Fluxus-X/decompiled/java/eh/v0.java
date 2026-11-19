package eh;

import android.os.Debug;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import java.net.URI;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u001e#4B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001b\u0010(\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001b\u0010+\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\u001b\u0010.\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001b\u00101\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010!R\u001b\u00103\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b2\u0010!¨\u00065"}, d2 = {"Leh/v0;", BuildConfig.FLAVOR, "<init>", "()V", "Leh/v0$b;", "surface", BuildConfig.FLAVOR, "url", BuildConfig.FLAVOR, "w", "(Leh/v0$b;Ljava/lang/String;)V", "Leh/v0$c;", "outcome", "v", "(Leh/v0$c;)V", "r", "(Ljava/lang/String;)V", "u", "Leh/v0$a;", "closeSource", "q", "(Leh/v0$a;)V", "t", BuildConfig.FLAVOR, "level", "s", "(I)V", "h", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Lzt/h;", "l", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "urlOpenSourceSurfaceCounter", "c", "k", "urlHandlingCounter", "d", "i", "impressionCounter", "e", "j", "nativeMobileWebOpenCounter", "f", "m", "webClosedCounter", "g", "n", "webViewMemoryOnCloseCounter", "o", "webViewMemoryOnTrimCounter", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v0 f13627a = new v0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final zt.h urlOpenSourceSurfaceCounter = zt.i.a(new Function0() { // from class: eh.o0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v0.z();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h urlHandlingCounter = zt.i.a(new Function0() { // from class: eh.p0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v0.y();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h impressionCounter = zt.i.a(new Function0() { // from class: eh.q0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v0.p();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h nativeMobileWebOpenCounter = zt.i.a(new Function0() { // from class: eh.r0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v0.x();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h webClosedCounter = zt.i.a(new Function0() { // from class: eh.s0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v0.A();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h webViewMemoryOnCloseCounter = zt.i.a(new Function0() { // from class: eh.t0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v0.B();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h webViewMemoryOnTrimCounter = zt.i.a(new Function0() { // from class: eh.u0
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v0.C();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Leh/v0$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        CLOSE_BUTTON("close_button"),
        BACK_BUTTON("back_button"),
        PROGRAMMATIC("programmatic");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ hu.a f13637f = hu.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        a(String str) {
            this.value = str;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Leh/v0$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        BROWSER_SERVICE_BRIDGE("browser_service_bridge"),
        WEB_ACTIVITY("web_activity"),
        WEB_FRAGMENT("web_fragment"),
        WEB_DIALOG_FRAGMENT("web_dialog_fragment"),
        NOTIFICATION_STREAM_ACTIVITY("notification_stream_activity"),
        NOTIFICATION_STREAM_WEB_FRAGMENT("notification_stream_web_fragment"),
        RESET_PASSWORD_ACTIVITY("reset_password_activity"),
        ROBLOX_MODAL_WEB_FRAGMENT("roblox_modal_web_fragment"),
        ROBUX_PREMIUM_DIALOG_FRAGMENT("robux_premium_dialog_fragment"),
        ROBUX_PREMIUM_FRAGMENT("robux_premium_fragment"),
        GENERIC_WEB_FRAGMENT("generic_web_fragment");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ hu.a f13650n = hu.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        b(String str) {
            this.value = str;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Leh/v0$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        URL_NULL("url_null"),
        ACTIVITY_FINISHING("activity_finishing"),
        NETWORK_DISCONNECTED("network_disconnected"),
        WEB_LINK("web_link"),
        SOCIAL_MEDIA("social_media"),
        PASSWORD_RESET("password_reset"),
        SESSION_EXPIRED("session_expired"),
        PURCHASE("purchase"),
        DEEPLINK_INTERCEPT("deeplink_intercept"),
        FIRST_PARTY_LOAD("first_party_load"),
        SECOND_PARTY_LOAD("second_party_load"),
        THIRD_PARTY_EXTERNAL("third_party_external"),
        DEFAULT_LOAD("default_load");


        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ hu.a f13665p = hu.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        c(String str) {
            this.value = str;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    public static final TelemetryConfig A() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("web_closed_counter", p001kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 11);
        aVar.a("Counts how many times the user explicitly closes a GenericWebFragment (MOBAPP-2510)");
        return aVar.d();
    }

    public static final TelemetryConfig B() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("webview_memory_on_close_counter", p001kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 8, 18);
        aVar.a("Logs memory usage when a WebView is destroyed (dev builds only, MOBAPP-2891)");
        return aVar.d();
    }

    public static final TelemetryConfig C() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("webview_memory_on_trim_counter", p001kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 8, 18);
        aVar.a("Logs memory usage when onTrimMemory is triggered (dev builds only, MOBAPP-2891)");
        return aVar.d();
    }

    public static final TelemetryConfig p() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("webview_impression_counter", p001kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 3);
        aVar.a("Counter for webview impressions — page fully loaded and visible to the user");
        return aVar.d();
    }

    public static final void q(@NotNull a closeSource) {
        Intrinsics.checkNotNullParameter(closeSource, "closeSource");
        ok.q.b("WebViewAnalytics", "logCounter(web_closed_counter): closeSource=" + closeSource.getValue());
        TelemetryConfig telemetryConfigM = f13627a.m();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("close_source", closeSource.getValue());
        fn.c.g(telemetryConfigM, bVar.l(), 0.0d, 4, null);
    }

    public static final void r(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        v0 v0Var = f13627a;
        String strH = v0Var.h(url);
        ok.q.b("WebViewAnalytics", "logCounter(webview_impression_counter): url=" + strH);
        TelemetryConfig telemetryConfigI = v0Var.i();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("url", strH);
        fn.c.g(telemetryConfigI, bVar.l(), 0.0d, 4, null);
    }

    public static final void s(int level) {
        if (wh.b.a()) {
            Runtime runtime = Runtime.getRuntime();
            long j10 = 1048576;
            long jFreeMemory = (runtime.totalMemory() - runtime.freeMemory()) / j10;
            long jMaxMemory = runtime.maxMemory() / j10;
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / j10;
            ok.q.b("WebViewAnalytics", "logCounter(webview_memory_on_trim_counter): javaHeap=" + jFreeMemory + "MB native=" + nativeHeapAllocatedSize + "MB max=" + jMaxMemory + "MB trimLevel=" + level);
            TelemetryConfig telemetryConfigO = f13627a.o();
            fn.c cVar = fn.c.f16193a;
            fn.c.b bVar = new fn.c.b();
            bVar.c("java_heap_mb", String.valueOf(jFreeMemory));
            bVar.c("native_heap_mb", String.valueOf(nativeHeapAllocatedSize));
            bVar.c("java_heap_max_mb", String.valueOf(jMaxMemory));
            bVar.c("trim_level", String.valueOf(level));
            fn.c.g(telemetryConfigO, bVar.l(), 0.0d, 4, null);
        }
    }

    public static final void t() {
        if (wh.b.a()) {
            Runtime runtime = Runtime.getRuntime();
            long j10 = 1048576;
            long jFreeMemory = (runtime.totalMemory() - runtime.freeMemory()) / j10;
            long jMaxMemory = runtime.maxMemory() / j10;
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / j10;
            ok.q.b("WebViewAnalytics", "logCounter(webview_memory_on_close_counter): javaHeap=" + jFreeMemory + "MB native=" + nativeHeapAllocatedSize + "MB max=" + jMaxMemory + "MB");
            TelemetryConfig telemetryConfigN = f13627a.n();
            fn.c cVar = fn.c.f16193a;
            fn.c.b bVar = new fn.c.b();
            bVar.c("java_heap_mb", String.valueOf(jFreeMemory));
            bVar.c("native_heap_mb", String.valueOf(nativeHeapAllocatedSize));
            bVar.c("java_heap_max_mb", String.valueOf(jMaxMemory));
            fn.c.g(telemetryConfigN, bVar.l(), 0.0d, 4, null);
        }
    }

    public static final void u(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        v0 v0Var = f13627a;
        String strH = v0Var.h(url);
        ok.q.b("WebViewAnalytics", "logCounter(native_mobile_web_open_counter): url=" + strH);
        TelemetryConfig telemetryConfigJ = v0Var.j();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("url", strH);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        fn.c.g(telemetryConfigJ, bVar.l(), 0.0d, 4, null);
    }

    public static final void v(@NotNull c outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        ok.q.b("WebViewAnalytics", "logCounter(webview_url_handling_counter): outcome=" + outcome.getValue());
        TelemetryConfig telemetryConfigK = f13627a.k();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("outcome", outcome.getValue());
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        fn.c.g(telemetryConfigK, bVar.l(), 0.0d, 4, null);
    }

    public static final void w(@NotNull b surface, @NotNull String url) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(url, "url");
        v0 v0Var = f13627a;
        String strH = v0Var.h(url);
        ok.q.b("WebViewAnalytics", "logCounter(android_webview_url_open_counter): surface=" + surface.getValue() + " authorityAndPath=" + strH);
        TelemetryConfig telemetryConfigL = v0Var.l();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("surface", surface.getValue());
        bVar.c("url", strH);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        fn.c.g(telemetryConfigL, bVar.l(), 0.0d, 4, null);
    }

    public static final TelemetryConfig x() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("native_mobile_web_open_counter", p001kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 10);
        aVar.a("Tracks WebView sessions opened via the native openWindow protocol from the C++ engine (MOBAPP-2589)");
        return aVar.d();
    }

    public static final TelemetryConfig y() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("webview_url_handling_counter", p001kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 10);
        aVar.a("Tracks the outcome of every URL navigation decision in RobloxWebDialogFragment (MOBAPP-2589)");
        return aVar.d();
    }

    public static final TelemetryConfig z() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("android_webview_url_open_counter", p001kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 5, 27);
        aVar.a("Counts WebView opens per surface and URL scheme (MOBAPP-2516)");
        return aVar.d();
    }

    @NotNull
    public final String h(@NotNull String url) {
        Object objB;
        Object objB2;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            objB = zt.n.b(new URI(url));
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        if (zt.n.h(objB)) {
            try {
                URI uri = (URI) objB;
                String authority = uri.getAuthority();
                if (authority == null) {
                    throw new IllegalStateException(("URI authority is null for url: " + url).toString());
                }
                String path = uri.getPath();
                if (path == null) {
                    path = BuildConfig.FLAVOR;
                }
                objB2 = zt.n.b(new Pair(authority, StringsKt.q1(path, '/')));
            } catch (Throwable th3) {
                zt.n.Companion companion3 = zt.n.INSTANCE;
                objB2 = zt.n.b(zt.o.a(th3));
            }
        } else {
            objB2 = zt.n.b(objB);
        }
        if (zt.n.h(objB2)) {
            Pair pair = (Pair) objB2;
            objB2 = ((String) pair.a()) + "/" + ((String) pair.b());
        }
        Object objB3 = zt.n.b(objB2);
        Throwable thE = zt.n.e(objB3);
        if (thE == null) {
            String strP1 = StringsKt.p1((String) objB3, '/');
            return strP1.length() == 0 ? "unknown" : strP1;
        }
        ok.q.f("WebViewAnalytics", "Failed to extract authority and path from url", thE);
        return "unknown";
    }

    public final TelemetryConfig i() {
        return (TelemetryConfig) impressionCounter.getValue();
    }

    public final TelemetryConfig j() {
        return (TelemetryConfig) nativeMobileWebOpenCounter.getValue();
    }

    public final TelemetryConfig k() {
        return (TelemetryConfig) urlHandlingCounter.getValue();
    }

    public final TelemetryConfig l() {
        return (TelemetryConfig) urlOpenSourceSurfaceCounter.getValue();
    }

    public final TelemetryConfig m() {
        return (TelemetryConfig) webClosedCounter.getValue();
    }

    public final TelemetryConfig n() {
        return (TelemetryConfig) webViewMemoryOnCloseCounter.getValue();
    }

    public final TelemetryConfig o() {
        return (TelemetryConfig) webViewMemoryOnTrimCounter.getValue();
    }
}
