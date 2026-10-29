.class public final Lcom/appsflyer/internal/AFa1tSDK;
.super Lcom/appsflyer/AppsFlyerLib;
.source "SourceFile"


# static fields
.field private static d:Lcom/appsflyer/internal/AFa1tSDK; = null

.field public static final registerClient:Ljava/lang/String; = "7.0"

.field public static final unregisterClient:Ljava/lang/String; = "386"


# instance fields
.field public final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private AFLogger:Lcom/appsflyer/internal/AFb1hSDK;

.field private e:Lcom/appsflyer/internal/AFf1mSDK;

.field private w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/appsflyer/internal/AFa1tSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFa1tSDK;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFa1tSDK;->d:Lcom/appsflyer/internal/AFa1tSDK;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/appsflyer/AppsFlyerLib;-><init>()V

    new-instance v0, Lcom/appsflyer/internal/AFc1aSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1aSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object v1

    invoke-interface {v1}, Lcom/appsflyer/internal/AFh1wSDK;->AFLogger()V

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFh1wSDK;->AFKeystoreWrapper()V

    return-void
.end method

.method private declared-synchronized AFKeystoreWrapper()Lcom/appsflyer/internal/AFf1mSDK;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->e:Lcom/appsflyer/internal/AFf1mSDK;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/appsflyer/internal/m;

    invoke-direct {v0, p0}, Lcom/appsflyer/internal/m;-><init>(Lcom/appsflyer/internal/AFa1tSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->e:Lcom/appsflyer/internal/AFf1mSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 3
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->e:Lcom/appsflyer/internal/AFf1mSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private AFKeystoreWrapper(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V
    .locals 3

    .line 4
    new-instance v0, Lcom/appsflyer/internal/AFh1fSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFh1fSDK;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 6
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v1

    .line 7
    iget-object v2, v1, Lcom/appsflyer/internal/AFc1eSDK;->setUserLastName:Ljava/lang/String;

    .line 8
    iput-object v2, v0, Lcom/appsflyer/internal/AFh1pSDK;->e:Ljava/lang/String;

    .line 9
    iget-object v2, v1, Lcom/appsflyer/internal/AFc1eSDK;->clearUserPii:Ljava/lang/String;

    .line 10
    iput-object v2, v0, Lcom/appsflyer/internal/AFh1pSDK;->afInfoLog:Ljava/lang/String;

    .line 11
    iput-object p1, v0, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

    .line 12
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 13
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    const/4 p1, 0x0

    .line 14
    iput-object p1, v1, Lcom/appsflyer/internal/AFc1eSDK;->setUserLastName:Ljava/lang/String;

    .line 15
    iput-object p1, v1, Lcom/appsflyer/internal/AFc1eSDK;->clearUserPii:Ljava/lang/String;

    return-void
.end method

.method private AFLogger()V
    .locals 7

    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 11
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v0

    .line 12
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 13
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1qSDK;->AFLogger(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/appsflyer/internal/AFj1qSDK;->unregisterClient(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 14
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 15
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setImeiData()Lcom/appsflyer/internal/AFi1oSDK;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 16
    new-instance v1, Lcom/appsflyer/internal/l;

    invoke-direct {v1, p0, v0}, Lcom/appsflyer/internal/l;-><init>(Lcom/appsflyer/internal/AFa1tSDK;Lcom/appsflyer/internal/AFi1oSDK;)V

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFi1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFi1kSDK;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v4, v0

    goto :goto_0

    .line 17
    :cond_0
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1qSDK;->unregisterClient(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 18
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 19
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setImeiData()Lcom/appsflyer/internal/AFi1oSDK;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 20
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger(Lcom/appsflyer/internal/AFi1oSDK;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    .line 21
    :goto_0
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PLAY_INTEGRITY_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v3, "Failed to request Play Integrity API token"

    invoke-virtual/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 22
    const-string v0, "Play Integrity API token request exception: "

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic AFLogger(Lcom/appsflyer/internal/AFf1pSDK;)V
    .locals 2

    .line 23
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 24
    sget-object v1, Lcom/appsflyer/internal/AFf1pSDK;->AFLogger:Lcom/appsflyer/internal/AFf1pSDK;

    if-ne p1, v1, :cond_0

    .line 25
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 26
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/exception_manager/ExceptionManager;->updateExceptionManagerConfiguration()V

    .line 27
    :cond_0
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFd1uSDK;->AFLogger()Z

    move-result p1

    if-nez p1, :cond_1

    .line 28
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFh1wSDK;->unregisterClient()V

    return-void

    .line 29
    :cond_1
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFh1wSDK;->AFLogger()V

    return-void
.end method

.method private AFLogger(Lcom/appsflyer/internal/AFi1oSDK;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFe1dSDK;

    .line 2
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 3
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 5
    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->force()Lcom/appsflyer/internal/AFg1rSDK;

    move-result-object v4

    .line 6
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 7
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v5

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFe1dSDK;-><init>(Lcom/appsflyer/internal/AFi1oSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFg1rSDK;Lcom/appsflyer/internal/AFd1zSDK;)V

    .line 8
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 9
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFa1tSDK;)V
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient()V

    return-void
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFa1tSDK;)Lkotlin/Unit;
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->registerClient()Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/appsflyer/internal/AFa1tSDK;)V
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger()V

    return-void
.end method

.method public static d()Lcom/appsflyer/internal/AFa1tSDK;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFa1tSDK;->d:Lcom/appsflyer/internal/AFa1tSDK;

    return-object v0
.end method

.method public static d(Lcom/appsflyer/internal/AFc1kSDK;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 4
    const-string v0, "CACHED_CHANNEL"

    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    .line 5
    :cond_0
    invoke-interface {p0, v0, p1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method private static synthetic d(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    .line 2
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->values()Lcom/appsflyer/internal/AFc1vSDK;

    move-result-object p0

    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1vSDK;->unregisterClient()V

    return-void
.end method

.method private synthetic d(Lcom/appsflyer/internal/AFi1oSDK;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger(Lcom/appsflyer/internal/AFi1oSDK;)V

    return-void
.end method

.method private static d(Ljava/lang/String;)V
    .locals 4

    .line 6
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WARNING: AppsFlyer SDK is not initialized! The API call \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "()\' must be called after the \'init(String, AppsFlyerConversionListener)\' API method, which should be called on the Application\'s onCreate."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1tSDK;->d(Lcom/appsflyer/internal/AFc1bSDK;)V

    return-void
.end method

.method public static synthetic f(Lcom/appsflyer/internal/AFa1tSDK;)V
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->v()V

    return-void
.end method

.method public static synthetic g(Lcom/appsflyer/internal/AFa1tSDK;Lcom/appsflyer/internal/AFi1oSDK;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->d(Lcom/appsflyer/internal/AFi1oSDK;)V

    return-void
.end method

.method public static synthetic h(Lcom/appsflyer/internal/AFa1tSDK;Lcom/appsflyer/internal/AFf1pSDK;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger(Lcom/appsflyer/internal/AFf1pSDK;)V

    return-void
.end method

.method private static registerClient(Landroid/app/Activity;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "af"

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 3
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 4
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v6, "Push Notification received af payload = "

    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    return-object v1

    .line 8
    :goto_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-object v1
.end method

.method private synthetic registerClient()Lkotlin/Unit;
    .locals 3

    .line 9
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 10
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    .line 11
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    if-nez v0, :cond_0

    .line 12
    const-string v0, "finishSdkSession"

    invoke-static {v0}, Lcom/appsflyer/internal/AFa1tSDK;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    .line 15
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserPhone:Z

    if-nez v0, :cond_1

    .line 16
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "ERROR: AppsFlyer SDK session not started. Skipping session finish."

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 17
    :cond_1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Finishing AppsFlyer session"

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 18
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 19
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    move-result-object v1

    invoke-interface {v1}, Lcom/appsflyer/internal/AFa1lSDK;->registerClient()V

    .line 20
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 21
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog()Lcom/appsflyer/internal/AFj1ySDK;

    move-result-object v1

    invoke-interface {v1}, Lcom/appsflyer/internal/AFj1ySDK;->AFKeystoreWrapper()V

    .line 22
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 23
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 24
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 25
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    move-result-object v1

    invoke-interface {v1}, Lcom/appsflyer/exception_manager/ExceptionManager;->sendExceptionsToServerIfNeeded()V

    .line 26
    :cond_2
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 27
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v1

    invoke-interface {v1}, Lcom/appsflyer/internal/AFd1uSDK;->i()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 28
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 29
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1uSDK;->d()V

    .line 30
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 31
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v0

    .line 32
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-eqz v0, :cond_3

    .line 33
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/AppsFlyerLib;->isStopped()Z

    move-result v1

    if-nez v1, :cond_3

    .line 34
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 35
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v1

    .line 36
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 37
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 38
    invoke-interface {v1, v2, v0}, Lcom/appsflyer/internal/AFd1uSDK;->v_(Ljava/lang/String;Landroid/content/pm/PackageManager;)V

    .line 39
    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 40
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1uSDK;->unregisterClient()V

    goto :goto_0

    .line 41
    :cond_4
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PROXY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "RD status is OFF"

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 42
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 43
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserLastName()Lcom/appsflyer/internal/AFh1sSDK;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 44
    invoke-interface {v0}, Lcom/appsflyer/internal/AFh1sSDK;->AFLogger()V

    .line 45
    :cond_5
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 46
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    const/4 v1, 0x0

    .line 47
    iput-boolean v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserPhone:Z

    .line 48
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method private synthetic registerClient(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 49
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 50
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFh1wSDK;->registerClient()V

    return-void

    .line 51
    :cond_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 52
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFh1wSDK;->d()V

    return-void
.end method

.method private synthetic unregisterClient()V
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 27
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/AFh1kSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFh1kSDK;-><init>()V

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    return-void
.end method

.method private unregisterClient(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 2
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    .line 3
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    .line 4
    const-string v1, "start"

    if-nez v0, :cond_0

    .line 5
    invoke-static {v1}, Lcom/appsflyer/internal/AFa1tSDK;->d(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 7
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1wSDK;->AFLogger()Z

    move-result v0

    if-nez v0, :cond_1

    .line 8
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "WARNING: SessionReadyListener is not registered! You must call \'registerSessionReadyListener(SessionReadyListener)\' before calling \'start()\'. The listener ensures that all required data (e.g., deeplink parameters) is available before session initialization."

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 10
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    .line 11
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserPhone:Z

    if-eqz v0, :cond_2

    .line 12
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "AppsFlyer SDK session already started. Skipping duplicate start call."

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 14
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 15
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    sget-object v3, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient:Ljava/lang/String;

    const-string v4, "7.0.1"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Starting AppsFlyer: (v%s.%s)"

    invoke-static {v2, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Build Number: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 18
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->getSdkVersion()Lcom/appsflyer/internal/AFa1aSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFa1aSDK;->unregisterClient()V

    .line 19
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 20
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserLastName()Lcom/appsflyer/internal/AFh1sSDK;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 21
    invoke-interface {v0}, Lcom/appsflyer/internal/AFh1sSDK;->d()V

    .line 22
    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 23
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    const/4 v1, 0x1

    .line 24
    iput-boolean v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserPhone:Z

    .line 25
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V

    return-void
.end method

.method private synthetic v()V
    .locals 5

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserEmail()Lcom/appsflyer/internal/AFb1aSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFb1aSDK;->AFLogger()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserEmail()Lcom/appsflyer/internal/AFb1aSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFb1aSDK;->unregisterClient()V

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->getInstance()Lcom/appsflyer/internal/AFi1vSDK;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_1

    new-instance v1, Lcom/appsflyer/internal/AFi1sSDK;

    iget-object v2, v0, Lcom/appsflyer/internal/AFi1vSDK;->AFLogger:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFi1sSDK;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/appsflyer/internal/AFi1wSDK;

    iget-object v2, v0, Lcom/appsflyer/internal/AFi1vSDK;->AFLogger:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFi1wSDK;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object v1, v0, Lcom/appsflyer/internal/AFi1vSDK;->d:Lcom/appsflyer/internal/AFi1ySDK;

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFf1fSDK;->d(Lcom/appsflyer/internal/AFc1iSDK;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->i:J

    iget-object v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v2, "appsFlyerCount"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v3, "first_launch"

    invoke-interface {v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    invoke-virtual {v0, v3}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_2
    if-lez v1, :cond_3

    iget-object v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v2, "gcd"

    invoke-interface {v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    invoke-virtual {v0, v2}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_3
    iget-object v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v2, "prev_session_dur"

    const-wide/16 v3, 0x0

    invoke-interface {v1, v2, v3, v4}, Lcom/appsflyer/internal/AFc1kSDK;->unregisterClient(Ljava/lang/String;J)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/appsflyer/internal/AFh1xSDK;->afInfoLog:J

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    move-result-object v0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFf1mSDK;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFf1hSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1mSDK;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->values()Lcom/appsflyer/internal/AFc1vSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1vSDK;->d()V

    return-void
.end method


# virtual methods
.method public final varargs addPushNotificationDeepLinkPath([Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFa1qSDK;->registerClient:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final anonymizeUser(Z)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "anonymizeUser"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-boolean p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->afInfoLog:Z

    return-void
.end method

.method public final appendParametersToDeepLinkingURL(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
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

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFa1qSDK;->AFLogger:Ljava/lang/String;

    iput-object p2, v0, Lcom/appsflyer/internal/AFa1qSDK;->d:Ljava/util/Map;

    return-void
.end method

.method public final clearUserPii()V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "clearUserPii"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->AFLogger:Ljava/lang/String;

    iput-object v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->registerClient:Ljava/lang/String;

    iput-object v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->AFKeystoreWrapper:Ljava/lang/String;

    iput-object v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->e:Ljava/lang/String;

    iput-object v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->i:Ljava/lang/Long;

    return-void
.end method

.method public final collectDataFromLauncherActivity(Landroid/app/Activity;)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->stop()Lcom/appsflyer/internal/AFi1tSDK;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v1

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFi1tSDK;->registerClient(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/appsflyer/internal/AFc1eSDK;->setUserLastName:Ljava/lang/String;

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v1

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFi1tSDK;->AFLogger(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/appsflyer/internal/AFc1eSDK;->clearUserPii:Ljava/lang/String;

    return-void
.end method

.method public final disableAppSetId()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->setCustomerUserId:Z

    return-void
.end method

.method public final enableFacebookDeferredApplinks(Z)V
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->getSdkVersion()Lcom/appsflyer/internal/AFa1aSDK;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFa1aSDK;->AFLogger(Z)V

    return-void
.end method

.method public final enableTCFDataCollection(Z)V
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->afDebugLog:Ljava/lang/Boolean;

    return-void
.end method

.method public final getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "getAppsFlyerUID"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object p1

    iget-object p1, p1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {p1}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAttributionId(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p1, :cond_0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appsflyer/internal/AFc1iSDK;->registerClient(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getHostName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->getLevel()Lcom/appsflyer/internal/AFd1jSDK;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1jSDK;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getHostPrefix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->getLevel()Lcom/appsflyer/internal/AFd1jSDK;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1jSDK;->registerClient()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getOutOfStore(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->getLevel:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    move-object p1, v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object p1

    const-string v1, "AF_STORE"

    invoke-virtual {p1, v1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Out-of-store value not configured via API or manifest"

    invoke-virtual {p1, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getSdkVersion()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "getSdkVersion"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    invoke-static {}, Lcom/appsflyer/internal/AFc1iSDK;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final init(Ljava/lang/String;Lcom/appsflyer/share/AppsFlyerConversionListener;Landroid/content/Context;)Lcom/appsflyer/AppsFlyerLib;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string p3, "WARNING: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key in the \'init\' API method (should be called on Application\'s onCreate)"

    invoke-virtual {p1, p2, p3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-object p0

    :cond_1
    if-nez p3, :cond_2

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string p3, "ERROR: AppsFlyer SDK requires a valid Context! Ensure \'init\' is called with a non-null Context, typically from Application\'s onCreate."

    invoke-virtual {p1, p2, p3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-object p0

    :cond_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appsflyer/internal/AFf1fSDK;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    invoke-static {p3}, Lcom/appsflyer/internal/AFj1qSDK;->X_(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v0

    if-nez v0, :cond_3

    :goto_0
    return-object p0

    :cond_3
    sget-object v1, Lcom/appsflyer/internal/AFa1zSDK;->INSTANCE:Lcom/appsflyer/internal/AFa1zSDK;

    invoke-virtual {v1, p3}, Lcom/appsflyer/internal/AFa1zSDK;->AFLogger(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lcom/appsflyer/internal/g;

    invoke-direct {v2, p0}, Lcom/appsflyer/internal/g;-><init>(Lcom/appsflyer/internal/AFa1tSDK;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v2

    const-string v3, ""

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v4, "appsFlyerCount"

    const/4 v5, 0x0

    invoke-interface {v1, v4, v5}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v2}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lcom/appsflyer/internal/h;

    invoke-direct {v2, p0}, Lcom/appsflyer/internal/h;-><init>(Lcom/appsflyer/internal/AFa1tSDK;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_4
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object v1

    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->setCustomerUserId()Lcom/appsflyer/internal/AFe1vSDK;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lcom/appsflyer/internal/AFe1wSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object v1

    new-instance v2, Lcom/appsflyer/internal/AFe1iSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-direct {v2, v3}, Lcom/appsflyer/internal/AFe1iSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    move-result-object v1

    new-instance v2, Lcom/appsflyer/internal/i;

    invoke-direct {v2, p0}, Lcom/appsflyer/internal/i;-><init>(Lcom/appsflyer/internal/AFa1tSDK;)V

    invoke-interface {v1, v2}, Lcom/appsflyer/exception_manager/ExceptionManager;->init(Lcom/appsflyer/exception_manager/ExceptionManager$ConfigurationChangedListener;)V

    :cond_5
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;

    move-result-object v1

    new-instance v2, Lcom/appsflyer/internal/j;

    invoke-direct {v2, p0}, Lcom/appsflyer/internal/j;-><init>(Lcom/appsflyer/internal/AFa1tSDK;)V

    iget-object v3, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v3

    iget-object v3, v3, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {v3, v4, v5}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v3

    if-lez v3, :cond_6

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "Referrers collection disallowed by counter."

    invoke-virtual {v1, v2, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_6
    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFi1aSDK;->d(Ljava/lang/Runnable;)Lcom/appsflyer/internal/AFi1gSDK;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient(Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object v2

    new-instance v4, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    iget-object v6, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v6}, Lcom/appsflyer/internal/AFc1bSDK;->afErrorLog()Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    move-result-object v6

    iget-object v7, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v7}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    invoke-direct {v4, v2, v6, v7}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;-><init>(Ljava/lang/Runnable;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/ExecutorService;)V

    iget-object v2, v1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/appsflyer/internal/AFi1bSDK;

    invoke-direct {v2, v4}, Lcom/appsflyer/internal/AFi1bSDK;-><init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    iget-object v3, v1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v4}, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    iget-object v2, v1, Lcom/appsflyer/internal/AFi1aSDK;->d:Lcom/appsflyer/internal/AFi1hSDK;

    invoke-interface {v2, v4}, Lcom/appsflyer/internal/AFi1hSDK;->AFKeystoreWrapper(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)Ljava/util/List;

    move-result-object v2

    iget-object v3, v1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getExternalReferrers()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/Pair;

    invoke-virtual {v3}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    iget-object v6, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v6}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v6

    iget-object v6, v6, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    iget-object v7, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v7}, Lcom/appsflyer/internal/AFc1bSDK;->afErrorLog()Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    move-result-object v7

    invoke-static {v3, v6, v7}, Lcom/appsflyer/sdk_base/referrer/ReferrerKt;->disableInitProvider(Ljava/lang/Class;Landroid/content/Context;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Ljava/lang/Object;

    goto :goto_1

    :cond_7
    iget-object v2, v1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-array v3, v5, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    array-length v3, v2

    move v6, v5

    :goto_2
    if-ge v6, v3, :cond_8

    aget-object v7, v2, v6

    iget-object v8, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v8}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v8

    iget-object v8, v8, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    invoke-virtual {v7, v8}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start(Landroid/content/Context;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_8
    iget-object v2, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v2

    const-string v3, "AF_PREINSTALL_DISABLED"

    invoke-virtual {v2, v3}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    :cond_9
    if-nez v5, :cond_a

    iget-object v2, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v2

    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    iget-object v3, v1, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-virtual {v1, v2, v4, v3}, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient(Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V

    :cond_a
    :goto_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger:Lcom/appsflyer/internal/AFb1hSDK;

    if-nez v1, :cond_b

    new-instance v1, Lcom/appsflyer/internal/AFb1hSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    new-instance v3, Lcom/appsflyer/internal/k;

    invoke-direct {v3, p0}, Lcom/appsflyer/internal/k;-><init>(Lcom/appsflyer/internal/AFa1tSDK;)V

    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFf1mSDK;

    move-result-object v4

    iget-object v5, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v5}, Lcom/appsflyer/internal/AFc1bSDK;->setUserLastName()Lcom/appsflyer/internal/AFh1sSDK;

    move-result-object v5

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/appsflyer/internal/AFb1hSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lkotlin/jvm/functions/Function0;Lcom/appsflyer/internal/AFf1mSDK;Lcom/appsflyer/internal/AFh1sSDK;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger:Lcom/appsflyer/internal/AFb1hSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->updateServerUninstallToken()Lcom/appsflyer/internal/AFb1bSDK;

    move-result-object v1

    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFLogger:Lcom/appsflyer/internal/AFb1hSDK;

    invoke-interface {v1, p3, v2}, Lcom/appsflyer/internal/AFb1bSDK;->unregisterClient(Landroid/content/Context;Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;)V

    :cond_b
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object v0

    :try_start_0
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v0, :cond_f

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_f

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v1, 0x1f

    const-string v2, "xml"

    if-lt v0, v1, :cond_d

    :try_start_1
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "appsflyer_data_extraction_rules"

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, v1, v2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p3

    if-eqz p3, :cond_c

    sget-object p3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data"

    invoke-virtual {p3, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    goto :goto_5

    :catchall_0
    move-exception p3

    goto :goto_4

    :cond_c
    sget-object p3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "\'allowBackup\' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application\'s <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer\'s Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>"

    invoke-virtual {p3, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    goto :goto_5

    :cond_d
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "appsflyer_backup_rules"

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, v1, v2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p3

    if-eqz p3, :cond_e

    sget-object p3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data"

    invoke-virtual {p3, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    goto :goto_5

    :cond_e
    sget-object p3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "\'allowBackup\' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application\'s <full-backup-content> rules.\nIf Appsflyer\'s Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>"

    invoke-virtual {p3, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :goto_4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Exception while checking BackupRules: "

    invoke-virtual {v0, v1, v2, p3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    :goto_5
    iget-object p3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object p3

    invoke-interface {p3}, Lcom/appsflyer/AppsFlyerProperties;->loadProperties()V

    iget-object p3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p3

    if-nez p2, :cond_10

    const-string v0, "null"

    goto :goto_6

    :cond_10
    const-string v0, "conversionDataListener"

    :goto_6
    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    const-string v0, "init"

    invoke-interface {p3, v0, p1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p3, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "7.0.1"

    sget-object v2, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient:Ljava/lang/String;

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Initializing AppsFlyer SDK: (v%s.%s)"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Lcom/appsflyer/AFLogger;->force(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1, p2}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient(Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    return-object p0
.end method

.method public final isPreInstalledApp(Landroid/content/Context;)Z
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p1, :cond_0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method public final isSessionReady()Z
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "isSessionReady"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1wSDK;->AFKeystoreWrapper()Z

    move-result v0

    return v0
.end method

.method public final isStopped()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v0

    return v0
.end method

.method public final logAdRevenue(Lcom/appsflyer/share/AFAdRevenueData;Ljava/util/Map;)V
    .locals 4
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

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    if-nez v0, :cond_0

    const-string p1, "logAdRevenue"

    invoke-static {p1}, Lcom/appsflyer/internal/AFa1tSDK;->d(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/appsflyer/share/AFAdRevenueData;->areAllFieldsValid()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->AD_REVENUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "Invalid ad revenue parameters provided"

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->AD_REVENUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "SDK is stopped"

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v2, -0x62ff1f55

    const v3, 0x62ff1f57

    invoke-static {v1, v2, v3, v0}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/appsflyer/internal/AFh1lSDK;

    invoke-direct {v0, p1, p2}, Lcom/appsflyer/internal/AFh1lSDK;-><init>(Lcom/appsflyer/share/AFAdRevenueData;Ljava/util/Map;)V

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    return-void

    :cond_4
    :goto_0
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "WARNING: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key in the \'init\' API method (should be called on Application\'s onCreate)"

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void
.end method

.method public final logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
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

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/appsflyer/AppsFlyerLib;->logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V

    return-void
.end method

.method public final logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V
    .locals 6
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

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    move-object p3, v0

    .line 3
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p1, :cond_1

    .line 4
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 6
    :cond_1
    new-instance v0, Lcom/appsflyer/internal/AFh1jSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFh1jSDK;-><init>()V

    .line 7
    iput-object p2, v0, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 8
    iput-object p4, v0, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

    if-eqz p3, :cond_3

    .line 9
    const-string p4, "af_touch_obj"

    invoke-interface {p3, p4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 10
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 11
    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 12
    instance-of v3, v2, Landroid/view/MotionEvent;

    if-eqz v3, :cond_2

    .line 13
    check-cast v2, Landroid/view/MotionEvent;

    .line 14
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 15
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const-string v5, "x"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const-string v5, "y"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    const-string v4, "loc"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getPressure()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "pf"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getTouchMajor()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-string v3, "rad"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 20
    :cond_2
    const-string v2, "error"

    const-string v3, "Parsing failed due to invalid input in \'af_touch_obj\'."

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->PREDICT:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v2, v4, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 22
    :goto_1
    const-string v2, "tch_data"

    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    .line 23
    invoke-interface {p3, p4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/util/Map;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 25
    :cond_3
    iput-object p3, v0, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 26
    iget-object p3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 27
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p3

    .line 28
    new-instance p4, Lorg/json/JSONObject;

    iget-object v1, v0, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper:Ljava/util/Map;

    if-nez v1, :cond_4

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :cond_4
    invoke-direct {p4, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p4

    .line 29
    filled-new-array {p2, p4}, [Ljava/lang/String;

    move-result-object p4

    const-string v1, "logEvent"

    invoke-interface {p3, v1, p4}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    if-nez p2, :cond_6

    .line 30
    sget-object p2, Lcom/appsflyer/internal/AFh1uSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1uSDK;

    .line 31
    iget-object p3, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p1, :cond_5

    .line 32
    iget-object p3, p3, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p3, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 34
    :cond_5
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 35
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    move-result-object p1

    .line 36
    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient(Lcom/appsflyer/internal/AFh1uSDK;)V

    .line 37
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger()V

    .line 38
    :cond_6
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 39
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    return-void
.end method

.method public final logLocation(Landroid/content/Context;DD)V
    .locals 2

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p1

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, "logLocation"

    invoke-interface {p1, v1, v0}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "af_long"

    invoke-static {p4, p5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p4

    invoke-interface {p1, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "af_lat"

    invoke-static {p2, p3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lcom/appsflyer/internal/AFh1jSDK;

    invoke-direct {p2}, Lcom/appsflyer/internal/AFh1jSDK;-><init>()V

    const-string p3, "af_location_coordinates"

    iput-object p3, p2, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    iput-object p1, p2, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper:Ljava/util/Map;

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    return-void
.end method

.method public final logSession(Landroid/content/Context;)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "logSession"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFd1uSDK;->AFKeystoreWrapper()V

    sget-object v0, Lcom/appsflyer/internal/AFh1uSDK;->AFLogger:Lcom/appsflyer/internal/AFh1uSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p1, :cond_0

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    :cond_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient(Lcom/appsflyer/internal/AFh1uSDK;)V

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger()V

    new-instance p1, Lcom/appsflyer/internal/AFh1jSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFh1jSDK;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    iput-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper:Ljava/util/Map;

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    return-void
.end method

.method public final onPause(Landroid/content/Context;)V
    .locals 0

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->updateServerUninstallToken()Lcom/appsflyer/internal/AFb1bSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFb1bSDK;->AFKeystoreWrapper()V

    return-void
.end method

.method public final performDeepLinking(Ljava/lang/String;Z)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    if-nez v0, :cond_1

    const-string p1, "performDeepLinking"

    invoke-static {p1}, Lcom/appsflyer/internal/AFa1tSDK;->d(Ljava/lang/String;)V

    return-void

    :cond_1
    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFa1lSDK;->registerClient()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFa1kSDK;->unregisterClient(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1kSDK;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Lcom/appsflyer/internal/AFa1kSDK;->unregisterClient(Ljava/util/Map;)Lcom/appsflyer/internal/AFa1kSDK;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lcom/appsflyer/internal/AFa1qSDK;->c_(Lcom/appsflyer/internal/AFa1kSDK;Landroid/net/Uri;)V

    if-eqz p2, :cond_3

    new-instance p1, Lcom/appsflyer/internal/AFh1fSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFh1fSDK;-><init>()V

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->unregisterClient()Lcom/appsflyer/internal/AFh1pSDK;

    move-result-object p1

    iget-object p2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    :cond_3
    return-void

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object p1

    const-string p2, "performDeepLinking was called with null or empty url"

    sget-object v0, Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;->DEVELOPER_ERROR:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Ljava/lang/String;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    return-void
.end method

.method public final registerConversionListener(Lcom/appsflyer/share/AppsFlyerConversionListener;)V
    .locals 3
    .param p1    # Lcom/appsflyer/share/AppsFlyerConversionListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "registerConversionListener"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient(Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    return-void
.end method

.method public final registerSessionReadyListener(Lcom/appsflyer/share/SessionReadyListener;)V
    .locals 3
    .param p1    # Lcom/appsflyer/share/SessionReadyListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const-string v1, "listener"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "registerSessionReadyListener"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFj1wSDK;->d(Lcom/appsflyer/share/SessionReadyListener;)V

    return-void
.end method

.method public final sendInAppPurchaseData(Landroid/content/Context;Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;)V
    .locals 2
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

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p1, :cond_0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    :cond_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->v()Lcom/appsflyer/PurchaseHandler;

    move-result-object p1

    const-string v0, "purchases"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, p3, v0}, Lcom/appsflyer/PurchaseHandler;->registerClient(Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFe1gSDK;

    iget-object v1, p1, Lcom/appsflyer/PurchaseHandler;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-direct {v0, p2, p3, v1}, Lcom/appsflyer/internal/AFe1gSDK;-><init>(Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;Lcom/appsflyer/internal/AFc1bSDK;)V

    iget-object p1, p1, Lcom/appsflyer/PurchaseHandler;->unregisterClient:Lcom/appsflyer/internal/AFe1wSDK;

    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    :cond_1
    return-void
.end method

.method public final sendPurchaseData(Landroid/content/Context;Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;)V
    .locals 2
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

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p1, :cond_0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    :cond_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->v()Lcom/appsflyer/PurchaseHandler;

    move-result-object p1

    const-string v0, "subscriptions"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, p3, v0}, Lcom/appsflyer/PurchaseHandler;->registerClient(Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFe1tSDK;

    iget-object v1, p1, Lcom/appsflyer/PurchaseHandler;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-direct {v0, p2, p3, v1}, Lcom/appsflyer/internal/AFe1tSDK;-><init>(Ljava/util/Map;Lcom/appsflyer/PurchaseHandler$PurchaseValidationCallback;Lcom/appsflyer/internal/AFc1bSDK;)V

    iget-object p1, p1, Lcom/appsflyer/PurchaseHandler;->unregisterClient:Lcom/appsflyer/internal/AFe1wSDK;

    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    :cond_1
    return-void
.end method

.method public final sendPushNotificationData(Landroid/app/Activity;)V
    .locals 18

    move-object/from16 v1, p0

    .line 1
    const-string v0, "c"

    const-string v2, "pid"

    const-string v3, "sendPushNotificationData"

    if-eqz p1, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 2
    iget-object v4, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 3
    invoke-interface {v4}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "activity_intent_"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v3, v5}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 4
    iget-object v4, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 5
    invoke-interface {v4}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "activity_intent_null"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v3, v5}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v4, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 7
    invoke-interface {v4}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v4

    const-string v5, "activity_null"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v3, v5}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 8
    :goto_0
    iget-object v3, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 9
    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v3

    .line 10
    invoke-static/range {p1 .. p1}, Lcom/appsflyer/internal/AFa1tSDK;->registerClient(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v4

    .line 11
    iput-object v4, v3, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    if-eqz v4, :cond_8

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 13
    iget-object v6, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    const-string v7, ")"

    if-nez v6, :cond_2

    .line 14
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v6, "Initializing push notification history cache"

    invoke-virtual {v0, v2, v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 15
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    move-wide v10, v4

    move-wide/from16 v16, v10

    goto/16 :goto_3

    .line 16
    :cond_2
    :try_start_0
    iget-object v6, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 17
    invoke-interface {v6}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v6

    const-string v8, "AF_PUSH_PAYLOAD_MAX_AGING_MILLIS"

    const-wide/32 v9, 0x1b7740

    invoke-virtual {v6, v8, v9, v10}, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient(Ljava/lang/String;J)J

    move-result-wide v8

    .line 18
    iget-object v6, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-wide v10, v4

    :goto_1
    :try_start_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    .line 19
    new-instance v13, Lorg/json/JSONObject;

    .line 20
    iget-object v14, v3, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    .line 21
    invoke-direct {v13, v14}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 22
    new-instance v14, Lorg/json/JSONObject;

    iget-object v15, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    invoke-interface {v15, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-direct {v14, v15}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v13, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-wide/from16 v16, v4

    :try_start_2
    invoke-virtual {v14, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v15, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 24
    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 25
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Push notification already processed: duplicate PID and campaign detected (old: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", new: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 26
    iput-object v0, v3, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    return-void

    :catchall_0
    move-exception v0

    goto :goto_2

    .line 27
    :cond_3
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    sub-long v4, v16, v4

    cmp-long v4, v4, v8

    if-lez v4, :cond_4

    .line 28
    iget-object v4, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    invoke-interface {v4, v12}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    :cond_4
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    cmp-long v4, v4, v10

    if-gtz v4, :cond_5

    .line 30
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    move-result-wide v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    move-wide/from16 v4, v16

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    move-wide/from16 v16, v4

    goto :goto_2

    :cond_6
    move-wide/from16 v16, v4

    goto :goto_3

    :catchall_2
    move-exception v0

    move-wide/from16 v16, v4

    move-wide/from16 v10, v16

    .line 31
    :goto_2
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error while handling push notification measurement: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    :goto_3
    iget-object v0, v1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 33
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    const-string v2, "AF_PUSH_PAYLOAD_HISTORY_SIZE"

    const-wide/16 v4, 0x2

    invoke-virtual {v0, v2, v4, v5}, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient(Ljava/lang/String;J)J

    move-result-wide v4

    .line 34
    iget-object v0, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    int-to-long v8, v0

    cmp-long v0, v8, v4

    if-nez v0, :cond_7

    .line 35
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Push history limit reached, removing oldest entry (timestamp: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 36
    iget-object v0, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    :cond_7
    iget-object v0, v1, Lcom/appsflyer/internal/AFa1tSDK;->w:Ljava/util/Map;

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 38
    iget-object v3, v3, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    .line 39
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    invoke-virtual {v1}, Lcom/appsflyer/AppsFlyerLib;->start()V

    :cond_8
    return-void
.end method

.method public final sendPushNotificationData(Lcom/appsflyer/share/AFPushData;)V
    .locals 4
    .param p1    # Lcom/appsflyer/share/AFPushData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 41
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 42
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    .line 43
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    .line 44
    const-string v1, "sendPushNotificationData"

    if-nez v0, :cond_0

    .line 45
    invoke-static {v1}, Lcom/appsflyer/internal/AFa1tSDK;->d(Ljava/lang/String;)V

    return-void

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 47
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const-string v2, "push_data:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    .line 48
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ATTRIBUTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Received campaign details from push"

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 50
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFa1lSDK;->registerClient()V

    .line 51
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 52
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    invoke-virtual {p1}, Lcom/appsflyer/share/AFPushData;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 53
    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->unregisterClient:Ljava/lang/String;

    .line 54
    new-instance p1, Lcom/appsflyer/internal/AFh1fSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFh1fSDK;-><init>()V

    .line 55
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->unregisterClient()Lcom/appsflyer/internal/AFh1pSDK;

    move-result-object p1

    .line 56
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 57
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    return-void
.end method

.method public final setAdditionalData(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "setAdditionalData"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object p1

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/appsflyer/internal/AFc1eSDK;->getSdkVersion:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final setAndroidIdData(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const-string v1, "setAndroidIdData"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->force:Ljava/lang/String;

    return-void
.end method

.method public final setAppId(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const-string v1, "setAppId"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->values:Ljava/lang/String;

    return-void
.end method

.method public final setAppInviteOneLink(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const-string v1, "setAppInviteOneLink"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_SETTERS:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "setAppInviteOneLink = "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->AppsFlyerLib:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v0

    const-string v1, "onelinkDomain"

    invoke-interface {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->remove(Ljava/lang/String;)V

    const-string v1, "onelinkVersion"

    invoke-interface {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->remove(Ljava/lang/String;)V

    const-string v1, "onelinkScheme"

    invoke-interface {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->remove(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->AppsFlyerLib:Ljava/lang/String;

    return-void
.end method

.method public final setCollectAndroidID(Z)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "setCollectAndroidID"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-boolean p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->afWarnLog:Z

    return-void
.end method

.method public final setConsentData(Lcom/appsflyer/share/AppsFlyerConsent;)V
    .locals 1
    .param p1    # Lcom/appsflyer/share/AppsFlyerConsent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->setImeiData:Lcom/appsflyer/share/AppsFlyerConsent;

    return-void
.end method

.method public final setCurrencyCode(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const-string v1, "setCurrencyCode"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->stop:Ljava/lang/String;

    return-void
.end method

.method public final setCustomerUserId(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const-string v1, "setCustomerUserId"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "setCustomerUserId = "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->valueOf:Ljava/lang/String;

    return-void
.end method

.method public final setDebugLog(Z)V
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/appsflyer/AFLogger$LogLevel;->DEBUG:Lcom/appsflyer/AFLogger$LogLevel;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/appsflyer/AFLogger$LogLevel;->NONE:Lcom/appsflyer/AFLogger$LogLevel;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/appsflyer/AppsFlyerLib;->setLogLevel(Lcom/appsflyer/AFLogger$LogLevel;)V

    return-void
.end method

.method public final setDeepLinkTimeout(J)V
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "Invalid timeout value. Using default value of 3000 milliseconds"

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    const-wide/16 p1, 0xbb8

    :cond_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Setting DeepLink timeout to  "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " milliseconds"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v0

    iput-wide p1, v0, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    return-void
.end method

.method public final setDisableAdvertisingIdentifiers(Z)V
    .locals 4

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_SETTERS:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "setDisableAdvertisingIdentifiers: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    xor-int/lit8 v0, p1, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFb1iSDK;->unregisterClient:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v1

    iput-boolean p1, v1, Lcom/appsflyer/internal/AFc1eSDK;->setAndroidIdData:Z

    if-eqz p1, :cond_0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object p1

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/appsflyer/internal/AFc1eSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFh1qSDK;

    return-void

    :cond_0
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object p1

    new-instance v0, Lcom/appsflyer/internal/AFe1iSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFe1iSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    return-void
.end method

.method public final setDisableNetworkData(Z)V
    .locals 4

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_SETTERS:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "setDisableNetworkData: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-boolean p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->afErrorLog:Z

    return-void
.end method

.method public final setHost(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string p1, ""

    :goto_0
    new-instance v0, Lcom/appsflyer/internal/AFd1gSDK;

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lcom/appsflyer/internal/AFd1gSDK;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/appsflyer/internal/AFd1jSDK;->AFLogger(Lcom/appsflyer/internal/AFd1gSDK;)V

    return-void

    :cond_2
    :goto_1
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->HTTP_CLIENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "setHost call ignored: hostname parameter is empty or null"

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void
.end method

.method public final setImeiData(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const-string v1, "setImeiData"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->AFLoggerLogLevel:Ljava/lang/String;

    return-void
.end method

.method public final setInstallId(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "setInstallId"

    invoke-interface {v0, v3, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setUserFirstName:Z

    if-nez v0, :cond_0

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "AppsFlyerLib.init() method should be called first"

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    const-string v2, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID"

    invoke-virtual {v0, v2}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    :cond_1
    if-nez v1, :cond_2

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first"

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_2
    if-nez p1, :cond_3

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "AppsFlyer installId can\'t be null"

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/appsflyer/internal/AFb1jSDK;->d(Ljava/lang/String;Lcom/appsflyer/internal/AFc1kSDK;)V

    return-void
.end method

.method public final setIsUpdate(Z)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "setIsUpdate"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-boolean p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->getEntries:Z

    return-void
.end method

.method public final setLogLevel(Lcom/appsflyer/AFLogger$LogLevel;)V
    .locals 4
    .param p1    # Lcom/appsflyer/AFLogger$LogLevel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/appsflyer/AFLogger$LogLevel;->getLevel()I

    move-result v0

    sget-object v1, Lcom/appsflyer/AFLogger$LogLevel;->NONE:Lcom/appsflyer/AFLogger$LogLevel;

    invoke-virtual {v1}, Lcom/appsflyer/AFLogger$LogLevel;->getLevel()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "log"

    invoke-interface {v1, v3, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v1

    const-string v2, ""

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v1, Lcom/appsflyer/internal/AFc1eSDK;->enableTCFDataCollection:Lcom/appsflyer/AFLogger$LogLevel;

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFh1wSDK;->AFKeystoreWrapper()V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;

    move-result-object p1

    invoke-interface {p1}, Lcom/appsflyer/internal/AFh1wSDK;->e()V

    return-void
.end method

.method public final setMinTimeBetweenSessions(I)V
    .locals 4

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->setDebugLog:J

    return-void
.end method

.method public final setOaidData(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const-string v1, "setOaidData"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object p1, Lcom/appsflyer/internal/AFb1iSDK;->AFLogger:Ljava/lang/String;

    return-void
.end method

.method public final varargs setOneLinkCustomDomain([Ljava/lang/String;)V
    .locals 5

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "setOneLinkCustomDomain %s"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFa1qSDK;->force:[Ljava/lang/String;

    return-void
.end method

.method public final setOutOfStore(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->getLevel:Ljava/lang/String;

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_SETTERS:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Store API set with value: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "Cannot set setOutOfStore with null"

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void
.end method

.method public final setPartnerData(Ljava/lang/String;Ljava/util/Map;)V
    .locals 5
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

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iget-object v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->v:Lcom/appsflyer/internal/AFb1qSDK;

    if-nez v1, :cond_0

    new-instance v1, Lcom/appsflyer/internal/AFb1qSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFb1qSDK;-><init>()V

    iput-object v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->v:Lcom/appsflyer/internal/AFb1qSDK;

    :cond_0
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->v:Lcom/appsflyer/internal/AFb1qSDK;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_2

    :cond_1
    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PUBLIC_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Setting partner data for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x3e8

    if-le v3, v4, :cond_3

    const-string p2, "Partner data 1000 characters limit exceeded"

    invoke-virtual {v1, v2, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v1, "limit exceeded: "

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "error"

    invoke-interface {p2, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/appsflyer/internal/AFb1qSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    iget-object v1, v0, Lcom/appsflyer/internal/AFb1qSDK;->d:Ljava/util/Map;

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, v0, Lcom/appsflyer/internal/AFb1qSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    :goto_0
    sget-object p2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PUBLIC_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    iget-object v0, v0, Lcom/appsflyer/internal/AFb1qSDK;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5

    const-string p1, "Partner data is missing or null"

    goto :goto_1

    :cond_5
    const-string v0, "Cleared partner data for "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-virtual {p2, v1, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_6
    :goto_2
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->PUBLIC_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "Partner ID is missing or null"

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void
.end method

.method public final setPluginInfo(Lcom/appsflyer/share/platform_extension/PluginInfo;)V
    .locals 1
    .param p1    # Lcom/appsflyer/share/platform_extension/PluginInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->onPause()Lcom/appsflyer/internal/AFj1cSDK;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFj1cSDK;->registerClient(Lcom/appsflyer/share/platform_extension/PluginInfo;)V

    return-void
.end method

.method public final setPreinstallAttribution(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "setPreinstallAttribution API called"

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "pid"

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz p2, :cond_1

    const-string p1, "c"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    if-eqz p3, :cond_3

    const-string p1, "af_siteid"

    invoke-virtual {v0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_1
    sget-object p2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p3, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    const-string v2, "Failed to serialize preinstall attribution parameters"

    :goto_2
    invoke-virtual {p2, p3, v2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object p1

    const-string p2, "preInstallName"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string p3, "Preinstall attribution rejected: media source parameter is required"

    invoke-virtual {p1, p2, p3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void
.end method

.method public final varargs setResolveDeepLinkURLs([Ljava/lang/String;)V
    .locals 5

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "setResolveDeepLinkURLs %s"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v0

    iget-object v1, v0, Lcom/appsflyer/internal/AFa1qSDK;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v0, v0, Lcom/appsflyer/internal/AFa1qSDK;->w:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final varargs setSharingFilterForPartners([Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/AFb1rSDK;

    invoke-direct {v1, p1}, Lcom/appsflyer/internal/AFb1rSDK;-><init>([Ljava/lang/String;)V

    iput-object v1, v0, Lcom/appsflyer/internal/AFc1eSDK;->w:Lcom/appsflyer/internal/AFb1rSDK;

    return-void
.end method

.method public final setUserEmail(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "setUserEmail called with null email"

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "setUserEmail"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/appsflyer/internal/AFj1jSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    invoke-static {p1}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->AFLogger:Ljava/lang/String;

    return-void
.end method

.method public final setUserFbLoginId(J)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "setUserFbLoginId"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->i:Ljava/lang/Long;

    return-void
.end method

.method public final setUserFirstName(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "setUserFirstName called with null firstName"

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "setUserFirstName"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/appsflyer/internal/AFj1jSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    invoke-static {p1}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->AFKeystoreWrapper:Ljava/lang/String;

    return-void
.end method

.method public final setUserLastName(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "setUserLastName called with null lastName"

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "setUserLastName"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/appsflyer/internal/AFj1jSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    invoke-static {p1}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/appsflyer/internal/AFc1eSDK;->e:Ljava/lang/String;

    return-void
.end method

.method public final setUserPhone(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "setUserPhone"

    invoke-interface {v0, v3, v2}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v0, v2, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/internal/AFj1jSDK;->INSTANCE:Lcom/appsflyer/internal/AFj1jSDK;

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFj1jSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [C

    const/16 v3, 0x30

    aput-char v3, v2, v1

    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->s1(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFj1jSDK;->unregisterClient(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object p2

    invoke-static {v0}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/appsflyer/internal/AFc1eSDK;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lcom/appsflyer/internal/AFc1eSDK;->registerClient:Ljava/lang/String;

    return-void

    :cond_1
    :goto_0
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "setUserPhone called with null argument"

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void
.end method

.method public final start()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V

    return-void
.end method

.method public final start(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient(Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;)V

    return-void
.end method

.method public final stop(ZLandroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p2, :cond_0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    :cond_0
    iget-object p2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger(Z)V

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/n;

    invoke-direct {v1, p2}, Lcom/appsflyer/internal/n;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    if-eqz p1, :cond_1

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object p1

    const-string p2, "is_stop_tracking_used"

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method

.method public final subscribeForDeepLink(Lcom/appsflyer/share/deeplink/DeepLinkListener;)V
    .locals 1
    .param p1    # Lcom/appsflyer/share/deeplink/DeepLinkListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v0

    iput-object p1, v0, Lcom/appsflyer/internal/AFa1qSDK;->unregisterClient:Lcom/appsflyer/share/deeplink/DeepLinkListener;

    return-void
.end method

.method public final unregisterConversionListener()V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "unregisterConversionListener"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient(Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    return-void
.end method

.method public final unregisterSessionReadyListener()V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "unregisterSessionReadyListener"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFd1uSDK;->d(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFj1wSDK;->d(Lcom/appsflyer/share/SessionReadyListener;)V

    return-void
.end method

.method public final updateServerUninstallToken(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p1, :cond_0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    :cond_0
    new-instance p1, Lcom/appsflyer/internal/AFg1vSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFg1vSDK;-><init>()V

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->UNINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Firebase Refreshed Token = "

    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFg1vSDK;->d()Lcom/appsflyer/internal/AFg1sSDK;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, v0, Lcom/appsflyer/internal/AFg1sSDK;->AFKeystoreWrapper:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    if-eqz v0, :cond_4

    iget-wide v3, v0, Lcom/appsflyer/internal/AFg1sSDK;->unregisterClient:J

    sub-long v3, v1, v3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x2

    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-lez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v0, 0x1

    :goto_1
    new-instance v3, Lcom/appsflyer/internal/AFg1sSDK;

    xor-int/lit8 v4, v0, 0x1

    invoke-direct {v3, p2, v1, v2, v4}, Lcom/appsflyer/internal/AFg1sSDK;-><init>(Ljava/lang/String;JZ)V

    iget-object v1, p1, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v2, "afUninstallToken"

    iget-object v4, v3, Lcom/appsflyer/internal/AFg1sSDK;->AFKeystoreWrapper:Ljava/lang/String;

    invoke-interface {v1, v2, v4}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v2, "afUninstallToken_received_time"

    iget-wide v4, v3, Lcom/appsflyer/internal/AFg1sSDK;->unregisterClient:J

    invoke-interface {v1, v2, v4, v5}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    iget-object p1, p1, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "afUninstallToken_queued"

    iget-boolean v2, v3, Lcom/appsflyer/internal/AFg1sSDK;->AFLogger:Z

    invoke-interface {p1, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;Z)V

    if-eqz v0, :cond_5

    sget-object p1, Lcom/appsflyer/internal/AFa1tSDK;->d:Lcom/appsflyer/internal/AFa1tSDK;

    iget-object p1, p1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    new-instance v0, Lcom/appsflyer/internal/AFf1qSDK;

    invoke-direct {v0, p2, p1}, Lcom/appsflyer/internal/AFf1qSDK;-><init>(Ljava/lang/String;Lcom/appsflyer/internal/AFc1bSDK;)V

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    :cond_5
    return-void

    :cond_6
    :goto_2
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->UNINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "Firebase Token is either empty or null and was not registered."

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void
.end method

.method public final validateAndLogInAppPurchase(Lcom/appsflyer/share/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;)V
    .locals 3
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

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/AFe1eSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-direct {v1, v2, p1, p2, p3}, Lcom/appsflyer/internal/AFe1eSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/share/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;)V

    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    return-void
.end method
