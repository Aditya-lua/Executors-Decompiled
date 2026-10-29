.class public Lo7/c;
.super Lo7/b;
.source "SourceFile"


# instance fields
.field public E:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo7/b;",
            ">;"
        }
    .end annotation
.end field

.field public final G:Landroid/graphics/RectF;

.field public final H:Landroid/graphics/RectF;

.field public final I:Landroid/graphics/RectF;

.field public final J:Ls7/l;

.field public final K:Ls7/l$a;

.field public L:F

.field public M:Z

.field public N:Li7/c;


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/e;Ljava/util/List;Lf7/i;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf7/h0;",
            "Lo7/e;",
            "Ljava/util/List<",
            "Lo7/e;",
            ">;",
            "Lf7/i;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lo7/b;-><init>(Lf7/h0;Lo7/e;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo7/c;->F:Ljava/util/List;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo7/c;->G:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo7/c;->H:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo7/c;->I:Landroid/graphics/RectF;

    new-instance v0, Ls7/l;

    invoke-direct {v0}, Ls7/l;-><init>()V

    iput-object v0, p0, Lo7/c;->J:Ls7/l;

    new-instance v0, Ls7/l$a;

    invoke-direct {v0}, Ls7/l$a;-><init>()V

    iput-object v0, p0, Lo7/c;->K:Ls7/l$a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo7/c;->M:Z

    invoke-virtual {p2}, Lo7/e;->v()Lm7/b;

    move-result-object p2

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lm7/b;->d()Li7/d;

    move-result-object p2

    iput-object p2, p0, Lo7/c;->E:Li7/a;

    invoke-virtual {p0, p2}, Lo7/b;->j(Li7/a;)V

    iget-object p2, p0, Lo7/c;->E:Li7/a;

    invoke-virtual {p2, p0}, Li7/a;->a(Li7/a$b;)V

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lo7/c;->E:Li7/a;

    :goto_0
    new-instance p2, Lw1/g;

    invoke-virtual {p4}, Lf7/i;->k()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {p2, v2}, Lw1/g;-><init>(I)V

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v0

    move-object v3, v1

    :goto_1
    const/4 v4, 0x0

    if-ltz v2, :cond_4

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo7/e;

    invoke-static {p0, v5, p1, p4}, Lo7/b;->v(Lo7/c;Lo7/e;Lf7/h0;Lf7/i;)Lo7/b;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v6}, Lo7/b;->A()Lo7/e;

    move-result-object v7

    invoke-virtual {v7}, Lo7/e;->e()J

    move-result-wide v7

    invoke-virtual {p2, v7, v8, v6}, Lw1/g;->i(JLjava/lang/Object;)V

    if-eqz v3, :cond_2

    invoke-virtual {v3, v6}, Lo7/b;->J(Lo7/b;)V

    move-object v3, v1

    goto :goto_2

    :cond_2
    iget-object v7, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v7, v4, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    sget-object v4, Lo7/c$a;->a:[I

    invoke-virtual {v5}, Lo7/e;->i()Lo7/e$b;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    if-eq v4, v0, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_3

    goto :goto_2

    :cond_3
    move-object v3, v6

    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_4
    :goto_3
    invoke-virtual {p2}, Lw1/g;->n()I

    move-result p1

    if-ge v4, p1, :cond_7

    invoke-virtual {p2, v4}, Lw1/g;->h(I)J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo7/b;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lo7/b;->A()Lo7/e;

    move-result-object p3

    invoke-virtual {p3}, Lo7/e;->k()J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lo7/b;

    if-eqz p3, :cond_6

    invoke-virtual {p1, p3}, Lo7/b;->L(Lo7/b;)V

    :cond_6
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lo7/b;->z()Lq7/j;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance p1, Li7/c;

    invoke-virtual {p0}, Lo7/b;->z()Lq7/j;

    move-result-object p2

    invoke-direct {p1, p0, p0, p2}, Li7/c;-><init>(Li7/a$b;Lo7/b;Lq7/j;)V

    iput-object p1, p0, Lo7/c;->N:Li7/c;

    :cond_8
    return-void
.end method


# virtual methods
.method public I(Ll7/e;ILjava/util/List;Ll7/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/e;",
            "I",
            "Ljava/util/List<",
            "Ll7/e;",
            ">;",
            "Ll7/e;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo7/b;

    invoke-virtual {v1, p1, p2, p3, p4}, Lo7/b;->h(Ll7/e;ILjava/util/List;Ll7/e;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public K(Z)V
    .locals 2

    invoke-super {p0, p1}, Lo7/b;->K(Z)V

    iget-object v0, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo7/b;

    invoke-virtual {v1, p1}, Lo7/b;->K(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public M(F)V
    .locals 4

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v1, "CompositionLayer#setProgress"

    if-eqz v0, :cond_0

    invoke-static {v1}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_0
    iput p1, p0, Lo7/c;->L:F

    invoke-super {p0, p1}, Lo7/b;->M(F)V

    iget-object v0, p0, Lo7/c;->E:Li7/a;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lo7/b;->p:Lf7/h0;

    invoke-virtual {p1}, Lf7/h0;->J()Lf7/i;

    move-result-object p1

    invoke-virtual {p1}, Lf7/i;->e()F

    move-result p1

    const v0, 0x3c23d70a    # 0.01f

    add-float/2addr p1, v0

    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->c()Lf7/i;

    move-result-object v0

    invoke-virtual {v0}, Lf7/i;->p()F

    move-result v0

    iget-object v2, p0, Lo7/c;->E:Li7/a;

    invoke-virtual {v2}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iget-object v3, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v3}, Lo7/e;->c()Lf7/i;

    move-result-object v3

    invoke-virtual {v3}, Lf7/i;->i()F

    move-result v3

    mul-float/2addr v2, v3

    sub-float/2addr v2, v0

    div-float p1, v2, p1

    :cond_1
    iget-object v0, p0, Lo7/c;->E:Li7/a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->s()F

    move-result v0

    sub-float/2addr p1, v0

    :cond_2
    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->w()F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->j()Ljava/lang/String;

    move-result-object v0

    const-string v2, "__container"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->w()F

    move-result v0

    div-float/2addr p1, v0

    :cond_3
    iget-object v0, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_4

    iget-object v2, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo7/b;

    invoke-virtual {v2, p1}, Lo7/b;->M(F)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    invoke-static {}, Lf7/e;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v1}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_5
    return-void
.end method

.method public P()F
    .locals 1

    iget v0, p0, Lo7/c;->L:F

    return v0
.end method

.method public Q(Z)V
    .locals 0

    iput-boolean p1, p0, Lo7/c;->M:Z

    return-void
.end method

.method public c(Ljava/lang/Object;Lt7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lt7/c<",
            "TT;>;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lo7/b;->c(Ljava/lang/Object;Lt7/c;)V

    sget-object v0, Lf7/o0;->E:Ljava/lang/Float;

    if-ne p1, v0, :cond_1

    if-nez p2, :cond_0

    iget-object p1, p0, Lo7/c;->E:Li7/a;

    if-eqz p1, :cond_6

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_0
    new-instance p1, Li7/q;

    invoke-direct {p1, p2}, Li7/q;-><init>(Lt7/c;)V

    iput-object p1, p0, Lo7/c;->E:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    iget-object p1, p0, Lo7/c;->E:Li7/a;

    invoke-virtual {p0, p1}, Lo7/b;->j(Li7/a;)V

    return-void

    :cond_1
    sget-object v0, Lf7/o0;->e:Ljava/lang/Integer;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lo7/c;->N:Li7/c;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2}, Li7/c;->c(Lt7/c;)V

    return-void

    :cond_2
    sget-object v0, Lf7/o0;->G:Ljava/lang/Float;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lo7/c;->N:Li7/c;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p2}, Li7/c;->f(Lt7/c;)V

    return-void

    :cond_3
    sget-object v0, Lf7/o0;->H:Ljava/lang/Float;

    if-ne p1, v0, :cond_4

    iget-object v0, p0, Lo7/c;->N:Li7/c;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p2}, Li7/c;->d(Lt7/c;)V

    return-void

    :cond_4
    sget-object v0, Lf7/o0;->I:Ljava/lang/Float;

    if-ne p1, v0, :cond_5

    iget-object v0, p0, Lo7/c;->N:Li7/c;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p2}, Li7/c;->e(Lt7/c;)V

    return-void

    :cond_5
    sget-object v0, Lf7/o0;->J:Ljava/lang/Float;

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lo7/c;->N:Li7/c;

    if-eqz p1, :cond_6

    invoke-virtual {p1, p2}, Li7/c;->g(Lt7/c;)V

    :cond_6
    return-void
