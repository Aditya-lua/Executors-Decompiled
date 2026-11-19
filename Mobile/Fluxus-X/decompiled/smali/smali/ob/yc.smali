.class public final Lob/yc;
.super Lob/g5;
.source "SourceFile"


# instance fields
.field public final c:Lob/sc;

.field public d:Lob/i5;

.field public volatile e:Ljava/lang/Boolean;

.field public final f:Lob/z;

.field public g:Ljava/util/concurrent/ScheduledExecutorService;

.field public final h:Lob/ud;

.field public final i:Ljava/util/List;

.field public final j:Lob/z;


# direct methods
.method public constructor <init>(Lob/l7;)V
    .locals 2

    invoke-direct {p0, p1}, Lob/g5;-><init>(Lob/l7;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lob/yc;->i:Ljava/util/List;

    new-instance v0, Lob/ud;

    invoke-virtual {p1}, Lob/l7;->e()Lv9/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lob/ud;-><init>(Lv9/e;)V

    iput-object v0, p0, Lob/yc;->h:Lob/ud;

    new-instance v0, Lob/sc;

    invoke-direct {v0, p0}, Lob/sc;-><init>(Lob/yc;)V

    iput-object v0, p0, Lob/yc;->c:Lob/sc;

    new-instance v0, Lob/yb;

    invoke-direct {v0, p0, p1}, Lob/yb;-><init>(Lob/yc;Lob/q8;)V

    iput-object v0, p0, Lob/yc;->f:Lob/z;

    new-instance v0, Lob/cc;

    invoke-direct {v0, p0, p1}, Lob/cc;-><init>(Lob/yc;Lob/q8;)V

    iput-object v0, p0, Lob/yc;->j:Lob/z;

    return-void
.end method

.method private final S()V
    .locals 3

    invoke-virtual {p0}, Lob/o8;->h()V

    iget-object v0, p0, Lob/yc;->h:Lob/ud;

    invoke-virtual {v0}, Lob/ud;->a()V

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->w()Lob/m;

    sget-object v0, Lob/e5;->Z:Lob/d5;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lob/yc;->f:Lob/z;

    invoke-virtual {v2, v0, v1}, Lob/z;->b(J)V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 3

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    iget-object v0, p0, Lob/yc;->c:Lob/sc;

    invoke-virtual {v0}, Lob/sc;->b()V

    :try_start_0
    invoke-static {}, Lu9/a;->b()Lu9/a;

    move-result-object v1

    iget-object v2, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lu9/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lob/yc;->d:Lob/i5;

    return-void
.end method

.method public final B(Lcom/google/android/gms/internal/measurement/x1;Lob/i0;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->C()Lob/ff;

    move-result-object v1

    const v2, 0xbdfcb8

    invoke-virtual {v1, v2}, Lob/ff;->X(I)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object p2

    invoke-virtual {p2}, Lob/b6;->r()Lob/z5;

    move-result-object p2

    const-string p3, "Not bundling data. Service unavailable or out of date"

    invoke-virtual {p2, p3}, Lob/z5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lob/l7;->C()Lob/ff;

    move-result-object p2

    const/4 p3, 0x0

    new-array p3, p3, [B

    invoke-virtual {p2, p1, p3}, Lob/ff;->d0(Lcom/google/android/gms/internal/measurement/x1;[B)V

    return-void

    :cond_0
    new-instance v0, Lob/bc;

    invoke-direct {v0, p0, p2, p3, p1}, Lob/bc;-><init>(Lob/yc;Lob/i0;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/x1;)V

    invoke-virtual {p0, v0}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final C()Z
    .locals 4

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    invoke-virtual {p0}, Lob/yc;->y()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->C()Lob/ff;

    move-result-object v0

    invoke-virtual {v0}, Lob/ff;->W()I

    move-result v0

    sget-object v2, Lob/e5;->K0:Lob/d5;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    invoke-virtual {p0}, Lob/yc;->y()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->C()Lob/ff;

    move-result-object v0

    invoke-virtual {v0}, Lob/ff;->W()I

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

    iget-object v0, p0, Lob/yc;->d:Lob/i5;

    if-nez v0, :cond_0

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    const-string v1, "Failed to send storage consent settings to service"

    invoke-virtual {v0, v1}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v1}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v1

    invoke-static {v1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1}, Lob/i5;->t0(Lob/hf;)V

    invoke-direct {p0}, Lob/yc;->S()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    const-string v2, "Failed to send storage consent settings to the service"

    invoke-virtual {v1, v2, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic F()V
    .locals 3

    iget-object v0, p0, Lob/yc;->d:Lob/i5;

    if-nez v0, :cond_0

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    const-string v1, "Failed to send Dma consent settings to service"

    invoke-virtual {v0, v1}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v1}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v1

    invoke-static {v1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1}, Lob/i5;->I0(Lob/hf;)V

    invoke-direct {p0}, Lob/yc;->S()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    const-string v2, "Failed to send Dma consent settings to the service"

    invoke-virtual {v1, v2, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic G(Ljava/util/concurrent/atomic/AtomicReference;Lob/hf;Landroid/os/Bundle;)V
    .locals 2

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lob/yc;->d:Lob/i5;

    if-nez v0, :cond_0

    iget-object p2, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {p2}, Lob/l7;->a()Lob/b6;

    move-result-object p2

    invoke-virtual {p2}, Lob/b6;->o()Lob/z5;

    move-result-object p2

    const-string p3, "Failed to request trigger URIs; not connected to service"

    invoke-virtual {p2, p3}, Lob/z5;->a(Ljava/lang/String;)V
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
    invoke-static {p2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lob/qb;

    invoke-direct {v1, p0, p1}, Lob/qb;-><init>(Lob/yc;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v0, p2, p3, v1}, Lob/i5;->H(Lob/hf;Landroid/os/Bundle;Lob/l5;)V

    invoke-direct {p0}, Lob/yc;->S()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_0
    :try_start_3
    iget-object p3, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {p3}, Lob/l7;->a()Lob/b6;

    move-result-object p3

    invoke-virtual {p3}, Lob/b6;->o()Lob/z5;

    move-result-object p3

    const-string v0, "Failed to request trigger URIs; remote exception"

    invoke-virtual {p3, v0, p2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

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

.method public final synthetic H(Ljava/util/concurrent/atomic/AtomicReference;Lob/hf;Lob/ce;)V
    .locals 2

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lob/yc;->d:Lob/i5;

    if-nez v0, :cond_0

    iget-object p2, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {p2}, Lob/l7;->a()Lob/b6;

    move-result-object p2

    invoke-virtual {p2}, Lob/b6;->o()Lob/z5;

    move-result-object p2

    const-string p3, "[sgtm] Failed to get upload batches; not connected to service"

    invoke-virtual {p2, p3}, Lob/z5;->a(Ljava/lang/String;)V
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
    invoke-static {p2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lob/rb;

    invoke-direct {v1, p0, p1}, Lob/rb;-><init>(Lob/yc;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v0, p2, p3, v1}, Lob/i5;->y(Lob/hf;Lob/ce;Lob/o5;)V

    invoke-direct {p0}, Lob/yc;->S()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_0
    :try_start_3
    iget-object p3, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {p3}, Lob/l7;->a()Lob/b6;

    move-result-object p3

    invoke-virtual {p3}, Lob/b6;->o()Lob/z5;

    move-result-object p3

    const-string v0, "[sgtm] Failed to get upload batches; remote exception"

    invoke-virtual {p3, v0, p2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

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

.method public final synthetic I(Lob/hf;Lob/g;)V
    .locals 3

    iget-object v0, p0, Lob/yc;->d:Lob/i5;

    if-nez v0, :cond_0

    iget-object p1, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->o()Lob/z5;

    move-result-object p1

    const-string p2, "[sgtm] Discarding data. Failed to update batch upload status."

    invoke-virtual {p1, p2}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    invoke-interface {v0, p1, p2}, Lob/i5;->d0(Lob/hf;Lob/g;)V

    invoke-direct {p0}, Lob/yc;->S()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    iget-wide v1, p2, Lob/g;->f:J

    const-string p2, "[sgtm] Failed to update batch upload status, rowId, exception"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p2, v1, p1}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic J()V
    .locals 0

    invoke-direct {p0}, Lob/yc;->S()V

    return-void
.end method

.method public final synthetic K(Landroid/content/ComponentName;)V
    .locals 2

    invoke-virtual {p0}, Lob/o8;->h()V

    iget-object v0, p0, Lob/yc;->d:Lob/i5;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lob/yc;->d:Lob/i5;

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->w()Lob/z5;

    move-result-object v0

    const-string v1, "Disconnected from device MeasurementService"

    invoke-virtual {v0, v1, p1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/yc;->w()V

    :cond_0
    return-void
.end method

.method public final synthetic L()V
    .locals 0

    invoke-virtual {p0}, Lob/yc;->U()V

    return-void
.end method

.method public final synthetic M()Lob/sc;
    .locals 1

    iget-object v0, p0, Lob/yc;->c:Lob/sc;

    return-object v0
.end method

.method public final synthetic N()Lob/i5;
    .locals 1

    iget-object v0, p0, Lob/yc;->d:Lob/i5;

    return-object v0
.end method

.method public final synthetic O(Lob/i5;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lob/yc;->d:Lob/i5;

    return-void
.end method

.method public final synthetic P()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lob/yc;->g:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public final synthetic Q(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    iput-object p1, p0, Lob/yc;->g:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public final R()Z
    .locals 1

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->c()Lob/f;

    const/4 v0, 0x1

    return v0
.end method

.method public final T(Ljava/lang/Runnable;)V
    .locals 6

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/yc;->W()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lob/yc;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    int-to-long v1, v1

    iget-object v3, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v3}, Lob/l7;->w()Lob/m;

    const-wide/16 v4, 0x3e8

    cmp-long v1, v1, v4

    if-ltz v1, :cond_1

    invoke-virtual {v3}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->o()Lob/z5;

    move-result-object p1

    const-string v0, "Discarding data. Max runnable queue size reached"

    invoke-virtual {p1, v0}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lob/yc;->j:Lob/z;

    const-wide/32 v0, 0xea60

    invoke-virtual {p1, v0, v1}, Lob/z;->b(J)V

    invoke-virtual {p0}, Lob/yc;->w()V

    return-void
.end method

.method public final U()V
    .locals 4

    invoke-virtual {p0}, Lob/o8;->h()V

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->w()Lob/z5;

    move-result-object v0

    iget-object v1, p0, Lob/yc;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Processing queued up service tasks"

    invoke-virtual {v0, v3, v2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

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

    iget-object v2, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->o()Lob/z5;

    move-result-object v2

    const-string v3, "Task exception while flushing queue"

    invoke-virtual {v2, v3, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lob/yc;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lob/yc;->j:Lob/z;

    invoke-virtual {v0}, Lob/z;->d()V

    return-void
.end method

.method public final V(Z)Lob/hf;
    .locals 5

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->c()Lob/f;

    iget-object v1, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->L()Lob/p5;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    iget-object p1, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    iget-object v0, v0, Lob/p6;->e:Lob/n6;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lob/l7;->x()Lob/p6;

    move-result-object p1

    iget-object p1, p1, Lob/p6;->e:Lob/n6;

    invoke-virtual {p1}, Lob/n6;->b()Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object v0, Lob/p6;->A:Landroid/util/Pair;

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
    invoke-virtual {v1, v2}, Lob/p5;->o(Ljava/lang/String;)Lob/hf;

    move-result-object p1

    return-object p1
.end method

.method public final W()Z
    .locals 1

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    iget-object v0, p0, Lob/yc;->d:Lob/i5;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final X()V
    .locals 2

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v0

    new-instance v1, Lob/dc;

    invoke-direct {v1, p0, v0}, Lob/dc;-><init>(Lob/yc;Lob/hf;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final Y(Z)V
    .locals 1

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    invoke-virtual {p0}, Lob/yc;->C()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lob/yc;->V(Z)Lob/hf;

    move-result-object p1

    new-instance v0, Lob/ec;

    invoke-direct {v0, p0, p1}, Lob/ec;-><init>(Lob/yc;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/yc;->T(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final Z(Z)V
    .locals 0

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    new-instance p1, Lob/xc;

    invoke-direct {p1, p0}, Lob/xc;-><init>(Lob/yc;)V

    invoke-virtual {p0, p1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a0()V
    .locals 1

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    new-instance v0, Lob/tc;

    invoke-direct {v0, p0}, Lob/tc;-><init>(Lob/yc;)V

    invoke-virtual {p0, v0}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b0(Lob/i5;Lp9/a;Lob/hf;)V
    .locals 58

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-virtual {v1}, Lob/o8;->h()V

    invoke-virtual {v1}, Lob/g5;->j()V

    invoke-virtual {v1}, Lob/yc;->R()Z

    iget-object v4, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v4}, Lob/l7;->w()Lob/m;

    const/16 v6, 0x64

    move-object/from16 v0, p3

    move v8, v6

    const/4 v7, 0x0

    :goto_0
    const/16 v9, 0x3e9

    if-ge v7, v9, :cond_a

    if-ne v8, v6, :cond_a

    iget-object v8, v1, Lob/o8;->a:Lob/l7;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, Lob/l7;->E()Lob/s5;

    move-result-object v8

    invoke-virtual {v8, v6}, Lob/s5;->t(I)Ljava/util/List;

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

    iget-object v10, v0, Lob/hf;->h:Ljava/lang/String;

    iget-wide v11, v0, Lob/hf;->o:J

    new-instance v13, Lob/r5;

    invoke-direct {v13, v3, v10, v11, v12}, Lob/r5;-><init>(Lp9/a;Ljava/lang/String;J)V

    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v4}, Lob/l7;->w()Lob/m;

    move-result-object v10

    sget-object v11, Lob/e5;->P0:Lob/d5;

    const/4 v12, 0x0

    invoke-virtual {v10, v12, v11}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v10

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v11

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v11, :cond_9

    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lob/r5;

    iget-object v15, v14, Lob/r5;->a:Lp9/a;

    invoke-virtual {v4}, Lob/l7;->w()Lob/m;

    move-result-object v5

    sget-object v6, Lob/e5;->c1:Lob/d5;

    invoke-virtual {v5, v12, v6}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, v14, Lob/r5;->b:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-nez v16, :cond_2

    move/from16 v56, v13

    iget-wide v12, v14, Lob/r5;->c:J

    iget-object v14, v0, Lob/hf;->f:Ljava/lang/String;

    iget-object v3, v0, Lob/hf;->g:Ljava/lang/String;

    move-object/from16 v18, v3

    iget-object v3, v0, Lob/hf;->i:Ljava/lang/String;

    move-object/from16 v22, v3

    move-object/from16 v57, v4

    iget-wide v3, v0, Lob/hf;->j:J

    move-wide/from16 v23, v3

    iget-wide v3, v0, Lob/hf;->k:J

    move-wide/from16 v25, v3

    iget-object v3, v0, Lob/hf;->l:Ljava/lang/String;

    iget-boolean v4, v0, Lob/hf;->m:Z

    move-object/from16 v27, v3

    iget-boolean v3, v0, Lob/hf;->n:Z

    move/from16 v29, v3

    iget-object v3, v0, Lob/hf;->p:Ljava/lang/String;

    move-object/from16 v30, v3

    move/from16 v28, v4

    iget-wide v3, v0, Lob/hf;->q:J

    move-wide/from16 v31, v3

    iget v3, v0, Lob/hf;->r:I

    iget-boolean v4, v0, Lob/hf;->s:Z

    move/from16 v33, v3

    iget-boolean v3, v0, Lob/hf;->t:Z

    move/from16 v35, v3

    iget-object v3, v0, Lob/hf;->u:Ljava/lang/Boolean;

    move-object/from16 v36, v3

    move/from16 v34, v4

    iget-wide v3, v0, Lob/hf;->v:J

    move-wide/from16 v37, v3

    iget-object v3, v0, Lob/hf;->w:Ljava/util/List;

    iget-object v4, v0, Lob/hf;->x:Ljava/lang/String;

    move-object/from16 v39, v3

    iget-object v3, v0, Lob/hf;->y:Ljava/lang/String;

    move-object/from16 v41, v3

    iget-object v3, v0, Lob/hf;->z:Ljava/lang/String;

    move-object/from16 v42, v3

    iget-boolean v3, v0, Lob/hf;->A:Z

    move/from16 v43, v3

    move-object/from16 v40, v4

    iget-wide v3, v0, Lob/hf;->B:J

    move-wide/from16 v44, v3

    iget v3, v0, Lob/hf;->C:I

    iget-object v4, v0, Lob/hf;->D:Ljava/lang/String;

    move/from16 v46, v3

    iget v3, v0, Lob/hf;->E:I

    move/from16 v48, v3

    move-object/from16 v47, v4

    iget-wide v3, v0, Lob/hf;->F:J

    move-wide/from16 v49, v3

    iget-object v3, v0, Lob/hf;->G:Ljava/lang/String;

    iget-object v4, v0, Lob/hf;->H:Ljava/lang/String;

    move-object/from16 v51, v3

    move-object/from16 v52, v4

    iget-wide v3, v0, Lob/hf;->I:J

    iget v0, v0, Lob/hf;->J:I

    new-instance v16, Lob/hf;

    move/from16 v55, v0

    move-wide/from16 v53, v3

    move-object/from16 v19, v5

    move-wide/from16 v20, v12

    move-object/from16 v17, v14

    invoke-direct/range {v16 .. v55}, Lob/hf;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    move-object/from16 v3, v16

    goto :goto_3

    :cond_2
    move-object/from16 v57, v4

    move/from16 v56, v13

    move-object v3, v0

    :goto_3
    instance-of v0, v15, Lob/i0;

    if-eqz v0, :cond_5

    const-wide/16 v4, 0x0

    if-eqz v10, :cond_3

    :try_start_0
    iget-object v0, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v6

    invoke-interface {v6}, Lv9/e;->a()J

    move-result-wide v12
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v0

    invoke-interface {v0}, Lv9/e;->b()J

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
    check-cast v15, Lob/i0;

    invoke-interface {v2, v15, v3}, Lob/i5;->y1(Lob/i0;Lob/hf;)V

    if-eqz v10, :cond_4

    invoke-virtual/range {v57 .. v57}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->w()Lob/z5;

    move-result-object v0

    const-string v6, "Logging telemetry for logEvent from database"

    invoke-virtual {v0, v6}, Lob/z5;->a(Ljava/lang/String;)V

    iget-object v0, v1, Lob/o8;->a:Lob/l7;

    invoke-static {v0}, Lob/x5;->a(Lob/l7;)Lob/x5;

    move-result-object v16

    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v6

    invoke-interface {v6}, Lv9/e;->a()J

    move-result-wide v21

    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v0

    invoke-interface {v0}, Lv9/e;->b()J

    move-result-wide v14

    sub-long/2addr v14, v12

    long-to-int v0, v14

    const v17, 0x8dcd

    const/16 v18, 0x0

    move/from16 v23, v0

    invoke-virtual/range {v16 .. v23}, Lob/x5;->b(IIJJI)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    :cond_4
    :goto_5
    const/4 v5, 0x0

    goto/16 :goto_7

    :catch_2
    move-exception v0

    :goto_6
    iget-object v6, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v6}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->o()Lob/z5;

    move-result-object v6

    const-string v14, "Failed to send event to the service"

    invoke-virtual {v6, v14, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz v10, :cond_4

    cmp-long v0, v19, v4

    if-eqz v0, :cond_4

    iget-object v0, v1, Lob/o8;->a:Lob/l7;

    invoke-static {v0}, Lob/x5;->a(Lob/l7;)Lob/x5;

    move-result-object v16

    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v4

    invoke-interface {v4}, Lv9/e;->a()J

    move-result-wide v21

    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v0

    invoke-interface {v0}, Lv9/e;->b()J

    move-result-wide v4

    sub-long/2addr v4, v12

    long-to-int v0, v4

    const v17, 0x8dcd

    const/16 v18, 0xd

    move/from16 v23, v0

    invoke-virtual/range {v16 .. v23}, Lob/x5;->b(IIJJI)V

    goto :goto_5

    :cond_5
    instance-of v0, v15, Lob/bf;

    if-eqz v0, :cond_6

    :try_start_3
    check-cast v15, Lob/bf;

    invoke-interface {v2, v15, v3}, Lob/i5;->G(Lob/bf;Lob/hf;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_5

    :catch_3
    move-exception v0

    iget-object v4, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v4}, Lob/l7;->a()Lob/b6;

    move-result-object v4

    invoke-virtual {v4}, Lob/b6;->o()Lob/z5;

    move-result-object v4

    const-string v5, "Failed to send user property to the service"

    invoke-virtual {v4, v5, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    instance-of v0, v15, Lob/i;

    if-eqz v0, :cond_7

    :try_start_4
    check-cast v15, Lob/i;

    invoke-interface {v2, v15, v3}, Lob/i5;->F1(Lob/i;Lob/hf;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_5

    :catch_4
    move-exception v0

    iget-object v4, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v4}, Lob/l7;->a()Lob/b6;

    move-result-object v4

    invoke-virtual {v4}, Lob/b6;->o()Lob/z5;

    move-result-object v4

    const-string v5, "Failed to send conditional user property to the service"

    invoke-virtual {v4, v5, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :cond_7
    iget-object v0, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->w()Lob/m;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5, v6}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v4

    if-eqz v4, :cond_8

    instance-of v4, v15, Lob/g0;

    if-eqz v4, :cond_8

    :try_start_5
    check-cast v15, Lob/g0;

    invoke-virtual {v15}, Lob/g0;->D3()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {v2, v0, v3}, Lob/i5;->L1(Landroid/os/Bundle;Lob/hf;)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_7

    :catch_5
    move-exception v0

    iget-object v4, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v4}, Lob/l7;->a()Lob/b6;

    move-result-object v4

    invoke-virtual {v4}, Lob/b6;->o()Lob/z5;

    move-result-object v4

    const-string v6, "Failed to send default event parameters to the service"

    invoke-virtual {v4, v6, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    const-string v4, "Discarding data. Unrecognized parcel type."

    invoke-virtual {v0, v4}, Lob/z5;->a(Ljava/lang/String;)V

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

.method public final c0(Lob/i0;Ljava/lang/String;)V
    .locals 8

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    invoke-virtual {p0}, Lob/yc;->R()Z

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->E()Lob/s5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lob/s5;->p(Lob/i0;)Z

    move-result v5

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v4

    new-instance v1, Lob/fc;

    const/4 v3, 0x1

    move-object v2, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lob/fc;-><init>(Lob/yc;ZLob/hf;ZLob/i0;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d0(Lob/i;)V
    .locals 8

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->c()Lob/f;

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->E()Lob/s5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lob/s5;->r(Lob/i;)Z

    move-result v5

    new-instance v6, Lob/i;

    invoke-direct {v6, p1}, Lob/i;-><init>(Lob/i;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v4

    new-instance v1, Lob/gc;

    const/4 v3, 0x1

    move-object v2, p0

    move-object v7, p1

    invoke-direct/range {v1 .. v7}, Lob/gc;-><init>(Lob/yc;ZLob/hf;ZLob/i;Lob/i;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e0(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v6

    new-instance v0, Lob/hc;

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lob/hc;-><init>(Lob/yc;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lob/hf;)V

    invoke-virtual {p0, v0}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f0(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v5

    new-instance v1, Lob/ic;

    move-object v2, p0

    move-object v6, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, Lob/ic;-><init>(Lob/yc;Ljava/lang/String;Ljava/lang/String;Lob/hf;Lcom/google/android/gms/internal/measurement/x1;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final g0(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v6

    new-instance v0, Lob/jc;

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lob/jc;-><init>(Lob/yc;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lob/hf;Z)V

    invoke-virtual {p0, v0}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final h0(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v5

    new-instance v1, Lob/pb;

    move-object v2, p0

    move-object v7, p1

    move-object v3, p2

    move-object v4, p3

    move v6, p4

    invoke-direct/range {v1 .. v7}, Lob/pb;-><init>(Lob/yc;Ljava/lang/String;Ljava/lang/String;Lob/hf;ZLcom/google/android/gms/internal/measurement/x1;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i0(Ljava/util/concurrent/atomic/AtomicReference;Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v0

    new-instance v1, Lob/uc;

    invoke-direct {v1, p0, p1, v0, p2}, Lob/uc;-><init>(Lob/yc;Ljava/util/concurrent/atomic/AtomicReference;Lob/hf;Landroid/os/Bundle;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final j0(Ljava/util/concurrent/atomic/AtomicReference;Lob/ce;)V
    .locals 2

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v0

    new-instance v1, Lob/vc;

    invoke-direct {v1, p0, p1, v0, p2}, Lob/vc;-><init>(Lob/yc;Ljava/util/concurrent/atomic/AtomicReference;Lob/hf;Lob/ce;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k0(Lob/g;)V
    .locals 2

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v0

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lob/wc;

    invoke-direct {v1, p0, v0, p1}, Lob/wc;-><init>(Lob/yc;Lob/hf;Lob/g;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final l0()Lob/p;
    .locals 4

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    iget-object v0, p0, Lob/yc;->d:Lob/i5;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lob/yc;->w()V

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->v()Lob/z5;

    move-result-object v0

    const-string v2, "Failed to get consents; not connected to service yet."

    invoke-virtual {v0, v2}, Lob/z5;->a(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v2

    invoke-static {v2}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-interface {v0, v2}, Lob/i5;->Y(Lob/hf;)Lob/p;

    move-result-object v0

    invoke-direct {p0}, Lob/yc;->S()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v2, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->o()Lob/z5;

    move-result-object v2

    const-string v3, "Failed to get consents; remote exception"

    invoke-virtual {v2, v3, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final o(Lob/bf;)V
    .locals 3

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    invoke-virtual {p0}, Lob/yc;->R()Z

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->E()Lob/s5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lob/s5;->q(Lob/bf;)Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v1

    new-instance v2, Lob/sb;

    invoke-direct {v2, p0, v1, v0, p1}, Lob/sb;-><init>(Lob/yc;Lob/hf;ZLob/bf;)V

    invoke-virtual {p0, v2}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final p()V
    .locals 2

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v0

    invoke-virtual {p0}, Lob/yc;->R()Z

    iget-object v1, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->E()Lob/s5;

    move-result-object v1

    invoke-virtual {v1}, Lob/s5;->o()V

    new-instance v1, Lob/tb;

    invoke-direct {v1, p0, v0}, Lob/tb;-><init>(Lob/yc;Lob/hf;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final q(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 2

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v0

    new-instance v1, Lob/ub;

    invoke-direct {v1, p0, p1, v0}, Lob/ub;-><init>(Lob/yc;Ljava/util/concurrent/atomic/AtomicReference;Lob/hf;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final r(Lcom/google/android/gms/internal/measurement/x1;)V
    .locals 2

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v0

    new-instance v1, Lob/vb;

    invoke-direct {v1, p0, v0, p1}, Lob/vb;-><init>(Lob/yc;Lob/hf;Lcom/google/android/gms/internal/measurement/x1;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final s()V
    .locals 5

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v1

    invoke-virtual {p0}, Lob/yc;->R()Z

    iget-object v2, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->w()Lob/m;

    move-result-object v2

    const/4 v3, 0x0

    sget-object v4, Lob/e5;->c1:Lob/d5;

    invoke-virtual {v2, v3, v4}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    iget-object v2, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->E()Lob/s5;

    move-result-object v2

    invoke-virtual {v2}, Lob/s5;->u()Z

    new-instance v2, Lob/wb;

    invoke-direct {v2, p0, v1, v0}, Lob/wb;-><init>(Lob/yc;Lob/hf;Z)V

    invoke-virtual {p0, v2}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t()V
    .locals 2

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v0

    new-instance v1, Lob/xb;

    invoke-direct {v1, p0, v0}, Lob/xb;-><init>(Lob/yc;Lob/hf;)V

    invoke-virtual {p0, v1}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final u(Lob/gb;)V
    .locals 1

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    new-instance v0, Lob/zb;

    invoke-direct {v0, p0, p1}, Lob/zb;-><init>(Lob/yc;Lob/gb;)V

    invoke-virtual {p0, v0}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final v(Landroid/os/Bundle;)V
    .locals 7

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    new-instance v5, Lob/g0;

    invoke-direct {v5, p1}, Lob/g0;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lob/yc;->R()Z

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->w()Lob/m;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lob/e5;->c1:Lob/d5;

    invoke-virtual {v0, v1, v2}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->E()Lob/s5;

    move-result-object v0

    invoke-virtual {v0, v5}, Lob/s5;->s(Lob/g0;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    invoke-virtual {p0, v1}, Lob/yc;->V(Z)Lob/hf;

    move-result-object v3

    new-instance v0, Lob/ac;

    const/4 v2, 0x1

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lob/ac;-><init>(Lob/yc;ZLob/hf;ZLob/g0;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lob/yc;->T(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final w()V
    .locals 5

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    invoke-virtual {p0}, Lob/yc;->W()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lob/yc;->y()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->w()Lob/m;

    move-result-object v1

    invoke-virtual {v1}, Lob/m;->m()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lob/l7;->c()Lob/f;

    invoke-virtual {v0}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0}, Lob/l7;->d()Landroid/content/Context;

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

    invoke-virtual {v0}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0}, Lob/l7;->c()Lob/f;

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v0, p0, Lob/yc;->c:Lob/sc;

    invoke-virtual {v0, v1}, Lob/sc;->a(Landroid/content/Intent;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    const-string v1, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    invoke-virtual {v0, v1}, Lob/z5;->a(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Lob/yc;->c:Lob/sc;

    invoke-virtual {v0}, Lob/sc;->c()V

    return-void
.end method

.method public final x()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lob/yc;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final y()Z
    .locals 8

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    iget-object v0, p0, Lob/yc;->e:Ljava/lang/Boolean;

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g5;->j()V

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v1

    invoke-virtual {v1}, Lob/o8;->h()V

    invoke-virtual {v1}, Lob/p6;->p()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "use_service"

    invoke-interface {v2, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lob/p6;->p()Landroid/content/SharedPreferences;

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
    invoke-virtual {v0}, Lob/l7;->c()Lob/f;

    iget-object v5, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v5}, Lob/l7;->L()Lob/p5;

    move-result-object v5

    invoke-virtual {v5}, Lob/p5;->v()I

    move-result v5

    if-ne v5, v2, :cond_2

    :goto_1
    move v4, v2

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v5

    invoke-virtual {v5}, Lob/b6;->w()Lob/z5;

    move-result-object v5

    const-string v6, "Checking service availability"

    invoke-virtual {v5, v6}, Lob/z5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lob/l7;->C()Lob/ff;

    move-result-object v5

    const v6, 0xbdfcb8

    invoke-virtual {v5, v6}, Lob/ff;->X(I)I

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

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->r()Lob/z5;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v5, "Unexpected service status"

    invoke-virtual {v1, v5, v2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    move v2, v4

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->r()Lob/z5;

    move-result-object v1

    const-string v4, "Service updating"

    invoke-virtual {v1, v4}, Lob/z5;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->r()Lob/z5;

    move-result-object v1

    const-string v2, "Service invalid"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->r()Lob/z5;

    move-result-object v1

    const-string v2, "Service disabled"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v5

    invoke-virtual {v5}, Lob/b6;->v()Lob/z5;

    move-result-object v5

    const-string v6, "Service container out of date"

    invoke-virtual {v5, v6}, Lob/z5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lob/l7;->C()Lob/ff;

    move-result-object v5

    invoke-virtual {v5}, Lob/ff;->W()I

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
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v5, "Service missing"

    invoke-virtual {v1, v5}, Lob/z5;->a(Ljava/lang/String;)V

    goto :goto_4

    :cond_a
    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v4, "Service available"

    invoke-virtual {v1, v4}, Lob/z5;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :goto_4
    if-nez v4, :cond_b

    invoke-virtual {v0}, Lob/l7;->w()Lob/m;

    move-result-object v1

    invoke-virtual {v1}, Lob/m;->m()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->o()Lob/z5;

    move-result-object v0

    const-string v1, "No way to upload. Consider using the full version of Analytics"

    invoke-virtual {v0, v1}, Lob/z5;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    if-eqz v2, :cond_c

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    invoke-virtual {v0}, Lob/o8;->h()V

    invoke-virtual {v0}, Lob/p6;->p()Landroid/content/SharedPreferences;

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

    iput-object v0, p0, Lob/yc;->e:Ljava/lang/Boolean;

    :cond_d
    iget-object v0, p0, Lob/yc;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final z(Lob/i5;)V
    .locals 0

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/yc;->d:Lob/i5;

    invoke-direct {p0}, Lob/yc;->S()V

    invoke-virtual {p0}, Lob/yc;->U()V

    return-void
.end method
