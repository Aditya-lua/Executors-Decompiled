.class public final Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;->doWork(Leu/b;)Ljava/lang/Object;
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
        "Landroidx/work/c$a;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.ads.GmaSdkBackgroundInstallWorker$doWork$2"
    f = "GmaSdkBackgroundInstallWorker.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00070\u0001\u00a2\u0006\u0002\u0008\u0002*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lav/p0;",
        "Landroidx/work/c$a;",
        "Lkotlin/jvm/internal/EnhancedNullability;",
        "<anonymous>",
        "(Lav/p0;)Landroidx/work/c$a;"
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

.field public final synthetic u:Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;",
            "Leu/b<",
            "-",
            "Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;->u:Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 1
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

    new-instance p1, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;

    iget-object v0, p0, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;->u:Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;

    invoke-direct {p1, v0, p2}, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;-><init>(Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;Leu/b;)V

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
            "Landroidx/work/c$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;->t:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    const-string p1, "gmasdk"

    invoke-static {p1}, Lai/h;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker$c;->u:Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;

    invoke-virtual {v0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lok/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "foreground"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "GmaSdkBgInstallWorker"

    if-eqz v0, :cond_1

    const-string p1, "App returned to foreground before delay elapsed; skipping background install"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v0, "Installing GMA SDK in background"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Lai/h;->m(Ljava/lang/String;)V

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
