.class public final La0/g$c;
.super Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V
    .locals 0

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    iput-object p1, p0, La0/g$c;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, La0/g$c;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    return-void
.end method

.method public static synthetic a(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    iget-object p0, p0, La0/g$c;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-static {p0, p1}, La0/d;->a(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public static synthetic b(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    iget-object p0, p0, La0/g$c;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public static synthetic c(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    iget-object p0, p0, La0/g$c;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public static synthetic d(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V
    .locals 0

    iget-object p0, p0, La0/g$c;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-static {p0, p1, p2}, La0/b;->a(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V

    return-void
.end method

.method public static synthetic e(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    iget-object p0, p0, La0/g$c;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onReady(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public static synthetic f(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    iget-object p0, p0, La0/g$c;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onActive(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public static synthetic g(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    iget-object p0, p0, La0/g$c;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method


# virtual methods
.method public onActive(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    iget-object v0, p0, La0/g$c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/o;

    invoke-direct {v1, p0, p1}, La0/o;-><init>(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onCaptureQueueEmpty(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    iget-object v0, p0, La0/g$c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/r;

    invoke-direct {v1, p0, p1}, La0/r;-><init>(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    iget-object v0, p0, La0/g$c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/p;

    invoke-direct {v1, p0, p1}, La0/p;-><init>(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    iget-object v0, p0, La0/g$c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/u;

    invoke-direct {v1, p0, p1}, La0/u;-><init>(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    iget-object v0, p0, La0/g$c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/s;

    invoke-direct {v1, p0, p1}, La0/s;-><init>(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onReady(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 2

    iget-object v0, p0, La0/g$c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/t;

    invoke-direct {v1, p0, p1}, La0/t;-><init>(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onSurfacePrepared(Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V
    .locals 2

    iget-object v0, p0, La0/g$c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/q;

    invoke-direct {v1, p0, p1, p2}, La0/q;-><init>(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
