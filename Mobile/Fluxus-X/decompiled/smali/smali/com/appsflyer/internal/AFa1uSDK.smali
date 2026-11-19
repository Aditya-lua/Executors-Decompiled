.class public final Lcom/appsflyer/internal/AFa1uSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u000f"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFa1uSDK;",
        "",
        "<init>",
        "()V",
        "Lcom/appsflyer/internal/AFd1zSDK;",
        "p0",
        "Lcom/appsflyer/internal/AFc1iSDK;",
        "p1",
        "Lcom/appsflyer/AppsFlyerProperties;",
        "p2",
        "",
        "unregisterClient",
        "(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/AppsFlyerProperties;)V",
        "",
        "registerClient",
        "(Lcom/appsflyer/AppsFlyerProperties;)Ljava/lang/String;",
        "AFLogger"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/appsflyer/internal/AFa1uSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/appsflyer/internal/AFa1uSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFa1uSDK;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFa1uSDK;->INSTANCE:Lcom/appsflyer/internal/AFa1uSDK;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AFLogger(Lcom/appsflyer/AppsFlyerProperties;)Ljava/lang/String;
    .locals 1
    .param p0    # Lcom/appsflyer/AppsFlyerProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "KSAppsFlyerRICounter"

    invoke-interface {p0, v0}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static registerClient(Lcom/appsflyer/AppsFlyerProperties;)Ljava/lang/String;
    .locals 1
    .param p0    # Lcom/appsflyer/AppsFlyerProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "KSAppsFlyerId"

    invoke-interface {p0, v0}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final unregisterClient(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/AppsFlyerProperties;)V
    .locals 9
    .param p0    # Lcom/appsflyer/internal/AFd1zSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/appsflyer/internal/AFc1iSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/AppsFlyerProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v1, "OPPO"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->ATTRIBUTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "OPPO device found"

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_0
    const-string v0, "AF_DISABLE_KEYSTORE"

    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-nez v0, :cond_4

    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->ATTRIBUTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "OS SDK is="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; use KeyStore"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    new-instance v2, Lcom/appsflyer/AFKeystoreWrapper;

    iget-object p0, p0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    invoke-direct {v2, p0}, Lcom/appsflyer/AFKeystoreWrapper;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lcom/appsflyer/AFKeystoreWrapper;->d()Z

    move-result p0

    if-nez p0, :cond_2

    iget-object p0, p1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {p0}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v2, Lcom/appsflyer/AFKeystoreWrapper;->d:Ljava/lang/String;

    const/4 p0, 0x0

    iput p0, v2, Lcom/appsflyer/AFKeystoreWrapper;->unregisterClient:I

    invoke-virtual {v2}, Lcom/appsflyer/AFKeystoreWrapper;->AFKeystoreWrapper()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lcom/appsflyer/AFKeystoreWrapper;->AFKeystoreWrapper(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    invoke-virtual {v2}, Lcom/appsflyer/AFKeystoreWrapper;->AFKeystoreWrapper()Ljava/lang/String;

    move-result-object p0

    iget-object p1, v2, Lcom/appsflyer/AFKeystoreWrapper;->AFLogger:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget v0, v2, Lcom/appsflyer/AFKeystoreWrapper;->unregisterClient:I

    add-int/2addr v0, v1

    iput v0, v2, Lcom/appsflyer/AFKeystoreWrapper;->unregisterClient:I

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "Deleting key with alias: "

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, v2, Lcom/appsflyer/AFKeystoreWrapper;->AFLogger:Ljava/lang/Object;

    monitor-enter v1
    :try_end_1
    .catch Ljava/security/KeyStoreException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, v2, Lcom/appsflyer/AFKeystoreWrapper;->registerClient:Ljava/security/KeyStore;

    invoke-virtual {v0, p0}, Ljava/security/KeyStore;->deleteEntry(Ljava/lang/String;)V

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p0, v0

    :try_start_3
    monitor-exit v1

    throw p0
    :try_end_3
    .catch Ljava/security/KeyStoreException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    move-object p0, v0

    goto :goto_4

    :catch_0
    move-exception v0

    move-object p0, v0

    :try_start_4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Exception occurred while deleting key: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_3
    const-string v4, "unknown error"

    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-virtual {v2}, Lcom/appsflyer/AFKeystoreWrapper;->AFKeystoreWrapper()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lcom/appsflyer/AFKeystoreWrapper;->AFKeystoreWrapper(Ljava/lang/String;)V

    :goto_3
    const-string p0, "KSAppsFlyerId"

    invoke-virtual {v2}, Lcom/appsflyer/AFKeystoreWrapper;->AFLogger()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p0, p1}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "KSAppsFlyerRICounter"

    invoke-virtual {v2}, Lcom/appsflyer/AFKeystoreWrapper;->registerClient()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p0, p1}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :goto_4
    monitor-exit p1

    throw p0

    :cond_4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ATTRIBUTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "OS SDK is="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; no KeyStore usage"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void
.end method
