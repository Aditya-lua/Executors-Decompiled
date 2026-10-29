.class public abstract Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final authority:Ljava/lang/String;

.field private final backgroundExecutor:Ljava/util/concurrent/Executor;

.field protected final context:Landroid/content/Context;

.field protected final logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

.field private final sig:[Ljava/lang/String;

.field private final task:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>(Landroid/content/Context;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/Executor;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Lcom/appsflyer/sdk_base/util/c;

    invoke-direct {v1, p0}, Lcom/appsflyer/sdk_base/util/c;-><init>(Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;)V

    invoke-direct {v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->task:Ljava/util/concurrent/FutureTask;

    iput-object p1, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->context:Landroid/content/Context;

    iput-object p4, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->authority:Ljava/lang/String;

    iput-object p2, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    iput-object p5, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->sig:[Ljava/lang/String;

    iput-object p3, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->backgroundExecutor:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->lambda$new$0()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic lambda$new$0()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->valid()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->query()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->task:Ljava/util/concurrent/FutureTask;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->onError(Ljava/lang/Throwable;Z)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onError(Ljava/lang/Throwable;Z)V
    .locals 6

    iget-object v0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    const/4 v4, 0x0

    move-object v3, p1

    move v5, p2

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-void
.end method

.method public abstract query()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public start()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->backgroundExecutor:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->task:Ljava/util/concurrent/FutureTask;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public valid()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->authority:Ljava/lang/String;

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->sig:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v1, v1, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    invoke-static {v3, v1}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->signature(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_0

    :cond_0
    return v0

    :goto_0
    invoke-virtual {p0, v1, v0}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->onError(Ljava/lang/Throwable;Z)V

    return v0
.end method
