package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFc1aSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFj1bSDK;
import com.appsflyer.internal.AFj1fSDK;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CrossPromotionHelper {
    private static String registerClient = "https://%simpression.%s";

    @NonNull
    private static LinkGenerator AFLogger(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFKeystoreWrapper = str3;
        linkGenerator.unregisterClient = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    private static void registerClient(@NonNull String str, @NonNull Context context, AFj1bSDK aFj1bSDK) {
        AFa1tSDK aFa1tSDKD = AFa1tSDK.d();
        AFc1aSDK aFc1aSDK = aFa1tSDKD.AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5240d.f5305d = context.getApplicationContext();
        }
        AFc1aSDK aFc1aSDK2 = aFa1tSDKD.AFKeystoreWrapper;
        aFc1aSDK2.afWarnLog().d(new AFe1nSDK(aFc1aSDK2, str, aFj1bSDK));
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            if (key.equals(Payload.TYPE_APP)) {
                AFj1fSDK.f5438d = value;
            } else if (key.equals("impression")) {
                registerClient = value;
            }
        }
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator linkGeneratorAFLogger = AFLogger(context, str, str2, map, String.format(Locale.US, AFj1fSDK.f5438d, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName()));
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map2);
        registerClient(linkGeneratorAFLogger.generateLink(), context, new AFj1bSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            registerClient(AFLogger(context, str, str2, map, String.format(Locale.US, registerClient, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName())).generateLink(), context, null);
        }
    }
}
