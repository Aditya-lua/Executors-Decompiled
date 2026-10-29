.class public Lo5/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[J

.field public b:[F

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x14

    new-array v1, v0, [J

    iput-object v1, p0, Lo5/g0;->a:[J

    new-array v0, v0, [F

    iput-object v0, p0, Lo5/g0;->b:[F

    const/4 v0, 0x0

    iput v0, p0, Lo5/g0;->c:I

    const-wide/high16 v2, -0x8000000000000000L

    invoke-static {v1, v2, v3}, Ljava/util/Arrays;->fill([JJ)V

    return-void
.end method


# virtual methods
.method public a(JF)V
    .locals 2

    iget v0, p0, Lo5/g0;->c:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v0, v0, 0x14

    iput v0, p0, Lo5/g0;->c:I

    iget-object v1, p0, Lo5/g0;->a:[J

    aput-wide p1, v1, v0

    iget-object p1, p0, Lo5/g0;->b:[F

    aput p3, p1, v0

    return-void
.end method

.method public b()F
    .locals 15

    iget v0, p0, Lo5/g0;->c:I

    const-wide/high16 v1, -0x8000000000000000L

    const/4 v3, 0x0

    if-nez v0, :cond_0

    iget-object v4, p0, Lo5/g0;->a:[J

    aget-wide v5, v4, v0

    cmp-long v4, v5, v1

    if-nez v4, :cond_0

    return v3

    :cond_0
    iget-object v4, p0, Lo5/g0;->a:[J

    aget-wide v5, v4, v0

    const/4 v4, 0x0

    move-wide v7, v5

    :goto_0
    iget-object v9, p0, Lo5/g0;->a:[J

    aget-wide v10, v9, v0

    cmp-long v9, v10, v1

    const/16 v12, 0x14

    if-nez v9, :cond_1

    goto :goto_1

    :cond_1
    sub-long v13, v5, v10

    long-to-float v9, v13

    sub-long v7, v10, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    long-to-float v7, v7

    const/high16 v8, 0x42c80000    # 100.0f

    cmpl-float v8, v9, v8

    if-gtz v8, :cond_5

    const/high16 v8, 0x42200000    # 40.0f

    cmpl-float v7, v7, v8

    if-lez v7, :cond_2

    goto :goto_1

    :cond_2
    if-nez v0, :cond_3

    move v0, v12

    :cond_3
    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v4, v4, 0x1

    if-lt v4, v12, :cond_4

    goto :goto_1

    :cond_4
    move-wide v7, v10

    goto :goto_0

    :cond_5
    :goto_1
    const/4 v0, 0x2

    if-ge v4, v0, :cond_6

    return v3

    :cond_6
    const/high16 v1, 0x447a0000    # 1000.0f

    if-ne v4, v0, :cond_9

    iget v0, p0, Lo5/g0;->c:I

    if-nez v0, :cond_7

    const/16 v2, 0x13

    goto :goto_2

    :cond_7
    add-int/lit8 v2, v0, -0x1

    :goto_2
    iget-object v4, p0, Lo5/g0;->a:[J

    aget-wide v5, v4, v0

    aget-wide v7, v4, v2

    sub-long/2addr v5, v7

    long-to-float v4, v5

    cmpl-float v5, v4, v3

    if-nez v5, :cond_8

    return v3

    :cond_8
    iget-object v3, p0, Lo5/g0;->b:[F

    aget v0, v3, v0

    aget v2, v3, v2

    sub-float/2addr v0, v2

    div-float/2addr v0, v4

    :goto_3
    mul-float/2addr v0, v1

    return v0

    :cond_9
    iget v0, p0, Lo5/g0;->c:I

    sub-int v2, v0, v4

    add-int/lit8 v2, v2, 0x15

    rem-int/2addr v2, v12

    add-int/lit8 v0, v0, 0x15

    rem-int/2addr v0, v12

    iget-object v4, p0, Lo5/g0;->a:[J

    aget-wide v5, v4, v2

    iget-object v4, p0, Lo5/g0;->b:[F

    aget v4, v4, v2

    add-int/lit8 v2, v2, 0x1

    rem-int/lit8 v7, v2, 0x14

    move v8, v3

    :goto_4
    if-eq v7, v0, :cond_c

    iget-object v9, p0, Lo5/g0;->a:[J

    aget-wide v10, v9, v7

    sub-long v13, v10, v5

    long-to-float v9, v13

    cmpl-float v13, v9, v3

    if-nez v13, :cond_a

    goto :goto_5

    :cond_a
    iget-object v5, p0, Lo5/g0;->b:[F

    aget v5, v5, v7

    invoke-virtual {p0, v8}, Lo5/g0;->c(F)F

    move-result v6

    sub-float v4, v5, v4

    div-float/2addr v4, v9

    sub-float v6, v4, v6

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    mul-float/2addr v6, v4

    add-float/2addr v8, v6

    if-ne v7, v2, :cond_b

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v8, v4

    :cond_b
    move v4, v5

    move-wide v5, v10

    :goto_5
    add-int/lit8 v7, v7, 0x1

    rem-int/2addr v7, v12

    goto :goto_4

    :cond_c
    invoke-virtual {p0, v8}, Lo5/g0;->c(F)F

    move-result v0

    goto :goto_3
.end method

.method public final c(F)F
    .locals 4

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result v0

    float-to-double v0, v0

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    mul-float/2addr p1, v2

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method
