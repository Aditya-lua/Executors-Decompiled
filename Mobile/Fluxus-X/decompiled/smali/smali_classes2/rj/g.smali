.class public Lrj/g;
.super Lrj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lrj/b<",
        "Luj/u;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lrj/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(Luj/u;Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;

    invoke-direct {v0, p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string p3, "EXTRA_NOTIFICATION_USER_ID"

    invoke-virtual {p1}, Luj/u;->i()J

    move-result-wide v1

    invoke-virtual {v0, p3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string p3, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {p1}, Luj/u;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, 0x0

    const/high16 p3, 0x12000000

    invoke-static {p2, p1, v0, p3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public B(Landroid/content/Intent;Luj/u;)Landroid/content/Intent;
    .locals 4

    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->i()I

    move-result v0

    const-string v1, "EXTRA_STACKED_NOTIFICATION"

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    const-string p2, "EXTRA_CATEGORY"

    const-string v0, "FriendRequestReceived"

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p1

    :cond_0
    const-string v0, "EXTRA_NOTIFICATION_USER_ID"

    invoke-virtual {p2}, Luj/u;->i()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const/4 p2, 0x0

    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p1
.end method

.method public C(Landroid/content/Intent;Luj/u;)Landroid/content/Intent;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Luj/u;

    check-cast p2, Luj/u;

    invoke-virtual {p0, p1, p2}, Lrj/g;->z(Luj/u;Luj/u;)Z

    move-result p1

    return p1
.end method

.method public k(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "friend_request_received"

    return-object p1

    :cond_0
    const-string p1, "friend_request_received_cleared"

    return-object p1
.end method

.method public l()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-class v0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;

    return-object v0
.end method

.method public n(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->i()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lbh/q0;->d1:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->i()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Luj/v;->b(I)Luj/j0;

    move-result-object v0

    check-cast v0, Luj/u;

    invoke-virtual {p0, v0}, Lrj/g;->y(Luj/u;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->i()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lbh/q0;->c1:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->i()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v3}, Luj/v;->b(I)Luj/j0;

    move-result-object v0

    check-cast v0, Luj/u;

    invoke-virtual {p0, v0}, Lrj/g;->y(Luj/u;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v1}, Luj/v;->i()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {v1, v3}, Luj/v;->b(I)Luj/j0;

    move-result-object v1

    check-cast v1, Luj/u;

    invoke-virtual {p0, v1}, Lrj/g;->y(Luj/u;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->i()I

    move-result v0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lbh/q0;->a1:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->i()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v3}, Luj/v;->b(I)Luj/j0;

    move-result-object v0

    check-cast v0, Luj/u;

    invoke-virtual {p0, v0}, Lrj/g;->y(Luj/u;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v1}, Luj/v;->i()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {v1, v3}, Luj/v;->b(I)Luj/j0;

    move-result-object v1

    check-cast v1, Luj/u;

    invoke-virtual {p0, v1}, Lrj/g;->y(Luj/u;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->i()I

    move-result v0

    if-le v0, v3, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lbh/q0;->T0:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->i()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v3}, Luj/v;->b(I)Luj/j0;

    move-result-object v0

    check-cast v0, Luj/u;

    invoke-virtual {p0, v0}, Lrj/g;->y(Luj/u;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v1}, Luj/v;->i()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {v1, v3}, Luj/v;->b(I)Luj/j0;

    move-result-object v1

    check-cast v1, Luj/u;

    invoke-virtual {p0, v1}, Lrj/g;->y(Luj/u;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public o()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    const-string v0, "FriendRequestReceived"

    return-object v0
.end method

.method public r()J
    .locals 2

    iget-object v0, p0, Lrj/b;->a:Luj/v;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Luj/v;->b(I)Luj/j0;

    move-result-object v0

    check-cast v0, Luj/u;

    invoke-virtual {v0}, Luj/u;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic u(Landroid/content/Intent;Luj/j0;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Luj/u;

    invoke-virtual {p0, p1, p2}, Lrj/g;->B(Landroid/content/Intent;Luj/u;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic v(Landroid/content/Intent;Luj/j0;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Luj/u;

    invoke-virtual {p0, p1, p2}, Lrj/g;->C(Landroid/content/Intent;Luj/u;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public w(Landroid/content/Context;Lk2/k$f;)V
    .locals 3

    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0}, Luj/v;->i()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lrj/b;->a:Luj/v;

    invoke-virtual {v0, v2}, Luj/v;->b(I)Luj/j0;

    move-result-object v0

    check-cast v0, Luj/u;

    invoke-virtual {p0, p1, p2, v0}, Lrj/g;->x(Landroid/content/Context;Lk2/k$f;Luj/u;)Lk2/k$f;

    :cond_0
    invoke-virtual {p2}, Lk2/k$f;->d()Landroid/app/Notification;

    move-result-object p2

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    invoke-virtual {p1, v2, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    :cond_1
    return-void
.end method

.method public final x(Landroid/content/Context;Lk2/k$f;Luj/u;)Lk2/k$f;
    .locals 3

    sget v0, Lbh/l0;->a:I

    sget v1, Lbh/q0;->M0:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "friend_request_received_accepted"

    invoke-virtual {p0, p3, p1, v2}, Lrj/g;->A(Luj/u;Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {p2, v0, v1, v2}, Lk2/k$f;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lk2/k$f;

    sget v0, Lbh/l0;->i:I

    sget v1, Lbh/q0;->N0:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "friend_request_received_ignored"

    invoke-virtual {p0, p3, p1, v2}, Lrj/g;->A(Luj/u;Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lk2/k$f;->a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lk2/k$f;

    return-object p2
.end method

.method public final y(Luj/u;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Luj/u;->j()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public z(Luj/u;Luj/u;)Z
    .locals 2

    invoke-virtual {p1}, Luj/u;->i()J

    move-result-wide v0

    invoke-virtual {p2}, Luj/u;->i()J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
