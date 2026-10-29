.class public Lf2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Lf2/k;

.field public c:Lf2/k;

.field public d:Lf2/f;

.field public e:Lf2/f;

.field public f:[La2/a;

.field public g:La2/a;

.field public h:F

.field public i:F

.field public j:[I

.field public k:[D

.field public l:[D

.field public m:[Ljava/lang/String;

.field public n:[F

.field public o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lf2/k;",
            ">;"
        }
    .end annotation
.end field

.field public p:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Le2/d;",
            ">;"
        }
    .end annotation
.end field

.field public q:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Le2/c;",
            ">;"
        }
    .end annotation
.end field

.field public r:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Le2/b;",
            ">;"
        }
    .end annotation
.end field

.field public s:[Lf2/e;

.field public t:I

.field public u:Landroid/view/View;

.field public v:I

.field public w:F

.field public x:Landroid/view/animation/Interpolator;

.field public y:Z


# virtual methods
.method public final a(F[F)F
    .locals 12

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    aput v1, p2, v2

    goto :goto_0

    :cond_0
    iget v3, p0, Lf2/g;->i:F

    float-to-double v4, v3

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v4, v6

    if-eqz v4, :cond_2

    iget v4, p0, Lf2/g;->h:F

    cmpg-float v5, p1, v4

    if-gez v5, :cond_1

    move p1, v0

    :cond_1
    cmpl-float v5, p1, v4

    if-lez v5, :cond_2

    float-to-double v8, p1

    cmpg-double v5, v8, v6

    if-gez v5, :cond_2

    sub-float/2addr p1, v4

    mul-float/2addr p1, v3

    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    :cond_2
    :goto_0
    iget-object v3, p0, Lf2/g;->b:Lf2/k;

    iget-object v3, v3, Lf2/k;->a:La2/b;

    iget-object v4, p0, Lf2/g;->o:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/high16 v6, 0x7fc00000    # Float.NaN

    move v7, v2

    :cond_3
    :goto_1
    if-ge v7, v5, :cond_5

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    check-cast v8, Lf2/k;

    iget-object v9, v8, Lf2/k;->a:La2/b;

    if-eqz v9, :cond_3

    iget v10, v8, Lf2/k;->c:F

    cmpg-float v11, v10, p1

    if-gez v11, :cond_4

    move-object v3, v9

    move v0, v10

    goto :goto_1

    :cond_4
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-eqz v9, :cond_3

    iget v6, v8, Lf2/k;->c:F

    goto :goto_1

    :cond_5
    if-eqz v3, :cond_7

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    move v1, v6

    :goto_2
    sub-float/2addr p1, v0

    sub-float/2addr v1, v0

    div-float/2addr p1, v1

    float-to-double v4, p1

    invoke-virtual {v3, v4, v5}, La2/b;->a(D)D

    move-result-wide v6

    double-to-float p1, v6

    mul-float/2addr p1, v1

    add-float/2addr p1, v0

    if-eqz p2, :cond_7

    invoke-virtual {v3, v4, v5}, La2/b;->b(D)D

    move-result-wide v0

    double-to-float v0, v0

    aput v0, p2, v2

    :cond_7
    return p1
.end method

.method public b(D[F[F)V
    .locals 9

    const/4 v0, 0x4

    new-array v5, v0, [D

    new-array v7, v0, [D

    iget-object v0, p0, Lf2/g;->f:[La2/a;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2, v5}, La2/a;->a(D[D)V

    iget-object v0, p0, Lf2/g;->f:[La2/a;

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2, v7}, La2/a;->c(D[D)V

    const/4 v0, 0x0

    invoke-static {p4, v0}, Ljava/util/Arrays;->fill([FF)V

    iget-object v1, p0, Lf2/g;->b:Lf2/k;

    iget-object v4, p0, Lf2/g;->j:[I

    move-wide v2, p1

    move-object v6, p3

    move-object v8, p4

    invoke-virtual/range {v1 .. v8}, Lf2/k;->b(D[I[D[F[D[F)V

    return-void
.end method

.method public c(Landroid/view/View;FJLa2/c;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    const/4 v1, 0x0

    move/from16 v3, p2

    invoke-virtual {v0, v3, v1}, Lf2/g;->a(F[F)F

    move-result v1

    iget v3, v0, Lf2/g;->v:I

    sget v4, Lf2/d;->a:I

    const/4 v9, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    if-eq v3, v4, :cond_3

    int-to-float v3, v3

    div-float v3, v10, v3

    div-float v4, v1, v3

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float/2addr v4, v3

    rem-float/2addr v1, v3

    div-float/2addr v1, v3

    iget v5, v0, Lf2/g;->w:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_0

    iget v5, v0, Lf2/g;->w:F

    add-float/2addr v1, v5

    rem-float/2addr v1, v10

    :cond_0
    iget-object v5, v0, Lf2/g;->x:Landroid/view/animation/Interpolator;

    if-eqz v5, :cond_1

    invoke-interface {v5, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v1

    goto :goto_0

    :cond_1
    float-to-double v5, v1

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    cmpl-double v1, v5, v7

    if-lez v1, :cond_2

    move v1, v10

    goto :goto_0

    :cond_2
    move v1, v9

    :goto_0
    mul-float/2addr v1, v3

    add-float/2addr v1, v4

    :cond_3
    move v3, v1

    iget-object v1, v0, Lf2/g;->q:Ljava/util/HashMap;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le2/c;

    invoke-virtual {v4, v2, v3}, Le2/c;->a(Landroid/view/View;F)V

    goto :goto_1

    :cond_4
    iget-object v1, v0, Lf2/g;->p:Ljava/util/HashMap;

    const/4 v11, 0x0

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v8, v11

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le2/d;

    instance-of v4, v1, Le2/d$a;

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    invoke-virtual/range {v1 .. v6}, Le2/d;->a(Landroid/view/View;FJLa2/c;)Z

    move-result v1

    or-int/2addr v8, v1

    move-object/from16 v2, p1

    goto :goto_2

    :cond_6
    move v12, v8

    goto :goto_3

    :cond_7
    move v12, v11

    :goto_3
    iget-object v1, v0, Lf2/g;->f:[La2/a;

    const/4 v13, 0x1

    if-eqz v1, :cond_11

    aget-object v1, v1, v11

    float-to-double v14, v3

    iget-object v2, v0, Lf2/g;->k:[D

    invoke-virtual {v1, v14, v15, v2}, La2/a;->a(D[D)V

    iget-object v1, v0, Lf2/g;->f:[La2/a;

    aget-object v1, v1, v11

    iget-object v2, v0, Lf2/g;->l:[D

    invoke-virtual {v1, v14, v15, v2}, La2/a;->c(D[D)V

    iget-boolean v1, v0, Lf2/g;->y:Z

    if-nez v1, :cond_8

    iget-object v1, v0, Lf2/g;->b:Lf2/k;

    iget-object v4, v0, Lf2/g;->j:[I

    iget-object v5, v0, Lf2/g;->k:[D

    iget-object v6, v0, Lf2/g;->l:[D

    const/4 v7, 0x0

    iget-boolean v8, v0, Lf2/g;->a:Z

    move v2, v3

    move-object/from16 v3, p1

    invoke-virtual/range {v1 .. v8}, Lf2/k;->c(FLandroid/view/View;[I[D[D[DZ)V

    move-object/from16 v18, v3

    move v3, v2

    move-object/from16 v2, v18

    iput-boolean v11, v0, Lf2/g;->a:Z

    goto :goto_4

    :cond_8
    move-object/from16 v2, p1

    :goto_4
    iget v1, v0, Lf2/g;->t:I

    sget v4, Lf2/d;->a:I

    if-eq v1, v4, :cond_a

    iget-object v1, v0, Lf2/g;->u:Landroid/view/View;

    if-nez v1, :cond_9

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iget v4, v0, Lf2/g;->t:I

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Lf2/g;->u:Landroid/view/View;

    :cond_9
    iget-object v1, v0, Lf2/g;->u:Landroid/view/View;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    iget-object v4, v0, Lf2/g;->u:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v4

    add-int/2addr v1, v4

    int-to-float v1, v1

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v1, v4

    iget-object v5, v0, Lf2/g;->u:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v5

    iget-object v6, v0, Lf2/g;->u:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v6

    add-int/2addr v5, v6

    int-to-float v5, v5

    div-float/2addr v5, v4

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v6

    sub-int/2addr v4, v6

    if-lez v4, :cond_a

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v6

    sub-int/2addr v4, v6

    if-lez v4, :cond_a

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v5, v4

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v1, v4

    invoke-virtual {v2, v5}, Landroid/view/View;->setPivotX(F)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setPivotY(F)V

    :cond_a
    iget-object v1, v0, Lf2/g;->q:Ljava/util/HashMap;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_b
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La2/e;

    instance-of v4, v1, Le2/c$a;

    if-eqz v4, :cond_b

    iget-object v4, v0, Lf2/g;->l:[D

    array-length v5, v4

    if-le v5, v13, :cond_b

    check-cast v1, Le2/c$a;

    aget-wide v5, v4, v11

    aget-wide v16, v4, v13

    move-wide v4, v5

    move-wide/from16 v6, v16

    invoke-virtual/range {v1 .. v7}, Le2/c$a;->b(Landroid/view/View;FDD)V

    goto :goto_5

    :cond_c
    move v1, v13

    :goto_6
    iget-object v4, v0, Lf2/g;->f:[La2/a;

    array-length v5, v4

    if-ge v1, v5, :cond_d

    aget-object v4, v4, v1

    iget-object v5, v0, Lf2/g;->n:[F

    invoke-virtual {v4, v14, v15, v5}, La2/a;->b(D[F)V

    iget-object v4, v0, Lf2/g;->b:Lf2/k;

    iget-object v4, v4, Lf2/k;->o:Ljava/util/LinkedHashMap;

    iget-object v5, v0, Lf2/g;->m:[Ljava/lang/String;

    add-int/lit8 v6, v1, -0x1

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/a;

    iget-object v5, v0, Lf2/g;->n:[F

    invoke-static {v4, v2, v5}, Le2/a;->b(Landroidx/constraintlayout/widget/a;Landroid/view/View;[F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_d
    iget-object v1, v0, Lf2/g;->d:Lf2/f;

    iget v4, v1, Lf2/f;->a:I

    if-nez v4, :cond_10

    cmpg-float v4, v3, v9

    if-gtz v4, :cond_e

    iget v1, v1, Lf2/f;->b:I

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_7

    :cond_e
    cmpl-float v4, v3, v10

    if-ltz v4, :cond_f

    iget-object v1, v0, Lf2/g;->e:Lf2/f;

    iget v1, v1, Lf2/f;->b:I

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_7

    :cond_f
    iget-object v4, v0, Lf2/g;->e:Lf2/f;

    iget v4, v4, Lf2/f;->b:I

    iget v1, v1, Lf2/f;->b:I

    if-eq v4, v1, :cond_10

    invoke-virtual {v2, v11}, Landroid/view/View;->setVisibility(I)V

    :cond_10
    :goto_7
    iget-object v1, v0, Lf2/g;->s:[Lf2/e;

    if-eqz v1, :cond_14

    move v1, v11

    :goto_8
    iget-object v4, v0, Lf2/g;->s:[Lf2/e;

    array-length v5, v4

    if-ge v1, v5, :cond_14

    aget-object v4, v4, v1

    invoke-virtual {v4, v3, v2}, Lf2/e;->a(FLandroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_11
    move-object/from16 v2, p1

    iget-object v1, v0, Lf2/g;->b:Lf2/k;

    iget v4, v1, Lf2/k;->e:F

    iget-object v5, v0, Lf2/g;->c:Lf2/k;

    iget v6, v5, Lf2/k;->e:F

    sub-float/2addr v6, v4

    mul-float/2addr v6, v3

    add-float/2addr v4, v6

    iget v6, v1, Lf2/k;->f:F

    iget v7, v5, Lf2/k;->f:F

    sub-float/2addr v7, v6

    mul-float/2addr v7, v3

    add-float/2addr v6, v7

    iget v7, v1, Lf2/k;->g:F

    iget v8, v5, Lf2/k;->g:F

    sub-float v9, v8, v7

    mul-float/2addr v9, v3

    add-float/2addr v9, v7

    iget v1, v1, Lf2/k;->h:F

    iget v5, v5, Lf2/k;->h:F

    sub-float v10, v5, v1

    mul-float/2addr v10, v3

    add-float/2addr v10, v1

    const/high16 v14, 0x3f000000    # 0.5f

    add-float/2addr v4, v14

    float-to-int v15, v4

    add-float/2addr v6, v14

    float-to-int v14, v6

    add-float/2addr v4, v9

    float-to-int v4, v4

    add-float/2addr v6, v10

    float-to-int v6, v6

    sub-int v9, v4, v15

    sub-int v10, v6, v14

    cmpl-float v7, v8, v7

    if-nez v7, :cond_12

    cmpl-float v1, v5, v1

    if-nez v1, :cond_12

    iget-boolean v1, v0, Lf2/g;->a:Z

    if-eqz v1, :cond_13

    :cond_12
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v9, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-static {v10, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v2, v5, v1}, Landroid/view/View;->measure(II)V

    iput-boolean v11, v0, Lf2/g;->a:Z

    :cond_13
    invoke-virtual {v2, v15, v14, v4, v6}, Landroid/view/View;->layout(IIII)V

    :cond_14
    iget-object v1, v0, Lf2/g;->r:Ljava/util/HashMap;

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le2/b;

    instance-of v4, v1, Le2/b$a;

    if-eqz v4, :cond_15

    check-cast v1, Le2/b$a;

    iget-object v4, v0, Lf2/g;->l:[D

    aget-wide v5, v4, v11

    aget-wide v9, v4, v13

    move-wide v4, v5

    move-wide v6, v9

    invoke-virtual/range {v1 .. v7}, Le2/b$a;->b(Landroid/view/View;FDD)V

    goto :goto_9

    :cond_15
    invoke-virtual {v1, v2, v3}, Le2/b;->a(Landroid/view/View;F)V

    goto :goto_9

    :cond_16
    return v12
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " start: x: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf2/g;->b:Lf2/k;

    iget v1, v1, Lf2/k;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " y: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf2/g;->b:Lf2/k;

    iget v2, v2, Lf2/k;->f:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " end: x: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf2/g;->c:Lf2/k;

    iget v2, v2, Lf2/k;->e:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf2/g;->c:Lf2/k;

    iget v1, v1, Lf2/k;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
