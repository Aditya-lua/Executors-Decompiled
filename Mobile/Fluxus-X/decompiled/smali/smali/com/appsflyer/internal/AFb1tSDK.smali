.class public final Lcom/appsflyer/internal/AFb1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFa1aSDK;


# instance fields
.field private AFKeystoreWrapper:Z

.field AFLogger:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final d:Lcom/appsflyer/internal/AFd1zSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFd1zSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFb1tSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    return-void
.end method


# virtual methods
.method public final AFLogger(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFKeystoreWrapper:Z

    return-void
.end method

.method public final d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    return-object v0
.end method

.method public final registerClient()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFKeystoreWrapper:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final unregisterClient()V
    .locals 11

    const-class v0, Landroid/content/Context;

    iget-boolean v1, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFKeystoreWrapper:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFb1tSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-nez v1, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v4, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;

    invoke-direct {v4, p0, v2, v3}, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;-><init>(Lcom/appsflyer/internal/AFb1tSDK;J)V

    :try_start_0
    const-string v2, "com.facebook.FacebookSdk"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "sdkInitialize"

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "com.facebook.applinks.AppLinkData"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "com.facebook.applinks.AppLinkData$CompletionHandler"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-string v6, "fetchDeferredAppLinkData"

    const-class v7, Ljava/lang/String;

    filled-new-array {v0, v7, v3}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-instance v6, Lcom/appsflyer/internal/AFa1cSDK$5;

    invoke-direct {v6, v2, v4}, Lcom/appsflyer/internal/AFa1cSDK$5;-><init>(Ljava/lang/Class;Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;)V

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-static {v2, v3, v6}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const-string v6, "facebook_app_id"

    const-string v7, "string"

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v6, v7, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    const-string v0, "Facebook app id not defined in resources"

    invoke-interface {v4, v0}, Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;->AFKeystoreWrapper(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    move-object v8, v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v8, v0

    goto :goto_2

    :catch_2
    move-exception v0

    move-object v8, v0

    goto :goto_3

    :catch_3
    move-exception v0

    move-object v8, v0

    goto :goto_4

    :cond_2
    filled-new-array {v1, v3, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v7, "FB illegal access"

    invoke-virtual/range {v5 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;->AFKeystoreWrapper(Ljava/lang/String;)V

    return-void

    :goto_2
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v7, "FB class missing error"

    invoke-virtual/range {v5 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;->AFKeystoreWrapper(Ljava/lang/String;)V

    return-void

    :goto_3
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v7, "FB invocation error"

    invoke-virtual/range {v5 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;->AFKeystoreWrapper(Ljava/lang/String;)V

    return-void

    :goto_4
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v7, "FB method missing error"

    invoke-virtual/range {v5 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;->AFKeystoreWrapper(Ljava/lang/String;)V

    return-void
.end method
