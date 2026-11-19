.class public abstract Lcom/appsflyer/AppsFlyerLib;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/appsflyer/AppsFlyerLib;
    .locals 1

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public varargs abstract addPushNotificationDeepLinkPath([Ljava/lang/String;)V
.end method

.method public abstract anonymizeUser(Z)V
.end method

.method public abstract appendParametersToDeepLinkingURL(Ljava/lang/String;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract clearUserPii()V
.end method

.method public abstract collectDataFromLauncherActivity(Landroid/app/Activity;)V
.end method

.method public abstract disableAppSetId()V
.end method

.method public abstract enableFacebookDeferredApplinks(Z)V
.end method

.method public abstract enableTCFDataCollection(Z)V
.end method

.method public abstract getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract getAttributionId(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public abstract getHostName()Ljava/lang/String;
.end method

.method public abstract getHostPrefix()Ljava/lang/String;
.end method

.method public abstract getOutOfStore(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public abstract getSdkVersion()Ljava/lang/String;
.end method

.method public abstract init(Ljava/lang/String;Lcom/appsflyer/share/AppsFlyerConversionListener;Landroid/content/Context;)Lcom/appsflyer/AppsFlyerLib;
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract isPreInstalledApp(Landroid/content/Context;)Z
.end method

.method public abstract isSessionReady()Z
.end method

.method public abstract isStopped()Z
.end method

.method public abstract logAdRevenue(Lcom/appsflyer/share/AFAdRevenueData;Ljava/util/Map;)V
    .param p1    # Lcom/appsflyer/share/AFAdRevenueData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/share/AFAdRevenueData;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;",
            ")V"
        }
    .end annotation
.end method

.method public abstract logLocation(Landroid/content/Context;DD)V
.end method

.method public abstract logSession(Landroid/content/Context;)V
.end method

.method public abstract onPause(Landroid/content/Context;)V
.end method

.method public abstract performDeepLinking(Ljava/lang/String;Z)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract registerConversionListener(Lcom/appsflyer/share/AppsFlyerConversionListener;)V
    .param p1    # Lcom/appsflyer/share/AppsFlyerConversionListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract registerSessionReadyListener(Lcom/appsflyer/share/SessionReadyListener;)V
    .param p1    # Lcom/appsflyer/share/SessionReadyListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract sendInAppPurchaseData(Landroid/content/Context;Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract sendPurchaseData(Landroid/content/Context;Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract sendPushNotificationData(Landroid/app/Activity;)V
.end method

.method public abstract sendPushNotificationData(Lcom/appsflyer/share/AFPushData;)V
    .param p1    # Lcom/appsflyer/share/AFPushData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setAdditionalData(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setAndroidIdData(Ljava/lang/String;)V
.end method

.method public abstract setAppId(Ljava/lang/String;)V
.end method

.method public abstract setAppInviteOneLink(Ljava/lang/String;)V
.end method

.method public abstract setCollectAndroidID(Z)V
.end method

.method public abstract setConsentData(Lcom/appsflyer/share/AppsFlyerConsent;)V
    .param p1    # Lcom/appsflyer/share/AppsFlyerConsent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setCurrencyCode(Ljava/lang/String;)V
.end method

.method public abstract setCustomerUserId(Ljava/lang/String;)V
.end method

.method public abstract setDebugLog(Z)V
.end method

.method public abstract setDeepLinkTimeout(J)V
.end method

.method public abstract setDisableAdvertisingIdentifiers(Z)V
.end method

.method public abstract setDisableNetworkData(Z)V
.end method

.method public abstract setHost(Ljava/lang/String;Ljava/lang/String;)V
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setImeiData(Ljava/lang/String;)V
.end method

.method public abstract setInstallId(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setIsUpdate(Z)V
.end method

.method public abstract setLogLevel(Lcom/appsflyer/AFLogger$LogLevel;)V
.end method

.method public abstract setMinTimeBetweenSessions(I)V
.end method

.method public abstract setOaidData(Ljava/lang/String;)V
.end method

.method public varargs abstract setOneLinkCustomDomain([Ljava/lang/String;)V
.end method

.method public abstract setOutOfStore(Ljava/lang/String;)V
.end method

.method public abstract setPartnerData(Ljava/lang/String;Ljava/util/Map;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setPluginInfo(Lcom/appsflyer/share/platform_extension/PluginInfo;)V
    .param p1    # Lcom/appsflyer/share/platform_extension/PluginInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setPreinstallAttribution(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public varargs abstract setResolveDeepLinkURLs([Ljava/lang/String;)V
.end method

.method public varargs abstract setSharingFilterForPartners([Ljava/lang/String;)V
.end method

.method public abstract setUserEmail(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setUserFbLoginId(J)V
.end method

.method public abstract setUserFirstName(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setUserLastName(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setUserPhone(Ljava/lang/String;Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract start()V
.end method

.method public abstract start(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V
.end method

.method public abstract stop(ZLandroid/content/Context;)V
.end method

.method public abstract subscribeForDeepLink(Lcom/appsflyer/share/deeplink/DeepLinkListener;)V
.end method

.method public abstract unregisterConversionListener()V
.end method

.method public abstract unregisterSessionReadyListener()V
.end method

.method public abstract updateServerUninstallToken(Landroid/content/Context;Ljava/lang/String;)V
.end method

.method public abstract validateAndLogInAppPurchase(Lcom/appsflyer/share/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;)V
    .param p1    # Lcom/appsflyer/share/AFPurchaseDetails;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/share/AFPurchaseDetails;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;",
            ")V"
        }
    .end annotation
.end method
