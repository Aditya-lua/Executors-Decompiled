.class public Lrj/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/r$d;,
        Lrj/r$b;,
        Lrj/r$c;
    }
.end annotation


# instance fields
.field public a:Landroid/os/Bundle;

.field public b:Lrj/r$d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lrj/r$a;

    invoke-direct {v0, p0}, Lrj/r$a;-><init>(Lrj/r;)V

    iput-object v0, p0, Lrj/r;->b:Lrj/r$d;

    return-void
.end method

.method public static E(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lbh/a1;->q0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ly5/p0;->h(Landroid/content/Context;)Ly5/p0;

    move-result-object p0

    sget-object v0, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->a:Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;

    invoke-virtual {v0, p0}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;->b(Ly5/p0;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lrj/r$d;Landroid/content/Context;Luj/k0;)Lkotlin/Unit;
    .locals 0

    invoke-interface {p0, p2, p1}, Lrj/r$d;->a(Luj/k0;Landroid/content/Context;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic b()Lkotlin/Unit;
    .locals 3

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    new-instance v1, Lyh/h;

    const-string v2, "PushNotificationRegistrationFailed"

    invoke-direct {v1, v2}, Lyh/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lmw/c;->j(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic c(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Ly5/p0;->h(Landroid/content/Context;)Ly5/p0;

    move-result-object p0

    sget-object v0, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->a:Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;

    invoke-virtual {v0, p0}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;->a(Ly5/p0;)V

    return-void
.end method

.method public static bridge synthetic d(Lrj/r;Landroid/content/Context;)Lrj/s;
    .locals 0

    invoke-virtual {p0, p1}, Lrj/r;->q(Landroid/content/Context;)Lrj/s;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Lrj/r;Landroid/content/Context;)V
    .locals 0

    invoke-virtual {p0, p1}, Lrj/r;->D(Landroid/content/Context;)V

    return-void
.end method

.method public static f(Landroid/content/Context;Lxj/b;)V
    .locals 5

    invoke-static {p0}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lxj/b;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/app/NotificationChannel;

    invoke-virtual {p1}, Lxj/b;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lxj/b;->e()I

    move-result v4

    invoke-direct {v2, v3, v1, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->v0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lxj/b;->d()Lxj/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lxj/b;->d()Lxj/c;

    move-result-object v1

    invoke-virtual {v1}, Lxj/c;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/app/NotificationChannel;->setGroup(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lxj/b;->b()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p1}, Lxj/b;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lxj/b;->o()Z

    move-result p0

    if-nez p0, :cond_2

    invoke-virtual {p1}, Lxj/b;->m()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p1}, Lxj/b;->k()Landroid/media/AudioAttributes;

    move-result-object v1

    invoke-virtual {v2, p0, v1}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    invoke-virtual {p1}, Lxj/b;->p()[J

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    :cond_2
    invoke-virtual {v0, v2}, Lk2/n;->d(Landroid/app/NotificationChannel;)V

    return-void
.end method

.method public static k()Lrj/r;
    .locals 1

    invoke-static {}, Lrj/r$b;->a()Lrj/r;

    move-result-object v0

    return-object v0
.end method

.method public static l()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-static {v1}, Leh/j0;->a(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string v3, "channel_settings"

    invoke-static {v1}, Leh/j0;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v3, v4, v2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public A(Landroid/content/Context;ZLrj/s;)V
    .locals 0

    if-eqz p3, :cond_0

    invoke-interface {p3, p1, p2}, Lrj/s;->d(Landroid/content/Context;Z)V

    :cond_0
    return-void
.end method

.method public B(Landroid/content/Context;ZLtj/a;Lrj/x;Lrj/r$d;Lrj/r$c;)V
    .locals 7

    if-nez p2, :cond_0

    invoke-virtual {p3, p6}, Ltj/a;->a(Lrj/r$c;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lrj/r;->q(Landroid/content/Context;)Lrj/s;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    sget p6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p6, v0, :cond_2

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lrj/r;->z(Landroid/content/Context;Z)V

    return-void

    :cond_2
    invoke-interface {p2}, Lrj/s;->c()Ljava/lang/String;

    move-result-object p2

    const/4 p6, 0x0

    invoke-virtual {p0, p6, p1, p4, p2}, Lrj/r;->m(Ljava/lang/String;Landroid/content/Context;Lrj/x;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    if-eqz p2, :cond_3

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v5, p3

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lrj/r;->F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLtj/a;Lrj/r$d;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public C(Landroid/content/Context;Lxj/f;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->U0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Lxj/f;->l()Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, v0}, Lwj/b;->d(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    const-string v1, "rbx.push"

    const-string v2, "Failed to register payload notification channel"

    invoke-static {v1, v2, v0}, Lok/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    invoke-static {p1}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-interface {p2}, Lxj/f;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lk2/n;->l()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v1}, Lwj/b;->g(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Lk2/n;->f(Ljava/lang/String;)V

    return-object v2

    :cond_1
    invoke-virtual {v0, v1}, Lk2/n;->i(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v1

    :cond_2
    invoke-static {}, Lxj/b;->c()Lhu/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxj/b;

    invoke-virtual {v2}, Lxj/b;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_6

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->v0()Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lxj/b;->A:Lxj/b;

    invoke-virtual {p1}, Lxj/b;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-interface {p2}, Lxj/f;->m()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {p1, v2}, Lrj/r;->f(Landroid/content/Context;Lxj/b;)V

    invoke-virtual {v2}, Lxj/b;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final D(Landroid/content/Context;)V
    .locals 1

    invoke-static {p1}, Ly5/p0;->h(Landroid/content/Context;)Ly5/p0;

    move-result-object p1

    sget-object v0, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->a:Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;

    invoke-virtual {v0, p1}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;->b(Ly5/p0;)V

    return-void
.end method

.method public F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLtj/a;Lrj/r$d;)V
    .locals 1

    if-eqz p5, :cond_0

    if-eqz p2, :cond_0

    if-eqz p6, :cond_0

    move-object v0, p1

    move-object p1, p5

    new-instance p5, Lrj/o;

    invoke-direct {p5, p6, v0}, Lrj/o;-><init>(Lrj/r$d;Landroid/content/Context;)V

    new-instance p6, Lrj/p;

    invoke-direct {p6}, Lrj/p;-><init>()V

    invoke-virtual/range {p1 .. p6}, Ltj/a;->f(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    :cond_0
    return-void
.end method

.method public G(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lrj/r;->a:Landroid/os/Bundle;

    return-void
.end method

.method public H(Landroid/content/Context;Ljava/lang/String;Lrj/x;Ljava/lang/String;)V
    .locals 2

    if-eqz p4, :cond_0

    if-eqz p3, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p3, p1, p4, p2}, Lrj/x;->g(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final g(Landroid/content/Context;Lxj/b;)V
    .locals 0

    invoke-static {p1}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    invoke-virtual {p2}, Lxj/b;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk2/n;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final h(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    invoke-virtual {p0}, Lrj/r;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lk2/n;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Lrj/r;->a:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lrj/r;->a:Landroid/os/Bundle;

    :cond_0
    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "channel_games"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lbh/a1;->q0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "channel_calls"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public final m(Ljava/lang/String;Landroid/content/Context;Lrj/x;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    invoke-virtual {p3, p2, p4}, Lrj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    return-object p2

    :cond_1
    return-object v0
.end method

.method public n(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lrj/r;->q(Landroid/content/Context;)Lrj/s;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lrj/s;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public o(Landroid/content/Context;)Luj/h0;
    .locals 0

    invoke-virtual {p0, p1}, Lrj/r;->q(Landroid/content/Context;)Lrj/s;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lrj/s;->a()Luj/h0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Luj/h0;->a:Luj/h0;

    return-object p1
.end method

.method public p(Landroid/content/Context;Ljava/lang/String;Lrj/x;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p2, p1, p3, p4}, Lrj/r;->m(Ljava/lang/String;Landroid/content/Context;Lrj/x;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, p4}, Lrj/r;->H(Landroid/content/Context;Ljava/lang/String;Lrj/x;Ljava/lang/String;)V

    return-object v0
.end method

.method public final q(Landroid/content/Context;)Lrj/s;
    .locals 1

    invoke-static {}, Lrj/t;->g()Lrj/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrj/t;->h(Landroid/content/Context;)Lrj/s;

    move-result-object p1

    return-object p1
.end method

.method public r(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lrj/r;->q(Landroid/content/Context;)Lrj/s;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lrj/s;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public s(Landroid/content/Context;)V
    .locals 7

    new-instance v4, Lrj/x;

    invoke-direct {v4}, Lrj/x;-><init>()V

    invoke-static {p1}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-virtual {v0}, Lk2/n;->a()Z

    move-result v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AndroidNotifState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "AndroidNotifStatePrefKey"

    invoke-virtual {v4, p1, v0}, Lrj/x;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v4, p1, v0}, Lrj/x;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p1

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Different value. Reporting new state: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v4, p1, v0, v2}, Lrj/x;->f(Landroid/content/Context;Ljava/lang/String;Z)V

    const-string v0, "osSettings"

    invoke-static {v0, v2}, Lbh/t0;->l(Ljava/lang/String;Z)V

    new-instance v3, Ltj/a;

    invoke-direct {v3}, Ltj/a;-><init>()V

    iget-object v5, p0, Lrj/r;->b:Lrj/r$d;

    new-instance v6, Lrj/q;

    invoke-direct {v6, p1}, Lrj/q;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Lrj/r;->B(Landroid/content/Context;ZLtj/a;Lrj/x;Lrj/r$d;Lrj/r$c;)V

    :goto_1
    invoke-static {v1}, Lrj/r;->E(Landroid/content/Context;)V

    return-void
.end method

.method public t(Landroid/os/Bundle;)Z
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "EXTRA_NOTIFICATION_VERSION"

    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {p1, v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_1

    const-string v4, "rbx.push"

    const-string v6, "... Will handle this Push bundle using Linking protocol."

    invoke-static {v4, v6}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const-string v4, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {p1, v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->g1()Z

    move-result v1

    const-string v4, "android_push_notification"

    if-eqz v1, :cond_0

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    invoke-virtual {v1, p1, v4, v5}, Lym/g;->j(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    invoke-virtual {v1, p1, v4, v5}, Lym/g;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_0
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    invoke-virtual {v1, p1}, Lym/g;->m(Ljava/lang/String;)V

    invoke-static {v0, v3, v2, p1}, Lbh/t0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v5
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Lrj/r;->a:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final v(Landroid/content/Context;)V
    .locals 6

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lxj/c;->b()Lhu/a;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxj/c;

    new-instance v3, Landroid/app/NotificationChannelGroup;

    invoke-virtual {v2}, Lxj/c;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v2}, Lxj/c;->c()I

    move-result v2

    invoke-virtual {v5, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Landroid/app/NotificationChannelGroup;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->createNotificationChannelGroup(Landroid/app/NotificationChannelGroup;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final w(Landroid/content/Context;)V
    .locals 6

    invoke-static {p1}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-static {}, Lxj/a;->b()Lhu/a;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxj/a;

    invoke-virtual {v2}, Lxj/a;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lk2/n;->i(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Landroid/app/NotificationChannel;

    invoke-virtual {v2}, Lxj/a;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lxj/a;->d()I

    move-result v5

    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lxj/a;->c()I

    move-result v2

    invoke-direct {v3, v4, v5, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v0, v3}, Lk2/n;->d(Landroid/app/NotificationChannel;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public x(Landroid/content/Context;)V
    .locals 5

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->v0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lrj/r;->v(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lrj/r;->w(Landroid/content/Context;)V

    :goto_0
    invoke-static {p1}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-virtual {v0}, Lk2/n;->l()Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lxj/b;->c()Lhu/a;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxj/b;

    invoke-virtual {v3}, Lxj/b;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lwj/b;->g(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lxj/b;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lk2/n;->f(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lxj/b;->q()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v3}, Lrj/r;->f(Landroid/content/Context;Lxj/b;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, v3}, Lrj/r;->g(Landroid/content/Context;Lxj/b;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1}, Lrj/r;->h(Landroid/content/Context;)V

    return-void
.end method

.method public y(Landroid/content/Context;Luj/i0;)V
    .locals 9

    const-string v0, "rbx.push"

    invoke-virtual {p2}, Luj/i0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lrj/x;

    invoke-direct {v0}, Lrj/x;-><init>()V

    invoke-virtual {p0, p1}, Lrj/r;->q(Landroid/content/Context;)Lrj/s;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lrj/s;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Luj/i0;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Luj/i0;->b()Z

    move-result v6

    invoke-virtual {p0, p1, v4, v0, v1}, Lrj/r;->p(Landroid/content/Context;Ljava/lang/String;Lrj/x;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ltj/a;

    invoke-direct {v7}, Ltj/a;-><init>()V

    iget-object v8, p0, Lrj/r;->b:Lrj/r$d;

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v8}, Lrj/r;->F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLtj/a;Lrj/r$d;)V

    :cond_0
    return-void
.end method

.method public z(Landroid/content/Context;Z)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lrj/r;->q(Landroid/content/Context;)Lrj/s;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lrj/r;->A(Landroid/content/Context;ZLrj/s;)V

    :cond_0
    return-void
.end method