.end method

.method public e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Lo7/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x1

    sub-int/2addr p2, p3

    :goto_0
    if-ltz p2, :cond_0

    iget-object v0, p0, Lo7/c;->G:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo7/b;

    iget-object v1, p0, Lo7/c;->G:Landroid/graphics/RectF;

    iget-object v2, p0, Lo7/b;->o:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1, v2, p3}, Lo7/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object v0, p0, Lo7/c;->G:Landroid/graphics/RectF;

    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public u(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V
    .locals 8

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v1, "CompositionLayer#draw"

    if-eqz v0, :cond_0

    invoke-static {v1}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v2, 0x1

    if-nez p4, :cond_2

    iget-object v3, p0, Lo7/c;->N:Li7/c;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v0

    goto :goto_1

    :cond_2
    :goto_0
    move v3, v2

    :goto_1
    iget-object v4, p0, Lo7/b;->p:Lf7/h0;

    invoke-virtual {v4}, Lf7/h0;->f0()Z

    move-result v4

    const/16 v5, 0xff

    if-eqz v4, :cond_3

    iget-object v4, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v2, :cond_3

    if-ne p3, v5, :cond_4

    :cond_3
    if-eqz v3, :cond_5

    iget-object v3, p0, Lo7/b;->p:Lf7/h0;

    invoke-virtual {v3}, Lf7/h0;->g0()Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_4
    move v0, v2

    :cond_5
    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    move v5, p3

    :goto_2
    iget-object v3, p0, Lo7/c;->N:Li7/c;

    if-eqz v3, :cond_7

    invoke-virtual {v3, p2, v5}, Li7/c;->b(Landroid/graphics/Matrix;I)Ls7/b;

    move-result-object p4

    :cond_7
    iget-boolean v3, p0, Lo7/c;->M:Z

    if-nez v3, :cond_8

    iget-object v3, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v3}, Lo7/e;->j()Ljava/lang/String;

    move-result-object v3

    const-string v4, "__container"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, p0, Lo7/c;->H:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->setEmpty()V

    iget-object v3, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo7/b;

    iget-object v6, p0, Lo7/c;->I:Landroid/graphics/RectF;

    invoke-virtual {v4, v6, p2, v2}, Lo7/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object v4, p0, Lo7/c;->H:Landroid/graphics/RectF;

    iget-object v6, p0, Lo7/c;->I:Landroid/graphics/RectF;

    invoke-virtual {v4, v6}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    goto :goto_3

    :cond_8
    iget-object v3, p0, Lo7/c;->H:Landroid/graphics/RectF;

    iget-object v4, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v4}, Lo7/e;->m()F

    move-result v4

    iget-object v6, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v6}, Lo7/e;->l()F

    move-result v6

    const/4 v7, 0x0

    invoke-virtual {v3, v7, v7, v4, v6}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v3, p0, Lo7/c;->H:Landroid/graphics/RectF;

    invoke-virtual {p2, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_9
    if-eqz v0, :cond_b

    iget-object v3, p0, Lo7/c;->K:Ls7/l$a;

    invoke-virtual {v3}, Ls7/l$a;->f()V

    iget-object v3, p0, Lo7/c;->K:Ls7/l$a;

    iput p3, v3, Ls7/l$a;->a:I

    if-eqz p4, :cond_a

    invoke-virtual {p4, v3}, Ls7/b;->b(Ls7/l$a;)V

    const/4 p4, 0x0

    :cond_a
    iget-object p3, p0, Lo7/c;->J:Ls7/l;

    iget-object v3, p0, Lo7/c;->H:Landroid/graphics/RectF;

    iget-object v4, p0, Lo7/c;->K:Ls7/l$a;

    invoke-virtual {p3, p1, v3, v4}, Ls7/l;->j(Landroid/graphics/Canvas;Landroid/graphics/RectF;Ls7/l$a;)Landroid/graphics/Canvas;

    move-result-object p3

    goto :goto_4

    :cond_b
    move-object p3, p1

    :goto_4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v3, p0, Lo7/c;->H:Landroid/graphics/RectF;

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    move-result v3

    if-eqz v3, :cond_c

    iget-object v3, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v2

    :goto_5
    if-ltz v3, :cond_c

    iget-object v2, p0, Lo7/c;->F:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo7/b;

    invoke-virtual {v2, p3, p2, v5, p4}, Lo7/b;->i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V

    add-int/lit8 v3, v3, -0x1

    goto :goto_5

    :cond_c
    if-eqz v0, :cond_d

    iget-object p2, p0, Lo7/c;->J:Ls7/l;

    invoke-virtual {p2}, Ls7/l;->e()V

    :cond_d
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-static {}, Lf7/e;->h()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-static {v1}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_e
    return-void
.end method
