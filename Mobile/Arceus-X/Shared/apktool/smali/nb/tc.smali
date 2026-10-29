.class public final Lnb/tc;
.super Lnb/b5;
.source "SourceFile"


# instance fields
.field public final c:Lnb/nc;

.field public d:Lnb/d5;

.field public volatile e:Ljava/lang/Boolean;

.field public final f:Lnb/w;

.field public g:Ljava/util/concurrent/ScheduledExecutorService;

.field public final h:Lnb/pd;

.field public final i:Ljava/util/List;

.field public final j:Lnb/w;


# direct methods
.method public constructor <init>(Lnb/g7;)V
    .locals 2

    invoke-direct {p0, p1}, Lnb/b5;-><init>(Lnb/g7;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnb/tc;->i:Ljava/util/List;

    new-instance v0, Lnb/pd;

    invoke-virtual {p1}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lnb/pd;-><init>(Lu9/e;)V

    iput-object v0, p0, Lnb/tc;->h:Lnb/pd;

    new-instance v0, Lnb/nc;

    invoke-direct {v0, p0}, Lnb/nc;-><init>(Lnb/tc;)V

    iput-object v0, p0, Lnb/tc;->c:Lnb/nc;

    new-instance v0, Lnb/tb;

    invoke-direct {v0, p0, p1}, Lnb/tb;-><init>(Lnb/tc;Lnb/l8;)V

    iput-object v0, p0, Lnb/tc;->f:Lnb/w;

    new-instance v0, Lnb/xb;

    invoke-direct {v0, p0, p1}, Lnb/xb;-><init>(Lnb/tc;Lnb/l8;)V

    iput-object v0, p0, Lnb/tc;->j:Lnb/w;

    return-void
.end method

.method private final S()V
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/tc;->h:Lnb/pd;

    invoke-virtual {v0}, Lnb/pd;->a()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    sget-object v0, Lnb/z4;->Z:Lnb/y4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lnb/tc;->f:Lnb/w;

    invoke-virtual {v2, v0, v1}, Lnb/w;->b(J)V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/tc;->c:Lnb/nc;

    invoke-virtual {v0}, Lnb/nc;->b()V

    :try_start_0
    invoke-static {}, Lt9/a;->b()Lt9/a;

    move-result-object v1

    iget-object v2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lt9/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lnb/tc;->d:Lnb/d5;

    return-void
.end method

.method public final B(Lcom/google/android/gms/internal/measurement/x1;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    const v2, 0xbdfcb8

    invoke-virtual {v1, v2}, Lnb/ve;->X(I)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->r()Lnb/u5;

    move-result-object p2

    const-string p3, "Not bundling data. Service unavailable or out of date"

    invoke-virtual {p2, p3}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object p2

    const/4 p3, 0x0

    new-array p3, p3, [B

    invoke-virtual {p2, p1, p3}, Lnb/ve;->d0(Lcom/google/android/gms/internal/measurement/x1;[B)V

    return-void

    :cond_0
    new-instance v0, Lnb/wb;

    invoke-direct {v0, p0, p2, p3, p1}, Lnb/wb;-><init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/x1;)V

    invoke-virtual {p0, v0}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final C()Z
    .locals 4

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {p0}, Lnb/tc;->y()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    invoke-virtual {v0}, Lnb/ve;->W()I

    move-result v0

    sget-object v2, Lnb/z4;->K0:Lnb/y4;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v1
.end method

.method public final D()Z
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {p0}, Lnb/tc;->y()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    invoke-virtual {v0}, Lnb/ve;->W()I

    move-result v0

    const v2, 0x3ae30

    if-lt v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v1
.end method

.method public final synthetic E()V
    .locals 3

    iget-object v0, p0, Lnb/tc;->d:Lnb/d5;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Failed to send storage consent settings to service"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v1}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v1

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1}, Lnb/d5;->P(Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-direct {p0}, Lnb/tc;->S()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "Failed to send storage consent settings to the service"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic F()V
    .locals 3

    iget-object v0, p0, Lnb/tc;->d:Lnb/d5;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Failed to send Dma consent settings to service"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v1}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v1

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1}, Lnb/d5;->c0(Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-direct {p0}, Lnb/tc;->S()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "Failed to send Dma consent settings to the service"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic G(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)V
    .locals 2

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lnb/tc;->d:Lnb/d5;

    if-nez v0, :cond_0

    iget-object p2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    const-string p3, "Failed to request trigger URIs; not connected to service"

    invoke-virtual {p2, p3}, Lnb/u5;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_0

    :cond_0
    :try_start_2
    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnb/lb;

    invoke-direct {v1, p0, p1}, Lnb/lb;-><init>(Lnb/tc;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v0, p2, p3, v1}, Lnb/d5;->g1(Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;Lnb/g5;)V

    invoke-direct {p0}, Lnb/tc;->S()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_0
    :try_start_3
    iget-object p3, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p3}, Lnb/g7;->a()Lnb/w5;

    move-result-object p3

    invoke-virtual {p3}, Lnb/w5;->o()Lnb/u5;

    move-result-object p3

    const-string v0, "Failed to request trigger URIs; remote exception"

    invoke-virtual {p3, v0, p2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    :goto_1
    monitor-exit p1

    return-void

    :goto_2
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p2
.end method

.method public final synthetic H(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzoo;)V
    .locals 2

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lnb/tc;->d:Lnb/d5;

    if-nez v0, :cond_0

    iget-object p2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    const-string p3, "[sgtm] Failed to get upload batches; not connected to service"

    invoke-virtual {p2, p3}, Lnb/u5;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_0

    :cond_0
    :try_start_2
    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnb/mb;

    invoke-direct {v1, p0, p1}, Lnb/mb;-><init>(Lnb/tc;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v0, p2, p3, v1}, Lnb/d5;->H(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzoo;Lnb/j5;)V

    invoke-direct {p0}, Lnb/tc;->S()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_0
    :try_start_3
    iget-object p3, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p3}, Lnb/g7;->a()Lnb/w5;

    move-result-object p3

    invoke-virtual {p3}, Lnb/w5;->o()Lnb/u5;

    move-result-object p3

    const-string v0, "[sgtm] Failed to get upload batches; remote exception"

    invoke-virtual {p3, v0, p2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    :goto_1
    monitor-exit p1

    return-void

    :goto_2
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p2
.end method

.method public final synthetic I(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V
    .locals 3

    iget-object v0, p0, Lnb/tc;->d:Lnb/d5;

    if-nez v0, :cond_0

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "[sgtm] Discarding data. Failed to update batch upload status."

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    invoke-interface {v0, p1, p2}, Lnb/d5;->u1(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V

    invoke-direct {p0}, Lnb/tc;->S()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    iget-wide v1, p2, Lcom/google/android/gms/measurement/internal/zzaf;->f:J

    const-string p2, "[sgtm] Failed to update batch upload status, rowId, exception"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p2, v1, p1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic J()V
    .locals 0

    invoke-direct {p0}, Lnb/tc;->S()V

    return-void
.end method

.method public final synthetic K(Landroid/content/ComponentName;)V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/tc;->d:Lnb/d5;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lnb/tc;->d:Lnb/d5;

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Disconnected from device MeasurementService"

    invoke-virtual {v0, v1, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/tc;->w()V

    :cond_0
    return-void
.end method

.method public final synthetic L()V
    .locals 0

    invoke-virtual {p0}, Lnb/tc;->U()V

    return-void
.end method

.method public final synthetic M()Lnb/nc;
    .locals 1

    iget-object v0, p0, Lnb/tc;->c:Lnb/nc;

    return-object v0
.end method

.method public final synthetic N()Lnb/d5;
    .locals 1

    iget-object v0, p0, Lnb/tc;->d:Lnb/d5;

    return-object v0
.end method

.method public final synthetic O(Lnb/d5;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lnb/tc;->d:Lnb/d5;

    return-void
.end method

.method public final synthetic P()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lnb/tc;->g:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public final synthetic Q(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    iput-object p1, p0, Lnb/tc;->g:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public final R()Z
    .locals 1

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    const/4 v0, 0x1

    return v0
.end method

.method public final T(Ljava/lang/Runnable;)V
    .locals 6

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/tc;->W()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lnb/tc;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    int-to-long v1, v1

    iget-object v3, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->w()Lnb/k;

    const-wide/16 v4, 0x3e8

    cmp-long v1, v1, v4

    if-ltz v1, :cond_1

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string v0, "Discarding data. Max runnable queue size reached"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lnb/tc;->j:Lnb/w;

    const-wide/32 v0, 0xea60

    invoke-virtual {p1, v0, v1}, Lnb/w;->b(J)V

    invoke-virtual {p0}, Lnb/tc;->w()V

    return-void
.end method

.method public final U()V
    .locals 4

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    iget-object v1, p0, Lnb/tc;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Processing queued up service tasks"

    invoke-virtual {v0, v3, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Task exception while flushing queue"

    invoke-virtual {v2, v3, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnb/tc;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lnb/tc;->j:Lnb/w;

    invoke-virtual {v0}, Lnb/w;->d()V

    return-void
.end method

.method public final V(Z)Lcom/google/android/gms/measurement/internal/zzr;
    .locals 5

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->L()Lnb/k5;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v0

    iget-object v0, v0, Lnb/k6;->e:Lnb/i6;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lnb/g7;->x()Lnb/k6;

    move-result-object p1

    iget-object p1, p1, Lnb/k6;->e:Lnb/i6;

    invoke-virtual {p1}, Lnb/i6;->b()Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object v0, Lnb/k6;->A:Landroid/util/Pair;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/2addr v2, v3

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-virtual {v1, v2}, Lnb/k5;->o(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object p1

    return-object p1
.end method

.method public final W()Z
    .locals 1

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/tc;->d:Lnb/d5;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final X()V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v0

    new-instance v1, Lnb/yb;

    invoke-direct {v1, p0, v0}, Lnb/yb;-><init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final Y(Z)V
    .locals 1

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {p0}, Lnb/tc;->C()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object p1

    new-instance v0, Lnb/zb;

    invoke-direct {v0, p0, p1}, Lnb/zb;-><init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final Z(Z)V
    .locals 0

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    new-instance p1, Lnb/sc;

    invoke-direct {p1, p0}, Lnb/sc;-><init>(Lnb/tc;)V

    invoke-virtual {p0, p1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a0()V
    .locals 1

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    new-instance v0, Lnb/oc;

    invoke-direct {v0, p0}, Lnb/oc;-><init>(Lnb/tc;)V

    invoke-virtual {p0, v0}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b0(Lnb/d5;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 58

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/b5;->j()V

    invoke-virtual {v1}, Lnb/tc;->R()Z

    iget-object v4, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->w()Lnb/k;

    const/16 v6, 0x64

    move-object/from16 v0, p3

    move v8, v6

    const/4 v7, 0x0

    :goto_0
    const/16 v9, 0x3e9

    if-ge v7, v9, :cond_a

    if-ne v8, v6, :cond_a

    iget-object v8, v1, Lnb/j8;->a:Lnb/g7;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, Lnb/g7;->E()Lnb/n5;

    move-result-object v8

    invoke-virtual {v8, v6}, Lnb/n5;->t(I)Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-interface {v9, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    goto :goto_1

    :cond_0
    const/4 v8, 0x0

    :goto_1
    if-eqz v3, :cond_1

    if-ge v8, v6, :cond_1

    iget-object v10, v0, Lcom/google/android/gms/measurement/internal/zzr;->h:Ljava/lang/String;

    iget-wide v11, v0, Lcom/google/android/gms/measurement/internal/zzr;->o:J

    new-instance v13, Lnb/m5;

    invoke-direct {v13, v3, v10, v11, v12}, Lnb/m5;-><init>(Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Ljava/lang/String;J)V

    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v4}, Lnb/g7;->w()Lnb/k;

    move-result-object v10

    sget-object v11, Lnb/z4;->P0:Lnb/y4;

    const/4 v12, 0x0

    invoke-virtual {v10, v12, v11}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v10

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v11

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v11, :cond_9

    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lnb/m5;

    iget-object v15, v14, Lnb/m5;->a:Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

    invoke-virtual {v4}, Lnb/g7;->w()Lnb/k;

    move-result-object v5

    sget-object v6, Lnb/z4;->c1:Lnb/y4;

    invoke-virtual {v5, v12, v6}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, v14, Lnb/m5;->b:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-nez v16, :cond_2

    move/from16 v56, v13

    iget-wide v12, v14, Lnb/m5;->c:J

    iget-object v14, v0, Lcom/google/android/gms/measurement/internal/zzr;->f:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->g:Ljava/lang/String;

    move-object/from16 v18, v3

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->i:Ljava/lang/String;

    move-object/from16 v22, v3

    move-object/from16 v57, v4

    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->j:J

    move-wide/from16 v23, v3

    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->k:J

    move-wide/from16 v25, v3

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->l:Ljava/lang/String;

    iget-boolean v4, v0, Lcom/google/android/gms/measurement/internal/zzr;->m:Z

    move-object/from16 v27, v3

    iget-boolean v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->n:Z

    move/from16 v29, v3

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->p:Ljava/lang/String;

    move-object/from16 v30, v3

    move/from16 v28, v4

    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->q:J

    move-wide/from16 v31, v3

    iget v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->r:I

    iget-boolean v4, v0, Lcom/google/android/gms/measurement/internal/zzr;->s:Z

    move/from16 v33, v3

    iget-boolean v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->t:Z

    move/from16 v35, v3

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->u:Ljava/lang/Boolean;

    move-object/from16 v36, v3

    move/from16 v34, v4

    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->v:J

    move-wide/from16 v37, v3

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->w:Ljava/util/List;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzr;->x:Ljava/lang/String;

    move-object/from16 v39, v3

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->y:Ljava/lang/String;

    move-object/from16 v41, v3

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->z:Ljava/lang/String;

    move-object/from16 v42, v3

    iget-boolean v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->A:Z

    move/from16 v43, v3

    move-object/from16 v40, v4

    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->B:J

    move-wide/from16 v44, v3

    iget v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->C:I

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzr;->D:Ljava/lang/String;

    move/from16 v46, v3

    iget v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->E:I

    move/from16 v48, v3

    move-object/from16 v47, v4

    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->F:J

    move-wide/from16 v49, v3

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->G:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzr;->H:Ljava/lang/String;

    move-object/from16 v51, v3

    move-object/from16 v52, v4

    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzr;->I:J

    iget v0, v0, Lcom/google/android/gms/measurement/internal/zzr;->J:I

    new-instance v16, Lcom/google/android/gms/measurement/internal/zzr;

    move/from16 v55, v0

    move-wide/from16 v53, v3

    move-object/from16 v19, v5

    move-wide/from16 v20, v12

    move-object/from16 v17, v14

    invoke-direct/range {v16 .. v55}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    move-object/from16 v3, v16

    goto :goto_3

    :cond_2
    move-object/from16 v57, v4

    move/from16 v56, v13

    move-object v3, v0

    :goto_3
    instance-of v0, v15, Lcom/google/android/gms/measurement/internal/zzbg;

    if-eqz v0, :cond_5

    const-wide/16 v4, 0x0

    if-eqz v10, :cond_3

    :try_start_0
    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v6

    invoke-interface {v6}, Lu9/e;->a()J

    move-result-wide v12
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->b()J

    move-result-wide v16
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    move-wide/from16 v19, v12

    move-wide/from16 v12, v16

    goto :goto_4

    :catch_0
    move-exception v0

    move-wide/from16 v19, v12

    move-wide v12, v4

    goto :goto_6

    :catch_1
    move-exception v0

    move-wide v12, v4

    move-wide/from16 v19, v12

    goto :goto_6

    :cond_3
    move-wide v12, v4

    move-wide/from16 v19, v12

    :goto_4
    :try_start_2
    check-cast v15, Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-interface {v2, v15, v3}, Lnb/d5;->V(Lcom/google/android/gms/measurement/internal/zzbg;Lcom/google/android/gms/measurement/internal/zzr;)V

    if-eqz v10, :cond_4

    invoke-virtual/range {v57 .. v57}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v6, "Logging telemetry for logEvent from database"

    invoke-virtual {v0, v6}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-static {v0}, Lnb/s5;->a(Lnb/g7;)Lnb/s5;

    move-result-object v16

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v6

    invoke-interface {v6}, Lu9/e;->a()J

    move-result-wide v21

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->b()J

    move-result-wide v14

    sub-long/2addr v14, v12

    long-to-int v0, v14

    const v17, 0x8dcd

    const/16 v18, 0x0

    move/from16 v23, v0

    invoke-virtual/range {v16 .. v23}, Lnb/s5;->b(IIJJI)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    :cond_4
    :goto_5
    const/4 v5, 0x0

    goto/16 :goto_7

    :catch_2
    move-exception v0

    :goto_6
    iget-object v6, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->o()Lnb/u5;

    move-result-object v6

    const-string v14, "Failed to send event to the service"

    invoke-virtual {v6, v14, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz v10, :cond_4

    cmp-long v0, v19, v4

    if-eqz v0, :cond_4

    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-static {v0}, Lnb/s5;->a(Lnb/g7;)Lnb/s5;

    move-result-object v16

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v4

    invoke-interface {v4}, Lu9/e;->a()J

    move-result-wide v21

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->b()J

    move-result-wide v4

    sub-long/2addr v4, v12

    long-to-int v0, v4

    const v17, 0x8dcd

    const/16 v18, 0xd

    move/from16 v23, v0

    invoke-virtual/range {v16 .. v23}, Lnb/s5;->b(IIJJI)V

    goto :goto_5

    :cond_5
    instance-of v0, v15, Lcom/google/android/gms/measurement/internal/zzpl;

    if-eqz v0, :cond_6

    :try_start_3
    check-cast v15, Lcom/google/android/gms/measurement/internal/zzpl;

    invoke-interface {v2, v15, v3}, Lnb/d5;->j0(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_5

    :catch_3
    move-exception v0

    iget-object v4, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    const-string v5, "Failed to send user property to the service"

    invoke-virtual {v4, v5, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    instance-of v0, v15, Lcom/google/android/gms/measurement/internal/zzah;

    if-eqz v0, :cond_7

    :try_start_4
    check-cast v15, Lcom/google/android/gms/measurement/internal/zzah;

    invoke-interface {v2, v15, v3}, Lnb/d5;->q(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_5

    :catch_4
    move-exception v0

    iget-object v4, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    const-string v5, "Failed to send conditional user property to the service"

    invoke-virtual {v4, v5, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :cond_7
    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5, v6}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v4

    if-eqz v4, :cond_8

    instance-of v4, v15, Lcom/google/android/gms/measurement/internal/zzbe;

    if-eqz v4, :cond_8

    :try_start_5
    check-cast v15, Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/zzbe;->y3()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {v2, v0, v3}, Lnb/d5;->E1(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzr;)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_7

    :catch_5
    move-exception v0

    iget-object v4, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    const-string v6, "Failed to send default event parameters to the service"

    invoke-virtual {v4, v6, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v4, "Discarding data. Unrecognized parcel type."

    invoke-virtual {v0, v4}, Lnb/u5;->a(Ljava/lang/String;)V

    :goto_7
    add-int/lit8 v13, v56, 0x1

    move-object v0, v3

    move-object v12, v5

    move-object/from16 v4, v57

    const/16 v6, 0x64

    move-object/from16 v3, p2

    goto/16 :goto_2

    :cond_9
    move-object/from16 v57, v4

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v3, p2

    const/16 v6, 0x64

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public final c0(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V
    .locals 8

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {p0}, Lnb/tc;->R()Z

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->E()Lnb/n5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/n5;->p(Lcom/google/android/gms/measurement/internal/zzbg;)Z

    move-result v5

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v4

    new-instance v1, Lnb/ac;

    const/4 v3, 0x1

    move-object v2, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lnb/ac;-><init>(Lnb/tc;ZLcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d0(Lcom/google/android/gms/measurement/internal/zzah;)V
    .locals 8

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->E()Lnb/n5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/n5;->r(Lcom/google/android/gms/measurement/internal/zzah;)Z

    move-result v5

    new-instance v6, Lcom/google/android/gms/measurement/internal/zzah;

    invoke-direct {v6, p1}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Lcom/google/android/gms/measurement/internal/zzah;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v4

    new-instance v1, Lnb/bc;

    const/4 v3, 0x1

    move-object v2, p0

    move-object v7, p1

    invoke-direct/range {v1 .. v7}, Lnb/bc;-><init>(Lnb/tc;ZLcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzah;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e0(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v6

    new-instance v0, Lnb/cc;

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lnb/cc;-><init>(Lnb/tc;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v0}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f0(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v5

    new-instance v1, Lnb/dc;

    move-object v2, p0

    move-object v6, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lnb/dc;-><init>(Lnb/tc;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/internal/measurement/x1;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final g0(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v6

    new-instance v0, Lnb/ec;

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lnb/ec;-><init>(Lnb/tc;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;Z)V

    invoke-virtual {p0, v0}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final h0(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v5

    new-instance v1, Lnb/kb;

    move-object v2, p0

    move-object v7, p1

    move-object v3, p2

    move-object v4, p3

    move v6, p4

    invoke-direct/range {v1 .. v7}, Lnb/kb;-><init>(Lnb/tc;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/internal/measurement/x1;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i0(Ljava/util/concurrent/atomic/AtomicReference;Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v0

    new-instance v1, Lnb/pc;

    invoke-direct {v1, p0, p1, v0, p2}, Lnb/pc;-><init>(Lnb/tc;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final j0(Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzoo;)V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v0

    new-instance v1, Lnb/qc;

    invoke-direct {v1, p0, p1, v0, p2}, Lnb/qc;-><init>(Lnb/tc;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzoo;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k0(Lcom/google/android/gms/measurement/internal/zzaf;)V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnb/rc;

    invoke-direct {v1, p0, v0, p1}, Lnb/rc;-><init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final l0()Lcom/google/android/gms/measurement/internal/zzao;
    .locals 4

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/tc;->d:Lnb/d5;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lnb/tc;->w()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v2, "Failed to get consents; not connected to service yet."

    invoke-virtual {v0, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v2

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-interface {v0, v2}, Lnb/d5;->C1(Lcom/google/android/gms/measurement/internal/zzr;)Lcom/google/android/gms/measurement/internal/zzao;

    move-result-object v0

    invoke-direct {p0}, Lnb/tc;->S()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Failed to get consents; remote exception"

    invoke-virtual {v2, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final o(Lcom/google/android/gms/measurement/internal/zzpl;)V
    .locals 3

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {p0}, Lnb/tc;->R()Z

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->E()Lnb/n5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnb/n5;->q(Lcom/google/android/gms/measurement/internal/zzpl;)Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v1

    new-instance v2, Lnb/nb;

    invoke-direct {v2, p0, v1, v0, p1}, Lnb/nb;-><init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/measurement/internal/zzpl;)V

    invoke-virtual {p0, v2}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final p()V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v0

    invoke-virtual {p0}, Lnb/tc;->R()Z

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->E()Lnb/n5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/n5;->o()V

    new-instance v1, Lnb/ob;

    invoke-direct {v1, p0, v0}, Lnb/ob;-><init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final q(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v0

    new-instance v1, Lnb/pb;

    invoke-direct {v1, p0, p1, v0}, Lnb/pb;-><init>(Lnb/tc;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final r(Lcom/google/android/gms/internal/measurement/x1;)V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v0

    new-instance v1, Lnb/qb;

    invoke-direct {v1, p0, v0, p1}, Lnb/qb;-><init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/internal/measurement/x1;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final s()V
    .locals 5

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v1

    invoke-virtual {p0}, Lnb/tc;->R()Z

    iget-object v2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->w()Lnb/k;

    move-result-object v2

    const/4 v3, 0x0

    sget-object v4, Lnb/z4;->c1:Lnb/y4;

    invoke-virtual {v2, v3, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    iget-object v2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->E()Lnb/n5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/n5;->u()Z

    new-instance v2, Lnb/rb;

    invoke-direct {v2, p0, v1, v0}, Lnb/rb;-><init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;Z)V

    invoke-virtual {p0, v2}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t()V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v0

    new-instance v1, Lnb/sb;

    invoke-direct {v1, p0, v0}, Lnb/sb;-><init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;)V

    invoke-virtual {p0, v1}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final u(Lnb/bb;)V
    .locals 1

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    new-instance v0, Lnb/ub;

    invoke-direct {v0, p0, p1}, Lnb/ub;-><init>(Lnb/tc;Lnb/bb;)V

    invoke-virtual {p0, v0}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final v(Landroid/os/Bundle;)V
    .locals 7

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    new-instance v5, Lcom/google/android/gms/measurement/internal/zzbe;

    invoke-direct {v5, p1}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lnb/tc;->R()Z

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lnb/z4;->c1:Lnb/y4;

    invoke-virtual {v0, v1, v2}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->E()Lnb/n5;

    move-result-object v0

    invoke-virtual {v0, v5}, Lnb/n5;->s(Lcom/google/android/gms/measurement/internal/zzbe;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    invoke-virtual {p0, v1}, Lnb/tc;->V(Z)Lcom/google/android/gms/measurement/internal/zzr;

    move-result-object v3

    new-instance v0, Lnb/vb;

    const/4 v2, 0x1

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lnb/vb;-><init>(Lnb/tc;ZLcom/google/android/gms/measurement/internal/zzr;ZLcom/google/android/gms/measurement/internal/zzbe;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lnb/tc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final w()V
    .locals 5

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {p0}, Lnb/tc;->W()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnb/tc;->y()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k;->m()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v3

    const-string v4, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const/high16 v3, 0x10000

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.gms.measurement.START"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v2, Landroid/content/ComponentName;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v0, p0, Lnb/tc;->c:Lnb/nc;

    invoke-virtual {v0, v1}, Lnb/nc;->a(Landroid/content/Intent;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Lnb/tc;->c:Lnb/nc;

    invoke-virtual {v0}, Lnb/nc;->c()V

    return-void
.end method

.method public final x()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lnb/tc;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final y()Z
    .locals 8

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/tc;->e:Ljava/lang/Boolean;

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "use_service"

    invoke-interface {v2, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_0
    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    iget-object v5, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->L()Lnb/k5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/k5;->v()I

    move-result v5

    if-ne v5, v2, :cond_2

    :goto_1
    move v4, v2

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->w()Lnb/u5;

    move-result-object v5

    const-string v6, "Checking service availability"

    invoke-virtual {v5, v6}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v5

    const v6, 0xbdfcb8

    invoke-virtual {v5, v6}, Lnb/ve;->X(I)I

    move-result v5

    if-eqz v5, :cond_a

    if-eq v5, v2, :cond_9

    const/4 v6, 0x2

    if-eq v5, v6, :cond_6

    const/4 v1, 0x3

    if-eq v5, v1, :cond_5

    const/16 v1, 0x9

    if-eq v5, v1, :cond_4

    const/16 v1, 0x12

    if-eq v5, v1, :cond_3

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v5, "Unexpected service status"

    invoke-virtual {v1, v5, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    move v2, v4

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    const-string v4, "Service updating"

    invoke-virtual {v1, v4}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    const-string v2, "Service invalid"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    const-string v2, "Service disabled"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->v()Lnb/u5;

    move-result-object v5

    const-string v6, "Service container out of date"

    invoke-virtual {v5, v6}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v5

    invoke-virtual {v5}, Lnb/ve;->W()I

    move-result v5

    const/16 v6, 0x4423

    if-ge v5, v6, :cond_7

    goto :goto_4

    :cond_7
    if-nez v1, :cond_8

    goto :goto_3

    :cond_8
    move v2, v4

    :goto_3
    move v7, v4

    move v4, v2

    move v2, v7

    goto :goto_4

    :cond_9
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v5, "Service missing"

    invoke-virtual {v1, v5}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_4

    :cond_a
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v4, "Service available"

    invoke-virtual {v1, v4}, Lnb/u5;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :goto_4
    if-nez v4, :cond_b

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k;->m()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v1, "No way to upload. Consider using the full version of Analytics"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    if-eqz v2, :cond_c

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_c
    :goto_5
    move v2, v4

    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lnb/tc;->e:Ljava/lang/Boolean;

    :cond_d
    iget-object v0, p0, Lnb/tc;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final z(Lnb/d5;)V
    .locals 0

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/tc;->d:Lnb/d5;

    invoke-direct {p0}, Lnb/tc;->S()V

    invoke-virtual {p0}, Lnb/tc;->U()V

    return-void
.end method
