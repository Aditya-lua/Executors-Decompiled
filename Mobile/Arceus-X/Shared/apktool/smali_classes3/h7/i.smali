.class public Lh7/i;
.super Lh7/a;
.source "SourceFile"


# instance fields
.field public A:Li7/q;

.field public final q:Ljava/lang/String;

.field public final r:Z

.field public final s:Lw1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/g<",
            "Landroid/graphics/LinearGradient;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Lw1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/g<",
            "Landroid/graphics/RadialGradient;",
            ">;"
        }
    .end annotation
.end field

.field public final u:Landroid/graphics/RectF;

.field public final v:Ln7/g;

.field public final w:I

.field public final x:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Ln7/d;",
            "Ln7/d;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final z:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/b;Ln7/f;)V
    .locals 11

    invoke-virtual {p3}, Ln7/f;->b()Ln7/s$a;

    move-result-object v0

    invoke-virtual {v0}, Ln7/s$a;->b()Landroid/graphics/Paint$Cap;

    move-result-object v4

    invoke-virtual {p3}, Ln7/f;->g()Ln7/s$b;

    move-result-object v0

    invoke-virtual {v0}, Ln7/s$b;->b()Landroid/graphics/Paint$Join;

    move-result-object v5

    invoke-virtual {p3}, Ln7/f;->i()F

    move-result v6

    invoke-virtual {p3}, Ln7/f;->k()Lm7/d;

    move-result-object v7

    invoke-virtual {p3}, Ln7/f;->m()Lm7/b;

    move-result-object v8

    invoke-virtual {p3}, Ln7/f;->h()Ljava/util/List;

    move-result-object v9

    invoke-virtual {p3}, Ln7/f;->c()Lm7/b;

    move-result-object v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lh7/a;-><init>(Lf7/h0;Lo7/b;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLm7/d;Lm7/b;Ljava/util/List;Lm7/b;)V

    new-instance p1, Lw1/g;

    invoke-direct {p1}, Lw1/g;-><init>()V

    iput-object p1, v1, Lh7/i;->s:Lw1/g;

    new-instance p1, Lw1/g;

    invoke-direct {p1}, Lw1/g;-><init>()V

    iput-object p1, v1, Lh7/i;->t:Lw1/g;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, v1, Lh7/i;->u:Landroid/graphics/RectF;

    invoke-virtual {p3}, Ln7/f;->j()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lh7/i;->q:Ljava/lang/String;

    invoke-virtual {p3}, Ln7/f;->f()Ln7/g;

    move-result-object p1

    iput-object p1, v1, Lh7/i;->v:Ln7/g;

    invoke-virtual {p3}, Ln7/f;->n()Z

    move-result p1

    iput-boolean p1, v1, Lh7/i;->r:Z

    invoke-virtual {v2}, Lf7/h0;->J()Lf7/i;

    move-result-object p1

    invoke-virtual {p1}, Lf7/i;->d()F

    move-result p1

    const/high16 p2, 0x42000000    # 32.0f

    div-float/2addr p1, p2

    float-to-int p1, p1

    iput p1, v1, Lh7/i;->w:I

    invoke-virtual {p3}, Ln7/f;->e()Lm7/c;

    move-result-object p1

    invoke-virtual {p1}, Lm7/c;->a()Li7/a;

    move-result-object p1

    iput-object p1, v1, Lh7/i;->x:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {v3, p1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p3}, Ln7/f;->l()Lm7/f;

    move-result-object p1

    invoke-virtual {p1}, Lm7/f;->a()Li7/a;

    move-result-object p1

    iput-object p1, v1, Lh7/i;->y:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {v3, p1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p3}, Ln7/f;->d()Lm7/f;

    move-result-object p1

    invoke-virtual {p1}, Lm7/f;->a()Li7/a;

    move-result-object p1

    iput-object p1, v1, Lh7/i;->z:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {v3, p1}, Lo7/b;->j(Li7/a;)V

    return-void
.end method


# virtual methods
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

    invoke-super {p0, p1, p2}, Lh7/a;->c(Ljava/lang/Object;Lt7/c;)V

    sget-object v0, Lf7/o0;->L:[Ljava/lang/Integer;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lh7/i;->A:Li7/q;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lh7/a;->f:Lo7/b;

    invoke-virtual {v0, p1}, Lo7/b;->H(Li7/a;)V

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lh7/i;->A:Li7/q;

    return-void

    :cond_1
    new-instance p1, Li7/q;

    invoke-direct {p1, p2}, Li7/q;-><init>(Lt7/c;)V

    iput-object p1, p0, Lh7/i;->A:Li7/q;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    iget-object p1, p0, Lh7/a;->f:Lo7/b;

    iget-object p2, p0, Lh7/i;->A:Li7/q;

    invoke-virtual {p1, p2}, Lo7/b;->j(Li7/a;)V

    :cond_2
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh7/i;->q:Ljava/lang/String;

    return-object v0
.end method

.method public i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V
    .locals 2

    iget-boolean v0, p0, Lh7/i;->r:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh7/i;->u:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p2, v1}, Lh7/a;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object v0, p0, Lh7/i;->v:Ln7/g;

    sget-object v1, Ln7/g;->a:Ln7/g;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lh7/i;->m()Landroid/graphics/LinearGradient;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lh7/i;->n()Landroid/graphics/RadialGradient;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lh7/a;->i:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-super {p0, p1, p2, p3, p4}, Lh7/a;->i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V

    return-void
