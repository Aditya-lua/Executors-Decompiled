.class public final Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$2"
    f = "OSSearchIndexSyncWorker.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

.field public final synthetic v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lm2/c;",
            "Lzi/e;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Ljava/util/List;Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;",
            "Ljava/util/List<",
            "+",
            "Lkotlin/Pair<",
            "+",
            "Lm2/c;",
            "Lzi/e;",
            ">;>;",
            "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->u:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    iput-object p2, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->v:Ljava/util/List;

    iput-object p3, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->w:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance p1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->u:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    iget-object v1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->v:Ljava/util/List;

    iget-object v2, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->w:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;-><init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Ljava/util/List;Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->u:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-virtual {p1}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->v:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/Pair;

    invoke-virtual {v2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm2/c;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1, v1}, Lm2/e;->m(Landroid/content/Context;Ljava/util/List;)Z

    sget-object p1, Lcom/roblox/client/ossearch/b;->a:Lcom/roblox/client/ossearch/b;

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->u:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-virtual {v0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->u:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-virtual {v1}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->b()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    iget-object v3, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$b;->w:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;

    invoke-virtual {v3}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;->getRefreshIntervalSeconds()I

    move-result v3

    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    add-long/2addr v1, v3

    invoke-virtual {p1, v0, v1, v2}, Lcom/roblox/client/ossearch/b;->d(Landroid/content/Context;J)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
