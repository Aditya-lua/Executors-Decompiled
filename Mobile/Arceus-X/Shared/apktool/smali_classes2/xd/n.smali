.class public final Lxd/n;
.super Lxd/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lxd/t;


# direct methods
.method public constructor <init>(Lxd/t;)V
    .locals 0

    iput-object p1, p0, Lxd/n;->b:Lxd/t;

    invoke-direct {p0}, Lxd/j;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lxd/n;->b:Lxd/t;

    invoke-static {v0}, Lxd/t;->g(Lxd/t;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lxd/n;->b:Lxd/t;

    invoke-static {v1}, Lxd/t;->i(Lxd/t;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    iget-object v1, p0, Lxd/n;->b:Lxd/t;

    invoke-static {v1}, Lxd/t;->i(Lxd/t;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lxd/n;->b:Lxd/t;

    invoke-static {v1}, Lxd/t;->f(Lxd/t;)Lxd/i;

    move-result-object v1

    const-string v3, "Leaving the connection open for other ongoing calls."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lxd/n;->b:Lxd/t;

    invoke-static {v1}, Lxd/t;->d(Lxd/t;)Landroid/os/IInterface;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v1}, Lxd/t;->f(Lxd/t;)Lxd/i;

    move-result-object v1

    const-string v3, "Unbind from service."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lxd/n;->b:Lxd/t;

    invoke-static {v1}, Lxd/t;->a(Lxd/t;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v1}, Lxd/t;->b(Lxd/t;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v1, p0, Lxd/n;->b:Lxd/t;

    invoke-static {v1, v2}, Lxd/t;->l(Lxd/t;Z)V

    iget-object v1, p0, Lxd/n;->b:Lxd/t;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lxd/t;->m(Lxd/t;Landroid/os/IInterface;)V

    iget-object v1, p0, Lxd/n;->b:Lxd/t;

    invoke-static {v1, v2}, Lxd/t;->k(Lxd/t;Landroid/content/ServiceConnection;)V

    :cond_1
    iget-object v1, p0, Lxd/n;->b:Lxd/t;

    invoke-static {v1}, Lxd/t;->o(Lxd/t;)V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
