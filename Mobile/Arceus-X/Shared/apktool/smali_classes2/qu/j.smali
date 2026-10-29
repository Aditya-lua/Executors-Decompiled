.class public final Lqu/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0006\"\u0004\u0008\u0000\u0010\u000c*\u0008\u0012\u0004\u0012\u00028\u00000\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\t*\u0008\u0012\u0004\u0012\u00020\u00060\u0012H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Lku/l0;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "runnable",
        "",
        "c",
        "(Lku/l0;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V",
        "",
        "d",
        "(Lku/l0;Lkotlin/coroutines/CoroutineContext;)Z",
        "T",
        "Lnt/b;",
        "Ljt/n;",
        "result",
        "b",
        "(Lnt/b;Ljava/lang/Object;)V",
        "Lqu/i;",
        "e",
        "(Lqu/i;)Z",
        "Lqu/e0;",
        "a",
        "Lqu/e0;",
        "UNDEFINED",
        "REUSABLE_CLAIMED",
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


# static fields
.field public static final a:Lqu/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lqu/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqu/e0;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lqu/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqu/j;->a:Lqu/e0;

    new-instance v0, Lqu/e0;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lqu/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqu/j;->b:Lqu/e0;

    return-void
.end method

.method public static final synthetic a()Lqu/e0;
    .locals 1

    sget-object v0, Lqu/j;->a:Lqu/e0;

    return-object v0
.end method

.method public static final b(Lnt/b;Ljava/lang/Object;)V
    .locals 6
    .param p0    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnt/b<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    instance-of v0, p0, Lqu/i;

    if-eqz v0, :cond_8

    check-cast p0, Lqu/i;

    invoke-static {p1}, Lku/e0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lqu/i;->d:Lku/l0;

    invoke-virtual {p0}, Lqu/i;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    invoke-static {v1, v2}, Lqu/j;->d(Lku/l0;Lkotlin/coroutines/CoroutineContext;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iput-object v0, p0, Lqu/i;->f:Ljava/lang/Object;

    iput v2, p0, Lku/d1;->c:I

    iget-object p1, p0, Lqu/i;->d:Lku/l0;

    invoke-virtual {p0}, Lqu/i;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {p1, v0, p0}, Lqu/j;->c(Lku/l0;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    :cond_0
    sget-object v1, Lku/c3;->a:Lku/c3;

    invoke-virtual {v1}, Lku/c3;->b()Lku/m1;

    move-result-object v1

    invoke-virtual {v1}, Lku/m1;->i0()Z

    move-result v3

    if-eqz v3, :cond_1

    iput-object v0, p0, Lqu/i;->f:Ljava/lang/Object;

    iput v2, p0, Lku/d1;->c:I

    invoke-virtual {v1, p0}, Lku/m1;->a0(Lku/d1;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v1, v2}, Lku/m1;->e0(Z)V

    :try_start_0
    invoke-virtual {p0}, Lqu/i;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    sget-object v4, Lku/d2;->Mo:Lku/d2$b;

    invoke-interface {v3, v4}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v3

    check-cast v3, Lku/d2;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lku/d2;->b()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Lku/d2;->m()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lku/d1;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    iget-object v0, p0, Lqu/i;->e:Lnt/b;

    iget-object v3, p0, Lqu/i;->g:Ljava/lang/Object;

    invoke-interface {v0}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v4

    invoke-static {v4, v3}, Lqu/l0;->i(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lqu/l0;->a:Lqu/e0;

    if-eq v3, v5, :cond_3

    invoke-static {v0, v4, v3}, Lku/j0;->m(Lnt/b;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lku/i3;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    :try_start_1
    iget-object v5, p0, Lqu/i;->e:Lnt/b;

    invoke-interface {v5, p1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_4

    :try_start_2
    invoke-virtual {v0}, Lku/i3;->Y0()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    invoke-static {v4, v3}, Lqu/l0;->f(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    :cond_5
    :goto_1
    invoke-virtual {v1}, Lku/m1;->t0()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_5

    :goto_2
    invoke-virtual {v1, v2}, Lku/m1;->X(Z)V

    goto :goto_4

    :catchall_1
    move-exception p1

    if-eqz v0, :cond_6

    :try_start_3
    invoke-virtual {v0}, Lku/i3;->Y0()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    invoke-static {v4, v3}, Lqu/l0;->f(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    :cond_7
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    :try_start_4
    invoke-virtual {p0, p1}, Lku/d1;->i(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :goto_4
    return-void

    :catchall_2
    move-exception p0

    invoke-virtual {v1, v2}, Lku/m1;->X(Z)V

    throw p0

    :cond_8
    invoke-interface {p0, p1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lku/l0;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 1
    .param p0    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lku/l0;->w(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    new-instance v0, Lku/b1;

    invoke-direct {v0, p2, p0, p1}, Lku/b1;-><init>(Ljava/lang/Throwable;Lku/l0;Lkotlin/coroutines/CoroutineContext;)V

    throw v0
.end method

.method public static final d(Lku/l0;Lkotlin/coroutines/CoroutineContext;)Z
    .locals 2
    .param p0    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    :try_start_0
    invoke-virtual {p0, p1}, Lku/l0;->H(Lkotlin/coroutines/CoroutineContext;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception v0

    new-instance v1, Lku/b1;

    invoke-direct {v1, v0, p0, p1}, Lku/b1;-><init>(Ljava/lang/Throwable;Lku/l0;Lkotlin/coroutines/CoroutineContext;)V

    throw v1
.end method

.method public static final e(Lqu/i;)Z
    .locals 5
    .param p0    # Lqu/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqu/i<",
            "-",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    sget-object v1, Lku/c3;->a:Lku/c3;

    invoke-virtual {v1}, Lku/c3;->b()Lku/m1;

    move-result-object v1

    invoke-virtual {v1}, Lku/m1;->l0()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    return v3

    :cond_0
    invoke-virtual {v1}, Lku/m1;->i0()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    iput-object v0, p0, Lqu/i;->f:Ljava/lang/Object;

    iput v4, p0, Lku/d1;->c:I

    invoke-virtual {v1, p0}, Lku/m1;->a0(Lku/d1;)V

    move v3, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v4}, Lku/m1;->e0(Z)V

    :try_start_0
    invoke-virtual {p0}, Lku/d1;->run()V

    :cond_2
    invoke-virtual {v1}, Lku/m1;->t0()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    :goto_0
    invoke-virtual {v1, v4}, Lku/m1;->X(Z)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-virtual {p0, v0}, Lku/d1;->i(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :goto_1
    return v3

    :catchall_1
    move-exception p0

    invoke-virtual {v1, v4}, Lku/m1;->X(Z)V

    throw p0
.end method
