.class public final Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;
.super Lnj/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0012\u0018\u00002\u00020\u0001B\'\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ#\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JE\u0010\u001d\u001a\u00020\r2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ+\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0004\u0008 \u0010!JG\u0010#\u001a\u00020\r2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00152\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0004\u0008#\u0010$R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010&R\u0014\u0010*\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;",
        "Lnj/a;",
        "Lkotlin/Function0;",
        "Ljj/u;",
        "pushNotificationStoreProvider",
        "Ljj/i;",
        "newNotificationHandlerProvider",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
        "j",
        "i",
        "bundle",
        "k",
        "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;",
        "",
        "conversationGuid",
        "",
        "conversationId",
        "",
        "replyMessage",
        "categoryName",
        "conversationTitle",
        "s",
        "(Ljava/lang/String;JLjava/lang/CharSequence;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V",
        "messageId",
        "r",
        "(JLjava/lang/String;Ljava/lang/String;)V",
        "message",
        "t",
        "(Ljava/lang/String;JLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V",
        "b",
        "Lkotlin/jvm/functions/Function0;",
        "c",
        "q",
        "()Ljj/u;",
        "pushNotificationStore",
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
.field public final b:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljj/u;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljj/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljj/u;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljj/i;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pushNotificationStoreProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newNotificationHandlerProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lnj/a;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->b:Lkotlin/jvm/functions/Function0;

    .line 4
    iput-object p2, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 5
    new-instance p1, Lnj/b;

    invoke-direct {p1}, Lnj/b;-><init>()V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 6
    new-instance p2, Lnj/c;

    invoke-direct {p2}, Lnj/c;-><init>()V

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic l()Ljj/i;
    .locals 1

    invoke-static {}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->o()Ljj/i;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m()Ljj/u;
    .locals 1

    invoke-static {}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->n()Ljj/u;

    move-result-object v0

    return-object v0
.end method

.method public static final n()Ljj/u;
    .locals 1

    invoke-static {}, Ljj/u;->c()Ljj/u;

    move-result-object v0

    return-object v0
.end method

.method public static final o()Ljj/i;
    .locals 1

    new-instance v0, Ljj/i;

    invoke-direct {v0}, Ljj/i;-><init>()V

    return-object v0
.end method

.method public static final synthetic p(Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;)Lkotlin/jvm/functions/Function0;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->c:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method


# virtual methods
.method public i(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 12
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "EXTRA_CATEGORY"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->q()Ljj/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljj/u;->i(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lnj/a;->g(Landroid/content/Context;Landroid/content/Intent;)V

    const/16 v10, 0x60

    const/4 v11, 0x0

    const-string v3, "clicked"

    const/4 v6, 0x1

    const-string v7, "ChatNewMessage"

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v2 .. v11}, Lnj/a;->e(Lnj/a;Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public j(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 12
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "EXTRA_CATEGORY"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->q()Ljj/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljj/u;->i(Ljava/lang/String;)V

    const/16 v10, 0x60

    const/4 v11, 0x0

    const-string v3, "dismissed"

    const/4 v6, 0x0

    const-string v7, "ChatNewMessage"

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v2 .. v11}, Lnj/a;->e(Lnj/a;Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

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

    const-string v0, "ChatNewMessage"

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-wide/16 v0, -0x1

    const-string p2, "EXTRA_CONVERSATION_ID"

    invoke-virtual {p3, p2, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {p1, p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    return-object p1
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p2}, Lnj/a;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v3, "chat_message_replied"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "rbx.push"

    const-string v3, "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED"

    invoke-static {v1, v3}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v3, -0x1

    const-string v1, "EXTRA_CONVERSATION_ID"

    invoke-virtual {p2, v1, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v3

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "EXTRA_MESSAGE_ID"

    invoke-virtual {p2, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x3

    :goto_1
    const-string v7, "tag"

    invoke-virtual {p2, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, p1, v7, v6}, Lnj/a;->b(Landroid/content/Context;Ljava/lang/String;I)V

    move-wide v2, v3

    invoke-static {p2}, Ljj/c;->B(Landroid/content/Intent;)Ljava/lang/CharSequence;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v6, "EXTRA_CATEGORY"

    invoke-virtual {p2, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "EXTRA_CONVERSATION_TITLE"

    invoke-virtual {p2, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object v0, p0

    move-object v5, p1

    invoke-virtual/range {v0 .. v7}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->s(Ljava/lang/String;JLjava/lang/CharSequence;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->q()Ljj/u;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljj/u;->i(Ljava/lang/String;)V

    invoke-virtual {p0, v2, v3, v1, v9}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->r(JLjava/lang/String;Ljava/lang/String;)V

    const/16 v8, 0x60

    const/4 v9, 0x0

    const-string v1, "chat message replied"

    const/4 v4, 0x1

    const-string v5, "ChatNewMessage"

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v0 .. v9}, Lnj/a;->e(Lnj/a;Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final q()Ljj/u;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->b:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljj/u;

    return-object v0
.end method

.method public final r(JLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In markChatNotificationAsRead(), conversationId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ,messageId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const-string v0, "rbx.push"

    invoke-static {v0, p4}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p4, Loi/c;->a:Loi/c;

    new-instance v0, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$a;-><init>(JLjava/lang/String;Lnt/b;)V

    invoke-virtual {p4, v0}, Loi/c;->f(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public final s(Ljava/lang/String;JLjava/lang/CharSequence;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;->t(Ljava/lang/String;JLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final t(Ljava/lang/String;JLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    if-nez p1, :cond_0

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    sget-object v1, Loi/c;->a:Loi/c;

    new-instance v2, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$b;

    const/4 v11, 0x0

    move-object v7, p0

    move-object v5, p1

    move-wide v3, p2

    move-object/from16 v6, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-direct/range {v2 .. v11}, Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver$b;-><init>(JLjava/lang/String;Ljava/lang/String;Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lnt/b;)V

    invoke-virtual {v1, v0, v2}, Loi/c;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
