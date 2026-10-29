.class public Ljj/c;
.super Ljj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljj/b<",
        "Lmj/m;",
        ">;"
    }
.end annotation


# static fields
.field public static c:Ljava/lang/String; = "key_reply_message"


# instance fields
.field public b:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljj/b;-><init>()V

    iput-wide p1, p0, Ljj/c;->b:J

    return-void
.end method

.method public static B(Landroid/content/Intent;)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {p0}, Lk2/t;->j(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Ljj/c;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljj/b;->m()Lmj/j0;

    move-result-object v0

    check-cast v0, Lmj/m;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Ljj/c;->y(Lmj/m;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final C(Lmj/m;Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 5

    if-eqz p1, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;

    invoke-direct {v0, p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "chat_message_replied"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->s2()Z

    move-result v1

    const-string v2, "EXTRA_CONVERSATION_ID"

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lmj/m;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lmj/m;->A()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    :goto_0
    const-string v1, "EXTRA_CATEGORY"

    invoke-virtual {p1}, Lmj/m;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "EXTRA_CONVERSATION_TITLE"

    invoke-virtual {p1}, Lmj/m;->B()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {p1}, Lmj/m;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "EXTRA_MESSAGE_ID"

    invoke-virtual {p1}, Lmj/m;->E()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lmj/m;->A()J

    move-result-wide v1

    long-to-int p1, v1

    const/high16 v1, 0x12000000

    invoke-static {p2, p1, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public D(Lmj/m;Lmj/m;)Z
    .locals 0

    invoke-virtual {p1}, Lmj/m;->E()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lmj/m;->E()Ljava/lang/String;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public E(Landroid/content/Intent;Lmj/m;)Landroid/content/Intent;
    .locals 3

    const-string v0, "EXTRA_CONVERSATION_ID"

    iget-wide v1, p0, Ljj/c;->b:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string v0, "EXTRA_CATEGORY"

    invoke-virtual {p2}, Lmj/m;->y()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p1
.end method

.method public F(Landroid/content/Intent;Lmj/m;)Landroid/content/Intent;
    .locals 3

    const-string v0, "EXTRA_CONVERSATION_ID"

    iget-wide v1, p0, Ljj/c;->b:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string v0, "EXTRA_CATEGORY"

    invoke-virtual {p2}, Lmj/m;->y()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p1
.end method

.method public G(Landroid/content/Context;Lmj/m;)V
    .locals 2

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    const-string v1, "FAILURE_NOTIFICATION_ID"

    invoke-virtual {v0, v1}, Lmj/v;->g(Ljava/lang/String;)Lmj/j0;

    invoke-super {p0, p1, p2}, Ljj/b;->d(Landroid/content/Context;Lmj/j0;)V

    return-void
.end method

.method public final H(Landroid/content/Context;Lk2/k$f;Ljava/lang/String;Z)Lk2/k$f;
    .locals 2

    sget v0, Lsg/q0;->H0:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz p4, :cond_0

    sget p4, Lsg/q0;->G0:I

    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p4, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {p2, v0}, Lk2/k$f;->k(Ljava/lang/CharSequence;)Lk2/k$f;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lk2/k$f;->s(Landroid/graphics/Bitmap;)Lk2/k$f;

    sget p3, Lsg/q0;->F0:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lk2/k$f;->l(Ljava/lang/CharSequence;)Lk2/k$f;

    new-instance p1, Lk2/k$d;

    invoke-direct {p1}, Lk2/k$d;-><init>()V

    invoke-virtual {p1, v0}, Lk2/k$d;->h(Ljava/lang/CharSequence;)Lk2/k$d;

    move-result-object p1

    invoke-virtual {p2, p1}, Lk2/k$f;->B(Lk2/k$i;)Lk2/k$f;

    return-object p2
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lmj/m;

    check-cast p2, Lmj/m;

    invoke-virtual {p0, p1, p2}, Ljj/c;->D(Lmj/m;Lmj/m;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic d(Landroid/content/Context;Lmj/j0;)V
    .locals 0

    check-cast p2, Lmj/m;

    invoke-virtual {p0, p1, p2}, Ljj/c;->G(Landroid/content/Context;Lmj/m;)V

    return-void
.end method

.method public h(Landroid/content/Context;ZLandroid/graphics/Bitmap;)Lk2/k$f;
    .locals 1

    invoke-super {p0, p1, p2, p3}, Ljj/b;->h(Landroid/content/Context;ZLandroid/graphics/Bitmap;)Lk2/k$f;

    move-result-object p2

    invoke-virtual {p0}, Ljj/b;->m()Lmj/j0;

    move-result-object p3

    check-cast p3, Lmj/m;

    instance-of v0, p3, Lmj/a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lmj/a;

    invoke-virtual {v0}, Lmj/a;->I()Z

    move-result v0

    invoke-virtual {p3}, Lmj/m;->B()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3, v0}, Ljj/c;->H(Landroid/content/Context;Lk2/k$f;Ljava/lang/String;Z)Lk2/k$f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Ljj/c;->A()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lk2/k$f;->k(Ljava/lang/CharSequence;)Lk2/k$f;

    invoke-virtual {p0, p1, p2}, Ljj/c;->x(Landroid/content/Context;Lk2/k$f;)Lk2/k$f;

    move-result-object p1

    return-object p1
.end method

.method public k(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "chat_message_received"

    return-object p1

    :cond_0
    const-string p1, "chat_message_cleared"

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

    const-class v0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;

    return-object v0
.end method

.method public n(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    iget-object p1, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {p1}, Lmj/v;->c()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljj/c;->z(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public o()I
    .locals 2

    iget-wide v0, p0, Ljj/c;->b:J

    long-to-int v0, v0

    return v0
.end method

.method public p(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljj/b;->m()Lmj/j0;

    move-result-object p1

    check-cast p1, Lmj/m;

    invoke-virtual {p1}, Lmj/m;->B()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public q()Ljava/lang/String;
    .locals 1

    const-string v0, "ChatNewMessage"

    return-object v0
.end method

.method public r()J
    .locals 2

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmj/v;->b(I)Lmj/j0;

    move-result-object v0

    check-cast v0, Lmj/m;

    invoke-virtual {v0}, Lmj/m;->F()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic u(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lmj/m;

    invoke-virtual {p0, p1, p2}, Ljj/c;->E(Landroid/content/Intent;Lmj/m;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic v(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lmj/m;

    invoke-virtual {p0, p1, p2}, Ljj/c;->F(Landroid/content/Intent;Lmj/m;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final x(Landroid/content/Context;Lk2/k$f;)Lk2/k$f;
    .locals 5

    sget v0, Lsg/q0;->E0:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lk2/t$d;

    sget-object v2, Ljj/c;->c:Ljava/lang/String;

    invoke-direct {v1, v2}, Lk2/t$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lk2/t$d;->b(Ljava/lang/CharSequence;)Lk2/t$d;

    move-result-object v1

    invoke-virtual {v1}, Lk2/t$d;->a()Lk2/t;

    move-result-object v1

    new-instance v2, Lk2/k$a$a;

    sget v3, Lsg/l0;->b:I

    invoke-virtual {p0}, Ljj/b;->m()Lmj/j0;

    move-result-object v4

    check-cast v4, Lmj/m;

    invoke-virtual {p0, v4, p1}, Ljj/c;->C(Lmj/m;Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-direct {v2, v3, v0, p1}, Lk2/k$a$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v2, v1}, Lk2/k$a$a;->a(Lk2/t;)Lk2/k$a$a;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lk2/k$a$a;->d(Z)Lk2/k$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lk2/k$a$a;->b()Lk2/k$a;

    move-result-object p1

    invoke-virtual {p2, p1}, Lk2/k$f;->b(Lk2/k$a;)Lk2/k$f;

    return-object p2
.end method

.method public final y(Lmj/m;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lmj/m;->C()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OneToOneConversation"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lmj/m;->G()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lmj/m;->D()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lmj/m;->D()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final z(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lmj/m;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x0

    if-lez p1, :cond_2

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_2

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmj/m;

    instance-of v3, v2, Lmj/a;

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    invoke-virtual {p0, v2}, Ljj/c;->y(Lmj/m;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Ljj/c;->y(Lmj/m;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method
