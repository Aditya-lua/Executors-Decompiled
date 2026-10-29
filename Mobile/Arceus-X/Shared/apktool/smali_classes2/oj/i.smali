.class public Loj/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loj/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lpj/f;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "notificationImageAttachmentError"

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lsg/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p0, p1}, Lsg/t0;->o(Lpj/f;Ljava/util/Map;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic c(Lpj/f;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "notificationImageAttachmentError"

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lsg/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p0, p1}, Lsg/t0;->p(Lpj/f;Ljava/util/Map;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic d(Loj/i;Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;Lk2/k$f;Lpj/f;Landroid/content/Context;Lqj/a;)Lkotlin/Unit;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Loj/i;->r(Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;Lk2/k$f;Lpj/f;Landroid/content/Context;Lqj/a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lk2/k$c;Lpj/f;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0, p2}, Lk2/k$c;->i(Landroid/graphics/Bitmap;)Lk2/k$c;

    const-string p0, "notificationImageAttachmentError"

    const-string p2, ""

    invoke-static {p0, p2}, Lsg/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    invoke-static {p1, p0}, Lsg/t0;->p(Lpj/f;Ljava/util/Map;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic f(Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;Lk2/k$c;Lk2/k$f;Lpj/f;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;->getOptions()Lcom/roblox/client/pushnotification/v2/richpushnotifications/Options;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/Options;->getHidePrimaryImageInExpandedView()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lk2/k$c;->h(Landroid/graphics/Bitmap;)Lk2/k$c;

    :cond_0
    invoke-virtual {p2, p4}, Lk2/k$f;->s(Landroid/graphics/Bitmap;)Lk2/k$f;

    const-string p0, "notificationImageAttachmentError"

    const-string p1, ""

    invoke-static {p0, p1}, Lsg/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    invoke-static {p3, p0}, Lsg/t0;->o(Lpj/f;Ljava/util/Map;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic g(Loj/i;Lk2/k$f;Landroid/content/Context;Lpj/f;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Loj/i;->s(Lk2/k$f;Landroid/content/Context;Lpj/f;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static bridge synthetic h(Loj/i;Landroid/content/Context;Lpj/f;)Lk2/k$f;
    .locals 0

    invoke-virtual {p0, p1, p2}, Loj/i;->k(Landroid/content/Context;Lpj/f;)Lk2/k$f;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic i(Loj/i;Landroid/content/Context;Lk2/k$f;Lpj/f;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Loj/i;->q(Landroid/content/Context;Lk2/k$f;Lpj/f;)V

    return-void
.end method

.method public static m(Landroid/content/Context;Lpj/f;Lcom/roblox/client/pushnotification/v2/model/NotificationAction;)Landroid/content/Intent;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/pushnotification/actions/NotificationActionBroadcastReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "roblox://action/"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lpj/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p0, "extra-action-id"

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "extra-action-url"

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getPostUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "extra-action-body"

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getPostPayload()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "extra-notification-request-code"

    invoke-interface {p1}, Lpj/f;->d()I

    move-result p2

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "extra-notification-tag"

    invoke-interface {p1}, Lpj/f;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "extra-notification-group-id"

    invoke-interface {p1}, Lpj/f;->getGroupId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "EXTRA_NOTIFICATION_ID"

    invoke-interface {p1}, Lpj/f;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "EXTRA_NOTIFICATION_TYPE"

    invoke-interface {p1}, Lpj/f;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "EXTRA_NOTIFICATION_VERSION"

    invoke-interface {p1}, Lpj/f;->n()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "EXTRA_NOTIFICATION_LOGGING_FIELDS"

    invoke-interface {p1}, Lpj/f;->h()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v0
.end method

.method public static n(Landroid/content/Context;Lpj/f;Lcom/roblox/client/pushnotification/v2/model/NotificationAction;)Landroid/content/Intent;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroid/content/Intent;

    const-string v1, "push_notification_opened"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/roblox/client/startup/ActivitySplash;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getDeeplink()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p0, "STARTED_FOR_INTENT_KEY"

    sget-object v1, Lcom/roblox/client/startup/StartedForEnum;->LOADED_FROM_PUSH_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string p0, "EXTRA_NOTIFICATION_ID"

    invoke-interface {p1}, Lpj/f;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "EXTRA_INTENT_ACTION_TYPE_CODE"

    const/4 v1, 0x3

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "EXTRA_NOTIFICATION_TYPE"

    invoke-interface {p1}, Lpj/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getDeeplink()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "EXTRA_NOTIFICATION_VERSION"

    invoke-interface {p1}, Lpj/f;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "EXTRA_NOTIFICATION_LOGGING_FIELDS"

    invoke-interface {p1}, Lpj/f;->h()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const-string p0, "extra-notification-tag"

    invoke-interface {p1}, Lpj/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "extra-notification-request-code"

    invoke-interface {p1}, Lpj/f;->d()I

    move-result v1

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "extra-notification-group-id"

    invoke-interface {p1}, Lpj/f;->getGroupId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getPostUrl()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string p0, "extra-action-id"

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "extra-action-url"

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getPostUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "extra-action-body"

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getPostPayload()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lpj/f;)V
    .locals 9

    if-eqz p1, :cond_7

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->M4()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Heartbeat"

    invoke-interface {p2}, Lpj/f;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->s0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p2}, Loj/i;->u(Landroid/content/Context;Lpj/f;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p2}, Loj/i;->k(Landroid/content/Context;Lpj/f;)Lk2/k$f;

    move-result-object v3

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "CallReceived"

    invoke-interface {p2}, Lpj/f;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1, v3, p2}, Loj/i;->q(Landroid/content/Context;Lk2/k$f;Lpj/f;)V

    return-void

    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object v5

    new-instance v0, Loj/i$a;

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Loj/i$a;-><init>(Loj/i;Landroid/content/Context;Lk2/k$f;Lpj/f;Lak/k0;)V

    invoke-virtual {v5, v0}, Lak/k0;->K(Lak/e0;)V

    invoke-virtual {v5}, Lak/k0;->O()V

    return-void

    :cond_4
    invoke-interface {p2}, Lpj/f;->u()Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    move-result-object v2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->L5()Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz v2, :cond_5

    sget-object v6, Lqj/b;->a:Lqj/b;

    invoke-virtual {v2}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;->getPrimaryImage()Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    move-result-object v7

    invoke-virtual {v2}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;->getSecondaryImage()Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    move-result-object v8

    new-instance v0, Loj/c;

    move-object v1, p0

    move-object v5, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Loj/c;-><init>(Loj/i;Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;Lk2/k$f;Lpj/f;Landroid/content/Context;)V

    const-wide/16 v4, 0x1388

    move-object v1, v6

    move-object v6, v0

    move-object v0, v1

    move-object v1, p1

    move-object v2, v7

    move-object v3, v8

    invoke-virtual/range {v0 .. v6}, Lqj/b;->c(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;JLkotlin/jvm/functions/Function1;)V

    return-void

    :cond_5
    new-instance v0, Loj/d;

    invoke-direct {v0, p0, v3, p1, p2}, Loj/d;-><init>(Loj/i;Lk2/k$f;Landroid/content/Context;Lpj/f;)V

    invoke-interface {p2}, Lpj/f;->p()Lpj/e;

    move-result-object v1

    sget-object v3, Lpj/e;->b:Lpj/e;

    if-ne v1, v3, :cond_6

    sget-object v1, Ljj/b0;->a:Ljj/b0;

    invoke-interface {p2}, Lpj/f;->B()J

    move-result-wide v3

    invoke-virtual {v1, p1, v3, v4, v0}, Ljj/b0;->c(Landroid/content/Context;JLjava/util/function/Consumer;)V

    return-void

    :cond_6
    sget-object v1, Ljj/b0;->a:Ljj/b0;

    invoke-interface {p2}, Lpj/f;->A()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p1, v3, v0}, Ljj/b0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/util/function/Consumer;)V

    :cond_7
    :goto_0
    return-void
.end method

.method public final j(Landroid/content/Context;Lpj/f;Lk2/k$f;)V
    .locals 7

    invoke-interface {p2}, Lpj/f;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;

    invoke-interface {p2}, Lpj/f;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getId()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getDeeplink()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/lit8 v4, v3, 0x1

    const/high16 v5, 0xc000000

    if-nez v3, :cond_0

    invoke-static {p1, p2, v1}, Loj/i;->n(Landroid/content/Context;Lpj/f;Lcom/roblox/client/pushnotification/v2/model/NotificationAction;)Landroid/content/Intent;

    move-result-object v3

    invoke-static {p1, v2, v3, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    goto :goto_1

    :cond_0
    invoke-static {p1, p2, v1}, Loj/i;->m(Landroid/content/Context;Lpj/f;Lcom/roblox/client/pushnotification/v2/model/NotificationAction;)Landroid/content/Intent;

    move-result-object v3

    invoke-static {p1, v2, v3, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    :goto_1
    new-instance v3, Lk2/k$a$a;

    const/4 v5, 0x0

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getLabel()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v5, v6, v2}, Lk2/k$a$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/model/NotificationAction;->getRequireUnlock()Z

    move-result v1

    invoke-virtual {v3, v1}, Lk2/k$a$a;->e(Z)Lk2/k$a$a;

    invoke-virtual {v3, v4}, Lk2/k$a$a;->f(Z)Lk2/k$a$a;

    invoke-virtual {v3}, Lk2/k$a$a;->b()Lk2/k$a;

    move-result-object v1

    invoke-virtual {p3, v1}, Lk2/k$f;->b(Lk2/k$a;)Lk2/k$f;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final k(Landroid/content/Context;Lpj/f;)Lk2/k$f;
    .locals 6

    invoke-virtual {p0, p1, p2}, Loj/i;->o(Landroid/content/Context;Lpj/f;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lk2/k$f;

    invoke-direct {v1, p1, v0}, Lk2/k$f;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lpj/f;->g(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v1, v0}, Lk2/k$f;->j(Landroid/app/PendingIntent;)Lk2/k$f;

    invoke-interface {p2, p1}, Lpj/f;->m(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v1, v0}, Lk2/k$f;->n(Landroid/app/PendingIntent;)Lk2/k$f;

    invoke-interface {p2}, Lpj/f;->s()I

    move-result v0

    invoke-virtual {v1, v0}, Lk2/k$f;->x(I)Lk2/k$f;

    invoke-interface {p2}, Lpj/f;->getVisibility()I

    move-result v0

    invoke-virtual {v1, v0}, Lk2/k$f;->F(I)Lk2/k$f;

    invoke-interface {p2, p1}, Lpj/f;->i(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v1, v0}, Lk2/k$f;->z(I)Lk2/k$f;

    invoke-interface {p2}, Lpj/f;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lk2/k$f;->l(Ljava/lang/CharSequence;)Lk2/k$f;

    invoke-interface {p2}, Lpj/f;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lk2/k$f;->k(Ljava/lang/CharSequence;)Lk2/k$f;

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lk2/k$f;->f(Z)Lk2/k$f;

    invoke-interface {p2}, Lpj/f;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Lk2/k$f;->v(I)Lk2/k$f;

    invoke-interface {p2, p1}, Lpj/f;->w(Landroid/content/Context;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Lk2/k$f;->A(Landroid/net/Uri;)Lk2/k$f;

    invoke-interface {p2}, Lpj/f;->e()Z

    move-result v2

    invoke-virtual {v1, v2}, Lk2/k$f;->w(Z)Lk2/k$f;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->I0()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, p1, p2, v1}, Loj/i;->j(Landroid/content/Context;Lpj/f;Lk2/k$f;)V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->W3()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Lpj/f;->getGroupId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lk2/k$f;->q(Ljava/lang/String;)Lk2/k$f;

    :cond_1
    invoke-interface {p2}, Lpj/f;->j()Z

    move-result v2

    if-eqz v2, :cond_2

    sget v2, Lsg/q0;->E0:I

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lk2/t$d;

    const-string v4, "key_reply_message"

    invoke-direct {v3, v4}, Lk2/t$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lk2/t$d;->b(Ljava/lang/CharSequence;)Lk2/t$d;

    move-result-object v3

    invoke-virtual {v3}, Lk2/t$d;->a()Lk2/t;

    move-result-object v3

    new-instance v4, Lk2/k$a$a;

    sget v5, Lsg/l0;->b:I

    invoke-virtual {p0, p1, p2}, Loj/i;->p(Landroid/content/Context;Lpj/f;)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-direct {v4, v5, v2, p1}, Lk2/k$a$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v4, v3}, Lk2/k$a$a;->a(Lk2/t;)Lk2/k$a$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lk2/k$a$a;->d(Z)Lk2/k$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lk2/k$a$a;->b()Lk2/k$a;

    move-result-object p1

    invoke-virtual {v1, p1}, Lk2/k$f;->b(Lk2/k$a;)Lk2/k$f;

    :cond_2
    new-instance p1, Lk2/k$d;

    invoke-direct {p1}, Lk2/k$d;-><init>()V

    invoke-interface {p2}, Lpj/f;->getBody()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk2/k$d;->h(Ljava/lang/CharSequence;)Lk2/k$d;

    move-result-object p1

    invoke-virtual {v1, p1}, Lk2/k$f;->B(Lk2/k$i;)Lk2/k$f;

    return-object v1
.end method

.method public final l(Landroid/content/Context;Lpj/f;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 0

    if-eqz p6, :cond_0

    sget-object p5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    filled-new-array {p3, p6, p7}, [Ljava/lang/Object;

    move-result-object p3

    const-string p4, "roblox://placeId=%d&reservedServerAccessCode=%s&callId=%s"

    invoke-static {p5, p4, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    if-eqz p5, :cond_1

    sget-object p6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    filled-new-array {p3, p5, p7}, [Ljava/lang/Object;

    move-result-object p3

    const-string p4, "roblox://placeId=%d&gameInstanceId=%s&callId=%s"

    invoke-static {p6, p4, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_1
    sget-object p5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    filled-new-array {p3, p7}, [Ljava/lang/Object;

    move-result-object p3

    const-string p4, "roblox://placeId=%d&callId=%s"

    invoke-static {p5, p4, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    :goto_0
    new-instance p4, Landroid/content/Intent;

    const-string p5, "push_notification_action"

    invoke-direct {p4, p5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-class p5, Lcom/roblox/client/startup/ActivitySplash;

    invoke-virtual {p4, p1, p5}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p4, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p1, "STARTED_FOR_INTENT_KEY"

    sget-object p5, Lcom/roblox/client/startup/StartedForEnum;->LOADED_FROM_PUSH_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {p4, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string p1, "EXTRA_NOTIFICATION_ID"

    invoke-interface {p2}, Lpj/f;->getId()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "EXTRA_INTENT_ACTION_TYPE_CODE"

    const/4 p5, 0x3

    invoke-virtual {p4, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "EXTRA_NOTIFICATION_TYPE"

    invoke-interface {p2}, Lpj/f;->c()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {p4, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "EXTRA_NOTIFICATION_VERSION"

    invoke-interface {p2}, Lpj/f;->n()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "EXTRA_NOTIFICATION_LOGGING_FIELDS"

    invoke-interface {p2}, Lpj/f;->h()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p4, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object p4
.end method

.method public final o(Landroid/content/Context;Lpj/f;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->J4()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->s0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Lpj/f;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lpj/b;->x:Lpj/b;

    invoke-virtual {p1}, Lpj/b;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljj/r;->C(Landroid/content/Context;Lpj/f;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p2}, Lpj/f;->l()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final p(Landroid/content/Context;Lpj/f;)Landroid/app/PendingIntent;
    .locals 5

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "chat_message_replied"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->s2()Z

    move-result v1

    const-string v2, "EXTRA_CONVERSATION_ID"

    if-eqz v1, :cond_0

    invoke-interface {p2}, Lpj/f;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lpj/f;->o()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    :goto_0
    const-string v1, "tag"

    invoke-interface {p2}, Lpj/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "EXTRA_MESSAGE_ID"

    invoke-interface {p2}, Lpj/f;->z()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "EXTRA_CONVERSATION_TITLE"

    invoke-interface {p2}, Lpj/f;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "EXTRA_NOTIFICATION_ID"

    invoke-interface {p2}, Lpj/f;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "EXTRA_NOTIFICATION_VERSION"

    invoke-interface {p2}, Lpj/f;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "EXTRA_NOTIFICATION_LOGGING_FIELDS"

    invoke-interface {p2}, Lpj/f;->h()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-interface {p2}, Lpj/f;->d()I

    move-result p2

    const/high16 v1, 0x12000000

    invoke-static {p1, p2, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public final q(Landroid/content/Context;Lk2/k$f;Lpj/f;)V
    .locals 29

    move-object/from16 v0, p1

    move-object/from16 v9, p2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->Z3()Z

    move-result v1

    const-string v2, "Sendr1PushNotificationHandler"

    if-nez v1, :cond_0

    const-string v0, "EnableAndroidCallPushNotification=false, dropping incoming call push."

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-interface/range {p3 .. p3}, Lpj/f;->q()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v3, "CallId"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v3, "InstanceId"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v3, "ReservedServerAccessCode"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v3, "CallerId"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v10

    const-string v3, "CallerCombinedName"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v3, "CalleeId"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v16

    const-string v3, "CalleeCombinedName"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v3, "PlaceId"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    const-string v6, "CreatedUtc"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v18

    const-string v6, "IsCalleeMicEnabled"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v20
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface/range {p3 .. p3}, Lpj/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface/range {p3 .. p3}, Lpj/f;->d()I

    move-result v2

    invoke-static {v0, v5, v1, v2}, Lcom/roblox/client/pushnotification/v2/CallActionReceiver;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v6

    const/high16 v7, 0xc000000

    invoke-static {v0, v2, v6, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v8

    if-eqz v20, :cond_1

    move-object/from16 v23, v6

    move-wide/from16 v21, v10

    move-object v6, v14

    move-object v14, v1

    move v11, v7

    move-object v10, v8

    move-object v7, v15

    move-object/from16 v1, p0

    move v15, v2

    move-object v8, v5

    move-object v2, v0

    move-wide v4, v3

    move-object/from16 v3, p3

    invoke-virtual/range {v1 .. v8}, Loj/i;->l(Landroid/content/Context;Lpj/f;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object v7, v8

    move-object/from16 v26, v13

    move-wide/from16 v27, v4

    move-object v5, v12

    move-wide/from16 v12, v27

    invoke-static {v2, v15, v0, v11}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    :goto_0
    move-object v8, v1

    move/from16 v6, v20

    move-wide/from16 v3, v21

    move-object v1, v0

    move-object v0, v2

    move-object/from16 v2, v23

    goto :goto_1

    :cond_1
    move-object/from16 v23, v6

    move-wide/from16 v21, v10

    move-object/from16 v26, v13

    move-object/from16 v24, v14

    move-object/from16 v25, v15

    move-object v14, v1

    move v15, v2

    move v11, v7

    move-object v10, v8

    move-object v2, v0

    move-object v7, v5

    move-object v5, v12

    move-wide v12, v3

    invoke-static {v2, v7, v14, v15}, Lcom/roblox/client/pushnotification/v2/CallActionReceiver;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    invoke-static {v2, v15, v0, v11}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    goto :goto_0

    :goto_1
    invoke-static/range {v0 .. v6}, Lcom/roblox/client/IncomingCallActivity;->H1(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;JLjava/lang/String;Z)Landroid/content/Intent;

    move-result-object v1

    move-wide/from16 v21, v3

    move-object v2, v5

    invoke-static {v0, v15, v1, v11}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v3, Lk2/r$c;

    invoke-direct {v3}, Lk2/r$c;-><init>()V

    invoke-virtual {v3, v2}, Lk2/r$c;->e(Ljava/lang/CharSequence;)Lk2/r$c;

    move-result-object v3

    invoke-virtual {v3}, Lk2/r$c;->a()Lk2/r;

    move-result-object v3

    invoke-static {v3, v10, v8}, Lk2/k$g;->h(Lk2/r;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Lk2/k$g;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lsg/j0;->c:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Lk2/k$g;->o(I)Lk2/k$g;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lsg/j0;->d:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Lk2/k$g;->p(I)Lk2/k$g;

    move-result-object v3

    invoke-virtual {v9, v3}, Lk2/k$f;->B(Lk2/k$i;)Lk2/k$f;

    invoke-virtual {v9, v1}, Lk2/k$f;->j(Landroid/app/PendingIntent;)Lk2/k$f;

    const/4 v3, 0x1

    invoke-virtual {v9, v1, v3}, Lk2/k$f;->p(Landroid/app/PendingIntent;Z)Lk2/k$f;

    sget-object v1, Ljj/n;->b:[J

    invoke-virtual {v9, v1}, Lk2/k$f;->E([J)Lk2/k$f;

    invoke-virtual {v9}, Lk2/k$f;->c()Landroid/app/Notification;

    move-result-object v1

    invoke-interface/range {p3 .. p3}, Lpj/f;->e()Z

    move-result v3

    if-eqz v3, :cond_2

    iget v3, v1, Landroid/app/Notification;->flags:I

    or-int/lit8 v3, v3, 0x24

    iput v3, v1, Landroid/app/Notification;->flags:I

    :cond_2
    invoke-static {}, Lxl/g;->x()Lxl/g;

    move-result-object v9

    new-instance v0, Loj/i$b;

    move-object v4, v14

    move-object/from16 v3, p1

    move-object/from16 v8, p3

    move-object v11, v2

    move-object v10, v7

    move-object v2, v14

    move v5, v15

    move v7, v6

    move-object v6, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v8}, Loj/i$b;-><init>(Loj/i;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;ILandroid/app/Notification;ZLpj/f;)V

    move v6, v7

    invoke-virtual {v9, v0}, Lxl/g;->g(Lxl/g$a;)V

    invoke-static {}, Lxl/g;->x()Lxl/g;

    move-result-object v4

    invoke-interface/range {p3 .. p3}, Lpj/f;->getId()Ljava/lang/String;

    move-result-object v0

    move-object v5, v10

    move-object v8, v11

    move-wide/from16 v9, v16

    move-wide/from16 v16, v18

    move-object/from16 v14, v24

    move-object/from16 v15, v25

    move-object/from16 v11, v26

    move-object/from16 v19, v0

    move/from16 v18, v6

    move-wide/from16 v6, v21

    invoke-virtual/range {v4 .. v19}, Lxl/g;->u(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Call receive notification parse exception."

    invoke-static {v2, v1, v0}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final synthetic r(Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;Lk2/k$f;Lpj/f;Landroid/content/Context;Lqj/a;)Lkotlin/Unit;
    .locals 2

    new-instance v0, Lk2/k$c;

    invoke-direct {v0}, Lk2/k$c;-><init>()V

    new-instance v1, Loj/e;

    invoke-direct {v1, p1, v0, p2, p3}, Loj/e;-><init>(Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;Lk2/k$c;Lk2/k$f;Lpj/f;)V

    new-instance p1, Loj/f;

    invoke-direct {p1, p3}, Loj/f;-><init>(Lpj/f;)V

    invoke-virtual {p5, v1, p1}, Lqj/a;->b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    new-instance p1, Loj/g;

    invoke-direct {p1, v0, p3}, Loj/g;-><init>(Lk2/k$c;Lpj/f;)V

    new-instance v1, Loj/h;

    invoke-direct {v1, p3}, Loj/h;-><init>(Lpj/f;)V

    invoke-virtual {p5, p1, v1}, Lqj/a;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    invoke-virtual {p2, v0}, Lk2/k$f;->B(Lk2/k$i;)Lk2/k$f;

    invoke-virtual {p2}, Lk2/k$f;->c()Landroid/app/Notification;

    move-result-object p1

    invoke-static {p4}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p2

    invoke-interface {p3}, Lpj/f;->a()Ljava/lang/String;

    move-result-object p5

    invoke-interface {p3}, Lpj/f;->d()I

    move-result v0

    invoke-virtual {p2, p5, v0, p1}, Lk2/n;->i(Ljava/lang/String;ILandroid/app/Notification;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->W3()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p3}, Lpj/f;->getGroupId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p4, p3}, Loj/i;->o(Landroid/content/Context;Lpj/f;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p4, p1, p2, p3}, Loj/i;->t(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lpj/f;)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final synthetic s(Lk2/k$f;Landroid/content/Context;Lpj/f;Landroid/graphics/Bitmap;)V
    .locals 2

    if-eqz p4, :cond_0

    invoke-virtual {p1, p4}, Lk2/k$f;->s(Landroid/graphics/Bitmap;)Lk2/k$f;

    :cond_0
    invoke-virtual {p1}, Lk2/k$f;->c()Landroid/app/Notification;

    move-result-object p1

    invoke-static {p2}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p4

    invoke-interface {p3}, Lpj/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3}, Lpj/f;->d()I

    move-result v1

    invoke-virtual {p4, v0, v1, p1}, Lk2/n;->i(Ljava/lang/String;ILandroid/app/Notification;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->W3()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p3}, Lpj/f;->getGroupId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p3}, Loj/i;->o(Landroid/content/Context;Lpj/f;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p2, p1, p4, p3}, Loj/i;->t(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lpj/f;)V

    :cond_1
    return-void
.end method

.method public final t(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lpj/f;)V
    .locals 8

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    move-result-object v0

    if-nez v0, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance v1, Lk2/k$h;

    invoke-direct {v1}, Lk2/k$h;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_1
    if-ge v4, v2, :cond_8

    aget-object v6, v0, v4

    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {v6}, Lk2/k;->b(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v6}, Lk2/k;->c(Landroid/app/Notification;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v5, v5, 0x1

    const/4 v7, 0x2

    if-gt v5, v7, :cond_7

    iget-object v6, v6, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    const-string v7, "android.title"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_6
    const-string v6, ""

    :goto_2
    invoke-virtual {v1, v6}, Lk2/k$h;->h(Ljava/lang/CharSequence;)Lk2/k$h;

    :cond_7
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_8
    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "summary_"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    if-ge v5, v4, :cond_9

    invoke-virtual {v0, v2, v3}, Lk2/n;->b(Ljava/lang/String;I)V

    return-void

    :cond_9
    sget v6, Lsg/q0;->M0:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    sget v7, Lsg/q0;->L0:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p1, v7, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v6}, Lk2/k$h;->i(Ljava/lang/CharSequence;)Lk2/k$h;

    new-instance v7, Lk2/k$f;

    invoke-direct {v7, p1, p3}, Lk2/k$f;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {p4, p1}, Lpj/f;->i(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {v7, p1}, Lk2/k$f;->z(I)Lk2/k$f;

    move-result-object p1

    invoke-virtual {p1, v6}, Lk2/k$f;->l(Ljava/lang/CharSequence;)Lk2/k$f;

    move-result-object p1

    invoke-virtual {p1, v5}, Lk2/k$f;->k(Ljava/lang/CharSequence;)Lk2/k$f;

    move-result-object p1

    invoke-virtual {p1, p2}, Lk2/k$f;->q(Ljava/lang/String;)Lk2/k$f;

    move-result-object p1

    invoke-virtual {p1, v4}, Lk2/k$f;->r(Z)Lk2/k$f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lk2/k$f;->B(Lk2/k$i;)Lk2/k$f;

    move-result-object p1

    invoke-virtual {p1}, Lk2/k$f;->c()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {v0, v2, v3, p1}, Lk2/n;->i(Ljava/lang/String;ILandroid/app/Notification;)V

    return-void
.end method

.method public final u(Landroid/content/Context;Lpj/f;)Z
    .locals 2

    invoke-interface {p2}, Lpj/f;->v()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljj/r;->C(Landroid/content/Context;Lpj/f;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    invoke-virtual {p1, p2}, Lk2/n;->g(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/NotificationChannel;->getImportance()I

    move-result p1

    if-lez p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    return v1
.end method
