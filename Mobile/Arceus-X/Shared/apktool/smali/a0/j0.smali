.class public La0/j0;
.super La0/i0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La0/i0;-><init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V

    return-void
.end method

.method public static e(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)La0/j0;
    .locals 2

    new-instance v0, La0/j0;

    new-instance v1, La0/l0$a;

    invoke-direct {v1, p1}, La0/l0$a;-><init>(Landroid/os/Handler;)V

    invoke-direct {v0, p0, v1}, La0/j0;-><init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a(Lb0/o;)V
    .locals 4

    iget-object v0, p0, La0/l0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, p1}, La0/l0;->c(Landroid/hardware/camera2/CameraDevice;Lb0/o;)V

    new-instance v0, La0/g$c;

    invoke-virtual {p1}, Lb0/o;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1}, Lb0/o;->e()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object v2

    invoke-direct {v0, v1, v2}, La0/g$c;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    invoke-virtual {p1}, Lb0/o;->c()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, La0/l0;->b:Ljava/lang/Object;

    check-cast v2, La0/l0$a;

    invoke-static {v2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La0/l0$a;

    iget-object v2, v2, La0/l0$a;->a:Landroid/os/Handler;

    invoke-virtual {p1}, Lb0/o;->b()Lb0/h;

    move-result-object v3

    if-eqz v3, :cond_0

    :try_start_0
    invoke-virtual {v3}, Lb0/h;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/params/InputConfiguration;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, La0/l0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v1}, Lb0/o;->h(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v3, p1, v1, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createReprocessableCaptureSessionByConfigurations(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lb0/o;->d()I

    move-result p1

    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    iget-object p1, p0, La0/l0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v1}, La0/l0;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createConstrainedHighSpeedCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    return-void

    :cond_1
    iget-object p1, p0, La0/l0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v1}, Lb0/o;->h(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createCaptureSessionByOutputConfigurations(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    invoke-static {p1}, La0/f;->e(Landroid/hardware/camera2/CameraAccessException;)La0/f;

    move-result-object p1

    throw p1
.end method
