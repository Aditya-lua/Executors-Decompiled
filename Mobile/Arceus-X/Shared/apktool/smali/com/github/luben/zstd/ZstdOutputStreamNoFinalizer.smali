.class public Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# static fields
.field private static final dstSize:I


# instance fields
.field private final bufferPool:Lcom/github/luben/zstd/BufferPool;

.field private closeFrameOnFlush:Z

.field private final dst:[B

.field private final dstByteBuffer:Ljava/nio/ByteBuffer;

.field private dstPos:J

.field private frameClosed:Z

.field private frameStarted:Z

.field private isClosed:Z

.field private srcPos:J

.field private final stream:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/github/luben/zstd/util/Native;->load()V

    invoke-static {}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->recommendedCOutSize()J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    .line 3
    sget-object v0, Lcom/github/luben/zstd/NoPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {p0, p1, v0}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;-><init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/github/luben/zstd/NoPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {p0, p1, v0}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;-><init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V

    .line 2
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p2}, Lcom/github/luben/zstd/Zstd;->setCompressionLevel(JI)I

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V
    .locals 2

    .line 6
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->srcPos:J

    .line 8
    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstPos:J

    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    .line 10
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->closeFrameOnFlush:Z

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    .line 12
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameStarted:Z

    .line 13
    invoke-static {}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->createCStream()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    .line 14
    iput-object p2, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    .line 15
    sget p1, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    invoke-static {p2, p1}, Lcom/github/luben/zstd/Zstd;->getArrayBackedBuffer(Lcom/github/luben/zstd/BufferPool;I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstByteBuffer:Ljava/nio/ByteBuffer;

    .line 16
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;I)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;-><init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V

    .line 5
    iget-wide p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {p1, p2, p3}, Lcom/github/luben/zstd/Zstd;->setCompressionLevel(JI)I

    return-void
.end method

