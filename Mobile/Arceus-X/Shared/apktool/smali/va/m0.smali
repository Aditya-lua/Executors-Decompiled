.class public final Lva/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field public final a:Lk9/e;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Landroid/os/Handler;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Ljava/util/Queue;

.field public d:I


# direct methods
.method public constructor <init>(Lk9/e;)V
    .locals 1
    .param p1    # Lk9/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lva/m0;->c:Ljava/util/Queue;

    const/4 v0, 0x0

    iput v0, p0, Lva/m0;->d:I

    iput-object p1, p0, Lva/m0;->a:Lk9/e;

    new-instance v0, Lva/e;

    invoke-virtual {p1}, Lk9/e;->I()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v0, p1}, Lva/e;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lva/m0;->b:Landroid/os/Handler;

    return-void
.end method

.method public static bridge synthetic b(Lva/m0;)I
    .locals 0

    iget p0, p0, Lva/m0;->d:I

    return p0
.end method

.method public static bridge synthetic c(Lva/m0;)Lk9/e;
    .locals 0

    iget-object p0, p0, Lva/m0;->a:Lk9/e;

    return-object p0
.end method

.method public static bridge synthetic e(Lva/m0;)Ljava/util/Queue;
    .locals 0

    iget-object p0, p0, Lva/m0;->c:Ljava/util/Queue;

    return-object p0
.end method

.method public static bridge synthetic f(Lva/m0;I)V
    .locals 0

    iput p1, p0, Lva/m0;->d:I

    return-void
.end method


# virtual methods
.method public final d(Lcom/google/firebase/appindexing/internal/zzg;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    new-instance v0, Lva/l0;

    invoke-direct {v0, p0, p1}, Lva/l0;-><init>(Lva/m0;Lcom/google/firebase/appindexing/internal/zzg;)V

    invoke-virtual {v0}, Lva/l0;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-virtual {p1, p0, p0}, Lcom/google/android/gms/tasks/Task;->c(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lva/m0;->c:Ljava/util/Queue;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lva/m0;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    iget-object v3, p0, Lva/m0;->c:Ljava/util/Queue;

    invoke-interface {v3, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lva/l0;->d()V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lva/m0;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3
    .param p1    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lva/m0;->c:Ljava/util/Queue;

    monitor-enter p1

    :try_start_0
    iget v0, p0, Lva/m0;->d:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lva/m0;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lva/l0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v1}, Ln9/m;->p(Z)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput v2, p0, Lva/m0;->d:I

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lva/l0;->d()V

    :cond_2
    return-void

    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
