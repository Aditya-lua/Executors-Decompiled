.class public Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->j(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/content/Intent;

.field public final synthetic c:Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;


# direct methods
.method public constructor <init>(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->c:Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;

    iput-object p2, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->b:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lsg/y;->i(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->c:Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;

    iget-object v2, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->b:Landroid/content/Intent;

    invoke-static {v1, v0, v2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->c(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljj/r;->G(Landroid/os/Bundle;)V

    :cond_0
    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->c:Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;

    iget-object v2, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->b:Landroid/content/Intent;

    invoke-static {v1, v2}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->b(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->a:Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->d1()Z

    move-result v0

    const/4 v2, 0x0

    const-string v3, "android_push_notification"

    if-eqz v0, :cond_1

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {v0, v1, v3, v2}, Lkm/f;->h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :cond_1
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {v0, v1, v3, v2}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_0
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {v0, v1}, Lkm/f;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->c:Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;

    iget-object v2, p0, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver$a;->b:Landroid/content/Intent;

    invoke-static {v0, v2, v1}, Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;->a(Lcom/roblox/client/pushnotification/v2/receiver/Sendr1PushNotificationReceiver;Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method
