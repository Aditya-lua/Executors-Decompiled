.class public final Lsb/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/tasks/Task;

.field public final synthetic b:Lsb/g0;


# direct methods
.method public constructor <init>(Lsb/g0;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iput-object p1, p0, Lsb/f0;->b:Lsb/g0;

    iput-object p2, p0, Lsb/f0;->a:Lcom/google/android/gms/tasks/Task;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lsb/f0;->b:Lsb/g0;

    invoke-static {v0}, Lsb/g0;->c(Lsb/g0;)Lsb/j;

    move-result-object v0

    iget-object v1, p0, Lsb/f0;->a:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lsb/j;->then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0
    :try_end_0
    .catch Lsb/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object v0, p0, Lsb/f0;->b:Lsb/g0;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lsb/g0;->onFailure(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v1, p0, Lsb/f0;->b:Lsb/g0;

    sget-object v2, Lsb/l;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->f(Ljava/util/concurrent/Executor;Lsb/g;)Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lsb/f0;->b:Lsb/g0;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->d(Ljava/util/concurrent/Executor;Lsb/f;)Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lsb/f0;->b:Lsb/g0;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->a(Ljava/util/concurrent/Executor;Lsb/e;)Lcom/google/android/gms/tasks/Task;

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    iget-object v1, p0, Lsb/f0;->b:Lsb/g0;

    invoke-virtual {v1, v0}, Lsb/g0;->onFailure(Ljava/lang/Exception;)V

    return-void

    :catch_2
    iget-object v0, p0, Lsb/f0;->b:Lsb/g0;

    invoke-virtual {v0}, Lsb/g0;->a()V

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lsb/f0;->b:Lsb/g0;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lsb/g0;->onFailure(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Lsb/f0;->b:Lsb/g0;

    invoke-virtual {v1, v0}, Lsb/g0;->onFailure(Ljava/lang/Exception;)V

    return-void
.end method
