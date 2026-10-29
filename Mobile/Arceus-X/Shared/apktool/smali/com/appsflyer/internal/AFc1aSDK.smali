.class public final Lcom/appsflyer/internal/AFc1aSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFc1bSDK;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFc1aSDK$AFa1tSDK;
    }
.end annotation


# static fields
.field private static final registerClient:I


# instance fields
.field private AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;

.field private AFLogger:Ljava/util/concurrent/ExecutorService;

.field private AFLoggerLogLevel:Lcom/appsflyer/internal/AFh1xSDK;

.field private AppsFlyerLib:Lcom/appsflyer/internal/AFi1hSDK;

.field private afDebugLog:Lcom/appsflyer/internal/AFg1rSDK;

.field private afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

.field private afInfoLog:Landroid/content/SharedPreferences;

.field private afWarnLog:Lcom/appsflyer/internal/AFf1aSDK;

.field private clearUserPii:Lcom/appsflyer/internal/AFf1eSDK;

.field public final d:Lcom/appsflyer/internal/AFd1zSDK;

.field private e:Lcom/appsflyer/internal/AFd1xSDK;

.field private enableTCFDataCollection:Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

.field private force:Lcom/appsflyer/PurchaseHandler;

.field private getEntries:Lcom/appsflyer/internal/AFi1aSDK;

.field private getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

.field private getLevel:Lcom/appsflyer/internal/AFe1wSDK;

.field private getOutOfStore:Lcom/appsflyer/internal/AFh1sSDK;

.field private getSdkVersion:Lcom/appsflyer/internal/AFf1fSDK;

.field private i:Lcom/appsflyer/internal/AFc1gSDK;

.field private onPause:Lcom/appsflyer/internal/AFc1vSDK;

.field private sendPushNotificationData:Lcom/appsflyer/internal/AFf1bSDK;

.field private setAdditionalData:Lcom/appsflyer/internal/AFd1eSDK;

.field private setAndroidIdData:Lcom/appsflyer/internal/AFd1jSDK;

.field private setAppInviteOneLink:Lcom/appsflyer/internal/AFi1oSDK;

.field private setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

.field private setCustomerUserId:Lcom/appsflyer/internal/AFg1qSDK;

.field private setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

.field private setImeiData:Lcom/appsflyer/internal/AFj1mSDK;

.field private setOaidData:Lcom/appsflyer/internal/AFg1wSDK;

.field private volatile setOneLinkCustomDomain:Lcom/appsflyer/share/AppsFlyerConversionListener;

.field private setOutOfStore:Lcom/appsflyer/internal/AFh1wSDK;

.field private setResolveDeepLinkURLs:Lcom/appsflyer/internal/AFj1wSDK;

.field private setUserEmail:Lcom/appsflyer/internal/AFa1qSDK;

.field private setUserFbLoginId:Lcom/appsflyer/internal/AFa1lSDK;

.field private setUserFirstName:Lcom/appsflyer/internal/AFa1aSDK;

.field private setUserLastName:Lcom/appsflyer/internal/AFi1tSDK;

.field private setUserPhone:Lcom/appsflyer/internal/AFb1bSDK;

.field private stop:Lcom/appsflyer/exception_manager/ExceptionManager;

.field private unregisterClient:Ljava/util/concurrent/ExecutorService;

.field private updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

.field private v:Lcom/appsflyer/internal/AFf1hSDK;

.field private valueOf:Lcom/appsflyer/internal/AFj1ySDK;

.field private values:Lcom/appsflyer/internal/AFd1uSDK;

.field private w:Lcom/appsflyer/internal/AFc1iSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lcom/appsflyer/internal/AFc1aSDK;->registerClient:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/appsflyer/internal/AFd1zSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1zSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOneLinkCustomDomain:Lcom/appsflyer/share/AppsFlyerConversionListener;

    return-void
.end method

