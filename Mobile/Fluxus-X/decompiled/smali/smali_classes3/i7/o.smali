.class public Li7/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj7/a$b;
.implements Li7/k;
.implements Li7/m;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/RectF;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Lg7/h0;

.field public final f:Lj7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj7/a<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lj7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj7/a<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lj7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj7/a<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Li7/b;

.field public j:Lj7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj7/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public k:Z


# direct methods
.method public constructor <init>(Lg7/h0;Lp7/b;Lo7/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Li7/o;->a:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Li7/o;->b:Landroid/graphics/RectF;

    new-instance v0, Li7/b;

    invoke-direct {v0}, Li7/b;-><init>()V

    iput-object v0, p0, Li7/o;->i:Li7/b;

    const/4 v0, 0x0

    iput-object v0, p0, Li7/o;->j:Lj7/a;

    invoke-virtual {p3}, Lo7/l;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Li7/o;->c:Ljava/lang/String;

    invoke-virtual {p3}, Lo7/l;->f()Z

    move-result v0

    iput-boolean v0, p0, Li7/o;->d:Z

    iput-object p1, p0, Li7/o;->e:Lg7/h0;

    invoke-virtual {p3}, Lo7/l;->d()Ln7/o;

    move-result-object p1

    invoke-interface {p1}, Ln7/o;->a()Lj7/a;

    move-result-object p1

    iput-object p1, p0, Li7/o;->f:Lj7/a;

    invoke-virtual {p3}, Lo7/l;->e()Ln7/o;

    move-result-object v0

    invoke-interface {v0}, Ln7/o;->a()Lj7/a;

    move-result-object v0

    iput-object v0, p0, Li7/o;->g:Lj7/a;

    invoke-virtual {p3}, Lo7/l;->b()Ln7/b;

    move-result-object p3

    invoke-virtual {p3}, Ln7/b;->d()Lj7/d;

    move-result-object p3

    iput-object p3, p0, Li7/o;->h:Lj7/a;

    invoke-virtual {p2, p1}, Lp7/b;->j(Lj7/a;)V

    invoke-virtual {p2, v0}, Lp7/b;->j(Lj7/a;)V

    invoke-virtual {p2, p3}, Lp7/b;->j(Lj7/a;)V

    invoke-virtual {p1, p0}, Lj7/a;->a(Lj7/a$b;)V

    invoke-virtual {v0, p0}, Lj7/a;->a(Lj7/a$b;)V

    invoke-virtual {p3, p0}, Lj7/a;->a(Lj7/a$b;)V

    return-void
.end method

.method private h()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Li7/o;->k:Z

    iget-object v0, p0, Li7/o;->e:Lg7/h0;

    invoke-virtual {v0}, Lg7/h0;->invalidateSelf()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, Li7/o;->h()V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 4
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

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li7/c;

    instance-of v1, v0, Li7/u;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Li7/u;

    invoke-virtual {v1}, Li7/u;->k()Lo7/t$a;

    move-result-object v2

    sget-object v3, Lo7/t$a;->a:Lo7/t$a;

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Li7/o;->i:Li7/b;

    invoke-virtual {v0, v1}, Li7/b;->a(Li7/u;)V

    invoke-virtual {v1, p0}, Li7/u;->c(Lj7/a$b;)V

    goto :goto_1

    :cond_0
    instance-of v1, v0, Li7/q;

    if-eqz v1, :cond_1

    check-cast v0, Li7/q;

    invoke-virtual {v0}, Li7/q;->h()Lj7/a;

    move-result-object v0

    iput-object v0, p0, Li7/o;->j:Lj7/a;

    :cond_1
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public c(Lm7/e;ILjava/util/List;Lm7/e;)V
    .locals 0
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

    invoke-static {p1, p2, p3, p4, p0}, Lt7/j;->k(Lm7/e;ILjava/util/List;Lm7/e;Li7/k;)V

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

    sget-object v0, Lg7/o0;->l:Landroid/graphics/PointF;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Li7/o;->g:Lj7/a;

    invoke-virtual {p1, p2}, Lj7/a;->o(Lu7/c;)V

    return-void

    :cond_0
    sget-object v0, Lg7/o0;->n:Landroid/graphics/PointF;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Li7/o;->f:Lj7/a;

    invoke-virtual {p1, p2}, Lj7/a;->o(Lu7/c;)V

    return-void

    :cond_1
    sget-object v0, Lg7/o0;->m:Ljava/lang/Float;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Li7/o;->h:Lj7/a;

    invoke-virtual {p1, p2}, Lj7/a;->o(Lu7/c;)V

    :cond_2
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li7/o;->c:Ljava/lang/String;

    return-object v0
.end method

.method public x()Landroid/graphics/Path;
    .locals 17

    move-object/from16 v0, p0

    iget-boolean v1, v0, Li7/o;->k:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Li7/o;->a:Landroid/graphics/Path;

    return-object v1

    :cond_0
    iget-object v1, v0, Li7/o;->a:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-boolean v1, v0, Li7/o;->d:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iput-boolean v2, v0, Li7/o;->k:Z

    iget-object v1, v0, Li7/o;->a:Landroid/graphics/Path;

    return-object v1

    :cond_1
    iget-object v1, v0, Li7/o;->g:Lj7/a;

    invoke-virtual {v1}, Lj7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v3, v1, Landroid/graphics/PointF;->x:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    iget v1, v1, Landroid/graphics/PointF;->y:F

    div-float/2addr v1, v4

    iget-object v5, v0, Li7/o;->h:Lj7/a;

    const/4 v6, 0x0

    if-nez v5, :cond_2

    move v5, v6

    goto :goto_0

    :cond_2
    check-cast v5, Lj7/d;

    invoke-virtual {v5}, Lj7/d;->r()F

    move-result v5

    :goto_0
    cmpl-float v7, v5, v6

    if-nez v7, :cond_3

    iget-object v7, v0, Li7/o;->j:Lj7/a;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lj7/a;->h()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    move-result v7

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v5

    :cond_3
    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    move-result v7

    cmpl-float v8, v5, v7

    if-lez v8, :cond_4

    move v5, v7

    :cond_4
    iget-object v7, v0, Li7/o;->f:Lj7/a;

    invoke-virtual {v7}, Lj7/a;->h()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/PointF;

    iget-object v8, v0, Li7/o;->a:Landroid/graphics/Path;

    iget v9, v7, Landroid/graphics/PointF;->x:F

    add-float/2addr v9, v3

    iget v10, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v10, v1

    add-float/2addr v10, v5

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v8, v0, Li7/o;->a:Landroid/graphics/Path;

    iget v9, v7, Landroid/graphics/PointF;->x:F

    add-float/2addr v9, v3

    iget v10, v7, Landroid/graphics/PointF;->y:F

    add-float/2addr v10, v1

    sub-float/2addr v10, v5

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    cmpl-float v8, v5, v6

    const/4 v9, 0x0

    const/high16 v10, 0x42b40000    # 90.0f

    if-lez v8, :cond_5

    iget-object v11, v0, Li7/o;->b:Landroid/graphics/RectF;

    iget v12, v7, Landroid/graphics/PointF;->x:F

    add-float v13, v12, v3

    mul-float v14, v5, v4

    sub-float/2addr v13, v14

    iget v15, v7, Landroid/graphics/PointF;->y:F

    add-float v16, v15, v1

    sub-float v14, v16, v14

    add-float/2addr v12, v3

    add-float/2addr v15, v1

    invoke-virtual {v11, v13, v14, v12, v15}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v11, v0, Li7/o;->a:Landroid/graphics/Path;

    iget-object v12, v0, Li7/o;->b:Landroid/graphics/RectF;

    invoke-virtual {v11, v12, v6, v10, v9}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    :cond_5
    iget-object v6, v0, Li7/o;->a:Landroid/graphics/Path;

    iget v11, v7, Landroid/graphics/PointF;->x:F

    sub-float/2addr v11, v3

    add-float/2addr v11, v5

    iget v12, v7, Landroid/graphics/PointF;->y:F

    add-float/2addr v12, v1

    invoke-virtual {v6, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    if-lez v8, :cond_6

    iget-object v6, v0, Li7/o;->b:Landroid/graphics/RectF;

    iget v11, v7, Landroid/graphics/PointF;->x:F

    sub-float v12, v11, v3

    iget v13, v7, Landroid/graphics/PointF;->y:F

    add-float v14, v13, v1

    mul-float v15, v5, v4

    sub-float/2addr v14, v15

    sub-float/2addr v11, v3

    add-float/2addr v11, v15

    add-float/2addr v13, v1

    invoke-virtual {v6, v12, v14, v11, v13}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v6, v0, Li7/o;->a:Landroid/graphics/Path;

    iget-object v11, v0, Li7/o;->b:Landroid/graphics/RectF;

    invoke-virtual {v6, v11, v10, v10, v9}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    :cond_6
    iget-object v6, v0, Li7/o;->a:Landroid/graphics/Path;

    iget v11, v7, Landroid/graphics/PointF;->x:F

    sub-float/2addr v11, v3

    iget v12, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v12, v1

    add-float/2addr v12, v5

    invoke-virtual {v6, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    if-lez v8, :cond_7

    iget-object v6, v0, Li7/o;->b:Landroid/graphics/RectF;

    iget v11, v7, Landroid/graphics/PointF;->x:F

    sub-float v12, v11, v3

    iget v13, v7, Landroid/graphics/PointF;->y:F

    sub-float v14, v13, v1

    sub-float/2addr v11, v3

    mul-float v15, v5, v4

    add-float/2addr v11, v15

    sub-float/2addr v13, v1

    add-float/2addr v13, v15

    invoke-virtual {v6, v12, v14, v11, v13}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v6, v0, Li7/o;->a:Landroid/graphics/Path;

    iget-object v11, v0, Li7/o;->b:Landroid/graphics/RectF;

    const/high16 v12, 0x43340000    # 180.0f

    invoke-virtual {v6, v11, v12, v10, v9}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    :cond_7
    iget-object v6, v0, Li7/o;->a:Landroid/graphics/Path;

    iget v11, v7, Landroid/graphics/PointF;->x:F

    add-float/2addr v11, v3

    sub-float/2addr v11, v5

    iget v12, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v12, v1

    invoke-virtual {v6, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    if-lez v8, :cond_8

    iget-object v6, v0, Li7/o;->b:Landroid/graphics/RectF;

    iget v8, v7, Landroid/graphics/PointF;->x:F

    add-float v11, v8, v3

    mul-float/2addr v5, v4

    sub-float/2addr v11, v5

    iget v4, v7, Landroid/graphics/PointF;->y:F

    sub-float v7, v4, v1

    add-float/2addr v8, v3

    sub-float/2addr v4, v1

    add-float/2addr v4, v5

    invoke-virtual {v6, v11, v7, v8, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, v0, Li7/o;->a:Landroid/graphics/Path;

    iget-object v3, v0, Li7/o;->b:Landroid/graphics/RectF;

    const/high16 v4, 0x43870000    # 270.0f

    invoke-virtual {v1, v3, v4, v10, v9}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    :cond_8
    iget-object v1, v0, Li7/o;->a:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    iget-object v1, v0, Li7/o;->i:Li7/b;

    iget-object v3, v0, Li7/o;->a:Landroid/graphics/Path;

    invoke-virtual {v1, v3}, Li7/b;->b(Landroid/graphics/Path;)V

    iput-boolean v2, v0, Li7/o;->k:Z

    iget-object v1, v0, Li7/o;->a:Landroid/graphics/Path;

    return-object v1
.end method
