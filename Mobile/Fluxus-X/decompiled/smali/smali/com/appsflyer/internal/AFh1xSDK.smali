.class public final Lcom/appsflyer/internal/AFh1xSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

.field public final AFLogger:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public afDebugLog:J

.field public afErrorLog:J

.field public afInfoLog:J

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public e:J

.field public final force:[J

.field public i:J

.field public final registerClient:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

.field public final v:[J

.field public final w:[J


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1iSDK;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->i:J

    iput-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    const/4 v2, 0x2

    new-array v3, v2, [J

    iput-object v3, p0, Lcom/appsflyer/internal/AFh1xSDK;->force:[J

    new-array v3, v2, [J

    iput-object v3, p0, Lcom/appsflyer/internal/AFh1xSDK;->v:[J

    new-array v2, v2, [J

    iput-object v2, p0, Lcom/appsflyer/internal/AFh1xSDK;->w:[J

    iput-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->afErrorLog:J

    iput-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->afDebugLog:J

    iput-object p1, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    return-void
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 18
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 19
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {v1, p1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 20
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 21
    invoke-static {v1}, Lcom/appsflyer/internal/AFg1dSDK;->unregisterClient(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 22
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "Error while parsing cached JSON data for metrics"

    invoke-virtual {v1, v2, v3, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-object v0
.end method

.method public final AFLogger()V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 3
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "appsFlyerCount"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-wide v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->i:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    iget-wide v3, p0, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    sub-long/2addr v3, v0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "init_to_fg"

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    .line 7
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 8
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "first_launch"

    invoke-interface {v0, v2, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 9
    :cond_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Metrics collection skipped: initialization timestamp not recorded"

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final AFLogger(I)V
    .locals 6

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 11
    iget-wide v2, p0, Lcom/appsflyer/internal/AFh1xSDK;->afDebugLog:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    .line 12
    iget-object v4, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "net"

    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Metrics collection skipped: GCD start timestamp not recorded"

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 14
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    const-string v1, "retries"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    iget-object p1, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger:Ljava/util/Map;

    .line 16
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 17
    iget-object p1, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gcd"

    invoke-interface {p1, v1, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final registerClient(Lcom/appsflyer/share/deeplink/DeepLinkResult;J)V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/appsflyer/share/deeplink/DeepLinkResult;->getStatus()Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "status"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/appsflyer/internal/AFh1xSDK;->registerClient:Ljava/util/Map;

    const-string v0, "timeout_value"

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFh1uSDK;)V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFc1iSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "appsFlyerCount"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    const-string v1, "api_name"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/appsflyer/internal/AFh1xSDK;->d:Ljava/util/Map;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    iget-object p1, p0, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "first_launch"

    invoke-interface {p1, v1, v0}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
