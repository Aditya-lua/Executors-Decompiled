.class public Lcom/github/luben/zstd/ZstdCompressCtx;
.super Lcom/github/luben/zstd/AutoCloseBase;
.source "SourceFile"


# instance fields
.field private compression_dict:Lcom/github/luben/zstd/ZstdDictCompress;

.field private nativePtr:J

.field private seqprod:Lcom/github/luben/zstd/SequenceProducer;

.field private seqprod_state:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/github/luben/zstd/util/Native;->load()V

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/github/luben/zstd/AutoCloseBase;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->compression_dict:Lcom/github/luben/zstd/ZstdDictCompress;

    iput-object v2, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod:Lcom/github/luben/zstd/SequenceProducer;

    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod_state:J

    invoke-static {}, Lcom/github/luben/zstd/ZstdCompressCtx;->init()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->storeFence()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ZSTD_createCompressCtx failed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static native compressByteArray0(J[BII[BII)J
.end method

.method private static native compressDirectByteBuffer0(JLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J
.end method

.method private static native compressDirectByteBufferStream0(JLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;III)J
.end method

.method private ensureOpen()V
    .locals 4

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Compression context is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static native free(J)V
.end method

.method private static native getFrameProgression0(J)Lcom/github/luben/zstd/ZstdFrameProgression;
.end method

.method private static native init()J
.end method

.method private native loadCDict0(J[B)J
.end method

.method private native loadCDictFast0(JLcom/github/luben/zstd/ZstdDictCompress;)J
.end method

.method private static native reset0(J)J
.end method

.method private static native setChecksum0(JZ)V
.end method

.method private static native setContentSize0(JZ)V
.end method

.method private static native setDictID0(JZ)V
.end method

.method private static native setLevel0(JI)V
.end method

.method private static native setPledgedSrcSize0(JJ)J
.end method


# virtual methods
.method public bridge synthetic close()V
    .locals 0

    invoke-super {p0}, Lcom/github/luben/zstd/AutoCloseBase;->close()V

    return-void
.end method

.method public compress(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v2

    .line 2
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    sub-int v3, v0, v1

    .line 3
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    move-result v5

    .line 4
    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    move-result v1

    sub-int v6, v0, v1

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    .line 5
    invoke-virtual/range {v0 .. v6}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I

    move-result p1

    .line 6
    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    move-result p2

    invoke-virtual {v4, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 7
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result p2

    add-int/2addr p2, p1

    invoke-virtual {v1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return p1
.end method

.method public compress([B[B)I
    .locals 7

    .line 16
    array-length v3, p1

    const/4 v5, 0x0

    array-length v6, p2

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-virtual/range {v0 .. v6}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressByteArray([BII[BII)I

    move-result p1

    return p1
.end method

.method public compress(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 10

    .line 8
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->compressBound(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    long-to-int v6, v0

    .line 9
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 10
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v8

    .line 11
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    sub-int v9, v0, v1

    const/4 v5, 0x0

    move-object v3, p0

    move-object v7, p1

    .line 12
    invoke-virtual/range {v3 .. v9}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I

    move-result p1

    .line 13
    invoke-virtual {v7}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 14
    invoke-virtual {v4, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    return-object v4

    .line 15
    :cond_0
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-static {}, Lcom/github/luben/zstd/Zstd;->errGeneric()J

    move-result-wide v0

    const-string v2, "Max output size is greater than MAX_INT"

    invoke-direct {p1, v0, v1, v2}, Lcom/github/luben/zstd/ZstdException;-><init>(JLjava/lang/String;)V

    throw p1
.end method

.method public compress([B)[B
    .locals 10

    .line 17
    array-length v0, p1

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->compressBound(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    long-to-int v6, v0

    .line 18
    new-array v4, v6, [B

    const/4 v8, 0x0

    .line 19
    array-length v9, p1

    const/4 v5, 0x0

    move-object v3, p0

    move-object v7, p1

    invoke-virtual/range {v3 .. v9}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressByteArray([BII[BII)I

    move-result p1

    const/4 v0, 0x0

    .line 20
    invoke-static {v4, v0, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    return-object p1

    .line 21
    :cond_0
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-static {}, Lcom/github/luben/zstd/Zstd;->errGeneric()J

    move-result-wide v0

    const-string v2, "Max output size is greater than MAX_INT"

    invoke-direct {p1, v0, v1, v2}, Lcom/github/luben/zstd/ZstdException;-><init>(JLjava/lang/String;)V

    throw p1
.end method

.method public compressByteArray([BII[BII)I
    .locals 9

    array-length v0, p4

    invoke-static {p5, p6, v0}, Lcom/github/luben/zstd/Objects;->checkFromIndexSize(III)V

    array-length v0, p1

    invoke-static {p2, p3, v0}, Lcom/github/luben/zstd/Objects;->checkFromIndexSize(III)V

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    move v7, p5

    move v8, p6

    invoke-static/range {v1 .. v8}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressByteArray0(J[BII[BII)J

    move-result-wide p1

    invoke-static {p1, p2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p3, :cond_1

    const-wide/32 p3, 0x7fffffff

    cmp-long p3, p1, p3

    if-gtz p3, :cond_0

    long-to-int p1, p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return p1

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-static {}, Lcom/github/luben/zstd/Zstd;->errGeneric()J

    move-result-wide p2

    const-string p4, "Output size is greater than MAX_INT"

    invoke-direct {p1, p2, p3, p4}, Lcom/github/luben/zstd/ZstdException;-><init>(JLjava/lang/String;)V

    throw p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_1
    new-instance p3, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p3, p1, p2}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public compressDirectByteBuffer(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I
    .locals 9

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p4}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-static {p5, p6, v0}, Lcom/github/luben/zstd/Objects;->checkFromIndexSize(III)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-static {p2, p3, v0}, Lcom/github/luben/zstd/Objects;->checkFromIndexSize(III)V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    move v7, p5

    move v8, p6

    invoke-static/range {v1 .. v8}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressDirectByteBuffer0(JLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J

    move-result-wide p1

    invoke-static {p1, p2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p3, :cond_1

    const-wide/32 p3, 0x7fffffff

    cmp-long p3, p1, p3

    if-gtz p3, :cond_0

    long-to-int p1, p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return p1

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-static {}, Lcom/github/luben/zstd/Zstd;->errGeneric()J

    move-result-wide p2

    const-string p4, "Output size is greater than MAX_INT"

    invoke-direct {p1, p2, p3, p4}, Lcom/github/luben/zstd/ZstdException;-><init>(JLjava/lang/String;)V

    throw p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_1
    new-instance p3, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p3, p1, p2}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "dstBuff must be a direct buffer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "srcBuff must be a direct buffer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public compressDirectByteBufferStream(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Lcom/github/luben/zstd/EndDirective;)Z
    .locals 9

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v4

    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    move-result v6

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result v7

    invoke-virtual {p3}, Lcom/github/luben/zstd/EndDirective;->value()I

    move-result v8

    move-object v2, p1

    move-object v5, p2

    invoke-static/range {v0 .. v8}, Lcom/github/luben/zstd/ZstdCompressCtx;->compressDirectByteBufferStream0(JLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;III)J

    move-result-wide p1

    const-wide v0, 0x80000000L

    and-long/2addr v0, p1

    const-wide/16 v3, 0x0

    cmp-long p3, v0, v3

    if-nez p3, :cond_1

    const-wide/32 v0, 0x7fffffff

    and-long/2addr v0, p1

    long-to-int p3, v0

    invoke-virtual {v5, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/16 p3, 0x20

    ushr-long v0, p1, p3

    long-to-int p3, v0

    const v0, 0x7fffffff

    and-int/2addr p3, v0

    invoke-virtual {v2, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p3, 0x3f

    ushr-long/2addr p1, p3

    const-wide/16 v0, 0x1

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_1
    const-wide/16 v0, 0xff

    and-long/2addr p1, v0

    neg-long p1, p1

    :try_start_1
    new-instance p3, Lcom/github/luben/zstd/ZstdException;

    invoke-static {p1, p2}, Lcom/github/luben/zstd/Zstd;->getErrorName(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, p1, p2, v0}, Lcom/github/luben/zstd/ZstdException;-><init>(JLjava/lang/String;)V

    throw p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public doClose()V
    .locals 5

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {v0, v1}, Lcom/github/luben/zstd/ZstdCompressCtx;->free(J)V

    iput-wide v2, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod:Lcom/github/luben/zstd/SequenceProducer;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod_state:J

    invoke-interface {v0, v1, v2}, Lcom/github/luben/zstd/SequenceProducer;->freeState(J)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod:Lcom/github/luben/zstd/SequenceProducer;

    :cond_0
    return-void
.end method

.method public getFrameProgression()Lcom/github/luben/zstd/ZstdFrameProgression;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1}, Lcom/github/luben/zstd/ZstdCompressCtx;->getFrameProgression0(J)Lcom/github/luben/zstd/ZstdFrameProgression;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw v0
.end method

.method public getNativePtr()J
    .locals 2

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    return-wide v0
.end method

.method public loadDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    .line 2
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    .line 3
    invoke-virtual {p1}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-direct {p0, v0, v1, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadCDictFast0(JLcom/github/luben/zstd/ZstdDictCompress;)J

    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v2

    if-nez v2, :cond_0

    .line 6
    iput-object p1, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->compression_dict:Lcom/github/luben/zstd/ZstdDictCompress;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-virtual {p1}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    .line 8
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 9
    :cond_0
    :try_start_1
    new-instance v2, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {v2, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    :goto_0
    invoke-virtual {p1}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    .line 11
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    .line 12
    throw v0
.end method

.method public loadDict([B)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    .line 13
    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    .line 14
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    .line 15
    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-direct {p0, v0, v1, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->loadCDict0(J[B)J

    move-result-wide v0

    .line 16
    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->compression_dict:Lcom/github/luben/zstd/ZstdDictCompress;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 19
    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    .line 21
    throw p1
.end method

.method public registerSequenceProducer(Lcom/github/luben/zstd/SequenceProducer;)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 8

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod:Lcom/github/luben/zstd/SequenceProducer;

    if-eqz v0, :cond_0

    iget-wide v2, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod_state:J

    invoke-interface {v0, v2, v3}, Lcom/github/luben/zstd/SequenceProducer;->freeState(J)V

    iput-object v1, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod:Lcom/github/luben/zstd/SequenceProducer;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_0
    :goto_0
    if-nez p1, :cond_1

    iget-wide v2, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v2 .. v7}, Lcom/github/luben/zstd/Zstd;->registerSequenceProducer(JJJ)V

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lcom/github/luben/zstd/SequenceProducer;->createState()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod_state:J

    iget-wide v2, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-interface {p1}, Lcom/github/luben/zstd/SequenceProducer;->getFunctionPointer()J

    move-result-wide v6

    invoke-static/range {v2 .. v7}, Lcom/github/luben/zstd/Zstd;->registerSequenceProducer(JJJ)V

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod:Lcom/github/luben/zstd/SequenceProducer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :goto_2
    :try_start_1
    iput-object v1, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->seqprod:Lcom/github/luben/zstd/SequenceProducer;

    iget-wide v2, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v2 .. v7}, Lcom/github/luben/zstd/Zstd;->registerSequenceProducer(JJJ)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public reset()V
    .locals 3

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1}, Lcom/github/luben/zstd/ZstdCompressCtx;->reset0(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-void

    :cond_0
    :try_start_1
    new-instance v2, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {v2, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw v0
.end method

.method public setChainLog(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionChainLog(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setChecksum(Z)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->setChecksum0(JZ)V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0
.end method

.method public setContentSize(Z)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->setContentSize0(JZ)V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0
.end method

.method public setDictID(Z)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->setDictID0(JZ)V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0
.end method

.method public setEnableLongDistanceMatching(Lcom/github/luben/zstd/Zstd$ParamSwitch;)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-virtual {p1}, Lcom/github/luben/zstd/Zstd$ParamSwitch;->getValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setEnableLongDistanceMatching(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setHashLog(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionHashLog(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setJobSize(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionJobSize(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setLevel(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/ZstdCompressCtx;->setLevel0(JI)V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0
.end method

.method public setLong(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionLong(JI)I

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0
.end method

.method public setMagicless(Z)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionMagicless(JZ)I

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0
.end method

.method public setMinMatch(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionMinMatch(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setOverlapLog(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionOverlapLog(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setPledgedSrcSize(J)V
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1, p2}, Lcom/github/luben/zstd/ZstdCompressCtx;->setPledgedSrcSize0(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {v0, p1, p2}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setSearchForExternalRepcodes(Lcom/github/luben/zstd/Zstd$ParamSwitch;)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-virtual {p1}, Lcom/github/luben/zstd/Zstd$ParamSwitch;->getValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setSearchForExternalRepcodes(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setSearchLog(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionSearchLog(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setSequenceProducerFallback(Z)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setSequenceProducerFallback(JZ)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setStrategy(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionStrategy(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setTargetLength(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionTargetLength(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setValidateSequences(Lcom/github/luben/zstd/Zstd$ParamSwitch;)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-virtual {p1}, Lcom/github/luben/zstd/Zstd$ParamSwitch;->getValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setValidateSequences(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setWindowLog(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionWindowLog(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method

.method public setWorkers(I)Lcom/github/luben/zstd/ZstdCompressCtx;
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdCompressCtx;->ensureOpen()V

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->acquireSharedLock()V

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdCompressCtx;->nativePtr:J

    invoke-static {v0, v1, p1}, Lcom/github/luben/zstd/Zstd;->setCompressionWorkers(JI)I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    return-object p0

    :cond_0
    :try_start_1
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v0, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lcom/github/luben/zstd/AutoCloseBase;->releaseSharedLock()V

    throw p1
.end method
