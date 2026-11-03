package rg;

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
    public static ek.e b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f30320g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f30325l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Pattern f30330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f30331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static SharedPreferences f30332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String f30333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static long f30334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f30335v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f30315a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f30316c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f30317d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f30318e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f30319f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f30321h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f30322i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f30323j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f30324k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f30326m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f30327n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f30328o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f30329p = false;

    static {
        f30320g = false;
        K0(BuildConfig.BASE_URL);
        P0("");
        if (!f30316c.isEmpty()) {
            f30320g = true;
        }
        f30331r = false;
        f30332s = null;
        f30333t = "";
        f30334u = 0L;
        f30335v = false;
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

    public static void C0() {
        try {
            qm.c.d(new qm.c.a("cookie_versionb_webview_pull", qe.a(new Object[]{TelemetryBackend.COUNTER})).j(2026, 10, 13).d(), new qm.c.b().b("result", uk.e.q().name()).l());
        } catch (UnsatisfiedLinkError e10) {
            ek.q.k("roblox.config", "pullSecurityCookieFromWebView: telemetry failed: " + e10);
        }
    }

    public static String D(Context context) {
        SharedPreferences sharedPreferencesU = U(context);
        String string = sharedPreferencesU.getString("channel", "");
        if (s.c(context)) {
            sharedPreferencesU.edit().remove("channel").apply();
        }
        return string;
    }

    public static String D0() {
        return "https://ecsv2." + P() + "mobile/pbe";
    }

    public static String E() {
        return BuildConfig.APP_UPGRADE_KEY;
    }

    public static boolean E0() {
        return false;
    }

    public static String F() {
        return f30321h;
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
        return f30318e;
    }

    public static String I0(String str) {
        return g() + "search/groups?keyword=" + str;
    }

    public static String J() {
        return f30317d;
    }

    public static String J0(String str) {
        return g() + "users/search?keyword=" + str;
    }

    public static String K() {
        return "Development";
    }

    public static void K0(String str) {
        ek.q.h("roblox.config", "setBaseUrl() " + b + " => " + str);
        b = new ek.e(str);
        f30330q = Pattern.compile(u0(), 2);
    }

    public static SharedPreferences L(Context context) {
        return ek.z.e(context).c("cached_app_settings_prefs");
    }

    public static boolean L0(fh.c cVar) {
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
        return BuildConfig.CLIENT_SETTINGS_GROUPNAME;
    }

    public static void M0(String str) {
        if (str != null) {
            f30321h = new ek.f().d(str);
        } else {
            f30321h = null;
        }
    }

    public static String N() {
        if (ek.t.j()) {
            return "Android-TENCENTPlayer-Crash";
        }
        return q0() ? "Quest-ROBLOXPlayer-Crash" : "Android-ROBLOXPlayer-Crash";
    }

    public static void N0(String str) {
        ek.q.h("roblox.config", "setBinaryChannelEngineLibName() " + f30318e + " => " + str);
        if (str == null) {
            str = "";
        }
        f30318e = str;
    }

    public static String O() {
        return b.a();
    }

    public static void O0(String str) {
        ek.q.h("roblox.config", "setBinaryChannelModuleName() " + f30317d + " => " + str);
        if (str == null) {
            str = "";
        }
        f30317d = str;
    }

    public static String P() {
        return b.b();
    }

    public static void P0(String str) {
        if (str == null || zg.c.e(str)) {
            return;
        }
        ek.q.h("roblox.config", "setChannel() " + f30316c + " => " + str);
        f30316c = str.trim();
    }

    public static String Q(Context context) {
        return "{\"searchParams\":{\"searchType\":\"Players\"},\"url\":\"" + R() + "\",\"title\":\"" + context.getString(q0.C) + "\",\"animated\":true}";
    }

    public static void Q0(boolean z10) {
        f30331r = z10;
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
        f30324k = context.getResources().getBoolean(i0.f30373a);
        f30325l = context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
        f30326m = context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    public static SharedPreferences T() {
        return f30332s;
    }

    public static void T0() {
        boolean zJ2 = rh.h.a().J2();
        if (zJ2) {
            LoggingProtocol.g("cookie_read_begin");
        }
        String strB = uk.j.c().b(g());
        if (zJ2) {
            LoggingProtocol.g("cookie_read_end");
        }
        if (strB == null) {
            strB = "";
        }
        NativeSettingsInterface.nativeSetMultipleCookies(g(), strB);
        if (rh.h.a().W1() && f30315a.compareAndSet(false, true)) {
            boolean zContains = strB.contains(".ROBLOSECURITY=_");
            boolean zH = ti.h.h();
            String strJ = uk.e.j();
            boolean zU = u();
            TelemetryBackend telemetryBackend = TelemetryBackend.COUNTER;
            qm.c.d(new qm.c.a("cookie_versionb_migration_result", qe.a(new Object[]{telemetryBackend})).j(2026, 6, 24).d(), new qm.c.b().b("has_roblosecurity", String.valueOf(zContains)).b("has_cached_user", String.valueOf(zH)).b("webview_state", strJ).l());
            qm.c.d(new qm.c.a("cookie_versionb_engine_push", qe.a(new Object[]{telemetryBackend})).j(2026, 6, 24).d(), new qm.c.b().b("has_roblosecurity", String.valueOf(zContains)).b("has_cached_user", String.valueOf(zH)).b("engine_has_roblosecurity", String.valueOf(zU)).l());
            ek.q.h("roblox.config", "updateNativeCookies: pushed len=" + strB.length() + " shellHasRoblosecurity=" + zContains + " engineHasRoblosecurity=" + zU + " webviewState=" + strJ);
        }
    }

    public static SharedPreferences U(Context context) {
        return ek.z.a(context, "prefs");
    }

    public static void U0() {
        NativeSettingsInterface.nativeSetCacheDirectory(f30327n);
        NativeSettingsInterface.nativeSetFilesDirectory(f30328o);
    }

    public static String V(String str) {
        Matcher matcher = f30330q.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void V0() {
        NativeSettingsInterface.nativeSetHttpClientProxy(System.getProperty("http.proxyHost", ""), Long.getLong("http.proxyPort", 0L).longValue());
    }

    public static String W() {
        return f30316c;
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
        if (rh.h.a().N0()) {
            NativeSettingsInterface.nativeOverrideChannelPlatformName2(M());
        } else {
            NativeSettingsInterface.nativeOverrideChannelPlatformName(M());
        }
        if (f30327n == null) {
            throw new NullPointerException("Missing cacheDirectory");
        }
        U0();
        NativeSettingsInterface.nativeInitFastLog();
        NativeSettingsInterface.nativeSetRobloxVersion(e1());
        ek.c.f16131c.a(new Runnable() { // from class: rg.z0
            @Override // java.lang.Runnable
            public final void run() {
                a1.a();
            }
        }, ne.a0.a());
        h0();
        if (yj.k0.T()) {
            NativeSettingsInterface.nativeSetUserId("1");
        }
        if (z10) {
            T0();
        }
    }

    public static boolean Y() {
        return f30319f;
    }

    public static void Y0() {
        NativeSettingsInterface.nativeSetPlatformHeadersWithIdfa(f30333t, "googleplay", ek.c.d());
    }

    public static String Z(long j10) {
        return ek.b0.b("%sv1/users/%d", k(), Long.valueOf(j10));
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
        return f30323j;
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
            sb2.append("35659ed0421961bc16f9bd3955ac6b8e583db18147d4c97c4ad62dc9f9d48438");
            sb2.append(".dcz");
        }
        return sb2.toString();
    }

    public static String d0(String str) {
        long jG = ti.h.e().g();
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
        return "2.745.1142";
    }

    public static String f() {
        return j() + "v1/user/currency";
    }

    public static boolean f0() {
        return f30316c.isEmpty();
    }

    public static String g() {
        return "https://" + b.d();
    }

    public static void g0(Context context) {
        f30328o = context.getFilesDir().getAbsolutePath();
        f30327n = context.getCacheDir().getAbsolutePath();
        f30333t = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String h() {
        if (f30321h == null) {
            return "https://api." + P();
        }
        return "https://" + f30321h;
    }

    public static void h0() {
    }

    public static String i() {
        return "https://auth." + P();
    }

    public static void i0(Context context, fh.c cVar) {
        String string = Settings.Global.getString(context.getContentResolver(), "roblox_channel_override");
        if (string != null) {
            string = string.trim();
        }
        boolean z10 = (f30320g || TextUtils.isEmpty(string)) ? false : true;
        if (z10) {
            ek.q.h("roblox.config", "Using channel from launch override: " + string);
            P0(string);
        }
        if (cVar != null) {
            if (!f30320g && !z10) {
                P0(cVar.h());
            }
            String strA = cVar.a();
            if (L0(cVar)) {
                ek.q.h("roblox.config", "initConfig: Set base-URL from: " + b + " => " + strA);
            }
        }
        M0(ek.z.b(context, "configure_dev_roblox", true).getString("BaseApiUrl", null));
        f30332s = U(context);
        if (rh.h.a().t3()) {
            O0(B(context));
            N0(C(context));
            f30319f = U(context).getString("supportsAndroidBinaries", "").equals("true");
        }
        String strD = D(context);
        if (!f30320g && !z10 && !strD.isEmpty()) {
            ek.q.h("roblox.config", "Found channel from preferences: " + strD);
            P0(strD);
        }
        S0(context);
        if (cVar == null || TextUtils.isEmpty(cVar.k())) {
            f30323j = m(context);
            return;
        }
        f30323j = cVar.k();
        f30329p = true;
        ek.q.k("roblox.config", "Using a custom user agent: " + f30323j);
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
        return f30325l;
    }

    public static String l() {
        return g().replace("www.", "billing.");
    }

    public static boolean l0() {
        return (!rh.h.a().V4() || k0() || q0()) ? false : true;
    }

    public static String m(Context context) {
        return n(context, "google");
    }

    public static boolean m0(String str) {
        String strV = V(str);
        return (!n0(str)) & ((strV == null || strV.isEmpty()) ? false : true);
    }

    public static String n(Context context, String str) {
        return tk.g.a(context, e1(), "AppleWebKit/537.36", BuildConfig.DISTRIBUTOR_TYPE, BuildConfig.STORE_TYPE, "questvr".equals(str), p0(), k0(), t0());
    }

    public static boolean n0(String str) {
        return str.contains("Login/FulfillConstraint.aspx") || str.toLowerCase().contains("login/maintenance");
    }

    public static String o() {
        return g() + "mobile-app-upgrades/native-ios/bc";
    }

    public static boolean o0() {
        if (rh.h.a().M4()) {
            return true;
        }
        return rh.h.a().D5() && r0();
    }

    public static String p(String str, String str2) {
        return ek.b0.b("%scaptcha/app/login?credentialsType=%s&credentialsValue=%s&hybrid-return-token=1", g(), str, str2);
    }

    public static boolean p0() {
        return !f30324k;
    }

    public static String q() {
        return ek.b0.b("%scaptcha/app/signup?hybrid-return-token=1", g());
    }

    public static boolean q0() {
        return false;
    }

    public static boolean r(Context context) {
        return U(context).getBoolean("under13", true);
    }

    public static boolean r0() {
        return f30324k;
    }

    public static void s(Context context) {
        U(context).edit().remove("moduleName").apply();
    }

    public static boolean s0() {
        return b.c().contains(".robloxlabs.com");
    }

    public static String t() {
        if (!f30329p) {
            return BuildConfig.DISTRIBUTOR_TYPE;
        }
        Matcher matcher = Pattern.compile("\\b[A-Za-z]+Dist\\b").matcher(f30323j);
        if (matcher.find()) {
            return matcher.group();
        }
        ek.q.e("roblox.config", "Unable to find correct distributor type inside customized user agent.");
        return BuildConfig.DISTRIBUTOR_TYPE;
    }

    public static boolean t0() {
        return f30326m;
    }

    public static boolean u() {
        if (!rh.h.a().W1()) {
            return false;
        }
        try {
            String strNativeGetCookiesInNetscapeFormat = NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(g());
            return strNativeGetCookiesInNetscapeFormat != null && strNativeGetCookiesInNetscapeFormat.contains(".ROBLOSECURITY");
        } catch (Throwable th2) {
            ek.q.k("roblox.config", "engineHasSecurityCookie: read-back failed: " + th2);
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
        return f30331r;
    }

    public static String y() {
        return "https://ephemeralcounters.api." + P() + "v1.0/SequenceStatistics/AddToSequence?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    public static String y0() {
        return g() + rh.h.a().b2();
    }

    public static String z() {
        return "exception_reason.txt";
    }

    public static String z0() {
        return g() + "login/resetpasswordrequest/success";
    }
}
