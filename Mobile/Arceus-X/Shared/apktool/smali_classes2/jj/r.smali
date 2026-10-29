.class public Ljj/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljj/r$d;,
        Ljj/r$b;,
        Ljj/r$c;
    }
.end annotation


# instance fields
.field public a:Landroid/os/Bundle;

.field public b:Ljj/r$d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljj/r$a;

    invoke-direct {v0, p0}, Ljj/r$a;-><init>(Ljj/r;)V

    iput-object v0, p0, Ljj/r;->b:Ljj/r$d;

    return-void
.end method

.method public static E(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lx5/p0;->h(Landroid/content/Context;)Lx5/p0;

    move-result-object p0

    sget-object v0, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->a:Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;

    invoke-virtual {v0, p0}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;->b(Lx5/p0;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Ljj/r$d;Landroid/content/Context;Lmj/k0;)Lkotlin/Unit;
    .locals 0

    invoke-interface {p0, p2, p1}, Ljj/r$d;->a(Lmj/k0;Landroid/content/Context;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic b()Lkotlin/Unit;
    .locals 3

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    new-instance v1, Lph/h;

    const-string v2, "PushNotificationRegistrationFailed"

    invoke-direct {v1, v2}, Lph/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lfv/c;->j(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic c(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Lx5/p0;->h(Landroid/content/Context;)Lx5/p0;

    move-result-object p0

    sget-object v0, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->a:Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;

    invoke-virtual {v0, p0}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;->a(Lx5/p0;)V

    return-void
.end method

.method public static bridge synthetic d(Ljj/r;Landroid/content/Context;)Ljj/s;
    .locals 0

    invoke-virtual {p0, p1}, Ljj/r;->q(Landroid/content/Context;)Ljj/s;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Ljj/r;Landroid/content/Context;)V
    .locals 0

    invoke-virtual {p0, p1}, Ljj/r;->D(Landroid/content/Context;)V

    return-void
.end method

.method public static f(Landroid/content/Context;Lpj/b;)V
    .locals 5

    invoke-static {p0}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lpj/b;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/app/NotificationChannel;

    invoke-virtual {p1}, Lpj/b;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lpj/b;->e()I

    move-result v4

    invoke-direct {v2, v3, v1, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->s0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lpj/b;->d()Lpj/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lpj/b;->d()Lpj/c;

    move-result-object v1

    invoke-virtual {v1}, Lpj/c;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/app/NotificationChannel;->setGroup(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lpj/b;->b()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p1}, Lpj/b;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lpj/b;->n()Z

    move-result p0

    if-nez p0, :cond_2

    invoke-virtual {p1}, Lpj/b;->l()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p1}, Lpj/b;->j()Landroid/media/AudioAttributes;

    move-result-object v1

    invoke-virtual {v2, p0, v1}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    invoke-virtual {p1}, Lpj/b;->o()[J

    move-result-object p0

    invoke-virtual {v2, p0}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    :cond_2
    invoke-virtual {v0, v2}, Lk2/n;->c(Landroid/app/NotificationChannel;)V

    return-void
.end method

.method public static k()Ljj/r;
    .locals 1

    invoke-static {}, Ljj/r$b;->a()Ljj/r;

    move-result-object v0

    return-object v0
.end method

.method public static l()Ljava/util/List;
    .locals 7
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

    if-eqz v1, :cond_2

    new-instance v2, Ljava/util/HashMap;

    invoke-static {v1}, Lvg/r;->a(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->y1()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "channel_settings"

    invoke-static {v1}, Lvg/r;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    sget-object v3, Ljj/n;->a:[Ljava/lang/String;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-static {v1, v6}, Lvg/r;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

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

    goto :goto_2

    :cond_2
    return-object v0
.end method


# virtual methods
.method public A(Landroid/content/Context;ZLjj/s;)V
    .locals 0

    if-eqz p3, :cond_0

    invoke-interface {p3, p1, p2}, Ljj/s;->d(Landroid/content/Context;Z)V

    :cond_0
    return-void
.end method

.method public B(Landroid/content/Context;ZLlj/a;Ljj/x;Ljj/r$d;Ljj/r$c;)V
    .locals 7

    if-nez p2, :cond_0

    invoke-virtual {p3, p6}, Llj/a;->a(Ljj/r$c;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Ljj/r;->q(Landroid/content/Context;)Ljj/s;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    sget p6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p6, v0, :cond_2

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Ljj/r;->z(Landroid/content/Context;Z)V

    return-void

    :cond_2
    invoke-interface {p2}, Ljj/s;->c()Ljava/lang/String;

    move-result-object p2

    const/4 p6, 0x0

    invoke-virtual {p0, p6, p1, p4, p2}, Ljj/r;->m(Ljava/lang/String;Landroid/content/Context;Ljj/x;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    if-eqz p2, :cond_3

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v5, p3

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Ljj/r;->F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLlj/a;Ljj/r$d;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public C(Landroid/content/Context;Lpj/f;)Ljava/lang/String;
    .locals 4

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-interface {p2}, Lpj/f;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk2/n;->g(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lpj/b;->c()Lqt/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpj/b;

    invoke-virtual {v2}, Lpj/b;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->s0()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lpj/b;->A:Lpj/b;

    invoke-virtual {p1}, Lpj/b;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-interface {p2}, Lpj/f;->l()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p1, v2}, Ljj/r;->f(Landroid/content/Context;Lpj/b;)V

    invoke-virtual {v2}, Lpj/b;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final D(Landroid/content/Context;)V
    .locals 1

    invoke-static {p1}, Lx5/p0;->h(Landroid/content/Context;)Lx5/p0;

    move-result-object p1

    sget-object v0, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->a:Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;

    invoke-virtual {v0, p1}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;->b(Lx5/p0;)V

    return-void
.end method

.method public F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLlj/a;Ljj/r$d;)V
    .locals 1

    if-eqz p5, :cond_0

    if-eqz p2, :cond_0

    if-eqz p6, :cond_0

    move-object v0, p1

    move-object p1, p5

    new-instance p5, Ljj/o;

    invoke-direct {p5, p6, v0}, Ljj/o;-><init>(Ljj/r$d;Landroid/content/Context;)V

    new-instance p6, Ljj/p;

    invoke-direct {p6}, Ljj/p;-><init>()V

    invoke-virtual/range {p1 .. p6}, Llj/a;->f(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    :cond_0
    return-void
.end method

.method public G(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Ljj/r;->a:Landroid/os/Bundle;

    return-void
.end method

.method public H(Landroid/content/Context;Ljava/lang/String;Ljj/x;Ljava/lang/String;)V
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

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p3, p1, p4, p2}, Ljj/x;->g(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final g(Landroid/content/Context;Lpj/b;)V
    .locals 0

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    invoke-virtual {p2}, Lpj/b;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk2/n;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final h(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    invoke-virtual {p0}, Ljj/r;->j()Ljava/util/List;

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

    invoke-virtual {p1, v1}, Lk2/n;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Ljj/r;->a:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Ljj/r;->a:Landroid/os/Bundle;

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

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "channel_calls"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public final m(Ljava/lang/String;Landroid/content/Context;Ljj/x;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    invoke-virtual {p3, p2, p4}, Ljj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

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

    invoke-virtual {p0, p1}, Ljj/r;->q(Landroid/content/Context;)Ljj/s;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljj/s;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public o(Landroid/content/Context;)Lmj/h0;
    .locals 0

    invoke-virtual {p0, p1}, Ljj/r;->q(Landroid/content/Context;)Ljj/s;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljj/s;->a()Lmj/h0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lmj/h0;->a:Lmj/h0;

    return-object p1
.end method

.method public p(Landroid/content/Context;Ljava/lang/String;Ljj/x;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p2, p1, p3, p4}, Ljj/r;->m(Ljava/lang/String;Landroid/content/Context;Ljj/x;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, p4}, Ljj/r;->H(Landroid/content/Context;Ljava/lang/String;Ljj/x;Ljava/lang/String;)V

    return-object v0
.end method

.method public final q(Landroid/content/Context;)Ljj/s;
    .locals 1

    invoke-static {}, Ljj/t;->g()Ljj/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljj/t;->h(Landroid/content/Context;)Ljj/s;

    move-result-object p1

    return-object p1
.end method

.method public r(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Ljj/r;->q(Landroid/content/Context;)Ljj/s;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljj/s;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public s(Landroid/content/Context;)V
    .locals 7

    new-instance v4, Ljj/x;

    invoke-direct {v4}, Ljj/x;-><init>()V

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

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

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "AndroidNotifStatePrefKey"

    invoke-virtual {v4, p1, v0}, Ljj/x;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v4, p1, v0}, Ljj/x;->b(Landroid/content/Context;Ljava/lang/String;)Z

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

    invoke-static {v1, v3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v4, p1, v0, v2}, Ljj/x;->f(Landroid/content/Context;Ljava/lang/String;Z)V

    const-string v0, "osSettings"

    invoke-static {v0, v2}, Lsg/t0;->l(Ljava/lang/String;Z)V

    new-instance v3, Llj/a;

    invoke-direct {v3}, Llj/a;-><init>()V

    iget-object v5, p0, Ljj/r;->b:Ljj/r$d;

    new-instance v6, Ljj/q;

    invoke-direct {v6, p1}, Ljj/q;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Ljj/r;->B(Landroid/content/Context;ZLlj/a;Ljj/x;Ljj/r$d;Ljj/r$c;)V

    :goto_1
    invoke-static {v1}, Ljj/r;->E(Landroid/content/Context;)V

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

    invoke-static {v4, v6}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const-string v4, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {p1, v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->d1()Z

    move-result v1

    const-string v4, "android_push_notification"

    if-eqz v1, :cond_0

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    invoke-virtual {v1, p1, v4, v5}, Lkm/f;->h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    invoke-virtual {v1, p1, v4, v5}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_0
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lkm/f;->k(Ljava/lang/String;)V

    invoke-static {v0, v3, v2, p1}, Lsg/t0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v5
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Ljj/r;->a:Landroid/os/Bundle;

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
    invoke-static {}, Lpj/c;->b()Lqt/a;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpj/c;

    new-instance v3, Landroid/app/NotificationChannelGroup;

    invoke-virtual {v2}, Lpj/c;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v2}, Lpj/c;->c()I

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

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object v0

    invoke-static {}, Lpj/a;->b()Lqt/a;

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

    check-cast v2, Lpj/a;

    invoke-virtual {v2}, Lpj/a;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lk2/n;->g(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Landroid/app/NotificationChannel;

    invoke-virtual {v2}, Lpj/a;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lpj/a;->d()I

    move-result v5

    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lpj/a;->c()I

    move-result v2

    invoke-direct {v3, v4, v5, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v0, v3}, Lk2/n;->c(Landroid/app/NotificationChannel;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public x(Landroid/content/Context;)V
    .locals 3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->s0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ljj/r;->v(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ljj/r;->w(Landroid/content/Context;)V

    :goto_0
    invoke-static {}, Lpj/b;->c()Lqt/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpj/b;

    invoke-virtual {v1}, Lpj/b;->q()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p1, v1}, Ljj/r;->f(Landroid/content/Context;Lpj/b;)V

    goto :goto_1

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->a5()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1, v1}, Ljj/r;->g(Landroid/content/Context;Lpj/b;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1}, Ljj/r;->h(Landroid/content/Context;)V

    return-void
.end method

.method public y(Landroid/content/Context;Lmj/i0;)V
    .locals 9

    const-string v0, "rbx.push"

    invoke-virtual {p2}, Lmj/i0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljj/x;

    invoke-direct {v0}, Ljj/x;-><init>()V

    invoke-virtual {p0, p1}, Ljj/r;->q(Landroid/content/Context;)Ljj/s;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljj/s;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lmj/i0;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lmj/i0;->b()Z

    move-result v6

    invoke-virtual {p0, p1, v4, v0, v1}, Ljj/r;->p(Landroid/content/Context;Ljava/lang/String;Ljj/x;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Llj/a;

    invoke-direct {v7}, Llj/a;-><init>()V

    iget-object v8, p0, Ljj/r;->b:Ljj/r$d;

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v8}, Ljj/r;->F(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLlj/a;Ljj/r$d;)V

    :cond_0
    return-void
.end method

.method public z(Landroid/content/Context;Z)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Ljj/r;->q(Landroid/content/Context;)Ljj/s;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Ljj/r;->A(Landroid/content/Context;ZLjj/s;)V

    :cond_0
    return-void
.end method
