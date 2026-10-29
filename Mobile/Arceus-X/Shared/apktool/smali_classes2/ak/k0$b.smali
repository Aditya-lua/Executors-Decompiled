.class public Lak/k0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak/k0;->u(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lak/k0;


# direct methods
.method public constructor <init>(Lak/k0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lak/k0$b;->c:Lak/k0;

    iput-object p2, p0, Lak/k0$b;->a:Ljava/lang/String;

    iput-object p3, p0, Lak/k0$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    const-string v0, ""

    const-string v1, "AppBridgeNotification: JSON Result failure"

    const-string v2, "Android-AppLogin-BrowserTracker-JsonFailed"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleAppBridgeNotification: type = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lak/k0$b;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lak/k0$b;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "InitHelper"

    invoke-static {v4, v3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Lcom/roblox/client/d$e;

    invoke-direct {v3}, Lcom/roblox/client/d$e;-><init>()V

    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    iget-object v6, p0, Lak/k0$b;->b:Ljava/lang/String;

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v6, "result"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_0

    iget-object v0, p0, Lak/k0$b;->c:Lak/k0;

    invoke-static {v0}, Lak/k0;->f(Lak/k0;)Lvi/g;

    move-result-object v0

    invoke-virtual {v0, v2}, Lvi/g;->q(Ljava/lang/String;)V

    iget-object v0, p0, Lak/k0$b;->c:Lak/k0;

    invoke-static {v0, v1}, Lak/k0;->n(Lak/k0;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v6, "btid"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    sput-wide v6, Lsg/a1;->u:J

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v8

    invoke-interface {v8}, Lth/i;->U5()Z

    move-result v8

    if-eqz v8, :cond_1

    iget-object v8, p0, Lak/k0$b;->c:Lak/k0;

    invoke-static {v8}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object v8

    invoke-static {v8, v6, v7}, Ldi/i;->n(Landroid/content/Context;J)V

    :cond_1
    const-string v6, "upgradeStatus"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_3

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2

    invoke-virtual {v3}, Lcom/roblox/client/d$e;->f()V

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Lcom/roblox/client/d$e;->e()V

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Lcom/roblox/client/d$e;->d()V

    :goto_0
    const-string v6, "upgradeSource"

    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v3, Lcom/roblox/client/d$e;->b:Ljava/lang/String;

    const-string v6, "MD5Sum"

    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/roblox/client/d$e;->c:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lak/k0$b;->c:Lak/k0;

    invoke-static {v0}, Lak/k0;->f(Lak/k0;)Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppLogin-BrowserTracker-Success"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    iget-object v0, p0, Lak/k0$b;->c:Lak/k0;

    invoke-static {v0}, Lak/k0;->e(Lak/k0;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lak/k0$b;->c:Lak/k0;

    invoke-static {v0}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setup(Landroid/content/Context;)V

    :cond_4
    invoke-static {}, Lak/k0;->T()Z

    invoke-virtual {v3}, Lcom/roblox/client/d$e;->b()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v3}, Lcom/roblox/client/d$e;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roblox/client/d;->g(Lcom/roblox/client/d$e;)V

    :cond_6
    const-string v0, "doAfterFetchBrowserTrackerId:..."

    invoke-static {v4, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lak/k0$b;->c:Lak/k0;

    invoke-static {v0}, Lak/k0;->d(Lak/k0;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "appLaunch"

    invoke-static {v0, v1}, Lsg/t0;->b(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->A5()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lak/k0$b;->c:Lak/k0;

    invoke-static {v0}, Lak/k0;->i(Lak/k0;)V

    :cond_7
    return-void

    :catch_0
    iget-object v0, p0, Lak/k0$b;->c:Lak/k0;

    invoke-static {v0}, Lak/k0;->f(Lak/k0;)Lvi/g;

    move-result-object v0

    invoke-virtual {v0, v2}, Lvi/g;->q(Ljava/lang/String;)V

    iget-object v0, p0, Lak/k0$b;->c:Lak/k0;

    invoke-static {v0, v1}, Lak/k0;->n(Lak/k0;Ljava/lang/String;)V

    return-void
.end method
