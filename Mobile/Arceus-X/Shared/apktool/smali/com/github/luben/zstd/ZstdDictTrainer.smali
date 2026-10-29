.class public Lcom/github/luben/zstd/ZstdDictTrainer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final allocatedSize:I

.field private final dictSize:I

.field private filledSize:J

.field private level:I

.field private final sampleSizes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final trainingSamples:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/github/luben/zstd/Zstd;->defaultCompressionLevel()I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Lcom/github/luben/zstd/ZstdDictTrainer;-><init>(III)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->trainingSamples:Ljava/nio/ByteBuffer;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->sampleSizes:Ljava/util/List;

    .line 5
    iput p1, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->allocatedSize:I

    .line 6
    iput p2, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->dictSize:I

    .line 7
    iput p3, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->level:I

    return-void
.end method

.method private copyToIntArray(Ljava/util/List;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)[I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public declared-synchronized addSample([B)Z
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->filledSize:J

    array-length v2, p1

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget v2, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->allocatedSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->trainingSamples:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->sampleSizes:Ljava/util/List;

    array-length v1, p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->filledSize:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->filledSize:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public trainSamples()[B
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdDictTrainer;->trainSamples(Z)[B

    move-result-object v0

    return-object v0
.end method

.method public trainSamples(Z)[B
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/github/luben/zstd/ZstdDictTrainer;->trainSamplesDirect(Z)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    .line 4
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public trainSamplesDirect()Ljava/nio/ByteBuffer;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/github/luben/zstd/ZstdDictTrainer;->trainSamplesDirect(Z)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized trainSamplesDirect(Z)Ljava/nio/ByteBuffer;
    .locals 4

    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->dictSize:I

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->trainingSamples:Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->sampleSizes:Ljava/util/List;

    invoke-direct {p0, v2}, Lcom/github/luben/zstd/ZstdDictTrainer;->copyToIntArray(Ljava/util/List;)[I

    move-result-object v2

    iget v3, p0, Lcom/github/luben/zstd/ZstdDictTrainer;->level:I

    invoke-static {v1, v2, v0, p1, v3}, Lcom/github/luben/zstd/Zstd;->trainFromBufferDirect(Ljava/nio/ByteBuffer;[ILjava/nio/ByteBuffer;ZI)J

    move-result-wide v1

    .line 4
    invoke-static {v1, v2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result p1

    if-nez p1, :cond_0

    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 7
    :try_start_1
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 8
    new-instance p1, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {p1, v1, v2}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw p1

    .line 9
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
