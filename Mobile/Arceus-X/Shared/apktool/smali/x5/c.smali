.class public final Lx5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "isTaskExecutor",
        "Ljava/util/concurrent/Executor;",
        "e",
        "(Z)Ljava/util/concurrent/Executor;",
        "Lx5/l0;",
        "f",
        "()Lx5/l0;",
        "Lkotlin/coroutines/CoroutineContext;",
        "d",
        "(Lkotlin/coroutines/CoroutineContext;)Ljava/util/concurrent/Executor;",
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
.method public static final synthetic a(Lkotlin/coroutines/CoroutineContext;)Ljava/util/concurrent/Executor;
    .locals 0

    invoke-static {p0}, Lx5/c;->d(Lkotlin/coroutines/CoroutineContext;)Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Z)Ljava/util/concurrent/Executor;
    .locals 0

    invoke-static {p0}, Lx5/c;->e(Z)Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lx5/l0;
    .locals 1

    invoke-static {}, Lx5/c;->f()Lx5/l0;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Lkotlin/coroutines/CoroutineContext;)Ljava/util/concurrent/Executor;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    sget-object v1, Lkotlin/coroutines/d;->Ko:Lkotlin/coroutines/d$b;

    invoke-interface {p0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p0

    check-cast p0, Lkotlin/coroutines/d;

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of v1, p0, Lku/l0;

    if-eqz v1, :cond_1

    check-cast p0, Lku/l0;

    goto :goto_1

    :cond_1
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_2

    invoke-static {p0}, Lku/v1;->a(Lku/l0;)Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static final e(Z)Ljava/util/concurrent/Executor;
    .locals 2

    new-instance v0, Lx5/c$a;

    invoke-direct {v0, p0}, Lx5/c$a;-><init>(Z)V

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    const/4 v1, 0x4

    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 v1, 0x2

    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    const-string v0, "newFixedThreadPool(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final f()Lx5/l0;
    .locals 1

    new-instance v0, Lx5/c$b;

    invoke-direct {v0}, Lx5/c$b;-><init>()V

    return-object v0
.end method
