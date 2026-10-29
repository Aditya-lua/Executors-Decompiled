.class public Lm1/i0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ln0/a3$a<",
            "-",
            "Lh1/c$a;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lh1/c$a;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lne/x<",
            "Lm1/h1;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic d:Lm1/i0;


# direct methods
.method public constructor <init>(Lm1/i0;)V
    .locals 0

    iput-object p1, p0, Lm1/i0$e;->d:Lm1/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lm1/i0$e;->a:Ljava/util/Map;

    sget-object p1, Lh1/c$a;->b:Lh1/c$a;

    iput-object p1, p0, Lm1/i0$e;->b:Lh1/c$a;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm1/i0$e;->c:Ljava/util/List;

    return-void
.end method

.method public static synthetic f(Lm1/i0$e;Ly1/c$a;)V
    .locals 0

    iget-object p0, p0, Lm1/i0$e;->b:Lh1/c$a;

    invoke-virtual {p1, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic g(Ljava/util/Map$Entry;Lh1/c$a;)V
    .locals 0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/a3$a;

    invoke-interface {p0, p1}, Ln0/a3$a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(Lm1/i0$e;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lm1/i0$e;->d:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lm1/q0;

    invoke-direct {v1, p0, p1}, Lm1/q0;-><init>(Lm1/i0$e;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p0, "fetchData"

    return-object p0
.end method

.method public static synthetic i(Lm1/i0$e;Ln0/a3$a;Ljava/util/concurrent/Executor;)V
    .locals 3

    iget-object v0, p0, Lm1/i0$e;->a:Ljava/util/Map;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/a3$a;

    invoke-static {p2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lm1/i0$e;->b:Lh1/c$a;

    new-instance v0, Lm1/r0;

    invoke-direct {v0, p1, p0}, Lm1/r0;-><init>(Ln0/a3$a;Lh1/c$a;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic j(Ln0/a3$a;Lh1/c$a;)V
    .locals 0

    invoke-interface {p0, p1}, Ln0/a3$a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(Lm1/i0$e;Ln0/a3$a;)V
    .locals 0

    iget-object p0, p0, Lm1/i0$e;->a:Ljava/util/Map;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic l(Lm1/i0$e;Lne/x;)V
    .locals 0

    iget-object p0, p0, Lm1/i0$e;->c:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic m(Lm1/i0$e;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lm1/i0$e;->d:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lm1/s0;

    invoke-direct {v1, p0, p1}, Lm1/s0;-><init>(Lm1/i0$e;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p0, "acquireBuffer"

    return-object p0
.end method

.method public static synthetic n(Lm1/i0$e;Ly1/c$a;)V
    .locals 3

    iget-object v0, p0, Lm1/i0$e;->b:Lh1/c$a;

    sget-object v1, Lh1/c$a;->a:Lh1/c$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lm1/i0$e;->d:Lm1/i0;

    invoke-virtual {v0}, Lm1/i0;->F()Lne/x;

    move-result-object v0

    invoke-static {v0, p1}, Lr0/n;->t(Lne/x;Ly1/c$a;)V

    new-instance v1, Lm1/j0;

    invoke-direct {v1, p0, v0}, Lm1/j0;-><init>(Lm1/i0$e;Lne/x;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ly1/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p1, p0, Lm1/i0$e;->c:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lm1/k0;

    invoke-direct {p1, p0, v0}, Lm1/k0;-><init>(Lm1/i0$e;Lne/x;)V

    iget-object p0, p0, Lm1/i0$e;->d:Lm1/i0;

    iget-object p0, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1, p0}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_0
    sget-object v1, Lh1/c$a;->b:Lh1/c$a;

    if-ne v0, v1, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "BufferProvider is not active."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lm1/i0$e;->b:Lh1/c$a;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public static synthetic o(Lm1/i0$e;Lne/x;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm1/i0$e;->p(Lne/x;)V

    return-void
.end method


# virtual methods
.method public b()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Lh1/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lm1/m0;

    invoke-direct {v0, p0}, Lm1/m0;-><init>(Lm1/i0$e;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/util/concurrent/Executor;Ln0/a3$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ln0/a3$a<",
            "-",
            "Lh1/c$a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lm1/i0$e;->d:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lm1/l0;

    invoke-direct {v1, p0, p2, p1}, Lm1/l0;-><init>(Lm1/i0$e;Ln0/a3$a;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(Ln0/a3$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/a3$a<",
            "-",
            "Lh1/c$a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lm1/i0$e;->d:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lm1/o0;

    invoke-direct {v1, p0, p1}, Lm1/o0;-><init>(Lm1/i0$e;Ln0/a3$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Lm1/h1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lm1/p0;

    invoke-direct {v0, p0}, Lm1/p0;-><init>(Lm1/i0$e;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public final p(Lne/x;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/x<",
            "Lm1/h1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    invoke-static {v0}, Lx2/g;->i(Z)V

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm1/h1;

    invoke-interface {p1}, Lm1/h1;->cancel()Z
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    iget-object v0, p0, Lm1/i0$e;->d:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to cancel the input buffer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public q(Z)V
    .locals 4

    if-eqz p1, :cond_0

    sget-object p1, Lh1/c$a;->a:Lh1/c$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lh1/c$a;->b:Lh1/c$a;

    :goto_0
    iget-object v0, p0, Lm1/i0$e;->b:Lh1/c$a;

    if-ne v0, p1, :cond_1

    goto :goto_3

    :cond_1
    iput-object p1, p0, Lm1/i0$e;->b:Lh1/c$a;

    sget-object v0, Lh1/c$a;->b:Lh1/c$a;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lm1/i0$e;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lne/x;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lm1/i0$e;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_3
    iget-object v0, p0, Lm1/i0$e;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    :try_start_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    new-instance v3, Lm1/n0;

    invoke-direct {v3, v1, p1}, Lm1/n0;-><init>(Ljava/util/Map$Entry;Lh1/c$a;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    iget-object v2, p0, Lm1/i0$e;->d:Lm1/i0;

    iget-object v2, v2, Lm1/i0;->a:Ljava/lang/String;

    const-string v3, "Unable to post to the supplied executor."

    invoke-static {v2, v3, v1}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    :goto_3
    return-void
.end method
