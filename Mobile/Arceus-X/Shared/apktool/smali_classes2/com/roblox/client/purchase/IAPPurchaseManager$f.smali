.class public Lcom/roblox/client/purchase/IAPPurchaseManager$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwh/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/purchase/IAPPurchaseManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/purchase/IAPPurchaseManager;


# direct methods
.method public constructor <init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZJLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->i(Lcom/roblox/client/purchase/IAPPurchaseManager;ZJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(Lej/k;)V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->f(Lcom/roblox/client/purchase/IAPPurchaseManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->e(Lcom/roblox/client/purchase/IAPPurchaseManager;)Lej/a;

    move-result-object v0

    invoke-interface {v0}, Lej/a;->f0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->e(Lcom/roblox/client/purchase/IAPPurchaseManager;)Lej/a;

    move-result-object v0

    invoke-interface {v0}, Lej/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lej/k;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    sget v1, Lsg/q0;->s1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->r(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v0}, Lej/k;->c(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$f;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    new-instance v2, Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;

    invoke-direct {v2, p0, p1, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager$f$a;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager$f;Lej/k;Ljava/lang/CharSequence;)V

    invoke-virtual {v1, v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->x(Ljava/lang/Runnable;)V

    return-void
.end method
