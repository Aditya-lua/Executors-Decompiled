.class public final Lcom/appsflyer/internal/AFf1jSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

.field public AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

.field public d:Lcom/appsflyer/internal/AFh1aSDK;

.field public registerClient:J

.field public unregisterClient:J


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1kSDK;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/appsflyer/internal/AFf1jSDK;->d:Lcom/appsflyer/internal/AFh1aSDK;

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1jSDK;->unregisterClient()Lcom/appsflyer/internal/AFh1aSDK;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    const-string v0, "af_rc_timestamp"

    const-wide/16 v1, 0x0

    invoke-interface {p1, v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->unregisterClient(Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/appsflyer/internal/AFf1jSDK;->registerClient:J

    const-string v0, "af_rc_max_age"

    invoke-interface {p1, v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->unregisterClient(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/appsflyer/internal/AFf1jSDK;->unregisterClient:J

    return-void
.end method

.method private unregisterClient()Lcom/appsflyer/internal/AFh1aSDK;
    .locals 6

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "af_remote_config"

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "No configuration found in cache"

    invoke-virtual {v0, v2, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-object v1

    :cond_0
    :try_start_0
    new-instance v2, Ljava/lang/String;

    const/4 v3, 0x2

    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v0, Lcom/appsflyer/internal/AFh1aSDK;

    invoke-direct {v0, v2}, Lcom/appsflyer/internal/AFh1aSDK;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "Error reading malformed configuration from cache, requires fetching from remote again"

    const/4 v5, 0x1

    invoke-virtual {v2, v3, v4, v0, v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-object v1
.end method
