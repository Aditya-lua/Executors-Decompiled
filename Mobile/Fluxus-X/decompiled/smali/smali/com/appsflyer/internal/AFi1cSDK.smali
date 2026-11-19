.class public final Lcom/appsflyer/internal/AFi1cSDK;
.super Lcom/appsflyer/sdk_base/referrer/Referrer;
.source "SourceFile"


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

.field final registerClient:Landroid/content/pm/ProviderInfo;


# direct methods
.method public constructor <init>(Landroid/content/pm/ProviderInfo;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 2

    const-string v0, "af_referrer"

    iget-object v1, p1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-direct {p0, v0, v1, p2}, Lcom/appsflyer/sdk_base/referrer/Referrer;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    iput-object p3, p0, Lcom/appsflyer/internal/AFi1cSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iput-object p1, p0, Lcom/appsflyer/internal/AFi1cSDK;->registerClient:Landroid/content/pm/ProviderInfo;

    return-void
.end method

.method public static N_(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/ContentProviderClient;
    .locals 7

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v2, "Failed to acquire unstable content providerClient due to unexpected throwable"

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v2, "Failed to acquire unstable content providerClient due to SecurityException"

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final start(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lcom/appsflyer/internal/AFi1cSDK$1;

    invoke-direct {v0, p0, p1}, Lcom/appsflyer/internal/AFi1cSDK$1;-><init>(Lcom/appsflyer/internal/AFi1cSDK;Landroid/content/Context;)V

    iget-object p1, p0, Lcom/appsflyer/internal/AFi1cSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
