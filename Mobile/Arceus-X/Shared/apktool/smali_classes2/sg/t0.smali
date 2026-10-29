.class public Lsg/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static A()V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0}, Lvg/j;->s()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "notificationType"

    invoke-direct {v1, v2, p0}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v1, "notificationId"

    invoke-direct {p0, v1, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p1, "version"

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->d4()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lgk/t;->c(Landroid/content/Context;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object p0

    invoke-virtual {p0, p1, v0, v1}, Lvg/j;->c(Ljava/lang/String;J)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Lvg/j;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lvg/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lvg/j;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lvg/j;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Lvg/j;->h(Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lsg/t0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lvg/j;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "type"

    invoke-direct {v1, v2, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p1, "logout"

    invoke-static {p0, p1, v0}, Lsg/t0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static k(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {}, Ljj/r;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v1, "androidNotificationsSettings"

    const/4 v2, 0x0

    invoke-static {v1, p0, v0, v2}, Lvg/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    return-void
.end method

.method public static l(Ljava/lang/String;Z)V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lvg/j;->j(Ljava/lang/String;Z)V

    return-void
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lsg/t0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    new-instance p1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p2, "notificationUrl"

    invoke-direct {p1, p2, p3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p1, "pushNotificationAction"

    const-string p2, "deepLink"

    invoke-static {p1, p2, p0}, Lsg/t0;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-static {}, Lsg/t0;->A()V

    return-void
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;Lpj/f;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lpj/f;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "title"

    invoke-interface {p2}, Lpj/f;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-interface {p2}, Lpj/f;->f()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "badge"

    invoke-direct {v1, v3, v2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p2}, Lpj/f;->u()Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {p2}, Lpj/f;->u()Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    move-result-object v1

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;->getPrimaryImage()Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;->getPrimaryImage()Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    const-string v5, "primaryIcon"

    invoke-direct {v3, v5, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;->getSecondaryImage()Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;->getSecondaryImage()Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    const-string v4, "secondaryIcon"

    invoke-direct {v3, v4, v1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v3, "notificationType"

    invoke-interface {p2}, Lpj/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v3, "notificationId"

    invoke-interface {p2}, Lpj/f;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v3, "version"

    invoke-interface {p2}, Lpj/f;->n()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->W3()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v3, "groupId"

    invoke-interface {p2}, Lpj/f;->getGroupId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v3, "channelId"

    invoke-interface {p2}, Lpj/f;->r()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v3

    invoke-virtual {v3}, Lfk/c;->j()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    const-string v4, "recipient"

    invoke-direct {v1, v4, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v3, "platformType"

    const-string v4, "AndroidNative"

    invoke-direct {v1, v3, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    if-eqz p3, :cond_4

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_4
    const-string p3, "extraParams"

    invoke-direct {v1, p3, v2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p2}, Lpj/f;->b()Ljava/util/List;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {}, Ljj/r;->l()Ljava/util/List;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 p2, 0x0

    invoke-static {p1, p0, v0, p2}, Lvg/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    return-void
.end method

.method public static o(Lpj/f;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpj/f;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "imageAttachment"

    const-string v1, "pushNotificationExtensionPrimaryImageAttachment"

    invoke-static {v0, v1, p0, p1}, Lsg/t0;->n(Ljava/lang/String;Ljava/lang/String;Lpj/f;Ljava/util/Map;)V

    return-void
.end method

.method public static p(Lpj/f;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpj/f;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "imageAttachment"

    const-string v1, "pushNotificationExtensionSecondaryImageAttachment"

    invoke-static {v0, v1, p0, p1}, Lsg/t0;->n(Ljava/lang/String;Ljava/lang/String;Lpj/f;Ljava/util/Map;)V

    return-void
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;)V"
        }
    .end annotation

    invoke-static {p2, p3, p7}, Lsg/t0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    new-instance p3, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p7, "actionTaken"

    invoke-direct {p3, p7, p4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p4, "clientState"

    invoke-direct {p3, p4, p5}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/roblox/client/datastructures/NameValuePair;

    if-eqz p6, :cond_0

    const-string p4, "true"

    goto :goto_0

    :cond_0
    const-string p4, "false"

    :goto_0
    const-string p5, "openedClient"

    invoke-direct {p3, p5, p4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p4, "platformType"

    invoke-direct {p3, p4, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p2, p9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {}, Ljj/r;->l()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeReportingInterface;->getPushNotificationSessionInfo(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/Map$Entry;

    new-instance p5, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ljava/lang/String;

    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-direct {p5, p6, p4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const-string p3, "pushNotificationInteracted"

    invoke-static {p3, p0, p2}, Lcom/roblox/engine/jni/NativeReportingInterface;->pushNotificationInteracted(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const-string p2, "pushNotificationInteractedV2"

    const/4 p3, 0x0

    invoke-static {p2, p0, p1, p3}, Lvg/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    return-void
.end method

.method public static r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;)V"
        }
    .end annotation

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-static/range {v0 .. v9}, Lsg/t0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v5, "0"

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-static/range {v0 .. v6}, Lsg/t0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;)V"
        }
    .end annotation

    invoke-static {p2, p3, p5}, Lsg/t0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    new-instance p5, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v0, "clientState"

    invoke-direct {p5, v0, p4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p4, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p5, "platformType"

    invoke-direct {p4, p5, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p2, p6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {}, Ljj/r;->l()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->b6()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "pushNotificationReceived"

    const/4 p4, 0x0

    invoke-static {p1, p0, p2, p4}, Lvg/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p0

    invoke-interface {p0}, Lth/i;->u2()Z

    move-result p0

    if-eqz p0, :cond_0

    if-eqz p3, :cond_0

    invoke-static {p3}, Lvg/q;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static u(Ljava/lang/String;Lpj/f;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpj/f;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pushNotificationReceivedExtension"

    invoke-static {p0, v0, p1, p2}, Lsg/t0;->n(Ljava/lang/String;Ljava/lang/String;Lpj/f;Ljava/util/Map;)V

    return-void
.end method

.method public static v(Ljava/lang/String;)V
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "splash"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lsg/t0;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fireScreenLoaded() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.eventstream"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sput-object p0, Lsg/t0;->a:Ljava/lang/String;

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvg/j;->k(Ljava/lang/String;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lvg/j;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lsg/t0;->A()V

    return-void
.end method

.method public static x(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lvg/j;->m(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lsg/t0;->A()V

    return-void
.end method

.method public static y(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvg/j;->n(Ljava/lang/String;)V

    return-void
.end method

.method public static z()V
    .locals 1

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    invoke-virtual {v0}, Lvg/j;->o()V

    return-void
.end method
