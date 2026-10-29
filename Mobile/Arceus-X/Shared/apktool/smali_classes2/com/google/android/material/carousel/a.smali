.class public final Lcom/google/android/material/carousel/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(FFI)F
    .locals 1

    add-int/lit8 p2, p2, -0x1

    const/4 v0, 0x0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    int-to-float p2, p2

    mul-float/2addr p2, p1

    add-float/2addr p0, p2

    return p0
.end method

.method public static b(FFI)F
    .locals 0

    if-lez p2, :cond_0

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    add-float/2addr p0, p1

    :cond_0
    return p0
.end method

.method public static c(Landroid/content/Context;FFLqc/a;)Lcom/google/android/material/carousel/b;
    .locals 19
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lqc/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    invoke-static/range {p0 .. p0}, Lcom/google/android/material/carousel/a;->f(Landroid/content/Context;)F

    move-result v3

    add-float/2addr v3, v0

    iget v4, v2, Lqc/a;->f:F

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v5, v3, v4

    const/4 v6, 0x0

    sub-float v7, v6, v5

    iget v8, v2, Lqc/a;->b:F

    iget v9, v2, Lqc/a;->c:I

    invoke-static {v6, v8, v9}, Lcom/google/android/material/carousel/a;->b(FFI)F

    move-result v8

    iget v9, v2, Lqc/a;->b:F

    iget v10, v2, Lqc/a;->c:I

    int-to-float v10, v10

    div-float/2addr v10, v4

    float-to-double v10, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    move-result-wide v10

    double-to-int v10, v10

    invoke-static {v8, v9, v10}, Lcom/google/android/material/carousel/a;->a(FFI)F

    move-result v9

    iget v10, v2, Lqc/a;->b:F

    iget v11, v2, Lqc/a;->c:I

    invoke-static {v6, v9, v10, v11}, Lcom/google/android/material/carousel/a;->j(FFFI)F

    move-result v6

    iget v9, v2, Lqc/a;->e:F

    iget v10, v2, Lqc/a;->d:I

    invoke-static {v6, v9, v10}, Lcom/google/android/material/carousel/a;->b(FFI)F

    move-result v9

    iget v10, v2, Lqc/a;->e:F

    iget v11, v2, Lqc/a;->d:I

    int-to-float v11, v11

    div-float/2addr v11, v4

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    move-result-wide v11

    double-to-int v11, v11

    invoke-static {v9, v10, v11}, Lcom/google/android/material/carousel/a;->a(FFI)F

    move-result v10

    iget v11, v2, Lqc/a;->e:F

    iget v12, v2, Lqc/a;->d:I

    invoke-static {v6, v10, v11, v12}, Lcom/google/android/material/carousel/a;->j(FFFI)F

    move-result v6

    iget v10, v2, Lqc/a;->f:F

    iget v11, v2, Lqc/a;->g:I

    invoke-static {v6, v10, v11}, Lcom/google/android/material/carousel/a;->b(FFI)F

    move-result v13

    iget v10, v2, Lqc/a;->f:F

    iget v11, v2, Lqc/a;->g:I

    invoke-static {v13, v10, v11}, Lcom/google/android/material/carousel/a;->a(FFI)F

    move-result v10

    iget v11, v2, Lqc/a;->f:F

    iget v12, v2, Lqc/a;->g:I

    invoke-static {v6, v10, v11, v12}, Lcom/google/android/material/carousel/a;->j(FFFI)F

    move-result v6

    iget v10, v2, Lqc/a;->e:F

    iget v11, v2, Lqc/a;->d:I

    invoke-static {v6, v10, v11}, Lcom/google/android/material/carousel/a;->b(FFI)F

    move-result v10

    iget v11, v2, Lqc/a;->e:F

    iget v12, v2, Lqc/a;->d:I

    int-to-float v12, v12

    div-float/2addr v12, v4

    float-to-double v14, v12

    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v14

    double-to-int v12, v14

    invoke-static {v10, v11, v12}, Lcom/google/android/material/carousel/a;->a(FFI)F

    move-result v11

    iget v12, v2, Lqc/a;->e:F

    iget v14, v2, Lqc/a;->d:I

    invoke-static {v6, v11, v12, v14}, Lcom/google/android/material/carousel/a;->j(FFFI)F

    move-result v6

    iget v11, v2, Lqc/a;->b:F

    iget v12, v2, Lqc/a;->c:I

    invoke-static {v6, v11, v12}, Lcom/google/android/material/carousel/a;->b(FFI)F

    move-result v6

    add-float/2addr v5, v1

    iget v11, v2, Lqc/a;->f:F

    invoke-static {v3, v11, v0}, Lqc/f;->b(FFF)F

    move-result v11

    iget v12, v2, Lqc/a;->b:F

    iget v14, v2, Lqc/a;->f:F

    invoke-static {v12, v14, v0}, Lqc/f;->b(FFF)F

    move-result v12

    iget v14, v2, Lqc/a;->e:F

    iget v15, v2, Lqc/a;->f:F

    invoke-static {v14, v15, v0}, Lqc/f;->b(FFF)F

    move-result v0

    new-instance v14, Lcom/google/android/material/carousel/b$b;

    iget v15, v2, Lqc/a;->f:F

    invoke-direct {v14, v15, v1}, Lcom/google/android/material/carousel/b$b;-><init>(FF)V

    invoke-virtual {v14, v7, v11, v3}, Lcom/google/android/material/carousel/b$b;->a(FFF)Lcom/google/android/material/carousel/b$b;

    move-result-object v1

    iget v7, v2, Lqc/a;->c:I

    if-lez v7, :cond_0

    iget v14, v2, Lqc/a;->b:F

    int-to-float v7, v7

    div-float/2addr v7, v4

    move/from16 p0, v4

    move/from16 v18, v5

    float-to-double v4, v7

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v4, v4

    invoke-virtual {v1, v8, v12, v14, v4}, Lcom/google/android/material/carousel/b$b;->g(FFFI)Lcom/google/android/material/carousel/b$b;

    goto :goto_0

    :cond_0
    move/from16 p0, v4

    move/from16 v18, v5

    :goto_0
    iget v4, v2, Lqc/a;->d:I

    if-lez v4, :cond_1

    iget v5, v2, Lqc/a;->e:F

    int-to-float v4, v4

    div-float v4, v4, p0

    float-to-double v7, v4

    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    move-result-wide v7

    double-to-int v4, v7

    invoke-virtual {v1, v9, v0, v5, v4}, Lcom/google/android/material/carousel/b$b;->g(FFFI)Lcom/google/android/material/carousel/b$b;

    :cond_1
    iget v15, v2, Lqc/a;->f:F

    iget v4, v2, Lqc/a;->g:I

    const/16 v17, 0x1

    const/4 v14, 0x0

    move/from16 v16, v12

    move-object v12, v1

    move/from16 v1, v16

    move/from16 v16, v4

    invoke-virtual/range {v12 .. v17}, Lcom/google/android/material/carousel/b$b;->h(FFFIZ)Lcom/google/android/material/carousel/b$b;

    iget v4, v2, Lqc/a;->d:I

    if-lez v4, :cond_2

    iget v5, v2, Lqc/a;->e:F

    int-to-float v4, v4

    div-float v4, v4, p0

    float-to-double v7, v4

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-int v4, v7

    invoke-virtual {v12, v10, v0, v5, v4}, Lcom/google/android/material/carousel/b$b;->g(FFFI)Lcom/google/android/material/carousel/b$b;

    :cond_2
    iget v0, v2, Lqc/a;->c:I

    if-lez v0, :cond_3

    iget v2, v2, Lqc/a;->b:F

    int-to-float v0, v0

    div-float v0, v0, p0

    float-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v0, v4

    invoke-virtual {v12, v6, v1, v2, v0}, Lcom/google/android/material/carousel/b$b;->g(FFFI)Lcom/google/android/material/carousel/b$b;

    :cond_3
    move/from16 v0, v18

    invoke-virtual {v12, v0, v11, v3}, Lcom/google/android/material/carousel/b$b;->a(FFF)Lcom/google/android/material/carousel/b$b;

    invoke-virtual {v12}, Lcom/google/android/material/carousel/b$b;->i()Lcom/google/android/material/carousel/b;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;FFLqc/a;I)Lcom/google/android/material/carousel/b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lqc/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/material/carousel/a;->c(Landroid/content/Context;FFLqc/a;)Lcom/google/android/material/carousel/b;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/material/carousel/a;->e(Landroid/content/Context;FFLqc/a;)Lcom/google/android/material/carousel/b;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/content/Context;FFLqc/a;)Lcom/google/android/material/carousel/b;
    .locals 12
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lqc/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/google/android/material/carousel/a;->f(Landroid/content/Context;)F

    move-result p0

    add-float/2addr p0, p1

    iget v0, p3, Lqc/a;->f:F

    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, p0, v0

    const/4 v1, 0x0

    sub-float v2, v1, v0

    iget v3, p3, Lqc/a;->f:F

    iget v4, p3, Lqc/a;->g:I

    invoke-static {v1, v3, v4}, Lcom/google/android/material/carousel/a;->b(FFI)F

    move-result v6

    iget v3, p3, Lqc/a;->f:F

    iget v4, p3, Lqc/a;->g:I

    invoke-static {v6, v3, v4}, Lcom/google/android/material/carousel/a;->a(FFI)F

    move-result v3

    iget v4, p3, Lqc/a;->f:F

    iget v5, p3, Lqc/a;->g:I

    invoke-static {v1, v3, v4, v5}, Lcom/google/android/material/carousel/a;->j(FFFI)F

    move-result v1

    iget v3, p3, Lqc/a;->e:F

    iget v4, p3, Lqc/a;->d:I

    invoke-static {v1, v3, v4}, Lcom/google/android/material/carousel/a;->b(FFI)F

    move-result v3

    iget v4, p3, Lqc/a;->e:F

    iget v5, p3, Lqc/a;->d:I

    invoke-static {v1, v3, v4, v5}, Lcom/google/android/material/carousel/a;->j(FFFI)F

    move-result v1

    iget v4, p3, Lqc/a;->b:F

    iget v5, p3, Lqc/a;->c:I

    invoke-static {v1, v4, v5}, Lcom/google/android/material/carousel/a;->b(FFI)F

    move-result v1

    add-float/2addr v0, p2

    iget v4, p3, Lqc/a;->f:F

    invoke-static {p0, v4, p1}, Lqc/f;->b(FFF)F

    move-result v4

    iget v5, p3, Lqc/a;->b:F

    iget v7, p3, Lqc/a;->f:F

    invoke-static {v5, v7, p1}, Lqc/f;->b(FFF)F

    move-result v11

    iget v5, p3, Lqc/a;->e:F

    iget v7, p3, Lqc/a;->f:F

    invoke-static {v5, v7, p1}, Lqc/f;->b(FFF)F

    move-result p1

    new-instance v5, Lcom/google/android/material/carousel/b$b;

    iget v7, p3, Lqc/a;->f:F

    invoke-direct {v5, v7, p2}, Lcom/google/android/material/carousel/b$b;-><init>(FF)V

    invoke-virtual {v5, v2, v4, p0}, Lcom/google/android/material/carousel/b$b;->a(FFF)Lcom/google/android/material/carousel/b$b;

    move-result-object v5

    iget v8, p3, Lqc/a;->f:F

    iget v9, p3, Lqc/a;->g:I

    const/4 v10, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {v5 .. v10}, Lcom/google/android/material/carousel/b$b;->h(FFFIZ)Lcom/google/android/material/carousel/b$b;

    move-result-object p2

    iget v2, p3, Lqc/a;->d:I

    if-lez v2, :cond_0

    iget v2, p3, Lqc/a;->e:F

    invoke-virtual {p2, v3, p1, v2}, Lcom/google/android/material/carousel/b$b;->b(FFF)Lcom/google/android/material/carousel/b$b;

    :cond_0
    iget p1, p3, Lqc/a;->c:I

    if-lez p1, :cond_1

    iget p3, p3, Lqc/a;->b:F

    invoke-virtual {p2, v1, v11, p3, p1}, Lcom/google/android/material/carousel/b$b;->g(FFFI)Lcom/google/android/material/carousel/b$b;

    :cond_1
    invoke-virtual {p2, v0, v4, p0}, Lcom/google/android/material/carousel/b$b;->a(FFF)Lcom/google/android/material/carousel/b$b;

    invoke-virtual {p2}, Lcom/google/android/material/carousel/b$b;->i()Lcom/google/android/material/carousel/b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)F
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lic/d;->o:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p0

    return p0
.end method

.method public static g(Landroid/content/Context;)F
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lic/d;->p:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p0

    return p0
.end method

.method public static h(Landroid/content/Context;)F
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lic/d;->q:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p0

    return p0
.end method

.method public static i([I)I
    .locals 4

    array-length v0, p0

    const/high16 v1, -0x80000000

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p0, v2

    if-le v3, v1, :cond_0

    move v1, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static j(FFFI)F
    .locals 0

    if-lez p3, :cond_0

    const/high16 p0, 0x40000000    # 2.0f

    div-float/2addr p2, p0

    add-float/2addr p1, p2

    return p1

    :cond_0
    return p0
.end method
