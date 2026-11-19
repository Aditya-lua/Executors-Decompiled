.class Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStream$1;
.super Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStreamNoFinalizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStream;-><init>(Ljava/nio/ByteBuffer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStream;


# direct methods
.method public constructor <init>(Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStream;Ljava/nio/ByteBuffer;)V
    .locals 0

    iput-object p1, p0, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStream$1;->this$0:Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStream;

    invoke-direct {p0, p2}, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStreamNoFinalizer;-><init>(Ljava/nio/ByteBuffer;)V

    return-void
.end method


# virtual methods
.method public refill(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStream$1;->this$0:Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStream;

    invoke-virtual {v0, p1}, Lcom/github/luben/zstd/ZstdDirectBufferDecompressingStream;->refill(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method
