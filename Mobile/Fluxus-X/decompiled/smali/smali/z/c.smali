.class public final Lz/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/g6$b;


# instance fields
.field public final a:La0/c0;

.field public final b:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public c:F

.field public d:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public e:F

.field public f:Z


# direct methods
.method public constructor <init>(La0/c0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lz/c;->c:F

    iput v0, p0, Lz/c;->e:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/c;->f:Z

    iput-object p1, p0, Lz/c;->a:La0/c0;

    invoke-static {}, Lz/b;->a()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v0

    invoke-virtual {p1, v0}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    iput-object v0, p0, Lz/c;->b:Landroid/util/Range;

    invoke-virtual {p1}, La0/c0;->i()Z

    move-result p1

    iput-boolean p1, p0, Lz/c;->f:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 2

    iget-object v0, p0, Lz/c;->d:Ly1/c$a;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lz/a;->a()Landroid/hardware/camera2/CaptureRequest$Key;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget v1, p0, Lz/c;->e:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lz/c;->d:Ly1/c$a;

    invoke-virtual {p1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    iput-object v0, p0, Lz/c;->d:Ly1/c$a;

    :cond_2
    :goto_1
    return-void
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, Lz/c;->b:Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public c()V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lz/c;->c:F

    iget-object v0, p0, Lz/c;->d:Ly1/c$a;

    if-eqz v0, :cond_0

    new-instance v1, Lg0/m$a;

    const-string v2, "Camera is not active."

    invoke-direct {v1, v2}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lz/c;->d:Ly1/c$a;

    :cond_0
    return-void
.end method

.method public d()F
    .locals 1

    iget-object v0, p0, Lz/c;->b:Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public e(FLy1/c$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lz/c;->c:F

    iget-object p1, p0, Lz/c;->d:Ly1/c$a;

    if-eqz p1, :cond_0

    new-instance v0, Lg0/m$a;

    const-string v1, "There is a new zoomRatio being set"

    invoke-direct {v0, v1}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    iget p1, p0, Lz/c;->c:F

    iput p1, p0, Lz/c;->e:F

    iput-object p2, p0, Lz/c;->d:Ly1/c$a;

    return-void
.end method

.method public f()Landroid/graphics/Rect;
    .locals 2

    iget-object v0, p0, Lz/c;->a:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    return-object v0
.end method

.method public g(Ly/a$a;)V
    .locals 3

    invoke-static {}, Lz/a;->a()Landroid/hardware/camera2/CaptureRequest$Key;

    move-result-object v0

    iget v1, p0, Lz/c;->c:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-object v2, Ln0/n1$c;->c:Ln0/n1$c;

    invoke-virtual {p1, v0, v1, v2}, Ly/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Ln0/n1$c;)Ly/a$a;

    iget-boolean v0, p0, Lz/c;->f:Z

    if-eqz v0, :cond_0

    invoke-static {p1, v2}, Lb0/b;->a(Ly/a$a;Ln0/n1$c;)V

    :cond_0
    return-void
.end method
