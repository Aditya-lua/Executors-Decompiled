package sg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.roblox.client.RobloxApplication;
import com.roblox.client.analytics.CrashpadHandler;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.model.NativeInitCrashpadParams;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.universalapp.logging.LoggingProtocol;
import gh.C6098c;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ne.C9410a0;
import p013ah.C0262c;
import p015ak.C0305k0;
import p151gk.C6106b0;
import p151gk.C6107c;
import p151gk.C6111e;
import p151gk.C6113f;
import p151gk.C6115h;
import p151gk.C6124q;
import p151gk.C6127t;
import p151gk.C6133z;
import p306nb.C9261qe;
import p493vk.C12225g;
import p520wk.C12483e;
import p520wk.C12488j;
import sm.C11416c;
import th.C11659h;
import vi.C12217h;

/* JADX INFO: renamed from: sg.a1 */
/* JADX INFO: loaded from: classes2.dex */
public class C11295a1 {

    /* JADX INFO: renamed from: b */
    public static C6111e f39638b;

    /* JADX INFO: renamed from: g */
    public static boolean f39643g;

    /* JADX INFO: renamed from: l */
    public static boolean f39648l;

    /* JADX INFO: renamed from: q */
    public static Pattern f39653q;

    /* JADX INFO: renamed from: r */
    public static boolean f39654r;

    /* JADX INFO: renamed from: s */
    public static SharedPreferences f39655s;

    /* JADX INFO: renamed from: t */
    public static String f39656t;

    /* JADX INFO: renamed from: u */
    public static long f39657u;

    /* JADX INFO: renamed from: v */
    public static boolean f39658v;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f39637a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static String f39639c = "";

    /* JADX INFO: renamed from: d */
    public static String f39640d = "";

    /* JADX INFO: renamed from: e */
    public static String f39641e = "";

    /* JADX INFO: renamed from: f */
    public static boolean f39642f = false;

    /* JADX INFO: renamed from: h */
    public static String f39644h = null;

    /* JADX INFO: renamed from: i */
    public static boolean f39645i = false;

    /* JADX INFO: renamed from: j */
    public static String f39646j = null;

    /* JADX INFO: renamed from: k */
    public static boolean f39647k = false;

    /* JADX INFO: renamed from: m */
    public static boolean f39649m = false;

    /* JADX INFO: renamed from: n */
    public static String f39650n = null;

    /* JADX INFO: renamed from: o */
    public static String f39651o = null;

    /* JADX INFO: renamed from: p */
    public static boolean f39652p = false;

    static {
        f39643g = false;
        m42401J0(BuildConfig.BASE_URL);
        m42411O0("");
        if (!f39639c.isEmpty()) {
            f39643g = true;
        }
        f39654r = false;
        f39655s = null;
        f39656t = "";
        f39657u = 0L;
        f39658v = false;
    }

    /* JADX INFO: renamed from: A */
    public static String m42382A(String str) {
        return m42450g() + "games/?SortFilter=" + str;
    }

    /* JADX INFO: renamed from: A0 */
    public static String m42383A0(long j10) {
        return m42450g() + "my/messages/#!/inbox?conversationId=" + j10;
    }

    /* JADX INFO: renamed from: B */
    public static String m42384B(Context context) {
        return m42422U(context).getString("moduleName", "");
    }

    /* JADX INFO: renamed from: B0 */
    public static String m42385B0() {
        return m42444d0("profile");
    }

    /* JADX INFO: renamed from: C */
    public static String m42386C(Context context) {
        SharedPreferences sharedPreferencesM42422U = m42422U(context);
        String string = sharedPreferencesM42422U.getString("engine", "");
        sharedPreferencesM42422U.edit().remove("engine").apply();
        return string;
    }

    /* JADX INFO: renamed from: C0 */
    public static String m42387C0() {
        return "https://ecsv2." + m42412P() + "mobile/pbe";
    }

