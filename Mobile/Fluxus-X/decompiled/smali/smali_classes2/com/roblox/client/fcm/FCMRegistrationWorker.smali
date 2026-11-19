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
        "(Leu/b;)Ljava/lang/Object;",
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
.method public doWork(Leu/b;)Ljava/lang/Object;
    .locals 9
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

    instance-of v0, p1, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;

    iget v1, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;-><init>(Lcom/roblox/client/fcm/FCMRegistrationWorker;Leu/b;)V

    :goto_0
    iget-object p1, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->w:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v1, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->u:Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v0, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->t:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "getApplicationContext(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ldj/b;->f()Ldj/b;

    move-result-object v2

    invoke-virtual {v2, p1}, Ldj/b;->k(Landroid/content/Context;)V

    invoke-static {p1}, Lxm/a;->c(Landroid/content/Context;)V

    invoke-static {p1}, Lmi/c;->e(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->n()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object v2

    :try_start_1
    sget-object v5, Lzt/n;->b:Lzt/n$a;

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object v5

    new-instance v6, Lcom/roblox/client/fcm/FCMRegistrationWorker$c;

    const/4 v7, 0x0

    invoke-direct {v6, v2, v7}, Lcom/roblox/client/fcm/FCMRegistrationWorker$c;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Leu/b;)V

    iput-object p1, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->t:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->u:Ljava/lang/Object;

    iput v3, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->v:I

    iput v4, v0, Lcom/roblox/client/fcm/FCMRegistrationWorker$b;->y:I

    invoke-static {v5, v6, v0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    :goto_1
    :try_start_2
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    :goto_2
    sget-object v1, Lzt/n;->b:Lzt/n$a;

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "fcm"

    const-string v4, "rbx.push"

    if-nez v1, :cond_4

    check-cast p1, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "RegistrationIntentService.onHandleIntent() Token: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v1

    const-string v4, "AuthorizePushNotificationsForUser"

    invoke-virtual {v1, v4, v3}, Landroidx/work/b;->c(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v2}, Lbn/r;->g(Ljava/lang/String;)V

    invoke-static {}, Lrj/r;->k()Lrj/r;

    move-result-object v2

    new-instance v3, Luj/i0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v3, p1, v1}, Luj/i0;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v2, v0, v3}, Lrj/r;->y(Landroid/content/Context;Luj/i0;)V

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object p1

    goto :goto_4

    :cond_4
    const-string p1, "Unable to retrieve push notification token"

    invoke-static {v4, p1, v1}, Lok/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    const-string p1, ""

    :cond_5
    invoke-static {v2, p1}, Lbn/r;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object p1

    new-instance v0, Lyh/h;

    const-string v1, "PushNotificationRegistrationFailed"

    invoke-direct {v0, v1}, Lyh/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lmw/c;->j(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p1

    :goto_4
    const-string v0, "fold(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
