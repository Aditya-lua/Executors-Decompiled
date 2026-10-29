.class public Lcom/roblox/client/purchase/IAPPurchaseManager$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/purchase/IAPPurchaseManager;->B(JLjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/purchase/IAPPurchaseManager;


# direct methods
.method public constructor <init>(Lcom/roblox/client/purchase/IAPPurchaseManager;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$b;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/purchase/IAPPurchaseManager$b;->a:Lcom/roblox/client/purchase/IAPPurchaseManager;

    sget v1, Lsg/q0;->q1:I

    invoke-static {v0, v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->h(Lcom/roblox/client/purchase/IAPPurchaseManager;I)V

    return-void
.end method
