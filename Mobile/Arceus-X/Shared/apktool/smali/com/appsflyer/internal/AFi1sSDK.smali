.class public final Lcom/appsflyer/internal/AFi1sSDK;
.super Lcom/appsflyer/internal/AFi1ySDK;
.source "SourceFile"


# instance fields
.field private AFKeystoreWrapper:Landroid/net/Network;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private AFLogger:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 10
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFi1ySDK;-><init>(Landroid/content/Context;)V

    const-string p1, "unknown"

    iput-object p1, p0, Lcom/appsflyer/internal/AFi1sSDK;->AFLogger:Ljava/lang/String;

    new-instance p1, Lcom/appsflyer/internal/AFi1sSDK$AFa1ySDK;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/AFi1sSDK$AFa1ySDK;-><init>(Lcom/appsflyer/internal/AFi1sSDK;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->E_()Landroid/net/ConnectivityManager;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v3, p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v8, 0x60

    const/4 v9, 0x0

    const-string v2, "Error at attempt to register network callback with ConnectivityManager"

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void
.end method

.method public static final synthetic M_(Lcom/appsflyer/internal/AFi1sSDK;Landroid/net/Network;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFi1sSDK;->AFKeystoreWrapper:Landroid/net/Network;

    return-void
.end method

.method public static final synthetic d(Lcom/appsflyer/internal/AFi1sSDK;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFi1sSDK;->AFLogger:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final AFLogger()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1sSDK;->K_()Landroid/net/Network;

    move-result-object v0

    const-string v1, "unknown"

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->E_()Landroid/net/ConnectivityManager;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "WIFI"

    return-object v0

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "MOBILE"

    return-object v0

    :cond_2
    return-object v1
.end method

.method public final K_()Landroid/net/Network;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->E_()Landroid/net/ConnectivityManager;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1sSDK;->AFKeystoreWrapper:Landroid/net/Network;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/appsflyer/internal/AFi1sSDK;->AFLogger:Ljava/lang/String;

    const-string v3, "NetworkLost"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return-object v0

    :cond_2
    return-object v1
.end method

.method public final L_()Landroid/net/NetworkCapabilities;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1sSDK;->K_()Landroid/net/Network;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->E_()Landroid/net/ConnectivityManager;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1
.end method

.method public final registerClient()Z
    .locals 3

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1sSDK;->K_()Landroid/net/Network;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->E_()Landroid/net/ConnectivityManager;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0xf

    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method
