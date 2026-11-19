.class public Liv/f;
.super Lav/t1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0010\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\u0010\u000c\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0014H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0016\u0010$\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Liv/f;",
        "Lav/t1;",
        "",
        "corePoolSize",
        "maxPoolSize",
        "",
        "idleWorkerKeepAliveNs",
        "",
        "schedulerName",
        "<init>",
        "(IIJLjava/lang/String;)V",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "block",
        "",
        "I",
        "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V",
        "L",
        "",
        "Lkotlinx/coroutines/scheduling/TaskContext;",
        "fair",
        "c0",
        "(Ljava/lang/Runnable;ZZ)V",
        "Liv/a;",
        "b0",
        "()Liv/a;",
        "d",
        "e",
        "f",
        "J",
        "g",
        "Ljava/lang/String;",
        "h",
        "Liv/a;",
        "coroutineScheduler",
        "Ljava/util/concurrent/Executor;",
        "Y",
        "()Ljava/util/concurrent/Executor;",
        "executor",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final d:I

.field public final e:I

.field public final f:J

.field public final g:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h:Liv/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lav/t1;-><init>()V

    iput p1, p0, Liv/f;->d:I

    iput p2, p0, Liv/f;->e:I

    iput-wide p3, p0, Liv/f;->f:J

    iput-object p5, p0, Liv/f;->g:Ljava/lang/String;

    invoke-virtual {p0}, Liv/f;->b0()Liv/a;

    move-result-object p1

    iput-object p1, p0, Liv/f;->h:Liv/a;

    return-void
.end method


# virtual methods
.method public I(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 6
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Liv/f;->h:Liv/a;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Liv/a;->h(Liv/a;Ljava/lang/Runnable;ZZILjava/lang/Object;)V

    return-void
.end method

.method public L(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 6
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Liv/f;->h:Liv/a;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Liv/a;->h(Liv/a;Ljava/lang/Runnable;ZZILjava/lang/Object;)V

    return-void
.end method

.method public Y()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Liv/f;->h:Liv/a;

    return-object v0
.end method

.method public final b0()Liv/a;
    .locals 6

    new-instance v0, Liv/a;

    iget v1, p0, Liv/f;->d:I

    iget v2, p0, Liv/f;->e:I

    iget-wide v3, p0, Liv/f;->f:J

    iget-object v5, p0, Liv/f;->g:Ljava/lang/String;

    invoke-direct/range {v0 .. v5}, Liv/a;-><init>(IIJLjava/lang/String;)V

    return-object v0
.end method

.method public final c0(Ljava/lang/Runnable;ZZ)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Liv/f;->h:Liv/a;

    invoke-virtual {v0, p1, p2, p3}, Liv/a;->g(Ljava/lang/Runnable;ZZ)V

    return-void
.end method
