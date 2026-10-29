.class public final Lsb/n0;
.super Lcom/google/android/gms/tasks/Task;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/tasks/Task<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lsb/i0;

.field public c:Z

.field public volatile d:Z

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Exception;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/tasks/Task;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    new-instance v0, Lsb/i0;

    invoke-direct {v0}, Lsb/i0;-><init>()V

    iput-object v0, p0, Lsb/n0;->b:Lsb/i0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;Lsb/e;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lsb/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lsb/e;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lsb/y;

    invoke-direct {v0, p1, p2}, Lsb/y;-><init>(Ljava/util/concurrent/Executor;Lsb/e;)V

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, v0}, Lsb/i0;->a(Lsb/h0;)V

    invoke-virtual {p0}, Lsb/n0;->x()V

    return-object p0
.end method

.method public final addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lcom/google/android/gms/tasks/OnCompleteListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/OnCompleteListener<",
            "TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lsb/l;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lsb/a0;

    invoke-direct {v1, v0, p1}, Lsb/a0;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)V

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, v1}, Lsb/i0;->a(Lsb/h0;)V

    invoke-virtual {p0}, Lsb/n0;->x()V

    return-object p0
.end method

.method public final b(Landroid/app/Activity;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/tasks/OnCompleteListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/OnCompleteListener<",
            "TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lsb/a0;

    sget-object v1, Lsb/l;->a:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, p2}, Lsb/a0;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)V

    iget-object p2, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p2, v0}, Lsb/i0;->a(Lsb/h0;)V

    invoke-static {p1}, Lsb/m0;->l(Landroid/app/Activity;)Lsb/m0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lsb/m0;->m(Lsb/h0;)V

    invoke-virtual {p0}, Lsb/n0;->x()V

    return-object p0
.end method

.method public final c(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/tasks/OnCompleteListener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/tasks/OnCompleteListener<",
            "TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lsb/a0;

    invoke-direct {v0, p1, p2}, Lsb/a0;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)V

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, v0}, Lsb/i0;->a(Lsb/h0;)V

    invoke-virtual {p0}, Lsb/n0;->x()V

    return-object p0
.end method

.method public final d(Ljava/util/concurrent/Executor;Lsb/f;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lsb/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lsb/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lsb/c0;

    invoke-direct {v0, p1, p2}, Lsb/c0;-><init>(Ljava/util/concurrent/Executor;Lsb/f;)V

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, v0}, Lsb/i0;->a(Lsb/h0;)V

    invoke-virtual {p0}, Lsb/n0;->x()V

    return-object p0
.end method

