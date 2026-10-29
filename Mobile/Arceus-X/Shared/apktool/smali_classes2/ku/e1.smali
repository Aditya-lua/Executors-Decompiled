.class public final Lku/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u001a\'\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\u0008\u00030\u0001H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "T",
        "Lku/d1;",
        "",
        "mode",
        "",
        "a",
        "(Lku/d1;I)V",
        "Lnt/b;",
        "delegate",
        "",
        "undispatched",
        "d",
        "(Lku/d1;Lnt/b;Z)V",
        "e",
        "(Lku/d1;)V",
        "b",
        "(I)Z",
        "isCancellableMode",
        "c",
        "isReusableMode",
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
.method public static final a(Lku/d1;I)V
    .locals 3
    .param p0    # Lku/d1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lku/d1<",
            "-TT;>;I)V"
        }
    .end annotation

    invoke-virtual {p0}, Lku/d1;->c()Lnt/b;

    move-result-object v0

    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    instance-of v2, v0, Lqu/i;

    if-eqz v2, :cond_2

    invoke-static {p1}, Lku/e1;->b(I)Z

    move-result p1

    iget v2, p0, Lku/d1;->c:I

    invoke-static {v2}, Lku/e1;->b(I)Z

    move-result v2

    if-ne p1, v2, :cond_2

    check-cast v0, Lqu/i;

    iget-object p1, v0, Lqu/i;->d:Lku/l0;

    invoke-virtual {v0}, Lqu/i;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {p1, v0}, Lqu/j;->d(Lku/l0;Lkotlin/coroutines/CoroutineContext;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, v0, p0}, Lqu/j;->c(Lku/l0;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-static {p0}, Lku/e1;->e(Lku/d1;)V

    return-void

    :cond_2
    invoke-static {p0, v0, v1}, Lku/e1;->d(Lku/d1;Lnt/b;Z)V

    return-void
.end method

.method public static final b(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method public static final c(I)Z
    .locals 1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final d(Lku/d1;Lnt/b;Z)V
    .locals 3
    .param p0    # Lku/d1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lku/d1<",
            "-TT;>;",
            "Lnt/b<",
            "-TT;>;Z)V"
        }
    .end annotation

    invoke-virtual {p0}, Lku/d1;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lku/d1;->g(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object p0, Ljt/n;->b:Ljt/n$a;

    invoke-static {v1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_0
    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-virtual {p0, v0}, Lku/d1;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :goto_1
    if-eqz p2, :cond_6

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lqu/i;

    iget-object p2, p1, Lqu/i;->e:Lnt/b;

    iget-object v0, p1, Lqu/i;->g:Ljava/lang/Object;

    invoke-interface {p2}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    invoke-static {v1, v0}, Lqu/l0;->i(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lqu/l0;->a:Lqu/e0;

    if-eq v0, v2, :cond_1

    invoke-static {p2, v1, v0}, Lku/j0;->m(Lnt/b;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lku/i3;

    move-result-object p2

    goto :goto_2

    :cond_1
    const/4 p2, 0x0

    :goto_2
    :try_start_0
    iget-object p1, p1, Lqu/i;->e:Lnt/b;

    invoke-interface {p1, p0}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lku/i3;->Y0()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_3

    :cond_2
    return-void

    :cond_3
    :goto_3
    invoke-static {v1, v0}, Lqu/l0;->f(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lku/i3;->Y0()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    invoke-static {v1, v0}, Lqu/l0;->f(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    :cond_5
    throw p0

    :cond_6
    invoke-interface {p1, p0}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Lku/d1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/d1<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lku/c3;->a:Lku/c3;

    invoke-virtual {v0}, Lku/c3;->b()Lku/m1;

    move-result-object v0

    invoke-virtual {v0}, Lku/m1;->i0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, Lku/m1;->a0(Lku/d1;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lku/m1;->e0(Z)V

    :try_start_0
    invoke-virtual {p0}, Lku/d1;->c()Lnt/b;

    move-result-object v2

    invoke-static {p0, v2, v1}, Lku/e1;->d(Lku/d1;Lnt/b;Z)V

    :cond_1
    invoke-virtual {v0}, Lku/m1;->t0()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    :goto_0
    invoke-virtual {v0, v1}, Lku/m1;->X(Z)V

    goto :goto_1

    :catchall_0
    move-exception v2

    :try_start_1
    invoke-virtual {p0, v2}, Lku/d1;->i(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :goto_1
    return-void

    :catchall_1
    move-exception p0

    invoke-virtual {v0, v1}, Lku/m1;->X(Z)V

    throw p0
.end method
