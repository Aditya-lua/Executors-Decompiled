.class public final Lcom/appsflyer/internal/AFd1eSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFe1vSDK;


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AFLogger:Lcom/appsflyer/internal/AFe1wSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final d:Lcom/appsflyer/internal/AFc1bSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final registerClient:Lcom/appsflyer/internal/AFc1kSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFc1kSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/AppsFlyerProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/appsflyer/internal/AFe1wSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/appsflyer/internal/AFc1bSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFd1eSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

    iput-object p3, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFLogger:Lcom/appsflyer/internal/AFe1wSDK;

    iput-object p4, p0, Lcom/appsflyer/internal/AFd1eSDK;->d:Lcom/appsflyer/internal/AFc1bSDK;

    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper(Lcom/appsflyer/internal/AFe1ySDK;Lcom/appsflyer/internal/AFd1cSDK;)V
    .locals 4
    .param p1    # Lcom/appsflyer/internal/AFe1ySDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFd1cSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;",
            "Lcom/appsflyer/internal/AFd1cSDK;",
            ")V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/appsflyer/internal/AFf1tSDK;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/appsflyer/internal/AFf1tSDK;

    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    if-ne p2, v0, :cond_2

    iget-object p2, p0, Lcom/appsflyer/internal/AFd1eSDK;->registerClient:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v0, "sentSuccessfully"

    const-string v1, "true"

    invoke-interface {p2, v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    instance-of p2, p1, Lcom/appsflyer/internal/AFf1qSDK;

    if-nez p2, :cond_0

    new-instance p2, Lcom/appsflyer/internal/AFg1vSDK;

    invoke-direct {p2}, Lcom/appsflyer/internal/AFg1vSDK;-><init>()V

    invoke-virtual {p2}, Lcom/appsflyer/internal/AFg1vSDK;->d()Lcom/appsflyer/internal/AFg1sSDK;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-boolean v0, p2, Lcom/appsflyer/internal/AFg1sSDK;->AFLogger:Z

    if-eqz v0, :cond_0

    iget-object p2, p2, Lcom/appsflyer/internal/AFg1sSDK;->AFKeystoreWrapper:Ljava/lang/String;

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->UNINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Resending Uninstall token to AF servers: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    new-instance v1, Lcom/appsflyer/internal/AFf1qSDK;

    invoke-direct {v1, p2, v0}, Lcom/appsflyer/internal/AFf1qSDK;-><init>(Ljava/lang/String;Lcom/appsflyer/internal/AFc1bSDK;)V

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    :cond_0
    iget-object p1, p1, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFKeystoreWrapper:Lcom/appsflyer/AppsFlyerProperties;

    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFa1rSDK;->AFKeystoreWrapper(Ljava/lang/String;Lcom/appsflyer/AppsFlyerProperties;)Lorg/json/JSONObject;

    return-void

    :cond_1
    instance-of p1, p1, Lcom/appsflyer/internal/AFg1lSDK;

    if-eqz p1, :cond_2

    sget-object p1, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;

    if-eq p2, p1, :cond_2

    iget-object p1, p0, Lcom/appsflyer/internal/AFd1eSDK;->AFLogger:Lcom/appsflyer/internal/AFe1wSDK;

    new-instance p2, Lcom/appsflyer/internal/AFg1mSDK;

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1eSDK;->d:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-direct {p2, v0}, Lcom/appsflyer/internal/AFg1mSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    :cond_2
    return-void
.end method

.method public final d(Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFe1ySDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final registerClient(Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFe1ySDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFe1ySDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1ySDK<",
            "*>;)V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
