.class public Lx0/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/n0$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Landroid/graphics/Matrix;

.field public final c:Z

.field public final d:Landroid/graphics/Rect;

.field public final e:Z

.field public final f:I

.field public final g:Ln0/t3;

.field public h:I

.field public i:I

.field public j:Z

.field public k:Lg0/v2;

.field public l:Lx0/n0$a;

.field public final m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public n:Z

.field public final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx2/a<",
            "Lg0/v2$h;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(IILn0/t3;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx0/n0;->j:Z

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lx0/n0;->m:Ljava/util/Set;

    iput-boolean v0, p0, Lx0/n0;->n:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx0/n0;->o:Ljava/util/List;

    iput p1, p0, Lx0/n0;->f:I

    iput p2, p0, Lx0/n0;->a:I

    iput-object p3, p0, Lx0/n0;->g:Ln0/t3;

    iput-object p4, p0, Lx0/n0;->b:Landroid/graphics/Matrix;

    iput-boolean p5, p0, Lx0/n0;->c:Z

    iput-object p6, p0, Lx0/n0;->d:Landroid/graphics/Rect;

    iput p7, p0, Lx0/n0;->i:I

    iput p8, p0, Lx0/n0;->h:I

    iput-boolean p9, p0, Lx0/n0;->e:Z

    new-instance p1, Lx0/n0$a;

    invoke-virtual {p3}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object p3

    invoke-direct {p1, p3, p2}, Lx0/n0$a;-><init>(Landroid/util/Size;I)V

    iput-object p1, p0, Lx0/n0;->l:Lx0/n0$a;

    return-void
.end method

