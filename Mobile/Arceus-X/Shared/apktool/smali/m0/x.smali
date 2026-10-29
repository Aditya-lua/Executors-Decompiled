.class public Lm0/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/x$c;
    }
.end annotation


# instance fields
.field public a:Lm0/v0;

.field public b:Landroidx/camera/core/f;

.field public c:Landroidx/camera/core/f;

.field public d:Landroidx/camera/core/f;

.field public e:Lm0/u0$a;

.field public f:Lm0/x$c;

.field public g:Lm0/j0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lm0/x;->a:Lm0/v0;

    iput-object v0, p0, Lm0/x;->g:Lm0/j0;

    return-void
.end method

.method public static synthetic a(Lm0/x;Ln0/j2;)V
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Failed to acquire latest image"

    const/4 v1, 0x2

    :try_start_0
    invoke-interface {p1}, Ln0/j2;->b()Landroidx/camera/core/d;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lm0/x;->k(Landroidx/camera/core/d;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lm0/x;->a:Lm0/v0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lm0/v0;->e()I

    move-result p1

    new-instance v2, Lg0/h1;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v0, v3}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1, v2}, Lm0/b1$a;->c(ILg0/h1;)Lm0/b1$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm0/x;->p(Lm0/b1$a;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    iget-object v2, p0, Lm0/x;->a:Lm0/v0;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lm0/v0;->e()I

    move-result v2

    new-instance v3, Lg0/h1;

    invoke-direct {v3, v1, v0, p1}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v2, v3}, Lm0/b1$a;->c(ILg0/h1;)Lm0/b1$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm0/x;->p(Lm0/b1$a;)V

    :cond_1
    return-void
.end method

