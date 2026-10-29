.class public final Lhn/s$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhn/s;->V(ZLnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Lhn/g0;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "Lhn/g0;",
        "<anonymous>",
        "(Lku/p0;)Lhn/g0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$createCameraCaptureSession$2"
    f = "Camera2Manager.kt"
    l = {
        0x13d,
        0x14f,
        0x174
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public final synthetic x:Lhn/s;

.field public final synthetic y:Z


# direct methods
.method public constructor <init>(Lhn/s;ZLnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/s;",
            "Z",
            "Lnt/b<",
            "-",
            "Lhn/s$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhn/s$e;->x:Lhn/s;

    iput-boolean p2, p0, Lhn/s$e;->y:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Lhn/s;Ljava/lang/Exception;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lhn/s$e;->t(Lhn/s;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lhn/s;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lhn/s$e;->s(Lhn/s;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Lhn/s;)Lkotlin/Unit;
    .locals 2

    invoke-static {p0}, Lhn/s;->G(Lhn/s;)Lnu/c0;

    move-result-object v0

    invoke-interface {v0}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lhn/s$d$d;

    if-eqz v1, :cond_0

    check-cast v0, Lhn/s$d$d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lhn/s$d$d;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lhn/s;->G(Lhn/s;)Lnu/c0;

    move-result-object p0

    new-instance v0, Lhn/s$d$d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lhn/s$d$d;-><init>(Z)V

    invoke-interface {p0, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final t(Lhn/s;Ljava/lang/Exception;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lhn/s;->b0()Lhn/h0;

    move-result-object v0

    invoke-static {p0}, Lhn/s;->F(Lhn/s;)Lmn/a;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createCaptureSession failed on first attempt for choice "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " (videoCaptureMethod="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "): "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ". Retrying."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lhn/s$e;

    iget-object v0, p0, Lhn/s$e;->x:Lhn/s;

    iget-boolean v1, p0, Lhn/s$e;->y:Z

    invoke-direct {p1, v0, v1, p2}, Lhn/s$e;-><init>(Lhn/s;ZLnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lhn/s$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lhn/g0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lhn/s$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lhn/s$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lhn/s$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v0, p0, Lhn/s$e;->w:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lhn/s$e;->v:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    iget-object v0, p0, Lhn/s$e;->u:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, p0, Lhn/s$e;->t:Ljava/lang/Object;

    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v13, p0

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lhn/s$e;->u:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    iget-object v0, p0, Lhn/s$e;->t:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroid/hardware/camera2/CameraDevice;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v13, p0

    goto/16 :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v13, p0

    goto/16 :goto_3

    :cond_2
    iget-object v0, p0, Lhn/s$e;->t:Ljava/lang/Object;

    check-cast v0, Lhn/s;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {p1}, Lhn/s;->n(Lhn/s;)Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    if-nez p1, :cond_5

    iget-object v0, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {v0}, Lhn/s;->p(Lhn/s;)Landroid/hardware/camera2/CameraManager;

    move-result-object p1

    iget-object v5, p0, Lhn/s$e;->x:Lhn/s;

    invoke-virtual {v5}, Lhn/s;->b0()Lhn/h0;

    move-result-object v5

    invoke-virtual {v5}, Lhn/h0;->d()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {v6}, Lhn/s;->o(Lhn/s;)Landroid/os/Handler;

    move-result-object v6

    iput-object v0, p0, Lhn/s$e;->t:Ljava/lang/Object;

    iput v4, p0, Lhn/s$e;->w:I

    invoke-static {v0, p1, v5, v6, p0}, Lhn/s;->L(Lhn/s;Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    move-object v13, p0

    goto/16 :goto_4

    :cond_4
    :goto_0
    check-cast p1, Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, p1}, Lhn/s;->O(Lhn/s;Landroid/hardware/camera2/CameraDevice;)V

    :cond_5
    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {p1}, Lhn/s;->n(Lhn/s;)Landroid/hardware/camera2/CameraDevice;

    move-result-object v9

    if-eqz v9, :cond_b

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-virtual {p1}, Lhn/s;->d0()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    iget-object v0, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {v0}, Lhn/s;->w(Lhn/s;)Landroid/media/ImageReader;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v0

    filled-new-array {p1, v0}, [Landroid/view/Surface;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/p;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {p1}, Lhn/s;->F(Lhn/s;)Lmn/a;

    move-result-object p1

    sget-object v0, Lmn/a;->b:Lmn/a;

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {p1}, Lhn/s;->E(Lhn/s;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {p1}, Lhn/s;->y(Lhn/s;)Lhn/r0;

    move-result-object p1

    invoke-virtual {p1}, Lhn/r0;->m()V

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {p1}, Lhn/s;->y(Lhn/s;)Lhn/r0;

    move-result-object p1

    invoke-virtual {p1}, Lhn/r0;->i()Landroid/view/Surface;

    move-result-object p1

    invoke-interface {v8, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    :try_start_1
    sget-object v5, Lhn/g0;->l:Lhn/g0$a;

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-virtual {p1}, Lhn/s;->b0()Lhn/h0;

    move-result-object v6

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {p1}, Lhn/s;->r(Lhn/s;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v7

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {p1}, Lhn/s;->o(Lhn/s;)Landroid/os/Handler;

    move-result-object v10

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    new-instance v11, Lhn/t;

    invoke-direct {v11, p1}, Lhn/t;-><init>(Lhn/s;)V

    iget-object p1, p0, Lhn/s$e;->x:Lhn/s;

    invoke-static {p1}, Lhn/s;->t(Lhn/s;)Llq/a;

    move-result-object v12

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lhn/s$e;->t:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lhn/s$e;->u:Ljava/lang/Object;

    iput v3, p0, Lhn/s$e;->w:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-object v13, p0

    :try_start_2
    invoke-virtual/range {v5 .. v13}, Lhn/g0$a;->a(Lhn/h0;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Llq/a;Lnt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-ne p1, v1, :cond_7

    goto/16 :goto_4

    :cond_7
    move-object v3, v8

    move-object v5, v9

    :goto_1
    :try_start_3
    iget-object v0, v13, Lhn/s$e;->x:Lhn/s;

    move-object v6, p1

    check-cast v6, Lhn/g0;

    invoke-static {v0, v6}, Lhn/s;->S(Lhn/s;Lhn/g0;)V

    check-cast p1, Lhn/g0;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object p1

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :catch_2
    move-exception v0

    :goto_2
    move-object p1, v0

    move-object v3, v8

    move-object v5, v9

    goto :goto_3

    :catch_3
    move-exception v0

    move-object v13, p0

    goto :goto_2

    :goto_3
    iget-object v0, v13, Lhn/s$e;->x:Lhn/s;

    invoke-static {v0}, Lhn/s;->D(Lhn/s;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v6

    iget-object v0, v13, Lhn/s$e;->x:Lhn/s;

    new-instance v8, Lhn/u;

    invoke-direct {v8, v0, p1}, Lhn/u;-><init>(Lhn/s;Ljava/lang/Exception;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "camera"

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logDebugLogEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZILjava/lang/Object;)V

    iget-boolean v0, v13, Lhn/s$e;->y:Z

    if-eqz v0, :cond_a

    iget-object v0, v13, Lhn/s$e;->x:Lhn/s;

    invoke-static {v0}, Lhn/s;->F(Lhn/s;)Lmn/a;

    move-result-object v0

    sget-object v6, Lmn/a;->b:Lmn/a;

    if-ne v0, v6, :cond_8

    iget-object v0, v13, Lhn/s$e;->x:Lhn/s;

    invoke-static {v0}, Lhn/s;->I(Lhn/s;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v13, Lhn/s$e;->x:Lhn/s;

    invoke-static {v0, v4}, Lhn/s;->T(Lhn/s;Z)V

    :cond_8
    iget-object v0, v13, Lhn/s$e;->x:Lhn/s;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v0, v4}, Lhn/s;->N(Lhn/s;F)V

    iget-object v0, v13, Lhn/s$e;->x:Lhn/s;

    invoke-static {v0}, Lhn/s;->J(Lhn/s;)Landroid/media/ImageReader;

    move-result-object v4

    invoke-static {v0, v4}, Lhn/s;->Q(Lhn/s;Landroid/media/ImageReader;)V

    iget-object v0, v13, Lhn/s$e;->x:Lhn/s;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v13, Lhn/s$e;->t:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v13, Lhn/s$e;->u:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v13, Lhn/s$e;->v:Ljava/lang/Object;

    iput v2, v13, Lhn/s$e;->w:I

    const/4 p1, 0x0

    invoke-static {v0, p1, p0}, Lhn/s;->l(Lhn/s;ZLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    :goto_5
    check-cast p1, Lhn/g0;

    return-object p1

    :cond_a
    throw p1

    :cond_b
    move-object v13, p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to open camera"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
