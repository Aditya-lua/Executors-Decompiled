package bh;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RobloxApplication;
import com.roblox.client.analytics.CrashpadHandler;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.model.NativeInitCrashpadParams;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.ze;

/* JADX INFO: loaded from: classes2.dex */
public class a1 {
    public static ok.e b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f4023g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f4028l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Pattern f4033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f4034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static SharedPreferences f4035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String f4036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static long f4037u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f4038v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f4018a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f4019c = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f4020d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f4021e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f4022f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f4024h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f4025i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f4026j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f4027k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f4029m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f4030n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f4031o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f4032p = false;

    static {
        f4023g = false;
        K0("www.roblox.com");
        P0(BuildConfig.FLAVOR);
        if (!f4019c.isEmpty()) {
            f4023g = true;
        }
        f4034r = false;
        f4035s = null;
        f4036t = BuildConfig.FLAVOR;
        f4037u = 0L;
        f4038v = false;
    }

    public static String A(String str) {
        return g() + "games/?SortFilter=" + str;
    }

    public static String A0(long j10) {
        return g() + "my/messages/#!/inbox?conversationId=" + j10;
    }

    public static String B(Context context) {
        return U(context).getString("moduleName", BuildConfig.FLAVOR);
    }

    public static String B0() {
        return d0("profile");
    }

    public static String C(Context context) {
        SharedPreferences sharedPreferencesU = U(context);
        String string = sharedPreferencesU.getString("engine", BuildConfig.FLAVOR);
        sharedPreferencesU.edit().remove("engine").apply();
        return string;
    }

    public static void C0() {
        try {
            fn.c.d(new fn.c.a("cookie_versionb_webview_pull", ze.a(new Object[]{TelemetryBackend.COUNTER})).j(2026, 10, 13).d(), new fn.c.b().b("result", dl.e.q().name()).l());
        } catch (UnsatisfiedLinkError e10) {
            ok.q.k("roblox.config", "pullSecurityCookieFromWebView: telemetry failed: " + e10);
        }
    }

    public static String D(Context context) {
        SharedPreferences sharedPreferencesU = U(context);
        String string = sharedPreferencesU.getString("channel", BuildConfig.FLAVOR);
        if (s.c(context)) {
            sharedPreferencesU.edit().remove("channel").apply();
        }
        return string;
    }

    public static String D0() {
        return "https://ecsv2." + P() + "mobile/pbe";
    }

    public static String E() {
        return "AppAndroidV";
    }

    public static boolean E0() {
        return false;
    }

    public static String F() {
        return f4024h;
    }

    public static String F0() {
        return g() + "upgrades/robux";
    }

    public static String G() {
        return b.c();
    }

    public static String G0(String str) {
        return g() + "catalog?Keyword=" + str;
    }

    public static String H() {
        return b.d();
    }

    public static String H0(String str) {
        return g() + "games/?Keyword=" + str;
    }

    public static String I() {
        return f4021e;
    }

    public static String I0(String str) {
        return g() + "search/groups?keyword=" + str;
    }

    public static String J() {
        return f4020d;
    }

    public static String J0(String str) {
        return g() + "users/search?keyword=" + str;
    }

    public static String K() {
        return "Development";
    }

    public static void K0(String str) {
        ok.q.h("roblox.config", "setBaseUrl() " + b + " => " + str);
        b = new ok.e(str);
        f4033q = Pattern.compile(u0(), 2);
    }

    public static SharedPreferences L(Context context) {
        return ok.z.e(context).c("cached_app_settings_prefs");
    }

    public static boolean L0(ph.c cVar) {
        if (cVar == null) {
            return false;
        }
        String strA = cVar.a();
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        K0(strA);
        return true;
    }

    public static String M() {
        return "GoogleAndroidApp";
    }

    public static void M0(String str) {
        if (str != null) {
            f4024h = new ok.f().d(str);
        } else {
            f4024h = null;
        }
    }

    public static String N() {
        if (ok.t.j()) {
            return "Android-TENCENTPlayer-Crash";
        }
        return q0() ? "Quest-ROBLOXPlayer-Crash" : "Android-ROBLOXPlayer-Crash";
    }

    public static void N0(String str) {
        ok.q.h("roblox.config", "setBinaryChannelEngineLibName() " + f4021e + " => " + str);
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        f4021e = str;
    }

    public static String O() {
        return b.a();
    }

    public static void O0(String str) {
        ok.q.h("roblox.config", "setBinaryChannelModuleName() " + f4020d + " => " + str);
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        f4020d = str;
    }

    public static String P() {
        return b.b();
    }

