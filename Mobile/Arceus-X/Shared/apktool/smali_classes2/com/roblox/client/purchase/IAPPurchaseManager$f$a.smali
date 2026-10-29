.class public Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/purchase/IAPPurchaseManager$f;->e(Lej/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lej/k;

.field public final synthetic b:Ljava/lang/CharSequence;

.field public final synthetic c:Lcom/roblox/client/purchase/IAPPurchaseManager$f;


# direct methods
.method public constructor <init>(Lcom/roblox/client/purchase/IAPPurchaseManager$f;Lej/k;Ljava/lang/CharSequence;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;->c:Lcom/roblox/client/purchase/IAPPurchaseManager$f;

    iput-object p2, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;->a:Lej/k;

    iput-object p3, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;->b:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;->a:Lej/k;

    invoke-virtual {v0}, Lej/k;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;->c:Lcom/roblox/client/purchase/IAPPurchaseManager$f;

    iget-object v0, v0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    iget-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;->b:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->o(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;->c:Lcom/roblox/client/purchase/IAPPurchaseManager$f;

    iget-object v0, v0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    iget-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;->b:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->g(Lcom/roblox/client/purchase/IAPPurchaseManager;Ljava/lang/String;)V

    return-void
.end method
