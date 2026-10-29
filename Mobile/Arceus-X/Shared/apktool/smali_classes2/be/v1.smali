.class public final Lbe/v1;
.super Lbe/r1;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lbe/g;


# direct methods
.method public constructor <init>(Lbe/g;)V
    .locals 0

    iput-object p1, p0, Lbe/v1;->b:Lbe/g;

    invoke-direct {p0}, Lbe/r1;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    iget-object v0, p0, Lbe/v1;->b:Lbe/g;

    invoke-static {v0}, Lbe/g;->g(Lbe/g;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lbe/v1;->b:Lbe/g;

    invoke-static {v1}, Lbe/g;->i(Lbe/g;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    iget-object v1, p0, Lbe/v1;->b:Lbe/g;

    invoke-static {v1}, Lbe/g;->i(Lbe/g;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lbe/v1;->b:Lbe/g;

    invoke-static {v1}, Lbe/g;->f(Lbe/g;)Lbe/q1;

    move-result-object v1

    const-string v3, "Leaving the connection open for other ongoing calls."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v1, p0, Lbe/v1;->b:Lbe/g;

    invoke-static {v1}, Lbe/g;->d(Lbe/g;)Landroid/os/IInterface;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v1}, Lbe/g;->f(Lbe/g;)Lbe/q1;

    move-result-object v1

    const-string v3, "Unbind from service."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lbe/v1;->b:Lbe/g;

    invoke-static {v1}, Lbe/g;->a(Lbe/g;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v1}, Lbe/g;->b(Lbe/g;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v1, p0, Lbe/v1;->b:Lbe/g;

    invoke-static {v1, v2}, Lbe/g;->l(Lbe/g;Z)V

    iget-object v1, p0, Lbe/v1;->b:Lbe/g;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lbe/g;->m(Lbe/g;Landroid/os/IInterface;)V

    iget-object v1, p0, Lbe/v1;->b:Lbe/g;

    invoke-static {v1, v2}, Lbe/g;->k(Lbe/g;Landroid/content/ServiceConnection;)V

    :cond_2
    iget-object v1, p0, Lbe/v1;->b:Lbe/g;

    invoke-static {v1}, Lbe/g;->o(Lbe/g;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
