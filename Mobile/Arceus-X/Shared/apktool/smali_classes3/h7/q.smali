.class public Lh7/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/s;
.implements Li7/a$b;


# instance fields
.field public final a:Lf7/h0;

.field public final b:Ljava/lang/String;

.field public final c:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ln7/o;


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/b;Ln7/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/q;->a:Lf7/h0;

    invoke-virtual {p3}, Ln7/n;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lh7/q;->b:Ljava/lang/String;

    invoke-virtual {p3}, Ln7/n;->b()Lm7/o;

    move-result-object p1

    invoke-interface {p1}, Lm7/o;->a()Li7/a;

    move-result-object p1

    iput-object p1, p0, Lh7/q;->c:Li7/a;

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    return-void
.end method

.method public static c(II)I
    .locals 2

    div-int v0, p0, p1

    xor-int v1, p0, p1

    if-gez v1, :cond_0

    mul-int/2addr p1, v0

    if-eq p1, p0, :cond_0

    add-int/lit8 v0, v0, -0x1

    :cond_0
    return v0
.end method

.method public static f(II)I
    .locals 1

    invoke-static {p0, p1}, Lh7/q;->c(II)I

    move-result v0

    mul-int/2addr v0, p1

    sub-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lh7/q;->a:Lf7/h0;

    invoke-virtual {v0}, Lf7/h0;->invalidateSelf()V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public d(Ln7/o;)Ln7/o;
    .locals 18

    invoke-virtual/range {p1 .. p1}, Ln7/o;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-gt v1, v2, :cond_0

    move-object/from16 v1, p0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p0

    iget-object v2, v1, Lh7/q;->c:Li7/a;

    invoke-virtual {v2}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-nez v3, :cond_1

    :goto_0
    return-object p1

    :cond_1
    invoke-virtual/range {p0 .. p1}, Lh7/q;->j(Ln7/o;)Ln7/o;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Ln7/o;->b()Landroid/graphics/PointF;

    move-result-object v4

    iget v4, v4, Landroid/graphics/PointF;->x:F

    invoke-virtual/range {p1 .. p1}, Ln7/o;->b()Landroid/graphics/PointF;

    move-result-object v5

    iget v5, v5, Landroid/graphics/PointF;->y:F

    invoke-virtual {v3, v4, v5}, Ln7/o;->f(FF)V

    invoke-virtual {v3}, Ln7/o;->a()Ljava/util/List;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Ln7/o;->d()Z

    move-result v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    if-ge v7, v9, :cond_8

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll7/a;

    add-int/lit8 v10, v7, -0x1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v11

    invoke-static {v10, v11}, Lh7/q;->f(II)I

    move-result v10

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll7/a;

    add-int/lit8 v11, v7, -0x2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v12

    invoke-static {v11, v12}, Lh7/q;->f(II)I

    move-result v11

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll7/a;

    if-nez v7, :cond_2

    if-nez v5, :cond_2

    invoke-virtual/range {p1 .. p1}, Ln7/o;->b()Landroid/graphics/PointF;

    move-result-object v12

    goto :goto_2

    :cond_2
    invoke-virtual {v10}, Ll7/a;->c()Landroid/graphics/PointF;

    move-result-object v12

    :goto_2
    if-nez v7, :cond_3

    if-nez v5, :cond_3

    move-object v13, v12

    goto :goto_3

    :cond_3
    invoke-virtual {v10}, Ll7/a;->b()Landroid/graphics/PointF;

    move-result-object v13

    :goto_3
    invoke-virtual {v9}, Ll7/a;->a()Landroid/graphics/PointF;

    move-result-object v14

    invoke-virtual {v11}, Ll7/a;->c()Landroid/graphics/PointF;

    move-result-object v11

    invoke-virtual {v9}, Ll7/a;->c()Landroid/graphics/PointF;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Ln7/o;->d()Z

    move-result v16

    if-nez v16, :cond_4

    const/16 v16, 0x1

    if-eqz v7, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v17

    add-int/lit8 v6, v17, -0x1

    if-ne v7, v6, :cond_4

    goto :goto_4

    :cond_4
    const/16 v16, 0x0

    :cond_5
    :goto_4
    invoke-virtual {v13, v12}, Landroid/graphics/PointF;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v14, v12}, Landroid/graphics/PointF;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    if-nez v16, :cond_7

    iget v6, v12, Landroid/graphics/PointF;->x:F

    iget v9, v11, Landroid/graphics/PointF;->x:F

    sub-float v9, v6, v9

    iget v10, v12, Landroid/graphics/PointF;->y:F

    iget v13, v11, Landroid/graphics/PointF;->y:F

    sub-float v13, v10, v13

    iget v14, v15, Landroid/graphics/PointF;->x:F

    sub-float/2addr v14, v6

    iget v6, v15, Landroid/graphics/PointF;->y:F

    sub-float/2addr v6, v10

    float-to-double v9, v9

    move-object/from16 v16, v0

    float-to-double v0, v13

    invoke-static {v9, v10, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v9, v14

    float-to-double v13, v6

    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v9

    double-to-float v1, v9

    div-float v0, v2, v0

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-static {v0, v6}, Ljava/lang/Math;->min(FF)F

    move-result v0

    div-float v1, v2, v1

    invoke-static {v1, v6}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget v6, v12, Landroid/graphics/PointF;->x:F

    iget v9, v11, Landroid/graphics/PointF;->x:F

    sub-float/2addr v9, v6

    mul-float/2addr v9, v0

    add-float/2addr v9, v6

    iget v10, v12, Landroid/graphics/PointF;->y:F

    iget v11, v11, Landroid/graphics/PointF;->y:F

    sub-float/2addr v11, v10

    mul-float/2addr v11, v0

    add-float/2addr v11, v10

    iget v0, v15, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v6

    mul-float/2addr v0, v1

    add-float/2addr v0, v6

    iget v12, v15, Landroid/graphics/PointF;->y:F

    sub-float/2addr v12, v10

    mul-float/2addr v12, v1

    add-float/2addr v12, v10

    sub-float v1, v9, v6

    const v13, 0x3f0d4952    # 0.5519f

    mul-float/2addr v1, v13

    sub-float v1, v9, v1

    sub-float v14, v11, v10

    mul-float/2addr v14, v13

    sub-float v14, v11, v14

    sub-float v6, v0, v6

    mul-float/2addr v6, v13

    sub-float v6, v0, v6

    sub-float v10, v12, v10

    mul-float/2addr v10, v13

    sub-float v10, v12, v10

    add-int/lit8 v13, v8, -0x1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v15

    invoke-static {v13, v15}, Lh7/q;->f(II)I

    move-result v13

    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll7/a;

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll7/a;

    invoke-virtual {v13, v9, v11}, Ll7/a;->e(FF)V

    invoke-virtual {v13, v9, v11}, Ll7/a;->f(FF)V

    if-nez v7, :cond_6

    invoke-virtual {v3, v9, v11}, Ln7/o;->f(FF)V

    :cond_6
    invoke-virtual {v15, v1, v14}, Ll7/a;->d(FF)V

    add-int/lit8 v1, v8, 0x1

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll7/a;

    invoke-virtual {v15, v6, v10}, Ll7/a;->e(FF)V

    invoke-virtual {v15, v0, v12}, Ll7/a;->f(FF)V

    invoke-virtual {v1, v0, v12}, Ll7/a;->d(FF)V

    add-int/lit8 v8, v8, 0x2

    goto :goto_5

    :cond_7
    move-object/from16 v16, v0

    add-int/lit8 v0, v8, -0x1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, Lh7/q;->f(II)I

    move-result v0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll7/a;

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll7/a;

    invoke-virtual {v10}, Ll7/a;->b()Landroid/graphics/PointF;

    move-result-object v6

    iget v6, v6, Landroid/graphics/PointF;->x:F

    invoke-virtual {v10}, Ll7/a;->b()Landroid/graphics/PointF;

    move-result-object v11

    iget v11, v11, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v6, v11}, Ll7/a;->e(FF)V

    invoke-virtual {v10}, Ll7/a;->c()Landroid/graphics/PointF;

    move-result-object v6

    iget v6, v6, Landroid/graphics/PointF;->x:F

    invoke-virtual {v10}, Ll7/a;->c()Landroid/graphics/PointF;

    move-result-object v10

    iget v10, v10, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v6, v10}, Ll7/a;->f(FF)V

    invoke-virtual {v9}, Ll7/a;->a()Landroid/graphics/PointF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/PointF;->x:F

    invoke-virtual {v9}, Ll7/a;->a()Landroid/graphics/PointF;

    move-result-object v6

    iget v6, v6, Landroid/graphics/PointF;->y:F

    invoke-virtual {v1, v0, v6}, Ll7/a;->d(FF)V

    add-int/lit8 v8, v8, 0x1

    :goto_5
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v0, v16

    goto/16 :goto_1

    :cond_8
    return-object v3
