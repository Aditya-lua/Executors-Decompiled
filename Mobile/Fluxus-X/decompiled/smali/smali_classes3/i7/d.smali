.class public Li7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/e;
.implements Li7/m;
.implements Lj7/a$b;
.implements Lm7/f;


# instance fields
.field public final a:Lt7/l$a;

.field public final b:Landroid/graphics/RectF;

.field public final c:Lt7/l;

.field public final d:Landroid/graphics/Matrix;

.field public final e:Landroid/graphics/Path;

.field public final f:Landroid/graphics/RectF;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li7/c;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lg7/h0;

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li7/m;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lj7/p;


# direct methods
.method public constructor <init>(Lg7/h0;Lp7/b;Ljava/lang/String;ZLjava/util/List;Ln7/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg7/h0;",
            "Lp7/b;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Li7/c;",
            ">;",
            "Ln7/n;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lt7/l$a;

    invoke-direct {v0}, Lt7/l$a;-><init>()V

    iput-object v0, p0, Li7/d;->a:Lt7/l$a;

    .line 7
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Li7/d;->b:Landroid/graphics/RectF;

    .line 8
    new-instance v0, Lt7/l;

    invoke-direct {v0}, Lt7/l;-><init>()V

    iput-object v0, p0, Li7/d;->c:Lt7/l;

    .line 9
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Li7/d;->d:Landroid/graphics/Matrix;

    .line 10
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Li7/d;->e:Landroid/graphics/Path;

    .line 11
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Li7/d;->f:Landroid/graphics/RectF;

    .line 12
    iput-object p3, p0, Li7/d;->g:Ljava/lang/String;

    .line 13
    iput-object p1, p0, Li7/d;->j:Lg7/h0;

    .line 14
    iput-boolean p4, p0, Li7/d;->h:Z

    .line 15
    iput-object p5, p0, Li7/d;->i:Ljava/util/List;

    if-eqz p6, :cond_0

    .line 16
    invoke-virtual {p6}, Ln7/n;->b()Lj7/p;

    move-result-object p1

    iput-object p1, p0, Li7/d;->l:Lj7/p;

    .line 17
    invoke-virtual {p1, p2}, Lj7/p;->a(Lp7/b;)V

    .line 18
    iget-object p1, p0, Li7/d;->l:Lj7/p;

    invoke-virtual {p1, p0}, Lj7/p;->b(Lj7/a$b;)V

    .line 19
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-ltz p2, :cond_2

    .line 21
    invoke-interface {p5, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li7/c;

    .line 22
    instance-of p4, p3, Li7/j;

    if-eqz p4, :cond_1

    .line 23
    check-cast p3, Li7/j;

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    .line 24
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_1
    if-ltz p2, :cond_3

    .line 25
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li7/j;

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result p4

    invoke-interface {p5, p4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p4

    invoke-interface {p3, p4}, Li7/j;->h(Ljava/util/ListIterator;)V

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public constructor <init>(Lg7/h0;Lp7/b;Lo7/q;Lg7/i;)V
    .locals 7

    .line 1
    invoke-virtual {p3}, Lo7/q;->c()Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {p3}, Lo7/q;->d()Z

    move-result v4

    invoke-virtual {p3}, Lo7/q;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p4, p2, v0}, Li7/d;->h(Lg7/h0;Lg7/i;Lp7/b;Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 3
    invoke-virtual {p3}, Lo7/q;->b()Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, Li7/d;->j(Ljava/util/List;)Ln7/n;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 4
    invoke-direct/range {v0 .. v6}, Li7/d;-><init>(Lg7/h0;Lp7/b;Ljava/lang/String;ZLjava/util/List;Ln7/n;)V

    return-void
.end method

.method public static h(Lg7/h0;Lg7/i;Lp7/b;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg7/h0;",
            "Lg7/i;",
            "Lp7/b;",
            "Ljava/util/List<",
            "Lo7/c;",
            ">;)",
            "Ljava/util/List<",
            "Li7/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo7/c;

    invoke-interface {v2, p0, p1, p2}, Lo7/c;->a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static j(Ljava/util/List;)Ln7/n;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo7/c;",
            ">;)",
            "Ln7/n;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo7/c;

    instance-of v2, v1, Ln7/n;

    if-eqz v2, :cond_0

    check-cast v1, Ln7/n;

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Li7/d;->j:Lg7/h0;

    invoke-virtual {v0}, Lg7/h0;->invalidateSelf()V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li7/c;",
            ">;",
            "Ljava/util/List<",
            "Li7/c;",
            ">;)V"
        }
    .end annotation

    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_0

    iget-object v0, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li7/c;

    iget-object v1, p0, Li7/d;->i:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p2, v1}, Li7/c;->b(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Lm7/e;ILjava/util/List;Lm7/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/e;",
            "I",
            "Ljava/util/List<",
            "Lm7/e;",
            ">;",
            "Lm7/e;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Li7/d;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lm7/e;->g(Ljava/lang/String;I)Z

    move-result v0

    const-string v1, "__container"

    if-nez v0, :cond_0

    invoke-virtual {p0}, Li7/d;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Li7/d;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Li7/d;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Lm7/e;->a(Ljava/lang/String;)Lm7/e;

    move-result-object p4

    invoke-virtual {p0}, Li7/d;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lm7/e;->c(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p4, p0}, Lm7/e;->i(Lm7/f;)Lm7/e;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, Li7/d;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lm7/e;->h(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Li7/d;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lm7/e;->e(Ljava/lang/String;I)I

    move-result v0

    add-int/2addr p2, v0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/c;

    instance-of v2, v1, Lm7/f;

    if-eqz v2, :cond_2

    check-cast v1, Lm7/f;

    invoke-interface {v1, p1, p2, p3, p4}, Lm7/f;->c(Lm7/e;ILjava/util/List;Lm7/e;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILt7/b;)V
    .locals 5

    iget-boolean v0, p0, Li7/d;->h:Z

    if-eqz v0, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-object v0, p0, Li7/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Li7/d;->l:Lj7/p;

    if-eqz v0, :cond_2

    iget-object v1, p0, Li7/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Lj7/p;->f()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    iget-object v0, p0, Li7/d;->l:Lj7/p;

    invoke-virtual {v0}, Lj7/p;->h()Lj7/a;

    move-result-object v0

    if-nez v0, :cond_1

    const/16 v0, 0x64

    goto :goto_0

    :cond_1
    iget-object v0, p0, Li7/d;->l:Lj7/p;

    invoke-virtual {v0}, Lj7/p;->h()Lj7/a;

    move-result-object v0

    invoke-virtual {v0}, Lj7/a;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    int-to-float p3, p3

    mul-float/2addr v0, p3

    const/high16 p3, 0x437f0000    # 255.0f

    div-float/2addr v0, p3

    mul-float/2addr v0, p3

    float-to-int p3, v0

    :cond_2
    iget-object v0, p0, Li7/d;->j:Lg7/h0;

    invoke-virtual {v0}, Lg7/h0;->f0()Z

    move-result v0

    const/16 v1, 0xff

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Li7/d;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    if-ne p3, v1, :cond_4

    :cond_3
    if-eqz p4, :cond_5

    iget-object v0, p0, Li7/d;->j:Lg7/h0;

    invoke-virtual {v0}, Lg7/h0;->g0()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Li7/d;->n()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    move v0, v2

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    move v1, p3

    :goto_2
    if-eqz v0, :cond_8

    iget-object v3, p0, Li7/d;->b:Landroid/graphics/RectF;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4, v4, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v3, p0, Li7/d;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, v3, p2, v2}, Li7/d;->g(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Li7/d;->a:Lt7/l$a;

    iput p3, p2, Lt7/l$a;->a:I

    const/4 p3, 0x0

    if-eqz p4, :cond_7

    invoke-virtual {p4, p2}, Lt7/b;->b(Lt7/l$a;)V

    move-object p4, p3

    goto :goto_3

    :cond_7
    iput-object p3, p2, Lt7/l$a;->d:Lt7/b;

    :goto_3
    iget-object p2, p0, Li7/d;->c:Lt7/l;

    iget-object p3, p0, Li7/d;->b:Landroid/graphics/RectF;

    iget-object v3, p0, Li7/d;->a:Lt7/l$a;

    invoke-virtual {p2, p1, p3, v3}, Lt7/l;->j(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lt7/l$a;)Landroid/graphics/Canvas;

    move-result-object p1

    goto :goto_4

    :cond_8
    if-eqz p4, :cond_9

    new-instance p2, Lt7/b;

    invoke-direct {p2, p4}, Lt7/b;-><init>(Lt7/b;)V

    invoke-virtual {p2, v1}, Lt7/b;->i(I)V

    move-object p4, p2

    :cond_9
    :goto_4
    iget-object p2, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p2, v2

    :goto_5
    if-ltz p2, :cond_b

    iget-object p3, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    instance-of v2, p3, Li7/e;

    if-eqz v2, :cond_a

    check-cast p3, Li7/e;

    iget-object v2, p0, Li7/d;->d:Landroid/graphics/Matrix;

    invoke-interface {p3, p1, v2, v1, p4}, Li7/e;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILt7/b;)V

    :cond_a
    add-int/lit8 p2, p2, -0x1

    goto :goto_5

    :cond_b
    if-eqz v0, :cond_c

    iget-object p1, p0, Li7/d;->c:Lt7/l;

    invoke-virtual {p1}, Lt7/l;->e()V

    :cond_c
    :goto_6
    return-void
.end method

.method public e(Ljava/lang/Object;Lu7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lu7/c<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Li7/d;->l:Lj7/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lj7/p;->c(Ljava/lang/Object;Lu7/c;)Z

    :cond_0
    return-void
.end method

.method public g(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 3

    iget-object v0, p0, Li7/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object p2, p0, Li7/d;->l:Lj7/p;

    if-eqz p2, :cond_0

    iget-object v0, p0, Li7/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {p2}, Lj7/p;->f()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    :cond_0
    iget-object p2, p0, Li7/d;->f:Landroid/graphics/RectF;

    const/4 v0, 0x0

    invoke-virtual {p2, v0, v0, v0, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p2, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-ltz p2, :cond_2

    iget-object v0, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li7/c;

    instance-of v1, v0, Li7/e;

    if-eqz v1, :cond_1

    check-cast v0, Li7/e;

    iget-object v1, p0, Li7/d;->f:Landroid/graphics/RectF;

    iget-object v2, p0, Li7/d;->d:Landroid/graphics/Matrix;

    invoke-interface {v0, v1, v2, p3}, Li7/e;->g(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object v0, p0, Li7/d;->f:Landroid/graphics/RectF;

    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    :cond_1
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li7/d;->g:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li7/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li7/d;->i:Ljava/util/List;

    return-object v0
.end method

.method public l()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li7/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li7/d;->k:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li7/d;->k:Ljava/util/List;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/c;

    instance-of v2, v1, Li7/m;

    if-eqz v2, :cond_0

    iget-object v2, p0, Li7/d;->k:Ljava/util/List;

    check-cast v1, Li7/m;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Li7/d;->k:Ljava/util/List;

    return-object v0
.end method

.method public m()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Li7/d;->l:Lj7/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj7/p;->f()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Li7/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Li7/d;->d:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public final n()Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget-object v3, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    iget-object v3, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Li7/e;

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x2

    if-lt v2, v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public x()Landroid/graphics/Path;
    .locals 4

    iget-object v0, p0, Li7/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Li7/d;->l:Lj7/p;

    if-eqz v0, :cond_0

    iget-object v1, p0, Li7/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Lj7/p;->f()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    :cond_0
    iget-object v0, p0, Li7/d;->e:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-boolean v0, p0, Li7/d;->h:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Li7/d;->e:Landroid/graphics/Path;

    return-object v0

    :cond_1
    iget-object v0, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    iget-object v1, p0, Li7/d;->i:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/c;

    instance-of v2, v1, Li7/m;

    if-eqz v2, :cond_2

    iget-object v2, p0, Li7/d;->e:Landroid/graphics/Path;

    check-cast v1, Li7/m;

    invoke-interface {v1}, Li7/m;->x()Landroid/graphics/Path;

    move-result-object v1

    iget-object v3, p0, Li7/d;->d:Landroid/graphics/Matrix;

    invoke-virtual {v2, v1, v3}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Li7/d;->e:Landroid/graphics/Path;

    return-object v0
.end method
