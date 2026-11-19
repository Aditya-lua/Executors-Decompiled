.class public final Lcom/appsflyer/internal/AFe1aSDK;
.super Lcom/appsflyer/internal/AFe1kSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1kSDK<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private AFLoggerLogLevel:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final afDebugLog:Ljava/util/UUID;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private afErrorLog:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private afInfoLog:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public force:Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final v:Z


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Ljava/util/UUID;Landroid/net/Uri;)V
    .locals 20
    .param p1    # Lcom/appsflyer/internal/AFc1bSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/UUID;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const v4, -0x7c1b5be4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const v5, 0x59e3c68a

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const v6, 0xf8e7231

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const v7, 0x5b131229

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, ""

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lcom/appsflyer/internal/AFd1bSDK;->i:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v10, 0x1

    new-array v11, v10, [Lcom/appsflyer/internal/AFe1zSDK;

    sget-object v12, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v13, 0x0

    aput-object v12, v11, v13

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v1, v9, v11, v0, v12}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V

    iput-object v2, v1, Lcom/appsflyer/internal/AFe1aSDK;->afDebugLog:Ljava/util/UUID;

    :try_start_0
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v14

    if-eqz v2, :cond_a

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    if-eqz v14, :cond_a

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x2

    :try_start_1
    new-array v9, v2, [Ljava/lang/Object;

    aput-object v0, v9, v10

    aput-object v3, v9, v13

    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v8, v13}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    move-result v11

    const v12, 0xa1c8

    sub-int/2addr v12, v11

    int-to-char v11, v12

    invoke-static {v13, v13}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v12

    invoke-static {v8, v13, v13}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v15

    add-int/lit8 v15, v15, 0x25

    invoke-static {v11, v12, v15}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Class;

    const-class v12, Landroid/net/Uri;

    const-class v15, Lcom/appsflyer/internal/AFa1qSDK;

    filled-new-array {v12, v15}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v11

    invoke-interface {v0, v7, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v11, Ljava/lang/reflect/Constructor;

    invoke-virtual {v11, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const-string v11, "AFLogger"

    const/4 v12, 0x0

    if-eqz v9, :cond_3

    goto :goto_1

    :cond_3
    const/16 v9, 0x30

    :try_start_3
    invoke-static {v8, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v9

    const v15, 0xa1c7

    sub-int/2addr v15, v9

    int-to-char v9, v15

    invoke-static {v13, v13}, Landroid/view/View;->resolveSize(II)I

    move-result v15

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v16

    const/16 v17, 0x0

    cmpl-float v16, v16, v17

    rsub-int/lit8 v2, v16, 0x25

    invoke-static {v9, v15, v2}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-interface {v0, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    check-cast v9, Ljava/lang/reflect/Method;

    invoke-virtual {v9, v7, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v6

    shr-int/lit8 v6, v6, 0x8

    int-to-char v6, v6

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v15

    const-wide/16 v17, 0x0

    cmp-long v7, v15, v17

    rsub-int/lit8 v7, v7, 0x26

    invoke-static {v13}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v9

    add-int/lit8 v9, v9, 0x14

    shr-int/lit8 v9, v9, 0x6

    rsub-int/lit8 v9, v9, 0x32

    invoke-static {v6, v7, v9}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    invoke-virtual {v6, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    check-cast v6, Ljava/lang/reflect/Method;

    invoke-virtual {v6, v2, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    int-to-char v6, v6

    invoke-static {v8, v13}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v7

    add-int/lit8 v7, v7, 0x25

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v8

    shr-int/lit8 v8, v8, 0x10

    rsub-int/lit8 v8, v8, 0x32

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    const-string v7, "unregisterClient"

    invoke-virtual {v6, v7, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    check-cast v6, Ljava/lang/reflect/Method;

    invoke-virtual {v6, v2, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    const-string v0, "/"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v15

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-eqz v5, :cond_a

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x3

    if-ne v2, v4, :cond_a

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iput-object v2, v1, Lcom/appsflyer/internal/AFe1aSDK;->afInfoLog:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v1, Lcom/appsflyer/internal/AFe1aSDK;->afErrorLog:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/appsflyer/internal/AFe1aSDK;->AFLoggerLogLevel:Ljava/lang/String;

    goto :goto_5

    :catch_0
    move-exception v0

    move-object v5, v0

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_6

    throw v2

    :cond_6
    throw v0

    :catchall_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_7

    throw v2

    :cond_7
    throw v0

    :catchall_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_8

    throw v2

    :cond_8
    throw v0

    :catchall_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_9

    throw v2

    :cond_9
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :goto_4
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v10, 0x60

    const/4 v11, 0x0

    const-string v4, "OneLinkValidator: reflection init failed"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    :cond_a
    :goto_5
    iput-boolean v13, v1, Lcom/appsflyer/internal/AFe1aSDK;->v:Z

    return-void
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afDebugLog()Lcom/appsflyer/internal/AFd1sSDK;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1aSDK;->afInfoLog:Ljava/lang/String;

    const-string v3, "Required value was null."

    if-eqz v2, :cond_1

    .line 4
    iget-object v4, p0, Lcom/appsflyer/internal/AFe1aSDK;->afErrorLog:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 5
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1aSDK;->afDebugLog:Ljava/util/UUID;

    .line 6
    invoke-virtual {v1, v2, v4, v3, p1}, Lcom/appsflyer/internal/AFd1sSDK;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic AFLogger()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public final a_()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()J
    .locals 2

    invoke-static {}, Lcom/appsflyer/internal/AFf1wSDK;->registerClient()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final force()V
    .locals 4

    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->force()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1aSDK;->force:Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    sget-object v3, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    if-ne v2, v3, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Map;

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;->unregisterClient(Ljava/util/Map;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1ySDK;->AFKeystoreWrapper()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v2, v1, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;

    const-string v3, "Can\'t get OneLink data"

    if-eqz v2, :cond_3

    check-cast v1, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;

    invoke-virtual {v1}, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;->getRawResponse()Lcom/appsflyer/internal/AFd1fSDK;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFd1fSDK;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v3, "Can\'t parse one link data"

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1aSDK;->AFLoggerLogLevel:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v3, v1

    :goto_0
    invoke-interface {v0, v3}, Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;->d(Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1aSDK;->AFLoggerLogLevel:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    move-object v3, v1

    :goto_1
    invoke-interface {v0, v3}, Lcom/appsflyer/internal/AFe1aSDK$AFa1ySDK;->d(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public final values()Z
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1aSDK;->afInfoLog:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1aSDK;->afErrorLog:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1aSDK;->afInfoLog:Ljava/lang/String;

    const-string v1, "app"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
