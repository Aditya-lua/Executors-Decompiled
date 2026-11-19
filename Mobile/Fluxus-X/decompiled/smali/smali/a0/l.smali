.class public final synthetic La0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La0/g$b;

.field public final synthetic b:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic c:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic d:Landroid/hardware/camera2/CaptureFailure;


# direct methods
.method public synthetic constructor <init>(La0/g$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/l;->a:La0/g$b;

    iput-object p2, p0, La0/l;->b:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, La0/l;->c:Landroid/hardware/camera2/CaptureRequest;

    iput-object p4, p0, La0/l;->d:Landroid/hardware/camera2/CaptureFailure;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, La0/l;->a:La0/g$b;

    iget-object v1, p0, La0/l;->b:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, La0/l;->c:Landroid/hardware/camera2/CaptureRequest;

    iget-object v3, p0, La0/l;->d:Landroid/hardware/camera2/CaptureFailure;

    invoke-static {v0, v1, v2, v3}, La0/g$b;->c(La0/g$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V

    return-void
.end method
