package com.roblox.client.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import bh.a1;
import bh.t0;
import bi.h;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.AFInAppEventParameterName;
import com.appsflyer.share.AFInAppEventType;
import com.appsflyer.share.AppsFlyerConsent;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.SessionReadyListener;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.deeplink.DeepLinkResult;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.messagebus.MessageBusHelper;
import dj.g;
import eh.a0;
import eh.c0;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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
import java.util.function.BooleanSupplier;
import java.util.regex.Pattern;
import mi.k;
import mv.f;
import mv.f0;
import mv.h0;
import mv.i0;
import ob.ze;
import ok.b0;
import ok.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a extends dj.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f8838o = Pattern.compile("[A-Za-z0-9_-]+");
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8839c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8840d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8841e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8842f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8843g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8844h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8845i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8846j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f8847k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f8848l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8849m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f8850n = null;

    /* JADX INFO: renamed from: com.roblox.client.appsflyer.a$a, reason: collision with other inner class name */
    public class C0139a implements AppsFlyerConversionListener {
        public C0139a() {
        }

        @Override // com.appsflyer.share.AppsFlyerConversionListener
        public void onConversionDataFail(String str) {
        }

        @Override // com.appsflyer.share.AppsFlyerConversionListener
        public void onConversionDataSuccess(Map<String, Object> map) {
            a.this.T(map);
        }
    }

    public class b implements DeepLinkListener {
        public b() {
        }

        @Override // com.appsflyer.share.deeplink.DeepLinkListener
        public void onDeepLinking(DeepLinkResult deepLinkResult) {
            a.this.V(deepLinkResult);
        }
    }

    public class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f8853a;

        public c(Context context) {
            this.f8853a = context;
        }

        @Override // mv.f
        public void onFailure(@NonNull mv.e eVar, @NonNull IOException iOException) {
            a.this.m0(this.f8853a, null);
        }

        @Override // mv.f
        public void onResponse(@NonNull mv.e eVar, @NonNull h0 h0Var) {
            a.this.m0(this.f8853a, a.w0(h0Var));
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8854a;
        public final boolean b;

        public d(boolean z10, boolean z11) {
            this.f8854a = z10;
            this.b = z11;
        }

        public boolean a() {
            return this.f8854a && !this.b;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8855a = new a();
    }

    public a() {
        q.h("AppsFlyerManager", "[AppsFlyerManager]: Constructor called.");
    }

    public static Boolean C(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("consented")) {
            return null;
        }
        return Boolean.valueOf(jSONObject.optBoolean("consented"));
    }

    public static f0 F() {
        return new f0.a().t(a1.e()).e().b();
    }

    public static void H0(Context context, String str, long j10) {
        SharedPreferences.Editor editorEdit = Q(context).edit();
        editorEdit.putLong(str, j10);
        editorEdit.apply();
    }

    public static String J0(Map<String, Object> map) {
        String strO0 = O0(map, "af_ad");
        return W0(map) ? M(strO0, O0(map, "adgroup")) : strO0;
    }

    public static String K0(Map<String, Object> map) {
        return M(O0(map, "af_adset"), O0(map, "adset"));
    }

    public static String L0(String str, String str2, String str3, String str4) {
        return M(str, str2, str3, str4);
    }

    public static String M(String... strArr) {
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                return str;
            }
        }
        return null;
    }

    public static String M0(Map<String, Object> map) {
        return L0(U0(map, "af_ad"), U0(map, "af_adset"), U0(map, "adgroup"), U0(map, "adset"));
    }

    public static String N0(Map<String, Object> map) {
        return M(O0(map, "af_c_id"), O0(map, Payload.CAMPAIGN_ID));
    }

    public static a O() {
        return e.f8855a;
    }

    public static String O0(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        return b0.c(obj);
    }

    public static long P(Context context, String str, long j10) {
        return Q(context).getLong(str, j10);
    }

    public static SharedPreferences Q(Context context) {
        return context.getSharedPreferences("APPS_FLYER_SHARED_PREFS", 0);
    }

    public static String R(long j10) {
        return "signupReportedTimeInSeconds_" + j10;
    }

    public static String U0(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static String V0(Object obj) {
        if (obj == null) {
            return BuildConfig.FLAVOR;
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

    public static boolean W0(Map<String, Object> map) {
        return (map.containsKey("af_ad") || map.containsKey("af_adset")) ? false : true;
    }

    public static boolean X(long j10, long j11, long j12) {
        return j10 != 0 && j11 - j10 <= j12;
    }

    public static String h0(String str, String str2) {
        if (str == null || str2 == null || !str.contains("://navigation/crossdevice") || !f8838o.matcher(str2).matches() || str.indexOf(35) >= 0) {
            return str;
        }
        int iIndexOf = str.indexOf(63);
        String str3 = BuildConfig.FLAVOR;
        String strSubstring = iIndexOf < 0 ? BuildConfig.FLAVOR : str.substring(iIndexOf + 1);
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

    public static String j0() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    public static boolean o(boolean z10, Boolean bool) {
        return z10 || !Boolean.FALSE.equals(bool);
    }

    public static JSONObject o0(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static d p0(String str, boolean z10) {
        boolean zBooleanValue;
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Object objOpt = jSONObject.opt("isAdConsentRequired");
                if (!(objOpt instanceof Boolean)) {
                    return null;
                }
                if (z10 && jSONObject.has("isAttributionBlocked")) {
                    Object obj = jSONObject.get("isAttributionBlocked");
                    if (!(obj instanceof Boolean)) {
                        return null;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                return new d(((Boolean) objOpt).booleanValue(), zBooleanValue);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static String u0(String str, String str2) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(63)) < 0) {
            return null;
        }
        int iIndexOf2 = str.indexOf(35, iIndexOf);
        int i10 = iIndexOf + 1;
        if (iIndexOf2 < 0) {
            iIndexOf2 = str.length();
        }
        for (String str3 : str.substring(i10, iIndexOf2).split("&")) {
            int iIndexOf3 = str3.indexOf(61);
            if (iIndexOf3 > 0 && str3.substring(0, iIndexOf3).equals(str2)) {
                try {
                    return URLDecoder.decode(str3.substring(iIndexOf3 + 1), "UTF-8");
                } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static d w0(h0 h0Var) {
        try {
            i0 body = h0Var.getBody();
            try {
                if (!h0Var.getIsSuccessful() || body == null) {
                    if (body != null) {
                        body.close();
                    }
                    return null;
                }
                d dVarP0 = p0(body.h(), h.a().K1());
                body.close();
                return dVarP0;
            } catch (Throwable th2) {
                if (body != null) {
                    try {
                        body.close();
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

    public final void A(Context context) {
        synchronized (this.f8840d) {
            Q(context).edit().remove("delayedStartConsentTs").remove("delayedStartConsentApplySharingFilter").remove("delayedStartConsentDma").apply();
        }
    }

    public final void A0(String str) {
        fn.c.b(new fn.c.a(str, ze.a(new Object[]{TelemetryBackend.COUNTER})).j(2026, 7, 30).d());
    }

    public final long B() {
        return ((long) h.a().F4()) * 1000;
    }

    public final void B0(String str) {
        g.b().q(str);
    }

    public final void C0(String str, List<NameValuePair> list) {
        t0.i(str, "appsFlyer", list);
    }

    public final void D(String str) {
        AppsFlyerLib.getInstance().start();
        if (str != null) {
            A0(str);
        }
        q0();
    }

    public final d D0() {
        try {
            h0 h0VarJ = k.a().b().a(F()).j();
            try {
                d dVarW0 = w0(h0VarJ);
                if (h0VarJ != null) {
                    h0VarJ.close();
                }
                return dVarW0;
            } catch (Throwable th2) {
                if (h0VarJ != null) {
                    try {
                        h0VarJ.close();
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

    public final void E(Context context) {
        G0(context, "enableTracking", true);
        U(true);
    }

    public final void E0(Context context) {
        d dVarV0;
        d dVarV1;
        if (!h.a().K1()) {
            synchronized (this.f8840d) {
                try {
                    dVarV0 = v0(context);
                    if (dVarV0 != null && dVarV0.a()) {
                        e0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (dVarV0 == null) {
                I(context);
                return;
            } else {
                A0("Android-AppsFlyer-Eligibility-CacheHit");
                s(context, dVarV0.f8854a, true);
                return;
            }
        }
        synchronized (this.f8840d) {
            try {
                dVarV1 = v0(context);
                if (dVarV1 != null) {
                    if (dVarV1.a()) {
                        e0(context);
                    }
                    this.f8841e = false;
                    if (dVarV1.b) {
                        this.f8842f = true;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (dVarV1 == null) {
            I(context);
        } else {
            A0("Android-AppsFlyer-Eligibility-CacheHit");
            r(context, dVarV1);
        }
    }

    public final void F0() {
        JSONObject jSONObjectJ;
        if (this.f12483a == null) {
            return;
        }
        synchronized (this.f8840d) {
            try {
                if (this.f8844h) {
                    return;
                }
                this.f8844h = true;
                String dataString = this.f12483a.getDataString();
                String strM = M(u0(dataString, "deep_link_value"), u0(dataString, "af_dp"));
                if (strM == null) {
                    return;
                }
                if (h.a().u2() && h.a().Y5()) {
                    strM = h0(strM, u0(dataString, "code"));
                }
                if (h.a().g1()) {
                    jSONObjectJ = ym.g.G().j(strM, "android_appsflyer_udl", false);
                } else {
                    ym.g.G().h(strM, "android_appsflyer_udl", false);
                    jSONObjectJ = null;
                }
                if (h.a().Y5()) {
                    strM = h0(strM, u0(dataString, "code"));
                    if (jSONObjectJ != null) {
                        ym.g.G().L(jSONObjectJ, strM);
                    }
                }
                ym.g.G().n(strM, null, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long G() {
        return ((long) h.a().S5()) * 1000;
    }

    public final void G0(Context context, String str, boolean z10) {
        SharedPreferences.Editor editorEdit = Q(context).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    public final void H() {
        if (!h.a().D5() || nk.c.c().n()) {
            return;
        }
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(false);
    }

    public final void I(Context context) {
        k.a().b().a(F()).b0(new c(context));
    }

    public final void I0(Context context, long j10) {
        Context applicationContext = context.getApplicationContext();
        long jCurrentTimeMillis = j10 - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            J(applicationContext);
        } else {
            ConsentBackstopWorker.INSTANCE.b(applicationContext, jCurrentTimeMillis);
        }
    }

    public void J(Context context) {
        T0(context, null);
    }

    public void K() {
        if (this.b == null) {
            return;
        }
        synchronized (this.f8840d) {
            try {
                if (this.f8839c) {
                    return;
                }
                long j10 = Q(this.b).getLong("delayedStartBackstopDeadline", 0L);
                if (j10 == 0 || System.currentTimeMillis() < j10) {
                    return;
                }
                L(this.b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void L(Context context) {
        synchronized (this.f8840d) {
            try {
                if (this.f8839c) {
                    return;
                }
                boolean z10 = Q(context).getBoolean("delayedStartBackstopEligibilityResolved", true);
                if (z10) {
                    A0("Android-AppsFlyer-Eligibility-Recheck-Skipped");
                    J(context);
                    return;
                }
                A0("Android-AppsFlyer-Eligibility-Recheck-Attempted");
                d dVarD0 = D0();
                if (dVarD0 != null) {
                    synchronized (this.f8840d) {
                        try {
                            boolean z11 = this.f8841e;
                            this.f8841e = false;
                            if (dVarD0.b) {
                                this.f8842f = true;
                                w(context, dVarD0);
                            } else if (z11) {
                                i0(context, dVarD0.f8854a);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (dVarD0 == null || !dVarD0.b) {
                    l0(context, dVarD0 == null ? null : Boolean.valueOf(dVarD0.f8854a));
                } else {
                    A0("Android-AppsFlyer-Eligibility-Recheck-Blocked");
                    p(context);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean N(Context context, String str, boolean z10) {
        return Q(context).getBoolean(str, z10);
    }

    public void P0(Context context, boolean z10) {
        G0(context, "disableDeeplinkTracking", !z10);
        a0.C(context);
        synchronized (this.f8840d) {
            try {
                if (this.f8839c) {
                    if (z10 && AppsFlyerLib.getInstance().isStopped()) {
                        r0(context, null, false);
                    } else if (!z10 && !AppsFlyerLib.getInstance().isStopped()) {
                        AppsFlyerLib.getInstance().stop(true, context);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean Q0() {
        synchronized (this.f8840d) {
            try {
                if (!this.f8843g) {
                    return false;
                }
                if (!h.a().w0()) {
                    return false;
                }
                A0("Android-AppsFlyer-DeferredRoute-Skip-ConsentHeld");
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void R0(Context context, String str) {
        synchronized (this.f8840d) {
            if (!this.f8839c && !a0()) {
                boolean zB0 = b0(context);
                this.f8839c = true;
                r0(context, str, zB0);
            }
        }
    }

    public void S(Map<String, String> map) {
        JSONObject jSONObjectJ;
        String strH0 = map.get("af_dp");
        if (strH0 != null) {
            if (h.a().u2() && h.a().Y5()) {
                strH0 = h0(strH0, map.get("code"));
            }
            if (h.a().g1()) {
                jSONObjectJ = ym.g.G().j(strH0, "android_appsflyer_re_engagement", false);
            } else {
                ym.g.G().h(strH0, "android_appsflyer_re_engagement", false);
                jSONObjectJ = null;
            }
            String str = map.get("link");
            String strL0 = L0(map.get("af_ad"), map.get("af_adset"), map.get("adgroup"), map.get("adset"));
            if (h.a().Y5()) {
                strH0 = h0(strH0, map.get("code"));
                if (jSONObjectJ != null) {
                    ym.g.G().L(jSONObjectJ, strH0);
                }
            }
            if (str != null) {
                ym.g.G().n(strH0, str, strL0);
            } else {
                q.e("AppsFlyerManager", "Received null attribution URL. This should never happen.");
                ym.g.G().n(strH0, null, strL0);
            }
        }
    }

    public final void S0(Context context) {
        if (b0(context)) {
            q0();
        } else {
            R0(context, "Android-AppsFlyer-Start-AtInit");
        }
    }

    public void T(Map<String, Object> map) {
        String strM0;
        JSONObject jSONObjectJ;
        q.h("AppsFlyerManager", "media-source: " + ((String) map.get("media_source")));
        boolean zEquals = Boolean.TRUE.equals(map.get("is_first_launch"));
        if (zEquals) {
            s0(map);
        }
        if (zEquals && map.containsKey("af_dp")) {
            if (!Q0() && y("Android-AppsFlyer-DeferredRoute-Skip-Gcd")) {
                boolean zY5 = h.a().Y5();
                HashMap map2 = new HashMap();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    map2.put(entry.getKey(), (value == null && zY5 && "code".equals(entry.getKey())) ? null : String.valueOf(value));
                }
                String str = map2.get("af_dp");
                if (str != null) {
                    if (h.a().g1()) {
                        ym.g.G().j(str, "android_appsflyer_gcd", false);
                    } else {
                        ym.g.G().h(str, "android_appsflyer_gcd", true);
                    }
                }
                S(map2);
                return;
            }
            return;
        }
        if (!zEquals || !(map.get("deep_link_value") instanceof String) || ((String) map.get("deep_link_value")).isEmpty()) {
            if (!zEquals || !h.a().S() || (strM0 = M0(map)) == null || Q0()) {
                return;
            }
            t0(strM0);
            return;
        }
        String strH0 = (String) map.get("deep_link_value");
        if (!Q0() && y("Android-AppsFlyer-DeferredRoute-Skip-Gcd")) {
            if (h.a().u2() && h.a().Y5()) {
                Object obj = map.get("code");
                strH0 = h0(strH0, obj instanceof String ? (String) obj : null);
            }
            if (h.a().g1()) {
                jSONObjectJ = ym.g.G().j(strH0, "android_appsflyer_gcd", false);
            } else {
                ym.g.G().h(strH0, "android_appsflyer_gcd", true);
                jSONObjectJ = null;
            }
            String strM1 = M0(map);
            if (h.a().Y5()) {
                Object obj2 = map.get("code");
                strH0 = h0(strH0, obj2 instanceof String ? (String) obj2 : null);
                if (jSONObjectJ != null) {
                    ym.g.G().L(jSONObjectJ, strH0);
                }
            }
            ym.g.G().n(strH0, null, strM1);
        }
    }

    public final void T0(Context context, Boolean bool) {
        boolean zO;
        synchronized (this.f8840d) {
            try {
                if (!this.f8839c && !a0() && !W(context)) {
                    if (bool != null) {
                        boolean z10 = Q(context).getBoolean("delayedStartBackstopEligibilityResolved", true);
                        if (!z10) {
                            x(context, bool.booleanValue());
                        }
                        zO = o(z10, bool);
                    } else {
                        zO = true;
                    }
                    if (zO) {
                        AppsFlyerLib.getInstance().setSharingFilterForPartners("all");
                        v(context, true, null);
                    }
                    if (zO) {
                        a0.y(context);
                    } else {
                        i0(context, false);
                    }
                    boolean zB0 = b0(context);
                    this.f8839c = true;
                    r0(context, zO ? "Android-AppsFlyer-Start-Backstop" : "Android-AppsFlyer-Start-BackstopGeoResolved", zB0);
                    z(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void U(boolean z10) {
        if (z10) {
            AppsFlyerLib.getInstance().anonymizeUser(false);
        }
    }

    public void V(DeepLinkResult deepLinkResult) {
        String deepLinkValue;
        JSONObject jSONObjectJ;
        if (deepLinkResult.getStatus() != DeepLinkResult.Status.FOUND || deepLinkResult.getDeepLink() == null || (deepLinkValue = deepLinkResult.getDeepLink().getDeepLinkValue()) == null || deepLinkValue.isEmpty()) {
            return;
        }
        Boolean boolIsDeferred = deepLinkResult.getDeepLink().isDeferred();
        if (!Boolean.TRUE.equals(boolIsDeferred) || (!Q0() && y("Android-AppsFlyer-DeferredRoute-Skip-Udl"))) {
            if (h.a().u2() && h.a().Y5()) {
                deepLinkValue = h0(deepLinkValue, deepLinkResult.getDeepLink().getStringValue("code"));
            }
            if (h.a().g1()) {
                jSONObjectJ = ym.g.G().j(deepLinkValue, "android_appsflyer_udl", false);
            } else {
                if (boolIsDeferred != null) {
                    ym.g.G().h(deepLinkValue, "android_appsflyer_udl", boolIsDeferred.booleanValue());
                } else {
                    ym.g.G().g(deepLinkValue, "android_appsflyer_udl");
                }
                jSONObjectJ = null;
            }
            String strL0 = L0(deepLinkResult.getDeepLink().getStringValue("af_ad"), deepLinkResult.getDeepLink().getStringValue("af_adset"), deepLinkResult.getDeepLink().getStringValue("adgroup"), deepLinkResult.getDeepLink().getStringValue("adset"));
            if (h.a().Y5()) {
                deepLinkValue = h0(deepLinkValue, deepLinkResult.getDeepLink().getStringValue("code"));
                if (jSONObjectJ != null) {
                    ym.g.G().L(jSONObjectJ, deepLinkValue);
                }
            }
            ym.g.G().n(deepLinkValue, null, strL0);
        }
    }

    public final boolean W(Context context) {
        d dVarV0 = v0(context);
        return dVarV0 != null && dVarV0.b;
    }

    public final boolean Y() {
        return (nk.c.c().n() || wh.b.a()) ? false : true;
    }

    public final boolean Z() {
        boolean zA0;
        synchronized (this.f8840d) {
            zA0 = a0();
        }
        return zA0;
    }

    @Override // dj.d
    public void a(Context context) {
        boolean zA = wh.b.a();
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
        U(N(context, "enableTracking", true));
        C0139a c0139a = new C0139a();
        appsFlyerLib.setCollectAndroidID(false);
        if (h.a().D5()) {
            appsFlyerLib.setDisableAdvertisingIdentifiers(true);
        }
        appsFlyerLib.init("Quwp4RGsFwE6rVnyTFm6jQ", c0139a, context);
        appsFlyerLib.registerSessionReadyListener(new SessionReadyListener() { // from class: hh.a
            @Override // com.appsflyer.share.SessionReadyListener
            public final void onSessionReady() {
                this.f18255a.n0();
            }
        });
        appsFlyerLib.subscribeForDeepLink(new b());
        boolean zK1 = h.a().K1();
        synchronized (this.f8840d) {
            if (zK1) {
                try {
                    this.f8841e = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.b = context;
        }
        a0.G(new BooleanSupplier() { // from class: hh.b
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.f18256a.c0();
            }
        });
        ym.g.G().x(new ym.g.h() { // from class: hh.c
            @Override // ym.g.h
            public final void a(JSONObject jSONObject) {
                this.f18257a.k0(jSONObject);
            }
        });
        E0(context);
        if (h.a().p4()) {
            ym.g.G().y(new ym.g.i() { // from class: hh.d
                @Override // ym.g.i
                public final void a(boolean z10) {
                    this.f18258a.d0(z10);
                }
            });
        }
        ym.g.G().F(appsFlyerLib.getAppsFlyerUID(context));
    }

    public final boolean a0() {
        return this.f8841e || this.f8842f;
    }

    @Override // dj.d
    public void b() {
        if (h.a().D5()) {
            AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(true);
        }
        Context context = this.b;
        if (context == null) {
            return;
        }
        synchronized (this.f8840d) {
            try {
                if (a0.r()) {
                    A(context);
                }
                a0.B(context);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b0(Context context) {
        return h.a().L4() && N(context, "disableDeeplinkTracking", false);
    }

    @Override // dj.d
    public void c(Context context) {
        boolean zY = Y();
        q.h("AppsFlyerManager", "first play: enabled=" + zY);
        if (zY) {
            String str = "firstPlayReported_" + nk.c.c().j();
            if (N(context, str, false)) {
                return;
            }
            G0(context, str, true);
            if (!h.a().T3()) {
                AppsFlyerLib.getInstance().logEvent(this.b, AFInAppEventType.LEVEL_ACHIEVED, null);
            }
            C0("firstPlayReported", null);
            B0("Android-AppsFlyer-FirstPlay");
        }
    }

    public final /* synthetic */ boolean c0() {
        return b0(this.b);
    }

    @Override // dj.d
    public void d(Context context) {
        boolean zY = Y();
        q.h("AppsFlyerManager", "login: enabled=" + zY);
        if (!zY) {
            n(context);
            return;
        }
        H();
        C0("loginReported", null);
        B0("Android-AppsFlyer-Login");
        z0(context);
        E(context);
    }

    public final /* synthetic */ void d0(boolean z10) {
        P0(this.b, z10);
    }

    @Override // dj.d
    public void e(Context context, long j10) {
        boolean zY = Y();
        q.h("AppsFlyerManager", "playtime: enabled=" + zY);
        if (zY) {
            String str = "experiencePlaytimeReported_" + nk.c.c().j();
            if (N(context, str, false) || j10 < TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES)) {
                return;
            }
            if (!h.a().P5()) {
                AppsFlyerLib.getInstance().logEvent(this.b, String.format(Locale.ENGLISH, "af_experience_playtime_%dmin", 15), null);
            }
            C0("experiencePlaytimeReported", null);
            B0("Android-AppsFlyer-ExperiencePlaytime");
            G0(context, str, true);
        }
    }

    public final void e0(Context context) {
        SharedPreferences sharedPreferencesQ = Q(context);
        if (sharedPreferencesQ.getLong("delayedStartBackstopDeadline", 0L) != 0) {
            sharedPreferencesQ.edit().putBoolean("delayedStartBackstopEligibilityResolved", true).apply();
        }
    }

    @Override // dj.d
    public void f(@NonNull String str, String str2, String str3, long j10, boolean z10) {
        boolean zY = Y();
        q.h("AppsFlyerManager", "Purchase. enabled=" + zY + ". Price: " + str2 + ".");
        if (zY) {
            y0(str, str2, str3);
        }
    }

    public final boolean f0(Context context) {
        SharedPreferences sharedPreferencesQ = Q(context);
        if (!X(sharedPreferencesQ.getLong("delayedStartConsentTs", 0L), System.currentTimeMillis(), G())) {
            return false;
        }
        boolean z10 = sharedPreferencesQ.getBoolean("delayedStartConsentApplySharingFilter", true);
        JSONObject jSONObjectO0 = o0(sharedPreferencesQ.getString("delayedStartConsentDma", null));
        i0(context, true);
        synchronized (this.f8840d) {
            try {
                if (this.f8839c) {
                    return true;
                }
                if (a0()) {
                    return false;
                }
                q(AppsFlyerLib.getInstance(), jSONObjectO0, z10);
                boolean zB0 = b0(context);
                this.f8839c = true;
                z(context);
                r0(context, "Android-AppsFlyer-Start-CachedConsent", zB0);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // dj.d
    public void g(Context context) {
        boolean zY = Y();
        q.h("AppsFlyerManager", "signup: enabled=" + zY);
        if (!zY) {
            n(context);
            return;
        }
        H();
        C0("signUpReported", null);
        B0("Android-AppsFlyer-Registration");
        H0(context, R(nk.c.c().j()), TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
        E(context);
    }

    public boolean g0(Context context) {
        if (!a0.r() || h.a().j2() || b0(context) || !c0.e(x0(context))) {
            return false;
        }
        JSONObject jSONObjectO0 = o0(Q(context).getString("delayedStartConsentDma", null));
        synchronized (this.f8840d) {
            if (!this.f8839c && !a0()) {
                q(AppsFlyerLib.getInstance(), jSONObjectO0, true);
                boolean zB0 = b0(context);
                this.f8839c = true;
                z(context);
                r0(context, "Android-AppsFlyer-Start-CachedConsent", zB0);
                return true;
            }
            return false;
        }
    }

    @Override // dj.d
    public void i(String str) {
        AppsFlyerLib.getInstance().setCustomerUserId(str);
    }

    public final void i0(Context context, boolean z10) {
        if (Z()) {
            return;
        }
        a0.A(context, z10, x0(context));
    }

    public void k0(JSONObject jSONObject) {
        boolean zB0;
        boolean z10;
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        synchronized (this.f8840d) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dmaConsent");
                boolean zOptBoolean = jSONObject.optBoolean("applySharingFilter", true);
                Boolean boolValueOf = jSONObject.isNull("applySharingFilter") ? null : Boolean.valueOf(zOptBoolean);
                Boolean boolC = C(jSONObjectOptJSONObject);
                q(appsFlyerLib, jSONObjectOptJSONObject, zOptBoolean);
                v(this.b, zOptBoolean, jSONObjectOptJSONObject);
                zB0 = false;
                z10 = this.f8839c || a0();
                if (!this.f8842f) {
                    a0.z(this.b, boolValueOf, boolC);
                }
                if (!z10) {
                    zB0 = b0(this.b);
                    this.f8839c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        z(this.b);
        r0(this.b, "Android-AppsFlyer-Start-Attribution", zB0);
    }

    public void l0(Context context, Boolean bool) {
        if (bool == null) {
            A0("Android-AppsFlyer-Eligibility-Recheck-Unresolved");
        } else {
            A0(bool.booleanValue() ? "Android-AppsFlyer-Eligibility-Recheck-Flagged" : "Android-AppsFlyer-Eligibility-Recheck-NotFlagged");
        }
        if (Boolean.TRUE.equals(bool) && h.a().K1() && f0(context)) {
            return;
        }
        T0(context, bool);
    }

    public final void m0(Context context, d dVar) {
        if (dVar == null) {
            A0("Android-AppsFlyer-Eligibility-Unresolved");
            s(context, true, false);
            if (Z()) {
                F0();
                return;
            }
            return;
        }
        synchronized (this.f8840d) {
            try {
                this.f8841e = false;
                this.f8842f |= dVar.b;
                w(context, dVar);
                if (dVar.a()) {
                    e0(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dVar.b) {
            A0("Android-AppsFlyer-Eligibility-Blocked");
        } else {
            A0(dVar.f8854a ? "Android-AppsFlyer-Eligibility-Flagged" : "Android-AppsFlyer-Eligibility-NotFlagged");
        }
        r(context, dVar);
    }

    public final void n(Context context) {
        AppsFlyerLib.getInstance().anonymizeUser(true);
        G0(context, "enableTracking", false);
    }

    public void n0() {
        synchronized (this.f8840d) {
            try {
                this.f8848l = true;
                if (this.f8849m) {
                    String str = this.f8850n;
                    this.f8849m = false;
                    this.f8850n = null;
                    D(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void p(Context context) {
        synchronized (this.f8840d) {
            this.f8842f = true;
        }
        a0.x(context);
        if (Q(context).getLong("delayedStartBackstopDeadline", 0L) != 0) {
            z(context);
        }
        F0();
    }

    public final void q(AppsFlyerLib appsFlyerLib, JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Boolean boolValueOf = jSONObject.has("consented") ? Boolean.valueOf(jSONObject.optBoolean("consented")) : null;
            appsFlyerLib.setConsentData(new AppsFlyerConsent(jSONObject.has("isSubjectToGdpr") ? Boolean.valueOf(jSONObject.optBoolean("isSubjectToGdpr")) : null, boolValueOf, boolValueOf, boolValueOf));
        }
        if (z10) {
            appsFlyerLib.setSharingFilterForPartners("all");
            A0("Android-AppsFlyer-Sharing-Filter-Applied");
        } else {
            appsFlyerLib.setSharingFilterForPartners(BuildConfig.FLAVOR);
            A0("Android-AppsFlyer-Sharing-Filter-Cleared");
        }
    }

    public final void q0() {
        if (this.f12483a == null) {
            return;
        }
        synchronized (this.f8840d) {
            try {
                if (this.f8844h) {
                    return;
                }
                this.f8844h = true;
                String dataString = this.f12483a.getDataString();
                if (dataString != null) {
                    AppsFlyerLib.getInstance().performDeepLinking(dataString, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(Context context, d dVar) {
        if (dVar.b) {
            p(context);
        } else {
            s(context, dVar.f8854a, true);
        }
    }

    public final void r0(Context context, String str, boolean z10) {
        if (z10) {
            AppsFlyerLib.getInstance().stop(true, context);
            return;
        }
        synchronized (this.f8840d) {
            try {
                if (this.f8848l) {
                    D(str);
                } else {
                    this.f8849m = true;
                    this.f8850n = str;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(Context context, boolean z10, boolean z11) {
        if (z10) {
            if (f0(context)) {
                return;
            }
            i0(context, true);
            t(context, z11);
            return;
        }
        i0(context, false);
        if (!g0(context)) {
            S0(context);
        }
        if (Q(context).getLong("delayedStartBackstopDeadline", 0L) != 0) {
            z(context);
        }
    }

    public void s0(Map<String, Object> map) {
        boolean zEquals = "Organic".equals(map.get("af_status"));
        long j10 = a1.f4037u;
        if (j10 == 0) {
            B0("Android-AppsFlyer-AttributionContext-Skip-BtidNotReady");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("body", u(j10, map).toString());
            MessageBus.getInstance().publish(MessageBusHelper.INSTANCE.getMessageId("Linking", "recordAttributionContext"), jSONObject);
            B0(zEquals ? "Android-AppsFlyer-AttributionContext-Published-Organic" : "Android-AppsFlyer-AttributionContext-Published");
        } catch (Exception e10) {
            q.e("AppsFlyerManager", "Failed to publish recordAttributionContext: " + e10.getMessage());
            B0("Android-AppsFlyer-AttributionContext-Skip-JsonError");
        }
    }

    public final void t(Context context, boolean z10) {
        synchronized (this.f8840d) {
            try {
                if (this.f8839c) {
                    return;
                }
                SharedPreferences sharedPreferencesQ = Q(context);
                long jCurrentTimeMillis = sharedPreferencesQ.getLong("delayedStartBackstopDeadline", 0L);
                if (jCurrentTimeMillis == 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() + B();
                    sharedPreferencesQ.edit().putLong("delayedStartBackstopDeadline", jCurrentTimeMillis).putBoolean("delayedStartBackstopEligibilityResolved", z10).apply();
                } else if (z10) {
                    sharedPreferencesQ.edit().putBoolean("delayedStartBackstopEligibilityResolved", true).apply();
                }
                if (jCurrentTimeMillis > System.currentTimeMillis()) {
                    this.f8843g = true;
                }
                I0(context, jCurrentTimeMillis);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void t0(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        synchronized (this.f8847k) {
            try {
                if (this.f8846j) {
                    A0("Android-AppsFlyer-DDR-Publish-Skip-Duplicate");
                    return;
                }
                this.f8846j = true;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attributionAdName", str);
                    MessageBus.getInstance().publish(MessageBusHelper.INSTANCE.getMessageId("Linking", "resolveAttributionAdName"), jSONObject);
                } catch (JSONException e10) {
                    q.e("AppsFlyerManager", "Failed to publish resolveAttributionAdName: " + e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public JSONObject u(long j10, Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("btid", String.valueOf(j10));
        jSONObject.put("afAd", b0.c(J0(map)));
        jSONObject.put("afAdset", b0.c(K0(map)));
        jSONObject.put("mediaSource", b0.c(map.get("media_source")));
        jSONObject.put("country", b0.c(map.get("country_code")));
        jSONObject.put("campaign", b0.c(map.get("campaign")));
        jSONObject.put("campaignId", b0.c(N0(map)));
        jSONObject.put("isRetargeting", Boolean.parseBoolean(String.valueOf(map.get("is_retargeting"))));
        jSONObject.put("retargetingConversionType", b0.c(map.get("retargeting_conversion_type")));
        jSONObject.put("siteId", b0.c(map.get("af_siteid")));
        jSONObject.put("channel", b0.c(map.get(AFInAppEventParameterName.AF_CHANNEL)));
        jSONObject.put("appsflyerId", b0.c(AppsFlyerLib.getInstance().getAppsFlyerUID(this.b)));
        jSONObject.put("deepLinkValue", b0.c(map.get("deep_link_value")));
        jSONObject.put("afDp", b0.c(map.get("af_dp")));
        jSONObject.put("installTime", V0(map.get("install_time")));
        jSONObject.put("platform", "ANDROID");
        jSONObject.put("requestId", UUID.randomUUID().toString());
        jSONObject.put("clientTime", j0());
        return jSONObject;
    }

    public final void v(Context context, boolean z10, JSONObject jSONObject) {
        SharedPreferences.Editor editorEdit = Q(context).edit();
        editorEdit.putBoolean("delayedStartConsentApplySharingFilter", z10);
        if (jSONObject != null) {
            editorEdit.putString("delayedStartConsentDma", jSONObject.toString());
        } else {
            editorEdit.remove("delayedStartConsentDma");
        }
        editorEdit.putLong("delayedStartConsentTs", System.currentTimeMillis());
        editorEdit.putLong("delayedStartFreshnessTtlMs", G());
        editorEdit.apply();
    }

    public final d v0(Context context) {
        SharedPreferences sharedPreferencesQ = Q(context);
        long j10 = sharedPreferencesQ.getLong("delayedStartEligibilityTs", 0L);
        d dVar = null;
        if (j10 != 0 && System.currentTimeMillis() - j10 <= G()) {
            boolean zN = N(context, "delayedStartFlagged", true);
            boolean zK1 = h.a().K1();
            if (zK1 && !sharedPreferencesQ.getBoolean("delayedStartEligibilityBlockAware", false)) {
                return null;
            }
            dVar = new d(zN, zK1 && sharedPreferencesQ.getBoolean("delayedStartAttributionBlocked", false));
        }
        return dVar;
    }

    public final void w(Context context, d dVar) {
        Q(context).edit().putBoolean("delayedStartFlagged", dVar.f8854a).putBoolean("delayedStartEligibilityBlockAware", h.a().K1()).putBoolean("delayedStartAttributionBlocked", dVar.b).putLong("delayedStartEligibilityTs", System.currentTimeMillis()).putLong("delayedStartFreshnessTtlMs", G()).apply();
    }

    public final void x(Context context, boolean z10) {
        w(context, new d(z10, false));
    }

    public final eh.b0 x0(Context context) {
        return eh.a.d(Q(context), System.currentTimeMillis(), G());
    }

    public boolean y(String str) {
        synchronized (this.f8847k) {
            try {
                if (this.f8845i) {
                    A0(str);
                    return false;
                }
                this.f8845i = true;
                A0("Android-AppsFlyer-DeferredRoute");
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y0(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("productId", str));
        arrayList.add(new NameValuePair("price", str2));
        arrayList.add(new NameValuePair("currencyCode", str3));
        C0("purchaseReported", arrayList);
        B0("Android-AppsFlyer-Purchase");
    }

    public final void z(Context context) {
        synchronized (this.f8840d) {
            Q(context).edit().remove("delayedStartBackstopDeadline").remove("delayedStartBackstopEligibilityResolved").apply();
        }
        ConsentBackstopWorker.INSTANCE.a(context);
    }

    public final void z0(Context context) {
        boolean zY = Y();
        q.h("AppsFlyerManager", "Login retention: enabled=" + zY);
        if (zY) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long jConvert = timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            long j10 = nk.c.c().j();
            long jP = P(context, R(j10), 0L);
            if (jP > 0) {
                long jConvert2 = TimeUnit.DAYS.convert(jConvert - jP, timeUnit);
                if (jConvert2 < 1 || jConvert2 > 3) {
                    return;
                }
                Locale locale = Locale.ENGLISH;
                String str = String.format(locale, "af_retention_d%d", Long.valueOf(jConvert2));
                String str2 = String.format(locale, "Android-AppsFlyer-AppRetention-D%d", Long.valueOf(jConvert2));
                String str3 = String.format(locale, "appRetentionReportedD%d", Long.valueOf(jConvert2));
                String str4 = str3 + "_" + j10;
                if (N(context, str4, false)) {
                    return;
                }
                G0(context, str4, true);
                if (!h.a().c6()) {
                    AppsFlyerLib.getInstance().logEvent(this.b, str, null);
                }
                C0(str3, null);
                B0(str2);
            }
        }
    }
}
