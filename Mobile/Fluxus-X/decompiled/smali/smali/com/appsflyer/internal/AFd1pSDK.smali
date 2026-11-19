.class public final Lcom/appsflyer/internal/AFd1pSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseBody:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final AFLogger:Ljava/util/concurrent/ExecutorService;

.field private final d:Lcom/appsflyer/internal/AFd1iSDK;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/AFd1iSDK<",
            "TResponseBody;>;"
        }
    .end annotation
.end field

.field private final registerClient:Lcom/appsflyer/internal/AFd1mSDK;

.field public final unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFd1oSDK;Ljava/util/concurrent/ExecutorService;Lcom/appsflyer/internal/AFd1mSDK;Lcom/appsflyer/internal/AFd1iSDK;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFd1oSDK;",
            "Ljava/util/concurrent/ExecutorService;",
            "Lcom/appsflyer/internal/AFd1mSDK;",
            "Lcom/appsflyer/internal/AFd1iSDK<",
            "TResponseBody;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFd1pSDK;->AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/appsflyer/internal/AFd1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFd1pSDK;->AFLogger:Ljava/util/concurrent/ExecutorService;

    iput-object p3, p0, Lcom/appsflyer/internal/AFd1pSDK;->registerClient:Lcom/appsflyer/internal/AFd1mSDK;

    iput-object p4, p0, Lcom/appsflyer/internal/AFd1pSDK;->d:Lcom/appsflyer/internal/AFd1iSDK;

    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFd1fSDK;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/appsflyer/internal/AFd1fSDK<",
            "TResponseBody;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1pSDK;->AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1pSDK;->registerClient:Lcom/appsflyer/internal/AFd1mSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;

    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFd1mSDK;->registerClient(Lcom/appsflyer/internal/AFd1oSDK;)Lcom/appsflyer/internal/AFd1fSDK;

    move-result-object v1

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1pSDK;->d:Lcom/appsflyer/internal/AFd1iSDK;

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/appsflyer/internal/AFd1iSDK;->registerClient(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    new-instance v3, Lcom/appsflyer/internal/AFd1fSDK;

    iget v5, v1, Lcom/appsflyer/internal/AFd1fSDK;->unregisterClient:I

    iget-boolean v6, v1, Lcom/appsflyer/internal/AFd1fSDK;->AFLogger:Z

    iget-object v7, v1, Lcom/appsflyer/internal/AFd1fSDK;->d:Ljava/util/Map;

    iget-object v8, v1, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1nSDK;

    invoke-direct/range {v3 .. v8}, Lcom/appsflyer/internal/AFd1fSDK;-><init>(Ljava/lang/Object;IZLjava/util/Map;Lcom/appsflyer/internal/AFd1nSDK;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception v0

    move-object v5, v0

    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->HTTP_CLIENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v4, "Could not parse raw response during execute"

    invoke-virtual/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    new-instance v0, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v5, v1}, Lcom/appsflyer/internal/components/network/http/exceptions/ParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lcom/appsflyer/internal/AFd1fSDK;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Http call is already executed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
