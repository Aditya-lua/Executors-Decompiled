.class public final Lz/c3;
.super Ln0/u;
.source "SourceFile"


# instance fields
.field public final a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V
    .locals 1

    invoke-direct {p0}, Ln0/u;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lz/c3;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "captureCallback is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static e(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lz/c3;
    .locals 1

    new-instance v0, Lz/c3;

    invoke-direct {v0, p0}, Lz/c3;-><init>(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V

    return-object v0
.end method


# virtual methods
.method public f()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
    .locals 1

    iget-object v0, p0, Lz/c3;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    return-object v0
.end method