.method private close(Z)V
    .locals 7

    .line 3
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameStarted:Z

    const/4 v2, 0x0

    if-nez v1, :cond_2

    .line 5
    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-direct {p0, v3, v4}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->resetCStream(J)I

    move-result v1

    int-to-long v3, v1

    .line 6
    invoke-static {v3, v4}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v1

    if-nez v1, :cond_1

    .line 7
    iput-boolean v2, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 8
    :cond_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v3, v4}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    .line 9
    :cond_2
    :goto_0
    iget-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-nez v1, :cond_5

    .line 10
    :cond_3
    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    iget-object v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    sget v5, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    invoke-direct {p0, v3, v4, v1, v5}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->endStream(J[BI)I

    move-result v1

    int-to-long v3, v1

    .line 11
    invoke-static {v3, v4}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v5

    if-nez v5, :cond_4

    .line 12
    iget-object v3, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v4, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    iget-wide v5, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstPos:J

    long-to-int v5, v5

    invoke-virtual {v3, v4, v2, v5}, Ljava/io/OutputStream;->write([BII)V

    if-gtz v1, :cond_3

    goto :goto_1

    .line 13
    :cond_4
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v3, v4}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :cond_5
    :goto_1
    if-eqz p1, :cond_6

    .line 14
    iget-object p1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :cond_6
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    .line 16
    iget-object p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstByteBuffer:Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V

    .line 17
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->freeCStream(J)I

    return-void

    .line 18
    :goto_2
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    .line 19
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    iget-object v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstByteBuffer:Ljava/nio/ByteBuffer;

    invoke-interface {v0, v1}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V

    .line 20
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->freeCStream(J)I

    .line 21
    throw p1
.end method

.method private native compressStream(J[BI[BI)I
.end method

.method private static native createCStream()J
.end method

.method private native endStream(J[BI)I
.end method

.method private native flushStream(J[BI)I
.end method

.method private static native freeCStream(J)I
.end method

.method public static native recommendedCOutSize()J
.end method

.method private native resetCStream(J)I
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    .line 1
    :try_start_0
    invoke-direct {p0, v0}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->close(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized closeWithoutClosingParentStream()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->close(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized flush()V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->closeFrameOnFlush:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    :cond_0
    iget-wide v2, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    sget v4, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    invoke-direct {p0, v2, v3, v0, v4}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->endStream(J[BI)I

    move-result v0

    int-to-long v2, v0

    invoke-static {v2, v3}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v2, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    iget-wide v4, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstPos:J

    long-to-int v4, v4

    invoke-virtual {v2, v3, v1, v4}, Ljava/io/OutputStream;->write([BII)V

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v0, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {v0, v2, v3}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw v0

    :cond_2
    iget-wide v2, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    sget v4, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I

    invoke-direct {p0, v2, v3, v0, v4}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->flushStream(J[BI)I

    move-result v0

    int-to-long v2, v0

    invoke-static {v2, v3}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v2, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    iget-wide v4, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstPos:J

    long-to-int v4, v4

    invoke-virtual {v2, v3, v1, v4}, Ljava/io/OutputStream;->write([BII)V

    if-gtz v0, :cond_2

    :goto_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {v0, v2, v3}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_1
    monitor-exit p0

    return-void

    :cond_5
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "StreamClosed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized setChainLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionChainLog(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setChecksum(Z)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionChecksums(JZ)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setCloseFrameOnFlush(Z)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_0

    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->closeFrameOnFlush:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    .line 8
    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    .line 9
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->loadFastDictCompress(JLcom/github/luben/zstd/ZstdDictCompress;)I

    move-result p1

    int-to-long v0, p1

    .line 10
    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 11
    monitor-exit p0

    return-object p0

    .line 12
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 13
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setDict([B)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    .line 2
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    array-length v2, p1

    invoke-static {v0, v1, p1, v2}, Lcom/github/luben/zstd/Zstd;->loadDictCompress(J[BI)I

    move-result p1

    int-to-long v0, p1

    .line 3
    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 4
    monitor-exit p0

    return-object p0

    .line 5
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setHashLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionHashLog(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setJobSize(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionJobSize(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setLevel(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionLevel(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setLong(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionLong(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setMinMatch(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionMinMatch(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setOverlapLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionOverlapLog(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setSearchLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionSearchLog(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setStrategy(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionStrategy(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setTargetLength(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionTargetLength(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setWindowLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionWindowLog(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setWorkers(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionWorkers(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public write(I)V
    .locals 3

    int-to-byte p1, p1

    const/4 v0, 0x1

    .line 18
    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    .line 19
    invoke-virtual {p0, v1, v2, v0}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->write([BII)V

    return-void
.end method

.method public declared-synchronized write([BII)V
    .locals 9

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->isClosed:Z

    if-nez v0, :cond_5

    .line 2
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    :try_start_1
    iget-wide v2, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    invoke-direct {p0, v2, v3}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->resetCStream(J)I

    move-result v0

    int-to-long v2, v0

    .line 4
    invoke-static {v2, v3}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    iput-boolean v1, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameClosed:Z

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->frameStarted:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v2, p0

    goto :goto_4

    .line 7
    :cond_0
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v2, v3}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :goto_0
    add-int v8, p2, p3

    int-to-long p2, p2

    .line 8
    :try_start_2
    iput-wide p2, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->srcPos:J

    .line 9
    :goto_1
    iget-wide p2, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->srcPos:J

    int-to-long v2, v8

    cmp-long p2, p2, v2

    if-gez p2, :cond_4

    .line 10
    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->stream:J

    iget-object v5, p0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    sget v6, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstSize:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v2, p0

    move-object v7, p1

    :try_start_3
    invoke-direct/range {v2 .. v8}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->compressStream(J[BI[BI)I

    move-result p1

    int-to-long p1, p1

    .line 11
    invoke-static {p1, p2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p3

    if-nez p3, :cond_3

    .line 12
    iget-wide p1, v2, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dstPos:J

    const-wide/16 v3, 0x0

    cmp-long p3, p1, v3

    if-lez p3, :cond_2

    .line 13
    iget-object p3, v2, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v0, v2, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->dst:[B

    long-to-int p1, p1

    invoke-virtual {p3, v0, v1, p1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_4

    :cond_2
    :goto_3
    move-object p1, v7

    goto :goto_1

    .line 14
    :cond_3
    new-instance p3, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p3, p1, p2}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_2
    move-exception v0

    move-object v2, p0

    goto :goto_2

    :cond_4
    move-object v2, p0

    .line 15
    monitor-exit p0

    return-void

    :cond_5
    move-object v2, p0

    .line 16
    :try_start_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "StreamClosed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :goto_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method
