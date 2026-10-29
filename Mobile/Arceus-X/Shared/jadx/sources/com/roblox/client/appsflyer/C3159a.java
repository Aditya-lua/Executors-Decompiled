package com.roblox.client.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
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
import fk.C5654c;
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
import km.C7635f;
import mm.C8589f;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import p104ei.C5133k;
import p151gk.C6106b0;
import p151gk.C6124q;
import p306nb.C9261qe;
import p308nh.C9476b;
import sg.C11295a1;
import sg.C11356t0;
import sm.C11416c;
import th.C11659h;
import vi.C12213d;
import vi.C12216g;

/* JADX INFO: renamed from: com.roblox.client.appsflyer.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3159a extends C12213d {

    /* JADX INFO: renamed from: k */
    public static final Pattern f11665k = Pattern.compile("[A-Za-z0-9_-]+");

    /* JADX INFO: renamed from: b */
    public Context f11666b;

    /* JADX INFO: renamed from: c */
    public boolean f11667c = false;

    /* JADX INFO: renamed from: d */
    public final Object f11668d = new Object();

    /* JADX INFO: renamed from: e */
    public boolean f11669e = false;

    /* JADX INFO: renamed from: f */
    public boolean f11670f = false;

    /* JADX INFO: renamed from: g */
    public final Object f11671g = new Object();

    /* JADX INFO: renamed from: h */
    public volatile boolean f11672h = false;

    /* JADX INFO: renamed from: i */
    public boolean f11673i = false;

    /* JADX INFO: renamed from: j */
    public String f11674j = null;

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.a$a */
    public class a implements AppsFlyerConversionListener {
        public a() {
        }

        @Override // com.appsflyer.share.AppsFlyerConversionListener
        public void onConversionDataFail(String str) {
        }

        @Override // com.appsflyer.share.AppsFlyerConversionListener
        public void onConversionDataSuccess(Map<String, Object> map) {
            C3159a.this.m14913N(map);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.a$b */
    public class b implements DeepLinkListener {
        public b() {
        }

        @Override // com.appsflyer.share.deeplink.DeepLinkListener
        public void onDeepLinking(DeepLinkResult deepLinkResult) {
            C3159a.this.m14915P(deepLinkResult);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.a$c */
    public class c implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f11677a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(Context context) {
            this.f11677a = context;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            C3159a.this.m14924a0(this.f11677a, null);
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            C3159a.this.m14924a0(this.f11677a, C3159a.m14889j0(response));
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.a$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public static final C3159a f11679a = new C3159a();
    }

    public C3159a() {
        C6124q.m27063h("AppsFlyerManager", "[AppsFlyerManager]: Constructor called.");
    }

    /* JADX INFO: renamed from: B0 */
    public static boolean m14874B0() {
        return C11659h.m43403a().mo43421C2();
    }

    /* JADX INFO: renamed from: F0 */
    public static String m14875F0(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public static String m14876G(String... strArr) {
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: G0 */
    public static String m14877G0(Object obj) {
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

    /* JADX INFO: renamed from: H0 */
    public static boolean m14878H0(Map<String, Object> map) {
        return (map.containsKey("af_ad") || map.containsKey("af_adset")) ? false : true;
    }

    /* JADX INFO: renamed from: I */
    public static C3159a m14879I() {
        return d.f11679a;
    }

    /* JADX INFO: renamed from: J */
    public static long m14880J(Context context, String str, long j10) {
        return m14881K(context).getLong(str, j10);
    }

    /* JADX INFO: renamed from: K */
    public static SharedPreferences m14881K(Context context) {
        return context.getSharedPreferences("APPS_FLYER_SHARED_PREFS", 0);
    }

    /* JADX INFO: renamed from: L */
    public static String m14882L(long j10) {
        return "signupReportedTimeInSeconds_" + j10;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m14883Q(long j10, long j11, long j12) {
        return j10 != 0 && j11 - j10 <= j12;
    }

    /* JADX INFO: renamed from: W */
    public static String m14884W(String str, String str2) {
        if (str == null || str2 == null || !str.contains("://navigation/crossdevice") || !f11665k.matcher(str2).matches() || str.indexOf(35) >= 0) {
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

    /* JADX INFO: renamed from: X */
    public static String m14885X() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    /* JADX INFO: renamed from: c0 */
    public static JSONObject m14886c0(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static Boolean m14887d0(String str) {
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

    /* JADX INFO: renamed from: j0 */
    public static Boolean m14889j0(Response response) {
        try {
            ResponseBody responseBodyBody = response.body();
            try {
                if (!response.getIsSuccessful() || responseBodyBody == null) {
                    if (responseBodyBody != null) {
                        responseBodyBody.close();
                    }
                    return null;
                }
                Boolean boolM14887d0 = m14887d0(responseBodyBody.string());
                responseBodyBody.close();
                return boolM14887d0;
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

    /* JADX INFO: renamed from: n */
    public static boolean m14892n(boolean z10, Boolean bool) {
        return z10 || !Boolean.FALSE.equals(bool);
    }

    /* JADX INFO: renamed from: s0 */
    public static void m14893s0(Context context, String str, long j10) {
        SharedPreferences.Editor editorEdit = m14881K(context).edit();
        editorEdit.putLong(str, j10);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: u0 */
    public static String m14894u0(Map<String, Object> map) {
        String strM14900z0 = m14900z0(map, "af_ad");
        return (m14874B0() && m14878H0(map)) ? m14876G(strM14900z0, m14900z0(map, "adgroup")) : strM14900z0;
    }

    /* JADX INFO: renamed from: v0 */
    public static String m14895v0(Map<String, Object> map) {
        String strM14900z0 = m14900z0(map, "af_adset");
        return m14874B0() ? m14876G(strM14900z0, m14900z0(map, "adset")) : strM14900z0;
    }

    /* JADX INFO: renamed from: w0 */
    public static String m14896w0(String str, String str2, String str3, String str4) {
        return m14874B0() ? m14876G(str, str2, str3, str4) : m14876G(str, str2);
    }

    /* JADX INFO: renamed from: x0 */
    public static String m14897x0(Map<String, Object> map) {
        return m14896w0(m14875F0(map, "af_ad"), m14875F0(map, "af_adset"), m14875F0(map, "adgroup"), m14875F0(map, "adset"));
    }

    /* JADX INFO: renamed from: y0 */
    public static String m14898y0(Map<String, Object> map) {
        String strM14900z0 = m14900z0(map, "af_c_id");
        return m14874B0() ? m14876G(strM14900z0, m14900z0(map, Payload.CAMPAIGN_ID)) : strM14900z0;
    }

    /* JADX INFO: renamed from: z */
    public static Request m14899z() {
        return new Request.Builder().url(C11295a1.m42446e()).get().build();
    }

    /* JADX INFO: renamed from: z0 */
    public static String m14900z0(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        return C6106b0.m27007c(obj);
    }

    /* JADX INFO: renamed from: A */
    public final long m14901A() {
        return ((long) C11659h.m43403a().mo43521Q5()) * 1000;
    }

    /* JADX INFO: renamed from: A0 */
    public void m14902A0(Context context, boolean z10) {
        m14950r0(context, "disableDeeplinkTracking", !z10);
        synchronized (this.f11668d) {
            try {
                if (this.f11667c) {
                    if (z10 && AppsFlyerLib.getInstance().isStopped()) {
                        m14932f0(context, null, false);
                    } else if (!z10 && !AppsFlyerLib.getInstance().isStopped()) {
                        AppsFlyerLib.getInstance().stop(true, context);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m14903B() {
        if (!C11659h.m43403a().mo43410A5() || C5654c.m25669c().m25682n()) {
            return;
        }
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(false);
    }

    /* JADX INFO: renamed from: C */
    public final void m14904C(Context context) {
        C5133k.m23938a().m23939b().newCall(m14899z()).enqueue(new c(context));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m14905C0(Context context, String str) {
        synchronized (this.f11668d) {
            try {
                if (this.f11667c) {
                    return;
                }
                boolean zM14917S = m14917S(context);
                this.f11667c = true;
                m14932f0(context, str, zM14917S);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m14906D(Context context) {
        m14909E0(context, null);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m14907D0(Context context) {
        if (m14917S(context)) {
            m14930e0();
        } else {
            m14905C0(context, "Android-AppsFlyer-Start-AtInit");
        }
    }

    /* JADX INFO: renamed from: E */
    public void m14908E() {
        if (this.f11666b == null) {
            return;
        }
        synchronized (this.f11668d) {
            try {
                if (this.f11667c) {
                    return;
                }
                long j10 = m14881K(this.f11666b).getLong("delayedStartBackstopDeadline", 0L);
                if (j10 == 0 || System.currentTimeMillis() < j10) {
                    return;
                }
                if (C11659h.m43403a().mo43672l5()) {
                    m14910F(this.f11666b);
                } else {
                    m14906D(this.f11666b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m14909E0(Context context, Boolean bool) {
        boolean zM14892n;
        synchronized (this.f11668d) {
            try {
                if (this.f11667c) {
                    return;
                }
                if (bool == null || !C11659h.m43403a().mo43672l5()) {
                    zM14892n = true;
                } else {
                    boolean z10 = m14881K(context).getBoolean("delayedStartBackstopEligibilityResolved", true);
                    if (!z10) {
                        m14952t(context, bool.booleanValue());
                    }
                    zM14892n = m14892n(z10, bool);
                }
                if (zM14892n) {
                    AppsFlyerLib.getInstance().setSharingFilterForPartners("all");
                    m14951s(context, true, null);
                }
                boolean zM14917S = m14917S(context);
                this.f11667c = true;
                m14932f0(context, zM14892n ? "Android-AppsFlyer-Start-Backstop" : "Android-AppsFlyer-Start-BackstopGeoResolved", zM14917S);
                m14955v(context);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX INFO: renamed from: F */
    public void m14910F(Context context) {
        boolean z10;
        synchronized (this.f11668d) {
            try {
                if (this.f11667c) {
                    return;
                }
                boolean zMo43672l5 = C11659h.m43403a().mo43672l5();
                if (zMo43672l5) {
                    z10 = true;
                    if (m14881K(context).getBoolean("delayedStartBackstopEligibilityResolved", true)) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    m14941m0("Android-AppsFlyer-Eligibility-Recheck-Attempted");
                    m14922Z(context, m14946p0());
                } else {
                    if (zMo43672l5) {
                        m14941m0("Android-AppsFlyer-Eligibility-Recheck-Skipped");
                    }
                    m14906D(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m14911H(Context context, String str, boolean z10) {
        return m14881K(context).getBoolean(str, z10);
    }

    /* JADX INFO: renamed from: M */
    public void m14912M(Map<String, String> map) {
        JSONObject jSONObjectM31540h;
        String strM14884W = map.get("af_dp");
        if (strM14884W != null) {
            if (C11659h.m43403a().mo43610d1()) {
                jSONObjectM31540h = C7635f.m31524D().m31540h(strM14884W, "android_appsflyer_re_engagement", false);
            } else {
                C7635f.m31524D().m31538f(strM14884W, "android_appsflyer_re_engagement", false);
                jSONObjectM31540h = null;
            }
            String str = map.get("link");
            String strM14896w0 = m14896w0(map.get("af_ad"), map.get("af_adset"), map.get("adgroup"), map.get("adset"));
            if (C11659h.m43403a().mo43569X5()) {
                strM14884W = m14884W(strM14884W, map.get("code"));
                if (jSONObjectM31540h != null) {
                    C7635f.m31524D().m31535I(jSONObjectM31540h, strM14884W);
                }
            }
            if (str != null) {
                C7635f.m31524D().m31544l(strM14884W, str, strM14896w0);
            } else {
                C6124q.m27060e("AppsFlyerManager", "Received null attribution URL. This should never happen.");
                C7635f.m31524D().m31544l(strM14884W, null, strM14896w0);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m14913N(Map<String, Object> map) {
        String strM14897x0;
        JSONObject jSONObjectM31540h;
        C6124q.m27063h("AppsFlyerManager", "media-source: " + ((String) map.get("media_source")));
        boolean zEquals = Boolean.TRUE.equals(map.get("is_first_launch"));
        if (zEquals) {
            m14934g0(map);
        }
        if (zEquals && map.containsKey("af_dp")) {
            if (m14954u("Android-AppsFlyer-DeferredRoute-Skip-Gcd")) {
                boolean zMo43569X5 = C11659h.m43403a().mo43569X5();
                HashMap map2 = new HashMap();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    map2.put(entry.getKey(), (value == null && zMo43569X5 && "code".equals(entry.getKey())) ? null : String.valueOf(value));
                }
                String str = map2.get("af_dp");
                if (str != null) {
                    if (C11659h.m43403a().mo43610d1()) {
                        C7635f.m31524D().m31540h(str, "android_appsflyer_gcd", false);
                    } else {
                        C7635f.m31524D().m31538f(str, "android_appsflyer_gcd", true);
                    }
                }
                m14912M(map2);
                return;
            }
            return;
        }
        if (!zEquals || !(map.get("deep_link_value") instanceof String) || ((String) map.get("deep_link_value")).isEmpty()) {
            if (zEquals && C11659h.m43403a().mo43522R() && (strM14897x0 = m14897x0(map)) != null) {
                m14935h0(strM14897x0);
                return;
            }
            return;
        }
        String strM14884W = (String) map.get("deep_link_value");
        if (m14954u("Android-AppsFlyer-DeferredRoute-Skip-Gcd")) {
            if (C11659h.m43403a().mo43610d1()) {
                jSONObjectM31540h = C7635f.m31524D().m31540h(strM14884W, "android_appsflyer_gcd", false);
            } else {
                C7635f.m31524D().m31538f(strM14884W, "android_appsflyer_gcd", true);
                jSONObjectM31540h = null;
            }
            String strM14897x1 = m14897x0(map);
            if (C11659h.m43403a().mo43569X5()) {
                Object obj = map.get("code");
                strM14884W = m14884W(strM14884W, obj instanceof String ? (String) obj : null);
                if (jSONObjectM31540h != null) {
                    C7635f.m31524D().m31535I(jSONObjectM31540h, strM14884W);
                }
            }
            C7635f.m31524D().m31544l(strM14884W, null, strM14897x1);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m14914O(boolean z10) {
        if (z10) {
            AppsFlyerLib.getInstance().anonymizeUser(false);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m14915P(DeepLinkResult deepLinkResult) {
        String deepLinkValue;
        JSONObject jSONObjectM31540h;
        if (deepLinkResult.getStatus() != DeepLinkResult.Status.FOUND || deepLinkResult.getDeepLink() == null || (deepLinkValue = deepLinkResult.getDeepLink().getDeepLinkValue()) == null || deepLinkValue.isEmpty()) {
            return;
        }
        Boolean boolIsDeferred = deepLinkResult.getDeepLink().isDeferred();
        if (!Boolean.TRUE.equals(boolIsDeferred) || m14954u("Android-AppsFlyer-DeferredRoute-Skip-Udl")) {
            if (C11659h.m43403a().mo43610d1()) {
                jSONObjectM31540h = C7635f.m31524D().m31540h(deepLinkValue, "android_appsflyer_udl", false);
            } else {
                if (boolIsDeferred != null) {
                    C7635f.m31524D().m31538f(deepLinkValue, "android_appsflyer_udl", boolIsDeferred.booleanValue());
                } else {
                    C7635f.m31524D().m31537e(deepLinkValue, "android_appsflyer_udl");
                }
                jSONObjectM31540h = null;
            }
            String strM14896w0 = m14896w0(deepLinkResult.getDeepLink().getStringValue("af_ad"), deepLinkResult.getDeepLink().getStringValue("af_adset"), deepLinkResult.getDeepLink().getStringValue("adgroup"), deepLinkResult.getDeepLink().getStringValue("adset"));
            if (C11659h.m43403a().mo43569X5()) {
                deepLinkValue = m14884W(deepLinkValue, deepLinkResult.getDeepLink().getStringValue("code"));
                if (jSONObjectM31540h != null) {
                    C7635f.m31524D().m31535I(jSONObjectM31540h, deepLinkValue);
                }
            }
            C7635f.m31524D().m31544l(deepLinkValue, null, strM14896w0);
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m14916R() {
        return (C5654c.m25669c().m25682n() || C9476b.m37333a()) ? false : true;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m14917S(Context context) {
        return C11659h.m43403a().mo43430D4() && m14911H(context, "disableDeeplinkTracking", false);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m14918T(boolean z10) {
        m14902A0(this.f11666b, z10);
    }

    /* JADX INFO: renamed from: U */
    public final void m14919U(Context context) {
        if (C11659h.m43403a().mo43672l5()) {
            SharedPreferences sharedPreferencesM14881K = m14881K(context);
            if (sharedPreferencesM14881K.getLong("delayedStartBackstopDeadline", 0L) != 0) {
                sharedPreferencesM14881K.edit().putBoolean("delayedStartBackstopEligibilityResolved", true).apply();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m14920V(Context context) {
        SharedPreferences sharedPreferencesM14881K = m14881K(context);
        if (!m14883Q(sharedPreferencesM14881K.getLong("delayedStartConsentTs", 0L), System.currentTimeMillis(), m14901A())) {
            return false;
        }
        boolean z10 = sharedPreferencesM14881K.getBoolean("delayedStartConsentApplySharingFilter", true);
        JSONObject jSONObjectM14886c0 = m14886c0(sharedPreferencesM14881K.getString("delayedStartConsentDma", null));
        synchronized (this.f11668d) {
            try {
                if (this.f11667c) {
                    return true;
                }
                m14943o(AppsFlyerLib.getInstance(), jSONObjectM14886c0, z10);
                boolean zM14917S = m14917S(context);
                this.f11667c = true;
                m14955v(context);
                m14932f0(context, "Android-AppsFlyer-Start-CachedConsent", zM14917S);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m14921Y(JSONObject jSONObject) {
        boolean z10;
        boolean zM14917S;
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        synchronized (this.f11668d) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dmaConsent");
                boolean zOptBoolean = jSONObject.optBoolean("applySharingFilter", true);
                m14943o(appsFlyerLib, jSONObjectOptJSONObject, zOptBoolean);
                m14951s(this.f11666b, zOptBoolean, jSONObjectOptJSONObject);
                z10 = this.f11667c;
                if (z10) {
                    zM14917S = false;
                } else {
                    zM14917S = m14917S(this.f11666b);
                    this.f11667c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        m14955v(this.f11666b);
        m14932f0(this.f11666b, "Android-AppsFlyer-Start-Attribution", zM14917S);
    }

    /* JADX INFO: renamed from: Z */
    public void m14922Z(Context context, Boolean bool) {
        if (!C11659h.m43403a().mo43672l5()) {
            m14906D(context);
            return;
        }
        if (bool == null) {
            m14941m0("Android-AppsFlyer-Eligibility-Recheck-Unresolved");
        } else {
            m14941m0(bool.booleanValue() ? "Android-AppsFlyer-Eligibility-Recheck-Flagged" : "Android-AppsFlyer-Eligibility-Recheck-NotFlagged");
        }
        m14909E0(context, bool);
    }

    @Override // vi.C12213d
    /* JADX INFO: renamed from: a */
    public void mo14923a(Context context) {
        boolean zM37333a = C9476b.m37333a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("init: initEnabled=");
        sb2.append(!zM37333a);
        C6124q.m27063h("AppsFlyerManager", sb2.toString());
        if (zM37333a) {
            return;
        }
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        appsFlyerLib.setMinTimeBetweenSessions(90);
        appsFlyerLib.setOneLinkCustomDomain("roblox.onelink.me", "ro.blox.com", "go.roblox.com");
        m14914O(m14911H(context, "enableTracking", true));
        a aVar = new a();
        appsFlyerLib.setCollectAndroidID(false);
        if (C11659h.m43403a().mo43410A5()) {
            appsFlyerLib.setDisableAdvertisingIdentifiers(true);
        }
        appsFlyerLib.init("Quwp4RGsFwE6rVnyTFm6jQ", aVar, context);
        appsFlyerLib.registerSessionReadyListener(new SessionReadyListener() { // from class: yg.a
            @Override // com.appsflyer.share.SessionReadyListener
            public final void onSessionReady() {
                this.f46456a.m14926b0();
            }
        });
        appsFlyerLib.subscribeForDeepLink(new b());
        this.f11666b = context;
        C7635f.m31524D().m31553u(new C7635f.h() { // from class: yg.b
            @Override // km.C7635f.h
            /* JADX INFO: renamed from: a */
            public final void mo31559a(JSONObject jSONObject) {
                this.f46457a.m14921Y(jSONObject);
            }
        });
        m14948q0(context);
        if (C11659h.m43403a().mo43636g4()) {
            C7635f.m31524D().m31554v(new C7635f.i() { // from class: yg.c
                @Override // km.C7635f.i
                /* JADX INFO: renamed from: a */
                public final void mo31560a(boolean z10) {
                    this.f46458a.m14918T(z10);
                }
            });
        }
        C7635f.m31524D().m31530C(appsFlyerLib.getAppsFlyerUID(context));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m14924a0(Context context, Boolean bool) {
        if (bool == null) {
            m14941m0("Android-AppsFlyer-Eligibility-Unresolved");
            m14945p(context, true, false);
            return;
        }
        synchronized (this.f11668d) {
            try {
                m14952t(context, bool.booleanValue());
                if (bool.booleanValue()) {
                    m14919U(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m14941m0(bool.booleanValue() ? "Android-AppsFlyer-Eligibility-Flagged" : "Android-AppsFlyer-Eligibility-NotFlagged");
        m14945p(context, bool.booleanValue(), true);
    }

    @Override // vi.C12213d
    /* JADX INFO: renamed from: b */
    public void mo14925b() {
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(true);
    }

    /* JADX INFO: renamed from: b0 */
    public void m14926b0() {
        synchronized (this.f11668d) {
            try {
                this.f11672h = true;
                if (this.f11673i) {
                    String str = this.f11674j;
                    this.f11673i = false;
                    this.f11674j = null;
                    m14957x(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vi.C12213d
    /* JADX INFO: renamed from: c */
    public void mo14927c(Context context) {
        boolean zM14916R = m14916R();
        C6124q.m27063h("AppsFlyerManager", "first play: enabled=" + zM14916R);
        if (zM14916R) {
            String str = "firstPlayReported_" + C5654c.m25669c().m25678j();
            if (m14911H(context, str, false)) {
                return;
            }
            m14950r0(context, str, true);
            if (!C11659h.m43403a().mo43464I3()) {
                AppsFlyerLib.getInstance().logEvent(this.f11666b, AFInAppEventType.LEVEL_ACHIEVED, null);
            }
            m14944o0("firstPlayReported", null);
            m14942n0("Android-AppsFlyer-FirstPlay");
        }
    }

    @Override // vi.C12213d
    /* JADX INFO: renamed from: d */
    public void mo14928d(Context context) {
        boolean zM14916R = m14916R();
        C6124q.m27063h("AppsFlyerManager", "login: enabled=" + zM14916R);
        if (!zM14916R) {
            m14940m(context);
            return;
        }
        m14903B();
        m14944o0("loginReported", null);
        m14942n0("Android-AppsFlyer-Login");
        m14939l0(context);
        m14958y(context);
    }

    @Override // vi.C12213d
    /* JADX INFO: renamed from: e */
    public void mo14929e(Context context, long j10) {
        boolean zM14916R = m14916R();
        C6124q.m27063h("AppsFlyerManager", "playtime: enabled=" + zM14916R);
        if (zM14916R) {
            String str = "experiencePlaytimeReported_" + C5654c.m25669c().m25678j();
            if (m14911H(context, str, false) || j10 < TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES)) {
                return;
            }
            if (!C11659h.m43403a().mo43500N5()) {
                AppsFlyerLib.getInstance().logEvent(this.f11666b, String.format(Locale.ENGLISH, "af_experience_playtime_%dmin", 15), null);
            }
            m14944o0("experiencePlaytimeReported", null);
            m14942n0("Android-AppsFlyer-ExperiencePlaytime");
            m14950r0(context, str, true);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m14930e0() {
        String dataString;
        Intent intent = this.f43062a;
        if (intent == null || (dataString = intent.getDataString()) == null) {
            return;
        }
        AppsFlyerLib.getInstance().performDeepLinking(dataString, false);
    }

    @Override // vi.C12213d
    /* JADX INFO: renamed from: f */
    public void mo14931f(@NonNull String str, String str2, String str3, long j10, boolean z10) {
        boolean zM14916R = m14916R();
        C6124q.m27063h("AppsFlyerManager", "Purchase. enabled=" + zM14916R + ". Price: " + str2 + ".");
        if (zM14916R) {
            m14938k0(str, str2, str3);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m14932f0(Context context, String str, boolean z10) {
        if (z10) {
            AppsFlyerLib.getInstance().stop(true, context);
            return;
        }
        synchronized (this.f11668d) {
            try {
                if (this.f11672h) {
                    m14957x(str);
                } else {
                    this.f11673i = true;
                    this.f11674j = str;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vi.C12213d
    /* JADX INFO: renamed from: g */
    public void mo14933g(Context context) {
        boolean zM14916R = m14916R();
        C6124q.m27063h("AppsFlyerManager", "signup: enabled=" + zM14916R);
        if (!zM14916R) {
            m14940m(context);
            return;
        }
        m14903B();
        m14944o0("signUpReported", null);
        m14942n0("Android-AppsFlyer-Registration");
        m14893s0(context, m14882L(C5654c.m25669c().m25678j()), TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
        m14958y(context);
    }

    /* JADX INFO: renamed from: g0 */
    public void m14934g0(Map<String, Object> map) {
        boolean zEquals = "Organic".equals(map.get("af_status"));
        long j10 = C11295a1.f39657u;
        if (j10 == 0) {
            m14942n0("Android-AppsFlyer-AttributionContext-Skip-BtidNotReady");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("body", m14949r(j10, map).toString());
            MessageBus.m16016f().m16024l(C8589f.f31550a.m34619a("Linking", "recordAttributionContext"), jSONObject);
            m14942n0(zEquals ? "Android-AppsFlyer-AttributionContext-Published-Organic" : "Android-AppsFlyer-AttributionContext-Published");
        } catch (Exception e10) {
            C6124q.m27060e("AppsFlyerManager", "Failed to publish recordAttributionContext: " + e10.getMessage());
            m14942n0("Android-AppsFlyer-AttributionContext-Skip-JsonError");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m14935h0(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (C11659h.m43403a().mo43612d3()) {
            synchronized (this.f11671g) {
                try {
                    if (this.f11670f) {
                        m14941m0("Android-AppsFlyer-DDR-Publish-Skip-Duplicate");
                        return;
                    }
                    this.f11670f = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("attributionAdName", str);
            MessageBus.m16016f().m16024l(C8589f.f31550a.m34619a("Linking", "resolveAttributionAdName"), jSONObject);
        } catch (JSONException e10) {
            C6124q.m27060e("AppsFlyerManager", "Failed to publish resolveAttributionAdName: " + e10.getMessage());
        }
    }

    @Override // vi.C12213d
    /* JADX INFO: renamed from: i */
    public void mo14936i(String str) {
        AppsFlyerLib.getInstance().setCustomerUserId(str);
    }

    /* JADX INFO: renamed from: i0 */
    public final Boolean m14937i0(Context context) {
        long j10 = m14881K(context).getLong("delayedStartEligibilityTs", 0L);
        if (j10 == 0 || System.currentTimeMillis() - j10 > m14901A()) {
            return null;
        }
        return Boolean.valueOf(m14911H(context, "delayedStartFlagged", true));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m14938k0(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("productId", str));
        arrayList.add(new NameValuePair("price", str2));
        arrayList.add(new NameValuePair("currencyCode", str3));
        m14944o0("purchaseReported", arrayList);
        m14942n0("Android-AppsFlyer-Purchase");
    }

    /* JADX INFO: renamed from: l0 */
    public final void m14939l0(Context context) {
        boolean zM14916R = m14916R();
        C6124q.m27063h("AppsFlyerManager", "Login retention: enabled=" + zM14916R);
        if (zM14916R) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long jConvert = timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            long jM25678j = C5654c.m25669c().m25678j();
            long jM14880J = m14880J(context, m14882L(jM25678j), 0L);
            if (jM14880J > 0) {
                long jConvert2 = TimeUnit.DAYS.convert(jConvert - jM14880J, timeUnit);
                if (jConvert2 < 1 || jConvert2 > 3) {
                    return;
                }
                Locale locale = Locale.ENGLISH;
                String str = String.format(locale, "af_retention_d%d", Long.valueOf(jConvert2));
                String str2 = String.format(locale, "Android-AppsFlyer-AppRetention-D%d", Long.valueOf(jConvert2));
                String str3 = String.format(locale, "appRetentionReportedD%d", Long.valueOf(jConvert2));
                String str4 = str3 + "_" + jM25678j;
                if (m14911H(context, str4, false)) {
                    return;
                }
                m14950r0(context, str4, true);
                if (!C11659h.m43403a().mo43591a6()) {
                    AppsFlyerLib.getInstance().logEvent(this.f11666b, str, null);
                }
                m14944o0(str3, null);
                m14942n0(str2);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14940m(Context context) {
        AppsFlyerLib.getInstance().anonymizeUser(true);
        m14950r0(context, "enableTracking", false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m14941m0(String str) {
        C11416c.m42766b(new C11416c.a(str, C9261qe.m36724a(new Object[]{TelemetryBackend.COUNTER})).m42780j(2026, 7, 30).m42774d());
    }

    /* JADX INFO: renamed from: n0 */
    public final void m14942n0(String str) {
        C12216g.m45228b().m45278q(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m14943o(AppsFlyerLib appsFlyerLib, JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Boolean boolValueOf = jSONObject.has("consented") ? Boolean.valueOf(jSONObject.optBoolean("consented")) : null;
            appsFlyerLib.setConsentData(new AppsFlyerConsent(jSONObject.has("isSubjectToGdpr") ? Boolean.valueOf(jSONObject.optBoolean("isSubjectToGdpr")) : null, boolValueOf, boolValueOf, boolValueOf));
        }
        if (z10) {
            appsFlyerLib.setSharingFilterForPartners("all");
            m14941m0("Android-AppsFlyer-Sharing-Filter-Applied");
        } else {
            appsFlyerLib.setSharingFilterForPartners("");
            m14941m0("Android-AppsFlyer-Sharing-Filter-Cleared");
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m14944o0(String str, List<NameValuePair> list) {
        C11356t0.m42539i(str, "appsFlyer", list);
    }

    /* JADX INFO: renamed from: p */
    public void m14945p(Context context, boolean z10, boolean z11) {
        if (z10) {
            if (m14920V(context)) {
                return;
            }
            m14947q(context, z11);
        } else {
            m14907D0(context);
            if (!C11659h.m43403a().mo43672l5() || m14881K(context).getLong("delayedStartBackstopDeadline", 0L) == 0) {
                return;
            }
            m14955v(context);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final Boolean m14946p0() {
        try {
            Response responseExecute = C5133k.m23938a().m23939b().newCall(m14899z()).execute();
            try {
                Boolean boolM14889j0 = m14889j0(responseExecute);
                if (responseExecute != null) {
                    responseExecute.close();
                }
                return boolM14889j0;
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

    /* JADX INFO: renamed from: q */
    public final void m14947q(Context context, boolean z10) {
        if (!C11659h.m43403a().mo43672l5()) {
            long jCurrentTimeMillis = m14881K(context).getLong("delayedStartBackstopDeadline", 0L);
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis() + m14956w();
                m14881K(context).edit().putLong("delayedStartBackstopDeadline", jCurrentTimeMillis).apply();
            }
            m14953t0(context, jCurrentTimeMillis);
            return;
        }
        synchronized (this.f11668d) {
            try {
                if (this.f11667c) {
                    return;
                }
                SharedPreferences sharedPreferencesM14881K = m14881K(context);
                long jM14956w = sharedPreferencesM14881K.getLong("delayedStartBackstopDeadline", 0L);
                if (jM14956w == 0) {
                    jM14956w = m14956w() + System.currentTimeMillis();
                    sharedPreferencesM14881K.edit().putLong("delayedStartBackstopDeadline", jM14956w).putBoolean("delayedStartBackstopEligibilityResolved", z10).apply();
                } else if (z10) {
                    sharedPreferencesM14881K.edit().putBoolean("delayedStartBackstopEligibilityResolved", true).apply();
                }
                m14953t0(context, jM14956w);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m14948q0(Context context) {
        Boolean boolM14937i0;
        synchronized (this.f11668d) {
            try {
                boolM14937i0 = m14937i0(context);
                if (Boolean.TRUE.equals(boolM14937i0)) {
                    m14919U(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (boolM14937i0 == null) {
            m14904C(context);
        } else {
            m14941m0("Android-AppsFlyer-Eligibility-CacheHit");
            m14945p(context, boolM14937i0.booleanValue(), true);
        }
    }

    /* JADX INFO: renamed from: r */
    public JSONObject m14949r(long j10, Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("btid", String.valueOf(j10));
        jSONObject.put("afAd", C6106b0.m27007c(m14894u0(map)));
        jSONObject.put("afAdset", C6106b0.m27007c(m14895v0(map)));
        jSONObject.put("mediaSource", C6106b0.m27007c(map.get("media_source")));
        jSONObject.put("country", C6106b0.m27007c(map.get("country_code")));
        jSONObject.put("campaign", C6106b0.m27007c(map.get("campaign")));
        jSONObject.put("campaignId", C6106b0.m27007c(m14898y0(map)));
        jSONObject.put("isRetargeting", Boolean.parseBoolean(String.valueOf(map.get("is_retargeting"))));
        jSONObject.put("retargetingConversionType", C6106b0.m27007c(map.get("retargeting_conversion_type")));
        jSONObject.put("siteId", C6106b0.m27007c(map.get("af_siteid")));
        jSONObject.put("channel", C6106b0.m27007c(map.get(AFInAppEventParameterName.AF_CHANNEL)));
        jSONObject.put("appsflyerId", C6106b0.m27007c(AppsFlyerLib.getInstance().getAppsFlyerUID(this.f11666b)));
        jSONObject.put("deepLinkValue", C6106b0.m27007c(map.get("deep_link_value")));
        jSONObject.put("afDp", C6106b0.m27007c(map.get("af_dp")));
        jSONObject.put("installTime", m14877G0(map.get("install_time")));
        jSONObject.put("platform", "ANDROID");
        jSONObject.put("requestId", UUID.randomUUID().toString());
        jSONObject.put("clientTime", m14885X());
        return jSONObject;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m14950r0(Context context, String str, boolean z10) {
        SharedPreferences.Editor editorEdit = m14881K(context).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: s */
    public final void m14951s(Context context, boolean z10, JSONObject jSONObject) {
        SharedPreferences.Editor editorEdit = m14881K(context).edit();
        editorEdit.putBoolean("delayedStartConsentApplySharingFilter", z10);
        if (jSONObject != null) {
            editorEdit.putString("delayedStartConsentDma", jSONObject.toString());
        } else {
            editorEdit.remove("delayedStartConsentDma");
        }
        editorEdit.putLong("delayedStartConsentTs", System.currentTimeMillis());
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: t */
    public final void m14952t(Context context, boolean z10) {
        m14881K(context).edit().putBoolean("delayedStartFlagged", z10).putLong("delayedStartEligibilityTs", System.currentTimeMillis()).apply();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m14953t0(Context context, long j10) {
        Context applicationContext = context.getApplicationContext();
        long jCurrentTimeMillis = j10 - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            m14906D(applicationContext);
        } else {
            ConsentBackstopWorker.INSTANCE.m14873b(applicationContext, jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m14954u(String str) {
        if (!C11659h.m43403a().mo43612d3()) {
            return true;
        }
        synchronized (this.f11671g) {
            try {
                if (this.f11669e) {
                    m14941m0(str);
                    return false;
                }
                this.f11669e = true;
                m14941m0("Android-AppsFlyer-DeferredRoute");
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m14955v(Context context) {
        synchronized (this.f11668d) {
            try {
                SharedPreferences.Editor editorRemove = m14881K(context).edit().remove("delayedStartBackstopDeadline");
                if (C11659h.m43403a().mo43672l5()) {
                    editorRemove.remove("delayedStartBackstopEligibilityResolved");
                }
                editorRemove.apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ConsentBackstopWorker.INSTANCE.m14872a(context);
    }

    /* JADX INFO: renamed from: w */
    public final long m14956w() {
        return ((long) C11659h.m43403a().mo43755x4()) * 1000;
    }

    /* JADX INFO: renamed from: x */
    public final void m14957x(String str) {
        AppsFlyerLib.getInstance().start();
        if (str != null) {
            m14941m0(str);
        }
        m14930e0();
    }

    /* JADX INFO: renamed from: y */
    public final void m14958y(Context context) {
        m14950r0(context, "enableTracking", true);
        m14914O(true);
    }
}
