.class public final Lcom/appsflyer/internal/AFf1oSDK;
.super Lcom/appsflyer/internal/AFe1ySDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1ySDK<",
        "Lcom/appsflyer/internal/AFf1pSDK;",
        ">;"
    }
.end annotation


# instance fields
.field private final AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1iSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AppsFlyerLib:Lcom/appsflyer/internal/AFc1eSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afDebugLog:Lcom/appsflyer/internal/AFf1jSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afErrorLog:Lcom/appsflyer/internal/AFd1sSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afInfoLog:Lcom/appsflyer/internal/AFf1fSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Lcom/appsflyer/internal/AFh1bSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final force:Lcom/appsflyer/internal/AFf1mSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final getLevel:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public i:Lcom/appsflyer/internal/AFf1pSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final v:Lcom/appsflyer/internal/AFf1nSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFf1nSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFf1kSDK;Lcom/appsflyer/internal/AFc1eSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFf1mSDK;)V
    .locals 3
    .param p1    # Lcom/appsflyer/internal/AFf1nSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFc1iSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/appsflyer/internal/AFf1fSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/appsflyer/internal/AFf1jSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/appsflyer/internal/AFd1sSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/appsflyer/internal/AFf1kSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/appsflyer/internal/AFc1eSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/appsflyer/internal/AFf1mSDK;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/appsflyer/internal/AFe1zSDK;

    const-string v2, "UpdateRemoteConfiguration"

    invoke-direct {p0, v0, v1, v2}, Lcom/appsflyer/internal/AFe1ySDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1oSDK;->v:Lcom/appsflyer/internal/AFf1nSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFf1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1iSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/AFf1oSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1fSDK;

    iput-object p4, p0, Lcom/appsflyer/internal/AFf1oSDK;->afDebugLog:Lcom/appsflyer/internal/AFf1jSDK;

    iput-object p5, p0, Lcom/appsflyer/internal/AFf1oSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1sSDK;

    iput-object p6, p0, Lcom/appsflyer/internal/AFf1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;

    iput-object p7, p0, Lcom/appsflyer/internal/AFf1oSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFc1eSDK;

    iput-object p8, p0, Lcom/appsflyer/internal/AFf1oSDK;->getLevel:Ljava/lang/String;

    iput-object p9, p0, Lcom/appsflyer/internal/AFf1oSDK;->force:Lcom/appsflyer/internal/AFf1mSDK;

    return-void
.end method

