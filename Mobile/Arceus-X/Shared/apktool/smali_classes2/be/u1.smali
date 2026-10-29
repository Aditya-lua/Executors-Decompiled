.class public final Lbe/u1;
.super Lbe/r1;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lsb/k;

.field public final synthetic c:Lbe/r1;

.field public final synthetic d:Lbe/g;


# direct methods
.method public constructor <init>(Lbe/g;Lsb/k;Lsb/k;Lbe/r1;)V
    .locals 0

    iput-object p1, p0, Lbe/u1;->d:Lbe/g;

    iput-object p3, p0, Lbe/u1;->b:Lsb/k;

    iput-object p4, p0, Lbe/u1;->c:Lbe/r1;

    invoke-direct {p0, p2}, Lbe/r1;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    iget-object v0, p0, Lbe/u1;->d:Lbe/g;

    invoke-static {v0}, Lbe/g;->g(Lbe/g;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lbe/u1;->d:Lbe/g;

    iget-object v2, p0, Lbe/u1;->b:Lsb/k;

    invoke-static {v1, v2}, Lbe/g;->n(Lbe/g;Lsb/k;)V

    iget-object v1, p0, Lbe/u1;->d:Lbe/g;

    invoke-static {v1}, Lbe/g;->i(Lbe/g;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lbe/u1;->d:Lbe/g;

    invoke-static {v1}, Lbe/g;->f(Lbe/g;)Lbe/q1;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lbe/u1;->d:Lbe/g;

    iget-object v2, p0, Lbe/u1;->c:Lbe/r1;

    invoke-static {v1, v2}, Lbe/g;->p(Lbe/g;Lbe/r1;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
