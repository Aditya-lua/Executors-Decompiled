.class public final Ln0/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/a3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/u2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ln0/a3<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Ln0/u2$a<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ln0/a3$a<",
            "-TT;>;",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroidx/lifecycle/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/e0<",
            "Ln0/u2$a<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/d0;

    invoke-direct {v0}, Landroidx/lifecycle/d0;-><init>()V

    iput-object v0, p0, Ln0/u2;->a:Landroidx/lifecycle/d0;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ln0/u2;->b:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(Ln0/u2;Ln0/u2$a;)V
    .locals 3

    iget-object v0, p0, Ln0/u2;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    iget-object p0, p0, Ln0/u2;->b:Ljava/util/Map;

    invoke-direct {v1, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    new-instance v2, Ln0/q2;

    invoke-direct {v2, v0, p1}, Ln0/q2;-><init>(Ljava/util/Map$Entry;Ln0/u2$a;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic f(Ljava/util/Map$Entry;Ln0/u2$a;)V
    .locals 1

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/a3$a;

    invoke-virtual {p1}, Ln0/u2$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ln0/u2$a;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Ln0/a3$a;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Ln0/u2$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ln0/u2$a;->c()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {p0, p1}, Ln0/a3$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic g(Ln0/u2;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Ln0/o2;

    invoke-direct {v1, p0, p1}, Ln0/o2;-><init>(Ln0/u2;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " [fetch@"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ln0/u2;)V
    .locals 1

    iget-object v0, p0, Ln0/u2;->c:Landroidx/lifecycle/e0;

    if-nez v0, :cond_0

    new-instance v0, Ln0/p2;

    invoke-direct {v0, p0}, Ln0/p2;-><init>(Ln0/u2;)V

    iput-object v0, p0, Ln0/u2;->c:Landroidx/lifecycle/e0;

    :cond_0
    iget-object v0, p0, Ln0/u2;->a:Landroidx/lifecycle/d0;

    iget-object p0, p0, Ln0/u2;->c:Landroidx/lifecycle/e0;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/a0;->j(Landroidx/lifecycle/e0;)V

    return-void
.end method

.method public static synthetic i(Ln0/u2;)V
    .locals 1

    iget-object v0, p0, Ln0/u2;->c:Landroidx/lifecycle/e0;

    if-eqz v0, :cond_0

    iget-object p0, p0, Ln0/u2;->a:Landroidx/lifecycle/d0;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/a0;->n(Landroidx/lifecycle/e0;)V

    :cond_0
    return-void
.end method

.method public static synthetic j(Ln0/u2;Ln0/a3$a;)V
    .locals 1

    iget-object p0, p0, Ln0/u2;->a:Landroidx/lifecycle/d0;

    invoke-virtual {p0}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/u2$a;

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ln0/u2$a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ln0/u2$a;->d()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Ln0/a3$a;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Ln0/u2$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ln0/u2$a;->c()Ljava/lang/Throwable;

    move-result-object p0

    invoke-interface {p1, p0}, Ln0/a3$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic k(Ln0/u2;Ly1/c$a;)V
    .locals 1

    iget-object p0, p0, Ln0/u2;->a:Landroidx/lifecycle/d0;

    invoke-virtual {p0}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/u2$a;

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Observable has not yet been initialized with a value."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    invoke-virtual {p0}, Ln0/u2$a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ln0/u2$a;->d()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void

    :cond_1
    invoke-virtual {p0}, Ln0/u2$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ln0/u2$a;->c()Ljava/lang/Throwable;

    move-result-object p0

    invoke-virtual {p1, p0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method


# virtual methods
.method public b()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ln0/s2;

    invoke-direct {v0, p0}, Ln0/s2;-><init>(Ln0/u2;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/util/concurrent/Executor;Ln0/a3$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ln0/a3$a<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Ln0/u2;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ln0/u2;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ln0/u2;->b:Ljava/util/Map;

    invoke-interface {v2, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ln0/u2;->m()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance v1, Ln0/r2;

    invoke-direct {v1, p0, p2}, Ln0/r2;-><init>(Ln0/u2;Ln0/a3$a;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public d(Ln0/a3$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/a3$a<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Ln0/u2;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ln0/u2;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ln0/u2;->b:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ln0/u2;->l()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final l()V
    .locals 2

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Ln0/t2;

    invoke-direct {v1, p0}, Ln0/t2;-><init>(Ln0/u2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final m()V
    .locals 2

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Ln0/n2;

    invoke-direct {v1, p0}, Ln0/n2;-><init>(Ln0/u2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public n(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Ln0/u2;->a:Landroidx/lifecycle/d0;

    invoke-static {p1}, Ln0/u2$a;->b(Ljava/lang/Object;)Ln0/u2$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/d0;->m(Ljava/lang/Object;)V

    return-void
.end method
