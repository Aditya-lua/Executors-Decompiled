.class public final Lcom/appsflyer/internal/AFi1aSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

.field public volatile AFLogger:Z

.field public final d:Lcom/appsflyer/internal/AFi1hSDK;

.field private final registerClient:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFi1hSDK;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->registerClient:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFi1aSDK;->d:Lcom/appsflyer/internal/AFi1hSDK;

    return-void
.end method

.method private synthetic AFKeystoreWrapper(Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.appsflyer.referrer.INSTALL_PROVIDER"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 4
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 5
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    .line 7
    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    if-eqz v2, :cond_1

    .line 8
    new-instance v3, Lcom/appsflyer/internal/AFi1cSDK;

    invoke-direct {v3, v2, p2, p3}, Lcom/appsflyer/internal/AFi1cSDK;-><init>(Landroid/content/pm/ProviderInfo;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 9
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component"

    invoke-virtual {v2, v3, v4}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    .line 12
    iget-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 13
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Detected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " valid preinstall provider(s)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, p2, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_1
    if-ge v1, p1, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    add-int/lit8 v1, v1, 0x1

    check-cast p2, Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 15
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v2

    .line 16
    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 17
    invoke-virtual {p2, v2}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start(Landroid/content/Context;)V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method private synthetic AFKeystoreWrapper(Ljava/lang/Runnable;)V
    .locals 4

    .line 18
    :try_start_0
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger:Z

    if-nez v0, :cond_0

    .line 19
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "Skipping ATTR trigger: conversion not yet prepared, referrer data will be included in conversion"

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    .line 21
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "appsFlyerCount"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v0

    .line 22
    iget-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v1

    const-string v3, "newGPReferrerSent"

    invoke-interface {v1, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 23
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->registerClient:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    .line 25
    :goto_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const-string v2, "Error processing referrer data"

    :goto_1
    invoke-virtual {v0, v1, v2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private synthetic AFLogger(Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger:Z

    if-nez v0, :cond_0

    .line 2
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "Skipping ATTR trigger: conversion not yet prepared, referrer data will be included in conversion"

    invoke-virtual {p1, p2, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    .line 5
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v2, "appsFlyerCount"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v1

    .line 6
    const-string v2, "newGPReferrerSent"

    invoke-interface {v0, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    move-result v0

    .line 7
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    move-result-object p1

    sget-object v2, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->NOT_STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    const/4 v4, 0x1

    if-ne p1, v2, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    :goto_0
    move p1, v4

    goto :goto_1

    :cond_2
    move p1, v3

    :goto_1
    if-ne v1, v4, :cond_3

    if-eqz p1, :cond_3

    .line 8
    iget-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->registerClient:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 9
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method

.method private synthetic AFLogger(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 4

    .line 10
    new-instance v0, Lcom/appsflyer/internal/AFi1iSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 11
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    sget-object v2, Lcom/appsflyer/internal/AFi1jSDK;->d:Lcom/appsflyer/internal/AFi1jSDK;

    new-instance v3, Lcom/appsflyer/internal/y0;

    invoke-direct {v3}, Lcom/appsflyer/internal/y0;-><init>()V

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/appsflyer/internal/AFi1iSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1jSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Ljava/lang/Runnable;)V

    .line 12
    iget-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    iget-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object p1

    .line 14
    iget-object p1, p1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 15
    invoke-virtual {v0, p1}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFi1aSDK;Ljava/util/concurrent/ExecutorService;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFi1aSDK;->d(Ljava/util/concurrent/ExecutorService;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger(Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient()V

    return-void
.end method

.method public static synthetic d(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-void
.end method

.method private synthetic d(Ljava/util/concurrent/ExecutorService;Ljava/lang/Runnable;)V
    .locals 1

    .line 6
    new-instance v0, Lcom/appsflyer/internal/x0;

    invoke-direct {v0, p0, p2}, Lcom/appsflyer/internal/x0;-><init>(Lcom/appsflyer/internal/AFi1aSDK;Ljava/lang/Runnable;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic e(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFi1aSDK;->registerClient(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-void
.end method

.method public static synthetic f(Lcom/appsflyer/internal/AFi1aSDK;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic g(Lcom/appsflyer/internal/AFi1aSDK;Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper(Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V

    return-void
.end method

.method private synthetic registerClient(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 4

    new-instance v0, Lcom/appsflyer/internal/AFi1iSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    sget-object v2, Lcom/appsflyer/internal/AFi1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFi1jSDK;

    new-instance v3, Lcom/appsflyer/internal/u0;

    invoke-direct {v3, p0, p1}, Lcom/appsflyer/internal/u0;-><init>(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/appsflyer/internal/AFi1iSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1jSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object p1

    iget-object p1, p1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    invoke-virtual {v0, p1}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start(Landroid/content/Context;)V

    return-void
.end method

.method private static synthetic unregisterClient()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Runnable;)Lcom/appsflyer/internal/AFi1gSDK;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/appsflyer/internal/t0;

    invoke-direct {v1, p0, v0, p1}, Lcom/appsflyer/internal/t0;-><init>(Lcom/appsflyer/internal/AFi1aSDK;Ljava/util/concurrent/ExecutorService;Ljava/lang/Runnable;)V

    .line 4
    new-instance p1, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    iget-object v2, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->afErrorLog()Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    move-result-object v2

    invoke-direct {p1, v1, v2, v0}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;-><init>(Ljava/lang/Runnable;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/ExecutorService;)V

    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFi1gSDK;

    invoke-direct {v0, p1}, Lcom/appsflyer/internal/AFi1gSDK;-><init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-object v0
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 1

    .line 9
    new-instance v0, Lcom/appsflyer/internal/z0;

    invoke-direct {v0, p0, p1, p2}, Lcom/appsflyer/internal/z0;-><init>(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public final unregisterClient(Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 3

    .line 2
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    .line 3
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "appsFlyerCount"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p2, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string p3, "Preinstall referrer will not load, the counter >= 1, "

    invoke-virtual {p1, p2, p3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/w0;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/appsflyer/internal/w0;-><init>(Lcom/appsflyer/internal/AFi1aSDK;Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final unregisterClient(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 4

    .line 6
    new-instance v0, Lcom/appsflyer/internal/AFi1iSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 7
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    sget-object v2, Lcom/appsflyer/internal/AFi1jSDK;->AFLogger:Lcom/appsflyer/internal/AFi1jSDK;

    new-instance v3, Lcom/appsflyer/internal/v0;

    invoke-direct {v3, p0, p1}, Lcom/appsflyer/internal/v0;-><init>(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/appsflyer/internal/AFi1iSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1jSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Ljava/lang/Runnable;)V

    .line 8
    iget-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
