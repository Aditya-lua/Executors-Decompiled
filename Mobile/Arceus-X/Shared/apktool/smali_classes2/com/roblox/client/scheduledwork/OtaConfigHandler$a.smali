.class public final Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/scheduledwork/OtaConfigHandler;->checkAndPromoteWorkerBlob(Landroid/content/Context;Ljava/lang/String;)V
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
    c = "com.roblox.client.scheduledwork.OtaConfigHandler$checkAndPromoteWorkerBlob$1"
    f = "OtaConfigHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Landroid/content/Context;

.field public final synthetic B:Ljava/lang/String;

.field public final synthetic C:Lorg/json/JSONObject;

.field public t:I

.field public final synthetic u:Ljava/io/File;

.field public final synthetic v:J

.field public final synthetic w:J

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/File;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "JJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->u:Ljava/io/File;

    iput-wide p2, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->v:J

    iput-wide p4, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->w:J

    iput-object p6, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->x:Ljava/lang/String;

    iput-object p7, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->y:Ljava/lang/String;

    iput-object p8, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->z:Ljava/lang/String;

    iput-object p9, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->A:Landroid/content/Context;

    iput-object p10, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->B:Ljava/lang/String;

    iput-object p11, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->C:Lorg/json/JSONObject;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p12}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 13
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

    new-instance v0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;

    iget-object v1, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->u:Ljava/io/File;

    iget-wide v2, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->v:J

    iget-wide v4, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->w:J

    iget-object v6, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->x:Ljava/lang/String;

    iget-object v7, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->y:Ljava/lang/String;

    iget-object v8, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->z:Ljava/lang/String;

    iget-object v9, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->A:Landroid/content/Context;

    iget-object v10, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->B:Ljava/lang/String;

    iget-object v11, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->C:Lorg/json/JSONObject;

    move-object v12, p2

    invoke-direct/range {v0 .. v12}, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;-><init>(Ljava/io/File;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->t:I

    if-nez v0, :cond_2

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->u:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string p1, "getAbsolutePath(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->v:J

    iget-wide v3, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->w:J

    iget-object v5, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->x:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->access$nativeVerifyAndPromoteBlob(Ljava/lang/String;JJLjava/lang/String;)Z

    move-result p1

    sget-object v0, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->INSTANCE:Lcom/roblox/client/scheduledwork/OtaConfigHandler;

    if-eqz p1, :cond_0

    const-string v1, "ota_promote_success"

    goto :goto_0

    :cond_0
    const-string v1, "ota_promote_failed"

    :goto_0
    new-instance v2, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v3, "behavior_name"

    iget-object v4, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->x:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    iget-wide v4, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->v:J

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const-string v5, "asset_id"

    invoke-direct {v3, v5, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lcom/roblox/client/datastructures/NameValuePair;

    iget-wide v5, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->w:J

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    const-string v6, "asset_version"

    invoke-direct {v4, v6, v5}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v2, v3, v4}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "background_ota_worker"

    invoke-virtual {v0, v1, v3, v2}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->logEvent$NativeShell_googleProdRelease(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    if-eqz p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->y:Ljava/lang/String;

    iget-object v0, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->z:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->access$nativeCommitOtaConfig(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sget-object v1, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->INSTANCE:Lcom/roblox/client/scheduledwork/OtaConfigHandler;

    iget-object v2, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->A:Landroid/content/Context;

    iget-object v3, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->y:Ljava/lang/String;

    iget-object v4, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->B:Ljava/lang/String;

    iget-object v5, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->C:Lorg/json/JSONObject;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->writeConfigToAppStorage-yxL6bBk$default(Lcom/roblox/client/scheduledwork/OtaConfigHandler;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/scheduledwork/OtaConfigHandler$a;->x:Ljava/lang/String;

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkAndPromoteWorkerBlob: writeConfigToAppStorage failed for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "OtaConfigHandler"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
