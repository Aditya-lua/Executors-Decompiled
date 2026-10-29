.class public final Lcom/appsflyer/internal/AFg1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFf1aSDK;


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFLoggerLogLevel:I = -0x6899909c

.field private static AppsFlyerLib:I = 0x0

.field private static afDebugLog:[B = null

.field private static afErrorLog:I = -0x7e519483

.field private static afInfoLog:I = -0x37610d92

.field private static afWarnLog:[S = null

.field private static getLevel:I = 0x1


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AFLogger:Lcom/appsflyer/internal/AFc1iSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final d:Lcom/appsflyer/internal/AFa1aSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final e:Lcom/appsflyer/internal/AFf1fSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final force:Ljava/util/concurrent/ScheduledExecutorService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final i:Lcom/appsflyer/internal/AFg1rSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final registerClient:Lcom/appsflyer/internal/AFc1eSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final unregisterClient:Lcom/appsflyer/internal/AFi1aSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final v:Lcom/appsflyer/AppsFlyerProperties;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final w:Lcom/appsflyer/internal/AFd1zSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/appsflyer/internal/AFg1tSDK;->afDebugLog:[B

    return-void

    :array_0
    .array-data 1
        0x72t
        0x7dt
        -0x64t
        0x70t
        0x7ft
        -0x77t
        0x75t
        -0x7ct
        0x64t
        -0x78t
        0x74t
        0x71t
    .end array-data
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFa1aSDK;Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFg1rSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/AppsFlyerProperties;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFc1bSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFa1aSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/appsflyer/internal/AFi1aSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/appsflyer/internal/AFc1iSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/appsflyer/internal/AFc1eSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/appsflyer/internal/AFd1zSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/appsflyer/internal/AFg1rSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/appsflyer/internal/AFf1fSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/appsflyer/AppsFlyerProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFg1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFg1tSDK;->d:Lcom/appsflyer/internal/AFa1aSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/AFg1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFi1aSDK;

    iput-object p4, p0, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    iput-object p5, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    iput-object p6, p0, Lcom/appsflyer/internal/AFg1tSDK;->w:Lcom/appsflyer/internal/AFd1zSDK;

    iput-object p7, p0, Lcom/appsflyer/internal/AFg1tSDK;->i:Lcom/appsflyer/internal/AFg1rSDK;

    iput-object p8, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    iput-object p9, p0, Lcom/appsflyer/internal/AFg1tSDK;->v:Lcom/appsflyer/AppsFlyerProperties;

    iput-object p10, p0, Lcom/appsflyer/internal/AFg1tSDK;->force:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method private AFKeystoreWrapper()Z
    .locals 13

    .line 23
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x2b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 25
    iget-wide v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->getInstance:J

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 27
    iget-wide v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->getInstance:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 28
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 29
    iget-object v2, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 30
    iget-wide v2, v2, Lcom/appsflyer/internal/AFc1eSDK;->getInstance:J

    sub-long/2addr v0, v2

    .line 31
    new-instance v2, Ljava/text/SimpleDateFormat;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "yyyy/MM/dd HH:mm:ss.SSS Z"

    invoke-direct {v2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 32
    iget-object v4, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 33
    iget-wide v4, v4, Lcom/appsflyer/internal/AFc1eSDK;->getInstance:J

    .line 34
    const-string v6, "UTC"

    invoke-static {v6}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 35
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 36
    iget-object v5, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 37
    iget-wide v7, v5, Lcom/appsflyer/internal/AFc1eSDK;->onPause:J

    .line 38
    invoke-static {v6}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 39
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, v7, v8}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    .line 40
    iget-object v5, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 41
    iget-wide v5, v5, Lcom/appsflyer/internal/AFc1eSDK;->setDebugLog:J

    cmp-long v5, v0, v5

    .line 42
    const-string v6, ""

    if-gez v5, :cond_2

    .line 43
    sget v5, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v5, v5, 0x53

    rem-int/lit16 v7, v5, 0x80

    sput v7, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    rem-int/lit8 v5, v5, 0x2

    if-nez v5, :cond_1

    .line 44
    iget-object v5, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v5}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v5

    if-nez v5, :cond_2

    .line 45
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 46
    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 47
    sget-object v5, Lkotlin/jvm/internal/g0;->a:Lkotlin/jvm/internal/g0;

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 49
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 50
    iget-wide v9, v1, Lcom/appsflyer/internal/AFc1eSDK;->setDebugLog:J

    .line 51
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v4, v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x4

    .line 52
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms"

    invoke-static {v3, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    .line 53
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    const/4 v0, 0x1

    return v0

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    const/4 v0, 0x0

    throw v0

    .line 55
    :cond_2
    iget-object v5, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v5}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v5

    if-nez v5, :cond_4

    .line 56
    sget v5, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v5, v5, 0x3b

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 57
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 58
    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 59
    sget-object v5, Lkotlin/jvm/internal/g0;->a:Lkotlin/jvm/internal/g0;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v4, v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)"

    invoke-static {v3, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    .line 60
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 61
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    goto :goto_1

    .line 62
    :cond_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v0

    if-nez v0, :cond_4

    .line 63
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 64
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    .line 65
    const-string v3, "Sending first launch for this session!"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_4
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1pSDK;)Z
    .locals 10
    .param p1    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 3
    :cond_0
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 4
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x3d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 5
    iget-object v2, p1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    if-nez v2, :cond_5

    add-int/lit8 v0, v0, 0x63

    .line 6
    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 7
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    const-string v2, "AF_LAUNCH_PROTECT_ENABLED"

    .line 8
    invoke-virtual {v0, v2}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-eqz v0, :cond_3

    .line 10
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1tSDK;->AFKeystoreWrapper()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    iget-object p1, p1, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

    if-eqz p1, :cond_2

    const/16 v0, 0xa

    .line 12
    const-string v1, "Event timeout. Check \'minTimeBetweenSessions\' param"

    invoke-interface {p1, v0, v1}, Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;->onError(ILjava/lang/String;)V

    .line 13
    sget p1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 p1, p1, 0x27

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    :cond_2
    return v2

    .line 14
    :cond_3
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 15
    iget-wide v2, v0, Lcom/appsflyer/internal/AFc1eSDK;->setDebugLog:J

    .line 16
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v2

    .line 17
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 18
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 19
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Allowing multiple launches within a "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " second time window."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 20
    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 21
    :cond_4
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 22
    iput-wide v2, p1, Lcom/appsflyer/internal/AFc1eSDK;->getInstance:J

    :cond_5
    return v1
.end method

.method public static synthetic AFLogger([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 0

    .line 26
    invoke-static {p0}, Lcom/appsflyer/internal/AFg1tSDK;->registerClient([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final AFLogger(Lcom/appsflyer/internal/AFg1tSDK;Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V
    .locals 2

    .line 27
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x6b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    rem-int/lit8 v0, v0, 0x2

    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFg1tSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V

    if-eqz v0, :cond_0

    const/16 p0, 0x1c

    div-int/lit8 p0, p0, 0x0

    :cond_0
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x45

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    return-void
.end method

.method private AFLogger(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 22
    .param p1    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v3, Lcom/appsflyer/internal/AFa1pSDK;

    .line 3
    iget-object v4, v0, Lcom/appsflyer/internal/AFg1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 4
    iget-object v5, v0, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 5
    iget-object v5, v5, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v6, "appsFlyerCount"

    const/4 v7, 0x0

    invoke-interface {v5, v6, v7}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v5

    .line 6
    invoke-virtual {v1, v5}, Lcom/appsflyer/internal/AFh1pSDK;->unregisterClient(I)Lcom/appsflyer/internal/AFh1pSDK;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v2, v0, Lcom/appsflyer/internal/AFg1tSDK;->d:Lcom/appsflyer/internal/AFa1aSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFa1aSDK;->d()Ljava/util/Map;

    move-result-object v2

    .line 8
    invoke-direct {v3, v4, v5, v2}, Lcom/appsflyer/internal/AFa1pSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFh1pSDK;Ljava/util/Map;)V

    .line 9
    iget-object v2, v1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    const-wide/16 v4, 0x0

    if-nez v2, :cond_5

    iget-object v1, v1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 10
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFi1aSDK;

    .line 11
    iget-object v1, v1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-array v2, v7, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 12
    array-length v2, v1

    :goto_0
    const-wide/16 v8, 0x1f4

    if-ge v7, v2, :cond_1

    .line 13
    sget v6, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v6, v6, 0x71

    rem-int/lit16 v6, v6, 0x80

    sput v6, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 14
    aget-object v6, v1, v7

    .line 15
    invoke-virtual {v6}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    move-result-object v10

    sget-object v11, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    if-ne v10, v11, :cond_0

    .line 16
    sget v4, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v4, v4, 0x5f

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 17
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v6}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getSource()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Failed to get "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " referrer, wait ..."

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    move-wide v4, v8

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 18
    :cond_1
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->d:Lcom/appsflyer/internal/AFa1aSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFa1aSDK;->registerClient()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 19
    sget v1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v1, v1, 0xf

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_2

    .line 20
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v12, "fetching Facebook deferred AppLink data, wait ..."

    const/4 v13, 0x1

    invoke-static/range {v10 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    :goto_1
    move-wide v4, v8

    goto :goto_2

    :cond_2
    sget-object v16, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v17, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v20, 0x4

    const/16 v21, 0x0

    const-string v18, "fetching Facebook deferred AppLink data, wait ..."

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_1

    .line 21
    :cond_3
    :goto_2
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFf1fSDK;->d()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 22
    sget v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v1, v1, 0x5

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_4

    move-wide v4, v8

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    .line 23
    throw v1

    :cond_5
    :goto_3
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->force:Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    invoke-static {v1, v3, v4, v5, v2}, Lcom/appsflyer/internal/AFj1iSDK;->AFLogger(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method private static a(ISBII[Ljava/lang/Object;)V
    .locals 12

    .line 2
    new-instance v0, Lcom/appsflyer/internal/AFk1rSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1rSDK;-><init>()V

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    sget v2, Lcom/appsflyer/internal/AFg1tSDK;->afErrorLog:I

    int-to-long v2, v2

    const-wide v4, -0x5f1571567e51948fL

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr p0, v2

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v6, 0x1

    if-ne p0, v2, :cond_0

    .line 5
    sget v2, Lcom/appsflyer/internal/AFg1tSDK;->$10:I

    add-int/lit8 v2, v2, 0x15

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1tSDK;->$11:I

    move v2, v6

    goto :goto_0

    :cond_0
    sget v2, Lcom/appsflyer/internal/AFg1tSDK;->$11:I

    add-int/lit8 v2, v2, 0x17

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1tSDK;->$10:I

    move v2, v3

    :goto_0
    if-eqz v2, :cond_5

    .line 6
    sget-object p0, Lcom/appsflyer/internal/AFg1tSDK;->afDebugLog:[B

    if-eqz p0, :cond_3

    array-length v7, p0

    new-array v8, v7, [B

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_2

    .line 7
    sget v10, Lcom/appsflyer/internal/AFg1tSDK;->$11:I

    add-int/lit8 v10, v10, 0x5d

    rem-int/lit16 v11, v10, 0x80

    sput v11, Lcom/appsflyer/internal/AFg1tSDK;->$10:I

    rem-int/lit8 v10, v10, 0x2

    if-eqz v10, :cond_1

    aget-byte v10, p0, v9

    int-to-long v10, v10

    mul-long/2addr v10, v4

    long-to-int v10, v10

    int-to-byte v10, v10

    aput-byte v10, v8, v9

    goto :goto_1

    .line 8
    :cond_1
    aget-byte v10, p0, v9

    int-to-long v10, v10

    xor-long/2addr v10, v4

    long-to-int v10, v10

    int-to-byte v10, v10

    aput-byte v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    move-object p0, v8

    :cond_3
    if-eqz p0, :cond_4

    .line 9
    sget-object p0, Lcom/appsflyer/internal/AFg1tSDK;->afDebugLog:[B

    sget v7, Lcom/appsflyer/internal/AFg1tSDK;->afInfoLog:I

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    add-int v7, p4, v7

    aget-byte p0, p0, v7

    int-to-long v7, p0

    xor-long/2addr v7, v4

    long-to-int p0, v7

    int-to-byte p0, p0

    sget v7, Lcom/appsflyer/internal/AFg1tSDK;->afErrorLog:I

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    add-int/2addr p0, v7

    int-to-byte p0, p0

    goto :goto_2

    .line 10
    :cond_4
    sget-object p0, Lcom/appsflyer/internal/AFg1tSDK;->afWarnLog:[S

    sget v7, Lcom/appsflyer/internal/AFg1tSDK;->afInfoLog:I

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    add-int v7, p4, v7

    aget-short p0, p0, v7

    int-to-long v7, p0

    xor-long/2addr v7, v4

    long-to-int p0, v7

    int-to-short p0, p0

    sget v7, Lcom/appsflyer/internal/AFg1tSDK;->afErrorLog:I

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    add-int/2addr p0, v7

    int-to-short p0, p0

    :cond_5
    :goto_2
    if-lez p0, :cond_a

    add-int v7, p4, p0

    add-int/lit8 v7, v7, -0x2

    .line 11
    sget v8, Lcom/appsflyer/internal/AFg1tSDK;->afInfoLog:I

    int-to-long v8, v8

    xor-long/2addr v8, v4

    long-to-int v8, v8

    add-int/2addr v7, v8

    add-int/2addr v7, v2

    .line 12
    iput v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    .line 13
    sget v2, Lcom/appsflyer/internal/AFg1tSDK;->AFLoggerLogLevel:I

    int-to-long v7, v2

    xor-long/2addr v7, v4

    long-to-int v2, v7

    add-int/2addr v2, p3

    int-to-char v2, v2

    iput-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    iget-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    iput-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    .line 16
    sget-object v2, Lcom/appsflyer/internal/AFg1tSDK;->afDebugLog:[B

    if-eqz v2, :cond_7

    array-length v7, v2

    new-array v8, v7, [B

    .line 17
    sget v9, Lcom/appsflyer/internal/AFg1tSDK;->$10:I

    add-int/lit8 v9, v9, 0x7

    rem-int/lit16 v9, v9, 0x80

    sput v9, Lcom/appsflyer/internal/AFg1tSDK;->$11:I

    move v9, v3

    :goto_3
    if-ge v9, v7, :cond_6

    .line 18
    aget-byte v10, v2, v9

    int-to-long v10, v10

    xor-long/2addr v10, v4

    long-to-int v10, v10

    int-to-byte v10, v10

    aput-byte v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_6
    move-object v2, v8

    :cond_7
    if-eqz v2, :cond_8

    .line 19
    sget v2, Lcom/appsflyer/internal/AFg1tSDK;->$10:I

    add-int/lit8 v2, v2, 0x25

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1tSDK;->$11:I

    move v2, v6

    goto :goto_4

    :cond_8
    move v2, v3

    .line 20
    :goto_4
    iput v6, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    :goto_5
    iget v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    if-ge v7, p0, :cond_a

    if-eqz v2, :cond_9

    .line 21
    sget-object v7, Lcom/appsflyer/internal/AFg1tSDK;->afDebugLog:[B

    iget v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    add-int/lit8 v9, v8, -0x1

    iput v9, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    aget-byte v7, v7, v8

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    int-to-byte v7, v7

    .line 22
    iget-char v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    add-int/2addr v7, p1

    int-to-byte v7, v7

    xor-int/2addr v7, p2

    add-int/2addr v8, v7

    int-to-char v7, v8

    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    goto :goto_6

    .line 23
    :cond_9
    sget-object v7, Lcom/appsflyer/internal/AFg1tSDK;->afWarnLog:[S

    iget v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    add-int/lit8 v9, v8, -0x1

    iput v9, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    aget-short v7, v7, v8

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    int-to-short v7, v7

    .line 24
    iget-char v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    add-int/2addr v7, p1

    int-to-short v7, v7

    xor-int/2addr v7, p2

    add-int/2addr v8, v7

    int-to-char v7, v8

    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 25
    :goto_6
    iget-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    iget-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    .line 27
    iget v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    add-int/2addr v7, v6

    iput v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    goto :goto_5

    .line 28
    :cond_a
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    aput-object p0, p5, v3

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFg1tSDK;Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger(Lcom/appsflyer/internal/AFg1tSDK;Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V

    return-void
.end method

.method private d(Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V
    .locals 5
    .param p1    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 20
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x2d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 21
    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->v:Lcom/appsflyer/AppsFlyerProperties;

    invoke-interface {v0}, Lcom/appsflyer/AppsFlyerProperties;->saveProperties()V

    .line 23
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v0

    if-nez v0, :cond_0

    .line 24
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendTrackingWith with context: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 25
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x45

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 26
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/appsflyer/internal/AFg1tSDK;->unregisterClient(Landroid/content/Context;Lcom/appsflyer/internal/AFh1pSDK;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/util/Map;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 27
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x47ce6783

    const v2, -0x47ce6783

    invoke-static {p2, v1, v2, v0}, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 28
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 29
    sget p1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 p1, p1, 0x3d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    return-void
.end method

.method private static synthetic registerClient([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    const/4 v0, 0x0

    aget-object v0, p0, v0

    check-cast v0, Lcom/appsflyer/internal/AFg1tSDK;

    const/4 v1, 0x1

    aget-object p0, p0, v1

    check-cast p0, Lcom/appsflyer/internal/AFh1pSDK;

    const-string v1, ""

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    iget-boolean v1, v1, Lcom/appsflyer/internal/AFc1eSDK;->afWarnLog:Z

    const/4 v2, 0x0

    if-nez v1, :cond_2

    sget v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    const-string v1, "advertiserId"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    :try_start_0
    iget-object v0, v0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->force:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v6, p0

    goto :goto_1

    :cond_1
    :goto_0
    const-string v0, "android_id"

    invoke-interface {p0, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_2

    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x63

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    :try_start_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v5, "validateGaidAndAndroidId :: removing: android_id"

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v2

    :goto_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v11, 0x78

    const/4 v12, 0x0

    const-string v5, "failed to remove AndroidID key from params; "

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    :cond_2
    :goto_2
    return-object v2
.end method

.method private unregisterClient(Landroid/content/Context;Lcom/appsflyer/internal/AFh1pSDK;)Ljava/util/Map;
    .locals 20
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/appsflyer/internal/AFh1pSDK;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    .line 1
    const-string v2, "appsFlyerInAppEventCount"

    const-string v3, "appsFlyerCount"

    .line 2
    const-string v4, ""

    move-object/from16 v5, p1

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v6, v0, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-nez v6, :cond_0

    iget-object v6, v0, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    if-nez v6, :cond_0

    move v6, v7

    goto :goto_0

    :cond_0
    move v6, v8

    .line 4
    :goto_0
    iget-object v9, v0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 5
    new-instance v10, Ljava/util/Date;

    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    .line 6
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v4}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v12

    invoke-static {v8}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v13

    int-to-short v13, v13

    invoke-static {v8, v8}, Landroid/view/View;->resolveSize(II)I

    move-result v14

    int-to-byte v14, v14

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v15

    shr-int/lit8 v15, v15, 0x10

    const v16, -0x16c803b4

    sub-int v15, v16, v15

    const v16, -0x4930991f

    invoke-static {v4, v4, v8, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v4

    sub-int v16, v16, v4

    new-array v4, v7, [Ljava/lang/Object;

    move-object/from16 v17, v4

    invoke-static/range {v12 .. v17}, Lcom/appsflyer/internal/AFg1tSDK;->a(ISBII[Ljava/lang/Object;)V

    aget-object v4, v17, v8

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v4, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    :try_start_0
    iget-object v4, v1, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v4}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 8
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v10, "AppsFlyer SDK Reporting has been stopped"

    invoke-virtual {v0, v4, v10, v7}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v13, v0

    goto :goto_3

    :cond_1
    if-eqz v6, :cond_2

    .line 9
    const-string v0, "Launch"

    goto :goto_1

    .line 10
    :cond_2
    iget-object v0, v0, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    sget v4, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v4, v4, 0x9

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 12
    :goto_1
    :try_start_1
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "******* sendTrackingWithEvent: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v10, v0, v7}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 13
    :goto_2
    invoke-static {v5}, Lcom/appsflyer/internal/AFg1tSDK;->unregisterClient(Landroid/content/Context;)V

    .line 14
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 15
    iget-object v4, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {v4, v3, v8}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v4

    if-eqz v6, :cond_3

    add-int/lit8 v4, v4, 0x1

    .line 16
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {v0, v3, v4}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;I)V

    .line 17
    :cond_3
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 18
    iget-object v3, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {v3, v2, v8}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v3

    if-nez v6, :cond_4

    add-int/lit8 v3, v3, 0x1

    .line 19
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {v0, v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x6d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 21
    :cond_4
    :try_start_2
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1tSDK;->i:Lcom/appsflyer/internal/AFg1rSDK;

    invoke-interface {v0, v9, v4, v3}, Lcom/appsflyer/internal/AFg1rSDK;->unregisterClient(Ljava/util/Map;II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    .line 22
    :goto_3
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v18, 0x40

    const/16 v19, 0x0

    const-string v12, "Error while preparing to send event"

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/16 v16, 0x1

    const/16 v17, 0x0

    invoke-static/range {v10 .. v19}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 23
    :goto_4
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x5f

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_5

    const/16 v0, 0x4a

    div-int/2addr v0, v8

    :cond_5
    return-object v9
.end method

.method private static unregisterClient(Landroid/content/Context;)V
    .locals 10

    .line 24
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    .line 25
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x6032

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 26
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz p0, :cond_1

    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x1000

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 28
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz p0, :cond_1

    :goto_0
    invoke-static {p0}, Lkotlin/collections/m;->j0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    if-nez p0, :cond_2

    .line 29
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x11

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 30
    :try_start_1
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object p0

    .line 31
    :cond_2
    const-string v0, "android.permission.INTERNET"

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 32
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 33
    :cond_3
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-nez v0, :cond_5

    .line 34
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x1f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_4

    .line 35
    :try_start_2
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v4, 0x1

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_2

    :cond_4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 36
    :cond_5
    :goto_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-le v0, v1, :cond_6

    const-string v0, "com.google.android.gms.permission.AD_ID"

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    .line 37
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml"

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 38
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x1b

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_6

    const/16 p0, 0x59

    div-int/lit8 p0, p0, 0x0

    :cond_6
    return-void

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 39
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v8, 0x78

    const/4 v9, 0x0

    const-string v2, "Exception while validation permissions. "

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method private unregisterClient(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 3
    .param p1    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 40
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x47ce6783

    const v2, -0x47ce6783

    invoke-static {p1, v1, v2, v0}, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 6
    .param p1    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFg1tSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1pSDK;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 3
    sget p1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 p1, p1, 0x61

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 4
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 5
    iget-wide v2, v0, Lcom/appsflyer/internal/AFc1eSDK;->setDebugLog:J

    .line 6
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v2

    .line 7
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Blocking multiple consecutive Launch events within "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " seconds time window"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v2, v1}, Lcom/appsflyer/AFLogger;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->w:Lcom/appsflyer/internal/AFd1zSDK;

    .line 9
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-nez v0, :cond_2

    .line 10
    sget p1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 p1, p1, 0x3b

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    rem-int/lit8 p1, p1, 0x2

    const-string v0, "sendWithEvent - got null context. skipping event/launch."

    if-nez p1, :cond_1

    .line 11
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ATTRIBUTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v0, v2}, Lcom/appsflyer/AFLogger;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    return-void

    :cond_1
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ATTRIBUTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p1, v2, v0, v1}, Lcom/appsflyer/AFLogger;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    return-void

    .line 12
    :cond_2
    iget-object v2, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    const v4, -0x62ff1f55

    const v5, 0x62ff1f57

    invoke-static {v3, v4, v5, v2}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    .line 13
    :cond_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1tSDK;->force:Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    new-instance v2, Lcom/appsflyer/internal/s0;

    invoke-direct {v2, p0, p1, v0}, Lcom/appsflyer/internal/s0;-><init>(Lcom/appsflyer/internal/AFg1tSDK;Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V

    invoke-static {v1, v2}, Lcom/appsflyer/internal/AFj1iSDK;->AFKeystoreWrapper(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;)V

    return-void

    .line 15
    :cond_4
    :goto_0
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x3d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x6f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 16
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "AppsFlyer dev key is missing! AppsFlyer\'s SDK cannot send any events without providing the dev key."

    invoke-virtual {v0, v2, v3, v1}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 17
    const-string v3, "AppsFlyer will not track this event."

    invoke-virtual {v0, v2, v3, v1}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 18
    iget-object p1, p1, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

    if-eqz p1, :cond_5

    const/16 v0, 0x29

    .line 19
    const-string v1, "No dev key"

    invoke-interface {p1, v0, v1}, Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;->onError(ILjava/lang/String;)V

    :cond_5
    return-void
.end method
