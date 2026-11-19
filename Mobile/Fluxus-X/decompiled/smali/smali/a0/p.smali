.class public final synthetic La0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La0/g$c;

.field public final synthetic b:Landroid/hardware/camera2/CameraCaptureSession;


# direct methods
.method public synthetic constructor <init>(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/p;->a:La0/g$c;

    iput-object p2, p0, La0/p;->b:Landroid/hardware/camera2/CameraCaptureSession;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La0/p;->a:La0/g$c;

    iget-object v1, p0, La0/p;->b:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-static {v0, v1}, La0/g$c;->b(La0/g$c;Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method
