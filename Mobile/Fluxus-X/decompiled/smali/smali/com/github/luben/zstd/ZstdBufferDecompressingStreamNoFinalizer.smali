.class public Lcom/github/luben/zstd/ZstdBufferDecompressingStreamNoFinalizer;
.super Lcom/github/luben/zstd/BaseZstdBufferDecompressingStreamNoFinalizer;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/github/luben/zstd/util/Native;->load()V

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/github/luben/zstd/BaseZstdBufferDecompressingStreamNoFinalizer;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdBufferDecompressingStreamNoFinalizer;->createDStream()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/luben/zstd/BaseZstdBufferDecompressingStreamNoFinalizer;->stream:J

    invoke-virtual {p0, v0, v1}, Lcom/github/luben/zstd/ZstdBufferDecompressingStreamNoFinalizer;->initDStream(J)J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Source buffer should be a non-direct buffer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private native createDStreamNative()J
.end method

.method private native decompressStreamNative(J[BII[BII)J
.end method

.method private native freeDStreamNative(J)J
.end method

.method private native initDStreamNative(J)J
.end method

.method private static native recommendedDOutSizeNative()J
.end method

.method public static recommendedTargetBufferSize()I
    .locals 2

    invoke-static {}, Lcom/github/luben/zstd/ZstdBufferDecompressingStreamNoFinalizer;->recommendedDOutSizeNative()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method


# virtual methods
.method public createDStream()J
    .locals 2

    invoke-direct {p0}, Lcom/github/luben/zstd/ZstdBufferDecompressingStreamNoFinalizer;->createDStreamNative()J

    move-result-wide v0

    return-wide v0
.end method

.method public decompressStream(JLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J
    .locals 10

    invoke-virtual/range {p6 .. p6}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    invoke-virtual/range {p6 .. p6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p3

    add-int v5, p4, p3

    invoke-virtual/range {p6 .. p6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p3

    add-int v8, p7, p3

    move-object v1, p0

    move-wide v2, p1

    move v6, p5

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/github/luben/zstd/ZstdBufferDecompressingStreamNoFinalizer;->decompressStreamNative(J[BII[BII)J

    move-result-wide p1

    return-wide p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "provided destination ByteBuffer lacks array"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "provided source ByteBuffer lacks array"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public freeDStream(J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/luben/zstd/ZstdBufferDecompressingStreamNoFinalizer;->freeDStreamNative(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public initDStream(J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/luben/zstd/ZstdBufferDecompressingStreamNoFinalizer;->initDStreamNative(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/github/luben/zstd/BaseZstdBufferDecompressingStreamNoFinalizer;->readInternal(Ljava/nio/ByteBuffer;Z)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Target buffer should be a non-direct buffer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
