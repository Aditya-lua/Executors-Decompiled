.class Lcom/github/luben/zstd/Zstd$FrameData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/luben/zstd/Zstd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FrameData"
.end annotation


# instance fields
.field final compressedSize:J

.field final contentSize:J


# direct methods
.method public constructor <init>([BI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, p2}, Lcom/github/luben/zstd/Zstd;->findFrameCompressedSize([BI)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/github/luben/zstd/Zstd$FrameData;->compressedSize:J

    long-to-int v0, v0

    invoke-static {p1, p2, v0}, Lcom/github/luben/zstd/Zstd;->getFrameContentSize([BII)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/github/luben/zstd/Zstd$FrameData;->contentSize:J

    invoke-static {p1, p2}, Lcom/github/luben/zstd/Zstd;->isError(J)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/github/luben/zstd/ZstdException;

    const-string v1, "Content size is unknown"

    invoke-direct {v0, p1, p2, v1}, Lcom/github/luben/zstd/ZstdException;-><init>(JLjava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/github/luben/zstd/ZstdException;

    invoke-direct {v0, p1, p2}, Lcom/github/luben/zstd/ZstdException;-><init>(J)V

    throw v0

    :cond_1
    return-void
.end method
