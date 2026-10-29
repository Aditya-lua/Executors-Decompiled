.class public Lcom/roblox/client/purchase/IAPPurchaseManager$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/purchase/IAPPurchaseManager;->paymentsProtocolPurchaseFinished(Lej/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lej/k;

.field public final synthetic b:Ljava/lang/CharSequence;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lej/k;Ljava/lang/CharSequence;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$e;->a:Lej/k;

    iput-object p2, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$e;->b:Ljava/lang/CharSequence;

    iput-object p3, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$e;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$e;->a:Lej/k;

    invoke-virtual {v0}, Lej/k;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$e;->b:Ljava/lang/CharSequence;

    iget-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$e;->c:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->l(Ljava/lang/CharSequence;Landroid/app/Activity;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/roblox/client/purchase/IAPPurchaseManager;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/roblox/client/purchase/IAPPurchaseManager;->j()Lej/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$e;->b:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lej/a;->W(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->h1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/roblox/client/purchase/IAPPurchaseManager;->j()Lej/a;

    move-result-object v0

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/a;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/roblox/client/a;

    iget-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$e;->b:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->W(Ljava/lang/String;)V

    return-void

    :cond_2
    const-string v0, "rbx.purchaseflow"

    const-string v1, "PaymentsProtocol: paymentsProtocolPurchaseFinished stored_mActivityInterface.getRobloxActivity() is null."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Payments-Protocol-Purchase-Finished-Null-Activity"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-static {}, Lcom/roblox/client/purchase/IAPPurchaseManager;->j()Lej/a;

    move-result-object v0

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$e;->b:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->W(Ljava/lang/String;)V

    return-void
.end method
