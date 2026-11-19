.class public final Lcom/appsflyer/internal/AFg1mSDK;
.super Lcom/appsflyer/internal/AFe1kSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1kSDK<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final AFLoggerLogLevel:Lcom/appsflyer/share/AppsFlyerConversionListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private afInfoLog:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private afWarnLog:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final force:Lcom/appsflyer/internal/AFc1iSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final v:Lcom/appsflyer/internal/AFc1kSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 5
    .param p1    # Lcom/appsflyer/internal/AFc1bSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->afDebugLog:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/appsflyer/internal/AFe1zSDK;

    sget-object v3, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "GCD-FETCH"

    invoke-direct {p0, v1, v2, p1, v3}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFg1mSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFg1mSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->setUserFirstName()Lcom/appsflyer/share/AppsFlyerConversionListener;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFg1mSDK;->AFLoggerLogLevel:Lcom/appsflyer/share/AppsFlyerConversionListener;

    sget-object p1, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFe1ySDK;->d:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object p1, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 9
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
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1mSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    .line 3
    iget-object v2, p0, Lcom/appsflyer/internal/AFg1mSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 4
    const-string v3, "CHANNEL"

    invoke-virtual {v2, v3}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x0

    .line 6
    :cond_0
    invoke-static {v1, v2}, Lcom/appsflyer/internal/AFa1tSDK;->d(Lcom/appsflyer/internal/AFc1kSDK;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 7
    invoke-static {v1}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {}, Lcom/appsflyer/internal/AFg1jSDK;->d()Ljava/util/List;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[GCD] AF detected using redundant Google-Play channel for attribution - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Using without channel postfix."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 10
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    .line 11
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 12
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afDebugLog()Lcom/appsflyer/internal/AFd1sSDK;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;

    move-result-object p1

    .line 13
    iget-object v0, p1, Lcom/appsflyer/internal/AFd1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;

    .line 14
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1oSDK;->d:Ljava/lang/String;

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[GCD-B01] URL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 16
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final AFLogger()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final force()V
    .locals 2

    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->force()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1mSDK;->afWarnLog:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/appsflyer/internal/AFg1mSDK;->AFLoggerLogLevel:Lcom/appsflyer/share/AppsFlyerConversionListener;

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFg1kSDK;->d(Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1mSDK;->afInfoLog:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    const/4 v0, 0x0

    :cond_2
    if-nez v0, :cond_3

    const-string v0, "Unknown error"

    :cond_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1mSDK;->AFLoggerLogLevel:Lcom/appsflyer/share/AppsFlyerConversionListener;

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFg1kSDK;->registerClient(Ljava/lang/String;Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    return-void
.end method

.method public final registerClient()Lcom/appsflyer/internal/AFd1cSDK;
    .locals 20
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v1, p0

    const-string v2, "is_first_launch"

    const-string v3, "af_channel"

    const-string v4, "af_siteid"

    const-string v5, ""

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFe1kSDK;->afInfoLog()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v0

    if-nez v0, :cond_11

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v0, 0x3

    if-ge v7, v0, :cond_10

    const/4 v0, 0x2

    const/4 v8, 0x1

    if-ne v7, v0, :cond_0

    move v9, v8

    goto :goto_1

    :cond_0
    move v9, v6

    :goto_1
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    iput-wide v10, v0, Lcom/appsflyer/internal/AFh1xSDK;->afDebugLog:J

    :try_start_0
    invoke-super {v1}, Lcom/appsflyer/internal/AFe1kSDK;->registerClient()Lcom/appsflyer/internal/AFd1cSDK;

    iget-object v0, v1, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    if-nez v0, :cond_1

    goto :goto_4

    :cond_1
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    move-result v10

    const/16 v11, 0x193

    if-eq v10, v11, :cond_3

    const/16 v11, 0x1f4

    if-lt v10, v11, :cond_2

    goto :goto_2

    :cond_2
    move v11, v6

    goto :goto_3

    :cond_3
    :goto_2
    move v11, v8

    :goto_3
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->isSuccessful()Z

    move-result v12

    const/16 v13, 0x194

    if-nez v12, :cond_7

    if-ne v10, v13, :cond_4

    goto :goto_6

    :cond_4
    if-nez v9, :cond_6

    if-nez v11, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    const/4 v0, 0x0

    goto/16 :goto_9

    :cond_6
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error connection to server: "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afInfoLog:Ljava/lang/String;

    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :catch_0
    move-exception v0

    move-object v13, v0

    goto/16 :goto_a

    :catch_1
    move-exception v0

    goto/16 :goto_c

    :cond_7
    :goto_6
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v10

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    move-result v0

    if-ne v0, v13, :cond_8

    const-string v0, "error_reason"

    invoke-interface {v10, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "status_code"

    invoke-interface {v10, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "af_status"

    const-string v11, "Organic"

    invoke-interface {v10, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "af_message"

    const-string v11, "organic install"

    invoke-interface {v10, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    const-string v0, "iscache"

    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v12, "appsflyerConversionDataCacheExpiration"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-interface {v0, v12, v13, v14}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    :cond_9
    invoke-interface {v10, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v10, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v10, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "[Invite] Detected App-Invite via channel: "

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_7
    move-object v14, v0

    goto :goto_8

    :cond_a
    const-string v0, "[CrossPromotion] App was installed via %s\'s Cross Promotion"

    invoke-interface {v10, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v0, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_7

    :goto_8
    sget-object v12, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v13, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_b
    invoke-interface {v10, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v8, "attributionId"

    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11, v10}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v8, v11}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v8, "sixtyDayConversionData"

    invoke-interface {v0, v8}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v10, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iput-object v10, v1, Lcom/appsflyer/internal/AFg1mSDK;->afWarnLog:Ljava/util/Map;

    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;
    :try_end_0
    .catch Lcom/appsflyer/internal/AFe1uSDK; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_9
    if-nez v0, :cond_d

    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    invoke-virtual {v0, v7}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(I)V

    sget-object v8, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v10, "[GCD-A03] Server retrieving attempt finished"

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_b

    :cond_d
    iget-object v2, v1, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    invoke-virtual {v2, v7}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(I)V

    sget-object v8, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v10, "[GCD-A03] Server retrieving attempt finished"

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    return-object v0

    :goto_a
    :try_start_1
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v15, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v13}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_e

    const-string v0, "unknown error during GCD fetch"

    :cond_e
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "[GCD] Error: "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/16 v18, 0x40

    const/16 v19, 0x0

    const/4 v14, 0x1

    move-object v11, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v10 .. v19}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v9, :cond_f

    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    invoke-virtual {v0, v7}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(I)V

    const/16 v18, 0x4

    const/16 v19, 0x0

    const-string v16, "[GCD-A03] Server retrieving attempt finished"

    const/16 v17, 0x0

    move-object v14, v10

    move-object v15, v11

    invoke-static/range {v14 .. v19}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    :goto_b
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    :cond_f
    :try_start_2
    invoke-virtual {v13}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afInfoLog:Ljava/lang/String;

    throw v13

    :goto_c
    const-string v10, "[GCD-E05] AppsFlyer dev key is missing"

    sget-object v8, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    const-string v2, "AppsFlyer dev key is missing"

    iput-object v2, v1, Lcom/appsflyer/internal/AFg1mSDK;->afInfoLog:Ljava/lang/String;

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_d
    iget-object v2, v1, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    invoke-virtual {v2, v7}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(I)V

    sget-object v8, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v10, "[GCD-A03] Server retrieving attempt finished"

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    throw v0

    :cond_10
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    return-object v0

    :cond_11
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v4, "[GCD-E03] \'isStopTracking\' enabled"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    const-string v0, "\'isStopTracking\' enabled"

    iput-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afInfoLog:Ljava/lang/String;

    new-instance v0, Lcom/appsflyer/internal/AFe1qSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFe1qSDK;-><init>()V

    throw v0
.end method
