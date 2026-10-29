.class public Ln7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[F

.field public final b:[I


# direct methods
.method public constructor <init>([F[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/d;->a:[F

    iput-object p2, p0, Ln7/d;->b:[I

    return-void
.end method


# virtual methods
.method public final a(Ln7/d;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Ln7/d;->b:[I

    array-length v2, v1

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Ln7/d;->a:[F

    iget-object v3, p1, Ln7/d;->a:[F

    aget v3, v3, v0

    aput v3, v2, v0

    iget-object v2, p0, Ln7/d;->b:[I

    aget v1, v1, v0

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b([F)Ln7/d;
    .locals 3

    array-length v0, p1

    new-array v0, v0, [I

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    aget v2, p1, v1

    invoke-virtual {p0, v2}, Ln7/d;->c(F)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ln7/d;

    invoke-direct {v1, p1, v0}, Ln7/d;-><init>([F[I)V

    return-object v1
.end method

.method public final c(F)I
    .locals 5

    iget-object v0, p0, Ln7/d;->a:[F

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object p1, p0, Ln7/d;->b:[I

    aget p1, p1, v0

    return p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    if-nez v0, :cond_1

    iget-object p1, p0, Ln7/d;->b:[I

    const/4 v0, 0x0

    aget p1, p1, v0

    return p1

    :cond_1
    iget-object v1, p0, Ln7/d;->b:[I

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    if-ne v0, v2, :cond_2

    array-length p1, v1

    add-int/lit8 p1, p1, -0x1

    aget p1, v1, p1

    return p1

    :cond_2
    iget-object v2, p0, Ln7/d;->a:[F

    add-int/lit8 v3, v0, -0x1

    aget v4, v2, v3

    aget v2, v2, v0

    aget v3, v1, v3

    aget v0, v1, v0

    sub-float/2addr p1, v4

    sub-float/2addr v2, v4

    div-float/2addr p1, v2

    invoke-static {p1, v3, v0}, Ls7/c;->c(FII)I

    move-result p1

    return p1
.end method

.method public d()[I
    .locals 1

    iget-object v0, p0, Ln7/d;->b:[I

    return-object v0
.end method

.method public e()[F
    .locals 1

    iget-object v0, p0, Ln7/d;->a:[F

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ln7/d;

    iget-object v2, p0, Ln7/d;->a:[F

    iget-object v3, p1, Ln7/d;->a:[F

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([F[F)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ln7/d;->b:[I

    iget-object p1, p1, Ln7/d;->b:[I

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Ln7/d;->b:[I

    array-length v0, v0

    return v0
.end method

.method public g(Ln7/d;Ln7/d;F)V
    .locals 4

    invoke-virtual {p1, p2}, Ln7/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ln7/d;->a(Ln7/d;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gtz v0, :cond_1

    invoke-virtual {p0, p1}, Ln7/d;->a(Ln7/d;)V

    return-void

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p3, v0

    if-ltz v0, :cond_2

    invoke-virtual {p0, p2}, Ln7/d;->a(Ln7/d;)V

    return-void

    :cond_2
    iget-object v0, p1, Ln7/d;->b:[I

    array-length v0, v0

    iget-object v1, p2, Ln7/d;->b:[I

    array-length v1, v1

    if-ne v0, v1, :cond_5

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Ln7/d;->b:[I

    array-length v2, v1

    if-ge v0, v2, :cond_3

    iget-object v1, p0, Ln7/d;->a:[F

    iget-object v2, p1, Ln7/d;->a:[F

    aget v2, v2, v0

    iget-object v3, p2, Ln7/d;->a:[F

    aget v3, v3, v0

    invoke-static {v2, v3, p3}, Ls7/j;->i(FFF)F

    move-result v2

    aput v2, v1, v0

    iget-object v1, p0, Ln7/d;->b:[I

    iget-object v2, p1, Ln7/d;->b:[I

    aget v2, v2, v0

    iget-object v3, p2, Ln7/d;->b:[I

    aget v3, v3, v0

    invoke-static {p3, v2, v3}, Ls7/c;->c(FII)I

    move-result v2

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    array-length p2, v1

    :goto_1
    iget-object p3, p0, Ln7/d;->a:[F

    array-length v0, p3

    if-ge p2, v0, :cond_4

    iget-object v0, p1, Ln7/d;->b:[I

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget v1, p3, v1

    aput v1, p3, p2

    iget-object p3, p0, Ln7/d;->b:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    aget v0, p3, v0

    aput v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_4
    return-void

    :cond_5
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot interpolate between gradients. Lengths vary ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ln7/d;->b:[I

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " vs "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p2, Ln7/d;->b:[I

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ln7/d;->a:[F

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ln7/d;->b:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
