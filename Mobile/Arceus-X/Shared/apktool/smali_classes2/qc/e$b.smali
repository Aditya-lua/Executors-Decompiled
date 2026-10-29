.class public Lqc/e$b;
.super Lqc/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqc/e;->b(Lcom/google/android/material/carousel/CarouselLayoutManager;)Lqc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/google/android/material/carousel/CarouselLayoutManager;


# direct methods
.method public constructor <init>(ILcom/google/android/material/carousel/CarouselLayoutManager;)V
    .locals 0

    iput-object p2, p0, Lqc/e$b;->b:Lcom/google/android/material/carousel/CarouselLayoutManager;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lqc/e;-><init>(ILqc/e$a;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 3

    iget v0, p2, Landroid/graphics/RectF;->left:F

    iget v1, p3, Landroid/graphics/RectF;->left:F

    cmpg-float v2, v0, v1

    if-gez v2, :cond_0

    iget v2, p2, Landroid/graphics/RectF;->right:F

    cmpl-float v2, v2, v1

    if-lez v2, :cond_0

    sub-float/2addr v1, v0

    iget v0, p1, Landroid/graphics/RectF;->left:F

    add-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->left:F

    iget v0, p2, Landroid/graphics/RectF;->left:F

    add-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->left:F

    :cond_0
    iget v0, p2, Landroid/graphics/RectF;->right:F

    iget p3, p3, Landroid/graphics/RectF;->right:F

    cmpl-float v1, v0, p3

    if-lez v1, :cond_1

    iget v1, p2, Landroid/graphics/RectF;->left:F

    cmpg-float v1, v1, p3

    if-gez v1, :cond_1

    sub-float/2addr v0, p3

    iget p3, p1, Landroid/graphics/RectF;->right:F

    sub-float/2addr p3, v0

    iget v1, p1, Landroid/graphics/RectF;->left:F

    invoke-static {p3, v1}, Ljava/lang/Math;->max(FF)F

    move-result p3

    iput p3, p1, Landroid/graphics/RectF;->right:F

    iget p1, p2, Landroid/graphics/RectF;->right:F

    sub-float/2addr p1, v0

    iget p3, p2, Landroid/graphics/RectF;->left:F

    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p2, Landroid/graphics/RectF;->right:F

    :cond_1
    return-void
.end method

.method public e(Landroidx/recyclerview/widget/RecyclerView$r;)F
    .locals 1

    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, p1

    int-to-float p1, v0

    return p1
.end method

.method public f(FFFF)Landroid/graphics/RectF;
    .locals 1

    new-instance p3, Landroid/graphics/RectF;

    const/4 v0, 0x0

    sub-float/2addr p2, p4

    invoke-direct {p3, p4, v0, p2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p3
.end method

.method public g()I
    .locals 2

    iget-object v0, p0, Lqc/e$b;->b:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->b0()I

    move-result v0

    iget-object v1, p0, Lqc/e$b;->b:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$q;->h0()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lqc/e$b;->b:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->G2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lqc/e$b;->i()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lqc/e$b;->j()I

    move-result v0

    return v0
.end method

.method public i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Lqc/e$b;->b:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->s0()I

    move-result v0

    return v0
.end method

.method public k()I
    .locals 1

    iget-object v0, p0, Lqc/e$b;->b:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->G2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lqc/e$b;->j()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lqc/e$b;->i()I

    move-result v0

    return v0
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, Lqc/e$b;->b:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->k0()I

    move-result v0

    return v0
.end method

.method public m(Landroid/view/View;II)V
    .locals 6

    invoke-virtual {p0}, Lqc/e$b;->l()I

    move-result v3

    invoke-virtual {p0, p1}, Lqc/e$b;->p(Landroid/view/View;)I

    move-result v0

    add-int v5, v3, v0

    iget-object v0, p0, Lqc/e$b;->b:Lcom/google/android/material/carousel/CarouselLayoutManager;

    move-object v1, p1

    move v2, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$q;->E0(Landroid/view/View;IIII)V

    return-void
.end method

.method public n(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 4

    iget v0, p2, Landroid/graphics/RectF;->right:F

    iget v1, p3, Landroid/graphics/RectF;->left:F

    cmpg-float v0, v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    if-gtz v0, :cond_0

    iget v0, p1, Landroid/graphics/RectF;->right:F

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v0, v2

    sub-float/2addr v0, v1

    iput v0, p1, Landroid/graphics/RectF;->right:F

    iget v2, p1, Landroid/graphics/RectF;->left:F

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p1, Landroid/graphics/RectF;->left:F

    :cond_0
    iget p2, p2, Landroid/graphics/RectF;->left:F

    iget p3, p3, Landroid/graphics/RectF;->right:F

    cmpl-float p2, p2, p3

    if-ltz p2, :cond_1

    iget p2, p1, Landroid/graphics/RectF;->left:F

    float-to-double p2, p2

    invoke-static {p2, p3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p2

    double-to-float p2, p2

    add-float/2addr p2, v1

    iput p2, p1, Landroid/graphics/RectF;->left:F

    iget p3, p1, Landroid/graphics/RectF;->right:F

    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p1, Landroid/graphics/RectF;->right:F

    :cond_1
    return-void
.end method

.method public o(Landroid/view/View;Landroid/graphics/Rect;FF)V
    .locals 0

    iget p2, p2, Landroid/graphics/Rect;->left:I

    int-to-float p2, p2

    add-float/2addr p2, p3

    sub-float/2addr p4, p2

    float-to-int p2, p4

    invoke-virtual {p1, p2}, Landroid/view/View;->offsetLeftAndRight(I)V

    return-void
.end method

.method public p(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$r;

    iget-object v1, p0, Lqc/e$b;->b:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$q;->W(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    return p1
.end method
