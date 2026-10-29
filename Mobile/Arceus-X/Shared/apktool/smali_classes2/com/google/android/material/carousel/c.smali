.class public Lcom/google/android/material/carousel/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/material/carousel/b;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:[F

.field public final e:[F

.field public final f:F

.field public final g:F


# direct methods
.method public constructor <init>(Lcom/google/android/material/carousel/b;Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .param p1    # Lcom/google/android/material/carousel/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/carousel/b;",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b;",
            ">;",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/carousel/c;->a:Lcom/google/android/material/carousel/b;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/carousel/c;->b:Ljava/util/List;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/carousel/c;->c:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/carousel/b;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->c()Lcom/google/android/material/carousel/b$c;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/carousel/b$c;->a:F

    invoke-virtual {p1}, Lcom/google/android/material/carousel/b;->c()Lcom/google/android/material/carousel/b$c;

    move-result-object v2

    iget v2, v2, Lcom/google/android/material/carousel/b$c;->a:F

    sub-float/2addr v0, v2

    iput v0, p0, Lcom/google/android/material/carousel/c;->f:F

    invoke-virtual {p1}, Lcom/google/android/material/carousel/b;->j()Lcom/google/android/material/carousel/b$c;

    move-result-object p1

    iget p1, p1, Lcom/google/android/material/carousel/b$c;->a:F

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/carousel/b;

    invoke-virtual {v2}, Lcom/google/android/material/carousel/b;->j()Lcom/google/android/material/carousel/b$c;

    move-result-object v2

    iget v2, v2, Lcom/google/android/material/carousel/b$c;->a:F

    sub-float/2addr p1, v2

    iput p1, p0, Lcom/google/android/material/carousel/c;->g:F

    invoke-static {v0, p2, v1}, Lcom/google/android/material/carousel/c;->m(FLjava/util/List;Z)[F

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/material/carousel/c;->d:[F

    const/4 p2, 0x0

    invoke-static {p1, p3, p2}, Lcom/google/android/material/carousel/c;->m(FLjava/util/List;Z)[F

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/carousel/c;->e:[F

    return-void
.end method

.method public static b(Lcom/google/android/material/carousel/b;F)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->i()I

    move-result v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/b$c;

    iget v1, v1, Lcom/google/android/material/carousel/b$c;->c:F

    cmpl-float v1, p1, v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static c(Lcom/google/android/material/carousel/b;)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/b$c;

    iget-boolean v1, v1, Lcom/google/android/material/carousel/b$c;->e:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static d(Lcom/google/android/material/carousel/b;F)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->b()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/b$c;

    iget v1, v1, Lcom/google/android/material/carousel/b$c;->c:F

    cmpl-float v1, p1, v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static e(Lcom/google/android/material/carousel/b;)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/b$c;

    iget-boolean v1, v1, Lcom/google/android/material/carousel/b$c;->e:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static f(Lqc/b;Lcom/google/android/material/carousel/b;FFF)Lcom/google/android/material/carousel/c;
    .locals 1

    new-instance v0, Lcom/google/android/material/carousel/c;

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/material/carousel/c;->p(Lqc/b;Lcom/google/android/material/carousel/b;FF)Ljava/util/List;

    move-result-object p3

    invoke-static {p0, p1, p2, p4}, Lcom/google/android/material/carousel/c;->n(Lqc/b;Lcom/google/android/material/carousel/b;FF)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p1, p3, p0}, Lcom/google/android/material/carousel/c;-><init>(Lcom/google/android/material/carousel/b;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static m(FLjava/util/List;Z)[F
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b;",
            ">;Z)[F"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [F

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v0, :cond_2

    add-int/lit8 v3, v2, -0x1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/carousel/b;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/material/carousel/b;

    if-eqz p2, :cond_0

    invoke-virtual {v5}, Lcom/google/android/material/carousel/b;->c()Lcom/google/android/material/carousel/b$c;

    move-result-object v5

    iget v5, v5, Lcom/google/android/material/carousel/b$c;->a:F

    invoke-virtual {v4}, Lcom/google/android/material/carousel/b;->c()Lcom/google/android/material/carousel/b$c;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/b$c;->a:F

    sub-float/2addr v5, v4

    goto :goto_1

    :cond_0
    invoke-virtual {v4}, Lcom/google/android/material/carousel/b;->j()Lcom/google/android/material/carousel/b$c;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/b$c;->a:F

    invoke-virtual {v5}, Lcom/google/android/material/carousel/b;->j()Lcom/google/android/material/carousel/b$c;

    move-result-object v5

    iget v5, v5, Lcom/google/android/material/carousel/b$c;->a:F

    sub-float v5, v4, v5

    :goto_1
    div-float/2addr v5, p0

    add-int/lit8 v4, v0, -0x1

    if-ne v2, v4, :cond_1

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_1
    aget v3, v1, v3

    add-float/2addr v3, v5

    :goto_2
    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static n(Lqc/b;Lcom/google/android/material/carousel/b;FF)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/b;",
            "Lcom/google/android/material/carousel/b;",
            "FF)",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lcom/google/android/material/carousel/c;->e(Lcom/google/android/material/carousel/b;)I

    move-result v5

    invoke-interface/range {p0 .. p0}, Lqc/b;->f()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface/range {p0 .. p0}, Lqc/b;->a()I

    move-result v4

    :goto_0
    int-to-float v4, v4

    move v10, v4

    goto :goto_1

    :cond_0
    invoke-interface/range {p0 .. p0}, Lqc/b;->b()I

    move-result v4

    goto :goto_0

    :goto_1
    invoke-static/range {p0 .. p1}, Lcom/google/android/material/carousel/c;->r(Lqc/b;Lcom/google/android/material/carousel/b;)Z

    move-result v4

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-nez v4, :cond_5

    const/4 v4, -0x1

    if-ne v5, v4, :cond_1

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->i()I

    move-result v4

    sub-int v13, v5, v4

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->c()Lcom/google/android/material/carousel/b$c;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/b$c;->b:F

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->c()Lcom/google/android/material/carousel/b$c;

    move-result-object v6

    iget v6, v6, Lcom/google/android/material/carousel/b$c;->d:F

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    sub-float v14, v4, v6

    if-gtz v13, :cond_2

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->h()Lcom/google/android/material/carousel/b$c;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/b$c;->f:F

    cmpl-float v4, v4, v12

    if-lez v4, :cond_2

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->h()Lcom/google/android/material/carousel/b$c;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/b$c;->f:F

    sub-float/2addr v14, v1

    invoke-static {v0, v14, v10}, Lcom/google/android/material/carousel/c;->v(Lcom/google/android/material/carousel/b;FF)Lcom/google/android/material/carousel/b;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v3

    :cond_2
    move v15, v11

    move v4, v12

    :goto_2
    if-ge v15, v13, :cond_6

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/material/carousel/b;

    sub-int v7, v5, v15

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/material/carousel/b$c;

    iget v8, v8, Lcom/google/android/material/carousel/b$c;->f:F

    add-float v16, v4, v8

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v7, v4, :cond_3

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/carousel/b$c;

    iget v4, v4, Lcom/google/android/material/carousel/b$c;->c:F

    invoke-static {v6, v4}, Lcom/google/android/material/carousel/c;->d(Lcom/google/android/material/carousel/b;F)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_3
    move v4, v11

    :goto_3
    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->b()I

    move-result v7

    add-int/2addr v7, v15

    add-int/lit8 v8, v7, 0x1

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->i()I

    move-result v7

    add-int/2addr v7, v15

    add-int/lit8 v9, v7, 0x1

    sub-float v7, v14, v16

    move-object/from16 v17, v6

    move v6, v4

    move-object/from16 v4, v17

    invoke-static/range {v4 .. v10}, Lcom/google/android/material/carousel/c;->t(Lcom/google/android/material/carousel/b;IIFIIF)Lcom/google/android/material/carousel/b;

    move-result-object v4

    add-int/lit8 v6, v13, -0x1

    if-ne v15, v6, :cond_4

    cmpl-float v6, v2, v12

    if-lez v6, :cond_4

    invoke-static {v4, v2, v10, v11, v1}, Lcom/google/android/material/carousel/c;->u(Lcom/google/android/material/carousel/b;FFZF)Lcom/google/android/material/carousel/b;

    move-result-object v4

    :cond_4
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    move/from16 v4, v16

    goto :goto_2

    :cond_5
    :goto_4
    cmpl-float v4, v2, v12

    if-lez v4, :cond_6

    invoke-static {v0, v2, v10, v11, v1}, Lcom/google/android/material/carousel/c;->u(Lcom/google/android/material/carousel/b;FFZF)Lcom/google/android/material/carousel/b;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    return-object v3
.end method

.method public static o(Ljava/util/List;F[F)[F
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b;",
            ">;F[F)[F"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x0

    aget v1, p2, v0

    const/4 v2, 0x1

    move v3, v2

    :goto_0
    const/4 v4, 0x3

    if-ge v3, p0, :cond_1

    aget v5, p2, v3

    cmpg-float v6, p1, v5

    if-gtz v6, :cond_0

    add-int/lit8 p0, v3, -0x1

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    invoke-static {v6, p2, v1, v5, p1}, Ljc/a;->b(FFFFF)F

    move-result p1

    int-to-float p0, p0

    int-to-float p2, v3

    new-array v1, v4, [F

    aput p1, v1, v0

    aput p0, v1, v2

    const/4 p0, 0x2

    aput p2, v1, p0

    return-object v1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    move v1, v5

    goto :goto_0

    :cond_1
    new-array p0, v4, [F

    fill-array-data p0, :array_0

    return-object p0

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public static p(Lqc/b;Lcom/google/android/material/carousel/b;FF)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/b;",
            "Lcom/google/android/material/carousel/b;",
            "FF)",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lcom/google/android/material/carousel/c;->c(Lcom/google/android/material/carousel/b;)I

    move-result v5

    invoke-interface/range {p0 .. p0}, Lqc/b;->f()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface/range {p0 .. p0}, Lqc/b;->a()I

    move-result v4

    :goto_0
    int-to-float v4, v4

    move v10, v4

    goto :goto_1

    :cond_0
    invoke-interface/range {p0 .. p0}, Lqc/b;->b()I

    move-result v4

    goto :goto_0

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/c;->q(Lcom/google/android/material/carousel/b;)Z

    move-result v4

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-nez v4, :cond_5

    const/4 v4, -0x1

    if-ne v5, v4, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->b()I

    move-result v4

    sub-int v13, v4, v5

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->c()Lcom/google/android/material/carousel/b$c;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/b$c;->b:F

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->c()Lcom/google/android/material/carousel/b$c;

    move-result-object v6

    iget v6, v6, Lcom/google/android/material/carousel/b$c;->d:F

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    sub-float v14, v4, v6

    if-gtz v13, :cond_2

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->a()Lcom/google/android/material/carousel/b$c;

    move-result-object v4

    iget v4, v4, Lcom/google/android/material/carousel/b$c;->f:F

    cmpl-float v4, v4, v11

    if-lez v4, :cond_2

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->a()Lcom/google/android/material/carousel/b$c;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/b$c;->f:F

    add-float/2addr v14, v1

    invoke-static {v0, v14, v10}, Lcom/google/android/material/carousel/c;->v(Lcom/google/android/material/carousel/b;FF)Lcom/google/android/material/carousel/b;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v3

    :cond_2
    const/4 v4, 0x0

    move v15, v4

    move v4, v11

    :goto_2
    if-ge v15, v13, :cond_6

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v12

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/material/carousel/b;

    add-int v7, v5, v15

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    sub-int/2addr v8, v12

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/material/carousel/b$c;

    iget v9, v9, Lcom/google/android/material/carousel/b$c;->f:F

    add-float v16, v4, v9

    sub-int/2addr v7, v12

    if-ltz v7, :cond_3

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/carousel/b$c;

    iget v4, v4, Lcom/google/android/material/carousel/b$c;->c:F

    invoke-static {v6, v4}, Lcom/google/android/material/carousel/c;->b(Lcom/google/android/material/carousel/b;F)I

    move-result v4

    add-int/lit8 v8, v4, -0x1

    :cond_3
    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->b()I

    move-result v4

    sub-int/2addr v4, v15

    sub-int/2addr v4, v12

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->i()I

    move-result v7

    sub-int/2addr v7, v15

    add-int/lit8 v9, v7, -0x1

    add-float v7, v14, v16

    move/from16 v17, v8

    move v8, v4

    move-object v4, v6

    move/from16 v6, v17

    invoke-static/range {v4 .. v10}, Lcom/google/android/material/carousel/c;->t(Lcom/google/android/material/carousel/b;IIFIIF)Lcom/google/android/material/carousel/b;

    move-result-object v4

    add-int/lit8 v6, v13, -0x1

    if-ne v15, v6, :cond_4

    cmpl-float v6, v2, v11

    if-lez v6, :cond_4

    invoke-static {v4, v2, v10, v12, v1}, Lcom/google/android/material/carousel/c;->u(Lcom/google/android/material/carousel/b;FFZF)Lcom/google/android/material/carousel/b;

    move-result-object v4

    :cond_4
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    move/from16 v4, v16

    goto :goto_2

    :cond_5
    :goto_3
    cmpl-float v4, v2, v11

    if-lez v4, :cond_6

    invoke-static {v0, v2, v10, v12, v1}, Lcom/google/android/material/carousel/c;->u(Lcom/google/android/material/carousel/b;FFZF)Lcom/google/android/material/carousel/b;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    return-object v3
.end method

.method public static q(Lcom/google/android/material/carousel/b;)Z
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->a()Lcom/google/android/material/carousel/b$c;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/carousel/b$c;->b:F

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->a()Lcom/google/android/material/carousel/b$c;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/b$c;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->a()Lcom/google/android/material/carousel/b$c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->d()Lcom/google/android/material/carousel/b$c;

    move-result-object p0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static r(Lqc/b;Lcom/google/android/material/carousel/b;)Z
    .locals 3

    invoke-interface {p0}, Lqc/b;->b()I

    move-result v0

    invoke-interface {p0}, Lqc/b;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Lqc/b;->a()I

    move-result v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/material/carousel/b;->h()Lcom/google/android/material/carousel/b$c;

    move-result-object p0

    iget p0, p0, Lcom/google/android/material/carousel/b$c;->b:F

    invoke-virtual {p1}, Lcom/google/android/material/carousel/b;->h()Lcom/google/android/material/carousel/b$c;

    move-result-object v1

    iget v1, v1, Lcom/google/android/material/carousel/b$c;->d:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr p0, v1

    int-to-float v0, v0

    cmpg-float p0, p0, v0

    if-gtz p0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/material/carousel/b;->h()Lcom/google/android/material/carousel/b$c;

    move-result-object p0

    invoke-virtual {p1}, Lcom/google/android/material/carousel/b;->k()Lcom/google/android/material/carousel/b$c;

    move-result-object p1

    if-ne p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static s(Ljava/util/List;F[F)Lcom/google/android/material/carousel/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b;",
            ">;F[F)",
            "Lcom/google/android/material/carousel/b;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/android/material/carousel/c;->o(Ljava/util/List;F[F)[F

    move-result-object p1

    const/4 p2, 0x1

    aget p2, p1, p2

    float-to-int p2, p2

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/carousel/b;

    const/4 v0, 0x2

    aget v0, p1, v0

    float-to-int v0, v0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/carousel/b;

    const/4 v0, 0x0

    aget p1, p1, v0

    invoke-static {p2, p0, p1}, Lcom/google/android/material/carousel/b;->m(Lcom/google/android/material/carousel/b;Lcom/google/android/material/carousel/b;F)Lcom/google/android/material/carousel/b;

    move-result-object p0

    return-object p0
.end method

.method public static t(Lcom/google/android/material/carousel/b;IIFIIF)Lcom/google/android/material/carousel/b;
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/carousel/b$c;

    invoke-interface {v0, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    new-instance v1, Lcom/google/android/material/carousel/b$b;

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->f()F

    move-result p0

    invoke-direct {v1, p0, p6}, Lcom/google/android/material/carousel/b$b;-><init>(FF)V

    const/4 p0, 0x0

    move p1, p0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/carousel/b$c;

    iget v4, p2, Lcom/google/android/material/carousel/b$c;->d:F

    const/high16 p6, 0x40000000    # 2.0f

    div-float p6, v4, p6

    add-float v2, p3, p6

    if-lt p1, p4, :cond_0

    if-gt p1, p5, :cond_0

    const/4 p6, 0x1

    move v5, p6

    goto :goto_1

    :cond_0
    move v5, p0

    :goto_1
    iget v3, p2, Lcom/google/android/material/carousel/b$c;->c:F

    iget-boolean v6, p2, Lcom/google/android/material/carousel/b$c;->e:Z

    iget v7, p2, Lcom/google/android/material/carousel/b$c;->f:F

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/material/carousel/b$b;->e(FFFZZF)Lcom/google/android/material/carousel/b$b;

    iget p2, p2, Lcom/google/android/material/carousel/b$c;->d:F

    add-float/2addr p3, p2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/material/carousel/b$b;->i()Lcom/google/android/material/carousel/b;

    move-result-object p0

    return-object p0
.end method

.method public static u(Lcom/google/android/material/carousel/b;FFZF)Lcom/google/android/material/carousel/b;
    .locals 16

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/b;->g()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v2, Lcom/google/android/material/carousel/b$b;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/b;->f()F

    move-result v1

    move/from16 v3, p2

    invoke-direct {v2, v1, v3}, Lcom/google/android/material/carousel/b$b;-><init>(FF)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/b;->l()I

    move-result v1

    int-to-float v1, v1

    div-float v1, p1, v1

    const/4 v11, 0x0

    if-eqz p3, :cond_0

    move/from16 v3, p1

    goto :goto_0

    :cond_0
    move v3, v11

    :goto_0
    const/4 v12, 0x0

    move v13, v3

    move v14, v12

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v14, v3, :cond_5

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/material/carousel/b$c;

    iget-boolean v4, v3, Lcom/google/android/material/carousel/b$c;->e:Z

    if-eqz v4, :cond_1

    iget v4, v3, Lcom/google/android/material/carousel/b$c;->b:F

    move v5, v4

    iget v4, v3, Lcom/google/android/material/carousel/b$c;->c:F

    move v6, v5

    iget v5, v3, Lcom/google/android/material/carousel/b$c;->d:F

    const/4 v7, 0x1

    iget v8, v3, Lcom/google/android/material/carousel/b$c;->f:F

    move v3, v6

    const/4 v6, 0x0

    invoke-virtual/range {v2 .. v8}, Lcom/google/android/material/carousel/b$b;->e(FFFZZF)Lcom/google/android/material/carousel/b$b;

    move/from16 v15, p4

    goto :goto_6

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/b;->b()I

    move-result v4

    if-lt v14, v4, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/b;->i()I

    move-result v4

    if-gt v14, v4, :cond_2

    const/4 v4, 0x1

    move v6, v4

    goto :goto_2

    :cond_2
    move v6, v12

    :goto_2
    iget v4, v3, Lcom/google/android/material/carousel/b$c;->d:F

    sub-float v5, v4, v1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/carousel/b;->f()F

    move-result v4

    move/from16 v15, p4

    invoke-static {v5, v4, v15}, Lqc/f;->b(FFF)F

    move-result v4

    const/high16 v7, 0x40000000    # 2.0f

    div-float v7, v5, v7

    add-float/2addr v7, v13

    iget v8, v3, Lcom/google/android/material/carousel/b$c;->b:F

    sub-float v8, v7, v8

    iget v3, v3, Lcom/google/android/material/carousel/b$c;->f:F

    if-eqz p3, :cond_3

    move v9, v8

    goto :goto_3

    :cond_3
    move v9, v11

    :goto_3
    if-eqz p3, :cond_4

    move v10, v11

    :goto_4
    move v8, v3

    move v3, v7

    goto :goto_5

    :cond_4
    move v10, v8

    goto :goto_4

    :goto_5
    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v10}, Lcom/google/android/material/carousel/b$b;->f(FFFZZFFF)Lcom/google/android/material/carousel/b$b;

    add-float/2addr v13, v5

    :goto_6
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Lcom/google/android/material/carousel/b$b;->i()Lcom/google/android/material/carousel/b;

    move-result-object v0

    return-object v0
.end method

.method public static v(Lcom/google/android/material/carousel/b;FF)Lcom/google/android/material/carousel/b;
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->b()I

    move-result v4

    invoke-virtual {p0}, Lcom/google/android/material/carousel/b;->i()I

    move-result v5

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move v3, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lcom/google/android/material/carousel/c;->t(Lcom/google/android/material/carousel/b;IIFIIF)Lcom/google/android/material/carousel/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/List;F[F)Lcom/google/android/material/carousel/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/material/carousel/b;",
            ">;F[F)",
            "Lcom/google/android/material/carousel/b;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lcom/google/android/material/carousel/c;->o(Ljava/util/List;F[F)[F

    move-result-object p2

    const/4 p3, 0x0

    aget p3, p2, p3

    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float p3, p3, v0

    if-ltz p3, :cond_0

    const/4 p3, 0x2

    aget p2, p2, p3

    float-to-int p2, p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/carousel/b;

    return-object p1

    :cond_0
    const/4 p3, 0x1

    aget p2, p2, p3

    float-to-int p2, p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/carousel/b;

    return-object p1
.end method

.method public g()Lcom/google/android/material/carousel/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/c;->a:Lcom/google/android/material/carousel/b;

    return-object v0
.end method

.method public h()Lcom/google/android/material/carousel/b;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/carousel/c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/carousel/b;

    return-object v0
.end method

.method public i(IIIZ)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIZ)",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/google/android/material/carousel/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/carousel/c;->a:Lcom/google/android/material/carousel/b;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/b;->f()F

    move-result v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, -0x1

    const/4 v6, 0x1

    if-ge v3, p1, :cond_4

    if-eqz p4, :cond_0

    sub-int v7, p1, v3

    sub-int/2addr v7, v6

    goto :goto_1

    :cond_0
    move v7, v3

    :goto_1
    int-to-float v8, v7

    mul-float/2addr v8, v0

    if-eqz p4, :cond_1

    goto :goto_2

    :cond_1
    move v5, v6

    :goto_2
    int-to-float v5, v5

    mul-float/2addr v8, v5

    int-to-float v5, p3

    iget v9, p0, Lcom/google/android/material/carousel/c;->g:F

    sub-float/2addr v5, v9

    cmpl-float v5, v8, v5

    if-gtz v5, :cond_2

    iget-object v5, p0, Lcom/google/android/material/carousel/c;->c:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    sub-int v5, p1, v5

    if-lt v3, v5, :cond_3

    :cond_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v7, p0, Lcom/google/android/material/carousel/c;->c:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    sub-int/2addr v8, v6

    invoke-static {v4, v2, v8}, Ls2/a;->c(III)I

    move-result v6

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/material/carousel/b;

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    add-int/lit8 p3, p1, -0x1

    move v3, v2

    :goto_3
    if-ltz p3, :cond_9

    if-eqz p4, :cond_5

    sub-int v4, p1, p3

    sub-int/2addr v4, v6

    goto :goto_4

    :cond_5
    move v4, p3

    :goto_4
    int-to-float v7, v4

    mul-float/2addr v7, v0

    if-eqz p4, :cond_6

    move v8, v5

    goto :goto_5

    :cond_6
    move v8, v6

    :goto_5
    int-to-float v8, v8

    mul-float/2addr v7, v8

    int-to-float v8, p2

    iget v9, p0, Lcom/google/android/material/carousel/c;->f:F

    add-float/2addr v8, v9

    cmpg-float v7, v7, v8

    if-ltz v7, :cond_7

    iget-object v7, p0, Lcom/google/android/material/carousel/c;->b:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge p3, v7, :cond_8

    :cond_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v7, p0, Lcom/google/android/material/carousel/c;->b:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    sub-int/2addr v8, v6

    invoke-static {v3, v2, v8}, Ls2/a;->c(III)I

    move-result v8

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/material/carousel/b;

    invoke-interface {v1, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    :cond_8
    add-int/lit8 p3, p3, -0x1

    goto :goto_3

    :cond_9
    return-object v1
.end method

.method public j(FFF)Lcom/google/android/material/carousel/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/material/carousel/c;->k(FFFZ)Lcom/google/android/material/carousel/b;

    move-result-object p1

    return-object p1
.end method

.method public k(FFFZ)Lcom/google/android/material/carousel/b;
    .locals 5

    iget v0, p0, Lcom/google/android/material/carousel/c;->f:F

    add-float/2addr v0, p2

    iget v1, p0, Lcom/google/android/material/carousel/c;->g:F

    sub-float v1, p3, v1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/c;->l()Lcom/google/android/material/carousel/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/material/carousel/b;->a()Lcom/google/android/material/carousel/b$c;

    move-result-object v2

    iget v2, v2, Lcom/google/android/material/carousel/b$c;->g:F

    invoke-virtual {p0}, Lcom/google/android/material/carousel/c;->h()Lcom/google/android/material/carousel/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/material/carousel/b;->h()Lcom/google/android/material/carousel/b$c;

    move-result-object v3

    iget v3, v3, Lcom/google/android/material/carousel/b$c;->h:F

    iget v4, p0, Lcom/google/android/material/carousel/c;->f:F

    cmpl-float v4, v4, v2

    if-nez v4, :cond_0

    add-float/2addr v0, v2

    :cond_0
    iget v2, p0, Lcom/google/android/material/carousel/c;->g:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_1

    sub-float/2addr v1, v3

    :cond_1
    cmpg-float v2, p1, v0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    if-gez v2, :cond_2

    invoke-static {v4, v3, p2, v0, p1}, Ljc/a;->b(FFFFF)F

    move-result p1

    iget-object p2, p0, Lcom/google/android/material/carousel/c;->b:Ljava/util/List;

    iget-object p3, p0, Lcom/google/android/material/carousel/c;->d:[F

    goto :goto_0

    :cond_2
    cmpl-float p2, p1, v1

    if-lez p2, :cond_4

    invoke-static {v3, v4, v1, p3, p1}, Ljc/a;->b(FFFFF)F

    move-result p1

    iget-object p2, p0, Lcom/google/android/material/carousel/c;->c:Ljava/util/List;

    iget-object p3, p0, Lcom/google/android/material/carousel/c;->e:[F

    :goto_0
    if-eqz p4, :cond_3

    invoke-virtual {p0, p2, p1, p3}, Lcom/google/android/material/carousel/c;->a(Ljava/util/List;F[F)Lcom/google/android/material/carousel/b;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {p2, p1, p3}, Lcom/google/android/material/carousel/c;->s(Ljava/util/List;F[F)Lcom/google/android/material/carousel/b;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/material/carousel/c;->a:Lcom/google/android/material/carousel/b;

    return-object p1
.end method

.method public l()Lcom/google/android/material/carousel/b;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/carousel/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/carousel/b;

    return-object v0
.end method
