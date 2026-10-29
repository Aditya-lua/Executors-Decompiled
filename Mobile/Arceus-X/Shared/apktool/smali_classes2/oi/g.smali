.class public final Loi/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u001a\u001e\u0010\u0008\u001a\u00020\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0006H\u0086@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "userId",
        "",
        "c",
        "(JLnt/b;)Ljava/lang/Object;",
        "a",
        "",
        "userIds",
        "b",
        "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;",
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
.method public static final a(JLnt/b;)Ljava/lang/Object;
    .locals 0
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1}, Lpt/b;->e(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0, p2}, Loi/g;->b(Ljava/util/List;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Ljava/util/List;Lnt/b;)Ljava/lang/Object;
    .locals 17
    .param p0    # Ljava/util/List;
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
            "Ljava/util/List<",
            "Ljava/lang/Long;",
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

    move-object/from16 v0, p1

    instance-of v1, v0, Loi/g$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Loi/g$a;

    iget v2, v1, Loi/g$a;->w:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Loi/g$a;->w:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Loi/g$a;

    invoke-direct {v1, v0}, Loi/g$a;-><init>(Lnt/b;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Loi/g$a;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v7, Loi/g$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v7, Loi/g$a;->u:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v7, Loi/g$a;->t:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_3
    move-object/from16 v8, p0

    check-cast v8, Ljava/lang/Iterable;

    const/16 v15, 0x3e

    const/16 v16, 0x0

    const-string v9, ","

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lvk/g;->d()Lvk/d;

    move-result-object v2

    invoke-interface {v2}, Lvk/d;->e()Lzk/m;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v7, Loi/g$a;->t:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v7, Loi/g$a;->u:Ljava/lang/Object;

    iput v3, v7, Loi/g$a;->w:I

    const-string v4, "150x150"

    const-string v5, "Png"

    const/4 v6, 0x0

    move-object v3, v0

    invoke-interface/range {v2 .. v7}, Lzk/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast v0, Ldl/b;

    invoke-static {}, Lkotlin/collections/o;->c()Ljava/util/List;

    move-result-object v1

    iget-object v0, v0, Ldl/b;->data:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldl/a;

    iget-object v3, v2, Ldl/a;->imageUrl:Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {}, Ldh/b;->b()Ldh/b;

    move-result-object v3

    iget-wide v4, v2, Ldl/a;->targetId:J

    invoke-virtual {v3, v4, v5}, Ldh/b;->d(J)Ldh/a;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v4, v2, Ldl/a;->imageUrl:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ldh/a;->e(Ljava/lang/String;)V

    :cond_6
    :goto_4
    iget-wide v2, v2, Ldl/a;->targetId:J

    invoke-static {v2, v3}, Lpt/b;->e(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-static {v1}, Lkotlin/collections/o;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v1

    new-instance v2, Lph/b;

    new-instance v3, Ljava/util/ArrayList;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v2, v3}, Lph/b;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {v1, v2}, Lfv/c;->j(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final c(JLnt/b;)Ljava/lang/Object;
    .locals 3
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    new-instance v1, Loi/g$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Loi/g$b;-><init>(JLnt/b;)V

    invoke-static {v0, v1, p2}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
