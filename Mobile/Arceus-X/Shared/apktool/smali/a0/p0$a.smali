.class public final La0/p0$a;
.super Landroid/hardware/camera2/CameraManager$AvailabilityCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La0/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

.field public final c:Ljava/lang/Object;

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
    .locals 1

    invoke-direct {p0}, Landroid/hardware/camera2/CameraManager$AvailabilityCallback;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La0/p0$a;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, La0/p0$a;->d:Z

    iput-object p1, p0, La0/p0$a;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, La0/p0$a;->b:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    return-void
.end method

.method public static synthetic a(La0/p0$a;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, La0/p0$a;->b:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraManager$AvailabilityCallback;->onCameraAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(La0/p0$a;)V
    .locals 0

    iget-object p0, p0, La0/p0$a;->b:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    invoke-static {p0}, La0/e;->a(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    return-void
.end method

.method public static synthetic c(La0/p0$a;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, La0/p0$a;->b:Landroid/hardware/camera2/CameraManager$AvailabilityCallback;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraManager$AvailabilityCallback;->onCameraUnavailable(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    iget-object v0, p0, La0/p0$a;->c:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, La0/p0$a;->d:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onCameraAccessPrioritiesChanged()V
    .locals 3

    iget-object v0, p0, La0/p0$a;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, La0/p0$a;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, La0/p0$a;->a:Ljava/util/concurrent/Executor;

    new-instance v2, La0/n0;

    invoke-direct {v2, p0}, La0/n0;-><init>(La0/p0$a;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

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

.method public onCameraAvailable(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, La0/p0$a;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, La0/p0$a;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, La0/p0$a;->a:Ljava/util/concurrent/Executor;

    new-instance v2, La0/m0;

    invoke-direct {v2, p0, p1}, La0/m0;-><init>(La0/p0$a;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onCameraUnavailable(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, La0/p0$a;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, La0/p0$a;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, La0/p0$a;->a:Ljava/util/concurrent/Executor;

    new-instance v2, La0/o0;

    invoke-direct {v2, p0, p1}, La0/o0;-><init>(La0/p0$a;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
