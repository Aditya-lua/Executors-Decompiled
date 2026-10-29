.class public Lcom/roblox/client/ActivityProtocolLaunch;
.super Lcom/roblox/client/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/a;-><init>()V

    return-void
.end method

.method public static j2(Ljava/lang/String;)Z
    .locals 5

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->m2()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {p0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method


# virtual methods
.method public final i2(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "idp_name"

    invoke-virtual {p1, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "single-sign-on"

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "/login"

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "Apple"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public k2()V
    .locals 1

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0, p0}, Lsg/y;->i(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/roblox/client/a;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->a1()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    const-string v1, "joinAttemptOrigin"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "AndroidSearch"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/ossearch/a;->c(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v0

    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_1

    const-string v2, "android_warm_intent"

    goto :goto_0

    :cond_1
    const-string v2, "android_cold_intent"

    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->d1()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v3

    invoke-virtual {v3, v1, v2, v4}, Lkm/f;->h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_1

    :cond_2
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v3

    invoke-virtual {v3, v1, v2, v4}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_1
    if-eqz v0, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->O1()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lcom/roblox/client/ActivityProtocolLaunch;->i2(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v1}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->onAppleRedirectReceived(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->bringHostToFront(Lj/b;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_3
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->M1()Z

    move-result v2

    const-string v3, "rbx.externallaunch"

    if-eqz v2, :cond_5

    const-string v1, "GameActivity = ON. Start new GameActivity to handle intent..."

    invoke-static {v3, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lkm/f;->A(Landroid/content/Intent;)V

    if-nez v0, :cond_4

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->d()Lvi/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/d;->h(Landroid/content/Intent;)V

    :cond_4
    sget-object p1, Lcom/roblox/client/startup/StartedForEnum;->PROTOCOL_LAUNCH:Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {p0, p1}, Lcom/roblox/client/startup/MainGameActivity;->h2(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_5
    if-eqz v0, :cond_7

    const-string p1, "onCreate() activity on existing stack - checking to launch data"

    invoke-static {v3, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityProtocolLaunch;->k2()V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lkm/f;->k(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->p4()Z

    move-result p1

    if-nez p1, :cond_9

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->x2()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {v1}, Lcom/roblox/client/ActivityProtocolLaunch;->j2(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_9

    :cond_6
    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roblox/client/game/c;->g(Z)V

    goto :goto_2

    :cond_7
    const-string v0, "onCreate() activity is root - starting splash (regular start-up flow)"

    invoke-static {v3, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lcom/roblox/universalapp/linking/JNIBaseUrlProtocol;->maybeHandleColdStartProtocolLaunch(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "Base URL is switched for cold launch, cancel flag fetching for prefetch() and restart it."

    invoke-static {v3, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/startup/a;->z(Landroid/content/Context;)V

    :cond_8
    invoke-static {v1}, Lcom/roblox/universalapp/linking/JNIWebLoginProtocol;->maybeHandleColdStartProtocolLaunch(Ljava/lang/String;)Z

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->PROTOCOL_LAUNCH:Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->o2(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkm/f;->A(Landroid/content/Intent;)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->d()Lvi/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/d;->h(Landroid/content/Intent;)V

    :cond_9
    :goto_2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
