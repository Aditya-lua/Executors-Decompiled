.class public final Lcom/appsflyer/internal/AFh1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFh1wSDK;


# instance fields
.field private AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private AFLogger:Lcom/appsflyer/internal/AFh1vSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private d:Lcom/appsflyer/internal/AFh1zSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final registerClient:Lcom/appsflyer/internal/AFc1bSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFc1bSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFh1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1bSDK;

    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()V
    .locals 7

    iget-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->d:Lcom/appsflyer/internal/AFh1zSDK;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->RD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "Releasing Proxy Manager Client"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Lcom/appsflyer/AFLogger;->unregisterClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->d:Lcom/appsflyer/internal/AFh1zSDK;

    :cond_0
    return-void
.end method

.method public final AFLogger()V
    .locals 4

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    iget-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFLogger:Lcom/appsflyer/internal/AFh1vSDK;

    if-nez v1, :cond_0

    new-instance v1, Lcom/appsflyer/internal/AFh1vSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFh1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFh1vSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFLogger:Lcom/appsflyer/internal/AFh1vSDK;

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFLogger:Lcom/appsflyer/internal/AFh1vSDK;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-virtual {v0, v2}, Lcom/appsflyer/AFLogger;->registerClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    return-void
.end method

.method public final d()V
    .locals 7

    iget-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->EXCEPTION_MANAGER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "Releasing Exception Manager Client"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Lcom/appsflyer/AFLogger;->unregisterClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 4

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    iget-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->d:Lcom/appsflyer/internal/AFh1zSDK;

    if-nez v1, :cond_0

    new-instance v1, Lcom/appsflyer/internal/AFh1zSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFh1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFh1zSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->d:Lcom/appsflyer/internal/AFh1zSDK;

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->d:Lcom/appsflyer/internal/AFh1zSDK;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-virtual {v0, v2}, Lcom/appsflyer/AFLogger;->registerClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    return-void
.end method

.method public final registerClient()V
    .locals 4

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    iget-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;

    if-nez v1, :cond_0

    new-instance v1, Lcom/appsflyer/internal/AFh1ySDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFh1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-direct {v1, v2}, Lcom/appsflyer/internal/AFh1ySDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    iput-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1ySDK;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-virtual {v0, v2}, Lcom/appsflyer/AFLogger;->registerClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    return-void
.end method

.method public final unregisterClient()V
    .locals 7

    iget-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFLogger:Lcom/appsflyer/internal/AFh1vSDK;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->RD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "Releasing Proxy Manager Client"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Lcom/appsflyer/AFLogger;->unregisterClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/appsflyer/internal/AFh1tSDK;->AFLogger:Lcom/appsflyer/internal/AFh1vSDK;

    :cond_0
    return-void
.end method
