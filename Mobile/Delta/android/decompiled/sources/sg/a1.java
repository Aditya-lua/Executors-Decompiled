package sg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nb.qe;

/* JADX INFO: loaded from: classes2.dex */
public class a1 {
    public static gk.e b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f30719g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f30724l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Pattern f30729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f30730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static SharedPreferences f30731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String f30732t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static long f30733u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f30734v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f30714a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f30715c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f30716d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f30717e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f30718f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f30720h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f30721i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f30722j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f30723k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f30725m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f30726n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f30727o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f30728p = false;

    static {
        f30719g = false;
        J0(BuildConfig.BASE_URL);
        O0("");
        if (!f30715c.isEmpty()) {
            f30719g = true;
        }
        f30730r = false;
        f30731s = null;
        f30732t = "";
        f30733u = 0L;
        f30734v = false;
    }

    public static String A(String str) {
        return g() + "games/?SortFilter=" + str;
    }

    public static String A0(long j10) {
        return g() + "my/messages/#!/inbox?conversationId=" + j10;
    }

    public static String B(Context context) {
        return U(context).getString("moduleName", "");
    }

    public static String B0() {
        return d0("profile");
    }

    public static String C(Context context) {
        SharedPreferences sharedPreferencesU = U(context);
        String string = sharedPreferencesU.getString("engine", "");
        sharedPreferencesU.edit().remove("engine").apply();
        return string;
    }

    public static String C0() {
        return "https://ecsv2." + P() + "mobile/pbe";
    }

    public static String D(Context context) {
        SharedPreferences sharedPreferencesU = U(context);
        String string = sharedPreferencesU.getString("channel", "");
        if (s.c(context)) {
            sharedPreferencesU.edit().remove("channel").apply();
        }
        return string;
    }

    public static boolean D0() {
        return false;
    }

    public static String E() {
        return BuildConfig.APP_UPGRADE_KEY;
    }

    public static String E0() {
        return g() + "upgrades/robux";
    }

    public static String F() {
        return f30720h;
    }

    public static String F0(String str) {
        return g() + "catalog?Keyword=" + str;
    }

    public static String G() {
        return b.c();
    }

    public static String G0(String str) {
        return g() + "games/?Keyword=" + str;
    }

    public static String H() {
        return b.d();
    }

    public static String H0(String str) {
        return g() + "search/groups?keyword=" + str;
    }

    public static String I() {
        return f30717e;
    }

    public static String I0(String str) {
        return g() + "users/search?keyword=" + str;
    }

    public static String J() {
        return f30716d;
    }

    public static void J0(String str) {
        gk.p.h("roblox.config", "setBaseUrl() " + b + " => " + str);
        b = new gk.e(str);
        f30729q = Pattern.compile(u0(), 2);
    }

    public static String K() {
        return "Development";
    }

    public static boolean K0(gh.c cVar) {
        if (cVar == null) {
            return false;
        }
        String strA = cVar.a();
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        J0(strA);
        return true;
    }

    public static SharedPreferences L(Context context) {
        return gk.y.e(context).c("cached_app_settings_prefs");
    }

    public static void L0(String str) {
        if (str != null) {
            f30720h = new gk.f().d(str);
        } else {
            f30720h = null;
        }
    }

    public static String M() {
        return BuildConfig.CLIENT_SETTINGS_GROUPNAME;
    }

    public static void M0(String str) {
        gk.p.h("roblox.config", "setBinaryChannelEngineLibName() " + f30717e + " => " + str);
        if (str == null) {
            str = "";
        }
        f30717e = str;
    }

    public static String N() {
        if (gk.s.j()) {
            return "Android-TENCENTPlayer-Crash";
        }
        return q0() ? "Quest-ROBLOXPlayer-Crash" : "Android-ROBLOXPlayer-Crash";
    }

