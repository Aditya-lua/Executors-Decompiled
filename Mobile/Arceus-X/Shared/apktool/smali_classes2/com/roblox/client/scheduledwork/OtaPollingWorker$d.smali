.class public final Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/scheduledwork/OtaPollingWorker;->doWork(Lnt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.scheduledwork.OtaPollingWorker$doWork$2"
    f = "OtaPollingWorker.kt"
    l = {
        0x127
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Lkotlin/jvm/internal/y;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public final synthetic x:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

.field public final synthetic y:Landroid/content/SharedPreferences;

.field public final synthetic z:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Landroid/content/SharedPreferences;Ljava/util/Set;Lkotlin/jvm/internal/y;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/scheduledwork/OtaPollingWorker;",
            "Landroid/content/SharedPreferences;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/internal/y;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->x:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    iput-object p2, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->y:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->z:Ljava/util/Set;

    iput-object p4, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->A:Lkotlin/jvm/internal/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;

    iget-object v1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->x:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    iget-object v2, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->y:Landroid/content/SharedPreferences;

    iget-object v3, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->z:Ljava/util/Set;

    iget-object v4, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->A:Lkotlin/jvm/internal/y;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;-><init>(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Landroid/content/SharedPreferences;Ljava/util/Set;Lkotlin/jvm/internal/y;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->w:I

    const-string v2, "behavior_name"

    const-string v3, "OtaPollingWorker"

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->v:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->u:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v5, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->t:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->x:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    iget-object v1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->y:Landroid/content/SharedPreferences;

    iget-object v5, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->z:Ljava/util/Set;

    invoke-static {p1, v1, v5}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->i(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Landroid/content/SharedPreferences;Ljava/util/Set;)V

    iget-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->z:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v5, p1

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    sget-object p1, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->INSTANCE:Lcom/roblox/client/scheduledwork/OtaConfigHandler;

    iget-object v6, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->y:Landroid/content/SharedPreferences;

    invoke-virtual {p1, v6, v1}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->getConfigUrl(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "OtaPollingWorker: no config URL for "

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", skipping"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_3
    :try_start_1
    iget-object v6, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->x:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    iget-object v7, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->y:Landroid/content/SharedPreferences;

    iput-object v5, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->t:Ljava/lang/Object;

    iput-object v1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->u:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->w:I

    invoke-static {v6, v1, p1, v7, p0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->h(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p1, Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;

    if-eqz p1, :cond_2

    iget-object v6, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->x:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    const-string v7, "ota_polling_worker_patch_downloaded"

    new-instance v8, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-direct {v8, v2, v1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v10, "asset_id"

    invoke-virtual {p1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;->a()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v9, v10, v11}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v11, "asset_version"

    invoke-virtual {p1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;->b()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v10, v11, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v8, v9, v10}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {v6, v7, p1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->g(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/util/List;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "OtaPollingWorker: IO error for "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " ("

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ": "

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "), will retry"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v6, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->x:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->f(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->x:Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    new-instance v8, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v9, "error_type"

    invoke-direct {v8, v9, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-direct {p1, v2, v1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v9, "failed_host"

    invoke-direct {v1, v9, v6}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v8, p1, v1}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string v1, "ota_polling_worker_error"

    invoke-static {v7, v1, p1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->g(Lcom/roblox/client/scheduledwork/OtaPollingWorker;Ljava/lang/String;Ljava/util/List;)V

    iget-object p1, p0, Lcom/roblox/client/scheduledwork/OtaPollingWorker$d;->A:Lkotlin/jvm/internal/y;

    iput-boolean v4, p1, Lkotlin/jvm/internal/y;->a:Z

    goto/16 :goto_0

    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
