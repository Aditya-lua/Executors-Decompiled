.class public final Lnb/c7;
.super Lnb/k8;
.source "SourceFile"


# static fields
.field public static final k:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public c:Lnb/b7;

.field public d:Lnb/b7;

.field public final e:Ljava/util/concurrent/PriorityBlockingQueue;

.field public final f:Ljava/util/concurrent/BlockingQueue;

.field public final g:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public final h:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/util/concurrent/Semaphore;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/high16 v1, -0x8000000000000000L

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lnb/c7;->k:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(Lnb/g7;)V
    .locals 1

    invoke-direct {p0, p1}, Lnb/k8;-><init>(Lnb/g7;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/c7;->i:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object p1, p0, Lnb/c7;->j:Ljava/util/concurrent/Semaphore;

    new-instance p1, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {p1}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object p1, p0, Lnb/c7;->e:Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance p1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object p1, p0, Lnb/c7;->f:Ljava/util/concurrent/BlockingQueue;

    new-instance p1, Lnb/z6;

    const-string v0, "Thread death: Uncaught exception on worker thread"

    invoke-direct {p1, p0, v0}, Lnb/z6;-><init>(Lnb/c7;Ljava/lang/String;)V

    iput-object p1, p0, Lnb/c7;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    new-instance p1, Lnb/z6;

    const-string v0, "Thread death: Uncaught exception on network thread"

    invoke-direct {p1, p0, v0}, Lnb/z6;-><init>(Lnb/c7;Ljava/lang/String;)V

    iput-object p1, p0, Lnb/c7;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method public static synthetic E()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 1

    sget-object v0, Lnb/c7;->k:Ljava/util/concurrent/atomic/AtomicLong;

    return-object v0
.end method


# virtual methods
.method public final synthetic A(Lnb/b7;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lnb/c7;->d:Lnb/b7;

    return-void
.end method

.method public final synthetic B()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnb/c7;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final synthetic C()Ljava/util/concurrent/Semaphore;
    .locals 1

    iget-object v0, p0, Lnb/c7;->j:Ljava/util/concurrent/Semaphore;

    return-object v0
.end method

.method public final synthetic D()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final F(Lnb/a7;)V
    .locals 3

    iget-object v0, p0, Lnb/c7;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lnb/c7;->e:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lnb/c7;->c:Lnb/b7;

    if-nez p1, :cond_0

    new-instance p1, Lnb/b7;

    const-string v2, "Measurement Worker"

    invoke-direct {p1, p0, v2, v1}, Lnb/b7;-><init>(Lnb/c7;Ljava/lang/String;Ljava/util/concurrent/BlockingQueue;)V

    iput-object p1, p0, Lnb/c7;->c:Lnb/b7;

    iget-object v1, p0, Lnb/c7;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {p1, v1}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iget-object p1, p0, Lnb/c7;->c:Lnb/b7;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lnb/b7;->a()V

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final g()V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lnb/c7;->d:Lnb/b7;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call expected from network thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lnb/c7;->c:Lnb/b7;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call expected from worker thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final o()V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lnb/c7;->c:Lnb/b7;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call not expected from worker thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final p()Z
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lnb/c7;->c:Lnb/b7;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final q()Z
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lnb/c7;->d:Lnb/b7;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 3

    invoke-virtual {p0}, Lnb/k8;->l()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnb/a7;

    const/4 v1, 0x0

    const-string v2, "Task exception on worker thread"

    invoke-direct {v0, p0, p1, v1, v2}, Lnb/a7;-><init>(Lnb/c7;Ljava/util/concurrent/Callable;ZLjava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v1, p0, Lnb/c7;->c:Lnb/b7;

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lnb/c7;->e:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->r()Lnb/u5;

    move-result-object p1

    const-string v1, "Callable skipped the worker queue."

    invoke-virtual {p1, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->run()V

    return-object v0

    :cond_1
    invoke-virtual {p0, v0}, Lnb/c7;->F(Lnb/a7;)V

    return-object v0
.end method

.method public final s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 3

    invoke-virtual {p0}, Lnb/k8;->l()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnb/a7;

    const/4 v1, 0x1

    const-string v2, "Task exception on worker thread"

    invoke-direct {v0, p0, p1, v1, v2}, Lnb/a7;-><init>(Lnb/c7;Ljava/util/concurrent/Callable;ZLjava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v1, p0, Lnb/c7;->c:Lnb/b7;

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->run()V

    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lnb/c7;->F(Lnb/a7;)V

    return-object v0
.end method

.method public final t(Ljava/lang/Runnable;)V
    .locals 3

    invoke-virtual {p0}, Lnb/k8;->l()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnb/a7;

    const/4 v1, 0x0

    const-string v2, "Task exception on worker thread"

    invoke-direct {v0, p0, p1, v1, v2}, Lnb/a7;-><init>(Lnb/c7;Ljava/lang/Runnable;ZLjava/lang/String;)V

    invoke-virtual {p0, v0}, Lnb/c7;->F(Lnb/a7;)V

    return-void
.end method

.method public final u(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;
    .locals 2

    const-string v0, "Interrupted waiting for "

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1, p5}, Lnb/c7;->t(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p1, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->r()Lnb/u5;

    move-result-object p2

    const-string p3, "Timed out waiting for "

    invoke-virtual {p3, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :catch_0
    :try_start_3
    iget-object p2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->r()Lnb/u5;

    move-result-object p2

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p3

    add-int/lit8 p3, p3, 0x18

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lnb/u5;->a(Ljava/lang/String;)V

    monitor-exit p1

    const/4 p1, 0x0

    return-object p1

    :goto_0
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p2
.end method

.method public final v(Ljava/lang/Runnable;)V
    .locals 3

    invoke-virtual {p0}, Lnb/k8;->l()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lnb/a7;

    const/4 v1, 0x1

    const-string v2, "Task exception on worker thread"

    invoke-direct {v0, p0, p1, v1, v2}, Lnb/a7;-><init>(Lnb/c7;Ljava/lang/Runnable;ZLjava/lang/String;)V

    invoke-virtual {p0, v0}, Lnb/c7;->F(Lnb/a7;)V

    return-void
.end method

.method public final w(Ljava/lang/Runnable;)V
    .locals 3

    invoke-virtual {p0}, Lnb/k8;->l()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Task exception on network thread"

    new-instance v1, Lnb/a7;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2, v0}, Lnb/a7;-><init>(Lnb/c7;Ljava/lang/Runnable;ZLjava/lang/String;)V

    iget-object p1, p0, Lnb/c7;->i:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lnb/c7;->f:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lnb/c7;->d:Lnb/b7;

    if-nez v1, :cond_0

    new-instance v1, Lnb/b7;

    const-string v2, "Measurement Network"

    invoke-direct {v1, p0, v2, v0}, Lnb/b7;-><init>(Lnb/c7;Ljava/lang/String;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, Lnb/c7;->d:Lnb/b7;

    iget-object v0, p0, Lnb/c7;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iget-object v0, p0, Lnb/c7;->d:Lnb/b7;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lnb/b7;->a()V

    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final synthetic x()Lnb/b7;
    .locals 1

    iget-object v0, p0, Lnb/c7;->c:Lnb/b7;

    return-object v0
.end method

.method public final synthetic y(Lnb/b7;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lnb/c7;->c:Lnb/b7;

    return-void
.end method

.method public final synthetic z()Lnb/b7;
    .locals 1

    iget-object v0, p0, Lnb/c7;->d:Lnb/b7;

    return-object v0
.end method
