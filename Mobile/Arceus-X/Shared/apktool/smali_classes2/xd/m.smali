.class public final Lxd/m;
.super Lxd/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lsb/k;

.field public final synthetic c:Lxd/j;

.field public final synthetic d:Lxd/t;


# direct methods
.method public constructor <init>(Lxd/t;Lsb/k;Lsb/k;Lxd/j;)V
    .locals 0

    iput-object p3, p0, Lxd/m;->b:Lsb/k;

    iput-object p4, p0, Lxd/m;->c:Lxd/j;

    iput-object p1, p0, Lxd/m;->d:Lxd/t;

    invoke-direct {p0, p2}, Lxd/j;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lxd/m;->d:Lxd/t;

    invoke-static {v0}, Lxd/t;->g(Lxd/t;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lxd/m;->d:Lxd/t;

    iget-object v2, p0, Lxd/m;->b:Lsb/k;

    invoke-static {v1, v2}, Lxd/t;->n(Lxd/t;Lsb/k;)V

    iget-object v1, p0, Lxd/m;->d:Lxd/t;

    invoke-static {v1}, Lxd/t;->i(Lxd/t;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lxd/m;->d:Lxd/t;

    invoke-static {v1}, Lxd/t;->f(Lxd/t;)Lxd/i;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lxd/m;->d:Lxd/t;

    iget-object v2, p0, Lxd/m;->c:Lxd/j;

    invoke-static {v1, v2}, Lxd/t;->p(Lxd/t;Lxd/j;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
