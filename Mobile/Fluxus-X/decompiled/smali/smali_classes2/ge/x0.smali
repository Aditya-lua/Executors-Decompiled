.class public final Lge/x0;
.super Lge/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ltb/k;

.field public final synthetic c:Lge/u0;

.field public final synthetic d:Lge/f;


# direct methods
.method public constructor <init>(Lge/f;Ltb/k;Ltb/k;Lge/u0;)V
    .locals 0

    iput-object p3, p0, Lge/x0;->b:Ltb/k;

    iput-object p4, p0, Lge/x0;->c:Lge/u0;

    iput-object p1, p0, Lge/x0;->d:Lge/f;

    invoke-direct {p0, p2}, Lge/u0;-><init>(Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget-object v0, p0, Lge/x0;->d:Lge/f;

    invoke-static {v0}, Lge/f;->h(Lge/f;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lge/x0;->d:Lge/f;

    iget-object v2, p0, Lge/x0;->b:Ltb/k;

    invoke-static {v1, v2}, Lge/f;->o(Lge/f;Ltb/k;)V

    iget-object v1, p0, Lge/x0;->d:Lge/f;

    invoke-static {v1}, Lge/f;->j(Lge/f;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lge/x0;->d:Lge/f;

    invoke-static {v1}, Lge/f;->f(Lge/f;)Lge/t0;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lge/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lge/x0;->d:Lge/f;

    iget-object v2, p0, Lge/x0;->c:Lge/u0;

    invoke-static {v1, v2}, Lge/f;->q(Lge/f;Lge/u0;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
