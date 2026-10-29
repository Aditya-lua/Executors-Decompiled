.class public final Lqc/h;
.super Lqc/f;
.source "SourceFile"


# static fields
.field public static final d:[I

.field public static final e:[I


# instance fields
.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    filled-new-array {v0}, [I

    move-result-object v1

    sput-object v1, Lqc/h;->d:[I

    const/4 v1, 0x0

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lqc/h;->e:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lqc/f;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lqc/h;->c:I

    return-void
.end method


# virtual methods
.method public g(Lqc/b;Landroid/view/View;)Lcom/google/android/material/carousel/b;
    .locals 17
    .param p1    # Lqc/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Lqc/b;->b()I

    move-result v1

    int-to-float v1, v1

    invoke-interface/range {p1 .. p1}, Lqc/b;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface/range {p1 .. p1}, Lqc/b;->a()I

    move-result v1

    int-to-float v1, v1

    :cond_0
    move v2, v1

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$r;

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-interface/range {p1 .. p1}, Lqc/b;->f()Z

    move-result v5

    if-eqz v5, :cond_1

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v3, v1

    int-to-float v3, v3

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    int-to-float v4, v1

    :cond_1
    move v1, v3

    invoke-virtual {v0}, Lqc/f;->d()F

    move-result v3

    add-float/2addr v3, v1

    invoke-virtual {v0}, Lqc/f;->c()F

    move-result v5

    add-float/2addr v5, v1

    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    move-result v5

    add-float v6, v4, v1

    invoke-static {v6, v2}, Ljava/lang/Math;->min(FF)F

    move-result v9

    const/high16 v6, 0x40400000    # 3.0f

    div-float/2addr v4, v6

    add-float/2addr v4, v1

    add-float v6, v3, v1

    add-float v7, v5, v1

    invoke-static {v4, v6, v7}, Ls2/a;->b(FFF)F

    move-result v4

    add-float v6, v9, v4

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    sget-object v8, Lqc/h;->d:[I

    mul-float/2addr v7, v3

    cmpg-float v7, v2, v7

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-gez v7, :cond_2

    new-array v8, v11, [I

    aput v10, v8, v10

    :cond_2
    sget-object v7, Lqc/h;->e:[I

    invoke-interface/range {p1 .. p1}, Lqc/b;->d()I

    move-result v12

    if-ne v12, v11, :cond_3

    invoke-static {v8}, Lqc/f;->a([I)[I

    move-result-object v8

    invoke-static {v7}, Lqc/f;->a([I)[I

    move-result-object v7

    :cond_3
    move-object/from16 v16, v7

    move v7, v6

    move-object v6, v8

    move-object/from16 v8, v16

    invoke-static {v8}, Lcom/google/android/material/carousel/a;->i([I)I

    move-result v12

    int-to-float v12, v12

    mul-float/2addr v12, v7

    sub-float v12, v2, v12

    invoke-static {v6}, Lcom/google/android/material/carousel/a;->i([I)I

    move-result v13

    int-to-float v13, v13

    mul-float/2addr v13, v5

    sub-float/2addr v12, v13

    div-float/2addr v12, v9

    float-to-double v12, v12

    invoke-static {v12, v13}, Ljava/lang/Math;->floor(D)D

    move-result-wide v12

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->max(DD)D

    move-result-wide v12

    double-to-int v12, v12

    div-float v13, v2, v9

    float-to-double v13, v13

    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v13

    double-to-int v13, v13

    sub-int v12, v13, v12

    add-int/2addr v12, v11

    move v11, v10

    new-array v10, v12, [I

    :goto_0
    if-ge v11, v12, :cond_4

    sub-int v14, v13, v11

    aput v14, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_4
    move/from16 v16, v4

    move v4, v3

    move/from16 v3, v16

    invoke-static/range {v2 .. v10}, Lqc/a;->c(FFFF[IF[IF[I)Lqc/a;

    move-result-object v6

    invoke-virtual {v6}, Lqc/a;->e()I

    move-result v8

    iput v8, v0, Lqc/h;->c:I

    invoke-interface/range {p1 .. p1}, Lqc/b;->e()I

    move-result v8

    invoke-virtual {v0, v6, v8}, Lqc/h;->i(Lqc/a;I)Z

    move-result v8

    if-eqz v8, :cond_5

    iget v8, v6, Lqc/a;->c:I

    filled-new-array {v8}, [I

    move-result-object v8

    iget v10, v6, Lqc/a;->d:I

    filled-new-array {v10}, [I

    move-result-object v10

    iget v6, v6, Lqc/a;->g:I

    filled-new-array {v6}, [I

    move-result-object v6

    move-object/from16 v16, v10

    move-object v10, v6

    move-object v6, v8

    move-object/from16 v8, v16

    invoke-static/range {v2 .. v10}, Lqc/a;->c(FFFF[IF[IF[I)Lqc/a;

    move-result-object v6

    :cond_5
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-interface/range {p1 .. p1}, Lqc/b;->d()I

    move-result v4

    invoke-static {v3, v1, v2, v6, v4}, Lcom/google/android/material/carousel/a;->d(Landroid/content/Context;FFLqc/a;I)Lcom/google/android/material/carousel/b;

    move-result-object v1

    return-object v1
.end method

.method public h(Lqc/b;I)Z
    .locals 2

    iget v0, p0, Lqc/h;->c:I

    if-ge p2, v0, :cond_0

    invoke-interface {p1}, Lqc/b;->e()I

    move-result v0

    iget v1, p0, Lqc/h;->c:I

    if-ge v0, v1, :cond_1

    :cond_0
    iget v0, p0, Lqc/h;->c:I

    if-lt p2, v0, :cond_2

    invoke-interface {p1}, Lqc/b;->e()I

    move-result p1

    iget p2, p0, Lqc/h;->c:I

    if-ge p1, p2, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public i(Lqc/a;I)Z
    .locals 3

    invoke-virtual {p1}, Lqc/a;->e()I

    move-result v0

    sub-int/2addr v0, p2

    const/4 p2, 0x1

    if-lez v0, :cond_1

    iget v1, p1, Lqc/a;->c:I

    if-gtz v1, :cond_0

    iget v1, p1, Lqc/a;->d:I

    if-le v1, p2, :cond_1

    :cond_0
    move v1, p2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-lez v0, :cond_4

    iget v2, p1, Lqc/a;->c:I

    if-lez v2, :cond_2

    add-int/lit8 v2, v2, -0x1

    iput v2, p1, Lqc/a;->c:I

    goto :goto_1

    :cond_2
    iget v2, p1, Lqc/a;->d:I

    if-le v2, p2, :cond_3

    add-int/lit8 v2, v2, -0x1

    iput v2, p1, Lqc/a;->d:I

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    return v1
.end method
