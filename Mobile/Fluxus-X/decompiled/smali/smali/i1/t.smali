.class public final Li1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)I
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const/16 p0, 0x10

    return p0

    :cond_0
    const/16 p0, 0xc

    return p0
.end method

.method public static b(I)I
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const/16 p0, 0x10

    return p0

    :cond_0
    const/16 p0, 0xc

    return p0
.end method

.method public static c(IJLandroid/media/AudioTimestamp;)J
    .locals 6

    int-to-long v0, p0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v4, 0x1

    if-lez v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v5, "sampleRate must be greater than 0."

    invoke-static {v0, v5}, Lx2/g;->b(ZLjava/lang/Object;)V

    cmp-long v0, p1, v2

    if-ltz v0, :cond_1

    move v1, v4

    :cond_1
    const-string v0, "framePosition must be no less than 0."

    invoke-static {v1, v0}, Lx2/g;->b(ZLjava/lang/Object;)V

    iget-wide v0, p3, Landroid/media/AudioTimestamp;->framePosition:J

    sub-long/2addr p1, v0

    invoke-static {p1, p2, p0}, Li1/t;->d(JI)J

    move-result-wide p0

    iget-wide p2, p3, Landroid/media/AudioTimestamp;->nanoTime:J

    add-long/2addr p2, p0

    cmp-long p0, p2, v2

    if-gez p0, :cond_2

    return-wide v2

    :cond_2
    return-wide p2
.end method

.method public static d(JI)J
    .locals 4

    int-to-long v0, p2

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const-string v2, "sampleRate must be greater than 0."

    invoke-static {p2, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {p2, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    mul-long/2addr v2, p0

    div-long/2addr v2, v0

    return-wide v2
.end method

.method public static e(JI)J
    .locals 4

    int-to-long v0, p2

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const-string v2, "bytesPerFrame must be greater than 0."

    invoke-static {p2, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    mul-long/2addr p0, v0

    return-wide p0
.end method

.method public static f(II)I
    .locals 3

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid channel count: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lx2/g;->b(ZLjava/lang/Object;)V

    const/4 v0, 0x2

    if-eq p0, v0, :cond_5

    const/4 v0, 0x3

    if-eq p0, v0, :cond_4

    const/4 v1, 0x4

    if-eq p0, v1, :cond_3

    const/16 v2, 0x15

    if-eq p0, v2, :cond_2

    const/16 v0, 0x16

    if-ne p0, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid audio encoding: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    mul-int/2addr p1, v0

    return p1

    :cond_3
    :goto_1
    mul-int/2addr p1, v1

    :cond_4
    return p1

    :cond_5
    mul-int/2addr p1, v0

    return p1
.end method

.method public static g(JI)J
    .locals 4

    int-to-long v0, p2

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const-string v2, "bytesPerFrame must be greater than 0."

    invoke-static {p2, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    div-long/2addr p0, v0

    return-wide p0
.end method
