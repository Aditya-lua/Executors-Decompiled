.class public final synthetic Lej/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/purchase/IAPPurchaseManager;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lej/d;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lej/d;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->b(Lcom/roblox/client/purchase/IAPPurchaseManager;)V

    return-void
.end method
