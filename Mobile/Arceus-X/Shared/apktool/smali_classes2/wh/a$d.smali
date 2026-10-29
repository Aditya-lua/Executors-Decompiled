.class public Lwh/a$d;
.super Lwh/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

.field public final synthetic b:Lwh/a;


# direct methods
.method public constructor <init>(Lwh/a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lwh/a$d;->b:Lwh/a;

    invoke-direct {p0}, Lwh/k;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwh/a;Lwh/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lwh/a$d;-><init>(Lwh/a;)V

    return-void
.end method


# virtual methods
.method public b(J)V
    .locals 0

    iget-object p1, p0, Lwh/a$d;->b:Lwh/a;

    invoke-static {p1}, Lwh/a;->D2(Lwh/a;)Lnk/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lwh/a$d;->b:Lwh/a;

    invoke-static {p1}, Lwh/a;->D2(Lwh/a;)Lnk/a;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lnk/a;->d(Z)V

    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lwh/a$d;->b:Lwh/a;

    invoke-static {p1}, Lwh/a;->A2(Lwh/a;)Lwh/a$f;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lwh/a$d;->b:Lwh/a;

    invoke-static {p1}, Lwh/a;->A2(Lwh/a;)Lwh/a$f;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lsg/f0;->f(Z)V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lwh/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    if-nez v0, :cond_0

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    new-instance v1, Lwh/a$c;

    iget-object v2, p0, Lwh/a$d;->b:Lwh/a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lwh/a$c;-><init>(Lwh/a;Lwh/b;)V

    new-instance v2, Lwh/a$e;

    iget-object v4, p0, Lwh/a$d;->b:Lwh/a;

    invoke-direct {v2, v4, v3}, Lwh/a$e;-><init>(Lwh/a;Lwh/b;)V

    invoke-virtual {v0, v1, v2}, Lsg/y;->a(Lwh/n$a;Lwh/n$b;)Lwh/n;

    move-result-object v0

    iput-object v0, p0, Lwh/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    :cond_0
    iget-object v0, p0, Lwh/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lwh/a$d;->b:Lwh/a;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    invoke-static {v0, p2, p1}, Lsg/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public j(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lwh/a$d;->b:Lwh/a;

    invoke-static {v0}, Lwh/a;->E2(Lwh/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->y(JLjava/lang/String;)V

    return-void
.end method

.method public k(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lwh/a$d;->b:Lwh/a;

    invoke-static {v0}, Lwh/a;->E2(Lwh/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->z(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lwh/a$d;->b:Lwh/a;

    invoke-static {v0}, Lwh/a;->E2(Lwh/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->A(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public m(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lwh/a$d;->b:Lwh/a;

    invoke-static {v0}, Lwh/a;->E2(Lwh/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->B(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public n(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lwh/a$d;->b:Lwh/a;

    invoke-static {v0}, Lwh/a;->E2(Lwh/a;)Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-result-object v1

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/roblox/client/purchase/IAPPurchaseManager;->C(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public r()Lwh/w0;
    .locals 1

    iget-object v0, p0, Lwh/a$d;->b:Lwh/a;

    invoke-static {v0}, Lwh/a;->C2(Lwh/a;)Lwh/w0;

    move-result-object v0

    return-object v0
.end method

.method public v()V
    .locals 5

    iget-object v0, p0, Lwh/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    if-nez v0, :cond_0

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    new-instance v1, Lwh/a$c;

    iget-object v2, p0, Lwh/a$d;->b:Lwh/a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lwh/a$c;-><init>(Lwh/a;Lwh/b;)V

    new-instance v2, Lwh/a$e;

    iget-object v4, p0, Lwh/a$d;->b:Lwh/a;

    invoke-direct {v2, v4, v3}, Lwh/a$e;-><init>(Lwh/a;Lwh/b;)V

    invoke-virtual {v0, v1, v2}, Lsg/y;->a(Lwh/n$a;Lwh/n$b;)Lwh/n;

    move-result-object v0

    iput-object v0, p0, Lwh/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    :cond_0
    iget-object v0, p0, Lwh/a$d;->a:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    check-cast v0, Lwh/n;

    invoke-virtual {v0}, Lwh/n;->g()V

    return-void
.end method
