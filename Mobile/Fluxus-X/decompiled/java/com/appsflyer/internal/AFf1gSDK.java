package com.appsflyer.internal;

import com.appsflyer.share.AppsFlyerConsent;
import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1gSDK implements AFf1eSDK {

    @NotNull
    private final AFc1eSDK AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFg1xSDK f5857d;

    public AFf1gSDK(@NotNull AFg1xSDK aFg1xSDK, @NotNull AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.f5857d = aFg1xSDK;
        this.AFLogger = aFc1eSDK;
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void d(@NotNull Map<String, Object> map, @NotNull AFe1zSDK aFe1zSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        AFg1ySDK aFg1ySDKRegisterClient = this.f5857d.registerClient();
        AppsFlyerConsent appsFlyerConsent = this.AFLogger.setImeiData;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean boolIsUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (boolIsUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", boolIsUserSubjectToGDPR);
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (aFg1ySDKRegisterClient != null) {
            boolean z10 = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(aFg1ySDKRegisterClient.unregisterClient));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(aFg1ySDKRegisterClient.registerClient));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(aFg1ySDKRegisterClient.AFLogger));
            if (z10) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", BuildConfig.FLAVOR);
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(aFg1ySDKRegisterClient.f5903d));
                linkedHashMap3.put("tcstring", aFg1ySDKRegisterClient.AFKeystoreWrapper);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1zSDK != AFd1bSDK.CONVERSION || this.AFLogger.afDebugLog == null) {
            return;
        }
        AFj1iSDK.AFLogger(map).put("api", p001kotlin.collections.j0.g(zt.s.a("enableTCFDataCollection", this.AFLogger.afDebugLog)));
    }
}
