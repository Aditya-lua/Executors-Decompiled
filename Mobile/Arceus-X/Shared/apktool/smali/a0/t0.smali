.class public La0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/p0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La0/t0$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/hardware/camera2/CameraManager;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "camera"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraManager;

    iput-object p1, p0, La0/t0;->a:Landroid/hardware/camera2/CameraManager;

    iput-object p2, p0, La0/t0;->b:Ljava/lang/Object;

    return-void
.end method

.method public static i(Landroid/content/Context;Landroid/os/Handler;)La0/t0;
    .locals 2

    new-instance v0, La0/t0;

    new-instance v1, La0/t0$a;

    invoke-direct {v1, p1}, La0/t0$a;-><init>(Landroid/os/Handler;)V

    invoke-direct {v0, p0, v1}, La0/t0;-><init>(Landroid/content/Context;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/hardware/camera2/CameraManager;
    .locals 1

    iget-object v0, p0, La0/t0;->a:Landroid/hardware/camera2/CameraManager;

    return-object v0
.end method

.method public b(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p0, La0/t0;->b:Ljava/lang/Object;

    check-cast v0, La0/t0$a;

    if-eqz p2, :cond_1

    iget-object v1, v0, La0/t0$a;->a:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, La0/t0$a;->a:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La0/p0$a;

    if-nez v2, :cond_0

    new-instance v2, La0/p0$a;

    invoke-direct {v2, p1, p2}, La0/p0$a;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    iget-object p1, v0, La0/t0$a;->a:Ljava/util/Map;

    invoke-interface {p1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    const/4 v2, 0x0

    :goto_2
    iget-object p1, p0, La0/t0;->a:Landroid/hardware/camera2/CameraManager;

    iget-object p2, v0, La0/t0$a;->b:Landroid/os/Handler;

    invoke-virtual {p1, v2, p2}, Landroid/hardware/camera2/CameraManager;->registerAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;Landroid/os/Handler;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "executor was null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;
    .locals 1

    :try_start_0
    iget-object v0, p0, La0/t0;->a:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p1
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, La0/f;->e(Landroid/hardware/camera2/CameraAccessException;)La0/f;

    move-result-object p1

    throw p1
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object v0
.end method

.method public e(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    .locals 1

    invoke-static {p2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, La0/d0$b;

    invoke-direct {v0, p2, p3}, La0/d0$b;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V

    iget-object p2, p0, La0/t0;->b:Ljava/lang/Object;

    check-cast p2, La0/t0$a;

    :try_start_0
    iget-object p3, p0, La0/t0;->a:Landroid/hardware/camera2/CameraManager;

    iget-object p2, p2, La0/t0$a;->b:Landroid/os/Handler;

    invoke-virtual {p3, p1, v0, p2}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, La0/f;->e(Landroid/hardware/camera2/CameraAccessException;)La0/f;

    move-result-object p1

    throw p1
.end method

.method public f()[Ljava/lang/String;
    .locals 1

    :try_start_0
    iget-object v0, p0, La0/t0;->a:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-static {v0}, La0/f;->e(Landroid/hardware/camera2/CameraAccessException;)La0/f;

    move-result-object v0

    throw v0
.end method

.method public g(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, La0/t0;->b:Ljava/lang/Object;

    check-cast v0, La0/t0$a;

    iget-object v1, v0, La0/t0$a;->a:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, La0/t0$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La0/p0$a;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, La0/p0$a;->d()V

    :cond_1
    iget-object v0, p0, La0/t0;->a:Landroid/hardware/camera2/CameraManager;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraManager;->unregisterAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    return-void
.end method
