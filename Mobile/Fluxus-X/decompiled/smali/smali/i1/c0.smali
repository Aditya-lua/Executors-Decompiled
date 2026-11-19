.class public Li1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/c0$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final c:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Li1/c0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/lang/Object;

.field public f:Li1/c0$a;

.field public final g:Li1/p;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public l:I


# direct methods
.method public constructor <init>(Li1/p;Li1/a;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Li1/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Li1/c0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Li1/c0;->c:Ljava/util/Queue;

    invoke-static {}, Lq0/c;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v0}, Lq0/c;->g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Li1/c0;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Li1/c0;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Li1/c0;->f:Li1/c0$a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Li1/c0;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Li1/c0;->g:Li1/p;

    invoke-virtual {p2}, Li1/a;->d()I

    move-result p1

    iput p1, p0, Li1/c0;->h:I

    invoke-virtual {p2}, Li1/a;->e()I

    move-result p2

    iput p2, p0, Li1/c0;->i:I

    int-to-long v2, p1

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "mBytesPerFrame must be greater than 0."

    invoke-static {v0, v3}, Lx2/g;->b(ZLjava/lang/Object;)V

    int-to-long v6, p2

    cmp-long p2, v6, v4

    if-lez p2, :cond_1

    move v1, v2

    :cond_1
    const-string p2, "mSampleRate must be greater than 0."

    invoke-static {v1, p2}, Lx2/g;->b(ZLjava/lang/Object;)V

    const/16 p2, 0x1f4

    iput p2, p0, Li1/c0;->j:I

    mul-int/lit16 p1, p1, 0x400

    iput p1, p0, Li1/c0;->l:I

    return-void
.end method

