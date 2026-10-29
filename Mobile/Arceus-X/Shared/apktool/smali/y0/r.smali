.class public Ly0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/r$b;,
        Ly0/r$c;
    }
.end annotation


# instance fields
.field public final a:Lx0/r0;

.field public final b:Ln0/p0;

.field public final c:Ln0/p0;

.field public d:Ly0/r$c;

.field public e:Ly0/r$b;


# direct methods
.method public constructor <init>(Ln0/p0;Ln0/p0;Lx0/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/r;->b:Ln0/p0;

    iput-object p2, p0, Ly0/r;->c:Ln0/p0;

    iput-object p3, p0, Ly0/r;->a:Lx0/r0;

    return-void
.end method

.method public static synthetic a(Ly0/r;)V
    .locals 1

    iget-object p0, p0, Ly0/r;->d:Ly0/r$c;

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

.method public static synthetic b(Ly0/r;Ln0/p0;Ln0/p0;Lx0/n0;Lx0/n0;Ljava/util/Map$Entry;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Ly0/r;->c(Ln0/p0;Ln0/p0;Lx0/n0;Lx0/n0;Ljava/util/Map$Entry;)V

    return-void
.end method


# virtual methods
.method public final c(Ln0/p0;Ln0/p0;Lx0/n0;Lx0/n0;Ljava/util/Map$Entry;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/p0;",
            "Ln0/p0;",
            "Lx0/n0;",
            "Lx0/n0;",
            "Ljava/util/Map$Entry<",
            "Ly0/d;",
            "Lx0/n0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/n0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "     -> outputEdge = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DualSurfaceProcessorNode"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3}, Lx0/n0;->s()Ln0/t3;

    move-result-object v1

    invoke-virtual {v1}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v1

    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly0/d;

    invoke-virtual {v2}, Ly0/d;->a()Lz0/f;

    move-result-object v2

    invoke-virtual {v2}, Lz0/f;->a()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p3}, Lx0/n0;->u()Z

    move-result p3

    const/4 v3, 0x0

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly0/d;

    invoke-virtual {p3}, Ly0/d;->a()Lz0/f;

    move-result-object p3

    invoke-virtual {p3}, Lz0/f;->c()I

    move-result p3

    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly0/d;

    invoke-virtual {v4}, Ly0/d;->a()Lz0/f;

    move-result-object v4

    invoke-virtual {v4}, Lz0/f;->g()Z

    move-result v4

    invoke-static {v1, v2, p1, p3, v4}, Lg0/j2$a;->f(Landroid/util/Size;Landroid/graphics/Rect;Ln0/p0;IZ)Lg0/j2$a;

    move-result-object p1

    invoke-virtual {p4}, Lx0/n0;->s()Ln0/t3;

    move-result-object p3

    invoke-virtual {p3}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object p3

    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly0/d;

    invoke-virtual {v1}, Ly0/d;->b()Lz0/f;

    move-result-object v1

    invoke-virtual {v1}, Lz0/f;->a()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {p4}, Lx0/n0;->u()Z

    move-result p4

    if-eqz p4, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, v3

    :goto_1
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ly0/d;

    invoke-virtual {p4}, Ly0/d;->b()Lz0/f;

    move-result-object p4

    invoke-virtual {p4}, Lz0/f;->c()I

    move-result p4

    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly0/d;

    invoke-virtual {v2}, Ly0/d;->b()Lz0/f;

    move-result-object v2

    invoke-virtual {v2}, Lz0/f;->g()Z

    move-result v2

    invoke-static {p3, v1, p2, p4, v2}, Lg0/j2$a;->f(Landroid/util/Size;Landroid/graphics/Rect;Ln0/p0;IZ)Lg0/j2$a;

    move-result-object p2

    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly0/d;

    invoke-virtual {p3}, Ly0/d;->a()Lz0/f;

    move-result-object p3

    invoke-virtual {p3}, Lz0/f;->b()I

    move-result p3

    invoke-virtual {v0, p3, p1, p2}, Lx0/n0;->j(ILg0/j2$a;Lg0/j2$a;)Lne/x;

    move-result-object p1

    new-instance p2, Ly0/r$a;

    invoke-direct {p2, p0, v0}, Ly0/r$a;-><init>(Ly0/r;Lx0/n0;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Ly0/r;->a:Lx0/r0;

    invoke-interface {v0}, Lx0/r0;->a()V

    new-instance v0, Ly0/p;

    invoke-direct {v0, p0}, Ly0/p;-><init>(Ly0/r;)V

    invoke-static {v0}, Lp0/z;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Ln0/p0;Ln0/p0;Lx0/n0;Lx0/n0;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/p0;",
            "Ln0/p0;",
            "Lx0/n0;",
            "Lx0/n0;",
            "Ljava/util/Map<",
            "Ly0/d;",
            "Lx0/n0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p5

    invoke-interface {p5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v1 .. v6}, Ly0/r;->c(Ln0/p0;Ln0/p0;Lx0/n0;Lx0/n0;Ljava/util/Map$Entry;)V

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/n0;

    new-instance v1, Ly0/q;

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Ly0/q;-><init>(Ly0/r;Ln0/p0;Ln0/p0;Lx0/n0;Lx0/n0;Ljava/util/Map$Entry;)V

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    invoke-virtual {p1, v1}, Lx0/n0;->e(Ljava/lang/Runnable;)V

    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f(Ln0/p0;Lx0/n0;Z)V
    .locals 0

    invoke-virtual {p2, p1, p3}, Lx0/n0;->l(Ln0/p0;Z)Lg0/v2;

    move-result-object p1

    iget-object p2, p0, Ly0/r;->a:Lx0/r0;

    invoke-interface {p2, p1}, Lg0/k2;->b(Lg0/v2;)V

    return-void
.end method

.method public g(Ly0/r$b;)Ly0/r$c;
    .locals 6

    invoke-static {}, Lp0/z;->b()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DualSurfaceProcessorNode Transform Processor = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly0/r;->a:Lx0/r0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n   primary input = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ly0/r$b;->b()Lx0/n0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n   secondary input = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ly0/r$b;->c()Lx0/n0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DualSurfaceProcessorNode"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly0/r$b;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly0/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "   outputConfig = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SurfaceProcessorNode"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iput-object p1, p0, Ly0/r;->e:Ly0/r$b;

    new-instance p1, Ly0/r$c;

    invoke-direct {p1}, Ly0/r$c;-><init>()V

    iput-object p1, p0, Ly0/r;->d:Ly0/r$c;

    iget-object p1, p0, Ly0/r;->e:Ly0/r$b;

    invoke-virtual {p1}, Ly0/r$b;->b()Lx0/n0;

    move-result-object v3

    iget-object p1, p0, Ly0/r;->e:Ly0/r$b;

    invoke-virtual {p1}, Ly0/r$b;->c()Lx0/n0;

    move-result-object v4

    iget-object p1, p0, Ly0/r;->e:Ly0/r$b;

    invoke-virtual {p1}, Ly0/r$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/d;

    iget-object v1, p0, Ly0/r;->d:Ly0/r$c;

    invoke-virtual {v0}, Ly0/d;->a()Lz0/f;

    move-result-object v2

    invoke-virtual {p0, v3, v2}, Ly0/r;->h(Lx0/n0;Lz0/f;)Lx0/n0;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iget-object p1, p0, Ly0/r;->b:Ln0/p0;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v3, v0}, Ly0/r;->f(Ln0/p0;Lx0/n0;Z)V

    iget-object p1, p0, Ly0/r;->c:Ln0/p0;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v4, v0}, Ly0/r;->f(Ln0/p0;Lx0/n0;Z)V

    iget-object v1, p0, Ly0/r;->b:Ln0/p0;

    iget-object v2, p0, Ly0/r;->c:Ln0/p0;

    iget-object v5, p0, Ly0/r;->d:Ly0/r$c;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Ly0/r;->e(Ln0/p0;Ln0/p0;Lx0/n0;Lx0/n0;Ljava/util/Map;)V

    iget-object p1, v0, Ly0/r;->d:Ly0/r$c;

    return-object p1
.end method

.method public final h(Lx0/n0;Lz0/f;)Lx0/n0;
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

    move-result-object v3

    invoke-static {v0, v3}, Lp0/a0;->j(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v0

    invoke-static {v0}, Lx2/g;->a(Z)V

    invoke-virtual {p2}, Lz0/f;->d()Landroid/util/Size;

    move-result-object v0

    invoke-static {v0}, Lp0/a0;->r(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v9

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

    if-eq p1, v2, :cond_0

    const/4 p1, 0x1

    :goto_0
    move v12, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/4 v8, 0x0

    const/4 v11, -0x1

    invoke-direct/range {v3 .. v12}, Lx0/n0;-><init>(IILn0/t3;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    return-object v3
.end method
