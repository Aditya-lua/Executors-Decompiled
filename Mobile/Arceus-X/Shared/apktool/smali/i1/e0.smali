.class public Li1/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/p;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final c:I

.field public final d:I

.field public e:[B

.field public f:J

.field public g:Li1/p$a;

.field public h:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Li1/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Li1/e0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Li1/e0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Li1/a;->d()I

    move-result v0

    iput v0, p0, Li1/e0;->c:I

    invoke-virtual {p1}, Li1/a;->e()I

    move-result p1

    iput p1, p0, Li1/e0;->d:I

    return-void
.end method

.method public static synthetic c(Li1/p$a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Li1/p$a;->a(Z)V

    return-void
.end method

.method public static d(J)V
    .locals 2

    invoke-static {}, Li1/e0;->g()J

    move-result-wide v0

    sub-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "SilentAudioStream"

    const-string v0, "Ignore interruption"

    invoke-static {p1, v0, p0}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    iget-object v0, p0, Li1/e0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "AudioStream has been released."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Li1/e0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const-string v1, "AudioStream has not been started."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    return-void
.end method

.method public static g()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Li1/e0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    return-void
.end method

.method public b(Li1/p$a;Ljava/util/concurrent/Executor;)V
    .locals 3

    iget-object v0, p0, Li1/e0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "AudioStream can not be started when setCallback."

    invoke-static {v0, v2}, Lx2/g;->j(ZLjava/lang/String;)V

    invoke-direct {p0}, Li1/e0;->e()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    const-string v0, "executor can\'t be null with non-null callback."

    invoke-static {v1, v0}, Lx2/g;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Li1/e0;->g:Li1/p$a;

    iput-object p2, p0, Li1/e0;->h:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Li1/e0;->g:Li1/p$a;

    iget-object v1, p0, Li1/e0;->h:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    new-instance v2, Li1/d0;

    invoke-direct {v2, v0}, Li1/d0;-><init>(Li1/p$a;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final i(Ljava/nio/ByteBuffer;I)V
    .locals 3

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    const/4 v1, 0x0

    if-gt p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lx2/g;->i(Z)V

    iget-object v0, p0, Li1/e0;->e:[B

    if-eqz v0, :cond_1

    array-length v0, v0

    if-ge v0, p2, :cond_2

    :cond_1
    new-array v0, p2, [B

    iput-object v0, p0, Li1/e0;->e:[B

    :cond_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    iget-object v2, p0, Li1/e0;->e:[B

    invoke-virtual {p1, v2, v1, p2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    add-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public read(Ljava/nio/ByteBuffer;)Li1/p$c;
    .locals 5

    invoke-direct {p0}, Li1/e0;->e()V

    invoke-direct {p0}, Li1/e0;->f()V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    int-to-long v0, v0

    iget v2, p0, Li1/e0;->c:I

    invoke-static {v0, v1, v2}, Li1/t;->g(JI)J

    move-result-wide v0

    iget v2, p0, Li1/e0;->c:I

    invoke-static {v0, v1, v2}, Li1/t;->e(JI)J

    move-result-wide v2

    long-to-int v2, v2

    if-gtz v2, :cond_0

    const/4 p1, 0x0

    iget-wide v0, p0, Li1/e0;->f:J

    invoke-static {p1, v0, v1}, Li1/p$c;->c(IJ)Li1/p$c;

    move-result-object p1

    return-object p1

    :cond_0
    iget v3, p0, Li1/e0;->d:I

    invoke-static {v0, v1, v3}, Li1/t;->d(JI)J

    move-result-wide v0

    iget-wide v3, p0, Li1/e0;->f:J

    add-long/2addr v3, v0

    invoke-static {v3, v4}, Li1/e0;->d(J)V

    invoke-virtual {p0, p1, v2}, Li1/e0;->i(Ljava/nio/ByteBuffer;I)V

    iget-wide v0, p0, Li1/e0;->f:J

    invoke-static {v2, v0, v1}, Li1/p$c;->c(IJ)Li1/p$c;

    move-result-object p1

    iput-wide v3, p0, Li1/e0;->f:J

    return-object p1
.end method

.method public start()V
    .locals 2

    invoke-direct {p0}, Li1/e0;->e()V

    iget-object v0, p0, Li1/e0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Li1/e0;->g()J

    move-result-wide v0

    iput-wide v0, p0, Li1/e0;->f:J

    invoke-virtual {p0}, Li1/e0;->h()V

    return-void
.end method

.method public stop()V
    .locals 2

    invoke-direct {p0}, Li1/e0;->e()V

    iget-object v0, p0, Li1/e0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