    public static void N0(String str) {
        gk.p.h("roblox.config", "setBinaryChannelModuleName() " + f30716d + " => " + str);
        if (str == null) {
            str = "";
        }
        f30716d = str;
    }

    public static String O() {
        return b.a();
    }

    public static void O0(String str) {
        if (str == null || ah.c.e(str)) {
            return;
        }
        gk.p.h("roblox.config", "setChannel() " + f30715c + " => " + str);
        f30715c = str.trim();
    }

    public static String P() {
        return b.b();
    }

    public static void P0(boolean z10) {
        f30730r = z10;
    }

    public static String Q(Context context) {
        return "{\"searchParams\":{\"searchType\":\"Players\"},\"url\":\"" + R() + "\",\"title\":\"" + context.getString(q0.C) + "\",\"animated\":true}";
    }

    public static boolean Q0(Configuration configuration) {
        return l0() && configuration.orientation == 2;
    }

    public static String R() {
        return g() + "/users/friends#!/friend-requests";
    }

    public static void R0(Context context) {
        f30723k = context.getResources().getBoolean(i0.f30770a);
        f30724l = context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
        f30725m = context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    public static String S() {
        return "application/json;charset=UTF-8";
    }

    public static void S0() {
        boolean zY2 = th.h.a().y2();
        if (zY2) {
            LoggingProtocol.g("cookie_read_begin");
        }
        String strB = wk.j.c().b(g());
        if (zY2) {
            LoggingProtocol.g("cookie_read_end");
        }
        if (strB == null) {
            strB = "";
        }
        NativeSettingsInterface.nativeSetMultipleCookies(g(), strB);
        if (th.h.a().M1() && f30714a.compareAndSet(false, true)) {
            boolean zContains = strB.contains(".ROBLOSECURITY=_");
            boolean zH = vi.h.h();
            String strF = wk.e.f();
            boolean zU = u();
            TelemetryBackend telemetryBackend = TelemetryBackend.COUNTER;
            sm.c.d(new sm.c.a("cookie_versionb_migration_result", qe.a(new Object[]{telemetryBackend})).j(2026, 6, 24).d(), new sm.c.b().b("has_roblosecurity", String.valueOf(zContains)).b("has_cached_user", String.valueOf(zH)).b("webview_state", strF).l());
            sm.c.d(new sm.c.a("cookie_versionb_engine_push", qe.a(new Object[]{telemetryBackend})).j(2026, 6, 24).d(), new sm.c.b().b("has_roblosecurity", String.valueOf(zContains)).b("has_cached_user", String.valueOf(zH)).b("engine_has_roblosecurity", String.valueOf(zU)).l());
            gk.p.h("roblox.config", "updateNativeCookies: pushed len=" + strB.length() + " shellHasRoblosecurity=" + zContains + " engineHasRoblosecurity=" + zU + " webviewState=" + strF);
        }
    }

    public static SharedPreferences T() {
        return f30731s;
    }

    public static void T0() {
        NativeSettingsInterface.nativeSetCacheDirectory(f30726n);
        NativeSettingsInterface.nativeSetFilesDirectory(f30727o);
    }

    public static SharedPreferences U(Context context) {
        return gk.y.a(context, "prefs");
    }

    public static void U0() {
        NativeSettingsInterface.nativeSetHttpClientProxy(System.getProperty("http.proxyHost", ""), Long.getLong("http.proxyPort", 0L).longValue());
    }

    public static String V(String str) {
        Matcher matcher = f30729q.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void V0() {
        W0(true);
    }

    public static String W() {
        return f30715c;
    }

    public static void W0(boolean z10) {
        NativeSettingsInterface.nativeSetExceptionReasonFilename(z());
        NativeSettingsInterface.nativeSetBaseUrl(g(), h());
        NativeSettingsInterface.nativeSetRobloxChannel(W());
        if (th.h.a().I0()) {
            NativeSettingsInterface.nativeOverrideChannelPlatformName2(M());
        } else {
            NativeSettingsInterface.nativeOverrideChannelPlatformName(M());
        }
        if (f30726n == null) {
            throw new NullPointerException("Missing cacheDirectory");
        }
        T0();
        NativeSettingsInterface.nativeInitFastLog();
        NativeSettingsInterface.nativeSetRobloxVersion(d1());
        gk.c.f18233c.a(new Runnable() { // from class: sg.z0
            @Override // java.lang.Runnable
            public final void run() {
                a1.a();
            }
        }, me.a0.a());
        h0();
        if (ak.k0.T()) {
            NativeSettingsInterface.nativeSetUserId("1");
        }
        if (z10) {
            S0();
        }
    }

    public static String X() {
        return "my/account#!/notifications";
    }

    public static void X0() {
        NativeSettingsInterface.nativeSetPlatformHeadersWithIdfa(f30732t, "googleplay", gk.c.d());
    }

    public static boolean Y() {
        return f30718f;
    }

    public static String Y0() {
        return c() + "v1/mobile-client-version?appVersion=" + E() + d1();
    }

    public static String Z(long j10) {
        return gk.a0.b("%sv1/users/%d", k(), Long.valueOf(j10));
    }

    public static String Z0() {
        return f30722j;
    }

    public static /* synthetic */ void a() {
        X0();
        LoggingProtocol.g("get_advertisingid_end");
    }

    public static String a0(long j10) {
        return g() + "users/" + j10 + "/friends#!/friend-requests";
    }

    public static String a1() {
        return k() + "v1/users/authenticated";
    }

    public static String b() {
        return g().replace("www.", "apis.");
    }

    public static String b0(long j10) {
        return g() + "users/" + j10 + "/friends#!/friends";
    }

    public static String b1() {
        return l() + "v1/google/validate";
    }

    public static String c() {
        return "https://clientsettingscdn." + P();
    }

    public static String c0(long j10) {
        return g() + "users/" + j10 + "/profile";
    }

    public static String c1() {
        return l() + "v1/google/purchase";
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
            sb2.append("57ace1df87f8e37023aebc8d9ce7e0802ffc0ee11dbcc89b34b18ed4e75f1de7");
            sb2.append(".dcz");
        }
        return sb2.toString();
    }

    public static String d0(String str) {
        long jG = vi.h.e().g();
        if (jG == -1) {
            return g() + "users/" + str;
        }
        return g() + "users/" + jG + "/" + str;
    }

    public static String d1() {
        return "2.743.1136";
    }

    public static String e() {
        return b() + "v1/attribution-eligibility";
    }

    public static String e0() {
        return g() + "home";
    }

    public static String f() {
        return j() + "v1/user/currency";
    }

    public static boolean f0() {
        return f30715c.isEmpty();
    }

    public static String g() {
        return "https://" + b.d();
    }

    public static void g0(Context context) {
        f30727o = context.getFilesDir().getAbsolutePath();
        f30726n = context.getCacheDir().getAbsolutePath();
        f30732t = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String h() {
        if (f30720h == null) {
            return "https://api." + P();
        }
        return "https://" + f30720h;
    }

    public static void h0() {
    }

    public static String i() {
        return "https://auth." + P();
    }

    public static void i0(Context context, gh.c cVar) {
        String string = Settings.Global.getString(context.getContentResolver(), "roblox_channel_override");
        if (string != null) {
            string = string.trim();
        }
        boolean z10 = (f30719g || TextUtils.isEmpty(string)) ? false : true;
        if (z10) {
            gk.p.h("roblox.config", "Using channel from launch override: " + string);
            O0(string);
        }
        if (cVar != null) {
            if (!f30719g && !z10) {
                O0(cVar.h());
            }
            String strA = cVar.a();
            if (K0(cVar)) {
                gk.p.h("roblox.config", "initConfig: Set base-URL from: " + b + " => " + strA);
            }
        }
        L0(gk.y.b(context, "configure_dev_roblox", true).getString("BaseApiUrl", null));
        f30731s = U(context);
        if (th.h.a().j3()) {
            N0(B(context));
            M0(C(context));
            f30718f = U(context).getString("supportsAndroidBinaries", "").equals("true");
        }
        String strD = D(context);
        if (!f30719g && !z10 && !strD.isEmpty()) {
            gk.p.h("roblox.config", "Found channel from preferences: " + strD);
            O0(strD);
        }
        R0(context);
        if (cVar == null || TextUtils.isEmpty(cVar.k())) {
            f30722j = m(context);
            return;
        }
        f30722j = cVar.k();
        f30728p = true;
        gk.p.k("roblox.config", "Using a custom user agent: " + f30722j);
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
        return f30724l;
    }

    public static String l() {
        return g().replace("www.", "billing.");
    }

    public static boolean l0() {
        return (!th.h.a().I4() || k0() || q0()) ? false : true;
    }

    public static String m(Context context) {
        return n(context, "google");
    }

    public static boolean m0(String str) {
        String strV = V(str);
        return (!n0(str)) & ((strV == null || strV.isEmpty()) ? false : true);
    }

    public static String n(Context context, String str) {
        return vk.g.a(context, d1(), "AppleWebKit/537.36", BuildConfig.DISTRIBUTOR_TYPE, BuildConfig.STORE_TYPE, "questvr".equals(str), p0(), k0(), t0());
    }

    public static boolean n0(String str) {
        return str.contains("Login/FulfillConstraint.aspx") || str.toLowerCase().contains("login/maintenance");
    }

    public static String o() {
        return g() + "mobile-app-upgrades/native-ios/bc";
    }

    public static boolean o0() {
        if (th.h.a().A4()) {
            return true;
        }
        return th.h.a().t5() && r0();
    }

    public static String p(String str, String str2) {
        return gk.a0.b("%scaptcha/app/login?credentialsType=%s&credentialsValue=%s&hybrid-return-token=1", g(), str, str2);
    }

    public static boolean p0() {
        return !f30723k;
    }

    public static String q() {
        return gk.a0.b("%scaptcha/app/signup?hybrid-return-token=1", g());
    }

    public static boolean q0() {
        return false;
    }

    public static boolean r(Context context) {
        return U(context).getBoolean("under13", true);
    }

    public static boolean r0() {
        return f30723k;
    }

    public static void s(Context context) {
        U(context).edit().remove("moduleName").apply();
    }

    public static boolean s0() {
        return b.c().contains(".robloxlabs.com");
    }

    public static String t() {
        if (!f30728p) {
            return BuildConfig.DISTRIBUTOR_TYPE;
        }
        Matcher matcher = Pattern.compile("\\b[A-Za-z]+Dist\\b").matcher(f30722j);
        if (matcher.find()) {
            return matcher.group();
        }
        gk.p.e("roblox.config", "Unable to find correct distributor type inside customized user agent.");
        return BuildConfig.DISTRIBUTOR_TYPE;
    }

    public static boolean t0() {
        return f30725m;
    }

    public static boolean u() {
        if (!th.h.a().M1()) {
            return false;
        }
        try {
            String strNativeGetCookiesInNetscapeFormat = NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(g());
            return strNativeGetCookiesInNetscapeFormat != null && strNativeGetCookiesInNetscapeFormat.contains(".ROBLOSECURITY");
        } catch (Throwable th2) {
            gk.p.k("roblox.config", "engineHasSecurityCookie: read-back failed: " + th2);
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
        return f30730r;
    }

    public static String y() {
        return "https://ephemeralcounters.api." + P() + "v1.0/SequenceStatistics/AddToSequence?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    public static String y0() {
        return g() + th.h.a().R1();
    }

    public static String z() {
        return "exception_reason.txt";
    }

    public static String z0() {
        return g() + "login/resetpasswordrequest/success";
    }
}
