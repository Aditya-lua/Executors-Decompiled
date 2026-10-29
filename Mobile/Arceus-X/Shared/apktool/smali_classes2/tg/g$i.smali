.class public final Ltg/g$i;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg/g;->initializeSdk(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
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
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.ads.NativeAdsHandler$initializeSdk$1"
    f = "NativeAdsHandler.kt"
    l = {
        0xb1
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ltg/g;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ltg/g;Ljava/lang/String;Ljava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Ltg/g$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltg/g$i;->u:Ltg/g;

    iput-object p2, p0, Ltg/g$i;->v:Ljava/lang/String;

    iput-object p3, p0, Ltg/g$i;->w:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltg/g$i;

    iget-object v1, p0, Ltg/g$i;->u:Ltg/g;

    iget-object v2, p0, Ltg/g$i;->v:Ljava/lang/String;

    iget-object v3, p0, Ltg/g$i;->w:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Ltg/g$i;-><init>(Ltg/g;Ljava/lang/String;Ljava/lang/String;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Ltg/g$i;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ltg/g$i;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ltg/g$i;->u:Ltg/g;

    invoke-static {p1}, Ltg/g;->d(Ltg/g;)Ltl/c;

    move-result-object p1

    instance-of p1, p1, Lcom/roblox/universalapp/ads/NoopGmaSdkController;

    if-eqz p1, :cond_3

    iget-object p1, p0, Ltg/g$i;->u:Ltg/g;

    invoke-static {p1}, Ltg/g;->e(Ltg/g;)Ltl/i;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ltl/i;->a(Z)V

    iget-object p1, p0, Ltg/g$i;->u:Ltg/g;

    invoke-static {p1}, Ltg/g;->f(Ltg/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Ltg/g$i;->v:Ljava/lang/String;

    sget-object v1, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->NOTINSTALLED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    const-string v2, "gmasdk module not installed"

    invoke-virtual {p1, v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onInitializeSdkFailed(Ljava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;Ljava/lang/String;)V

    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_3
    iget-object p1, p0, Ltg/g$i;->u:Ltg/g;

    invoke-static {p1}, Ltg/g;->d(Ltg/g;)Ltl/c;

    move-result-object p1

    iget-object v1, p0, Ltg/g$i;->w:Ljava/lang/String;

    iput v2, p0, Ltg/g$i;->t:I

    invoke-interface {p1, v1, p0}, Ltl/c;->c(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    iget-object v0, p0, Ltg/g$i;->u:Ltg/g;

    iget-object v1, p0, Ltg/g$i;->v:Ljava/lang/String;

    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v2, p1

    check-cast v2, Lkotlin/Unit;

    invoke-static {v0}, Ltg/g;->f(Ltg/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onInitializeSdkSuccess(Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Ltg/g$i;->u:Ltg/g;

    iget-object v1, p0, Ltg/g$i;->v:Ljava/lang/String;

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    instance-of v2, p1, Ltl/b;

    if-eqz v2, :cond_6

    sget-object v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->NATIVESHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    goto :goto_1

    :cond_6
    instance-of v2, p1, Lku/e3;

    if-eqz v2, :cond_7

    sget-object v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->TIMEDOUT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    goto :goto_1

    :cond_7
    sget-object v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->UNDEFINED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    :goto_1
    invoke-static {v0}, Ltg/g;->f(Ltg/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    const-string p1, ""

    :cond_8
    invoke-virtual {v0, v1, v2, p1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onInitializeSdkFailed(Ljava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;Ljava/lang/String;)V

    :cond_9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ltg/g$i;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ltg/g$i;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ltg/g$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
