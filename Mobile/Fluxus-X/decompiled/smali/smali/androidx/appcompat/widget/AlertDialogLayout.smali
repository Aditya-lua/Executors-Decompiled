.class public Landroidx/appcompat/widget/AlertDialogLayout;
.super Landroidx/appcompat/widget/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static z(Landroid/view/View;)I
    .locals 3

    invoke-static {p0}, Landroidx/core/view/o0;->A(Landroid/view/View;)I

    move-result v0

    if-lez v0, :cond_0

    return v0

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Landroidx/appcompat/widget/AlertDialogLayout;->z(Landroid/view/View;)I

    move-result p0

    return p0

    :cond_1
    return v1
.end method


# virtual methods
.method public final A(II)Z
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v4

    move-object v7, v6

    move v8, v5

    :goto_0
    const/16 v9, 0x8

    if-ge v8, v3, :cond_6

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v11

    if-ne v11, v9, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v10}, Landroid/view/View;->getId()I

    move-result v9

    sget v11, Li/f;->U:I

    if-ne v9, v11, :cond_1

    move-object v4, v10

    goto :goto_2

    :cond_1
    sget v11, Li/f;->l:I

    if-ne v9, v11, :cond_2

    move-object v6, v10

    goto :goto_2

    :cond_2
    sget v11, Li/f;->n:I

    if-eq v9, v11, :cond_4

    sget v11, Li/f;->p:I

    if-ne v9, v11, :cond_3

    goto :goto_1

    :cond_3
    return v5

    :cond_4
    :goto_1
    if-eqz v7, :cond_5

    return v5

    :cond_5
    move-object v7, v10

    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_6
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v8

    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v10

    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v12

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v13

    add-int/2addr v12, v13

    if-eqz v4, :cond_7

    invoke-virtual {v4, v1, v5}, Landroid/view/View;->measure(II)V

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    add-int/2addr v12, v13

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredState()I

    move-result v4

    invoke-static {v5, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    goto :goto_3

    :cond_7
    move v4, v5

    :goto_3
    if-eqz v6, :cond_8

    invoke-virtual {v6, v1, v5}, Landroid/view/View;->measure(II)V

    invoke-static {v6}, Landroidx/appcompat/widget/AlertDialogLayout;->z(Landroid/view/View;)I

    move-result v13

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    sub-int/2addr v14, v13

    add-int/2addr v12, v13

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredState()I

    move-result v15

    invoke-static {v4, v15}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    goto :goto_4

    :cond_8
    move v13, v5

    move v14, v13

    :goto_4
    if-eqz v7, :cond_a

    if-nez v8, :cond_9

    move v15, v5

    goto :goto_5

    :cond_9
    sub-int v15, v10, v12

    invoke-static {v5, v15}, Ljava/lang/Math;->max(II)I

    move-result v15

    invoke-static {v15, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    :goto_5
    invoke-virtual {v7, v1, v15}, Landroid/view/View;->measure(II)V

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v12, v15

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredState()I

    move-result v5

    invoke-static {v4, v5}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    goto :goto_6

    :cond_a
    const/4 v15, 0x0

    :goto_6
    sub-int/2addr v10, v12

    const/high16 v5, 0x40000000    # 2.0f

    if-eqz v6, :cond_c

    sub-int/2addr v12, v13

    invoke-static {v10, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    if-lez v14, :cond_b

    sub-int/2addr v10, v14

    add-int/2addr v13, v14

    :cond_b
    invoke-static {v13, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    invoke-virtual {v6, v1, v13}, Landroid/view/View;->measure(II)V

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    add-int/2addr v12, v13

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredState()I

    move-result v6

    invoke-static {v4, v6}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    :cond_c
    if-eqz v7, :cond_d

    if-lez v10, :cond_d

    sub-int/2addr v12, v15

    add-int/2addr v15, v10

    invoke-static {v15, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v7, v1, v6}, Landroid/view/View;->measure(II)V

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v12, v6

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredState()I

    move-result v6

    invoke-static {v4, v6}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    :cond_d
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_7
    if-ge v6, v3, :cond_f

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-eq v10, v9, :cond_e

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    :cond_e
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_f
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v8

    add-int/2addr v6, v8

    add-int/2addr v7, v6

    invoke-static {v7, v1, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    const/4 v4, 0x0

    invoke-static {v12, v2, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v4

    invoke-virtual {v0, v1, v4}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eq v11, v5, :cond_10

    invoke-virtual {v0, v3, v2}, Landroidx/appcompat/widget/AlertDialogLayout;->j(II)V

    :cond_10
    const/4 v1, 0x1

    return v1
.end method

.method public final j(II)V
    .locals 9

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

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

.method public onLayout(ZIIII)V
    .locals 10

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int p2, p4, p2

    sub-int/2addr p4, p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    sub-int/2addr p4, v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-virtual {p0}, Landroidx/appcompat/widget/b;->getGravity()I

    move-result v2

    and-int/lit8 v3, v2, 0x70

    const v4, 0x800007

    and-int/2addr v2, v4

    const/16 v4, 0x10

    if-eq v3, v4, :cond_1

    const/16 v4, 0x50

    if-eq v3, v4, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    add-int/2addr v3, p5

    sub-int/2addr v3, p3

    sub-int p3, v3, v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr p5, p3

    sub-int/2addr p5, v0

    div-int/lit8 p5, p5, 0x2

    add-int p3, v3, p5

    :goto_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/b;->getDividerDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p5

    const/4 v0, 0x0

    if-nez p5, :cond_2

    move p5, v0

    goto :goto_1

    :cond_2
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p5

    :goto_1
    if-ge v0, v1, :cond_8

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v5, 0x8

    if-eq v3, v5, :cond_7

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Landroidx/appcompat/widget/b$a;

    iget v3, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v3, :cond_3

    move v3, v2

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    invoke-static {v3, v5}, Landroidx/core/view/k;->b(II)I

    move-result v3

    and-int/lit8 v3, v3, 0x7

    const/4 v5, 0x1

    if-eq v3, v5, :cond_5

    const/4 v5, 0x5

    if-eq v3, v5, :cond_4

    iget v3, v9, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, p1

    :goto_2
    move v5, v3

    goto :goto_4

    :cond_4
    sub-int v3, p2, v7

    iget v5, v9, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    :goto_3
    sub-int/2addr v3, v5

    goto :goto_2

    :cond_5
    sub-int v3, p4, v7

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, p1

    iget v5, v9, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v5

    iget v5, v9, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    goto :goto_3

    :goto_4
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/b;->r(I)Z

    move-result v3

    if-eqz v3, :cond_6

    add-int/2addr p3, p5

    :cond_6
    iget v3, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int v6, p3, v3

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Landroidx/appcompat/widget/AlertDialogLayout;->y(Landroid/view/View;IIII)V

    iget p3, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v8, p3

    add-int/2addr v6, v8

    move p3, v6

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_8
    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/AlertDialogLayout;->A(II)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/b;->onMeasure(II)V

    :cond_0
    return-void
.end method

.method public final y(Landroid/view/View;IIII)V
    .locals 0

    add-int/2addr p4, p2

    add-int/2addr p5, p3

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method
