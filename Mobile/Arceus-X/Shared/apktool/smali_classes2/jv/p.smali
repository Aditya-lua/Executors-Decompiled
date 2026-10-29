.class public final Ljv/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\u0008\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\u0008\u0012\u0004\u0012\u00020\u00060\u0002H\u0087@\u00a2\u0006\u0004\u0008\u0007\u0010\u0004\u001a&\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\u0004\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\u0004\u001a\u0014\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0080@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "T",
        "Ljv/d;",
        "a",
        "(Ljv/d;Lnt/b;)Ljava/lang/Object;",
        "b",
        "",
        "d",
        "Ljv/x;",
        "c",
        "",
        "",
        "e",
        "(Ljava/lang/Throwable;Lnt/b;)Ljava/lang/Object;",
        "retrofit"
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
.method public static final a(Ljv/d;Lnt/b;)Ljava/lang/Object;
    .locals 3
    .param p0    # Ljv/d;
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
            "Ljv/d<",
            "TT;>;",
            "Lnt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lku/p;

    invoke-static {p1}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v0}, Lku/p;->H()V

    new-instance v1, Ljv/p$a;

    invoke-direct {v1, p0}, Ljv/p$a;-><init>(Ljv/d;)V

    invoke-interface {v0, v1}, Lku/n;->n(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Ljv/p$b;

    invoke-direct {v1, v0}, Ljv/p$b;-><init>(Lku/n;)V

    invoke-interface {p0, v1}, Ljv/d;->B(Ljv/f;)V

    invoke-virtual {v0}, Lku/p;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lpt/h;->c(Lnt/b;)V

    :cond_0
    return-object p0
.end method

.method public static final b(Ljv/d;Lnt/b;)Ljava/lang/Object;
    .locals 3
    .param p0    # Ljv/d;
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
            "Ljv/d<",
            "TT;>;",
            "Lnt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lku/p;

    invoke-static {p1}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v0}, Lku/p;->H()V

    new-instance v1, Ljv/p$c;

    invoke-direct {v1, p0}, Ljv/p$c;-><init>(Ljv/d;)V

    invoke-interface {v0, v1}, Lku/n;->n(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Ljv/p$d;

    invoke-direct {v1, v0}, Ljv/p$d;-><init>(Lku/n;)V

    invoke-interface {p0, v1}, Ljv/d;->B(Ljv/f;)V

    invoke-virtual {v0}, Lku/p;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lpt/h;->c(Lnt/b;)V

    :cond_0
    return-object p0
.end method

.method public static final c(Ljv/d;Lnt/b;)Ljava/lang/Object;
    .locals 3
    .param p0    # Ljv/d;
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
            "Ljv/d<",
            "TT;>;",
            "Lnt/b<",
            "-",
            "Ljv/x<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lku/p;

    invoke-static {p1}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v0}, Lku/p;->H()V

    new-instance v1, Ljv/p$e;

    invoke-direct {v1, p0}, Ljv/p$e;-><init>(Ljv/d;)V

    invoke-interface {v0, v1}, Lku/n;->n(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Ljv/p$f;

    invoke-direct {v1, v0}, Ljv/p$f;-><init>(Lku/n;)V

    invoke-interface {p0, v1}, Ljv/d;->B(Ljv/f;)V

    invoke-virtual {v0}, Lku/p;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lpt/h;->c(Lnt/b;)V

    :cond_0
    return-object p0
.end method

.method public static final d(Ljv/d;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "Lkotlin/Unit;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ljv/p;->b(Ljv/d;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/Throwable;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .param p0    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lnt/b<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Ljv/p$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljv/p$g;

    iget v1, v0, Ljv/p$g;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljv/p$g;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljv/p$g;

    invoke-direct {v0, p1}, Ljv/p$g;-><init>(Lnt/b;)V

    :goto_0
    iget-object p1, v0, Ljv/p$g;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ljv/p$g;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object p0, v0, Ljv/p$g;->t:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iput-object p0, v0, Ljv/p$g;->t:Ljava/lang/Object;

    iput v3, v0, Ljv/p$g;->v:I

    invoke-static {}, Lku/g1;->a()Lku/l0;

    move-result-object p1

    invoke-interface {v0}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    new-instance v3, Ljv/p$h;

    invoke-direct {v3, v0, p0}, Ljv/p$h;-><init>(Lnt/b;Ljava/lang/Throwable;)V

    invoke-virtual {p1, v2, v3}, Lku/l0;->w(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    invoke-static {v0}, Lpt/h;->c(Lnt/b;)V

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    new-instance p0, Ljt/d;

    invoke-direct {p0}, Ljt/d;-><init>()V

    throw p0
.end method
