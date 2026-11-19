.class public final Lvo/g3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Landroid/content/Context;",
        "Lvo/y3$f;",
        "overlay",
        "Lvo/d3$e;",
        "captureSide",
        "Lvo/j3;",
        "b",
        "(Landroid/content/Context;Lvo/y3$f;Lvo/d3$e;)Lvo/j3;",
        "",
        "attr",
        "Landroid/graphics/drawable/GradientDrawable;",
        "a",
        "(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;",
        "government-id_release"
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
.method public static final a(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;
    .locals 9
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Ljq/c;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Ljq/c;->d:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sget v2, Ljq/b;->e:I

    invoke-static {p0, v2}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result v2

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move v4, p1

    invoke-static/range {v3 .. v8}, Lxq/z;->f(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    sget-object p1, Ljq/i;->a:[I

    const-string v4, "Pi2IdFrame"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    sget p1, Ljq/i;->b:I

    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    sget p1, Ljq/i;->d:I

    invoke-virtual {p0, p1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    sget p1, Ljq/i;->c:I

    invoke-virtual {p0, p1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    new-instance p0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {p0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    return-object p0
.end method

.method public static final b(Landroid/content/Context;Lvo/y3$f;Lvo/d3$e;)Lvo/j3;
    .locals 8
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lvo/y3$f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lvo/d3$e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overlay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "captureSide"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvo/y3$f$e;->a:Lvo/y3$f$e;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget p2, Lvo/p3;->c:I

    goto :goto_1

    :cond_0
    sget-object v1, Lvo/y3$f$a;->a:Lvo/y3$f$a;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget p2, Lvo/p3;->a:I

    goto :goto_1

    :cond_1
    sget-object v1, Lvo/y3$f$b;->a:Lvo/y3$f$b;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    instance-of v1, p1, Lvo/y3$f$c;

    if-nez v1, :cond_3

    sget-object v1, Lvo/y3$f$d;->a:Lvo/y3$f$d;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lvo/y3$f$f;->a:Lvo/y3$f$f;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0

    :cond_3
    :goto_0
    sget-object v1, Lvo/d3$e;->e:Lvo/d3$e;

    if-ne p2, v1, :cond_4

    sget p2, Lvo/p3;->a:I

    goto :goto_1

    :cond_4
    sget p2, Lvo/p3;->b:I

    :goto_1
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget v1, Lvo/m3;->j:I

    goto :goto_3

    :cond_5
    sget-object v1, Lvo/y3$f$a;->a:Lvo/y3$f$a;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget v1, Lvo/m3;->a:I

    goto :goto_3

    :cond_6
    sget-object v1, Lvo/y3$f$f;->a:Lvo/y3$f$f;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget v1, Lvo/m3;->b:I

    goto :goto_3

    :cond_7
    sget-object v1, Lvo/y3$f$b;->a:Lvo/y3$f$b;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    sget v1, Lvo/m3;->f:I

    goto :goto_3

    :cond_8
    instance-of v1, p1, Lvo/y3$f$c;

    if-nez v1, :cond_a

    sget-object v1, Lvo/y3$f$d;->a:Lvo/y3$f$d;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_2

    :cond_9
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0

    :cond_a
    :goto_2
    sget v1, Lvo/m3;->g:I

    :goto_3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget p1, Ljq/a;->j:I

    :goto_4
    move v3, p1

    goto :goto_6

    :cond_b
    sget-object v0, Lvo/y3$f$a;->a:Lvo/y3$f$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget p1, Ljq/a;->f:I

    goto :goto_4

    :cond_c
    sget-object v0, Lvo/y3$f$b;->a:Lvo/y3$f$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    instance-of v0, p1, Lvo/y3$f$c;

    if-nez v0, :cond_e

    sget-object v0, Lvo/y3$f$d;->a:Lvo/y3$f$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    sget-object v0, Lvo/y3$f$f;->a:Lvo/y3$f$f;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_5

    :cond_d
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0

    :cond_e
    :goto_5
    sget p1, Ljq/a;->i:I

    goto :goto_4

    :goto_6
    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lxq/z;->f(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_f

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    sget-object p1, Ljq/i;->e:[I

    const-string v0, "Pi2IdFrameGuideAssets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    sget p1, Ljq/i;->f:I

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    sget p1, Ljq/i;->g:I

    invoke-virtual {p0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    :cond_f
    new-instance p0, Lvo/j3;

    invoke-direct {p0, p2, v1}, Lvo/j3;-><init>(II)V

    return-object p0
.end method
