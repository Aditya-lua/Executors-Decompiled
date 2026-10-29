.class public final synthetic Lz/x4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/z4;

.field public final synthetic b:Ln0/o3;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic d:Lz/h5$a;


# direct methods
.method public synthetic constructor <init>(Lz/z4;Ln0/o3;Landroid/hardware/camera2/CameraDevice;Lz/h5$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/x4;->a:Lz/z4;

    iput-object p2, p0, Lz/x4;->b:Ln0/o3;

    iput-object p3, p0, Lz/x4;->c:Landroid/hardware/camera2/CameraDevice;

    iput-object p4, p0, Lz/x4;->d:Lz/h5$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 4

    iget-object v0, p0, Lz/x4;->a:Lz/z4;

    iget-object v1, p0, Lz/x4;->b:Ln0/o3;

    iget-object v2, p0, Lz/x4;->c:Landroid/hardware/camera2/CameraDevice;

    iget-object v3, p0, Lz/x4;->d:Lz/h5$a;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Lz/z4;->m(Lz/z4;Ln0/o3;Landroid/hardware/camera2/CameraDevice;Lz/h5$a;Ljava/util/List;)Lne/x;

    move-result-object p1

    return-object p1
.end method