.method public static synthetic c(Li1/c0;)V
    .locals 2

    iget-object v0, p0, Li1/c0;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Li1/c0;->g:Li1/p;

    invoke-interface {v0}, Li1/p;->stop()V

    iget-object v0, p0, Li1/c0;->e:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Li1/c0;->f:Li1/c0$a;

    iget-object p0, p0, Li1/c0;->c:Ljava/util/Queue;

    invoke-interface {p0}, Ljava/util/Collection;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic d(Li1/c0;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Li1/c0;->g:Li1/p;

    invoke-interface {v0}, Li1/p;->start()V

    invoke-virtual {p0}, Li1/c0;->l()V
    :try_end_0
    .catch Li1/p$b; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic e(Li1/c0;)V
    .locals 2

    iget-object v0, p0, Li1/c0;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Li1/c0;->g:Li1/p;

    invoke-interface {v0}, Li1/p;->a()V

    iget-object v0, p0, Li1/c0;->e:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Li1/c0;->f:Li1/c0$a;

    iget-object p0, p0, Li1/c0;->c:Ljava/util/Queue;

    invoke-interface {p0}, Ljava/util/Collection;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic f(Li1/c0;I)V
    .locals 0

    invoke-virtual {p0, p1}, Li1/c0;->m(I)V

    return-void
.end method

.method public static synthetic g(Li1/c0;Li1/p$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    iget-object p0, p0, Li1/c0;->g:Li1/p;

    invoke-interface {p0, p1, p2}, Li1/p;->b(Li1/p$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic h(Li1/c0;)V
    .locals 0

    invoke-virtual {p0}, Li1/c0;->k()V

    return-void
.end method

.method private i()V
    .locals 2

    iget-object v0, p0, Li1/c0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "AudioStream has been released."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    return-void
.end method

.method private j()V
    .locals 2

    iget-object v0, p0, Li1/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const-string v1, "AudioStream has not been started."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Li1/c0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li1/c0;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/b0;

    invoke-direct {v1, p0}, Li1/b0;-><init>(Li1/c0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Li1/p$a;Ljava/util/concurrent/Executor;)V
    .locals 3

    iget-object v0, p0, Li1/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "AudioStream can not be started when setCallback."

    invoke-static {v0, v2}, Lx2/g;->j(ZLjava/lang/String;)V

    invoke-direct {p0}, Li1/c0;->i()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    const-string v0, "executor can\'t be null with non-null callback."

    invoke-static {v1, v0}, Lx2/g;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Li1/c0;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/x;

    invoke-direct {v1, p0, p1, p2}, Li1/x;-><init>(Li1/c0;Li1/p$a;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k()V
    .locals 5

    iget-object v0, p0, Li1/c0;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Li1/c0;->l:I

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Li1/c0;->g:Li1/p;

    invoke-interface {v1, v0}, Li1/p;->read(Ljava/nio/ByteBuffer;)Li1/p$c;

    move-result-object v1

    new-instance v2, Li1/c0$a;

    iget v3, p0, Li1/c0;->h:I

    iget v4, p0, Li1/c0;->i:I

    invoke-direct {v2, v0, v1, v3, v4}, Li1/c0$a;-><init>(Ljava/nio/ByteBuffer;Li1/p$c;II)V

    iget v0, p0, Li1/c0;->j:I

    iget-object v1, p0, Li1/c0;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v3, p0, Li1/c0;->c:Ljava/util/Queue;

    invoke-interface {v3, v2}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    :goto_0
    iget-object v2, p0, Li1/c0;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    if-le v2, v0, :cond_1

    iget-object v2, p0, Li1/c0;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    const-string v2, "BufferedAudioStream"

    const-string v3, "Drop audio data due to full of queue."

    invoke-static {v2, v3}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Li1/c0;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Li1/c0;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/a0;

    invoke-direct {v1, p0}, Li1/a0;-><init>(Li1/c0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    :goto_1
    return-void

    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Li1/c0;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Li1/c0;->k()V

    return-void
.end method

.method public final m(I)V
    .locals 2

    iget v0, p0, Li1/c0;->l:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget v1, p0, Li1/c0;->h:I

    div-int/2addr p1, v1

    mul-int/2addr p1, v1

    iput p1, p0, Li1/c0;->l:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Update buffer size from "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " to "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Li1/c0;->l:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BufferedAudioStream"

    invoke-static {v0, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final n(I)V
    .locals 2

    iget-object v0, p0, Li1/c0;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/z;

    invoke-direct {v1, p0, p1}, Li1/z;-><init>(Li1/c0;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public read(Ljava/nio/ByteBuffer;)Li1/p$c;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanThreadSleep"
        }
    .end annotation

    invoke-direct {p0}, Li1/c0;->i()V

    invoke-direct {p0}, Li1/c0;->j()V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-virtual {p0, v0}, Li1/c0;->n(I)V

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Li1/p$c;->c(IJ)Li1/p$c;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Li1/c0;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v3, p0, Li1/c0;->f:Li1/c0$a;

    const/4 v4, 0x0

    iput-object v4, p0, Li1/c0;->f:Li1/c0$a;

    if-nez v3, :cond_1

    iget-object v3, p0, Li1/c0;->c:Ljava/util/Queue;

    invoke-interface {v3}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/c0$a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    invoke-virtual {v3, p1}, Li1/c0$a;->b(Ljava/nio/ByteBuffer;)Li1/p$c;

    move-result-object v0

    invoke-virtual {v3}, Li1/c0$a;->a()I

    move-result v4

    if-lez v4, :cond_2

    iput-object v3, p0, Li1/c0;->f:Li1/c0$a;

    :cond_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Li1/p$c;->a()I

    move-result v1

    if-gtz v1, :cond_3

    iget-object v1, p0, Li1/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Li1/c0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    if-eqz v1, :cond_4

    const-wide/16 v3, 0x1

    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string v1, "BufferedAudioStream"

    const-string v2, "Interruption while waiting for audio data"

    invoke-static {v1, v2, p1}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_4
    :goto_2
    if-nez v1, :cond_0

    return-object v0

    :goto_3
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public start()V
    .locals 3

    invoke-direct {p0}, Li1/c0;->i()V

    iget-object v0, p0, Li1/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Li1/y;

    invoke-direct {v1, p0}, Li1/y;-><init>(Li1/c0;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    iget-object v1, p0, Li1/c0;->d:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    iget-object v1, p0, Li1/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    new-instance v1, Li1/p$b;

    invoke-direct {v1, v0}, Li1/p$b;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public stop()V
    .locals 2

    invoke-direct {p0}, Li1/c0;->i()V

    iget-object v0, p0, Li1/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li1/c0;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/w;

    invoke-direct {v1, p0}, Li1/w;-><init>(Li1/c0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
