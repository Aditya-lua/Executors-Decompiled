.class public final synthetic Lnu/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u001f\n\u0002\u0008\u0004\u001a6\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a:\u0010\t\u001a\u00028\u0001\"\u0004\u0008\u0000\u0010\u0000\"\u0010\u0008\u0001\u0010\u0008*\n\u0012\u0006\u0008\u0000\u0012\u00028\u00000\u0007*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "T",
        "Lnu/h;",
        "",
        "destination",
        "",
        "b",
        "(Lnu/h;Ljava/util/List;Lnt/b;)Ljava/lang/Object;",
        "",
        "C",
        "a",
        "(Lnu/h;Ljava/util/Collection;Lnt/b;)Ljava/lang/Object;",
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
.method public static final a(Lnu/h;Ljava/util/Collection;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .param p0    # Lnu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/Collection;
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
            "C::",
            "Ljava/util/Collection<",
            "-TT;>;>(",
            "Lnu/h<",
            "+TT;>;TC;",
            "Lnt/b<",
            "-TC;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lnu/n$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lnu/n$a;

    iget v1, v0, Lnu/n$a;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnu/n$a;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnu/n$a;

    invoke-direct {v0, p2}, Lnu/n$a;-><init>(Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lnu/n$a;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnu/n$a;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lnu/n$a;->t:Ljava/lang/Object;

    check-cast p0, Ljava/util/Collection;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p2, Lnu/n$b;

    invoke-direct {p2, p1}, Lnu/n$b;-><init>(Ljava/util/Collection;)V

    iput-object p1, v0, Lnu/n$a;->t:Ljava/lang/Object;

    iput v3, v0, Lnu/n$a;->v:I

    invoke-interface {p0, p2, v0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public static final b(Lnu/h;Ljava/util/List;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p0    # Lnu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
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
            "Ljava/util/List<",
            "TT;>;",
            "Lnt/b<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    check-cast p1, Ljava/util/Collection;

    invoke-static {p0, p1, p2}, Lnu/j;->P(Lnu/h;Ljava/util/Collection;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lnu/h;Ljava/util/List;Lnt/b;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-static {p0, p1, p2}, Lnu/j;->Q(Lnu/h;Ljava/util/List;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
