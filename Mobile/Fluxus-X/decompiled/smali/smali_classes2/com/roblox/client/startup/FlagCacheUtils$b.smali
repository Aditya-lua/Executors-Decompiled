.class public final Lcom/roblox/client/startup/FlagCacheUtils$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/startup/FlagCacheUtils;->flushPendingVersionBWrite(Landroid/content/Context;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.startup.FlagCacheUtils$flushPendingVersionBWrite$1"
    f = "FlagCacheUtils.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
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

.field public final synthetic u:Lcom/roblox/client/startup/b$b;

.field public final synthetic v:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/roblox/client/startup/b$b;Landroid/content/Context;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/startup/b$b;",
            "Landroid/content/Context;",
            "Leu/b<",
            "-",
            "Lcom/roblox/client/startup/FlagCacheUtils$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/startup/FlagCacheUtils$b;->u:Lcom/roblox/client/startup/b$b;

    iput-object p2, p0, Lcom/roblox/client/startup/FlagCacheUtils$b;->v:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance p1, Lcom/roblox/client/startup/FlagCacheUtils$b;

    iget-object v0, p0, Lcom/roblox/client/startup/FlagCacheUtils$b;->u:Lcom/roblox/client/startup/b$b;

    iget-object v1, p0, Lcom/roblox/client/startup/FlagCacheUtils$b;->v:Landroid/content/Context;

    invoke-direct {p1, v0, v1, p2}, Lcom/roblox/client/startup/FlagCacheUtils$b;-><init>(Lcom/roblox/client/startup/b$b;Landroid/content/Context;Leu/b;)V

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/startup/FlagCacheUtils$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/startup/FlagCacheUtils$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/startup/FlagCacheUtils$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/startup/FlagCacheUtils$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/roblox/client/startup/FlagCacheUtils$b;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/startup/FlagCacheUtils$b;->u:Lcom/roblox/client/startup/b$b;

    iget-object v0, p0, Lcom/roblox/client/startup/FlagCacheUtils$b;->v:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/roblox/client/startup/FlagCacheUtils;->writeVersionBCacheFromResponse(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->A3()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/roblox/client/startup/FlagCacheUtils;->INSTANCE:Lcom/roblox/client/startup/FlagCacheUtils;

    iget-object v0, p0, Lcom/roblox/client/startup/FlagCacheUtils$b;->v:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/roblox/client/startup/FlagCacheUtils;->access$setVersionBCacheWrittenByWorker(Lcom/roblox/client/startup/FlagCacheUtils;Landroid/content/Context;Z)V

    :cond_0
    const-string p1, "FlagCacheUtils"

    const-string v0, "[VersionB] Pending write flushed."

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
