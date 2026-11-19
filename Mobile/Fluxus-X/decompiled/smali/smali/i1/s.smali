.class public Li1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/s$a;
    }
.end annotation


# static fields
.field public static final m:J


# instance fields
.field public a:Landroid/media/AudioRecord;

.field public final b:Li1/a;

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final e:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final f:I

.field public final g:I

.field public h:Li1/p$a;

.field public i:Ljava/util/concurrent/Executor;

.field public j:J

.field public k:Landroid/media/AudioManager$AudioRecordingCallback;

.field public l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Li1/s;->m:J

    return-void
.end method

.method public constructor <init>(Li1/a;Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Li1/s;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Li1/s;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Li1/s;->e:Ljava/util/concurrent/atomic/AtomicReference;

    iput-boolean v1, p0, Li1/s;->l:Z

    invoke-virtual {p1}, Li1/a;->e()I

    move-result v0

    invoke-virtual {p1}, Li1/a;->f()I

    move-result v2

    invoke-virtual {p1}, Li1/a;->b()I

    move-result v3

    invoke-static {v0, v2, v3}, Li1/s;->n(III)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Li1/s;->b:Li1/a;

    invoke-virtual {p1}, Li1/a;->d()I

    move-result v0

    iput v0, p0, Li1/s;->g:I

    invoke-virtual {p1}, Li1/a;->e()I

    move-result v0

    invoke-virtual {p1}, Li1/a;->f()I

    move-result v2

    invoke-virtual {p1}, Li1/a;->b()I

    move-result v3

    invoke-static {v0, v2, v3}, Li1/s;->l(III)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-static {v1}, Lx2/g;->i(Z)V

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Li1/s;->f:I

    invoke-static {v0, p1, p2}, Li1/s;->j(ILi1/a;Landroid/content/Context;)Landroid/media/AudioRecord;

    move-result-object p1

    iput-object p1, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-static {p1}, Li1/s;->e(Landroid/media/AudioRecord;)V

    return-void

    :cond_1
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p1}, Li1/a;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Li1/a;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Li1/a;->b()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The combination of sample rate %d, channel count %d and audio format %d is not supported."

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static synthetic c(Li1/p$a;Z)V
    .locals 0

    invoke-interface {p0, p1}, Li1/p$a;->a(Z)V

    return-void
.end method

.method public static synthetic d(Li1/s;)Landroid/media/AudioRecord;
    .locals 0

    iget-object p0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    return-object p0
.end method

