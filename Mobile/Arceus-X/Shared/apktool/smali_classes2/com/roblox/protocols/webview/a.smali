.class public Lcom/roblox/protocols/webview/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnl/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/webview/a$f;
    }
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Lcom/roblox/protocols/webview/a$f;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/webview/a$f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/webview/a;->b:Lcom/roblox/protocols/webview/a$f;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/roblox/protocols/webview/a;->a:Landroid/os/Handler;

    return-void
.end method

.method public static bridge synthetic f(Lcom/roblox/protocols/webview/a;)Lcom/roblox/protocols/webview/a$f;
    .locals 0

    iget-object p0, p0, Lcom/roblox/protocols/webview/a;->b:Lcom/roblox/protocols/webview/a$f;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 3

    move-object p3, p2

    move-object p2, p1

    new-instance p1, Lnl/a;

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const-string p3, ""

    :goto_0
    const/4 p5, 0x1

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    goto :goto_1

    :cond_1
    move p4, p5

    :goto_1
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    move v0, p5

    sget-object p5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz p7, :cond_2

    invoke-virtual {p7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p7

    if-nez p7, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p7

    if-eqz p6, :cond_3

    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p6

    goto :goto_3

    :cond_3
    move p6, v1

    :goto_3
    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p6

    if-eqz p8, :cond_4

    invoke-virtual {p8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p8

    move-object v2, p7

    move-object p7, p6

    move-object p6, v2

    invoke-direct/range {p1 .. p8}, Lnl/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    iget-object p2, p0, Lcom/roblox/protocols/webview/a;->a:Landroid/os/Handler;

    new-instance p3, Lcom/roblox/protocols/webview/a$d;

    invoke-direct {p3, p0, p1}, Lcom/roblox/protocols/webview/a$d;-><init>(Lcom/roblox/protocols/webview/a;Lnl/a;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 7

    new-instance v0, Lnl/a;

    if-eqz p6, :cond_0

    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    invoke-direct/range {v0 .. v6}, Lnl/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    iget-object p1, p0, Lcom/roblox/protocols/webview/a;->a:Landroid/os/Handler;

    new-instance p2, Lcom/roblox/protocols/webview/a$b;

    invoke-direct {p2, p0, v0}, Lcom/roblox/protocols/webview/a$b;-><init>(Lcom/roblox/protocols/webview/a;Lnl/a;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/protocols/webview/a;->a:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/protocols/webview/a$e;

    invoke-direct {v1, p0}, Lcom/roblox/protocols/webview/a$e;-><init>(Lcom/roblox/protocols/webview/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 3

    move-object p3, p2

    move-object p2, p1

    new-instance p1, Lnl/a;

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const-string p3, ""

    :goto_0
    const/4 p5, 0x1

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    goto :goto_1

    :cond_1
    move p4, p5

    :goto_1
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    move v0, p5

    sget-object p5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz p7, :cond_2

    invoke-virtual {p7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p7

    if-nez p7, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p7

    if-eqz p6, :cond_3

    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p6

    move-object v2, p7

    move-object p7, p6

    move-object p6, v2

    invoke-direct/range {p1 .. p7}, Lnl/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    iget-object p2, p0, Lcom/roblox/protocols/webview/a;->a:Landroid/os/Handler;

    new-instance p3, Lcom/roblox/protocols/webview/a$c;

    invoke-direct {p3, p0, p1}, Lcom/roblox/protocols/webview/a$c;-><init>(Lcom/roblox/protocols/webview/a;Lnl/a;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 7

    new-instance v0, Lnl/a;

    if-eqz p2, :cond_0

    :goto_0
    move-object v2, p2

    goto :goto_1

    :cond_0
    const-string p2, ""

    goto :goto_0

    :goto_1
    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    goto :goto_2

    :cond_1
    const/4 p2, 0x1

    :goto_2
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-eqz p6, :cond_2

    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    goto :goto_3

    :cond_2
    const/4 p2, 0x0

    :goto_3
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    move-object v5, v4

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lnl/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    iget-object p1, p0, Lcom/roblox/protocols/webview/a;->a:Landroid/os/Handler;

    new-instance p2, Lcom/roblox/protocols/webview/a$a;

    invoke-direct {p2, p0, v0}, Lcom/roblox/protocols/webview/a$a;-><init>(Lcom/roblox/protocols/webview/a;Lnl/a;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
