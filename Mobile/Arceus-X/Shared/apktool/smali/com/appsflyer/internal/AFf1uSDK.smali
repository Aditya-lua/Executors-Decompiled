.class public final Lcom/appsflyer/internal/AFf1uSDK;
.super Lcom/appsflyer/internal/AFf1tSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFf1uSDK$AFa1ySDK;
    }
.end annotation


# instance fields
.field private final AFLoggerLogLevel:Lcom/appsflyer/internal/AFi1aSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AppsFlyerLib:Lcom/appsflyer/internal/AFe1wSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afDebugLog:Lcom/appsflyer/internal/AFa1lSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afInfoLog:Lcom/appsflyer/internal/AFf1hSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afWarnLog:Lcom/appsflyer/internal/AFc1eSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final force:Lcom/appsflyer/internal/AFc1dSDK;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/AFc1dSDK<",
            "Lcom/appsflyer/share/AppsFlyerConversionListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final getEntries:Lcom/appsflyer/internal/AFf1aSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "+",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final values:Lcom/appsflyer/internal/AFh1sSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 7
    .param p1    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFc1bSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/appsflyer/internal/AFf1tSDK;-><init>(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Lcom/appsflyer/internal/AFc1dSDK;

    new-instance p2, Lcom/appsflyer/internal/o0;

    invoke-direct {p2, v3}, Lcom/appsflyer/internal/o0;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    invoke-direct {p1, p2}, Lcom/appsflyer/internal/AFc1dSDK;-><init>(Lkotlin/jvm/functions/Function0;)V

    iput-object p1, v1, Lcom/appsflyer/internal/AFf1uSDK;->force:Lcom/appsflyer/internal/AFc1dSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v1, Lcom/appsflyer/internal/AFf1uSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFi1aSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v1, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v1, Lcom/appsflyer/internal/AFf1uSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1hSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v1, Lcom/appsflyer/internal/AFf1uSDK;->afDebugLog:Lcom/appsflyer/internal/AFa1lSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v1, Lcom/appsflyer/internal/AFf1uSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v1, Lcom/appsflyer/internal/AFf1uSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFe1wSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->w()Lcom/appsflyer/internal/AFf1aSDK;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v1, Lcom/appsflyer/internal/AFf1uSDK;->getEntries:Lcom/appsflyer/internal/AFf1aSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->setUserLastName()Lcom/appsflyer/internal/AFh1sSDK;

    move-result-object p1

    iput-object p1, v1, Lcom/appsflyer/internal/AFf1uSDK;->values:Lcom/appsflyer/internal/AFh1sSDK;

    sget-object p1, Lcom/appsflyer/internal/AFd1bSDK;->e:Lcom/appsflyer/internal/AFd1bSDK;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v1, Lcom/appsflyer/internal/AFe1ySDK;->d:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object p1, Lcom/appsflyer/internal/AFd1bSDK;->force:Lcom/appsflyer/internal/AFd1bSDK;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v1, Lcom/appsflyer/internal/AFe1ySDK;->d:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final AFLogger(Lcom/appsflyer/internal/AFc1bSDK;)Lcom/appsflyer/share/AppsFlyerConversionListener;
    .locals 0

    .line 1
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->setUserFirstName()Lcom/appsflyer/share/AppsFlyerConversionListener;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFc1bSDK;)Lcom/appsflyer/share/AppsFlyerConversionListener;
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFf1uSDK;->AFLogger(Lcom/appsflyer/internal/AFc1bSDK;)Lcom/appsflyer/share/AppsFlyerConversionListener;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFf1uSDK;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFf1uSDK;->d(Lcom/appsflyer/internal/AFf1uSDK;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/appsflyer/internal/AFf1uSDK;)Lkotlin/Unit;
    .locals 1

    .line 87
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1uSDK;->getEntries:Lcom/appsflyer/internal/AFf1aSDK;

    new-instance v0, Lcom/appsflyer/internal/AFh1kSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFh1kSDK;-><init>()V

    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFf1aSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final AFLogger()Z
    .locals 5

    .line 2
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->AFLogger()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_4

    .line 3
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 4
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 5
    sget-object v3, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    move-result v0

    div-int/lit16 v0, v0, 0x1f4

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v4

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 8
    sget-object v3, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    if-eq v2, v3, :cond_2

    sget-object v3, Lcom/appsflyer/internal/AFd1bSDK;->w:Lcom/appsflyer/internal/AFd1bSDK;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    move v2, v4

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v1

    :goto_2
    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    return v4

    :cond_4
    :goto_3
    return v1
