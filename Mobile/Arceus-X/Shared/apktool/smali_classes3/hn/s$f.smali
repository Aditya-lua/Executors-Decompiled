.class public final Lhn/s$f;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhn/s;->X(Lnt/b;)Ljava/lang/Object;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroy$2"
    f = "Camera2Manager.kt"
    l = {
        0x1f3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lhn/s;


# direct methods
.method public constructor <init>(Lhn/s;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/s;",
            "Lnt/b<",
            "-",
            "Lhn/s$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhn/s$f;->u:Lhn/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 1
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

    new-instance p1, Lhn/s$f;

    iget-object v0, p0, Lhn/s$f;->u:Lhn/s;

    invoke-direct {p1, v0, p2}, Lhn/s$f;-><init>(Lhn/s;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lhn/s$f;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lhn/s$f;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lhn/s$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lhn/s$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lhn/s$f;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1}, Lhn/s;->G(Lhn/s;)Lnu/c0;

    move-result-object p1

    invoke-interface {p1}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lhn/s$d$b;->a:Lhn/s$d$b;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1}, Lhn/s;->G(Lhn/s;)Lnu/c0;

    move-result-object p1

    invoke-interface {p1, v1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-virtual {p1}, Lhn/s;->d0()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    iget-object v1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {v1}, Lhn/s;->C(Lhn/s;)Landroid/view/SurfaceHolder$Callback;

    move-result-object v1

    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1}, Lhn/s;->A(Lhn/s;)Landroid/os/ConditionVariable;

    move-result-object p1

    const-wide/16 v3, 0x7d0

    invoke-virtual {p1, v3, v4}, Landroid/os/ConditionVariable;->block(J)Z

    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1}, Lhn/s;->y(Lhn/s;)Lhn/r0;

    move-result-object p1

    iput v2, p0, Lhn/s$f;->t:I

    invoke-virtual {p1, p0}, Lhn/r0;->h(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1}, Lhn/s;->x(Lhn/s;)Lin/f;

    move-result-object p1

    invoke-virtual {p1}, Lin/f;->i()V

    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1}, Lhn/s;->w(Lhn/s;)Landroid/media/ImageReader;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/ImageReader;->close()V

    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1}, Lhn/s;->B(Lhn/s;)Lhn/g0;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lhn/g0;->f()V

    :cond_4
    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lhn/s;->S(Lhn/s;Lhn/g0;)V

    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1}, Lhn/s;->n(Lhn/s;)Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    :cond_5
    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1, v0}, Lhn/s;->O(Lhn/s;Landroid/hardware/camera2/CameraDevice;)V

    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1}, Lhn/s;->q(Lhn/s;)Lln/a;

    move-result-object p1

    invoke-interface {p1}, Lln/a;->c()V

    iget-object p1, p0, Lhn/s$f;->u:Lhn/s;

    invoke-static {p1}, Lhn/s;->s(Lhn/s;)Lku/p0;

    move-result-object p1

    invoke-static {p1, v0, v2, v0}, Lku/q0;->f(Lku/p0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
