.class public Ljj/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmj/f0;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lmj/f0;->d()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Lorg/json/JSONObject;)Lmj/f0;
    .locals 0

    :try_start_0
    invoke-static {p1}, Lmj/f0;->a(Lorg/json/JSONObject;)Lmj/f0;

    move-result-object p1
    :try_end_0
    .catch Ljj/h; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgk/q;->d(Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Landroid/content/Context;Lmj/f0;Ljj/i;Ljj/e;Ljj/d;)V
    .locals 2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p2}, Ljj/k;->a(Lmj/f0;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eqz p3, :cond_1

    const-string v1, "FriendRequestAccepted"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "FriendRequestReceived"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "PrivateMessageReceived"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "ChatNewMessage"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {p3, p2, p1}, Ljj/i;->g(Lmj/f0;Landroid/content/Context;)V

    return-void

    :cond_1
    const-string p3, "PushExpiryMessage"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    if-eqz p4, :cond_2

    invoke-virtual {p4, p2, p1}, Ljj/e;->b(Lmj/f0;Landroid/content/Context;)V

    return-void

    :cond_2
    const-string p3, "PushCategoryExpiryMessage"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    if-eqz p5, :cond_3

    invoke-virtual {p5, p2, p1}, Ljj/d;->b(Lmj/f0;Landroid/content/Context;)V

    :cond_3
    return-void
.end method

.method public d(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 6

    invoke-virtual {p0, p1}, Ljj/k;->b(Lorg/json/JSONObject;)Lmj/f0;

    move-result-object v2

    new-instance v3, Ljj/i;

    invoke-direct {v3}, Ljj/i;-><init>()V

    new-instance v4, Ljj/e;

    invoke-direct {v4}, Ljj/e;-><init>()V

    new-instance v5, Ljj/d;

    invoke-direct {v5}, Ljj/d;-><init>()V

    move-object v0, p0

    move-object v1, p2

    invoke-virtual/range {v0 .. v5}, Ljj/k;->c(Landroid/content/Context;Lmj/f0;Ljj/i;Ljj/e;Ljj/d;)V

    return-void
.end method
