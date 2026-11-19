.class public Lcom/github/luben/zstd/Zstd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/luben/zstd/Zstd$FrameData;,
        Lcom/github/luben/zstd/Zstd$ParamSwitch;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/github/luben/zstd/util/Native;->load()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native blockSizeMax()I
.end method

.method private static calculateContentSizeAndFrames([BLjava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/List<",
            "Lcom/github/luben/zstd/Zstd$FrameData;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_0

    new-instance v2, Lcom/github/luben/zstd/Zstd$FrameData;

    invoke-direct {v2, p0, v0}, Lcom/github/luben/zstd/Zstd$FrameData;-><init>([BI)V

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-wide v3, v2, Lcom/github/luben/zstd/Zstd$FrameData;->compressedSize:J

    long-to-int v3, v3

    add-int/2addr v0, v3

    iget-wide v2, v2, Lcom/github/luben/zstd/Zstd$FrameData;->contentSize:J

    long-to-int v2, v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static native chainLogMax()I
.end method

.method public static native chainLogMin()I
.end method

.method public static compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 20
    invoke-static {}, Lcom/github/luben/zstd/Zstd;->defaultCompressionLevel()I

    move-result v0

    invoke-static {p0, p1, v0}, Lcom/github/luben/zstd/Zstd;->compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I

    move-result p0

    return p0
.end method

.method public static compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-static {p0, p1, p2, v0}, Lcom/github/luben/zstd/Zstd;->compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IZ)I

    move-result p0

    return p0
.end method

.method public static compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IZ)I
    .locals 1

    .line 21
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 22
    :try_start_0
    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 23
    invoke-virtual {v0, p3}, Lcom/github/luben/zstd/ZstdCompressCtx;->setChecksum(Z)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 24
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 26
    throw p0
.end method

.method public static compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Lcom/github/luben/zstd/ZstdDictCompress;)I
    .locals 1

    .line 52
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 53
    :try_start_0
    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 54
    invoke-virtual {p2}, Lcom/github/luben/zstd/ZstdDictCompress;->level()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 55
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 57
    throw p0
.end method

.method public static compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;[BI)I
    .locals 1

    .line 40
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 41
    :try_start_0
    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 42
    invoke-virtual {v0, p3}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 43
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 45
    throw p0
.end method

