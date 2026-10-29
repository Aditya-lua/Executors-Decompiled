.class public Lm1/i0$g;
.super Landroid/media/MediaCodec$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final a:Lo1/h;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public final synthetic l:Lm1/i0;


# direct methods
.method public constructor <init>(Lm1/i0;)V
    .locals 5

    iput-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-direct {p0}, Landroid/media/MediaCodec$Callback;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm1/i0$g;->b:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm1/i0$g;->c:Z

    iput-boolean v0, p0, Lm1/i0$g;->d:Z

    iput-boolean v0, p0, Lm1/i0$g;->e:Z

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lm1/i0$g;->f:J

    iput-wide v1, p0, Lm1/i0$g;->g:J

    iput-boolean v0, p0, Lm1/i0$g;->h:Z

    iput-boolean v0, p0, Lm1/i0$g;->i:Z

    iput-boolean v0, p0, Lm1/i0$g;->j:Z

    iget-boolean v1, p1, Lm1/i0;->c:Z

    iput-boolean v1, p0, Lm1/i0$g;->k:Z

    if-eqz v1, :cond_0

    new-instance v1, Lo1/h;

    iget-object v2, p1, Lm1/i0;->r:Lm1/o1;

    iget-object v3, p1, Lm1/i0;->q:Ln0/a4;

    const-class v4, Landroidx/camera/video/internal/compat/quirk/CameraUseInconsistentTimebaseQuirk;

    invoke-static {v4}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v4

    check-cast v4, Landroidx/camera/video/internal/compat/quirk/CameraUseInconsistentTimebaseQuirk;

    invoke-direct {v1, v2, v3, v4}, Lo1/h;-><init>(Lm1/o1;Ln0/a4;Landroidx/camera/video/internal/compat/quirk/CameraUseInconsistentTimebaseQuirk;)V

    iput-object v1, p0, Lm1/i0$g;->a:Lo1/h;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lm1/i0$g;->a:Lo1/h;

    :goto_0
    const-class v1, Landroidx/camera/video/internal/compat/quirk/CodecStuckOnFlushQuirk;

    invoke-static {v1}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v1

    check-cast v1, Landroidx/camera/video/internal/compat/quirk/CodecStuckOnFlushQuirk;

    if-eqz v1, :cond_1

    iget-object p1, p1, Lm1/i0;->e:Landroid/media/MediaFormat;

    const-string v2, "mime"

    invoke-virtual {p1, v2}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/camera/video/internal/compat/quirk/CodecStuckOnFlushQuirk;->h(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v0, p0, Lm1/i0$g;->b:Z

    :cond_1
    return-void
.end method

.method public static synthetic a(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;
    .locals 0

    return-object p0
.end method

.method public static synthetic b(Lm1/i0$g;Ljava/util/concurrent/Executor;Lm1/m;)V
    .locals 2

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->w:Lm1/i0$f;

    sget-object v1, Lm1/i0$f;->h:Lm1/i0$f;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lm1/t0;

    invoke-direct {v0, p2}, Lm1/t0;-><init>(Lm1/m;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string p2, "Unable to post to the supplied executor."

    invoke-static {p0, p2, p1}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic c(Lm1/m;Lm1/k;)V
    .locals 0

    invoke-interface {p0, p1}, Lm1/m;->b(Lm1/i;)V

    return-void
.end method

.method public static synthetic d(Lm1/m;Landroid/media/MediaFormat;)V
    .locals 1

    new-instance v0, Lm1/d1;

    invoke-direct {v0, p1}, Lm1/d1;-><init>(Landroid/media/MediaFormat;)V

    invoke-interface {p0, v0}, Lm1/m;->f(Lm1/l1;)V

    return-void
.end method

.method public static synthetic e(Lm1/i0$g;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V
    .locals 7

    iget-boolean v0, p0, Lm1/i0$g;->j:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string p1, "Receives frame after codec is reset."

    invoke-static {p0, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unknown state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v2, v1, Lm1/i0;->u:Lm1/m;

    iget-object v3, v1, Lm1/i0;->v:Ljava/util/concurrent/Executor;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v0, v1, Lm1/i0;->c:Z

    if-eqz v0, :cond_1

    invoke-static {v1}, Lm1/i0;->D(Lm1/i0;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-wide v4, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-static {v0, v4, v5}, Lm1/i0;->A(Lm1/i0;J)J

    move-result-wide v0

    iput-wide v0, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    :cond_1
    iget-boolean v0, p0, Lm1/i0$g;->c:Z

    const/4 v1, 0x1

    if-nez v0, :cond_2

    iput-boolean v1, p0, Lm1/i0$g;->c:Z

    :try_start_1
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lm1/z0;

    invoke-direct {v0, v2}, Lm1/z0;-><init>(Lm1/m;)V

    invoke-interface {v3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v4, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v4, v4, Lm1/i0;->a:Ljava/lang/String;

    const-string v5, "Unable to post to the supplied executor."

    invoke-static {v4, v5, v0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lm1/i0$g;->i(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lm1/i0$g;->d:Z

    if-nez v0, :cond_3

    iput-boolean v1, p0, Lm1/i0$g;->d:Z

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "data timestampUs = "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ", data timebase = "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v5, v5, Lm1/i0;->q:Ln0/a4;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", current system uptimeMs = "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ", current system realtimeMs = "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0, p1}, Lm1/i0$g;->m(Landroid/media/MediaCodec$BufferInfo;)Landroid/media/MediaCodec$BufferInfo;

    move-result-object v0

    iget-wide v5, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iput-wide v5, p0, Lm1/i0$g;->g:J

    :try_start_2
    new-instance v1, Lm1/k;

    invoke-direct {v1, p2, p3, v0}, Lm1/k;-><init>(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V

    invoke-virtual {p0, v1, v2, v3}, Lm1/i0$g;->n(Lm1/k;Lm1/m;Ljava/util/concurrent/Executor;)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-virtual {p0, p1}, Lm1/i0;->L(Landroid/media/MediaCodec$CodecException;)V

    goto :goto_2

    :cond_4
    :try_start_3
    iget-object p2, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p2, p2, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {p2, p3, v4}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_3
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_3 .. :try_end_3} :catch_2

    :goto_1
    iget-boolean p2, p0, Lm1/i0$g;->e:Z

    if-nez p2, :cond_5

    invoke-virtual {p0, p1}, Lm1/i0$g;->j(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lm1/i0$g;->l()V

    :cond_5
    iget-boolean p1, p0, Lm1/i0$g;->k:Z

    if-eqz p1, :cond_6

    iput-boolean v4, p0, Lm1/i0$g;->k:Z

    goto :goto_2

    :catch_2
    move-exception p1

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-virtual {p0, p1}, Lm1/i0;->L(Landroid/media/MediaCodec$CodecException;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p0

    :cond_6
    :goto_2
    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static synthetic f(Lm1/i0$g;Landroid/media/MediaFormat;)V
    .locals 3

    iget-boolean v0, p0, Lm1/i0$g;->j:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string p1, "Receives onOutputFormatChanged after codec is reset."

    invoke-static {p0, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-boolean v1, v0, Lm1/i0;->c:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Lm1/i0;->D(Lm1/i0;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "time-lapse-enable"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v0, "time-lapse-fps"

    iget-object v1, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-static {v1}, Lm1/i0;->E(Lm1/i0;)Lm1/n;

    move-result-object v1

    check-cast v1, Lm1/p1;

    invoke-virtual {v1}, Lm1/p1;->f()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v2, v1, Lm1/i0;->u:Lm1/m;

    iget-object v1, v1, Lm1/i0;->v:Ljava/util/concurrent/Executor;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Lm1/a1;

    invoke-direct {v0, v2, p1}, Lm1/a1;-><init>(Lm1/m;Landroid/media/MediaFormat;)V

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v0, "Unable to post to the supplied executor."

    invoke-static {p0, v0, p1}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static synthetic g(Lm1/i0$g;I)V
    .locals 2

    iget-boolean v0, p0, Lm1/i0$g;->j:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string p1, "Receives input frame after codec is reset."

    invoke-static {p0, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->l:Ljava/util/Queue;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-virtual {p0}, Lm1/i0;->T()V

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static synthetic h(Lm1/i0$g;Landroid/media/MediaCodec$CodecException;)V
    .locals 2

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p0, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-virtual {p0, p1}, Lm1/i0;->L(Landroid/media/MediaCodec$CodecException;)V

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final i(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 7

    iget-boolean v0, p0, Lm1/i0$g;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p1, p1, Lm1/i0;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by already reach end of stream."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iget v0, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-gtz v0, :cond_1

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p1, p1, Lm1/i0;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by invalid buffer size."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    iget v0, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p1, p1, Lm1/i0;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by codec config."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_2
    iget-object v0, p0, Lm1/i0$g;->a:Lo1/h;

    if-eqz v0, :cond_3

    iget-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v0, v2, v3}, Lo1/h;->b(J)J

    move-result-wide v2

    iput-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    :cond_3
    iget-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-wide v4, p0, Lm1/i0$g;->f:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_4

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p1, p1, Lm1/i0;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by out of order buffer from MediaCodec."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_4
    iput-wide v2, p0, Lm1/i0$g;->f:J

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->x:Landroid/util/Range;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_7

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->a:Ljava/lang/String;

    const-string v3, "Drop buffer by not in start-stop range."

    invoke-static {v0, v3}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-boolean v3, v0, Lm1/i0;->z:Z

    if-eqz v3, :cond_6

    iget-wide v3, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object v0, v0, Lm1/i0;->x:Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-ltz v0, :cond_6

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->B:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_5

    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_5
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, Lm1/i0;->A:Ljava/lang/Long;

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-virtual {p1}, Lm1/i0;->a0()V

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iput-boolean v1, p1, Lm1/i0;->z:Z

    :cond_6
    return v1

    :cond_7
    invoke-virtual {p0, p1}, Lm1/i0$g;->q(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p1, p1, Lm1/i0;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by pause."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_8
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-virtual {v0, p1}, Lm1/i0;->J(Landroid/media/MediaCodec$BufferInfo;)J

    move-result-wide v3

    iget-wide v5, p0, Lm1/i0$g;->g:J

    cmp-long v0, v3, v5

    if-gtz v0, :cond_a

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->a:Ljava/lang/String;

    const-string v3, "Drop buffer by adjusted time is less than the last sent time."

    invoke-static {v0, v3}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-boolean v0, v0, Lm1/i0;->c:Z

    if-eqz v0, :cond_9

    invoke-static {p1}, Lm1/i0;->Q(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-eqz p1, :cond_9

    iput-boolean v2, p0, Lm1/i0$g;->i:Z

    :cond_9
    return v1

    :cond_a
    iget-boolean v0, p0, Lm1/i0$g;->d:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, Lm1/i0$g;->i:Z

    if-nez v0, :cond_b

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-boolean v0, v0, Lm1/i0;->c:Z

    if-eqz v0, :cond_b

    iput-boolean v2, p0, Lm1/i0$g;->i:Z

    :cond_b
    iget-boolean v0, p0, Lm1/i0$g;->i:Z

    if-eqz v0, :cond_d

    invoke-static {p1}, Lm1/i0;->Q(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-nez p1, :cond_c

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p1, p1, Lm1/i0;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by not a key frame."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-virtual {p1}, Lm1/i0;->W()V

    return v1

    :cond_c
    iput-boolean v1, p0, Lm1/i0$g;->i:Z

    :cond_d
    return v2
.end method

.method public final j(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 1

    invoke-static {p1}, Lm1/i0;->N(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm1/i0$g;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lm1/i0$g;->b:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lm1/i0$g;->k(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final k(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 5

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-boolean v1, v0, Lm1/i0;->F:Z

    if-eqz v1, :cond_0

    iget-wide v1, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object p1, v0, Lm1/i0;->x:Landroid/util/Range;

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public l()V
    .locals 4

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "reachEndData"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lm1/i0$g;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lm1/i0$g;->e:Z

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-static {v0}, Lm1/i0;->B(Lm1/i0;)Ljava/util/concurrent/Future;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-static {v0}, Lm1/i0;->B(Lm1/i0;)Ljava/util/concurrent/Future;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lm1/i0;->C(Lm1/i0;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;

    :cond_1
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v2, v1, Lm1/i0;->u:Lm1/m;

    iget-object v3, v1, Lm1/i0;->v:Ljava/util/concurrent/Executor;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lm1/b1;

    invoke-direct {v0, p0, v3, v2}, Lm1/b1;-><init>(Lm1/i0$g;Ljava/util/concurrent/Executor;Lm1/m;)V

    invoke-virtual {v1, v0}, Lm1/i0;->d0(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final m(Landroid/media/MediaCodec$BufferInfo;)Landroid/media/MediaCodec$BufferInfo;
    .locals 7

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-virtual {v0, p1}, Lm1/i0;->J(Landroid/media/MediaCodec$BufferInfo;)J

    move-result-wide v4

    iget-wide v0, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v0, v0, v4

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    iget-wide v0, p0, Lm1/i0$g;->g:J

    cmp-long v0, v4, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx2/g;->i(Z)V

    new-instance v1, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iget v2, p1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v3, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget v6, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    invoke-virtual/range {v1 .. v6}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    return-object v1
.end method

.method public final n(Lm1/k;Lm1/m;Ljava/util/concurrent/Executor;)V
    .locals 3

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->o:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lm1/k;->b()Lne/x;

    move-result-object v0

    new-instance v1, Lm1/i0$g$a;

    invoke-direct {v1, p0, p1}, Lm1/i0$g$a;-><init>(Lm1/i0$g;Lm1/k;)V

    iget-object v2, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v2, v2, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    :try_start_0
    new-instance v0, Lm1/c1;

    invoke-direct {v0, p2, p1}, Lm1/c1;-><init>(Lm1/m;Lm1/k;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    iget-object p3, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p3, p3, Lm1/i0;->a:Ljava/lang/String;

    const-string v0, "Unable to post to the supplied executor."

    invoke-static {p3, v0, p2}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Lm1/k;->close()V

    return-void
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Lm1/i0$g;->k:Z

    if-eqz v0, :cond_0

    const-class v0, Landroidx/camera/video/internal/compat/quirk/PrematureEndOfStreamVideoQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onError(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V
    .locals 1

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p1, p1, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v0, Lm1/x0;

    invoke-direct {v0, p0, p2}, Lm1/x0;-><init>(Lm1/i0$g;Landroid/media/MediaCodec$CodecException;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onInputBufferAvailable(Landroid/media/MediaCodec;I)V
    .locals 1

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p1, p1, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v0, Lm1/v0;

    invoke-direct {v0, p0, p2}, Lm1/v0;-><init>(Lm1/i0$g;I)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onOutputBufferAvailable(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V
    .locals 2

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lm1/w0;

    invoke-direct {v1, p0, p3, p1, p2}, Lm1/w0;-><init>(Lm1/i0$g;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onOutputFormatChanged(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 2

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p1, p1, Lm1/i0;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onOutputFormatChanged: mediaFormat = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", CSD data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lh1/d;->d(Landroid/media/MediaFormat;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object p1, p1, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v0, Lm1/y0;

    invoke-direct {v0, p0, p2}, Lm1/y0;-><init>(Lm1/i0$g;Landroid/media/MediaFormat;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm1/i0$g;->j:Z

    return-void
.end method

.method public final q(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 6

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-wide v1, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v0, v1, v2}, Lm1/i0;->g0(J)V

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-wide v1, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v0, v1, v2}, Lm1/i0;->P(J)Z

    move-result v0

    iget-boolean v1, p0, Lm1/i0$g;->h:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_5

    if-eqz v0, :cond_5

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "Switch to pause state"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v3, p0, Lm1/i0$g;->h:Z

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v4, v0, Lm1/i0;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v1, v0, Lm1/i0;->v:Ljava/util/concurrent/Executor;

    iget-object v0, v0, Lm1/i0;->u:Lm1/m;

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lm1/u0;

    invoke-direct {v4, v0}, Lm1/u0;-><init>(Lm1/m;)V

    invoke-interface {v1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v1, v0, Lm1/i0;->w:Lm1/i0$f;

    sget-object v4, Lm1/i0$f;->c:Lm1/i0$f;

    if-ne v1, v4, :cond_3

    iget-boolean v0, v0, Lm1/i0;->c:Z

    if-nez v0, :cond_0

    const-class v0, Landroidx/camera/video/internal/compat/quirk/AudioEncoderIgnoresInputTimestampQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-boolean v0, v0, Lm1/i0;->c:Z

    if-eqz v0, :cond_1

    const-class v0, Landroidx/camera/video/internal/compat/quirk/VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->g:Lm1/l$b;

    instance-of v1, v0, Lm1/i0$e;

    if-eqz v1, :cond_2

    check-cast v0, Lm1/i0$e;

    invoke-virtual {v0, v2}, Lm1/i0$e;->q(Z)V

    :cond_2
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-virtual {v0, v3}, Lm1/i0;->Y(Z)V

    :cond_3
    :goto_0
    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-wide v4, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, Lm1/i0;->A:Ljava/lang/Long;

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-boolean v0, p1, Lm1/i0;->z:Z

    if-eqz v0, :cond_6

    iget-object p1, p1, Lm1/i0;->B:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_4

    invoke-interface {p1, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_4
    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    invoke-virtual {p1}, Lm1/i0;->a0()V

    iget-object p1, p0, Lm1/i0$g;->l:Lm1/i0;

    iput-boolean v2, p1, Lm1/i0;->z:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_5
    if-eqz v1, :cond_6

    if-nez v0, :cond_6

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "Switch to resume state"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v2, p0, Lm1/i0$g;->h:Z

    iget-object v0, p0, Lm1/i0$g;->l:Lm1/i0;

    iget-boolean v0, v0, Lm1/i0;->c:Z

    if-eqz v0, :cond_6

    invoke-static {p1}, Lm1/i0;->Q(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-nez p1, :cond_6

    iput-boolean v3, p0, Lm1/i0$g;->i:Z

    :cond_6
    :goto_1
    iget-boolean p1, p0, Lm1/i0$g;->h:Z

    return p1
.end method
