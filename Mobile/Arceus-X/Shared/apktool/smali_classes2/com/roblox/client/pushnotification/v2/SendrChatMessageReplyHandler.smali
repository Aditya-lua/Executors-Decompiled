.class public Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;
.super Lnj/h;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnj/h;-><init>()V

    return-void
.end method

.method public static synthetic k(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    move-object p4, p1

    move-object p1, p0

    new-instance p0, Ljj/i;

    invoke-direct {p0}, Ljj/i;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChatNewMessage_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    move-object v2, p3

    move-object p3, p2

    move-object p2, p4

    move-object p4, v2

    invoke-virtual/range {p0 .. p5}, Ljj/i;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string p0, "rbx.push"

    const-string p1, "Failed to send Chat Message"

    invoke-static {p0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic l(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    move-wide v0, p1

    move-object p1, p0

    new-instance p0, Ljj/i;

    invoke-direct {p0}, Ljj/i;-><init>()V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p6, "ChatNewMessage_"

    invoke-virtual {p2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    move p6, p7

    invoke-virtual/range {p0 .. p6}, Ljj/i;->e(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;Z)V

    const-string p0, "rbx.push"

    const-string p1, "Failed to send Chat Message"

    invoke-static {p0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public j(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 2

    const-string p1, "EXTRA_NOTIFICATION_TYPE"

    const-string v0, "ChatNewMessage"

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-wide/16 v0, -0x1

    const-string p1, "EXTRA_CONVERSATION_ID"

    invoke-virtual {p3, p1, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {p2, p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    return-object p2
.end method

.method public final m(JLjava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In markChatNotificationAsRead(), conversationId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ,messageId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "rbx.push"

    invoke-static {v0, p3}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Loi/f;->c(JLjava/lang/String;)V

    return-void
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In markChatNotificationAsRead(), conversationGuid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,messageId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "rbx.push"

    invoke-static {v0, p2}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, -0x1

    invoke-static {v0, v1, p1}, Loi/f;->c(JLjava/lang/String;)V

    return-void
.end method

.method public final o(JLjava/lang/String;Landroid/content/Context;JLjava/lang/String;)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Loj/k;

    move-wide v4, p1

    move-object v1, p4

    move-wide v2, p5

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Loj/k;-><init>(Landroid/content/Context;JJLjava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {v4, v5, p1, p3, v0}, Loi/f;->d(JLjava/lang/String;Ljava/lang/String;Loi/f$a;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    invoke-super/range {p0 .. p2}, Lnj/h;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "chat_message_replied"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "rbx.push"

    const-string v1, "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED"

    invoke-static {v0, v1}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "EXTRA_MESSAGE_ID"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->s2()Z

    move-result v0

    const-string v1, "EXTRA_CONVERSATION_ID"

    const-wide/16 v2, -0x1

    if-eqz v0, :cond_0

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p2, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    const-string v0, ""

    goto :goto_0

    :goto_1
    const-string v0, "EXTRA_CONVERSATION_TITLE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "tag"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "notification"

    invoke-virtual {p1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/NotificationManager;

    if-eqz v4, :cond_1

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v7

    invoke-virtual {v4, v0, v7}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    :cond_1
    invoke-static {p2}, Ljj/c;->B(Landroid/content/Intent;)Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v4

    invoke-interface {v4}, Lth/i;->s2()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v4, v1

    move-object v0, p0

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;->p(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    invoke-virtual {p0, v0, v8}, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;->n(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v7, v5

    move-wide v5, v2

    move-object v4, p1

    move-wide v1, v2

    move-object v3, v0

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;->o(JLjava/lang/String;Landroid/content/Context;JLjava/lang/String;)V

    invoke-virtual {p0, v1, v2, v8}, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;->m(JLjava/lang/String;)V

    :goto_2
    const/4 v4, 0x1

    const-string v5, "ChatNewMessage"

    const-string v1, "chat message replied"

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, Lnj/h;->b(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V

    :cond_3
    return-void
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Loj/j;

    invoke-direct {v0, p3, p4, p1, p5}, Loj/j;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 p3, -0x1

    invoke-static {p3, p4, p1, p2, v0}, Loi/f;->d(JLjava/lang/String;Ljava/lang/String;Loi/f$a;)V

    return-void
.end method
