.class public final Lcom/roblox/client/scheduledwork/FlagFetchWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/scheduledwork/FlagFetchWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/roblox/client/scheduledwork/FlagFetchWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroidx/work/c$a;",
        "doWork",
        "(Lnt/b;)Ljava/lang/Object;",
        "",
        "c",
        "()Z",
        "",
        "b",
        "()V",
        "a",
        "Landroid/content/Context;",
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
.field public static final b:Lcom/roblox/client/scheduledwork/FlagFetchWorker$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/scheduledwork/FlagFetchWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker;->b:Lcom/roblox/client/scheduledwork/FlagFetchWorker$a;

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

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    iput-object p1, p0, Lcom/roblox/client/scheduledwork/FlagFetchWorker;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    sget-object v0, Lx5/p0;->a:Lx5/p0$a;

    iget-object v1, p0, Lcom/roblox/client/scheduledwork/FlagFetchWorker;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object v0

    const-string v1, "fetch_flags"

    invoke-virtual {v0, v1}, Lx5/p0;->a(Ljava/lang/String;)Lx5/a0;

    return-void
.end method

.method public final c()Z
    .locals 7

    iget-object v0, p0, Lcom/roblox/client/scheduledwork/FlagFetchWorker;->a:Landroid/content/Context;

    invoke-static {v0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "last_startup_time"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x8

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sub-long/2addr v2, v0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public doWork(Lnt/b;)Ljava/lang/Object;
    .locals 12
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

    instance-of v0, p1, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;

    iget v1, v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;-><init>(Lcom/roblox/client/scheduledwork/FlagFetchWorker;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;->x:I

    const-string v3, "flag_fetch_worker_end"

    const-string v4, "flag_fetch_worker_end_origin"

    const-string v5, "flag_fetch_worker_error"

    const/4 v6, 0x1

    const/4 v7, 0x2

    const-string v8, "FlagCacheFetchWorker"

    const/4 v9, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v6, :cond_1

    iget v1, v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;->u:I

    iget-boolean v0, v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;->t:Z

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    move v6, v1

    goto/16 :goto_b

    :catch_0
    move-exception p1

    move v6, v1

    goto/16 :goto_6

    :catch_1
    move-exception p1

    move v6, v1

    goto/16 :goto_a

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    const-string p1, "Scheduled FlagFetchWorker started"

    invoke-static {v8, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->J()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/roblox/client/scheduledwork/FlagFetchWorker;->a:Landroid/content/Context;

    invoke-static {p1}, Lgk/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "foreground"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "FlagFetchWorker skipped for foreground app"

    invoke-static {v8, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "skip_flag_fetch_worker_app_foreground"

    invoke-static {p1, v9, v7, v9}, Lcom/roblox/universalapp/logging/LoggingProtocol;->m(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)V

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object p1

    const-string v0, "success(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_3
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->T5()Z

    move-result p1

    const-string v2, "flag_fetch_worker_start"

    if-eqz p1, :cond_4

    invoke-static {v2, v9, v7, v9}, Lcom/roblox/universalapp/logging/LoggingProtocol;->m(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    invoke-static {v10, v11}, Lpt/b;->e(J)Ljava/lang/Long;

    move-result-object v10

    const-string v11, "flag_fetch_worker_start_origin"

    invoke-static {v11, v10}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    invoke-static {v10, v11}, Lpt/b;->e(J)Ljava/lang/Long;

    move-result-object v10

    invoke-static {v2, v10}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {p0}, Lcom/roblox/client/scheduledwork/FlagFetchWorker;->c()Z

    move-result v10

    if-nez v10, :cond_6

    const-string v0, "FlagFetchWorker: Inactivity detected, cancelling work"

    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/scheduledwork/FlagFetchWorker;->b()V

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    const-string v1, "failure(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p1, :cond_5

    invoke-static {v5, v9, v7, v9}, Lcom/roblox/universalapp/logging/LoggingProtocol;->m(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)V

    return-object v0

    :cond_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpt/b;->e(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v4, p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v6, v0

    move v0, p1

    move-object p1, v6

    move v6, v2

    goto/16 :goto_b

    :cond_6
    :try_start_2
    sget-object v10, Lcom/roblox/client/startup/FlagCacheUtils;->INSTANCE:Lcom/roblox/client/startup/FlagCacheUtils;

    iget-object v11, p0, Lcom/roblox/client/scheduledwork/FlagFetchWorker;->a:Landroid/content/Context;

    iput-boolean p1, v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;->t:Z

    iput v2, v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;->u:I

    iput v6, v0, Lcom/roblox/client/scheduledwork/FlagFetchWorker$b;->x:I

    invoke-virtual {v10, v11, v0}, Lcom/roblox/client/startup/FlagCacheUtils;->scheduledFetchFlag(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v1, :cond_7

    return-object v1

    :cond_7
    move-object v1, v0

    move v0, p1

    move-object p1, v1

    move v1, v2

    :goto_2
    :try_start_3
    check-cast p1, Lak/f0;

    invoke-virtual {p1}, Lak/f0;->d()Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "FlagFetchWorker successfully fetched and cached flags"

    invoke-static {v8, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {p1}, Lak/f0;->b()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Lak/f0;->b()Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "BeginScheduledFlagFetch5"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "optString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "toLowerCase(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "true"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-virtual {p0}, Lcom/roblox/client/scheduledwork/FlagFetchWorker;->b()V

    goto :goto_3

    :catchall_2
    move-exception p1

    goto/16 :goto_b

    :catch_2
    move-exception p1

    goto :goto_6

    :catch_3
    move-exception p1

    goto/16 :goto_a

    :cond_8
    :goto_3
    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object p1
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_5

    :cond_9
    :try_start_5
    invoke-virtual {p1}, Lak/f0;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "FlagFetchWorker failed to fetch flags: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lak/f0;->c()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object p1

    :goto_4
    move v6, v1

    goto :goto_5

    :cond_a
    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p1
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_4

    :goto_5
    :try_start_6
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_7

    :catch_4
    move-exception v0

    move-object v6, v0

    move v0, p1

    move-object p1, v6

    move v6, v2

    goto :goto_6

    :catch_5
    move-exception v0

    move-object v6, v0

    move v0, p1

    move-object p1, v6

    move v6, v2

    goto :goto_a

    :goto_6
    :try_start_7
    const-string v1, "FlagFetchWorker encountered an unexpected error, retrying."

    invoke-static {v8, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_7
    if-eqz v0, :cond_c

    if-eqz v6, :cond_b

    goto :goto_8

    :cond_b
    move-object v3, v5

    :goto_8
    invoke-static {v3, v9, v7, v9}, Lcom/roblox/universalapp/logging/LoggingProtocol;->m(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)V

    goto :goto_9

    :cond_c
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpt/b;->e(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    :goto_9
    return-object p1

    :goto_a
    :try_start_8
    const-string v1, "FlagFetchWorker was cancelled."

    invoke-static {v8, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_b
    if-eqz v0, :cond_e

    if-eqz v6, :cond_d

    goto :goto_c

    :cond_d
    move-object v3, v5

    :goto_c
    invoke-static {v3, v9, v7, v9}, Lcom/roblox/universalapp/logging/LoggingProtocol;->m(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)V

    goto :goto_d

    :cond_e
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpt/b;->e(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    :goto_d
    throw p1
.end method
