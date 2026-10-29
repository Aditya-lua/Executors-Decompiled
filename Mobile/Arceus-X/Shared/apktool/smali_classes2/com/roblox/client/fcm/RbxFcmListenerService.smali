.class public Lcom/roblox/client/fcm/RbxFcmListenerService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 5

    invoke-static {p0}, Lff/e;->k(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    if-eqz v0, :cond_0

    invoke-static {p0}, Lff/e;->q(Landroid/content/Context;)Lff/e;

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-string v1, "listener_service"

    invoke-static {v1, v0, v3, v4}, Lqh/a;->a(Ljava/lang/String;ZJ)V

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {p0}, Ljm/a;->c(Landroid/content/Context;)V

    return-void
.end method

.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvi/b;->l(Landroid/content/Context;)V

    const-string v0, "rbx.push"

    const-string v1, "RGLS.onMessageReceived() Scheduling PushHandlerWorker"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/roblox/client/pushnotification/PushHandlerWorker;->b(Landroid/content/Context;Lcom/google/firebase/messaging/RemoteMessage;)V

    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onNewToken(Ljava/lang/String;)V

    const-string p1, "rbx.push"

    const-string v0, "Token refresh triggered."

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljj/r;->o(Landroid/content/Context;)Lmj/h0;

    move-result-object p1

    sget-object v0, Lmj/h0;->b:Lmj/h0;

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/roblox/client/fcm/FCMRegistrationWorker;->a:Lcom/roblox/client/fcm/FCMRegistrationWorker$a;

    invoke-virtual {p1, p0}, Lcom/roblox/client/fcm/FCMRegistrationWorker$a;->a(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
