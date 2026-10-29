.class public final Lw6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0082@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0082@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u000c*\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lt6/o;",
        "Lokhttp3/Request;",
        "h",
        "(Lt6/o;Lnt/b;)Ljava/lang/Object;",
        "Lt6/p;",
        "Lxu/h;",
        "d",
        "(Lt6/p;Lnt/b;)Ljava/lang/Object;",
        "Lokhttp3/Response;",
        "Lt6/q;",
        "g",
        "(Lokhttp3/Response;)Lt6/q;",
        "Lt6/n;",
        "Lokhttp3/Headers;",
        "e",
        "(Lt6/n;)Lokhttp3/Headers;",
        "f",
        "(Lokhttp3/Headers;)Lt6/n;",
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
.method public static final synthetic a(Lt6/p;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw6/e;->d(Lt6/p;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lokhttp3/Response;)Lt6/q;
    .locals 0

    invoke-static {p0}, Lw6/e;->g(Lokhttp3/Response;)Lt6/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lt6/o;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw6/e;->h(Lt6/o;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lt6/p;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/p;",
            "Lnt/b<",
            "-",
            "Lxu/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lw6/e$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw6/e$a;

    iget v1, v0, Lw6/e$a;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw6/e$a;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw6/e$a;

    invoke-direct {v0, p1}, Lw6/e$a;-><init>(Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lw6/e$a;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw6/e$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lw6/e$a;->u:Ljava/lang/Object;

    check-cast p0, Lxu/e;

    iget-object v0, v0, Lw6/e$a;->t:Ljava/lang/Object;

    check-cast v0, Lt6/p;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lxu/e;

    invoke-direct {p1}, Lxu/e;-><init>()V

    invoke-static {p0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lw6/e$a;->t:Ljava/lang/Object;

    iput-object p1, v0, Lw6/e$a;->u:Ljava/lang/Object;

    iput v3, v0, Lw6/e$a;->w:I

    invoke-interface {p0, p1, v0}, Lt6/p;->x(Lxu/f;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p1

    :goto_1
    invoke-virtual {p0}, Lxu/e;->F2()Lxu/h;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lt6/n;)Lokhttp3/Headers;
    .locals 4

    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    invoke-virtual {p0}, Lt6/n;->b()Ljava/util/Map;

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

    invoke-virtual {v0, v2, v3}, Lokhttp3/Headers$Builder;->addUnsafeNonAscii(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lokhttp3/Headers;)Lt6/n;
    .locals 3

    new-instance v0, Lt6/n$a;

    invoke-direct {v0}, Lt6/n$a;-><init>()V

    invoke-virtual {p0}, Lokhttp3/Headers;->iterator()Ljava/util/Iterator;

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

    invoke-virtual {v0, v2, v1}, Lt6/n$a;->a(Ljava/lang/String;Ljava/lang/String;)Lt6/n$a;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lt6/n$a;->b()Lt6/n;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lokhttp3/Response;)Lt6/q;
    .locals 9

    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    move-result v1

    invoke-virtual {p0}, Lokhttp3/Response;->sentRequestAtMillis()J

    move-result-wide v2

    invoke-virtual {p0}, Lokhttp3/Response;->receivedResponseAtMillis()J

    move-result-wide v4

    invoke-virtual {p0}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    invoke-static {v0}, Lw6/e;->f(Lokhttp3/Headers;)Lt6/n;

    move-result-object v6

    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lxu/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lt6/j;->a(Lxu/g;)Lt6/r;

    move-result-object v0

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    new-instance v0, Lt6/q;

    move-object v8, p0

    invoke-direct/range {v0 .. v8}, Lt6/q;-><init>(IJJLt6/n;Lt6/r;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final h(Lt6/o;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/o;",
            "Lnt/b<",
            "-",
            "Lokhttp3/Request;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lw6/e$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw6/e$b;

    iget v1, v0, Lw6/e$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw6/e$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw6/e$b;

    invoke-direct {v0, p1}, Lw6/e$b;-><init>(Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lw6/e$b;->x:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw6/e$b;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lw6/e$b;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    iget-object v1, v0, Lw6/e$b;->v:Ljava/lang/Object;

    check-cast v1, Lokhttp3/Request$Builder;

    iget-object v2, v0, Lw6/e$b;->u:Ljava/lang/Object;

    check-cast v2, Lokhttp3/Request$Builder;

    iget-object v0, v0, Lw6/e$b;->t:Ljava/lang/Object;

    check-cast v0, Lt6/o;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lokhttp3/Request$Builder;

    invoke-direct {p1}, Lokhttp3/Request$Builder;-><init>()V

    invoke-virtual {p0}, Lt6/o;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    invoke-virtual {p0}, Lt6/o;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lt6/o;->a()Lt6/p;

    move-result-object v5

    if-eqz v5, :cond_5

    iput-object p0, v0, Lw6/e$b;->t:Ljava/lang/Object;

    iput-object p1, v0, Lw6/e$b;->u:Ljava/lang/Object;

    iput-object p1, v0, Lw6/e$b;->v:Ljava/lang/Object;

    iput-object v2, v0, Lw6/e$b;->w:Ljava/lang/Object;

    iput v4, v0, Lw6/e$b;->y:I

    invoke-static {v5, v0}, Lw6/e;->d(Lt6/p;Lnt/b;)Ljava/lang/Object;

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
    check-cast p1, Lxu/h;

    if-eqz p1, :cond_4

    sget-object v5, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    invoke-static {v5, p1, v3, v4, v3}, Lokhttp3/RequestBody$Companion;->create$default(Lokhttp3/RequestBody$Companion;Lxu/h;Lokhttp3/MediaType;ILjava/lang/Object;)Lokhttp3/RequestBody;

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
    invoke-virtual {v1, p0, v3}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    invoke-virtual {v0}, Lt6/o;->b()Lt6/n;

    move-result-object p0

    invoke-static {p0}, Lw6/e;->e(Lt6/n;)Lokhttp3/Headers;

    move-result-object p0

    invoke-virtual {v2, p0}, Lokhttp3/Request$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Request$Builder;

    invoke-virtual {v2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p0

    return-object p0
.end method
