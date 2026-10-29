.class public final Lcom/roblox/client/startup/FlagCacheUtils$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/startup/FlagCacheUtils;->scheduledFetchFlag(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
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
        "Lak/f0;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "Lak/f0;",
        "<anonymous>",
        "(Lku/p0;)Lak/f0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.startup.FlagCacheUtils$scheduledFetchFlag$2"
    f = "FlagCacheUtils.kt"
    l = {
        0x79
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public v:J

.field public w:I

.field public final synthetic x:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/startup/FlagCacheUtils$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->x:Landroid/content/Context;

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

    new-instance p1, Lcom/roblox/client/startup/FlagCacheUtils$c;

    iget-object v0, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->x:Landroid/content/Context;

    invoke-direct {p1, v0, p2}, Lcom/roblox/client/startup/FlagCacheUtils$c;-><init>(Landroid/content/Context;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/startup/FlagCacheUtils$c;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lak/f0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/startup/FlagCacheUtils$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/startup/FlagCacheUtils$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/startup/FlagCacheUtils$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-wide v4, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->v:J

    iget v1, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->u:I

    iget-object v6, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->t:Ljava/lang/Object;

    check-cast v6, Lcom/roblox/client/startup/b$b;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move p1, v1

    move-object v1, v6

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    sget-object p1, Lju/b;->e:Lju/b;

    invoke-static {v3, p1}, Lkotlin/time/b;->p(ILju/b;)J

    move-result-wide v4

    const/4 p1, 0x5

    move-object v1, v2

    :cond_2
    :goto_0
    if-lez p1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Attempting to fetch flags, retries left: "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v6, "FlagCacheUtils"

    invoke-static {v6, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->x:Landroid/content/Context;

    invoke-static {v1}, Lcom/roblox/client/startup/b;->b(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-lez v7, :cond_3

    invoke-virtual {v1}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Successfully fetched flags. Response size: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v6, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_3
    add-int/lit8 p1, p1, -0x1

    if-lez p1, :cond_2

    iput-object v1, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->t:Ljava/lang/Object;

    iput p1, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->u:I

    iput-wide v4, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->v:J

    iput v3, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->w:I

    invoke-static {v4, v5, p0}, Lku/z0;->c(JLnt/b;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    const/4 v6, 0x2

    invoke-static {v4, v5, v6}, Lkotlin/time/a;->O(JI)J

    move-result-wide v4

    goto :goto_0

    :cond_5
    :goto_2
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_6
    move-object p1, v2

    :goto_3
    const/4 v0, 0x0

    if-eqz p1, :cond_e

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_7

    :cond_7
    iget-object p1, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->x:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/roblox/client/startup/FlagCacheUtils;->writeVersionBCacheFromResponse(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V

    sget-object p1, Lcom/roblox/client/startup/FlagCacheUtils;->INSTANCE:Lcom/roblox/client/startup/FlagCacheUtils;

    iget-object v4, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->x:Landroid/content/Context;

    invoke-static {p1, v4, v3}, Lcom/roblox/client/startup/FlagCacheUtils;->access$setVersionBCacheWrittenByWorker(Lcom/roblox/client/startup/FlagCacheUtils;Landroid/content/Context;Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->c4()Z

    move-result p1

    if-eqz p1, :cond_b

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/roblox/client/startup/b$b;->c()Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_4

    :cond_8
    move-object p1, v2

    :goto_4
    if-eqz p1, :cond_b

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v5, Lth/f;->a:Lth/f;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v6

    const-string v7, "get(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Lth/f;->m(Lth/g;)Lkotlin/sequences/Sequence;

    move-result-object v5

    invoke-interface {v5}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/roblox/client/flags/a;

    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v6}, Lcom/roblox/client/flags/a;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lcom/roblox/client/flags/a;->d()Ljava/lang/Object;

    move-result-object v6

    const-string v9, "initial(...)"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual {p1, v7, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-static {v6}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface {v4, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_a
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_b

    sget-object p1, Lth/f;->a:Lth/f;

    iget-object v5, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->x:Landroid/content/Context;

    invoke-static {v5}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    const-string v6, "getKeyValues(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v4, v5, v3}, Lth/f;->j(Ljava/util/Map;Landroid/content/SharedPreferences;Z)V

    :cond_b
    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/roblox/client/startup/b$b;->c()Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_c

    iget-object v4, p0, Lcom/roblox/client/startup/FlagCacheUtils$c;->x:Landroid/content/Context;

    invoke-static {p1, v4}, Lvg/g;->b(Lorg/json/JSONObject;Landroid/content/Context;)V

    :cond_c
    new-instance p1, Lak/f0;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lcom/roblox/client/startup/b$b;->c()Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_6

    :cond_d
    move-object v1, v2

    :goto_6
    invoke-direct {p1, v1, v3, v0, v2}, Lak/f0;-><init>(Lorg/json/JSONObject;ZZLjava/lang/String;)V

    return-object p1

    :cond_e
    :goto_7
    new-instance p1, Lak/f0;

    const-string v1, "Error fetching flags: response body is empty after retries"

    invoke-direct {p1, v2, v0, v3, v1}, Lak/f0;-><init>(Lorg/json/JSONObject;ZZLjava/lang/String;)V

    return-object p1
.end method
