.class public final Lx0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/j2;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroid/view/Surface;

.field public final c:I

.field public final d:I

.field public final e:Landroid/util/Size;

.field public final f:Lg0/j2$a;

.field public final g:Lg0/j2$a;

.field public final h:[F

.field public final i:[F

.field public final j:[F

.field public final k:[F

.field public l:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Lg0/j2$b;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/util/concurrent/Executor;

.field public n:Z

.field public o:Z

.field public final p:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public q:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public r:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/view/Surface;IILandroid/util/Size;Lg0/j2$a;Lg0/j2$a;Landroid/graphics/Matrix;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lx0/q0;->a:Ljava/lang/Object;

    const/16 v0, 0x10

    new-array v1, v0, [F

    iput-object v1, p0, Lx0/q0;->h:[F

    new-array v2, v0, [F

    iput-object v2, p0, Lx0/q0;->i:[F

    new-array v3, v0, [F

    iput-object v3, p0, Lx0/q0;->j:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lx0/q0;->k:[F

    const/4 v4, 0x0

    iput-boolean v4, p0, Lx0/q0;->n:Z

    iput-boolean v4, p0, Lx0/q0;->o:Z

    iput-object p1, p0, Lx0/q0;->b:Landroid/view/Surface;

    iput p2, p0, Lx0/q0;->c:I

    iput p3, p0, Lx0/q0;->d:I

    iput-object p4, p0, Lx0/q0;->e:Landroid/util/Size;

    iput-object p5, p0, Lx0/q0;->f:Lg0/j2$a;

    iput-object p6, p0, Lx0/q0;->g:Lg0/j2$a;

    iput-object p7, p0, Lx0/q0;->r:Landroid/graphics/Matrix;

    invoke-static {v1, v3, p5}, Lx0/q0;->c([F[FLg0/j2$a;)V

    invoke-static {v2, v0, p6}, Lx0/q0;->c([F[FLg0/j2$a;)V

    new-instance p1, Lx0/o0;

    invoke-direct {p1, p0}, Lx0/o0;-><init>(Lx0/q0;)V

    invoke-static {p1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    iput-object p1, p0, Lx0/q0;->p:Lne/x;

    return-void
.end method

.method public static synthetic a(Lx0/q0;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    iput-object p1, p0, Lx0/q0;->q:Ly1/c$a;

    const-string p0, "SurfaceOutputImpl close future complete"

    return-object p0
.end method

.method public static synthetic b(Lx0/q0;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx2/a;

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lg0/j2$b;->c(ILg0/j2;)Lg0/j2$b;

    move-result-object p0

    invoke-interface {p1, p0}, Lx2/a;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static c([F[FLg0/j2$a;)V
    .locals 9

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    if-nez p2, :cond_0

    return-void

    :cond_0
    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {p0, v1}, Lp0/t;->d([FF)V

    invoke-virtual {p2}, Lg0/j2$a;->e()I

    move-result v2

    int-to-float v2, v2

    invoke-static {p0, v2, v1, v1}, Lp0/t;->c([FFFF)V

    invoke-virtual {p2}, Lg0/j2$a;->d()Z

    move-result v1

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v1, :cond_1

    invoke-static {p0, v0, v3, v2, v2}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    const/high16 v1, -0x40800000    # -1.0f

    invoke-static {p0, v0, v1, v3, v3}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    :cond_1
    invoke-virtual {p2}, Lg0/j2$a;->c()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {p2}, Lg0/j2$a;->e()I

    move-result v4

    invoke-static {v1, v4}, Lp0/a0;->q(Landroid/util/Size;I)Landroid/util/Size;

    move-result-object v1

    invoke-virtual {p2}, Lg0/j2$a;->c()Landroid/util/Size;

    move-result-object v4

    invoke-static {v4}, Lp0/a0;->t(Landroid/util/Size;)Landroid/graphics/RectF;

    move-result-object v4

    invoke-static {v1}, Lp0/a0;->t(Landroid/util/Size;)Landroid/graphics/RectF;

    move-result-object v5

    invoke-virtual {p2}, Lg0/j2$a;->e()I

    move-result v6

    invoke-virtual {p2}, Lg0/j2$a;->d()Z

    move-result v7

    invoke-static {v4, v5, v6, v7}, Lp0/a0;->e(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    move-result-object v4

    new-instance v5, Landroid/graphics/RectF;

    invoke-virtual {p2}, Lg0/j2$a;->b()Landroid/graphics/Rect;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v4, v5, Landroid/graphics/RectF;->left:F

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v4, v6

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v7

    sub-float/2addr v6, v7

    iget v7, v5, Landroid/graphics/RectF;->top:F

    sub-float/2addr v6, v7

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v6, v7

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v7

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v7, v8

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v5, v1

    invoke-static {p0, v0, v4, v6, v2}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    invoke-static {p0, v0, v7, v5, v3}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    invoke-virtual {p2}, Lg0/j2$a;->a()Ln0/p0;

    move-result-object p2

    invoke-static {p1, p2}, Lx0/q0;->d([FLn0/p0;)V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v4, p0

    move-object v0, p0

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public static d([FLn0/p0;)V
    .locals 4

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {p0, v1}, Lp0/t;->d([FF)V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ln0/p0;->q()Z

    move-result v2

    const-string v3, "Camera has no transform."

    invoke-static {v2, v3}, Lx2/g;->j(ZLjava/lang/String;)V

    invoke-interface {p1}, Ln0/p0;->d()Lg0/t;

    move-result-object v2

    invoke-interface {v2}, Lg0/t;->d()I

    move-result v2

    int-to-float v2, v2

    invoke-static {p0, v2, v1, v1}, Lp0/t;->c([FFFF)V

    invoke-interface {p1}, Ln0/p0;->l()Z

    move-result p1

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-static {p0, v0, p1, v1, v1}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    const/high16 v1, -0x40800000    # -1.0f

    invoke-static {p0, v0, v1, p1, p1}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    :cond_0
    invoke-static {p0, v0, p0, v0}, Landroid/opengl/Matrix;->invertM([FI[FI)Z

    return-void
.end method


# virtual methods
.method public N1([F[F)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lx0/q0;->S([F[FZ)V

    return-void
.end method

.method public S([F[FZ)V
    .locals 6

    if-eqz p3, :cond_0

    iget-object p3, p0, Lx0/q0;->h:[F

    :goto_0
    move-object v4, p3

    goto :goto_1

    :cond_0
    iget-object p3, p0, Lx0/q0;->i:[F

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lx0/q0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lx0/q0;->o:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lx0/q0;->o:Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lx0/q0;->q:Ly1/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public e()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx0/q0;->p:Lne/x;

    return-object v0
.end method

.method public f()V
    .locals 4

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v1, p0, Lx0/q0;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lx0/q0;->m:Ljava/util/concurrent/Executor;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lx0/q0;->l:Lx2/a;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v3, p0, Lx0/q0;->o:Z

    if-nez v3, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v2, p0, Lx0/q0;->m:Ljava/util/concurrent/Executor;

    const/4 v3, 0x0

    iput-boolean v3, p0, Lx0/q0;->n:Z

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v2, 0x1

    iput-boolean v2, p0, Lx0/q0;->n:Z

    :cond_2
    const/4 v2, 0x0

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    :try_start_1
    new-instance v1, Lx0/p0;

    invoke-direct {v1, p0, v0}, Lx0/p0;-><init>(Lx0/q0;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "SurfaceOutputImpl"

    const-string v2, "Processor executor closed. Close request not posted."

    invoke-static {v1, v2, v0}, Lg0/r1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void

    :goto_2
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public getFormat()I
    .locals 1

    iget v0, p0, Lx0/q0;->d:I

    return v0
.end method

.method public i()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lx0/q0;->e:Landroid/util/Size;

    return-object v0
.end method

.method public q2(Ljava/util/concurrent/Executor;Lx2/a;)Landroid/view/Surface;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lx2/a<",
            "Lg0/j2$b;",
            ">;)",
            "Landroid/view/Surface;"
        }
    .end annotation

    iget-object v0, p0, Lx0/q0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lx0/q0;->m:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lx0/q0;->l:Lx2/a;

    iget-boolean p1, p0, Lx0/q0;->n:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lx0/q0;->f()V

    :cond_0
    iget-object p1, p0, Lx0/q0;->b:Landroid/view/Surface;

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
