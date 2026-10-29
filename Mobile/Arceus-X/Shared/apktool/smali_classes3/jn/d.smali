.class public final Ljn/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001b\u0010\u0008\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Ljn/c;",
        "Lfn/z;",
        "imageToAnalyze",
        "Landroid/graphics/Rect;",
        "a",
        "(Ljn/c;Lfn/z;)Landroid/graphics/Rect;",
        "",
        "degrees",
        "b",
        "(Landroid/graphics/Rect;I)Landroid/graphics/Rect;",
        "camera_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljn/c;Lfn/z;)Landroid/graphics/Rect;
    .locals 20
    .param p0    # Ljn/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lfn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageToAnalyze"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljn/c;->b()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {v1}, Ljn/c;->b()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-eqz v0, :cond_6

    if-nez v3, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-interface {v2}, Lfn/z;->d()I

    move-result v4

    const/16 v5, 0x10e

    const/16 v6, 0x5a

    if-eq v4, v6, :cond_2

    invoke-interface {v2}, Lfn/z;->d()I

    move-result v4

    if-ne v4, v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Lfn/z;->getWidth()I

    move-result v4

    invoke-interface {v2}, Lfn/z;->getHeight()I

    move-result v7

    goto :goto_1

    :cond_2
    :goto_0
    invoke-interface {v2}, Lfn/z;->getHeight()I

    move-result v4

    invoke-interface {v2}, Lfn/z;->getWidth()I

    move-result v7

    :goto_1
    int-to-double v8, v4

    int-to-double v10, v0

    div-double v12, v8, v10

    int-to-double v14, v7

    int-to-double v3, v3

    div-double v5, v14, v3

    invoke-static {v12, v13, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v16

    cmpl-double v5, v12, v5

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    const-wide/16 v18, 0x0

    if-lez v5, :cond_3

    mul-double v10, v10, v16

    sub-double/2addr v8, v10

    div-double/2addr v8, v12

    move-wide/from16 v14, v18

    move-wide/from16 v18, v8

    goto :goto_2

    :cond_3
    mul-double v3, v3, v16

    sub-double/2addr v14, v3

    div-double/2addr v14, v12

    :goto_2
    invoke-virtual {v1}, Ljn/c;->a()Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->left:I

    invoke-virtual {v1}, Ljn/c;->b()Landroid/graphics/Rect;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Rect;->left:I

    sub-int/2addr v3, v4

    int-to-double v3, v3

    mul-double v3, v3, v16

    add-double v3, v18, v3

    invoke-virtual {v1}, Ljn/c;->a()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1}, Ljn/c;->b()Landroid/graphics/Rect;

    move-result-object v6

    iget v6, v6, Landroid/graphics/Rect;->top:I

    sub-int/2addr v5, v6

    int-to-double v5, v5

    mul-double v5, v5, v16

    add-double/2addr v14, v5

    invoke-virtual {v1}, Ljn/c;->a()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-double v5, v5

    mul-double v5, v5, v16

    invoke-virtual {v1}, Ljn/c;->a()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-double v8, v1

    mul-double v8, v8, v16

    invoke-interface {v2}, Lfn/z;->d()I

    move-result v1

    const/16 v7, 0x5a

    if-eq v1, v7, :cond_5

    invoke-interface {v2}, Lfn/z;->d()I

    move-result v1

    const/16 v0, 0x10e

    if-ne v1, v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Landroid/graphics/Rect;

    double-to-int v1, v3

    double-to-int v2, v14

    add-double/2addr v3, v5

    double-to-int v3, v3

    add-double/2addr v14, v8

    double-to-int v4, v14

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_5
    :goto_3
    new-instance v0, Landroid/graphics/Rect;

    double-to-int v1, v14

    double-to-int v2, v3

    add-double/2addr v14, v8

    double-to-int v7, v14

    add-double/2addr v3, v5

    double-to-int v3, v3

    invoke-direct {v0, v1, v2, v7, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_6
    :goto_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public static final b(Landroid/graphics/Rect;I)Landroid/graphics/Rect;
    .locals 3
    .param p0    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x5a

    if-eq p1, v0, :cond_0

    const/16 v0, 0x10e

    if-eq p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Landroid/graphics/Rect;

    iget v0, p0, Landroid/graphics/Rect;->top:I

    iget v1, p0, Landroid/graphics/Rect;->left:I

    iget v2, p0, Landroid/graphics/Rect;->bottom:I

    iget p0, p0, Landroid/graphics/Rect;->right:I

    invoke-direct {p1, v0, v1, v2, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1
.end method
