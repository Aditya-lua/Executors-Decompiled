.class public final Lnj/f0$c$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnj/f0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1$1"
    f = "IAPPurchaseManagerV2.kt"
    l = {
        0x42
    }
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

.field public final synthetic u:Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;


# direct methods
.method public constructor <init>(Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;",
            "Leu/b<",
            "-",
            "Lnj/f0$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnj/f0$c$a;->u:Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lnj/f0$c$a;->p(Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeFinishPaymentsProtocolPurchaseV2(Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
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

    new-instance p1, Lnj/f0$c$a;

    iget-object v0, p0, Lnj/f0$c$a;->u:Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;

    invoke-direct {p1, v0, p2}, Lnj/f0$c$a;-><init>(Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lnj/f0$c$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lnj/f0$c$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnj/f0$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lnj/f0$c$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lnj/f0$c$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnj/f0$c$a;->u:Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;

    new-instance v1, Lnj/g0;

    invoke-direct {v1, p1}, Lnj/g0;-><init>(Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;)V

    iput v2, p0, Lnj/f0$c$a;->t:I

    const/4 p1, 0x0

    invoke-static {p1, v1, p0, v2, p1}, Lav/a2;->c(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Leu/b;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
