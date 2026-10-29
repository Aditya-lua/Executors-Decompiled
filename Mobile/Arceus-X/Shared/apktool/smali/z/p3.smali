.class public final Lz/p3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/g6$b;


# instance fields
.field public final a:La0/c0;

.field public b:Landroid/graphics/Rect;

.field public c:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public d:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(La0/c0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lz/p3;->b:Landroid/graphics/Rect;

    iput-object v0, p0, Lz/p3;->d:Landroid/graphics/Rect;

    iput-object p1, p0, Lz/p3;->a:La0/c0;

    return-void
.end method

.method public static h(Landroid/graphics/Rect;F)Landroid/graphics/Rect;
    .locals 5

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, p1

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result p1

    int-to-float p1, p1

    sub-float/2addr p1, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr p1, v2

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p0, v1

    div-float/2addr p0, v2

    new-instance v2, Landroid/graphics/Rect;

    float-to-int v3, p1

    float-to-int v4, p0

    add-float/2addr p1, v0

    float-to-int p1, p1

    add-float/2addr p0, v1

    float-to-int p0, p0

    invoke-direct {v2, v3, v4, p1, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v2
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 2

    iget-object v0, p0, Lz/p3;->c:Ly1/c$a;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    :goto_0
    iget-object v1, p0, Lz/p3;->d:Landroid/graphics/Rect;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lz/p3;->c:Ly1/c$a;

    invoke-virtual {p1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    iput-object v0, p0, Lz/p3;->c:Ly1/c$a;

    iput-object v0, p0, Lz/p3;->d:Landroid/graphics/Rect;

    :cond_1
    return-void
.end method

.method public b()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public c()V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, Lz/p3;->d:Landroid/graphics/Rect;

    iput-object v0, p0, Lz/p3;->b:Landroid/graphics/Rect;

    iget-object v1, p0, Lz/p3;->c:Ly1/c$a;

    if-eqz v1, :cond_0

    new-instance v2, Lg0/m$a;

    const-string v3, "Camera is not active."

    invoke-direct {v2, v3}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    iput-object v0, p0, Lz/p3;->c:Ly1/c$a;

    :cond_0
    return-void
.end method

.method public d()F
    .locals 3

    iget-object v0, p0, Lz/p3;->a:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_MAX_DIGITAL_ZOOM:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-nez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p0}, Lz/p3;->b()F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    invoke-virtual {p0}, Lz/p3;->b()F

    move-result v0

    return v0

    :cond_1
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

    invoke-virtual {p0}, Lz/p3;->i()Landroid/graphics/Rect;

    move-result-object v0

    invoke-static {v0, p1}, Lz/p3;->h(Landroid/graphics/Rect;F)Landroid/graphics/Rect;

    move-result-object p1

    iput-object p1, p0, Lz/p3;->b:Landroid/graphics/Rect;

    iget-object p1, p0, Lz/p3;->c:Ly1/c$a;

    if-eqz p1, :cond_0

    new-instance v0, Lg0/m$a;

    const-string v1, "There is a new zoomRatio being set"

    invoke-direct {v0, v1}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    iget-object p1, p0, Lz/p3;->b:Landroid/graphics/Rect;

    iput-object p1, p0, Lz/p3;->d:Landroid/graphics/Rect;

    iput-object p2, p0, Lz/p3;->c:Ly1/c$a;

    return-void
.end method

.method public f()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lz/p3;->b:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lz/p3;->i()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public g(Ly/a$a;)V
    .locals 3

    iget-object v0, p0, Lz/p3;->b:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    sget-object v2, Ln0/n1$c;->c:Ln0/n1$c;

    invoke-virtual {p1, v1, v0, v2}, Ly/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Ln0/n1$c;)Ly/a$a;

    :cond_0
    return-void
.end method

.method public final i()Landroid/graphics/Rect;
    .locals 2

    iget-object v0, p0, Lz/p3;->a:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    return-object v0
.end method
