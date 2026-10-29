.class public final Lcom/appsflyer/internal/AFj1vSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFj1ySDK;


# static fields
.field private static final e:Ljava/util/BitSet;


# instance fields
.field AFKeystoreWrapper:Z

.field final AFLogger:Ljava/lang/Runnable;

.field private final AFLoggerLogLevel:Ljava/lang/Runnable;

.field private afDebugLog:Z

.field final d:Ljava/lang/Runnable;

.field private final force:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/appsflyer/internal/AFi1dSDK;",
            "Lcom/appsflyer/internal/AFi1dSDK;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/appsflyer/internal/AFi1dSDK;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field final registerClient:Ljava/lang/Object;

.field final unregisterClient:Landroid/os/Handler;

.field private final v:Landroid/hardware/SensorManager;

.field private final w:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    sput-object v0, Lcom/appsflyer/internal/AFj1vSDK;->e:Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/SensorManager;

    .line 12
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "internal"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 14
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    invoke-direct {p0, p1, v1, p2}, Lcom/appsflyer/internal/AFj1vSDK;-><init>(Landroid/hardware/SensorManager;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method private constructor <init>(Landroid/hardware/SensorManager;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)V
    .locals 3
    .param p1    # Landroid/hardware/SensorManager;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->registerClient:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    sget-object v1, Lcom/appsflyer/internal/AFj1vSDK;->e:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->force:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/BitSet;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->i:Ljava/util/Map;

    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFj1vSDK$1;

    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFj1vSDK$1;-><init>(Lcom/appsflyer/internal/AFj1vSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->AFLogger:Ljava/lang/Runnable;

    .line 6
    new-instance v0, Lcom/appsflyer/internal/n1;

    invoke-direct {v0, p0}, Lcom/appsflyer/internal/n1;-><init>(Lcom/appsflyer/internal/AFj1vSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->d:Ljava/lang/Runnable;

    .line 7
    new-instance v0, Lcom/appsflyer/internal/AFj1vSDK$3;

    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFj1vSDK$3;-><init>(Lcom/appsflyer/internal/AFj1vSDK;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->AFLoggerLogLevel:Ljava/lang/Runnable;

    .line 8
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1vSDK;->v:Landroid/hardware/SensorManager;

    .line 9
    iput-object p2, p0, Lcom/appsflyer/internal/AFj1vSDK;->unregisterClient:Landroid/os/Handler;

    .line 10
    iput-object p3, p0, Lcom/appsflyer/internal/AFj1vSDK;->w:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFj1vSDK;)V
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1vSDK;->v()V

    return-void
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFj1vSDK;)V
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1vSDK;->w()V

    return-void
.end method

.method public static synthetic c(Lcom/appsflyer/internal/AFj1vSDK;)V
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1vSDK;->force()V

    return-void
.end method

.method private e()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->registerClient:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->force:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->afDebugLog:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->force:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/appsflyer/internal/AFi1dSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFj1vSDK;->i:Ljava/util/Map;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/appsflyer/internal/AFi1dSDK;->AFLogger(Ljava/util/Map;Z)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->i:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :cond_1
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v2, p0, Lcom/appsflyer/internal/AFj1vSDK;->i:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method private synthetic force()V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->registerClient:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->unregisterClient:Landroid/os/Handler;

    new-instance v2, Lcom/appsflyer/internal/l1;

    invoke-direct {v2, p0}, Lcom/appsflyer/internal/l1;-><init>(Lcom/appsflyer/internal/AFj1vSDK;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private i()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->registerClient:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->force:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/appsflyer/internal/AFi1dSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFj1vSDK;->i:Ljava/util/Map;

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Lcom/appsflyer/internal/AFi1dSDK;->AFLogger(Ljava/util/Map;Z)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->i:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :cond_1
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v2, p0, Lcom/appsflyer/internal/AFj1vSDK;->i:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method private synthetic v()V
    .locals 8

    const/4 v1, 0x1

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->v:Landroid/hardware/SensorManager;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/Sensor;

    invoke-virtual {v2}, Landroid/hardware/Sensor;->getType()I

    move-result v3

    if-ltz v3, :cond_0

    sget-object v4, Lcom/appsflyer/internal/AFj1vSDK;->e:Ljava/util/BitSet;

    invoke-virtual {v4, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Lcom/appsflyer/internal/AFi1dSDK;

    iget-object v4, p0, Lcom/appsflyer/internal/AFj1vSDK;->w:Ljava/util/concurrent/ExecutorService;

    invoke-direct {v3, v2, v4}, Lcom/appsflyer/internal/AFi1dSDK;-><init>(Landroid/hardware/Sensor;Ljava/util/concurrent/ExecutorService;)V

    iget-object v4, p0, Lcom/appsflyer/internal/AFj1vSDK;->force:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/appsflyer/internal/AFj1vSDK;->force:Ljava/util/Map;

    invoke-interface {v4, v3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v5, v0

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v4, p0, Lcom/appsflyer/internal/AFj1vSDK;->force:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/hardware/SensorEventListener;

    iget-object v4, p0, Lcom/appsflyer/internal/AFj1vSDK;->v:Landroid/hardware/SensorManager;

    iget-object v5, p0, Lcom/appsflyer/internal/AFj1vSDK;->unregisterClient:Landroid/os/Handler;

    invoke-virtual {v4, v3, v2, v1, v5}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_2
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v4, "Error registering sensor listeners"

    invoke-virtual/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    :cond_2
    iput-boolean v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->afDebugLog:Z

    return-void
.end method

.method private synthetic w()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->force:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->force:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appsflyer/internal/AFi1dSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFj1vSDK;->v:Landroid/hardware/SensorManager;

    invoke-virtual {v2, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFj1vSDK;->i:Ljava/util/Map;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/appsflyer/internal/AFi1dSDK;->AFLogger(Ljava/util/Map;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v4, v0

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v3, "Error unregistering sensor listeners"

    invoke-virtual/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->afDebugLog:Z

    return-void
.end method


# virtual methods
.method public final declared-synchronized AFKeystoreWrapper()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->unregisterClient:Landroid/os/Handler;

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->AFLoggerLogLevel:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final AFLogger()Ljava/util/Map;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1vSDK;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v3, "sensors"

    if-nez v2, :cond_0

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1vSDK;->i()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->unregisterClient:Landroid/os/Handler;

    new-instance v1, Lcom/appsflyer/internal/m1;

    invoke-direct {v1, p0}, Lcom/appsflyer/internal/m1;-><init>(Lcom/appsflyer/internal/AFj1vSDK;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final registerClient()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->unregisterClient:Landroid/os/Handler;

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->AFLoggerLogLevel:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->unregisterClient:Landroid/os/Handler;

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1vSDK;->AFLogger:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final unregisterClient()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1vSDK;->unregisterClient:Landroid/os/Handler;

    new-instance v1, Lcom/appsflyer/internal/l1;

    invoke-direct {v1, p0}, Lcom/appsflyer/internal/l1;-><init>(Lcom/appsflyer/internal/AFj1vSDK;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
