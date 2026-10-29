.class public final Lee/y0;
.super Lee/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lee/f;


# direct methods
.method public constructor <init>(Lee/f;)V
    .locals 0

    iput-object p1, p0, Lee/y0;->b:Lee/f;

    invoke-direct {p0}, Lee/u0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-object v0, p0, Lee/y0;->b:Lee/f;

    invoke-static {v0}, Lee/f;->h(Lee/f;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lee/y0;->b:Lee/f;

    invoke-static {v1}, Lee/f;->j(Lee/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    iget-object v1, p0, Lee/y0;->b:Lee/f;

    invoke-static {v1}, Lee/f;->j(Lee/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lee/y0;->b:Lee/f;

    invoke-static {v1}, Lee/f;->f(Lee/f;)Lee/t0;

    move-result-object v1

    const-string v3, "Leaving the connection open for other ongoing calls."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lee/y0;->b:Lee/f;

    invoke-static {v1}, Lee/f;->d(Lee/f;)Landroid/os/IInterface;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v1}, Lee/f;->f(Lee/f;)Lee/t0;

    move-result-object v1

    const-string v3, "Unbind from service."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lee/y0;->b:Lee/f;

    invoke-static {v1}, Lee/f;->a(Lee/f;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v1}, Lee/f;->b(Lee/f;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v1, p0, Lee/y0;->b:Lee/f;

    invoke-static {v1, v2}, Lee/f;->m(Lee/f;Z)V

    iget-object v1, p0, Lee/y0;->b:Lee/f;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lee/f;->n(Lee/f;Landroid/os/IInterface;)V

    iget-object v1, p0, Lee/y0;->b:Lee/f;

    invoke-static {v1, v2}, Lee/f;->l(Lee/f;Landroid/content/ServiceConnection;)V

    :cond_1
    iget-object v1, p0, Lee/y0;->b:Lee/f;

    invoke-static {v1}, Lee/f;->p(Lee/f;)V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
