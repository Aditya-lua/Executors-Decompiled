.class public final Lcom/google/android/gms/internal/measurement/ka;
.super Lcom/google/android/gms/internal/measurement/ma;
.source "SourceFile"


# instance fields
.field public final d:[B

.field public final e:I

.field public f:I


# direct methods
.method public constructor <init>([BII)V
    .locals 2

    const/4 p2, 0x0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/ma;-><init>([B)V

    array-length p2, p1

    sub-int v0, p2, p3

    or-int/2addr v0, p3

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B

    iput v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    iput p3, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

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
.method public final A(I)V
    .locals 9

    iget v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B

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

    iput v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v8, p1

    iget p1, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

    int-to-long v3, v1

    new-instance v2, Lcom/google/android/gms/internal/measurement/la;

    int-to-long v5, p1

    const/4 v7, 0x4

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/la;-><init>(JJILjava/lang/Throwable;)V

    throw v2
.end method

.method public final B(J)V
    .locals 10

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ma;->h()Z

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    const/4 v2, 0x7

    const-wide/16 v3, 0x0

    const-wide/16 v5, -0x80

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

    sub-int/2addr v0, v1

    const/16 v7, 0xa

    if-lt v0, v7, :cond_1

    :goto_0
    and-long v7, p1, v5

    cmp-long v0, v7, v3

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B

    add-int/lit8 v2, v1, 0x1

    int-to-long v3, v1

    long-to-int p1, p1

    int-to-byte p1, p1

    invoke-static {v0, v3, v4, p1}, Lcom/google/android/gms/internal/measurement/sd;->u([BJB)V

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B

    add-int/lit8 v7, v1, 0x1

    int-to-long v8, v1

    long-to-int v1, p1

    or-int/lit16 v1, v1, 0x80

    int-to-byte v1, v1

    invoke-static {v0, v8, v9, v1}, Lcom/google/android/gms/internal/measurement/sd;->u([BJB)V

    ushr-long/2addr p1, v2

    move v1, v7

    goto :goto_0

    :cond_1
    :goto_1
    and-long v7, p1, v5

    cmp-long v0, v7, v3

    if-nez v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B
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
    iput v2, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

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
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B
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
    iget p1, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

    new-instance v2, Lcom/google/android/gms/internal/measurement/la;

    int-to-long v3, v1

    int-to-long v5, p1

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/la;-><init>(JJILjava/lang/Throwable;)V

    throw v2
.end method

.method public final C(J)V
    .locals 9

    iget v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B

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

    iput v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v8, p1

    iget p1, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

    int-to-long v3, v1

    new-instance v2, Lcom/google/android/gms/internal/measurement/la;

    int-to-long v5, p1

    const/16 v7, 0x8

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/la;-><init>(JJILjava/lang/Throwable;)V

    throw v2
.end method

.method public final D([BII)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/ka;->H([BII)V

    return-void
.end method

.method public final E(Ljava/lang/String;)V
    .locals 5

    iget v0, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v2

    if-ne v2, v1, :cond_0

    add-int v1, v0, v2

    iput v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B

    iget v4, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

    sub-int/2addr v4, v1

    invoke-static {p1, v3, v1, v4}, Lcom/google/android/gms/internal/measurement/vd;->c(Ljava/lang/String;[BII)I

    move-result v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    sub-int v3, v1, v0

    sub-int/2addr v3, v2

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    iput v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/vd;->b(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B

    iget v2, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    iget v3, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

    sub-int/2addr v3, v2

    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/vd;->c(Ljava/lang/String;[BII)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/ud; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/la;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/la;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_1
    iput v0, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/measurement/ma;->f(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/ud;)V

    return-void
.end method

.method public final F()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final H([BII)V
    .locals 7

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B

    iget v0, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    iget p1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v6, p1

    new-instance v0, Lcom/google/android/gms/internal/measurement/la;

    iget p1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    iget p2, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

    int-to-long v1, p1

    int-to-long v3, p2

    move v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/la;-><init>(JJILjava/lang/Throwable;)V

    throw v0
.end method

.method public final i(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    return-void
.end method

.method public final j(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/ka;->y(I)V

    return-void
.end method

.method public final k(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    return-void
.end method

.method public final l(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x5

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/ka;->A(I)V

    return-void
.end method

.method public final m(IJ)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/measurement/ka;->B(J)V

    return-void
.end method

.method public final n(IJ)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/measurement/ka;->C(J)V

    return-void
.end method

.method public final o(IZ)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/ka;->x(B)V

    return-void
.end method

.method public final p(ILjava/lang/String;)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/ka;->E(Ljava/lang/String;)V

    return-void
.end method

.method public final q(ILcom/google/android/gms/internal/measurement/ha;)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/ka;->r(Lcom/google/android/gms/internal/measurement/ha;)V

    return-void
.end method

.method public final r(Lcom/google/android/gms/internal/measurement/ha;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/ha;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/ha;->f(Lcom/google/android/gms/internal/measurement/y9;)V

    return-void
.end method

.method public final s([BII)V
    .locals 0

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/ka;->H([BII)V

    return-void
.end method

.method public final t(ILcom/google/android/gms/internal/measurement/oc;Lcom/google/android/gms/internal/measurement/zc;)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    move-object p1, p2

    check-cast p1, Lcom/google/android/gms/internal/measurement/r9;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/measurement/r9;->g(Lcom/google/android/gms/internal/measurement/zc;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/ma;->a:Lcom/google/android/gms/internal/measurement/na;

    invoke-interface {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/zc;->e(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/yd;)V

    return-void
.end method

.method public final u(ILcom/google/android/gms/internal/measurement/oc;)V
    .locals 1

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/ka;->k(II)V

    const/16 p1, 0x1a

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/ka;->w(Lcom/google/android/gms/internal/measurement/oc;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    return-void
.end method

.method public final v(ILcom/google/android/gms/internal/measurement/ha;)V
    .locals 1

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/ka;->k(II)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/ka;->q(ILcom/google/android/gms/internal/measurement/ha;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    return-void
.end method

.method public final w(Lcom/google/android/gms/internal/measurement/oc;)V
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/oc;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/measurement/oc;->c(Lcom/google/android/gms/internal/measurement/ma;)V

    return-void
.end method

.method public final x(B)V
    .locals 9

    iget v1, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v2, v1, 0x1

    :try_start_1
    aput-byte p1, v0, v1
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    iput v2, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

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
    iget p1, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

    new-instance v2, Lcom/google/android/gms/internal/measurement/la;

    int-to-long v3, v1

    int-to-long v5, p1

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/la;-><init>(JJILjava/lang/Throwable;)V

    throw v2
.end method

.method public final y(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/ka;->z(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/ka;->B(J)V

    return-void
.end method

.method public final z(I)V
    .locals 9

    iget v0, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

    move v1, v0

    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v2, v1, 0x1

    int-to-byte p1, p1

    :try_start_1
    aput-byte p1, v0, v1
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    iput v2, p0, Lcom/google/android/gms/internal/measurement/ka;->f:I

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
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ka;->d:[B
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
    iget p1, p0, Lcom/google/android/gms/internal/measurement/ka;->e:I

    new-instance v2, Lcom/google/android/gms/internal/measurement/la;

    int-to-long v3, v1

    int-to-long v5, p1

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/la;-><init>(JJILjava/lang/Throwable;)V

    throw v2
.end method
