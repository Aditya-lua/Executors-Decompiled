.class public final Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;
.super Lgu/m;
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
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Pair<",
        "+",
        "Lm2/c;",
        "+",
        "Lhj/e;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$indexResults$1$1"
    f = "OSSearchIndexSyncWorker.kt"
    l = {
        0x3c
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lav/p0;",
        "Lkotlin/Pair;",
        "Lm2/c;",
        "Lhj/e;",
        "<anonymous>",
        "(Lav/p0;)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

.field public final synthetic v:Lcom/roblox/client/ossearch/c;

.field public final synthetic w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;


# direct methods
.method public constructor <init>(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;",
            "Lcom/roblox/client/ossearch/c;",
            "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;",
            "Leu/b<",
            "-",
            "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->u:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    iput-object p2, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->v:Lcom/roblox/client/ossearch/c;

    iput-object p3, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->u:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    iget-object v1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->v:Lcom/roblox/client/ossearch/c;

    iget-object v2, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;-><init>(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Pair<",
            "+",
            "Lm2/c;",
            "Lhj/e;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->t:I

    const-string v2, "getApplicationContext(...)"

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->u:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    iget-object v1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->v:Lcom/roblox/client/ossearch/c;

    iget-object v4, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-virtual {v4}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->c()Lav/l0;

    move-result-object v4

    iget-object v5, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-virtual {v5}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput v3, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->t:I

    invoke-static {p1, v1, v4, v5, p0}, Lhj/a;->c(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lav/l0;Landroid/content/Context;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lhj/e;

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->u:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    invoke-virtual {p1}, Lhj/e;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v3, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d$d;->w:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;

    invoke-virtual {v3}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, v3}, Lhj/a;->d(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Landroid/content/Context;)Lm2/c;

    move-result-object v0

    invoke-static {v0, p1}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
