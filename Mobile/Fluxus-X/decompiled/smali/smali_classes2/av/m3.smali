.class public final Lav/m3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "",
        "a",
        "(Leu/b;)Ljava/lang/Object;",
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
.method public static final a(Leu/b;)Ljava/lang/Object;
    .locals 4
    .param p0    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-interface {p0}, Leu/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lav/g2;->i(Lkotlin/coroutines/CoroutineContext;)V

    invoke-static {p0}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v1

    instance-of v2, v1, Lgv/i;

    if-eqz v2, :cond_0

    check-cast v1, Lgv/i;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_2

    :cond_1
    iget-object v2, v1, Lgv/i;->d:Lav/l0;

    invoke-static {v2, v0}, Lgv/j;->d(Lav/l0;Lkotlin/coroutines/CoroutineContext;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {v1, v0, v2}, Lgv/i;->o(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance v2, Lav/l3;

    invoke-direct {v2}, Lav/l3;-><init>()V

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {v1, v0, v3}, Lgv/i;->o(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    iget-boolean v0, v2, Lav/l3;->b:Z

    if-eqz v0, :cond_4

    invoke-static {v1}, Lgv/j;->e(Lgv/i;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v3

    goto :goto_2

    :cond_4
    :goto_1
    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-static {p0}, Lgu/h;->c(Leu/b;)V

    :cond_5
    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p0

    if-ne v0, p0, :cond_6

    return-object v0

    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
