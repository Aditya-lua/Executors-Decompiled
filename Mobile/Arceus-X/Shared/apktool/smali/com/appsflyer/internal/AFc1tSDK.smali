.class public final Lcom/appsflyer/internal/AFc1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFb1aSDK;


# instance fields
.field private final AFLogger:Lcom/appsflyer/internal/AFc1eSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final d:Lcom/appsflyer/internal/AFf1fSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final unregisterClient:Lcom/appsflyer/internal/AFd1zSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFf1fSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFc1eSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFd1zSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/appsflyer/internal/AFf1fSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFc1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1zSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/AFc1tSDK;->d:Lcom/appsflyer/internal/AFf1fSDK;

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFc1tSDK;Lx8/c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFc1tSDK;->registerClient(Lcom/appsflyer/internal/AFc1tSDK;Lx8/c;)V

    return-void
.end method

.method private static final registerClient(Lcom/appsflyer/internal/AFc1tSDK;Lx8/c;)V
    .locals 3

    iget-object p0, p0, Lcom/appsflyer/internal/AFc1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

    new-instance v0, Lcom/appsflyer/internal/AFc1rSDK;

    invoke-virtual {p1}, Lx8/c;->b()I

    move-result v1

    invoke-virtual {p1}, Lx8/c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v2, ""

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p1}, Lcom/appsflyer/internal/AFc1rSDK;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/appsflyer/internal/AFc1eSDK;->setUserEmail:Lcom/appsflyer/internal/AFc1rSDK;

    return-void
.end method


# virtual methods
.method public final AFLogger()Z
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1tSDK;->d:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

    iget-boolean v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->setCustomerUserId:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/appsflyer/internal/AFj1qSDK;->AFLogger(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/appsflyer/internal/AFj1qSDK;->registerClient(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final unregisterClient()V
    .locals 11

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1zSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {v0}, Lx8/a;->a(Landroid/content/Context;)Lx8/b;

    move-result-object v0

    invoke-interface {v0}, Lx8/b;->j()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lcom/appsflyer/internal/b0;

    invoke-direct {v1, p0}, Lcom/appsflyer/internal/b0;-><init>(Lcom/appsflyer/internal/AFc1tSDK;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object v4, v0

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->APP_SET_ID:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v9, 0x78

    const/4 v10, 0x0

    const-string v3, "Error while trying to  fetch App set ID"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    :cond_0
    return-void
.end method
