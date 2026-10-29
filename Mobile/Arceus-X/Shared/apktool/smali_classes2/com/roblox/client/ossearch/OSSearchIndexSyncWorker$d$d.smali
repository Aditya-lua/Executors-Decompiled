.class public final Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;
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
        "Lkotlin/Pair<",
        "+",
        "Lm2/c;",
        "+",
        "Lzi/e;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lku/p0;",
        "Lkotlin/Pair;",
        "Lm2/c;",
        "Lzi/e;",
        "<anonymous>",
        "(Lku/p0;)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$indexResults$1$1"
    f = "OSSearchIndexSyncWorker.kt"
    l = {
        0x3d
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

.field public final synthetic v:Lcom/roblox/client/ossearch/c;

.field public final synthetic w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;


# direct methods
.method public constructor <init>(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;",
            "Lcom/roblox/client/ossearch/c;",
            "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->u:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    iput-object p2, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->v:Lcom/roblox/client/ossearch/c;

    iput-object p3, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

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

    new-instance p1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->u:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    iget-object v1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->v:Lcom/roblox/client/ossearch/c;

    iget-object v2, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;-><init>(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lkotlin/Pair<",
            "+",
            "Lm2/c;",
            "Lzi/e;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->t:I

    const-string v2, "getApplicationContext(...)"

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->u:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    iget-object v1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->v:Lcom/roblox/client/ossearch/c;

    iget-object v4, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-virtual {v4}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->c()Lku/l0;

    move-result-object v4

    iget-object v5, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-virtual {v5}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput v3, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->t:I

    invoke-static {p1, v1, v4, v5, p0}, Lzi/a;->c(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lku/l0;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lzi/e;

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->u:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    invoke-virtual {p1}, Lzi/e;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v3, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-virtual {v3}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v3}, Lzi/a;->d(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Landroid/content/Context;)Lm2/c;

    move-result-object v0

    invoke-static {v0, p1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
