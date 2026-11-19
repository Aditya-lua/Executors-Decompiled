.class public Lrj/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)J
    .locals 2

    invoke-static {p1}, Lok/g;->a(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Luj/f0;Landroid/content/Context;)V
    .locals 5

    invoke-virtual {p0, p1}, Lrj/d;->c(Luj/f0;)Luj/d0;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0, p1}, Lrj/d;->g(Luj/d0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lrj/d;->f(Luj/d0;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    invoke-virtual {p0, v1}, Lrj/d;->a(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "FriendRequestReceived"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_1
    const-string v3, "PrivateMessageReceived"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_2
    const-string v3, "ChatNewMessage"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_3
    const-string v3, "FriendRequestAccepted"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-virtual {p1}, Luj/d0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lrj/d;->d(Ljava/lang/String;)Lrj/j;

    move-result-object p1

    invoke-virtual {p0, p1, p2, v1, v2}, Lrj/d;->h(Lrj/j;Landroid/content/Context;J)V

    return-void

    :pswitch_1
    invoke-virtual {p0, v0}, Lrj/d;->e(Ljava/lang/String;)Lrj/j;

    move-result-object p1

    invoke-virtual {p0, p1, p2, v1, v2}, Lrj/d;->h(Lrj/j;Landroid/content/Context;J)V

    :cond_4
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x253fa4b8 -> :sswitch_3
        0x3766c7df -> :sswitch_2
        0x3ea07f25 -> :sswitch_1
        0x74fceef2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public c(Luj/f0;)Luj/d0;
    .locals 1

    :try_start_0
    new-instance v0, Luj/d0;

    invoke-direct {v0, p1}, Luj/d0;-><init>(Luj/f0;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Ljava/lang/String;)Lrj/j;
    .locals 1

    invoke-static {}, Lrj/u;->c()Lrj/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrj/u;->b(Ljava/lang/String;)Lrj/j;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;)Lrj/j;
    .locals 1

    invoke-static {}, Lrj/u;->c()Lrj/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrj/u;->d(Ljava/lang/String;)Lrj/j;

    move-result-object p1

    return-object p1
.end method

.method public final f(Luj/d0;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Luj/d0;->e()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final g(Luj/d0;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Luj/d0;->d()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public h(Lrj/j;Landroid/content/Context;J)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2, p3, p4}, Lrj/j;->d(Landroid/content/Context;J)V

    :cond_0
    return-void
.end method
