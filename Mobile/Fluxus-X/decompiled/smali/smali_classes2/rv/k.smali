.class public final Lrv/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrv/i;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0011\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001cR\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\"R\"\u0010\'\u001a\u0010\u0012\u000c\u0012\n %*\u0004\u0018\u00010\u000b0\u000b0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lrv/k;",
        "Lrv/i;",
        "Lrv/t;",
        "routePlanner",
        "Lqv/d;",
        "taskRunner",
        "<init>",
        "(Lrv/t;Lqv/d;)V",
        "Lrv/n;",
        "a",
        "()Lrv/n;",
        "Lrv/t$a;",
        "g",
        "()Lrv/t$a;",
        "",
        "timeout",
        "Ljava/util/concurrent/TimeUnit;",
        "unit",
        "e",
        "(JLjava/util/concurrent/TimeUnit;)Lrv/t$a;",
        "",
        "f",
        "()V",
        "Lrv/t;",
        "b",
        "()Lrv/t;",
        "Lqv/d;",
        "c",
        "J",
        "connectDelayNanos",
        "d",
        "nextTcpConnectAtNanos",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Lrv/t$b;",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "tcpConnectsInFlight",
        "Ljava/util/concurrent/BlockingQueue;",
        "kotlin.jvm.PlatformType",
        "Ljava/util/concurrent/BlockingQueue;",
        "connectResults",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lrv/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lqv/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:J

.field public d:J

.field public final e:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lrv/t$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lrv/t$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lrv/t;Lqv/d;)V
    .locals 2
    .param p1    # Lrv/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lqv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "routePlanner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskRunner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrv/k;->a:Lrv/t;

    iput-object p2, p0, Lrv/k;->b:Lqv/d;

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0xfa

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lrv/k;->c:J

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lrv/k;->d:J

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lrv/k;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2}, Lqv/d;->h()Lqv/d$a;

    move-result-object p1

    new-instance p2, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {p2}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    invoke-interface {p1, p2}, Lqv/d$a;->e(Ljava/util/concurrent/BlockingQueue;)Ljava/util/concurrent/BlockingQueue;

    move-result-object p1

    iput-object p1, p0, Lrv/k;->f:Ljava/util/concurrent/BlockingQueue;

    return-void
.end method

