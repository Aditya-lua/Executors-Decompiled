.class public Lf2/j;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/j$b;,
        Lf2/j$d;,
        Lf2/j$c;
    }
.end annotation


# static fields
.field public static v0:Z


# instance fields
.field public A:Landroid/view/animation/Interpolator;

.field public B:F

.field public C:I

.field public D:I

.field public E:I

.field public F:Z

.field public G:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Lf2/g;",
            ">;"
        }
    .end annotation
.end field

.field public H:J

.field public I:F

.field public J:F

.field public K:F

.field public L:J

.field public M:F

.field public N:Z

.field public O:Z

.field public P:Lf2/j$c;

.field public Q:I

.field public R:Z

.field public S:Lf2/b;

.field public T:Z

.field public U:F

.field public V:F

.field public W:J

.field public a0:F

.field public b0:Z

.field public c0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lf2/h;",
            ">;"
        }
    .end annotation
.end field

.field public d0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lf2/h;",
            ">;"
        }
    .end annotation
.end field

.field public e0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lf2/h;",
            ">;"
        }
    .end annotation
.end field

.field public f0:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lf2/j$c;",
            ">;"
        }
    .end annotation
.end field

.field public g0:I

.field public h0:F

.field public i0:Z

.field public j0:Z

.field public k0:F

.field public l0:Z

.field public m0:Lf2/j$b;

.field public n0:Ljava/lang/Runnable;

