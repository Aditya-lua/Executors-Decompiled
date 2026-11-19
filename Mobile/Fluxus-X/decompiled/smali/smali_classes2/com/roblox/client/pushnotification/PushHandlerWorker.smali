.class public final Lcom/roblox/client/pushnotification/PushHandlerWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/pushnotification/PushHandlerWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00102\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R(\u0010\u001d\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0016\u0010\u0017\u0012\u0004\u0008\u001c\u0010\u0011\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR(\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0012\u0010\u001f\u0012\u0004\u0008$\u0010\u0011\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/PushHandlerWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "parameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroidx/work/c$a;",
        "doWork",
        "(Leu/b;)Ljava/lang/Object;",
        "Landroidx/work/b;",
        "notifData",
        "",
        "e",
        "(Landroidx/work/b;)V",
        "d",
        "()V",
        "c",
        "a",
        "Landroidx/work/WorkerParameters;",
        "Lwj/a;",
        "b",
        "Lwj/a;",
        "getNotificationOperator",
        "()Lwj/a;",
        "setNotificationOperator",
        "(Lwj/a;)V",
        "getNotificationOperator$annotations",
        "notificationOperator",
        "Lrj/a0;",
        "Lrj/a0;",
        "getLegacyNotificationOperator",
        "()Lrj/a0;",
        "setLegacyNotificationOperator",
        "(Lrj/a0;)V",
        "getLegacyNotificationOperator$annotations",
        "legacyNotificationOperator",
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


# static fields
.field public static final d:Lcom/roblox/client/pushnotification/PushHandlerWorker$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroidx/work/WorkerParameters;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lwj/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Lrj/a0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/pushnotification/PushHandlerWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/pushnotification/PushHandlerWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/pushnotification/PushHandlerWorker;->d:Lcom/roblox/client/pushnotification/PushHandlerWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    iput-object p2, p0, Lcom/roblox/client/pushnotification/PushHandlerWorker;->a:Landroidx/work/WorkerParameters;

    new-instance p1, Lwj/a;

    invoke-direct {p1}, Lwj/a;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/pushnotification/PushHandlerWorker;->b:Lwj/a;

    new-instance p1, Lrj/a0;

    invoke-direct {p1}, Lrj/a0;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/pushnotification/PushHandlerWorker;->c:Lrj/a0;

    return-void
.end method

.method public static final b(Landroid/content/Context;Lcom/google/firebase/messaging/n0;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/firebase/messaging/n0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    sget-object v0, Lcom/roblox/client/pushnotification/PushHandlerWorker;->d:Lcom/roblox/client/pushnotification/PushHandlerWorker$a;

    invoke-virtual {v0, p0, p1}, Lcom/roblox/client/pushnotification/PushHandlerWorker$a;->a(Landroid/content/Context;Lcom/google/firebase/messaging/n0;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 12

    iget-object v0, p0, Lcom/roblox/client/pushnotification/PushHandlerWorker;->a:Landroidx/work/WorkerParameters;

    invoke-virtual {v0}, Landroidx/work/WorkerParameters;->d()Landroidx/work/b;

    move-result-object v0

    const-string v1, "getInputData(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "priority"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/work/b;->d(Ljava/lang/String;I)I

    move-result v10

    const-string v1, "originalPriority"

    invoke-virtual {v0, v1, v2}, Landroidx/work/b;->d(Ljava/lang/String;I)I

    move-result v11

    const-string v1, "notificationId"

    invoke-virtual {v0, v1}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    new-instance v1, Lok/d0;

    invoke-direct {v1}, Lok/d0;-><init>()V

    const-string v2, "ack-metadata"

    invoke-virtual {v0, v2}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v2, "notificationType"

    invoke-virtual {v0, v2}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    sget-object v0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;->b:Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getApplicationContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;

    sget-object v4, Lbh/a1;->t:Ljava/lang/String;

    const-string v5, "mDeviceId"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lok/d0;->a()J

    move-result-wide v5

    invoke-direct/range {v3 .. v11}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v0, v2, v3}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;->a(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/pushnotification/PushHandlerWorker;->c()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->O1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lrj/r;->E(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public doWork(Leu/b;)Ljava/lang/Object;
    .locals 4
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Landroidx/work/c$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string p1, "MessageReceivedWorker"

    :try_start_0
    sget-object v0, Lzt/n;->b:Lzt/n$a;

    invoke-static {}, Ldj/b;->f()Ldj/b;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/b;->k(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/startup/a;->s(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/roblox/client/pushnotification/PushHandlerWorker;->a:Landroidx/work/WorkerParameters;

    invoke-virtual {v0}, Landroidx/work/WorkerParameters;->d()Landroidx/work/b;

    move-result-object v0

    const-string v1, "getInputData(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "version"

    invoke-virtual {v0, v1}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NotificationVersion: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lyi/b;->f()Lyi/b;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lyi/b;->u(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/pushnotification/PushHandlerWorker;->e(Landroidx/work/b;)V

    invoke-virtual {p0}, Lcom/roblox/client/pushnotification/PushHandlerWorker;->d()V

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object v2

    invoke-virtual {v2}, Lk2/n;->a()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroidx/work/b;->e()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/j0;->f(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/pushnotification/PushHandlerWorker;->b:Lwj/a;

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lwj/a;->d(Landroid/content/Context;Ljava/util/Map;)V

    goto :goto_2

    :cond_3
    const-string v1, "message"

    invoke-virtual {v0, v1}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Message: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/roblox/client/pushnotification/PushHandlerWorker;->c:Lrj/a0;

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lrj/a0;->g(Landroid/content/Context;Ljava/lang/String;)V

    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {v0}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    sget-object v1, Lzt/n;->b:Lzt/n$a;

    invoke-static {v0}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    check-cast v0, Lkotlin/Unit;

    const-string v0, "PushHandlerWorker completed successfully."

    invoke-static {p1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object p1

    goto :goto_5

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PushHandlerWorker failed with error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v1}, Lok/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p1

    :goto_5
    const-string v0, "fold(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final e(Landroidx/work/b;)V
    .locals 2

    const-string v0, "notificationType"

    invoke-virtual {p1, v0}, Landroidx/work/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Heartbeat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->c:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;->c(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
