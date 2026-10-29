.class public final Lib/h;
.super Lib/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lsb/k;

.field public final synthetic c:Lib/e;

.field public final synthetic d:Lib/o;


# direct methods
.method public constructor <init>(Lib/o;Lsb/k;Lsb/k;Lib/e;)V
    .locals 0

    iput-object p3, p0, Lib/h;->b:Lsb/k;

    iput-object p4, p0, Lib/h;->c:Lib/e;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lib/h;->d:Lib/o;

    invoke-direct {p0, p2}, Lib/e;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-object v0, p0, Lib/h;->d:Lib/o;

    invoke-static {v0}, Lib/o;->g(Lib/o;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lib/h;->b:Lsb/k;

    invoke-static {v0, v2}, Lib/o;->o(Lib/o;Lsb/k;)V

    invoke-static {v0}, Lib/o;->i(Lib/o;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v2

    if-lez v2, :cond_0

    invoke-static {v0}, Lib/o;->f(Lib/o;)Lib/d;

    move-result-object v2

    const-string v3, "Already connected to the service."

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4}, Lib/d;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, Lib/h;->c:Lib/e;

    invoke-static {v0, v2}, Lib/o;->q(Lib/o;Lib/e;)V

    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
