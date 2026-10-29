.class public final Lcom/google/android/gms/internal/play_billing/x3;
.super Lcom/google/android/gms/internal/play_billing/a4;
.source "SourceFile"


# instance fields
.field public final c:[B

.field public final d:I

.field public e:I


# direct methods
.method public constructor <init>([BII)V
    .locals 2

    const/4 p2, 0x0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/a4;-><init>(Lcom/google/android/gms/internal/play_billing/z3;)V

    array-length p2, p1

    sub-int v0, p2, p3

    or-int/2addr v0, p3

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B

    iput v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    iput p3, p0, Lcom/google/android/gms/internal/play_billing/x3;->d:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p2, v1, p3}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"

    invoke-static {v0, p3, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A(Ljava/lang/String;)V
    .locals 5

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v2

    if-ne v2, v1, :cond_0

    add-int v1, v0, v2

    iput v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    iget-object v3, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B

    array-length v4, v3

    sub-int/2addr v4, v1

    invoke-static {p1, v3, v1, v4}, Lcom/google/android/gms/internal/play_billing/e7;->a(Ljava/lang/String;[BII)I

    move-result p1

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    sub-int v0, p1, v0

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/gms/internal/play_billing/e7;->a:I

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/c7;->b(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    array-length v2, v0

    sub-int/2addr v2, v1

    invoke-static {p1, v0, v1, v2}, Lcom/google/android/gms/internal/play_billing/e7;->a(Ljava/lang/String;[BII)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/play_billing/y3;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/play_billing/y3;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final c()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->d:I

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final d(B)V
    .locals 9

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v2, v1, 0x1

    :try_start_1
    aput-byte p1, v0, v1
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    iput v2, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    return-void

    :catch_0
    move-exception v0

    move v1, v2

    :goto_0
    move-object p1, v0

    move-object v8, p1

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0

    :goto_1
    iget p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->d:I

    new-instance v2, Lcom/google/android/gms/internal/play_billing/y3;

    int-to-long v3, v1

    int-to-long v5, p1

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/play_billing/y3;-><init>(JJILjava/lang/Throwable;)V

    throw v2
.end method

.method public final e(IZ)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/x3;->d(B)V

    return-void
.end method

.method public final f(ILcom/google/android/gms/internal/play_billing/s3;)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/x3;->y(Lcom/google/android/gms/internal/play_billing/s3;)V

    return-void
.end method

.method public final g(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x5

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/x3;->h(I)V

    return-void
.end method

.method public final h(I)V
    .locals 9

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    add-int/lit8 v2, v1, 0x1

    shr-int/lit8 v3, p1, 0x8

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x2

    shr-int/lit8 v3, p1, 0x10

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x3

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    aput-byte p1, v0, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v8, p1

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->d:I

    int-to-long v3, v1

    new-instance v2, Lcom/google/android/gms/internal/play_billing/y3;

    int-to-long v5, p1

    const/4 v7, 0x4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/play_billing/y3;-><init>(JJILjava/lang/Throwable;)V

    throw v2
.end method

.method public final i(IJ)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/play_billing/x3;->j(J)V

    return-void
.end method

.method public final j(J)V
    .locals 9

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B

    long-to-int v2, p1

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v2, v1, 0x1

    const/16 v3, 0x8

    shr-long v4, p1, v3

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x2

    const/16 v4, 0x10

    shr-long v4, p1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x3

    const/16 v4, 0x18

    shr-long v4, p1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x4

    const/16 v4, 0x20

    shr-long v4, p1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x5

    const/16 v4, 0x28

    shr-long v4, p1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x6

    const/16 v4, 0x30

    shr-long v4, p1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x7

    const/16 v4, 0x38

    shr-long/2addr p1, v4

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v0, v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v1, v3

    iput v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v8, p1

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->d:I

    int-to-long v3, v1

    new-instance v2, Lcom/google/android/gms/internal/play_billing/y3;

    int-to-long v5, p1

    const/16 v7, 0x8

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/play_billing/y3;-><init>(JJILjava/lang/Throwable;)V

    throw v2
.end method

.method public final k(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/x3;->l(I)V

    return-void
.end method

.method public final l(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/play_billing/x3;->t(J)V

    return-void
.end method

.method public final m(ILcom/google/android/gms/internal/play_billing/x5;)V
    .locals 1

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->q(II)V

    const/16 p1, 0x1a

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/x3;->z(Lcom/google/android/gms/internal/play_billing/x5;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    return-void
.end method

.method public final n(ILcom/google/android/gms/internal/play_billing/s3;)V
    .locals 1

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->q(II)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/x3;->f(ILcom/google/android/gms/internal/play_billing/s3;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    return-void
.end method

.method public final o(ILjava/lang/String;)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/x3;->A(Ljava/lang/String;)V

    return-void
.end method

.method public final p(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    return-void
.end method

.method public final q(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    return-void
.end method

.method public final r(I)V
    .locals 9

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    move v1, v0

    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v2, v1, 0x1

    int-to-byte p1, p1

    :try_start_1
    aput-byte p1, v0, v1
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    iput v2, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v8, p1

    move v1, v2

    goto :goto_2

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v2, v1, 0x1

    or-int/lit16 v3, p1, 0x80

    int-to-byte v3, v3

    :try_start_3
    aput-byte v3, v0, v1
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_0

    ushr-int/lit8 p1, p1, 0x7

    move v1, v2

    goto :goto_0

    :goto_1
    move-object v8, p1

    :goto_2
    iget p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->d:I

    new-instance v2, Lcom/google/android/gms/internal/play_billing/y3;

    int-to-long v3, v1

    int-to-long v5, p1

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/play_billing/y3;-><init>(JJILjava/lang/Throwable;)V

    throw v2
.end method

.method public final s(IJ)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/play_billing/x3;->t(J)V

    return-void
.end method

.method public final t(J)V
    .locals 10

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/a4;->b()Z

    move-result v1

    const/4 v2, 0x7

    const-wide/16 v3, 0x0

    const-wide/16 v5, -0x80

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->d:I

    sub-int/2addr v1, v0

    const/16 v7, 0xa

    if-lt v1, v7, :cond_1

    :goto_0
    and-long v7, p1, v5

    cmp-long v1, v7, v3

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B

    add-int/lit8 v2, v0, 0x1

    int-to-long v3, v0

    long-to-int p1, p1

    int-to-byte p1, p1

    invoke-static {v1, v3, v4, p1}, Lcom/google/android/gms/internal/play_billing/a7;->r([BJB)V

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B

    add-int/lit8 v7, v0, 0x1

    int-to-long v8, v0

    long-to-int v0, p1

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    invoke-static {v1, v8, v9, v0}, Lcom/google/android/gms/internal/play_billing/a7;->r([BJB)V

    ushr-long/2addr p1, v2

    move v0, v7

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    and-long v7, p1, v5

    cmp-long v0, v7, v3

    if-nez v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v2, v1, 0x1

    long-to-int p1, p1

    int-to-byte p1, p1

    :try_start_1
    aput-byte p1, v0, v1
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    iput v2, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v8, p1

    move v1, v2

    goto :goto_4

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v7, v1, 0x1

    long-to-int v8, p1

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    :try_start_3
    aput-byte v8, v0, v1
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_2

    ushr-long/2addr p1, v2

    move v1, v7

    goto :goto_1

    :catch_2
    move-exception v0

    move-object p1, v0

    move-object v8, p1

    move v1, v7

    goto :goto_4

    :goto_3
    move-object v8, p1

    :goto_4
    iget p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->d:I

    new-instance v2, Lcom/google/android/gms/internal/play_billing/y3;

    int-to-long v3, v1

    int-to-long v5, p1

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/play_billing/y3;-><init>(JJILjava/lang/Throwable;)V

    throw v2
.end method

.method public final x([BII)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x3;->c:[B

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v6, p1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/y3;

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/x3;->e:I

    iget p2, p0, Lcom/google/android/gms/internal/play_billing/x3;->d:I

    int-to-long v1, p1

    int-to-long v3, p2

    move v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/play_billing/y3;-><init>(JJILjava/lang/Throwable;)V

    throw v0
.end method

.method public final y(Lcom/google/android/gms/internal/play_billing/s3;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/play_billing/s3;->g(Lcom/google/android/gms/internal/play_billing/i3;)V

    return-void
.end method

.method public final z(Lcom/google/android/gms/internal/play_billing/x5;)V
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/internal/play_billing/x5;->zzn()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/x3;->r(I)V

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/play_billing/x5;->a(Lcom/google/android/gms/internal/play_billing/a4;)V

    return-void
.end method
