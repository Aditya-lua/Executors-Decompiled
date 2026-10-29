.class public final Lx5/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "T",
        "Ljava/util/concurrent/Executor;",
        "Lkotlin/Function0;",
        "block",
        "Lne/x;",
        "e",
        "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lne/x;",
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

    invoke-static {p0, p1, p2}, Lx5/z0;->h(Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic b(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    invoke-static {p0}, Lx5/z0;->g(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void
.end method

.method public static synthetic c(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;Ly1/c$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lx5/z0;->f(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;Ly1/c$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lne/x;
    .locals 0

    invoke-static {p0, p1}, Lx5/z0;->e(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)",
            "Lne/x<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lx5/w0;

    invoke-direct {v0, p0, p1}, Lx5/w0;-><init>(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p0

    const-string p1, "getFuture(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final f(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;Ly1/c$a;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v1, Lx5/x0;

    invoke-direct {v1, v0}, Lx5/x0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    sget-object v2, Lx5/h;->a:Lx5/h;

    invoke-virtual {p2, v1, v2}, Ly1/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v1, Lx5/y0;

    invoke-direct {v1, v0, p2, p1}, Lx5/y0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final g(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public static final h(Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Lkotlin/jvm/functions/Function0;)V
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
