.class public Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;
.super Lsg/w0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsg/w0;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->d(Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic b(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->g(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->n(Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method private i(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "EXTRA_NOTIFICATION_VERSION"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private j(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->f()Z

    move-result v0

    const-string v1, "rbx.push"

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const-string v0, "loadTheApp: (v2) ...(logged in) launch Main."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;

    invoke-direct {v1, p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;-><init>(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Context;Landroid/content/Intent;)V

    sget p1, Lcom/roblox/client/a;->R:I

    if-nez p1, :cond_0

    const/16 v2, 0x3e8

    :cond_0
    int-to-long p1, v2

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    const-string v0, "loadTheApp: (v2) ...(not logged in) launch Splash."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->LOADED_FROM_PUSH_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {p1, v0}, Lcom/roblox/client/startup/ActivitySplash;->o2(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->n(Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljj/r;->G(Landroid/os/Bundle;)V

    :cond_2
    const v1, 0x10008000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->g(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->d1()Z

    move-result p1

    const-string v0, "android_push_notification"

    if-eqz p1, :cond_3

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v1, v0, v2}, Lkm/f;->h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :cond_3
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v1, v0, v2}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_0
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lkm/f;->k(Ljava/lang/String;)V

    invoke-virtual {p0, p2, v1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->d(Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method

.method private k(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method private l(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->j(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-direct {p0, p2, p1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->k(Landroid/content/Intent;Landroid/content/Context;)V

    const-string v0, "clicked"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, p2, v1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Z)V

    return-void
.end method

.method private m(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cleared notifications of type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->h(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "dismissed"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Z)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/content/Intent;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->h(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->f(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->i(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1, p2}, Lsg/t0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final e(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Z)V
    .locals 11

    new-instance v0, Ljj/x;

    invoke-direct {v0}, Ljj/x;-><init>()V

    const-string v1, "GcmPlatform"

    invoke-virtual {v0, p2, v1}, Ljj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p3}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->h(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, p3}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->f(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p2}, Lgk/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, p3}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->i(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "sendr1"

    invoke-static {p3}, Ljj/w;->a(Landroid/content/Intent;)Ljava/util/List;

    move-result-object v10

    move-object v2, p1

    move v7, p4

    invoke-static/range {v2 .. v10}, Lsg/t0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public final f(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final g(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final n(Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 2

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p1
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    invoke-super {p0, p1, p2}, Lsg/w0;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/b;->l(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/roblox/client/startup/a;->s(Landroid/content/Context;)V

    invoke-static {p1}, Lei/c;->e(Landroid/content/Context;)V

    if-eqz p2, :cond_1

    const-string v0, "EXTRA_INTENT_ACTION_TYPE_CODE"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->m(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    :cond_0
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->l(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_1
    return-void
.end method
