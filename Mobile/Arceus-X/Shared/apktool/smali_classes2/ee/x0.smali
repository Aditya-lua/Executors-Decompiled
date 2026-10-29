.class public final Lee/x0;
.super Lee/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lsb/k;

.field public final synthetic c:Lee/u0;

.field public final synthetic d:Lee/f;


# direct methods
.method public constructor <init>(Lee/f;Lsb/k;Lsb/k;Lee/u0;)V
    .locals 0

    iput-object p3, p0, Lee/x0;->b:Lsb/k;

    iput-object p4, p0, Lee/x0;->c:Lee/u0;

    iput-object p1, p0, Lee/x0;->d:Lee/f;

    invoke-direct {p0, p2}, Lee/u0;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget-object v0, p0, Lee/x0;->d:Lee/f;

    invoke-static {v0}, Lee/f;->h(Lee/f;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lee/x0;->d:Lee/f;

    iget-object v2, p0, Lee/x0;->b:Lsb/k;

    invoke-static {v1, v2}, Lee/f;->o(Lee/f;Lsb/k;)V

    iget-object v1, p0, Lee/x0;->d:Lee/f;

    invoke-static {v1}, Lee/f;->j(Lee/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lee/x0;->d:Lee/f;

    invoke-static {v1}, Lee/f;->f(Lee/f;)Lee/t0;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lee/x0;->d:Lee/f;

    iget-object v2, p0, Lee/x0;->c:Lee/u0;

    invoke-static {v1, v2}, Lee/f;->q(Lee/f;Lee/u0;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
