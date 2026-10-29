.class Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream$1;
.super Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;-><init>(Ljava/nio/ByteBuffer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;


# direct methods
.method public constructor <init>(Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;Ljava/nio/ByteBuffer;I)V
    .locals 0

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream$1;->this$0:Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;

    invoke-direct {p0, p2, p3}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStreamNoFinalizer;-><init>(Ljava/nio/ByteBuffer;I)V

    return-void
.end method


# virtual methods
.method public flushBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream$1;->this$0:Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdDirectBufferCompressingStream;->flushBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method
