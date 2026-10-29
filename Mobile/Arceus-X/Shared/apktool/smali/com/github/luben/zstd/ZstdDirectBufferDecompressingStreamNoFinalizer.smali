.class public Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStreamNoFinalizer;
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

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/github/luben/zstd/BaseZstdBufferDecompressingStreamNoFinalizer;->source:Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStreamNoFinalizer;->createDStream()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/luben/zstd/BaseZstdBufferDecompressingStreamNoFinalizer;->stream:J

    invoke-virtual {p0, v0, v1}, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStreamNoFinalizer;->initDStream(J)J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Source buffer should be a direct buffer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static native createDStreamNative()J
.end method

.method private native decompressStreamNative(JLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J
.end method

.method private static native freeDStreamNative(J)J
.end method

.method private native initDStreamNative(J)J
.end method

.method private static native recommendedDOutSizeNative()J
.end method

.method public static recommendedTargetBufferSize()I
    .locals 2

    invoke-static {}, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStreamNoFinalizer;->recommendedDOutSizeNative()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method


# virtual methods
.method public createDStream()J
    .locals 2

    invoke-static {}, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStreamNoFinalizer;->createDStreamNative()J

    move-result-wide v0

    return-wide v0
.end method

.method public decompressStream(JLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStreamNoFinalizer;->decompressStreamNative(JLjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)J

    move-result-wide p1

    return-wide p1
.end method

.method public freeDStream(J)J
    .locals 0

    invoke-static {p1, p2}, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStreamNoFinalizer;->freeDStreamNative(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public initDStream(J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStreamNoFinalizer;->initDStreamNative(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/github/luben/zstd/BaseZstdBufferDecompressingStreamNoFinalizer;->readInternal(Ljava/nio/ByteBuffer;Z)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Target buffer should be a direct buffer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
