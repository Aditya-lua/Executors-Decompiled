.class public Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field private finalize:Z

.field inner:Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/github/luben/zstd/util/Native;->load()V

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream$1;-><init>(Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;Ljava/nio/ByteBuffer;I)V

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;->inner:Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;

    return-void
.end method

.method public static recommendedOutputBufferSize()I
    .locals 1

    invoke-static {}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->recommendedOutputBufferSize()I

    move-result v0

    return v0
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;->inner:Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->close()V
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

.method public declared-synchronized compress(Ljava/nio/ByteBuffer;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;->inner:Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->compress(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public finalize()V
    .locals 1

    iget-boolean v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;->finalize:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;->close()V

    :cond_0
    return-void
.end method

.method public declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;->inner:Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->flush()V
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

.method public flushBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 0

    return-object p1
.end method

.method public declared-synchronized setDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;->inner:Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->setDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
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

.method public declared-synchronized setDict([B)Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;->inner:Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;->setDict([B)Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
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

.method public setFinalize(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;->finalize:Z

    return-void
.end method
