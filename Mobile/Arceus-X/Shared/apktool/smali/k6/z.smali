.class public final Lk6/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001b\u0010\u0008\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Le7/u;",
        "logger",
        "Lku/p0;",
        "c",
        "(Le7/u;)Lku/p0;",
        "Lk6/h$a;",
        "Lk6/w$a;",
        "options",
        "f",
        "(Lk6/h$a;Lk6/w$a;)Lk6/h$a;",
        "e",
        "(Lk6/h$a;)Lk6/h$a;",
        "coil-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a()Ljava/util/List;
    .locals 1

    invoke-static {}, Lk6/z;->h()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ljava/util/List;
    .locals 1

    invoke-static {}, Lk6/z;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Le7/u;)Lku/p0;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v0

    sget-object v1, Lku/m0;->Lo:Lku/m0$a;

    new-instance v2, Lk6/z$a;

    invoke-direct {v2, v1, p0}, Lk6/z$a;-><init>(Lku/m0$a;Le7/u;)V

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    invoke-static {p0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Le7/u;)Lku/p0;
    .locals 0

    invoke-static {p0}, Lk6/z;->c(Le7/u;)Lku/p0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lk6/h$a;)Lk6/h$a;
    .locals 3
    .param p0    # Lk6/h$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lr6/f;

    invoke-direct {v0}, Lr6/f;-><init>()V

    const-class v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lk6/h$a;->k(Lr6/c;Lhu/c;)Lk6/h$a;

    move-result-object p0

    new-instance v0, Lr6/d;

    invoke-direct {v0}, Lr6/d;-><init>()V

    const-class v1, Lxu/h0;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lk6/h$a;->k(Lr6/c;Lhu/c;)Lk6/h$a;

    move-result-object p0

    new-instance v0, Lq6/b;

    invoke-direct {v0}, Lq6/b;-><init>()V

    const-class v1, Lk6/h0;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lk6/h$a;->j(Lq6/c;Lhu/c;)Lk6/h$a;

    move-result-object p0

    new-instance v0, Lq6/d;

    invoke-direct {v0}, Lq6/d;-><init>()V

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lk6/h$a;->j(Lq6/c;Lhu/c;)Lk6/h$a;

    move-result-object p0

    new-instance v0, Lo6/k$a;

    invoke-direct {v0}, Lo6/k$a;-><init>()V

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lk6/h$a;->h(Lo6/j$a;Lhu/c;)Lk6/h$a;

    move-result-object p0

    new-instance v0, Lo6/c$a;

    invoke-direct {v0}, Lo6/c$a;-><init>()V

    const-class v2, [B

    invoke-static {v2}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lk6/h$a;->h(Lo6/j$a;Lhu/c;)Lk6/h$a;

    move-result-object p0

    new-instance v0, Lo6/g$b;

    invoke-direct {v0}, Lo6/g$b;-><init>()V

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lk6/h$a;->h(Lo6/j$a;Lhu/c;)Lk6/h$a;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lk6/h$a;Lk6/w$a;)Lk6/h$a;
    .locals 0
    .param p0    # Lk6/h$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lk6/w$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1}, Lk6/t;->a(Lk6/w$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lk6/x;

    invoke-direct {p1}, Lk6/x;-><init>()V

    invoke-virtual {p0, p1}, Lk6/h$a;->o(Lkotlin/jvm/functions/Function0;)Lk6/h$a;

    new-instance p1, Lk6/y;

    invoke-direct {p1}, Lk6/y;-><init>()V

    invoke-virtual {p0, p1}, Lk6/h$a;->n(Lkotlin/jvm/functions/Function0;)Lk6/h$a;

    :cond_0
    return-object p0
.end method

.method public static final g()Ljava/util/List;
    .locals 7

    sget-object v0, Le7/c0;->a:Le7/c0;

    invoke-virtual {v0}, Le7/c0;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Lk6/z$b;

    invoke-direct {v1}, Lk6/z$b;-><init>()V

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->F0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le7/j;

    const-string v5, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4}, Le7/j;->a()Lo6/j$a;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v4}, Le7/j;->type()Lhu/c;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v5, v4}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    :goto_1
    if-eqz v6, :cond_2

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static final h()Ljava/util/List;
    .locals 5

    sget-object v0, Le7/c0;->a:Le7/c0;

    invoke-virtual {v0}, Le7/c0;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Lk6/z$c;

    invoke-direct {v1}, Lk6/z$c;-><init>()V

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->F0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le7/g;

    invoke-interface {v4}, Le7/g;->a()Lm6/i$a;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method