.end method

.method public final d(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 14
    .param p1    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1}, Lcom/appsflyer/internal/AFf1tSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 2
    iget v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->afWarnLog:I

    .line 3
    iget-object v2, p0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 4
    iget-object v3, v2, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 5
    iget-object v3, v3, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v4, "appsFlyerCount"

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v3

    const-wide/16 v6, 0x0

    .line 6
    const-string v4, "first_launch"

    const/4 v8, 0x1

    if-ne v3, v8, :cond_1

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iput-wide v9, v2, Lcom/appsflyer/internal/AFh1xSDK;->afErrorLog:J

    .line 8
    iget-wide v11, v2, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    cmp-long v3, v11, v6

    if-eqz v3, :cond_0

    .line 9
    iget-object v3, v2, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    sub-long/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v10, "from_fg"

    invoke-interface {v3, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object v3, v2, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 11
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 12
    iget-object v2, v2, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_0
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v9, "Metrics: fg ts is missing"

    invoke-virtual {v2, v3, v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 14
    :cond_1
    :goto_0
    iget-object v2, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 15
    const-string v3, "meta"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    check-cast v2, Ljava/util/Map;

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_3

    .line 16
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 17
    iget-object v9, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 18
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v9, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    :cond_3
    iget-object v9, p0, Lcom/appsflyer/internal/AFf1uSDK;->afDebugLog:Lcom/appsflyer/internal/AFa1lSDK;

    invoke-interface {v9}, Lcom/appsflyer/internal/AFa1lSDK;->unregisterClient()Ljava/util/Map;

    move-result-object v9

    .line 20
    invoke-interface {v9}, Ljava/util/Map;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_4

    .line 21
    invoke-virtual {p1, v9}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/util/Map;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 22
    :cond_4
    iget-object v9, p0, Lcom/appsflyer/internal/AFf1uSDK;->afInfoLog:Lcom/appsflyer/internal/AFf1hSDK;

    invoke-virtual {v9}, Lcom/appsflyer/internal/AFf1hSDK;->d()Lcom/appsflyer/internal/AFh1bSDK;

    move-result-object v9

    if-eqz v9, :cond_c

    .line 23
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 24
    const-string v11, "cdn_token"

    iget-object v12, v9, Lcom/appsflyer/internal/AFh1bSDK;->AFKeystoreWrapper:Ljava/lang/String;

    invoke-interface {v10, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    iget-object v11, v9, Lcom/appsflyer/internal/AFh1bSDK;->d:Ljava/lang/String;

    if-eqz v11, :cond_5

    .line 26
    const-string v12, "c_ver"

    invoke-interface {v10, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    :cond_5
    iget-wide v11, v9, Lcom/appsflyer/internal/AFh1bSDK;->AFLogger:J

    cmp-long v13, v11, v6

    if-lez v13, :cond_6

    .line 28
    const-string v13, "latency"

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-interface {v10, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    :cond_6
    iget-wide v11, v9, Lcom/appsflyer/internal/AFh1bSDK;->unregisterClient:J

    cmp-long v6, v11, v6

    if-lez v6, :cond_7

    .line 30
    const-string v6, "delay"

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v10, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    :cond_7
    iget v6, v9, Lcom/appsflyer/internal/AFh1bSDK;->registerClient:I

    if-lez v6, :cond_8

    .line 32
    const-string v7, "res_code"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v10, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    :cond_8
    iget-object v6, v9, Lcom/appsflyer/internal/AFh1bSDK;->e:Ljava/lang/Throwable;

    if-eqz v6, :cond_9

    .line 34
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v9, Lcom/appsflyer/internal/AFh1bSDK;->e:Ljava/lang/Throwable;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v9, Lcom/appsflyer/internal/AFh1bSDK;->e:Ljava/lang/Throwable;

    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "error"

    invoke-interface {v10, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    :cond_9
    iget-object v6, v9, Lcom/appsflyer/internal/AFh1bSDK;->force:Lcom/appsflyer/internal/AFh1dSDK;

    if-eqz v6, :cond_a

    .line 36
    const-string v7, "sig"

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v10, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    :cond_a
    iget-object v6, v9, Lcom/appsflyer/internal/AFh1bSDK;->w:Ljava/lang/String;

    if-eqz v6, :cond_b

    .line 38
    const-string v7, "cdn_cache_status"

    invoke-interface {v10, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_b
    const-string v6, "rc"

    invoke-interface {v2, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :cond_c
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1tSDK;->values()Lcom/appsflyer/internal/AFg1rSDK;

    move-result-object v6

    .line 41
    iget-object v7, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 42
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v7}, Lcom/appsflyer/internal/AFg1rSDK;->registerClient(Ljava/util/Map;)V

    const/4 v0, 0x2

    if-eq v1, v8, :cond_e

    if-eq v1, v0, :cond_d

    goto :goto_2

    .line 43
    :cond_d
    iget-object v6, p0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 44
    iget-object v7, v6, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {v7, v4}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;)V

    .line 45
    new-instance v7, Ljava/util/HashMap;

    iget-object v6, v6, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    invoke-direct {v7, v6}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 46
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_10

    .line 47
    invoke-interface {v2, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 48
    :cond_e
    iget-object v6, p0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 49
    new-instance v7, Ljava/util/HashMap;

    iget-object v9, v6, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    invoke-direct {v7, v9}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 50
    iget-object v6, v6, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    invoke-interface {v6}, Ljava/util/Map;->clear()V

    .line 51
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_f

    .line 52
    const-string v6, "ddl"

    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    :cond_f
    iget-object v6, p0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 54
    new-instance v7, Ljava/util/HashMap;

    iget-object v6, v6, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    invoke-direct {v7, v6}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 55
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_10

    .line 56
    invoke-interface {v2, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    :cond_10
    :goto_2
    iget-object v4, p0, Lcom/appsflyer/internal/AFf1uSDK;->values:Lcom/appsflyer/internal/AFh1sSDK;

    if-nez v4, :cond_11

    goto :goto_3

    :cond_11
    if-eq v1, v8, :cond_13

    if-eq v1, v0, :cond_12

    goto :goto_3

    .line 58
    :cond_12
    instance-of v6, p1, Lcom/appsflyer/internal/AFh1kSDK;

    if-eqz v6, :cond_14

    invoke-interface {v4}, Lcom/appsflyer/internal/AFh1sSDK;->unregisterClient()Z

    move-result v6

    if-nez v6, :cond_14

    .line 59
    invoke-interface {v4, p1}, Lcom/appsflyer/internal/AFh1sSDK;->unregisterClient(Lcom/appsflyer/internal/AFh1pSDK;)V

    goto :goto_3

    .line 60
    :cond_13
    invoke-interface {v4, p1}, Lcom/appsflyer/internal/AFh1sSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 61
    :cond_14
    :goto_3
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_15

    .line 62
    iget-object v2, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 63
    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    if-gt v1, v0, :cond_1e

    if-ne v1, v8, :cond_16

    .line 64
    iget-object v2, p0, Lcom/appsflyer/internal/AFf1uSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFi1aSDK;

    .line 65
    iput-boolean v8, v2, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger:Z

    .line 66
    :cond_16
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 67
    iget-object v3, p0, Lcom/appsflyer/internal/AFf1uSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFi1aSDK;

    .line 68
    iget-object v3, v3, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-array v4, v5, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 69
    array-length v4, v3

    :goto_4
    if-ge v5, v4, :cond_1c

    aget-object v6, v3, v5

    .line 70
    instance-of v7, v6, Lcom/appsflyer/internal/AFi1gSDK;

    .line 71
    invoke-virtual {v6}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    move-result-object v9

    sget-object v10, Lcom/appsflyer/internal/AFf1uSDK$AFa1ySDK;->AFLogger:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v10, v9

    if-eq v9, v8, :cond_19

    if-eq v9, v0, :cond_18

    const/4 v6, 0x3

    if-ne v9, v6, :cond_17

    goto :goto_5

    :cond_17
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_18
    if-ne v1, v0, :cond_1b

    if-nez v7, :cond_1b

    .line 72
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 73
    const-string v9, "source"

    invoke-virtual {v6}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getSource()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v7, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    const-string v9, "response"

    const-string v10, "TIMEOUT"

    invoke-interface {v7, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const-string v9, "type"

    invoke-virtual {v6}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v7, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_19
    if-eqz v7, :cond_1a

    .line 77
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1tSDK;->getLevel()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v7

    const-string v9, "newGPReferrerSent"

    invoke-interface {v7, v9, v8}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;Z)V

    .line 78
    :cond_1a
    iget-object v6, v6, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1b
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 79
    :cond_1c
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1d

    .line 80
    const-string v0, "referrers"

    invoke-virtual {p1, v0, v2}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 81
    :cond_1d
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->v:Ljava/util/Map;

    if-eqz v0, :cond_1e

    const-string v1, "fb_ddl"

    invoke-virtual {p1, v1, v0}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 82
    :cond_1e
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->values:Lcom/appsflyer/internal/AFh1sSDK;

    if-nez v0, :cond_1f

    goto :goto_6

    .line 83
    :cond_1f
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;

    move-result-object v1

    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    if-ne v1, v2, :cond_20

    .line 84
    invoke-interface {v0}, Lcom/appsflyer/internal/AFh1sSDK;->registerClient()Z

    move-result v1

    if-eqz v1, :cond_20

    .line 85
    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFh1sSDK;->registerClient(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 86
    :cond_20
    :goto_6
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1tSDK;->values()Lcom/appsflyer/internal/AFg1rSDK;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/appsflyer/internal/AFg1rSDK;->unregisterClient(Lcom/appsflyer/internal/AFh1pSDK;)V

    return-void
.end method

.method public final force()V
    .locals 11

    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->force()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    sget-object v1, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/appsflyer/internal/AFc1eSDK;->onPause:J

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->afErrorLog:Lcom/appsflyer/internal/AFh1xSDK;

    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    iget-object v2, v2, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v3, "appsFlyerCount"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, v0, Lcom/appsflyer/internal/AFh1xSDK;->afErrorLog:J

    const-wide/16 v9, 0x0

    cmp-long v2, v7, v9

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    sub-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "net"

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    iget-object v0, v0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "first_launch"

    invoke-interface {v0, v5, v2}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v5, "Metrics collection skipped: launch start timestamp not recorded"

    invoke-virtual {v0, v2, v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->force:Lcom/appsflyer/internal/AFc1dSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1dSDK;->AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/share/AppsFlyerConversionListener;

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient()I

    move-result v2

    if-ne v2, v3, :cond_4

    move v4, v3

    :cond_4
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    if-eq v2, v1, :cond_5

    if-eqz v4, :cond_6

    :cond_5
    new-instance v1, Lcom/appsflyer/internal/AFg1lSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1tSDK;->getLevel()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v2

    invoke-direct {v1, p0, v2, v0}, Lcom/appsflyer/internal/AFg1lSDK;-><init>(Lcom/appsflyer/internal/AFf1uSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFe1wSDK;

    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1uSDK;->values:Lcom/appsflyer/internal/AFh1sSDK;

    if-eqz v0, :cond_7

    new-instance v1, Lcom/appsflyer/internal/p0;

    invoke-direct {v1, p0}, Lcom/appsflyer/internal/p0;-><init>(Lcom/appsflyer/internal/AFf1uSDK;)V

    invoke-interface {v0, p0, v1}, Lcom/appsflyer/internal/AFh1sSDK;->unregisterClient(Lcom/appsflyer/internal/AFf1uSDK;Lkotlin/jvm/functions/Function0;)V

    :cond_7
    return-void
.end method
