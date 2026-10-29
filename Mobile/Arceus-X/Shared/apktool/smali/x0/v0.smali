.class public Lx0/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/v0$b;,
        Lx0/v0$c;
    }
.end annotation


# instance fields
.field public final a:Lx0/r0;

.field public final b:Ln0/p0;

.field public c:Lx0/v0$c;

.field public d:Lx0/v0$b;


# direct methods
.method public constructor <init>(Ln0/p0;Lx0/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/v0;->b:Ln0/p0;

    iput-object p2, p0, Lx0/v0;->a:Lx0/r0;

    return-void
.end method

.method public static synthetic a(Lx0/v0;Lx0/n0;Ljava/util/Map$Entry;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx0/v0;->d(Lx0/n0;Ljava/util/Map$Entry;)V

    return-void
.end method

.method public static synthetic b(Ljava/util/Map;Lg0/v2$h;)V
    .locals 3

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p1}, Lg0/v2$h;->b()I

    move-result v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz0/f;

    invoke-virtual {v2}, Lz0/f;->c()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz0/f;

    invoke-virtual {v2}, Lz0/f;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    neg-int v1, v1

    :cond_0
    invoke-static {v1}, Lp0/a0;->w(I)I

    move-result v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/n0;

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lx0/n0;->z(II)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic c(Lx0/v0;)V
    .locals 1

    iget-object p0, p0, Lx0/v0;->c:Lx0/v0$c;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/n0;

    invoke-virtual {v0}, Lx0/n0;->i()V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lx0/n0;Ljava/util/Map$Entry;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n0;",
            "Ljava/util/Map$Entry<",
            "Lz0/f;",
            "Lx0/n0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/n0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "     -> outputEdge = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SurfaceProcessorNode"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx0/n0;->s()Ln0/t3;

    move-result-object v1

    invoke-virtual {v1}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz0/f;

    invoke-virtual {v2}, Lz0/f;->a()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p1}, Lx0/n0;->u()Z

    move-result p1

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lx0/v0;->b:Ln0/p0;

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz0/f;

    invoke-virtual {v4}, Lz0/f;->c()I

    move-result v4

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz0/f;

    invoke-virtual {v5}, Lz0/f;->g()Z

    move-result v5

    invoke-static {v1, v2, p1, v4, v5}, Lg0/j2$a;->f(Landroid/util/Size;Landroid/graphics/Rect;Ln0/p0;IZ)Lg0/j2$a;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lz0/f;

    invoke-virtual {p2}, Lz0/f;->b()I

    move-result p2

    invoke-virtual {v0, p2, p1, v3}, Lx0/n0;->j(ILg0/j2$a;Lg0/j2$a;)Lne/x;

    move-result-object p1

    new-instance p2, Lx0/v0$a;

    invoke-direct {p2, p0, v0}, Lx0/v0$a;-><init>(Lx0/v0;Lx0/n0;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public e()Lx0/r0;
    .locals 1

    iget-object v0, p0, Lx0/v0;->a:Lx0/r0;

    return-object v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lx0/v0;->a:Lx0/r0;

    invoke-interface {v0}, Lx0/r0;->a()V

    new-instance v0, Lx0/u0;

    invoke-direct {v0, p0}, Lx0/u0;-><init>(Lx0/v0;)V

    invoke-static {v0}, Lp0/z;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final g(Lx0/n0;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n0;",
            "Ljava/util/Map<",
            "Lz0/f;",
            "Lx0/n0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1, v0}, Lx0/v0;->d(Lx0/n0;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/n0;

    new-instance v2, Lx0/s0;

    invoke-direct {v2, p0, p1, v0}, Lx0/s0;-><init>(Lx0/v0;Lx0/n0;Ljava/util/Map$Entry;)V

    invoke-virtual {v1, v2}, Lx0/n0;->e(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final h(Lx0/n0;)V
    .locals 2

    iget-object v0, p0, Lx0/v0;->a:Lx0/r0;

    iget-object v1, p0, Lx0/v0;->b:Ln0/p0;

    invoke-virtual {p1, v1}, Lx0/n0;->k(Ln0/p0;)Lg0/v2;

    move-result-object p1

    invoke-interface {v0, p1}, Lg0/k2;->b(Lg0/v2;)V

    return-void
.end method

.method public i(Lx0/n0;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n0;",
            "Ljava/util/Map<",
            "Lz0/f;",
            "Lx0/n0;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lx0/t0;

    invoke-direct {v0, p2}, Lx0/t0;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, v0}, Lx0/n0;->f(Lx2/a;)V

    return-void
.end method

.method public j(Lx0/v0$b;)Lx0/v0$c;
    .locals 5

    invoke-static {}, Lp0/z;->b()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SurfaceProcessorNode Transform (Processor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/v0;->a:Lx0/r0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n   inputEdge = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lx0/v0$b;->b()Lx0/n0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SurfaceProcessorNode"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx0/v0$b;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz0/f;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "   outputConfig = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lx0/v0;->d:Lx0/v0$b;

    new-instance v0, Lx0/v0$c;

    invoke-direct {v0}, Lx0/v0$c;-><init>()V

    iput-object v0, p0, Lx0/v0;->c:Lx0/v0$c;

    invoke-virtual {p1}, Lx0/v0$b;->b()Lx0/n0;

    move-result-object v0

    invoke-virtual {p1}, Lx0/v0$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz0/f;

    iget-object v2, p0, Lx0/v0;->c:Lx0/v0$c;

    invoke-virtual {p0, v0, v1}, Lx0/v0;->k(Lx0/n0;Lz0/f;)Lx0/n0;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v0}, Lx0/v0;->h(Lx0/n0;)V

    iget-object p1, p0, Lx0/v0;->c:Lx0/v0$c;

    invoke-virtual {p0, v0, p1}, Lx0/v0;->g(Lx0/n0;Ljava/util/Map;)V

    iget-object p1, p0, Lx0/v0;->c:Lx0/v0$c;

    invoke-virtual {p0, v0, p1}, Lx0/v0;->i(Lx0/n0;Ljava/util/Map;)V

    iget-object p1, p0, Lx0/v0;->c:Lx0/v0$c;

    return-object p1
.end method

.method public final k(Lx0/n0;Lz0/f;)Lx0/n0;
    .locals 13

    invoke-virtual {p2}, Lz0/f;->a()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p2}, Lz0/f;->c()I

    move-result v1

    invoke-virtual {p2}, Lz0/f;->g()Z

    move-result v2

    new-instance v7, Landroid/graphics/Matrix;

    invoke-virtual {p1}, Lx0/n0;->r()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-direct {v7, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p2}, Lz0/f;->d()Landroid/util/Size;

    move-result-object v4

    invoke-static {v4}, Lp0/a0;->t(Landroid/util/Size;)Landroid/graphics/RectF;

    move-result-object v4

    invoke-static {v3, v4, v1, v2}, Lp0/a0;->e(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    invoke-static {v0, v1}, Lp0/a0;->f(Landroid/graphics/Rect;I)Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p2}, Lz0/f;->d()Landroid/util/Size;

    move-result-object v4

    invoke-static {v0, v4}, Lp0/a0;->j(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v0

    invoke-static {v0}, Lx2/g;->a(Z)V

    invoke-virtual {p2}, Lz0/f;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lz0/f;->a()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1}, Lx0/n0;->n()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z

    move-result v0

    invoke-virtual {p2}, Lz0/f;->a()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {p1}, Lx0/n0;->n()Landroid/graphics/Rect;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Output crop rect %s must contain input crop rect %s"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lx2/g;->b(ZLjava/lang/Object;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    new-instance v4, Landroid/graphics/RectF;

    invoke-virtual {p1}, Lx0/n0;->n()Landroid/graphics/Rect;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    invoke-virtual {v4, v0}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lz0/f;->d()Landroid/util/Size;

    move-result-object v0

    invoke-static {v0}, Lp0/a0;->r(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lx0/n0;->s()Ln0/t3;

    move-result-object v0

    invoke-virtual {v0}, Ln0/t3;->i()Ln0/t3$a;

    move-result-object v0

    invoke-virtual {p2}, Lz0/f;->d()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v0, v3}, Ln0/t3$a;->f(Landroid/util/Size;)Ln0/t3$a;

    move-result-object v0

    invoke-virtual {v0}, Ln0/t3$a;->a()Ln0/t3;

    move-result-object v6

    new-instance v3, Lx0/n0;

    invoke-virtual {p2}, Lz0/f;->e()I

    move-result v4

    invoke-virtual {p2}, Lz0/f;->b()I

    move-result v5

    invoke-virtual {p1}, Lx0/n0;->q()I

    move-result p2

    sub-int v10, p2, v1

    invoke-virtual {p1}, Lx0/n0;->w()Z

    move-result p1

    if-eq p1, v2, :cond_1

    const/4 p1, 0x1

    :goto_2
    move v12, p1

    goto :goto_3

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    const/4 v8, 0x0

    const/4 v11, -0x1

    invoke-direct/range {v3 .. v12}, Lx0/n0;-><init>(IILn0/t3;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    return-object v3
.end method
