.class public final synthetic La0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La0/g$b;

.field public final synthetic b:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic c:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic d:J

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(La0/g$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/h;->a:La0/g$b;

    iput-object p2, p0, La0/h;->b:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, La0/h;->c:Landroid/hardware/camera2/CaptureRequest;

    iput-wide p4, p0, La0/h;->d:J

    iput-wide p6, p0, La0/h;->e:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, La0/h;->a:La0/g$b;

    iget-object v1, p0, La0/h;->b:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, La0/h;->c:Landroid/hardware/camera2/CaptureRequest;

    iget-wide v3, p0, La0/h;->d:J

    iget-wide v5, p0, La0/h;->e:J

    invoke-static/range {v0 .. v6}, La0/g$b;->b(La0/g$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V

    return-void
.end method
