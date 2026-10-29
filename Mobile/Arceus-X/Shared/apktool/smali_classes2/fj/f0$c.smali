.class public final Lfj/f0$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfj/f0;->a(Lv7/k;Ljava/lang/String;Ljava/lang/String;ZLfj/f0$b;)V
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
    c = "com.roblox.client.purchase.google.IAPPurchaseManagerV2$launchVerifyPurchaseReceipt$1"
    f = "IAPPurchaseManagerV2.kt"
    l = {
        0x41
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Z

.field public final synthetic x:Lfj/f0$b;

.field public final synthetic y:Lv7/k;

.field public final synthetic z:Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLfj/f0$b;Lv7/k;Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lfj/f0$b;",
            "Lv7/k;",
            "Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;",
            "Lnt/b<",
            "-",
            "Lfj/f0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfj/f0$c;->u:Ljava/lang/String;

    iput-object p2, p0, Lfj/f0$c;->v:Ljava/lang/String;

    iput-boolean p3, p0, Lfj/f0$c;->w:Z

    iput-object p4, p0, Lfj/f0$c;->x:Lfj/f0$b;

    iput-object p5, p0, Lfj/f0$c;->y:Lv7/k;

    iput-object p6, p0, Lfj/f0$c;->z:Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 8
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

    new-instance v0, Lfj/f0$c;

    iget-object v1, p0, Lfj/f0$c;->u:Ljava/lang/String;

    iget-object v2, p0, Lfj/f0$c;->v:Ljava/lang/String;

    iget-boolean v3, p0, Lfj/f0$c;->w:Z

    iget-object v4, p0, Lfj/f0$c;->x:Lfj/f0$b;

    iget-object v5, p0, Lfj/f0$c;->y:Lv7/k;

    iget-object v6, p0, Lfj/f0$c;->z:Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lfj/f0$c;-><init>(Ljava/lang/String;Ljava/lang/String;ZLfj/f0$b;Lv7/k;Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lfj/f0$c;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfj/f0$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lfj/f0$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lfj/f0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lfj/f0$c;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lku/e3; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, Lfj/f0$c$a;

    iget-object v1, p0, Lfj/f0$c;->z:Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;

    const/4 v3, 0x0

    invoke-direct {p1, v1, v3}, Lfj/f0$c$a;-><init>(Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;Lnt/b;)V

    iput v2, p0, Lfj/f0$c;->t:I

    const-wide/16 v1, 0x7530

    invoke-static {v1, v2, p1, p0}, Lku/g3;->c(JLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lku/e3; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_2

    return-object v0

    :catch_0
    iget-object p1, p0, Lfj/f0$c;->u:Ljava/lang/String;

    iget-object v0, p0, Lfj/f0$c;->v:Ljava/lang/String;

    iget-boolean v1, p0, Lfj/f0$c;->w:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nativeFinishPaymentsProtocolPurchaseV2 timed out. orderId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", productId="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", isInAppPurchase="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lfj/f0$c;->x:Lfj/f0$b;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lfj/f0$c;->u:Ljava/lang/String;

    iget-object v1, p0, Lfj/f0$c;->y:Lv7/k;

    invoke-virtual {v1}, Lv7/k;->g()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getPurchaseToken(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, v1}, Lfj/f0$b;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
