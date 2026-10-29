.class public final Lfv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lfv/i;

.field public final b:Lfv/c;

.field public volatile c:Z


# direct methods
.method public constructor <init>(Lfv/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfv/b;->b:Lfv/c;

    new-instance p1, Lfv/i;

    invoke-direct {p1}, Lfv/i;-><init>()V

    iput-object p1, p0, Lfv/b;->a:Lfv/i;

    return-void
.end method


# virtual methods
.method public a(Lfv/n;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1, p2}, Lfv/h;->a(Lfv/n;Ljava/lang/Object;)Lfv/h;

    move-result-object p1

    monitor-enter p0

    :try_start_0
    iget-object p2, p0, Lfv/b;->a:Lfv/i;

    invoke-virtual {p2, p1}, Lfv/i;->a(Lfv/h;)V

    iget-boolean p1, p0, Lfv/b;->c:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lfv/b;->c:Z

    iget-object p1, p0, Lfv/b;->b:Lfv/c;

    invoke-virtual {p1}, Lfv/c;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public run()V
    .locals 5

    :goto_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lfv/b;->a:Lfv/i;

    const/16 v2, 0x3e8

    invoke-virtual {v1, v2}, Lfv/i;->c(I)Lfv/h;

    move-result-object v1

    if-nez v1, :cond_1

    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lfv/b;->a:Lfv/i;

    invoke-virtual {v1}, Lfv/i;->b()Lfv/h;

    move-result-object v1

    if-nez v1, :cond_0

    iput-boolean v0, p0, Lfv/b;->c:Z

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-boolean v0, p0, Lfv/b;->c:Z

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :try_start_2
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1

    :catchall_1
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    goto :goto_3

    :cond_1
    :goto_2
    iget-object v2, p0, Lfv/b;->b:Lfv/c;

    invoke-virtual {v2, v1}, Lfv/c;->g(Lfv/h;)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :goto_3
    :try_start_4
    const-string v2, "Event"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " was interruppted"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iput-boolean v0, p0, Lfv/b;->c:Z

    return-void

    :goto_4
    iput-boolean v0, p0, Lfv/b;->c:Z

    throw v1
.end method
