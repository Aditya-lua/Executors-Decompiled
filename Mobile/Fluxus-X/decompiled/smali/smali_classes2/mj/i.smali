.class public final synthetic Lmj/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/purchase/IAPPurchaseManager$g;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lmj/p;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/purchase/IAPPurchaseManager$g;Landroid/app/Activity;Lmj/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmj/i;->a:Lcom/roblox/client/purchase/IAPPurchaseManager$g;

    iput-object p2, p0, Lmj/i;->b:Landroid/app/Activity;

    iput-object p3, p0, Lmj/i;->c:Lmj/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lmj/i;->a:Lcom/roblox/client/purchase/IAPPurchaseManager$g;

    iget-object v1, p0, Lmj/i;->b:Landroid/app/Activity;

    iget-object v2, p0, Lmj/i;->c:Lmj/p;

    invoke-static {v0, v1, v2}, Lcom/roblox/client/purchase/IAPPurchaseManager$g;->f(Lcom/roblox/client/purchase/IAPPurchaseManager$g;Landroid/app/Activity;Lmj/p;)V

    return-void
.end method
