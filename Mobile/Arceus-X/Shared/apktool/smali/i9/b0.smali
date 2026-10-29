.class public final Li9/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static e:Li9/b0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public c:Li9/v;

.field public d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li9/v;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li9/v;-><init>(Li9/b0;Li9/u;)V

    iput-object v0, p0, Li9/b0;->c:Li9/v;

    const/4 v0, 0x1

    iput v0, p0, Li9/b0;->d:I

    iput-object p2, p0, Li9/b0;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Li9/b0;->a:Landroid/content/Context;

    return-void
.end method

.method public static bridge synthetic a(Li9/b0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Li9/b0;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Li9/b0;
    .locals 4

    const-class v0, Li9/b0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Li9/b0;->e:Li9/b0;

    if-nez v1, :cond_0

    new-instance v1, Li9/b0;

    invoke-static {}, Lcb/e;->a()Lcb/b;

    new-instance v2, Lv9/b;

    const-string v3, "MessengerIpcClient"

    invoke-direct {v2, v3}, Lv9/b;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-static {v3, v2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-static {v2}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Li9/b0;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V

    sput-object v1, Li9/b0;->e:Li9/b0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Li9/b0;->e:Li9/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static bridge synthetic e(Li9/b0;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Li9/b0;->b:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method


# virtual methods
.method public final c(ILandroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    new-instance v0, Li9/x;

    invoke-virtual {p0}, Li9/b0;->f()I

    move-result v1

    invoke-direct {v0, v1, p1, p2}, Li9/x;-><init>(IILandroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Li9/b0;->g(Li9/y;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final d(ILandroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    new-instance v0, Li9/a0;

    invoke-virtual {p0}, Li9/b0;->f()I

    move-result v1

    invoke-direct {v0, v1, p1, p2}, Li9/a0;-><init>(IILandroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Li9/b0;->g(Li9/y;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized f()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Li9/b0;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Li9/b0;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized g(Li9/y;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "MessengerIpcClient"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Queueing "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MessengerIpcClient"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Li9/b0;->c:Li9/v;

    invoke-virtual {v0, p1}, Li9/v;->g(Li9/y;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Li9/v;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li9/v;-><init>(Li9/b0;Li9/u;)V

    iput-object v0, p0, Li9/b0;->c:Li9/v;

    invoke-virtual {v0, p1}, Li9/v;->g(Li9/y;)Z

    :cond_1
    iget-object p1, p1, Li9/y;->b:Lsb/k;

    invoke-virtual {p1}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