.end method

.method public g(Li7/a$b;)V
    .locals 1

    iget-object v0, p0, Lh7/q;->c:Li7/a;

    invoke-virtual {v0, p1}, Li7/a;->a(Li7/a$b;)V

    return-void
.end method

.method public h()Li7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh7/q;->c:Li7/a;

    return-object v0
.end method

.method public final j(Ln7/o;)Ln7/o;
    .locals 10
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p1}, Ln7/o;->a()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Ln7/o;->d()Z

    move-result v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ltz v2, :cond_5

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll7/a;

    add-int/lit8 v7, v2, -0x1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    invoke-static {v7, v8}, Lh7/q;->f(II)I

    move-result v7

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll7/a;

    if-nez v2, :cond_0

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ln7/o;->b()Landroid/graphics/PointF;

    move-result-object v8

    goto :goto_1

    :cond_0
    invoke-virtual {v7}, Ll7/a;->c()Landroid/graphics/PointF;

    move-result-object v8

    :goto_1
    if-nez v2, :cond_1

    if-nez v1, :cond_1

    move-object v7, v8

    goto :goto_2

    :cond_1
    invoke-virtual {v7}, Ll7/a;->b()Landroid/graphics/PointF;

    move-result-object v7

    :goto_2
    invoke-virtual {v6}, Ll7/a;->a()Landroid/graphics/PointF;

    move-result-object v6

    invoke-virtual {p1}, Ln7/o;->d()Z

    move-result v9

    if-nez v9, :cond_3

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    sub-int/2addr v9, v3

    if-ne v2, v9, :cond_3

    :cond_2
    move v9, v3

    goto :goto_3

    :cond_3
    move v9, v4

    :goto_3
    invoke-virtual {v7, v8}, Landroid/graphics/PointF;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v6, v8}, Landroid/graphics/PointF;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    if-nez v9, :cond_4

    add-int/lit8 v5, v5, 0x2

    goto :goto_4

    :cond_4
    add-int/lit8 v5, v5, 0x1

    :goto_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lh7/q;->d:Ln7/o;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ln7/o;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-eq p1, v5, :cond_8

    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v5}, Ljava/util/ArrayList;-><init>(I)V

    move v0, v4

    :goto_5
    if-ge v0, v5, :cond_7

    new-instance v2, Ll7/a;

    invoke-direct {v2}, Ll7/a;-><init>()V

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_7
    new-instance v0, Ln7/o;

    new-instance v2, Landroid/graphics/PointF;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-direct {v0, v2, v4, p1}, Ln7/o;-><init>(Landroid/graphics/PointF;ZLjava/util/List;)V

    iput-object v0, p0, Lh7/q;->d:Ln7/o;

    :cond_8
    iget-object p1, p0, Lh7/q;->d:Ln7/o;

    invoke-virtual {p1, v1}, Ln7/o;->e(Z)V

    iget-object p1, p0, Lh7/q;->d:Ln7/o;

    return-object p1
.end method
