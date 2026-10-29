.class public Lm0/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/u0$a;,
        Lm0/u0$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lx0/y;

.field public final c:Landroid/hardware/camera2/CameraCharacteristics;

.field public d:Lm0/y;

.field public e:Lm0/u0$a;

.field public f:Lx0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/a0<",
            "Lm0/u0$b;",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;>;"
        }
    .end annotation
.end field

.field public g:Lx0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/a0<",
            "Lm0/b0$a;",
            "Lx0/b0<",
            "[B>;>;"
        }
    .end annotation
.end field

.field public h:Lx0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/a0<",
            "Lm0/k$b;",
            "Lx0/b0<",
            "[B>;>;"
        }
    .end annotation
.end field

.field public i:Lx0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/a0<",
            "Lm0/f0$a;",
            "Lg0/f1$i;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lx0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/a0<",
            "Lx0/b0<",
            "[B>;",
            "Lx0/b0<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field public k:Lx0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/a0<",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;",
            "Landroidx/camera/core/d;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lx0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/a0<",
            "Lx0/b0<",
            "[B>;",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;>;"
        }
    .end annotation
.end field

.field public m:Lx0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/a0<",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lx0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/a0<",
            "Lx0/b0<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lx0/b0<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field public final o:Ln0/k3;

.field public final p:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCharacteristics;Lx0/y;)V
    .locals 1

    .line 1
    invoke-static {}, Lu0/b;->c()Ln0/k3;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lm0/u0;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCharacteristics;Lx0/y;Ln0/k3;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCharacteristics;Lx0/y;Ln0/k3;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-class v0, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;

    invoke-static {v0}, Lu0/b;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1}, Lq0/c;->g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Lm0/u0;->a:Ljava/util/concurrent/Executor;

    goto :goto_0

    .line 5
    :cond_0
    iput-object p1, p0, Lm0/u0;->a:Ljava/util/concurrent/Executor;

    .line 6
    :goto_0
    iput-object p3, p0, Lm0/u0;->b:Lx0/y;

    .line 7
    iput-object p2, p0, Lm0/u0;->c:Landroid/hardware/camera2/CameraCharacteristics;

    .line 8
    iput-object p4, p0, Lm0/u0;->o:Ln0/k3;

    .line 9
    const-class p1, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    invoke-virtual {p4, p1}, Ln0/k3;->a(Ljava/lang/Class;)Z

    move-result p1

    iput-boolean p1, p0, Lm0/u0;->p:Z

    return-void
.end method

