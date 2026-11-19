.class public abstract Lcom/google/android/gms/internal/play_billing/m1;
.super Lcom/google/android/gms/internal/play_billing/s1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/play_billing/s1<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/s1;-><init>()V

    return-void
.end method

.method public static bridge synthetic l(Lcom/google/android/gms/internal/play_billing/i2;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/m1;->t(Lcom/google/android/gms/internal/play_billing/i2;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    instance-of v0, p0, Lcom/google/android/gms/internal/play_billing/h1;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/google/android/gms/internal/play_billing/j1;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s1;->d:Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0

    :cond_1
    check-cast p0, Lcom/google/android/gms/internal/play_billing/j1;

    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/j1;->a:Ljava/lang/Throwable;

    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    check-cast p0, Lcom/google/android/gms/internal/play_billing/h1;

    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task was cancelled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/h1;->b:Ljava/lang/Throwable;

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0
.end method

.method public static bridge synthetic o(Lcom/google/android/gms/internal/play_billing/m1;Z)V
    .locals 0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/play_billing/m1;->w(Lcom/google/android/gms/internal/play_billing/m1;Z)V

    return-void
.end method

.method public static q(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, Lcom/google/android/gms/internal/play_billing/i1;

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static t(Lcom/google/android/gms/internal/play_billing/i2;)Ljava/lang/Object;
    .locals 7

    const-string v0, "get() did not throw CancellationException, despite reporting isCancelled() == true: "

    instance-of v1, p0, Lcom/google/android/gms/internal/play_billing/l1;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p0, Lcom/google/android/gms/internal/play_billing/m1;

    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    instance-of v0, p0, Lcom/google/android/gms/internal/play_billing/h1;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/h1;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/play_billing/h1;->a:Z

    if-eqz v1, :cond_1

    iget-object p0, v0, Lcom/google/android/gms/internal/play_billing/h1;->b:Ljava/lang/Throwable;

    if-eqz p0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/play_billing/h1;

    invoke-direct {v0, v2, p0}, Lcom/google/android/gms/internal/play_billing/h1;-><init>(ZLjava/lang/Throwable;)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/play_billing/h1;->d:Lcom/google/android/gms/internal/play_billing/h1;

    :cond_1
    :goto_0
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_2
    instance-of v1, p0, Lcom/google/android/gms/internal/play_billing/o2;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, Lcom/google/android/gms/internal/play_billing/o2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/o2;->c()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p0, Lcom/google/android/gms/internal/play_billing/j1;

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/play_billing/j1;-><init>(Ljava/lang/Throwable;)V

    return-object p0

    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    sget-boolean v3, Lcom/google/android/gms/internal/play_billing/s1;->f:Z

    xor-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v1

    if-eqz v3, :cond_5

    sget-object p0, Lcom/google/android/gms/internal/play_billing/h1;->d:Lcom/google/android/gms/internal/play_billing/h1;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_5
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/m1;->u(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v1, :cond_6

    new-instance v3, Lcom/google/android/gms/internal/play_billing/h1;

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v2, v4}, Lcom/google/android/gms/internal/play_billing/h1;-><init>(ZLjava/lang/Throwable;)V

    return-object v3

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v3

    goto :goto_3

    :cond_6
    if-nez v3, :cond_7

    sget-object p0, Lcom/google/android/gms/internal/play_billing/s1;->d:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_2

    return-object p0

    :cond_7
    return-object v3

    :catch_2
    move-exception p0

    new-instance v0, Lcom/google/android/gms/internal/play_billing/j1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/play_billing/j1;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :goto_2
    if-nez v1, :cond_8

    new-instance v1, Lcom/google/android/gms/internal/play_billing/j1;

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v3, "get() threw CancellationException, despite reporting isCancelled() == false: "

    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/play_billing/j1;-><init>(Ljava/lang/Throwable;)V

    return-object v1

    :cond_8
    new-instance p0, Lcom/google/android/gms/internal/play_billing/h1;

    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/internal/play_billing/h1;-><init>(ZLjava/lang/Throwable;)V

    return-object p0

    :goto_3
    if-eqz v1, :cond_9

    new-instance v1, Lcom/google/android/gms/internal/play_billing/h1;

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v4, p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/play_billing/h1;-><init>(ZLjava/lang/Throwable;)V

    return-object v1

    :cond_9
    new-instance p0, Lcom/google/android/gms/internal/play_billing/j1;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/j1;-><init>(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public static u(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-object p0

    :catchall_0
    move-exception p0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_1
    throw p0

    :catch_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static w(Lcom/google/android/gms/internal/play_billing/m1;Z)V
    .locals 3

    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/s1;->i()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/m1;->p()V

    sget-object v0, Lcom/google/android/gms/internal/play_billing/k1;->d:Lcom/google/android/gms/internal/play_billing/k1;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/s1;->e(Lcom/google/android/gms/internal/play_billing/k1;)Lcom/google/android/gms/internal/play_billing/k1;

    move-result-object p0

    move-object v2, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/k1;->c:Lcom/google/android/gms/internal/play_billing/k1;

    iput-object p0, p1, Lcom/google/android/gms/internal/play_billing/k1;->c:Lcom/google/android/gms/internal/play_billing/k1;

    move-object p0, p1

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_2
    if-eqz p0, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/k1;->a:Ljava/lang/Runnable;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/k1;->c:Lcom/google/android/gms/internal/play_billing/k1;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/Runnable;

    instance-of v1, p1, Lcom/google/android/gms/internal/play_billing/i1;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/i1;

    iget-object p0, p1, Lcom/google/android/gms/internal/play_billing/i1;->a:Lcom/google/android/gms/internal/play_billing/m1;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    if-ne v1, p1, :cond_2

    iget-object v1, p1, Lcom/google/android/gms/internal/play_billing/i1;->b:Lcom/google/android/gms/internal/play_billing/i2;

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/m1;->t(Lcom/google/android/gms/internal/play_billing/i2;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0, p1, v1}, Lcom/google/android/gms/internal/play_billing/s1;->k(Lcom/google/android/gms/internal/play_billing/s1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    move-object p1, v0

    goto :goto_0

    :cond_1
    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/k1;->b:Ljava/util/concurrent/Executor;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/play_billing/m1;->x(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_2
    move-object p0, v0

    goto :goto_2

    :cond_3
    return-void
.end method

.method public static x(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 6

    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object v5, v0

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s1;->e:Lcom/google/android/gms/internal/play_billing/h2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/h2;->a()Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RuntimeException while executing runnable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " with executor "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v2, "com.google.common.util.concurrent.AbstractFuture"

    const-string v3, "executeListener"

    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 3

    const-string v0, "Executor was null."

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/m1;->isDone()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/s1;->b:Lcom/google/android/gms/internal/play_billing/k1;

    sget-object v1, Lcom/google/android/gms/internal/play_billing/k1;->d:Lcom/google/android/gms/internal/play_billing/k1;

    if-eq v0, v1, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/play_billing/k1;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/play_billing/k1;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    iput-object v0, v1, Lcom/google/android/gms/internal/play_billing/k1;->c:Lcom/google/android/gms/internal/play_billing/k1;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/play_billing/s1;->j(Lcom/google/android/gms/internal/play_billing/k1;Lcom/google/android/gms/internal/play_billing/k1;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/s1;->b:Lcom/google/android/gms/internal/play_billing/k1;

    sget-object v2, Lcom/google/android/gms/internal/play_billing/k1;->d:Lcom/google/android/gms/internal/play_billing/k1;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/m1;->x(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final c()Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p0, Lcom/google/android/gms/internal/play_billing/l1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/j1;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/j1;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/j1;->a:Ljava/lang/Throwable;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final cancel(Z)Z
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/i1;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    or-int/2addr v1, v4

    if-eqz v1, :cond_9

    sget-boolean v1, Lcom/google/android/gms/internal/play_billing/s1;->f:Z

    if-eqz v1, :cond_1

    new-instance v1, Lcom/google/android/gms/internal/play_billing/h1;

    new-instance v4, Ljava/util/concurrent/CancellationException;

    const-string v5, "Future.cancel() was called."

    invoke-direct {v4, v5}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, p1, v4}, Lcom/google/android/gms/internal/play_billing/h1;-><init>(ZLjava/lang/Throwable;)V

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/play_billing/h1;->c:Lcom/google/android/gms/internal/play_billing/h1;

    goto :goto_1

    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/play_billing/h1;->d:Lcom/google/android/gms/internal/play_billing/h1;

    :goto_1
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    move-object v4, p0

    move v5, v2

    :cond_3
    :goto_3
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/play_billing/s1;->k(Lcom/google/android/gms/internal/play_billing/s1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-static {v4, p1}, Lcom/google/android/gms/internal/play_billing/m1;->w(Lcom/google/android/gms/internal/play_billing/m1;Z)V

    instance-of v4, v0, Lcom/google/android/gms/internal/play_billing/i1;

    if-eqz v4, :cond_7

    check-cast v0, Lcom/google/android/gms/internal/play_billing/i1;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/i1;->b:Lcom/google/android/gms/internal/play_billing/i2;

    instance-of v4, v0, Lcom/google/android/gms/internal/play_billing/l1;

    if-eqz v4, :cond_6

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/play_billing/m1;

    iget-object v0, v4, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    if-nez v0, :cond_4

    move v5, v3

    goto :goto_4

    :cond_4
    move v5, v2

    :goto_4
    instance-of v6, v0, Lcom/google/android/gms/internal/play_billing/i1;

    or-int/2addr v5, v6

    if-eqz v5, :cond_5

    move v5, v3

    goto :goto_3

    :cond_5
    return v3

    :cond_6
    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_7
    return v3

    :cond_8
    iget-object v0, v4, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/m1;->q(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    return v5

    :cond_9
    return v2
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/s1;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/s1;->g(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/android/gms/internal/play_billing/h1;

    return v0
.end method

.method public final isDone()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/m1;->q(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr v0, v1

    return v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public p()V
    .locals 0

    return-void
.end method

.method public final r(Ljava/lang/Throwable;)Z
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/j1;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/play_billing/j1;-><init>(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/s1;->k(Lcom/google/android/gms/internal/play_billing/s1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/play_billing/m1;->w(Lcom/google/android/gms/internal/play_billing/m1;Z)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final s(Lcom/google/android/gms/internal/play_billing/i2;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/m1;->t(Lcom/google/android/gms/internal/play_billing/i2;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, v3, p1}, Lcom/google/android/gms/internal/play_billing/s1;->k(Lcom/google/android/gms/internal/play_billing/s1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/play_billing/m1;->w(Lcom/google/android/gms/internal/play_billing/m1;Z)V

    return v2

    :cond_0
    return v1

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/i1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/i1;-><init>(Lcom/google/android/gms/internal/play_billing/m1;Lcom/google/android/gms/internal/play_billing/i2;)V

    invoke-static {p0, v3, v0}, Lcom/google/android/gms/internal/play_billing/s1;->k(Lcom/google/android/gms/internal/play_billing/s1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/play_billing/y1;->a:Lcom/google/android/gms/internal/play_billing/y1;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/i2;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_1
    new-instance v1, Lcom/google/android/gms/internal/play_billing/j1;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/play_billing/j1;-><init>(Ljava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    sget-object v1, Lcom/google/android/gms/internal/play_billing/j1;->b:Lcom/google/android/gms/internal/play_billing/j1;

    :goto_0
    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/play_billing/s1;->k(Lcom/google/android/gms/internal/play_billing/s1;Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_1
    return v2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    :cond_3
    instance-of v2, v0, Lcom/google/android/gms/internal/play_billing/h1;

    if-eqz v2, :cond_4

    check-cast v0, Lcom/google/android/gms/internal/play_billing/h1;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/play_billing/h1;->a:Z

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_4
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.common.util.concurrent."

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    instance-of v1, v1, Lcom/google/android/gms/internal/play_billing/h1;

    const-string v2, "]"

    if-eqz v1, :cond_1

    const-string v1, "CANCELLED"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_5

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/m1;->isDone()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/m1;->v(Ljava/lang/StringBuilder;)V

    goto/16 :goto_5

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const-string v3, "PENDING"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    instance-of v4, v3, Lcom/google/android/gms/internal/play_billing/i1;

    const-string v5, "Exception thrown from implementation: "

    if-eqz v4, :cond_4

    const-string v4, ", setFuture=["

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v3, Lcom/google/android/gms/internal/play_billing/i1;

    iget-object v3, v3, Lcom/google/android/gms/internal/play_billing/i1;->b:Lcom/google/android/gms/internal/play_billing/i2;

    if-ne v3, p0, :cond_3

    :try_start_0
    const-string v3, "this future"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :catchall_0
    move-exception v3

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/j2;->a(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_4
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/m1;->n()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/a0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v3

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/j2;->a(Ljava/lang/Throwable;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_3
    if-eqz v3, :cond_5

    const-string v4, ", info=["

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    :goto_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/m1;->isDone()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/m1;->v(Ljava/lang/StringBuilder;)V

    :cond_6
    :goto_5
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Ljava/lang/StringBuilder;)V
    .locals 3

    const-string v0, "]"

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/m1;->u(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "SUCCESS, result=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v1, :cond_0

    const-string v1, "null"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :cond_0
    if-ne v1, p0, :cond_1

    const-string v1, "this future"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "@"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    const-string v1, "UNKNOWN, cause=["

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " thrown from get()]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :catch_2
    const-string v0, "CANCELLED"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :goto_2
    const-string v2, "FAILURE, cause=["

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
