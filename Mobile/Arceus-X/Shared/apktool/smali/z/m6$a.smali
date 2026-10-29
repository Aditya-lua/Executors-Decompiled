.class public Lz/m6$a;
.super Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/m6;->a(Ln0/o3$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz/m6$b;

.field public final synthetic b:Lz/m6;


# direct methods
.method public constructor <init>(Lz/m6;Lz/m6$b;)V
    .locals 0

    iput-object p1, p0, Lz/m6$a;->b:Lz/m6;

    iput-object p2, p0, Lz/m6$a;->a:Lz/m6$b;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    return-void
.end method

.method public onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraCaptureSession;->getInputSurface()Landroid/view/Surface;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lz/m6$a;->a:Lz/m6$b;

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lt0/a;->c(Landroid/view/Surface;I)Landroid/media/ImageWriter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lz/m6$b;->d(Landroid/media/ImageWriter;)V

    :cond_0
    return-void
.end method
