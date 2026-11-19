package com.appsflyer;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.share.AFAdRevenueData;
import com.appsflyer.share.AFPurchaseDetails;
import com.appsflyer.share.AFPushData;
import com.appsflyer.share.AppsFlyerConsent;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.share.SessionReadyListener;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.platform_extension.PluginInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppsFlyerLib {
    public static AppsFlyerLib getInstance() {
        return AFa1tSDK.d();
    }

    public abstract void addPushNotificationDeepLinkPath(String... strArr);

    public abstract void anonymizeUser(boolean z10);

    public abstract void appendParametersToDeepLinkingURL(String str, Map<String, String> map);

    public abstract void clearUserPii();

    public abstract void collectDataFromLauncherActivity(Activity activity);

    public abstract void disableAppSetId();

    public abstract void enableFacebookDeferredApplinks(boolean z10);

    public abstract void enableTCFDataCollection(boolean z10);

    public abstract String getAppsFlyerUID(@NonNull Context context);

    public abstract String getAttributionId(Context context);

    public abstract String getHostName();

    public abstract String getHostPrefix();

    public abstract String getOutOfStore(Context context);

    public abstract String getSdkVersion();

    public abstract AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context);

    public abstract boolean isPreInstalledApp(Context context);

    public abstract boolean isSessionReady();

    public abstract boolean isStopped();

    public abstract void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, Map<String, Object> map);

    public abstract void logEvent(Context context, String str, Map<String, Object> map);

    public abstract void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener);

    public abstract void logLocation(Context context, double d10, double d11);

    public abstract void logSession(Context context);

    public abstract void onPause(Context context);

    public abstract void performDeepLinking(@NonNull String str, boolean z10);

    public abstract void registerConversionListener(@NonNull AppsFlyerConversionListener appsFlyerConversionListener);

    public abstract void registerSessionReadyListener(@NonNull SessionReadyListener sessionReadyListener);

    public abstract void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback);

    public abstract void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback);

    public abstract void sendPushNotificationData(Activity activity);

    public abstract void sendPushNotificationData(@NonNull AFPushData aFPushData);

    public abstract void setAdditionalData(Map<String, Object> map);

    public abstract void setAndroidIdData(String str);

    public abstract void setAppId(String str);

    public abstract void setAppInviteOneLink(String str);

    public abstract void setCollectAndroidID(boolean z10);

    public abstract void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent);

    public abstract void setCurrencyCode(String str);

    public abstract void setCustomerUserId(String str);

    public abstract void setDebugLog(boolean z10);

    public abstract void setDeepLinkTimeout(long j10);

    public abstract void setDisableAdvertisingIdentifiers(boolean z10);

    public abstract void setDisableNetworkData(boolean z10);

    public abstract void setHost(String str, @NonNull String str2);

    public abstract void setImeiData(String str);

    public abstract void setInstallId(@NonNull String str);

    public abstract void setIsUpdate(boolean z10);

    public abstract void setLogLevel(AFLogger.LogLevel logLevel);

    public abstract void setMinTimeBetweenSessions(int i10);

    public abstract void setOaidData(String str);

    public abstract void setOneLinkCustomDomain(String... strArr);

    public abstract void setOutOfStore(String str);

    public abstract void setPartnerData(@NonNull String str, Map<String, Object> map);

    public abstract void setPluginInfo(@NonNull PluginInfo pluginInfo);

    public abstract void setPreinstallAttribution(String str, String str2, String str3);

    public abstract void setResolveDeepLinkURLs(String... strArr);

    public abstract void setSharingFilterForPartners(String... strArr);

    public abstract void setUserEmail(@NonNull String str);

    public abstract void setUserFbLoginId(long j10);

    public abstract void setUserFirstName(@NonNull String str);

    public abstract void setUserLastName(@NonNull String str);

    public abstract void setUserPhone(@NonNull String str, @NonNull String str2);

    public abstract void start();

    public abstract void start(AppsFlyerRequestListener appsFlyerRequestListener);

    public abstract void stop(boolean z10, Context context);

    public abstract void subscribeForDeepLink(DeepLinkListener deepLinkListener);

    public abstract void unregisterConversionListener();

    public abstract void unregisterSessionReadyListener();

    public abstract void updateServerUninstallToken(Context context, String str);

    public abstract void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback);
}