.method public static synthetic b(Lm0/x;Lm0/v0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm0/x;->l(Lm0/v0;)V

    iget-object p0, p0, Lm0/x;->g:Lm0/j0;

    invoke-virtual {p0, p1}, Lm0/j0;->h(Lm0/v0;)V

    return-void
.end method

.method public static synthetic c(Landroidx/camera/core/f;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/f;->j()V

    return-void
.end method

.method public static synthetic d(Landroidx/camera/core/f;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/f;->j()V

    :cond_0
    return-void
.end method

.method public static synthetic e(Lm0/x;Ln0/j2;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-interface {p1}, Ln0/j2;->b()Landroidx/camera/core/d;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lm0/x;->m(Landroidx/camera/core/d;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p0

    const-string p1, "CaptureNode"

    const-string v0, "Failed to acquire latest image of postview"

    invoke-static {p1, v0, p0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic f(Landroidx/camera/core/f;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/f;->j()V

    :cond_0
    return-void
.end method

.method public static synthetic g(Lm0/x;)Lm0/j0;
    .locals 0

    iget-object p0, p0, Lm0/x;->g:Lm0/j0;

    return-object p0
.end method

.method public static h(Lg0/m1;III)Ln0/j2;
    .locals 7

    if-eqz p0, :cond_0

    const/4 v4, 0x4

    const-wide/16 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v6}, Lg0/m1;->a(IIIIJ)Ln0/j2;

    move-result-object p0

    return-object p0

    :cond_0
    move v1, p1

    move v2, p2

    move v3, p3

    const/4 p0, 0x4

    invoke-static {v1, v2, v3, p0}, Lg0/n1;->a(IIII)Ln0/j2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public i()I
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/x;->b:Landroidx/camera/core/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The ImageReader is not initialized."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Lm0/x;->b:Landroidx/camera/core/f;

    invoke-virtual {v0}, Landroidx/camera/core/f;->i()I

    move-result v0

    return v0
.end method

.method public final j(Landroidx/camera/core/d;)V
    .locals 4

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/x;->e:Lm0/u0$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lm0/u0$a;->a()Lx0/u;

    move-result-object v0

    iget-object v1, p0, Lm0/x;->a:Lm0/v0;

    invoke-static {v1, p1}, Lm0/u0$b;->c(Lm0/v0;Landroidx/camera/core/d;)Lm0/u0$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx0/u;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lm0/x;->a:Lm0/v0;

    iget-object v1, p0, Lm0/x;->f:Lm0/x$c;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lm0/x$c;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v2, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v3, p0, Lm0/x;->a:Lm0/v0;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lm0/v0;->k()Lm0/l1;

    move-result-object v3

    invoke-interface {p1}, Landroidx/camera/core/d;->getFormat()I

    move-result p1

    invoke-virtual {v3, p1, v2}, Lm0/l1;->u(IZ)V

    :cond_1
    if-eqz v1, :cond_2

    iget-object p1, p0, Lm0/x;->a:Lm0/v0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lm0/v0;->k()Lm0/l1;

    move-result-object p1

    invoke-virtual {p1}, Lm0/l1;->s()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Lm0/x;->a:Lm0/v0;

    :cond_3
    invoke-virtual {v0}, Lm0/v0;->s()V

    return-void
.end method

.method public k(Landroidx/camera/core/d;)V
    .locals 3

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/x;->a:Lm0/v0;

    const-string v1, "CaptureNode"

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Discarding ImageProxy which was inadvertently acquired: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    return-void

    :cond_0
    invoke-interface {p1}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v0

    invoke-interface {v0}, Lg0/i1;->c()Ln0/z3;

    move-result-object v0

    iget-object v2, p0, Lm0/x;->a:Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ln0/z3;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    const-string v0, "Discarding ImageProxy which was acquired for aborted request"

    invoke-static {v1, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lm0/x;->j(Landroidx/camera/core/d;)V

    return-void
.end method

.method public l(Lm0/v0;)V
    .locals 4

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p1}, Lm0/v0;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "only one capture stage is supported."

    invoke-static {v0, v3}, Lx2/g;->j(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lm0/x;->i()I

    move-result v0

    if-lez v0, :cond_1

    move v1, v2

    :cond_1
    const-string v0, "Too many acquire images. Close image to be able to process next."

    invoke-static {v1, v0}, Lx2/g;->j(ZLjava/lang/String;)V

    iput-object p1, p0, Lm0/x;->a:Lm0/v0;

    invoke-virtual {p1}, Lm0/v0;->a()Lne/x;

    move-result-object v0

    new-instance v1, Lm0/x$b;

    invoke-direct {v1, p0, p1}, Lm0/x$b;-><init>(Lm0/x;Lm0/v0;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final m(Landroidx/camera/core/d;)V
    .locals 2

    iget-object v0, p0, Lm0/x;->a:Lm0/v0;

    if-nez v0, :cond_0

    const-string v0, "CaptureNode"

    const-string v1, "Postview image is closed due to request completed or aborted"

    invoke-static {v0, v1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    return-void

    :cond_0
    iget-object v0, p0, Lm0/x;->e:Lm0/u0$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lm0/u0$a;->d()Lx0/u;

    move-result-object v0

    iget-object v1, p0, Lm0/x;->a:Lm0/v0;

    invoke-static {v1, p1}, Lm0/u0$b;->c(Lm0/v0;Landroidx/camera/core/d;)Lm0/u0$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx0/u;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public n()V
    .locals 4

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/x;->f:Lm0/x$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lm0/x;->b:Landroidx/camera/core/f;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lm0/x;->c:Landroidx/camera/core/f;

    iget-object v3, p0, Lm0/x;->d:Landroidx/camera/core/f;

    invoke-virtual {p0, v0, v1, v2, v3}, Lm0/x;->o(Lm0/x$c;Landroidx/camera/core/f;Landroidx/camera/core/f;Landroidx/camera/core/f;)V

    return-void
.end method

.method public final o(Lm0/x$c;Landroidx/camera/core/f;Landroidx/camera/core/f;Landroidx/camera/core/f;)V
    .locals 2

    invoke-virtual {p1}, Lm0/x$c;->l()Ln0/u1;

    move-result-object v0

    invoke-virtual {v0}, Ln0/u1;->d()V

    invoke-virtual {p1}, Lm0/x$c;->l()Ln0/u1;

    move-result-object v0

    invoke-virtual {v0}, Ln0/u1;->k()Lne/x;

    move-result-object v0

    new-instance v1, Lm0/s;

    invoke-direct {v1, p2}, Lm0/s;-><init>(Landroidx/camera/core/f;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p2

    invoke-interface {v0, v1, p2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lm0/x$c;->g()Ln0/u1;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lm0/x$c;->g()Ln0/u1;

    move-result-object p2

    invoke-virtual {p2}, Ln0/u1;->d()V

    invoke-virtual {p1}, Lm0/x$c;->g()Ln0/u1;

    move-result-object p2

    invoke-virtual {p2}, Ln0/u1;->k()Lne/x;

    move-result-object p2

    new-instance v0, Lm0/t;

    invoke-direct {v0, p4}, Lm0/t;-><init>(Landroidx/camera/core/f;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p4

    invoke-interface {p2, v0, p4}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    invoke-virtual {p1}, Lm0/x$c;->e()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 p4, 0x1

    if-le p2, p4, :cond_1

    invoke-virtual {p1}, Lm0/x$c;->j()Ln0/u1;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lm0/x$c;->j()Ln0/u1;

    move-result-object p2

    invoke-virtual {p2}, Ln0/u1;->d()V

    invoke-virtual {p1}, Lm0/x$c;->j()Ln0/u1;

    move-result-object p1

    invoke-virtual {p1}, Ln0/u1;->k()Lne/x;

    move-result-object p1

    new-instance p2, Lm0/u;

    invoke-direct {p2, p3}, Lm0/u;-><init>(Landroidx/camera/core/f;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_1
    return-void
.end method

.method public p(Lm0/b1$a;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/x;->a:Lm0/v0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm0/v0;->e()I

    move-result v0

    invoke-virtual {p1}, Lm0/b1$a;->b()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lm0/x;->a:Lm0/v0;

    invoke-virtual {p1}, Lm0/b1$a;->a()Lg0/h1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lm0/v0;->n(Lg0/h1;)V

    :cond_0
    return-void
.end method

.method public final q(Ln0/j2;)V
    .locals 2

    new-instance v0, Lm0/v;

    invoke-direct {v0, p0}, Lm0/v;-><init>(Lm0/x;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ln0/j2;->f(Ln0/j2$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public r(Landroidx/camera/core/b$a;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/x;->b:Landroidx/camera/core/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The ImageReader is not initialized."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Lm0/x;->b:Landroidx/camera/core/f;

    invoke-virtual {v0, p1}, Landroidx/camera/core/f;->k(Landroidx/camera/core/b$a;)V

    return-void
.end method

.method public s(Lm0/x$c;)Lm0/u0$a;
    .locals 12

    iget-object v0, p0, Lm0/x;->f:Lm0/x$c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lm0/x;->b:Landroidx/camera/core/f;

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "CaptureNode does not support recreation yet."

    invoke-static {v0, v3}, Lx2/g;->j(ZLjava/lang/String;)V

    iput-object p1, p0, Lm0/x;->f:Lm0/x$c;

    invoke-virtual {p1}, Lm0/x$c;->k()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p1}, Lm0/x$c;->d()I

    move-result v3

    invoke-virtual {p1}, Lm0/x$c;->m()Z

    move-result v4

    new-instance v5, Lm0/x$a;

    invoke-direct {v5, p0}, Lm0/x$a;-><init>(Lm0/x;)V

    invoke-virtual {p1}, Lm0/x$c;->e()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-le v6, v2, :cond_1

    move v6, v2

    goto :goto_1

    :cond_1
    move v6, v1

    :goto_1
    const/4 v7, 0x0

    if-nez v4, :cond_3

    invoke-virtual {p1}, Lm0/x$c;->c()Lg0/m1;

    move-result-object v4

    if-nez v4, :cond_3

    const/4 v4, 0x2

    const/4 v8, 0x4

    if-eqz v6, :cond_2

    new-instance v3, Landroidx/camera/core/e;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v7

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v9

    const/16 v10, 0x100

    invoke-direct {v3, v7, v9, v10, v8}, Landroidx/camera/core/e;-><init>(IIII)V

    invoke-virtual {v3}, Landroidx/camera/core/e;->m()Ln0/u;

    move-result-object v7

    new-array v9, v4, [Ln0/u;

    aput-object v5, v9, v1

    aput-object v7, v9, v2

    invoke-static {v9}, Ln0/v;->b([Ln0/u;)Ln0/u;

    move-result-object v7

    new-instance v9, Landroidx/camera/core/e;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v10

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    const/16 v11, 0x20

    invoke-direct {v9, v10, v0, v11, v8}, Landroidx/camera/core/e;-><init>(IIII)V

    invoke-virtual {v9}, Landroidx/camera/core/e;->m()Ln0/u;

    move-result-object v0

    new-array v4, v4, [Ln0/u;

    aput-object v5, v4, v1

    aput-object v0, v4, v2

    invoke-static {v4}, Ln0/v;->b([Ln0/u;)Ln0/u;

    move-result-object v0

    move-object v5, v7

    move-object v7, v0

    goto :goto_2

    :cond_2
    new-instance v9, Landroidx/camera/core/e;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v10

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-direct {v9, v10, v0, v3, v8}, Landroidx/camera/core/e;-><init>(IIII)V

    invoke-virtual {v9}, Landroidx/camera/core/e;->m()Ln0/u;

    move-result-object v0

    new-array v3, v4, [Ln0/u;

    aput-object v5, v3, v1

    aput-object v0, v3, v2

    invoke-static {v3}, Ln0/v;->b([Ln0/u;)Ln0/u;

    move-result-object v0

    move-object v5, v0

    move-object v3, v9

    move-object v9, v7

    :goto_2
    new-instance v0, Lm0/o;

    invoke-direct {v0, p0}, Lm0/o;-><init>(Lm0/x;)V

    goto :goto_3

    :cond_3
    new-instance v1, Lm0/j0;

    invoke-virtual {p1}, Lm0/x$c;->c()Lg0/m1;

    move-result-object v2

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-static {v2, v4, v0, v3}, Lm0/x;->h(Lg0/m1;III)Ln0/j2;

    move-result-object v0

    invoke-direct {v1, v0}, Lm0/j0;-><init>(Ln0/j2;)V

    iput-object v1, p0, Lm0/x;->g:Lm0/j0;

    new-instance v0, Lm0/p;

    invoke-direct {v0, p0}, Lm0/p;-><init>(Lm0/x;)V

    move-object v3, v1

    move-object v9, v7

    :goto_3
    invoke-virtual {p1, v5}, Lm0/x$c;->o(Ln0/u;)V

    if-eqz v6, :cond_4

    if-eqz v7, :cond_4

    invoke-virtual {p1, v7}, Lm0/x$c;->q(Ln0/u;)V

    :cond_4
    invoke-interface {v3}, Ln0/j2;->getSurface()Landroid/view/Surface;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lm0/x$c;->s(Landroid/view/Surface;)V

    new-instance v1, Landroidx/camera/core/f;

    invoke-direct {v1, v3}, Landroidx/camera/core/f;-><init>(Ln0/j2;)V

    iput-object v1, p0, Lm0/x;->b:Landroidx/camera/core/f;

    invoke-virtual {p0, v3}, Lm0/x;->q(Ln0/j2;)V

    invoke-virtual {p1}, Lm0/x$c;->f()Lm0/k0;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lm0/x$c;->c()Lg0/m1;

    move-result-object v2

    invoke-virtual {v1}, Lm0/k0;->c()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Lm0/k0;->c()Landroid/util/Size;

    move-result-object v4

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-virtual {v1}, Lm0/k0;->b()I

    move-result v5

    invoke-static {v2, v3, v4, v5}, Lm0/x;->h(Lg0/m1;III)Ln0/j2;

    move-result-object v2

    new-instance v3, Lm0/q;

    invoke-direct {v3, p0}, Lm0/q;-><init>(Lm0/x;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ln0/j2;->f(Ln0/j2$a;Ljava/util/concurrent/Executor;)V

    new-instance v3, Landroidx/camera/core/f;

    invoke-direct {v3, v2}, Landroidx/camera/core/f;-><init>(Ln0/j2;)V

    iput-object v3, p0, Lm0/x;->d:Landroidx/camera/core/f;

    invoke-interface {v2}, Ln0/j2;->getSurface()Landroid/view/Surface;

    move-result-object v2

    invoke-virtual {v1}, Lm0/k0;->c()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v1}, Lm0/k0;->b()I

    move-result v1

    invoke-virtual {p1, v2, v3, v1}, Lm0/x$c;->p(Landroid/view/Surface;Landroid/util/Size;I)V

    :cond_5
    if-eqz v6, :cond_6

    if-eqz v9, :cond_6

    invoke-interface {v9}, Ln0/j2;->getSurface()Landroid/view/Surface;

    move-result-object v1

    invoke-virtual {p1, v1}, Lm0/x$c;->r(Landroid/view/Surface;)V

    new-instance v1, Landroidx/camera/core/f;

    invoke-direct {v1, v9}, Landroidx/camera/core/f;-><init>(Ln0/j2;)V

    iput-object v1, p0, Lm0/x;->c:Landroidx/camera/core/f;

    invoke-virtual {p0, v9}, Lm0/x;->q(Ln0/j2;)V

    :cond_6
    invoke-virtual {p1}, Lm0/x$c;->h()Lx0/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Lx0/u;->a(Lx2/a;)V

    invoke-virtual {p1}, Lm0/x$c;->b()Lx0/u;

    move-result-object v0

    new-instance v1, Lm0/r;

    invoke-direct {v1, p0}, Lm0/r;-><init>(Lm0/x;)V

    invoke-virtual {v0, v1}, Lx0/u;->a(Lx2/a;)V

    invoke-virtual {p1}, Lm0/x$c;->d()I

    move-result v0

    invoke-virtual {p1}, Lm0/x$c;->e()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Lm0/u0$a;->e(ILjava/util/List;)Lm0/u0$a;

    move-result-object p1

    iput-object p1, p0, Lm0/x;->e:Lm0/u0$a;

    return-object p1
.end method
