.class public final Lcom/appsflyer/internal/AFa1rSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AFKeystoreWrapper(Ljava/lang/String;Lcom/appsflyer/AppsFlyerProperties;)Lorg/json/JSONObject;
    .locals 6

    invoke-static {p0}, Lcom/appsflyer/internal/AFg1dSDK;->registerClient(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_2

    :try_start_0
    const-string v0, "ol_id"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "ol_scheme"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "ol_domain"

    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "ol_ver"

    invoke-virtual {p0, v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_0

    const-string v3, "onelinkScheme"

    invoke-interface {p1, v3, v0}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v3, p1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v2, :cond_1

    const-string v0, "onelinkDomain"

    invoke-interface {p1, v0, v2}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-eqz v1, :cond_2

    const-string v0, "onelinkVersion"

    invoke-interface {p1, v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :goto_1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "Error in handleResponse: "

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object p1

    iget-object p1, p1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1uSDK;->registerClient()V

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object p1

    iget-object p1, p1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1uSDK;->d()V

    :cond_2
    return-object p0
.end method
