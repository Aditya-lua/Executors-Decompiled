.class public Landroidx/recyclerview/widget/RecyclerView$e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e0"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/widget/OverScroller;

.field public d:Landroid/view/animation/Interpolator;

.field public e:Z

.field public f:Z

.field public final synthetic g:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->N0:Landroid/view/animation/Interpolator;

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->d:Landroid/view/animation/Interpolator;

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->e:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->f:Z

    new-instance v1, Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->c:Landroid/widget/OverScroller;

    return-void
.end method


# virtual methods
.method public final a(II)I
    .locals 2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-le p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    int-to-float p1, p1

    int-to-float p2, v1

    div-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    add-float/2addr p1, p2

    const/high16 p2, 0x43960000    # 300.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    const/16 p2, 0x7d0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public b(II)V
    .locals 12

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->b:I

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->a:I

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->d:Landroid/view/animation/Interpolator;

    sget-object v1, Landroidx/recyclerview/widget/RecyclerView;->N0:Landroid/view/animation/Interpolator;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->d:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/widget/OverScroller;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->c:Landroid/widget/OverScroller;

    :cond_0
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->c:Landroid/widget/OverScroller;

    const/high16 v10, -0x80000000

    const v11, 0x7fffffff

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/high16 v8, -0x80000000

    const v9, 0x7fffffff

    move v6, p1

    move v7, p2

    invoke-virtual/range {v3 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$e0;->d()V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p0}, Landroidx/core/view/o0;->e0(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->f:Z

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$e0;->c()V

    return-void
.end method

.method public e(IIILandroid/view/animation/Interpolator;)V
    .locals 6

    const/high16 v0, -0x80000000

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$e0;->a(II)I

    move-result p3

    :cond_0
    move v5, p3

    if-nez p4, :cond_1

    sget-object p4, Landroidx/recyclerview/widget/RecyclerView;->N0:Landroid/view/animation/Interpolator;

    :cond_1
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->d:Landroid/view/animation/Interpolator;

    if-eq p3, p4, :cond_2

    iput-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->d:Landroid/view/animation/Interpolator;

    new-instance p3, Landroid/widget/OverScroller;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0, p4}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->c:Landroid/widget/OverScroller;

    :cond_2
    const/4 p3, 0x0

    iput p3, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->b:I

    iput p3, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->a:I

    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p4, 0x2

    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->c:Landroid/widget/OverScroller;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$e0;->d()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$e0;->c:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    return-void
.end method

