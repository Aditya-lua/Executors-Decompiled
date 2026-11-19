.class public final Lde/v1;
.super Lde/r1;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lde/g;


# direct methods
.method public constructor <init>(Lde/g;)V
    .locals 0

    iput-object p1, p0, Lde/v1;->b:Lde/g;

    invoke-direct {p0}, Lde/r1;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    iget-object v0, p0, Lde/v1;->b:Lde/g;

    invoke-static {v0}, Lde/g;->g(Lde/g;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lde/v1;->b:Lde/g;

    invoke-static {v1}, Lde/g;->i(Lde/g;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    iget-object v1, p0, Lde/v1;->b:Lde/g;

    invoke-static {v1}, Lde/g;->i(Lde/g;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lde/v1;->b:Lde/g;

    invoke-static {v1}, Lde/g;->f(Lde/g;)Lde/q1;

    move-result-object v1

    const-string v3, "Leaving the connection open for other ongoing calls."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v1, p0, Lde/v1;->b:Lde/g;

    invoke-static {v1}, Lde/g;->d(Lde/g;)Landroid/os/IInterface;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v1}, Lde/g;->f(Lde/g;)Lde/q1;

    move-result-object v1

    const-string v3, "Unbind from service."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lde/v1;->b:Lde/g;

    invoke-static {v1}, Lde/g;->a(Lde/g;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v1}, Lde/g;->b(Lde/g;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v1, p0, Lde/v1;->b:Lde/g;

    invoke-static {v1, v2}, Lde/g;->l(Lde/g;Z)V

    iget-object v1, p0, Lde/v1;->b:Lde/g;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lde/g;->m(Lde/g;Landroid/os/IInterface;)V

    iget-object v1, p0, Lde/v1;->b:Lde/g;

    invoke-static {v1, v2}, Lde/g;->k(Lde/g;Landroid/content/ServiceConnection;)V

    :cond_2
    iget-object v1, p0, Lde/v1;->b:Lde/g;

    invoke-static {v1}, Lde/g;->o(Lde/g;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
