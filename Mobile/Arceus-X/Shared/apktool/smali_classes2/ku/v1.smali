.class public final Lku/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0011\u0010\u0008\u001a\u00020\u0004*\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t*\u000c\u0008\u0007\u0010\n\"\u00020\u00012\u00020\u0001\u00a8\u0006\u000b"
    }
    d2 = {
        "Ljava/util/concurrent/ExecutorService;",
        "Lku/t1;",
        "c",
        "(Ljava/util/concurrent/ExecutorService;)Lku/t1;",
        "Ljava/util/concurrent/Executor;",
        "Lku/l0;",
        "b",
        "(Ljava/util/concurrent/Executor;)Lku/l0;",
        "a",
        "(Lku/l0;)Ljava/util/concurrent/Executor;",
        "CloseableCoroutineDispatcher",
        "kotlinx-coroutines-core"
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
.method public static final a(Lku/l0;)Ljava/util/concurrent/Executor;
    .locals 1
    .param p0    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lku/t1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lku/t1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lku/t1;->X()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    new-instance v0, Lku/f1;

    invoke-direct {v0, p0}, Lku/f1;-><init>(Lku/l0;)V

    return-object v0
.end method

.method public static final b(Ljava/util/concurrent/Executor;)Lku/l0;
    .locals 1
    .param p0    # Ljava/util/concurrent/Executor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lku/f1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lku/f1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lku/f1;->a:Lku/l0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    new-instance v0, Lku/u1;

    invoke-direct {v0, p0}, Lku/u1;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static final c(Ljava/util/concurrent/ExecutorService;)Lku/t1;
    .locals 1
    .param p0    # Ljava/util/concurrent/ExecutorService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lku/u1;

    invoke-direct {v0, p0}, Lku/u1;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
