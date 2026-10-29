.class public final Lcom/google/android/gms/internal/play_billing/q3;
.super Lcom/google/android/gms/internal/play_billing/p3;
.source "SourceFile"


# instance fields
.field public final c:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/p3;-><init>(Lcom/google/android/gms/internal/play_billing/r3;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    return-void
.end method

.method public static bridge synthetic p(Lcom/google/android/gms/internal/play_billing/q3;)[B
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    return-object p0
.end method


# virtual methods
.method public final b(I)B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final c(III)I
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, p3}, Lcom/google/android/gms/internal/play_billing/z4;->b(I[BII)I

    move-result p1

    return p1
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    array-length v0, v0

    return v0
.end method

.method public final e(II)Lcom/google/android/gms/internal/play_billing/s3;
    .locals 2

    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {v1, p2, v0}, Lcom/google/android/gms/internal/play_billing/s3;->i(III)I

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/play_billing/s3;->b:Lcom/google/android/gms/internal/play_billing/s3;

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/play_billing/m3;

    invoke-direct {v0, p1, v1, p2}, Lcom/google/android/gms/internal/play_billing/m3;-><init>([BII)V

    return-object v0
.end method

.method public final f([BIII)V
    .locals 0

    iget-object p2, p0, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    const/4 p3, 0x0

    invoke-static {p2, p3, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/play_billing/i3;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/play_billing/x3;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lcom/google/android/gms/internal/play_billing/x3;->x([BII)V

    return-void
.end method

.method public final h(Lcom/google/android/gms/internal/play_billing/s3;)Z
    .locals 5

    instance-of v0, p1, Lcom/google/android/gms/internal/play_billing/q3;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    check-cast p1, Lcom/google/android/gms/internal/play_billing/q3;

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/play_billing/m3;

    if-eqz v1, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v3

    array-length v4, v2

    if-gt v4, v3, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v3

    if-gt v4, v3, :cond_3

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/q3;

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/q3;->c:[B

    invoke-static {v2, v3, p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/s3;->l([BI[BII)Z

    move-result p1

    return p1

    :cond_1
    if-eqz v1, :cond_2

    check-cast p1, Lcom/google/android/gms/internal/play_billing/m3;

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/m3;->t(Lcom/google/android/gms/internal/play_billing/m3;)[B

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/m3;->p(Lcom/google/android/gms/internal/play_billing/m3;)I

    move-result p1

    invoke-static {v2, v3, v0, p1, v4}, Lcom/google/android/gms/internal/play_billing/s3;->l([BI[BII)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/s3;->e(II)Lcom/google/android/gms/internal/play_billing/s3;

    move-result-object p1

    invoke-virtual {p0, v3, v4}, Lcom/google/android/gms/internal/play_billing/q3;->e(II)Lcom/google/android/gms/internal/play_billing/s3;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/s3;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ran off end of other: 0, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Length too large: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/play_billing/s3;->h(Lcom/google/android/gms/internal/play_billing/s3;)Z

    move-result p1

    return p1
.end method
