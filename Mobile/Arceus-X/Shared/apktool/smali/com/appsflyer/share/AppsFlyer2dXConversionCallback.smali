.class public Lcom/appsflyer/share/AppsFlyer2dXConversionCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/share/AppsFlyerConversionListener;
.implements Lcom/appsflyer/share/LinkGenerator$ResponseListener;
.implements Lcom/appsflyer/share/deeplink/DeepLinkListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConversionDataFail(Ljava/lang/String;)V
    .locals 6

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "status"

    const-string v2, "failure"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "data"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p0, v0}, Lcom/appsflyer/share/AppsFlyer2dXConversionCallback;->onInstallConversionFailureNative(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v3, p1

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v2, "2dx error"

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-void
.end method

.method public onConversionDataSuccess(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/appsflyer/share/AppsFlyer2dXConversionCallback;->onInstallConversionDataLoadedNative(Ljava/lang/Object;)V

    return-void
.end method

.method public onDeepLinking(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V
    .locals 0
    .param p1    # Lcom/appsflyer/share/deeplink/DeepLinkResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/appsflyer/share/AppsFlyer2dXConversionCallback;->onDeepLinkingNative(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    return-void
.end method

.method public native onDeepLinkingNative(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V
    .param p1    # Lcom/appsflyer/share/deeplink/DeepLinkResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public native onInstallConversionDataLoadedNative(Ljava/lang/Object;)V
.end method

.method public native onInstallConversionFailureNative(Ljava/lang/Object;)V
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/appsflyer/share/AppsFlyer2dXConversionCallback;->onResponseNative(Ljava/lang/String;)V

    return-void
.end method

.method public onResponseError(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/appsflyer/share/AppsFlyer2dXConversionCallback;->onResponseErrorNative(Ljava/lang/String;)V

    return-void
.end method

.method public native onResponseErrorNative(Ljava/lang/String;)V
.end method

.method public native onResponseNative(Ljava/lang/String;)V
.end method
