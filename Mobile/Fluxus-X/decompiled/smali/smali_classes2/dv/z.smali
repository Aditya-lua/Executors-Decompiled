.class public final synthetic Ldv/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a=\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u001a-\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a#\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "T",
        "Ldv/h;",
        "Lav/p0;",
        "scope",
        "Ldv/m0;",
        "started",
        "",
        "replay",
        "Ldv/g0;",
        "d",
        "(Ldv/h;Lav/p0;Ldv/m0;I)Ldv/g0;",
        "Ldv/l0;",
        "b",
        "(Ldv/h;I)Ldv/l0;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "upstream",
        "Ldv/b0;",
        "shared",
        "initialValue",
        "Lav/d2;",
        "c",
        "(Lav/p0;Lkotlin/coroutines/CoroutineContext;Ldv/h;Ldv/b0;Ldv/m0;Ljava/lang/Object;)Lav/d2;",
        "Ldv/p0;",
        "f",
        "(Ldv/h;Lav/p0;Ldv/m0;Ljava/lang/Object;)Ldv/p0;",
        "Ldv/c0;",
        "a",
        "(Ldv/c0;)Ldv/p0;",
        "kotlinx-coroutines-core"
    }
    k = 0x5
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
    xs = "kotlinx/coroutines/flow/FlowKt"
.end annotation


# direct methods
.method public static final a(Ldv/c0;)Ldv/p0;
    .locals 2
    .param p0    # Ldv/c0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldv/c0<",
            "TT;>;)",
            "Ldv/p0<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ldv/e0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldv/e0;-><init>(Ldv/p0;Lav/d2;)V

    return-object v0
.end method

.method public static final b(Ldv/h;I)Ldv/l0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldv/h<",
            "+TT;>;I)",
            "Ldv/l0<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcv/g;->Mo:Lcv/g$b;

    invoke-virtual {v0}, Lcv/g$b;->a()I

    move-result v0

    invoke-static {p1, v0}, Lkotlin/ranges/d;->c(II)I

    move-result v0

    sub-int/2addr v0, p1

    instance-of v1, p0, Lev/e;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, Lev/e;

    invoke-virtual {v1}, Lev/e;->i()Ldv/h;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance p0, Ldv/l0;

    iget v3, v1, Lev/e;->b:I

    const/4 v4, -0x3

    if-eq v3, v4, :cond_0

    const/4 v4, -0x2

    if-eq v3, v4, :cond_0

    if-eqz v3, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    iget-object v4, v1, Lev/e;->c:Lcv/a;

    sget-object v5, Lcv/a;->a:Lcv/a;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_2

    if-nez v3, :cond_3

    :cond_1
    move v0, v6

    goto :goto_0

    :cond_2
    if-nez p1, :cond_1

    const/4 v0, 0x1

    :cond_3
    :goto_0
    iget-object p1, v1, Lev/e;->c:Lcv/a;

    iget-object v1, v1, Lev/e;->a:Lkotlin/coroutines/CoroutineContext;

    invoke-direct {p0, v2, v0, p1, v1}, Ldv/l0;-><init>(Ldv/h;ILcv/a;Lkotlin/coroutines/CoroutineContext;)V

    return-object p0

    :cond_4
    new-instance p1, Ldv/l0;

    sget-object v1, Lcv/a;->a:Lcv/a;

    sget-object v2, Lkotlin/coroutines/e;->a:Lkotlin/coroutines/e;

    invoke-direct {p1, p0, v0, v1, v2}, Ldv/l0;-><init>(Ldv/h;ILcv/a;Lkotlin/coroutines/CoroutineContext;)V

    return-object p1
.end method

.method public static final c(Lav/p0;Lkotlin/coroutines/CoroutineContext;Ldv/h;Ldv/b0;Ldv/m0;Ljava/lang/Object;)Lav/d2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lav/p0;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ldv/h<",
            "+TT;>;",
            "Ldv/b0<",
            "TT;>;",
            "Ldv/m0;",
            "TT;)",
            "Lav/d2;"
        }
    .end annotation

    sget-object v0, Ldv/m0;->a:Ldv/m0$a;

    invoke-virtual {v0}, Ldv/m0$a;->a()Ldv/m0;

    move-result-object v0

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lav/r0;->a:Lav/r0;

    goto :goto_0

    :cond_0
    sget-object v0, Lav/r0;->d:Lav/r0;

    :goto_0
    new-instance v1, Ldv/z$a;

    const/4 v6, 0x0

    move-object v3, p2

    move-object v4, p3

    move-object v2, p4

    move-object v5, p5

    invoke-direct/range {v1 .. v6}, Ldv/z$a;-><init>(Ldv/m0;Ldv/h;Ldv/b0;Ljava/lang/Object;Leu/b;)V

    invoke-static {p0, p1, v0, v1}, Lav/i;->c(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;)Lav/d2;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ldv/h;Lav/p0;Ldv/m0;I)Ldv/g0;
    .locals 8
    .param p0    # Ldv/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ldv/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldv/h<",
            "+TT;>;",
            "Lav/p0;",
            "Ldv/m0;",
            "I)",
            "Ldv/g0<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0, p3}, Ldv/z;->b(Ldv/h;I)Ldv/l0;

    move-result-object p0

    iget v0, p0, Ldv/l0;->b:I

    iget-object v1, p0, Ldv/l0;->c:Lcv/a;

    invoke-static {p3, v0, v1}, Ldv/i0;->a(IILcv/a;)Ldv/b0;

    move-result-object v5

    iget-object v3, p0, Ldv/l0;->d:Lkotlin/coroutines/CoroutineContext;

    iget-object v4, p0, Ldv/l0;->a:Ldv/h;

    sget-object v7, Ldv/i0;->a:Lgv/e0;

    move-object v2, p1

    move-object v6, p2

    invoke-static/range {v2 .. v7}, Ldv/z;->c(Lav/p0;Lkotlin/coroutines/CoroutineContext;Ldv/h;Ldv/b0;Ldv/m0;Ljava/lang/Object;)Lav/d2;

    move-result-object p0

    new-instance p1, Ldv/d0;

    invoke-direct {p1, v5, p0}, Ldv/d0;-><init>(Ldv/g0;Lav/d2;)V

    return-object p1
.end method

.method public static synthetic e(Ldv/h;Lav/p0;Ldv/m0;IILjava/lang/Object;)Ldv/g0;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Ldv/j;->K(Ldv/h;Lav/p0;Ldv/m0;I)Ldv/g0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ldv/h;Lav/p0;Ldv/m0;Ljava/lang/Object;)Ldv/p0;
    .locals 6
    .param p0    # Ldv/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ldv/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldv/h<",
            "+TT;>;",
            "Lav/p0;",
            "Ldv/m0;",
            "TT;)",
            "Ldv/p0<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, v0}, Ldv/z;->b(Ldv/h;I)Ldv/l0;

    move-result-object p0

    invoke-static {p3}, Ldv/r0;->a(Ljava/lang/Object;)Ldv/c0;

    move-result-object v3

    iget-object v1, p0, Ldv/l0;->d:Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, Ldv/l0;->a:Ldv/h;

    move-object v0, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ldv/z;->c(Lav/p0;Lkotlin/coroutines/CoroutineContext;Ldv/h;Ldv/b0;Ldv/m0;Ljava/lang/Object;)Lav/d2;

    move-result-object p0

    new-instance p1, Ldv/e0;

    invoke-direct {p1, v3, p0}, Ldv/e0;-><init>(Ldv/p0;Lav/d2;)V

    return-object p1
.end method
