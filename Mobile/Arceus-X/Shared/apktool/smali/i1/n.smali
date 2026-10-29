.class public final Li1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/n$e;,
        Li1/n$d;,
        Li1/n$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final d:Li1/p;

.field public final e:Li1/e0;

.field public final f:J

.field public g:Li1/n$e;

.field public h:Lh1/c$a;

.field public i:Z

.field public j:Ljava/util/concurrent/Executor;

.field public k:Li1/n$c;

.field public l:Lh1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh1/c<",
            "+",
            "Lm1/h1;",
            ">;"
        }
    .end annotation
.end field

.field public m:Lr0/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/c<",
            "Lm1/h1;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ln0/a3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/a3$a<",
            "Lh1/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public o:Z

.field public p:J

.field public q:Z

.field public r:Z

.field public s:[B

.field public t:D

.field public u:J

.field public final v:I

.field public final w:I


# direct methods
.method public constructor <init>(Li1/a;Ljava/util/concurrent/Executor;Landroid/content/Context;)V
    .locals 7

    .line 1
    new-instance v4, Li1/h;

    invoke-direct {v4}, Li1/h;-><init>()V

    const-wide/16 v5, 0xbb8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Li1/n;-><init>(Li1/a;Ljava/util/concurrent/Executor;Landroid/content/Context;Li1/q;J)V

    return-void
.end method

.method public constructor <init>(Li1/a;Ljava/util/concurrent/Executor;Landroid/content/Context;Li1/q;J)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Li1/n;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Li1/n;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    sget-object v0, Li1/n$e;->a:Li1/n$e;

    iput-object v0, p0, Li1/n;->g:Li1/n$e;

    .line 6
    sget-object v0, Lh1/c$a;->b:Lh1/c$a;

    iput-object v0, p0, Li1/n;->h:Lh1/c$a;

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Li1/n;->u:J

    .line 8
    invoke-static {p2}, Lq0/c;->g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p2

    iput-object p2, p0, Li1/n;->a:Ljava/util/concurrent/Executor;

    .line 9
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p5, p6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p5

    iput-wide p5, p0, Li1/n;->f:J

    .line 10
    :try_start_0
    new-instance p5, Li1/c0;

    invoke-interface {p4, p1, p3}, Li1/q;->a(Li1/a;Landroid/content/Context;)Li1/p;

    move-result-object p3

    invoke-direct {p5, p3, p1}, Li1/c0;-><init>(Li1/p;Li1/a;)V

    iput-object p5, p0, Li1/n;->d:Li1/p;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Li1/p$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    new-instance p3, Li1/n$d;

    invoke-direct {p3, p0}, Li1/n$d;-><init>(Li1/n;)V

    invoke-interface {p5, p3, p2}, Li1/p;->b(Li1/p$a;Ljava/util/concurrent/Executor;)V

    .line 12
    new-instance p2, Li1/e0;

    invoke-direct {p2, p1}, Li1/e0;-><init>(Li1/a;)V

    iput-object p2, p0, Li1/n;->e:Li1/e0;

    .line 13
    invoke-virtual {p1}, Li1/a;->b()I

    move-result p2

    iput p2, p0, Li1/n;->v:I

    .line 14
    invoke-virtual {p1}, Li1/a;->c()I

    move-result p1

    iput p1, p0, Li1/n;->w:I

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 15
    :goto_0
    new-instance p2, Li1/o;

    const-string p3, "Unable to create AudioStream"

    invoke-direct {p2, p3, p1}, Li1/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static synthetic a(Li1/n;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li1/n;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/k;

    invoke-direct {v1, p0, p1}, Li1/k;-><init>(Li1/n;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p0, "AudioSource-release"

    return-object p0
.end method

.method public static synthetic b(Li1/n;Ljava/util/concurrent/Executor;Li1/n$c;)V
    .locals 1

    iget-object v0, p0, Li1/n;->g:Li1/n$e;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    if-eq v0, p0, :cond_0

    const/4 p0, 0x2

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "The audio recording callback must be registered before the audio source is started."

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_1
    iput-object p1, p0, Li1/n;->j:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Li1/n;->k:Li1/n$c;

    return-void
.end method

.method public static synthetic c(Li1/n$c;Ljava/lang/Throwable;)V
    .locals 0

    invoke-interface {p0, p1}, Li1/n$c;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Li1/n;Lh1/c;)V
    .locals 2

    iget-object v0, p0, Li1/n;->g:Li1/n$e;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p0, 0x2

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "AudioSource is released"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_1
    iget-object v0, p0, Li1/n;->l:Lh1/c;

    if-eq v0, p1, :cond_2

    invoke-virtual {p0, p1}, Li1/n;->x(Lh1/c;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic e(Li1/n;Z)V
    .locals 2

    iget-object v0, p0, Li1/n;->g:Li1/n$e;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p0, 0x2

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "AudioSource is released"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_1
    iget-boolean v0, p0, Li1/n;->r:Z

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    iput-boolean p1, p0, Li1/n;->r:Z

    iget-object p1, p0, Li1/n;->g:Li1/n$e;

    sget-object v0, Li1/n$e;->b:Li1/n$e;

    if-ne p1, v0, :cond_3

    invoke-virtual {p0}, Li1/n;->s()V

    :cond_3
    :goto_0
    return-void
.end method

.method public static synthetic f(Li1/n;Ly1/c$a;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Li1/n;->g:Li1/n$e;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Li1/n;->x(Lh1/c;)V

    iget-object v0, p0, Li1/n;->e:Li1/e0;

    invoke-virtual {v0}, Li1/e0;->a()V

    iget-object v0, p0, Li1/n;->d:Li1/p;

    invoke-interface {v0}, Li1/p;->a()V

    invoke-virtual {p0}, Li1/n;->G()V

    sget-object v0, Li1/n$e;->c:Li1/n$e;

    invoke-virtual {p0, v0}, Li1/n;->C(Li1/n$e;)V

    :goto_0
    invoke-virtual {p1, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1, p0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public static synthetic g(Li1/n;)V
    .locals 2

    iget-object v0, p0, Li1/n;->g:Li1/n$e;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p0, 0x2

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    const-string p0, "AudioSource"

    const-string v0, "AudioSource is released. Calling stop() is a no-op."

    invoke-static {p0, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v0, Li1/n$e;->a:Li1/n$e;

    invoke-virtual {p0, v0}, Li1/n;->C(Li1/n$e;)V

    invoke-virtual {p0}, Li1/n;->H()V

    return-void
.end method

.method public static synthetic h(Li1/n$c;Z)V
    .locals 0

    invoke-interface {p0, p1}, Li1/n$c;->a(Z)V

    return-void
.end method

.method public static synthetic i(Li1/n;Li1/n$c;)V
    .locals 2

    iget-wide v0, p0, Li1/n;->t:D

    invoke-interface {p1, v0, v1}, Li1/n$c;->b(D)V

    return-void
.end method

.method public static synthetic j(Li1/n$c;Z)V
    .locals 0

    invoke-interface {p0, p1}, Li1/n$c;->c(Z)V

    return-void
.end method

.method public static synthetic k(Li1/n;Z)V
    .locals 2

    iget-object v0, p0, Li1/n;->g:Li1/n$e;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "AudioSource is released"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_1
    iget-object v0, p0, Li1/n;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Li1/n;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v0, Li1/n$e;->b:Li1/n$e;

    invoke-virtual {p0, v0}, Li1/n;->C(Li1/n$e;)V

    invoke-virtual {p0, p1}, Li1/n;->q(Z)V

    invoke-virtual {p0}, Li1/n;->H()V

    return-void
.end method

.method public static l(Lh1/c;)Lh1/c$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh1/c<",
            "+",
            "Lm1/h1;",
            ">;)",
            "Lh1/c$a;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0}, Ln0/a3;->b()Lne/x;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh1/c$a;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public static n()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public static o(III)Z
    .locals 0

    invoke-static {p0, p1, p2}, Li1/s;->n(III)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public A(Ljava/util/concurrent/Executor;Li1/n$c;)V
    .locals 2

    iget-object v0, p0, Li1/n;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/l;

    invoke-direct {v1, p0, p1, p2}, Li1/l;-><init>(Li1/n;Ljava/util/concurrent/Executor;Li1/n$c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public B(Lh1/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh1/c<",
            "+",
            "Lm1/h1;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li1/n;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/g;

    invoke-direct {v1, p0, p1}, Li1/g;-><init>(Li1/n;Lh1/c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public C(Li1/n$e;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning internal state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li1/n;->g:Li1/n$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AudioSource"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Li1/n;->g:Li1/n$e;

    return-void
.end method

.method public D(Z)V
    .locals 2

    iget-object v0, p0, Li1/n;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/f;

    invoke-direct {v1, p0, p1}, Li1/f;-><init>(Li1/n;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final E()V
    .locals 4

    const-string v0, "AudioSource"

    iget-boolean v1, p0, Li1/n;->i:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_0
    const-string v2, "startSendingAudio"

    invoke-static {v0, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Li1/n;->d:Li1/p;

    invoke-interface {v2}, Li1/p;->start()V

    const/4 v2, 0x0

    iput-boolean v2, p0, Li1/n;->o:Z
    :try_end_0
    .catch Li1/p$b; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Failed to start AudioStream"

    invoke-static {v0, v3, v2}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean v1, p0, Li1/n;->o:Z

    iget-object v0, p0, Li1/n;->e:Li1/e0;

    invoke-virtual {v0}, Li1/e0;->start()V

    invoke-static {}, Li1/n;->n()J

    move-result-wide v2

    iput-wide v2, p0, Li1/n;->p:J

    invoke-virtual {p0}, Li1/n;->s()V

    :goto_0
    iput-boolean v1, p0, Li1/n;->i:Z

    invoke-virtual {p0}, Li1/n;->z()V

    return-void
.end method

.method public F()V
    .locals 2

    iget-object v0, p0, Li1/n;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/b;

    invoke-direct {v1, p0}, Li1/b;-><init>(Li1/n;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final G()V
    .locals 2

    iget-boolean v0, p0, Li1/n;->i:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Li1/n;->i:Z

    const-string v0, "AudioSource"

    const-string v1, "stopSendingAudio"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Li1/n;->d:Li1/p;

    invoke-interface {v0}, Li1/p;->stop()V

    return-void
.end method

.method public H()V
    .locals 2

    iget-object v0, p0, Li1/n;->g:Li1/n$e;

    sget-object v1, Li1/n$e;->b:Li1/n$e;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Li1/n;->h:Lh1/c$a;

    sget-object v1, Lh1/c$a;->a:Lh1/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Li1/n;->t(Z)V

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Li1/n;->E()V

    return-void

    :cond_1
    invoke-virtual {p0}, Li1/n;->G()V

    return-void

    :cond_2
    invoke-virtual {p0}, Li1/n;->G()V

    return-void
.end method

.method public m()Li1/p;
    .locals 1

    iget-boolean v0, p0, Li1/n;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Li1/n;->e:Li1/e0;

    return-object v0

    :cond_0
    iget-object v0, p0, Li1/n;->d:Li1/p;

    return-object v0
.end method

.method public p()Z
    .locals 7

    iget-wide v0, p0, Li1/n;->p:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lx2/g;->i(Z)V

    invoke-static {}, Li1/n;->n()J

    move-result-wide v3

    iget-wide v5, p0, Li1/n;->p:J

    sub-long/2addr v3, v5

    iget-wide v5, p0, Li1/n;->f:J

    cmp-long v0, v3, v5

    if-ltz v0, :cond_1

    return v2

    :cond_1
    return v1
.end method

.method public q(Z)V
    .locals 2

    iget-object v0, p0, Li1/n;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/i;

    invoke-direct {v1, p0, p1}, Li1/i;-><init>(Li1/n;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public r(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Li1/n;->j:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Li1/n;->k:Li1/n$c;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    new-instance v2, Li1/d;

    invoke-direct {v2, v1, p1}, Li1/d;-><init>(Li1/n$c;Ljava/lang/Throwable;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public s()V
    .locals 5

    iget-object v0, p0, Li1/n;->j:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Li1/n;->k:Li1/n$c;

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    iget-boolean v2, p0, Li1/n;->r:Z

    if-nez v2, :cond_1

    iget-boolean v2, p0, Li1/n;->o:Z

    if-nez v2, :cond_1

    iget-boolean v2, p0, Li1/n;->q:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    iget-object v3, p0, Li1/n;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v3, Li1/j;

    invoke-direct {v3, v1, v2}, Li1/j;-><init>(Li1/n$c;Z)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_2
    return-void
.end method

.method public t(Z)V
    .locals 3

    iget-object v0, p0, Li1/n;->j:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Li1/n;->k:Li1/n$c;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Li1/n;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v2

    if-eq v2, p1, :cond_0

    new-instance v2, Li1/c;

    invoke-direct {v2, v1, p1}, Li1/c;-><init>(Li1/n$c;Z)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public u(Ljava/nio/ByteBuffer;I)V
    .locals 3

    iget-object v0, p0, Li1/n;->s:[B

    if-eqz v0, :cond_0

    array-length v0, v0

    if-ge v0, p2, :cond_1

    :cond_0
    new-array v0, p2, [B

    iput-object v0, p0, Li1/n;->s:[B

    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    iget-object v1, p0, Li1/n;->s:[B

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, p2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public v(Ljava/nio/ByteBuffer;)V
    .locals 6

    iget-object v0, p0, Li1/n;->j:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Li1/n;->k:Li1/n$c;

    iget v2, p0, Li1/n;->v:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object p1

    const-wide/16 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Ljava/nio/ShortBuffer;->get()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    int-to-double v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    goto :goto_0

    :cond_0
    const-wide v4, 0x40dfffc000000000L    # 32767.0

    div-double/2addr v2, v4

    iput-wide v2, p0, Li1/n;->t:D

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    new-instance p1, Li1/m;

    invoke-direct {p1, p0, v1}, Li1/m;-><init>(Li1/n;Li1/n$c;)V

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public w()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Li1/e;

    invoke-direct {v0, p0}, Li1/e;-><init>(Li1/n;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public final x(Lh1/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh1/c<",
            "+",
            "Lm1/h1;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li1/n;->l:Lh1/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Li1/n;->n:Ln0/a3$a;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ln0/a3$a;

    invoke-interface {v0, v1}, Ln0/a3;->d(Ln0/a3$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Li1/n;->l:Lh1/c;

    iput-object v0, p0, Li1/n;->n:Ln0/a3$a;

    iput-object v0, p0, Li1/n;->m:Lr0/c;

    sget-object v0, Lh1/c$a;->b:Lh1/c$a;

    iput-object v0, p0, Li1/n;->h:Lh1/c$a;

    invoke-virtual {p0}, Li1/n;->H()V

    :cond_0
    if-eqz p1, :cond_2

    iput-object p1, p0, Li1/n;->l:Lh1/c;

    new-instance v0, Li1/n$a;

    invoke-direct {v0, p0, p1}, Li1/n$a;-><init>(Li1/n;Lh1/c;)V

    iput-object v0, p0, Li1/n;->n:Ln0/a3$a;

    new-instance v0, Li1/n$b;

    invoke-direct {v0, p0, p1}, Li1/n$b;-><init>(Li1/n;Lh1/c;)V

    iput-object v0, p0, Li1/n;->m:Lr0/c;

    invoke-static {p1}, Li1/n;->l(Lh1/c;)Lh1/c$a;

    move-result-object p1

    if-eqz p1, :cond_1

    iput-object p1, p0, Li1/n;->h:Lh1/c$a;

    invoke-virtual {p0}, Li1/n;->H()V

    :cond_1
    iget-object p1, p0, Li1/n;->l:Lh1/c;

    iget-object v0, p0, Li1/n;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Li1/n;->n:Ln0/a3$a;

    invoke-interface {p1, v0, v1}, Ln0/a3;->c(Ljava/util/concurrent/Executor;Ln0/a3$a;)V

    :cond_2
    return-void
.end method

.method public y()V
    .locals 3

    const-string v0, "AudioSource"

    iget-boolean v1, p0, Li1/n;->o:Z

    invoke-static {v1}, Lx2/g;->i(Z)V

    :try_start_0
    iget-object v1, p0, Li1/n;->d:Li1/p;

    invoke-interface {v1}, Li1/p;->start()V

    const-string v1, "Retry start AudioStream succeed"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Li1/n;->e:Li1/e0;

    invoke-virtual {v1}, Li1/e0;->stop()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Li1/n;->o:Z
    :try_end_0
    .catch Li1/p$b; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v2, "Retry start AudioStream failed"

    invoke-static {v0, v2, v1}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Li1/n;->n()J

    move-result-wide v0

    iput-wide v0, p0, Li1/n;->p:J

    return-void
.end method

.method public z()V
    .locals 3

    iget-object v0, p0, Li1/n;->l:Lh1/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lh1/c;

    invoke-interface {v0}, Lh1/c;->e()Lne/x;

    move-result-object v0

    iget-object v1, p0, Li1/n;->m:Lr0/c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Lr0/c;

    iget-object v2, p0, Li1/n;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method
