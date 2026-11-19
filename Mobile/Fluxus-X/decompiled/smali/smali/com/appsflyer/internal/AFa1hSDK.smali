.class public final Lcom/appsflyer/internal/AFa1hSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFa1lSDK;


# instance fields
.field private final d:Lcom/appsflyer/internal/AFc1kSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1kSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFc1kSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFa1hSDK;->d:Lcom/appsflyer/internal/AFc1kSDK;

    return-void
.end method


# virtual methods
.method public final d(Ljava/util/Map;)V
    .locals 2
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1hSDK;->d:Lcom/appsflyer/internal/AFc1kSDK;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "deeplink_data"

    invoke-interface {v0, v1, p1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final registerClient()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1hSDK;->d:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "deeplink_data"

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;)V

    return-void
.end method

.method public final unregisterClient()Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFa1hSDK;->d:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "deeplink_data"

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1hSDK;->d:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/k0;->j()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    move-object v4, v0

    goto :goto_0

    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/appsflyer/sdk_base/util/JsonUtils;->toMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :goto_0
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v9, 0x48

    const/4 v10, 0x0

    const-string v3, "Exception while parsing stored deeplink data"

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    :cond_1
    invoke-static {}, Lkotlin/collections/k0;->j()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
