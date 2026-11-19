.class public final Lcom/appsflyer/internal/AFj1xSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFj1wSDK;


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1dSDK;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/AFc1dSDK<",
            "Lcom/appsflyer/internal/AFa1qSDK;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AFLogger:Lcom/appsflyer/internal/AFc1dSDK;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/AFc1dSDK<",
            "Lcom/appsflyer/internal/AFc1iSDK;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile d:Lcom/appsflyer/share/SessionReadyListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final i:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final registerClient:Lcom/appsflyer/internal/AFj1zSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final unregisterClient:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFj1uSDK;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final w:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1dSDK;Lcom/appsflyer/internal/AFc1dSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFc1dSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFc1dSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFc1dSDK<",
            "Lcom/appsflyer/internal/AFc1iSDK;",
            ">;",
            "Lcom/appsflyer/internal/AFc1dSDK<",
            "Lcom/appsflyer/internal/AFa1qSDK;",
            ">;)V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->AFLogger:Lcom/appsflyer/internal/AFc1dSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFj1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1dSDK;

    new-instance p1, Lcom/appsflyer/internal/AFj1zSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFj1zSDK;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private final e()V
    .locals 11

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->d:Lcom/appsflyer/share/SessionReadyListener;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Lcom/appsflyer/share/SessionReadyListener;->onSessionReady()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object v4, v0

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v9, 0x78

    const/4 v10, 0x0

    const-string v3, "Error in onSessionReady callback"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final unregisterClient()V
    .locals 8

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appsflyer/internal/AFj1uSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFj1uSDK;->unregisterClient()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/appsflyer/internal/AFj1uSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFj1uSDK;->unregisterClient()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/appsflyer/internal/AFj1uSDK;

    if-eqz v1, :cond_7

    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFj1uSDK;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Condition not satisfied: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_5
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->d:Lcom/appsflyer/share/SessionReadyListener;

    if-nez v0, :cond_6

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "All conditions satisfied but no listener registered yet"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_6
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "All session readiness conditions satisfied, triggering callback"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1xSDK;->e()V

    :cond_7
    :goto_1
    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()Z
    .locals 4

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return v2

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_1

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/appsflyer/internal/AFj1uSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFj1uSDK;->unregisterClient()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_2

    goto :goto_1

    :cond_3
    const/4 v2, 0x1

    :goto_1
    monitor-exit v0

    return v2

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public final AFLogger()Z
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->d:Lcom/appsflyer/share/SessionReadyListener;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final R_(Landroid/content/Intent;)V
    .locals 8
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->AFLogger:Lcom/appsflyer/internal/AFc1dSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1dSDK;->AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFc1iSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v3, "appsFlyerCount"

    invoke-interface {v0, v3, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v0

    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Starting session readiness evaluation for launch counter: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    if-nez v0, :cond_0

    const-string v4, "Conversion event: no additional conditions required"

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1dSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1dSDK;->AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFa1qSDK;

    invoke-virtual {v0, p1}, Lcom/appsflyer/internal/AFa1qSDK;->e_(Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v4, "Added deeplink condition for launch event (has deeplink)"

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v4, "Deeplink condition not needed for launch event (no deeplink)"

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    :goto_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient()V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw p1
.end method

.method public final d()V
    .locals 9

    .line 9
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    .line 10
    iget-boolean v0, v0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    if-eqz v0, :cond_0

    return-void

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    monitor-enter v1

    .line 12
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    .line 13
    iget-boolean v2, v0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    if-nez v2, :cond_1

    const/4 v2, 0x1

    .line 14
    iput-boolean v2, v0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    .line 15
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v5, "Deeplink processed condition satisfied"

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    .line 16
    :cond_1
    :goto_0
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "Deeplink condition satisfied"

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 17
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 18
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    iget-object v2, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 19
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient()V

    goto :goto_1

    .line 20
    :cond_2
    const-string v4, "Evaluation not started yet, condition will be checked when evaluation begins"

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 21
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 22
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    monitor-exit v1

    return-void

    :goto_2
    monitor-exit v1

    throw v0
.end method

.method public final d(Lcom/appsflyer/share/SessionReadyListener;)V
    .locals 8
    .param p1    # Lcom/appsflyer/share/SessionReadyListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    monitor-enter v1

    .line 2
    :try_start_0
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->d:Lcom/appsflyer/share/SessionReadyListener;

    if-nez p1, :cond_0

    .line 3
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "Session ready listener unregistered"

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    .line 4
    :cond_0
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "Session ready listener registered"

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient()V

    .line 7
    :cond_1
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw p1
.end method

.method public final registerClient()V
    .locals 9

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->registerClient:Lcom/appsflyer/internal/AFj1zSDK;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/appsflyer/internal/AFj1uSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFj1uSDK;->registerClient()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1xSDK;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v5, "Session readiness evaluation finished"

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw v0
.end method
