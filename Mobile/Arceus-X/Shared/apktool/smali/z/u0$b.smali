.class public Lz/u0$b;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/u0;->t0()Lne/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lz/u0;


# direct methods
.method public constructor <init>(Lz/u0;Ly1/c$a;)V
    .locals 0

    iput-object p1, p0, Lz/u0$b;->b:Lz/u0;

    iput-object p2, p0, Lz/u0$b;->a:Ly1/c$a;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    iget-object p1, p0, Lz/u0$b;->b:Lz/u0;

    const-string v0, "openCameraConfigAndClose camera closed"

    invoke-virtual {p1, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object p1, p0, Lz/u0$b;->a:Ly1/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    iget-object p1, p0, Lz/u0$b;->b:Lz/u0;

    const-string v0, "openCameraConfigAndClose camera disconnected"

    invoke-virtual {p1, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object p1, p0, Lz/u0$b;->a:Ly1/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 2

    iget-object p1, p0, Lz/u0$b;->b:Lz/u0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "openCameraConfigAndClose camera error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object p1, p0, Lz/u0$b;->a:Ly1/c$a;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    iget-object v0, p0, Lz/u0$b;->b:Lz/u0;

    const-string v1, "openCameraConfigAndClose camera opened"

    invoke-virtual {v0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0$b;->b:Lz/u0;

    invoke-static {v0, p1}, Lz/u0;->R(Lz/u0;Landroid/hardware/camera2/CameraDevice;)Lne/x;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lz/v0;

    invoke-direct {v1, p1}, Lz/v0;-><init>(Landroid/hardware/camera2/CameraDevice;)V

    iget-object p1, p0, Lz/u0$b;->b:Lz/u0;

    invoke-static {p1}, Lz/u0;->N(Lz/u0;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
