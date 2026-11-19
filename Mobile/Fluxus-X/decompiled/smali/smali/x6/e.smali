.class public final Lx6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0082@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0082@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u000c*\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lu6/o;",
        "Lmv/f0;",
        "h",
        "(Lu6/o;Leu/b;)Ljava/lang/Object;",
        "Lu6/p;",
        "Lew/h;",
        "d",
        "(Lu6/p;Leu/b;)Ljava/lang/Object;",
        "Lmv/h0;",
        "Lu6/q;",
        "g",
        "(Lmv/h0;)Lu6/q;",
        "Lu6/n;",
        "Lmv/y;",
        "e",
        "(Lu6/n;)Lmv/y;",
        "f",
        "(Lmv/y;)Lu6/n;",
        "coil-network-okhttp"
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
.method public static final synthetic a(Lu6/p;Leu/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lx6/e;->d(Lu6/p;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lmv/h0;)Lu6/q;
    .locals 0

    invoke-static {p0}, Lx6/e;->g(Lmv/h0;)Lu6/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lu6/o;Leu/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lx6/e;->h(Lu6/o;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lu6/p;Leu/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu6/p;",
            "Leu/b<",
            "-",
            "Lew/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lx6/e$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lx6/e$a;

    iget v1, v0, Lx6/e$a;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/e$a;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx6/e$a;

    invoke-direct {v0, p1}, Lx6/e$a;-><init>(Leu/b;)V

    :goto_0
    iget-object p1, v0, Lx6/e$a;->v:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx6/e$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lx6/e$a;->u:Ljava/lang/Object;

    check-cast p0, Lew/e;

    iget-object v0, v0, Lx6/e$a;->t:Ljava/lang/Object;

    check-cast v0, Lu6/p;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lew/e;

    invoke-direct {p1}, Lew/e;-><init>()V

    invoke-static {p0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lx6/e$a;->t:Ljava/lang/Object;

    iput-object p1, v0, Lx6/e$a;->u:Ljava/lang/Object;

    iput v3, v0, Lx6/e$a;->w:I

    invoke-interface {p0, p1, v0}, Lu6/p;->D(Lew/f;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p1

    :goto_1
    invoke-virtual {p0}, Lew/e;->J2()Lew/h;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lu6/n;)Lmv/y;
    .locals 4

    new-instance v0, Lmv/y$a;

    invoke-direct {v0}, Lmv/y$a;-><init>()V

    invoke-virtual {p0}, Lu6/n;->b()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lmv/y$a;->e(Ljava/lang/String;Ljava/lang/String;)Lmv/y$a;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lmv/y$a;->f()Lmv/y;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lmv/y;)Lu6/n;
    .locals 3

    new-instance v0, Lu6/n$a;

    invoke-direct {v0}, Lu6/n$a;-><init>()V

    invoke-virtual {p0}, Lmv/y;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lu6/n$a;->a(Ljava/lang/String;Ljava/lang/String;)Lu6/n$a;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lu6/n$a;->b()Lu6/n;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lmv/h0;)Lu6/q;
    .locals 9

    invoke-virtual {p0}, Lmv/h0;->f()I

    move-result v1

    invoke-virtual {p0}, Lmv/h0;->A()J

    move-result-wide v2

    invoke-virtual {p0}, Lmv/h0;->y()J

    move-result-wide v4

    invoke-virtual {p0}, Lmv/h0;->o()Lmv/y;

    move-result-object v0

    invoke-static {v0}, Lx6/e;->f(Lmv/y;)Lu6/n;

    move-result-object v6

    invoke-virtual {p0}, Lmv/h0;->b()Lmv/i0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lmv/i0;->l3()Lew/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lu6/j;->a(Lew/g;)Lu6/r;

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    new-instance v0, Lu6/q;

    move-object v8, p0

    invoke-direct/range {v0 .. v8}, Lu6/q;-><init>(IJJLu6/n;Lu6/r;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final h(Lu6/o;Leu/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu6/o;",
            "Leu/b<",
            "-",
            "Lmv/f0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lx6/e$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lx6/e$b;

    iget v1, v0, Lx6/e$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/e$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx6/e$b;

    invoke-direct {v0, p1}, Lx6/e$b;-><init>(Leu/b;)V

    :goto_0
    iget-object p1, v0, Lx6/e$b;->x:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx6/e$b;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lx6/e$b;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    iget-object v1, v0, Lx6/e$b;->v:Ljava/lang/Object;

    check-cast v1, Lmv/f0$a;

    iget-object v2, v0, Lx6/e$b;->u:Ljava/lang/Object;

    check-cast v2, Lmv/f0$a;

    iget-object v0, v0, Lx6/e$b;->t:Ljava/lang/Object;

    check-cast v0, Lu6/o;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lmv/f0$a;

    invoke-direct {p1}, Lmv/f0$a;-><init>()V

    invoke-virtual {p0}, Lu6/o;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lmv/f0$a;->t(Ljava/lang/String;)Lmv/f0$a;

    invoke-virtual {p0}, Lu6/o;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lu6/o;->a()Lu6/p;

    move-result-object v5

    if-eqz v5, :cond_5

    iput-object p0, v0, Lx6/e$b;->t:Ljava/lang/Object;

    iput-object p1, v0, Lx6/e$b;->u:Ljava/lang/Object;

    iput-object p1, v0, Lx6/e$b;->v:Ljava/lang/Object;

    iput-object v2, v0, Lx6/e$b;->w:Ljava/lang/Object;

    iput v4, v0, Lx6/e$b;->y:I

    invoke-static {v5, v0}, Lx6/e;->d(Lu6/p;Leu/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    move-object p1, v0

    move-object v0, p0

    move-object p0, v2

    move-object v2, v1

    :goto_1
    check-cast p1, Lew/h;

    if-eqz p1, :cond_4

    sget-object v5, Lmv/g0;->a:Lmv/g0$a;

    invoke-static {v5, p1, v3, v4, v3}, Lmv/g0$a;->i(Lmv/g0$a;Lew/h;Lmv/b0;ILjava/lang/Object;)Lmv/g0;

    move-result-object v3

    goto :goto_3

    :cond_4
    move-object p1, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v1

    goto :goto_2

    :cond_5
    move-object v0, v2

    move-object v2, p1

    :goto_2
    move-object v1, v0

    move-object v0, p0

    move-object p0, v1

    move-object v1, p1

    :goto_3
    invoke-virtual {v1, p0, v3}, Lmv/f0$a;->o(Ljava/lang/String;Lmv/g0;)Lmv/f0$a;

    invoke-virtual {v0}, Lu6/o;->b()Lu6/n;

    move-result-object p0

    invoke-static {p0}, Lx6/e;->e(Lu6/n;)Lmv/y;

    move-result-object p0

    invoke-virtual {v2, p0}, Lmv/f0$a;->n(Lmv/y;)Lmv/f0$a;

    invoke-virtual {v2}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object p0

    return-object p0
.end method
