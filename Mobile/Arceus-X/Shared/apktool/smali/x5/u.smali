.class public final Lx5/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aS\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n\"\u0004\u0008\u0000\u0010\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0005H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a5\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n\"\u0004\u0008\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "T",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Lku/r0;",
        "start",
        "Lkotlin/Function2;",
        "Lku/p0;",
        "Lnt/b;",
        "",
        "block",
        "Lne/x;",
        "j",
        "(Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;)Lne/x;",
        "V",
        "Ljava/util/concurrent/Executor;",
        "",
        "debugTag",
        "Lkotlin/Function0;",
        "f",
        "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lne/x;",
        "work-runtime_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx5/u;->i(Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx5/u;->l(Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    invoke-static {p0}, Lx5/u;->h(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void
.end method

.method public static synthetic d(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx5/u;->g(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lku/d2;)V
    .locals 0

    invoke-static {p0}, Lx5/u;->m(Lku/d2;)V

    return-void
.end method

.method public static final f(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lne/x;
    .locals 1
    .param p0    # Ljava/util/concurrent/Executor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "+TV;>;)",
            "Lne/x<",
            "TV;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugTag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx5/r;

    invoke-direct {v0, p0, p1, p2}, Lx5/r;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p0

    const-string p1, "getFuture(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final g(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ly1/c$a;)Ljava/lang/Object;
    .locals 3

    const-string v0, "completer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v1, Lx5/s;

    invoke-direct {v1, v0}, Lx5/s;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    sget-object v2, Lx5/h;->a:Lx5/h;

    invoke-virtual {p3, v1, v2}, Ly1/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v1, Lx5/t;

    invoke-direct {v1, v0, p3, p2}, Lx5/t;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object p1
.end method

.method public static final h(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public static final i(Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1, p0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public static final j(Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;)Lne/x;
    .locals 1
    .param p0    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lku/r0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lku/r0;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lku/p0;",
            "-",
            "Lnt/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lne/x<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "start"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx5/p;

    invoke-direct {v0, p0, p1, p2}, Lx5/p;-><init>(Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p0

    const-string p1, "getFuture(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic k(Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lne/x;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget-object p0, Lkotlin/coroutines/e;->a:Lkotlin/coroutines/e;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p1, Lku/r0;->a:Lku/r0;

    :cond_1
    invoke-static {p0, p1, p2}, Lx5/u;->j(Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;Ly1/c$a;)Ljava/lang/Object;
    .locals 8

    const-string v0, "completer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lku/d2;->Mo:Lku/d2$b;

    invoke-interface {p0, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    check-cast v0, Lku/d2;

    new-instance v1, Lx5/q;

    invoke-direct {v1, v0}, Lx5/q;-><init>(Lku/d2;)V

    sget-object v0, Lx5/h;->a:Lx5/h;

    invoke-virtual {p3, v1, v0}, Ly1/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-static {p0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v2

    new-instance v5, Lx5/u$a;

    const/4 p0, 0x0

    invoke-direct {v5, p2, p3, p0}, Lx5/u$a;-><init>(Lkotlin/jvm/functions/Function2;Ly1/c$a;Lnt/b;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v4, p1

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lku/d2;)V
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
