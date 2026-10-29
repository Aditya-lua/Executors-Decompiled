.class final Lcom/appsflyer/internal/AFf1fSDK$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFf1cSDK$AFa1zSDK;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFf1fSDK;->d(Lcom/appsflyer/internal/AFc1iSDK;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic registerClient:Lcom/appsflyer/internal/AFf1fSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFf1fSDK;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 11

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFf1fSDK;->registerClient()V

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    const-string v2, "error"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "Failed to retrieve Google LVL data: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    move-object v6, p2

    invoke-virtual/range {v3 .. v10}, Lcom/appsflyer/AFLogger;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V

    return-void
.end method

.method public final registerClient(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    const-string v1, "signedData"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    iget-object p1, p1, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    const-string v0, "signature"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK$3;->registerClient:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFf1fSDK;->registerClient()V

    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "Google License Verification Library (LVL) data retrieved successfully"

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void
.end method
