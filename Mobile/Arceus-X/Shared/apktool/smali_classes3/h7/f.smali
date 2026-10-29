.class public Lh7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/m;
.implements Li7/a$b;
.implements Lh7/k;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Ljava/lang/String;

.field public final c:Lf7/h0;

.field public final d:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ln7/b;

.field public final g:Lh7/b;

.field public h:Z


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/b;Ln7/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lh7/f;->a:Landroid/graphics/Path;

    new-instance v0, Lh7/b;

    invoke-direct {v0}, Lh7/b;-><init>()V

    iput-object v0, p0, Lh7/f;->g:Lh7/b;

    invoke-virtual {p3}, Ln7/b;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh7/f;->b:Ljava/lang/String;

    iput-object p1, p0, Lh7/f;->c:Lf7/h0;

    invoke-virtual {p3}, Ln7/b;->d()Lm7/f;

    move-result-object p1

    invoke-virtual {p1}, Lm7/f;->a()Li7/a;

    move-result-object p1

    iput-object p1, p0, Lh7/f;->d:Li7/a;

    invoke-virtual {p3}, Ln7/b;->c()Lm7/o;

    move-result-object v0

    invoke-interface {v0}, Lm7/o;->a()Li7/a;

    move-result-object v0

    iput-object v0, p0, Lh7/f;->e:Li7/a;

    iput-object p3, p0, Lh7/f;->f:Ln7/b;

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p2, v0}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {v0, p0}, Li7/a;->a(Li7/a$b;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Lh7/f;->f()V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;)V"
        }
    .end annotation

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh7/c;

    instance-of v1, v0, Lh7/u;

    if-eqz v1, :cond_0

    check-cast v0, Lh7/u;

    invoke-virtual {v0}, Lh7/u;->k()Ln7/t$a;

    move-result-object v1

    sget-object v2, Ln7/t$a;->a:Ln7/t$a;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lh7/f;->g:Lh7/b;

    invoke-virtual {v1, v0}, Lh7/b;->a(Lh7/u;)V

    invoke-virtual {v0, p0}, Lh7/u;->c(Li7/a$b;)V

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
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

    sget-object v0, Lf7/o0;->k:Landroid/graphics/PointF;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lh7/f;->d:Li7/a;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_0
    sget-object v0, Lf7/o0;->n:Landroid/graphics/PointF;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lh7/f;->e:Li7/a;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    :cond_1
    return-void
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh7/f;->h:Z

    iget-object v0, p0, Lh7/f;->c:Lf7/h0;

    invoke-virtual {v0}, Lf7/h0;->invalidateSelf()V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh7/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Landroid/graphics/Path;
    .locals 23

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lh7/f;->h:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Lh7/f;->a:Landroid/graphics/Path;

    return-object v1

    :cond_0
    iget-object v1, v0, Lh7/f;->a:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, v0, Lh7/f;->f:Ln7/b;

    invoke-virtual {v1}, Ln7/b;->e()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iput-boolean v2, v0, Lh7/f;->h:Z

    iget-object v1, v0, Lh7/f;->a:Landroid/graphics/Path;

    return-object v1

    :cond_1
    iget-object v1, v0, Lh7/f;->d:Li7/a;

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v3, v1, Landroid/graphics/PointF;->x:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float v6, v3, v4

    iget v1, v1, Landroid/graphics/PointF;->y:F

    div-float v9, v1, v4

    const v1, 0x3f0d6239    # 0.55228f

    mul-float v3, v6, v1

    mul-float/2addr v1, v9

    iget-object v4, v0, Lh7/f;->a:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    iget-object v4, v0, Lh7/f;->f:Ln7/b;

    invoke-virtual {v4}, Ln7/b;->f()Z

    move-result v4

    const/4 v14, 0x0

    if-eqz v4, :cond_2

    iget-object v4, v0, Lh7/f;->a:Landroid/graphics/Path;

    neg-float v5, v9

    invoke-virtual {v4, v14, v5}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v15, v0, Lh7/f;->a:Landroid/graphics/Path;

    sub-float v16, v14, v3

    neg-float v8, v6

    sub-float v19, v14, v1

    const/16 v21, 0x0

    move/from16 v20, v8

    move/from16 v17, v5

    move/from16 v18, v8

    invoke-virtual/range {v15 .. v21}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    iget-object v7, v0, Lh7/f;->a:Landroid/graphics/Path;

    add-float/2addr v1, v14

    const/4 v12, 0x0

    move v13, v9

    move v11, v9

    move/from16 v10, v16

    move v9, v1

    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move v9, v11

    iget-object v5, v0, Lh7/f;->a:Landroid/graphics/Path;

    add-float v8, v3, v14

    const/4 v11, 0x0

    move v10, v6

    move v7, v8

    move v8, v6

    move v6, v7

    move v7, v9

    move v9, v1

    invoke-virtual/range {v5 .. v11}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move/from16 v22, v8

    move v8, v6

    move/from16 v6, v22

    iget-object v5, v0, Lh7/f;->a:Landroid/graphics/Path;

    const/4 v10, 0x0

    move/from16 v11, v17

    move/from16 v9, v17

    move/from16 v7, v19

    invoke-virtual/range {v5 .. v11}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    goto :goto_0

    :cond_2
    move v4, v9

    iget-object v5, v0, Lh7/f;->a:Landroid/graphics/Path;

    neg-float v7, v4

    invoke-virtual {v5, v14, v7}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v5, v0, Lh7/f;->a:Landroid/graphics/Path;

    add-float v8, v3, v14

    sub-float v9, v14, v1

    const/4 v11, 0x0

    move v10, v6

    move/from16 v22, v8

    move v8, v6

    move/from16 v6, v22

    invoke-virtual/range {v5 .. v11}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move v15, v8

    move v8, v6

    move v6, v15

    move v15, v7

    move/from16 v16, v9

    iget-object v5, v0, Lh7/f;->a:Landroid/graphics/Path;

    add-float v7, v1, v14

    const/4 v10, 0x0

    move v11, v4

    move v9, v4

    invoke-virtual/range {v5 .. v11}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    iget-object v1, v0, Lh7/f;->a:Landroid/graphics/Path;

    sub-float v8, v14, v3

    neg-float v10, v6

    const/4 v13, 0x0

    move v12, v10

    move v11, v7

    move-object v7, v1

    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    iget-object v7, v0, Lh7/f;->a:Landroid/graphics/Path;

    const/4 v12, 0x0

    move v13, v15

    move v9, v10

    move v10, v8

    move v8, v9

    move v11, v15

    move/from16 v9, v16

    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    :goto_0
    iget-object v1, v0, Lh7/f;->e:Li7/a;

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget-object v3, v0, Lh7/f;->a:Landroid/graphics/Path;

    iget v4, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {v3, v4, v1}, Landroid/graphics/Path;->offset(FF)V

    iget-object v1, v0, Lh7/f;->a:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    iget-object v1, v0, Lh7/f;->g:Lh7/b;

    iget-object v3, v0, Lh7/f;->a:Landroid/graphics/Path;

    invoke-virtual {v1, v3}, Lh7/b;->b(Landroid/graphics/Path;)V

    iput-boolean v2, v0, Lh7/f;->h:Z

    iget-object v1, v0, Lh7/f;->a:Landroid/graphics/Path;

    return-object v1
.end method

.method public h(Ll7/e;ILjava/util/List;Ll7/e;)V
    .locals 0
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

    invoke-static {p1, p2, p3, p4, p0}, Ls7/j;->k(Ll7/e;ILjava/util/List;Ll7/e;Lh7/k;)V

    return-void
.end method
