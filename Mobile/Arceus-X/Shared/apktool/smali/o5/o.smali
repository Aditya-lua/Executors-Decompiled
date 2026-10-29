.class public Lo5/o;
.super Lo5/p0;
.source "SourceFile"


# instance fields
.field public b:F

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lo5/p0;-><init>()V

    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, Lo5/o;->b:F

    const/16 v0, 0x50

    iput v0, p0, Lo5/o;->c:I

    return-void
.end method


# virtual methods
.method public c(Landroid/view/ViewGroup;Lo5/q;Lo5/d0;Lo5/d0;)J
    .locals 14
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object/from16 v1, p3

    const-wide/16 v10, 0x0

    if-nez v1, :cond_0

    if-nez p4, :cond_0

    return-wide v10

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lo5/q;->A()Landroid/graphics/Rect;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz p4, :cond_2

    invoke-virtual {p0, v1}, Lo5/p0;->e(Lo5/d0;)I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v1, p4

    move v12, v3

    :goto_0
    move-object v4, v2

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v4, -0x1

    move v12, v4

    goto :goto_0

    :goto_2
    invoke-virtual {p0, v1}, Lo5/p0;->f(Lo5/d0;)I

    move-result v2

    invoke-virtual {p0, v1}, Lo5/p0;->g(Lo5/d0;)I

    move-result v1

    const/4 v5, 0x2

    new-array v6, v5, [I

    move-object v7, p1

    invoke-virtual {p1, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v8, 0x0

    aget v8, v6, v8

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v9

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    add-int/2addr v8, v9

    aget v3, v6, v3

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    add-int/2addr v3, v6

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v6

    add-int/2addr v6, v8

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v9

    add-int/2addr v9, v3

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/graphics/Rect;->centerX()I

    move-result v5

    invoke-virtual {v4}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    move v0, v3

    move v3, v1

    move-object v1, v7

    move v7, v0

    move v0, v5

    move v5, v4

    move v4, v0

    :goto_3
    move v0, v8

    move v8, v6

    move v6, v0

    move-object v0, p0

    goto :goto_4

    :cond_3
    add-int v4, v8, v6

    div-int/2addr v4, v5

    add-int v13, v3, v9

    div-int/lit8 v5, v13, 0x2

    move v0, v3

    move v3, v1

    move-object v1, v7

    move v7, v0

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v9}, Lo5/o;->h(Landroid/view/View;IIIIIIII)I

    move-result v2

    int-to-float v1, v2

    invoke-virtual/range {p0 .. p1}, Lo5/o;->i(Landroid/view/ViewGroup;)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual/range {p2 .. p2}, Lo5/q;->z()J

    move-result-wide v2

    cmp-long v4, v2, v10

    if-gez v4, :cond_4

    const-wide/16 v2, 0x12c

    :cond_4
    int-to-long v4, v12

    mul-long/2addr v2, v4

    long-to-float v2, v2

    iget v3, p0, Lo5/o;->b:F

    div-float/2addr v2, v3

    mul-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-long v1, v1

    return-wide v1
.end method

.method public final h(Landroid/view/View;IIIIIIII)I
    .locals 5

    iget v0, p0, Lo5/o;->c:I

    const v1, 0x800003

    const/4 v2, 0x1

    const/4 v3, 0x3

    const/4 v4, 0x5

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result p1

    if-ne p1, v2, :cond_1

    :cond_0
    move v0, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v3

    goto :goto_1

    :cond_2
    const v1, 0x800005

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result p1

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_3
    :goto_1
    if-eq v0, v3, :cond_7

    if-eq v0, v4, :cond_6

    const/16 p1, 0x30

    if-eq v0, p1, :cond_5

    const/16 p1, 0x50

    if-eq v0, p1, :cond_4

    const/4 p1, 0x0

    return p1

    :cond_4
    sub-int/2addr p3, p7

    sub-int/2addr p4, p2

    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result p1

    add-int/2addr p3, p1

    return p3

    :cond_5
    sub-int/2addr p9, p3

    sub-int/2addr p4, p2

    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result p1

    add-int/2addr p9, p1

    return p9

    :cond_6
    sub-int/2addr p2, p6

    sub-int/2addr p5, p3

    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    move-result p1

    add-int/2addr p2, p1

    return p2

    :cond_7
    sub-int/2addr p8, p2

    sub-int/2addr p5, p3

    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    move-result p1

    add-int/2addr p8, p1

    return p8
.end method

.method public final i(Landroid/view/ViewGroup;)I
    .locals 2

    iget v0, p0, Lo5/o;->c:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const v1, 0x800003

    if-eq v0, v1, :cond_0

    const v1, 0x800005

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    return p1
.end method

.method public j(I)V
    .locals 0

    iput p1, p0, Lo5/o;->c:I

    return-void
.end method