.method private static synthetic AFKeystoreWrapper(Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    .line 5
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->EXCEPTION_MANAGER:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v0, v1, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static synthetic AFLogger(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 6

    .line 10
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 11
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v2, "Could not create executor for queue"

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 12
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFc1aSDK;)Landroid/content/SharedPreferences;
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->t_()Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V

    return-void
.end method

.method public static synthetic c(Lcom/appsflyer/internal/AFc1aSDK;)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->setAdditionalData()Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized clearUserPii()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->AFKeystoreWrapper()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;
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

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/appsflyer/internal/AFc1aSDK;->setResolveDeepLinkURLs()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized getOutOfStore()Lcom/appsflyer/internal/AFd1xSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->e:Lcom/appsflyer/internal/AFd1xSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFd1xSDK;

    new-instance v1, Lcom/appsflyer/internal/AFd1mSDK;

    sget v2, Lcom/appsflyer/internal/AFc1aSDK;->registerClient:I

    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFd1mSDK;-><init>(I)V

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFd1xSDK;-><init>(Lcom/appsflyer/internal/AFd1mSDK;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->e:Lcom/appsflyer/internal/AFd1xSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->e:Lcom/appsflyer/internal/AFd1xSDK;
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

.method private s_(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->afInfoLog:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "appsflyer-data"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1aSDK;->afInfoLog:Landroid/content/SharedPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    throw p1

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFc1aSDK;->afInfoLog:Landroid/content/SharedPreferences;

    return-object p1
.end method

.method private declared-synchronized sendPushNotificationData()Lcom/appsflyer/internal/AFj1mSDK;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setImeiData:Lcom/appsflyer/internal/AFj1mSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFj1mSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFj1mSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setImeiData:Lcom/appsflyer/internal/AFj1mSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setImeiData:Lcom/appsflyer/internal/AFj1mSDK;
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

.method private setAdditionalData()Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
    .locals 1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFf1hSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/appsflyer/internal/AFh1aSDK;->registerClient:Lcom/appsflyer/internal/AFh1gSDK;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/appsflyer/internal/AFh1gSDK;->d:Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private declared-synchronized setCollectAndroidID()Lcom/appsflyer/internal/AFf1bSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->sendPushNotificationData:Lcom/appsflyer/internal/AFf1bSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFf1bSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFf1bSDK;-><init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1iSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->sendPushNotificationData:Lcom/appsflyer/internal/AFf1bSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->sendPushNotificationData:Lcom/appsflyer/internal/AFf1bSDK;
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

.method private declared-synchronized setOutOfStore()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->AFLogger()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledExecutorService;
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

.method private static synthetic setResolveDeepLinkURLs()Ljava/lang/String;
    .locals 4

    sget-object v0, Lcom/appsflyer/internal/AFj1mSDK;->e:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v2

    invoke-virtual {v2}, Lcom/appsflyer/AppsFlyerLib;->getHostPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v3

    invoke-virtual {v3}, Lcom/appsflyer/AppsFlyerLib;->getHostName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized setUserFbLoginId()Ljava/util/concurrent/ExecutorService;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger:Ljava/util/concurrent/ExecutorService;
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

.method private synthetic t_()Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFc1aSDK;->s_(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Context must be set via setContext method before calling this dependency."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->i:Lcom/appsflyer/internal/AFc1gSDK;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFc1dSDK;

    new-instance v1, Lcom/appsflyer/internal/r;

    invoke-direct {v1, p0}, Lcom/appsflyer/internal/r;-><init>(Lcom/appsflyer/internal/AFc1aSDK;)V

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFc1dSDK;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 3
    new-instance v1, Lcom/appsflyer/internal/AFc1gSDK;

    invoke-direct {v1, v0}, Lcom/appsflyer/internal/AFc1gSDK;-><init>(Lcom/appsflyer/internal/AFc1dSDK;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->i:Lcom/appsflyer/internal/AFc1gSDK;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->i:Lcom/appsflyer/internal/AFc1gSDK;

    return-object v0
.end method

.method public final declared-synchronized AFLogger()Lcom/appsflyer/internal/AFc1iSDK;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->w:Lcom/appsflyer/internal/AFc1iSDK;

    if-nez v0, :cond_1

    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFc1iSDK;

    .line 3
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v1

    .line 4
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v2

    .line 5
    iget-object v3, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    if-nez v3, :cond_0

    .line 6
    new-instance v3, Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v3}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    iput-object v3, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 7
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/appsflyer/internal/AFc1iSDK;-><init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1eSDK;Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->w:Lcom/appsflyer/internal/AFc1iSDK;

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->w:Lcom/appsflyer/internal/AFc1iSDK;
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

.method public final declared-synchronized AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->values:Lcom/appsflyer/internal/AFd1uSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFd1wSDK;

    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFd1wSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->values:Lcom/appsflyer/internal/AFd1uSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->values:Lcom/appsflyer/internal/AFd1uSDK;
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

.method public final declared-synchronized AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getSdkVersion:Lcom/appsflyer/internal/AFf1fSDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v1

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    if-nez v2, :cond_0

    new-instance v2, Lcom/appsflyer/internal/AFj1hSDK;

    invoke-direct {v2}, Lcom/appsflyer/internal/AFj1hSDK;-><init>()V

    iput-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFf1fSDK;-><init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getSdkVersion:Lcom/appsflyer/internal/AFf1fSDK;

    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getSdkVersion:Lcom/appsflyer/internal/AFf1fSDK;
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

.method public final declared-synchronized afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getEntries:Lcom/appsflyer/internal/AFi1aSDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFi1aSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFi1hSDK;

    if-nez v1, :cond_0

    new-instance v1, Lcom/appsflyer/internal/AFi1eSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFi1eSDK;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFi1hSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFi1hSDK;

    invoke-direct {v0, p0, v1}, Lcom/appsflyer/internal/AFi1aSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFi1hSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getEntries:Lcom/appsflyer/internal/AFi1aSDK;

    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getEntries:Lcom/appsflyer/internal/AFi1aSDK;
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

.method public final afErrorLog()Lcom/appsflyer/sdk_base/logger/LoggerDelegate;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->enableTCFDataCollection:Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    invoke-direct {v0, v1}, Lcom/appsflyer/sdk_base/logger/LoggerDelegate;-><init>(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->enableTCFDataCollection:Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->enableTCFDataCollection:Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    return-object v0
.end method

.method public final afInfoLog()Lcom/appsflyer/internal/AFj1ySDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Lcom/appsflyer/internal/AFj1ySDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFj1vSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->setUserFbLoginId()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFj1vSDK;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Lcom/appsflyer/internal/AFj1ySDK;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Context must be set via setContext method before calling this dependency."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Lcom/appsflyer/internal/AFj1ySDK;

    return-object v0
.end method

.method public final declared-synchronized afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getLevel:Lcom/appsflyer/internal/AFe1wSDK;

    if-nez v0, :cond_0

    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Lcom/appsflyer/internal/AFc1aSDK$5;

    invoke-direct {v7}, Lcom/appsflyer/internal/AFc1aSDK$5;-><init>()V

    new-instance v8, Lcom/appsflyer/internal/AFc1aSDK$AFa1tSDK;

    invoke-direct {v8}, Lcom/appsflyer/internal/AFc1aSDK$AFa1tSDK;-><init>()V

    const/4 v2, 0x2

    const/4 v3, 0x6

    const-wide/16 v4, 0x3c

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    new-instance v0, Lcom/appsflyer/internal/u;

    invoke-direct {v0}, Lcom/appsflyer/internal/u;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->setRejectedExecutionHandler(Ljava/util/concurrent/RejectedExecutionHandler;)V

    new-instance v0, Lcom/appsflyer/internal/AFe1wSDK;

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFe1wSDK;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getLevel:Lcom/appsflyer/internal/AFe1wSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getLevel:Lcom/appsflyer/internal/AFe1wSDK;
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

.method public final declared-synchronized d()Ljava/util/concurrent/ExecutorService;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->unregisterClient:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->unregisterClient()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->unregisterClient:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->unregisterClient:Ljava/util/concurrent/ExecutorService;
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

.method public final declared-synchronized e()Lcom/appsflyer/internal/AFh1xSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFh1xSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFh1xSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFh1xSDK;-><init>(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1iSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFh1xSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFh1xSDK;
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

.method public final declared-synchronized enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserEmail:Lcom/appsflyer/internal/AFa1qSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFa1qSDK;

    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFa1qSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserEmail:Lcom/appsflyer/internal/AFa1qSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserEmail:Lcom/appsflyer/internal/AFa1qSDK;
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

.method public final force()Lcom/appsflyer/internal/AFg1rSDK;
    .locals 17
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/appsflyer/internal/AFc1aSDK;->afDebugLog:Lcom/appsflyer/internal/AFg1rSDK;

    if-nez v1, :cond_9

    new-instance v2, Lcom/appsflyer/internal/AFg1oSDK;

    iget-object v1, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v3, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    const-string v1, "Context must be set via setContext method before calling this dependency."

    if-eqz v3, :cond_8

    iget-object v4, v0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    if-nez v4, :cond_0

    new-instance v4, Lcom/appsflyer/internal/AFj1eSDK;

    invoke-direct {v4}, Lcom/appsflyer/internal/AFj1eSDK;-><init>()V

    iput-object v4, v0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    :cond_0
    iget-object v4, v0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    iget-object v5, v0, Lcom/appsflyer/internal/AFc1aSDK;->setOaidData:Lcom/appsflyer/internal/AFg1wSDK;

    if-nez v5, :cond_1

    new-instance v5, Lcom/appsflyer/internal/AFg1pSDK;

    invoke-direct {v5}, Lcom/appsflyer/internal/AFg1pSDK;-><init>()V

    iput-object v5, v0, Lcom/appsflyer/internal/AFc1aSDK;->setOaidData:Lcom/appsflyer/internal/AFg1wSDK;

    :cond_1
    iget-object v5, v0, Lcom/appsflyer/internal/AFc1aSDK;->setOaidData:Lcom/appsflyer/internal/AFg1wSDK;

    iget-object v6, v0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Lcom/appsflyer/internal/AFj1ySDK;

    if-nez v6, :cond_3

    new-instance v6, Lcom/appsflyer/internal/AFj1vSDK;

    iget-object v7, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v7, v7, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-eqz v7, :cond_2

    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1aSDK;->setUserFbLoginId()Ljava/util/concurrent/ExecutorService;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Lcom/appsflyer/internal/AFj1vSDK;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V

    iput-object v6, v0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Lcom/appsflyer/internal/AFj1ySDK;

    goto :goto_0

    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    :goto_0
    iget-object v6, v0, Lcom/appsflyer/internal/AFc1aSDK;->valueOf:Lcom/appsflyer/internal/AFj1ySDK;

    iget-object v7, v0, Lcom/appsflyer/internal/AFc1aSDK;->setCustomerUserId:Lcom/appsflyer/internal/AFg1qSDK;

    if-nez v7, :cond_4

    new-instance v7, Lcom/appsflyer/internal/AFg1nSDK;

    invoke-direct {v7}, Lcom/appsflyer/internal/AFg1nSDK;-><init>()V

    iput-object v7, v0, Lcom/appsflyer/internal/AFc1aSDK;->setCustomerUserId:Lcom/appsflyer/internal/AFg1qSDK;

    :cond_4
    iget-object v7, v0, Lcom/appsflyer/internal/AFc1aSDK;->setCustomerUserId:Lcom/appsflyer/internal/AFg1qSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    move-result-object v8

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v9

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v10

    iget-object v11, v0, Lcom/appsflyer/internal/AFc1aSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

    if-nez v11, :cond_6

    new-instance v11, Lcom/appsflyer/internal/AFi1vSDK;

    iget-object v12, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v12, v12, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-eqz v12, :cond_5

    invoke-direct {v11, v12}, Lcom/appsflyer/internal/AFi1vSDK;-><init>(Landroid/content/Context;)V

    iput-object v11, v0, Lcom/appsflyer/internal/AFc1aSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

    goto :goto_1

    :cond_5
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_6
    :goto_1
    iget-object v11, v0, Lcom/appsflyer/internal/AFc1aSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v12

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v13

    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID()Lcom/appsflyer/internal/AFf1bSDK;

    move-result-object v14

    iget-object v1, v0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    if-nez v1, :cond_7

    new-instance v1, Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    iput-object v1, v0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    :cond_7
    iget-object v15, v0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v16

    invoke-direct/range {v2 .. v16}, Lcom/appsflyer/internal/AFg1oSDK;-><init>(Landroid/content/Context;Lcom/appsflyer/internal/AFj1cSDK;Lcom/appsflyer/internal/AFg1wSDK;Lcom/appsflyer/internal/AFj1ySDK;Lcom/appsflyer/internal/AFg1qSDK;Lcom/appsflyer/internal/AFh1xSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1vSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFf1bSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/AppsFlyerProperties;)V

    iput-object v2, v0, Lcom/appsflyer/internal/AFc1aSDK;->afDebugLog:Lcom/appsflyer/internal/AFg1rSDK;

    goto :goto_2

    :cond_8
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_9
    :goto_2
    iget-object v1, v0, Lcom/appsflyer/internal/AFc1aSDK;->afDebugLog:Lcom/appsflyer/internal/AFg1rSDK;

    return-object v1
.end method

.method public final declared-synchronized getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;
    .locals 8

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFj1hSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFj1hSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getInstance:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    sget-object v1, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->EXCEPTION_MANAGER:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    invoke-interface {v0, v1}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->isOptionalFeaturePresent(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->stop:Lcom/appsflyer/exception_manager/ExceptionManager;

    if-nez v0, :cond_3

    new-instance v1, Lcom/appsflyer/exception_manager/SdkData;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v3, -0x62ff1f55

    const v4, 0x62ff1f57

    invoke-static {v2, v3, v4, v0}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    new-instance v3, Lcom/appsflyer/internal/v;

    invoke-direct {v3}, Lcom/appsflyer/internal/v;-><init>()V

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    invoke-static {}, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFj1eSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFj1eSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1cSDK;->unregisterClient()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Lcom/appsflyer/exception_manager/SdkData;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v1

    new-instance v1, Lcom/appsflyer/exception_manager/ExceptionManagerImpl;

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v3, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1kSDK;->p_()Landroid/content/SharedPreferences;

    move-result-object v5

    new-instance v6, Lcom/appsflyer/internal/w;

    invoke-direct {v6, p0}, Lcom/appsflyer/internal/w;-><init>(Lcom/appsflyer/internal/AFc1aSDK;)V

    new-instance v7, Lcom/appsflyer/internal/x;

    invoke-direct {v7}, Lcom/appsflyer/internal/x;-><init>()V

    invoke-direct/range {v1 .. v7}, Lcom/appsflyer/exception_manager/ExceptionManagerImpl;-><init>(Lcom/appsflyer/exception_manager/SdkData;Landroid/content/Context;Ljava/util/concurrent/ExecutorService;Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->stop:Lcom/appsflyer/exception_manager/ExceptionManager;

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Context must be set via setContext method before calling this dependency."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->stop:Lcom/appsflyer/exception_manager/ExceptionManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final getInstance()Lcom/appsflyer/internal/AFi1vSDK;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFi1vSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-eqz v1, :cond_0

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFi1vSDK;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Context must be set via setContext method before calling this dependency."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFi1vSDK;

    return-object v0
.end method

.method public final declared-synchronized getLevel()Lcom/appsflyer/internal/AFd1jSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAndroidIdData:Lcom/appsflyer/internal/AFd1jSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFd1jSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFd1jSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1kSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAndroidIdData:Lcom/appsflyer/internal/AFd1jSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAndroidIdData:Lcom/appsflyer/internal/AFd1jSDK;
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

.method public final declared-synchronized getSdkVersion()Lcom/appsflyer/internal/AFa1aSDK;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserFirstName:Lcom/appsflyer/internal/AFa1aSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFb1tSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFb1tSDK;-><init>(Lcom/appsflyer/internal/AFd1zSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserFirstName:Lcom/appsflyer/internal/AFa1aSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserFirstName:Lcom/appsflyer/internal/AFa1aSDK;
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

.method public final declared-synchronized i()Lcom/appsflyer/internal/AFf1hSDK;
    .locals 10
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->v:Lcom/appsflyer/internal/AFf1hSDK;

    if-nez v0, :cond_2

    new-instance v5, Lcom/appsflyer/internal/AFf1jSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/appsflyer/internal/AFf1jSDK;-><init>(Lcom/appsflyer/internal/AFc1kSDK;)V

    new-instance v7, Lcom/appsflyer/internal/AFf1kSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    if-nez v1, :cond_0

    new-instance v1, Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v7, v0, v5, v1}, Lcom/appsflyer/internal/AFf1kSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFc1eSDK;)V

    new-instance v1, Lcom/appsflyer/internal/AFf1hSDK;

    new-instance v2, Lcom/appsflyer/internal/AFf1nSDK;

    invoke-direct {v2}, Lcom/appsflyer/internal/AFf1nSDK;-><init>()V

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v3

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v4

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->unregisterClient()Lcom/appsflyer/internal/AFd1sSDK;

    move-result-object v6

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    if-nez v0, :cond_1

    new-instance v0, Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    :cond_1
    iget-object v8, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object v9

    invoke-direct/range {v1 .. v9}, Lcom/appsflyer/internal/AFf1hSDK;-><init>(Lcom/appsflyer/internal/AFf1nSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFf1kSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFe1wSDK;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->v:Lcom/appsflyer/internal/AFf1hSDK;

    :cond_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->v:Lcom/appsflyer/internal/AFf1hSDK;
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

.method public final onPause()Lcom/appsflyer/internal/AFj1cSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFj1eSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFj1eSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    return-object v0
.end method

.method public final declared-synchronized registerClient()Lcom/appsflyer/AppsFlyerProperties;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFa1vSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFa1vSDK;-><init>(Lcom/appsflyer/internal/AFc1kSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 3
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->afErrorLog:Lcom/appsflyer/AppsFlyerProperties;
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

.method public final registerClient(Lcom/appsflyer/share/AppsFlyerConversionListener;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOneLinkCustomDomain:Lcom/appsflyer/share/AppsFlyerConversionListener;

    return-void
.end method

.method public final setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    return-object v0
.end method

.method public final declared-synchronized setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setResolveDeepLinkURLs:Lcom/appsflyer/internal/AFj1wSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFj1xSDK;

    new-instance v1, Lcom/appsflyer/internal/AFc1dSDK;

    new-instance v2, Lcom/appsflyer/internal/s;

    invoke-direct {v2, p0}, Lcom/appsflyer/internal/s;-><init>(Lcom/appsflyer/internal/AFc1aSDK;)V

    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFc1dSDK;-><init>(Lkotlin/jvm/functions/Function0;)V

    new-instance v2, Lcom/appsflyer/internal/AFc1dSDK;

    new-instance v3, Lcom/appsflyer/internal/t;

    invoke-direct {v3, p0}, Lcom/appsflyer/internal/t;-><init>(Lcom/appsflyer/internal/AFc1aSDK;)V

    invoke-direct {v2, v3}, Lcom/appsflyer/internal/AFc1dSDK;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFj1xSDK;-><init>(Lcom/appsflyer/internal/AFc1dSDK;Lcom/appsflyer/internal/AFc1dSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setResolveDeepLinkURLs:Lcom/appsflyer/internal/AFj1wSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setResolveDeepLinkURLs:Lcom/appsflyer/internal/AFj1wSDK;
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

.method public final declared-synchronized setCustomerUserId()Lcom/appsflyer/internal/AFe1vSDK;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAdditionalData:Lcom/appsflyer/internal/AFd1eSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFd1eSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v2

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/appsflyer/internal/AFd1eSDK;-><init>(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFc1bSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAdditionalData:Lcom/appsflyer/internal/AFd1eSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAdditionalData:Lcom/appsflyer/internal/AFd1eSDK;
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

.method public final setDebugLog()Lcom/appsflyer/internal/AFh1wSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOutOfStore:Lcom/appsflyer/internal/AFh1wSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFh1tSDK;

    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFh1tSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOutOfStore:Lcom/appsflyer/internal/AFh1wSDK;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOutOfStore:Lcom/appsflyer/internal/AFh1wSDK;

    return-object v0
.end method

.method public final setImeiData()Lcom/appsflyer/internal/AFi1oSDK;
    .locals 7

    const v0, -0xd61e06d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAppInviteOneLink:Lcom/appsflyer/internal/AFi1oSDK;

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x2

    :try_start_1
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x0

    aput-object v1, v3, v2

    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->getSdkVersion:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    invoke-static {v4, v4}, Landroid/graphics/PointF;->length(FF)F

    move-result v5

    cmpl-float v4, v5, v4

    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x14

    shr-int/lit8 v5, v5, 0x6

    add-int/lit8 v5, v5, 0x25

    invoke-static {v2, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v2

    int-to-char v2, v2

    invoke-static {v4, v5, v2}, Lcom/appsflyer/internal/AFi1nSDK;->AFKeystoreWrapper(IIC)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    const-class v4, Lcom/appsflyer/internal/AFc1iSDK;

    const-class v5, Lcom/appsflyer/internal/AFd1zSDK;

    filled-new-array {v4, v5}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v4, Ljava/lang/reflect/Constructor;

    invoke-virtual {v4, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFi1oSDK;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAppInviteOneLink:Lcom/appsflyer/internal/AFi1oSDK;

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object v4, v0

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_1

    throw v1

    :cond_1
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PLAY_INTEGRITY_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v3, v0

    goto :goto_3

    :cond_2
    const-string v0, ""

    goto :goto_2

    :goto_3
    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    :cond_3
    :goto_4
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setAppInviteOneLink:Lcom/appsflyer/internal/AFi1oSDK;

    return-object v0
.end method

.method public final setOaidData()Lcom/appsflyer/internal/AFf1eSDK;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->clearUserPii:Lcom/appsflyer/internal/AFf1eSDK;

    if-nez v0, :cond_3

    new-instance v0, Lcom/appsflyer/internal/AFf1gSDK;

    new-instance v1, Lcom/appsflyer/internal/AFg1zSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    if-nez v3, :cond_0

    new-instance v3, Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v3}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    iput-object v3, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    :cond_0
    iget-object v3, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v1, v2, v3}, Lcom/appsflyer/internal/AFg1zSDK;-><init>(Landroid/content/Context;Lcom/appsflyer/internal/AFc1eSDK;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    if-nez v2, :cond_1

    new-instance v2, Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v2}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    iput-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    :cond_1
    iget-object v2, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFf1gSDK;-><init>(Lcom/appsflyer/internal/AFg1xSDK;Lcom/appsflyer/internal/AFc1eSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->clearUserPii:Lcom/appsflyer/internal/AFf1eSDK;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Context must be set via setContext method before calling this dependency."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->clearUserPii:Lcom/appsflyer/internal/AFf1eSDK;

    return-object v0
.end method

.method public final setUserEmail()Lcom/appsflyer/internal/AFb1aSDK;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/appsflyer/internal/AFc1tSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    if-nez v1, :cond_0

    new-instance v1, Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v2

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/appsflyer/internal/AFc1tSDK;-><init>(Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFf1fSDK;)V

    return-object v0
.end method

.method public final setUserFirstName()Lcom/appsflyer/share/AppsFlyerConversionListener;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setOneLinkCustomDomain:Lcom/appsflyer/share/AppsFlyerConversionListener;

    return-object v0
.end method

.method public final setUserLastName()Lcom/appsflyer/internal/AFh1sSDK;
    .locals 3

    invoke-static {}, Lcom/appsflyer/internal/AFh1rSDK;->unregisterClient()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getOutOfStore:Lcom/appsflyer/internal/AFh1sSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFh1oSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFh1oSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1aSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getOutOfStore:Lcom/appsflyer/internal/AFh1sSDK;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->getOutOfStore:Lcom/appsflyer/internal/AFh1sSDK;

    return-object v0
.end method

.method public final setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserFbLoginId:Lcom/appsflyer/internal/AFa1lSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFa1hSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFa1hSDK;-><init>(Lcom/appsflyer/internal/AFc1kSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserFbLoginId:Lcom/appsflyer/internal/AFa1lSDK;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserFbLoginId:Lcom/appsflyer/internal/AFa1lSDK;

    return-object v0
.end method

.method public final stop()Lcom/appsflyer/internal/AFi1tSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserLastName:Lcom/appsflyer/internal/AFi1tSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFi1qSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFi1qSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserLastName:Lcom/appsflyer/internal/AFi1tSDK;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserLastName:Lcom/appsflyer/internal/AFi1tSDK;

    return-object v0
.end method

.method public final unregisterClient()Lcom/appsflyer/internal/AFd1sSDK;
    .locals 7
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/appsflyer/internal/AFd1sSDK;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->getOutOfStore()Lcom/appsflyer/internal/AFd1xSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v2

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->getLevel()Lcom/appsflyer/internal/AFd1jSDK;

    move-result-object v3

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->sendPushNotificationData()Lcom/appsflyer/internal/AFj1mSDK;

    move-result-object v4

    iget-object v5, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    if-nez v5, :cond_0

    new-instance v5, Lcom/appsflyer/internal/AFj1eSDK;

    invoke-direct {v5}, Lcom/appsflyer/internal/AFj1eSDK;-><init>()V

    iput-object v5, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    :cond_0
    iget-object v5, p0, Lcom/appsflyer/internal/AFc1aSDK;->setDebugLog:Lcom/appsflyer/internal/AFj1cSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/appsflyer/internal/AFd1sSDK;-><init>(Lcom/appsflyer/internal/AFd1xSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFd1jSDK;Lcom/appsflyer/internal/AFj1mSDK;Lcom/appsflyer/internal/AFj1cSDK;Lcom/appsflyer/internal/AFf1fSDK;)V

    return-object v0
.end method

.method public final updateServerUninstallToken()Lcom/appsflyer/internal/AFb1bSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserPhone:Lcom/appsflyer/internal/AFb1bSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFb1cSDK;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->setOutOfStore()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFb1cSDK;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/appsflyer/internal/AFa1qSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserPhone:Lcom/appsflyer/internal/AFb1bSDK;

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setUserPhone:Lcom/appsflyer/internal/AFb1bSDK;

    return-object v0
.end method

.method public final declared-synchronized v()Lcom/appsflyer/PurchaseHandler;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->force:Lcom/appsflyer/PurchaseHandler;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/PurchaseHandler;

    invoke-direct {v0, p0}, Lcom/appsflyer/PurchaseHandler;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->force:Lcom/appsflyer/PurchaseHandler;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->force:Lcom/appsflyer/PurchaseHandler;
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

.method public final declared-synchronized valueOf()Lcom/appsflyer/internal/AFd1zSDK;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized values()Lcom/appsflyer/internal/AFc1vSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->onPause:Lcom/appsflyer/internal/AFc1vSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFc1uSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFc1uSDK;-><init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1kSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->onPause:Lcom/appsflyer/internal/AFc1vSDK;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->onPause:Lcom/appsflyer/internal/AFc1vSDK;
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

.method public final w()Lcom/appsflyer/internal/AFf1aSDK;
    .locals 12
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1aSDK;

    if-nez v0, :cond_1

    new-instance v1, Lcom/appsflyer/internal/AFg1tSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->getSdkVersion()Lcom/appsflyer/internal/AFa1aSDK;

    move-result-object v3

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;

    move-result-object v4

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v5

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    if-nez v0, :cond_0

    new-instance v0, Lcom/appsflyer/internal/AFc1eSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1eSDK;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    :cond_0
    iget-object v6, p0, Lcom/appsflyer/internal/AFc1aSDK;->setCollectAndroidID:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v7

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->force()Lcom/appsflyer/internal/AFg1rSDK;

    move-result-object v8

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v9

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1aSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v10

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1aSDK;->clearUserPii()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v11

    move-object v2, p0

    invoke-direct/range {v1 .. v11}, Lcom/appsflyer/internal/AFg1tSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFa1aSDK;Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFg1rSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/AppsFlyerProperties;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object v1, v2, Lcom/appsflyer/internal/AFc1aSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1aSDK;

    goto :goto_0

    :cond_1
    move-object v2, p0

    :goto_0
    iget-object v0, v2, Lcom/appsflyer/internal/AFc1aSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1aSDK;

    return-object v0
.end method
