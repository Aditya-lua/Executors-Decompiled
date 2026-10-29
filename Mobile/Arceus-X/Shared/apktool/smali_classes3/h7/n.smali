.class public Lh7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/m;
.implements Li7/a$b;
.implements Lh7/k;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/PathMeasure;

.field public final d:[F

.field public final e:Ljava/lang/String;

.field public final f:Lf7/h0;

.field public final g:Ln7/k$a;

.field public final h:Z

.field public final i:Z

.field public final j:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lh7/b;

.field public r:Z


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/b;Ln7/k;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lh7/n;->a:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lh7/n;->b:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/PathMeasure;

    invoke-direct {v0}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v0, p0, Lh7/n;->c:Landroid/graphics/PathMeasure;

    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lh7/n;->d:[F

    new-instance v0, Lh7/b;

    invoke-direct {v0}, Lh7/b;-><init>()V

    iput-object v0, p0, Lh7/n;->q:Lh7/b;

    iput-object p1, p0, Lh7/n;->f:Lf7/h0;

    invoke-virtual {p3}, Ln7/k;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lh7/n;->e:Ljava/lang/String;

    invoke-virtual {p3}, Ln7/k;->j()Ln7/k$a;

    move-result-object p1

    iput-object p1, p0, Lh7/n;->g:Ln7/k$a;

    invoke-virtual {p3}, Ln7/k;->k()Z

    move-result v0

    iput-boolean v0, p0, Lh7/n;->h:Z

    invoke-virtual {p3}, Ln7/k;->l()Z

    move-result v0

    iput-boolean v0, p0, Lh7/n;->i:Z

    invoke-virtual {p3}, Ln7/k;->g()Lm7/b;

    move-result-object v0

    invoke-virtual {v0}, Lm7/b;->d()Li7/d;

    move-result-object v0

    iput-object v0, p0, Lh7/n;->j:Li7/a;

    invoke-virtual {p3}, Ln7/k;->h()Lm7/o;

    move-result-object v1

    invoke-interface {v1}, Lm7/o;->a()Li7/a;

    move-result-object v1

    iput-object v1, p0, Lh7/n;->k:Li7/a;

    invoke-virtual {p3}, Ln7/k;->i()Lm7/b;

    move-result-object v2

    invoke-virtual {v2}, Lm7/b;->d()Li7/d;

    move-result-object v2

    iput-object v2, p0, Lh7/n;->l:Li7/a;

    invoke-virtual {p3}, Ln7/k;->e()Lm7/b;

    move-result-object v3

    invoke-virtual {v3}, Lm7/b;->d()Li7/d;

    move-result-object v3

    iput-object v3, p0, Lh7/n;->n:Li7/a;

    invoke-virtual {p3}, Ln7/k;->f()Lm7/b;

    move-result-object v4

    invoke-virtual {v4}, Lm7/b;->d()Li7/d;

    move-result-object v4

    iput-object v4, p0, Lh7/n;->p:Li7/a;

    sget-object v5, Ln7/k$a;->b:Ln7/k$a;

    if-ne p1, v5, :cond_0

    invoke-virtual {p3}, Ln7/k;->b()Lm7/b;

    move-result-object v6

    invoke-virtual {v6}, Lm7/b;->d()Li7/d;

    move-result-object v6

    iput-object v6, p0, Lh7/n;->m:Li7/a;

    invoke-virtual {p3}, Ln7/k;->c()Lm7/b;

    move-result-object p3

    invoke-virtual {p3}, Lm7/b;->d()Li7/d;

    move-result-object p3

    iput-object p3, p0, Lh7/n;->o:Li7/a;

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    iput-object p3, p0, Lh7/n;->m:Li7/a;

    iput-object p3, p0, Lh7/n;->o:Li7/a;

    :goto_0
    invoke-virtual {p2, v0}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p2, v1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p2, v2}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p2, v3}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p2, v4}, Lo7/b;->j(Li7/a;)V

    if-ne p1, v5, :cond_1

    iget-object p3, p0, Lh7/n;->m:Li7/a;

    invoke-virtual {p2, p3}, Lo7/b;->j(Li7/a;)V

    iget-object p3, p0, Lh7/n;->o:Li7/a;

    invoke-virtual {p2, p3}, Lo7/b;->j(Li7/a;)V

    :cond_1
    invoke-virtual {v0, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {v1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {v2, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {v3, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {v4, p0}, Li7/a;->a(Li7/a$b;)V

    if-ne p1, v5, :cond_2

    iget-object p1, p0, Lh7/n;->m:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    iget-object p1, p0, Lh7/n;->o:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    :cond_2
    return-void
.end method

.method private k()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh7/n;->r:Z

    iget-object v0, p0, Lh7/n;->f:Lf7/h0;

    invoke-virtual {v0}, Lf7/h0;->invalidateSelf()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, Lh7/n;->k()V

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

    iget-object v1, p0, Lh7/n;->q:Lh7/b;

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

    sget-object v0, Lf7/o0;->w:Ljava/lang/Float;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lh7/n;->j:Li7/a;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_0
    sget-object v0, Lf7/o0;->x:Ljava/lang/Float;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lh7/n;->l:Li7/a;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_1
    sget-object v0, Lf7/o0;->n:Landroid/graphics/PointF;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lh7/n;->k:Li7/a;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_2
    sget-object v0, Lf7/o0;->y:Ljava/lang/Float;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lh7/n;->m:Li7/a;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_3
    sget-object v0, Lf7/o0;->z:Ljava/lang/Float;

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lh7/n;->n:Li7/a;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_4
    sget-object v0, Lf7/o0;->A:Ljava/lang/Float;

    if-ne p1, v0, :cond_5

    iget-object v0, p0, Lh7/n;->o:Li7/a;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_5
    sget-object v0, Lf7/o0;->B:Ljava/lang/Float;

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lh7/n;->p:Li7/a;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    :cond_6
    return-void
.end method

.method public final f()V
    .locals 39

    move-object/from16 v0, p0

    iget-object v1, v0, Lh7/n;->j:Li7/a;

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    iget-object v2, v0, Lh7/n;->l:Li7/a;

    if-nez v2, :cond_0

    const-wide/16 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    float-to-double v2, v2

    :goto_0
    const-wide v4, 0x4056800000000000L    # 90.0

    sub-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    int-to-double v4, v1

    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    div-double/2addr v6, v4

    double-to-float v1, v6

    iget-object v6, v0, Lh7/n;->p:Li7/a;

    invoke-virtual {v6}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    const/high16 v7, 0x42c80000    # 100.0f

    div-float/2addr v6, v7

    iget-object v7, v0, Lh7/n;->n:Li7/a;

    invoke-virtual {v7}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    float-to-double v8, v7

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    mul-double/2addr v10, v8

    double-to-float v10, v10

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    mul-double/2addr v11, v8

    double-to-float v11, v11

    iget-object v12, v0, Lh7/n;->a:Landroid/graphics/Path;

    invoke-virtual {v12, v10, v11}, Landroid/graphics/Path;->moveTo(FF)V

    float-to-double v12, v1

    add-double/2addr v2, v12

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    move-wide/from16 v16, v2

    const/4 v14, 0x0

    :goto_1
    int-to-double v1, v14

    cmpg-double v3, v1, v4

    if-gez v3, :cond_4

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    move-result-wide v18

    move-wide/from16 v20, v1

    mul-double v1, v8, v18

    double-to-float v1, v1

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double/2addr v2, v8

    double-to-float v2, v2

    const/4 v3, 0x0

    cmpl-float v3, v6, v3

    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    if-eqz v3, :cond_2

    move-wide/from16 v29, v4

    float-to-double v3, v11

    move/from16 v31, v6

    float-to-double v5, v10

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    const-wide v5, 0x3ff921fb54442d18L    # 1.5707963267948966

    sub-double/2addr v3, v5

    double-to-float v3, v3

    float-to-double v3, v3

    move-wide/from16 v22, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    double-to-float v5, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float v3, v3

    move v6, v3

    float-to-double v3, v2

    move/from16 v24, v5

    move/from16 v25, v6

    float-to-double v5, v1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    sub-double v3, v3, v22

    double-to-float v3, v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    double-to-float v5, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float v3, v3

    mul-float v6, v7, v31

    const/high16 v4, 0x3e800000    # 0.25f

    mul-float/2addr v6, v4

    mul-float v4, v6, v24

    mul-float v22, v6, v25

    mul-float/2addr v5, v6

    mul-float/2addr v6, v3

    sub-double v18, v29, v18

    cmpl-double v3, v20, v18

    if-nez v3, :cond_1

    iget-object v3, v0, Lh7/n;->b:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    iget-object v3, v0, Lh7/n;->b:Landroid/graphics/Path;

    invoke-virtual {v3, v10, v11}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v3, v0, Lh7/n;->b:Landroid/graphics/Path;

    sub-float v33, v10, v4

    sub-float v34, v11, v22

    add-float v35, v1, v5

    add-float v36, v2, v6

    move/from16 v27, v1

    move/from16 v28, v2

    move-object/from16 v22, v3

    move/from16 v23, v33

    move/from16 v24, v34

    move/from16 v25, v35

    move/from16 v26, v36

    invoke-virtual/range {v22 .. v28}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    iget-object v1, v0, Lh7/n;->c:Landroid/graphics/PathMeasure;

    iget-object v2, v0, Lh7/n;->b:Landroid/graphics/Path;

    const/4 v15, 0x0

    invoke-virtual {v1, v2, v15}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v1, v0, Lh7/n;->c:Landroid/graphics/PathMeasure;

    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v2

    const v3, 0x3f7ff972    # 0.9999f

    mul-float/2addr v2, v3

    iget-object v3, v0, Lh7/n;->d:[F

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    iget-object v1, v0, Lh7/n;->a:Landroid/graphics/Path;

    iget-object v2, v0, Lh7/n;->d:[F

    aget v37, v2, v15

    const/4 v3, 0x1

    aget v38, v2, v3

    move-object/from16 v32, v1

    invoke-virtual/range {v32 .. v38}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    :goto_2
    move/from16 v10, v27

    move/from16 v11, v28

    goto :goto_3

    :cond_1
    move/from16 v27, v1

    move/from16 v28, v2

    const/4 v15, 0x0

    iget-object v1, v0, Lh7/n;->a:Landroid/graphics/Path;

    sub-float v23, v10, v4

    sub-float v24, v11, v22

    add-float v25, v27, v5

    add-float v26, v28, v6

    move-object/from16 v22, v1

    invoke-virtual/range {v22 .. v28}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    goto :goto_2

    :cond_2
    move v10, v1

    move v11, v2

    move-wide/from16 v29, v4

    move/from16 v31, v6

    const/4 v15, 0x0

    sub-double v4, v29, v18

    cmpl-double v1, v20, v4

    if-nez v1, :cond_3

    goto :goto_4

    :cond_3
    iget-object v1, v0, Lh7/n;->a:Landroid/graphics/Path;

    invoke-virtual {v1, v10, v11}, Landroid/graphics/Path;->lineTo(FF)V

    :goto_3
    add-double v16, v16, v12

    :goto_4
    add-int/lit8 v14, v14, 0x1

    move-wide/from16 v4, v29

    move/from16 v6, v31

    goto/16 :goto_1

    :cond_4
    iget-object v1, v0, Lh7/n;->k:Li7/a;

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget-object v2, v0, Lh7/n;->a:Landroid/graphics/Path;

    iget v3, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->offset(FF)V

    iget-object v1, v0, Lh7/n;->a:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh7/n;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Landroid/graphics/Path;
    .locals 3

    iget-boolean v0, p0, Lh7/n;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh7/n;->a:Landroid/graphics/Path;

    return-object v0

    :cond_0
    iget-object v0, p0, Lh7/n;->a:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-boolean v0, p0, Lh7/n;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lh7/n;->r:Z

    iget-object v0, p0, Lh7/n;->a:Landroid/graphics/Path;

    return-object v0

    :cond_1
    sget-object v0, Lh7/n$a;->a:[I

    iget-object v2, p0, Lh7/n;->g:Ln7/k$a;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lh7/n;->f()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lh7/n;->j()V

    :goto_0
    iget-object v0, p0, Lh7/n;->a:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    iget-object v0, p0, Lh7/n;->q:Lh7/b;

    iget-object v2, p0, Lh7/n;->a:Landroid/graphics/Path;

    invoke-virtual {v0, v2}, Lh7/b;->b(Landroid/graphics/Path;)V

    iput-boolean v1, p0, Lh7/n;->r:Z

    iget-object v0, p0, Lh7/n;->a:Landroid/graphics/Path;

    return-object v0
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

.method public final j()V
    .locals 43

    move-object/from16 v0, p0

    iget-object v1, v0, Lh7/n;->j:Li7/a;

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v2, v0, Lh7/n;->l:Li7/a;

    if-nez v2, :cond_0

    const-wide/16 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    float-to-double v2, v2

    :goto_0
    const-wide v4, 0x4056800000000000L    # 90.0

    sub-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    float-to-double v4, v1

    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    div-double/2addr v6, v4

    double-to-float v6, v6

    iget-boolean v7, v0, Lh7/n;->i:Z

    if-eqz v7, :cond_1

    const/high16 v7, -0x40800000    # -1.0f

    mul-float/2addr v6, v7

    :cond_1
    const/high16 v7, 0x40000000    # 2.0f

    div-float v8, v6, v7

    float-to-int v9, v1

    int-to-float v9, v9

    sub-float/2addr v1, v9

    const/4 v9, 0x0

    cmpl-float v10, v1, v9

    if-eqz v10, :cond_2

    const/high16 v11, 0x3f800000    # 1.0f

    sub-float/2addr v11, v1

    mul-float/2addr v11, v8

    float-to-double v11, v11

    add-double/2addr v2, v11

    :cond_2
    iget-object v11, v0, Lh7/n;->n:Li7/a;

    invoke-virtual {v11}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Float;

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    iget-object v12, v0, Lh7/n;->m:Li7/a;

    invoke-virtual {v12}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Float;

    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    move-result v12

    iget-object v13, v0, Lh7/n;->o:Li7/a;

    const/high16 v14, 0x42c80000    # 100.0f

    if-eqz v13, :cond_3

    invoke-virtual {v13}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Float;

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v13

    div-float/2addr v13, v14

    goto :goto_1

    :cond_3
    move v13, v9

    :goto_1
    iget-object v15, v0, Lh7/n;->p:Li7/a;

    if-eqz v15, :cond_4

    invoke-virtual {v15}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Float;

    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v15

    div-float/2addr v15, v14

    goto :goto_2

    :cond_4
    move v15, v9

    :goto_2
    if-eqz v10, :cond_5

    sub-float v14, v11, v12

    mul-float/2addr v14, v1

    add-float/2addr v14, v12

    move/from16 v16, v9

    move/from16 v17, v10

    float-to-double v9, v14

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v18

    move/from16 v20, v7

    move/from16 v21, v8

    mul-double v7, v9, v18

    double-to-float v7, v7

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v18

    mul-double v9, v9, v18

    double-to-float v8, v9

    iget-object v9, v0, Lh7/n;->a:Landroid/graphics/Path;

    invoke-virtual {v9, v7, v8}, Landroid/graphics/Path;->moveTo(FF)V

    mul-float v9, v6, v1

    div-float v9, v9, v20

    float-to-double v9, v9

    add-double/2addr v2, v9

    move v10, v1

    move v9, v7

    move/from16 v7, v21

    goto :goto_3

    :cond_5
    move/from16 v20, v7

    move/from16 v21, v8

    move/from16 v16, v9

    move/from16 v17, v10

    float-to-double v7, v11

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    mul-double/2addr v9, v7

    double-to-float v9, v9

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v18

    mul-double v7, v7, v18

    double-to-float v8, v7

    iget-object v7, v0, Lh7/n;->a:Landroid/graphics/Path;

    invoke-virtual {v7, v9, v8}, Landroid/graphics/Path;->moveTo(FF)V

    move v10, v1

    move-wide/from16 v18, v2

    move/from16 v7, v21

    float-to-double v1, v7

    add-double v2, v18, v1

    move/from16 v14, v16

    :goto_3
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    mul-double v4, v4, v18

    const/4 v1, 0x0

    move/from16 v21, v1

    move-wide/from16 v22, v4

    move-wide/from16 v41, v2

    move v3, v8

    move v2, v9

    move-wide/from16 v8, v41

    :goto_4
    int-to-double v4, v1

    cmpg-double v24, v4, v22

    if-gez v24, :cond_10

    if-eqz v21, :cond_6

    move/from16 v24, v11

    goto :goto_5

    :cond_6
    move/from16 v24, v12

    :goto_5
    cmpl-float v25, v14, v16

    if-eqz v25, :cond_7

    sub-double v26, v22, v18

    cmpl-double v26, v4, v26

    if-nez v26, :cond_7

    mul-float v26, v6, v10

    div-float v26, v26, v20

    move/from16 v41, v26

    move/from16 v26, v1

    move/from16 v1, v41

    goto :goto_6

    :cond_7
    move/from16 v26, v1

    move v1, v7

    :goto_6
    const-wide/high16 v27, 0x3ff0000000000000L    # 1.0

    if-eqz v25, :cond_8

    sub-double v29, v22, v27

    cmpl-double v25, v4, v29

    if-nez v25, :cond_8

    move-wide/from16 v29, v4

    move v4, v14

    goto :goto_7

    :cond_8
    move-wide/from16 v29, v4

    move/from16 v4, v24

    :goto_7
    float-to-double v4, v4

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v24

    move-wide/from16 v31, v4

    mul-double v4, v31, v24

    double-to-float v4, v4

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v24

    move/from16 v40, v6

    mul-double v5, v31, v24

    double-to-float v5, v5

    cmpl-float v6, v13, v16

    if-nez v6, :cond_9

    cmpl-float v6, v15, v16

    if-nez v6, :cond_9

    iget-object v2, v0, Lh7/n;->a:Landroid/graphics/Path;

    invoke-virtual {v2, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    move/from16 v38, v4

    move/from16 v39, v5

    move/from16 v24, v7

    move-wide/from16 v31, v8

    goto/16 :goto_d

    :cond_9
    move/from16 v24, v7

    float-to-double v6, v3

    move-wide/from16 v31, v8

    float-to-double v8, v2

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v6

    const-wide v8, 0x3ff921fb54442d18L    # 1.5707963267948966

    sub-double/2addr v6, v8

    double-to-float v6, v6

    float-to-double v6, v6

    move-wide/from16 v33, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    double-to-float v8, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v6, v6

    move v9, v2

    move v7, v3

    float-to-double v2, v5

    move/from16 v39, v5

    move/from16 v25, v6

    float-to-double v5, v4

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    sub-double v2, v2, v33

    double-to-float v2, v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    double-to-float v5, v5

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    if-eqz v21, :cond_a

    move v3, v13

    goto :goto_8

    :cond_a
    move v3, v15

    :goto_8
    if-eqz v21, :cond_b

    move v6, v15

    goto :goto_9

    :cond_b
    move v6, v13

    :goto_9
    if-eqz v21, :cond_c

    move/from16 v33, v12

    goto :goto_a

    :cond_c
    move/from16 v33, v11

    :goto_a
    if-eqz v21, :cond_d

    move/from16 v34, v11

    goto :goto_b

    :cond_d
    move/from16 v34, v12

    :goto_b
    mul-float v33, v33, v3

    const v3, 0x3ef4e26d    # 0.47829f

    mul-float v33, v33, v3

    mul-float v8, v8, v33

    mul-float v33, v33, v25

    mul-float v34, v34, v6

    mul-float v34, v34, v3

    mul-float v5, v5, v34

    mul-float v34, v34, v2

    if-eqz v17, :cond_f

    if-nez v26, :cond_e

    mul-float/2addr v8, v10

    mul-float v33, v33, v10

    goto :goto_c

    :cond_e
    sub-double v2, v22, v27

    cmpl-double v2, v29, v2

    if-nez v2, :cond_f

    mul-float/2addr v5, v10

    mul-float v34, v34, v10

    :cond_f
    :goto_c
    iget-object v2, v0, Lh7/n;->a:Landroid/graphics/Path;

    sub-float v3, v9, v8

    sub-float v35, v7, v33

    add-float v36, v4, v5

    add-float v37, v39, v34

    move-object/from16 v33, v2

    move/from16 v34, v3

    move/from16 v38, v4

    invoke-virtual/range {v33 .. v39}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    :goto_d
    float-to-double v1, v1

    add-double v8, v31, v1

    xor-int/lit8 v21, v21, 0x1

    add-int/lit8 v1, v26, 0x1

    move/from16 v7, v24

    move/from16 v2, v38

    move/from16 v3, v39

    move/from16 v6, v40

    goto/16 :goto_4

    :cond_10
    iget-object v1, v0, Lh7/n;->k:Li7/a;

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget-object v2, v0, Lh7/n;->a:Landroid/graphics/Path;

    iget v3, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->offset(FF)V

    iget-object v1, v0, Lh7/n;->a:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    return-void
.end method
