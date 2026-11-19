.class public Lcom/roblox/client/purchase/IAPPurchaseManager$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmj/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/purchase/IAPPurchaseManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final synthetic d:Lcom/roblox/client/purchase/IAPPurchaseManager;


# direct methods
.method public constructor <init>(Lcom/roblox/client/purchase/IAPPurchaseManager;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->d:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->a:J

    iput-object p4, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->c:Ljava/lang/String;

    return-void
.end method

.method public static synthetic f(Lcom/roblox/client/purchase/IAPPurchaseManager$g;Landroid/app/Activity;Lmj/p;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->g(Landroid/app/Activity;Lmj/p;)V

    return-void
.end method


# virtual methods
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

.method public e(Lmj/p;)V
    .locals 7

    instance-of v0, p1, Lmj/j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lmj/j;

    invoke-interface {v0}, Lmj/j;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const-string v0, ""

    goto :goto_0

    :goto_1
    sget-object v0, Lcom/roblox/client/purchase/IAPPurchaseManager;->l:Ljava/lang/String;

    iget-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->d:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->j(Lcom/roblox/client/purchase/IAPPurchaseManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->d:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->h(Lcom/roblox/client/purchase/IAPPurchaseManager;)Lmj/a;

    move-result-object v0

    invoke-interface {v0}, Lmj/a;->e0()Landroid/app/Activity;

    move-result-object v0

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->d:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->h(Lcom/roblox/client/purchase/IAPPurchaseManager;)Lmj/a;

    move-result-object v0

    invoke-interface {v0}, Lmj/a;->q0()Lcom/roblox/client/b;

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->d:Lcom/roblox/client/purchase/IAPPurchaseManager;

    new-instance v2, Lmj/i;

    invoke-direct {v2, p0, v0, p1}, Lmj/i;-><init>(Lcom/roblox/client/purchase/IAPPurchaseManager$g;Landroid/app/Activity;Lmj/p;)V

    invoke-virtual {v1, v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->E(Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->d:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->i(Lcom/roblox/client/purchase/IAPPurchaseManager;)Lei/s0;

    move-result-object v0

    invoke-interface {v0, p1}, Lmj/o;->e(Lmj/p;)V

    :cond_3
    :goto_3
    iget-object v1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->d:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-virtual {p1}, Lmj/p;->d()Z

    move-result v2

    iget-wide v3, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->a:J

    iget-object v5, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->b:Ljava/lang/String;

    invoke-static/range {v1 .. v6}, Lcom/roblox/client/purchase/IAPPurchaseManager;->m(Lcom/roblox/client/purchase/IAPPurchaseManager;ZJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic g(Landroid/app/Activity;Lmj/p;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->b:Ljava/lang/String;

    invoke-static {p1, p2, v0}, Lmj/l;->c(Landroid/app/Activity;Lmj/p;Ljava/lang/CharSequence;)V

    return-void
.end method
