.class public Ljj/f;
.super Ljj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljj/b<",
        "Lmj/q;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljj/b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lmj/q;

    check-cast p2, Lmj/q;

    invoke-virtual {p0, p1, p2}, Ljj/f;->x(Lmj/q;Lmj/q;)Z

    move-result p1

    return p1
.end method

.method public k(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "friend_request_accepted"

    return-object p1

    :cond_0
    const-string p1, "friend_request_accepted_cleared"

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

    const-class v0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestAcceptedNotificationReceiver;

    return-object v0
.end method

.method public n(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0}, Lmj/v;->i()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lmj/v;->b(I)Lmj/j0;

    move-result-object v0

    check-cast v0, Lmj/q;

    invoke-virtual {v0}, Lmj/q;->j()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v1}, Lmj/v;->i()I

    move-result v1

    const/4 v3, 0x2

    if-le v1, v2, :cond_0

    iget-object v1, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v1}, Lmj/v;->i()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-virtual {v1, v4}, Lmj/v;->b(I)Lmj/j0;

    move-result-object v1

    check-cast v1, Lmj/q;

    invoke-virtual {v1}, Lmj/q;->j()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    iget-object v4, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v4}, Lmj/v;->i()I

    move-result v4

    if-ne v4, v2, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v1, Lsg/q0;->O0:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v2, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v2}, Lmj/v;->i()I

    move-result v2

    if-ne v2, v3, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v2, Lsg/q0;->R0:I

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v2, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v2}, Lmj/v;->i()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v2, Lsg/q0;->P0:I

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object v2, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v2}, Lmj/v;->i()I

    move-result v2

    if-le v2, v3, :cond_4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v2, Lsg/q0;->I0:I

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public o()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    const-string v0, "FriendRequestAccepted"

    return-object v0
.end method

.method public r()J
    .locals 2

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmj/v;->b(I)Lmj/j0;

    move-result-object v0

    check-cast v0, Lmj/q;

    invoke-virtual {v0}, Lmj/q;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic u(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lmj/q;

    invoke-virtual {p0, p1, p2}, Ljj/f;->y(Landroid/content/Intent;Lmj/q;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic v(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lmj/q;

    invoke-virtual {p0, p1, p2}, Ljj/f;->z(Landroid/content/Intent;Lmj/q;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public x(Lmj/q;Lmj/q;)Z
    .locals 2

    invoke-virtual {p1}, Lmj/q;->i()J

    move-result-wide v0

    invoke-virtual {p2}, Lmj/q;->i()J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public y(Landroid/content/Intent;Lmj/q;)Landroid/content/Intent;
    .locals 4

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0}, Lmj/v;->i()I

    move-result v0

    const-string v1, "EXTRA_STACKED_NOTIFICATION"

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    const-string p2, "EXTRA_NOTIFICATION_TYPE"

    const-string v0, "FriendRequestAccepted"

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "EXTRA_CATEGORY"

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p1

    :cond_0
    const-string v0, "EXTRA_NOTIFICATION_USER_ID"

    invoke-virtual {p2}, Lmj/q;->i()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const/4 p2, 0x0

    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p1
.end method

.method public z(Landroid/content/Intent;Lmj/q;)Landroid/content/Intent;
    .locals 0

    return-object p1
.end method
