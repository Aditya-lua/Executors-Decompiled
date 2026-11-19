.class public Lz/s5$a;
.super Lz/h5$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/s5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz/h5$c;-><init>()V

    .line 2
    iput-object p1, p0, Lz/s5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-static {p1}, Lz/v2;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object p1

    invoke-direct {p0, p1}, Lz/s5$a;-><init>(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    return-void
.end method


# virtual methods
.method public p(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/s5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Lz/h5;->n()La0/g;

    move-result-object p1

    invoke-virtual {p1}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onActive(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public q(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/s5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Lz/h5;->n()La0/g;

    move-result-object p1

    invoke-virtual {p1}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-static {v0, p1}, La0/d;->a(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public r(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/s5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Lz/h5;->n()La0/g;

    move-result-object p1

    invoke-virtual {p1}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public s(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/s5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Lz/h5;->n()La0/g;

    move-result-object p1

    invoke-virtual {p1}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public t(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/s5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Lz/h5;->n()La0/g;

    move-result-object p1

    invoke-virtual {p1}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public u(Lz/h5;)V
    .locals 1

    iget-object v0, p0, Lz/s5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Lz/h5;->n()La0/g;

    move-result-object p1

    invoke-virtual {p1}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onReady(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public v(Lz/h5;)V
    .locals 0

    return-void
.end method

.method public w(Lz/h5;Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Lz/s5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Lz/h5;->n()La0/g;

    move-result-object p1

    invoke-virtual {p1}, La0/g;->d()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-static {v0, p1, p2}, La0/b;->a(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V

    return-void
.end method
