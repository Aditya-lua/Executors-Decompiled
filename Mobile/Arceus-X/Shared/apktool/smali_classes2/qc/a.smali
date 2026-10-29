.class public final Lqc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public b:F

.field public c:I

.field public d:I

.field public e:F

.field public f:F

.field public final g:I

.field public final h:F


# direct methods
.method public constructor <init>(IFFFIFIFIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lqc/a;->a:I

    invoke-static {p2, p3, p4}, Ls2/a;->b(FFF)F

    move-result p1

    iput p1, p0, Lqc/a;->b:F

    iput p5, p0, Lqc/a;->c:I

    iput p6, p0, Lqc/a;->e:F

    iput p7, p0, Lqc/a;->d:I

    iput p8, p0, Lqc/a;->f:F

    iput p9, p0, Lqc/a;->g:I

    invoke-virtual {p0, p10, p3, p4, p8}, Lqc/a;->d(FFFF)V

    invoke-virtual {p0, p8}, Lqc/a;->b(F)F

    move-result p1

    iput p1, p0, Lqc/a;->h:F

    return-void
.end method

.method public static c(FFFF[IF[IF[I)Lqc/a;
    .locals 22

    move-object/from16 v0, p4

    move-object/from16 v1, p6

    move-object/from16 v2, p8

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v3, :cond_5

    aget v17, v2, v7

    array-length v8, v1

    move v9, v6

    :goto_1
    if-ge v9, v8, :cond_4

    aget v15, v1, v9

    array-length v10, v0

    move v11, v6

    :goto_2
    if-ge v11, v10, :cond_3

    aget v13, v0, v11

    move v12, v8

    new-instance v8, Lqc/a;

    move v14, v9

    move v9, v5

    move v5, v14

    move/from16 v18, p0

    move/from16 v14, p5

    move/from16 v16, p7

    move/from16 v20, v10

    move/from16 v21, v11

    move/from16 v19, v12

    move/from16 v10, p1

    move/from16 v11, p2

    move/from16 v12, p3

    invoke-direct/range {v8 .. v18}, Lqc/a;-><init>(IFFFIFIFIF)V

    if-eqz v4, :cond_0

    iget v10, v8, Lqc/a;->h:F

    iget v11, v4, Lqc/a;->h:F

    cmpg-float v10, v10, v11

    if-gez v10, :cond_2

    :cond_0
    iget v4, v8, Lqc/a;->h:F

    const/4 v10, 0x0

    cmpl-float v4, v4, v10

    if-nez v4, :cond_1

    return-object v8

    :cond_1
    move-object v4, v8

    :cond_2
    add-int/lit8 v8, v9, 0x1

    add-int/lit8 v11, v21, 0x1

    move v9, v5

    move v5, v8

    move/from16 v8, v19

    move/from16 v10, v20

    goto :goto_2

    :cond_3
    move/from16 v19, v9

    move v9, v5

    move/from16 v5, v19

    move/from16 v19, v8

    add-int/lit8 v5, v5, 0x1

    move v8, v9

    move v9, v5

    move v5, v8

    move/from16 v8, v19

    goto :goto_1

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    return-object v4
.end method


# virtual methods
.method public final a(FIFII)F
    .locals 1

    if-lez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    int-to-float p2, p2

    int-to-float p4, p4

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p4, v0

    add-float/2addr p2, p4

    mul-float/2addr p2, p3

    sub-float/2addr p1, p2

    int-to-float p2, p5

    add-float/2addr p2, p4

    div-float/2addr p1, p2

    return p1
.end method

.method public final b(F)F
    .locals 1

    invoke-virtual {p0}, Lqc/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    return p1

    :cond_0
    iget v0, p0, Lqc/a;->f:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v0, p0, Lqc/a;->a:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    return p1
.end method

.method public final d(FFFF)V
    .locals 9

    invoke-virtual {p0}, Lqc/a;->f()F

    move-result v0

    sub-float v0, p1, v0

    iget v1, p0, Lqc/a;->c:I

    const/4 v2, 0x0

    if-lez v1, :cond_0

    cmpl-float v3, v0, v2

    if-lez v3, :cond_0

    iget p2, p0, Lqc/a;->b:F

    int-to-float v1, v1

    div-float/2addr v0, v1

    sub-float/2addr p3, p2

    invoke-static {v0, p3}, Ljava/lang/Math;->min(FF)F

    move-result p3

    add-float/2addr p2, p3

    iput p2, p0, Lqc/a;->b:F

    goto :goto_0

    :cond_0
    if-lez v1, :cond_1

    cmpg-float p3, v0, v2

    if-gez p3, :cond_1

    iget p3, p0, Lqc/a;->b:F

    int-to-float v1, v1

    div-float/2addr v0, v1

    sub-float/2addr p2, p3

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    add-float/2addr p3, p2

    iput p3, p0, Lqc/a;->b:F

    :cond_1
    :goto_0
    iget v5, p0, Lqc/a;->c:I

    if-lez v5, :cond_2

    iget p2, p0, Lqc/a;->b:F

    move v6, p2

    goto :goto_1

    :cond_2
    move v6, v2

    :goto_1
    iput v6, p0, Lqc/a;->b:F

    iget v7, p0, Lqc/a;->d:I

    iget v8, p0, Lqc/a;->g:I

    move-object v3, p0

    move v4, p1

    invoke-virtual/range {v3 .. v8}, Lqc/a;->a(FIFII)F

    move-result p1

    iput p1, v3, Lqc/a;->f:F

    iget p2, v3, Lqc/a;->b:F

    add-float/2addr p2, p1

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    iput p2, v3, Lqc/a;->e:F

    iget p3, v3, Lqc/a;->d:I

    if-lez p3, :cond_4

    cmpl-float v0, p1, p4

    if-eqz v0, :cond_4

    sub-float/2addr p4, p1

    iget p1, v3, Lqc/a;->g:I

    int-to-float p1, p1

    mul-float/2addr p4, p1

    const p1, 0x3dcccccd    # 0.1f

    mul-float/2addr p2, p1

    int-to-float p1, p3

    mul-float/2addr p2, p1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    cmpl-float p2, p4, v2

    if-lez p2, :cond_3

    iget p2, v3, Lqc/a;->e:F

    iget p3, v3, Lqc/a;->d:I

    int-to-float p3, p3

    div-float p3, p1, p3

    sub-float/2addr p2, p3

    iput p2, v3, Lqc/a;->e:F

    iget p2, v3, Lqc/a;->f:F

    iget p3, v3, Lqc/a;->g:I

    int-to-float p3, p3

    div-float/2addr p1, p3

    add-float/2addr p2, p1

    iput p2, v3, Lqc/a;->f:F

    return-void

    :cond_3
    iget p2, v3, Lqc/a;->e:F

    iget p3, v3, Lqc/a;->d:I

    int-to-float p3, p3

    div-float p3, p1, p3

    add-float/2addr p2, p3

    iput p2, v3, Lqc/a;->e:F

    iget p2, v3, Lqc/a;->f:F

    iget p3, v3, Lqc/a;->g:I

    int-to-float p3, p3

    div-float/2addr p1, p3

    sub-float/2addr p2, p1

    iput p2, v3, Lqc/a;->f:F

    :cond_4
    return-void
.end method

.method public e()I
    .locals 2

    iget v0, p0, Lqc/a;->c:I

    iget v1, p0, Lqc/a;->d:I

    add-int/2addr v0, v1

    iget v1, p0, Lqc/a;->g:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final f()F
    .locals 3

    iget v0, p0, Lqc/a;->f:F

    iget v1, p0, Lqc/a;->g:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    iget v1, p0, Lqc/a;->e:F

    iget v2, p0, Lqc/a;->d:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lqc/a;->b:F

    iget v2, p0, Lqc/a;->c:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method public final g()Z
    .locals 4

    iget v0, p0, Lqc/a;->g:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_1

    iget v3, p0, Lqc/a;->c:I

    if-lez v3, :cond_1

    iget v3, p0, Lqc/a;->d:I

    if-lez v3, :cond_1

    iget v0, p0, Lqc/a;->f:F

    iget v3, p0, Lqc/a;->e:F

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    iget v0, p0, Lqc/a;->b:F

    cmpl-float v0, v3, v0

    if-lez v0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    if-lez v0, :cond_3

    iget v0, p0, Lqc/a;->c:I

    if-lez v0, :cond_3

    iget v0, p0, Lqc/a;->f:F

    iget v3, p0, Lqc/a;->b:F

    cmpl-float v0, v0, v3

    if-lez v0, :cond_2

    return v2

    :cond_2
    return v1

    :cond_3
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Arrangement [priority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqc/a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", smallCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqc/a;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", smallSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqc/a;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mediumCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqc/a;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mediumSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqc/a;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", largeCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqc/a;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", largeSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqc/a;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", cost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqc/a;->h:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
