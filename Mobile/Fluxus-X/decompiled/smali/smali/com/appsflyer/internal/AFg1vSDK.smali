.class public final Lcom/appsflyer/internal/AFg1vSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

.field public final registerClient:Lcom/appsflyer/internal/AFc1kSDK;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFg1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

    return-void
.end method

.method public static registerClient(Landroid/content/Context;)Z
    .locals 5

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/AppsFlyerLib;->isStopped()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/firebase/messaging/FirebaseMessagingService;->ACTION_DIRECT_BOOT_REMOTE_INTENT:Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.google.firebase.MESSAGING_EVENT"

    const-class v3, Lcom/appsflyer/share/FirebaseMessagingServiceListener;

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4, p0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->UNINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "An error occurred while trying to verify manifest declarations: "

    invoke-virtual {v0, v2, v3, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    :catch_0
    :cond_1
    return v1
.end method


# virtual methods
.method public final d()Lcom/appsflyer/internal/AFg1sSDK;
    .locals 10

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "afUninstallToken"

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v3, "afUninstallToken_received_time"

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Lcom/appsflyer/internal/AFc1kSDK;->unregisterClient(Ljava/lang/String;J)J

    move-result-wide v2

    iget-object v6, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v7, "afUninstallToken_queued"

    invoke-interface {v6, v7}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    move-result v6

    iget-object v8, p0, Lcom/appsflyer/internal/AFg1vSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    const/4 v9, 0x0

    invoke-interface {v8, v7, v9}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;Z)V

    const-string v7, ","

    if-nez v0, :cond_0

    iget-object v8, p0, Lcom/appsflyer/internal/AFg1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

    invoke-interface {v8, v1}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-virtual {v8, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v8, v0

    add-int/lit8 v8, v8, -0x1

    aget-object v0, v0, v8

    :cond_0
    cmp-long v4, v2, v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/appsflyer/internal/AFg1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

    invoke-interface {v4, v1}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v4, v1

    const/4 v5, 0x2

    if-lt v4, v5, :cond_1

    :try_start_0
    array-length v4, v1

    sub-int/2addr v4, v5

    aget-object v1, v1, v4

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    if-eqz v0, :cond_2

    new-instance v1, Lcom/appsflyer/internal/AFg1sSDK;

    invoke-direct {v1, v0, v2, v3, v6}, Lcom/appsflyer/internal/AFg1sSDK;-><init>(Ljava/lang/String;JZ)V

    return-object v1

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
