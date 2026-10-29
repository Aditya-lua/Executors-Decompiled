.class public Lm5/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Landroid/graphics/RectF;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Paint;

.field public final d:Landroid/graphics/Paint;

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:[I

.field public j:I

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:Landroid/graphics/Path;

.field public p:F

.field public q:F

.field public r:I

.field public s:I

.field public t:I

.field public u:I


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lm5/b$c;->a:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lm5/b$c;->b:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lm5/b$c;->c:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lm5/b$c;->d:Landroid/graphics/Paint;

    const/4 v3, 0x0

    iput v3, p0, Lm5/b$c;->e:F

    iput v3, p0, Lm5/b$c;->f:F

    iput v3, p0, Lm5/b$c;->g:F

    const/high16 v3, 0x40a00000    # 5.0f

    iput v3, p0, Lm5/b$c;->h:F

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, p0, Lm5/b$c;->p:F

    const/16 v3, 0xff

    iput v3, p0, Lm5/b$c;->t:I

    sget-object v3, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    iget v0, p0, Lm5/b$c;->e:F

    iput v0, p0, Lm5/b$c;->k:F

    iget v0, p0, Lm5/b$c;->f:F

    iput v0, p0, Lm5/b$c;->l:F

    iget v0, p0, Lm5/b$c;->g:F

    iput v0, p0, Lm5/b$c;->m:F

    return-void
.end method

.method public a(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 7

    iget-object v1, p0, Lm5/b$c;->a:Landroid/graphics/RectF;

    iget v0, p0, Lm5/b$c;->q:F

    iget v2, p0, Lm5/b$c;->h:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v2, v0

    const/4 v4, 0x0

    cmpg-float v0, v0, v4

    if-gtz v0, :cond_0

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v3

    iget v2, p0, Lm5/b$c;->r:I

    int-to-float v2, v2

    iget v4, p0, Lm5/b$c;->p:F

    mul-float/2addr v2, v4

    div-float/2addr v2, v3

    iget v4, p0, Lm5/b$c;->h:F

    div-float/2addr v4, v3

    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    move-result v2

    sub-float v2, v0, v2

    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, v2

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v4, v2

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v2

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    move-result p2

    int-to-float p2, p2

    add-float/2addr p2, v2

    invoke-virtual {v1, v0, v4, v5, p2}, Landroid/graphics/RectF;->set(FFFF)V

    iget p2, p0, Lm5/b$c;->e:F

    iget v0, p0, Lm5/b$c;->g:F

    add-float/2addr p2, v0

    const/high16 v2, 0x43b40000    # 360.0f

    mul-float/2addr p2, v2

    iget v4, p0, Lm5/b$c;->f:F

    add-float/2addr v4, v0

    mul-float/2addr v4, v2

    sub-float/2addr v4, p2

    iget-object v0, p0, Lm5/b$c;->b:Landroid/graphics/Paint;

    iget v2, p0, Lm5/b$c;->u:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lm5/b$c;->b:Landroid/graphics/Paint;

    iget v2, p0, Lm5/b$c;->t:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    iget v0, p0, Lm5/b$c;->h:F

    div-float/2addr v0, v3

    invoke-virtual {v1, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v5

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v6

    div-float/2addr v6, v3

    iget-object v3, p0, Lm5/b$c;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v5, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    neg-float v0, v0

    invoke-virtual {v1, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    move v3, v4

    const/4 v4, 0x0

    iget-object v5, p0, Lm5/b$c;->b:Landroid/graphics/Paint;

    move-object v0, p1

    move v2, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    invoke-virtual {p0, v0, v2, v3, v1}, Lm5/b$c;->b(Landroid/graphics/Canvas;FFLandroid/graphics/RectF;)V

    return-void
.end method

.method public b(Landroid/graphics/Canvas;FFLandroid/graphics/RectF;)V
    .locals 7

    iget-boolean v0, p0, Lm5/b$c;->n:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm5/b$c;->o:Landroid/graphics/Path;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lm5/b$c;->o:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    :goto_0
    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v2, p0, Lm5/b$c;->r:I

    int-to-float v2, v2

    iget v3, p0, Lm5/b$c;->p:F

    mul-float/2addr v2, v3

    div-float/2addr v2, v1

    iget-object v3, p0, Lm5/b$c;->o:Landroid/graphics/Path;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v3, p0, Lm5/b$c;->o:Landroid/graphics/Path;

    iget v5, p0, Lm5/b$c;->r:I

    int-to-float v5, v5

    iget v6, p0, Lm5/b$c;->p:F

    mul-float/2addr v5, v6

    invoke-virtual {v3, v5, v4}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v3, p0, Lm5/b$c;->o:Landroid/graphics/Path;

    iget v4, p0, Lm5/b$c;->r:I

    int-to-float v4, v4

    iget v5, p0, Lm5/b$c;->p:F

    mul-float/2addr v4, v5

    div-float/2addr v4, v1

    iget v6, p0, Lm5/b$c;->s:I

    int-to-float v6, v6

    mul-float/2addr v6, v5

    invoke-virtual {v3, v4, v6}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v3, p0, Lm5/b$c;->o:Landroid/graphics/Path;

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    add-float/2addr v0, v4

    sub-float/2addr v0, v2

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    iget v4, p0, Lm5/b$c;->h:F

    div-float/2addr v4, v1

    add-float/2addr v2, v4

    invoke-virtual {v3, v0, v2}, Landroid/graphics/Path;->offset(FF)V

    iget-object v0, p0, Lm5/b$c;->o:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    iget-object v0, p0, Lm5/b$c;->c:Landroid/graphics/Paint;

    iget v1, p0, Lm5/b$c;->u:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lm5/b$c;->c:Landroid/graphics/Paint;

    iget v1, p0, Lm5/b$c;->t:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    add-float/2addr p2, p3

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p3

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result p4

    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object p2, p0, Lm5/b$c;->o:Landroid/graphics/Path;

    iget-object p3, p0, Lm5/b$c;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_1
    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lm5/b$c;->t:I

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lm5/b$c;->f:F

    return v0
.end method

.method public e()I
    .locals 2

    iget-object v0, p0, Lm5/b$c;->i:[I

    invoke-virtual {p0}, Lm5/b$c;->f()I

    move-result v1

    aget v0, v0, v1

    return v0
.end method

.method public f()I
    .locals 2

    iget v0, p0, Lm5/b$c;->j:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lm5/b$c;->i:[I

    array-length v1, v1

    rem-int/2addr v0, v1

    return v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lm5/b$c;->e:F

    return v0
.end method

.method public h()I
    .locals 2

    iget-object v0, p0, Lm5/b$c;->i:[I

    iget v1, p0, Lm5/b$c;->j:I

    aget v0, v0, v1

    return v0
.end method

.method public i()F
    .locals 1

    iget v0, p0, Lm5/b$c;->l:F

    return v0
.end method

.method public j()F
    .locals 1

    iget v0, p0, Lm5/b$c;->m:F

    return v0
.end method

.method public k()F
    .locals 1

    iget v0, p0, Lm5/b$c;->k:F

    return v0
.end method

.method public l()V
    .locals 1

    invoke-virtual {p0}, Lm5/b$c;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Lm5/b$c;->t(I)V

    return-void
.end method

.method public m()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm5/b$c;->k:F

    iput v0, p0, Lm5/b$c;->l:F

    iput v0, p0, Lm5/b$c;->m:F

    invoke-virtual {p0, v0}, Lm5/b$c;->y(F)V

    invoke-virtual {p0, v0}, Lm5/b$c;->v(F)V

    invoke-virtual {p0, v0}, Lm5/b$c;->w(F)V

    return-void
.end method

.method public n(I)V
    .locals 0

    iput p1, p0, Lm5/b$c;->t:I

    return-void
.end method

.method public o(FF)V
    .locals 0

    float-to-int p1, p1

    iput p1, p0, Lm5/b$c;->r:I

    float-to-int p1, p2

    iput p1, p0, Lm5/b$c;->s:I

    return-void
.end method

.method public p(F)V
    .locals 1

    iget v0, p0, Lm5/b$c;->p:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lm5/b$c;->p:F

    :cond_0
    return-void
.end method

.method public q(F)V
    .locals 0

    iput p1, p0, Lm5/b$c;->q:F

    return-void
.end method

.method public r(I)V
    .locals 0

    iput p1, p0, Lm5/b$c;->u:I

    return-void
.end method

.method public s(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lm5/b$c;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method

.method public t(I)V
    .locals 1

    iput p1, p0, Lm5/b$c;->j:I

    iget-object v0, p0, Lm5/b$c;->i:[I

    aget p1, v0, p1

    iput p1, p0, Lm5/b$c;->u:I

    return-void
.end method

.method public u([I)V
    .locals 0

    iput-object p1, p0, Lm5/b$c;->i:[I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lm5/b$c;->t(I)V

    return-void
.end method

.method public v(F)V
    .locals 0

    iput p1, p0, Lm5/b$c;->f:F

    return-void
.end method

.method public w(F)V
    .locals 0

    iput p1, p0, Lm5/b$c;->g:F

    return-void
.end method

.method public x(Z)V
    .locals 1

    iget-boolean v0, p0, Lm5/b$c;->n:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lm5/b$c;->n:Z

    :cond_0
    return-void
.end method

.method public y(F)V
    .locals 0

    iput p1, p0, Lm5/b$c;->e:F

    return-void
.end method

.method public z(F)V
    .locals 1

    iput p1, p0, Lm5/b$c;->h:F

    iget-object v0, p0, Lm5/b$c;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method