.method public static e(Landroid/media/AudioRecord;)V
    .locals 2

    invoke-virtual {p0}, Landroid/media/AudioRecord;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/media/AudioRecord;->release()V

    new-instance p0, Li1/p$b;

    const-string v0, "Unable to initialize AudioRecord"

    invoke-direct {p0, v0}, Li1/p$b;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static h(III)Landroid/media/AudioFormat;
    .locals 1

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-static {p1}, Li1/t;->b(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method public static i(Li1/a;)Landroid/media/AudioFormat;
    .locals 2

    invoke-virtual {p0}, Li1/a;->e()I

    move-result v0

    invoke-virtual {p0}, Li1/a;->f()I

    move-result v1

    invoke-virtual {p0}, Li1/a;->b()I

    move-result p0

    invoke-static {v0, v1, p0}, Li1/s;->h(III)Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method public static j(ILi1/a;Landroid/content/Context;)Landroid/media/AudioRecord;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {p1}, Li1/s;->i(Li1/a;)Landroid/media/AudioFormat;

    move-result-object v1

    invoke-static {}, Lj1/a;->b()Landroid/media/AudioRecord$Builder;

    move-result-object v2

    const/16 v3, 0x1f

    if-lt v0, v3, :cond_0

    if-eqz p2, :cond_0

    invoke-static {v2, p2}, Lj1/e;->a(Landroid/media/AudioRecord$Builder;Landroid/content/Context;)V

    :cond_0
    invoke-virtual {p1}, Li1/a;->c()I

    move-result p1

    invoke-static {v2, p1}, Lj1/a;->d(Landroid/media/AudioRecord$Builder;I)V

    invoke-static {v2, v1}, Lj1/a;->c(Landroid/media/AudioRecord$Builder;Landroid/media/AudioFormat;)V

    invoke-static {v2, p0}, Lj1/a;->e(Landroid/media/AudioRecord$Builder;I)V

    :try_start_0
    invoke-static {v2}, Lj1/a;->a(Landroid/media/AudioRecord$Builder;)Landroid/media/AudioRecord;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static l(III)I
    .locals 0

    invoke-static {p1}, Li1/t;->a(I)I

    move-result p1

    invoke-static {p0, p1, p2}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result p0

    return p0
.end method

.method public static m()Z
    .locals 1

    const-class v0, Landroidx/camera/video/internal/compat/quirk/AudioTimestampFramePositionIncorrectQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static n(III)Z
    .locals 2

    const/4 v0, 0x0

    if-lez p0, :cond_2

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, p2}, Li1/s;->l(III)I

    move-result v1

    if-gtz v1, :cond_1

    return v0

    :cond_1
    :try_start_0
    invoke-static {p0, p1, p2}, Li1/s;->h(III)Landroid/media/AudioFormat;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_2
    :goto_0
    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Li1/s;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Li1/s;->k:Landroid/media/AudioManager$AudioRecordingCallback;

    if-eqz v0, :cond_1

    iget-object v1, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-static {v1, v0}, Lj1/d;->d(Landroid/media/AudioRecord;Landroid/media/AudioManager$AudioRecordingCallback;)V

    :cond_1
    iget-object v0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    return-void
.end method

