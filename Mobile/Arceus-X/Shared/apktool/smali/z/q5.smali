.class public final synthetic Lz/q5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lz/r5;

.field public final synthetic b:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic c:Lb0/o;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lz/r5;Landroid/hardware/camera2/CameraDevice;Lb0/o;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/q5;->a:Lz/r5;

    iput-object p2, p0, Lz/q5;->b:Landroid/hardware/camera2/CameraDevice;

    iput-object p3, p0, Lz/q5;->c:Lb0/o;

    iput-object p4, p0, Lz/q5;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 4

    iget-object v0, p0, Lz/q5;->a:Lz/r5;

    iget-object v1, p0, Lz/q5;->b:Landroid/hardware/camera2/CameraDevice;

    iget-object v2, p0, Lz/q5;->c:Lb0/o;

    iget-object v3, p0, Lz/q5;->d:Ljava/util/List;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, v3, p1}, Lz/r5;->H(Lz/r5;Landroid/hardware/camera2/CameraDevice;Lb0/o;Ljava/util/List;Ljava/util/List;)Lne/x;

    move-result-object p1

    return-object p1
.end method
