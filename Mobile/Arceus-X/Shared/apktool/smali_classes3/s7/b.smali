.class public Ls7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:I

.field public e:[F


# direct methods
.method public constructor <init>(FFFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ls7/b;->a:F

    .line 3
    iput p2, p0, Ls7/b;->b:F

    .line 4
    iput p3, p0, Ls7/b;->c:F

    .line 5
    iput p4, p0, Ls7/b;->d:I

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Ls7/b;->e:[F

    return-void
.end method

.method public constructor <init>(Ls7/b;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Ls7/b;->a:F

    .line 9
    iput v0, p0, Ls7/b;->b:F

    .line 10
    iput v0, p0, Ls7/b;->c:F

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Ls7/b;->d:I

    .line 12
    iget v0, p1, Ls7/b;->a:F

    iput v0, p0, Ls7/b;->a:F

    .line 13
    iget v0, p1, Ls7/b;->b:F

    iput v0, p0, Ls7/b;->b:F

    .line 14
    iget v0, p1, Ls7/b;->c:F

    iput v0, p0, Ls7/b;->c:F

    .line 15
    iget p1, p1, Ls7/b;->d:I

    iput p1, p0, Ls7/b;->d:I

    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Ls7/b;->e:[F

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Paint;)V
    .locals 4

    iget v0, p0, Ls7/b;->d:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-lez v0, :cond_0

    iget v0, p0, Ls7/b;->a:F

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v1, p0, Ls7/b;->b:F

    iget v2, p0, Ls7/b;->c:F

    iget v3, p0, Ls7/b;->d:I

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Paint;->clearShadowLayer()V

    return-void
.end method

.method public b(Ls7/l$a;)V
    .locals 1

    iget v0, p0, Ls7/b;->d:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-lez v0, :cond_0

    iput-object p0, p1, Ls7/l$a;->d:Ls7/b;

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p1, Ls7/l$a;->d:Ls7/b;

    return-void
.end method

.method public c(ILandroid/graphics/Paint;)V
    .locals 3

    iget v0, p0, Ls7/b;->d:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xff

    invoke-static {p1, v1, v2}, Ls7/j;->c(III)I

    move-result p1

    invoke-static {v0, p1}, Ls7/m;->l(II)I

    move-result p1

    if-lez p1, :cond_0

    iget v0, p0, Ls7/b;->d:I

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    iget v1, p0, Ls7/b;->d:I

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    iget v2, p0, Ls7/b;->d:I

    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {p1, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    iget v0, p0, Ls7/b;->a:F

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v1, p0, Ls7/b;->b:F

    iget v2, p0, Ls7/b;->c:F

    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Paint;->clearShadowLayer()V

    return-void
.end method

.method public d(ILs7/l$a;)V
    .locals 1

    new-instance v0, Ls7/b;

    invoke-direct {v0, p0}, Ls7/b;-><init>(Ls7/b;)V

    iput-object v0, p2, Ls7/l$a;->d:Ls7/b;

    invoke-virtual {v0, p1}, Ls7/b;->i(I)V

    return-void
.end method

.method public e()I
    .locals 1

    iget v0, p0, Ls7/b;->d:I

    return v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, Ls7/b;->b:F

    return v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Ls7/b;->c:F

    return v0
.end method

.method public h()F
    .locals 1

    iget v0, p0, Ls7/b;->a:F

    return v0
.end method

.method public i(I)V
    .locals 3

    iget v0, p0, Ls7/b;->d:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xff

    invoke-static {p1, v1, v2}, Ls7/j;->c(III)I

    move-result p1

    mul-int/2addr v0, p1

    int-to-float p1, v0

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iget v0, p0, Ls7/b;->d:I

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    iget v1, p0, Ls7/b;->d:I

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    iget v2, p0, Ls7/b;->d:I

    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {p1, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    iput p1, p0, Ls7/b;->d:I

    return-void
.end method

.method public j(Ls7/b;)Z
    .locals 2

    iget v0, p0, Ls7/b;->a:F

    iget v1, p1, Ls7/b;->a:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ls7/b;->b:F

    iget v1, p1, Ls7/b;->b:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ls7/b;->c:F

    iget v1, p1, Ls7/b;->c:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ls7/b;->d:I

    iget p1, p1, Ls7/b;->d:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public k(Landroid/graphics/Matrix;)V
    .locals 4

    iget-object v0, p0, Ls7/b;->e:[F

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Ls7/b;->e:[F

    :cond_0
    iget-object v0, p0, Ls7/b;->e:[F

    iget v1, p0, Ls7/b;->b:F

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Ls7/b;->c:F

    const/4 v3, 0x1

    aput v1, v0, v3

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapVectors([F)V

    iget-object v0, p0, Ls7/b;->e:[F

    aget v1, v0, v2

    iput v1, p0, Ls7/b;->b:F

    aget v0, v0, v3

    iput v0, p0, Ls7/b;->c:F

    iget v0, p0, Ls7/b;->a:F

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    move-result p1

    iput p1, p0, Ls7/b;->a:F

    return-void
.end method
