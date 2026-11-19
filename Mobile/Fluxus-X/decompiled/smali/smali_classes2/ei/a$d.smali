.class public Lei/a$d;
.super Lei/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

.field public final synthetic b:Lei/a;


# direct methods
.method public constructor <init>(Lei/a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lei/a$d;->b:Lei/a;

    invoke-direct {p0}, Lei/k;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lei/a;Lei/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lei/a$d;-><init>(Lei/a;)V

    return-void
.end method


# virtual methods
.method public b(J)V
    .locals 0

    iget-object p1, p0, Lei/a$d;->b:Lei/a;

    invoke-static {p1}, Lei/a;->D2(Lei/a;)Lvk/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lei/a$d;->b:Lei/a;

    invoke-static {p1}, Lei/a;->D2(Lei/a;)Lvk/a;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lvk/a;->d(Z)V

    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lei/a$d;->b:Lei/a;

    invoke-static {p1}, Lei/a;->A2(Lei/a;)Lei/a$f;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lei/a$d;->b:Lei/a;

    invoke-static {p1}, Lei/a;->A2(Lei/a;)Lei/a$f;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lbh/f0;->f(Z)V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lei/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    if-nez v0, :cond_0

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    new-instance v1, Lei/a$c;

    iget-object v2, p0, Lei/a$d;->b:Lei/a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lei/a$c;-><init>(Lei/a;Lei/b;)V

    new-instance v2, Lei/a$e;

    iget-object v4, p0, Lei/a$d;->b:Lei/a;

    invoke-direct {v2, v4, v3}, Lei/a$e;-><init>(Lei/a;Lei/b;)V

    invoke-virtual {v0, v1, v2}, Lbh/y;->a(Lei/n$a;Lei/n$b;)Lei/n;

    move-result-object v0

    iput-object v0, p0, Lei/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    :cond_0
    iget-object v0, p0, Lei/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lei/a$d;->b:Lei/a;

    invoke-virtual {v0}, Lf4/q;->p()Lf4/v;

    move-result-object v0

    invoke-static {v0, p2, p1}, Lbh/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public j(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lei/a$d;->b:Lei/a;

    invoke-static {v0}, Lei/a;->E2(Lei/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->F(JLjava/lang/String;)V

    return-void
.end method

.method public k(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lei/a$d;->b:Lei/a;

    invoke-static {v0}, Lei/a;->E2(Lei/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->G(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(JLjava/lang/String;Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;)V
    .locals 1

    iget-object v0, p0, Lei/a$d;->b:Lei/a;

    invoke-static {v0}, Lei/a;->E2(Lei/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->H(JLjava/lang/String;Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;)V

    return-void
.end method

.method public m(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lei/a$d;->b:Lei/a;

    invoke-static {v0}, Lei/a;->E2(Lei/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->I(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public n(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lei/a$d;->b:Lei/a;

    invoke-static {v0}, Lei/a;->E2(Lei/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->J(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lei/a$d;->b:Lei/a;

    invoke-static {v0}, Lei/a;->E2(Lei/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v1

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/client/purchase/IAPPurchaseManager;->K(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public s()Lei/x0;
    .locals 1

    iget-object v0, p0, Lei/a$d;->b:Lei/a;

    invoke-static {v0}, Lei/a;->C2(Lei/a;)Lei/x0;

    move-result-object v0

    return-object v0
.end method

.method public w()V
    .locals 5

    iget-object v0, p0, Lei/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    if-nez v0, :cond_0

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    new-instance v1, Lei/a$c;

    iget-object v2, p0, Lei/a$d;->b:Lei/a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lei/a$c;-><init>(Lei/a;Lei/b;)V

    new-instance v2, Lei/a$e;

    iget-object v4, p0, Lei/a$d;->b:Lei/a;

    invoke-direct {v2, v4, v3}, Lei/a$e;-><init>(Lei/a;Lei/b;)V

    invoke-virtual {v0, v1, v2}, Lbh/y;->a(Lei/n$a;Lei/n$b;)Lei/n;

    move-result-object v0

    iput-object v0, p0, Lei/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    :cond_0
    iget-object v0, p0, Lei/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    check-cast v0, Lei/n;

    invoke-virtual {v0}, Lei/n;->g()V

    return-void
.end method
