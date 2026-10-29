.class final Lcom/appsflyer/internal/AFb1gSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field private AFKeystoreWrapper:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field final AFLogger:Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final d:Lcom/appsflyer/internal/AFa1qSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final registerClient:Ljava/util/concurrent/ScheduledExecutorService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile unregisterClient:Z

.field private final v:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;Lcom/appsflyer/internal/AFa1qSDK;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/appsflyer/internal/AFa1qSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFb1gSDK;->registerClient:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p2, p0, Lcom/appsflyer/internal/AFb1gSDK;->AFLogger:Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/AFb1gSDK;->d:Lcom/appsflyer/internal/AFa1qSDK;

    new-instance p1, Lcom/appsflyer/internal/o;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/o;-><init>(Lcom/appsflyer/internal/AFb1gSDK;)V

    iput-object p1, p0, Lcom/appsflyer/internal/AFb1gSDK;->v:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFb1gSDK;->j_(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFb1gSDK;)V
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFb1gSDK;->registerClient(Lcom/appsflyer/internal/AFb1gSDK;)V

    return-void
.end method

.method public static synthetic c(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFb1gSDK;->i_(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V

    return-void
.end method

.method private static final i_(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V
    .locals 10

    :try_start_0
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    iget-object p0, p0, Lcom/appsflyer/internal/AFb1gSDK;->AFLogger:Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;->m_(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    invoke-static {p0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v8, 0x78

    const/4 v9, 0x0

    const-string v2, "onActivityCreatedWithDeeplink failed with a throwable"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static final j_(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V
    .locals 10

    :try_start_0
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    iget-object p0, p0, Lcom/appsflyer/internal/AFb1gSDK;->AFLogger:Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;->n_(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    invoke-static {p0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v8, 0x78

    const/4 v9, 0x0

    const-string v2, "Listener threw an exception"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static final registerClient(Lcom/appsflyer/internal/AFb1gSDK;)V
    .locals 10

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/appsflyer/internal/AFb1gSDK;->unregisterClient:Z

    :try_start_0
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    iget-object p0, p0, Lcom/appsflyer/internal/AFb1gSDK;->AFLogger:Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;

    invoke-interface {p0}, Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;->registerClient()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {p0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v8, 0x78

    const/4 v9, 0x0

    const-string v2, "Background task failed with a throwable"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p2, ""

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/appsflyer/internal/AFb1gSDK;->unregisterClient:Z

    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    iget-object p2, p0, Lcom/appsflyer/internal/AFb1gSDK;->d:Lcom/appsflyer/internal/AFa1qSDK;

    invoke-virtual {p2, p1}, Lcom/appsflyer/internal/AFa1qSDK;->e_(Landroid/content/Intent;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/appsflyer/internal/AFb1gSDK;->registerClient:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lcom/appsflyer/internal/p;

    invoke-direct {v0, p0, p1}, Lcom/appsflyer/internal/p;-><init>(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/appsflyer/internal/AFb1gSDK;->unregisterClient:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/appsflyer/internal/AFb1gSDK;->registerClient:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v0, p0, Lcom/appsflyer/internal/AFb1gSDK;->v:Ljava/lang/Runnable;

    sget-object v1, Lcom/appsflyer/internal/AFb1bSDK;->AFa1tSDK:Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;

    invoke-static {}, Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;->unregisterClient()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFb1gSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFb1gSDK;->unregisterClient:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lcom/appsflyer/internal/AFb1gSDK;->unregisterClient:Z

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    iget-object v0, p0, Lcom/appsflyer/internal/AFb1gSDK;->registerClient:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/appsflyer/internal/q;

    invoke-direct {v1, p0, p1}, Lcom/appsflyer/internal/q;-><init>(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFb1gSDK;->AFKeystoreWrapper:Ljava/util/concurrent/ScheduledFuture;

    if-eqz p1, :cond_1

    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
