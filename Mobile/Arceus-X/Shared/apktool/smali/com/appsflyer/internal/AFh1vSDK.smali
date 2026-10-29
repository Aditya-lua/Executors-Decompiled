.class public final Lcom/appsflyer/internal/AFh1vSDK;
.super Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
.source "SourceFile"


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AFLogger:Z


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFc1bSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFh1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/appsflyer/internal/AFh1vSDK;->AFLogger:Z

    return-void
.end method


# virtual methods
.method public final d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/appsflyer/internal/AFh1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p3

    invoke-virtual {p0, p2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->extendedMsg(Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/LogTag;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "D"

    invoke-interface {p3, p2, p1}, Lcom/appsflyer/internal/AFd1uSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V
    .locals 0
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p4, ""

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p7, :cond_0

    iget-object p4, p0, Lcom/appsflyer/internal/AFh1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p4}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p4

    invoke-virtual {p0, p2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->extendedMsg(Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/LogTag;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "E"

    invoke-interface {p4, p2, p1}, Lcom/appsflyer/internal/AFd1uSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-eqz p7, :cond_1

    iget-object p1, p0, Lcom/appsflyer/internal/AFh1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p1

    invoke-interface {p1, p3}, Lcom/appsflyer/internal/AFd1uSDK;->registerClient(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final force(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFh1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    invoke-virtual {p0, p2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->extendedMsg(Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/LogTag;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "F"

    invoke-interface {v0, p2, p1}, Lcom/appsflyer/internal/AFd1uSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final getShouldExtendMsg()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFh1vSDK;->AFLogger:Z

    return v0
.end method

.method public final i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/appsflyer/internal/AFh1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p3

    invoke-virtual {p0, p2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->extendedMsg(Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/LogTag;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "I"

    invoke-interface {p3, p2, p1}, Lcom/appsflyer/internal/AFd1uSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/appsflyer/internal/AFh1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p3

    invoke-virtual {p0, p2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->extendedMsg(Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/LogTag;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "V"

    invoke-interface {p3, p2, p1}, Lcom/appsflyer/internal/AFd1uSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/appsflyer/internal/AFh1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLoggerLogLevel()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object p3

    invoke-virtual {p0, p2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->extendedMsg(Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/LogTag;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "W"

    invoke-interface {p3, p2, p1}, Lcom/appsflyer/internal/AFd1uSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
