.class public final Lin/f$f;
.super Landroid/media/MediaCodec$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lin/f;-><init>(IIIIZLqq/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "in/f$f",
        "Landroid/media/MediaCodec$Callback;",
        "Landroid/media/MediaCodec;",
        "codec",
        "Landroid/media/MediaCodec$CodecException;",
        "e",
        "",
        "onError",
        "(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V",
        "mediaCodec",
        "",
        "index",
        "onInputBufferAvailable",
        "(Landroid/media/MediaCodec;I)V",
        "Landroid/media/MediaCodec$BufferInfo;",
        "bufferInfo",
        "onOutputBufferAvailable",
        "(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V",
        "Landroid/media/MediaFormat;",
        "format",
        "onOutputFormatChanged",
        "(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V",
        "camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lin/f;


# direct methods
.method public constructor <init>(Lin/f;)V
    .locals 0

    iput-object p1, p0, Lin/f$f;->a:Lin/f;

    invoke-direct {p0}, Landroid/media/MediaCodec$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V
    .locals 3

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lin/f$f;->a:Lin/f;

    invoke-static {v0}, Lin/f;->e(Lin/f;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lin/f$f;->a:Lin/f;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Lin/f;->d(Lin/f;)Lin/f$d;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v1}, Lin/f$d;->r()Landroid/media/MediaCodec;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v2, p1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    :try_start_2
    const-string p1, "MediaCodec errored."

    invoke-virtual {v1, p1, p2}, Lin/f$d;->t(Ljava/lang/String;Ljava/lang/Exception;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public onInputBufferAvailable(Landroid/media/MediaCodec;I)V
    .locals 4

    const-string v0, "mediaCodec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lin/f$f;->a:Lin/f;

    invoke-static {v0}, Lin/f;->e(Lin/f;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lin/f$f;->a:Lin/f;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Lin/f;->d(Lin/f;)Lin/f$d;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v2}, Lin/f$d;->r()Landroid/media/MediaCodec;

    move-result-object v3

    if-ne p1, v3, :cond_3

    invoke-virtual {v2}, Lin/f$d;->e()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lin/f$d;->q()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1, p1, p2}, Lin/f;->g(Lin/f;Landroid/media/MediaCodec;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lin/f$d;->i()Lkotlin/collections/i;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lkotlin/collections/i;->addLast(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method public onOutputBufferAvailable(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V
    .locals 7

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bufferInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lin/f$f;->a:Lin/f;

    invoke-static {v0}, Lin/f;->e(Lin/f;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lin/f$f;->a:Lin/f;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Lin/f;->d(Lin/f;)Lin/f$d;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v2}, Lin/f$d;->r()Landroid/media/MediaCodec;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v3, p1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    :try_start_2
    iget p1, p3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 p1, p1, 0x2

    const/4 v4, 0x0

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    move p1, v4

    :goto_0
    iget v5, p3, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-lez v5, :cond_4

    if-eqz p1, :cond_4

    invoke-virtual {v3, p2}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    if-eqz p1, :cond_3

    iget v5, p3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget v5, p3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v6, p3, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v5, v6

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {v2}, Lin/f$d;->s()I

    move-result v5

    invoke-static {v1, v5, p1, p3}, Lin/f;->h(Lin/f;ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_3
    const-string p1, "Required value was null."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    :goto_1
    invoke-virtual {v3, p2, v4}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    iget p1, p3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_5

    invoke-virtual {v2}, Lin/f$d;->d()Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :goto_2
    :try_start_3
    const-string p2, "onOutputBufferAvailable"

    invoke-virtual {v2, p2, p1}, Lin/f$d;->t(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-void

    :goto_4
    monitor-exit v0

    throw p1
.end method

.method public onOutputFormatChanged(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 4

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lin/f$f;->a:Lin/f;

    invoke-static {v0}, Lin/f;->e(Lin/f;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lin/f$f;->a:Lin/f;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Lin/f;->d(Lin/f;)Lin/f$d;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v2}, Lin/f$d;->r()Landroid/media/MediaCodec;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v3, p1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    :try_start_2
    invoke-virtual {v2}, Lin/f$d;->s()I

    move-result p1

    const/4 v3, -0x1

    if-ne p1, v3, :cond_2

    invoke-virtual {v2}, Lin/f$d;->l()Landroid/media/MediaMuxer;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result p1

    invoke-virtual {v2, p1}, Lin/f$d;->B(I)V

    invoke-static {v1}, Lin/f;->f(Lin/f;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_2
    const-string p1, "Video encoder output format changed more than once."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    :try_start_3
    const-string p2, "Error setting up video track"

    invoke-virtual {v2, p2, p1}, Lin/f$d;->t(Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method
