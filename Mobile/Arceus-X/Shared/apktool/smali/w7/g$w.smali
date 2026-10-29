.class public Lw7/g$w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/g$x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "w"
.end annotation


# instance fields
.field public a:[B

.field public b:I

.field public c:[F

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lw7/g$w;->b:I

    iput v0, p0, Lw7/g$w;->d:I

    const/16 v0, 0x8

    new-array v0, v0, [B

    iput-object v0, p0, Lw7/g$w;->a:[B

    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lw7/g$w;->c:[F

    return-void
.end method


# virtual methods
.method public a(FFFF)V
    .locals 4

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lw7/g$w;->f(B)V

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lw7/g$w;->g(I)V

    iget-object v1, p0, Lw7/g$w;->c:[F

    iget v2, p0, Lw7/g$w;->d:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lw7/g$w;->d:I

    aput p1, v1, v2

    add-int/lit8 p1, v2, 0x2

    iput p1, p0, Lw7/g$w;->d:I

    aput p2, v1, v3

    add-int/lit8 p2, v2, 0x3

    iput p2, p0, Lw7/g$w;->d:I

    aput p3, v1, p1

    add-int/2addr v2, v0

    iput v2, p0, Lw7/g$w;->d:I

    aput p4, v1, p2

    return-void
.end method

.method public b(FF)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lw7/g$w;->f(B)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lw7/g$w;->g(I)V

    iget-object v1, p0, Lw7/g$w;->c:[F

    iget v2, p0, Lw7/g$w;->d:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lw7/g$w;->d:I

    aput p1, v1, v2

    add-int/2addr v2, v0

    iput v2, p0, Lw7/g$w;->d:I

    aput p2, v1, v3

    return-void
.end method

.method public c(FFFFFF)V
    .locals 4

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lw7/g$w;->f(B)V

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lw7/g$w;->g(I)V

    iget-object v1, p0, Lw7/g$w;->c:[F

    iget v2, p0, Lw7/g$w;->d:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lw7/g$w;->d:I

    aput p1, v1, v2

    add-int/lit8 p1, v2, 0x2

    iput p1, p0, Lw7/g$w;->d:I

    aput p2, v1, v3

    add-int/lit8 p2, v2, 0x3

    iput p2, p0, Lw7/g$w;->d:I

    aput p3, v1, p1

    add-int/lit8 p1, v2, 0x4

    iput p1, p0, Lw7/g$w;->d:I

    aput p4, v1, p2

    add-int/lit8 p2, v2, 0x5

    iput p2, p0, Lw7/g$w;->d:I

    aput p5, v1, p1

    add-int/2addr v2, v0

    iput v2, p0, Lw7/g$w;->d:I

    aput p6, v1, p2

    return-void
.end method

.method public close()V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lw7/g$w;->f(B)V

    return-void
.end method

.method public d(FFFZZFF)V
    .locals 2

    if-eqz p4, :cond_0

    const/4 p4, 0x2

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    or-int/lit8 p4, p4, 0x4

    or-int/2addr p4, p5

    int-to-byte p4, p4

    invoke-virtual {p0, p4}, Lw7/g$w;->f(B)V

    const/4 p4, 0x5

    invoke-virtual {p0, p4}, Lw7/g$w;->g(I)V

    iget-object p5, p0, Lw7/g$w;->c:[F

    iget v0, p0, Lw7/g$w;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lw7/g$w;->d:I

    aput p1, p5, v0

    add-int/lit8 p1, v0, 0x2

    iput p1, p0, Lw7/g$w;->d:I

    aput p2, p5, v1

    add-int/lit8 p2, v0, 0x3

    iput p2, p0, Lw7/g$w;->d:I

    aput p3, p5, p1

    add-int/lit8 p1, v0, 0x4

    iput p1, p0, Lw7/g$w;->d:I

    aput p6, p5, p2

    add-int/2addr v0, p4

    iput v0, p0, Lw7/g$w;->d:I

    aput p7, p5, p1

    return-void
.end method

.method public e(FF)V
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lw7/g$w;->f(B)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lw7/g$w;->g(I)V

    iget-object v1, p0, Lw7/g$w;->c:[F

    iget v2, p0, Lw7/g$w;->d:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lw7/g$w;->d:I

    aput p1, v1, v2

    add-int/2addr v2, v0

    iput v2, p0, Lw7/g$w;->d:I

    aput p2, v1, v3

    return-void
.end method

.method public final f(B)V
    .locals 4

    iget v0, p0, Lw7/g$w;->b:I

    iget-object v1, p0, Lw7/g$w;->a:[B

    array-length v2, v1

    if-ne v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lw7/g$w;->a:[B

    :cond_0
    iget-object v0, p0, Lw7/g$w;->a:[B

    iget v1, p0, Lw7/g$w;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lw7/g$w;->b:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public final g(I)V
    .locals 3

    iget-object v0, p0, Lw7/g$w;->c:[F

    array-length v1, v0

    iget v2, p0, Lw7/g$w;->d:I

    add-int/2addr v2, p1

    if-ge v1, v2, :cond_0

    array-length p1, v0

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [F

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p1, p0, Lw7/g$w;->c:[F

    :cond_0
    return-void
.end method

.method public h(Lw7/g$x;)V
    .locals 12

    const/4 v8, 0x0

    move v0, v8

    move v9, v0

    :goto_0
    iget v1, p0, Lw7/g$w;->b:I

    if-ge v9, v1, :cond_7

    iget-object v1, p0, Lw7/g$w;->a:[B

    aget-byte v1, v1, v9

    if-eqz v1, :cond_6

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    const/4 v3, 0x3

    if-eq v1, v3, :cond_3

    const/16 v3, 0x8

    if-eq v1, v3, :cond_2

    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_0

    move v4, v2

    goto :goto_1

    :cond_0
    move v4, v8

    :goto_1
    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    move v5, v2

    goto :goto_2

    :cond_1
    move v5, v8

    :goto_2
    iget-object v1, p0, Lw7/g$w;->c:[F

    add-int/lit8 v2, v0, 0x1

    move-object v3, v1

    aget v1, v3, v0

    add-int/lit8 v6, v0, 0x2

    aget v2, v3, v2

    add-int/lit8 v7, v0, 0x3

    aget v6, v3, v6

    add-int/lit8 v10, v0, 0x4

    aget v7, v3, v7

    add-int/lit8 v11, v0, 0x5

    aget v0, v3, v10

    move v3, v6

    move v6, v7

    move v7, v0

    move-object v0, p1

    invoke-interface/range {v0 .. v7}, Lw7/g$x;->d(FFFZZFF)V

    move v0, v11

    goto :goto_3

    :cond_2
    invoke-interface {p1}, Lw7/g$x;->close()V

    goto :goto_3

    :cond_3
    iget-object v2, p0, Lw7/g$w;->c:[F

    add-int/lit8 v3, v0, 0x1

    aget v4, v2, v0

    add-int/lit8 v5, v0, 0x2

    aget v3, v2, v3

    add-int/lit8 v6, v0, 0x3

    aget v5, v2, v5

    add-int/lit8 v0, v0, 0x4

    aget v2, v2, v6

    invoke-interface {p1, v4, v3, v5, v2}, Lw7/g$x;->a(FFFF)V

    goto :goto_3

    :cond_4
    iget-object v2, p0, Lw7/g$w;->c:[F

    add-int/lit8 v3, v0, 0x1

    aget v1, v2, v0

    add-int/lit8 v4, v0, 0x2

    aget v3, v2, v3

    add-int/lit8 v5, v0, 0x3

    aget v4, v2, v4

    add-int/lit8 v6, v0, 0x4

    aget v5, v2, v5

    add-int/lit8 v7, v0, 0x5

    aget v6, v2, v6

    add-int/lit8 v10, v0, 0x6

    aget v0, v2, v7

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v0

    move-object v0, p1

    invoke-interface/range {v0 .. v6}, Lw7/g$x;->c(FFFFFF)V

    move v0, v10

    goto :goto_3

    :cond_5
    iget-object v2, p0, Lw7/g$w;->c:[F

    add-int/lit8 v3, v0, 0x1

    aget v4, v2, v0

    add-int/lit8 v0, v0, 0x2

    aget v2, v2, v3

    invoke-interface {p1, v4, v2}, Lw7/g$x;->e(FF)V

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lw7/g$w;->c:[F

    add-int/lit8 v3, v0, 0x1

    aget v4, v2, v0

    add-int/lit8 v0, v0, 0x2

    aget v2, v2, v3

    invoke-interface {p1, v4, v2}, Lw7/g$x;->b(FF)V

    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method public i()Z
    .locals 1

    iget v0, p0, Lw7/g$w;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
