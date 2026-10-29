package p520wk;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.CookieManager;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7352s;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: wk.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0010$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J#\u0010\u0014\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010\u0003J'\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010\u0006R\u0018\u0010/\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100R\u0018\u00103\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00105R\u0016\u00108\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0016\u0010:\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00109R$\u0010=\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b<\u0010\u0006R\u0018\u0010>\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00100¨\u0006?"}, m31665d2 = {"Lwk/e;", "", "<init>", "()V", "", "f", "()Ljava/lang/String;", "Landroid/content/Context;", "ctx", "", "o", "(Landroid/content/Context;)V", "url", "q", "(Ljava/lang/String;)V", "i", "b", "cookie", "Lwk/e$b;", Payload.SOURCE, "p", "(Ljava/lang/String;Lwk/e$b;)V", "m", "k", "domain", "r", "", "e", "()J", "d", "Lwk/e$a;", "c", "()Lwk/e$a;", "Landroid/webkit/CookieManager;", "g", "()Landroid/webkit/CookieManager;", "a", "n", "pair", "Lkotlin/Pair;", "j", "(Ljava/lang/String;)Lkotlin/Pair;", "", "h", "()Z", "l", "Landroid/content/Context;", "appContext", "Ljava/lang/String;", "migrationSourceUrl", "Landroid/webkit/CookieManager;", "webkitCookieManager", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "nativeStorage", "Lwk/e$a;", "migrationResult", "Z", "migrationTriggered", "value", "getWebViewCookieStateAtMigration", "webViewCookieStateAtMigration", "cachedCookieHeader", "robloxplatform_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12483e {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile Context appContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static CookieManager webkitCookieManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static SharedPreferences nativeStorage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static volatile boolean migrationTriggered;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public static volatile String cachedCookieHeader;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12483e f44617a = new C12483e();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static volatile String migrationSourceUrl = "https://www.roblox.com";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static a migrationResult = a.OLD;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static volatile String webViewCookieStateAtMigration = EnvironmentCompat.MEDIA_UNKNOWN;

    /* JADX INFO: renamed from: wk.e$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lwk/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "robloxplatform_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum a {
        OLD,
        NEW_FLOW_LOADED,
        NEW_FLOW_MIGRATED;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ InterfaceC10707a f44630e = C10708b.m40805a(m46763a());
    }

    /* JADX INFO: renamed from: wk.e$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Lwk/e$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "robloxplatform_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum b {
        MIGRATION,
        OKHTTP_RESPONSE,
        WEBVIEW_PULL,
        ENGINE_PUSH,
        UNKNOWN;


        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ InterfaceC10707a f44637g = C10708b.m40805a(m46764a());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m46745b() {
        C12483e c12483e = f44617a;
        c12483e.m46757a();
        String str = cachedCookieHeader;
        return str != null ? str : c12483e.m46761l();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final a m46746c() {
        return migrationResult;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m46747d() {
        String string;
        SharedPreferences sharedPreferences = nativeStorage;
        return (sharedPreferences == null || (string = sharedPreferences.getString(".ROBLOSECURITY__write_source", "UNKNOWN")) == null) ? "UNKNOWN" : string;
    }

    /* JADX INFO: renamed from: e */
    public static final long m46748e() {
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong(".ROBLOSECURITY__write_time", 0L);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m46749f() {
        return webViewCookieStateAtMigration;
    }

    /* JADX INFO: renamed from: i */
    public static final void m46750i() {
        Context context = appContext;
        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("WebViewCookieHandlerNativeStorage", 0) : null;
        nativeStorage = sharedPreferences;
        boolean z10 = sharedPreferences != null;
        C6124q.m27063h("NativeCookieStorage", "NativeCookieStorage enabled: storageReady=" + z10 + ", migrationSourceUrl=" + migrationSourceUrl);
    }

    /* JADX INFO: renamed from: k */
    public static final void m46751k() {
        C6124q.m27063h("NativeCookieStorage", "Synchronizing cookie from WebView due to security change");
        String cookie = f44617a.m46758g().getCookie(migrationSourceUrl);
        if (cookie == null) {
            C6124q.m27066k("NativeCookieStorage", "pullSecurityCookieFromWebView: WebView returned null cookies, nothing to pull");
            return;
        }
        for (String str : StringsKt.split$default(cookie, new String[]{"; "}, false, 0, 6, null)) {
            if (C7797x.m32309T(str, ".ROBLOSECURITY=", false, 2, null)) {
                m46754p(str, b.WEBVIEW_PULL);
                return;
            }
        }
        C6124q.m27066k("NativeCookieStorage", "pullSecurityCookieFromWebView: no .ROBLOSECURITY in WebView cookies, native store left unchanged");
    }

    /* JADX INFO: renamed from: m */
    public static final void m46752m() {
        C12483e c12483e = f44617a;
        c12483e.m46757a();
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return;
        }
        C6124q.m27063h("NativeCookieStorage", "removeSecurityCookie: removing .ROBLOSECURITY from native storage");
        synchronized (c12483e) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(".ROBLOSECURITY");
            editorEdit.remove(".ROBLOSECURITY__write_time");
            editorEdit.remove(".ROBLOSECURITY__write_source");
            editorEdit.apply();
            cachedCookieHeader = null;
            Unit unit = Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m46753o(@Nullable Context ctx) {
        if (ctx != null) {
            appContext = ctx.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m46754p(@Nullable String cookie, @NotNull b source) {
        SharedPreferences sharedPreferences;
        String strSubstring;
        Intrinsics.checkNotNullParameter(source, "source");
        C12483e c12483e = f44617a;
        c12483e.m46757a();
        if (cookie == null || cookie.length() == 0 || (sharedPreferences = nativeStorage) == null) {
            return;
        }
        int iM0 = StringsKt.m32176m0(cookie, ';', 0, false, 6, null);
        if (iM0 >= 0) {
            strSubstring = cookie.substring(0, iM0);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = cookie;
        }
        Pair<String, String> pairM46760j = c12483e.m46760j(strSubstring);
        if (pairM46760j == null) {
            return;
        }
        String strM31671a = pairM46760j.m31671a();
        String strM31672b = pairM46760j.m31672b();
        synchronized (c12483e) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (strM31672b.length() == 0) {
                    editorEdit.remove(strM31671a);
                    if (Intrinsics.m31980c(strM31671a, ".ROBLOSECURITY")) {
                        editorEdit.remove(".ROBLOSECURITY__write_time");
                        editorEdit.remove(".ROBLOSECURITY__write_source");
                        C6124q.m27063h("NativeCookieStorage", "setCookie: DELETING .ROBLOSECURITY (empty value)");
                    }
                } else {
                    String string = sharedPreferences.getString(strM31671a, null);
                    editorEdit.putString(strM31671a, strM31672b);
                    if (Intrinsics.m31980c(strM31671a, ".ROBLOSECURITY")) {
                        boolean zM31980c = Intrinsics.m31980c(strM31672b, string);
                        boolean z10 = !zM31980c;
                        if (!zM31980c) {
                            editorEdit.putLong(".ROBLOSECURITY__write_time", System.currentTimeMillis());
                            editorEdit.putString(".ROBLOSECURITY__write_source", source.name());
                        }
                        C6124q.m27063h("NativeCookieStorage", "setCookie: wrote .ROBLOSECURITY (len=" + strM31672b.length() + ", source=" + source.name() + ", changed=" + z10 + ")");
                    }
                }
                editorEdit.apply();
                cachedCookieHeader = null;
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m46755q(@Nullable String url) {
        if (url != null) {
            migrationSourceUrl = url;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m46756r(@NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        C6124q.m27063h("NativeCookieStorage", "Populating WebView cookies from native storage");
        List<String> listSplit$default = StringsKt.split$default(m46745b(), new String[]{"; "}, false, 0, 6, null);
        CookieManager cookieManagerM46758g = f44617a.m46758g();
        String str = "https://" + domain;
        for (String str2 : listSplit$default) {
            cookieManagerM46758g.setCookie(str, (StringsKt.m32152a0(str2, ".ROBLOSECURITY", false, 2, null) || StringsKt.m32152a0(str2, ".RBXIDCHECK", false, 2, null)) ? str2 + "; Domain=." + domain + "; Path=/; HttpOnly; Secure" : str2 + "; Domain=." + domain + "; Path=/");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m46757a() {
        if (migrationTriggered) {
            return;
        }
        if (nativeStorage == null) {
            C6124q.m27066k("NativeCookieStorage", "ensureMigratedIfNeeded: nativeStorage is null (context not injected); cookie store is inert");
            return;
        }
        synchronized (this) {
            if (migrationTriggered) {
                return;
            }
            migrationTriggered = true;
            f44617a.m46762n();
            Unit unit = Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: g */
    public final CookieManager m46758g() {
        CookieManager cookieManager = webkitCookieManager;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        webkitCookieManager = cookieManager2;
        Intrinsics.checkNotNullExpressionValue(cookieManager2, "also(...)");
        return cookieManager2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m46759h() {
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return false;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        if (all.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() instanceof String) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final Pair<String, String> m46760j(String pair) {
        String string;
        int iM0;
        if (pair == null || (iM0 = StringsKt.m32176m0((string = StringsKt.m32183p1(pair).toString()), '=', 0, false, 6, null)) <= 0) {
            return null;
        }
        String strSubstring = string.substring(0, iM0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = string.substring(iM0 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return C7352s.m30477a(strSubstring, strSubstring2);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized String m46761l() {
        String str = cachedCookieHeader;
        if (str != null) {
            return str;
        }
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!Intrinsics.m31980c(key, "__migrated_from_webview_v4__")) {
                Intrinsics.checkNotNull(key);
                if (!C7797x.m32293D(key, "__write_time", false, 2, null) && !C7797x.m32293D(key, "__write_source", false, 2, null)) {
                    String str2 = value instanceof String ? (String) value : null;
                    if (str2 != null) {
                        if (sb2.length() > 0) {
                            sb2.append("; ");
                        }
                        sb2.append(key);
                        sb2.append('=');
                        sb2.append(str2);
                    }
                }
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        cachedCookieHeader = string;
        return string;
    }

    /* JADX INFO: renamed from: n */
    public final void m46762n() {
        String str;
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return;
        }
        boolean z10 = false;
        if (sharedPreferences.getBoolean("__migrated_from_webview_v4__", false)) {
            webViewCookieStateAtMigration = "already_loaded";
            boolean zM46759h = m46759h();
            C6124q.m27063h("NativeCookieStorage", "Cookies already migrated, loading from native storage. hasData=" + zM46759h);
            migrationResult = zM46759h ? a.NEW_FLOW_LOADED : a.OLD;
            return;
        }
        String str2 = migrationSourceUrl;
        C6124q.m27063h("NativeCookieStorage", "Migrating cookies from WebView storage to SharedPreferences using " + str2);
        boolean zContains = sharedPreferences.contains(".ROBLOSECURITY");
        String cookie = m46758g().getCookie(str2);
        if (cookie != null && StringsKt.m32152a0(cookie, ".ROBLOSECURITY", false, 2, null)) {
            str = "has_roblosecurity";
        } else if (cookie == null) {
            str = zContains ? "null_kept_native" : "null";
        } else if (cookie.length() == 0) {
            str = zContains ? "empty_kept_native" : "empty";
        } else {
            str = zContains ? "no_roblosecurity_kept_native" : "no_roblosecurity";
        }
        webViewCookieStateAtMigration = str;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (cookie != null && cookie.length() != 0) {
            Iterator it = StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                Pair<String, String> pairM46760j = f44617a.m46760j((String) it.next());
                if (pairM46760j != null) {
                    editorEdit.putString(pairM46760j.m31673c(), pairM46760j.m31674d());
                    if (Intrinsics.m31980c(pairM46760j.m31673c(), ".ROBLOSECURITY")) {
                        editorEdit.putLong(".ROBLOSECURITY__write_time", System.currentTimeMillis());
                        editorEdit.putString(".ROBLOSECURITY__write_source", "MIGRATION");
                    }
                    z10 = true;
                }
            }
        }
        editorEdit.putBoolean("__migrated_from_webview_v4__", true);
        editorEdit.apply();
        cachedCookieHeader = null;
        migrationResult = z10 ? a.NEW_FLOW_MIGRATED : a.OLD;
    }
}
