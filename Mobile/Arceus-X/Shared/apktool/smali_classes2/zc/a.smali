.class public Lzc/a;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzc/a$b;
    }
.end annotation


# instance fields
.field public final a:Lhd/l;

.field public final b:Landroid/graphics/Paint;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Landroid/graphics/Path;

.field public final d:Landroid/graphics/Rect;

.field public final e:Landroid/graphics/RectF;

.field public final f:Landroid/graphics/RectF;

.field public final g:Lzc/a$b;

.field public h:F

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:Z

.field public o:Lhd/k;

.field public p:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>(Lhd/k;)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    invoke-static {}, Lhd/l;->k()Lhd/l;

    move-result-object v0

    iput-object v0, p0, Lzc/a;->a:Lhd/l;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lzc/a;->c:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lzc/a;->d:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lzc/a;->e:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lzc/a;->f:Landroid/graphics/RectF;

    new-instance v0, Lzc/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lzc/a$b;-><init>(Lzc/a;Lzc/a$a;)V

    iput-object v0, p0, Lzc/a;->g:Lzc/a$b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc/a;->n:Z

    iput-object p1, p0, Lzc/a;->o:Lhd/k;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lzc/a;->b:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Shader;
    .locals 19
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lzc/a;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    iget v2, v0, Lzc/a;->h:F

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    iget v3, v0, Lzc/a;->i:I

    iget v4, v0, Lzc/a;->m:I

    invoke-static {v3, v4}, Landroidx/core/graphics/c;->h(II)I

    move-result v5

    iget v3, v0, Lzc/a;->j:I

    iget v4, v0, Lzc/a;->m:I

    invoke-static {v3, v4}, Landroidx/core/graphics/c;->h(II)I

    move-result v6

    iget v3, v0, Lzc/a;->j:I

    const/4 v4, 0x0

    invoke-static {v3, v4}, Landroidx/core/graphics/c;->l(II)I

    move-result v3

    iget v7, v0, Lzc/a;->m:I

    invoke-static {v3, v7}, Landroidx/core/graphics/c;->h(II)I

    move-result v7

    iget v3, v0, Lzc/a;->l:I

    invoke-static {v3, v4}, Landroidx/core/graphics/c;->l(II)I

    move-result v3

    iget v8, v0, Lzc/a;->m:I

    invoke-static {v3, v8}, Landroidx/core/graphics/c;->h(II)I

    move-result v8

    iget v3, v0, Lzc/a;->l:I

    iget v9, v0, Lzc/a;->m:I

    invoke-static {v3, v9}, Landroidx/core/graphics/c;->h(II)I

    move-result v9

    iget v3, v0, Lzc/a;->k:I

    iget v10, v0, Lzc/a;->m:I

    invoke-static {v3, v10}, Landroidx/core/graphics/c;->h(II)I

    move-result v10

    filled-new-array/range {v5 .. v10}, [I

    move-result-object v16

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v5, v3, v2

    const/4 v6, 0x6

    new-array v6, v6, [F

    const/4 v7, 0x0

    aput v7, v6, v4

    const/4 v4, 0x1

    aput v2, v6, v4

    const/4 v2, 0x2

    const/high16 v4, 0x3f000000    # 0.5f

    aput v4, v6, v2

    const/4 v2, 0x3

    aput v4, v6, v2

    const/4 v2, 0x4

    aput v5, v6, v2

    const/4 v2, 0x5

    aput v3, v6, v2

    new-instance v11, Landroid/graphics/LinearGradient;

    iget v2, v1, Landroid/graphics/Rect;->top:I

    int-to-float v13, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v15, v1

    sget-object v18, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v17, v6

    invoke-direct/range {v11 .. v18}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    return-object v11
.end method

.method public b()Landroid/graphics/RectF;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lzc/a;->f:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lzc/a;->f:Landroid/graphics/RectF;

    return-object v0
.end method

.method public c(Landroid/content/res/ColorStateList;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    iget v1, p0, Lzc/a;->m:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    iput v0, p0, Lzc/a;->m:I

    :cond_0
    iput-object p1, p0, Lzc/a;->p:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzc/a;->n:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public d(F)V
    .locals 2

    iget v0, p0, Lzc/a;->h:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lzc/a;->h:F

    iget-object v0, p0, Lzc/a;->b:Landroid/graphics/Paint;

    const v1, 0x3faaa993    # 1.3333f

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzc/a;->n:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Lzc/a;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzc/a;->b:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lzc/a;->a()Landroid/graphics/Shader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzc/a;->n:Z

    :cond_0
    iget-object v0, p0, Lzc/a;->b:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v2, p0, Lzc/a;->d:Landroid/graphics/Rect;

    invoke-virtual {p0, v2}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    iget-object v2, p0, Lzc/a;->e:Landroid/graphics/RectF;

    iget-object v3, p0, Lzc/a;->d:Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    iget-object v2, p0, Lzc/a;->o:Lhd/k;

    invoke-virtual {v2}, Lhd/k;->r()Lhd/c;

    move-result-object v2

    invoke-virtual {p0}, Lzc/a;->b()Landroid/graphics/RectF;

    move-result-object v3

    invoke-interface {v2, v3}, Lhd/c;->a(Landroid/graphics/RectF;)F

    move-result v2

    iget-object v3, p0, Lzc/a;->e:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget-object v2, p0, Lzc/a;->o:Lhd/k;

    invoke-virtual {p0}, Lzc/a;->b()Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {v2, v3}, Lhd/k;->u(Landroid/graphics/RectF;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lzc/a;->e:Landroid/graphics/RectF;

    invoke-virtual {v2, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v0, p0, Lzc/a;->e:Landroid/graphics/RectF;

    iget-object v2, p0, Lzc/a;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public e(IIII)V
    .locals 0

    iput p1, p0, Lzc/a;->i:I

    iput p2, p0, Lzc/a;->j:I

    iput p3, p0, Lzc/a;->k:I

    iput p4, p0, Lzc/a;->l:I

    return-void
.end method

.method public f(Lhd/k;)V
    .locals 0

    iput-object p1, p0, Lzc/a;->o:Lhd/k;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, Lzc/a;->g:Lzc/a$b;

    return-object v0
.end method

.method public getOpacity()I
    .locals 2

    iget v0, p0, Lzc/a;->h:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, -0x3

    return v0

    :cond_0
    const/4 v0, -0x2

    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 5
    .param p1    # Landroid/graphics/Outline;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, Lzc/a;->o:Lhd/k;

    invoke-virtual {p0}, Lzc/a;->b()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhd/k;->u(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzc/a;->o:Lhd/k;

    invoke-virtual {v0}, Lhd/k;->r()Lhd/c;

    move-result-object v0

    invoke-virtual {p0}, Lzc/a;->b()Landroid/graphics/RectF;

    move-result-object v1

    invoke-interface {v0, v1}, Lhd/c;->a(Landroid/graphics/RectF;)F

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    return-void

    :cond_0
    iget-object v0, p0, Lzc/a;->d:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lzc/a;->e:Landroid/graphics/RectF;

    iget-object v1, p0, Lzc/a;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lzc/a;->a:Lhd/l;

    iget-object v1, p0, Lzc/a;->o:Lhd/k;

    iget-object v2, p0, Lzc/a;->e:Landroid/graphics/RectF;

    iget-object v3, p0, Lzc/a;->c:Landroid/graphics/Path;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v4, v2, v3}, Lhd/l;->d(Lhd/k;FLandroid/graphics/RectF;Landroid/graphics/Path;)V

    iget-object v0, p0, Lzc/a;->c:Landroid/graphics/Path;

    invoke-static {p1, v0}, Lwc/c;->k(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    return-void
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .locals 2
    .param p1    # Landroid/graphics/Rect;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lzc/a;->o:Lhd/k;

    invoke-virtual {p0}, Lzc/a;->b()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhd/k;->u(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lzc/a;->h:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/graphics/Rect;->set(IIII)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public isStateful()Z
    .locals 1

    iget-object v0, p0, Lzc/a;->p:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzc/a;->n:Z

    return-void
.end method

.method public onStateChange([I)Z
    .locals 2

    iget-object v0, p0, Lzc/a;->p:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    iget v1, p0, Lzc/a;->m:I

    invoke-virtual {v0, p1, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    iget v0, p0, Lzc/a;->m:I

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc/a;->n:Z

    iput p1, p0, Lzc/a;->m:I

    :cond_0
    iget-boolean p1, p0, Lzc/a;->n:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_1
    iget-boolean p1, p0, Lzc/a;->n:Z

    return p1
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lzc/a;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lzc/a;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
