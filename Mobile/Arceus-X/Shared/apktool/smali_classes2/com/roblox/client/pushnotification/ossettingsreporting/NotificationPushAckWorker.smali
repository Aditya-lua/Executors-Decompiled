.class public final Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;,
        Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;,
        Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0003\u0011\r\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroidx/work/c$a;",
        "doWork",
        "(Lnt/b;)Ljava/lang/Object;",
        "",
        "e",
        "b",
        "(Ljava/lang/Throwable;)Landroidx/work/c$a;",
        "a",
        "Landroidx/work/WorkerParameters;",
        "NotificationPushAckParams",
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
.field public static final b:Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroidx/work/WorkerParameters;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;->b:Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;

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

    const-string v0, "workerParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    iput-object p2, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;->a:Landroidx/work/WorkerParameters;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)Landroidx/work/c$a;
    .locals 1

    instance-of v0, p1, Ljv/m;

    if-eqz v0, :cond_2

    check-cast p1, Ljv/m;

    invoke-virtual {p1}, Ljv/m;->a()I

    move-result p1

    const/16 v0, 0x1f4

    if-gt v0, p1, :cond_0

    const/16 v0, 0x258

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x1ad

    if-ne p1, v0, :cond_1

    :goto_0
    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1

    :cond_2
    instance-of p1, p1, Ljava/io/IOException;

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object p1

    const-string v0, "retry(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_3
    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p1

    const-string v0, "failure(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public doWork(Lnt/b;)Ljava/lang/Object;
    .locals 21
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Landroidx/work/c$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;

    iget v3, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->C:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->C:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;

    invoke-direct {v2, v1, v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;-><init>(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;Lnt/b;)V

    :goto_0
    iget-object v0, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->A:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->C:I

    const-string v5, "NotificationOSSettingChangeReportingWorker"

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->x:Ljava/lang/Object;

    check-cast v3, Lal/c;

    iget-object v3, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->w:Ljava/lang/Object;

    check-cast v3, Lvk/b;

    iget-object v3, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->v:Ljava/lang/Object;

    check-cast v3, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;

    iget-object v3, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->u:Ljava/lang/Object;

    check-cast v3, Lzk/i;

    iget-object v2, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->t:Ljava/lang/Object;

    check-cast v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;->a:Landroidx/work/WorkerParameters;

    invoke-virtual {v0}, Landroidx/work/WorkerParameters;->g()I

    move-result v0

    const/4 v4, 0x5

    const-string v7, "failure(...)"

    if-le v0, v4, :cond_3

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_3
    new-instance v0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;

    iget-object v4, v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;->a:Landroidx/work/WorkerParameters;

    invoke-virtual {v4}, Landroidx/work/WorkerParameters;->d()Landroidx/work/b;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/work/b;->e()Ljava/util/Map;

    move-result-object v4

    invoke-direct {v0, v4}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getDeviceId()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_4

    const-string v0, "Device ID is missing in input data"

    invoke-static {v5, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_4
    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getUserId()Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    :goto_1
    move-wide v14, v7

    goto :goto_2

    :cond_5
    const-wide/16 v7, -0x1

    goto :goto_1

    :goto_2
    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getChannelEnabledValues()[Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    if-eqz v4, :cond_7

    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getChannelNames()[Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-static {v8, v4}, Lkotlin/collections/m;->n0([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_3

    :cond_6
    move-object v4, v7

    :goto_3
    if-eqz v4, :cond_7

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lkotlin/collections/k0;->t(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v4

    move-object/from16 v19, v4

    goto :goto_4

    :cond_7
    move-object/from16 v19, v7

    :goto_4
    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getChangedChannels()[Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-static {v4}, Lkotlin/collections/m;->j0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    :cond_8
    move-object/from16 v20, v7

    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getReceivedTime()Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getNotificationId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getMetadata()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getNotificationType()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getPriority()Ljava/lang/Integer;

    move-result-object v17

    invoke-virtual {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->getOriginalPriority()Ljava/lang/Integer;

    move-result-object v18

    new-instance v8, Lal/c;

    const-string v13, "AndroidNative"

    invoke-direct/range {v8 .. v20}, Lal/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;)V

    invoke-virtual {v1}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lak/l2;->b(Landroid/content/Context;)V

    invoke-static {}, Lvk/g;->c()Lvk/b;

    move-result-object v4

    invoke-static {}, Lvk/g;->d()Lvk/d;

    move-result-object v7

    invoke-interface {v7, v4}, Lvk/d;->c(Lvk/b;)Lzk/i;

    move-result-object v7

    :try_start_1
    sget-object v9, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->t:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->u:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->v:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->w:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->x:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->y:I

    iput v0, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->z:I

    iput v6, v2, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->C:I

    invoke-interface {v7, v8, v2}, Lzk/i;->a(Lal/c;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_9

    return-object v3

    :cond_9
    :goto_5
    check-cast v0, Lokhttp3/ResponseBody;

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    :goto_6
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_7
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_c

    instance-of v3, v2, Ljv/m;

    if-eqz v3, :cond_a

    move-object v3, v2

    check-cast v3, Ljv/m;

    invoke-virtual {v3}, Ljv/m;->a()I

    move-result v4

    invoke-virtual {v3}, Ljv/m;->c()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "HTTP "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_a
    instance-of v3, v2, Ljava/io/IOException;

    if-eqz v3, :cond_b

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Network error: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unexpected error: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_8
    invoke-static {v5, v3, v2}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_c
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_d

    check-cast v0, Lokhttp3/ResponseBody;

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object v0

    const-string v2, "success(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v1, v2}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;->b(Ljava/lang/Throwable;)Landroidx/work/c$a;

    move-result-object v0

    :goto_9
    return-object v0
.end method
