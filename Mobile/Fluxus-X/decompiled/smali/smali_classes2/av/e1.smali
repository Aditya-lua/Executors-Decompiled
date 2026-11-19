.class public final Lav/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u001a\'\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\u0008\u00030\u0001H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "T",
        "Lav/d1;",
        "",
        "mode",
        "",
        "a",
        "(Lav/d1;I)V",
        "Leu/b;",
        "delegate",
        "",
        "undispatched",
        "d",
        "(Lav/d1;Leu/b;Z)V",
        "e",
        "(Lav/d1;)V",
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
.method public static final a(Lav/d1;I)V
    .locals 3
    .param p0    # Lav/d1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lav/d1<",
            "-TT;>;I)V"
        }
    .end annotation

    invoke-virtual {p0}, Lav/d1;->e()Leu/b;

    move-result-object v0

    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    instance-of v2, v0, Lgv/i;

    if-eqz v2, :cond_2

    invoke-static {p1}, Lav/e1;->b(I)Z

    move-result p1

    iget v2, p0, Lav/d1;->c:I

    invoke-static {v2}, Lav/e1;->b(I)Z

    move-result v2

    if-ne p1, v2, :cond_2

    check-cast v0, Lgv/i;

    iget-object p1, v0, Lgv/i;->d:Lav/l0;

    invoke-virtual {v0}, Lgv/i;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {p1, v0}, Lgv/j;->d(Lav/l0;Lkotlin/coroutines/CoroutineContext;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, v0, p0}, Lgv/j;->c(Lav/l0;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-static {p0}, Lav/e1;->e(Lav/d1;)V

    return-void

    :cond_2
    invoke-static {p0, v0, v1}, Lav/e1;->d(Lav/d1;Leu/b;Z)V

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

.method public static final d(Lav/d1;Leu/b;Z)V
    .locals 3
    .param p0    # Lav/d1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lav/d1<",
            "-TT;>;",
            "Leu/b<",
            "-TT;>;Z)V"
        }
    .end annotation

    invoke-virtual {p0}, Lav/d1;->k()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lav/d1;->f(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object p0, Lzt/n;->b:Lzt/n$a;

    invoke-static {v1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_0
    sget-object v1, Lzt/n;->b:Lzt/n$a;

    invoke-virtual {p0, v0}, Lav/d1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :goto_1
    if-eqz p2, :cond_6

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lgv/i;

    iget-object p2, p1, Lgv/i;->e:Leu/b;

    iget-object v0, p1, Lgv/i;->g:Ljava/lang/Object;

    invoke-interface {p2}, Leu/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    invoke-static {v1, v0}, Lgv/l0;->i(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lgv/l0;->a:Lgv/e0;

    if-eq v0, v2, :cond_1

    invoke-static {p2, v1, v0}, Lav/j0;->m(Leu/b;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lav/i3;

    move-result-object p2

    goto :goto_2

    :cond_1
    const/4 p2, 0x0

    :goto_2
    :try_start_0
    iget-object p1, p1, Lgv/i;->e:Leu/b;

    invoke-interface {p1, p0}, Leu/b;->resumeWith(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lav/i3;->Y0()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_3

    :cond_2
    return-void

    :cond_3
    :goto_3
    invoke-static {v1, v0}, Lgv/l0;->f(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lav/i3;->Y0()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    invoke-static {v1, v0}, Lgv/l0;->f(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    :cond_5
    throw p0

    :cond_6
    invoke-interface {p1, p0}, Leu/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Lav/d1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/d1<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lav/c3;->a:Lav/c3;

    invoke-virtual {v0}, Lav/c3;->b()Lav/m1;

    move-result-object v0

    invoke-virtual {v0}, Lav/m1;->i0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, Lav/m1;->d0(Lav/d1;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lav/m1;->f0(Z)V

    :try_start_0
    invoke-virtual {p0}, Lav/d1;->e()Leu/b;

    move-result-object v2

    invoke-static {p0, v2, v1}, Lav/e1;->d(Lav/d1;Leu/b;Z)V

    :cond_1
    invoke-virtual {v0}, Lav/m1;->s0()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    :goto_0
    invoke-virtual {v0, v1}, Lav/m1;->Y(Z)V

    goto :goto_1

    :catchall_0
    move-exception v2

    :try_start_1
    invoke-virtual {p0, v2}, Lav/d1;->h(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :goto_1
    return-void

    :catchall_1
    move-exception p0

    invoke-virtual {v0, v1}, Lav/m1;->Y(Z)V

    throw p0
.end method