.end method

.method public final k([I)[I
    .locals 4

    iget-object v0, p0, Lh7/i;->A:Li7/q;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Li7/q;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Integer;

    array-length v1, p1

    array-length v2, v0

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    :goto_0
    array-length v1, p1

    if-ge v3, v1, :cond_1

    aget-object v1, v0, v3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    array-length p1, v0

    new-array p1, p1, [I

    :goto_1
    array-length v1, v0

    if-ge v3, v1, :cond_1

    aget-object v1, v0, v3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-object p1
.end method

.method public final l()I
    .locals 4

    iget-object v0, p0, Lh7/i;->y:Li7/a;

    invoke-virtual {v0}, Li7/a;->f()F

    move-result v0

    iget v1, p0, Lh7/i;->w:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget-object v1, p0, Lh7/i;->z:Li7/a;

    invoke-virtual {v1}, Li7/a;->f()F

    move-result v1

    iget v2, p0, Lh7/i;->w:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v2, p0, Lh7/i;->x:Li7/a;

    invoke-virtual {v2}, Li7/a;->f()F

    move-result v2

    iget v3, p0, Lh7/i;->w:I

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    if-eqz v0, :cond_0

    const/16 v3, 0x20f

    mul-int/2addr v3, v0

    goto :goto_0

    :cond_0
    const/16 v3, 0x11

    :goto_0
    if-eqz v1, :cond_1

    mul-int/lit8 v3, v3, 0x1f

    mul-int/2addr v3, v1

    :cond_1
    if-eqz v2, :cond_2

    mul-int/lit8 v3, v3, 0x1f

    mul-int/2addr v3, v2

    :cond_2
    return v3
.end method

.method public final m()Landroid/graphics/LinearGradient;
    .locals 14

    invoke-virtual {p0}, Lh7/i;->l()I

    move-result v0

    iget-object v1, p0, Lh7/i;->s:Lw1/g;

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/LinearGradient;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lh7/i;->y:Li7/a;

    invoke-virtual {v0}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lh7/i;->z:Li7/a;

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget-object v4, p0, Lh7/i;->x:Li7/a;

    invoke-virtual {v4}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln7/d;

    invoke-virtual {v4}, Ln7/d;->d()[I

    move-result-object v5

    invoke-virtual {p0, v5}, Lh7/i;->k([I)[I

    move-result-object v11

    invoke-virtual {v4}, Ln7/d;->e()[F

    move-result-object v12

    iget v7, v0, Landroid/graphics/PointF;->x:F

    iget v8, v0, Landroid/graphics/PointF;->y:F

    iget v9, v1, Landroid/graphics/PointF;->x:F

    iget v10, v1, Landroid/graphics/PointF;->y:F

    new-instance v6, Landroid/graphics/LinearGradient;

    sget-object v13, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v6 .. v13}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iget-object v0, p0, Lh7/i;->s:Lw1/g;

    invoke-virtual {v0, v2, v3, v6}, Lw1/g;->i(JLjava/lang/Object;)V

    return-object v6
.end method

.method public final n()Landroid/graphics/RadialGradient;
    .locals 13

    invoke-virtual {p0}, Lh7/i;->l()I

    move-result v0

    iget-object v1, p0, Lh7/i;->t:Lw1/g;

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/RadialGradient;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lh7/i;->y:Li7/a;

    invoke-virtual {v0}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lh7/i;->z:Li7/a;

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget-object v4, p0, Lh7/i;->x:Li7/a;

    invoke-virtual {v4}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln7/d;

    invoke-virtual {v4}, Ln7/d;->d()[I

    move-result-object v5

    invoke-virtual {p0, v5}, Lh7/i;->k([I)[I

    move-result-object v10

    invoke-virtual {v4}, Ln7/d;->e()[F

    move-result-object v11

    iget v7, v0, Landroid/graphics/PointF;->x:F

    iget v8, v0, Landroid/graphics/PointF;->y:F

    iget v0, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v7

    float-to-double v4, v0

    sub-float/2addr v1, v8

    float-to-double v0, v1

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v9, v0

    new-instance v6, Landroid/graphics/RadialGradient;

    sget-object v12, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v6 .. v12}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    iget-object v0, p0, Lh7/i;->t:Lw1/g;

    invoke-virtual {v0, v2, v3, v6}, Lw1/g;->i(JLjava/lang/Object;)V

    return-object v6
.end method
