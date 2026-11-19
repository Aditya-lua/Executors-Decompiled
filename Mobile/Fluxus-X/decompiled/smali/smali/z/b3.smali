.class public final Lz/b3;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# instance fields
.field public final a:Ln0/u;


# direct methods
.method public constructor <init>(Ln0/u;)V
    .locals 1

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lz/b3;->a:Ln0/u;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cameraCaptureCallback is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CaptureRequest;)I
    .locals 2

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ln0/z3;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/z3;

    const-string v0, "CAPTURE_CONFIG_ID_KEY"

    invoke-virtual {p1, v0}, Ln0/z3;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V

    invoke-virtual {p2}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Ln0/z3;

    const-string v1, "The tagBundle object from the CaptureResult is not a TagBundle object."

    invoke-static {v0, v1}, Lx2/g;->b(ZLjava/lang/Object;)V

    check-cast p1, Ln0/z3;

    goto :goto_0

    :cond_0
    invoke-static {}, Ln0/z3;->b()Ln0/z3;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lz/b3;->a:Ln0/u;

    invoke-virtual {p0, p2}, Lz/b3;->a(Landroid/hardware/camera2/CaptureRequest;)I

    move-result p2

    new-instance v1, Lz/h;

    invoke-direct {v1, p1, p3}, Lz/h;-><init>(Ln0/z3;Landroid/hardware/camera2/CaptureResult;)V

    invoke-virtual {v0, p2, v1}, Ln0/u;->b(ILn0/e0;)V

    return-void
.end method

.method public onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V

    new-instance p1, Ln0/w;

    sget-object p3, Ln0/w$a;->a:Ln0/w$a;

    invoke-direct {p1, p3}, Ln0/w;-><init>(Ln0/w$a;)V

    iget-object p3, p0, Lz/b3;->a:Ln0/u;

    invoke-virtual {p0, p2}, Lz/b3;->a(Landroid/hardware/camera2/CaptureRequest;)I

    move-result p2

    invoke-virtual {p3, p2, p1}, Ln0/u;->c(ILn0/w;)V

    return-void
.end method

.method public onCaptureStarted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0

    invoke-super/range {p0 .. p6}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureStarted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V

    move-object p1, p0

    iget-object p3, p1, Lz/b3;->a:Ln0/u;

    invoke-virtual {p0, p2}, Lz/b3;->a(Landroid/hardware/camera2/CaptureRequest;)I

    move-result p2

    invoke-virtual {p3, p2}, Ln0/u;->d(I)V

    return-void
.end method
