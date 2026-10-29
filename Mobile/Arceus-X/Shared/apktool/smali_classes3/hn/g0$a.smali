.class public final Lhn/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhn/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JV\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lhn/g0$a;",
        "",
        "<init>",
        "()V",
        "Lhn/h0;",
        "cameraChoice",
        "Landroid/hardware/camera2/CameraCharacteristics;",
        "cameraCharacteristics",
        "",
        "Landroid/view/Surface;",
        "targets",
        "Landroid/hardware/camera2/CameraDevice;",
        "device",
        "Landroid/os/Handler;",
        "handler",
        "Lkotlin/Function0;",
        "",
        "onFrameReceived",
        "Llq/a;",
        "coroutineScopeFactory",
        "Lhn/g0;",
        "a",
        "(Lhn/h0;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Llq/a;Lnt/b;)Ljava/lang/Object;",
        "camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhn/g0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhn/h0;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Llq/a;Lnt/b;)Ljava/lang/Object;
    .locals 13
    .param p1    # Lhn/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/hardware/camera2/CameraCharacteristics;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/hardware/camera2/CameraDevice;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroid/os/Handler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Llq/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/h0;",
            "Landroid/hardware/camera2/CameraCharacteristics;",
            "Ljava/util/List<",
            "+",
            "Landroid/view/Surface;",
            ">;",
            "Landroid/hardware/camera2/CameraDevice;",
            "Landroid/os/Handler;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Llq/a;",
            "Lnt/b<",
            "-",
            "Lhn/g0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p8

    instance-of v1, v0, Lhn/g0$a$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lhn/g0$a$a;

    iget v2, v1, Lhn/g0$a$a;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lhn/g0$a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Lhn/g0$a$a;

    invoke-direct {v1, p0, v0}, Lhn/g0$a$a;-><init>(Lhn/g0$a;Lnt/b;)V

    :goto_0
    iget-object v0, v1, Lhn/g0$a$a;->E:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v1, Lhn/g0$a$a;->G:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lhn/g0$a$a;->C:Ljava/lang/Object;

    check-cast p1, Lhn/g0;

    iget-object v2, v1, Lhn/g0$a$a;->B:Ljava/lang/Object;

    check-cast v2, Lhn/g0;

    iget-object v2, v1, Lhn/g0$a$a;->A:Ljava/lang/Object;

    check-cast v2, Lhn/g0;

    iget-object v3, v1, Lhn/g0$a$a;->z:Ljava/lang/Object;

    check-cast v3, Llq/a;

    iget-object v3, v1, Lhn/g0$a$a;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function0;

    iget-object v3, v1, Lhn/g0$a$a;->x:Ljava/lang/Object;

    check-cast v3, Landroid/os/Handler;

    iget-object v3, v1, Lhn/g0$a$a;->w:Ljava/lang/Object;

    check-cast v3, Landroid/hardware/camera2/CameraDevice;

    iget-object v3, v1, Lhn/g0$a$a;->v:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v1, Lhn/g0$a$a;->u:Ljava/lang/Object;

    check-cast v3, Landroid/hardware/camera2/CameraCharacteristics;

    iget-object v1, v1, Lhn/g0$a$a;->t:Ljava/lang/Object;

    check-cast v1, Lhn/h0;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance v5, Lhn/g0;

    invoke-virtual/range {p7 .. p7}, Llq/a;->a()Lku/p0;

    move-result-object v11

    const/4 v12, 0x0

    move-object v6, p1

    move-object v9, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p5

    move-object/from16 v10, p6

    invoke-direct/range {v5 .. v12}, Lhn/g0;-><init>(Lhn/h0;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCharacteristics;Lkotlin/jvm/functions/Function0;Lku/p0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Lhn/g0$a$a;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Lhn/g0$a$a;->u:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Lhn/g0$a$a;->v:Ljava/lang/Object;

    invoke-static/range {p4 .. p4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Lhn/g0$a$a;->w:Ljava/lang/Object;

    invoke-static/range {p5 .. p5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Lhn/g0$a$a;->x:Ljava/lang/Object;

    invoke-static/range {p6 .. p6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Lhn/g0$a$a;->y:Ljava/lang/Object;

    invoke-static/range {p7 .. p7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Lhn/g0$a$a;->z:Ljava/lang/Object;

    iput-object v5, v1, Lhn/g0$a$a;->A:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Lhn/g0$a$a;->B:Ljava/lang/Object;

    iput-object v5, v1, Lhn/g0$a$a;->C:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v1, Lhn/g0$a$a;->D:I

    iput v4, v1, Lhn/g0$a$a;->G:I

    move-object/from16 p1, p4

    invoke-static {v5, p1, v1}, Lhn/g0;->b(Lhn/g0;Landroid/hardware/camera2/CameraDevice;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_3

    return-object v2

    :cond_3
    move-object p1, v5

    move-object v2, p1

    :goto_1
    check-cast v0, Landroid/hardware/camera2/CameraCaptureSession;

    invoke-static {p1, v0}, Lhn/g0;->d(Lhn/g0;Landroid/hardware/camera2/CameraCaptureSession;)V

    return-object v2
.end method
