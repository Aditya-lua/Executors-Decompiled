.class public final Lq0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/i$b;,
        Lq0/i$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lq0/i$b;

.field public d:Lq0/i$c;

.field public e:J


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lq0/i;->a:Ljava/util/Deque;

    new-instance v0, Lq0/i$b;

    invoke-direct {v0, p0}, Lq0/i$b;-><init>(Lq0/i;)V

    iput-object v0, p0, Lq0/i;->c:Lq0/i$b;

    sget-object v0, Lq0/i$c;->a:Lq0/i$c;

    iput-object v0, p0, Lq0/i;->d:Lq0/i$c;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lq0/i;->e:J

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lq0/i;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 7

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lq0/i;->a:Ljava/util/Deque;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lq0/i;->d:Lq0/i$c;

    sget-object v2, Lq0/i$c;->d:Lq0/i$c;

    if-eq v1, v2, :cond_6

    sget-object v2, Lq0/i$c;->c:Lq0/i$c;

    if-ne v1, v2, :cond_0

    goto :goto_6

    :cond_0
    iget-wide v3, p0, Lq0/i;->e:J

    new-instance v1, Lq0/i$a;

    invoke-direct {v1, p0, p1}, Lq0/i$a;-><init>(Lq0/i;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lq0/i;->a:Ljava/util/Deque;

    invoke-interface {p1, v1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    sget-object p1, Lq0/i$c;->b:Lq0/i$c;

    iput-object p1, p0, Lq0/i;->d:Lq0/i$c;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v0, p0, Lq0/i;->b:Ljava/util/concurrent/Executor;

    iget-object v5, p0, Lq0/i;->c:Lq0/i$b;

    invoke-interface {v0, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v0, p0, Lq0/i;->d:Lq0/i$c;

    if-eq v0, p1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lq0/i;->a:Ljava/util/Deque;

    monitor-enter v0

    :try_start_2
    iget-wide v5, p0, Lq0/i;->e:J

    cmp-long v1, v5, v3

    if-nez v1, :cond_2

    iget-object v1, p0, Lq0/i;->d:Lq0/i$c;

    if-ne v1, p1, :cond_2

    iput-object v2, p0, Lq0/i;->d:Lq0/i$c;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    :goto_2
    iget-object v2, p0, Lq0/i;->a:Ljava/util/Deque;

    monitor-enter v2

    :try_start_3
    iget-object v0, p0, Lq0/i;->d:Lq0/i$c;

    sget-object v3, Lq0/i$c;->a:Lq0/i$c;

    if-eq v0, v3, :cond_3

    sget-object v3, Lq0/i$c;->b:Lq0/i$c;

    if-ne v0, v3, :cond_4

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_5

    :cond_3
    :goto_3
    iget-object v0, p0, Lq0/i;->a:Ljava/util/Deque;

    invoke-interface {v0, v1}, Ljava/util/Deque;->removeLastOccurrence(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    instance-of v1, p1, Ljava/util/concurrent/RejectedExecutionException;

    if-eqz v1, :cond_5

    if-nez v0, :cond_5

    monitor-exit v2

    return-void

    :cond_5
    throw p1

    :goto_5
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :catchall_2
    move-exception p1

    goto :goto_7

    :cond_6
    :goto_6
    :try_start_4
    iget-object v1, p0, Lq0/i;->a:Ljava/util/Deque;

    invoke-interface {v1, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :goto_7
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method
