.class public Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# static fields
.field private static final srcBuffSize:I


# instance fields
.field private final bufferPool:Lcom/github/luben/zstd/BufferPool;

.field private dstPos:J

.field private frameFinished:Z

.field private isClosed:Z

.field private isContinuous:Z

.field private needRead:Z

.field private final src:[B

.field private final srcByteBuffer:Ljava/nio/ByteBuffer;

.field private srcPos:J

.field private srcSize:J

.field private final stream:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/github/luben/zstd/util/Native;->load()V

    invoke-static {}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->recommendedDInSize()J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcBuffSize:I

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/github/luben/zstd/NoPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {p0, p1, v0}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;-><init>(Ljava/io/InputStream;Lcom/github/luben/zstd/BufferPool;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lcom/github/luben/zstd/BufferPool;)V
    .locals 2

    .line 2
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    .line 4
    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcPos:J

    .line 5
    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->needRead:Z

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isContinuous:Z

    .line 8
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->frameFinished:Z

    .line 9
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z

    .line 10
    iput-object p2, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    .line 11
    sget p1, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcBuffSize:I

    invoke-static {p2, p1}, Lcom/github/luben/zstd/Zstd;->getArrayBackedBuffer(Lcom/github/luben/zstd/BufferPool;I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcByteBuffer:Ljava/nio/ByteBuffer;

    .line 12
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->src:[B

    .line 13
    monitor-enter p0

    .line 14
    :try_start_0
    invoke-static {}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->createDStream()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->initDStream(J)I

    .line 16
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static native createDStream()J
.end method

.method private native decompressStream(J[BI[BI)I
.end method

.method private static native freeDStream(J)I
.end method

.method private native initDStream(J)I
.end method

.method public static native recommendedDInSize()J
.end method

.method public static native recommendedDOutSize()J
.end method


# virtual methods
.method public declared-synchronized available()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->needRead:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public declared-synchronized close()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    iget-object v1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcByteBuffer:Ljava/nio/ByteBuffer;

    invoke-interface {v0, v1}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->freeDStream(J)I

    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public declared-synchronized getContinuous()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isContinuous:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public markSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public declared-synchronized read()I
    .locals 4

    monitor-enter p0

    const/4 v0, 0x1

    .line 6
    :try_start_0
    new-array v1, v0, [B

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-nez v3, :cond_0

    .line 7
    invoke-virtual {p0, v1, v2, v0}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->readInternal([BII)I

    move-result v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    if-ne v3, v0, :cond_1

    .line 8
    aget-byte v0, v1, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/lit16 v0, v0, 0xff

    monitor-exit p0

    return v0

    .line 9
    :cond_1
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized read([BII)I
    .locals 3

    monitor-enter p0

    if-ltz p2, :cond_2

    .line 1
    :try_start_0
    array-length v0, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_2

    const/4 v0, 0x0

    if-nez p3, :cond_0

    .line 2
    monitor-exit p0

    return v0

    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 3
    :try_start_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->readInternal([BII)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 4
    :cond_1
    monitor-exit p0

    return v0

    .line 5
    :cond_2
    :try_start_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requested length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " from offset "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " in buffer of size "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public readInternal([BII)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move/from16 v1, p2

    move/from16 v2, p3

    iget-boolean v4, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z

    if-nez v4, :cond_c

    if-ltz v1, :cond_b

    array-length v4, v3

    sub-int/2addr v4, v1

    if-gt v2, v4, :cond_b

    add-int v4, v1, v2

    int-to-long v7, v1

    iput-wide v7, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    const-wide/16 v1, -0x1

    :goto_0
    iget-wide v5, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    int-to-long v9, v4

    cmp-long v11, v5, v9

    if-gez v11, :cond_a

    cmp-long v1, v1, v5

    if-gez v1, :cond_a

    iget-boolean v1, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->needRead:Z

    const/4 v11, 0x0

    if-eqz v1, :cond_5

    iget-object v1, v0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v1

    if-gtz v1, :cond_0

    iget-wide v1, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    cmp-long v1, v1, v7

    if-nez v1, :cond_5

    :cond_0
    iget-object v1, v0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-object v2, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->src:[B

    sget v5, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcBuffSize:I

    invoke-virtual {v1, v2, v11, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    int-to-long v1, v1

    iput-wide v1, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    const-wide/16 v5, 0x0

    iput-wide v5, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcPos:J

    cmp-long v1, v1, v5

    if-gez v1, :cond_4

    iput-wide v5, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    iget-boolean v1, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->frameFinished:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    iget-boolean v1, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isContinuous:Z

    if-eqz v1, :cond_3

    iget-wide v3, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    sub-long/2addr v3, v7

    long-to-int v1, v3

    int-to-long v3, v1

    iput-wide v3, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    cmp-long v1, v3, v5

    if-lez v1, :cond_2

    long-to-int v1, v3

    return v1

    :cond_2
    return v2

    :cond_3
    new-instance v1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-static {}, Lcom/github/luben/zstd/Zstd;->errCorruptionDetected()J

    move-result-wide v2

    const-string v4, "Truncated source"

    invoke-direct {v1, v2, v3, v4}, Lcom/github/luben/zstd/ZstdIOException;-><init>(JLjava/lang/String;)V

    throw v1

    :cond_4
    iput-boolean v11, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->frameFinished:Z

    :cond_5
    iget-wide v12, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    iget-wide v1, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    iget-object v5, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->src:[B

    iget-wide v14, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    long-to-int v6, v14

    invoke-direct/range {v0 .. v6}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->decompressStream(J[BI[BI)I

    move-result v1

    int-to-long v5, v1

    invoke-static {v5, v6}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v2

    if-nez v2, :cond_9

    const/4 v2, 0x1

    if-nez v1, :cond_7

    iput-boolean v2, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->frameFinished:Z

    iget-wide v3, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcPos:J

    iget-wide v5, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->srcSize:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_6

    move v11, v2

    :cond_6
    iput-boolean v11, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->needRead:Z

    iget-wide v1, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    sub-long/2addr v1, v7

    long-to-int v1, v1

    return v1

    :cond_7
    iget-wide v5, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->dstPos:J

    cmp-long v1, v5, v9

    if-gez v1, :cond_8

    move v11, v2

    :cond_8
    iput-boolean v11, v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->needRead:Z

    move-wide v1, v12

    goto/16 :goto_0

    :cond_9
    new-instance v1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {v1, v5, v6}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw v1

    :cond_a
    sub-long/2addr v5, v7

    long-to-int v1, v5

    return v1

    :cond_b
    new-instance v4, Ljava/lang/IndexOutOfBoundsException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Requested length "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " from offset "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " in buffer of size "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, v3

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_c
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Stream closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public declared-synchronized setContinuous(Z)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isContinuous:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setDict(Lcom/github/luben/zstd/ZstdDictDecompress;)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
    .locals 3

    monitor-enter p0

    .line 6
    :try_start_0
    invoke-virtual {p1}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :try_start_1
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->loadFastDictDecompress(JLcom/github/luben/zstd/ZstdDictDecompress;)I

    move-result v0

    int-to-long v0, v0

    .line 8
    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v2, :cond_0

    .line 9
    :try_start_2
    invoke-virtual {p1}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 11
    :cond_0
    :try_start_3
    new-instance v2, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {v2, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    .line 12
    :try_start_4
    invoke-virtual {p1}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    .line 13
    throw v0

    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public declared-synchronized setDict([B)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    array-length v2, p1

    invoke-static {v0, v1, p1, v2}, Lcom/github/luben/zstd/Zstd;->loadDictDecompress(J[BI)I

    move-result p1

    int-to-long v0, p1

    .line 2
    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 3
    monitor-exit p0

    return-object p0

    .line 4
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :catchall_0
    move-exception p1

    .line 5
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setLongMax(I)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setDecompressionLongMax(JI)I

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

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized setRefMultipleDDicts(Z)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->stream:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setRefMultipleDDicts(JZ)I

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

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized skip(J)J
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->isClosed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_4

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    monitor-exit p0

    return-wide v0

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->recommendedDOutSize()J

    move-result-wide v2

    long-to-int v2, v2

    int-to-long v3, v2

    cmp-long v3, v3, p1

    if-lez v3, :cond_1

    long-to-int v2, p1

    :cond_1
    iget-object v3, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    invoke-static {v3, v2}, Lcom/github/luben/zstd/Zstd;->getArrayBackedBuffer(Lcom/github/luben/zstd/BufferPool;I)Ljava/nio/ByteBuffer;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    move-wide v5, p1

    :goto_0
    cmp-long v7, v5, v0

    if-lez v7, :cond_3

    int-to-long v7, v2

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    long-to-int v7, v7

    const/4 v8, 0x0

    invoke-virtual {p0, v4, v8, v7}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->read([BII)I

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-gez v7, :cond_2

    goto :goto_1

    :cond_2
    int-to-long v7, v7

    sub-long/2addr v5, v7

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    :goto_1
    :try_start_3
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    invoke-interface {v0, v3}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    sub-long/2addr p1, v5

    monitor-exit p0

    return-wide p1

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_4
    iget-object p2, p0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->bufferPool:Lcom/github/luben/zstd/BufferPool;

    invoke-interface {p2, v3}, Lcom/github/luben/zstd/BufferPool;->release(Ljava/nio/ByteBuffer;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_3
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method
