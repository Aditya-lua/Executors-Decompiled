.class public interface abstract Lsl/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008g\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0097@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001e\u0010\r\u001a\u00020\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000cJ(\u0010\u0012\u001a\u00020\n2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00072\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J#\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00070\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\'\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lsl/b;",
        "",
        "Lsl/l;",
        "localAchievement",
        "",
        "f",
        "(Lsl/l;Lnt/b;)Ljava/lang/Object;",
        "",
        "Lsl/u;",
        "remoteAchievements",
        "",
        "i",
        "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;",
        "e",
        "",
        "codeNames",
        "Ljava/time/Instant;",
        "syncedAt",
        "d",
        "(Ljava/util/List;Ljava/time/Instant;Lnt/b;)Ljava/lang/Object;",
        "Lsl/a;",
        "g",
        "(Lnt/b;)Ljava/lang/Object;",
        "",
        "highWatermarkId",
        "Lnu/h;",
        "c",
        "(I)Lnu/h;",
        "codeName",
        "h",
        "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "database_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lsl/b;Ljava/util/List;Lnt/b;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl/b;",
            "Ljava/util/List<",
            "Lsl/u;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lsl/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsl/b$a;

    iget v1, v0, Lsl/b$a;->D:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsl/b$a;->D:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsl/b$a;

    invoke-direct {v0, p0, p2}, Lsl/b$a;-><init>(Lsl/b;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lsl/b$a;->B:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lsl/b$a;->D:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget p0, v0, Lsl/b$a;->z:I

    iget-object p1, v0, Lsl/b$a;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lsl/b$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object v2, v0, Lsl/b$a;->v:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    iget-object v6, v0, Lsl/b$a;->u:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v0, Lsl/b$a;->t:Ljava/lang/Object;

    check-cast v7, Lsl/b;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object p2, v2

    move-object v2, p1

    move-object p1, v6

    move v6, p0

    move-object p0, v7

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget p0, v0, Lsl/b$a;->A:I

    iget p1, v0, Lsl/b$a;->z:I

    iget-object v2, v0, Lsl/b$a;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v6, v0, Lsl/b$a;->x:Ljava/lang/Object;

    iget-object v7, v0, Lsl/b$a;->w:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lsl/b$a;->v:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v9, v0, Lsl/b$a;->u:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v0, Lsl/b$a;->t:Ljava/lang/Object;

    check-cast v10, Lsl/b;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    move p2, p1

    move p1, p0

    move p0, p2

    move-object p2, v9

    move-object v9, v0

    move-object v0, p2

    move-object p2, v8

    move-object v8, v2

    move-object v2, v7

    goto :goto_2

    :cond_3
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    const/16 v2, 0x64

    invoke-static {p2, v2}, Lkotlin/collections/CollectionsKt;->V(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v6, v3

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/util/List;

    iput-object p0, v0, Lsl/b$a;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lsl/b$a;->u:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lsl/b$a;->v:Ljava/lang/Object;

    iput-object v2, v0, Lsl/b$a;->w:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lsl/b$a;->x:Ljava/lang/Object;

    iput-object v8, v0, Lsl/b$a;->y:Ljava/lang/Object;

    iput v6, v0, Lsl/b$a;->z:I

    iput v3, v0, Lsl/b$a;->A:I

    iput v5, v0, Lsl/b$a;->D:I

    invoke-interface {p0, v8, v0}, Lsl/b;->e(Ljava/util/List;Lnt/b;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_4

    goto :goto_4

    :cond_4
    move-object v10, p0

    move-object v9, v0

    move p0, v6

    move-object v6, v7

    move-object v0, p1

    move p1, v3

    :goto_2
    move-object v7, v8

    check-cast v7, Ljava/lang/Iterable;

    move-object v11, v7

    new-instance v7, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v11, v12}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lsl/u;

    invoke-virtual {v12}, Lsl/u;->a()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    iput-object v10, v9, Lsl/b$a;->t:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lsl/b$a;->u:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lsl/b$a;->v:Ljava/lang/Object;

    iput-object v2, v9, Lsl/b$a;->w:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lsl/b$a;->x:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lsl/b$a;->y:Ljava/lang/Object;

    iput p0, v9, Lsl/b$a;->z:I

    iput p1, v9, Lsl/b$a;->A:I

    iput v4, v9, Lsl/b$a;->D:I

    const/4 v8, 0x0

    move-object v6, v10

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lsl/b;->b(Lsl/b;Ljava/util/List;Ljava/time/Instant;Lnt/b;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_4
    return-object v1

    :cond_6
    move-object p1, v6

    move v6, p0

    move-object p0, p1

    move-object p1, v0

    move-object v0, v9

    goto/16 :goto_1

    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic b(Lsl/b;Ljava/util/List;Ljava/time/Instant;Lnt/b;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-static {}, Ljava/time/Instant;->now()Ljava/time/Instant;

    move-result-object p2

    const-string p4, "now(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lsl/b;->d(Ljava/util/List;Ljava/time/Instant;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: markAchievementSynced"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract c(I)Lnu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lnu/h<",
            "Ljava/util/List<",
            "Lsl/a;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract d(Ljava/util/List;Ljava/time/Instant;Lnt/b;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/time/Instant;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/time/Instant;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract e(Ljava/util/List;Lnt/b;)Ljava/lang/Object;
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
            "(",
            "Ljava/util/List<",
            "Lsl/u;",
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
.end method

.method public abstract f(Lsl/l;Lnt/b;)Ljava/lang/Object;
    .param p1    # Lsl/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl/l;",
            "Lnt/b<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract g(Lnt/b;)Ljava/lang/Object;
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljava/util/List<",
            "Lsl/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lsl/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public i(Ljava/util/List;Lnt/b;)Ljava/lang/Object;
    .locals 0
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
            "(",
            "Ljava/util/List<",
            "Lsl/u;",
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

    invoke-static {p0, p1, p2}, Lsl/b;->a(Lsl/b;Ljava/util/List;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
