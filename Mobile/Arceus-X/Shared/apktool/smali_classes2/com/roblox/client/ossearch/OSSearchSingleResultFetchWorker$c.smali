.class public final Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;->doWork(Lnt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$2"
    f = "OSSearchSingleResultFetchWorker.kt"
    l = {
        0x2c,
        0x2e,
        0x30
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public A:Ljava/lang/Object;

.field public B:Ljava/lang/Object;

.field public C:Ljava/lang/Object;

.field public D:Ljava/lang/Object;

.field public E:I

.field public F:I

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

.field public final synthetic I:Lcom/roblox/client/ossearch/c;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;Lcom/roblox/client/ossearch/c;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;",
            "Lcom/roblox/client/ossearch/c;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->H:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

    iput-object p2, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->I:Lcom/roblox/client/ossearch/c;

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

    new-instance v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;

    iget-object v1, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->H:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

    iget-object v2, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->I:Lcom/roblox/client/ossearch/c;

    invoke-direct {v0, v1, v2, p2}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;-><init>(Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;Lcom/roblox/client/ossearch/c;Lnt/b;)V

    iput-object p1, v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->G:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->G:Ljava/lang/Object;

    check-cast v0, Lku/p0;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->F:I

    const-string v4, "getApplicationContext(...)"

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v8, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    iget v3, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->E:I

    iget-object v8, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->D:Ljava/lang/Object;

    check-cast v8, Lzi/e;

    iget-object v10, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->C:Ljava/lang/Object;

    check-cast v10, Lm2/c;

    iget-object v10, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->B:Ljava/lang/Object;

    check-cast v10, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    iget-object v11, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->A:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->z:Ljava/lang/Object;

    check-cast v12, Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;

    iget-object v13, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->y:Ljava/lang/Object;

    check-cast v13, Lku/p0;

    iget-object v14, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->x:Ljava/lang/Object;

    check-cast v14, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

    iget-object v15, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->w:Ljava/lang/Object;

    check-cast v15, Lcom/roblox/client/ossearch/c;

    iget-object v5, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->v:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->u:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->t:Ljava/lang/Object;

    check-cast v7, Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v16, v6

    move v6, v3

    move-object v3, v12

    move-object v12, v7

    move-object v7, v13

    move-object v13, v11

    move-object/from16 v11, v16

    move-object/from16 v16, v0

    move-object/from16 v17, v4

    const/4 v0, 0x3

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v3, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->E:I

    iget-object v5, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->B:Ljava/lang/Object;

    check-cast v5, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    iget-object v6, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->A:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->z:Ljava/lang/Object;

    check-cast v7, Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;

    iget-object v8, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->y:Ljava/lang/Object;

    check-cast v8, Lku/p0;

    iget-object v10, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->x:Ljava/lang/Object;

    check-cast v10, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

    iget-object v11, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->w:Ljava/lang/Object;

    check-cast v11, Lcom/roblox/client/ossearch/c;

    iget-object v12, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->v:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->u:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->t:Ljava/lang/Object;

    check-cast v14, Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;

    :try_start_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v9, v10

    move-object v10, v5

    move-object v5, v12

    move-object v12, v7

    move-object v7, v14

    move-object v14, v9

    move-object/from16 v9, p1

    move-object/from16 v16, v0

    move-object v15, v11

    const/4 v0, 0x2

    move-object v11, v6

    move-object v6, v13

    move-object v13, v8

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    move-object v5, v12

    goto/16 :goto_5

    :cond_2
    iget v3, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->E:I

    iget-object v5, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->y:Ljava/lang/Object;

    check-cast v5, Lku/p0;

    iget-object v6, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->x:Ljava/lang/Object;

    check-cast v6, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

    iget-object v7, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->w:Ljava/lang/Object;

    check-cast v7, Lcom/roblox/client/ossearch/c;

    iget-object v8, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->v:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v10, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->u:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->t:Ljava/lang/Object;

    check-cast v11, Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;

    :try_start_2
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v12, v11

    move-object v11, v10

    move-object v10, v7

    move-object v7, v6

    move-object v6, v5

    move v5, v3

    move-object/from16 v3, p1

    goto :goto_0

    :catchall_2
    move-exception v0

    move-object v5, v8

    goto/16 :goto_5

    :cond_3
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->H:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

    invoke-static {v3}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;->b(Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;)Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;

    move-result-object v11

    if-nez v11, :cond_4

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    return-object v0

    :cond_4
    sget-object v3, Lcom/roblox/client/ossearch/a;->a:Lcom/roblox/client/ossearch/a;

    invoke-virtual {v3}, Lcom/roblox/client/ossearch/a;->g()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v7, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->I:Lcom/roblox/client/ossearch/c;

    iget-object v6, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->H:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

    :try_start_3
    sget-object v3, Ljt/n;->b:Ljt/n$a;

    invoke-static {}, Lvk/g;->d()Lvk/d;

    move-result-object v3

    invoke-interface {v3}, Lvk/d;->g()Lzk/j;

    move-result-object v3

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->G:Ljava/lang/Object;

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->t:Ljava/lang/Object;

    iput-object v10, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->u:Ljava/lang/Object;

    iput-object v5, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->v:Ljava/lang/Object;

    iput-object v7, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->w:Ljava/lang/Object;

    iput-object v6, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->x:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->y:Ljava/lang/Object;

    iput v9, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->E:I

    iput v8, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->F:I

    invoke-interface {v3, v11, v1}, Lzk/j;->b(Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;Lnt/b;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v3, v2, :cond_5

    goto/16 :goto_3

    :cond_5
    move-object v8, v5

    move v5, v9

    move-object v12, v11

    move-object v11, v10

    move-object v10, v7

    move-object v7, v6

    move-object v6, v0

    :goto_0
    :try_start_4
    check-cast v3, Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;

    invoke-virtual {v3}, Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;->getItems()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-object/from16 v25, v6

    move v6, v5

    move-object v5, v8

    move-object v8, v7

    move-object/from16 v7, v25

    :goto_1
    :try_start_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    invoke-virtual {v8}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;->d()Lku/l0;

    move-result-object v15

    invoke-virtual {v8}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->G:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->t:Ljava/lang/Object;

    iput-object v11, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->u:Ljava/lang/Object;

    iput-object v5, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->v:Ljava/lang/Object;

    iput-object v10, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->w:Ljava/lang/Object;

    iput-object v8, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->x:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->y:Ljava/lang/Object;

    iput-object v3, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->z:Ljava/lang/Object;

    iput-object v13, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->A:Ljava/lang/Object;

    iput-object v14, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->B:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->C:Ljava/lang/Object;

    iput-object v0, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->D:Ljava/lang/Object;

    iput v6, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->E:I

    const/4 v0, 0x2

    iput v0, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->F:I

    invoke-static {v14, v10, v15, v9, v1}, Lzi/a;->c(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lku/l0;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_6

    goto :goto_3

    :cond_6
    move-object v15, v12

    move-object v12, v3

    move v3, v6

    move-object v6, v11

    move-object v11, v13

    move-object v13, v7

    move-object v7, v15

    move-object v15, v10

    move-object v10, v14

    move-object v14, v8

    :goto_2
    move-object v8, v9

    check-cast v8, Lzi/e;

    invoke-virtual {v8}, Lzi/e;->a()Landroid/graphics/Bitmap;

    move-result-object v9

    invoke-virtual {v14}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v9, v0}, Lzi/a;->d(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Landroid/content/Context;)Lm2/c;

    move-result-object v0

    invoke-virtual {v14}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;->d()Lku/l0;

    move-result-object v9

    move-object/from16 v17, v4

    new-instance v4, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;

    move-object/from16 p1, v7

    const/4 v7, 0x0

    invoke-direct {v4, v14, v0, v7}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;-><init>(Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;Lm2/c;Lnt/b;)V

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->G:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->t:Ljava/lang/Object;

    iput-object v6, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->u:Ljava/lang/Object;

    iput-object v5, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->v:Ljava/lang/Object;

    iput-object v15, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->w:Ljava/lang/Object;

    iput-object v14, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->x:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->z:Ljava/lang/Object;

    iput-object v11, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->A:Ljava/lang/Object;

    iput-object v10, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->B:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->C:Ljava/lang/Object;

    iput-object v8, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->D:Ljava/lang/Object;

    iput v3, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->E:I

    const/4 v0, 0x3

    iput v0, v1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->F:I

    invoke-static {v9, v4, v1}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_7

    :goto_3
    return-object v2

    :cond_7
    move-object v7, v13

    move-object v13, v11

    move-object v11, v6

    move v6, v3

    move-object v3, v12

    move-object/from16 v12, p1

    :goto_4
    move-object v4, v11

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v5

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v8, v14

    move-object v10, v15

    move-object/from16 v0, v16

    move-object/from16 v4, v17

    const/4 v9, 0x0

    goto/16 :goto_1

    :cond_8
    invoke-static {v3}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_6

    :goto_5
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_6
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const-string v3, "OSSearchSingleResultFetchWorker"

    if-nez v2, :cond_16

    check-cast v0, Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;

    invoke-virtual {v0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;->getItems()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "OS search result fetch completed. Set "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " shortcuts."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v2, Lcom/roblox/client/ossearch/a;->a:Lcom/roblox/client/ossearch/a;

    invoke-virtual {v0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;->getItems()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    invoke-virtual {v0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;->getItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    if-eqz v4, :cond_9

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v8, 0x0

    goto :goto_8

    :cond_9
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_a
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    invoke-virtual {v6}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_a

    add-int/lit8 v4, v4, 0x1

    if-gez v4, :cond_a

    invoke-static {}, Lkotlin/collections/p;->s()V

    goto :goto_7

    :cond_b
    move v8, v4

    :goto_8
    check-cast v5, Ljava/lang/Iterable;

    instance-of v3, v5, Ljava/util/Collection;

    if-eqz v3, :cond_c

    move-object v4, v5

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_c

    const/4 v9, 0x0

    goto :goto_a

    :cond_c
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x0

    :cond_d
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lzi/e;

    invoke-virtual {v9}, Lzi/e;->b()Z

    move-result v10

    if-nez v10, :cond_d

    invoke-virtual {v9}, Lzi/e;->a()Landroid/graphics/Bitmap;

    move-result-object v9

    if-eqz v9, :cond_d

    add-int/lit8 v6, v6, 0x1

    if-gez v6, :cond_d

    invoke-static {}, Lkotlin/collections/p;->s()V

    goto :goto_9

    :cond_e
    move v9, v6

    :goto_a
    invoke-virtual {v0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;->getItems()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v12

    new-instance v16, Lcom/roblox/client/ossearch/a$a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v13, 0x18

    const/4 v14, 0x0

    move-object/from16 v6, v16

    invoke-direct/range {v6 .. v14}, Lcom/roblox/client/ossearch/a$a;-><init>(IIILjava/lang/Integer;Ljava/lang/Integer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->i0()Z

    move-result v0

    if-eqz v0, :cond_15

    if-eqz v3, :cond_f

    move-object v0, v5

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    const/4 v4, 0x0

    goto :goto_c

    :cond_f
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    :cond_10
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzi/e;

    invoke-virtual {v6}, Lzi/e;->b()Z

    move-result v6

    if-eqz v6, :cond_10

    add-int/lit8 v4, v4, 0x1

    if-gez v4, :cond_10

    invoke-static {}, Lkotlin/collections/p;->s()V

    goto :goto_b

    :cond_11
    :goto_c
    invoke-static {v4}, Lpt/b;->d(I)Ljava/lang/Integer;

    move-result-object v20

    if-eqz v3, :cond_12

    move-object v0, v5

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v9, 0x0

    goto :goto_e

    :cond_12
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v9, 0x0

    :cond_13
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzi/e;

    invoke-virtual {v3}, Lzi/e;->a()Landroid/graphics/Bitmap;

    move-result-object v3

    if-nez v3, :cond_13

    add-int/lit8 v9, v9, 0x1

    if-gez v9, :cond_13

    invoke-static {}, Lkotlin/collections/p;->s()V

    goto :goto_d

    :cond_14
    :goto_e
    invoke-static {v9}, Lpt/b;->d(I)Ljava/lang/Integer;

    move-result-object v21

    const/16 v23, 0x27

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    invoke-static/range {v16 .. v24}, Lcom/roblox/client/ossearch/a$a;->b(Lcom/roblox/client/ossearch/a$a;IIILjava/lang/Integer;Ljava/lang/Integer;IILjava/lang/Object;)Lcom/roblox/client/ossearch/a$a;

    move-result-object v16

    :cond_15
    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Lcom/roblox/client/ossearch/a;->f(Lcom/roblox/client/ossearch/a$a;)V

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v0

    goto :goto_f

    :cond_16
    instance-of v0, v2, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_17

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    goto :goto_f

    :cond_17
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error fetching OS search results: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object v0

    :goto_f
    return-object v0
.end method
