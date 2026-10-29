.class public final Lva/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field public final a:Lcom/google/firebase/appindexing/internal/zzg;

.field public final b:Lsb/k;

.field public final synthetic c:Lva/m0;


# direct methods
.method public constructor <init>(Lva/m0;Lcom/google/firebase/appindexing/internal/zzg;)V
    .locals 0

    iput-object p1, p0, Lva/l0;->c:Lva/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lsb/k;

    invoke-direct {p1}, Lsb/k;-><init>()V

    iput-object p1, p0, Lva/l0;->b:Lsb/k;

    iput-object p2, p0, Lva/l0;->a:Lcom/google/firebase/appindexing/internal/zzg;

    return-void
.end method

.method public static bridge synthetic b(Lva/l0;)Lsb/k;
    .locals 0

    iget-object p0, p0, Lva/l0;->b:Lsb/k;

    return-object p0
.end method

.method public static bridge synthetic c(Lva/l0;)Lcom/google/firebase/appindexing/internal/zzg;
    .locals 0

    iget-object p0, p0, Lva/l0;->a:Lcom/google/firebase/appindexing/internal/zzg;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lva/l0;->b:Lsb/k;

    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lva/l0;->c:Lva/m0;

    invoke-static {v0}, Lva/m0;->e(Lva/m0;)Ljava/util/Queue;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lva/l0;->c:Lva/m0;

    invoke-static {v1}, Lva/m0;->b(Lva/m0;)I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ln9/m;->p(Z)V

    iget-object v1, p0, Lva/l0;->c:Lva/m0;

    invoke-static {v1, v2}, Lva/m0;->f(Lva/m0;I)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lva/l0;->c:Lva/m0;

    invoke-static {v0}, Lva/m0;->c(Lva/m0;)Lk9/e;

    move-result-object v0

    new-instance v1, Lva/k0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lva/k0;-><init>(Lva/l0;Lva/j0;)V

    invoke-virtual {v0, v1}, Lk9/e;->D(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lva/l0;->c:Lva/m0;

    new-instance v2, Lva/h0;

    invoke-direct {v2, p0}, Lva/h0;-><init>(Lva/l0;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->d(Ljava/util/concurrent/Executor;Lsb/f;)Lcom/google/android/gms/tasks/Task;

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final synthetic e(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lva/l0;->c:Lva/m0;

    invoke-static {v0}, Lva/m0;->e(Lva/m0;)Ljava/util/Queue;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lva/l0;->c:Lva/m0;

    invoke-static {v1}, Lva/m0;->e(Lva/m0;)Ljava/util/Queue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p0, :cond_0

    iget-object v1, p0, Lva/l0;->c:Lva/m0;

    invoke-static {v1}, Lva/m0;->e(Lva/m0;)Ljava/util/Queue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    iget-object v1, p0, Lva/l0;->c:Lva/m0;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lva/m0;->f(Lva/m0;I)V

    iget-object v1, p0, Lva/l0;->c:Lva/m0;

    invoke-static {v1}, Lva/m0;->e(Lva/m0;)Ljava/util/Queue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lva/l0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lva/l0;->b:Lsb/k;

    invoke-virtual {v0, p1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lva/l0;->d()V

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
