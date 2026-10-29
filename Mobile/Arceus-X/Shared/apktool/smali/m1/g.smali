.class public Lm1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/i;


# instance fields
.field public final a:Ljava/nio/ByteBuffer;

.field public final b:Landroid/media/MediaCodec$BufferInfo;

.field public final c:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm1/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lm1/g;->c(Lm1/i;)Landroid/media/MediaCodec$BufferInfo;

    move-result-object v0

    iput-object v0, p0, Lm1/g;->b:Landroid/media/MediaCodec$BufferInfo;

    invoke-virtual {p0, p1}, Lm1/g;->b(Lm1/i;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lm1/g;->a:Ljava/nio/ByteBuffer;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v0, Lm1/f;

    invoke-direct {v0, p1}, Lm1/f;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    iput-object v0, p0, Lm1/g;->c:Lne/x;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/c$a;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/c$a;

    iput-object p1, p0, Lm1/g;->d:Ly1/c$a;

    return-void
.end method

.method public static synthetic a(Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const-string p0, "Data closed"

    return-object p0
.end method


# virtual methods
.method public final b(Lm1/i;)Ljava/nio/ByteBuffer;
    .locals 3

    invoke-interface {p1}, Lm1/i;->t()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1}, Lm1/i;->m0()Landroid/media/MediaCodec$BufferInfo;

    move-result-object p1

    iget v1, p1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget v1, p1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v2, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget p1, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-object p1
.end method

.method public final c(Lm1/i;)Landroid/media/MediaCodec$BufferInfo;
    .locals 6

    invoke-interface {p1}, Lm1/i;->m0()Landroid/media/MediaCodec$BufferInfo;

    move-result-object p1

    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iget v2, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget-wide v3, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget v5, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    return-object v0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lm1/g;->d:Ly1/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public f1()J
    .locals 2

    iget-object v0, p0, Lm1/g;->b:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    return-wide v0
.end method

.method public m0()Landroid/media/MediaCodec$BufferInfo;
    .locals 1

    iget-object v0, p0, Lm1/g;->b:Landroid/media/MediaCodec$BufferInfo;

    return-object v0
.end method

.method public size()J
    .locals 2

    iget-object v0, p0, Lm1/g;->b:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public t()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lm1/g;->a:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public w0()Z
    .locals 2

    iget-object v0, p0, Lm1/g;->b:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
