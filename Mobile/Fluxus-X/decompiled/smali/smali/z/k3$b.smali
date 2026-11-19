.class public Lz/k3$b;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/k3;->w(Ljava/util/List;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz/k3;


# direct methods
.method public constructor <init>(Lz/k3;)V
    .locals 0

    iput-object p1, p0, Lz/k3$b;->a:Lz/k3;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 1

    iget-object p1, p0, Lz/k3$b;->a:Lz/k3;

    iget-object p1, p1, Lz/k3;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lz/k3$b;->a:Lz/k3;

    iget-object p2, p2, Lz/k3;->f:Ln0/o3;

    if-nez p2, :cond_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ln0/o3;->l()Ln0/l1;

    move-result-object p2

    const-string p3, "CaptureSession"

    const-string v0, "Submit FLASH_MODE_OFF request"

    invoke-static {p3, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Lz/k3$b;->a:Lz/k3;

    invoke-static {p3}, Lz/k3;->n(Lz/k3;)Ld0/z;

    move-result-object v0

    invoke-virtual {v0, p2}, Ld0/z;->a(Ln0/l1;)Ln0/l1;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3, p2}, Lz/k3;->b(Ljava/util/List;)V

    monitor-exit p1

    return-void

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
