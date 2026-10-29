.class public final Le7/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/lifecycle/l;",
        "",
        "a",
        "(Landroidx/lifecycle/l;Lnt/b;)Ljava/lang/Object;",
        "Landroidx/lifecycle/r;",
        "observer",
        "b",
        "(Landroidx/lifecycle/l;Landroidx/lifecycle/r;)V",
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
.method public static final a(Landroidx/lifecycle/l;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .param p0    # Landroidx/lifecycle/l;
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
            "Landroidx/lifecycle/l;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Le7/s$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le7/s$a;

    iget v1, v0, Le7/s$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/s$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/s$a;

    invoke-direct {v0, p1}, Le7/s$a;-><init>(Lnt/b;)V

    :goto_0
    iget-object p1, v0, Le7/s$a;->w:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Le7/s$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Le7/s$a;->u:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/c0;

    iget-object v0, v0, Le7/s$a;->t:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/l;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object p1

    sget-object v2, Landroidx/lifecycle/l$b;->d:Landroidx/lifecycle/l$b;

    invoke-virtual {p1, v2}, Landroidx/lifecycle/l$b;->b(Landroidx/lifecycle/l$b;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_3
    new-instance p1, Lkotlin/jvm/internal/c0;

    invoke-direct {p1}, Lkotlin/jvm/internal/c0;-><init>()V

    :try_start_1
    iput-object p0, v0, Le7/s$a;->t:Ljava/lang/Object;

    iput-object p1, v0, Le7/s$a;->u:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Le7/s$a;->v:I

    iput v3, v0, Le7/s$a;->x:I

    new-instance v2, Lku/p;

    invoke-static {v0}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v4

    invoke-direct {v2, v4, v3}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v2}, Lku/p;->H()V

    new-instance v3, Le7/s$b;

    invoke-direct {v3, v2}, Le7/s$b;-><init>(Lku/n;)V

    iput-object v3, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v3, Landroidx/lifecycle/r;

    invoke-virtual {p0, v3}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    invoke-virtual {v2}, Lku/p;->A()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_4

    invoke-static {v0}, Lpt/h;->c(Lnt/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v5, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v5

    goto :goto_3

    :cond_4
    :goto_1
    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v0, p0

    move-object p0, p1

    :goto_2
    iget-object p0, p0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p0, Landroidx/lifecycle/r;

    if-eqz p0, :cond_6

    invoke-virtual {v0, p0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :goto_3
    iget-object p0, p0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p0, Landroidx/lifecycle/r;

    if-eqz p0, :cond_7

    invoke-virtual {v0, p0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    :cond_7
    throw p1
.end method

.method public static final b(Landroidx/lifecycle/l;Landroidx/lifecycle/r;)V
    .locals 0
    .param p0    # Landroidx/lifecycle/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/lifecycle/r;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    return-void
.end method
