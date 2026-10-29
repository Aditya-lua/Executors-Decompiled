.class public final Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->doWork(Lnt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$doWork$2"
    f = "RecentlyPlayedWidgetUpdateWorker.kt"
    l = {
        0x2b,
        0x32,
        0x33
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;


# direct methods
.method public constructor <init>(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->w:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 1
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

    new-instance p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;

    iget-object v0, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->w:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

    invoke-direct {p1, v0, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;-><init>(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->v:I

    const-string v2, "getApplicationContext(...)"

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->u:Ljava/lang/Object;

    check-cast v0, Llk/c;

    iget-object v0, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->t:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->u:Ljava/lang/Object;

    check-cast v1, Llk/c;

    iget-object v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->t:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    iget-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->u:Ljava/lang/Object;

    check-cast v1, Llk/c;

    iget-object v5, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->t:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->w:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

    invoke-virtual {p1}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object p1

    const-string v1, "recently_played_json_list"

    invoke-virtual {p1, v1}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance v1, Llk/c;

    invoke-direct {v1}, Llk/c;-><init>()V

    iget-object v6, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->w:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

    invoke-virtual {v6}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->t:Ljava/lang/Object;

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->u:Ljava/lang/Object;

    iput v5, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->v:I

    invoke-virtual {v1, v6, p1, p0}, Llk/c;->e(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v8, v5

    move-object v5, p1

    move-object p1, v8

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->w:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

    invoke-virtual {p1}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->t:Ljava/lang/Object;

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->u:Ljava/lang/Object;

    iput v4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->v:I

    invoke-static {p1, v6, v5, p0}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->b(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_2

    :cond_7
    move-object v2, v5

    :goto_1
    iget-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->w:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->t:Ljava/lang/Object;

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->u:Ljava/lang/Object;

    iput v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;->v:I

    invoke-static {p1, p0}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->c(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_2
    return-object v0

    :cond_8
    :goto_3
    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object p1

    return-object p1
.end method
