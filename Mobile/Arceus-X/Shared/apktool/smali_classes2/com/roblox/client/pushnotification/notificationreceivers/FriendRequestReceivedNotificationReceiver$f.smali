.class public final Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$1"
    f = "FriendRequestReceivedNotificationReceiver.kt"
    l = {
        0x39,
        0x3a
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;

.field public final synthetic v:Landroid/content/Intent;

.field public final synthetic w:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Intent;Landroid/content/Context;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;",
            "Landroid/content/Intent;",
            "Landroid/content/Context;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->u:Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;

    iput-object p2, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->v:Landroid/content/Intent;

    iput-object p3, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->w:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;

    iget-object v0, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->u:Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;

    iget-object v1, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->v:Landroid/content/Intent;

    iget-object v2, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->w:Landroid/content/Context;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;-><init>(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Intent;Landroid/content/Context;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->u:Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;

    iget-object v1, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->v:Landroid/content/Intent;

    iget-object v4, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->w:Landroid/content/Context;

    iput v3, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->t:I

    invoke-static {p1, v1, v4, p0}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->q(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Intent;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->u:Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;

    invoke-static {p1}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->p(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;)Lku/l0;

    move-result-object p1

    new-instance v1, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f$a;

    iget-object v3, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->u:Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;

    iget-object v4, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->w:Landroid/content/Context;

    iget-object v5, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->v:Landroid/content/Intent;

    const/4 v6, 0x0

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f$a;-><init>(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Context;Landroid/content/Intent;Lnt/b;)V

    iput v2, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;->t:I

    invoke-static {p1, v1, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
