.class public final La0/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La0/d0$a;,
        La0/d0$b;
    }
.end annotation


# instance fields
.field public final a:La0/d0$a;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance p2, La0/k0;

    invoke-direct {p2, p1}, La0/k0;-><init>(Landroid/hardware/camera2/CameraDevice;)V

    iput-object p2, p0, La0/d0;->a:La0/d0$a;

    return-void

    :cond_0
    invoke-static {p1, p2}, La0/j0;->e(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)La0/j0;

    move-result-object p1

    iput-object p1, p0, La0/d0;->a:La0/d0$a;

    return-void
.end method

.method public static b(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)La0/d0;
    .locals 1

    new-instance v0, La0/d0;

    invoke-direct {v0, p0, p1}, La0/d0;-><init>(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)V

    return-object v0
.end method


# virtual methods
.method public a(Lb0/o;)V
    .locals 1

    iget-object v0, p0, La0/d0;->a:La0/d0$a;

    invoke-interface {v0, p1}, La0/d0$a;->a(Lb0/o;)V

    return-void
.end method