.method private final AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V
    .locals 14

    iget-object v0, p1, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1nSDK;

    iget-wide v1, v1, Lcom/appsflyer/internal/AFd1nSDK;->registerClient:J

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    move-result v0

    :goto_0
    move v10, v0

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v0, p1, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    instance-of v3, v0, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;

    if-eqz v3, :cond_1

    check-cast v0, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0}, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;->getMetrics()Lcom/appsflyer/internal/AFd1nSDK;

    move-result-object v0

    iget-wide v2, v0, Lcom/appsflyer/internal/AFd1nSDK;->registerClient:J

    move-object v13, v1

    move-wide v6, v2

    goto :goto_2

    :cond_1
    move-object v13, v0

    move-wide v6, v1

    :goto_2
    iget-object v0, p1, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/appsflyer/internal/AFh1aSDK;->AFKeystoreWrapper:Ljava/lang/String;

    :goto_3
    move-object v4, v0

    goto :goto_4

    :cond_2
    const/4 v0, 0x0

    goto :goto_3

    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p1, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    sub-long v8, v0, v2

    new-instance v3, Lcom/appsflyer/internal/AFh1bSDK;

    iget-object v5, p1, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    iget-object v11, p1, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    iget-object v12, p1, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    invoke-direct/range {v3 .. v13}, Lcom/appsflyer/internal/AFh1bSDK;-><init>(Ljava/lang/String;Ljava/lang/String;JJILcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object v3, p0, Lcom/appsflyer/internal/AFf1oSDK;->e:Lcom/appsflyer/internal/AFh1bSDK;

    return-void
.end method

.method private final d(Ljava/lang/String;JLjava/io/IOException;Lcom/appsflyer/internal/AFd1fSDK;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/io/IOException;",
            "Lcom/appsflyer/internal/AFd1fSDK<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "failed to fetch remote config: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 3
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 4
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v11, 0x40

    const/4 v12, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v6, p4

    .line 5
    invoke-static/range {v3 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 6
    new-instance v13, Lcom/appsflyer/internal/AFf1xSDK;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v18, 0x0

    move-object/from16 v14, p1

    move-wide/from16 v15, p2

    move-object/from16 v21, p4

    move-object/from16 v17, p5

    invoke-direct/range {v13 .. v21}, Lcom/appsflyer/internal/AFf1xSDK;-><init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object/from16 v0, p0

    .line 7
    invoke-direct {v0, v13}, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V

    return-void
.end method

.method private final e()Lcom/appsflyer/internal/AFf1pSDK;
    .locals 22

    move-object/from16 v1, p0

    const-string v0, " seconds"

    const-string v2, ""

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-object v3, v1, Lcom/appsflyer/internal/AFf1oSDK;->getLevel:Ljava/lang/String;

    iget-object v4, v1, Lcom/appsflyer/internal/AFf1oSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1fSDK;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v4

    const v8, -0x62ff1f55

    const v9, 0x62ff1f57

    invoke-static {v7, v8, v9, v4}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    invoke-static {v4}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    if-nez v3, :cond_1

    sget-object v11, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v12, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v13, "Can\'t create CDN token, domain or version is not provided."

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    :goto_0
    move-object v4, v7

    goto :goto_2

    :cond_1
    iget-object v7, v1, Lcom/appsflyer/internal/AFf1oSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFc1iSDK;

    iget-object v7, v7, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v7, v7, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    const-string v10, "appsflyersdk.com"

    filled-new-array {v10, v3, v7}, [Ljava/lang/String;

    move-result-object v3

    const-string v7, "\u2063"

    invoke-static {v7, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lcom/appsflyer/internal/AFj1nSDK;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_2
    :goto_1
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v12, "Dev key is not set, SDK is not started."

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    :goto_2
    if-nez v4, :cond_3

    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v12, "can\'t create CDN token, skipping fetch config"

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    return-object v0

    :cond_3
    :try_start_0
    iget-object v3, v1, Lcom/appsflyer/internal/AFf1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;

    iget-object v3, v3, Lcom/appsflyer/internal/AFf1kSDK;->AFKeystoreWrapper:Ljt/h;

    invoke-interface {v3}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object v7, v1, Lcom/appsflyer/internal/AFf1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;

    iget-object v7, v7, Lcom/appsflyer/internal/AFf1kSDK;->registerClient:Ljt/h;

    invoke-interface {v7}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object v10, v1, Lcom/appsflyer/internal/AFf1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;

    iget-object v11, v10, Lcom/appsflyer/internal/AFf1kSDK;->d:Lcom/appsflyer/internal/AFc1eSDK;

    iget-object v11, v11, Lcom/appsflyer/internal/AFc1eSDK;->getOutOfStore:Ljava/lang/String;

    if-nez v11, :cond_4

    sget-object v12, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v13, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v14, "Cold start detected - fetching config from CDN"

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_6

    :catchall_0
    move-exception v0

    :goto_3
    move-object v10, v0

    goto/16 :goto_a

    :catch_0
    move-exception v0

    :goto_4
    move-wide/from16 v17, v5

    goto/16 :goto_b

    :catch_1
    move-exception v0

    :goto_5
    move-wide/from16 v17, v5

    goto/16 :goto_c

    :cond_4
    iget-object v11, v10, Lcom/appsflyer/internal/AFf1kSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    iget-object v11, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    if-nez v11, :cond_5

    sget-object v12, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v13, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v14, "active config is missing - fetching from CDN"

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_6

    :cond_5
    iget-object v11, v11, Lcom/appsflyer/internal/AFh1aSDK;->registerClient:Lcom/appsflyer/internal/AFh1gSDK;

    const/4 v12, 0x0

    if-eqz v11, :cond_6

    iget-object v11, v11, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1cSDK;

    if-eqz v11, :cond_6

    sget-object v13, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v14, v11, Lcom/appsflyer/internal/AFh1cSDK;->d:J

    invoke-virtual {v13, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v13

    invoke-static {}, Lcom/appsflyer/internal/AFh1cSDK;->registerClient()J

    move-result-wide v15

    cmp-long v11, v13, v15

    if-lez v11, :cond_6

    const/4 v12, 0x1

    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    iget-object v10, v10, Lcom/appsflyer/internal/AFf1kSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    iget-wide v8, v10, Lcom/appsflyer/internal/AFf1jSDK;->registerClient:J

    sub-long/2addr v13, v8

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v9, v10, Lcom/appsflyer/internal/AFf1jSDK;->unregisterClient:J

    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v8

    if-nez v12, :cond_8

    cmp-long v8, v13, v8

    if-lez v8, :cond_7

    goto :goto_6

    :cond_7
    sget-object v16, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v17, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v18, "Using cached config (warm start, config valid)"

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->d:Lcom/appsflyer/internal/AFf1pSDK;

    return-object v0

    :cond_8
    :goto_6
    sget-object v16, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v18, "Fetching config (cold start or stale)..."

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v8

    invoke-static/range {v16 .. v21}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    iget-object v9, v1, Lcom/appsflyer/internal/AFf1oSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1sSDK;

    const/16 v10, 0x5dc

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    filled-new-array {v9, v3, v7, v4, v12}, [Ljava/lang/Object;

    move-result-object v3

    const v7, 0x70f95d4b

    const v9, -0x70f95d49

    invoke-static {v3, v7, v9, v10}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/appsflyer/internal/AFd1pSDK;

    invoke-virtual {v3}, Lcom/appsflyer/internal/AFd1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFd1fSDK;

    move-result-object v3

    invoke-virtual {v3}, Lcom/appsflyer/internal/AFd1fSDK;->isSuccessful()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v7

    check-cast v13, Lcom/appsflyer/internal/AFh1aSDK;

    const-string v7, "x-amz-meta-af-auth-v1"

    invoke-virtual {v3, v7}, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "CF-Cache-Status"

    invoke-virtual {v3, v9}, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v9, "af-net-tkn"

    invoke-virtual {v3, v9}, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_a

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_9

    goto :goto_7

    :cond_9
    iget-object v10, v1, Lcom/appsflyer/internal/AFf1oSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFc1eSDK;

    iput-object v9, v10, Lcom/appsflyer/internal/AFc1eSDK;->getOutOfStore:Ljava/lang/String;

    goto :goto_8

    :cond_a
    :goto_7
    const-string v18, "Network token header not present in the response"

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v8

    invoke-static/range {v16 .. v21}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    :goto_8
    iget-object v9, v1, Lcom/appsflyer/internal/AFf1oSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1fSDK;

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v9

    const v11, -0x62ff1f55

    const v15, 0x62ff1f57

    invoke-static {v10, v11, v15, v9}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_b

    invoke-static {v9}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_c

    :cond_b
    move-object/from16 v7, v16

    goto/16 :goto_9

    :cond_c
    iget-object v10, v1, Lcom/appsflyer/internal/AFf1oSDK;->v:Lcom/appsflyer/internal/AFf1nSDK;

    invoke-virtual {v10, v13, v7, v4, v9}, Lcom/appsflyer/internal/AFf1nSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1aSDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1uSDK;

    move-result-object v15

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, v15, Lcom/appsflyer/internal/AFi1uSDK;->AFKeystoreWrapper:Z

    if-eqz v2, :cond_d

    iget-object v2, v1, Lcom/appsflyer/internal/AFf1oSDK;->afWarnLog:Lcom/appsflyer/internal/AFf1kSDK;

    invoke-virtual {v2}, Lcom/appsflyer/internal/AFf1kSDK;->AFKeystoreWrapper()J

    move-result-wide v9

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "using max-age fallback: "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-wide/from16 v17, v9

    const/4 v10, 0x0

    move-object v9, v2

    move-object/from16 v19, v3

    move-object/from16 v7, v16

    move-wide/from16 v2, v17

    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iget-object v11, v1, Lcom/appsflyer/internal/AFf1oSDK;->afDebugLog:Lcom/appsflyer/internal/AFf1jSDK;

    iget-object v12, v13, Lcom/appsflyer/internal/AFh1aSDK;->d:Ljava/lang/String;
    :try_end_0
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v16, v4

    :try_start_1
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-virtual {v12, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    const/4 v12, 0x2

    invoke-static {v4, v12}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    iget-object v12, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;
    :try_end_1
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-wide/from16 v17, v5

    :try_start_2
    const-string v5, "af_remote_config"

    invoke-interface {v12, v5, v4}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    iput-object v4, v11, Lcom/appsflyer/internal/AFf1jSDK;->d:Lcom/appsflyer/internal/AFh1aSDK;

    iget-object v4, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v5, "af_rc_timestamp"

    invoke-interface {v4, v5, v9, v10}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    iget-object v4, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v5, "af_rc_max_age"

    invoke-interface {v4, v5, v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    iput-object v13, v11, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    iput-wide v9, v11, Lcom/appsflyer/internal/AFf1jSDK;->registerClient:J

    iput-wide v2, v11, Lcom/appsflyer/internal/AFf1jSDK;->unregisterClient:J

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Config successfully updated, timeToLive: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    new-instance v3, Lcom/appsflyer/internal/AFf1xSDK;

    invoke-virtual/range {v19 .. v19}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/appsflyer/internal/AFh1aSDK;

    iget-object v9, v15, Lcom/appsflyer/internal/AFi1uSDK;->AFLogger:Lcom/appsflyer/internal/AFh1dSDK;
    :try_end_2
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v11, 0x0

    move-object v10, v14

    move-object/from16 v4, v16

    move-wide/from16 v5, v17

    move-object/from16 v7, v19

    :try_start_3
    invoke-direct/range {v3 .. v11}, Lcom/appsflyer/internal/AFf1xSDK;-><init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v3}, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFLogger:Lcom/appsflyer/internal/AFf1pSDK;

    return-object v0

    :catchall_1
    move-exception v0

    move-object/from16 v4, v16

    move-wide/from16 v5, v17

    goto/16 :goto_3

    :catch_2
    move-exception v0

    move-object/from16 v4, v16

    move-wide/from16 v5, v17

    goto/16 :goto_b

    :catch_3
    move-exception v0

    move-object/from16 v4, v16

    move-wide/from16 v5, v17

    goto/16 :goto_c

    :catchall_2
    move-exception v0

    move-object/from16 v4, v16

    goto/16 :goto_3

    :catch_4
    move-exception v0

    move-object/from16 v4, v16

    goto/16 :goto_4

    :catch_5
    move-exception v0

    move-object/from16 v4, v16

    goto/16 :goto_5

    :cond_d
    move-object v7, v3

    move-object/from16 v17, v8

    move-object v10, v14

    new-instance v3, Lcom/appsflyer/internal/AFf1xSDK;

    invoke-virtual {v7}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/appsflyer/internal/AFh1aSDK;

    iget-object v9, v15, Lcom/appsflyer/internal/AFi1uSDK;->AFLogger:Lcom/appsflyer/internal/AFh1dSDK;

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/appsflyer/internal/AFf1xSDK;-><init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v3}, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V

    const-string v9, "fetched config is not valid (MITM?) refuse to use it."

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    return-object v0

    :goto_9
    const-string v9, "Dev key is not set, SDK is not started."

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    return-object v0

    :cond_e
    move-object v7, v3

    move-object/from16 v17, v8

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lcom/appsflyer/internal/AFf1xSDK;

    invoke-virtual {v7}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/appsflyer/internal/AFh1aSDK;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/appsflyer/internal/AFf1xSDK;-><init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v3}, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V

    invoke-virtual {v7}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "failed to fetch remote config from CDN with status code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;
    :try_end_3
    .catch Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-object v0

    :goto_a
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "failed to update remote config: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v15, 0x40

    const/16 v16, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    new-instance v3, Lcom/appsflyer/internal/AFf1xSDK;

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/appsflyer/internal/AFf1xSDK;-><init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v10, v11

    invoke-direct {v1, v3}, Lcom/appsflyer/internal/AFf1oSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1xSDK;)V

    invoke-virtual {v10}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/InterruptedException;

    if-nez v2, :cond_f

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    goto :goto_d

    :cond_f
    throw v0

    :goto_b
    const/4 v6, 0x0

    move-object v5, v0

    move-object v2, v4

    move-wide/from16 v3, v17

    invoke-direct/range {v1 .. v6}, Lcom/appsflyer/internal/AFf1oSDK;->d(Ljava/lang/String;JLjava/io/IOException;Lcom/appsflyer/internal/AFd1fSDK;)V

    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Ljava/io/InterruptedIOException;

    if-nez v1, :cond_10

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    goto :goto_d

    :cond_10
    throw v0

    :goto_c
    invoke-virtual {v0}, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;->getRawResponse()Lcom/appsflyer/internal/AFd1fSDK;

    move-result-object v6

    move-object/from16 v1, p0

    move-object v5, v0

    move-object v2, v4

    move-wide/from16 v3, v17

    invoke-direct/range {v1 .. v6}, Lcom/appsflyer/internal/AFf1oSDK;->d(Ljava/lang/String;JLjava/io/IOException;Lcom/appsflyer/internal/AFd1fSDK;)V

    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Ljava/io/InterruptedIOException;

    if-nez v1, :cond_11

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    :goto_d
    return-object v0

    :cond_11
    throw v0
.end method


# virtual methods
.method public final AFLogger()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x5dc

    return-wide v0
.end method

.method public final registerClient()Lcom/appsflyer/internal/AFd1cSDK;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    :try_start_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1oSDK;->e()Lcom/appsflyer/internal/AFf1pSDK;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFf1oSDK;->i:Lcom/appsflyer/internal/AFf1pSDK;
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    return-object v0

    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    return-object v0

    :catch_0
    move-exception v0

    move-object v4, v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v4, v0

    goto :goto_1

    :goto_0
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const-string v3, "RC update config failed"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    iput-object v0, p0, Lcom/appsflyer/internal/AFf1oSDK;->i:Lcom/appsflyer/internal/AFf1pSDK;

    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1cSDK;

    return-object v0

    :goto_1
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const-string v3, "RC update config failed"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    iput-object v0, p0, Lcom/appsflyer/internal/AFf1oSDK;->i:Lcom/appsflyer/internal/AFf1pSDK;

    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1cSDK;

    return-object v0

    :catch_2
    sget-object v0, Lcom/appsflyer/internal/AFf1pSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1pSDK;

    iput-object v0, p0, Lcom/appsflyer/internal/AFf1oSDK;->i:Lcom/appsflyer/internal/AFf1pSDK;

    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1cSDK;

    return-object v0
.end method
