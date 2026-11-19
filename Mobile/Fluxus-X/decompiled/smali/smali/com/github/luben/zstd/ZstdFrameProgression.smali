.class public Lcom/github/luben/zstd/ZstdFrameProgression;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private consumed:J

.field private currentJobID:I

.field private flushed:J

.field private ingested:J

.field private nbActiveWorkers:I

.field private produced:J


# direct methods
.method public constructor <init>(JJJJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->ingested:J

    iput-wide p3, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->consumed:J

    iput-wide p5, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->produced:J

    iput-wide p7, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->flushed:J

    iput p9, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->currentJobID:I

    iput p10, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->nbActiveWorkers:I

    return-void
.end method


# virtual methods
.method public getConsumed()J
    .locals 2

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->consumed:J

    return-wide v0
.end method

.method public getCurrentJobID()I
    .locals 1

    iget v0, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->currentJobID:I

    return v0
.end method

.method public getFlushed()J
    .locals 2

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->flushed:J

    return-wide v0
.end method

.method public getIngested()J
    .locals 2

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->ingested:J

    return-wide v0
.end method

.method public getNbActiveWorkers()I
    .locals 1

    iget v0, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->nbActiveWorkers:I

    return v0
.end method

.method public getProduced()J
    .locals 2

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdFrameProgression;->produced:J

    return-wide v0
.end method
