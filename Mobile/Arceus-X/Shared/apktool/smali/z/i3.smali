.class public final synthetic Lz/i3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/k3;

.field public final synthetic b:Ln0/o3;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;


# direct methods
.method public synthetic constructor <init>(Lz/k3;Ln0/o3;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/i3;->a:Lz/k3;

    iput-object p2, p0, Lz/i3;->b:Ln0/o3;

    iput-object p3, p0, Lz/i3;->c:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 3

    iget-object v0, p0, Lz/i3;->a:Lz/k3;

    iget-object v1, p0, Lz/i3;->b:Ln0/o3;

    iget-object v2, p0, Lz/i3;->c:Landroid/hardware/camera2/CameraDevice;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Lz/k3;->l(Lz/k3;Ln0/o3;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lne/x;

    move-result-object p1

    return-object p1
.end method