.method public static compress([B[BI)J
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-static {p0, p1, p2, v0}, Lcom/github/luben/zstd/Zstd;->compress([B[BIZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static compress([B[BIZ)J
    .locals 1

    .line 1
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 3
    invoke-virtual {v0, p3}, Lcom/github/luben/zstd/ZstdCompressCtx;->setChecksum(Z)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 4
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress([B[B)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p0, p0

    .line 5
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-wide p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 6
    throw p0
.end method

.method public static compress([B[BLcom/github/luben/zstd/ZstdDictCompress;)J
    .locals 1

    .line 8
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 9
    :try_start_0
    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 10
    invoke-virtual {p2}, Lcom/github/luben/zstd/ZstdDictCompress;->level()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 11
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress([B[B)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p0, p0

    .line 12
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-wide p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 13
    throw p0
.end method

.method public static compress([B[B[BI)J
    .locals 7

    const/4 v3, 0x0

    .line 39
    array-length v4, p1

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v5, p2

    move v6, p3

    invoke-static/range {v0 .. v6}, Lcom/github/luben/zstd/Zstd;->compressUsingDict([BI[BII[BI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static compress(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 28
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 29
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 30
    invoke-virtual {v0, p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 32
    throw p0
.end method

.method public static compress(Ljava/nio/ByteBuffer;Lcom/github/luben/zstd/ZstdDictCompress;)Ljava/nio/ByteBuffer;
    .locals 1

    .line 58
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 59
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 60
    invoke-virtual {p1}, Lcom/github/luben/zstd/ZstdDictCompress;->level()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 61
    invoke-virtual {v0, p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 63
    throw p0
.end method

.method public static compress(Ljava/nio/ByteBuffer;[BI)Ljava/nio/ByteBuffer;
    .locals 1

    .line 46
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 47
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 48
    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 49
    invoke-virtual {v0, p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 51
    throw p0
.end method

.method public static compress([B)[B
    .locals 1

    .line 14
    invoke-static {}, Lcom/github/luben/zstd/Zstd;->defaultCompressionLevel()I

    move-result v0

    invoke-static {p0, v0}, Lcom/github/luben/zstd/Zstd;->compress([BI)[B

    move-result-object p0

    return-object p0
.end method

.method public static compress([BI)[B
    .locals 1

    .line 15
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 16
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 17
    invoke-virtual {v0, p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress([B)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 19
    throw p0
.end method

.method public static compress([BLcom/github/luben/zstd/ZstdDictCompress;)[B
    .locals 1

    .line 33
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 34
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 35
    invoke-virtual {p1}, Lcom/github/luben/zstd/ZstdDictCompress;->level()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 36
    invoke-virtual {v0, p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress([B)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 38
    throw p0
.end method

.method public static native compressBound(J)J
.end method

.method public static compressByteArray([BII[BIII)J
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    .line 7
    invoke-static/range {v0 .. v7}, Lcom/github/luben/zstd/Zstd;->compressByteArray([BII[BIIIZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static compressByteArray([BII[BIIIZ)J
    .locals 1

    move v0, p6

    move p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 1
    new-instance p0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 3
    invoke-virtual {p0, p7}, Lcom/github/luben/zstd/ZstdCompressCtx;->setChecksum(Z)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 4
    invoke-virtual/range {p0 .. p6}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressByteArray([BII[BII)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p1, p1

    .line 5
    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-wide p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 6
    throw p1
.end method

.method public static compressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;III)J
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    .line 7
    invoke-static/range {v0 .. v7}, Lcom/github/luben/zstd/Zstd;->compressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IIIZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static compressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IIIZ)J
    .locals 1

    move v0, p6

    move p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 1
    new-instance p0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 3
    invoke-virtual {p0, p7}, Lcom/github/luben/zstd/ZstdCompressCtx;->setChecksum(Z)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 4
    invoke-virtual/range {p0 .. p6}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p1, p1

    .line 5
    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-wide p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 6
    throw p1
.end method

.method public static compressDirectByteBufferFastDict(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILcom/github/luben/zstd/ZstdDictCompress;)J
    .locals 1

    move-object v0, p6

    move p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    new-instance p0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDictCompress;->level()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-virtual/range {p0 .. p6}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p1, p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-wide p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    throw p1
.end method

.method public static compressDirectByteBufferUsingDict(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II[BI)J
    .locals 1

    move-object v0, p6

    move p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    new-instance p0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    :try_start_0
    invoke-virtual {p0, p7}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-virtual/range {p0 .. p6}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p1, p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-wide p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    throw p1
.end method

.method public static compressFastDict([BI[BIILcom/github/luben/zstd/ZstdDictCompress;)J
    .locals 8

    .line 1
    new-instance v1, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v1}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {v1, p5}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 3
    invoke-virtual {p5}, Lcom/github/luben/zstd/ZstdDictCompress;->level()I

    move-result p5

    invoke-virtual {v1, p5}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 4
    array-length p5, p0

    sub-int v4, p5, p1

    move-object v2, p0

    move v3, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    invoke-virtual/range {v1 .. v7}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressByteArray([BII[BII)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p0, p0

    .line 5
    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-wide p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 6
    throw p0
.end method

.method public static compressFastDict([BI[BILcom/github/luben/zstd/ZstdDictCompress;)J
    .locals 8

    .line 7
    new-instance v1, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v1}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 8
    :try_start_0
    invoke-virtual {v1, p4}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 9
    invoke-virtual {p4}, Lcom/github/luben/zstd/ZstdDictCompress;->level()I

    move-result p4

    invoke-virtual {v1, p4}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 10
    array-length p4, p0

    sub-int v4, p4, p1

    array-length p4, p2

    sub-int v7, p4, p3

    move-object v2, p0

    move v3, p1

    move-object v5, p2

    move v6, p3

    invoke-virtual/range {v1 .. v7}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressByteArray([BII[BII)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p0, p0

    .line 11
    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-wide p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 12
    throw p0
.end method

.method public static compressUnsafe(JJJJI)J
    .locals 10

    const/4 v9, 0x0

    move-wide v0, p0

    move-wide v2, p2

    move-wide v4, p4

    move-wide/from16 v6, p6

    move/from16 v8, p8

    .line 1
    invoke-static/range {v0 .. v9}, Lcom/github/luben/zstd/Zstd;->compressUnsafe(JJJJIZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static native compressUnsafe(JJJJIZ)J
.end method

.method public static compressUsingDict([BI[BII[BI)J
    .locals 2

    move v0, p6

    move p6, p4

    move-object p4, p2

    move p2, p1

    move-object p1, p0

    .line 1
    new-instance p0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 3
    invoke-virtual {p0, p5}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 4
    array-length p5, p1

    sub-int/2addr p5, p2

    move v1, p5

    move p5, p3

    move p3, v1

    invoke-virtual/range {p0 .. p6}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressByteArray([BII[BII)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p1, p1

    .line 5
    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-wide p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 6
    throw p1
.end method

.method public static compressUsingDict([BI[BI[BI)J
    .locals 8

    .line 7
    new-instance v1, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v1}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 8
    :try_start_0
    invoke-virtual {v1, p5}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 9
    invoke-virtual {v1, p4}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 10
    array-length p4, p0

    sub-int v4, p4, p1

    array-length p4, p2

    sub-int v7, p4, p3

    move-object v2, p0

    move v3, p1

    move-object v5, p2

    move v6, p3

    invoke-virtual/range {v1 .. v7}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressByteArray([BII[BII)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p0, p0

    .line 11
    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-wide p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 12
    throw p0
.end method

.method public static compressUsingDict([B[B[BI)J
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v3, 0x0

    .line 13
    array-length v4, p1

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v5, p2

    move v6, p3

    invoke-static/range {v0 .. v6}, Lcom/github/luben/zstd/Zstd;->compressUsingDict([BI[BII[BI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static compressUsingDict([B[BI)[B
    .locals 1

    .line 14
    new-instance v0, Lcom/github/luben/zstd/ZstdCompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;-><init>()V

    .line 15
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 16
    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;

    .line 17
    invoke-virtual {v0, p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->compress([B)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdCompressCtx;->close()V

    .line 19
    throw p0
.end method

.method public static decompress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 24
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 25
    :try_start_0
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 27
    throw p0
.end method

.method public static decompress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Lcom/github/luben/zstd/ZstdDictDecompress;)I
    .locals 1

    .line 57
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 58
    :try_start_0
    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictDecompress;)Lcom/github/luben/zstd/ZstdDecompressCtx;

    .line 59
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 61
    throw p0
.end method

.method public static decompress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;[B)I
    .locals 1

    .line 47
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 48
    :try_start_0
    invoke-virtual {v0, p2}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdDecompressCtx;

    .line 49
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 51
    throw p0
.end method

.method public static decompress(Ljava/nio/ByteBuffer;[B)I
    .locals 1

    .line 28
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 29
    :try_start_0
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress(Ljava/nio/ByteBuffer;[B)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 31
    throw p0
.end method

.method public static decompress([BLjava/nio/ByteBuffer;)I
    .locals 1

    .line 5
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 6
    :try_start_0
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress([BLjava/nio/ByteBuffer;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 8
    throw p0
.end method

.method public static decompress([B[B)J
    .locals 1

    .line 1
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress([B[B)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p0, p0

    .line 3
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-wide p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 4
    throw p0
.end method

.method public static decompress([B[B[B)J
    .locals 6

    const/4 v3, 0x0

    .line 41
    array-length v4, p1

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lcom/github/luben/zstd/Zstd;->decompressUsingDict([BI[BII[B)J

    move-result-wide p0

    return-wide p0
.end method

.method public static decompress(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 32
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 33
    :try_start_0
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 35
    throw p0
.end method

.method public static decompress(Ljava/nio/ByteBuffer;Lcom/github/luben/zstd/ZstdDictDecompress;I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 62
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 63
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictDecompress;)Lcom/github/luben/zstd/ZstdDecompressCtx;

    .line 64
    invoke-virtual {v0, p0, p2}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 66
    throw p0
.end method

.method public static decompress(Ljava/nio/ByteBuffer;[BI)Ljava/nio/ByteBuffer;
    .locals 1

    .line 52
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 53
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdDecompressCtx;

    .line 54
    invoke-virtual {v0, p0, p2}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 56
    throw p0
.end method

.method public static decompress([B)[B
    .locals 13

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-static {p0, v0}, Lcom/github/luben/zstd/Zstd;->calculateContentSizeAndFrames([BLjava/util/List;)I

    move-result v1

    .line 15
    new-array v2, v1, [B

    const/4 v1, 0x0

    move v3, v1

    move v6, v3

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lcom/github/luben/zstd/Zstd$FrameData;

    .line 18
    iget-wide v4, v8, Lcom/github/luben/zstd/Zstd$FrameData;->contentSize:J

    long-to-int v4, v4

    iget-wide v9, v8, Lcom/github/luben/zstd/Zstd$FrameData;->compressedSize:J

    long-to-int v7, v9

    move-object v5, p0

    invoke-static/range {v2 .. v7}, Lcom/github/luben/zstd/Zstd;->decompressByteArray([BII[BII)J

    move-result-wide v9

    .line 19
    invoke-static {v9, v10}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p0

    if-nez p0, :cond_1

    .line 20
    iget-wide v11, v8, Lcom/github/luben/zstd/Zstd$FrameData;->contentSize:J

    cmp-long p0, v9, v11

    if-nez p0, :cond_0

    .line 21
    iget-wide v7, v8, Lcom/github/luben/zstd/Zstd$FrameData;->compressedSize:J

    long-to-int p0, v7

    add-int/2addr v6, p0

    long-to-int p0, v11

    add-int/2addr v3, p0

    add-int/lit8 v1, v1, 0x1

    move-object p0, v5

    goto :goto_0

    .line 22
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "decompressed size mismatch"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 23
    :cond_1
    new-instance p0, Lcom/github/luben/zstd/ZstdException;

    invoke-static {v9, v10}, Lcom/github/luben/zstd/Zstd;->getErrorName(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "error %s while decompressing %d frame"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v9, v10, v0}, Lcom/github/luben/zstd/ZstdException;-><init>(JLjava/lang/String;)V

    throw p0

    :cond_2
    return-object v2
.end method

.method public static decompress([BI)[B
    .locals 1

    .line 9
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 10
    :try_start_0
    invoke-virtual {v0, p0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress([BI)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 12
    throw p0
.end method

.method public static decompress([BLcom/github/luben/zstd/ZstdDictDecompress;I)[B
    .locals 1

    .line 36
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 37
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictDecompress;)Lcom/github/luben/zstd/ZstdDecompressCtx;

    .line 38
    invoke-virtual {v0, p0, p2}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress([BI)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 40
    throw p0
.end method

.method public static decompress([B[BI)[B
    .locals 1

    .line 42
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 43
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdDecompressCtx;

    .line 44
    invoke-virtual {v0, p0, p2}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress([BI)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 46
    throw p0
.end method

.method public static decompressByteArray([BII[BII)J
    .locals 8

    new-instance v1, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    :try_start_0
    invoke-virtual/range {v1 .. v7}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompressByteArray([BII[BII)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p0, p0

    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-wide p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    throw p0
.end method

.method public static decompressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J
    .locals 8

    new-instance v1, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    :try_start_0
    invoke-virtual/range {v1 .. v7}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p0, p0

    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-wide p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    throw p0
.end method

.method public static decompressDirectByteBufferFastDict(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILcom/github/luben/zstd/ZstdDictDecompress;)J
    .locals 1

    move-object v0, p6

    move p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    new-instance p0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictDecompress;)Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-virtual/range {p0 .. p6}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p1, p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-wide p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    throw p1
.end method

.method public static decompressDirectByteBufferUsingDict(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II[B)J
    .locals 1

    move-object v0, p6

    move p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    new-instance p0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-virtual/range {p0 .. p6}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p1, p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-wide p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    throw p1
.end method

.method public static decompressFastDict([BI[BIILcom/github/luben/zstd/ZstdDictDecompress;)J
    .locals 8

    new-instance v1, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    :try_start_0
    invoke-virtual {v1, p5}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict(Lcom/github/luben/zstd/ZstdDictDecompress;)Lcom/github/luben/zstd/ZstdDecompressCtx;

    array-length p5, p0

    sub-int v4, p5, p1

    move-object v2, p0

    move v3, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    invoke-virtual/range {v1 .. v7}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompressByteArray([BII[BII)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p0, p0

    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-wide p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    throw p0
.end method

.method public static decompressFrame([B)[B
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-static {p0, v0}, Lcom/github/luben/zstd/Zstd;->decompressFrame([BI)[B

    move-result-object p0

    return-object p0
.end method

.method public static decompressFrame([BI)[B
    .locals 4

    .line 5
    invoke-static {p0, p1}, Lcom/github/luben/zstd/Zstd;->findFrameCompressedSize([BI)J

    move-result-wide v0

    long-to-int v0, v0

    .line 6
    invoke-static {p0, p1, v0}, Lcom/github/luben/zstd/Zstd;->getFrameContentSize([BII)J

    move-result-wide v1

    .line 7
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v3

    if-eqz v3, :cond_1

    const-wide/16 p0, -0x1

    cmp-long p0, v1, p0

    if-nez p0, :cond_0

    .line 8
    new-instance p0, Lcom/github/luben/zstd/ZstdException;

    const-string p1, "Content size is unknown"

    invoke-direct {p0, v1, v2, p1}, Lcom/github/luben/zstd/ZstdException;-><init>(JLjava/lang/String;)V

    throw p0

    .line 9
    :cond_0
    new-instance p0, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p0, v1, v2}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p0

    :cond_1
    long-to-int v1, v1

    .line 10
    invoke-static {p0, p1, v0, v1}, Lcom/github/luben/zstd/Zstd;->decompressFrame([BIII)[B

    move-result-object p0

    return-object p0
.end method

.method public static decompressFrame([BIII)[B
    .locals 1

    .line 1
    new-instance v0, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompress([BIII)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 4
    throw p0
.end method

.method public static native decompressUnsafe(JJJJ)J
.end method

.method public static decompressUsingDict([BI[BII[B)J
    .locals 8

    .line 1
    new-instance v1, Lcom/github/luben/zstd/ZstdDecompressCtx;

    invoke-direct {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {v1, p5}, Lcom/github/luben/zstd/ZstdDecompressCtx;->loadDict([B)Lcom/github/luben/zstd/ZstdDecompressCtx;

    .line 3
    array-length p5, p0

    sub-int v4, p5, p1

    move-object v2, p0

    move v3, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    invoke-virtual/range {v1 .. v7}, Lcom/github/luben/zstd/ZstdDecompressCtx;->decompressByteArray([BII[BII)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p0, p0

    .line 4
    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    return-wide p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-virtual {v1}, Lcom/github/luben/zstd/ZstdDecompressCtx;->close()V

    .line 5
    throw p0
.end method

.method public static decompressUsingDict([B[B[B)J
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v3, 0x0

    .line 6
    array-length v4, p1

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lcom/github/luben/zstd/Zstd;->decompressUsingDict([BI[BII[B)J

    move-result-wide p0

    return-wide p0
.end method

.method public static decompressedDirectByteBufferSize(Ljava/nio/ByteBuffer;II)J
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, p2, v0}, Lcom/github/luben/zstd/Zstd;->decompressedDirectByteBufferSize(Ljava/nio/ByteBuffer;IIZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static native decompressedDirectByteBufferSize(Ljava/nio/ByteBuffer;IIZ)J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public static decompressedSize(Ljava/nio/ByteBuffer;)J
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 9
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {p0, v0, v1}, Lcom/github/luben/zstd/Zstd;->decompressedDirectByteBufferSize(Ljava/nio/ByteBuffer;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static decompressedSize([B)J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 8
    invoke-static {p0, v0}, Lcom/github/luben/zstd/Zstd;->decompressedSize([BI)J

    move-result-wide v0

    return-wide v0
.end method

.method public static decompressedSize([BI)J
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 7
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p0, p1, v0}, Lcom/github/luben/zstd/Zstd;->decompressedSize([BII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static decompressedSize([BII)J
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 6
    invoke-static {p0, p1, p2, v0}, Lcom/github/luben/zstd/Zstd;->decompressedSize([BIIZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static decompressedSize([BIIZ)J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    array-length v0, p0

    if-ge p1, v0, :cond_1

    add-int v0, p1, p2

    .line 2
    array-length v1, p0

    if-gt v0, v1, :cond_0

    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/github/luben/zstd/Zstd;->decompressedSize0([BIIZ)J

    move-result-wide p0

    return-wide p0

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p0

    .line 5
    :cond_1
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p0
.end method

.method private static native decompressedSize0([BIIZ)J
.end method

.method public static native defaultCompressionLevel()I
.end method

.method public static native errChecksumWrong()J
.end method

.method public static native errCorruptionDetected()J
.end method

.method public static native errDictionaryCorrupted()J
.end method

.method public static native errDictionaryCreationFailed()J
.end method

.method public static native errDictionaryWrong()J
.end method

.method public static native errDstBufferNull()J
.end method

.method public static native errDstSizeTooSmall()J
.end method

.method public static native errFrameParameterUnsupported()J
.end method

.method public static native errFrameParameterWindowTooLarge()J
.end method

.method public static native errGeneric()J
.end method

.method public static native errInitMissing()J
.end method

.method public static native errMaxSymbolValueTooLarge()J
.end method

.method public static native errMaxSymbolValueTooSmall()J
.end method

.method public static native errMemoryAllocation()J
.end method

.method public static native errNoError()J
.end method

.method public static native errParameterOutOfBound()J
.end method

.method public static native errParameterUnsupported()J
.end method

.method public static native errPrefixUnknown()J
.end method

.method public static native errSrcSizeWrong()J
.end method

.method public static native errStageWrong()J
.end method

.method public static native errTableLogTooLarge()J
.end method

.method public static native errVersionUnsupported()J
.end method

.method public static native errWorkSpaceTooSmall()J
.end method

.method public static native findDirectByteBufferFrameCompressedSize(Ljava/nio/ByteBuffer;II)J
.end method

.method public static findFrameCompressedSize(Ljava/nio/ByteBuffer;)J
    .locals 3

    .line 10
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {p0, v0, v1}, Lcom/github/luben/zstd/Zstd;->findDirectByteBufferFrameCompressedSize(Ljava/nio/ByteBuffer;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static findFrameCompressedSize([B)J
    .locals 2

    const/4 v0, 0x0

    .line 9
    invoke-static {p0, v0}, Lcom/github/luben/zstd/Zstd;->findFrameCompressedSize([BI)J

    move-result-wide v0

    return-wide v0
.end method

.method public static findFrameCompressedSize([BI)J
    .locals 1

    .line 8
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p0, p1, v0}, Lcom/github/luben/zstd/Zstd;->findFrameCompressedSize([BII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static findFrameCompressedSize([BII)J
    .locals 2

    .line 1
    array-length v0, p0

    if-ge p1, v0, :cond_2

    add-int v0, p1, p2

    .line 2
    array-length v1, p0

    if-gt v0, v1, :cond_1

    .line 3
    invoke-static {p0, p1, p2}, Lcom/github/luben/zstd/Zstd;->findFrameCompressedSize0([BII)J

    move-result-wide p0

    .line 4
    invoke-static {p0, p1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p2

    if-nez p2, :cond_0

    return-wide p0

    .line 5
    :cond_0
    new-instance p2, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p2, p0, p1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p2

    .line 6
    :cond_1
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p0

    .line 7
    :cond_2
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p0
.end method

.method private static native findFrameCompressedSize0([BII)J
.end method

.method public static native generateSequences(JJJJJ)V
.end method

.method public static getArrayBackedBuffer(Lcom/github/luben/zstd/BufferPool;I)Ljava/nio/ByteBuffer;
    .locals 4

    invoke-interface {p0, p1}, Lcom/github/luben/zstd/BufferPool;->get(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0, v0}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "provided ByteBuffer lacks array or has non-zero arrayOffset"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/github/luben/zstd/ZstdIOException;

    invoke-static {}, Lcom/github/luben/zstd/Zstd;->errMemoryAllocation()J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot get ByteBuffer of size "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " from the BufferPool"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(JLjava/lang/String;)V

    throw p0
.end method

.method public static native getBuiltinSequenceProducer()J
.end method

.method public static native getDictIdFromDict([B)J
.end method

.method public static getDictIdFromDictDirect(Ljava/nio/ByteBuffer;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    sub-int/2addr v0, v1

    .line 2
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v1

    if-eqz v1, :cond_1

    if-ltz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-static {p0, v1, v0}, Lcom/github/luben/zstd/Zstd;->getDictIdFromDictDirect(Ljava/nio/ByteBuffer;II)J

    move-result-wide v0

    return-wide v0

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "dict cannot be empty."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 5
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "dict must be a direct buffer"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static native getDictIdFromDictDirect(Ljava/nio/ByteBuffer;II)J
.end method

.method public static native getDictIdFromFrame([B)J
.end method

.method public static native getDictIdFromFrameBuffer(Ljava/nio/ByteBuffer;)J
.end method

.method public static getDirectByteBufferFrameContentSize(Ljava/nio/ByteBuffer;II)J
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, p2, v0}, Lcom/github/luben/zstd/Zstd;->getDirectByteBufferFrameContentSize(Ljava/nio/ByteBuffer;IIZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static native getDirectByteBufferFrameContentSize(Ljava/nio/ByteBuffer;IIZ)J
.end method

.method public static native getErrorCode(J)J
.end method

.method public static native getErrorName(J)Ljava/lang/String;
.end method

.method public static getFrameContentSize(Ljava/nio/ByteBuffer;)J
    .locals 3

    .line 9
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {p0, v0, v1}, Lcom/github/luben/zstd/Zstd;->getDirectByteBufferFrameContentSize(Ljava/nio/ByteBuffer;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFrameContentSize([B)J
    .locals 2

    const/4 v0, 0x0

    .line 8
    invoke-static {p0, v0}, Lcom/github/luben/zstd/Zstd;->getFrameContentSize([BI)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFrameContentSize([BI)J
    .locals 1

    .line 7
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p0, p1, v0}, Lcom/github/luben/zstd/Zstd;->getFrameContentSize([BII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static getFrameContentSize([BII)J
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-static {p0, p1, p2, v0}, Lcom/github/luben/zstd/Zstd;->getFrameContentSize([BIIZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static getFrameContentSize([BIIZ)J
    .locals 2

    .line 1
    array-length v0, p0

    if-ge p1, v0, :cond_1

    add-int v0, p1, p2

    .line 2
    array-length v1, p0

    if-gt v0, v1, :cond_0

    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/github/luben/zstd/Zstd;->getFrameContentSize0([BIIZ)J

    move-result-wide p0

    return-wide p0

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p0

    .line 5
    :cond_1
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p0
.end method

.method private static native getFrameContentSize0([BIIZ)J
.end method

.method public static native getStubSequenceProducer()J
.end method

.method public static native hashLogMax()I
.end method

.method public static native hashLogMin()I
.end method

.method public static native isError(J)Z
.end method

.method public static native loadDictCompress(J[BI)I
.end method

.method public static native loadDictDecompress(J[BI)I
.end method

.method public static native loadFastDictCompress(JLcom/github/luben/zstd/ZstdDictCompress;)I
.end method

.method public static native loadFastDictDecompress(JLcom/github/luben/zstd/ZstdDictDecompress;)I
.end method

.method public static native magicNumber()I
.end method

.method public static native maxCompressionLevel()I
.end method

.method public static native minCompressionLevel()I
.end method

.method public static native registerSequenceProducer(JJJ)V
.end method

.method public static native searchLengthMax()I
.end method

.method public static native searchLengthMin()I
.end method

.method public static native searchLogMax()I
.end method

.method public static native searchLogMin()I
.end method

.method public static native setCompressionChainLog(JI)I
.end method

.method public static native setCompressionChecksums(JZ)I
.end method

.method public static native setCompressionHashLog(JI)I
.end method

.method public static native setCompressionJobSize(JI)I
.end method

.method public static native setCompressionLevel(JI)I
.end method

.method public static native setCompressionLong(JI)I
.end method

.method public static native setCompressionMagicless(JZ)I
.end method

.method public static native setCompressionMinMatch(JI)I
.end method

.method public static native setCompressionOverlapLog(JI)I
.end method

.method public static native setCompressionSearchLog(JI)I
.end method

.method public static native setCompressionStrategy(JI)I
.end method

.method public static native setCompressionTargetLength(JI)I
.end method

.method public static native setCompressionWindowLog(JI)I
.end method

.method public static native setCompressionWorkers(JI)I
.end method

.method public static native setDecompressionLongMax(JI)I
.end method

.method public static native setDecompressionMagicless(JZ)I
.end method

.method public static native setEnableLongDistanceMatching(JI)I
.end method

.method public static native setRefMultipleDDicts(JZ)I
.end method

.method public static native setSearchForExternalRepcodes(JI)I
.end method

.method public static native setSequenceProducerFallback(JZ)I
.end method

.method public static native setValidateSequences(JI)I
.end method

.method public static trainFromBuffer([[B[B)J
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-static {p0, p1, v0}, Lcom/github/luben/zstd/Zstd;->trainFromBuffer([[B[BZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static trainFromBuffer([[B[BZ)J
    .locals 1

    .line 1
    invoke-static {}, Lcom/github/luben/zstd/Zstd;->defaultCompressionLevel()I

    move-result v0

    invoke-static {p0, p1, p2, v0}, Lcom/github/luben/zstd/Zstd;->trainFromBuffer([[B[BZI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static trainFromBuffer([[B[BZI)J
    .locals 2

    .line 2
    array-length v0, p0

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/github/luben/zstd/Zstd;->trainFromBuffer0([[B[BZI)J

    move-result-wide p0

    return-wide p0

    .line 4
    :cond_0
    new-instance p0, Lcom/github/luben/zstd/ZstdException;

    invoke-static {}, Lcom/github/luben/zstd/Zstd;->errGeneric()J

    move-result-wide p1

    const-string p3, "nb of samples too low"

    invoke-direct {p0, p1, p2, p3}, Lcom/github/luben/zstd/ZstdException;-><init>(JLjava/lang/String;)V

    throw p0
.end method

.method private static native trainFromBuffer0([[B[BZI)J
.end method

.method public static trainFromBufferDirect(Ljava/nio/ByteBuffer;[ILjava/nio/ByteBuffer;)J
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-static {p0, p1, p2, v0}, Lcom/github/luben/zstd/Zstd;->trainFromBufferDirect(Ljava/nio/ByteBuffer;[ILjava/nio/ByteBuffer;Z)J

    move-result-wide p0

    return-wide p0
.end method

.method public static trainFromBufferDirect(Ljava/nio/ByteBuffer;[ILjava/nio/ByteBuffer;Z)J
    .locals 1

    .line 1
    invoke-static {}, Lcom/github/luben/zstd/Zstd;->defaultCompressionLevel()I

    move-result v0

    invoke-static {p0, p1, p2, p3, v0}, Lcom/github/luben/zstd/Zstd;->trainFromBufferDirect(Ljava/nio/ByteBuffer;[ILjava/nio/ByteBuffer;ZI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static trainFromBufferDirect(Ljava/nio/ByteBuffer;[ILjava/nio/ByteBuffer;ZI)J
    .locals 2

    .line 2
    array-length v0, p1

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/github/luben/zstd/Zstd;->trainFromBufferDirect0(Ljava/nio/ByteBuffer;[ILjava/nio/ByteBuffer;ZI)J

    move-result-wide p0

    return-wide p0

    .line 4
    :cond_0
    new-instance p0, Lcom/github/luben/zstd/ZstdException;

    invoke-static {}, Lcom/github/luben/zstd/Zstd;->errGeneric()J

    move-result-wide p1

    const-string p3, "nb of samples too low"

    invoke-direct {p0, p1, p2, p3}, Lcom/github/luben/zstd/ZstdException;-><init>(JLjava/lang/String;)V

    throw p0
.end method

.method private static native trainFromBufferDirect0(Ljava/nio/ByteBuffer;[ILjava/nio/ByteBuffer;ZI)J
.end method

.method public static native windowLogMax()I
.end method

.method public static native windowLogMin()I
.end method
