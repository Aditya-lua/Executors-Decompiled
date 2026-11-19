.class public final synthetic Ly4/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\"\u0010\n\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a8\u0010\u0012\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@\u00a2\u0006\u0004\u0008\u0012\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "R",
        "Ly4/u;",
        "Lkotlin/Function1;",
        "Leu/b;",
        "",
        "block",
        "e",
        "(Ly4/u;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;",
        "Lkotlin/Function2;",
        "Lav/p0;",
        "transactionBlock",
        "d",
        "(Ly4/u;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;",
        "Lkotlin/coroutines/d;",
        "dispatcher",
        "Lkotlin/coroutines/CoroutineContext;",
        "c",
        "(Ly4/u;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;",
        "b",
        "room-runtime"
    }
    k = 0x5
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
    xs = "androidx/room/RoomDatabaseKt"
.end annotation


# direct methods
.method public static final synthetic a(Ly4/u;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    invoke-static {p0, p1}, Ly4/x;->c(Ly4/u;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ly4/u;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;
    .locals 2
    .param p0    # Ly4/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ly4/u;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Leu/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Ly4/u;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly4/u;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly4/u;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p2}, Leu/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    sget-object v1, Ly4/y;->a:Ly4/y;

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, p1, p2}, Ly4/v;->e(Ly4/u;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ly4/u;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;
    .locals 1

    new-instance v0, Ly4/c0;

    invoke-direct {v0, p1}, Ly4/c0;-><init>(Lkotlin/coroutines/d;)V

    invoke-interface {p1, v0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-virtual {p0}, Ly4/u;->B()Ljava/lang/ThreadLocal;

    move-result-object p0

    invoke-static {p0, p1}, Lav/b3;->a(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lav/a3;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ly4/u;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ly4/u;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lav/p0;",
            "-",
            "Leu/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lav/p;

    invoke-static {p2}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {v0}, Lav/p;->G()V

    :try_start_0
    invoke-virtual {p0}, Ly4/u;->D()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Ly4/x$a;

    invoke-direct {v2, v0, p0, p1}, Ly4/x$a;-><init>(Lav/n;Ly4/u;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Unable to acquire a thread to perform the database transaction."

    invoke-direct {p1, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v0, p1}, Lav/n;->t(Ljava/lang/Throwable;)Z

    :goto_0
    invoke-virtual {v0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lgu/h;->c(Leu/b;)V

    :cond_0
    return-object p0
.end method

.method public static final e(Ly4/u;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;
    .locals 3
    .param p0    # Ly4/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ly4/u;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Leu/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Ly4/x$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ly4/x$b;-><init>(Lkotlin/jvm/functions/Function1;Leu/b;)V

    invoke-interface {p2}, Leu/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    sget-object v2, Ly4/c0;->b:Ly4/c0$a;

    invoke-interface {p1, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p1

    check-cast p1, Ly4/c0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ly4/c0;->a()Lkotlin/coroutines/d;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_1

    invoke-static {v1, v0, p2}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, v0, p2}, Ly4/x;->d(Ly4/u;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
