.class public final Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->cacheRecentlyPlayedData(Ljava/lang/String;Ljava/util/Map;)V
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
    c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler$cacheRecentlyPlayedData$1"
    f = "RecentlyPlayedWidgetHandler.kt"
    l = {
        0xd8,
        0x77
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public x:I

.field public y:I

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->z:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->A:Ljava/util/Map;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;

    iget-object v0, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->z:Ljava/lang/String;

    iget-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->A:Ljava/util/Map;

    invoke-direct {p1, v0, v1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;-><init>(Ljava/lang/String;Ljava/util/Map;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->y:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->v:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->u:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->t:Ljava/lang/Object;

    check-cast v2, Luu/a;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->w:I

    iget-object v4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->v:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    iget-object v6, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->u:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->t:Ljava/lang/Object;

    check-cast v7, Luu/a;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object p1, v7

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->access$getCacheMutex$p()Luu/a;

    move-result-object p1

    iget-object v6, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->z:Ljava/lang/String;

    iget-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->A:Ljava/util/Map;

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->t:Ljava/lang/Object;

    iput-object v6, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->u:Ljava/lang/Object;

    iput-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->v:Ljava/lang/Object;

    iput v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->w:I

    iput v4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->y:I

    invoke-interface {p1, v5, p0}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v1

    move v1, v2

    :goto_0
    :try_start_1
    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v7

    sget-object v8, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-virtual {v8, v6, v4}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->reformatData(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->access$getRecentlyPlayedWidgetFileProvider$p()Llk/c;

    move-result-object v6

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->t:Ljava/lang/Object;

    iput-object v7, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->u:Ljava/lang/Object;

    iput-object v4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->v:Ljava/lang/Object;

    iput v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->w:I

    iput v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->x:I

    iput v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;->y:I

    invoke-virtual {v6, v7, v4, p0}, Llk/c;->b(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v2, p1

    move-object p1, v1

    move-object v0, v4

    move-object v1, v7

    :goto_2
    :try_start_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v2, v5}, Luu/a;->e(Ljava/lang/Object;)V

    return-object p1

    :cond_5
    :try_start_3
    sget-object p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->b:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v1, v0}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;->a(Landroid/content/Context;Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v2, v5}, Luu/a;->e(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v2, p1

    move-object p1, v0

    :goto_3
    invoke-interface {v2, v5}, Luu/a;->e(Ljava/lang/Object;)V

    throw p1
.end method
