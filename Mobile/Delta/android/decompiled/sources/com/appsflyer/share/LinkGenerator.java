package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFc1aSDK;
import com.appsflyer.internal.AFe1pSDK;
import com.appsflyer.internal.AFj1fSDK;
import com.appsflyer.internal.AFj1lSDK;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class LinkGenerator {
    String AFKeystoreWrapper;
    private String AFLogger;
    private final Map<String, String> afDebugLog = new HashMap();
    private String afErrorLog;
    private String afInfoLog;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5537e;
    private String force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f5538i;
    private String registerClient;
    String unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f5539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f5540w;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.f5536d = str;
    }

    private Map<String, String> AFLogger() {
        HashMap map = new HashMap();
        map.put("pid", this.f5536d);
        String str = this.force;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.registerClient;
        if (str2 != null) {
            map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.f5539v;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFLogger;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.f5540w;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.f5538i;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.afErrorLog != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.afErrorLog);
            String str7 = this.f5537e;
            if (str7 != null) {
                this.f5537e = str7.replaceFirst("^[/]", "");
                sb2.append(this.afErrorLog.endsWith("/") ? "" : "/");
                sb2.append(this.f5537e);
            }
            map.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.afDebugLog.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFj1lSDK.AFKeystoreWrapper(map);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.afDebugLog.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.afDebugLog.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.AFKeystoreWrapper;
        if (str == null || !str.startsWith("http")) {
            sb2.append(String.format(Locale.US, AFj1fSDK.f5438d, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName()));
        } else {
            sb2.append(this.AFKeystoreWrapper);
        }
        if (this.unregisterClient != null) {
            sb2.append('/');
            sb2.append(this.unregisterClient);
        }
        Map<String, String> mapAFLogger = AFLogger();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : mapAFLogger.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append('&');
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.afInfoLog;
    }

    public String getCampaign() {
        return this.AFLogger;
    }

    public String getChannel() {
        return this.registerClient;
    }

    public String getMediaSource() {
        return this.f5536d;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.afDebugLog);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.afErrorLog = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            Locale locale = Locale.US;
            this.AFKeystoreWrapper = String.format(locale, "https://%s/%s", String.format(locale, "%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName()), str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.AFKeystoreWrapper = String.format(Locale.US, "https://%s/%s", str2, str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.afInfoLog = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.registerClient = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f5537e = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.f5539v = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f5538i = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f5540w = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.force = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String str = AFa1tSDK.d().AFKeystoreWrapper.setAndroidIdData().AppsFlyerLib;
        if (str == null) {
            AFLogger.INSTANCE.w(LogTag.PUBLIC_API, "generateLink: OneLink ID not set. Call setAppInviteOneLink(...) first. Falling back to long link.");
            if (responseListener != null) {
                responseListener.onResponseError(generateLink());
                return;
            }
            return;
        }
        String str2 = this.afInfoLog;
        Map<String, String> mapAFLogger = AFLogger();
        AFc1aSDK aFc1aSDK = AFa1tSDK.d().AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5240d.f5305d = context.getApplicationContext();
        }
        AFc1aSDK aFc1aSDK2 = AFa1tSDK.d().AFKeystoreWrapper;
        aFc1aSDK2.afWarnLog().d(new AFe1pSDK(aFc1aSDK2, UUID.randomUUID(), str, mapAFLogger, str2, responseListener, this));
    }
}
