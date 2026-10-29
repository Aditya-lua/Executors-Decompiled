.class public final Lq0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 4

    sget-object v0, Lq0/h;->a:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    sget-object v0, Lq0/h;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0

    :cond_0
    const-class v0, Lq0/h;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lq0/h;->a:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v1, :cond_1

    new-instance v1, Lq0/e;

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v1, v2}, Lq0/e;-><init>(Landroid/os/Handler;)V

    sput-object v1, Lq0/h;->a:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lq0/h;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
