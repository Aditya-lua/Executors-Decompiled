.class public final Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->d(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
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
        "Ljava/util/List<",
        "+",
        "Lkotlin/Unit;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lku/p0;",
        "",
        "",
        "<anonymous>",
        "(Lku/p0;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$cacheThumbnails$2"
    f = "RecentlyPlayedWidgetUpdateWorker.kt"
    l = {
        0x68
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Landroid/content/Context;

.field public final synthetic B:Lk6/s;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

.field public final synthetic y:Lorg/json/JSONArray;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lorg/json/JSONArray;Ljava/lang/String;Landroid/content/Context;Lk6/s;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;",
            "Lorg/json/JSONArray;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Lk6/s;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->x:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

    iput-object p2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->y:Lorg/json/JSONArray;

    iput-object p3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->z:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->A:Landroid/content/Context;

    iput-object p5, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->B:Lk6/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 7
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

    new-instance v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;

    iget-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->x:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

    iget-object v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->y:Lorg/json/JSONArray;

    iget-object v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->z:Ljava/lang/String;

    iget-object v4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->A:Landroid/content/Context;

    iget-object v5, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->B:Lk6/s;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;-><init>(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lorg/json/JSONArray;Ljava/lang/String;Landroid/content/Context;Lk6/s;Lnt/b;)V

    iput-object p1, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Ljava/util/List<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->w:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lku/p0;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v3, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->v:I

    const/4 v8, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v8, :cond_0

    iget-object v1, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->u:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->t:Ljava/lang/Object;

    check-cast v1, Lku/l0;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v3, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->x:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;

    invoke-virtual {v3}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->e()Lku/l0;

    move-result-object v3

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v6, v5, v6}, Lku/l0;->U(Lku/l0;ILjava/lang/String;ILjava/lang/Object;)Lku/l0;

    move-result-object v3

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->y:Lorg/json/JSONArray;

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v10

    const/4 v4, 0x0

    move v11, v4

    :goto_0
    if-ge v11, v10, :cond_3

    iget-object v4, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->y:Lorg/json/JSONArray;

    invoke-virtual {v4, v11}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "thumbnailUrl"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v5, "placeId"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    new-instance v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;

    iget-object v15, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->z:Ljava/lang/String;

    iget-object v4, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->A:Landroid/content/Context;

    iget-object v6, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->B:Lk6/s;

    const/16 v18, 0x0

    move-object/from16 v16, v4

    move-object v12, v5

    move-object/from16 v17, v6

    invoke-direct/range {v12 .. v18}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lk6/s;Lnt/b;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lku/i;->b(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/w0;

    move-result-object v4

    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_3
    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->w:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->t:Ljava/lang/Object;

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->u:Ljava/lang/Object;

    iput v8, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->v:I

    invoke-static {v9, v0}, Lku/f;->a(Ljava/util/Collection;Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    return-object v2
.end method