    public static void P0(String str) {
        if (str == null || jh.c.e(str)) {
            return;
        }
        ok.q.h("roblox.config", "setChannel() " + f4019c + " => " + str);
        f4019c = str.trim();
    }

    public static String Q(Context context) {
        return "{\"searchParams\":{\"searchType\":\"Players\"},\"url\":\"" + R() + "\",\"title\":\"" + context.getString(q0.C) + "\",\"animated\":true}";
    }

    public static void Q0(boolean z10) {
        f4034r = z10;
    }

    public static String R() {
        return g() + "/users/friends#!/friend-requests";
    }

    public static boolean R0(Configuration configuration) {
        return l0() && configuration.orientation == 2;
    }

    public static String S() {
        return "application/json;charset=UTF-8";
    }

    public static void S0(Context context) {
        f4027k = context.getResources().getBoolean(i0.f4076a);
        f4028l = context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
        f4029m = context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    public static SharedPreferences T() {
        return f4035s;
    }

    public static void T0() {
        boolean zL2 = bi.h.a().L2();
        if (zL2) {
            LoggingProtocol.g("cookie_read_begin");
        }
        String strD = dl.j.e().d(g());
        if (zL2) {
            LoggingProtocol.g("cookie_read_end");
        }
        ik.w0.l();
        if (strD == null) {
            strD = BuildConfig.FLAVOR;
        }
        NativeSettingsInterface.nativeSetMultipleCookies(g(), strD);
        if (bi.h.a().W1() && f4018a.compareAndSet(false, true)) {
            boolean zContains = strD.contains(".ROBLOSECURITY=_");
            boolean zH = dj.h.h();
            String strJ = dl.e.j();
            boolean zU = u();
            TelemetryBackend telemetryBackend = TelemetryBackend.COUNTER;
            fn.c.d(new fn.c.a("cookie_versionb_migration_result", ze.a(new Object[]{telemetryBackend})).j(2026, 6, 24).d(), new fn.c.b().b("has_roblosecurity", String.valueOf(zContains)).b("has_cached_user", String.valueOf(zH)).b("webview_state", strJ).l());
            fn.c.d(new fn.c.a("cookie_versionb_engine_push", ze.a(new Object[]{telemetryBackend})).j(2026, 6, 24).d(), new fn.c.b().b("has_roblosecurity", String.valueOf(zContains)).b("has_cached_user", String.valueOf(zH)).b("engine_has_roblosecurity", String.valueOf(zU)).l());
            ok.q.h("roblox.config", "updateNativeCookies: pushed len=" + strD.length() + " shellHasRoblosecurity=" + zContains + " engineHasRoblosecurity=" + zU + " webviewState=" + strJ);
        }
    }

    public static SharedPreferences U(Context context) {
        return ok.z.a(context, "prefs");
    }

    public static void U0() {
        NativeSettingsInterface.nativeSetCacheDirectory(f4030n);
        NativeSettingsInterface.nativeSetFilesDirectory(f4031o);
    }

    public static String V(String str) {
        Matcher matcher = f4033q.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void V0() {
        NativeSettingsInterface.nativeSetHttpClientProxy(System.getProperty("http.proxyHost", BuildConfig.FLAVOR), Long.getLong("http.proxyPort", 0L).longValue());
    }

    public static String W() {
        return f4019c;
    }

    public static void W0() {
        X0(true);
    }

    public static String X() {
        return "my/account#!/notifications";
    }

    public static void X0(boolean z10) {
        NativeSettingsInterface.nativeSetExceptionReasonFilename(z());
        NativeSettingsInterface.nativeSetBaseUrl(g(), h());
        NativeSettingsInterface.nativeSetRobloxChannel(W());
        if (bi.h.a().P0()) {
            NativeSettingsInterface.nativeOverrideChannelPlatformName2(M());
        } else {
            NativeSettingsInterface.nativeOverrideChannelPlatformName(M());
        }
        if (f4030n == null) {
            throw new NullPointerException("Missing cacheDirectory");
        }
        U0();
        NativeSettingsInterface.nativeInitFastLog();
        NativeSettingsInterface.nativeSetRobloxVersion(e1());
        ok.c.f28244c.a(new Runnable() { // from class: bh.z0
            @Override // java.lang.Runnable
            public final void run() {
                a1.a();
            }
        }, pe.a0.a());
        h0();
        if (ik.k0.T()) {
            NativeSettingsInterface.nativeSetUserId("1");
        }
        if (z10) {
            T0();
        }
    }

    public static boolean Y() {
        return f4022f;
    }

    public static void Y0() {
        NativeSettingsInterface.nativeSetPlatformHeadersWithIdfa(f4036t, "googleplay", ok.c.d());
    }

    public static String Z(long j10) {
        return ok.b0.b("%sv1/users/%d", k(), Long.valueOf(j10));
    }

    public static String Z0() {
        return c() + "v1/mobile-client-version?appVersion=" + E() + e1();
    }

    public static /* synthetic */ void a() {
        Y0();
        LoggingProtocol.g("get_advertisingid_end");
    }

    public static String a0(long j10) {
        return g() + "users/" + j10 + "/friends#!/friend-requests";
    }

    public static String a1() {
        return f4026j;
    }

    public static String b() {
        return g().replace("www.", "apis.");
    }

    public static String b0(long j10) {
        return g() + "users/" + j10 + "/friends#!/friends";
    }

    public static String b1() {
        return k() + "v1/users/authenticated";
    }

    public static String c() {
        return "https://clientsettingscdn." + P();
    }

    public static String c0(long j10) {
        return g() + "users/" + j10 + "/profile";
    }

    public static String c1() {
        return l() + "v1/google/validate";
    }

    public static String d(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c());
        sb2.append("v2/settings");
        if (z10) {
            sb2.append("-compressed");
        }
        sb2.append("/application/");
        sb2.append(M());
        String strW = W();
        if (!strW.isEmpty()) {
            sb2.append("/bucket/");
            sb2.append(strW);
        }
        if (z10) {
            sb2.append("/");
            sb2.append("c0101e39d0563e9590a0ab27f90e91ea36d6bcfdf99add6915870c306a286479");
            sb2.append(".dcz");
        }
        return sb2.toString();
    }

    public static String d0(String str) {
        long jG = dj.h.e().g();
        if (jG == -1) {
            return g() + "users/" + str;
        }
        return g() + "users/" + jG + "/" + str;
    }

    public static String d1() {
        return l() + "v1/google/purchase";
    }

    public static String e() {
        return b() + "v1/attribution-eligibility";
    }

    public static String e0() {
        return g() + "home";
    }

    public static String e1() {
        return "2.747.1486";
    }

    public static String f() {
        return j() + "v1/user/currency";
    }

    public static boolean f0() {
        return f4019c.isEmpty();
    }

    public static String g() {
        return "https://" + b.d();
    }

    public static void g0(Context context) {
        f4031o = context.getFilesDir().getAbsolutePath();
        f4030n = context.getCacheDir().getAbsolutePath();
        f4036t = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String h() {
        if (f4024h == null) {
            return "https://api." + P();
        }
        return "https://" + f4024h;
    }

    public static void h0() {
        if (f4025i) {
            return;
        }
        ApplicationInfo applicationInfo = RobloxApplication.f().getApplicationInfo();
        if (NativeSettingsInterface.nativeInitCrashpad(NativeInitCrashpadParams.builder().c(e1()).d(g()).g(N()).l(bi.h.a().P2()).k(bi.h.a().Z3()).i(CrashpadHandler.class.getCanonicalName()).h(Arrays.asList("ANDROID_DATA=" + System.getenv("ANDROID_DATA"), "ANDROID_ROOT=" + System.getenv("ANDROID_ROOT"), "ANDROID_STORAGE=" + System.getenv("ANDROID_STORAGE"), "LIBRARYPATH=" + applicationInfo.nativeLibraryDir, "CLASSPATH=.:" + applicationInfo.sourceDir)).j(j0()).e(ok.h.a()).f(bi.h.a().M5()).b())) {
            f4025i = true;
            ok.q.h("roblox.config", "Crashpad monitoring with API unification is ON");
        }
    }

    public static String i() {
        return "https://auth." + P();
    }

    public static void i0(Context context, ph.c cVar) {
        String string = Settings.Global.getString(context.getContentResolver(), "roblox_channel_override");
        if (string != null) {
            string = string.trim();
        }
        boolean z10 = (f4023g || TextUtils.isEmpty(string)) ? false : true;
        if (z10) {
            ok.q.h("roblox.config", "Using channel from launch override: " + string);
            P0(string);
        }
        if (cVar != null) {
            if (!f4023g && !z10) {
                P0(cVar.h());
            }
            String strA = cVar.a();
            if (L0(cVar)) {
                ok.q.h("roblox.config", "initConfig: Set base-URL from: " + b + " => " + strA);
            }
        }
        M0(ok.z.b(context, "configure_dev_roblox", true).getString("BaseApiUrl", null));
        f4035s = U(context);
        if (bi.h.a().w3()) {
            O0(B(context));
            N0(C(context));
            f4022f = U(context).getString("supportsAndroidBinaries", BuildConfig.FLAVOR).equals("true");
        }
        String strD = D(context);
        if (!f4023g && !z10 && !strD.isEmpty()) {
            ok.q.h("roblox.config", "Found channel from preferences: " + strD);
            P0(strD);
        }
        S0(context);
        if (cVar == null || TextUtils.isEmpty(cVar.k())) {
            f4026j = m(context);
            return;
        }
        f4026j = cVar.k();
        f4032p = true;
        ok.q.k("roblox.config", "Using a custom user agent: " + f4026j);
    }

    public static String j() {
        return "https://economy." + P();
    }

    public static boolean j0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static String k() {
        return "https://users." + P();
    }

    public static boolean k0() {
        return f4028l;
    }

    public static String l() {
        return g().replace("www.", "billing.");
    }

    public static boolean l0() {
        return (!bi.h.a().V4() || k0() || q0()) ? false : true;
    }

    public static String m(Context context) {
        return n(context, Payload.SOURCE_GOOGLE);
    }

    public static boolean m0(String str) {
        String strV = V(str);
        return (!n0(str)) & ((strV == null || strV.isEmpty()) ? false : true);
    }

    public static String n(Context context, String str) {
        return cl.g.a(context, e1(), "AppleWebKit/537.36", "GlobalDist", "GooglePlayStore", "questvr".equals(str), p0(), k0(), t0());
    }

    public static boolean n0(String str) {
        return str.contains("Login/FulfillConstraint.aspx") || str.toLowerCase().contains("login/maintenance");
    }

    public static String o() {
        return g() + "mobile-app-upgrades/native-ios/bc";
    }

    public static boolean o0() {
        if (bi.h.a().N4()) {
            return true;
        }
        return bi.h.a().A5() && r0();
    }

    public static String p(String str, String str2) {
        return ok.b0.b("%scaptcha/app/login?credentialsType=%s&credentialsValue=%s&hybrid-return-token=1", g(), str, str2);
    }

    public static boolean p0() {
        return !f4027k;
    }

    public static String q() {
        return ok.b0.b("%scaptcha/app/signup?hybrid-return-token=1", g());
    }

    public static boolean q0() {
        return false;
    }

    public static boolean r(Context context) {
        return U(context).getBoolean("under13", true);
    }

    public static boolean r0() {
        return f4027k;
    }

    public static void s(Context context) {
        U(context).edit().remove("moduleName").apply();
    }

    public static boolean s0() {
        return b.c().contains(".robloxlabs.com");
    }

    public static String t() {
        if (!f4032p) {
            return "GlobalDist";
        }
        Matcher matcher = Pattern.compile("\\b[A-Za-z]+Dist\\b").matcher(f4026j);
        if (matcher.find()) {
            return matcher.group();
        }
        ok.q.e("roblox.config", "Unable to find correct distributor type inside customized user agent.");
        return "GlobalDist";
    }

    public static boolean t0() {
        return f4029m;
    }

    public static boolean u() {
        if (!bi.h.a().W1()) {
            return false;
        }
        try {
            String strNativeGetCookiesInNetscapeFormat = NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(g());
            return strNativeGetCookiesInNetscapeFormat != null && strNativeGetCookiesInNetscapeFormat.contains(".ROBLOSECURITY");
        } catch (Throwable th2) {
            ok.q.k("roblox.config", "engineHasSecurityCookie: read-back failed: " + th2);
            return false;
        }
    }

    public static String u0() {
        return "^(https?://" + Pattern.quote(H()) + "(?:login|newlogin))(?!/reset-password).*";
    }

    public static String v(String str, int i10) {
        return "&counterName=" + str + "&amount=" + i10;
    }

    public static String v0() {
        return i() + "/v2/logout";
    }

    public static String w() {
        return "https://ephemeralcounters.api." + P() + "v1.1/Counters/Increment/?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    public static String w0() {
        return g() + "my/messages/#!/inbox";
    }

    public static String x(String str, long j10) {
        return "&sequenceName=" + str + "&value=" + j10;
    }

    public static boolean x0() {
        return f4034r;
    }

    public static String y() {
        return "https://ephemeralcounters.api." + P() + "v1.0/SequenceStatistics/AddToSequence?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    public static String y0() {
        return g() + bi.h.a().b2();
    }

    public static String z() {
        return "exception_reason.txt";
    }

    public static String z0() {
        return g() + "login/resetpasswordrequest/success";
    }
}
