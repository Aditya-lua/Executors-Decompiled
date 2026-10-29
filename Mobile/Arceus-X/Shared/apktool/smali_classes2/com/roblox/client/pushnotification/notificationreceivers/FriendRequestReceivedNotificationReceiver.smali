.class public final Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;
.super Lnj/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u000c*\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ:\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u001b2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0082@\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010,\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;",
        "Lnj/a;",
        "Lku/l0;",
        "ioDispatcher",
        "mainDispatcher",
        "Lkotlin/Function0;",
        "Lzk/f;",
        "friendsInterfaceProvider",
        "<init>",
        "(Lku/l0;Lku/l0;Lkotlin/jvm/functions/Function0;)V",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
        "bundle",
        "k",
        "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;",
        "u",
        "(Landroid/content/Intent;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;",
        "v",
        "Lkotlin/time/a;",
        "delayDuration",
        "z",
        "(Landroid/content/Context;J)V",
        "",
        "userErrorLabelResId",
        "",
        "reportingContext",
        "actionTaken",
        "w",
        "(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "b",
        "Lku/l0;",
        "c",
        "Lkotlin/jvm/functions/Function0;",
        "Lku/p0;",
        "d",
        "Lku/p0;",
        "broadcastScope",
        "t",
        "()Lzk/f;",
        "friendsInterface",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lku/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lzk/f;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;-><init>(Lku/l0;Lku/l0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lku/l0;Lku/l0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/l0;",
            "Lku/l0;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lzk/f;",
            ">;)V"
        }
    .end annotation

    const-string v0, "ioDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "friendsInterfaceProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lnj/a;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->b:Lku/l0;

    .line 4
    iput-object p3, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->c:Lkotlin/jvm/functions/Function0;

    const/4 p2, 0x0

    const/4 p3, 0x1

    .line 5
    invoke-static {p2, p3, p2}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object p2

    invoke-interface {p2, p1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->d:Lku/p0;

    return-void
.end method

.method public synthetic constructor <init>(Lku/l0;Lku/l0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 7
    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 8
    new-instance p3, Lnj/f;

    invoke-direct {p3}, Lnj/f;-><init>()V

    .line 9
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;-><init>(Lku/l0;Lku/l0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic A(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Context;JILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-static {}, Lnj/g;->a()J

    move-result-wide p2

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->z(Landroid/content/Context;J)V

    return-void
.end method

.method public static synthetic l(Landroid/content/BroadcastReceiver$PendingResult;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->y(Landroid/content/BroadcastReceiver$PendingResult;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Landroid/content/BroadcastReceiver$PendingResult;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->x(Landroid/content/BroadcastReceiver$PendingResult;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n()Lzk/f;
    .locals 1

    invoke-static {}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->o()Lzk/f;

    move-result-object v0

    return-object v0
.end method

.method public static final o()Lzk/f;
    .locals 1

    invoke-static {}, Lvk/g;->d()Lvk/d;

    move-result-object v0

    invoke-interface {v0}, Lvk/d;->b()Lzk/f;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic p(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;)Lku/l0;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->b:Lku/l0;

    return-object p0
.end method

.method public static final synthetic q(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Intent;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->u(Landroid/content/Intent;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Intent;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->v(Landroid/content/Intent;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->w(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final x(Landroid/content/BroadcastReceiver$PendingResult;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final y(Landroid/content/BroadcastReceiver$PendingResult;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public k(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "bundle"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "EXTRA_NOTIFICATION_TYPE"

    const-string v0, "FriendRequestReceived"

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-wide/16 v0, -0x1

    const-string p2, "EXTRA_NOTIFICATION_USER_ID"

    invoke-virtual {p3, p2, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {p1, p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    return-object p1
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lnj/a;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x36c30d5b

    const-string v4, "FriendRequestReceived"

    if-eq v2, v3, :cond_3

    const v3, 0x386c2434

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "friend_request_received_accepted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "rbx.push"

    const-string v2, "FRRNR.onReceive() INTENT_ACTION_RECEIVED_FRIEND_REQUEST_ACCEPTED"

    invoke-static {v1, v2}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "Accept"

    invoke-virtual {p0, v4, p1, p2, v1}, Lnj/a;->h(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Lnj/a;->a(Landroid/content/Context;I)V

    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v1

    iget-object v2, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->d:Lku/p0;

    new-instance v5, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;

    invoke-direct {v5, p0, p2, p1, v0}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$f;-><init>(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Intent;Landroid/content/Context;Lnt/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p1

    new-instance p2, Lnj/d;

    invoke-direct {p2, v1}, Lnj/d;-><init>(Landroid/content/BroadcastReceiver$PendingResult;)V

    invoke-interface {p1, p2}, Lku/d2;->q(Lkotlin/jvm/functions/Function1;)Lku/i1;

    return-void

    :cond_3
    const-string v2, "friend_request_received_ignored"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const-string v1, "Decline"

    invoke-virtual {p0, v4, p1, p2, v1}, Lnj/a;->h(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v1

    iget-object v2, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->d:Lku/p0;

    new-instance v5, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$g;

    invoke-direct {v5, p0, p2, p1, v0}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$g;-><init>(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Intent;Landroid/content/Context;Lnt/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p1

    new-instance p2, Lnj/e;

    invoke-direct {p2, v1}, Lnj/e;-><init>(Landroid/content/BroadcastReceiver$PendingResult;)V

    invoke-interface {p1, p2}, Lku/d2;->q(Lkotlin/jvm/functions/Function1;)Lku/i1;

    :cond_5
    :goto_1
    return-void
.end method

.method public final t()Lzk/f;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->c:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/f;

    return-object v0
.end method

.method public final u(Landroid/content/Intent;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Landroid/content/Context;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p3

    instance-of v3, v0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;

    iget v4, v3, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->D:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->D:I

    :goto_0
    move-object v7, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;

    invoke-direct {v3, v1, v0}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;-><init>(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Lnt/b;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->B:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v8

    iget v3, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->D:I

    const/4 v9, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v10, 0x0

    if-eqz v3, :cond_5

    if-eq v3, v6, :cond_4

    if-eq v3, v5, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v9, :cond_1

    iget-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/Unit;

    iget-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->v:Ljava/lang/Object;

    check-cast v2, Lkotlin/Unit;

    iget-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->u:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    iget-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->t:Ljava/lang/Object;

    check-cast v2, Landroid/content/Intent;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->y:J

    iget-object v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->v:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Throwable;

    iget-object v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->u:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    iget-object v5, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->t:Ljava/lang/Object;

    check-cast v5, Landroid/content/Intent;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    iget-wide v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->y:J

    iget-object v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->w:Ljava/lang/Object;

    check-cast v4, Lcl/b;

    iget-object v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->v:Ljava/lang/Object;

    check-cast v4, Ljv/x;

    iget-object v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->u:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    iget-object v5, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->t:Ljava/lang/Object;

    check-cast v5, Landroid/content/Intent;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_4
    iget-wide v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->y:J

    iget-object v6, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->v:Ljava/lang/Object;

    check-cast v6, Ljv/d;

    iget-object v6, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->u:Ljava/lang/Object;

    check-cast v6, Landroid/content/Context;

    iget-object v11, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->t:Ljava/lang/Object;

    check-cast v11, Landroid/content/Intent;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-wide v13, v2

    move-object v3, v6

    move-object v2, v11

    goto :goto_2

    :catchall_0
    move-exception v0

    move-wide v13, v2

    move-object v3, v6

    move-object v2, v11

    goto :goto_4

    :cond_5
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    const-string v0, "EXTRA_NOTIFICATION_USER_ID"

    const-wide/16 v11, -0x1

    invoke-virtual {v2, v0, v11, v12}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v13

    cmp-long v0, v13, v11

    if-eqz v0, :cond_6

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_6
    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->t()Lzk/f;

    move-result-object v0

    invoke-interface {v0, v13, v14}, Lzk/f;->b(J)Ljv/d;

    move-result-object v0

    :try_start_1
    sget-object v3, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->t:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v3, p2

    :try_start_2
    iput-object v3, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->u:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->v:Ljava/lang/Object;

    iput-wide v13, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->y:J

    iput v10, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->z:I

    iput v6, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->D:I

    invoke-static {v0, v7}, Ljv/p;->c(Ljv/d;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_7

    goto/16 :goto_b

    :cond_7
    :goto_2
    check-cast v0, Ljv/x;

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    move-object/from16 v16, v3

    move-object v3, v2

    move-object/from16 v2, v16

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object/from16 v3, p2

    :goto_4
    sget-object v6, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :goto_5
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-nez v6, :cond_c

    check-cast v0, Ljv/x;

    new-instance v4, Lcl/b;

    invoke-direct {v4, v0}, Lcl/b;-><init>(Ljv/x;)V

    invoke-virtual {v4}, Lcl/b;->b()Z

    move-result v6

    if-nez v6, :cond_b

    iget v6, v4, Lcl/b;->a:I

    const/16 v11, 0x191

    if-ne v6, v11, :cond_8

    sget v12, Lsg/q0;->h:I

    goto :goto_6

    :cond_8
    sget v12, Lsg/q0;->U0:I

    :goto_6
    if-ne v6, v11, :cond_9

    const-string v6, "unauthenticated"

    goto :goto_7

    :cond_9
    invoke-virtual {v4}, Lcl/b;->a()I

    move-result v11

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "code_"

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "error_"

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_7
    iput-object v3, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->t:Ljava/lang/Object;

    iput-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->u:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->v:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->w:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->x:Ljava/lang/Object;

    iput-wide v13, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->y:J

    iput v10, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->z:I

    iput v12, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->A:I

    iput v5, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->D:I

    move-object v5, v6

    const-string v6, "Accept"

    move v4, v12

    invoke-virtual/range {v1 .. v7}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->w(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_a

    move-object/from16 v1, p0

    goto/16 :goto_b

    :cond_a
    move-object v4, v2

    move-object v5, v3

    move-wide v2, v13

    :goto_8
    move-wide v13, v2

    move-object v2, v4

    move-object v3, v5

    :cond_b
    move-object/from16 v1, p0

    goto :goto_a

    :cond_c
    sget v0, Lsg/q0;->U0:I

    iput-object v3, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->t:Ljava/lang/Object;

    iput-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->v:Ljava/lang/Object;

    iput-wide v13, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->y:J

    iput v10, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->z:I

    iput v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->D:I

    const-string v5, "client_failure"

    const-string v6, "Accept"

    move-object/from16 v1, p0

    move v4, v0

    invoke-virtual/range {v1 .. v7}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->w(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_d

    goto :goto_b

    :cond_d
    move-object v4, v2

    move-object v5, v3

    move-wide v2, v13

    :goto_9
    move-wide v13, v2

    move-object v2, v4

    move-object v3, v5

    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    iget-object v4, v1, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->b:Lku/l0;

    new-instance v5, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$b;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v2, v3, v6}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$b;-><init>(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Context;Landroid/content/Intent;Lnt/b;)V

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->t:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->u:Ljava/lang/Object;

    iput-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->v:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->w:Ljava/lang/Object;

    iput-object v6, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->x:Ljava/lang/Object;

    iput-wide v13, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->y:J

    iput v10, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->z:I

    const/4 v2, 0x4

    iput v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$a;->D:I

    invoke-static {v4, v5, v7}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_e

    :goto_b
    return-object v8

    :cond_e
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final v(Landroid/content/Intent;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Landroid/content/Context;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    instance-of v4, v0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;

    iget v5, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->D:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->D:I

    :goto_0
    move-object v7, v4

    goto :goto_1

    :cond_0
    new-instance v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;

    invoke-direct {v4, v1, v0}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;-><init>(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Lnt/b;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->B:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v8

    iget v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->D:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v9, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->v:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Throwable;

    iget-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->u:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    iget-object v3, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->t:Ljava/lang/Object;

    check-cast v3, Landroid/content/Intent;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->w:Ljava/lang/Object;

    check-cast v2, Lcl/b;

    iget-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->v:Ljava/lang/Object;

    check-cast v2, Ljv/x;

    iget-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->u:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    iget-object v3, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->t:Ljava/lang/Object;

    check-cast v3, Landroid/content/Intent;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    iget-wide v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->y:J

    iget-object v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->v:Ljava/lang/Object;

    check-cast v4, Ljv/d;

    iget-object v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->u:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    iget-object v9, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->t:Ljava/lang/Object;

    check-cast v9, Landroid/content/Intent;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-wide v13, v2

    move-object v3, v4

    move-object v2, v9

    goto :goto_2

    :catchall_0
    move-exception v0

    move-wide v13, v2

    move-object v3, v4

    move-object v2, v9

    goto :goto_4

    :cond_4
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    const-string v0, "EXTRA_NOTIFICATION_USER_ID"

    const-wide/16 v11, -0x1

    invoke-virtual {v2, v0, v11, v12}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v13

    cmp-long v0, v13, v11

    if-nez v0, :cond_5

    invoke-virtual {v1, v3, v10}, Lnj/a;->a(Landroid/content/Context;I)V

    goto/16 :goto_c

    :cond_5
    invoke-virtual {v1}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->t()Lzk/f;

    move-result-object v0

    invoke-interface {v0, v13, v14}, Lzk/f;->a(J)Ljv/d;

    move-result-object v0

    :try_start_1
    sget-object v4, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->t:Ljava/lang/Object;

    iput-object v3, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->u:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->v:Ljava/lang/Object;

    iput-wide v13, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->y:J

    iput v10, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->z:I

    iput v9, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->D:I

    invoke-static {v0, v7}, Ljv/p;->c(Ljv/d;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_6

    goto/16 :goto_a

    :cond_6
    :goto_2
    check-cast v0, Ljv/x;

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_3
    move-object v15, v3

    move-object v3, v2

    move-object v2, v15

    goto :goto_5

    :catchall_1
    move-exception v0

    :goto_4
    sget-object v4, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :goto_5
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_b

    check-cast v0, Ljv/x;

    new-instance v4, Lcl/b;

    invoke-direct {v4, v0}, Lcl/b;-><init>(Ljv/x;)V

    invoke-virtual {v4}, Lcl/b;->b()Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->A(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Landroid/content/Context;JILjava/lang/Object;)V

    move-object/from16 v1, p0

    goto/16 :goto_c

    :cond_7
    iget v1, v4, Lcl/b;->a:I

    const/16 v5, 0x191

    if-ne v1, v5, :cond_8

    sget v9, Lsg/q0;->h:I

    goto :goto_6

    :cond_8
    sget v9, Lsg/q0;->U0:I

    :goto_6
    if-ne v1, v5, :cond_9

    const-string v1, "unauthenticated"

    :goto_7
    move-object v5, v1

    goto :goto_8

    :cond_9
    invoke-virtual {v4}, Lcl/b;->a()I

    move-result v5

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "code_"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "error_"

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :goto_8
    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->t:Ljava/lang/Object;

    iput-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->u:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->v:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->w:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->x:Ljava/lang/Object;

    iput-wide v13, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->y:J

    iput v10, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->z:I

    iput v9, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->A:I

    iput v6, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->D:I

    const-string v6, "Decline"

    move-object/from16 v1, p0

    move v4, v9

    invoke-virtual/range {v1 .. v7}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->w(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_a

    goto :goto_a

    :cond_a
    :goto_9
    invoke-virtual {v1, v2, v10}, Lnj/a;->a(Landroid/content/Context;I)V

    goto :goto_c

    :cond_b
    move-object v0, v4

    sget v4, Lsg/q0;->U0:I

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->t:Ljava/lang/Object;

    iput-object v2, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->u:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->v:Ljava/lang/Object;

    iput-wide v13, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->y:J

    iput v10, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->z:I

    iput v5, v7, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$c;->D:I

    const-string v5, "client_failure"

    const-string v6, "Decline"

    invoke-virtual/range {v1 .. v7}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->w(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_c

    :goto_a
    return-object v8

    :cond_c
    :goto_b
    invoke-virtual {v1, v2, v10}, Lnj/a;->a(Landroid/content/Context;I)V

    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final w(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v3, p6

    instance-of v4, v3, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;

    iget v5, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->A:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->A:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;

    invoke-direct {v4, p0, v3}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;-><init>(Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;Lnt/b;)V

    :goto_0
    iget-object v3, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->y:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v5

    iget v6, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->A:I

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v1, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->v:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v5, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->u:Ljava/lang/Object;

    check-cast v5, Landroid/content/Intent;

    iget-object v4, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->t:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    invoke-static {v3}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v7, v1

    move-object v1, v2

    move-object v2, v4

    move-object v3, v5

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v3}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->b:Lku/l0;

    new-instance v6, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$e;

    const/4 v8, 0x0

    invoke-direct {v6, p1, p3, v8}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$e;-><init>(Landroid/content/Context;ILnt/b;)V

    iput-object p1, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->t:Ljava/lang/Object;

    iput-object p2, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->u:Ljava/lang/Object;

    iput-object p4, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->v:Ljava/lang/Object;

    move-object v9, p5

    iput-object v9, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->w:Ljava/lang/Object;

    iput p3, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->x:I

    iput v7, v4, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver$d;->A:I

    invoke-static {v3, v6, v4}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_3

    return-object v5

    :cond_3
    move-object v2, p1

    move-object v3, p2

    move-object v1, p4

    move-object v7, v9

    :goto_1
    const-string v5, "FriendRequestReceived"

    const-string v6, "base2"

    const/4 v4, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lnj/a;->d(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final z(Landroid/content/Context;J)V
    .locals 3

    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget v2, Lsg/n0;->o:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lk2/k$f;

    const-string v2, "channel_general"

    invoke-direct {v1, p1, v2}, Lk2/k$f;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sget v2, Lsg/l0;->c:I

    invoke-virtual {v1, v2}, Lk2/k$f;->z(I)Lk2/k$f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lk2/k$f;->i(Landroid/widget/RemoteViews;)Lk2/k$f;

    move-result-object v0

    invoke-static {p2, p3}, Lkotlin/time/a;->w(J)J

    move-result-wide p2

    invoke-virtual {v0, p2, p3}, Lk2/k$f;->D(J)Lk2/k$f;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lk2/k$f;->f(Z)Lk2/k$f;

    move-result-object p2

    const-string p3, "setAutoCancel(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p3, Landroid/app/NotificationManager;

    invoke-static {p1, p3}, Ll2/b;->k(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    if-eqz p1, :cond_0

    const/4 p3, 0x0

    invoke-virtual {p2}, Lk2/k$f;->c()Landroid/app/Notification;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    :cond_0
    return-void
.end method
