.class public final Lcom/appsflyer/internal/AFe1fSDK;
.super Lcom/appsflyer/internal/AFe1kSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFe1fSDK$AFa1tSDK;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1kSDK<",
        "Lcom/appsflyer/internal/AFa1gSDK;",
        ">;"
    }
.end annotation


# instance fields
.field private final AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private AppsFlyerLib:I

.field private final afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afErrorLog:Lcom/appsflyer/internal/AFi1aSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afInfoLog:Lcom/appsflyer/internal/AFc1eSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private afWarnLog:I

.field private final force:Lcom/appsflyer/internal/AFc1iSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final getLevel:Ljava/util/concurrent/CountDownLatch;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final v:Lcom/appsflyer/internal/AFa1oSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final valueOf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private values:I


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 13
    .param p1    # Lcom/appsflyer/internal/AFc1bSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->force:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v2, 0x2

    new-array v3, v2, [Lcom/appsflyer/internal/AFe1zSDK;

    sget-object v4, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    sget-object v4, Lcom/appsflyer/internal/AFd1bSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const-string v4, "DdlSdk"

    invoke-direct {p0, v1, v3, p1, v4}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V

    new-instance v1, Lcom/appsflyer/internal/AFa1oSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFa1oSDK;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afInfoLog:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->afDebugLog()Lcom/appsflyer/internal/AFi1aSDK;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afErrorLog:Lcom/appsflyer/internal/AFi1aSDK;

    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v1, v6}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->getLevel:Ljava/util/concurrent/CountDownLatch;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->valueOf:Ljava/util/List;

    iget-object p1, p1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-array v1, v5, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    move v3, v5

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    move-result-object v7

    sget-object v8, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->NOT_STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    if-eq v7, v8, :cond_0

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->AppsFlyerLib:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_1
    if-ge v5, p1, :cond_4

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v5, v5, 0x1

    check-cast v1, Lcom/appsflyer/sdk_base/referrer/Referrer;

    invoke-virtual {v1}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    move-result-object v3

    sget-object v4, Lcom/appsflyer/internal/AFe1fSDK$AFa1tSDK;->AFKeystoreWrapper:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    if-eq v3, v6, :cond_3

    if-eq v3, v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v3, Lcom/appsflyer/internal/f0;

    invoke-direct {v3, v1, p0}, Lcom/appsflyer/internal/f0;-><init>(Lcom/appsflyer/sdk_base/referrer/Referrer;Lcom/appsflyer/internal/AFe1fSDK;)V

    invoke-virtual {v1, v3}, Lcom/appsflyer/sdk_base/referrer/Referrer;->setAdditionalReferrerDataCollectionFinishedCallback(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_3
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    iget-object v3, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v4, "source"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " referrer collected earlier"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v1}, Lcom/appsflyer/internal/AFe1fSDK;->AFKeystoreWrapper(Lcom/appsflyer/sdk_base/referrer/Referrer;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method private final AFKeystoreWrapper(Lcom/appsflyer/sdk_base/referrer/Referrer;)V
    .locals 7

    invoke-static {p1}, Lcom/appsflyer/internal/AFe1fSDK;->unregisterClient(Lcom/appsflyer/sdk_base/referrer/Referrer;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->valueOf:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->getLevel:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Added non-organic "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_0
    iget p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->values:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->values:I

    iget v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->AppsFlyerLib:I

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->getLevel:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_1
    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/sdk_base/referrer/Referrer;Lcom/appsflyer/internal/AFe1fSDK;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFe1fSDK;->unregisterClient(Lcom/appsflyer/sdk_base/referrer/Referrer;Lcom/appsflyer/internal/AFe1fSDK;)V

    return-void
.end method

.method private static unregisterClient(Lcom/appsflyer/internal/AFb1lSDK;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFb1lSDK;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1lSDK;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 6
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1lSDK;->AFLogger:Ljava/lang/Boolean;

    if-eqz p0, :cond_0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_1

    .line 8
    :cond_0
    const-string p0, "type"

    const-string v1, "unhashed"

    invoke-static {p0, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    .line 9
    const-string v1, "value"

    invoke-static {v1, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    filled-new-array {p0, v0}, [Lkotlin/Pair;

    move-result-object p0

    .line 10
    invoke-static {p0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final unregisterClient(Lcom/appsflyer/sdk_base/referrer/Referrer;Lcom/appsflyer/internal/AFe1fSDK;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    iget-object v2, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v3, "source"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " referrer collected via callback"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 2
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFe1fSDK;->AFKeystoreWrapper(Lcom/appsflyer/sdk_base/referrer/Referrer;)V

    return-void
.end method

.method private static unregisterClient(Lcom/appsflyer/sdk_base/referrer/Referrer;)Z
    .locals 5

    .line 3
    iget-object p0, p0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v0, "click_ts"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Long;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    sub-long/2addr v3, v1

    sget-object p0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    cmp-long p0, v3, v1

    if-gez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
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
            "Lcom/appsflyer/internal/AFa1gSDK;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    const/4 v1, 0x1

    add-int/2addr p1, v1

    iput p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    .line 3
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Preparing request "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 4
    iget-object p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    .line 5
    iget-object p1, p1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 6
    iget v2, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    const/4 v3, 0x0

    if-ne v2, v1, :cond_4

    .line 7
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 8
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v4, "appsFlyerCount"

    const/4 v5, 0x0

    invoke-interface {v2, v4, v5}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v5

    .line 9
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "is_first"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "lang"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    const-string v1, "os"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    const-string v1, "type"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 15
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {v1}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    move-result-object v1

    .line 16
    const-string v2, "request_id"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afInfoLog:Lcom/appsflyer/internal/AFc1eSDK;

    .line 18
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1eSDK;->w:Lcom/appsflyer/internal/AFb1rSDK;

    if-eqz v1, :cond_1

    .line 19
    iget-object v1, v1, Lcom/appsflyer/internal/AFb1rSDK;->AFKeystoreWrapper:[Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 20
    const-string v2, "sharing_filter"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 22
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 23
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1eSDK;->updateServerUninstallToken:Lcom/appsflyer/internal/AFh1qSDK;

    if-eqz v1, :cond_2

    .line 24
    new-instance v2, Lcom/appsflyer/internal/AFb1lSDK;

    .line 25
    iget-object v4, v1, Lcom/appsflyer/internal/AFh1qSDK;->AFLogger:Ljava/lang/String;

    .line 26
    iget-object v1, v1, Lcom/appsflyer/internal/AFh1qSDK;->registerClient:Ljava/lang/Boolean;

    .line 27
    invoke-direct {v2, v4, v1}, Lcom/appsflyer/internal/AFb1lSDK;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    goto :goto_1

    :cond_2
    move-object v2, v3

    .line 28
    :goto_1
    invoke-static {v2}, Lcom/appsflyer/internal/AFe1fSDK;->unregisterClient(Lcom/appsflyer/internal/AFb1lSDK;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "gaid"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    :cond_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 30
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 31
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 32
    invoke-static {v1}, Lcom/appsflyer/internal/AFb1iSDK;->unregisterClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1lSDK;

    move-result-object v1

    .line 33
    invoke-static {v1}, Lcom/appsflyer/internal/AFe1fSDK;->unregisterClient(Lcom/appsflyer/internal/AFb1lSDK;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v2, "oaid"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 35
    new-instance v4, Ljava/text/SimpleDateFormat;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "yyyy-MM-dd\'T\'HH:mm:ss.SSS"

    invoke-direct {v4, v6, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 36
    const-string v5, "UTC"

    invoke-static {v5}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 37
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 38
    const-string v2, "timestamp"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    iget v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "request_count"

    invoke-interface {p1, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->valueOf:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .line 41
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 42
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 43
    check-cast v5, Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 44
    invoke-virtual {v5}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    move-result-object v6

    sget-object v7, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->FINISHED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    if-ne v6, v7, :cond_7

    .line 45
    iget-object v6, v5, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v7, "referrer"

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_6

    check-cast v6, Ljava/lang/String;

    goto :goto_3

    :cond_6
    move-object v6, v3

    :goto_3
    if-eqz v6, :cond_7

    .line 46
    iget-object v5, v5, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v7, "source"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/String;

    invoke-static {v7, v5}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 47
    const-string v7, "value"

    invoke-static {v7, v6}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    filled-new-array {v5, v6}, [Lkotlin/Pair;

    move-result-object v5

    .line 48
    invoke-static {v5}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    goto :goto_4

    :cond_7
    move-object v5, v3

    :goto_4
    if-eqz v5, :cond_5

    .line 49
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 50
    :cond_8
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 51
    const-string v1, "referrers"

    invoke-interface {p1, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_9
    iget-object p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    .line 53
    new-instance v1, Lcom/appsflyer/internal/AFj1mSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    invoke-direct {v1, v3}, Lcom/appsflyer/internal/AFj1mSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;)V

    .line 54
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afInfoLog()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    const v5, -0x62ff1f55

    const v6, 0x62ff1f57

    invoke-static {v4, v5, v6, v3}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 55
    iget-object v4, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    .line 56
    iget-object v4, v4, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 57
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    .line 58
    invoke-virtual {v1, v3, v2}, Lcom/appsflyer/internal/AFj1mSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 59
    iput-object v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->i:Ljava/lang/String;

    .line 60
    iget-object p1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    iget v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    if-lez v1, :cond_c

    const/4 v2, 0x2

    if-le v1, v2, :cond_a

    goto :goto_5

    :cond_a
    add-int/lit8 v1, v1, -0x1

    .line 61
    iget-object v2, p1, Lcom/appsflyer/internal/AFh1xSDK;->force:[J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    aput-wide v3, v2, v1

    if-nez v1, :cond_d

    .line 62
    iget-wide v2, p1, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_b

    .line 63
    iget-object v4, p1, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    iget-object p1, p1, Lcom/appsflyer/internal/AFh1xSDK;->force:[J

    aget-wide v5, p1, v1

    sub-long/2addr v5, v2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string v1, "from_fg"

    invoke-interface {v4, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    .line 64
    :cond_b
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Metrics: fg ts is missing"

    invoke-virtual {p1, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    goto :goto_6

    .line 65
    :cond_c
    :goto_5
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v6, Ljava/lang/IllegalStateException;

    const-string p1, "Metrics: Unexpected ddl requestCount = "

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v5, "Unexpected ddl requestCount - start"

    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 66
    :cond_d
    :goto_6
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afDebugLog()Lcom/appsflyer/internal/AFd1sSDK;

    move-result-object p1

    iget-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    const v2, 0xde1efcf

    const v3, -0xde1efce

    invoke-static {v1, v2, v3, p1}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/appsflyer/internal/AFd1pSDK;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final AFLogger()Z
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

.method public final bridge synthetic afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    iget-wide v0, v0, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    return-wide v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final registerClient()Lcom/appsflyer/internal/AFd1cSDK;
    .locals 15
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "referrers"

    sget-object v1, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    const/4 v2, 0x0

    :try_start_0
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->registerClient()Lcom/appsflyer/internal/AFd1cSDK;

    move-result-object v1

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    iget v4, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    const-wide/16 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-lez v4, :cond_2

    if-le v4, v7, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr v4, v8

    iget-object v9, v3, Lcom/appsflyer/internal/AFh1xSDK;->v:[J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    aput-wide v10, v9, v4

    iget-object v9, v3, Lcom/appsflyer/internal/AFh1xSDK;->force:[J

    aget-wide v10, v9, v4

    cmp-long v9, v10, v5

    if-eqz v9, :cond_1

    iget-object v9, v3, Lcom/appsflyer/internal/AFh1xSDK;->w:[J

    iget-object v12, v3, Lcom/appsflyer/internal/AFh1xSDK;->v:[J

    aget-wide v13, v12, v4

    sub-long/2addr v13, v10

    aput-wide v13, v9, v4

    iget-object v3, v3, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    const-string v4, "net"

    invoke-interface {v3, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Metrics: ddlStart["

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "] ts is missing"

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v9, v4}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v9, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v11, "Unexpected ddl requestCount - end"

    new-instance v12, Ljava/lang/IllegalStateException;

    const-string v3, "Metrics: Unexpected ddl requestCount = "

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v12, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual/range {v9 .. v14}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    :goto_1
    sget-object v3, Lcom/appsflyer/internal/AFe1fSDK$AFa1tSDK;->registerClient:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    if-eq v3, v8, :cond_5

    if-eq v3, v7, :cond_3

    return-object v1

    :cond_3
    sget-object v9, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v0, v2

    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error occurred. Server response code = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    sget-object v3, Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;->HTTP_STATUS_CODE:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    invoke-direct {v0, v2, v3}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    iget-object v4, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    iget-wide v4, v4, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    invoke-virtual {v3, v0, v4, v5}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    invoke-virtual {v3, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    return-object v1

    :cond_5
    iget-object v3, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    move-result-object v3

    const-string v4, ""

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/appsflyer/internal/AFa1gSDK;

    iget-object v4, v3, Lcom/appsflyer/internal/AFa1gSDK;->AFKeystoreWrapper:Lcom/appsflyer/share/deeplink/DeepLink;

    if-eqz v4, :cond_6

    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    invoke-direct {v0, v4, v2}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    iget-object v4, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    iget-wide v4, v4, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    invoke-virtual {v3, v0, v4, v5}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    invoke-virtual {v3, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    return-object v1

    :cond_6
    iget v4, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    if-gt v4, v8, :cond_b

    iget-boolean v3, v3, Lcom/appsflyer/internal/AFa1gSDK;->AFLogger:Z

    if-eqz v3, :cond_b

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    iget-object v3, v3, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/List;

    if-eqz v4, :cond_7

    check-cast v3, Ljava/util/List;

    goto :goto_3

    :cond_7
    move-object v3, v2

    :goto_3
    const/4 v4, 0x0

    if-eqz v3, :cond_8

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_4

    :cond_8
    move v3, v4

    :goto_4
    iget v7, p0, Lcom/appsflyer/internal/AFe1fSDK;->AppsFlyerLib:I

    if-ge v3, v7, :cond_b

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->v:Lcom/appsflyer/internal/AFa1oSDK;

    iget-object v3, v3, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v9, "Waiting for referrers..."

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->getLevel:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-object v3, v0, Lcom/appsflyer/internal/AFh1xSDK;->v:[J

    aget-wide v10, v3, v4

    cmp-long v3, v10, v5

    if-eqz v3, :cond_9

    iget-object v0, v0, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    const-string v3, "rfr_wait"

    sub-long/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_9
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "Metrics: ddlEnd[0] ts is missing"

    invoke-virtual {v7, v0, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    :goto_5
    iget v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->values:I

    iget v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->AppsFlyerLib:I

    if-ne v0, v3, :cond_a

    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    invoke-direct {v0, v2, v2}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    iget-object v4, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    iget-wide v4, v4, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    invoke-virtual {v3, v0, v4, v5}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    invoke-virtual {v3, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    return-object v0

    :cond_a
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->registerClient()Lcom/appsflyer/internal/AFd1cSDK;

    move-result-object v0

    return-object v0

    :cond_b
    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    invoke-direct {v0, v2, v2}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    iget-object v4, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    iget-wide v4, v4, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    invoke-virtual {v3, v0, v4, v5}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    invoke-virtual {v3, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/InterruptedException;

    if-nez v4, :cond_e

    instance-of v4, v3, Ljava/io/InterruptedIOException;

    if-eqz v4, :cond_c

    goto :goto_7

    :cond_c
    instance-of v3, v3, Ljava/io/IOException;

    if-eqz v3, :cond_d

    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v6, "Http Exception: the request was not sent to the server"

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    sget-object v3, Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;->NETWORK:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    invoke-direct {v0, v2, v3}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    iget-wide v3, v3, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    invoke-virtual {v2, v0, v3, v4}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    invoke-virtual {v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    goto/16 :goto_8

    :cond_d
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unexpected Exception: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    sget-object v3, Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;->UNEXPECTED:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    invoke-direct {v0, v2, v3}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    iget-wide v3, v3, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    invoke-virtual {v2, v0, v3, v4}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    invoke-virtual {v2, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    goto :goto_8

    :cond_e
    :goto_7
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v6, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v6}, Ljava/util/concurrent/TimeoutException;-><init>()V

    const/16 v11, 0x60

    const/4 v12, 0x0

    const-string v5, "[DDL] Timeout"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    iget v0, p0, Lcom/appsflyer/internal/AFe1fSDK;->afWarnLog:I

    iget-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    iget-wide v5, v1, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Timeout, didn\'t manage to find deferred deeplink after "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " attempt(s) within "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " milliseconds"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLinkResult;

    sget-object v1, Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;->TIMEOUT:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    invoke-direct {v0, v2, v1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;-><init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    iget-wide v2, v2, Lcom/appsflyer/internal/AFa1qSDK;->AFKeystoreWrapper:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/appsflyer/internal/AFh1xSDK;->registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFe1fSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFa1qSDK;

    invoke-virtual {v1, v0}, Lcom/appsflyer/internal/AFa1qSDK;->d(Lcom/appsflyer/share/deeplink/DeepLinkResult;)V

    sget-object v1, Lcom/appsflyer/internal/AFd1cSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1cSDK;

    :goto_8
    return-object v1
.end method
