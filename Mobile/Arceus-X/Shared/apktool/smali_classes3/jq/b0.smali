.class public final Ljq/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a<\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0006\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "maxAttempts",
        "Lkotlin/Function2;",
        "Lnt/b;",
        "",
        "",
        "block",
        "",
        "a",
        "(ILkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;",
        "shared_release"
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
.method public static final a(ILkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;
    .locals 5
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
            "(I",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
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

    instance-of v0, p2, Ljq/b0$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljq/b0$a;

    iget v1, v0, Ljq/b0$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljq/b0$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljq/b0$a;

    invoke-direct {v0, p2}, Ljq/b0$a;-><init>(Lnt/b;)V

    :goto_0
    iget-object p2, v0, Ljq/b0$a;->w:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ljq/b0$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Ljq/b0$a;->u:I

    iget p1, v0, Ljq/b0$a;->t:I

    iget-object v2, v0, Ljq/b0$a;->v:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function2;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    const/4 p2, 0x0

    move-object v4, p1

    move p1, p0

    move p0, p2

    move-object p2, v4

    :goto_1
    if-ge p0, p1, :cond_5

    invoke-static {p0}, Lpt/b;->d(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object p2, v0, Ljq/b0$a;->v:Ljava/lang/Object;

    iput p1, v0, Ljq/b0$a;->t:I

    iput p0, v0, Ljq/b0$a;->u:I

    iput v3, v0, Ljq/b0$a;->x:I

    invoke-interface {p2, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, v2

    move-object v2, p2

    move-object p2, v4

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_3

    :cond_4
    add-int/2addr p0, v3

    move-object p2, v2

    goto :goto_1

    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
