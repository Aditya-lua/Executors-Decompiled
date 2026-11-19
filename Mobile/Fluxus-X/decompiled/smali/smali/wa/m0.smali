.class public final Lwa/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field public final a:Lnf/g;

.field public final b:Ltb/k;

.field public final synthetic c:Lwa/n0;


# direct methods
.method public constructor <init>(Lwa/n0;Lnf/g;)V
    .locals 0

    iput-object p1, p0, Lwa/m0;->c:Lwa/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ltb/k;

    invoke-direct {p1}, Ltb/k;-><init>()V

    iput-object p1, p0, Lwa/m0;->b:Ltb/k;

    iput-object p2, p0, Lwa/m0;->a:Lnf/g;

    return-void
.end method

.method public static bridge synthetic b(Lwa/m0;)Ltb/k;
    .locals 0

    iget-object p0, p0, Lwa/m0;->b:Ltb/k;

    return-object p0
.end method

.method public static bridge synthetic c(Lwa/m0;)Lnf/g;
    .locals 0

    iget-object p0, p0, Lwa/m0;->a:Lnf/g;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lwa/m0;->b:Ltb/k;

    invoke-virtual {v0}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lwa/m0;->c:Lwa/n0;

    invoke-static {v0}, Lwa/n0;->e(Lwa/n0;)Ljava/util/Queue;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwa/m0;->c:Lwa/n0;

    invoke-static {v1}, Lwa/n0;->b(Lwa/n0;)I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lo9/s;->p(Z)V

    iget-object v1, p0, Lwa/m0;->c:Lwa/n0;

    invoke-static {v1, v2}, Lwa/n0;->f(Lwa/n0;I)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lwa/m0;->c:Lwa/n0;

    invoke-static {v0}, Lwa/n0;->c(Lwa/n0;)Ll9/g;

    move-result-object v0

    new-instance v1, Lwa/l0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lwa/l0;-><init>(Lwa/m0;Lwa/k0;)V

    invoke-virtual {v0, v1}, Ll9/g;->D(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lwa/m0;->c:Lwa/n0;

    new-instance v2, Lwa/i0;

    invoke-direct {v2, p0}, Lwa/i0;-><init>(Lwa/m0;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->d(Ljava/util/concurrent/Executor;Ltb/f;)Lcom/google/android/gms/tasks/Task;

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

    iget-object v0, p0, Lwa/m0;->c:Lwa/n0;

    invoke-static {v0}, Lwa/n0;->e(Lwa/n0;)Ljava/util/Queue;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwa/m0;->c:Lwa/n0;

    invoke-static {v1}, Lwa/n0;->e(Lwa/n0;)Ljava/util/Queue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p0, :cond_0

    iget-object v1, p0, Lwa/m0;->c:Lwa/n0;

    invoke-static {v1}, Lwa/n0;->e(Lwa/n0;)Ljava/util/Queue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    iget-object v1, p0, Lwa/m0;->c:Lwa/n0;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lwa/n0;->f(Lwa/n0;I)V

    iget-object v1, p0, Lwa/m0;->c:Lwa/n0;

    invoke-static {v1}, Lwa/n0;->e(Lwa/n0;)Ljava/util/Queue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa/m0;

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

    iget-object v0, p0, Lwa/m0;->b:Ltb/k;

    invoke-virtual {v0, p1}, Ltb/k;->d(Ljava/lang/Exception;)Z

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lwa/m0;->d()V

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