.method public final e(Lsb/f;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lsb/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsb/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lsb/l;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lsb/n0;->d(Ljava/util/concurrent/Executor;Lsb/f;)Lcom/google/android/gms/tasks/Task;

    return-object p0
.end method

.method public final f(Ljava/util/concurrent/Executor;Lsb/g;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lsb/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lsb/g<",
            "-TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lsb/e0;

    invoke-direct {v0, p1, p2}, Lsb/e0;-><init>(Ljava/util/concurrent/Executor;Lsb/g;)V

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, v0}, Lsb/i0;->a(Lsb/h0;)V

    invoke-virtual {p0}, Lsb/n0;->x()V

    return-object p0
.end method

.method public final g(Lsb/g;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lsb/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsb/g<",
            "-TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lsb/l;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lsb/n0;->f(Ljava/util/concurrent/Executor;Lsb/g;)Lcom/google/android/gms/tasks/Task;

    return-object p0
.end method

.method public final getException()Ljava/lang/Exception;
    .locals 2

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lsb/n0;->f:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getResult()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lsb/n0;->u()V

    invoke-virtual {p0}, Lsb/n0;->v()V

    iget-object v1, p0, Lsb/n0;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    iget-object v1, p0, Lsb/n0;->e:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    new-instance v2, Lsb/i;

    invoke-direct {v2, v1}, Lsb/i;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final h(Ljava/util/concurrent/Executor;Lsb/c;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lsb/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lsb/c<",
            "TTResult;TTContinuationResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lsb/n0;

    invoke-direct {v0}, Lsb/n0;-><init>()V

    new-instance v1, Lsb/u;

    invoke-direct {v1, p1, p2, v0}, Lsb/u;-><init>(Ljava/util/concurrent/Executor;Lsb/c;Lsb/n0;)V

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, v1}, Lsb/i0;->a(Lsb/h0;)V

    invoke-virtual {p0}, Lsb/n0;->x()V

    return-object v0
.end method

.method public final i(Ljava/util/concurrent/Executor;Lsb/c;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lsb/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lsb/c<",
            "TTResult;",
            "Lcom/google/android/gms/tasks/Task<",
            "TTContinuationResult;>;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lsb/n0;

    invoke-direct {v0}, Lsb/n0;-><init>()V

    new-instance v1, Lsb/w;

    invoke-direct {v1, p1, p2, v0}, Lsb/w;-><init>(Ljava/util/concurrent/Executor;Lsb/c;Lsb/n0;)V

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, v1}, Lsb/i0;->a(Lsb/h0;)V

    invoke-virtual {p0}, Lsb/n0;->x()V

    return-object v0
.end method

.method public final isSuccessful()Z
    .locals 3

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsb/n0;->c:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lsb/n0;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lsb/n0;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return v2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j(Lsb/c;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lsb/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lsb/c<",
            "TTResult;",
            "Lcom/google/android/gms/tasks/Task<",
            "TTContinuationResult;>;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lsb/l;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/tasks/Task;->i(Ljava/util/concurrent/Executor;Lsb/c;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TX;>;)TTResult;^TX;"
        }
    .end annotation

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lsb/n0;->u()V

    invoke-virtual {p0}, Lsb/n0;->v()V

    iget-object v1, p0, Lsb/n0;->f:Ljava/lang/Exception;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p1, p0, Lsb/n0;->f:Ljava/lang/Exception;

    if-nez p1, :cond_0

    iget-object p1, p0, Lsb/n0;->e:Ljava/lang/Object;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v1, Lsb/i;

    invoke-direct {v1, p1}, Lsb/i;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    iget-object v1, p0, Lsb/n0;->f:Ljava/lang/Exception;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lsb/n0;->d:Z

    return v0
.end method

.method public final m()Z
    .locals 2

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsb/n0;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final n(Ljava/util/concurrent/Executor;Lsb/j;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lsb/j<",
            "TTResult;TTContinuationResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lsb/n0;

    invoke-direct {v0}, Lsb/n0;-><init>()V

    new-instance v1, Lsb/g0;

    invoke-direct {v1, p1, p2, v0}, Lsb/g0;-><init>(Ljava/util/concurrent/Executor;Lsb/j;Lsb/n0;)V

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, v1}, Lsb/i0;->a(Lsb/h0;)V

    invoke-virtual {p0}, Lsb/n0;->x()V

    return-object v0
.end method

.method public final o(Lsb/j;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Lsb/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lsb/j<",
            "TTResult;TTContinuationResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lsb/l;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lsb/n0;

    invoke-direct {v1}, Lsb/n0;-><init>()V

    new-instance v2, Lsb/g0;

    invoke-direct {v2, v0, p1, v1}, Lsb/g0;-><init>(Ljava/util/concurrent/Executor;Lsb/j;Lsb/n0;)V

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, v2}, Lsb/i0;->a(Lsb/h0;)V

    invoke-virtual {p0}, Lsb/n0;->x()V

    return-object v1
.end method

.method public final p(Ljava/lang/Exception;)V
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lsb/n0;->w()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lsb/n0;->c:Z

    iput-object p1, p0, Lsb/n0;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, p0}, Lsb/i0;->b(Lcom/google/android/gms/tasks/Task;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lsb/n0;->w()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lsb/n0;->c:Z

    iput-object p1, p0, Lsb/n0;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, p0}, Lsb/i0;->b(Lcom/google/android/gms/tasks/Task;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final r()Z
    .locals 2

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsb/n0;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lsb/n0;->c:Z

    iput-boolean v1, p0, Lsb/n0;->d:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {v0, p0}, Lsb/i0;->b(Lcom/google/android/gms/tasks/Task;)V

    return v1

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final s(Ljava/lang/Exception;)Z
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsb/n0;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lsb/n0;->c:Z

    iput-object p1, p0, Lsb/n0;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, p0}, Lsb/i0;->b(Lcom/google/android/gms/tasks/Task;)V

    return v1

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final t(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsb/n0;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lsb/n0;->c:Z

    iput-object p1, p0, Lsb/n0;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {p1, p0}, Lsb/i0;->b(Lcom/google/android/gms/tasks/Task;)V

    return v1

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final u()V
    .locals 2

    iget-boolean v0, p0, Lsb/n0;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, Ln9/m;->q(ZLjava/lang/Object;)V

    return-void
.end method

.method public final v()V
    .locals 2

    iget-boolean v0, p0, Lsb/n0;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task is already canceled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final w()V
    .locals 1

    iget-boolean v0, p0, Lsb/n0;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lsb/d;->a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public final x()V
    .locals 2

    iget-object v0, p0, Lsb/n0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsb/n0;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lsb/n0;->b:Lsb/i0;

    invoke-virtual {v0, p0}, Lsb/i0;->b(Lcom/google/android/gms/tasks/Task;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
