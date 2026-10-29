.class public final synthetic Lnu/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0008\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\"\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u0003\u00a8\u0006\u000c"
    }
    d2 = {
        "T",
        "Lnu/h;",
        "b",
        "(Lnu/h;Lnt/b;)Ljava/lang/Object;",
        "Lkotlin/Function2;",
        "Lnt/b;",
        "",
        "",
        "predicate",
        "a",
        "(Lnu/h;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;",
        "c",
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
.method public static final a(Lnu/h;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .param p0    # Lnu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnu/h<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lnu/y$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lnu/y$d;

    iget v1, v0, Lnu/y$d;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnu/y$d;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnu/y$d;

    invoke-direct {v0, p2}, Lnu/y$d;-><init>(Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lnu/y$d;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnu/y$d;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lnu/y$d;->u:Ljava/lang/Object;

    check-cast p0, Lnu/y$b;

    iget-object p1, v0, Lnu/y$d;->t:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/c0;

    :try_start_0
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lou/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/c0;

    invoke-direct {p2}, Lkotlin/jvm/internal/c0;-><init>()V

    sget-object v2, Lou/t;->a:Lqu/e0;

    iput-object v2, p2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    new-instance v2, Lnu/y$b;

    invoke-direct {v2, p1, p2}, Lnu/y$b;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/c0;)V

    :try_start_1
    iput-object p2, v0, Lnu/y$d;->t:Ljava/lang/Object;

    iput-object v2, v0, Lnu/y$d;->u:Ljava/lang/Object;

    iput v3, v0, Lnu/y$d;->w:I

    invoke-interface {p0, v2, v0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lou/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    goto :goto_2

    :catch_1
    move-exception p0

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_1
    invoke-static {p2, p0}, Lou/p;->a(Lou/a;Ljava/lang/Object;)V

    invoke-interface {v0}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    invoke-static {p0}, Lku/g2;->f(Lkotlin/coroutines/CoroutineContext;)V

    :goto_2
    iget-object p0, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    sget-object p1, Lou/t;->a:Lqu/e0;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element matching the predicate"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lnu/h;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .param p0    # Lnu/h;
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
            "Lnu/h<",
            "+TT;>;",
            "Lnt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lnu/y$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lnu/y$c;

    iget v1, v0, Lnu/y$c;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnu/y$c;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnu/y$c;

    invoke-direct {v0, p1}, Lnu/y$c;-><init>(Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lnu/y$c;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnu/y$c;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lnu/y$c;->u:Ljava/lang/Object;

    check-cast p0, Lnu/y$a;

    iget-object v1, v0, Lnu/y$c;->t:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/c0;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lou/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/c0;

    invoke-direct {p1}, Lkotlin/jvm/internal/c0;-><init>()V

    sget-object v2, Lou/t;->a:Lqu/e0;

    iput-object v2, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    new-instance v2, Lnu/y$a;

    invoke-direct {v2, p1}, Lnu/y$a;-><init>(Lkotlin/jvm/internal/c0;)V

    :try_start_1
    iput-object p1, v0, Lnu/y$c;->t:Ljava/lang/Object;

    iput-object v2, v0, Lnu/y$c;->u:Ljava/lang/Object;

    iput v3, v0, Lnu/y$c;->w:I

    invoke-interface {p0, v2, v0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lou/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v1, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    invoke-static {p1, p0}, Lou/p;->a(Lou/a;Ljava/lang/Object;)V

    invoke-interface {v0}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    invoke-static {p0}, Lku/g2;->f(Lkotlin/coroutines/CoroutineContext;)V

    :goto_2
    iget-object p0, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    sget-object p1, Lou/t;->a:Lqu/e0;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Lnu/h;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .param p0    # Lnu/h;
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
            "Lnu/h<",
            "+TT;>;",
            "Lnt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lnu/y$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lnu/y$f;

    iget v1, v0, Lnu/y$f;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnu/y$f;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnu/y$f;

    invoke-direct {v0, p1}, Lnu/y$f;-><init>(Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lnu/y$f;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnu/y$f;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lnu/y$f;->u:Ljava/lang/Object;

    check-cast p0, Lnu/y$e;

    iget-object v1, v0, Lnu/y$f;->t:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/c0;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lou/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/c0;

    invoke-direct {p1}, Lkotlin/jvm/internal/c0;-><init>()V

    new-instance v2, Lnu/y$e;

    invoke-direct {v2, p1}, Lnu/y$e;-><init>(Lkotlin/jvm/internal/c0;)V

    :try_start_1
    iput-object p1, v0, Lnu/y$f;->t:Ljava/lang/Object;

    iput-object v2, v0, Lnu/y$f;->u:Ljava/lang/Object;

    iput v3, v0, Lnu/y$f;->w:I

    invoke-interface {p0, v2, v0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lou/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v1, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    invoke-static {p1, p0}, Lou/p;->a(Lou/a;Ljava/lang/Object;)V

    invoke-interface {v0}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    invoke-static {p0}, Lku/g2;->f(Lkotlin/coroutines/CoroutineContext;)V

    :goto_2
    iget-object p0, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    return-object p0
.end method