    /* JADX INFO: renamed from: D */
    public static String m42388D(Context context) {
        SharedPreferences sharedPreferencesM42422U = m42422U(context);
        String string = sharedPreferencesM42422U.getString("channel", "");
        if (C11352s.m42524c(context)) {
            sharedPreferencesM42422U.edit().remove("channel").apply();
        }
        return string;
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m42389D0() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static String m42390E() {
        return BuildConfig.APP_UPGRADE_KEY;
    }

    /* JADX INFO: renamed from: E0 */
    public static String m42391E0() {
        return m42450g() + "upgrades/robux";
    }

    /* JADX INFO: renamed from: F */
    public static String m42392F() {
        return f39644h;
    }

    /* JADX INFO: renamed from: F0 */
    public static String m42393F0(String str) {
        return m42450g() + "catalog?Keyword=" + str;
    }

    /* JADX INFO: renamed from: G */
    public static String m42394G() {
        return f39638b.m27021c();
    }

    /* JADX INFO: renamed from: G0 */
    public static String m42395G0(String str) {
        return m42450g() + "games/?Keyword=" + str;
    }

    /* JADX INFO: renamed from: H */
    public static String m42396H() {
        return f39638b.m27022d();
    }

    /* JADX INFO: renamed from: H0 */
    public static String m42397H0(String str) {
        return m42450g() + "search/groups?keyword=" + str;
    }

    /* JADX INFO: renamed from: I */
    public static String m42398I() {
        return f39641e;
    }

    /* JADX INFO: renamed from: I0 */
    public static String m42399I0(String str) {
        return m42450g() + "users/search?keyword=" + str;
    }

    /* JADX INFO: renamed from: J */
    public static String m42400J() {
        return f39640d;
    }

    /* JADX INFO: renamed from: J0 */
    public static void m42401J0(String str) {
        C6124q.m27063h("roblox.config", "setBaseUrl() " + f39638b + " => " + str);
        f39638b = new C6111e(str);
        f39653q = Pattern.compile(m42479u0(), 2);
    }

    /* JADX INFO: renamed from: K */
    public static String m42402K() {
        return "Development";
    }

    /* JADX INFO: renamed from: K0 */
    public static boolean m42403K0(C6098c c6098c) {
        if (c6098c == null) {
            return false;
        }
        String strM26977a = c6098c.m26977a();
        if (TextUtils.isEmpty(strM26977a)) {
            return false;
        }
        m42401J0(strM26977a);
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static SharedPreferences m42404L(Context context) {
        return C6133z.m27106e(context).m27107c("cached_app_settings_prefs");
    }

    /* JADX INFO: renamed from: L0 */
    public static void m42405L0(String str) {
        if (str != null) {
            f39644h = new C6113f().m27031d(str);
        } else {
            f39644h = null;
        }
    }

    /* JADX INFO: renamed from: M */
    public static String m42406M() {
        return BuildConfig.CLIENT_SETTINGS_GROUPNAME;
    }

    /* JADX INFO: renamed from: M0 */
    public static void m42407M0(String str) {
        C6124q.m27063h("roblox.config", "setBinaryChannelEngineLibName() " + f39641e + " => " + str);
        if (str == null) {
            str = "";
        }
        f39641e = str;
    }

    /* JADX INFO: renamed from: N */
    public static String m42408N() {
        if (C6127t.m27094j()) {
            return "Android-TENCENTPlayer-Crash";
        }
        return m42471q0() ? "Quest-ROBLOXPlayer-Crash" : "Android-ROBLOXPlayer-Crash";
    }

    /* JADX INFO: renamed from: N0 */
    public static void m42409N0(String str) {
        C6124q.m27063h("roblox.config", "setBinaryChannelModuleName() " + f39640d + " => " + str);
        if (str == null) {
            str = "";
        }
        f39640d = str;
    }

    /* JADX INFO: renamed from: O */
    public static String m42410O() {
        return f39638b.m27019a();
    }

    /* JADX INFO: renamed from: O0 */
    public static void m42411O0(String str) {
        if (str == null || C0262c.m1212e(str)) {
            return;
        }
        C6124q.m27063h("roblox.config", "setChannel() " + f39639c + " => " + str);
        f39639c = str.trim();
    }

    /* JADX INFO: renamed from: P */
    public static String m42412P() {
        return f39638b.m27020b();
    }

    /* JADX INFO: renamed from: P0 */
    public static void m42413P0(boolean z10) {
        f39654r = z10;
    }

    /* JADX INFO: renamed from: Q */
    public static String m42414Q(Context context) {
        return "{\"searchParams\":{\"searchType\":\"Players\"},\"url\":\"" + m42416R() + "\",\"title\":\"" + context.getString(C11347q0.f39902C) + "\",\"animated\":true}";
    }

    /* JADX INFO: renamed from: Q0 */
    public static boolean m42415Q0(Configuration configuration) {
        return m42461l0() && configuration.orientation == 2;
    }

    /* JADX INFO: renamed from: R */
    public static String m42416R() {
        return m42450g() + "/users/friends#!/friend-requests";
    }

    /* JADX INFO: renamed from: R0 */
    public static void m42417R0(Context context) {
        f39647k = context.getResources().getBoolean(C11323i0.f39706a);
        f39648l = context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
        f39649m = context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    /* JADX INFO: renamed from: S */
    public static String m42418S() {
        return "application/json;charset=UTF-8";
    }

    /* JADX INFO: renamed from: S0 */
    public static void m42419S0() {
        boolean zMo43435E2 = C11659h.m43403a().mo43435E2();
        if (zMo43435E2) {
            LoggingProtocol.m15994g("cookie_read_begin");
        }
        String strMo23956b = C12488j.m46781c().mo23956b(m42450g());
        if (zMo43435E2) {
            LoggingProtocol.m15994g("cookie_read_end");
        }
        if (strMo23956b == null) {
            strMo23956b = "";
        }
        NativeSettingsInterface.nativeSetMultipleCookies(m42450g(), strMo23956b);
        if (C11659h.m43403a().mo43530S1() && f39637a.compareAndSet(false, true)) {
            boolean zContains = strMo23956b.contains(".ROBLOSECURITY=_");
            boolean zM45289h = C12217h.m45289h();
            String strM46749f = C12483e.m46749f();
            boolean zM42478u = m42478u();
            TelemetryBackend telemetryBackend = TelemetryBackend.COUNTER;
            C11416c.m42768d(new C11416c.a("cookie_versionb_migration_result", C9261qe.m36724a(new Object[]{telemetryBackend})).m42780j(2026, 6, 24).m42774d(), new C11416c.b().mo42758b("has_roblosecurity", String.valueOf(zContains)).mo42758b("has_cached_user", String.valueOf(zM45289h)).mo42758b("webview_state", strM46749f).m42785l());
            C11416c.m42768d(new C11416c.a("cookie_versionb_engine_push", C9261qe.m36724a(new Object[]{telemetryBackend})).m42780j(2026, 6, 24).m42774d(), new C11416c.b().mo42758b("has_roblosecurity", String.valueOf(zContains)).mo42758b("has_cached_user", String.valueOf(zM45289h)).mo42758b("engine_has_roblosecurity", String.valueOf(zM42478u)).m42785l());
            C6124q.m27063h("roblox.config", "updateNativeCookies: pushed len=" + strMo23956b.length() + " shellHasRoblosecurity=" + zContains + " engineHasRoblosecurity=" + zM42478u + " webviewState=" + strM46749f);
        }
    }

    /* JADX INFO: renamed from: T */
    public static SharedPreferences m42420T() {
        return f39655s;
    }

    /* JADX INFO: renamed from: T0 */
    public static void m42421T0() {
        NativeSettingsInterface.nativeSetCacheDirectory(f39650n);
        NativeSettingsInterface.nativeSetFilesDirectory(f39651o);
    }

    /* JADX INFO: renamed from: U */
    public static SharedPreferences m42422U(Context context) {
        return C6133z.m27104a(context, "prefs");
    }

    /* JADX INFO: renamed from: U0 */
    public static void m42423U0() {
        NativeSettingsInterface.nativeSetHttpClientProxy(System.getProperty("http.proxyHost", ""), Long.getLong("http.proxyPort", 0L).longValue());
    }

    /* JADX INFO: renamed from: V */
    public static String m42424V(String str) {
        Matcher matcher = f39653q.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX INFO: renamed from: V0 */
    public static void m42425V0() {
        m42427W0(true);
    }

    /* JADX INFO: renamed from: W */
    public static String m42426W() {
        return f39639c;
    }

    /* JADX INFO: renamed from: W0 */
    public static void m42427W0(boolean z10) {
        NativeSettingsInterface.nativeSetExceptionReasonFilename(m42488z());
        NativeSettingsInterface.nativeSetBaseUrl(m42450g(), m42452h());
        NativeSettingsInterface.nativeSetRobloxChannel(m42426W());
        if (C11659h.m43403a().mo43482L0()) {
            NativeSettingsInterface.nativeOverrideChannelPlatformName2(m42406M());
        } else {
            NativeSettingsInterface.nativeOverrideChannelPlatformName(m42406M());
        }
        if (f39650n == null) {
            throw new NullPointerException("Missing cacheDirectory");
        }
        m42421T0();
        NativeSettingsInterface.nativeInitFastLog();
        NativeSettingsInterface.nativeSetRobloxVersion(m42445d1());
        C6107c.f23449c.mo37173a(new Runnable() { // from class: sg.z0
            @Override // java.lang.Runnable
            public final void run() {
                C11295a1.m42434a();
            }
        }, C9410a0.m37145a());
        m42453h0();
        if (C0305k0.m1259T()) {
            NativeSettingsInterface.nativeSetUserId("1");
        }
        if (z10) {
            m42419S0();
        }
    }

    /* JADX INFO: renamed from: X */
    public static String m42428X() {
        return "my/account#!/notifications";
    }

    /* JADX INFO: renamed from: X0 */
    public static void m42429X0() {
        NativeSettingsInterface.nativeSetPlatformHeadersWithIdfa(f39656t, "googleplay", C6107c.m27009d());
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m42430Y() {
        return f39642f;
    }

    /* JADX INFO: renamed from: Y0 */
    public static String m42431Y0() {
        return m42440c() + "v1/mobile-client-version?appVersion=" + m42390E() + m42445d1();
    }

    /* JADX INFO: renamed from: Z */
    public static String m42432Z(long j10) {
        return C6106b0.m27006b("%sv1/users/%d", m42458k(), Long.valueOf(j10));
    }

    /* JADX INFO: renamed from: Z0 */
    public static String m42433Z0() {
        return f39646j;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m42434a() {
        m42429X0();
        LoggingProtocol.m15994g("get_advertisingid_end");
    }

    /* JADX INFO: renamed from: a0 */
    public static String m42435a0(long j10) {
        return m42450g() + "users/" + j10 + "/friends#!/friend-requests";
    }

    /* JADX INFO: renamed from: a1 */
    public static String m42436a1() {
        return m42458k() + "v1/users/authenticated";
    }

    /* JADX INFO: renamed from: b */
    public static String m42437b() {
        return m42450g().replace("www.", "apis.");
    }

    /* JADX INFO: renamed from: b0 */
    public static String m42438b0(long j10) {
        return m42450g() + "users/" + j10 + "/friends#!/friends";
    }

    /* JADX INFO: renamed from: b1 */
    public static String m42439b1() {
        return m42460l() + "v1/google/validate";
    }

    /* JADX INFO: renamed from: c */
    public static String m42440c() {
        return "https://clientsettingscdn." + m42412P();
    }

    /* JADX INFO: renamed from: c0 */
    public static String m42441c0(long j10) {
        return m42450g() + "users/" + j10 + "/profile";
    }

    /* JADX INFO: renamed from: c1 */
    public static String m42442c1() {
        return m42460l() + "v1/google/purchase";
    }

    /* JADX INFO: renamed from: d */
    public static String m42443d(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m42440c());
        sb2.append("v2/settings");
        if (z10) {
            sb2.append("-compressed");
        }
        sb2.append("/application/");
        sb2.append(m42406M());
        String strM42426W = m42426W();
        if (!strM42426W.isEmpty()) {
            sb2.append("/bucket/");
            sb2.append(strM42426W);
        }
        if (z10) {
            sb2.append("/");
            sb2.append("c94f4ea02188704a1a40f58b2c82ff034a26bc2be981f126c1a3434f869b7915");
            sb2.append(".dcz");
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d0 */
    public static String m42444d0(String str) {
        long jM45296g = C12217h.m45288e().m45296g();
        if (jM45296g == -1) {
            return m42450g() + "users/" + str;
        }
        return m42450g() + "users/" + jM45296g + "/" + str;
    }

    /* JADX INFO: renamed from: d1 */
    public static String m42445d1() {
        return "2.744.1081";
    }

    /* JADX INFO: renamed from: e */
    public static String m42446e() {
        return m42437b() + "v1/attribution-eligibility";
    }

    /* JADX INFO: renamed from: e0 */
    public static String m42447e0() {
        return m42450g() + "home";
    }

    /* JADX INFO: renamed from: f */
    public static String m42448f() {
        return m42456j() + "v1/user/currency";
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m42449f0() {
        return f39639c.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public static String m42450g() {
        return "https://" + f39638b.m27022d();
    }

    /* JADX INFO: renamed from: g0 */
    public static void m42451g0(Context context) {
        f39651o = context.getFilesDir().getAbsolutePath();
        f39650n = context.getCacheDir().getAbsolutePath();
        f39656t = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* JADX INFO: renamed from: h */
    public static String m42452h() {
        if (f39644h == null) {
            return "https://api." + m42412P();
        }
        return "https://" + f39644h;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m42453h0() {
        if (f39645i) {
            return;
        }
        ApplicationInfo applicationInfo = RobloxApplication.m14834f().getApplicationInfo();
        if (NativeSettingsInterface.nativeInitCrashpad(NativeInitCrashpadParams.builder().mo15818c(m42445d1()).mo15819d(m42450g()).mo15822g(m42408N()).mo15827l(C11659h.m43403a().mo43463I2()).mo15826k(C11659h.m43403a().mo43512P3()).mo15824i(CrashpadHandler.class.getCanonicalName()).mo15823h(Arrays.asList("ANDROID_DATA=" + System.getenv("ANDROID_DATA"), "ANDROID_ROOT=" + System.getenv("ANDROID_ROOT"), "ANDROID_STORAGE=" + System.getenv("ANDROID_STORAGE"), "LIBRARYPATH=" + applicationInfo.nativeLibraryDir, "CLASSPATH=.:" + applicationInfo.sourceDir)).mo15825j(m42457j0()).mo15820e(C6115h.m27036a()).mo15821f(C11659h.m43403a().mo43473J5()).m15817b())) {
            f39645i = true;
            C6124q.m27063h("roblox.config", "Crashpad monitoring with API unification is ON");
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m42454i() {
        return "https://auth." + m42412P();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m42455i0(Context context, C6098c c6098c) {
        String string = Settings.Global.getString(context.getContentResolver(), "roblox_channel_override");
        if (string != null) {
            string = string.trim();
        }
        boolean z10 = (f39643g || TextUtils.isEmpty(string)) ? false : true;
        if (z10) {
            C6124q.m27063h("roblox.config", "Using channel from launch override: " + string);
            m42411O0(string);
        }
        if (c6098c != null) {
            if (!f39643g && !z10) {
                m42411O0(c6098c.m26984h());
            }
            String strM26977a = c6098c.m26977a();
            if (m42403K0(c6098c)) {
                C6124q.m27063h("roblox.config", "initConfig: Set base-URL from: " + f39638b + " => " + strM26977a);
            }
        }
        m42405L0(C6133z.m27105b(context, "configure_dev_roblox", true).getString("BaseApiUrl", null));
        f39655s = m42422U(context);
        if (C11659h.m43403a().mo43698p3()) {
            m42409N0(m42384B(context));
            m42407M0(m42386C(context));
            f39642f = m42422U(context).getString("supportsAndroidBinaries", "").equals("true");
        }
        String strM42388D = m42388D(context);
        if (!f39643g && !z10 && !strM42388D.isEmpty()) {
            C6124q.m27063h("roblox.config", "Found channel from preferences: " + strM42388D);
            m42411O0(strM42388D);
        }
        m42417R0(context);
        if (c6098c == null || TextUtils.isEmpty(c6098c.m26987k())) {
            f39646j = m42462m(context);
            return;
        }
        f39646j = c6098c.m26987k();
        f39652p = true;
        C6124q.m27066k("roblox.config", "Using a custom user agent: " + f39646j);
    }

    /* JADX INFO: renamed from: j */
    public static String m42456j() {
        return "https://economy." + m42412P();
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m42457j0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* JADX INFO: renamed from: k */
    public static String m42458k() {
        return "https://users." + m42412P();
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m42459k0() {
        return f39648l;
    }

    /* JADX INFO: renamed from: l */
    public static String m42460l() {
        return m42450g().replace("www.", "billing.");
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m42461l0() {
        return (!C11659h.m43403a().mo43506O4() || m42459k0() || m42471q0()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public static String m42462m(Context context) {
        return m42464n(context, "google");
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m42463m0(String str) {
        String strM42424V = m42424V(str);
        return (!m42465n0(str)) & ((strM42424V == null || strM42424V.isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: n */
    public static String m42464n(Context context, String str) {
        return C12225g.m45323a(context, m42445d1(), "AppleWebKit/537.36", BuildConfig.DISTRIBUTOR_TYPE, BuildConfig.STORE_TYPE, "questvr".equals(str), m42469p0(), m42459k0(), m42477t0());
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m42465n0(String str) {
        return str.contains("Login/FulfillConstraint.aspx") || str.toLowerCase().contains("login/maintenance");
    }

    /* JADX INFO: renamed from: o */
    public static String m42466o() {
        return m42450g() + "mobile-app-upgrades/native-ios/bc";
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m42467o0() {
        if (C11659h.m43403a().mo43444F4()) {
            return true;
        }
        return C11659h.m43403a().mo43770z5() && m42473r0();
    }

    /* JADX INFO: renamed from: p */
    public static String m42468p(String str, String str2) {
        return C6106b0.m27006b("%scaptcha/app/login?credentialsType=%s&credentialsValue=%s&hybrid-return-token=1", m42450g(), str, str2);
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m42469p0() {
        return !f39647k;
    }

    /* JADX INFO: renamed from: q */
    public static String m42470q() {
        return C6106b0.m27006b("%scaptcha/app/signup?hybrid-return-token=1", m42450g());
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m42471q0() {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m42472r(Context context) {
        return m42422U(context).getBoolean("under13", true);
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m42473r0() {
        return f39647k;
    }

    /* JADX INFO: renamed from: s */
    public static void m42474s(Context context) {
        m42422U(context).edit().remove("moduleName").apply();
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m42475s0() {
        return f39638b.m27021c().contains(".robloxlabs.com");
    }

    /* JADX INFO: renamed from: t */
    public static String m42476t() {
        if (!f39652p) {
            return BuildConfig.DISTRIBUTOR_TYPE;
        }
        Matcher matcher = Pattern.compile("\\b[A-Za-z]+Dist\\b").matcher(f39646j);
        if (matcher.find()) {
            return matcher.group();
        }
        C6124q.m27060e("roblox.config", "Unable to find correct distributor type inside customized user agent.");
        return BuildConfig.DISTRIBUTOR_TYPE;
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m42477t0() {
        return f39649m;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m42478u() {
        if (!C11659h.m43403a().mo43530S1()) {
            return false;
        }
        try {
            String strNativeGetCookiesInNetscapeFormat = NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(m42450g());
            return strNativeGetCookiesInNetscapeFormat != null && strNativeGetCookiesInNetscapeFormat.contains(".ROBLOSECURITY");
        } catch (Throwable th2) {
            C6124q.m27066k("roblox.config", "engineHasSecurityCookie: read-back failed: " + th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static String m42479u0() {
        return "^(https?://" + Pattern.quote(m42396H()) + "(?:login|newlogin))(?!/reset-password).*";
    }

    /* JADX INFO: renamed from: v */
    public static String m42480v(String str, int i10) {
        return "&counterName=" + str + "&amount=" + i10;
    }

    /* JADX INFO: renamed from: v0 */
    public static String m42481v0() {
        return m42454i() + "/v2/logout";
    }

    /* JADX INFO: renamed from: w */
    public static String m42482w() {
        return "https://ephemeralcounters.api." + m42412P() + "v1.1/Counters/Increment/?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    /* JADX INFO: renamed from: w0 */
    public static String m42483w0() {
        return m42450g() + "my/messages/#!/inbox";
    }

    /* JADX INFO: renamed from: x */
    public static String m42484x(String str, long j10) {
        return "&sequenceName=" + str + "&value=" + j10;
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m42485x0() {
        return f39654r;
    }

    /* JADX INFO: renamed from: y */
    public static String m42486y() {
        return "https://ephemeralcounters.api." + m42412P() + "v1.0/SequenceStatistics/AddToSequence?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    /* JADX INFO: renamed from: y0 */
    public static String m42487y0() {
        return m42450g() + C11659h.m43403a().mo43565X1();
    }

    /* JADX INFO: renamed from: z */
    public static String m42488z() {
        return "exception_reason.txt";
    }

    /* JADX INFO: renamed from: z0 */
    public static String m42489z0() {
        return m42450g() + "login/resetpasswordrequest/success";
    }
}