.field public o0:[I

.field public p0:I

.field public q0:I

.field public r0:Z

.field public s0:Lf2/j$d;

.field public t0:Z

.field public u0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public z:Landroid/view/animation/Interpolator;


# direct methods
.method public static synthetic D(Lf2/j;)Lf2/j$b;
    .locals 0

    iget-object p0, p0, Lf2/j;->m0:Lf2/j$b;

    return-object p0
.end method

.method public static synthetic E(Lf2/j;)I
    .locals 0

    iget p0, p0, Lf2/j;->E:I

    return p0
.end method

.method public static synthetic F(Lf2/j;)I
    .locals 0

    iget p0, p0, Lf2/j;->C:I

    return p0
.end method


# virtual methods
.method public G(F)V
    .locals 0

    return-void
.end method

.method public H(Z)V
    .locals 22

    move-object/from16 v0, p0

    iget-wide v1, v0, Lf2/j;->L:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lf2/j;->getNanoTime()J

    move-result-wide v1

    iput-wide v1, v0, Lf2/j;->L:J

    :cond_0
    iget v1, v0, Lf2/j;->K:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    const/4 v4, -0x1

    const/high16 v5, 0x3f800000    # 1.0f

    if-lez v3, :cond_1

    cmpg-float v3, v1, v5

    if-gez v3, :cond_1

    iput v4, v0, Lf2/j;->D:I

    :cond_1
    iget-boolean v3, v0, Lf2/j;->b0:Z

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v3, :cond_2

    iget-boolean v3, v0, Lf2/j;->O:Z

    if-eqz v3, :cond_28

    if-nez p1, :cond_2

    iget v3, v0, Lf2/j;->M:F

    cmpl-float v3, v3, v1

    if-eqz v3, :cond_28

    :cond_2
    iget v3, v0, Lf2/j;->M:F

    sub-float/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v1

    invoke-virtual {v0}, Lf2/j;->getNanoTime()J

    move-result-wide v8

    iget-object v3, v0, Lf2/j;->z:Landroid/view/animation/Interpolator;

    instance-of v10, v3, Lf2/i;

    const v11, 0x3089705f    # 1.0E-9f

    if-nez v10, :cond_3

    iget-wide v12, v0, Lf2/j;->L:J

    sub-long v12, v8, v12

    long-to-float v10, v12

    mul-float/2addr v10, v1

    mul-float/2addr v10, v11

    iget v12, v0, Lf2/j;->I:F

    div-float/2addr v10, v12

    goto :goto_0

    :cond_3
    move v10, v2

    :goto_0
    iget v12, v0, Lf2/j;->K:F

    add-float/2addr v12, v10

    iget-boolean v13, v0, Lf2/j;->N:Z

    if-eqz v13, :cond_4

    iget v12, v0, Lf2/j;->M:F

    :cond_4
    cmpl-float v13, v1, v2

    if-lez v13, :cond_5

    iget v14, v0, Lf2/j;->M:F

    cmpl-float v14, v12, v14

    if-gez v14, :cond_6

    :cond_5
    cmpg-float v14, v1, v2

    if-gtz v14, :cond_7

    iget v14, v0, Lf2/j;->M:F

    cmpg-float v14, v12, v14

    if-gtz v14, :cond_7

    :cond_6
    iget v12, v0, Lf2/j;->M:F

    iput-boolean v7, v0, Lf2/j;->O:Z

    move v14, v6

    goto :goto_1

    :cond_7
    move v14, v7

    :goto_1
    iput v12, v0, Lf2/j;->K:F

    iput v12, v0, Lf2/j;->J:F

    iput-wide v8, v0, Lf2/j;->L:J

    const/4 v15, 0x0

    if-eqz v3, :cond_d

    if-nez v14, :cond_d

    iget-boolean v14, v0, Lf2/j;->R:Z

    if-eqz v14, :cond_a

    move/from16 p1, v11

    iget-wide v11, v0, Lf2/j;->H:J

    sub-long v10, v8, v11

    long-to-float v10, v10

    mul-float v10, v10, p1

    invoke-interface {v3, v10}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v3

    iget-object v10, v0, Lf2/j;->z:Landroid/view/animation/Interpolator;

    if-eqz v10, :cond_9

    iput v3, v0, Lf2/j;->K:F

    iput-wide v8, v0, Lf2/j;->L:J

    instance-of v8, v10, Lf2/i;

    if-eqz v8, :cond_c

    check-cast v10, Lf2/i;

    invoke-virtual {v10}, Lf2/i;->a()F

    move-result v8

    iput v8, v0, Lf2/j;->B:F

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    cmpl-float v9, v8, v2

    if-lez v9, :cond_8

    cmpl-float v9, v3, v5

    if-ltz v9, :cond_8

    iput v5, v0, Lf2/j;->K:F

    iput-boolean v7, v0, Lf2/j;->O:Z

    move v3, v5

    :cond_8
    cmpg-float v8, v8, v2

    if-gez v8, :cond_c

    cmpg-float v8, v3, v2

    if-gtz v8, :cond_c

    iput v2, v0, Lf2/j;->K:F

    iput-boolean v7, v0, Lf2/j;->O:Z

    move v12, v2

    goto :goto_3

    :cond_9
    throw v15

    :cond_a
    invoke-interface {v3, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v3

    iget-object v8, v0, Lf2/j;->z:Landroid/view/animation/Interpolator;

    instance-of v9, v8, Lf2/i;

    if-eqz v9, :cond_b

    check-cast v8, Lf2/i;

    invoke-virtual {v8}, Lf2/i;->a()F

    move-result v8

    iput v8, v0, Lf2/j;->B:F

    goto :goto_2

    :cond_b
    add-float/2addr v12, v10

    invoke-interface {v8, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v8

    sub-float/2addr v8, v3

    mul-float/2addr v8, v1

    div-float/2addr v8, v10

    iput v8, v0, Lf2/j;->B:F

    :cond_c
    :goto_2
    move v12, v3

    goto :goto_3

    :cond_d
    iput v10, v0, Lf2/j;->B:F

    :goto_3
    iget v3, v0, Lf2/j;->B:F

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const v8, 0x3727c5ac    # 1.0E-5f

    cmpl-float v3, v3, v8

    if-lez v3, :cond_e

    sget-object v3, Lf2/j$d;->c:Lf2/j$d;

    invoke-virtual {v0, v3}, Lf2/j;->setState(Lf2/j$d;)V

    :cond_e
    if-lez v13, :cond_f

    iget v3, v0, Lf2/j;->M:F

    cmpl-float v3, v12, v3

    if-gez v3, :cond_10

    :cond_f
    cmpg-float v3, v1, v2

    if-gtz v3, :cond_11

    iget v3, v0, Lf2/j;->M:F

    cmpg-float v3, v12, v3

    if-gtz v3, :cond_11

    :cond_10
    iget v12, v0, Lf2/j;->M:F

    iput-boolean v7, v0, Lf2/j;->O:Z

    :cond_11
    cmpl-float v3, v12, v5

    if-gez v3, :cond_12

    cmpg-float v3, v12, v2

    if-gtz v3, :cond_13

    :cond_12
    iput-boolean v7, v0, Lf2/j;->O:Z

    sget-object v3, Lf2/j$d;->d:Lf2/j$d;

    invoke-virtual {v0, v3}, Lf2/j;->setState(Lf2/j$d;)V

    :cond_13
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    iput-boolean v7, v0, Lf2/j;->b0:Z

    invoke-virtual {v0}, Lf2/j;->getNanoTime()J

    move-result-wide v19

    iput v12, v0, Lf2/j;->k0:F

    iget-object v8, v0, Lf2/j;->A:Landroid/view/animation/Interpolator;

    if-nez v8, :cond_14

    move/from16 v18, v12

    goto :goto_4

    :cond_14
    invoke-interface {v8, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v8

    move/from16 v18, v8

    :goto_4
    iget-object v8, v0, Lf2/j;->A:Landroid/view/animation/Interpolator;

    if-eqz v8, :cond_15

    iget v9, v0, Lf2/j;->I:F

    div-float v9, v1, v9

    add-float/2addr v9, v12

    invoke-interface {v8, v9}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v8

    iput v8, v0, Lf2/j;->B:F

    iget-object v9, v0, Lf2/j;->A:Landroid/view/animation/Interpolator;

    invoke-interface {v9, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v9

    sub-float/2addr v8, v9

    iput v8, v0, Lf2/j;->B:F

    :cond_15
    move v8, v7

    :goto_5
    if-ge v8, v3, :cond_17

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    iget-object v10, v0, Lf2/j;->G:Ljava/util/HashMap;

    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v16, v10

    check-cast v16, Lf2/g;

    if-eqz v16, :cond_16

    iget-boolean v10, v0, Lf2/j;->b0:Z

    const/16 v21, 0x0

    move-object/from16 v17, v9

    invoke-virtual/range {v16 .. v21}, Lf2/g;->c(Landroid/view/View;FJLa2/c;)Z

    move-result v9

    or-int/2addr v9, v10

    iput-boolean v9, v0, Lf2/j;->b0:Z

    :cond_16
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_17
    if-lez v13, :cond_18

    iget v3, v0, Lf2/j;->M:F

    cmpl-float v3, v12, v3

    if-gez v3, :cond_19

    :cond_18
    cmpg-float v3, v1, v2

    if-gtz v3, :cond_1a

    iget v3, v0, Lf2/j;->M:F

    cmpg-float v3, v12, v3

    if-gtz v3, :cond_1a

    :cond_19
    move v3, v6

    goto :goto_6

    :cond_1a
    move v3, v7

    :goto_6
    iget-boolean v8, v0, Lf2/j;->b0:Z

    if-nez v8, :cond_1b

    iget-boolean v8, v0, Lf2/j;->O:Z

    if-nez v8, :cond_1b

    if-eqz v3, :cond_1b

    sget-object v8, Lf2/j$d;->d:Lf2/j$d;

    invoke-virtual {v0, v8}, Lf2/j;->setState(Lf2/j$d;)V

    :cond_1b
    iget-boolean v8, v0, Lf2/j;->j0:Z

    if-eqz v8, :cond_1c

    invoke-virtual {v0}, Lf2/j;->requestLayout()V

    :cond_1c
    iget-boolean v8, v0, Lf2/j;->b0:Z

    xor-int/2addr v3, v6

    or-int/2addr v3, v8

    iput-boolean v3, v0, Lf2/j;->b0:Z

    cmpg-float v8, v12, v2

    if-gtz v8, :cond_1e

    iget v8, v0, Lf2/j;->C:I

    if-eq v8, v4, :cond_1e

    iget v4, v0, Lf2/j;->D:I

    if-ne v4, v8, :cond_1d

    goto :goto_7

    :cond_1d
    iput v8, v0, Lf2/j;->D:I

    throw v15

    :cond_1e
    :goto_7
    float-to-double v8, v12

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v8, v10

    if-ltz v4, :cond_20

    iget v4, v0, Lf2/j;->D:I

    iget v8, v0, Lf2/j;->E:I

    if-ne v4, v8, :cond_1f

    goto :goto_8

    :cond_1f
    iput v8, v0, Lf2/j;->D:I

    throw v15

    :cond_20
    :goto_8
    if-nez v3, :cond_24

    iget-boolean v3, v0, Lf2/j;->O:Z

    if-eqz v3, :cond_21

    goto :goto_9

    :cond_21
    if-lez v13, :cond_22

    cmpl-float v3, v12, v5

    if-eqz v3, :cond_23

    :cond_22
    cmpg-float v3, v1, v2

    if-gez v3, :cond_25

    cmpl-float v3, v12, v2

    if-nez v3, :cond_25

    :cond_23
    sget-object v3, Lf2/j$d;->d:Lf2/j$d;

    invoke-virtual {v0, v3}, Lf2/j;->setState(Lf2/j$d;)V

    goto :goto_a

    :cond_24
    :goto_9
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_25
    :goto_a
    iget-boolean v3, v0, Lf2/j;->b0:Z

    if-nez v3, :cond_28

    iget-boolean v3, v0, Lf2/j;->O:Z

    if-nez v3, :cond_28

    if-lez v13, :cond_26

    cmpl-float v3, v12, v5

    if-eqz v3, :cond_27

    :cond_26
    cmpg-float v1, v1, v2

    if-gez v1, :cond_28

    cmpl-float v1, v12, v2

    if-nez v1, :cond_28

    :cond_27
    invoke-virtual {v0}, Lf2/j;->L()V

    :cond_28
    iget v1, v0, Lf2/j;->K:F

    cmpl-float v3, v1, v5

    if-ltz v3, :cond_2a

    iget v1, v0, Lf2/j;->D:I

    iget v2, v0, Lf2/j;->E:I

    if-eq v1, v2, :cond_29

    goto :goto_b

    :cond_29
    move v6, v7

    :goto_b
    iput v2, v0, Lf2/j;->D:I

    :goto_c
    move v7, v6

    goto :goto_e

    :cond_2a
    cmpg-float v1, v1, v2

    if-gtz v1, :cond_2c

    iget v1, v0, Lf2/j;->D:I

    iget v2, v0, Lf2/j;->C:I

    if-eq v1, v2, :cond_2b

    goto :goto_d

    :cond_2b
    move v6, v7

    :goto_d
    iput v2, v0, Lf2/j;->D:I

    goto :goto_c

    :cond_2c
    :goto_e
    iget-boolean v1, v0, Lf2/j;->t0:Z

    or-int/2addr v1, v7

    iput-boolean v1, v0, Lf2/j;->t0:Z

    if-eqz v7, :cond_2d

    iget-boolean v1, v0, Lf2/j;->l0:Z

    if-nez v1, :cond_2d

    invoke-virtual {v0}, Lf2/j;->requestLayout()V

    :cond_2d
    iget v1, v0, Lf2/j;->K:F

    iput v1, v0, Lf2/j;->J:F

    return-void
.end method

.method public final I()V
    .locals 6

    iget-object v0, p0, Lf2/j;->P:Lf2/j$c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf2/j;->f0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_0
    iget v0, p0, Lf2/j;->h0:F

    iget v1, p0, Lf2/j;->J:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    iget v0, p0, Lf2/j;->g0:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    invoke-virtual {p0}, Lf2/j;->K()V

    iput-boolean v1, p0, Lf2/j;->i0:Z

    :cond_1
    iput v2, p0, Lf2/j;->g0:I

    iget v0, p0, Lf2/j;->J:F

    iput v0, p0, Lf2/j;->h0:F

    iget-object v2, p0, Lf2/j;->P:Lf2/j$c;

    if-eqz v2, :cond_2

    iget v3, p0, Lf2/j;->C:I

    iget v4, p0, Lf2/j;->E:I

    invoke-interface {v2, p0, v3, v4, v0}, Lf2/j$c;->c(Lf2/j;IIF)V

    :cond_2
    iget-object v0, p0, Lf2/j;->f0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/j$c;

    iget v3, p0, Lf2/j;->C:I

    iget v4, p0, Lf2/j;->E:I

    iget v5, p0, Lf2/j;->J:F

    invoke-interface {v2, p0, v3, v4, v5}, Lf2/j$c;->c(Lf2/j;IIF)V

    goto :goto_0

    :cond_3
    iput-boolean v1, p0, Lf2/j;->i0:Z

    :cond_4
    return-void
.end method

.method public J()V
    .locals 4

    iget-object v0, p0, Lf2/j;->P:Lf2/j$c;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lf2/j;->f0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget v0, p0, Lf2/j;->g0:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    iget v0, p0, Lf2/j;->D:I

    iput v0, p0, Lf2/j;->g0:I

    iget-object v0, p0, Lf2/j;->u0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf2/j;->u0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v3, p0, Lf2/j;->D:I

    if-eq v0, v3, :cond_2

    if-eq v3, v2, :cond_2

    iget-object v0, p0, Lf2/j;->u0:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0}, Lf2/j;->M()V

    iget-object v0, p0, Lf2/j;->n0:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x0

    iput-object v0, p0, Lf2/j;->n0:Ljava/lang/Runnable;

    :cond_3
    iget-object v0, p0, Lf2/j;->o0:[I

    if-eqz v0, :cond_4

    iget v2, p0, Lf2/j;->p0:I

    if-lez v2, :cond_4

    const/4 v2, 0x0

    aget v0, v0, v2

    invoke-virtual {p0, v0}, Lf2/j;->R(I)V

    iget-object v0, p0, Lf2/j;->o0:[I

    array-length v3, v0

    sub-int/2addr v3, v1

    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lf2/j;->p0:I

    sub-int/2addr v0, v1

    iput v0, p0, Lf2/j;->p0:I

    :cond_4
    return-void
.end method

.method public final K()V
    .locals 4

    iget-object v0, p0, Lf2/j;->P:Lf2/j$c;

    if-eqz v0, :cond_0

    iget v1, p0, Lf2/j;->C:I

    iget v2, p0, Lf2/j;->E:I

    invoke-interface {v0, p0, v1, v2}, Lf2/j$c;->a(Lf2/j;II)V

    :cond_0
    iget-object v0, p0, Lf2/j;->f0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/j$c;

    iget v2, p0, Lf2/j;->C:I

    iget v3, p0, Lf2/j;->E:I

    invoke-interface {v1, p0, v2, v3}, Lf2/j$c;->a(Lf2/j;II)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public L()V
    .locals 0

    return-void
.end method

.method public final M()V
    .locals 7

    iget-object v0, p0, Lf2/j;->P:Lf2/j$c;

    if-nez v0, :cond_1

    iget-object v0, p0, Lf2/j;->f0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lf2/j;->i0:Z

    iget-object v1, p0, Lf2/j;->u0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    :cond_2
    if-ge v0, v2, :cond_4

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v0, v0, 0x1

    check-cast v3, Ljava/lang/Integer;

    iget-object v4, p0, Lf2/j;->P:Lf2/j$c;

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-interface {v4, p0, v5}, Lf2/j$c;->b(Lf2/j;I)V

    :cond_3
    iget-object v4, p0, Lf2/j;->f0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf2/j$c;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-interface {v5, p0, v6}, Lf2/j$c;->b(Lf2/j;I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lf2/j;->u0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public N(FF)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    if-nez v0, :cond_0

    new-instance v0, Lf2/j$b;

    invoke-direct {v0, p0}, Lf2/j$b;-><init>(Lf2/j;)V

    iput-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    :cond_0
    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {v0, p1}, Lf2/j$b;->e(F)V

    iget-object p1, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {p1, p2}, Lf2/j$b;->h(F)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lf2/j;->setProgress(F)V

    sget-object v0, Lf2/j$d;->c:Lf2/j$d;

    invoke-virtual {p0, v0}, Lf2/j;->setState(Lf2/j$d;)V

    iput p2, p0, Lf2/j;->B:F

    const/4 v0, 0x0

    cmpl-float p2, p2, v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p2, :cond_3

    if-lez p2, :cond_2

    move v0, v1

    :cond_2
    invoke-virtual {p0, v0}, Lf2/j;->G(F)V

    return-void

    :cond_3
    cmpl-float p2, p1, v0

    if-eqz p2, :cond_5

    cmpl-float p2, p1, v1

    if-eqz p2, :cond_5

    const/high16 p2, 0x3f000000    # 0.5f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_4

    move v0, v1

    :cond_4
    invoke-virtual {p0, v0}, Lf2/j;->G(F)V

    :cond_5
    return-void
.end method

.method public O(III)V
    .locals 1

    sget-object v0, Lf2/j$d;->b:Lf2/j$d;

    invoke-virtual {p0, v0}, Lf2/j;->setState(Lf2/j$d;)V

    iput p1, p0, Lf2/j;->D:I

    const/4 v0, -0x1

    iput v0, p0, Lf2/j;->C:I

    iput v0, p0, Lf2/j;->E:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lg2/a;

    if-eqz v0, :cond_0

    int-to-float p2, p2

    int-to-float p3, p3

    invoke-virtual {v0, p1, p2, p3}, Lg2/a;->d(IFF)V

    :cond_0
    return-void
.end method

.method public P(II)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    if-nez v0, :cond_0

    new-instance v0, Lf2/j$b;

    invoke-direct {v0, p0}, Lf2/j$b;-><init>(Lf2/j;)V

    iput-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    :cond_0
    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {v0, p1}, Lf2/j$b;->f(I)V

    iget-object p1, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {p1, p2}, Lf2/j$b;->d(I)V

    :cond_1
    return-void
.end method

.method public Q()V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lf2/j;->G(F)V

    const/4 v0, 0x0

    iput-object v0, p0, Lf2/j;->n0:Ljava/lang/Runnable;

    return-void
.end method

.method public R(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    if-nez v0, :cond_0

    new-instance v0, Lf2/j$b;

    invoke-direct {v0, p0}, Lf2/j$b;-><init>(Lf2/j;)V

    iput-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    :cond_0
    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {v0, p1}, Lf2/j$b;->d(I)V

    return-void

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0, v0}, Lf2/j;->S(III)V

    return-void
.end method

.method public S(III)V
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lf2/j;->T(IIII)V

    return-void
.end method

.method public T(IIII)V
    .locals 3

    iget p2, p0, Lf2/j;->D:I

    if-ne p2, p1, :cond_0

    goto :goto_0

    :cond_0
    iget p3, p0, Lf2/j;->C:I

    const/high16 v0, 0x447a0000    # 1000.0f

    const/4 v1, 0x0

    if-ne p3, p1, :cond_1

    invoke-virtual {p0, v1}, Lf2/j;->G(F)V

    if-lez p4, :cond_3

    int-to-float p1, p4

    div-float/2addr p1, v0

    iput p1, p0, Lf2/j;->I:F

    return-void

    :cond_1
    iget p3, p0, Lf2/j;->E:I

    const/high16 v2, 0x3f800000    # 1.0f

    if-ne p3, p1, :cond_2

    invoke-virtual {p0, v2}, Lf2/j;->G(F)V

    if-lez p4, :cond_3

    int-to-float p1, p4

    div-float/2addr p1, v0

    iput p1, p0, Lf2/j;->I:F

    return-void

    :cond_2
    iput p1, p0, Lf2/j;->E:I

    const/4 p3, -0x1

    if-eq p2, p3, :cond_4

    invoke-virtual {p0, p2, p1}, Lf2/j;->P(II)V

    invoke-virtual {p0, v2}, Lf2/j;->G(F)V

    iput v1, p0, Lf2/j;->K:F

    invoke-virtual {p0}, Lf2/j;->Q()V

    if-lez p4, :cond_3

    int-to-float p1, p4

    div-float/2addr p1, v0

    iput p1, p0, Lf2/j;->I:F

    :cond_3
    :goto_0
    return-void

    :cond_4
    const/4 p1, 0x0

    iput-boolean p1, p0, Lf2/j;->R:Z

    iput v2, p0, Lf2/j;->M:F

    iput v1, p0, Lf2/j;->J:F

    iput v1, p0, Lf2/j;->K:F

    invoke-virtual {p0}, Lf2/j;->getNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lf2/j;->L:J

    invoke-virtual {p0}, Lf2/j;->getNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lf2/j;->H:J

    iput-boolean p1, p0, Lf2/j;->N:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lf2/j;->z:Landroid/view/animation/Interpolator;

    if-ne p4, p3, :cond_5

    throw p1

    :cond_5
    iput p3, p0, Lf2/j;->C:I

    throw p1
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 5

    iget-object v0, p0, Lf2/j;->e0:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lf2/h;

    invoke-virtual {v4, p1}, Lf2/h;->w(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lf2/j;->H(Z)V

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public getConstraintSetIds()[I
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCurrentState()I
    .locals 1

    iget v0, p0, Lf2/j;->D:I

    return v0
.end method

.method public getDefinedTransitions()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lf2/l$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDesignTool()Lf2/b;
    .locals 1

    iget-object v0, p0, Lf2/j;->S:Lf2/b;

    if-nez v0, :cond_0

    new-instance v0, Lf2/b;

    invoke-direct {v0, p0}, Lf2/b;-><init>(Lf2/j;)V

    iput-object v0, p0, Lf2/j;->S:Lf2/b;

    :cond_0
    iget-object v0, p0, Lf2/j;->S:Lf2/b;

    return-object v0
.end method

.method public getEndState()I
    .locals 1

    iget v0, p0, Lf2/j;->E:I

    return v0
.end method

.method public getNanoTime()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getProgress()F
    .locals 1

    iget v0, p0, Lf2/j;->K:F

    return v0
.end method

.method public getScene()Lf2/l;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getStartState()I
    .locals 1

    iget v0, p0, Lf2/j;->C:I

    return v0
.end method

.method public getTargetPosition()F
    .locals 1

    iget v0, p0, Lf2/j;->M:F

    return v0
.end method

.method public getTransitionState()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    if-nez v0, :cond_0

    new-instance v0, Lf2/j$b;

    invoke-direct {v0, p0}, Lf2/j$b;-><init>(Lf2/j;)V

    iput-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    :cond_0
    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {v0}, Lf2/j$b;->c()V

    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {v0}, Lf2/j$b;->b()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getTransitionTimeMs()J
    .locals 2

    iget v0, p0, Lf2/j;->I:F

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    return-wide v0
.end method

.method public getVelocity()F
    .locals 1

    iget v0, p0, Lf2/j;->B:F

    return v0
.end method

.method public i(Landroid/view/View;Landroid/view/View;II)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lf2/j;->getNanoTime()J

    move-result-wide p1

    iput-wide p1, p0, Lf2/j;->W:J

    const/4 p1, 0x0

    iput p1, p0, Lf2/j;->a0:F

    iput p1, p0, Lf2/j;->U:F

    iput p1, p0, Lf2/j;->V:F

    return-void
.end method

.method public j(Landroid/view/View;I)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public k(Landroid/view/View;II[II)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public m(Landroid/view/View;IIIII[I)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean p1, p0, Lf2/j;->T:Z

    const/4 p6, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    aget p1, p7, p6

    add-int/2addr p1, p4

    aput p1, p7, p6

    const/4 p1, 0x1

    aget p2, p7, p1

    add-int/2addr p2, p5

    aput p2, p7, p1

    :cond_1
    iput-boolean p6, p0, Lf2/j;->T:Z

    return-void
.end method

.method public n(Landroid/view/View;IIIII)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public o(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iput v0, p0, Lf2/j;->q0:I

    :cond_0
    invoke-virtual {p0}, Lf2/j;->L()V

    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lf2/j;->r0:Z

    if-eqz v1, :cond_1

    new-instance v0, Lf2/j$a;

    invoke-direct {v0, p0}, Lf2/j$a;-><init>(Lf2/j;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    invoke-virtual {v0}, Lf2/j$b;->a()V

    :cond_2
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onLayout(ZIIII)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf2/j;->l0:Z

    const/4 v1, 0x0

    :try_start_0
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p1, p0

    iput-boolean v1, p1, Lf2/j;->l0:Z

    return-void

    :catchall_0
    move-exception v0

    move-object p1, p0

    move-object p2, v0

    iput-boolean v1, p1, Lf2/j;->l0:Z

    throw p2
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 0

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    instance-of v0, p1, Lf2/h;

    if-eqz v0, :cond_6

    check-cast p1, Lf2/h;

    iget-object v0, p0, Lf2/j;->f0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lf2/j;->f0:Ljava/util/concurrent/CopyOnWriteArrayList;

    :cond_0
    iget-object v0, p0, Lf2/j;->f0:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lf2/h;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf2/j;->c0:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf2/j;->c0:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, Lf2/j;->c0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p1}, Lf2/h;->u()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lf2/j;->d0:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf2/j;->d0:Ljava/util/ArrayList;

    :cond_3
    iget-object v0, p0, Lf2/j;->d0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {p1}, Lf2/h;->t()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lf2/j;->e0:Ljava/util/ArrayList;

    if-nez v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf2/j;->e0:Ljava/util/ArrayList;

    :cond_5
    iget-object v0, p0, Lf2/j;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    iget-object v0, p0, Lf2/j;->c0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lf2/j;->d0:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public requestLayout()V
    .locals 0

    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setDebugMode(I)V
    .locals 0

    iput p1, p0, Lf2/j;->Q:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setDelayedApplicationOfInitialState(Z)V
    .locals 0

    iput-boolean p1, p0, Lf2/j;->r0:Z

    return-void
.end method

.method public setInteractionEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lf2/j;->F:Z

    return-void
.end method

.method public setInterpolatedProgress(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lf2/j;->setProgress(F)V

    return-void
.end method

.method public setOnHide(F)V
    .locals 3

    iget-object v0, p0, Lf2/j;->d0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lf2/j;->d0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/h;

    invoke-virtual {v2, p1}, Lf2/h;->setProgress(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setOnShow(F)V
    .locals 3

    iget-object v0, p0, Lf2/j;->c0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lf2/j;->c0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/h;

    invoke-virtual {v2, p1}, Lf2/h;->setProgress(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setProgress(F)V
    .locals 5

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    const/high16 v2, 0x3f800000    # 1.0f

    if-ltz v1, :cond_0

    cmpl-float v3, p1, v2

    if-lez v3, :cond_1

    :cond_0
    const-string v3, "MotionLayout"

    const-string v4, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    if-nez v0, :cond_2

    new-instance v0, Lf2/j$b;

    invoke-direct {v0, p0}, Lf2/j$b;-><init>(Lf2/j;)V

    iput-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    :cond_2
    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {v0, p1}, Lf2/j$b;->e(F)V

    return-void

    :cond_3
    if-gtz v1, :cond_5

    iget p1, p0, Lf2/j;->K:F

    cmpl-float p1, p1, v2

    if-nez p1, :cond_4

    iget p1, p0, Lf2/j;->D:I

    iget v1, p0, Lf2/j;->E:I

    if-ne p1, v1, :cond_4

    sget-object p1, Lf2/j$d;->c:Lf2/j$d;

    invoke-virtual {p0, p1}, Lf2/j;->setState(Lf2/j$d;)V

    :cond_4
    iget p1, p0, Lf2/j;->C:I

    iput p1, p0, Lf2/j;->D:I

    iget p1, p0, Lf2/j;->K:F

    cmpl-float p1, p1, v0

    if-nez p1, :cond_8

    sget-object p1, Lf2/j$d;->d:Lf2/j$d;

    invoke-virtual {p0, p1}, Lf2/j;->setState(Lf2/j$d;)V

    goto :goto_0

    :cond_5
    cmpl-float p1, p1, v2

    if-ltz p1, :cond_7

    iget p1, p0, Lf2/j;->K:F

    cmpl-float p1, p1, v0

    if-nez p1, :cond_6

    iget p1, p0, Lf2/j;->D:I

    iget v0, p0, Lf2/j;->C:I

    if-ne p1, v0, :cond_6

    sget-object p1, Lf2/j$d;->c:Lf2/j$d;

    invoke-virtual {p0, p1}, Lf2/j;->setState(Lf2/j$d;)V

    :cond_6
    iget p1, p0, Lf2/j;->E:I

    iput p1, p0, Lf2/j;->D:I

    iget p1, p0, Lf2/j;->K:F

    cmpl-float p1, p1, v2

    if-nez p1, :cond_8

    sget-object p1, Lf2/j$d;->d:Lf2/j$d;

    invoke-virtual {p0, p1}, Lf2/j;->setState(Lf2/j$d;)V

    goto :goto_0

    :cond_7
    const/4 p1, -0x1

    iput p1, p0, Lf2/j;->D:I

    sget-object p1, Lf2/j$d;->c:Lf2/j$d;

    invoke-virtual {p0, p1}, Lf2/j;->setState(Lf2/j$d;)V

    :cond_8
    :goto_0
    return-void
.end method

.method public setScene(Lf2/l;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->t()Z

    const/4 p1, 0x0

    throw p1
.end method

.method public setStartState(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    if-nez v0, :cond_0

    new-instance v0, Lf2/j$b;

    invoke-direct {v0, p0}, Lf2/j$b;-><init>(Lf2/j;)V

    iput-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    :cond_0
    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {v0, p1}, Lf2/j$b;->f(I)V

    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {v0, p1}, Lf2/j$b;->d(I)V

    return-void

    :cond_1
    iput p1, p0, Lf2/j;->D:I

    return-void
.end method

.method public setState(Lf2/j$d;)V
    .locals 4

    sget-object v0, Lf2/j$d;->d:Lf2/j$d;

    if-ne p1, v0, :cond_0

    iget v1, p0, Lf2/j;->D:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lf2/j;->s0:Lf2/j$d;

    iput-object p1, p0, Lf2/j;->s0:Lf2/j$d;

    sget-object v2, Lf2/j$d;->c:Lf2/j$d;

    if-ne v1, v2, :cond_1

    if-ne p1, v2, :cond_1

    invoke-virtual {p0}, Lf2/j;->I()V

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v3, 0x1

    if-eq v1, v3, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    goto :goto_0

    :cond_2
    if-ne p1, v0, :cond_5

    invoke-virtual {p0}, Lf2/j;->J()V

    return-void

    :cond_3
    if-ne p1, v2, :cond_4

    invoke-virtual {p0}, Lf2/j;->I()V

    :cond_4
    if-ne p1, v0, :cond_5

    invoke-virtual {p0}, Lf2/j;->J()V

    :cond_5
    :goto_0
    return-void
.end method

.method public setTransition(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTransition(Lf2/l$a;)V
    .locals 0

    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public setTransitionDuration(I)V
    .locals 1

    const-string p1, "MotionLayout"

    const-string v0, "MotionScene not defined"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public setTransitionListener(Lf2/j$c;)V
    .locals 0

    iput-object p1, p0, Lf2/j;->P:Lf2/j$c;

    return-void
.end method

.method public setTransitionState(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    if-nez v0, :cond_0

    new-instance v0, Lf2/j$b;

    invoke-direct {v0, p0}, Lf2/j$b;-><init>(Lf2/j;)V

    iput-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    :cond_0
    iget-object v0, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {v0, p1}, Lf2/j$b;->g(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lf2/j;->m0:Lf2/j$b;

    invoke-virtual {p1}, Lf2/j$b;->a()V

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lf2/j;->C:I

    invoke-static {v0, v2}, Lf2/a;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lf2/j;->E:I

    invoke-static {v0, v2}, Lf2/a;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (pos:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lf2/j;->K:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " Dpos/Dt:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lf2/j;->B:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v(I)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lg2/a;

    return-void
.end method
