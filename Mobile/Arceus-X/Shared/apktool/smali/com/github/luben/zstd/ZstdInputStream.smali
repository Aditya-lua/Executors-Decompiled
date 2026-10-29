.class public Lcom/github/luben/zstd/ZstdInputStream;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field private inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 2
    new-instance v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-direct {v0, p1}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Lcom/github/luben/zstd/BufferPool;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 4
    new-instance v0, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-direct {v0, p1, p2}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;-><init>(Ljava/io/InputStream;Lcom/github/luben/zstd/BufferPool;)V

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    return-void
.end method

.method public static recommendedDInSize()J
    .locals 2

    invoke-static {}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->recommendedDInSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public static recommendedDOutSize()J
    .locals 2

    invoke-static {}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->recommendedDOutSize()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public available()I
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->available()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->close()V

    return-void
.end method

.method public finalize()V
    .locals 0

    invoke-virtual {p0}, Lcom/github/luben/zstd/ZstdInputStream;->close()V

    return-void
.end method

.method public getContinuous()Z
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->getContinuous()Z

    move-result v0

    return v0
.end method

.method public markSupported()Z
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->markSupported()Z

    move-result v0

    return v0
.end method

.method public read()I
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->read()I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0, p1, p2, p3}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->read([BII)I

    move-result p1

    return p1
.end method

.method public setContinuous(Z)Lcom/github/luben/zstd/ZstdInputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->setContinuous(Z)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    return-object p0
.end method

.method public setDict(Lcom/github/luben/zstd/ZstdDictDecompress;)Lcom/github/luben/zstd/ZstdInputStream;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->setDict(Lcom/github/luben/zstd/ZstdDictDecompress;)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    return-object p0
.end method

.method public setDict([B)Lcom/github/luben/zstd/ZstdInputStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->setDict([B)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    return-object p0
.end method

.method public setFinalize(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setLongMax(I)Lcom/github/luben/zstd/ZstdInputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->setLongMax(I)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    return-object p0
.end method

.method public setRefMultipleDDicts(Z)Lcom/github/luben/zstd/ZstdInputStream;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->setRefMultipleDDicts(Z)Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    return-object p0
.end method

.method public skip(J)J
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdInputStream;->inner:Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    invoke-virtual {v0, p1, p2}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;->skip(J)J

    move-result-wide p1

    return-wide p1
.end method
