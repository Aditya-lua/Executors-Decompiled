.class public final Loi/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a0\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\"\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "conversationId",
        "",
        "conversationGuid",
        "message",
        "Ljt/n;",
        "b",
        "(JLjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "",
        "a",
        "(JLjava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "NativeShell_googleProdRelease"
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
.method public static final a(JLjava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    new-instance v1, Loi/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p1, v2}, Loi/d$a;-><init>(Ljava/lang/String;JLnt/b;)V

    invoke-static {v0, v1, p3}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(JLjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 10
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p4, Loi/d$b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Loi/d$b;

    iget v1, v0, Loi/d$b;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Loi/d$b;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Loi/d$b;

    invoke-direct {v0, p4}, Loi/d$b;-><init>(Lnt/b;)V

    :goto_0
    iget-object p4, v0, Loi/d$b;->w:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Loi/d$b;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Loi/d$b;->v:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    iget-object p0, v0, Loi/d$b;->u:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {p4}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object p4

    new-instance v4, Loi/d$c;

    const/4 v9, 0x0

    move-wide v7, p0

    move-object v6, p2

    move-object v5, p3

    invoke-direct/range {v4 .. v9}, Loi/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;JLnt/b;)V

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iput-object p0, v0, Loi/d$b;->u:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iput-object p0, v0, Loi/d$b;->v:Ljava/lang/Object;

    iput-wide v7, v0, Loi/d$b;->t:J

    iput v3, v0, Loi/d$b;->x:I

    invoke-static {p4, v4, v0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ljt/n;

    invoke-virtual {p4}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
