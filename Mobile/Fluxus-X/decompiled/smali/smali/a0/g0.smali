.class public final synthetic La0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La0/d0$b;

.field public final synthetic b:Landroid/hardware/camera2/CameraDevice;


# direct methods
.method public synthetic constructor <init>(La0/d0$b;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/g0;->a:La0/d0$b;

    iput-object p2, p0, La0/g0;->b:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La0/g0;->a:La0/d0$b;

    iget-object v1, p0, La0/g0;->b:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, v1}, La0/d0$b;->a(La0/d0$b;Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method
