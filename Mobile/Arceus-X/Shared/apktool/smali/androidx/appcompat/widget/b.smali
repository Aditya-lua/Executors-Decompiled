.class public Landroidx/appcompat/widget/b;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/b$a;
    }
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:F

.field public h:Z

.field public i:[I

.field public j:[I

.field public k:Landroid/graphics/drawable/Drawable;

.field public l:I

.field public m:I

.field public n:I

.field public o:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Landroidx/appcompat/widget/b;->a:Z

    const/4 v1, -0x1

    .line 5
    iput v1, p0, Landroidx/appcompat/widget/b;->b:I

    const/4 v2, 0x0

    .line 6
    iput v2, p0, Landroidx/appcompat/widget/b;->c:I

    const v3, 0x800033

    .line 7
    iput v3, p0, Landroidx/appcompat/widget/b;->e:I

    .line 8
    sget-object v6, Li/j;->c1:[I

    invoke-static {p1, p2, v6, p3, v2}, Lq/a1;->v(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lq/a1;

    move-result-object v3

    .line 9
    invoke-virtual {v3}, Lq/a1;->r()Landroid/content/res/TypedArray;

    move-result-object v8

    const/4 v10, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v7, p2

    move v9, p3

    .line 10
    invoke-static/range {v4 .. v10}, Landroidx/core/view/o0;->k0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 11
    sget p1, Li/j;->e1:I

    invoke-virtual {v3, p1, v1}, Lq/a1;->k(II)I

    move-result p1

    if-ltz p1, :cond_0

    .line 12
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/b;->setOrientation(I)V

    .line 13
    :cond_0
    sget p1, Li/j;->d1:I

    invoke-virtual {v3, p1, v1}, Lq/a1;->k(II)I

    move-result p1

    if-ltz p1, :cond_1

    .line 14
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/b;->setGravity(I)V

    .line 15
    :cond_1
    sget p1, Li/j;->f1:I

    invoke-virtual {v3, p1, v0}, Lq/a1;->a(IZ)Z

    move-result p1

    if-nez p1, :cond_2

    .line 16
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/b;->setBaselineAligned(Z)V

    .line 17
    :cond_2
    sget p1, Li/j;->h1:I

    const/high16 p2, -0x40800000    # -1.0f

    invoke-virtual {v3, p1, p2}, Lq/a1;->i(IF)F

    move-result p1

    iput p1, v4, Landroidx/appcompat/widget/b;->g:F

    .line 18
    sget p1, Li/j;->g1:I

    .line 19
    invoke-virtual {v3, p1, v1}, Lq/a1;->k(II)I

    move-result p1

    iput p1, v4, Landroidx/appcompat/widget/b;->b:I

    .line 20
    sget p1, Li/j;->k1:I

    invoke-virtual {v3, p1, v2}, Lq/a1;->a(IZ)Z

    move-result p1

    iput-boolean p1, v4, Landroidx/appcompat/widget/b;->h:Z

    .line 21
    sget p1, Li/j;->i1:I

    invoke-virtual {v3, p1}, Lq/a1;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/b;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 22
    sget p1, Li/j;->l1:I

    invoke-virtual {v3, p1, v2}, Lq/a1;->k(II)I

    move-result p1

    iput p1, v4, Landroidx/appcompat/widget/b;->n:I

    .line 23
    sget p1, Li/j;->j1:I

    invoke-virtual {v3, p1, v2}, Lq/a1;->f(II)I

    move-result p1

    iput p1, v4, Landroidx/appcompat/widget/b;->o:I

    .line 24
    invoke-virtual {v3}, Lq/a1;->x()V

    return-void
.end method

.method private j(II)V
    .locals 9

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/b$a;

    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v5, -0x1

    if-ne v2, v5, :cond_0

    iget v8, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move v6, p2

    invoke-virtual/range {v2 .. v7}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    iput v8, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    goto :goto_1

    :cond_0
    move v6, p2

    :goto_1
    add-int/lit8 v0, v0, 0x1

    move p2, v6

    goto :goto_0

    :cond_1
    return-void
.end method

.method private y(Landroid/view/View;IIII)V
    .locals 0

    add-int/2addr p4, p2

    add-int/2addr p5, p3

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Landroidx/appcompat/widget/b$a;

    return p1
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 6

    invoke-virtual {p0}, Landroidx/appcompat/widget/b;->getVirtualChildCount()I

    move-result v0

    invoke-static {p0}, Lq/g1;->b(Landroid/view/View;)Z

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-eq v4, v5, :cond_1

    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/widget/b$a;

    if-eqz v1, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    iget v4, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v4

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    iget v4, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    sub-int/2addr v3, v4

    iget v4, p0, Landroidx/appcompat/widget/b;->l:I

    sub-int/2addr v3, v4

    :goto_1
    invoke-virtual {p0, p1, v3}, Landroidx/appcompat/widget/b;->h(Landroid/graphics/Canvas;I)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v2

    if-eqz v2, :cond_6

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_4

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Landroidx/appcompat/widget/b;->l:I

    :goto_2
    sub-int/2addr v0, v1

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/b$a;

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    sub-int/2addr v0, v1

    iget v1, p0, Landroidx/appcompat/widget/b;->l:I

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    :goto_3
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/b;->h(Landroid/graphics/Canvas;I)V

    :cond_6
    return-void
.end method

.method public f(Landroid/graphics/Canvas;)V
    .locals 5

    invoke-virtual {p0}, Landroidx/appcompat/widget/b;->getVirtualChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_0

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/b$a;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    iget v3, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    sub-int/2addr v2, v3

    iget v3, p0, Landroidx/appcompat/widget/b;->m:I

    sub-int/2addr v2, v3

    invoke-virtual {p0, p1, v2}, Landroidx/appcompat/widget/b;->g(Landroid/graphics/Canvas;I)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v1

    if-eqz v1, :cond_3

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Landroidx/appcompat/widget/b;->m:I

    sub-int/2addr v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/b$a;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    :goto_1
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/b;->g(Landroid/graphics/Canvas;I)V

    :cond_3
    return-void
.end method

.method public g(Landroid/graphics/Canvas;I)V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/b;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget v2, p0, Landroidx/appcompat/widget/b;->o:I

    add-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Landroidx/appcompat/widget/b;->o:I

    sub-int/2addr v2, v3

    iget v3, p0, Landroidx/appcompat/widget/b;->m:I

    add-int/2addr v3, p2

    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object p2, p0, Landroidx/appcompat/widget/b;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/b;->k()Landroidx/appcompat/widget/b$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/b;->l(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/b$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/b;->m(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/b$a;

    move-result-object p1

    return-object p1
.end method

.method public getBaseline()I
    .locals 5

    iget v0, p0, Landroidx/appcompat/widget/b;->b:I

    if-gez v0, :cond_0

    invoke-super {p0}, Landroid/view/View;->getBaseline()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget v1, p0, Landroidx/appcompat/widget/b;->b:I

    if-le v0, v1, :cond_6

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    iget v0, p0, Landroidx/appcompat/widget/b;->b:I

    if-nez v0, :cond_1

    return v2

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v2, p0, Landroidx/appcompat/widget/b;->c:I

    iget v3, p0, Landroidx/appcompat/widget/b;->d:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_5

    iget v3, p0, Landroidx/appcompat/widget/b;->e:I

    and-int/lit8 v3, v3, 0x70

    const/16 v4, 0x30

    if-eq v3, v4, :cond_5

    const/16 v4, 0x10

    if-eq v3, v4, :cond_4

    const/16 v4, 0x50

    if-eq v3, v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Landroidx/appcompat/widget/b;->f:I

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Landroidx/appcompat/widget/b;->f:I

    sub-int/2addr v3, v4

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    :cond_5
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/b$a;

    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2

    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getBaselineAlignedChildIndex()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/b;->b:I

    return v0
.end method

.method public getDividerDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/b;->k:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getDividerPadding()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/b;->o:I

    return v0
.end method

.method public getDividerWidth()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/b;->l:I

    return v0
.end method

.method public getGravity()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/b;->e:I

    return v0
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/b;->d:I

    return v0
.end method

.method public getShowDividers()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/b;->n:I

    return v0
.end method

.method public getVirtualChildCount()I
    .locals 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getWeightSum()F
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/b;->g:F

    return v0
.end method

.method public h(Landroid/graphics/Canvas;I)V
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/widget/b;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget v2, p0, Landroidx/appcompat/widget/b;->o:I

    add-int/2addr v1, v2

    iget v2, p0, Landroidx/appcompat/widget/b;->l:I

    add-int/2addr v2, p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Landroidx/appcompat/widget/b;->o:I

    sub-int/2addr v3, v4

    invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object p2, p0, Landroidx/appcompat/widget/b;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final i(II)V
    .locals 9

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/b$a;

    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    iget v8, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move v4, p2

    invoke-virtual/range {v2 .. v7}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    iput v8, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    goto :goto_1

    :cond_0
    move v4, p2

    :goto_1
    add-int/lit8 v0, v0, 0x1

    move p2, v4

    goto :goto_0

    :cond_1
    return-void
.end method

.method public k()Landroidx/appcompat/widget/b$a;
    .locals 3

    iget v0, p0, Landroidx/appcompat/widget/b;->d:I

    const/4 v1, -0x2

    if-nez v0, :cond_0

    new-instance v0, Landroidx/appcompat/widget/b$a;

    invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/b$a;-><init>(II)V

    return-object v0

    :cond_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    new-instance v0, Landroidx/appcompat/widget/b$a;

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroidx/appcompat/widget/b$a;-><init>(II)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public l(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/b$a;
    .locals 2

    new-instance v0, Landroidx/appcompat/widget/b$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/b$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public m(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/b$a;
    .locals 1

    instance-of v0, p1, Landroidx/appcompat/widget/b$a;

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/appcompat/widget/b$a;

    check-cast p1, Landroidx/appcompat/widget/b$a;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/b$a;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/appcompat/widget/b$a;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/b$a;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_1
    new-instance v0, Landroidx/appcompat/widget/b$a;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/b$a;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public n(Landroid/view/View;I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public o(Landroid/view/View;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/appcompat/widget/b;->k:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Landroidx/appcompat/widget/b;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/b;->f(Landroid/graphics/Canvas;)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/b;->e(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 1

    iget p1, p0, Landroidx/appcompat/widget/b;->d:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0, p2, p3, p4, p5}, Landroidx/appcompat/widget/b;->t(IIII)V

    return-void

    :cond_0
    invoke-virtual {p0, p2, p3, p4, p5}, Landroidx/appcompat/widget/b;->s(IIII)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    iget v0, p0, Landroidx/appcompat/widget/b;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/b;->x(II)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/b;->v(II)V

    return-void
.end method

.method public p(Landroid/view/View;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public q(I)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public r(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iget p1, p0, Landroidx/appcompat/widget/b;->n:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ne p1, v2, :cond_3

    iget p1, p0, Landroidx/appcompat/widget/b;->n:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    iget v2, p0, Landroidx/appcompat/widget/b;->n:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_5

    sub-int/2addr p1, v1

    :goto_0
    if-ltz p1, :cond_5

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_5
    return v0
.end method

.method public s(IIII)V
    .locals 21

    move-object/from16 v0, p0

    invoke-static {v0}, Lq/g1;->b(Landroid/view/View;)Z

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    sub-int v2, p4, p2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int v7, v2, v3

    sub-int/2addr v2, v6

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int v8, v2, v3

    invoke-virtual {v0}, Landroidx/appcompat/widget/b;->getVirtualChildCount()I

    move-result v9

    iget v2, v0, Landroidx/appcompat/widget/b;->e:I

    const v3, 0x800007

    and-int/2addr v3, v2

    and-int/lit8 v10, v2, 0x70

    iget-boolean v11, v0, Landroidx/appcompat/widget/b;->a:Z

    iget-object v12, v0, Landroidx/appcompat/widget/b;->i:[I

    iget-object v13, v0, Landroidx/appcompat/widget/b;->j:[I

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v2

    invoke-static {v3, v2}, Landroidx/core/view/k;->b(II)I

    move-result v2

    const/4 v14, 0x2

    const/4 v15, 0x1

    if-eq v2, v15, :cond_1

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    add-int v2, v2, p3

    sub-int v2, v2, p1

    iget v3, v0, Landroidx/appcompat/widget/b;->f:I

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int v3, p3, p1

    iget v4, v0, Landroidx/appcompat/widget/b;->f:I

    sub-int/2addr v3, v4

    div-int/2addr v3, v14

    add-int/2addr v2, v3

    :goto_0
    const/4 v3, 0x0

    if-eqz v1, :cond_2

    add-int/lit8 v1, v9, -0x1

    move/from16 v16, v1

    const/16 v17, -0x1

    goto :goto_1

    :cond_2
    move/from16 v16, v3

    move/from16 v17, v15

    :goto_1
    move v1, v3

    :goto_2
    if-ge v1, v9, :cond_d

    mul-int v3, v17, v1

    add-int v3, v16, v3

    move v5, v1

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/b;->w(I)I

    move-result v1

    add-int/2addr v2, v1

    move v1, v5

    move/from16 v19, v6

    move/from16 p2, v14

    move/from16 p4, v15

    const/16 v18, -0x1

    goto/16 :goto_7

    :cond_3
    move/from16 p2, v14

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v14

    move/from16 p4, v15

    const/16 v15, 0x8

    if-eq v14, v15, :cond_c

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    move v15, v5

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v18

    move-object/from16 v4, v18

    check-cast v4, Landroidx/appcompat/widget/b$a;

    move/from16 p3, v2

    if-eqz v11, :cond_4

    iget v2, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    move/from16 v18, v5

    const/4 v5, -0x1

    if-eq v2, v5, :cond_5

    invoke-virtual {v1}, Landroid/view/View;->getBaseline()I

    move-result v5

    goto :goto_3

    :cond_4
    move/from16 v18, v5

    :cond_5
    const/4 v5, -0x1

    :goto_3
    iget v2, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v2, :cond_6

    move v2, v10

    :cond_6
    and-int/lit8 v2, v2, 0x70

    move/from16 v19, v6

    const/16 v6, 0x10

    if-eq v2, v6, :cond_9

    const/16 v6, 0x30

    if-eq v2, v6, :cond_8

    const/16 v6, 0x50

    if-eq v2, v6, :cond_7

    move/from16 v2, v19

    const/4 v6, -0x1

    goto :goto_5

    :cond_7
    sub-int v2, v7, v18

    iget v6, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    sub-int/2addr v2, v6

    const/4 v6, -0x1

    if-eq v5, v6, :cond_a

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v20

    sub-int v20, v20, v5

    aget v5, v13, p2

    sub-int v5, v5, v20

    :goto_4
    sub-int/2addr v2, v5

    goto :goto_5

    :cond_8
    const/4 v6, -0x1

    iget v2, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v2, v19, v2

    if-eq v5, v6, :cond_a

    aget v20, v12, p4

    sub-int v20, v20, v5

    add-int v2, v2, v20

    goto :goto_5

    :cond_9
    const/4 v6, -0x1

    sub-int v2, v8, v18

    div-int/lit8 v2, v2, 0x2

    add-int v2, v19, v2

    iget v5, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v2, v5

    iget v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    goto :goto_4

    :cond_a
    :goto_5
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v5

    if-eqz v5, :cond_b

    iget v5, v0, Landroidx/appcompat/widget/b;->l:I

    add-int v5, p3, v5

    goto :goto_6

    :cond_b
    move/from16 v5, p3

    :goto_6
    iget v6, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v6, v5

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/b;->o(Landroid/view/View;)I

    move-result v5

    add-int/2addr v5, v6

    move/from16 p1, v6

    move-object v6, v4

    move v4, v14

    move v14, v3

    move v3, v2

    move v2, v5

    move/from16 v5, v18

    const/16 v18, -0x1

    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/widget/b;->y(Landroid/view/View;IIII)V

    iget v2, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v2, v4

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v3

    add-int/2addr v2, v3

    add-int v6, p1, v2

    invoke-virtual {v0, v1, v14}, Landroidx/appcompat/widget/b;->n(Landroid/view/View;I)I

    move-result v1

    add-int/2addr v1, v15

    move v2, v6

    goto :goto_7

    :cond_c
    move/from16 p3, v2

    move v15, v5

    move/from16 v19, v6

    const/16 v18, -0x1

    move v1, v15

    :goto_7
    add-int/lit8 v1, v1, 0x1

    move/from16 v14, p2

    move/from16 v15, p4

    move/from16 v6, v19

    goto/16 :goto_2

    :cond_d
    return-void
.end method

.method public setBaselineAligned(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/widget/b;->a:Z

    return-void
.end method

.method public setBaselineAlignedChildIndex(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    iput p1, p0, Landroidx/appcompat/widget/b;->b:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "base aligned child index out of range (0, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/b;->k:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Landroidx/appcompat/widget/b;->k:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, p0, Landroidx/appcompat/widget/b;->l:I

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iput v1, p0, Landroidx/appcompat/widget/b;->m:I

    goto :goto_0

    :cond_1
    iput v0, p0, Landroidx/appcompat/widget/b;->l:I

    iput v0, p0, Landroidx/appcompat/widget/b;->m:I

    :goto_0
    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setDividerPadding(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/widget/b;->o:I

    return-void
.end method

.method public setGravity(I)V
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/b;->e:I

    if-eq v0, p1, :cond_2

    const v0, 0x800007

    and-int/2addr v0, p1

    if-nez v0, :cond_0

    const v0, 0x800003

    or-int/2addr p1, v0

    :cond_0
    and-int/lit8 v0, p1, 0x70

    if-nez v0, :cond_1

    or-int/lit8 p1, p1, 0x30

    :cond_1
    iput p1, p0, Landroidx/appcompat/widget/b;->e:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2
    return-void
.end method

.method public setHorizontalGravity(I)V
    .locals 2

    const v0, 0x800007

    and-int/2addr p1, v0

    iget v1, p0, Landroidx/appcompat/widget/b;->e:I

    and-int/2addr v0, v1

    if-eq v0, p1, :cond_0

    const v0, -0x800008

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/appcompat/widget/b;->e:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setMeasureWithLargestChildEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/widget/b;->h:Z

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/b;->d:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Landroidx/appcompat/widget/b;->d:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setShowDividers(I)V
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/b;->n:I

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    iput p1, p0, Landroidx/appcompat/widget/b;->n:I

    return-void
.end method

.method public setVerticalGravity(I)V
    .locals 2

    and-int/lit8 p1, p1, 0x70

    iget v0, p0, Landroidx/appcompat/widget/b;->e:I

    and-int/lit8 v1, v0, 0x70

    if-eq v1, p1, :cond_0

    and-int/lit8 v0, v0, -0x71

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/appcompat/widget/b;->e:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setWeightSum(F)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/b;->g:F

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t(IIII)V
    .locals 11

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p3, p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p1

    sub-int p1, p3, p1

    sub-int/2addr p3, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr p3, v1

    invoke-virtual {p0}, Landroidx/appcompat/widget/b;->getVirtualChildCount()I

    move-result v1

    iget v2, p0, Landroidx/appcompat/widget/b;->e:I

    and-int/lit8 v3, v2, 0x70

    const v4, 0x800007

    and-int/2addr v2, v4

    const/16 v4, 0x10

    if-eq v3, v4, :cond_1

    const/16 v4, 0x50

    if-eq v3, v4, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    add-int/2addr v3, p4

    sub-int/2addr v3, p2

    iget p2, p0, Landroidx/appcompat/widget/b;->f:I

    sub-int p2, v3, p2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr p4, p2

    iget p2, p0, Landroidx/appcompat/widget/b;->f:I

    sub-int/2addr p4, p2

    div-int/lit8 p4, p4, 0x2

    add-int p2, v3, p4

    :goto_0
    const/4 p4, 0x0

    :goto_1
    if-ge p4, v1, :cond_8

    invoke-virtual {p0, p4}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v4

    const/4 v9, 0x1

    if-nez v4, :cond_3

    invoke-virtual {p0, p4}, Landroidx/appcompat/widget/b;->w(I)I

    move-result v3

    add-int/2addr p2, v3

    :cond_2
    move-object v3, p0

    goto :goto_5

    :cond_3
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v5, 0x8

    if-eq v3, v5, :cond_2

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Landroidx/appcompat/widget/b$a;

    iget v3, v10, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v3, :cond_4

    move v3, v2

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    invoke-static {v3, v5}, Landroidx/core/view/k;->b(II)I

    move-result v3

    and-int/lit8 v3, v3, 0x7

    if-eq v3, v9, :cond_6

    const/4 v5, 0x5

    if-eq v3, v5, :cond_5

    iget v3, v10, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v0

    :goto_2
    move v5, v3

    goto :goto_4

    :cond_5
    sub-int v3, p1, v7

    iget v5, v10, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    :goto_3
    sub-int/2addr v3, v5

    goto :goto_2

    :cond_6
    sub-int v3, p3, v7

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v0

    iget v5, v10, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v5

    iget v5, v10, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    goto :goto_3

    :goto_4
    invoke-virtual {p0, p4}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v3

    if-eqz v3, :cond_7

    iget v3, p0, Landroidx/appcompat/widget/b;->m:I

    add-int/2addr p2, v3

    :cond_7
    iget v3, v10, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr p2, v3

    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/b;->o(Landroid/view/View;)I

    move-result v3

    add-int v6, p2, v3

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Landroidx/appcompat/widget/b;->y(Landroid/view/View;IIII)V

    iget v5, v10, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v8, v5

    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v5

    add-int/2addr v8, v5

    add-int/2addr p2, v8

    invoke-virtual {p0, v4, p4}, Landroidx/appcompat/widget/b;->n(Landroid/view/View;I)I

    move-result v4

    add-int/2addr p4, v4

    :goto_5
    add-int/2addr p4, v9

    goto :goto_1

    :cond_8
    move-object v3, p0

    return-void
.end method

.method public u(Landroid/view/View;IIIII)V
    .locals 0

    move-object p2, p1

    move-object p1, p0

    invoke-virtual/range {p1 .. p6}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    return-void
.end method

.method public v(II)V
    .locals 38

    move-object/from16 v0, p0

    const/4 v7, 0x0

    iput v7, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/b;->getVirtualChildCount()I

    move-result v8

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v9

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v10

    iget-object v1, v0, Landroidx/appcompat/widget/b;->i:[I

    const/4 v11, 0x4

    if-eqz v1, :cond_0

    iget-object v1, v0, Landroidx/appcompat/widget/b;->j:[I

    if-nez v1, :cond_1

    :cond_0
    new-array v1, v11, [I

    iput-object v1, v0, Landroidx/appcompat/widget/b;->i:[I

    new-array v1, v11, [I

    iput-object v1, v0, Landroidx/appcompat/widget/b;->j:[I

    :cond_1
    iget-object v12, v0, Landroidx/appcompat/widget/b;->i:[I

    iget-object v13, v0, Landroidx/appcompat/widget/b;->j:[I

    const/4 v14, 0x3

    const/4 v15, -0x1

    aput v15, v12, v14

    const/16 v16, 0x2

    aput v15, v12, v16

    const/16 v17, 0x1

    aput v15, v12, v17

    aput v15, v12, v7

    aput v15, v13, v14

    aput v15, v13, v16

    aput v15, v13, v17

    aput v15, v13, v7

    iget-boolean v1, v0, Landroidx/appcompat/widget/b;->a:Z

    iget-boolean v2, v0, Landroidx/appcompat/widget/b;->h:Z

    const/high16 v3, 0x40000000    # 2.0f

    if-ne v9, v3, :cond_2

    move/from16 v18, v17

    goto :goto_0

    :cond_2
    move/from16 v18, v7

    :goto_0
    const/16 v19, 0x0

    move v4, v2

    move v2, v7

    move v6, v2

    move v15, v6

    move/from16 v22, v15

    move/from16 v24, v22

    move/from16 v26, v24

    move/from16 v20, v11

    move/from16 v21, v14

    move/from16 v25, v17

    move/from16 v5, v19

    move/from16 v11, v26

    move v14, v11

    :goto_1
    move/from16 v27, v6

    const/16 v6, 0x8

    if-ge v2, v8, :cond_15

    move/from16 v30, v1

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_3

    iget v1, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/b;->w(I)I

    move-result v6

    add-int/2addr v1, v6

    iput v1, v0, Landroidx/appcompat/widget/b;->f:I

    :goto_2
    move/from16 v3, p1

    move/from16 v1, p2

    move/from16 v35, v8

    move/from16 v33, v9

    move-object/from16 v34, v12

    move-object/from16 v28, v13

    move/from16 v6, v27

    move/from16 v27, v4

    goto/16 :goto_f

    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-ne v7, v6, :cond_4

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/b;->n(Landroid/view/View;I)I

    move-result v1

    add-int/2addr v2, v1

    goto :goto_2

    :cond_4
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v6

    if-eqz v6, :cond_5

    iget v6, v0, Landroidx/appcompat/widget/b;->f:I

    iget v7, v0, Landroidx/appcompat/widget/b;->l:I

    add-int/2addr v6, v7

    iput v6, v0, Landroidx/appcompat/widget/b;->f:I

    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Landroidx/appcompat/widget/b$a;

    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    add-float v32, v5, v6

    if-ne v9, v3, :cond_8

    iget v5, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v5, :cond_8

    cmpl-float v5, v6, v19

    if-lez v5, :cond_8

    if-eqz v18, :cond_6

    iget v5, v0, Landroidx/appcompat/widget/b;->f:I

    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iget v3, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v6, v3

    add-int/2addr v5, v6

    iput v5, v0, Landroidx/appcompat/widget/b;->f:I

    goto :goto_3

    :cond_6
    iget v3, v0, Landroidx/appcompat/widget/b;->f:I

    iget v5, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v5, v3

    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v5, v6

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v0, Landroidx/appcompat/widget/b;->f:I

    :goto_3
    if-eqz v30, :cond_7

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-virtual {v1, v5, v5}, Landroid/view/View;->measure(II)V

    move/from16 v3, p1

    move/from16 v35, v8

    move/from16 v33, v9

    move-object/from16 v34, v12

    move-object/from16 v28, v13

    goto :goto_4

    :cond_7
    move/from16 v3, p1

    move/from16 v35, v8

    move/from16 v33, v9

    move-object/from16 v34, v12

    move-object/from16 v28, v13

    move/from16 v22, v17

    :goto_4
    move/from16 v12, v27

    const/high16 v8, 0x40000000    # 2.0f

    const/16 v29, -0x2

    move/from16 v27, v4

    move-object v4, v1

    move/from16 v1, p2

    goto/16 :goto_8

    :cond_8
    iget v3, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v3, :cond_9

    cmpl-float v3, v6, v19

    if-lez v3, :cond_9

    const/4 v3, -0x2

    iput v3, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v5, 0x0

    goto :goto_5

    :cond_9
    const/4 v3, -0x2

    const/high16 v5, -0x80000000

    :goto_5
    cmpl-float v6, v32, v19

    if-nez v6, :cond_a

    iget v6, v0, Landroidx/appcompat/widget/b;->f:I

    move/from16 v37, v6

    move v6, v4

    move/from16 v4, v37

    goto :goto_6

    :cond_a
    move v6, v4

    const/4 v4, 0x0

    :goto_6
    const/16 v28, 0x0

    move/from16 v29, v3

    move/from16 v35, v8

    move/from16 v33, v9

    move-object/from16 v34, v12

    move/from16 v12, v27

    const/high16 v8, 0x40000000    # 2.0f

    const/high16 v9, -0x80000000

    move/from16 v3, p1

    move/from16 v27, v6

    move/from16 v6, v28

    move-object/from16 v28, v13

    move v13, v5

    move/from16 v5, p2

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/b;->u(Landroid/view/View;IIIII)V

    move-object v4, v1

    move v1, v5

    if-eq v13, v9, :cond_b

    iput v13, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    :cond_b
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    if-eqz v18, :cond_c

    iget v6, v0, Landroidx/appcompat/widget/b;->f:I

    iget v9, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v9, v5

    iget v13, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v9, v13

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v13

    add-int/2addr v9, v13

    add-int/2addr v6, v9

    iput v6, v0, Landroidx/appcompat/widget/b;->f:I

    goto :goto_7

    :cond_c
    iget v6, v0, Landroidx/appcompat/widget/b;->f:I

    add-int v9, v6, v5

    iget v13, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v9, v13

    iget v13, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v9, v13

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v13

    add-int/2addr v9, v13

    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    move-result v6

    iput v6, v0, Landroidx/appcompat/widget/b;->f:I

    :goto_7
    if-eqz v27, :cond_d

    invoke-static {v5, v15}, Ljava/lang/Math;->max(II)I

    move-result v15

    :cond_d
    :goto_8
    if-eq v10, v8, :cond_e

    iget v5, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v6, -0x1

    if-ne v5, v6, :cond_e

    move/from16 v5, v17

    move/from16 v26, v5

    goto :goto_9

    :cond_e
    const/4 v5, 0x0

    :goto_9
    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget v9, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v6, v9

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    add-int/2addr v9, v6

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredState()I

    move-result v13

    move/from16 v8, v24

    invoke-static {v8, v13}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v24

    if-eqz v30, :cond_10

    invoke-virtual {v4}, Landroid/view/View;->getBaseline()I

    move-result v8

    const/4 v13, -0x1

    if-eq v8, v13, :cond_10

    iget v13, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v13, :cond_f

    iget v13, v0, Landroidx/appcompat/widget/b;->e:I

    :cond_f
    and-int/lit8 v13, v13, 0x70

    shr-int/lit8 v13, v13, 0x4

    and-int/lit8 v13, v13, -0x2

    shr-int/lit8 v13, v13, 0x1

    move/from16 v36, v5

    aget v5, v34, v13

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v5

    aput v5, v34, v13

    aget v5, v28, v13

    sub-int v8, v9, v8

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v5

    aput v5, v28, v13

    goto :goto_a

    :cond_10
    move/from16 v36, v5

    :goto_a
    invoke-static {v12, v9}, Ljava/lang/Math;->max(II)I

    move-result v5

    if-eqz v25, :cond_11

    iget v8, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v13, -0x1

    if-ne v8, v13, :cond_11

    move/from16 v25, v17

    goto :goto_b

    :cond_11
    const/16 v25, 0x0

    :goto_b
    iget v7, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v7, v7, v19

    if-lez v7, :cond_13

    if-eqz v36, :cond_12

    goto :goto_c

    :cond_12
    move v6, v9

    :goto_c
    invoke-static {v14, v6}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_e

    :cond_13
    if-eqz v36, :cond_14

    goto :goto_d

    :cond_14
    move v6, v9

    :goto_d
    invoke-static {v11, v6}, Ljava/lang/Math;->max(II)I

    move-result v11

    :goto_e
    invoke-virtual {v0, v4, v2}, Landroidx/appcompat/widget/b;->n(Landroid/view/View;I)I

    move-result v4

    add-int/2addr v2, v4

    move v6, v5

    move/from16 v5, v32

    :goto_f
    add-int/lit8 v2, v2, 0x1

    move/from16 v4, v27

    move-object/from16 v13, v28

    move/from16 v1, v30

    move/from16 v9, v33

    move-object/from16 v12, v34

    move/from16 v8, v35

    const/high16 v3, 0x40000000    # 2.0f

    const/4 v7, 0x0

    goto/16 :goto_1

    :cond_15
    move/from16 v3, p1

    move/from16 v30, v1

    move/from16 v35, v8

    move/from16 v33, v9

    move-object/from16 v34, v12

    move-object/from16 v28, v13

    move/from16 v8, v24

    move/from16 v12, v27

    const/high16 v9, -0x80000000

    const/16 v29, -0x2

    move/from16 v1, p2

    move/from16 v27, v4

    iget v2, v0, Landroidx/appcompat/widget/b;->f:I

    if-lez v2, :cond_16

    move/from16 v2, v35

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v4

    if-eqz v4, :cond_17

    iget v4, v0, Landroidx/appcompat/widget/b;->f:I

    iget v7, v0, Landroidx/appcompat/widget/b;->l:I

    add-int/2addr v4, v7

    iput v4, v0, Landroidx/appcompat/widget/b;->f:I

    goto :goto_10

    :cond_16
    move/from16 v2, v35

    :cond_17
    :goto_10
    aget v4, v34, v17

    const/4 v13, -0x1

    if-ne v4, v13, :cond_19

    const/16 v31, 0x0

    aget v7, v34, v31

    if-ne v7, v13, :cond_19

    aget v7, v34, v16

    if-ne v7, v13, :cond_19

    aget v7, v34, v21

    if-eq v7, v13, :cond_18

    goto :goto_11

    :cond_18
    move v6, v12

    goto :goto_12

    :cond_19
    :goto_11
    aget v7, v34, v21

    const/16 v31, 0x0

    aget v13, v34, v31

    aget v6, v34, v16

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v13, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    aget v6, v28, v21

    aget v7, v28, v31

    aget v13, v28, v17

    aget v9, v28, v16

    invoke-static {v13, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/2addr v4, v6

    invoke-static {v12, v4}, Ljava/lang/Math;->max(II)I

    move-result v6

    :goto_12
    if-eqz v27, :cond_1f

    move/from16 v4, v33

    const/high16 v9, -0x80000000

    if-eq v4, v9, :cond_1a

    if-nez v4, :cond_1b

    :cond_1a
    const/4 v7, 0x0

    goto :goto_14

    :cond_1b
    move/from16 v32, v5

    :goto_13
    move/from16 v33, v6

    goto/16 :goto_19

    :goto_14
    iput v7, v0, Landroidx/appcompat/widget/b;->f:I

    const/4 v7, 0x0

    :goto_15
    if-ge v7, v2, :cond_1b

    invoke-virtual {v0, v7}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v9

    if-nez v9, :cond_1c

    iget v9, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0, v7}, Landroidx/appcompat/widget/b;->w(I)I

    move-result v12

    add-int/2addr v9, v12

    iput v9, v0, Landroidx/appcompat/widget/b;->f:I

    goto :goto_16

    :cond_1c
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v12

    const/16 v13, 0x8

    if-ne v12, v13, :cond_1d

    invoke-virtual {v0, v9, v7}, Landroidx/appcompat/widget/b;->n(Landroid/view/View;I)I

    move-result v9

    add-int/2addr v7, v9

    :goto_16
    move/from16 v32, v5

    :goto_17
    move/from16 v33, v6

    goto :goto_18

    :cond_1d
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroidx/appcompat/widget/b$a;

    if-eqz v18, :cond_1e

    iget v13, v0, Landroidx/appcompat/widget/b;->f:I

    move/from16 v32, v5

    iget v5, v12, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v5, v15

    iget v12, v12, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v5, v12

    invoke-virtual {v0, v9}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v9

    add-int/2addr v5, v9

    add-int/2addr v13, v5

    iput v13, v0, Landroidx/appcompat/widget/b;->f:I

    goto :goto_17

    :cond_1e
    move/from16 v32, v5

    iget v5, v0, Landroidx/appcompat/widget/b;->f:I

    add-int v13, v5, v15

    move/from16 v33, v6

    iget v6, v12, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v13, v6

    iget v6, v12, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v13, v6

    invoke-virtual {v0, v9}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v6

    add-int/2addr v13, v6

    invoke-static {v5, v13}, Ljava/lang/Math;->max(II)I

    move-result v5

    iput v5, v0, Landroidx/appcompat/widget/b;->f:I

    :goto_18
    add-int/lit8 v7, v7, 0x1

    move/from16 v5, v32

    move/from16 v6, v33

    goto :goto_15

    :cond_1f
    move/from16 v32, v5

    move/from16 v4, v33

    goto :goto_13

    :goto_19
    iget v5, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    add-int/2addr v6, v7

    add-int/2addr v5, v6

    iput v5, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v7, 0x0

    invoke-static {v5, v3, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v5

    const v6, 0xffffff

    and-int/2addr v6, v5

    iget v7, v0, Landroidx/appcompat/widget/b;->f:I

    sub-int/2addr v6, v7

    if-nez v22, :cond_24

    if-eqz v6, :cond_20

    cmpl-float v9, v32, v19

    if-lez v9, :cond_20

    goto :goto_1c

    :cond_20
    invoke-static {v11, v14}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-eqz v27, :cond_23

    const/high16 v9, 0x40000000    # 2.0f

    if-eq v4, v9, :cond_23

    const/4 v4, 0x0

    :goto_1a
    if-ge v4, v2, :cond_23

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v9

    if-eqz v9, :cond_22

    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v11

    const/16 v13, 0x8

    if-ne v11, v13, :cond_21

    goto :goto_1b

    :cond_21
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroidx/appcompat/widget/b$a;

    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v11, v11, v19

    if-lez v11, :cond_22

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v15, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v12

    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    invoke-static {v13, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    invoke-virtual {v9, v12, v13}, Landroid/view/View;->measure(II)V

    :cond_22
    :goto_1b
    add-int/lit8 v4, v4, 0x1

    goto :goto_1a

    :cond_23
    move/from16 v27, v5

    move/from16 v24, v8

    const/high16 v22, -0x1000000

    goto/16 :goto_2a

    :cond_24
    :goto_1c
    iget v9, v0, Landroidx/appcompat/widget/b;->g:F

    cmpl-float v12, v9, v19

    if-lez v12, :cond_25

    move/from16 v32, v9

    :cond_25
    const/16 v23, -0x1

    aput v23, v34, v21

    aput v23, v34, v16

    aput v23, v34, v17

    const/4 v9, 0x0

    aput v23, v34, v9

    aput v23, v28, v21

    aput v23, v28, v16

    aput v23, v28, v17

    aput v23, v28, v9

    iput v9, v0, Landroidx/appcompat/widget/b;->f:I

    move v9, v8

    const/4 v8, -0x1

    const/4 v12, 0x0

    :goto_1d
    if-ge v12, v2, :cond_34

    invoke-virtual {v0, v12}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v13

    if-eqz v13, :cond_26

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    const/16 v15, 0x8

    if-ne v14, v15, :cond_27

    :cond_26
    move/from16 v27, v5

    const/high16 v22, -0x1000000

    goto/16 :goto_27

    :cond_27
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Landroidx/appcompat/widget/b$a;

    const/high16 v22, -0x1000000

    iget v7, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v24, v7, v19

    if-lez v24, :cond_2c

    int-to-float v15, v6

    mul-float/2addr v15, v7

    div-float v15, v15, v32

    float-to-int v15, v15

    sub-float v32, v32, v7

    sub-int/2addr v6, v15

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v27

    add-int v7, v7, v27

    move/from16 v27, v5

    iget v5, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v7, v5

    iget v5, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v7, v5

    iget v5, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    invoke-static {v1, v7, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v5

    iget v7, v14, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-nez v7, :cond_2a

    const/high16 v7, 0x40000000    # 2.0f

    if-eq v4, v7, :cond_28

    goto :goto_1f

    :cond_28
    if-lez v15, :cond_29

    goto :goto_1e

    :cond_29
    const/4 v15, 0x0

    :goto_1e
    invoke-static {v15, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    invoke-virtual {v13, v15, v5}, Landroid/view/View;->measure(II)V

    goto :goto_20

    :cond_2a
    const/high16 v7, 0x40000000    # 2.0f

    :goto_1f
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v33

    add-int v15, v33, v15

    if-gez v15, :cond_2b

    const/4 v15, 0x0

    :cond_2b
    invoke-static {v15, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    invoke-virtual {v13, v15, v5}, Landroid/view/View;->measure(II)V

    :goto_20
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredState()I

    move-result v5

    and-int v5, v5, v22

    invoke-static {v9, v5}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v9

    goto :goto_21

    :cond_2c
    move/from16 v27, v5

    :goto_21
    if-eqz v18, :cond_2d

    iget v5, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v7, v15

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v7, v15

    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v15

    add-int/2addr v7, v15

    add-int/2addr v5, v7

    iput v5, v0, Landroidx/appcompat/widget/b;->f:I

    :goto_22
    const/high16 v7, 0x40000000    # 2.0f

    goto :goto_23

    :cond_2d
    iget v5, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v5

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v7, v15

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v7, v15

    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v15

    add-int/2addr v7, v15

    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    iput v5, v0, Landroidx/appcompat/widget/b;->f:I

    goto :goto_22

    :goto_23
    if-eq v10, v7, :cond_2e

    iget v5, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v7, -0x1

    if-ne v5, v7, :cond_2e

    move/from16 v5, v17

    goto :goto_24

    :cond_2e
    const/4 v5, 0x0

    :goto_24
    iget v7, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v7, v15

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v15, v7

    invoke-static {v8, v15}, Ljava/lang/Math;->max(II)I

    move-result v8

    if-eqz v5, :cond_2f

    goto :goto_25

    :cond_2f
    move v7, v15

    :goto_25
    invoke-static {v11, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    if-eqz v25, :cond_30

    iget v7, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v11, -0x1

    if-ne v7, v11, :cond_31

    move/from16 v7, v17

    goto :goto_26

    :cond_30
    const/4 v11, -0x1

    :cond_31
    const/4 v7, 0x0

    :goto_26
    if-eqz v30, :cond_33

    invoke-virtual {v13}, Landroid/view/View;->getBaseline()I

    move-result v13

    if-eq v13, v11, :cond_33

    iget v11, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v11, :cond_32

    iget v11, v0, Landroidx/appcompat/widget/b;->e:I

    :cond_32
    and-int/lit8 v11, v11, 0x70

    shr-int/lit8 v11, v11, 0x4

    and-int/lit8 v11, v11, -0x2

    shr-int/lit8 v11, v11, 0x1

    aget v14, v34, v11

    invoke-static {v14, v13}, Ljava/lang/Math;->max(II)I

    move-result v14

    aput v14, v34, v11

    aget v14, v28, v11

    sub-int/2addr v15, v13

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v13

    aput v13, v28, v11

    :cond_33
    move v11, v5

    move/from16 v25, v7

    :goto_27
    add-int/lit8 v12, v12, 0x1

    move/from16 v5, v27

    goto/16 :goto_1d

    :cond_34
    move/from16 v27, v5

    const/high16 v22, -0x1000000

    iget v4, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v4, v5

    iput v4, v0, Landroidx/appcompat/widget/b;->f:I

    aget v4, v34, v17

    const/4 v13, -0x1

    if-ne v4, v13, :cond_36

    const/16 v31, 0x0

    aget v5, v34, v31

    if-ne v5, v13, :cond_36

    aget v5, v34, v16

    if-ne v5, v13, :cond_36

    aget v5, v34, v21

    if-eq v5, v13, :cond_35

    goto :goto_28

    :cond_35
    move v6, v8

    goto :goto_29

    :cond_36
    :goto_28
    aget v5, v34, v21

    const/16 v31, 0x0

    aget v6, v34, v31

    aget v7, v34, v16

    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    aget v5, v28, v21

    aget v6, v28, v31

    aget v7, v28, v17

    aget v12, v28, v16

    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    move v6, v4

    :goto_29
    move/from16 v33, v6

    move/from16 v24, v9

    move v6, v11

    :goto_2a
    if-nez v25, :cond_37

    const/high16 v7, 0x40000000    # 2.0f

    if-eq v10, v7, :cond_37

    goto :goto_2b

    :cond_37
    move/from16 v6, v33

    :goto_2b
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    add-int/2addr v4, v5

    add-int/2addr v6, v4

    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v4

    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    and-int v5, v24, v22

    or-int v5, v27, v5

    shl-int/lit8 v6, v24, 0x10

    invoke-static {v4, v1, v6}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-virtual {v0, v5, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eqz v26, :cond_38

    invoke-virtual {v0, v2, v3}, Landroidx/appcompat/widget/b;->i(II)V

    :cond_38
    return-void
.end method

.method public w(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public x(II)V
    .locals 27

    move-object/from16 v0, p0

    const/4 v7, 0x0

    iput v7, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/b;->getVirtualChildCount()I

    move-result v8

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v9

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v10

    iget v11, v0, Landroidx/appcompat/widget/b;->b:I

    iget-boolean v12, v0, Landroidx/appcompat/widget/b;->h:Z

    move v2, v7

    move v3, v2

    move v4, v3

    move v5, v4

    move v6, v5

    move v15, v6

    move/from16 v16, v15

    move/from16 v18, v16

    const/4 v1, 0x0

    const/16 v17, 0x1

    const/16 v19, 0x1

    :goto_0
    const/16 v20, 0x0

    const/16 v7, 0x8

    const/high16 v14, 0x40000000    # 2.0f

    if-ge v2, v8, :cond_11

    move/from16 v21, v1

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    iget v1, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/b;->w(I)I

    move-result v7

    add-int/2addr v1, v7

    iput v1, v0, Landroidx/appcompat/widget/b;->f:I

    :goto_1
    move v14, v3

    move/from16 v26, v8

    move/from16 v25, v10

    move/from16 v24, v12

    move/from16 v1, v21

    move/from16 v3, p1

    move v10, v5

    move/from16 v5, p2

    goto/16 :goto_c

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v13

    if-ne v13, v7, :cond_1

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/b;->n(Landroid/view/View;I)I

    move-result v1

    add-int/2addr v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v7

    if-eqz v7, :cond_2

    iget v7, v0, Landroidx/appcompat/widget/b;->f:I

    iget v13, v0, Landroidx/appcompat/widget/b;->m:I

    add-int/2addr v7, v13

    iput v7, v0, Landroidx/appcompat/widget/b;->f:I

    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/appcompat/widget/b$a;

    iget v13, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    add-float v21, v21, v13

    if-ne v10, v14, :cond_3

    iget v14, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v14, :cond_3

    cmpl-float v14, v13, v20

    if-lez v14, :cond_3

    iget v13, v0, Landroidx/appcompat/widget/b;->f:I

    iget v14, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v14, v13

    move-object/from16 v24, v1

    iget v1, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v14, v1

    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Landroidx/appcompat/widget/b;->f:I

    move v14, v3

    move/from16 v26, v8

    move/from16 v25, v10

    move/from16 v16, v19

    move-object/from16 v1, v24

    move/from16 v3, p1

    move v10, v5

    move v8, v6

    move/from16 v24, v12

    move/from16 v5, p2

    goto/16 :goto_5

    :cond_3
    move-object/from16 v24, v1

    iget v1, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v1, :cond_4

    cmpl-float v1, v13, v20

    if-lez v1, :cond_4

    const/4 v1, -0x2

    iput v1, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    const/4 v13, 0x0

    goto :goto_2

    :cond_4
    const/high16 v13, -0x80000000

    :goto_2
    cmpl-float v1, v21, v20

    if-nez v1, :cond_5

    iget v1, v0, Landroidx/appcompat/widget/b;->f:I

    move v14, v6

    move v6, v1

    move v1, v14

    :goto_3
    move v14, v4

    goto :goto_4

    :cond_5
    move v1, v6

    const/4 v6, 0x0

    goto :goto_3

    :goto_4
    const/4 v4, 0x0

    move/from16 v26, v8

    move/from16 v25, v10

    move v8, v1

    move v10, v5

    move-object/from16 v1, v24

    move/from16 v5, p2

    move/from16 v24, v12

    move v12, v14

    move v14, v3

    move/from16 v3, p1

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/b;->u(Landroid/view/View;IIIII)V

    const/high16 v4, -0x80000000

    if-eq v13, v4, :cond_6

    iput v13, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    iget v6, v0, Landroidx/appcompat/widget/b;->f:I

    add-int v13, v6, v4

    move/from16 v22, v13

    iget v13, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v13, v22, v13

    move/from16 v22, v13

    iget v13, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v13, v22, v13

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v22

    add-int v13, v13, v22

    invoke-static {v6, v13}, Ljava/lang/Math;->max(II)I

    move-result v6

    iput v6, v0, Landroidx/appcompat/widget/b;->f:I

    if-eqz v24, :cond_7

    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_5

    :cond_7
    move v4, v12

    :goto_5
    if-ltz v11, :cond_8

    add-int/lit8 v6, v2, 0x1

    if-ne v11, v6, :cond_8

    iget v6, v0, Landroidx/appcompat/widget/b;->f:I

    iput v6, v0, Landroidx/appcompat/widget/b;->c:I

    :cond_8
    if-ge v2, v11, :cond_9

    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v6, v6, v20

    if-gtz v6, :cond_a

    :cond_9
    const/high16 v6, 0x40000000    # 2.0f

    goto :goto_6

    :cond_a
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_6
    if-eq v9, v6, :cond_b

    iget v6, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v12, -0x1

    if-ne v6, v12, :cond_b

    move/from16 v6, v19

    move/from16 v18, v6

    goto :goto_7

    :cond_b
    const/4 v6, 0x0

    :goto_7
    iget v12, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iget v13, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v12, v13

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    add-int/2addr v13, v12

    invoke-static {v10, v13}, Ljava/lang/Math;->max(II)I

    move-result v10

    move/from16 v22, v4

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    move-result v4

    invoke-static {v8, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    if-eqz v17, :cond_c

    iget v8, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    move/from16 v23, v4

    const/4 v4, -0x1

    if-ne v8, v4, :cond_d

    move/from16 v17, v19

    goto :goto_8

    :cond_c
    move/from16 v23, v4

    :cond_d
    const/16 v17, 0x0

    :goto_8
    iget v4, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v4, v4, v20

    if-lez v4, :cond_f

    if-eqz v6, :cond_e

    goto :goto_9

    :cond_e
    move v12, v13

    :goto_9
    invoke-static {v14, v12}, Ljava/lang/Math;->max(II)I

    move-result v4

    move v14, v4

    goto :goto_b

    :cond_f
    if-eqz v6, :cond_10

    goto :goto_a

    :cond_10
    move v12, v13

    :goto_a
    invoke-static {v15, v12}, Ljava/lang/Math;->max(II)I

    move-result v15

    :goto_b
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/b;->n(Landroid/view/View;I)I

    move-result v1

    add-int/2addr v2, v1

    move/from16 v1, v21

    move/from16 v4, v22

    move/from16 v6, v23

    :goto_c
    add-int/lit8 v2, v2, 0x1

    move v5, v10

    move v3, v14

    move/from16 v12, v24

    move/from16 v10, v25

    move/from16 v8, v26

    const/4 v7, 0x0

    goto/16 :goto_0

    :cond_11
    move/from16 v21, v1

    move v14, v3

    move/from16 v26, v8

    move/from16 v25, v10

    move/from16 v24, v12

    move/from16 v3, p1

    move v12, v4

    move v10, v5

    move v8, v6

    move/from16 v5, p2

    iget v1, v0, Landroidx/appcompat/widget/b;->f:I

    if-lez v1, :cond_12

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v2

    if-eqz v2, :cond_13

    iget v2, v0, Landroidx/appcompat/widget/b;->f:I

    iget v4, v0, Landroidx/appcompat/widget/b;->m:I

    add-int/2addr v2, v4

    iput v2, v0, Landroidx/appcompat/widget/b;->f:I

    goto :goto_d

    :cond_12
    move/from16 v1, v26

    :cond_13
    :goto_d
    move/from16 v2, v25

    if-eqz v24, :cond_17

    const/high16 v4, -0x80000000

    if-eq v2, v4, :cond_14

    if-nez v2, :cond_17

    :cond_14
    const/4 v4, 0x0

    iput v4, v0, Landroidx/appcompat/widget/b;->f:I

    const/4 v4, 0x0

    :goto_e
    if-ge v4, v1, :cond_17

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_15

    iget v6, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/b;->w(I)I

    move-result v11

    add-int/2addr v6, v11

    iput v6, v0, Landroidx/appcompat/widget/b;->f:I

    goto :goto_f

    :cond_15
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v11

    if-ne v11, v7, :cond_16

    invoke-virtual {v0, v6, v4}, Landroidx/appcompat/widget/b;->n(Landroid/view/View;I)I

    move-result v6

    add-int/2addr v4, v6

    goto :goto_f

    :cond_16
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroidx/appcompat/widget/b$a;

    iget v13, v0, Landroidx/appcompat/widget/b;->f:I

    add-int v22, v13, v12

    iget v7, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v22, v22, v7

    iget v7, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v22, v22, v7

    invoke-virtual {v0, v6}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v6

    add-int v6, v22, v6

    invoke-static {v13, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    iput v6, v0, Landroidx/appcompat/widget/b;->f:I

    :goto_f
    add-int/lit8 v4, v4, 0x1

    const/16 v7, 0x8

    goto :goto_e

    :cond_17
    iget v4, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    add-int/2addr v6, v7

    add-int/2addr v4, v6

    iput v4, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v6

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    const/4 v6, 0x0

    invoke-static {v4, v5, v6}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v4

    const v6, 0xffffff

    and-int/2addr v6, v4

    iget v7, v0, Landroidx/appcompat/widget/b;->f:I

    sub-int/2addr v6, v7

    if-nez v16, :cond_1b

    if-eqz v6, :cond_18

    cmpl-float v7, v21, v20

    if-lez v7, :cond_18

    goto :goto_12

    :cond_18
    invoke-static {v15, v14}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-eqz v24, :cond_27

    const/high16 v7, 0x40000000    # 2.0f

    if-eq v2, v7, :cond_27

    const/4 v7, 0x0

    :goto_10
    if-ge v7, v1, :cond_27

    invoke-virtual {v0, v7}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v11

    const/16 v13, 0x8

    if-ne v11, v13, :cond_19

    goto :goto_11

    :cond_19
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroidx/appcompat/widget/b$a;

    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v11, v11, v20

    if-lez v11, :cond_1a

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    const/high16 v13, 0x40000000    # 2.0f

    invoke-static {v11, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    invoke-static {v12, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v14

    invoke-virtual {v2, v11, v14}, Landroid/view/View;->measure(II)V

    :cond_1a
    :goto_11
    add-int/lit8 v7, v7, 0x1

    goto :goto_10

    :cond_1b
    :goto_12
    iget v7, v0, Landroidx/appcompat/widget/b;->g:F

    cmpl-float v11, v7, v20

    if-lez v11, :cond_1c

    :goto_13
    const/4 v11, 0x0

    goto :goto_14

    :cond_1c
    move/from16 v7, v21

    goto :goto_13

    :goto_14
    iput v11, v0, Landroidx/appcompat/widget/b;->f:I

    move v12, v7

    move v7, v6

    move v6, v11

    :goto_15
    if-ge v6, v1, :cond_26

    invoke-virtual {v0, v6}, Landroidx/appcompat/widget/b;->q(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    const/16 v11, 0x8

    if-ne v14, v11, :cond_1d

    move/from16 v22, v2

    move/from16 v16, v6

    goto/16 :goto_1d

    :cond_1d
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Landroidx/appcompat/widget/b$a;

    iget v11, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    cmpl-float v16, v11, v20

    if-lez v16, :cond_22

    move/from16 v16, v6

    int-to-float v6, v7

    mul-float/2addr v6, v11

    div-float/2addr v6, v12

    float-to-int v6, v6

    sub-float/2addr v12, v11

    sub-int/2addr v7, v6

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v11

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v21

    add-int v11, v11, v21

    move/from16 v21, v6

    iget v6, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v11, v6

    iget v6, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v11, v6

    iget v6, v14, Landroid/widget/LinearLayout$LayoutParams;->width:I

    invoke-static {v3, v11, v6}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    iget v11, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    if-nez v11, :cond_20

    const/high16 v11, 0x40000000    # 2.0f

    if-eq v2, v11, :cond_1e

    :goto_16
    move/from16 v22, v2

    goto :goto_18

    :cond_1e
    move/from16 v22, v2

    if-lez v21, :cond_1f

    move/from16 v2, v21

    goto :goto_17

    :cond_1f
    const/4 v2, 0x0

    :goto_17
    invoke-static {v2, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v13, v6, v2}, Landroid/view/View;->measure(II)V

    goto :goto_19

    :cond_20
    const/high16 v11, 0x40000000    # 2.0f

    goto :goto_16

    :goto_18
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int v2, v2, v21

    if-gez v2, :cond_21

    const/4 v2, 0x0

    :cond_21
    invoke-static {v2, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v13, v6, v2}, Landroid/view/View;->measure(II)V

    :goto_19
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    and-int/lit16 v2, v2, -0x100

    invoke-static {v8, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v8

    goto :goto_1a

    :cond_22
    move/from16 v22, v2

    move/from16 v16, v6

    :goto_1a
    iget v2, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iget v6, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v2, v6

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    add-int/2addr v6, v2

    invoke-static {v10, v6}, Ljava/lang/Math;->max(II)I

    move-result v10

    const/high16 v11, 0x40000000    # 2.0f

    if-eq v9, v11, :cond_23

    iget v11, v14, Landroid/widget/LinearLayout$LayoutParams;->width:I

    move/from16 v21, v2

    const/4 v2, -0x1

    if-ne v11, v2, :cond_24

    move/from16 v6, v21

    goto :goto_1b

    :cond_23
    const/4 v2, -0x1

    :cond_24
    :goto_1b
    invoke-static {v15, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-eqz v17, :cond_25

    iget v11, v14, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-ne v11, v2, :cond_25

    move/from16 v11, v19

    goto :goto_1c

    :cond_25
    const/4 v11, 0x0

    :goto_1c
    iget v15, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v17

    add-int v17, v15, v17

    iget v2, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v17, v17, v2

    iget v2, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v17, v17, v2

    invoke-virtual {v0, v13}, Landroidx/appcompat/widget/b;->p(Landroid/view/View;)I

    move-result v2

    add-int v2, v17, v2

    invoke-static {v15, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v0, Landroidx/appcompat/widget/b;->f:I

    move v15, v6

    move/from16 v17, v11

    :goto_1d
    add-int/lit8 v6, v16, 0x1

    move/from16 v2, v22

    const/4 v11, 0x0

    goto/16 :goto_15

    :cond_26
    iget v2, v0, Landroidx/appcompat/widget/b;->f:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    add-int/2addr v6, v7

    add-int/2addr v2, v6

    iput v2, v0, Landroidx/appcompat/widget/b;->f:I

    move v6, v15

    :cond_27
    if-nez v17, :cond_28

    const/high16 v11, 0x40000000    # 2.0f

    if-eq v9, v11, :cond_28

    move v10, v6

    :cond_28
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    add-int/2addr v2, v6

    add-int/2addr v10, v2

    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v2, v3, v8}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    invoke-virtual {v0, v2, v4}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eqz v18, :cond_29

    invoke-direct {v0, v1, v5}, Landroidx/appcompat/widget/b;->j(II)V

    :cond_29
    return-void
.end method
