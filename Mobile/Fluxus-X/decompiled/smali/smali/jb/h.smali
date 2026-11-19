.class public final Ljb/h;
.super Ljb/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ltb/k;

.field public final synthetic c:Ljb/e;

.field public final synthetic d:Ljb/o;


# direct methods
.method public constructor <init>(Ljb/o;Ltb/k;Ltb/k;Ljb/e;)V
    .locals 0

    iput-object p3, p0, Ljb/h;->b:Ltb/k;

    iput-object p4, p0, Ljb/h;->c:Ljb/e;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ljb/h;->d:Ljb/o;

    invoke-direct {p0, p2}, Ljb/e;-><init>(Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-object v0, p0, Ljb/h;->d:Ljb/o;

    invoke-static {v0}, Ljb/o;->g(Ljb/o;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Ljb/h;->b:Ltb/k;

    invoke-static {v0, v2}, Ljb/o;->o(Ljb/o;Ltb/k;)V

    invoke-static {v0}, Ljb/o;->i(Ljb/o;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v2

    if-lez v2, :cond_0

    invoke-static {v0}, Ljb/o;->f(Ljb/o;)Ljb/d;

    move-result-object v2

    const-string v3, "Already connected to the service."

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4}, Ljb/d;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, Ljb/h;->c:Ljb/e;

    invoke-static {v0, v2}, Ljb/o;->q(Ljb/o;Ljb/e;)V

    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