.method public run()V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->n:Landroidx/recyclerview/widget/RecyclerView$q;

    if-nez v2, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$e0;->f()V

    return-void

    :cond_0
    const/4 v2, 0x0

    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->f:Z

    const/4 v3, 0x1

    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->e:Z

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->A()V

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->c:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v4

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v5

    iget v6, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->a:I

    sub-int v6, v4, v6

    iget v7, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->b:I

    sub-int v7, v5, v7

    iput v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->a:I

    iput v5, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->b:I

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->x(I)I

    move-result v9

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v7}, Landroidx/recyclerview/widget/RecyclerView;->z(I)I

    move-result v10

    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v11, v8, Landroidx/recyclerview/widget/RecyclerView;->v0:[I

    aput v2, v11, v2

    aput v2, v11, v3

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-virtual/range {v8 .. v13}, Landroidx/recyclerview/widget/RecyclerView;->L(II[I[II)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->v0:[I

    aget v5, v4, v2

    sub-int/2addr v9, v5

    aget v4, v4, v3

    sub-int/2addr v10, v4

    :cond_1
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/View;->getOverScrollMode()I

    move-result v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v9, v10}, Landroidx/recyclerview/widget/RecyclerView;->w(II)V

    :cond_2
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v4, Landroidx/recyclerview/widget/RecyclerView;->m:Landroidx/recyclerview/widget/RecyclerView$h;

    if-eqz v6, :cond_6

    iget-object v6, v4, Landroidx/recyclerview/widget/RecyclerView;->v0:[I

    aput v2, v6, v2

    aput v2, v6, v3

    invoke-virtual {v4, v9, v10, v6}, Landroidx/recyclerview/widget/RecyclerView;->s1(II[I)V

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v4, Landroidx/recyclerview/widget/RecyclerView;->v0:[I

    aget v7, v6, v2

    aget v6, v6, v3

    sub-int/2addr v9, v7

    sub-int/2addr v10, v6

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->n:Landroidx/recyclerview/widget/RecyclerView$q;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView$q;->g:Landroidx/recyclerview/widget/RecyclerView$a0;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$a0;->g()Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$a0;->h()Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView;->j0:Landroidx/recyclerview/widget/RecyclerView$b0;

    invoke-virtual {v8}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result v8

    if-nez v8, :cond_3

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$a0;->r()V

    goto :goto_0

    :cond_3
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$a0;->f()I

    move-result v11

    if-lt v11, v8, :cond_4

    sub-int/2addr v8, v3

    invoke-virtual {v4, v8}, Landroidx/recyclerview/widget/RecyclerView$a0;->p(I)V

    invoke-virtual {v4, v7, v6}, Landroidx/recyclerview/widget/RecyclerView$a0;->j(II)V

    goto :goto_0

    :cond_4
    invoke-virtual {v4, v7, v6}, Landroidx/recyclerview/widget/RecyclerView$a0;->j(II)V

    :cond_5
    :goto_0
    move v13, v6

    move v12, v7

    :goto_1
    move v14, v9

    move v15, v10

    goto :goto_2

    :cond_6
    move v12, v2

    move v13, v12

    goto :goto_1

    :goto_2
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->q:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    :cond_7
    iget-object v11, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v11, Landroidx/recyclerview/widget/RecyclerView;->v0:[I

    aput v2, v4, v2

    aput v2, v4, v3

    const/16 v16, 0x0

    const/16 v17, 0x1

    move-object/from16 v18, v4

    invoke-virtual/range {v11 .. v18}, Landroidx/recyclerview/widget/RecyclerView;->M(IIII[II[I)V

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v4, Landroidx/recyclerview/widget/RecyclerView;->v0:[I

    aget v7, v6, v2

    sub-int/2addr v14, v7

    aget v6, v6, v3

    sub-int/2addr v15, v6

    if-nez v12, :cond_8

    if-eqz v13, :cond_9

    :cond_8
    invoke-virtual {v4, v12, v13}, Landroidx/recyclerview/widget/RecyclerView;->O(II)V

    :cond_9
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->e(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result v4

    if-nez v4, :cond_a

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    :cond_a
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v4

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v6

    if-ne v4, v6, :cond_b

    move v4, v3

    goto :goto_3

    :cond_b
    move v4, v2

    :goto_3
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v6

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v7

    if-ne v6, v7, :cond_c

    move v6, v3

    goto :goto_4

    :cond_c
    move v6, v2

    :goto_4
    invoke-virtual {v1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v7

    if-nez v7, :cond_f

    if-nez v4, :cond_d

    if-eqz v14, :cond_e

    :cond_d
    if-nez v6, :cond_f

    if-eqz v15, :cond_e

    goto :goto_5

    :cond_e
    move v4, v2

    goto :goto_6

    :cond_f
    :goto_5
    move v4, v3

    :goto_6
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->n:Landroidx/recyclerview/widget/RecyclerView$q;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView$q;->g:Landroidx/recyclerview/widget/RecyclerView$a0;

    if-eqz v6, :cond_10

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$a0;->g()Z

    move-result v6

    if-eqz v6, :cond_10

    goto :goto_9

    :cond_10
    if-eqz v4, :cond_16

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/View;->getOverScrollMode()I

    move-result v4

    if-eq v4, v5, :cond_15

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v4

    float-to-int v4, v4

    if-gez v14, :cond_11

    neg-int v5, v4

    goto :goto_7

    :cond_11
    if-lez v14, :cond_12

    move v5, v4

    goto :goto_7

    :cond_12
    move v5, v2

    :goto_7
    if-gez v15, :cond_13

    neg-int v4, v4

    goto :goto_8

    :cond_13
    if-lez v15, :cond_14

    goto :goto_8

    :cond_14
    move v4, v2

    :goto_8
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->b(II)V

    :cond_15
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->L0:Z

    if-eqz v4, :cond_17

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroidx/recyclerview/widget/j$b;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/j$b;->b()V

    goto :goto_a

    :cond_16
    :goto_9
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$e0;->d()V

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->h0:Landroidx/recyclerview/widget/j;

    if-eqz v5, :cond_17

    invoke-virtual {v5, v4, v12, v13}, Landroidx/recyclerview/widget/j;->f(Landroidx/recyclerview/widget/RecyclerView;II)V

    :cond_17
    :goto_a
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x23

    if-lt v4, v5, :cond_18

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v4, v1}, Landroidx/recyclerview/widget/RecyclerView$k;->a(Landroid/view/View;F)V

    :cond_18
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->n:Landroidx/recyclerview/widget/RecyclerView$q;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$q;->g:Landroidx/recyclerview/widget/RecyclerView$a0;

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$a0;->g()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-virtual {v1, v2, v2}, Landroidx/recyclerview/widget/RecyclerView$a0;->j(II)V

    :cond_19
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->e:Z

    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->f:Z

    if-eqz v1, :cond_1a

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$e0;->c()V

    return-void

    :cond_1a
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$e0;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->I1(I)V

    return-void
.end method
