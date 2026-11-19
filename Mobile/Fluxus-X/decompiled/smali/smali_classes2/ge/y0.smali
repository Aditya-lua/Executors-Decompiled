.class public final Lge/y0;
.super Lge/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lge/f;


# direct methods
.method public constructor <init>(Lge/f;)V
    .locals 0

    iput-object p1, p0, Lge/y0;->b:Lge/f;

    invoke-direct {p0}, Lge/u0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-object v0, p0, Lge/y0;->b:Lge/f;

    invoke-static {v0}, Lge/f;->h(Lge/f;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lge/y0;->b:Lge/f;

    invoke-static {v1}, Lge/f;->j(Lge/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    iget-object v1, p0, Lge/y0;->b:Lge/f;

    invoke-static {v1}, Lge/f;->j(Lge/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lge/y0;->b:Lge/f;

    invoke-static {v1}, Lge/f;->f(Lge/f;)Lge/t0;

    move-result-object v1

    const-string v3, "Leaving the connection open for other ongoing calls."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lge/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lge/y0;->b:Lge/f;

    invoke-static {v1}, Lge/f;->d(Lge/f;)Landroid/os/IInterface;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v1}, Lge/f;->f(Lge/f;)Lge/t0;

    move-result-object v1

    const-string v3, "Unbind from service."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lge/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lge/y0;->b:Lge/f;

    invoke-static {v1}, Lge/f;->a(Lge/f;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v1}, Lge/f;->b(Lge/f;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v1, p0, Lge/y0;->b:Lge/f;

    invoke-static {v1, v2}, Lge/f;->m(Lge/f;Z)V

    iget-object v1, p0, Lge/y0;->b:Lge/f;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lge/f;->n(Lge/f;Landroid/os/IInterface;)V

    iget-object v1, p0, Lge/y0;->b:Lge/f;

    invoke-static {v1, v2}, Lge/f;->l(Lge/f;Landroid/content/ServiceConnection;)V

    :cond_1
    iget-object v1, p0, Lge/y0;->b:Lge/f;

    invoke-static {v1}, Lge/f;->p(Lge/f;)V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
