.class public final Lcom/appsflyer/internal/AFe1cSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final registerClient:Lcom/appsflyer/internal/AFd1uSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFd1uSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFd1uSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFe1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1uSDK;

    return-void
.end method

.method private static AFLogger(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/appsflyer/internal/AFe1bSDK;->AFKeystoreWrapper()Lkotlin/text/Regex;

    move-result-object v0

    const-string v1, "*Non-printing character*"

    invoke-virtual {v0, p0, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "JSON toString of eventParams map returns null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final registerClient(Ljava/lang/String;Lcom/appsflyer/internal/AFd1pSDK;Ljava/util/Map;)V
    .locals 19
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFd1pSDK;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const v0, 0x1d672567

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, ""

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v8}, Lcom/appsflyer/internal/AFe1cSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v3, v0

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    move-object v10, v0

    move-object v0, v7

    move-object v3, v8

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v10, v0

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v10, v0

    move-object v3, v6

    move-object v0, v7

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v10, v0

    move-object/from16 v18, v6

    move-object/from16 v17, v7

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v10, v0

    move-object v0, v6

    move-object v3, v0

    goto :goto_0

    :catch_2
    move-exception v0

    move-object v10, v0

    move-object/from16 v17, v6

    move-object/from16 v18, v17

    goto :goto_1

    :goto_0
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v15, 0x78

    const/16 v16, 0x0

    const-string v9, "Unexpected error"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    move-object v7, v0

    move-object v8, v3

    move-object v3, v5

    goto/16 :goto_7

    :goto_1
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v15, 0x78

    const/16 v16, 0x0

    const-string v9, "JSONObject return null String object. Trying to create AFJsonObject."

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    :try_start_3
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v7

    shr-int/lit8 v7, v7, 0x18

    int-to-char v7, v7

    const-wide/16 v8, 0x0

    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v8

    add-int/lit16 v8, v8, 0xc6

    const/4 v9, 0x0

    invoke-static {v9, v9}, Landroid/view/View;->getDefaultSize(II)I

    move-result v9

    add-int/lit8 v9, v9, 0x23

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Class;

    const-string v8, "d"

    const-class v9, Ljava/util/Map;

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-interface {v3, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    check-cast v7, Ljava/lang/reflect/Method;

    invoke-virtual {v7, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    :try_start_4
    invoke-static {v8}, Lcom/appsflyer/internal/AFe1cSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-object v3, v0

    move-object/from16 v7, v17

    goto/16 :goto_7

    :catchall_3
    move-exception v0

    move-object v10, v0

    move-object/from16 v18, v8

    goto :goto_3

    :catch_3
    move-exception v0

    move-object v10, v0

    move-object/from16 v18, v8

    goto :goto_5

    :catch_4
    move-exception v0

    move-object v10, v0

    move-object/from16 v18, v8

    goto :goto_6

    :catchall_4
    move-exception v0

    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_1

    throw v3

    :catchall_5
    move-exception v0

    move-object v10, v0

    goto :goto_3

    :catch_5
    move-exception v0

    move-object v10, v0

    goto :goto_5

    :catch_6
    move-exception v0

    move-object v10, v0

    goto :goto_6

    :cond_1
    throw v0
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :goto_3
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v15, 0x78

    const/16 v16, 0x0

    const-string v9, "Unexpected error"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    :goto_4
    move-object v3, v5

    move-object/from16 v7, v17

    move-object/from16 v8, v18

    goto :goto_7

    :goto_5
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v15, 0x60

    const/16 v16, 0x0

    const-string v9, "AFFinalizer: reflection init failed."

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    goto :goto_4

    :goto_6
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v15, 0x78

    const/16 v16, 0x0

    const-string v9, "AFJsonObject return null String object."

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    goto :goto_4

    :goto_7
    if-nez v8, :cond_2

    goto :goto_8

    :cond_2
    move-object v5, v8

    :goto_8
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v8, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v10, "Payload contains non-printing characters"

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    :try_start_6
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_7

    move-object v7, v0

    goto :goto_9

    :catch_7
    move-exception v0

    move-object v11, v0

    sget-object v8, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v16, 0x78

    const/16 v17, 0x0

    const-string v10, "Couldn\'t parse the payload to a json object"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v8 .. v17}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    goto :goto_9

    :cond_3
    move-object v3, v5

    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": preparing data: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lcom/appsflyer/internal/AFg1bSDK;->registerClient(Ljava/lang/String;Lorg/json/JSONObject;)V

    if-eqz v2, :cond_4

    iget-object v0, v2, Lcom/appsflyer/internal/AFd1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;

    if-eqz v0, :cond_4

    iget-object v6, v0, Lcom/appsflyer/internal/AFd1oSDK;->d:Ljava/lang/String;

    :cond_4
    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/appsflyer/internal/AFe1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1uSDK;

    invoke-interface {v0, v6, v3}, Lcom/appsflyer/internal/AFd1uSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
