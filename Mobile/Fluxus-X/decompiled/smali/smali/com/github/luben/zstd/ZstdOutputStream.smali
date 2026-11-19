.class public Lcom/github/luben/zstd/ZstdOutputStream;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# instance fields
.field private inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    .line 10
    sget-object v0, Lcom/github/luben/zstd/NoPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {p0, p1, v0}, Lcom/github/luben/zstd/ZstdOutputStream;-><init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 1

    .line 8
    sget-object v0, Lcom/github/luben/zstd/NoPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {p0, p1, v0}, Lcom/github/luben/zstd/ZstdOutputStream;-><init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V

    .line 9
    iget-object p1, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {p1, p2}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setLevel(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;IZ)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 6
    new-instance v0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-direct {v0, p1, p2}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;-><init>(Ljava/io/OutputStream;I)V

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    .line 7
    invoke-virtual {v0, p3}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setCloseFrameOnFlush(Z)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;IZZ)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 2
    new-instance v0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-direct {v0, p1, p2}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;-><init>(Ljava/io/OutputStream;I)V

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    .line 3
    invoke-virtual {v0, p3}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setCloseFrameOnFlush(Z)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    .line 4
    iget-object p1, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {p1, p4}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setChecksum(Z)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V
    .locals 1

    .line 13
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 14
    new-instance v0, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-direct {v0, p1, p2}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;-><init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;I)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/github/luben/zstd/ZstdOutputStream;-><init>(Ljava/io/OutputStream;Lcom/github/luben/zstd/BufferPool;)V

    .line 12
    iget-object p1, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {p1, p3}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setLevel(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-void
.end method

.method public static recommendedCOutSize()J
    .locals 2

    invoke-static {}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->recommendedCOutSize()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->close()V

    return-void
.end method

.method public finalize()V
    .locals 0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdOutputStream;->close()V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->flush()V

    return-void
.end method

.method public setChainLog(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setChainLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setChecksum(Z)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setChecksum(Z)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setCloseFrameOnFlush(Z)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setCloseFrameOnFlush(Z)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setDict(Lcom/github/luben/zstd/ZstdDictCompress;)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setDict([B)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setDict([B)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setFinalize(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setHashLog(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setHashLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setJobSize(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setJobSize(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setLevel(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setLevel(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setLong(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setLong(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setMinMatch(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setMinMatch(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setOverlapLog(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setOverlapLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setSearchLog(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setSearchLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setStrategy(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setStrategy(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setTargetLength(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setTargetLength(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setWindowLog(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setWindowLog(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public setWorkers(I)Lcom/github/luben/zstd/ZstdOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->setWorkers(I)Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    return-object p0
.end method

.method public write(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->write(I)V

    return-void
.end method

.method public write([BII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdOutputStream;->inner:Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;

    invoke-virtual {v0, p1, p2, p3}, Lcom/github/luben/zstd/ZstdOutputStreamNoFinalizer;->write([BII)V

    return-void
.end method