.method public b(Li1/p$a;Ljava/util/concurrent/Executor;)V
    .locals 3

    iget-object v0, p0, Li1/s;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "AudioStream can not be started when setCallback."

    invoke-static {v0, v2}, Lx2/g;->j(ZLjava/lang/String;)V

    invoke-virtual {p0}, Li1/s;->f()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    const-string v0, "executor can\'t be null with non-null callback."

    invoke-static {v1, v0}, Lx2/g;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Li1/s;->h:Li1/p$a;

    iput-object p2, p0, Li1/s;->i:Ljava/util/concurrent/Executor;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_5

    iget-object v0, p0, Li1/s;->k:Landroid/media/AudioManager$AudioRecordingCallback;

    if-eqz v0, :cond_2

    iget-object v1, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-static {v1, v0}, Lj1/d;->d(Landroid/media/AudioRecord;Landroid/media/AudioManager$AudioRecordingCallback;)V

    :cond_2
    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Li1/s;->k:Landroid/media/AudioManager$AudioRecordingCallback;

    if-nez p1, :cond_4

    new-instance p1, Li1/s$a;

    invoke-direct {p1, p0}, Li1/s$a;-><init>(Li1/s;)V

    iput-object p1, p0, Li1/s;->k:Landroid/media/AudioManager$AudioRecordingCallback;

    :cond_4
    iget-object p1, p0, Li1/s;->a:Landroid/media/AudioRecord;

    iget-object v0, p0, Li1/s;->k:Landroid/media/AudioManager$AudioRecordingCallback;

    invoke-static {p1, p2, v0}, Lj1/d;->c(Landroid/media/AudioRecord;Ljava/util/concurrent/Executor;Landroid/media/AudioManager$AudioRecordingCallback;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Li1/s;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "AudioStream has been released."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Li1/s;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const-string v1, "AudioStream has not been started."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    return-void
.end method

.method public final k()J
    .locals 9

    iget-boolean v0, p0, Li1/s;->l:Z

    const-wide/16 v1, -0x1

    if-nez v0, :cond_1

    new-instance v0, Landroid/media/AudioTimestamp;

    invoke-direct {v0}, Landroid/media/AudioTimestamp;-><init>()V

    iget-object v3, p0, Li1/s;->a:Landroid/media/AudioRecord;

    const/4 v4, 0x0

    invoke-static {v3, v0, v4}, Lj1/b;->b(Landroid/media/AudioRecord;Landroid/media/AudioTimestamp;I)I

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Li1/s;->b:Li1/a;

    invoke-virtual {v3}, Li1/a;->e()I

    move-result v3

    iget-wide v4, p0, Li1/s;->j:J

    invoke-static {v3, v4, v5, v0}, Li1/t;->c(IJLandroid/media/AudioTimestamp;)J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    sub-long v5, v3, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    sget-wide v7, Li1/s;->m:J

    cmp-long v0, v5, v7

    if-lez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Li1/s;->l:Z

    goto :goto_0

    :cond_0
    const-string v0, "AudioStreamImpl"

    const-string v3, "Unable to get audio timestamp"

    invoke-static {v0, v3}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    move-wide v3, v1

    :cond_2
    cmp-long v0, v3, v1

    if-nez v0, :cond_3

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0

    :cond_3
    return-wide v3
.end method

.method public o(Z)V
    .locals 4

    iget-object v0, p0, Li1/s;->i:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Li1/s;->h:Li1/p$a;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Li1/s;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Li1/r;

    invoke-direct {v2, v1, p1}, Li1/r;-><init>(Li1/p$a;Z)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public read(Ljava/nio/ByteBuffer;)Li1/p$c;
    .locals 7

    invoke-virtual {p0}, Li1/s;->f()V

    invoke-virtual {p0}, Li1/s;->g()V

    iget-object v0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    iget v1, p0, Li1/s;->f:I

    invoke-virtual {v0, p1, v1}, Landroid/media/AudioRecord;->read(Ljava/nio/ByteBuffer;I)I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Li1/s;->k()J

    move-result-wide v1

    iget-wide v3, p0, Li1/s;->j:J

    int-to-long v5, v0

    iget p1, p0, Li1/s;->g:I

    invoke-static {v5, v6, p1}, Li1/t;->g(JI)J

    move-result-wide v5

    add-long/2addr v3, v5

    iput-wide v3, p0, Li1/s;->j:J

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Li1/p$c;->c(IJ)Li1/p$c;

    move-result-object p1

    return-object p1
.end method

.method public start()V
    .locals 6

    invoke-virtual {p0}, Li1/s;->f()V

    iget-object v0, p0, Li1/s;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Li1/s;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-static {v0}, Li1/s;->e(Landroid/media/AudioRecord;)V

    :cond_1
    iget-object v0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V

    iget-object v0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-ne v0, v2, :cond_4

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Li1/s;->j:J

    iput-boolean v3, p0, Li1/s;->l:Z

    iget-object v0, p0, Li1/s;->e:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_3

    iget-object v0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-static {v0}, Lj1/d;->a(Landroid/media/AudioRecord;)Landroid/media/AudioRecordingConfiguration;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lj1/d;->b(Landroid/media/AudioRecordingConfiguration;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move v1, v3

    :goto_0
    move v3, v1

    :cond_3
    invoke-virtual {p0, v3}, Li1/s;->o(Z)V

    return-void

    :cond_4
    iget-object v0, p0, Li1/s;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    new-instance v0, Li1/p$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to start AudioRecord with state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-virtual {v2}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Li1/p$b;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public stop()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-virtual {p0}, Li1/s;->f()V

    iget-object v0, p0, Li1/s;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V

    iget-object v0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to stop AudioRecord with state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-virtual {v1}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AudioStreamImpl"

    invoke-static {v1, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Li1/s;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    iget v0, p0, Li1/s;->f:I

    iget-object v1, p0, Li1/s;->b:Li1/a;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Li1/s;->j(ILi1/a;Landroid/content/Context;)Landroid/media/AudioRecord;

    move-result-object v0

    iput-object v0, p0, Li1/s;->a:Landroid/media/AudioRecord;

    :cond_2
    :goto_0
    return-void
.end method
