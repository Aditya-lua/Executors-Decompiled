.class public final Lcom/appsflyer/internal/AFb1iSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static AFLogger:Ljava/lang/String;

.field public static unregisterClient:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h_(Landroid/content/ContentResolver;)Lcom/appsflyer/internal/AFb1lSDK;
    .locals 4

    sget-object v0, Lcom/appsflyer/internal/AFb1iSDK;->unregisterClient:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    :goto_0
    if-nez p0, :cond_2

    return-object v1

    :cond_2
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v0

    const-string v2, "amazon_aid"

    invoke-interface {v0, v2}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    const-string v0, "Amazon"

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "limit_ad_tracking"

    const/4 v2, 0x2

    invoke-static {p0, v0, v2}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    const-string v3, "advertising_id"

    if-nez v0, :cond_3

    invoke-static {p0, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lcom/appsflyer/internal/AFb1lSDK;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, p0, v1}, Lcom/appsflyer/internal/AFb1lSDK;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0

    :cond_3
    if-ne v0, v2, :cond_4

    return-object v1

    :cond_4
    :try_start_0
    invoke-static {p0, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ADVERTISING_ID:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Failed to fetch Amazon Advertising ID: ad tracking may be limited"

    invoke-virtual {v0, v1, v2, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p0, ""

    :goto_1
    new-instance v0, Lcom/appsflyer/internal/AFb1lSDK;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, p0, v1}, Lcom/appsflyer/internal/AFb1lSDK;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0

    :cond_5
    return-object v1
.end method

.method public static unregisterClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1lSDK;
    .locals 6

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    sget-object v1, Lcom/appsflyer/internal/AFb1iSDK;->AFLogger:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    const/4 v5, 0x0

    if-eqz v4, :cond_1

    :goto_1
    move-object p0, v5

    goto :goto_4

    :cond_1
    sget-object v1, Lcom/appsflyer/internal/AFb1iSDK;->unregisterClient:Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move-object p0, v5

    move-object v1, p0

    goto :goto_4

    :cond_3
    :goto_2
    :try_start_0
    new-instance v1, Lcom/appsflyer/oaid/OaidClient;

    invoke-direct {v1, p0}, Lcom/appsflyer/oaid/OaidClient;-><init>(Landroid/content/Context;)V

    iget-object p0, v0, Lcom/appsflyer/internal/AFc1eSDK;->enableTCFDataCollection:Lcom/appsflyer/AFLogger$LogLevel;

    invoke-virtual {p0}, Lcom/appsflyer/AFLogger$LogLevel;->getLevel()I

    move-result p0

    sget-object v0, Lcom/appsflyer/AFLogger$LogLevel;->NONE:Lcom/appsflyer/AFLogger$LogLevel;

    invoke-virtual {v0}, Lcom/appsflyer/AFLogger$LogLevel;->getLevel()I

    move-result v0

    if-le p0, v0, :cond_4

    move v2, v3

    :cond_4
    invoke-virtual {v1, v2}, Lcom/appsflyer/oaid/OaidClient;->setLogging(Z)V

    invoke-virtual {v1}, Lcom/appsflyer/oaid/OaidClient;->fetch()Lcom/appsflyer/oaid/OaidClient$Info;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/appsflyer/oaid/OaidClient$Info;->getId()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Lcom/appsflyer/oaid/OaidClient$Info;->getLat()Ljava/lang/Boolean;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v1, v0

    goto :goto_4

    :catchall_0
    move-object v1, v0

    goto :goto_3

    :catchall_1
    move-object v1, v5

    :goto_3
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->ADVERTISING_ID:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "OAID library not available in application"

    invoke-virtual {p0, v0, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    goto :goto_1

    :goto_4
    if-eqz v1, :cond_5

    new-instance v0, Lcom/appsflyer/internal/AFb1lSDK;

    invoke-direct {v0, v1, p0}, Lcom/appsflyer/internal/AFb1lSDK;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    iput-object p0, v0, Lcom/appsflyer/internal/AFb1lSDK;->unregisterClient:Ljava/lang/Boolean;

    return-object v0

    :cond_5
    return-object v5
.end method
