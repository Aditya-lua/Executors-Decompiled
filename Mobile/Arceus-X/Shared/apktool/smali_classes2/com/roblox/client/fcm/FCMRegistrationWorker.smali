.class public final Lcom/roblox/client/fcm/FCMRegistrationWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/fcm/FCMRegistrationWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/roblox/client/fcm/FCMRegistrationWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroidx/work/c$a;",
        "doWork",
        "(Lnt/b;)Ljava/lang/Object;",
        "a",
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
.field public static final a:Lcom/roblox/client/fcm/FCMRegistrationWorker$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/fcm/FCMRegistrationWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/fcm/FCMRegistrationWorker;->a:Lcom/roblox/client/fcm/FCMRegistrationWorker$a;

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

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public doWork(Lnt/b;)Ljava/lang/Object;
    .locals 13
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

    instance-of v0, p1, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;

    iget v1, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->B:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->B:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;-><init>(Lcom/roblox/client/fcm/FCMRegistrationWorker;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->z:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->B:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-wide v1, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->v:J

    iget-object v4, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->u:Ljava/lang/Object;

    check-cast v4, Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v0, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->t:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "getApplicationContext(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v2

    invoke-virtual {v2, p1}, Lvi/b;->l(Landroid/content/Context;)V

    invoke-static {p1}, Ljm/a;->c(Landroid/content/Context;)V

    invoke-static {p1}, Lei/c;->e(Landroid/content/Context;)V

    invoke-static {p1}, Lff/e;->k(Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    if-eqz v2, :cond_3

    invoke-static {p1}, Lff/e;->q(Landroid/content/Context;)Lff/e;

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    sub-long/2addr v9, v7

    const-string v11, "fcm_worker"

    invoke-static {v11, v2, v9, v10}, Lqh/a;->a(Ljava/lang/String;ZJ)V

    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->n()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object v9

    invoke-virtual {v9, v4}, Lcom/google/firebase/messaging/FirebaseMessaging;->y(Z)V

    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->n()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object v9

    :try_start_1
    sget-object v10, Ljt/n;->b:Ljt/n$a;

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v10

    new-instance v11, Lcom/roblox/client/fcm/FCMRegistrationWorker$c;

    const/4 v12, 0x0

    invoke-direct {v11, v9, v12}, Lcom/roblox/client/fcm/FCMRegistrationWorker$c;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lnt/b;)V

    iput-object p1, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->t:Ljava/lang/Object;

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->u:Ljava/lang/Object;

    iput-wide v5, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->v:J

    iput-boolean v2, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->x:Z

    iput-wide v7, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->w:J

    iput v3, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->y:I

    iput v4, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->B:I

    invoke-static {v10, v11, v0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    move-wide v1, v5

    :goto_1
    :try_start_2
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    move-wide v1, v5

    :goto_2
    sget-object v4, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    const-string v5, "fcm"

    const-string v6, "rbx.push"

    if-nez v4, :cond_5

    check-cast p1, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "RegistrationIntentService.onHandleIntent() Token: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v4

    const-string v6, "AuthorizePushNotificationsForUser"

    invoke-virtual {v4, v6, v3}, Landroidx/work/b;->c(Ljava/lang/String;Z)Z

    move-result v3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    sub-long/2addr v6, v1

    invoke-static {v6, v7, v3}, Lqh/a;->c(JZ)V

    invoke-static {v5}, Lom/r;->i(Ljava/lang/String;)V

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v1

    new-instance v2, Lmj/i0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v2, p1, v3}, Lmj/i0;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v1, v0, v2}, Ljj/r;->y(Landroid/content/Context;Lmj/i0;)V

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object p1

    goto :goto_4

    :cond_5
    const-string p1, "Unable to retrieve push notification token"

    invoke-static {v6, p1, v4}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_6

    const-string p1, ""

    :cond_6
    invoke-static {v5, p1}, Lom/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p1

    new-instance v0, Lph/h;

    const-string v1, "PushNotificationRegistrationFailed"

    invoke-direct {v0, v1}, Lph/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lfv/c;->j(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p1

    :goto_4
    const-string v0, "fold(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
