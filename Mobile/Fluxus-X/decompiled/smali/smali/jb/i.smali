.class public final Ljb/i;
.super Ljb/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ljb/o;


# direct methods
.method public constructor <init>(Ljb/o;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ljb/i;->b:Ljb/o;

    invoke-direct {p0}, Ljb/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    iget-object v0, p0, Ljb/i;->b:Ljb/o;

    invoke-static {v0}, Ljb/o;->g(Ljb/o;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {v0}, Ljb/o;->i(Ljb/o;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_0

    invoke-static {v0}, Ljb/o;->i(Ljb/o;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v2

    if-lez v2, :cond_0

    invoke-static {v0}, Ljb/o;->f(Ljb/o;)Ljb/d;

    move-result-object v0

    const-string v2, "Leaving the connection open for other ongoing calls."

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Ljb/d;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljb/o;->d(Ljb/o;)Landroid/os/IInterface;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Ljb/o;->f(Ljb/o;)Ljb/d;

    move-result-object v2

    const-string v4, "Unbind from service."

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v4, v5}, Ljb/d;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    invoke-static {v0}, Ljb/o;->a(Ljb/o;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v0}, Ljb/o;->b(Ljb/o;)Landroid/content/ServiceConnection;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    invoke-static {v0, v3}, Ljb/o;->m(Ljb/o;Z)V

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ljb/o;->n(Ljb/o;Landroid/os/IInterface;)V

    invoke-static {v0, v2}, Ljb/o;->l(Ljb/o;Landroid/content/ServiceConnection;)V

    :cond_1
    invoke-static {v0}, Ljb/o;->p(Ljb/o;)V

    monitor-exit v1

    return-void

    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
