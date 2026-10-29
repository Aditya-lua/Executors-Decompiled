.class public Lz/n5;
.super Lz/h5$c;
.source "SourceFile"

# interfaces
.implements Lz/h5;
.implements Lz/h5$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/n5$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lz/o3;

.field public final c:Landroid/os/Handler;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public f:Lz/h5$c;

.field public g:La0/g;

.field public h:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation
.end field

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation
.end field

.field public l:Z

.field public m:Z

.field public n:Z


# direct methods
.method public constructor <init>(Lz/o3;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Lz/h5$c;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lz/n5;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lz/n5;->k:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/n5;->l:Z

    iput-boolean v0, p0, Lz/n5;->m:Z

    iput-boolean v0, p0, Lz/n5;->n:Z

    iput-object p1, p0, Lz/n5;->b:Lz/o3;

    iput-object p4, p0, Lz/n5;->c:Landroid/os/Handler;

    iput-object p2, p0, Lz/n5;->d:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lz/n5;->e:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static synthetic A(Lz/n5;Ljava/util/List;Ljava/util/List;)Lne/x;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "] getSurface done with results: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "SyncCaptureSessionBase"

    invoke-static {v0, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unable to open capture session without surfaces"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-interface {p2, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ln0/u1$a;

    invoke-interface {p2, p0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p0

    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/u1;

    const-string p1, "Surface closed"

    invoke-direct {v0, p1, p0}, Ln0/u1$a;-><init>(Ljava/lang/String;Ln0/u1;)V

    invoke-static {v0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p2}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lz/n5;)V
    .locals 0

    invoke-virtual {p0, p0}, Lz/n5;->v(Lz/h5;)V

    return-void
.end method

.method public static synthetic x(Lz/n5;Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/n5;->b:Lz/o3;

    invoke-virtual {v0, p0}, Lz/o3;->g(Lz/h5;)V

    invoke-virtual {p0, p1}, Lz/n5;->v(Lz/h5;)V

    iget-object v0, p0, Lz/n5;->g:La0/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-virtual {p0, p1}, Lz/h5$c;->r(Lz/h5;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured."

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "SyncCaptureSessionBase"

    invoke-static {p1, p0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic y(Lz/n5;Ljava/util/List;La0/d0;Lb0/o;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/n5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1}, Lz/n5;->D(Ljava/util/List;)V

    iget-object p1, p0, Lz/n5;->i:Ly1/c$a;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v1, "The openCaptureSessionCompleter can only set once!"

    invoke-static {p1, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iput-object p4, p0, Lz/n5;->i:Ly1/c$a;

    invoke-virtual {p2, p3}, La0/d0;->a(Lb0/o;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "openCaptureSession[session="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic z(Lz/n5;Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-virtual {p0, p1}, Lz/h5$c;->v(Lz/h5;)V

    return-void
.end method


# virtual methods
.method public C(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    iget-object v0, p0, Lz/n5;->g:La0/g;

    if-nez v0, :cond_0

    iget-object v0, p0, Lz/n5;->c:Landroid/os/Handler;

    invoke-static {p1, v0}, La0/g;->e(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)La0/g;

    move-result-object p1

    iput-object p1, p0, Lz/n5;->g:La0/g;

    :cond_0
    return-void
.end method

.method public D(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz/n5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lz/n5;->F()V

    invoke-static {p1}, Ln0/x1;->d(Ljava/util/List;)V

    iput-object p1, p0, Lz/n5;->k:Ljava/util/List;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public E()Z
    .locals 2

    iget-object v0, p0, Lz/n5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/n5;->h:Lne/x;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public F()V
    .locals 2

    iget-object v0, p0, Lz/n5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/n5;->k:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ln0/x1;->c(Ljava/util/List;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lz/n5;->k:Ljava/util/List;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public a()V
    .locals 2

    iget-object v0, p0, Lz/n5;->g:La0/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->g:La0/g;

    invoke-virtual {v0}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V

    return-void
.end method

.method public b()Lz/h5$c;
    .locals 0

    return-object p0
.end method

.method public c()V
    .locals 0

    invoke-virtual {p0}, Lz/n5;->F()V

    return-void
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lz/n5;->g:La0/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->b:Lz/o3;

    invoke-virtual {v0, p0}, Lz/o3;->h(Lz/h5;)V

    iget-object v0, p0, Lz/n5;->g:La0/g;

    invoke-virtual {v0}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    invoke-virtual {p0}, Lz/n5;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lz/l5;

    invoke-direct {v1, p0}, Lz/l5;-><init>(Lz/n5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(I)V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lz/n5;->g:La0/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->g:La0/g;

    invoke-virtual {v0}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->abortCaptures()V

    return-void
.end method

.method public f()Landroid/hardware/camera2/CameraDevice;
    .locals 1

    iget-object v0, p0, Lz/n5;->g:La0/g;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->g:La0/g;

    invoke-virtual {v0}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    return-object v0
.end method

.method public g(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 2

    iget-object v0, p0, Lz/n5;->g:La0/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->g:La0/g;

    invoke-virtual {p0}, Lz/n5;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, La0/g;->c(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public getExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lz/n5;->d:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public h(Landroid/hardware/camera2/CameraDevice;Lb0/o;Ljava/util/List;)Lne/x;
    .locals 2
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

    iget-object v0, p0, Lz/n5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lz/n5;->m:Z

    if-eqz v1, :cond_0

    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string p2, "Opener is disabled"

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lz/n5;->b:Lz/o3;

    invoke-virtual {v1, p0}, Lz/o3;->k(Lz/h5;)V

    iget-object v1, p0, Lz/n5;->c:Landroid/os/Handler;

    invoke-static {p1, v1}, La0/d0;->b(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)La0/d0;

    move-result-object p1

    new-instance v1, Lz/m5;

    invoke-direct {v1, p0, p3, p1, p2}, Lz/m5;-><init>(Lz/n5;Ljava/util/List;La0/d0;Lb0/o;)V

    invoke-static {v1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    iput-object p1, p0, Lz/n5;->h:Lne/x;

    new-instance p2, Lz/n5$a;

    invoke-direct {p2, p0}, Lz/n5$a;-><init>(Lz/n5;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    iget-object p1, p0, Lz/n5;->h:Lne/x;

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i(Landroid/hardware/camera2/CaptureRequest;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CaptureRequest;",
            ")",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CaptureRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/n5;->g:La0/g;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La0/g;

    invoke-virtual {v0}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    instance-of v1, v0, Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;

    invoke-static {v0, p1}, Lz/n5$c;->a(Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;Landroid/hardware/camera2/CaptureRequest;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public j(Ljava/util/List;J)Lne/x;
    .locals 8
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

    iget-object v1, p0, Lz/n5;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lz/n5;->m:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string p2, "Opener is disabled"

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lz/n5;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v6

    iget-object v7, p0, Lz/n5;->e:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v3, 0x0

    move-object v2, p1

    move-wide v4, p2

    invoke-static/range {v2 .. v7}, Ln0/x1;->e(Ljava/util/Collection;ZJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object p1

    new-instance p2, Lz/j5;

    invoke-direct {p2, p0, v2}, Lz/j5;-><init>(Lz/n5;Ljava/util/List;)V

    invoke-virtual {p0}, Lz/n5;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    iput-object p1, p0, Lz/n5;->j:Lne/x;

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    monitor-exit v1

    return-object p1

    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public k(ILjava/util/List;Lz/h5$c;)Lb0/o;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lb0/i;",
            ">;",
            "Lz/h5$c;",
            ")",
            "Lb0/o;"
        }
    .end annotation

    iput-object p3, p0, Lz/n5;->f:Lz/h5$c;

    new-instance p3, Lb0/o;

    invoke-virtual {p0}, Lz/n5;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lz/n5$b;

    invoke-direct {v1, p0}, Lz/n5$b;-><init>(Lz/n5;)V

    invoke-direct {p3, p1, p2, v0, v1}, Lb0/o;-><init>(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    return-object p3
.end method

.method public l(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 2
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

    iget-object v0, p0, Lz/n5;->g:La0/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->g:La0/g;

    invoke-virtual {p0}, Lz/n5;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, La0/g;->b(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public m(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 2
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

    iget-object v0, p0, Lz/n5;->g:La0/g;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->g:La0/g;

    invoke-virtual {p0}, Lz/n5;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, La0/g;->a(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public n()La0/g;
    .locals 1

    iget-object v0, p0, Lz/n5;->g:La0/g;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->g:La0/g;

    return-object v0
.end method

.method public p(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-virtual {v0, p1}, Lz/h5$c;->p(Lz/h5;)V

    return-void
.end method

.method public q(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-virtual {v0, p1}, Lz/h5$c;->q(Lz/h5;)V

    return-void
.end method

.method public r(Lz/h5;)V
    .locals 3

    iget-object v0, p0, Lz/n5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lz/n5;->l:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lz/n5;->l:Z

    iget-object v1, p0, Lz/n5;->h:Lne/x;

    const-string v2, "Need to call openCaptureSession before using this API."

    invoke-static {v1, v2}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lz/n5;->h:Lne/x;

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

    invoke-virtual {p0}, Lz/n5;->c()V

    if-eqz v1, :cond_1

    new-instance v0, Lz/i5;

    invoke-direct {v0, p0, p1}, Lz/i5;-><init>(Lz/n5;Lz/h5;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public s(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lz/n5;->c()V

    iget-object v0, p0, Lz/n5;->b:Lz/o3;

    invoke-virtual {v0, p0}, Lz/o3;->i(Lz/h5;)V

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-virtual {v0, p1}, Lz/h5$c;->s(Lz/h5;)V

    return-void
.end method

.method public stop()Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lz/n5;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v3, p0, Lz/n5;->m:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Lz/n5;->j:Lne/x;

    if-eqz v3, :cond_0

    move-object v1, v3

    :cond_0
    iput-boolean v0, p0, Lz/n5;->m:Z

    goto :goto_0

    :catchall_0
    move-exception v3

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lz/n5;->E()Z

    move-result v3

    xor-int/2addr v3, v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_2
    return v3

    :goto_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    if-eqz v1, :cond_3

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_3
    throw v2
.end method

.method public t(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->b:Lz/o3;

    invoke-virtual {v0, p0}, Lz/o3;->j(Lz/h5;)V

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-virtual {v0, p1}, Lz/h5$c;->t(Lz/h5;)V

    return-void
.end method

.method public u(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-virtual {v0, p1}, Lz/h5$c;->u(Lz/h5;)V

    return-void
.end method

.method public v(Lz/h5;)V
    .locals 3

    iget-object v0, p0, Lz/n5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lz/n5;->n:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lz/n5;->n:Z

    iget-object v1, p0, Lz/n5;->h:Lne/x;

    const-string v2, "Need to call openCaptureSession before using this API."

    invoke-static {v1, v2}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lz/n5;->h:Lne/x;

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

    if-eqz v1, :cond_1

    new-instance v0, Lz/k5;

    invoke-direct {v0, p0, p1}, Lz/k5;-><init>(Lz/n5;Lz/h5;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public w(Lz/h5;Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz/n5;->f:Lz/h5$c;

    invoke-virtual {v0, p1, p2}, Lz/h5$c;->w(Lz/h5;Landroid/view/Surface;)V

    return-void
.end method
