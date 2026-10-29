.class public final La0/d0$b;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La0/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/hardware/camera2/CameraDevice$StateCallback;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    .locals 0

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    iput-object p1, p0, La0/d0$b;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, La0/d0$b;->a:Landroid/hardware/camera2/CameraDevice$StateCallback;

    return-void
.end method

.method public static synthetic a(La0/d0$b;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    iget-object p0, p0, La0/d0$b;->a:Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onDisconnected(Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method

.method public static synthetic b(La0/d0$b;Landroid/hardware/camera2/CameraDevice;I)V
    .locals 0

    iget-object p0, p0, La0/d0$b;->a:Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {p0, p1, p2}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onError(Landroid/hardware/camera2/CameraDevice;I)V

    return-void
.end method

.method public static synthetic c(La0/d0$b;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    iget-object p0, p0, La0/d0$b;->a:Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onClosed(Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method

.method public static synthetic d(La0/d0$b;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    iget-object p0, p0, La0/d0$b;->a:Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;->onOpened(Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method


# virtual methods
.method public onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    iget-object v0, p0, La0/d0$b;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/e0;

    invoke-direct {v1, p0, p1}, La0/e0;-><init>(La0/d0$b;Landroid/hardware/camera2/CameraDevice;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    iget-object v0, p0, La0/d0$b;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/g0;

    invoke-direct {v1, p0, p1}, La0/g0;-><init>(La0/d0$b;Landroid/hardware/camera2/CameraDevice;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 2

    iget-object v0, p0, La0/d0$b;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/f0;

    invoke-direct {v1, p0, p1, p2}, La0/f0;-><init>(La0/d0$b;Landroid/hardware/camera2/CameraDevice;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    iget-object v0, p0, La0/d0$b;->b:Ljava/util/concurrent/Executor;

    new-instance v1, La0/h0;

    invoke-direct {v1, p0, p1}, La0/h0;-><init>(La0/d0$b;Landroid/hardware/camera2/CameraDevice;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
