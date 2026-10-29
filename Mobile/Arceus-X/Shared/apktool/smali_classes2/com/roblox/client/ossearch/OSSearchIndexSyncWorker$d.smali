.class public final Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->doWork(Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Landroidx/work/c$a;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00070\u0001\u00a2\u0006\u0002\u0008\u0002*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lku/p0;",
        "Landroidx/work/c$a;",
        "Lkotlin/jvm/internal/EnhancedNullability;",
        "<anonymous>",
        "(Lku/p0;)Landroidx/work/c$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2"
    f = "OSSearchIndexSyncWorker.kt"
    l = {
        0x32,
        0x33,
        0x36,
        0x44,
        0x45
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public synthetic A:Ljava/lang/Object;

.field public final synthetic B:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

.field public final synthetic C:Lcom/roblox/client/ossearch/c;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lcom/roblox/client/ossearch/c;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;",
            "Lcom/roblox/client/ossearch/c;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->B:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    iput-object p2, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->C:Lcom/roblox/client/ossearch/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;

    iget-object v1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->B:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    iget-object v2, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->C:Lcom/roblox/client/ossearch/c;

    invoke-direct {v0, v1, v2, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;-><init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lcom/roblox/client/ossearch/c;Lnt/b;)V

    iput-object p1, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->A:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Landroidx/work/c$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->A:Ljava/lang/Object;

    check-cast v0, Lku/p0;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->z:I

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v3, :cond_5

    if-eq v3, v9, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->v:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v2, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->u:Ljava/lang/Object;

    check-cast v2, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;

    iget-object v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->t:Ljava/lang/Object;

    check-cast v3, Lku/p0;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->y:I

    iget v5, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->x:I

    iget-object v6, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->v:Ljava/lang/Object;

    check-cast v6, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;

    iget-object v7, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->u:Ljava/lang/Object;

    check-cast v7, Lku/p0;

    iget-object v9, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->t:Ljava/lang/Object;

    check-cast v9, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    :try_start_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v4, p1

    goto/16 :goto_4

    :cond_2
    iget v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->x:I

    iget-object v6, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->w:Ljava/lang/Object;

    check-cast v6, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;

    iget-object v7, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->v:Ljava/lang/Object;

    check-cast v7, Lku/p0;

    iget-object v9, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->u:Ljava/lang/Object;

    check-cast v9, Lcom/roblox/client/ossearch/c;

    iget-object v11, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->t:Ljava/lang/Object;

    check-cast v11, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    :try_start_2
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v10, v9

    move-object v15, v11

    move-object v9, v7

    move-object v7, v6

    move-object/from16 v6, p1

    goto/16 :goto_2

    :cond_3
    iget v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->x:I

    iget-object v7, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->w:Ljava/lang/Object;

    check-cast v7, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;

    iget-object v9, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->v:Ljava/lang/Object;

    check-cast v9, Lku/p0;

    iget-object v11, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->u:Ljava/lang/Object;

    check-cast v11, Lcom/roblox/client/ossearch/c;

    iget-object v12, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->t:Ljava/lang/Object;

    check-cast v12, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    :try_start_3
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    :cond_4
    iget v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->x:I

    iget-object v9, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->v:Ljava/lang/Object;

    check-cast v9, Lku/p0;

    iget-object v11, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->u:Ljava/lang/Object;

    check-cast v11, Lcom/roblox/client/ossearch/c;

    iget-object v12, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->t:Ljava/lang/Object;

    check-cast v12, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    :try_start_4
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v13, v12

    move-object v12, v11

    move-object v11, v9

    move-object/from16 v9, p1

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object v3, Lcom/roblox/client/ossearch/a;->a:Lcom/roblox/client/ossearch/a;

    invoke-virtual {v3}, Lcom/roblox/client/ossearch/a;->e()V

    iget-object v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->B:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    iget-object v11, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->C:Lcom/roblox/client/ossearch/c;

    :try_start_5
    sget-object v12, Ljt/n;->b:Ljt/n$a;

    invoke-static {}, Lvk/g;->d()Lvk/d;

    move-result-object v12

    invoke-interface {v12}, Lvk/d;->g()Lzk/j;

    move-result-object v12

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->A:Ljava/lang/Object;

    iput-object v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->t:Ljava/lang/Object;

    iput-object v11, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->u:Ljava/lang/Object;

    iput-object v0, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->v:Ljava/lang/Object;

    iput v10, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->x:I

    iput v9, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->z:I

    invoke-interface {v12, v1}, Lzk/j;->f(Lnt/b;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_6

    goto/16 :goto_5

    :cond_6
    move-object v13, v3

    move v3, v10

    move-object v12, v11

    move-object v11, v0

    :goto_0
    check-cast v9, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;

    invoke-virtual {v13}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->c()Lku/l0;

    move-result-object v14

    new-instance v15, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$a;

    invoke-direct {v15, v13, v8}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$a;-><init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lnt/b;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->A:Ljava/lang/Object;

    iput-object v13, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->t:Ljava/lang/Object;

    iput-object v12, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->u:Ljava/lang/Object;

    iput-object v11, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->v:Ljava/lang/Object;

    iput-object v9, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->w:Ljava/lang/Object;

    iput v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->x:I

    iput v7, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->z:I

    invoke-static {v14, v15, v1}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_7

    goto/16 :goto_5

    :cond_7
    move-object v7, v9

    move-object v9, v11

    move-object v11, v12

    move-object v12, v13

    :goto_1
    invoke-virtual {v12}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->c()Lku/l0;

    move-result-object v10

    new-instance v13, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$c;

    invoke-direct {v13, v12, v8}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$c;-><init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lnt/b;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->A:Ljava/lang/Object;

    iput-object v12, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->t:Ljava/lang/Object;

    iput-object v11, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->u:Ljava/lang/Object;

    iput-object v9, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->v:Ljava/lang/Object;

    iput-object v7, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->w:Ljava/lang/Object;

    iput v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->x:I

    iput v6, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->z:I

    invoke-static {v10, v13, v1}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_8

    goto/16 :goto_5

    :cond_8
    move-object v10, v11

    move-object v15, v12

    :goto_2
    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v7}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;->getSearchIndexItems()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-static {v11, v6}, Lkotlin/collections/CollectionsKt;->H0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v11, v13}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    move-object v13, v12

    new-instance v12, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;

    invoke-direct {v12, v11, v10, v15, v8}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;-><init>(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lnt/b;)V

    move-object v11, v13

    const/4 v13, 0x3

    const/4 v14, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v4, v18

    invoke-static/range {v9 .. v14}, Lku/i;->b(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/w0;

    move-result-object v10

    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v12, v4

    move-object/from16 v10, v17

    const/4 v4, 0x5

    goto :goto_3

    :cond_9
    move-object v4, v12

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->A:Ljava/lang/Object;

    iput-object v15, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->t:Ljava/lang/Object;

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->u:Ljava/lang/Object;

    iput-object v7, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->v:Ljava/lang/Object;

    iput-object v8, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->w:Ljava/lang/Object;

    iput v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->x:I

    iput v6, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->y:I

    iput v5, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->z:I

    invoke-static {v4, v1}, Lku/f;->a(Ljava/util/Collection;Lnt/b;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_a

    goto :goto_5

    :cond_a
    move v5, v3

    move v3, v6

    move-object v6, v7

    move-object v7, v9

    move-object v9, v15

    :goto_4
    check-cast v4, Ljava/util/List;

    invoke-virtual {v9}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->c()Lku/l0;

    move-result-object v10

    new-instance v11, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;

    invoke-direct {v11, v9, v4, v6, v8}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;-><init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Ljava/util/List;Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;Lnt/b;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->A:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->t:Ljava/lang/Object;

    iput-object v6, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->u:Ljava/lang/Object;

    iput-object v4, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->v:Ljava/lang/Object;

    iput v5, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->x:I

    iput v3, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->y:I

    const/4 v0, 0x5

    iput v0, v1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->z:I

    invoke-static {v10, v11, v1}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_b

    :goto_5
    return-object v2

    :cond_b
    move-object v0, v4

    move-object v2, v6

    :goto_6
    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_8

    :goto_7
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_8
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const-string v3, "OSSearchIndexSyncWorker"

    if-nez v2, :cond_19

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;

    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "OS search index sync completed. Set "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " shortcuts."

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v3, Lcom/roblox/client/ossearch/a;->a:Lcom/roblox/client/ossearch/a;

    invoke-virtual {v2}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;->getSearchIndexItems()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    invoke-virtual {v2}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;->getSearchIndexItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v4, v2, Ljava/util/Collection;

    if-eqz v4, :cond_c

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_c

    const/4 v7, 0x0

    goto :goto_a

    :cond_c
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :cond_d
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    invoke-virtual {v5}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_d

    add-int/lit8 v4, v4, 0x1

    if-gez v4, :cond_d

    invoke-static {}, Lkotlin/collections/p;->s()V

    goto :goto_9

    :cond_e
    move v7, v4

    :goto_a
    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    instance-of v4, v2, Ljava/util/Collection;

    if-eqz v4, :cond_f

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_f

    const/4 v8, 0x0

    goto :goto_c

    :cond_f
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v8, 0x0

    :cond_10
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lkotlin/Pair;

    invoke-virtual {v9}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lzi/e;

    invoke-virtual {v10}, Lzi/e;->b()Z

    move-result v10

    if-nez v10, :cond_10

    invoke-virtual {v9}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lzi/e;

    invoke-virtual {v9}, Lzi/e;->a()Landroid/graphics/Bitmap;

    move-result-object v9

    if-eqz v9, :cond_10

    add-int/lit8 v8, v8, 0x1

    if-gez v8, :cond_10

    invoke-static {}, Lkotlin/collections/p;->s()V

    goto :goto_b

    :cond_11
    :goto_c
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v11

    new-instance v16, Lcom/roblox/client/ossearch/a$a;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v12, 0x18

    const/4 v13, 0x0

    move-object/from16 v5, v16

    invoke-direct/range {v5 .. v13}, Lcom/roblox/client/ossearch/a$a;-><init>(IIILjava/lang/Integer;Ljava/lang/Integer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->i0()Z

    move-result v0

    if-eqz v0, :cond_18

    if-eqz v4, :cond_12

    move-object v0, v2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v5, 0x0

    goto :goto_e

    :cond_12
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v5, 0x0

    :cond_13
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/Pair;

    invoke-virtual {v6}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzi/e;

    invoke-virtual {v6}, Lzi/e;->b()Z

    move-result v6

    if-eqz v6, :cond_13

    add-int/lit8 v5, v5, 0x1

    if-gez v5, :cond_13

    invoke-static {}, Lkotlin/collections/p;->s()V

    goto :goto_d

    :cond_14
    :goto_e
    invoke-static {v5}, Lpt/b;->d(I)Ljava/lang/Integer;

    move-result-object v20

    if-eqz v4, :cond_15

    move-object v0, v2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v10, 0x0

    goto :goto_10

    :cond_15
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v10, 0x0

    :cond_16
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/Pair;

    invoke-virtual {v2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzi/e;

    invoke-virtual {v2}, Lzi/e;->a()Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_16

    add-int/lit8 v10, v10, 0x1

    if-gez v10, :cond_16

    invoke-static {}, Lkotlin/collections/p;->s()V

    goto :goto_f

    :cond_17
    :goto_10
    invoke-static {v10}, Lpt/b;->d(I)Ljava/lang/Integer;

    move-result-object v21

    const/16 v23, 0x27

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    invoke-static/range {v16 .. v24}, Lcom/roblox/client/ossearch/a$a;->b(Lcom/roblox/client/ossearch/a$a;IIILjava/lang/Integer;Ljava/lang/Integer;IILjava/lang/Object;)Lcom/roblox/client/ossearch/a$a;

    move-result-object v16

    :cond_18
    move-object/from16 v0, v16

    invoke-virtual {v3, v0}, Lcom/roblox/client/ossearch/a;->d(Lcom/roblox/client/ossearch/a$a;)V

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_11

    :cond_19
    instance-of v0, v2, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1a

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    const-string v2, "failure(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_11

    :cond_1a
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error syncing OS search results: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object v0

    const-string v2, "retry(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_11
    return-object v0
.end method
