.class public final Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/scheduledwork/OtaPollingWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000c8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u000c8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000c8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0012R\u0014\u0010\u001f\u001a\u00020\u000c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0012R\u0014\u0010 \u001a\u00020\u000c8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u0012R\u0014\u0010!\u001a\u00020\u000c8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u0012R\u0014\u0010\"\u001a\u00020\u000c8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u0012R\u0014\u0010#\u001a\u00020\u000c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u0012R\u0014\u0010$\u001a\u00020\u000c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u0012\u00a8\u0006%"
    }
    d2 = {
        "Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "c",
        "(Landroid/content/Context;)V",
        "a",
        "Lorg/json/JSONObject;",
        "rawConfig",
        "",
        "appVersion",
        "",
        "b",
        "(Lorg/json/JSONObject;Ljava/lang/String;)Z",
        "WORK_TAG",
        "Ljava/lang/String;",
        "TAG",
        "OTA_WORKER_BLOBS_DIR",
        "WORKER_BLOB_PREFIX",
        "Lkotlin/time/a;",
        "CONNECT_TIMEOUT",
        "J",
        "READ_TIMEOUT",
        "",
        "MAX_RETRY_ATTEMPTS",
        "I",
        "DEFAULT_INACTIVITY_DAYS",
        "KEY_MAX_RETRY_ATTEMPTS",
        "KEY_INACTIVITY_DAYS",
        "KEY_FLAGS_FROM_SCHEDULE",
        "KEY_DEBUG_MODE",
        "KEY_MAX_APP_VERSION_CHECK",
        "PREF_LAST_STARTUP_TIME",
        "PREF_OTA_POLLING_SCHEDULED",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx5/p0;->a:Lx5/p0$a;

    invoke-virtual {v0, p1}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object v0

    const-string v1, "background_ota_polling"

    invoke-virtual {v0, v1}, Lx5/p0;->a(Ljava/lang/String;)Lx5/a0;

    invoke-static {p1}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "getKeyValues(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "ota_polling_scheduled"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final b(Lorg/json/JSONObject;Ljava/lang/String;)Z
    .locals 10
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rawConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isDevelopmentConfig"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    new-array v3, v0, [C

    const/16 v2, 0x2e

    aput-char v2, v3, v1

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p2

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->P0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_3

    invoke-static {p2}, Lkotlin/text/StringsKt;->t(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    if-ltz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, v3

    :goto_0
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const-string p2, "maxAppVersion"

    const-string v2, "0"

    invoke-virtual {p1, p2, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "optString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/StringsKt;->t(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long p2, v8, v4

    if-ltz p2, :cond_2

    move-object v3, p1

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    cmp-long p1, p1, v6

    if-gez p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public final c(Landroid/content/Context;)V
    .locals 18
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p1

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->M5()Z

    move-result v1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->D1()Z

    move-result v2

    const-string v3, "OtaPollingWorker"

    if-eqz v1, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "DEV scheduleOtaPolling: enabled="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v4, 0x0

    const-string v5, "ota_polling_scheduled"

    const-string v6, "background_ota_polling_debug_once"

    if-nez v2, :cond_1

    invoke-static {v0}, Lgk/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "foreground"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {v0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1, v5, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual/range {p0 .. p1}, Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;->a(Landroid/content/Context;)V

    sget-object v2, Lx5/p0;->a:Lx5/p0$a;

    invoke-virtual {v2, v0}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object v0

    invoke-virtual {v0, v6}, Lx5/p0;->b(Ljava/lang/String;)Lx5/a0;

    if-eqz v1, :cond_6

    sget-object v7, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->INSTANCE:Lcom/roblox/client/scheduledwork/OtaConfigHandler;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v8, "ota_polling_worker_flag_disabled_foreground_cancelled"

    const-string v9, "background_ota_worker"

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->logEvent$NativeShell_googleProdRelease$default(Lcom/roblox/client/scheduledwork/OtaConfigHandler;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->d6()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "flags_from_schedule"

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v7}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const-string v7, "debug_mode"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v7, v8}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v8

    invoke-interface {v8}, Lth/i;->j()Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    const-string v9, "max_app_version_check"

    invoke-static {v9, v8}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    filled-new-array {v2, v7, v8}, [Lkotlin/Pair;

    move-result-object v2

    new-instance v7, Landroidx/work/b$a;

    invoke-direct {v7}, Landroidx/work/b$a;-><init>()V

    :goto_0
    const/4 v8, 0x3

    if-ge v4, v8, :cond_2

    aget-object v8, v2, v4

    invoke-virtual {v8}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v8}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v9, v8}, Landroidx/work/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/b$a;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v7}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v2

    goto :goto_1

    :cond_3
    new-instance v2, Landroidx/work/b$a;

    invoke-direct {v2}, Landroidx/work/b$a;-><init>()V

    invoke-virtual {v2}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v2

    :goto_1
    if-eqz v1, :cond_4

    sget-object v4, Lx5/p0;->a:Lx5/p0$a;

    invoke-virtual {v4, v0}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object v4

    sget-object v7, Lx5/j;->b:Lx5/j;

    new-instance v8, Lx5/z$a;

    const-class v9, Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    invoke-direct {v8, v9}, Lx5/z$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v8, v6}, Lx5/q0$a;->a(Ljava/lang/String;)Lx5/q0$a;

    move-result-object v8

    check-cast v8, Lx5/z$a;

    invoke-virtual {v8, v2}, Lx5/q0$a;->o(Landroidx/work/b;)Lx5/q0$a;

    move-result-object v8

    check-cast v8, Lx5/z$a;

    const-wide/16 v9, 0x1e

    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v8, v9, v10, v11}, Lx5/q0$a;->n(JLjava/util/concurrent/TimeUnit;)Lx5/q0$a;

    move-result-object v8

    check-cast v8, Lx5/z$a;

    new-instance v9, Lx5/d$a;

    invoke-direct {v9}, Lx5/d$a;-><init>()V

    sget-object v10, Lx5/x;->b:Lx5/x;

    invoke-virtual {v9, v10}, Lx5/d$a;->b(Lx5/x;)Lx5/d$a;

    move-result-object v9

    invoke-virtual {v9}, Lx5/d$a;->a()Lx5/d;

    move-result-object v9

    invoke-virtual {v8, v9}, Lx5/q0$a;->k(Lx5/d;)Lx5/q0$a;

    move-result-object v8

    check-cast v8, Lx5/z$a;

    invoke-virtual {v8}, Lx5/q0$a;->b()Lx5/q0;

    move-result-object v8

    check-cast v8, Lx5/z;

    invoke-virtual {v4, v6, v7, v8}, Lx5/p0;->g(Ljava/lang/String;Lx5/j;Lx5/z;)Lx5/a0;

    const-string v4, "DEV scheduleOtaPolling: enqueued one-time debug work (30s delay, KEEP \u2014 kill app within 30s to test dead-process wakeup)"

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_4
    sget-object v4, Lx5/p0;->a:Lx5/p0$a;

    invoke-virtual {v4, v0}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object v4

    invoke-virtual {v4, v6}, Lx5/p0;->b(Ljava/lang/String;)Lx5/a0;

    :goto_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v4

    invoke-interface {v4}, Lth/i;->o4()Z

    move-result v4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v6

    invoke-interface {v6}, Lth/i;->X4()I

    move-result v6

    int-to-long v9, v6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v6

    invoke-interface {v6}, Lth/i;->c0()I

    move-result v6

    int-to-long v12, v6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v6

    invoke-interface {v6}, Lth/i;->m1()I

    move-result v6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v7

    invoke-interface {v7}, Lth/i;->G5()I

    move-result v15

    if-eqz v4, :cond_5

    sget-object v4, Lx5/x;->c:Lx5/x;

    goto :goto_3

    :cond_5
    sget-object v4, Lx5/x;->b:Lx5/x;

    :goto_3
    new-instance v7, Lx5/d$a;

    invoke-direct {v7}, Lx5/d$a;-><init>()V

    invoke-virtual {v7, v4}, Lx5/d$a;->b(Lx5/x;)Lx5/d$a;

    move-result-object v4

    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Lx5/d$a;->c(Z)Lx5/d$a;

    move-result-object v4

    invoke-virtual {v4, v7}, Lx5/d$a;->f(Z)Lx5/d$a;

    move-result-object v4

    invoke-virtual {v4}, Lx5/d$a;->a()Lx5/d;

    move-result-object v4

    move v8, v7

    new-instance v7, Lx5/g0$a;

    move v11, v8

    const-class v8, Lcom/roblox/client/scheduledwork/OtaPollingWorker;

    move v14, v11

    sget-object v11, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    move/from16 v16, v14

    move-object v14, v11

    move/from16 v17, v1

    move/from16 v1, v16

    invoke-direct/range {v7 .. v14}, Lx5/g0$a;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V

    const-string v8, "background_ota_polling"

    invoke-virtual {v7, v8}, Lx5/q0$a;->a(Ljava/lang/String;)Lx5/q0$a;

    move-result-object v7

    check-cast v7, Lx5/g0$a;

    invoke-virtual {v7, v4}, Lx5/q0$a;->k(Lx5/d;)Lx5/q0$a;

    move-result-object v4

    check-cast v4, Lx5/g0$a;

    sget-object v7, Lx5/a;->a:Lx5/a;

    move-object v11, v2

    const-wide/16 v1, 0xa

    sget-object v14, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v7, v1, v2, v14}, Lx5/q0$a;->i(Lx5/a;JLjava/util/concurrent/TimeUnit;)Lx5/q0$a;

    move-result-object v1

    check-cast v1, Lx5/g0$a;

    new-instance v2, Landroidx/work/b$a;

    invoke-direct {v2}, Landroidx/work/b$a;-><init>()V

    invoke-virtual {v2, v11}, Landroidx/work/b$a;->c(Landroidx/work/b;)Landroidx/work/b$a;

    move-result-object v2

    const-string v4, "max_retry_attempts"

    invoke-virtual {v2, v4, v6}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object v2

    const-string v4, "inactivity_days"

    invoke-virtual {v2, v4, v15}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lx5/q0$a;->o(Landroidx/work/b;)Lx5/q0$a;

    move-result-object v1

    check-cast v1, Lx5/g0$a;

    invoke-virtual {v1}, Lx5/q0$a;->b()Lx5/q0;

    move-result-object v1

    check-cast v1, Lx5/g0;

    invoke-static {v0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v4, "getKeyValues(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v4, "last_startup_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-interface {v2, v4, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const/4 v14, 0x1

    invoke-interface {v2, v5, v14}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget-object v2, Lx5/p0;->a:Lx5/p0$a;

    invoke-virtual {v2, v0}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object v0

    sget-object v2, Lx5/i;->c:Lx5/i;

    invoke-virtual {v0, v8, v2, v1}, Lx5/p0;->e(Ljava/lang/String;Lx5/i;Lx5/g0;)Lx5/a0;

    if-eqz v17, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DEV scheduleOtaPolling: enqueued periodic work tag=background_ota_polling intervalMin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " flexMin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    return-void
.end method
