.class public Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field private closed:Z

.field private consumed:I

.field private dict:[B

.field private fastDict:Lcom/github/luben/zstd/ZstdDictCompress;

.field private initialized:Z

.field private level:I

.field private produced:I

.field private final stream:J

.field private target:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/github/luben/zstd/util/Native;->load()V

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->consumed:I

    iput v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->produced:I

    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->closed:Z

    iput-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initialized:Z

    invoke-static {}, Lcom/github/luben/zstd/Zstd;->defaultCompressionLevel()I

    move-result v0

    iput v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->level:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->dict:[B

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->fastDict:Lcom/github/luben/zstd/ZstdDictCompress;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    iput p2, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->level:I

    invoke-static {}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->createCStream()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->stream:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Target buffer should be a direct buffer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private native compressDirectByteBuffer(JLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J
.end method

.method private static native createCStream()J
.end method

.method private native endStream(JLjava/nio/ByteBuffer;II)J
.end method

.method private native flushStream(JLjava/nio/ByteBuffer;II)J
.end method

.method private static native freeCStream(J)J
.end method

.method private native initCStream(JI)J
.end method

.method private native initCStreamWithDict(J[BII)J
.end method

.method private native initCStreamWithFastDict(JLcom/github/luben/zstd/ZstdDictCompress;)J
.end method

.method private static native recommendedCOutSize()J
.end method

.method public static recommendedOutputBufferSize()I
    .locals 2

    invoke-static {}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->recommendedCOutSize()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method


# virtual methods
.method public close()V
    .locals 10

    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->closed:Z

    if-nez v0, :cond_6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_0
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initialized:Z

    if-eqz v0, :cond_5

    :cond_0
    iget-wide v5, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->stream:J

    iget-object v7, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v7}, Ljava/nio/Buffer;->position()I

    move-result v8

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v4, p0

    :try_start_1
    invoke-direct/range {v4 .. v9}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->endStream(JLjava/nio/ByteBuffer;II)J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v7

    iget v8, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->produced:I

    add-int/2addr v7, v8

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->flushBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_3

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    if-lez v0, :cond_2

    iget-object v5, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v5, "The target buffer has no more space, even after flushing, and there are still bytes to compress"

    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    :goto_0
    if-gtz v0, :cond_0

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v5, "Target buffer should be a direct buffer"

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {v0, v5, v6}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_1
    move-exception v0

    move-object v4, p0

    goto :goto_2

    :cond_5
    move-object v4, p0

    :goto_1
    iget-wide v5, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->stream:J

    invoke-static {v5, v6}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->freeCStream(J)J

    iput-boolean v3, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->closed:Z

    iput-boolean v2, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initialized:Z

    iput-object v1, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    return-void

    :goto_2
    iget-wide v5, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->stream:J

    invoke-static {v5, v6}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->freeCStream(J)J

    iput-boolean v3, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->closed:Z

    iput-boolean v2, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initialized:Z

    iput-object v1, v4, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    throw v0

    :cond_6
    move-object v4, p0

    return-void
.end method

.method public compress(Ljava/nio/ByteBuffer;)V
    .locals 11

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->closed:Z

    if-nez v0, :cond_9

    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initialized:Z

    if-nez v0, :cond_3

    iget-object v1, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->fastDict:Lcom/github/luben/zstd/ZstdDictCompress;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v2, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->stream:J

    invoke-direct {p0, v2, v3, v1}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initCStreamWithFastDict(JLcom/github/luben/zstd/ZstdDictCompress;)J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    move-wide v0, v2

    move-object v2, p0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {v1}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1

    :cond_0
    iget-object v5, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->dict:[B

    if-eqz v5, :cond_1

    iget-wide v3, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->stream:J

    array-length v6, v5

    iget v7, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->level:I

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initCStreamWithDict(J[BII)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    move-object v2, p0

    iget-wide v0, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->stream:J

    iget v3, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->level:I

    invoke-direct {p0, v0, v1, v3}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initCStream(JI)J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v3

    if-nez v3, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initialized:Z

    goto :goto_1

    :cond_2
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :cond_3
    move-object v2, p0

    :goto_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->flushBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "The target buffer has no more space, even after flushing, and there are still bytes to compress"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Target buffer should be a direct buffer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    iget-wide v3, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->stream:J

    iget-object v5, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    move-result v6

    iget-object v0, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v7

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v9

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v10

    move-object v8, p1

    invoke-direct/range {v2 .. v10}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->compressDirectByteBuffer(JLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    iget v1, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->produced:I

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v8}, Ljava/nio/Buffer;->position()I

    move-result p1

    iget v0, v2, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->consumed:I

    add-int/2addr p1, v0

    invoke-virtual {v8, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    move-object p1, v8

    goto :goto_1

    :cond_7
    new-instance p1, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw p1

    :cond_8
    return-void

    :cond_9
    move-object v2, p0

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Stream closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    move-object v2, p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Source buffer should be a direct buffer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public flush()V
    .locals 7

    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->closed:Z

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initialized:Z

    if-eqz v0, :cond_5

    :cond_0
    iget-wide v2, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->stream:J

    iget-object v4, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v5

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v6

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->flushStream(JLjava/nio/ByteBuffer;II)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    iget v5, v1, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->produced:I

    add-int/2addr v4, v5

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v1, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->flushBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v1, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_3

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    iget-object v2, v1, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->target:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v2, "The target buffer has no more space, even after flushing, and there are still bytes to compress"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    if-gtz v0, :cond_0

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Target buffer should be a direct buffer"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lcom/github/luben/zstd/ZstdIOException;

    invoke-direct {v0, v2, v3}, Lcom/github/luben/zstd/ZstdIOException;-><init>(J)V

    throw v0

    :cond_5
    move-object v1, p0

    :goto_1
    return-void

    :cond_6
    move-object v1, p0

    new-instance v0, Ljava/io/IOException;

    const-string v2, "Already closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public flushBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 0

    return-object p1
.end method

.method public setDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;
    .locals 1

    .line 5
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initialized:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->dict:[B

    .line 7
    iput-object p1, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->fastDict:Lcom/github/luben/zstd/ZstdDictCompress;

    return-object p0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDict([B)Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->initialized:Z

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->dict:[B

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->fastDict:Lcom/github/luben/zstd/ZstdDictCompress;

    return-object p0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Change of parameter on initialized stream"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