.method public static synthetic a(Lx0/n0;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lx0/i0;

    invoke-direct {v1, p0}, Lx0/i0;-><init>(Lx0/n0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Lx0/n0;)V
    .locals 1

    iget-boolean v0, p0, Lx0/n0;->n:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lx0/n0;->v()V

    :cond_0
    return-void
.end method

.method public static synthetic c(Lx0/n0;II)V
    .locals 2

    iget v0, p0, Lx0/n0;->i:I

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    iput p1, p0, Lx0/n0;->i:I

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget v0, p0, Lx0/n0;->h:I

    if-eq v0, p2, :cond_1

    iput p2, p0, Lx0/n0;->h:I

    goto :goto_1

    :cond_1
    move v1, p1

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lx0/n0;->x()V

    :cond_2
    return-void
.end method

.method public static synthetic d(Lx0/n0;Lx0/n0$a;ILg0/j2$a;Lg0/j2$a;Landroid/view/Surface;)Lne/x;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p5}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p1}, Ln0/u1;->l()V
    :try_end_0
    .catch Ln0/u1$a; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lx0/q0;

    invoke-virtual {p0}, Lx0/n0;->t()I

    move-result v2

    iget-object v1, p0, Lx0/n0;->g:Ln0/t3;

    invoke-virtual {v1}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v4

    iget-object v7, p0, Lx0/n0;->b:Landroid/graphics/Matrix;

    move v3, p2

    move-object v5, p3

    move-object v6, p4

    move-object v1, p5

    invoke-direct/range {v0 .. v7}, Lx0/q0;-><init>(Landroid/view/Surface;IILandroid/util/Size;Lg0/j2$a;Lg0/j2$a;Landroid/graphics/Matrix;)V

    invoke-virtual {v0}, Lx0/q0;->e()Lne/x;

    move-result-object p0

    new-instance p2, Lx0/j0;

    invoke-direct {p2, p1}, Lx0/j0;-><init>(Lx0/n0$a;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-interface {p0, p2, p3}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1, v0}, Lx0/n0$a;->t(Lx0/q0;)V

    invoke-static {v0}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception v0

    move-object p0, v0

    invoke-static {p0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lx0/n0;->h()V

    iget-object v0, p0, Lx0/n0;->m:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f(Lx2/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a<",
            "Lg0/v2$h;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx0/n0;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final g()V
    .locals 3

    iget-boolean v0, p0, Lx0/n0;->j:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "Consumer can only be linked once."

    invoke-static {v0, v2}, Lx2/g;->j(ZLjava/lang/String;)V

    iput-boolean v1, p0, Lx0/n0;->j:Z

    return-void
.end method

.method public final h()V
    .locals 2

    iget-boolean v0, p0, Lx0/n0;->n:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Edge is already closed."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    return-void
.end method

.method public final i()V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lx0/n0;->l:Lx0/n0$a;

    invoke-virtual {v0}, Lx0/n0$a;->d()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx0/n0;->n:Z

    iget-object v0, p0, Lx0/n0;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lx0/n0;->m:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public j(ILg0/j2$a;Lg0/j2$a;)Lne/x;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lg0/j2$a;",
            "Lg0/j2$a;",
            ")",
            "Lne/x<",
            "Lg0/j2;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lx0/n0;->h()V

    invoke-virtual {p0}, Lx0/n0;->g()V

    iget-object v2, p0, Lx0/n0;->l:Lx0/n0$a;

    invoke-virtual {v2}, Ln0/u1;->j()Lne/x;

    move-result-object v6

    new-instance v0, Lx0/g0;

    move-object v1, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lx0/g0;-><init>(Lx0/n0;Lx0/n0$a;ILg0/j2$a;Lg0/j2$a;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    invoke-static {v6, v0, p1}, Lr0/n;->y(Lne/x;Lr0/a;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public k(Ln0/p0;)Lg0/v2;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lx0/n0;->l(Ln0/p0;Z)Lg0/v2;

    move-result-object p1

    return-object p1
.end method

.method public l(Ln0/p0;Z)Lg0/v2;
    .locals 9

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lx0/n0;->h()V

    new-instance v1, Lg0/v2;

    iget-object v0, p0, Lx0/n0;->g:Ln0/t3;

    invoke-virtual {v0}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v2

    iget-object v0, p0, Lx0/n0;->g:Ln0/t3;

    invoke-virtual {v0}, Ln0/t3;->b()Lg0/k0;

    move-result-object v5

    iget-object v0, p0, Lx0/n0;->g:Ln0/t3;

    invoke-virtual {v0}, Ln0/t3;->g()I

    move-result v6

    iget-object v0, p0, Lx0/n0;->g:Ln0/t3;

    invoke-virtual {v0}, Ln0/t3;->c()Landroid/util/Range;

    move-result-object v7

    new-instance v8, Lx0/e0;

    invoke-direct {v8, p0}, Lx0/e0;-><init>(Lx0/n0;)V

    move-object v3, p1

    move v4, p2

    invoke-direct/range {v1 .. v8}, Lg0/v2;-><init>(Landroid/util/Size;Ln0/p0;ZLg0/k0;ILandroid/util/Range;Ljava/lang/Runnable;)V

    :try_start_0
    invoke-virtual {v1}, Lg0/v2;->n()Ln0/u1;

    move-result-object p1

    iget-object p2, p0, Lx0/n0;->l:Lx0/n0$a;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lx0/d0;

    invoke-direct {v0, p2}, Lx0/d0;-><init>(Lx0/n0$a;)V

    invoke-virtual {p2, p1, v0}, Lx0/n0$a;->u(Ln0/u1;Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ln0/u1;->k()Lne/x;

    move-result-object p2

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lx0/f0;

    invoke-direct {v0, p1}, Lx0/f0;-><init>(Ln0/u1;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catch Ln0/u1$a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_0
    :goto_0
    iput-object v1, p0, Lx0/n0;->k:Lg0/v2;

    invoke-virtual {p0}, Lx0/n0;->x()V

    return-object v1

    :goto_1
    invoke-virtual {v1}, Lg0/v2;->z()Z

    throw p1

    :goto_2
    new-instance p2, Ljava/lang/AssertionError;

    const-string v0, "Surface is somehow already closed"

    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final m()V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lx0/n0;->h()V

    iget-object v0, p0, Lx0/n0;->l:Lx0/n0$a;

    invoke-virtual {v0}, Lx0/n0$a;->d()V

    return-void
.end method

.method public n()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lx0/n0;->d:Landroid/graphics/Rect;

    return-object v0
.end method

.method public o()Ln0/u1;
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lx0/n0;->h()V

    invoke-virtual {p0}, Lx0/n0;->g()V

    iget-object v0, p0, Lx0/n0;->l:Lx0/n0$a;

    return-object v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, Lx0/n0;->a:I

    return v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lx0/n0;->i:I

    return v0
.end method

.method public r()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lx0/n0;->b:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public s()Ln0/t3;
    .locals 1

    iget-object v0, p0, Lx0/n0;->g:Ln0/t3;

    return-object v0
.end method

.method public t()I
    .locals 1

    iget v0, p0, Lx0/n0;->f:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SurfaceEdge{targets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lx0/n0;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", format="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lx0/n0;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", resolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/n0;->g:Ln0/t3;

    invoke-virtual {v1}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cropRect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/n0;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rotationDegrees="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lx0/n0;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mirroring="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lx0/n0;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sensorToBufferTransform= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/n0;->b:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rotationInTransform= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/n0;->b:Landroid/graphics/Matrix;

    invoke-static {v1}, Lp0/a0;->g(Landroid/graphics/Matrix;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isMirrorInTransform= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/n0;->b:Landroid/graphics/Matrix;

    invoke-static {v1}, Lp0/a0;->l(Landroid/graphics/Matrix;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isClosed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lx0/n0;->n:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lx0/n0;->c:Z

    return v0
.end method

.method public v()V
    .locals 3

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lx0/n0;->h()V

    iget-object v0, p0, Lx0/n0;->l:Lx0/n0$a;

    invoke-virtual {v0}, Lx0/n0$a;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lx0/n0;->j:Z

    iget-object v0, p0, Lx0/n0;->l:Lx0/n0$a;

    invoke-virtual {v0}, Lx0/n0$a;->d()V

    new-instance v0, Lx0/n0$a;

    iget-object v1, p0, Lx0/n0;->g:Ln0/t3;

    invoke-virtual {v1}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v1

    iget v2, p0, Lx0/n0;->a:I

    invoke-direct {v0, v1, v2}, Lx0/n0$a;-><init>(Landroid/util/Size;I)V

    iput-object v0, p0, Lx0/n0;->l:Lx0/n0$a;

    iget-object v0, p0, Lx0/n0;->m:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, Lx0/n0;->e:Z

    return v0
.end method

.method public final x()V
    .locals 6

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lx0/n0;->d:Landroid/graphics/Rect;

    iget v1, p0, Lx0/n0;->i:I

    iget v2, p0, Lx0/n0;->h:I

    invoke-virtual {p0}, Lx0/n0;->u()Z

    move-result v3

    iget-object v4, p0, Lx0/n0;->b:Landroid/graphics/Matrix;

    iget-boolean v5, p0, Lx0/n0;->e:Z

    invoke-static/range {v0 .. v5}, Lg0/v2$h;->g(Landroid/graphics/Rect;IIZLandroid/graphics/Matrix;Z)Lg0/v2$h;

    move-result-object v0

    iget-object v1, p0, Lx0/n0;->k:Lg0/v2;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lg0/v2;->y(Lg0/v2$h;)V

    :cond_0
    iget-object v1, p0, Lx0/n0;->o:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx2/a;

    invoke-interface {v2, v0}, Lx2/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public y(Ln0/u1;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lx0/n0;->h()V

    iget-object v0, p0, Lx0/n0;->l:Lx0/n0$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lx0/d0;

    invoke-direct {v1, v0}, Lx0/d0;-><init>(Lx0/n0$a;)V

    invoke-virtual {v0, p1, v1}, Lx0/n0$a;->u(Ln0/u1;Ljava/lang/Runnable;)Z

    return-void
.end method

.method public z(II)V
    .locals 1

    new-instance v0, Lx0/h0;

    invoke-direct {v0, p0, p1, p2}, Lx0/h0;-><init>(Lx0/n0;II)V

    invoke-static {v0}, Lp0/z;->e(Ljava/lang/Runnable;)V

    return-void
.end method
