.class public final Lcom/appsflyer/internal/AFh1gSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public AFKeystoreWrapper:Lcom/appsflyer/internal/AFi1zSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public unregisterClient:Lcom/appsflyer/internal/AFh1cSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/appsflyer/internal/AFh1gSDK;->d(Lorg/json/JSONObject;)Lcom/appsflyer/internal/AFh1cSDK;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1cSDK;

    invoke-static {p1}, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient(Lorg/json/JSONObject;)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFh1gSDK;->d:Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    invoke-static {p1}, Lcom/appsflyer/internal/AFh1gSDK;->registerClient(Lorg/json/JSONObject;)Lcom/appsflyer/internal/AFi1zSDK;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFh1gSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFi1zSDK;

    return-void
.end method

.method private static d(Lorg/json/JSONObject;)Lcom/appsflyer/internal/AFh1cSDK;
    .locals 11

    const-string v0, ""

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    const-string v2, "r_debugger"

    invoke-static {p0, v2}, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v2, "ttl"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    const-string v2, "counter"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    const-string v2, "app_ver"

    invoke-virtual {p0, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v2, "sdk_ver"

    invoke-virtual {p0, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v0, "ratio"

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p0, v0, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v2

    double-to-float v6, v2

    const-string v0, "tags"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-eqz p0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_4

    :cond_0
    :goto_1
    move-object v7, v0

    goto :goto_2

    :cond_1
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :goto_2
    new-instance v3, Lcom/appsflyer/internal/AFh1cSDK;

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct/range {v3 .. v10}, Lcom/appsflyer/internal/AFh1cSDK;-><init>(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    move-object v3, v1

    :goto_3
    invoke-static {v3}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :goto_4
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {p0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_5
    invoke-static {p0}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_6

    :cond_3
    move-object v1, p0

    :goto_6
    check-cast v1, Lcom/appsflyer/internal/AFh1cSDK;

    return-object v1
.end method

.method private static registerClient(Lorg/json/JSONObject;)Lcom/appsflyer/internal/AFi1zSDK;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Ljt/n;->b:Ljt/n$a;

    const-string v1, "meta_data"

    invoke-static {p0, v1}, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "send_rate"

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p0, v1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v1

    new-instance p0, Lcom/appsflyer/internal/AFi1zSDK;

    invoke-direct {p0, v1, v2}, Lcom/appsflyer/internal/AFi1zSDK;-><init>(D)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    move-object p0, v0

    :goto_0
    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {p0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_2
    invoke-static {p0}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    :cond_1
    move-object v0, p0

    :goto_3
    check-cast v0, Lcom/appsflyer/internal/AFi1zSDK;

    return-object v0
.end method

.method private static unregisterClient(Lorg/json/JSONObject;)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
    .locals 8

    const/4 v1, 0x0

    .line 1
    :try_start_0
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    .line 2
    const-string v0, "exc_mngr"

    invoke-static {p0, v0}, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 3
    const-string v0, "sdk_ver"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 4
    const-string v0, "min"

    const/4 v2, -0x1

    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    .line 5
    const-string v0, "expire"

    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 6
    const-string v0, "ttl"

    const-wide/16 v6, -0x1

    invoke-virtual {p0, v0, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v6

    .line 7
    new-instance v2, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct/range {v2 .. v7}, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;-><init>(Ljava/lang/String;IIJ)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_0
    move-object v2, v1

    .line 8
    :goto_0
    invoke-static {v2}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {p0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 9
    :goto_2
    invoke-static {p0}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    move-object v1, p0

    :goto_3
    check-cast v1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    return-object v1
.end method

.method private static unregisterClient(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    .line 10
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object p0

    .line 13
    const-string p1, "data"

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 14
    const-string p1, "v1"

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lcom/appsflyer/internal/AFh1gSDK;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, ""

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/appsflyer/internal/AFh1gSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFh1gSDK;->d:Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    iget-object v3, p1, Lcom/appsflyer/internal/AFh1gSDK;->d:Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1gSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFi1zSDK;

    iget-object v3, p1, Lcom/appsflyer/internal/AFh1gSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFi1zSDK;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1cSDK;

    iget-object p1, p1, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1cSDK;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFh1gSDK;->d:Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/appsflyer/internal/AFh1gSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFi1zSDK;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1cSDK;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method
