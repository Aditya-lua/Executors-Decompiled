.class public final Lcom/google/android/gms/internal/play_billing/m3;
.super Lcom/google/android/gms/internal/play_billing/p3;
.source "SourceFile"


# instance fields
.field public final c:[B

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>([BII)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/p3;-><init>(Lcom/google/android/gms/internal/play_billing/r3;)V

    add-int v0, p2, p3

    array-length v1, p1

    invoke-static {p2, v0, v1}, Lcom/google/android/gms/internal/play_billing/s3;->i(III)I

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/m3;->c:[B

    iput p2, p0, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    iput p3, p0, Lcom/google/android/gms/internal/play_billing/m3;->e:I

    return-void
.end method

.method public static bridge synthetic p(Lcom/google/android/gms/internal/play_billing/m3;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    return p0
.end method

.method public static bridge synthetic t(Lcom/google/android/gms/internal/play_billing/m3;)[B
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/m3;->c:[B

    return-object p0
.end method


# virtual methods
.method public final b(I)B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/m3;->c:[B

    add-int/2addr v0, p1

    aget-byte p1, v1, v0

    return p1
.end method

.method public final c(III)I
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/play_billing/m3;->c:[B

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    invoke-static {p1, p2, v0, p3}, Lcom/google/android/gms/internal/play_billing/z4;->b(I[BII)I

    move-result p1

    return p1
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/m3;->e:I

    return v0
.end method

.method public final e(II)Lcom/google/android/gms/internal/play_billing/s3;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/m3;->e:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/s3;->i(III)I

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/play_billing/s3;->b:Lcom/google/android/gms/internal/play_billing/s3;

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/m3;->c:[B

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    add-int/2addr v1, p1

    new-instance p1, Lcom/google/android/gms/internal/play_billing/m3;

    invoke-direct {p1, v0, v1, p2}, Lcom/google/android/gms/internal/play_billing/m3;-><init>([BII)V

    return-object p1
.end method

.method public final f([BIII)V
    .locals 1

    iget-object p2, p0, Lcom/google/android/gms/internal/play_billing/m3;->c:[B

    iget p3, p0, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    const/4 v0, 0x0

    invoke-static {p2, p3, p1, v0, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/play_billing/i3;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/play_billing/x3;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/m3;->c:[B

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/play_billing/m3;->e:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/play_billing/x3;->x([BII)V

    return-void
.end method

.method public final h(Lcom/google/android/gms/internal/play_billing/s3;)Z
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/play_billing/q3;

    if-nez v0, :cond_1

    instance-of v1, p1, Lcom/google/android/gms/internal/play_billing/m3;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/play_billing/s3;->h(Lcom/google/android/gms/internal/play_billing/s3;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    iget v1, p0, Lcom/google/android/gms/internal/play_billing/m3;->e:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v2

    if-gt v1, v2, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v2

    if-gt v1, v2, :cond_4

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lcom/google/android/gms/internal/play_billing/q3;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/m3;->c:[B

    iget v3, p0, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/q3;->p(Lcom/google/android/gms/internal/play_billing/q3;)[B

    move-result-object p1

    invoke-static {v0, v3, p1, v2, v1}, Lcom/google/android/gms/internal/play_billing/s3;->l([BI[BII)Z

    move-result p1

    return p1

    :cond_2
    instance-of v0, p1, Lcom/google/android/gms/internal/play_billing/m3;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/play_billing/m3;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/m3;->c:[B

    iget v2, p0, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    iget-object v3, p1, Lcom/google/android/gms/internal/play_billing/m3;->c:[B

    iget p1, p1, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    invoke-static {v0, v2, v3, p1, v1}, Lcom/google/android/gms/internal/play_billing/s3;->l([BI[BII)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/play_billing/s3;->e(II)Lcom/google/android/gms/internal/play_billing/s3;

    move-result-object p1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/m3;->d:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/play_billing/m3;->e(II)Lcom/google/android/gms/internal/play_billing/s3;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/s3;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Ran off end of other: 0, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Length too large: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
