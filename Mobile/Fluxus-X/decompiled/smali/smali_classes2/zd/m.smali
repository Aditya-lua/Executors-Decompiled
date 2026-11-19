.class public final Lzd/m;
.super Lzd/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ltb/k;

.field public final synthetic c:Lzd/j;

.field public final synthetic d:Lzd/t;


# direct methods
.method public constructor <init>(Lzd/t;Ltb/k;Ltb/k;Lzd/j;)V
    .locals 0

    iput-object p3, p0, Lzd/m;->b:Ltb/k;

    iput-object p4, p0, Lzd/m;->c:Lzd/j;

    iput-object p1, p0, Lzd/m;->d:Lzd/t;

    invoke-direct {p0, p2}, Lzd/j;-><init>(Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lzd/m;->d:Lzd/t;

    invoke-static {v0}, Lzd/t;->g(Lzd/t;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzd/m;->d:Lzd/t;

    iget-object v2, p0, Lzd/m;->b:Ltb/k;

    invoke-static {v1, v2}, Lzd/t;->n(Lzd/t;Ltb/k;)V

    iget-object v1, p0, Lzd/m;->d:Lzd/t;

    invoke-static {v1}, Lzd/t;->i(Lzd/t;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lzd/m;->d:Lzd/t;

    invoke-static {v1}, Lzd/t;->f(Lzd/t;)Lzd/i;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lzd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lzd/m;->d:Lzd/t;

    iget-object v2, p0, Lzd/m;->c:Lzd/j;

    invoke-static {v1, v2}, Lzd/t;->p(Lzd/t;Lzd/j;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
