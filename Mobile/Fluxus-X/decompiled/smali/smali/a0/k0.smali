.class public La0/k0;
.super La0/j0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraDevice;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, La0/j0;-><init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lb0/o;)V
    .locals 1

    invoke-virtual {p1}, Lb0/o;->j()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/params/SessionConfiguration;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, La0/l0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Landroid/hardware/camera2/params/SessionConfiguration;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, La0/f;->e(Landroid/hardware/camera2/CameraAccessException;)La0/f;

    move-result-object p1

    throw p1
.end method