.method public static final synthetic c(Lrv/k;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    iget-object p0, p0, Lrv/k;->f:Ljava/util/concurrent/BlockingQueue;

    return-object p0
.end method

.method public static final synthetic d(Lrv/k;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    iget-object p0, p0, Lrv/k;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method


# virtual methods
.method public a()Lrv/n;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    :goto_0
    :try_start_0
    iget-object v2, p0, Lrv/k;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lrv/k;->b()Lrv/t;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v0}, Lrv/t;->b(Lrv/t;Lrv/n;ILjava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lrv/k;->f()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    throw v1

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_2
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lrv/k;->b()Lrv/t;

    move-result-object v2

    invoke-interface {v2}, Lrv/t;->m()Z

    move-result v2

    if-nez v2, :cond_b

    iget-object v2, p0, Lrv/k;->b:Lqv/d;

    invoke-virtual {v2}, Lqv/d;->h()Lqv/d$a;

    move-result-object v2

    invoke-interface {v2}, Lqv/d$a;->c()J

    move-result-wide v2

    iget-wide v4, p0, Lrv/k;->d:J

    sub-long/2addr v4, v2

    iget-object v6, p0, Lrv/k;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-gtz v6, :cond_3

    goto :goto_2

    :cond_3
    move-wide v5, v4

    move-object v4, v0

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {p0}, Lrv/k;->g()Lrv/t$a;

    move-result-object v4

    iget-wide v5, p0, Lrv/k;->c:J

    add-long/2addr v2, v5

    iput-wide v2, p0, Lrv/k;->d:J

    :goto_3
    if-nez v4, :cond_5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v5, v6, v2}, Lrv/k;->e(JLjava/util/concurrent/TimeUnit;)Lrv/t$a;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v4}, Lrv/t$a;->f()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p0}, Lrv/k;->f()V

    invoke-virtual {v4}, Lrv/t$a;->d()Lrv/t$b;

    move-result-object v2

    invoke-interface {v2}, Lrv/t$b;->a()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v4}, Lrv/t$a;->d()Lrv/t$b;

    move-result-object v2

    invoke-interface {v2}, Lrv/t$b;->e()Lrv/t$a;

    move-result-object v4

    :cond_6
    invoke-virtual {v4}, Lrv/t$a;->f()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v4}, Lrv/t$a;->d()Lrv/t$b;

    move-result-object v0

    invoke-interface {v0}, Lrv/t$b;->c()Lrv/n;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Lrv/k;->f()V

    return-object v0

    :cond_7
    :try_start_2
    invoke-virtual {v4}, Lrv/t$a;->e()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_a

    instance-of v3, v2, Ljava/io/IOException;

    if-eqz v3, :cond_9

    if-nez v1, :cond_8

    check-cast v2, Ljava/io/IOException;

    move-object v1, v2

    goto :goto_4

    :cond_8
    invoke-static {v1, v2}, Lzt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_9
    throw v2

    :cond_a
    :goto_4
    invoke-virtual {v4}, Lrv/t$a;->c()Lrv/t$b;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lrv/k;->b()Lrv/t;

    move-result-object v3

    invoke-interface {v3}, Lrv/t;->c()Lkotlin/collections/i;

    move-result-object v3

    invoke-virtual {v3, v2}, Lkotlin/collections/i;->addFirst(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_5
    invoke-virtual {p0}, Lrv/k;->f()V

    throw v0
.end method

.method public b()Lrv/t;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lrv/k;->a:Lrv/t;

    return-object v0
.end method

.method public final e(JLjava/util/concurrent/TimeUnit;)Lrv/t$a;
    .locals 2

    iget-object v0, p0, Lrv/k;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lrv/k;->f:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrv/t$a;

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    iget-object p2, p0, Lrv/k;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Lrv/t$a;->d()Lrv/t$b;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Lrv/k;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrv/t$b;

    invoke-interface {v1}, Lrv/t$b;->cancel()V

    invoke-interface {v1}, Lrv/t$b;->b()Lrv/t$b;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lrv/k;->b()Lrv/t;

    move-result-object v2

    invoke-interface {v2}, Lrv/t;->c()Lkotlin/collections/i;

    move-result-object v2

    invoke-virtual {v2, v1}, Lkotlin/collections/i;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lrv/k;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method

.method public final g()Lrv/t$a;
    .locals 11

    invoke-virtual {p0}, Lrv/k;->b()Lrv/t;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lrv/t;->b(Lrv/t;Lrv/n;ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lrv/k;->b()Lrv/t;

    move-result-object v0

    invoke-interface {v0}, Lrv/t;->d()Lrv/t$b;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    new-instance v1, Lrv/j;

    invoke-direct {v1, v0}, Lrv/j;-><init>(Ljava/lang/Throwable;)V

    move-object v4, v1

    :goto_0
    invoke-interface {v4}, Lrv/t$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v3, Lrv/t$a;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lrv/t$a;-><init>(Lrv/t$b;Lrv/t$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_0
    instance-of v0, v4, Lrv/j;

    if-eqz v0, :cond_1

    check-cast v4, Lrv/j;

    invoke-virtual {v4}, Lrv/j;->f()Lrv/t$a;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lrv/k;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lnv/q;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " connect "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lrv/k;->b()Lrv/t;

    move-result-object v1

    invoke-interface {v1}, Lrv/t;->a()Lmv/a;

    move-result-object v1

    invoke-virtual {v1}, Lmv/a;->l()Lmv/z;

    move-result-object v1

    invoke-virtual {v1}, Lmv/z;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrv/k;->b:Lqv/d;

    invoke-virtual {v1}, Lqv/d;->k()Lqv/c;

    move-result-object v5

    new-instance v6, Lrv/k$a;

    invoke-direct {v6, v0, v4, p0}, Lrv/k$a;-><init>(Ljava/lang/String;Lrv/t$b;Lrv/k;)V

    const/4 v9, 0x2

    const/4 v10, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v5 .. v10}, Lqv/c;->m(Lqv/c;Lqv/a;JILjava/lang/Object;)V

    :cond_2
    return-object v2
.end method
