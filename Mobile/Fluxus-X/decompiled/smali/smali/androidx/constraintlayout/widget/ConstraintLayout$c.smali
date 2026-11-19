.class public Landroidx/constraintlayout/widget/ConstraintLayout$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/ConstraintLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public final synthetic h:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Landroidx/constraintlayout/widget/e;

    if-eqz v4, :cond_0

    check-cast v3, Landroidx/constraintlayout/widget/e;

    iget-object v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3, v4}, Landroidx/constraintlayout/widget/e;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(Landroidx/constraintlayout/widget/ConstraintLayout;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    :goto_1
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(Landroidx/constraintlayout/widget/ConstraintLayout;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/b;

    iget-object v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v2, v3}, Landroidx/constraintlayout/widget/b;->p(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final b(Lc2/e;Ld2/b$a;)V
    .locals 18
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongCall"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-nez v1, :cond_0

    goto/16 :goto_e

    :cond_0
    invoke-virtual {v1}, Lc2/e;->V()I

    move-result v3

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    invoke-virtual {v1}, Lc2/e;->j0()Z

    move-result v3

    if-nez v3, :cond_1

    iput v5, v2, Ld2/b$a;->e:I

    iput v5, v2, Ld2/b$a;->f:I

    iput v5, v2, Ld2/b$a;->g:I

    return-void

    :cond_1
    invoke-virtual {v1}, Lc2/e;->K()Lc2/e;

    move-result-object v3

    if-nez v3, :cond_2

    goto/16 :goto_e

    :cond_2
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)Lz1/e;

    iget-object v3, v2, Ld2/b$a;->a:Lc2/e$b;

    iget-object v4, v2, Ld2/b$a;->b:Lc2/e$b;

    iget v6, v2, Ld2/b$a;->c:I

    iget v7, v2, Ld2/b$a;->d:I

    iget v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->b:I

    iget v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->c:I

    add-int/2addr v8, v9

    iget v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->d:I

    invoke-virtual {v1}, Lc2/e;->s()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    sget-object v11, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v12, v11, v12

    const/4 v13, 0x4

    const/4 v14, 0x3

    const/4 v15, 0x2

    const/4 v5, 0x1

    if-eq v12, v5, :cond_b

    if-eq v12, v15, :cond_a

    if-eq v12, v14, :cond_9

    if-eq v12, v13, :cond_3

    const/4 v6, 0x0

    goto/16 :goto_2

    :cond_3
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->f:I

    const/4 v12, -0x2

    invoke-static {v6, v9, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    iget v9, v1, Lc2/e;->w:I

    if-ne v9, v5, :cond_4

    move v9, v5

    goto :goto_0

    :cond_4
    const/4 v9, 0x0

    :goto_0
    iget v12, v2, Ld2/b$a;->j:I

    sget v13, Ld2/b$a;->l:I

    if-eq v12, v13, :cond_5

    sget v13, Ld2/b$a;->m:I

    if-ne v12, v13, :cond_c

    :cond_5
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    invoke-virtual {v1}, Lc2/e;->x()I

    move-result v13

    if-ne v12, v13, :cond_6

    move v12, v5

    goto :goto_1

    :cond_6
    const/4 v12, 0x0

    :goto_1
    iget v13, v2, Ld2/b$a;->j:I

    sget v14, Ld2/b$a;->m:I

    if-eq v13, v14, :cond_8

    if-eqz v9, :cond_8

    if-eqz v9, :cond_7

    if-nez v12, :cond_8

    :cond_7
    instance-of v9, v10, Landroidx/constraintlayout/widget/e;

    if-nez v9, :cond_8

    invoke-virtual {v1}, Lc2/e;->n0()Z

    move-result v9

    if-eqz v9, :cond_c

    :cond_8
    invoke-virtual {v1}, Lc2/e;->W()I

    move-result v6

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v6, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    goto :goto_2

    :cond_9
    const/high16 v12, 0x40000000    # 2.0f

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->f:I

    invoke-virtual {v1}, Lc2/e;->B()I

    move-result v13

    add-int/2addr v9, v13

    const/4 v13, -0x1

    invoke-static {v6, v9, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    goto :goto_2

    :cond_a
    const/high16 v12, 0x40000000    # 2.0f

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->f:I

    const/4 v13, -0x2

    invoke-static {v6, v9, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    goto :goto_2

    :cond_b
    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v6, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    :cond_c
    :goto_2
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v11, v9

    if-eq v9, v5, :cond_15

    if-eq v9, v15, :cond_14

    const/4 v7, 0x3

    if-eq v9, v7, :cond_13

    const/4 v7, 0x4

    if-eq v9, v7, :cond_d

    const/4 v7, 0x0

    goto/16 :goto_5

    :cond_d
    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->g:I

    const/4 v13, -0x2

    invoke-static {v7, v8, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    iget v8, v1, Lc2/e;->x:I

    if-ne v8, v5, :cond_e

    move v8, v5

    goto :goto_3

    :cond_e
    const/4 v8, 0x0

    :goto_3
    iget v9, v2, Ld2/b$a;->j:I

    sget v11, Ld2/b$a;->l:I

    if-eq v9, v11, :cond_f

    sget v11, Ld2/b$a;->m:I

    if-ne v9, v11, :cond_16

    :cond_f
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    invoke-virtual {v1}, Lc2/e;->W()I

    move-result v11

    if-ne v9, v11, :cond_10

    move v9, v5

    goto :goto_4

    :cond_10
    const/4 v9, 0x0

    :goto_4
    iget v11, v2, Ld2/b$a;->j:I

    sget v12, Ld2/b$a;->m:I

    if-eq v11, v12, :cond_12

    if-eqz v8, :cond_12

    if-eqz v8, :cond_11

    if-nez v9, :cond_12

    :cond_11
    instance-of v8, v10, Landroidx/constraintlayout/widget/e;

    if-nez v8, :cond_12

    invoke-virtual {v1}, Lc2/e;->o0()Z

    move-result v8

    if-eqz v8, :cond_16

    :cond_12
    invoke-virtual {v1}, Lc2/e;->x()I

    move-result v7

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v7, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    goto :goto_5

    :cond_13
    const/high16 v12, 0x40000000    # 2.0f

    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->g:I

    invoke-virtual {v1}, Lc2/e;->U()I

    move-result v9

    add-int/2addr v8, v9

    const/4 v13, -0x1

    invoke-static {v7, v8, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    goto :goto_5

    :cond_14
    const/high16 v12, 0x40000000    # 2.0f

    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->g:I

    const/4 v13, -0x2

    invoke-static {v7, v8, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    goto :goto_5

    :cond_15
    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v7, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    :cond_16
    :goto_5
    invoke-virtual {v1}, Lc2/e;->K()Lc2/e;

    move-result-object v8

    check-cast v8, Lc2/f;

    if-eqz v8, :cond_17

    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v9}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)I

    move-result v9

    const/16 v11, 0x100

    invoke-static {v9, v11}, Lc2/k;->b(II)Z

    move-result v9

    if-eqz v9, :cond_17

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    invoke-virtual {v1}, Lc2/e;->W()I

    move-result v11

    if-ne v9, v11, :cond_17

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    invoke-virtual {v8}, Lc2/e;->W()I

    move-result v11

    if-ge v9, v11, :cond_17

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    invoke-virtual {v1}, Lc2/e;->x()I

    move-result v11

    if-ne v9, v11, :cond_17

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    invoke-virtual {v8}, Lc2/e;->x()I

    move-result v8

    if-ge v9, v8, :cond_17

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v8

    invoke-virtual {v1}, Lc2/e;->p()I

    move-result v9

    if-ne v8, v9, :cond_17

    invoke-virtual {v1}, Lc2/e;->m0()Z

    move-result v8

    if-nez v8, :cond_17

    invoke-virtual {v1}, Lc2/e;->C()I

    move-result v8

    invoke-virtual {v1}, Lc2/e;->W()I

    move-result v9

    invoke-virtual {v0, v8, v6, v9}, Landroidx/constraintlayout/widget/ConstraintLayout$c;->d(III)Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-virtual {v1}, Lc2/e;->D()I

    move-result v8

    invoke-virtual {v1}, Lc2/e;->x()I

    move-result v9

    invoke-virtual {v0, v8, v7, v9}, Landroidx/constraintlayout/widget/ConstraintLayout$c;->d(III)Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-virtual {v1}, Lc2/e;->W()I

    move-result v3

    iput v3, v2, Ld2/b$a;->e:I

    invoke-virtual {v1}, Lc2/e;->x()I

    move-result v3

    iput v3, v2, Ld2/b$a;->f:I

    invoke-virtual {v1}, Lc2/e;->p()I

    move-result v1

    iput v1, v2, Ld2/b$a;->g:I

    return-void

    :cond_17
    sget-object v8, Lc2/e$b;->c:Lc2/e$b;

    if-ne v3, v8, :cond_18

    move v9, v5

    goto :goto_6

    :cond_18
    const/4 v9, 0x0

    :goto_6
    if-ne v4, v8, :cond_19

    move v8, v5

    goto :goto_7

    :cond_19
    const/4 v8, 0x0

    :goto_7
    sget-object v11, Lc2/e$b;->d:Lc2/e$b;

    if-eq v4, v11, :cond_1b

    sget-object v12, Lc2/e$b;->a:Lc2/e$b;

    if-ne v4, v12, :cond_1a

    goto :goto_8

    :cond_1a
    const/4 v4, 0x0

    goto :goto_9

    :cond_1b
    :goto_8
    move v4, v5

    :goto_9
    if-eq v3, v11, :cond_1d

    sget-object v11, Lc2/e$b;->a:Lc2/e$b;

    if-ne v3, v11, :cond_1c

    goto :goto_a

    :cond_1c
    const/4 v3, 0x0

    goto :goto_b

    :cond_1d
    :goto_a
    move v3, v5

    :goto_b
    const/4 v11, 0x0

    if-eqz v9, :cond_1e

    iget v12, v1, Lc2/e;->d0:F

    cmpl-float v12, v12, v11

    if-lez v12, :cond_1e

    move v12, v5

    goto :goto_c

    :cond_1e
    const/4 v12, 0x0

    :goto_c
    if-eqz v8, :cond_1f

    iget v13, v1, Lc2/e;->d0:F

    cmpl-float v11, v13, v11

    if-lez v11, :cond_1f

    move v11, v5

    goto :goto_d

    :cond_1f
    const/4 v11, 0x0

    :goto_d
    if-nez v10, :cond_20

    :goto_e
    return-void

    :cond_20
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iget v14, v2, Ld2/b$a;->j:I

    sget v15, Ld2/b$a;->l:I

    if-eq v14, v15, :cond_22

    sget v15, Ld2/b$a;->m:I

    if-eq v14, v15, :cond_22

    if-eqz v9, :cond_22

    iget v9, v1, Lc2/e;->w:I

    if-nez v9, :cond_22

    if-eqz v8, :cond_22

    iget v8, v1, Lc2/e;->x:I

    if-eqz v8, :cond_21

    goto :goto_f

    :cond_21
    const/4 v3, -0x1

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    goto/16 :goto_17

    :cond_22
    :goto_f
    instance-of v8, v10, Lg2/f;

    if-eqz v8, :cond_23

    instance-of v8, v1, Lc2/l;

    if-eqz v8, :cond_23

    move-object v8, v1

    check-cast v8, Lc2/l;

    move-object v9, v10

    check-cast v9, Lg2/f;

    invoke-virtual {v9, v8, v6, v7}, Lg2/f;->t(Lc2/l;II)V

    goto :goto_10

    :cond_23
    invoke-virtual {v10, v6, v7}, Landroid/view/View;->measure(II)V

    :goto_10
    invoke-virtual {v1, v6, v7}, Lc2/e;->W0(II)V

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v14

    iget v15, v1, Lc2/e;->z:I

    if-lez v15, :cond_24

    invoke-static {v15, v8}, Ljava/lang/Math;->max(II)I

    move-result v15

    goto :goto_11

    :cond_24
    move v15, v8

    :goto_11
    iget v5, v1, Lc2/e;->A:I

    if-lez v5, :cond_25

    invoke-static {v5, v15}, Ljava/lang/Math;->min(II)I

    move-result v15

    :cond_25
    iget v5, v1, Lc2/e;->C:I

    if-lez v5, :cond_26

    invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I

    move-result v5

    :goto_12
    move/from16 v16, v3

    goto :goto_13

    :cond_26
    move v5, v9

    goto :goto_12

    :goto_13
    iget v3, v1, Lc2/e;->D:I

    if-lez v3, :cond_27

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    :cond_27
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)I

    move-result v3

    move/from16 v17, v4

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lc2/k;->b(II)Z

    move-result v3

    if-nez v3, :cond_29

    const/high16 v3, 0x3f000000    # 0.5f

    if-eqz v12, :cond_28

    if-eqz v17, :cond_28

    iget v4, v1, Lc2/e;->d0:F

    int-to-float v11, v5

    mul-float/2addr v11, v4

    add-float/2addr v11, v3

    float-to-int v15, v11

    goto :goto_14

    :cond_28
    if-eqz v11, :cond_29

    if-eqz v16, :cond_29

    iget v4, v1, Lc2/e;->d0:F

    int-to-float v5, v15

    div-float/2addr v5, v4

    add-float/2addr v5, v3

    float-to-int v5, v5

    :cond_29
    :goto_14
    if-ne v8, v15, :cond_2b

    if-eq v9, v5, :cond_2a

    goto :goto_16

    :cond_2a
    :goto_15
    const/4 v3, -0x1

    goto :goto_17

    :cond_2b
    :goto_16
    const/high16 v12, 0x40000000    # 2.0f

    if-eq v8, v15, :cond_2c

    invoke-static {v15, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    :cond_2c
    if-eq v9, v5, :cond_2d

    invoke-static {v5, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    :cond_2d
    invoke-virtual {v10, v6, v7}, Landroid/view/View;->measure(II)V

    invoke-virtual {v1, v6, v7}, Lc2/e;->W0(II)V

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v14

    goto :goto_15

    :goto_17
    if-eq v14, v3, :cond_2e

    const/4 v4, 0x1

    goto :goto_18

    :cond_2e
    const/4 v4, 0x0

    :goto_18
    iget v3, v2, Ld2/b$a;->c:I

    if-ne v15, v3, :cond_30

    iget v3, v2, Ld2/b$a;->d:I

    if-eq v5, v3, :cond_2f

    goto :goto_19

    :cond_2f
    const/4 v3, 0x0

    goto :goto_1a

    :cond_30
    :goto_19
    const/4 v3, 0x1

    :goto_1a
    iput-boolean v3, v2, Ld2/b$a;->i:Z

    iget-boolean v3, v13, Landroidx/constraintlayout/widget/ConstraintLayout$b;->g0:Z

    if-eqz v3, :cond_31

    const/4 v4, 0x1

    :cond_31
    if-eqz v4, :cond_32

    const/4 v13, -0x1

    if-eq v14, v13, :cond_32

    invoke-virtual {v1}, Lc2/e;->p()I

    move-result v1

    if-eq v1, v14, :cond_32

    const/4 v1, 0x1

    iput-boolean v1, v2, Ld2/b$a;->i:Z

    :cond_32
    iput v15, v2, Ld2/b$a;->e:I

    iput v5, v2, Ld2/b$a;->f:I

    iput-boolean v4, v2, Ld2/b$a;->h:Z

    iput v14, v2, Ld2/b$a;->g:I

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)Lz1/e;

    return-void
.end method

.method public c(IIIIII)V
    .locals 0

    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->b:I

    iput p4, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->c:I

    iput p5, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->d:I

    iput p6, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->e:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->f:I

    iput p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->g:I

    return-void
.end method

.method public final d(III)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p2, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v1, v2, :cond_2

    const/high16 v1, -0x80000000

    if-eq p1, v1, :cond_1

    if-nez p1, :cond_2

    :cond_1
    if-ne p3, p2, :cond_2

    return v0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
