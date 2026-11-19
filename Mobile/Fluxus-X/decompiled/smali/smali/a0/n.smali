.class public final synthetic La0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La0/g$b;

.field public final synthetic b:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(La0/g$b;Landroid/hardware/camera2/CameraCaptureSession;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/n;->a:La0/g$b;

    iput-object p2, p0, La0/n;->b:Landroid/hardware/camera2/CameraCaptureSession;

    iput p3, p0, La0/n;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, La0/n;->a:La0/g$b;

    iget-object v1, p0, La0/n;->b:Landroid/hardware/camera2/CameraCaptureSession;

    iget v2, p0, La0/n;->c:I

    invoke-static {v0, v1, v2}, La0/g$b;->a(La0/g$b;Landroid/hardware/camera2/CameraCaptureSession;I)V

    return-void
.end method
