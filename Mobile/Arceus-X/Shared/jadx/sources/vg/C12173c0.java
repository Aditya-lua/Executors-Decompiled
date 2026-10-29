package vg;

import android.os.Debug;
import androidx.core.os.EnvironmentCompat;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p151gk.C6124q;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p308nh.C9476b;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import sm.C11416c;

/* JADX INFO: renamed from: vg.c0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u001e#4B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001b\u0010(\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001b\u0010+\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\u001b\u0010.\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001b\u00101\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010!R\u001b\u00103\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b2\u0010!¨\u00065"}, m31665d2 = {"Lvg/c0;", "", "<init>", "()V", "Lvg/c0$b;", "surface", "", "url", "", "w", "(Lvg/c0$b;Ljava/lang/String;)V", "Lvg/c0$c;", "outcome", "v", "(Lvg/c0$c;)V", "r", "(Ljava/lang/String;)V", "u", "Lvg/c0$a;", "closeSource", "q", "(Lvg/c0$a;)V", "t", "", "level", "s", "(I)V", "h", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Ljt/h;", "l", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "urlOpenSourceSurfaceCounter", "c", "k", "urlHandlingCounter", "d", "i", "impressionCounter", "e", "j", "nativeMobileWebOpenCounter", "f", "m", "webClosedCounter", "g", "n", "webViewMemoryOnCloseCounter", "o", "webViewMemoryOnTrimCounter", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12173c0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12173c0 f42801a = new C12173c0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h urlOpenSourceSurfaceCounter = C7342i.m30456b(new Function0() { // from class: vg.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C12173c0.m45037z();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h urlHandlingCounter = C7342i.m30456b(new Function0() { // from class: vg.w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C12173c0.m45036y();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h impressionCounter = C7342i.m30456b(new Function0() { // from class: vg.x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C12173c0.m45027p();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h nativeMobileWebOpenCounter = C7342i.m30456b(new Function0() { // from class: vg.y
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C12173c0.m45035x();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h webClosedCounter = C7342i.m30456b(new Function0() { // from class: vg.z
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C12173c0.m45017A();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h webViewMemoryOnCloseCounter = C7342i.m30456b(new Function0() { // from class: vg.a0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C12173c0.m45018B();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h webViewMemoryOnTrimCounter = C7342i.m30456b(new Function0() { // from class: vg.b0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C12173c0.m45019C();
        }
    });

    /* JADX INFO: renamed from: vg.c0$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m31665d2 = {"Lvg/c0$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum a {
        CLOSE_BUTTON("close_button"),
        BACK_BUTTON("back_button"),
        PROGRAMMATIC("programmatic");


        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ InterfaceC10707a f42813f = C10708b.m40805a(m45046a());

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: vg.c0$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m31665d2 = {"Lvg/c0$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
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


        /* JADX INFO: renamed from: n */
        public static final /* synthetic */ InterfaceC10707a f42827n = C10708b.m40805a(m45048a());

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: vg.c0$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m31665d2 = {"Lvg/c0$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
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


        /* JADX INFO: renamed from: p */
        public static final /* synthetic */ InterfaceC10707a f42843p = C10708b.m40805a(m45050a());

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: A */
    public static final TelemetryConfig m45017A() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("web_closed_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 6, 11);
        aVar.mo42754a("Counts how many times the user explicitly closes a GenericWebFragment (MOBAPP-2510)");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: B */
    public static final TelemetryConfig m45018B() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("webview_memory_on_close_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 8, 18);
        aVar.mo42754a("Logs memory usage when a WebView is destroyed (dev builds only, MOBAPP-2891)");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: C */
    public static final TelemetryConfig m45019C() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("webview_memory_on_trim_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 8, 18);
        aVar.mo42754a("Logs memory usage when onTrimMemory is triggered (dev builds only, MOBAPP-2891)");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: p */
    public static final TelemetryConfig m45027p() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("webview_impression_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 6, 3);
        aVar.mo42754a("Counter for webview impressions — page fully loaded and visible to the user");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: q */
    public static final void m45028q(@NotNull a closeSource) {
        Intrinsics.checkNotNullParameter(closeSource, "closeSource");
        C6124q.m27057b("WebViewAnalytics", "logCounter(web_closed_counter): closeSource=" + closeSource.getValue());
        TelemetryConfig telemetryConfigM45043m = f42801a.m45043m();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("close_source", closeSource.getValue());
        C11416c.m42771g(telemetryConfigM45043m, bVar.m42785l(), 0.0d, 4, null);
    }

    /* JADX INFO: renamed from: r */
    public static final void m45029r(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C12173c0 c12173c0 = f42801a;
        String strM45038h = c12173c0.m45038h(url);
        C6124q.m27057b("WebViewAnalytics", "logCounter(webview_impression_counter): url=" + strM45038h);
        TelemetryConfig telemetryConfigM45039i = c12173c0.m45039i();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("url", strM45038h);
        C11416c.m42771g(telemetryConfigM45039i, bVar.m42785l(), 0.0d, 4, null);
    }

    /* JADX INFO: renamed from: s */
    public static final void m45030s(int level) {
        if (C9476b.m37333a()) {
            Runtime runtime = Runtime.getRuntime();
            long j10 = 1048576;
            long jFreeMemory = (runtime.totalMemory() - runtime.freeMemory()) / j10;
            long jMaxMemory = runtime.maxMemory() / j10;
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / j10;
            C6124q.m27057b("WebViewAnalytics", "logCounter(webview_memory_on_trim_counter): javaHeap=" + jFreeMemory + "MB native=" + nativeHeapAllocatedSize + "MB max=" + jMaxMemory + "MB trimLevel=" + level);
            TelemetryConfig telemetryConfigM45045o = f42801a.m45045o();
            C11416c c11416c = C11416c.f40393a;
            C11416c.b bVar = new C11416c.b();
            bVar.mo42759c("java_heap_mb", String.valueOf(jFreeMemory));
            bVar.mo42759c("native_heap_mb", String.valueOf(nativeHeapAllocatedSize));
            bVar.mo42759c("java_heap_max_mb", String.valueOf(jMaxMemory));
            bVar.mo42759c("trim_level", String.valueOf(level));
            C11416c.m42771g(telemetryConfigM45045o, bVar.m42785l(), 0.0d, 4, null);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m45031t() {
        if (C9476b.m37333a()) {
            Runtime runtime = Runtime.getRuntime();
            long j10 = 1048576;
            long jFreeMemory = (runtime.totalMemory() - runtime.freeMemory()) / j10;
            long jMaxMemory = runtime.maxMemory() / j10;
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / j10;
            C6124q.m27057b("WebViewAnalytics", "logCounter(webview_memory_on_close_counter): javaHeap=" + jFreeMemory + "MB native=" + nativeHeapAllocatedSize + "MB max=" + jMaxMemory + "MB");
            TelemetryConfig telemetryConfigM45044n = f42801a.m45044n();
            C11416c c11416c = C11416c.f40393a;
            C11416c.b bVar = new C11416c.b();
            bVar.mo42759c("java_heap_mb", String.valueOf(jFreeMemory));
            bVar.mo42759c("native_heap_mb", String.valueOf(nativeHeapAllocatedSize));
            bVar.mo42759c("java_heap_max_mb", String.valueOf(jMaxMemory));
            C11416c.m42771g(telemetryConfigM45044n, bVar.m42785l(), 0.0d, 4, null);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m45032u(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C12173c0 c12173c0 = f42801a;
        String strM45038h = c12173c0.m45038h(url);
        C6124q.m27057b("WebViewAnalytics", "logCounter(native_mobile_web_open_counter): url=" + strM45038h);
        TelemetryConfig telemetryConfigM45040j = c12173c0.m45040j();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("url", strM45038h);
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42771g(telemetryConfigM45040j, bVar.m42785l(), 0.0d, 4, null);
    }

    /* JADX INFO: renamed from: v */
    public static final void m45033v(@NotNull c outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        C6124q.m27057b("WebViewAnalytics", "logCounter(webview_url_handling_counter): outcome=" + outcome.getValue());
        TelemetryConfig telemetryConfigM45041k = f42801a.m45041k();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("outcome", outcome.getValue());
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42771g(telemetryConfigM45041k, bVar.m42785l(), 0.0d, 4, null);
    }

    /* JADX INFO: renamed from: w */
    public static final void m45034w(@NotNull b surface, @NotNull String url) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(url, "url");
        C12173c0 c12173c0 = f42801a;
        String strM45038h = c12173c0.m45038h(url);
        C6124q.m27057b("WebViewAnalytics", "logCounter(android_webview_url_open_counter): surface=" + surface.getValue() + " authorityAndPath=" + strM45038h);
        TelemetryConfig telemetryConfigM45042l = c12173c0.m45042l();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("surface", surface.getValue());
        bVar.mo42759c("url", strM45038h);
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42771g(telemetryConfigM45042l, bVar.m42785l(), 0.0d, 4, null);
    }

    /* JADX INFO: renamed from: x */
    public static final TelemetryConfig m45035x() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("native_mobile_web_open_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 6, 10);
        aVar.mo42754a("Tracks WebView sessions opened via the native openWindow protocol from the C++ engine (MOBAPP-2589)");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: y */
    public static final TelemetryConfig m45036y() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("webview_url_handling_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 6, 10);
        aVar.mo42754a("Tracks the outcome of every URL navigation decision in RobloxWebDialogFragment (MOBAPP-2589)");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: z */
    public static final TelemetryConfig m45037z() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("android_webview_url_open_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 5, 27);
        aVar.mo42754a("Counts WebView opens per surface and URL scheme (MOBAPP-2516)");
        return aVar.m42774d();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m45038h(@NotNull String url) {
        Object objM30460b;
        Object objM30460b2;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(new URI(url));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30466h(objM30460b)) {
            try {
                URI uri = (URI) objM30460b;
                String authority = uri.getAuthority();
                if (authority == null) {
                    throw new IllegalStateException(("URI authority is null for url: " + url).toString());
                }
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                objM30460b2 = C7347n.m30460b(new Pair(authority, StringsKt.m32189s1(path, '/')));
            } catch (Throwable th3) {
                C7347n.Companion companion3 = C7347n.INSTANCE;
                objM30460b2 = C7347n.m30460b(C7348o.m30469a(th3));
            }
        } else {
            objM30460b2 = C7347n.m30460b(objM30460b);
        }
        if (C7347n.m30466h(objM30460b2)) {
            Pair pair = (Pair) objM30460b2;
            objM30460b2 = ((String) pair.m31671a()) + "/" + ((String) pair.m31672b());
        }
        Object objM30460b3 = C7347n.m30460b(objM30460b2);
        Throwable thM30463e = C7347n.m30463e(objM30460b3);
        if (thM30463e == null) {
            String strR1 = StringsKt.m32187r1((String) objM30460b3, '/');
            return strR1.length() == 0 ? EnvironmentCompat.MEDIA_UNKNOWN : strR1;
        }
        C6124q.m27061f("WebViewAnalytics", "Failed to extract authority and path from url", thM30463e);
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    /* JADX INFO: renamed from: i */
    public final TelemetryConfig m45039i() {
        return (TelemetryConfig) impressionCounter.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final TelemetryConfig m45040j() {
        return (TelemetryConfig) nativeMobileWebOpenCounter.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final TelemetryConfig m45041k() {
        return (TelemetryConfig) urlHandlingCounter.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final TelemetryConfig m45042l() {
        return (TelemetryConfig) urlOpenSourceSurfaceCounter.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final TelemetryConfig m45043m() {
        return (TelemetryConfig) webClosedCounter.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final TelemetryConfig m45044n() {
        return (TelemetryConfig) webViewMemoryOnCloseCounter.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final TelemetryConfig m45045o() {
        return (TelemetryConfig) webViewMemoryOnTrimCounter.getValue();
    }
}
