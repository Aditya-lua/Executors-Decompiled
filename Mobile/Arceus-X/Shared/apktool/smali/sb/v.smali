.class public final Lsb/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/tasks/Task;

.field public final synthetic b:Lsb/w;


# direct methods
.method public constructor <init>(Lsb/w;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iput-object p1, p0, Lsb/v;->b:Lsb/w;

    iput-object p2, p0, Lsb/v;->a:Lcom/google/android/gms/tasks/Task;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lsb/v;->b:Lsb/w;

    invoke-static {v0}, Lsb/w;->c(Lsb/w;)Lsb/c;

    move-result-object v0

    iget-object v1, p0, Lsb/v;->a:Lcom/google/android/gms/tasks/Task;

    invoke-interface {v0, v1}, Lsb/c;->then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Lsb/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object v0, p0, Lsb/v;->b:Lsb/w;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lsb/w;->onFailure(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v1, p0, Lsb/v;->b:Lsb/w;

    sget-object v2, Lsb/l;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->f(Ljava/util/concurrent/Executor;Lsb/g;)Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lsb/v;->b:Lsb/w;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->d(Ljava/util/concurrent/Executor;Lsb/f;)Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lsb/v;->b:Lsb/w;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->a(Ljava/util/concurrent/Executor;Lsb/e;)Lcom/google/android/gms/tasks/Task;

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    iget-object v1, p0, Lsb/v;->b:Lsb/w;

    invoke-static {v1}, Lsb/w;->d(Lsb/w;)Lsb/n0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lsb/n0;->p(Ljava/lang/Exception;)V

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lsb/v;->b:Lsb/w;

    invoke-static {v1}, Lsb/w;->d(Lsb/w;)Lsb/n0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lsb/n0;->p(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Lsb/v;->b:Lsb/w;

    invoke-static {v1}, Lsb/w;->d(Lsb/w;)Lsb/n0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lsb/n0;->p(Ljava/lang/Exception;)V

    return-void
.end method
