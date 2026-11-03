package com.roblox.client.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import ci.k;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.AFInAppEventParameterName;
import com.appsflyer.share.AFInAppEventType;
import com.appsflyer.share.AppsFlyerConsent;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.SessionReadyListener;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.deeplink.DeepLinkResult;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.universalapp.messagebus.MessageBus;
import ek.b0;
import ek.q;
import im.f;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import nb.qe;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import rg.a1;
import rg.t0;
import rh.h;
import ti.g;

/* JADX INFO: loaded from: classes2.dex */
public class a extends ti.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f9021k = Pattern.compile("[A-Za-z0-9_-]+");
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9022c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9023d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9024e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9025f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f9026g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f9027h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9028i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f9029j = null;

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.a$a, reason: collision with other inner class name */
    public class C0136a implements AppsFlyerConversionListener {
        public C0136a() {
        }

        @Override // com.appsflyer.share.AppsFlyerConversionListener
        public void onConversionDataFail(String str) {
        }

        @Override // com.appsflyer.share.AppsFlyerConversionListener
        public void onConversionDataSuccess(Map<String, Object> map) {
            a.this.N(map);
        }
    }

    public class b implements DeepLinkListener {
        public b() {
        }

        @Override // com.appsflyer.share.deeplink.DeepLinkListener
        public void onDeepLinking(DeepLinkResult deepLinkResult) {
            a.this.P(deepLinkResult);
        }
    }

    public class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9032a;

        public c(Context context) {
            this.f9032a = context;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            a.this.a0(this.f9032a, null);
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            a.this.a0(this.f9032a, a.j0(response));
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9033a = new a();
    }

    public a() {
        q.h("AppsFlyerManager", "[AppsFlyerManager]: Constructor called.");
    }

    public static String E0(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static String F0(Object obj) {
        if (obj == null) {
            return "";
        }
        String string = obj.toString();
        try {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", locale);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat2.format(simpleDateFormat.parse(string));
        } catch (Exception unused) {
            return string;
        }
    }

    public static String G(String... strArr) {
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                return str;
            }
        }
        return null;
    }

    public static boolean G0(Map<String, Object> map) {
        return (map.containsKey("af_ad") || map.containsKey("af_adset")) ? false : true;
    }

    public static a I() {
        return d.f9033a;
    }

    public static long J(Context context, String str, long j10) {
        return K(context).getLong(str, j10);
    }

    public static SharedPreferences K(Context context) {
        return context.getSharedPreferences("APPS_FLYER_SHARED_PREFS", 0);
    }

    public static String L(long j10) {
        return "signupReportedTimeInSeconds_" + j10;
    }

    public static boolean Q(long j10, long j11, long j12) {
        return j10 != 0 && j11 - j10 <= j12;
    }

    public static String W(String str, String str2) {
        if (str == null || str2 == null || !str.contains("://navigation/crossdevice") || !f9021k.matcher(str2).matches() || str.indexOf(35) >= 0) {
            return str;
        }
        int iIndexOf = str.indexOf(63);
        String str3 = "";
        String strSubstring = iIndexOf < 0 ? "" : str.substring(iIndexOf + 1);
        if (strSubstring.startsWith("code=") || strSubstring.contains("&code=")) {
            return str;
        }
        if (iIndexOf < 0) {
            str3 = "?";
        } else if (!strSubstring.isEmpty() && !strSubstring.endsWith("&")) {
            str3 = "&";
        }
        return str + str3 + "code=" + str2;
    }

    public static String X() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    public static JSONObject c0(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Boolean d0(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                Object objOpt = new JSONObject(str).opt("isAdConsentRequired");
                if (objOpt instanceof Boolean) {
                    return (Boolean) objOpt;
                }
                return null;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static Boolean j0(Response response) {
        try {
            ResponseBody responseBodyBody = response.body();
            try {
                if (!response.getIsSuccessful() || responseBodyBody == null) {
                    if (responseBodyBody != null) {
                        responseBodyBody.close();
                    }
                    return null;
                }
                Boolean boolD0 = d0(responseBodyBody.string());
                responseBodyBody.close();
                return boolD0;
            } catch (Throwable th2) {
                if (responseBodyBody != null) {
                    try {
                        responseBodyBody.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
        return null;
    }

    public static boolean n(boolean z10, Boolean bool) {
        return z10 || !Boolean.FALSE.equals(bool);
    }

    public static void s0(Context context, String str, long j10) {
        SharedPreferences.Editor editorEdit = K(context).edit();
        editorEdit.putLong(str, j10);
        editorEdit.apply();
    }

    public static String u0(Map<String, Object> map) {
        String strZ0 = z0(map, "af_ad");
        return G0(map) ? G(strZ0, z0(map, "adgroup")) : strZ0;
    }

    public static String v0(Map<String, Object> map) {
        return G(z0(map, "af_adset"), z0(map, "adset"));
    }

    public static String w0(String str, String str2, String str3, String str4) {
        return G(str, str2, str3, str4);
    }

    public static String x0(Map<String, Object> map) {
        return w0(E0(map, "af_ad"), E0(map, "af_adset"), E0(map, "adgroup"), E0(map, "adset"));
    }

    public static String y0(Map<String, Object> map) {
        return G(z0(map, "af_c_id"), z0(map, Payload.CAMPAIGN_ID));
    }

    public static Request z() {
        return new Request.Builder().url(a1.e()).get().build();
    }

    public static String z0(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        return b0.c(obj);
    }

    public final long A() {
        return ((long) h.a().U5()) * 1000;
    }

    public void A0(Context context, boolean z10) {
        r0(context, "disableDeeplinkTracking", !z10);
        synchronized (this.f9023d) {
            try {
                if (this.f9022c) {
                    if (z10 && AppsFlyerLib.getInstance().isStopped()) {
                        f0(context, null, false);
                    } else if (!z10 && !AppsFlyerLib.getInstance().isStopped()) {
                        AppsFlyerLib.getInstance().stop(true, context);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void B() {
        if (!h.a().E5() || dk.c.c().n()) {
            return;
        }
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(false);
    }

    public final void B0(Context context, String str) {
        synchronized (this.f9023d) {
            try {
                if (this.f9022c) {
                    return;
                }
                boolean zS = S(context);
                this.f9022c = true;
                f0(context, str, zS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void C(Context context) {
        k.a().b().newCall(z()).enqueue(new c(context));
    }

    public final void C0(Context context) {
        if (S(context)) {
            e0();
        } else {
            B0(context, "Android-AppsFlyer-Start-AtInit");
        }
    }

    public void D(Context context) {
        D0(context, null);
    }

    public final void D0(Context context, Boolean bool) {
        boolean zN;
        synchronized (this.f9023d) {
            try {
                if (this.f9022c) {
                    return;
                }
                if (bool != null) {
                    boolean z10 = K(context).getBoolean("delayedStartBackstopEligibilityResolved", true);
                    if (!z10) {
                        t(context, bool.booleanValue());
                    }
                    zN = n(z10, bool);
                } else {
                    zN = true;
                }
                if (zN) {
                    AppsFlyerLib.getInstance().setSharingFilterForPartners("all");
                    s(context, true, null);
                }
                boolean zS = S(context);
                this.f9022c = true;
                f0(context, zN ? "Android-AppsFlyer-Start-Backstop" : "Android-AppsFlyer-Start-BackstopGeoResolved", zS);
                v(context);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E() {
        if (this.b == null) {
            return;
        }
        synchronized (this.f9023d) {
            try {
                if (this.f9022c) {
                    return;
                }
                long j10 = K(this.b).getLong("delayedStartBackstopDeadline", 0L);
                if (j10 == 0 || System.currentTimeMillis() < j10) {
                    return;
                }
                F(this.b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void F(Context context) {
        synchronized (this.f9023d) {
            try {
                if (this.f9022c) {
                    return;
                }
                boolean z10 = K(context).getBoolean("delayedStartBackstopEligibilityResolved", true);
                if (z10) {
                    m0("Android-AppsFlyer-Eligibility-Recheck-Skipped");
                    D(context);
                } else {
                    m0("Android-AppsFlyer-Eligibility-Recheck-Attempted");
                    Z(context, p0());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean H(Context context, String str, boolean z10) {
        return K(context).getBoolean(str, z10);
    }

    public void M(Map<String, String> map) {
        JSONObject jSONObjectH;
        String strW = map.get("af_dp");
        if (strW != null) {
            if (h.a().g1()) {
                jSONObjectH = f.F().h(strW, "android_appsflyer_re_engagement", false);
            } else {
                f.F().f(strW, "android_appsflyer_re_engagement", false);
                jSONObjectH = null;
            }
            String str = map.get("link");
            String strW0 = w0(map.get("af_ad"), map.get("af_adset"), map.get("adgroup"), map.get("adset"));
            if (h.a().a6()) {
                strW = W(strW, map.get("code"));
                if (jSONObjectH != null) {
                    f.F().K(jSONObjectH, strW);
                }
            }
            if (str != null) {
                f.F().l(strW, str, strW0);
            } else {
                q.e("AppsFlyerManager", "Received null attribution URL. This should never happen.");
                f.F().l(strW, null, strW0);
            }
        }
    }

    public void N(Map<String, Object> map) {
        String strX0;
        JSONObject jSONObjectH;
        q.h("AppsFlyerManager", "media-source: " + ((String) map.get("media_source")));
        boolean zEquals = Boolean.TRUE.equals(map.get("is_first_launch"));
        if (zEquals) {
            g0(map);
        }
        if (zEquals && map.containsKey("af_dp")) {
            if (u("Android-AppsFlyer-DeferredRoute-Skip-Gcd")) {
                boolean zA6 = h.a().a6();
                HashMap map2 = new HashMap();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    map2.put(entry.getKey(), (value == null && zA6 && "code".equals(entry.getKey())) ? null : String.valueOf(value));
                }
                String str = map2.get("af_dp");
                if (str != null) {
                    if (h.a().g1()) {
                        f.F().h(str, "android_appsflyer_gcd", false);
                    } else {
                        f.F().f(str, "android_appsflyer_gcd", true);
                    }
                }
                M(map2);
                return;
            }
            return;
        }
        if (!zEquals || !(map.get("deep_link_value") instanceof String) || ((String) map.get("deep_link_value")).isEmpty()) {
            if (zEquals && h.a().Q() && (strX0 = x0(map)) != null) {
                h0(strX0);
                return;
            }
            return;
        }
        String strW = (String) map.get("deep_link_value");
        if (u("Android-AppsFlyer-DeferredRoute-Skip-Gcd")) {
            if (h.a().g1()) {
                jSONObjectH = f.F().h(strW, "android_appsflyer_gcd", false);
            } else {
                f.F().f(strW, "android_appsflyer_gcd", true);
                jSONObjectH = null;
            }
            String strX1 = x0(map);
            if (h.a().a6()) {
                Object obj = map.get("code");
                strW = W(strW, obj instanceof String ? (String) obj : null);
                if (jSONObjectH != null) {
                    f.F().K(jSONObjectH, strW);
                }
            }
            f.F().l(strW, null, strX1);
        }
    }

    public final void O(boolean z10) {
        if (z10) {
            AppsFlyerLib.getInstance().anonymizeUser(false);
        }
    }

    public void P(DeepLinkResult deepLinkResult) {
        String deepLinkValue;
        JSONObject jSONObjectH;
        if (deepLinkResult.getStatus() != DeepLinkResult.Status.FOUND || deepLinkResult.getDeepLink() == null || (deepLinkValue = deepLinkResult.getDeepLink().getDeepLinkValue()) == null || deepLinkValue.isEmpty()) {
            return;
        }
        Boolean boolIsDeferred = deepLinkResult.getDeepLink().isDeferred();
        if (!Boolean.TRUE.equals(boolIsDeferred) || u("Android-AppsFlyer-DeferredRoute-Skip-Udl")) {
            if (h.a().g1()) {
                jSONObjectH = f.F().h(deepLinkValue, "android_appsflyer_udl", false);
            } else {
                if (boolIsDeferred != null) {
                    f.F().f(deepLinkValue, "android_appsflyer_udl", boolIsDeferred.booleanValue());
                } else {
                    f.F().e(deepLinkValue, "android_appsflyer_udl");
                }
                jSONObjectH = null;
            }
            String strW0 = w0(deepLinkResult.getDeepLink().getStringValue("af_ad"), deepLinkResult.getDeepLink().getStringValue("af_adset"), deepLinkResult.getDeepLink().getStringValue("adgroup"), deepLinkResult.getDeepLink().getStringValue("adset"));
            if (h.a().a6()) {
                deepLinkValue = W(deepLinkValue, deepLinkResult.getDeepLink().getStringValue("code"));
                if (jSONObjectH != null) {
                    f.F().K(jSONObjectH, deepLinkValue);
                }
            }
            f.F().l(deepLinkValue, null, strW0);
        }
    }

    public final boolean R() {
        return (dk.c.c().n() || mh.b.a()) ? false : true;
    }

    public final boolean S(Context context) {
        return h.a().K4() && H(context, "disableDeeplinkTracking", false);
    }

    public final /* synthetic */ void T(boolean z10) {
        A0(this.b, z10);
    }

    public final void U(Context context) {
        SharedPreferences sharedPreferencesK = K(context);
        if (sharedPreferencesK.getLong("delayedStartBackstopDeadline", 0L) != 0) {
            sharedPreferencesK.edit().putBoolean("delayedStartBackstopEligibilityResolved", true).apply();
        }
    }

    public final boolean V(Context context) {
        SharedPreferences sharedPreferencesK = K(context);
        if (!Q(sharedPreferencesK.getLong("delayedStartConsentTs", 0L), System.currentTimeMillis(), A())) {
            return false;
        }
        boolean z10 = sharedPreferencesK.getBoolean("delayedStartConsentApplySharingFilter", true);
        JSONObject jSONObjectC0 = c0(sharedPreferencesK.getString("delayedStartConsentDma", null));
        synchronized (this.f9023d) {
            try {
                if (this.f9022c) {
                    return true;
                }
                o(AppsFlyerLib.getInstance(), jSONObjectC0, z10);
                boolean zS = S(context);
                this.f9022c = true;
                v(context);
                f0(context, "Android-AppsFlyer-Start-CachedConsent", zS);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void Y(JSONObject jSONObject) {
        boolean z10;
        boolean zS;
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        synchronized (this.f9023d) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dmaConsent");
                boolean zOptBoolean = jSONObject.optBoolean("applySharingFilter", true);
                o(appsFlyerLib, jSONObjectOptJSONObject, zOptBoolean);
                s(this.b, zOptBoolean, jSONObjectOptJSONObject);
                z10 = this.f9022c;
                if (z10) {
                    zS = false;
                } else {
                    zS = S(this.b);
                    this.f9022c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        v(this.b);
        f0(this.b, "Android-AppsFlyer-Start-Attribution", zS);
    }

    public void Z(Context context, Boolean bool) {
        if (bool == null) {
            m0("Android-AppsFlyer-Eligibility-Recheck-Unresolved");
        } else {
            m0(bool.booleanValue() ? "Android-AppsFlyer-Eligibility-Recheck-Flagged" : "Android-AppsFlyer-Eligibility-Recheck-NotFlagged");
        }
        D0(context, bool);
    }

    @Override // ti.d
    public void a(Context context) {
        boolean zA = mh.b.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("init: initEnabled=");
        sb2.append(!zA);
        q.h("AppsFlyerManager", sb2.toString());
        if (zA) {
            return;
        }
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        appsFlyerLib.setMinTimeBetweenSessions(90);
        appsFlyerLib.setOneLinkCustomDomain("roblox.onelink.me", "ro.blox.com", "go.roblox.com");
        O(H(context, "enableTracking", true));
        C0136a c0136a = new C0136a();
        appsFlyerLib.setCollectAndroidID(false);
        if (h.a().E5()) {
            appsFlyerLib.setDisableAdvertisingIdentifiers(true);
        }
        appsFlyerLib.init("Quwp4RGsFwE6rVnyTFm6jQ", c0136a, context);
        appsFlyerLib.registerSessionReadyListener(new SessionReadyListener() { // from class: xg.a
            @Override // com.appsflyer.share.SessionReadyListener
            public final void onSessionReady() {
                this.f35740a.b0();
            }
        });
        appsFlyerLib.subscribeForDeepLink(new b());
        this.b = context;
        f.F().w(new f.h() { // from class: xg.b
            @Override // im.f.h
            public final void a(JSONObject jSONObject) {
                this.f35741a.Y(jSONObject);
            }
        });
        q0(context);
        if (h.a().m4()) {
            f.F().x(new f.i() { // from class: xg.c
                @Override // im.f.i
                public final void a(boolean z10) {
                    this.f35742a.T(z10);
                }
            });
        }
        f.F().E(appsFlyerLib.getAppsFlyerUID(context));
    }

    public final void a0(Context context, Boolean bool) {
        if (bool == null) {
            m0("Android-AppsFlyer-Eligibility-Unresolved");
            p(context, true, false);
            return;
        }
        synchronized (this.f9023d) {
            try {
                t(context, bool.booleanValue());
                if (bool.booleanValue()) {
                    U(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m0(bool.booleanValue() ? "Android-AppsFlyer-Eligibility-Flagged" : "Android-AppsFlyer-Eligibility-NotFlagged");
        p(context, bool.booleanValue(), true);
    }

    @Override // ti.d
    public void b() {
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(true);
    }

    public void b0() {
        synchronized (this.f9023d) {
            try {
                this.f9027h = true;
                if (this.f9028i) {
                    String str = this.f9029j;
                    this.f9028i = false;
                    this.f9029j = null;
                    x(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ti.d
    public void c(Context context) {
        boolean zR = R();
        q.h("AppsFlyerManager", "first play: enabled=" + zR);
        if (zR) {
            String str = "firstPlayReported_" + dk.c.c().j();
            if (H(context, str, false)) {
                return;
            }
            r0(context, str, true);
            if (!h.a().P3()) {
                AppsFlyerLib.getInstance().logEvent(this.b, AFInAppEventType.LEVEL_ACHIEVED, null);
            }
            o0("firstPlayReported", null);
            n0("Android-AppsFlyer-FirstPlay");
        }
    }

    @Override // ti.d
    public void d(Context context) {
        boolean zR = R();
        q.h("AppsFlyerManager", "login: enabled=" + zR);
        if (!zR) {
            m(context);
            return;
        }
        B();
        o0("loginReported", null);
        n0("Android-AppsFlyer-Login");
        l0(context);
        y(context);
    }

    @Override // ti.d
    public void e(Context context, long j10) {
        boolean zR = R();
        q.h("AppsFlyerManager", "playtime: enabled=" + zR);
        if (zR) {
            String str = "experiencePlaytimeReported_" + dk.c.c().j();
            if (H(context, str, false) || j10 < TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES)) {
                return;
            }
            if (!h.a().R5()) {
                AppsFlyerLib.getInstance().logEvent(this.b, String.format(Locale.ENGLISH, "af_experience_playtime_%dmin", 15), null);
            }
            o0("experiencePlaytimeReported", null);
            n0("Android-AppsFlyer-ExperiencePlaytime");
            r0(context, str, true);
        }
    }

    public final void e0() {
        String dataString;
        Intent intent = this.f32391a;
        if (intent == null || (dataString = intent.getDataString()) == null) {
            return;
        }
        AppsFlyerLib.getInstance().performDeepLinking(dataString, false);
    }

    @Override // ti.d
    public void f(@NonNull String str, String str2, String str3, long j10, boolean z10) {
        boolean zR = R();
        q.h("AppsFlyerManager", "Purchase. enabled=" + zR + ". Price: " + str2 + ".");
        if (zR) {
            k0(str, str2, str3);
        }
    }

    public final void f0(Context context, String str, boolean z10) {
        if (z10) {
            AppsFlyerLib.getInstance().stop(true, context);
            return;
        }
        synchronized (this.f9023d) {
            try {
                if (this.f9027h) {
                    x(str);
                } else {
                    this.f9028i = true;
                    this.f9029j = str;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ti.d
    public void g(Context context) {
        boolean zR = R();
        q.h("AppsFlyerManager", "signup: enabled=" + zR);
        if (!zR) {
            m(context);
            return;
        }
        B();
        o0("signUpReported", null);
        n0("Android-AppsFlyer-Registration");
        s0(context, L(dk.c.c().j()), TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
        y(context);
    }

    public void g0(Map<String, Object> map) {
        boolean zEquals = "Organic".equals(map.get("af_status"));
        long j10 = a1.f30334u;
        if (j10 == 0) {
            n0("Android-AppsFlyer-AttributionContext-Skip-BtidNotReady");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("body", r(j10, map).toString());
            MessageBus.f().l(km.f.f22905a.a("Linking", "recordAttributionContext"), jSONObject);
            n0(zEquals ? "Android-AppsFlyer-AttributionContext-Published-Organic" : "Android-AppsFlyer-AttributionContext-Published");
        } catch (Exception e10) {
            q.e("AppsFlyerManager", "Failed to publish recordAttributionContext: " + e10.getMessage());
            n0("Android-AppsFlyer-AttributionContext-Skip-JsonError");
        }
    }

    public void h0(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        synchronized (this.f9026g) {
            try {
                if (this.f9025f) {
                    m0("Android-AppsFlyer-DDR-Publish-Skip-Duplicate");
                    return;
                }
                this.f9025f = true;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attributionAdName", str);
                    MessageBus.f().l(km.f.f22905a.a("Linking", "resolveAttributionAdName"), jSONObject);
                } catch (JSONException e10) {
                    q.e("AppsFlyerManager", "Failed to publish resolveAttributionAdName: " + e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ti.d
    public void i(String str) {
        AppsFlyerLib.getInstance().setCustomerUserId(str);
    }

    public final Boolean i0(Context context) {
        long j10 = K(context).getLong("delayedStartEligibilityTs", 0L);
        if (j10 == 0 || System.currentTimeMillis() - j10 > A()) {
            return null;
        }
        return Boolean.valueOf(H(context, "delayedStartFlagged", true));
    }

    public final void k0(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("productId", str));
        arrayList.add(new NameValuePair("price", str2));
        arrayList.add(new NameValuePair("currencyCode", str3));
        o0("purchaseReported", arrayList);
        n0("Android-AppsFlyer-Purchase");
    }

    public final void l0(Context context) {
        boolean zR = R();
        q.h("AppsFlyerManager", "Login retention: enabled=" + zR);
        if (zR) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long jConvert = timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            long j10 = dk.c.c().j();
            long J = J(context, L(j10), 0L);
            if (J > 0) {
                long jConvert2 = TimeUnit.DAYS.convert(jConvert - J, timeUnit);
                if (jConvert2 < 1 || jConvert2 > 3) {
                    return;
                }
                Locale locale = Locale.ENGLISH;
                String str = String.format(locale, "af_retention_d%d", Long.valueOf(jConvert2));
                String str2 = String.format(locale, "Android-AppsFlyer-AppRetention-D%d", Long.valueOf(jConvert2));
                String str3 = String.format(locale, "appRetentionReportedD%d", Long.valueOf(jConvert2));
                String str4 = str3 + "_" + j10;
                if (H(context, str4, false)) {
                    return;
                }
                r0(context, str4, true);
                if (!h.a().d6()) {
                    AppsFlyerLib.getInstance().logEvent(this.b, str, null);
                }
                o0(str3, null);
                n0(str2);
            }
        }
    }

    public final void m(Context context) {
        AppsFlyerLib.getInstance().anonymizeUser(true);
        r0(context, "enableTracking", false);
    }

    public final void m0(String str) {
        qm.c.b(new qm.c.a(str, qe.a(new Object[]{TelemetryBackend.COUNTER})).j(2026, 7, 30).d());
    }

    public final void n0(String str) {
        g.b().q(str);
    }

    public final void o(AppsFlyerLib appsFlyerLib, JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Boolean boolValueOf = jSONObject.has("consented") ? Boolean.valueOf(jSONObject.optBoolean("consented")) : null;
            appsFlyerLib.setConsentData(new AppsFlyerConsent(jSONObject.has("isSubjectToGdpr") ? Boolean.valueOf(jSONObject.optBoolean("isSubjectToGdpr")) : null, boolValueOf, boolValueOf, boolValueOf));
        }
        if (z10) {
            appsFlyerLib.setSharingFilterForPartners("all");
            m0("Android-AppsFlyer-Sharing-Filter-Applied");
        } else {
            appsFlyerLib.setSharingFilterForPartners("");
            m0("Android-AppsFlyer-Sharing-Filter-Cleared");
        }
    }

    public final void o0(String str, List<NameValuePair> list) {
        t0.i(str, "appsFlyer", list);
    }

    public void p(Context context, boolean z10, boolean z11) {
        if (z10) {
            if (V(context)) {
                return;
            }
            q(context, z11);
        } else {
            C0(context);
            if (K(context).getLong("delayedStartBackstopDeadline", 0L) != 0) {
                v(context);
            }
        }
    }

    public final Boolean p0() {
        try {
            Response responseExecute = k.a().b().newCall(z()).execute();
            try {
                Boolean boolJ0 = j0(responseExecute);
                if (responseExecute != null) {
                    responseExecute.close();
                }
                return boolJ0;
            } catch (Throwable th2) {
                if (responseExecute != null) {
                    try {
                        responseExecute.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final void q(Context context, boolean z10) {
        synchronized (this.f9023d) {
            try {
                if (this.f9022c) {
                    return;
                }
                SharedPreferences sharedPreferencesK = K(context);
                long jCurrentTimeMillis = sharedPreferencesK.getLong("delayedStartBackstopDeadline", 0L);
                if (jCurrentTimeMillis == 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() + w();
                    sharedPreferencesK.edit().putLong("delayedStartBackstopDeadline", jCurrentTimeMillis).putBoolean("delayedStartBackstopEligibilityResolved", z10).apply();
                } else if (z10) {
                    sharedPreferencesK.edit().putBoolean("delayedStartBackstopEligibilityResolved", true).apply();
                }
                t0(context, jCurrentTimeMillis);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q0(Context context) {
        Boolean boolI0;
        synchronized (this.f9023d) {
            try {
                boolI0 = i0(context);
                if (Boolean.TRUE.equals(boolI0)) {
                    U(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (boolI0 == null) {
            C(context);
        } else {
            m0("Android-AppsFlyer-Eligibility-CacheHit");
            p(context, boolI0.booleanValue(), true);
        }
    }

    public JSONObject r(long j10, Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("btid", String.valueOf(j10));
        jSONObject.put("afAd", b0.c(u0(map)));
        jSONObject.put("afAdset", b0.c(v0(map)));
        jSONObject.put("mediaSource", b0.c(map.get("media_source")));
        jSONObject.put("country", b0.c(map.get("country_code")));
        jSONObject.put("campaign", b0.c(map.get("campaign")));
        jSONObject.put("campaignId", b0.c(y0(map)));
        jSONObject.put("isRetargeting", Boolean.parseBoolean(String.valueOf(map.get("is_retargeting"))));
        jSONObject.put("retargetingConversionType", b0.c(map.get("retargeting_conversion_type")));
        jSONObject.put("siteId", b0.c(map.get("af_siteid")));
        jSONObject.put("channel", b0.c(map.get(AFInAppEventParameterName.AF_CHANNEL)));
        jSONObject.put("appsflyerId", b0.c(AppsFlyerLib.getInstance().getAppsFlyerUID(this.b)));
        jSONObject.put("deepLinkValue", b0.c(map.get("deep_link_value")));
        jSONObject.put("afDp", b0.c(map.get("af_dp")));
        jSONObject.put("installTime", F0(map.get("install_time")));
        jSONObject.put("platform", "ANDROID");
        jSONObject.put("requestId", UUID.randomUUID().toString());
        jSONObject.put("clientTime", X());
        return jSONObject;
    }

    public final void r0(Context context, String str, boolean z10) {
        SharedPreferences.Editor editorEdit = K(context).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    public final void s(Context context, boolean z10, JSONObject jSONObject) {
        SharedPreferences.Editor editorEdit = K(context).edit();
        editorEdit.putBoolean("delayedStartConsentApplySharingFilter", z10);
        if (jSONObject != null) {
            editorEdit.putString("delayedStartConsentDma", jSONObject.toString());
        } else {
            editorEdit.remove("delayedStartConsentDma");
        }
        editorEdit.putLong("delayedStartConsentTs", System.currentTimeMillis());
        editorEdit.apply();
    }

    public final void t(Context context, boolean z10) {
        K(context).edit().putBoolean("delayedStartFlagged", z10).putLong("delayedStartEligibilityTs", System.currentTimeMillis()).apply();
    }

    public final void t0(Context context, long j10) {
        Context applicationContext = context.getApplicationContext();
        long jCurrentTimeMillis = j10 - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            D(applicationContext);
        } else {
            ConsentBackstopWorker.INSTANCE.b(applicationContext, jCurrentTimeMillis);
        }
    }

    public boolean u(String str) {
        synchronized (this.f9026g) {
            try {
                if (this.f9024e) {
                    m0(str);
                    return false;
                }
                this.f9024e = true;
                m0("Android-AppsFlyer-DeferredRoute");
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v(Context context) {
        synchronized (this.f9023d) {
            K(context).edit().remove("delayedStartBackstopDeadline").remove("delayedStartBackstopEligibilityResolved").apply();
        }
        ConsentBackstopWorker.INSTANCE.a(context);
    }

    public final long w() {
        return ((long) h.a().E4()) * 1000;
    }

    public final void x(String str) {
        AppsFlyerLib.getInstance().start();
        if (str != null) {
            m0(str);
        }
        e0();
    }

    public final void y(Context context) {
        r0(context, "enableTracking", true);
        O(true);
    }
}
