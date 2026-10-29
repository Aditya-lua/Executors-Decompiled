.class public Lz/u0$h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/u0$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Lz/u0$h;


# direct methods
.method public constructor <init>(Lz/u0$h;)V
    .locals 4

    iput-object p1, p0, Lz/u0$h$a;->c:Lz/u0$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lz/u0$h$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object p1, p1, Lz/u0$h;->b:Lz/u0;

    invoke-static {p1}, Lz/u0;->M(Lz/u0;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance v0, Lz/x0;

    invoke-direct {v0, p0}, Lz/x0;-><init>(Lz/u0$h$a;)V

    const-wide/16 v1, 0x7d0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lz/u0$h$a;->a:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public static synthetic a(Lz/u0$h$a;)V
    .locals 0

    invoke-virtual {p0}, Lz/u0$h$a;->e()V

    return-void
.end method

.method public static synthetic b(Lz/u0$h$a;)V
    .locals 0

    invoke-virtual {p0}, Lz/u0$h$a;->d()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lz/u0$h$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lz/u0$h$a;->a:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lz/u0$h$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz/u0$h$a;->c:Lz/u0$h;

    iget-object v0, v0, Lz/u0$h;->b:Lz/u0;

    invoke-static {v0}, Lz/u0;->N(Lz/u0;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lz/w0;

    invoke-direct {v1, p0}, Lz/w0;-><init>(Lz/u0$h$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lz/u0$h$a;->c:Lz/u0$h;

    iget-object v0, v0, Lz/u0$h;->b:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->i:Lz/u0$i;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lz/u0$h$a;->c:Lz/u0$h;

    iget-object v0, v0, Lz/u0$h;->b:Lz/u0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Camera skip reopen at state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/u0$h$a;->c:Lz/u0$h;

    iget-object v2, v2, Lz/u0$h;->b:Lz/u0;

    iget-object v2, v2, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lz/u0$h$a;->c:Lz/u0$h;

    iget-object v0, v0, Lz/u0$h;->b:Lz/u0;

    const-string v1, "Camera onError timeout, reopen it."

    invoke-virtual {v0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0$h$a;->c:Lz/u0$h;

    iget-object v0, v0, Lz/u0$h;->b:Lz/u0;

    sget-object v1, Lz/u0$i;->h:Lz/u0$i;

    invoke-virtual {v0, v1}, Lz/u0;->D0(Lz/u0$i;)V

    iget-object v0, p0, Lz/u0$h$a;->c:Lz/u0$h;

    iget-object v0, v0, Lz/u0$h;->b:Lz/u0;

    invoke-static {v0}, Lz/u0;->O(Lz/u0;)Lz/u0$j;

    move-result-object v0

    invoke-virtual {v0}, Lz/u0$j;->e()V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lz/u0$h$a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
