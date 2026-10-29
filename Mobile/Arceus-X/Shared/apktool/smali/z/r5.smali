.class public Lz/r5;
.super Lz/n5;
.source "SourceFile"


# instance fields
.field public final o:Ljava/util/concurrent/ScheduledExecutorService;

.field public final p:Ljava/lang/Object;

.field public q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation
.end field

.field public r:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field public final s:Ld0/i;

.field public final t:Ld0/h;

.field public final u:Ld0/s;

.field public final v:Ld0/u;

.field public final w:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ln0/k3;Ln0/k3;Lz/o3;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p3, p4, p5, p6}, Lz/n5;-><init>(Lz/o3;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lz/r5;->p:Ljava/lang/Object;

    new-instance p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p4, 0x0

    invoke-direct {p3, p4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p3, p0, Lz/r5;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p3, Ld0/i;

    invoke-direct {p3, p1, p2}, Ld0/i;-><init>(Ln0/k3;Ln0/k3;)V

    iput-object p3, p0, Lz/r5;->s:Ld0/i;

    new-instance p3, Ld0/s;

    const-class p6, Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionStuckQuirk;

    invoke-virtual {p1, p6}, Ln0/k3;->a(Ljava/lang/Class;)Z

    move-result p6

    if-nez p6, :cond_0

    const-class p6, Landroidx/camera/camera2/internal/compat/quirk/IncorrectCaptureStateQuirk;

    invoke-virtual {p1, p6}, Ln0/k3;->a(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p4, 0x1

    :cond_1
    invoke-direct {p3, p4}, Ld0/s;-><init>(Z)V

    iput-object p3, p0, Lz/r5;->u:Ld0/s;

    new-instance p1, Ld0/h;

    invoke-direct {p1, p2}, Ld0/h;-><init>(Ln0/k3;)V

    iput-object p1, p0, Lz/r5;->t:Ld0/h;

    new-instance p1, Ld0/u;

    invoke-direct {p1, p2}, Ld0/u;-><init>(Ln0/k3;)V

    iput-object p1, p0, Lz/r5;->v:Ld0/u;

    iput-object p5, p0, Lz/r5;->o:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static synthetic G(Lz/r5;Lz/h5;)V
    .locals 0

    invoke-super {p0, p1}, Lz/n5;->t(Lz/h5;)V

    return-void
.end method

.method public static synthetic H(Lz/r5;Landroid/hardware/camera2/CameraDevice;Lb0/o;Ljava/util/List;Ljava/util/List;)Lne/x;
    .locals 0

    iget-object p4, p0, Lz/r5;->v:Ld0/u;

    invoke-virtual {p4}, Ld0/u;->a()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lz/r5;->J()V

    :cond_0
    const-string p4, "start openCaptureSession"

    invoke-virtual {p0, p4}, Lz/r5;->K(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lz/n5;->h(Landroid/hardware/camera2/CameraDevice;Lb0/o;Ljava/util/List;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lz/r5;)V
    .locals 1

    const-string v0, "Session call super.close()"

    invoke-virtual {p0, v0}, Lz/r5;->K(Ljava/lang/String;)V

    invoke-super {p0}, Lz/n5;->close()V

    return-void
.end method


# virtual methods
.method public final J()V
    .locals 2

    iget-object v0, p0, Lz/n5;->b:Lz/o3;

    invoke-virtual {v0}, Lz/o3;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h5;

    invoke-interface {v1}, Lz/h5;->close()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public K(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SyncCaptureSessionImpl"

    invoke-static {v0, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 1

    invoke-super {p0}, Lz/n5;->c()V

    iget-object v0, p0, Lz/r5;->u:Ld0/s;

    invoke-virtual {v0}, Ld0/s;->g()V

    return-void
.end method

.method public close()V
    .locals 3

    iget-object v0, p0, Lz/r5;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "close() has been called. Skip this invocation."

    invoke-virtual {p0, v0}, Lz/r5;->K(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lz/r5;->v:Ld0/u;

    invoke-virtual {v0}, Ld0/u;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    const-string v0, "Call abortCaptures() before closing session."

    invoke-virtual {p0, v0}, Lz/r5;->K(Ljava/lang/String;)V

    invoke-virtual {p0}, Lz/n5;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception when calling abortCaptures()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/r5;->K(Ljava/lang/String;)V

    :cond_1
    :goto_0
    const-string v0, "Session call close()"

    invoke-virtual {p0, v0}, Lz/r5;->K(Ljava/lang/String;)V

    iget-object v0, p0, Lz/r5;->u:Ld0/s;

    invoke-virtual {v0}, Ld0/s;->e()Lne/x;

    move-result-object v0

    new-instance v1, Lz/p5;

    invoke-direct {v1, p0}, Lz/p5;-><init>(Lz/r5;)V

    invoke-virtual {p0}, Lz/n5;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public d(I)V
    .locals 2

    invoke-super {p0, p1}, Lz/n5;->d(I)V

    const/4 v0, 0x5

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lz/r5;->p:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p0}, Lz/n5;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/r5;->q:Ljava/util/List;

    if-eqz v0, :cond_0

    const-string v0, "Close DeferrableSurfaces for CameraDevice error."

    invoke-virtual {p0, v0}, Lz/r5;->K(Ljava/lang/String;)V

    iget-object v0, p0, Lz/r5;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/u1;

    invoke-virtual {v1}, Ln0/u1;->d()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    return-void
.end method

.method public g(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1

    iget-object v0, p0, Lz/r5;->u:Ld0/s;

    invoke-virtual {v0, p2}, Ld0/s;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p2

    invoke-super {p0, p1, p2}, Lz/n5;->g(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public h(Landroid/hardware/camera2/CameraDevice;Lb0/o;Ljava/util/List;)Lne/x;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CameraDevice;",
            "Lb0/o;",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/r5;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/n5;->b:Lz/o3;

    invoke-virtual {v1}, Lz/o3;->d()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz/h5;

    invoke-interface {v3}, Lz/h5;->o()Lne/x;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {v2}, Lr0/n;->w(Ljava/util/Collection;)Lne/x;

    move-result-object v1

    iput-object v1, p0, Lz/r5;->r:Lne/x;

    invoke-static {v1}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object v1

    new-instance v2, Lz/q5;

    invoke-direct {v2, p0, p1, p2, p3}, Lz/q5;-><init>(Lz/r5;Landroid/hardware/camera2/CameraDevice;Lb0/o;Ljava/util/List;)V

    invoke-virtual {p0}, Lz/n5;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public j(Ljava/util/List;J)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;J)",
            "Lne/x<",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lz/r5;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lz/r5;->q:Ljava/util/List;

    invoke-super {p0, p1, p2, p3}, Lz/n5;->j(Ljava/util/List;J)Lne/x;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public m(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CaptureRequest;",
            ">;",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;",
            ")I"
        }
    .end annotation

    iget-object v0, p0, Lz/r5;->u:Ld0/s;

    invoke-virtual {v0, p2}, Ld0/s;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p2

    invoke-super {p0, p1, p2}, Lz/n5;->m(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public o()Lne/x;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/r5;->o:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lz/r5;->u:Ld0/s;

    invoke-virtual {v1}, Ld0/s;->e()Lne/x;

    move-result-object v1

    const-wide/16 v2, 0x5dc

    invoke-static {v2, v3, v0, v1}, Lr0/n;->r(JLjava/util/concurrent/ScheduledExecutorService;Lne/x;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public r(Lz/h5;)V
    .locals 3

    iget-object v0, p0, Lz/r5;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/r5;->s:Ld0/i;

    iget-object v2, p0, Lz/r5;->q:Ljava/util/List;

    invoke-virtual {v1, v2}, Ld0/i;->a(Ljava/util/List;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "onClosed()"

    invoke-virtual {p0, v0}, Lz/r5;->K(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lz/n5;->r(Lz/h5;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public stop()Z
    .locals 3

    iget-object v0, p0, Lz/r5;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lz/n5;->E()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lz/r5;->s:Ld0/i;

    iget-object v2, p0, Lz/r5;->q:Ljava/util/List;

    invoke-virtual {v1, v2}, Ld0/i;->a(Ljava/util/List;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lz/r5;->r:Lne/x;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    :goto_0
    invoke-super {p0}, Lz/n5;->stop()Z

    move-result v1

    monitor-exit v0

    return v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public t(Lz/h5;)V
    .locals 4

    const-string v0, "Session onConfigured()"

    invoke-virtual {p0, v0}, Lz/r5;->K(Ljava/lang/String;)V

    iget-object v0, p0, Lz/r5;->t:Ld0/h;

    iget-object v1, p0, Lz/n5;->b:Lz/o3;

    invoke-virtual {v1}, Lz/o3;->e()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lz/n5;->b:Lz/o3;

    invoke-virtual {v2}, Lz/o3;->d()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lz/o5;

    invoke-direct {v3, p0}, Lz/o5;-><init>(Lz/r5;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Ld0/h;->c(Lz/h5;Ljava/util/List;Ljava/util/List;Ld0/h$a;)V

    return-void
.end method