.method public static synthetic a(Lm0/v0;Lg0/f1$i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm0/v0;->r(Lg0/f1$i;)V

    return-void
.end method

.method public static synthetic b(Lm0/u0;Lm0/u0$b;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lm0/u0$b;->b()Lm0/v0;

    move-result-object v0

    invoke-virtual {v0}, Lm0/v0;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm0/u0$b;->a()Landroidx/camera/core/d;

    move-result-object p0

    invoke-interface {p0}, Landroidx/camera/core/d;->close()V

    return-void

    :cond_0
    iget-object v0, p0, Lm0/u0;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lm0/p0;

    invoke-direct {v1, p0, p1}, Lm0/p0;-><init>(Lm0/u0;Lm0/u0$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic c(Lm0/v0;Landroidx/camera/core/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm0/v0;->q(Landroidx/camera/core/d;)V

    return-void
.end method

.method public static synthetic d(Lm0/u0;Lm0/u0$b;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lm0/u0$b;->b()Lm0/v0;

    move-result-object v0

    invoke-virtual {v0}, Lm0/v0;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "ProcessingNode"

    const-string v0, "The postview image is closed due to request aborted"

    invoke-static {p0, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lm0/u0$b;->a()Landroidx/camera/core/d;

    move-result-object p0

    invoke-interface {p0}, Landroidx/camera/core/d;->close()V

    return-void

    :cond_0
    iget-object v0, p0, Lm0/u0;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lm0/o0;

    invoke-direct {v1, p0, p1}, Lm0/o0;-><init>(Lm0/u0;Lm0/u0$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic e(Lm0/u0;Lm0/u0$b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm0/u0;->m(Lm0/u0$b;)V

    return-void
.end method

.method public static synthetic f(Lm0/v0;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm0/v0;->t(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic g(Lm0/v0;Lg0/h1;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm0/v0;->u(Lg0/h1;)V

    return-void
.end method

.method public static synthetic h(Lm0/u0;Lm0/u0$b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm0/u0;->k(Lm0/u0$b;)V

    return-void
.end method


# virtual methods
.method public final i(Lx0/b0;I)Lx0/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "[B>;I)",
            "Lx0/b0<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p1}, Lx0/b0;->e()I

    move-result v0

    invoke-static {v0}, Lw0/b;->j(I)Z

    move-result v0

    invoke-static {v0}, Lx2/g;->i(Z)V

    iget-object v0, p0, Lm0/u0;->j:Lx0/a0;

    invoke-interface {v0, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/b0;

    iget-object v0, p0, Lm0/u0;->n:Lx0/a0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/b0;

    :cond_0
    iget-object v0, p0, Lm0/u0;->h:Lx0/a0;

    invoke-static {p1, p2}, Lm0/k$b;->c(Lx0/b0;I)Lm0/k$b;

    move-result-object p1

    invoke-interface {v0, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/b0;

    return-object p1
.end method

.method public j(Lm0/u0$b;)Landroidx/camera/core/d;
    .locals 6

    invoke-virtual {p1}, Lm0/u0$b;->b()Lm0/v0;

    move-result-object v0

    iget-object v1, p0, Lm0/u0;->f:Lx0/a0;

    invoke-interface {v1, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/b0;

    iget-object v1, p0, Lm0/u0;->e:Lm0/u0$a;

    invoke-virtual {v1}, Lm0/u0$a;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    invoke-static {v2}, Lx2/g;->a(Z)V

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1}, Lx0/b0;->e()I

    move-result v4

    const/16 v5, 0x23

    if-eq v4, v5, :cond_0

    iget-object v4, p0, Lm0/u0;->n:Lx0/a0;

    if-nez v4, :cond_0

    iget-boolean v4, p0, Lm0/u0;->p:Z

    if-eqz v4, :cond_2

    :cond_0
    const/16 v4, 0x100

    if-ne v2, v4, :cond_2

    iget-object v2, p0, Lm0/u0;->g:Lx0/a0;

    invoke-virtual {v0}, Lm0/v0;->c()I

    move-result v4

    invoke-static {p1, v4}, Lm0/b0$a;->c(Lx0/b0;I)Lm0/b0$a;

    move-result-object p1

    invoke-interface {v2, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/b0;

    iget-object v2, p0, Lm0/u0;->n:Lx0/a0;

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lm0/v0;->c()I

    move-result v2

    invoke-virtual {p0, p1, v2}, Lm0/u0;->i(Lx0/b0;I)Lx0/b0;

    move-result-object p1

    :cond_1
    iget-object v2, p0, Lm0/u0;->l:Lx0/a0;

    invoke-interface {v2, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/b0;

    :cond_2
    iget-object v2, p0, Lm0/u0;->k:Lx0/a0;

    invoke-interface {v2, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/d;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v3, :cond_3

    invoke-virtual {v0}, Lm0/v0;->k()Lm0/l1;

    move-result-object v0

    invoke-interface {p1}, Landroidx/camera/core/d;->getFormat()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Lm0/l1;->u(IZ)V

    :cond_3
    return-object p1
.end method

.method public k(Lm0/u0$b;)V
    .locals 4

    invoke-virtual {p1}, Lm0/u0$b;->b()Lm0/v0;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lm0/u0;->e:Lm0/u0$a;

    invoke-virtual {v2}, Lm0/u0$a;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    invoke-virtual {p1}, Lm0/u0$b;->b()Lm0/v0;

    move-result-object v2

    invoke-virtual {v2}, Lm0/v0;->m()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1}, Lm0/u0;->j(Lm0/u0$b;)Landroidx/camera/core/d;

    move-result-object p1

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    new-instance v3, Lm0/q0;

    invoke-direct {v3, v0, p1}, Lm0/q0;-><init>(Lm0/v0;Landroidx/camera/core/d;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_4

    :cond_1
    invoke-virtual {p0, p1}, Lm0/u0;->l(Lm0/u0$b;)Lg0/f1$i;

    move-result-object p1

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lm0/v0;->k()Lm0/l1;

    move-result-object v2

    invoke-virtual {v2}, Lm0/l1;->s()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :goto_1
    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    new-instance v3, Lm0/r0;

    invoke-direct {v3, v0, p1}, Lm0/r0;-><init>(Lm0/v0;Lg0/f1$i;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lg0/h1; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_2
    new-instance v2, Lg0/h1;

    const-string v3, "Processing failed."

    invoke-direct {v2, v1, v3, p1}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0, v2}, Lm0/u0;->q(Lm0/v0;Lg0/h1;)V

    goto :goto_5

    :goto_3
    new-instance v2, Lg0/h1;

    const-string v3, "Processing failed due to low memory."

    invoke-direct {v2, v1, v3, p1}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0, v2}, Lm0/u0;->q(Lm0/v0;Lg0/h1;)V

    goto :goto_5

    :goto_4
    invoke-virtual {p0, v0, p1}, Lm0/u0;->q(Lm0/v0;Lg0/h1;)V

    :goto_5
    return-void
.end method

.method public l(Lm0/u0$b;)Lg0/f1$i;
    .locals 7

    iget-object v0, p0, Lm0/u0;->e:Lm0/u0$a;

    invoke-virtual {v0}, Lm0/u0$a;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v1}, Lx2/g;->a(Z)V

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lw0/b;->j(I)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v4}, Lw0/b;->k(I)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    move v5, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v5, v2

    :goto_1
    const-string v6, "On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lm0/u0$b;->b()Lm0/v0;

    move-result-object v3

    invoke-virtual {v3}, Lm0/v0;->d()Lg0/f1$h;

    move-result-object v5

    if-eqz v5, :cond_2

    move v5, v2

    goto :goto_2

    :cond_2
    move v5, v1

    :goto_2
    const-string v6, "OutputFileOptions cannot be empty"

    invoke-static {v5, v6}, Lx2/g;->b(ZLjava/lang/Object;)V

    iget-object v5, p0, Lm0/u0;->f:Lx0/a0;

    invoke-interface {v5, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/b0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v5, 0x20

    if-le v0, v2, :cond_5

    invoke-virtual {v3}, Lm0/v0;->d()Lg0/f1$h;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lm0/v0;->g()Lg0/f1$h;

    move-result-object v0

    if-eqz v0, :cond_3

    move v1, v2

    :cond_3
    const-string v0, "The number of OutputFileOptions for simultaneous capture should be at least two"

    invoke-static {v1, v0}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lx0/b0;->e()I

    move-result v0

    if-eq v0, v5, :cond_4

    invoke-virtual {v3}, Lm0/v0;->g()Lg0/f1$h;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lm0/v0;->c()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lm0/u0;->o(Lx0/b0;Lg0/f1$h;I)Lg0/f1$i;

    move-result-object p1

    invoke-virtual {v3}, Lm0/v0;->k()Lm0/l1;

    move-result-object v0

    const/16 v1, 0x100

    invoke-virtual {v0, v1, v2}, Lm0/l1;->u(IZ)V

    return-object p1

    :cond_4
    invoke-virtual {v3}, Lm0/v0;->d()Lg0/f1$h;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Lm0/u0;->p(Lx0/b0;Lg0/f1$h;)Lg0/f1$i;

    move-result-object p1

    invoke-virtual {v3}, Lm0/v0;->k()Lm0/l1;

    move-result-object v0

    invoke-virtual {v0, v5, v2}, Lm0/l1;->u(IZ)V

    return-object p1

    :cond_5
    if-eq v4, v5, :cond_6

    invoke-virtual {v3}, Lm0/v0;->d()Lg0/f1$h;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lm0/v0;->c()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lm0/u0;->o(Lx0/b0;Lg0/f1$h;I)Lg0/f1$i;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-virtual {v3}, Lm0/v0;->d()Lg0/f1$h;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Lm0/u0;->p(Lx0/b0;Lg0/f1$h;)Lg0/f1$i;

    move-result-object p1

    return-object p1
.end method

.method public m(Lm0/u0$b;)V
    .locals 5

    invoke-virtual {p1}, Lm0/u0$b;->b()Lm0/v0;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lm0/u0;->f:Lx0/a0;

    invoke-interface {v1, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/b0;

    invoke-virtual {v1}, Lx0/b0;->e()I

    move-result v2

    const/16 v3, 0x23

    if-eq v2, v3, :cond_1

    const/16 v3, 0x100

    if-eq v2, v3, :cond_1

    const/16 v3, 0x1005

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    const-string v4, "Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    iget-object v2, p0, Lm0/u0;->m:Lx0/a0;

    invoke-interface {v2, v1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    new-instance v3, Lm0/s0;

    invoke-direct {v3, v0, v1}, Lm0/s0;-><init>(Lm0/v0;Landroid/graphics/Bitmap;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p1}, Lm0/u0$b;->a()Landroidx/camera/core/d;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    const-string p1, "ProcessingNode"

    const-string v1, "process postview input packet failed."

    invoke-static {p1, v1, v0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public n()V
    .locals 0

    return-void
.end method

.method public final o(Lx0/b0;Lg0/f1$h;I)Lg0/f1$i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;",
            "Lg0/f1$h;",
            "I)",
            "Lg0/f1$i;"
        }
    .end annotation

    iget-object v0, p0, Lm0/u0;->g:Lx0/a0;

    invoke-static {p1, p3}, Lm0/b0$a;->c(Lx0/b0;I)Lm0/b0$a;

    move-result-object p1

    invoke-interface {v0, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/b0;

    invoke-virtual {p1}, Lx0/b0;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lm0/u0;->n:Lx0/a0;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1, p3}, Lm0/u0;->i(Lx0/b0;I)Lx0/b0;

    move-result-object p1

    :cond_1
    iget-object p3, p0, Lm0/u0;->i:Lx0/a0;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, p2}, Lm0/f0$a;->c(Lx0/b0;Lg0/f1$h;)Lm0/f0$a;

    move-result-object p1

    invoke-interface {p3, p1}, Lx0/a0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/f1$i;

    return-object p1
.end method

.method public final p(Lx0/b0;Lg0/f1$h;)Lg0/f1$i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;",
            "Lg0/f1$h;",
            ")",
            "Lg0/f1$i;"
        }
    .end annotation

    iget-object v0, p0, Lm0/u0;->d:Lm0/y;

    if-nez v0, :cond_2

    iget-object v0, p0, Lm0/u0;->c:Landroid/hardware/camera2/CameraCharacteristics;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lx0/b0;->a()Ln0/e0;

    move-result-object v0

    invoke-interface {v0}, Ln0/e0;->e()Landroid/hardware/camera2/CaptureResult;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lm0/y;

    iget-object v1, p0, Lm0/u0;->c:Landroid/hardware/camera2/CameraCharacteristics;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lx0/b0;->a()Ln0/e0;

    move-result-object v2

    invoke-interface {v2}, Ln0/e0;->e()Landroid/hardware/camera2/CaptureResult;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Lm0/y;-><init>(Landroid/hardware/camera2/CameraCharacteristics;Landroid/hardware/camera2/CaptureResult;)V

    iput-object v0, p0, Lm0/u0;->d:Lm0/y;

    goto :goto_0

    :cond_0
    new-instance p1, Lg0/h1;

    const-string p2, "CameraCaptureResult is null, DngCreator cannot be created"

    invoke-direct {p1, v2, p2, v1}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    new-instance p1, Lg0/h1;

    const-string p2, "CameraCharacteristics is null, DngCreator cannot be created"

    invoke-direct {p1, v2, p2, v1}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_2
    :goto_0
    iget-object v0, p0, Lm0/u0;->d:Lm0/y;

    invoke-virtual {p1}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/d;

    invoke-virtual {p1}, Lx0/b0;->f()I

    move-result p1

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, p1, p2}, Lm0/y$a;->d(Landroidx/camera/core/d;ILg0/f1$h;)Lm0/y$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lm0/y;->a(Lm0/y$a;)Lg0/f1$i;

    move-result-object p1

    return-object p1
.end method

.method public final q(Lm0/v0;Lg0/h1;)V
    .locals 2

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lm0/t0;

    invoke-direct {v1, p1, p2}, Lm0/t0;-><init>(Lm0/v0;Lg0/h1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public r(Lm0/u0$a;)Ljava/lang/Void;
    .locals 2

    iput-object p1, p0, Lm0/u0;->e:Lm0/u0$a;

    invoke-virtual {p1}, Lm0/u0$a;->a()Lx0/u;

    move-result-object v0

    new-instance v1, Lm0/m0;

    invoke-direct {v1, p0}, Lm0/m0;-><init>(Lm0/u0;)V

    invoke-virtual {v0, v1}, Lx0/u;->a(Lx2/a;)V

    invoke-virtual {p1}, Lm0/u0$a;->d()Lx0/u;

    move-result-object v0

    new-instance v1, Lm0/n0;

    invoke-direct {v1, p0}, Lm0/n0;-><init>(Lm0/u0;)V

    invoke-virtual {v0, v1}, Lx0/u;->a(Lx2/a;)V

    new-instance v0, Lm0/l0;

    invoke-direct {v0}, Lm0/l0;-><init>()V

    iput-object v0, p0, Lm0/u0;->f:Lx0/a0;

    new-instance v0, Lm0/b0;

    iget-object v1, p0, Lm0/u0;->o:Ln0/k3;

    invoke-direct {v0, v1}, Lm0/b0;-><init>(Ln0/k3;)V

    iput-object v0, p0, Lm0/u0;->g:Lx0/a0;

    new-instance v0, Lm0/e0;

    invoke-direct {v0}, Lm0/e0;-><init>()V

    iput-object v0, p0, Lm0/u0;->j:Lx0/a0;

    new-instance v0, Lm0/k;

    invoke-direct {v0}, Lm0/k;-><init>()V

    iput-object v0, p0, Lm0/u0;->h:Lx0/a0;

    new-instance v0, Lm0/f0;

    invoke-direct {v0}, Lm0/f0;-><init>()V

    iput-object v0, p0, Lm0/u0;->i:Lx0/a0;

    new-instance v0, Lm0/h0;

    invoke-direct {v0}, Lm0/h0;-><init>()V

    iput-object v0, p0, Lm0/u0;->k:Lx0/a0;

    new-instance v0, Lm0/a0;

    invoke-direct {v0}, Lm0/a0;-><init>()V

    iput-object v0, p0, Lm0/u0;->m:Lx0/a0;

    invoke-virtual {p1}, Lm0/u0$a;->b()I

    move-result p1

    const/16 v0, 0x23

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lm0/u0;->b:Lx0/y;

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lm0/u0;->p:Z

    if-eqz p1, :cond_1

    :cond_0
    new-instance p1, Lm0/g0;

    invoke-direct {p1}, Lm0/g0;-><init>()V

    iput-object p1, p0, Lm0/u0;->l:Lx0/a0;

    :cond_1
    iget-object p1, p0, Lm0/u0;->b:Lx0/y;

    if-eqz p1, :cond_2

    new-instance v0, Lm0/l;

    invoke-direct {v0, p1}, Lm0/l;-><init>(Lx0/y;)V

    iput-object v0, p0, Lm0/u0;->n:Lx0/a0;

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
