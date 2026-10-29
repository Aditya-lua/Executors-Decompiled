.class public Lcom/github/luben/zstd/ZstdIOException;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field private code:J


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, Lcom/github/luben/zstd/Zstd;->getErrorCode(J)J

    move-result-wide v0

    invoke-static {p1, p2}, Lcom/github/luben/zstd/Zstd;->getErrorName(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lcom/github/luben/zstd/ZstdIOException;-><init>(JLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 3
    iput-wide p1, p0, Lcom/github/luben/zstd/ZstdIOException;->code:J

    return-void
.end method


# virtual methods
.method public getErrorCode()J
    .locals 2

    iget-wide v0, p0, Lcom/github/luben/zstd/ZstdIOException;->code:J

    return-wide v0
.end method
