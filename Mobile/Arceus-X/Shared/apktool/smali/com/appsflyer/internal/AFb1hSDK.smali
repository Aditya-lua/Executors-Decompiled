.class public final Lcom/appsflyer/internal/AFb1hSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;


# instance fields
.field private final AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AFLogger:Lcom/appsflyer/internal/AFc1bSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final d:Lcom/appsflyer/internal/AFf1mSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final registerClient:Lcom/appsflyer/internal/AFh1sSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Lkotlin/jvm/functions/Function0;Lcom/appsflyer/internal/AFf1mSDK;Lcom/appsflyer/internal/AFh1sSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFc1bSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/appsflyer/internal/AFf1mSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/appsflyer/internal/AFh1sSDK;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFc1bSDK;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/appsflyer/internal/AFf1mSDK;",
            "Lcom/appsflyer/internal/AFh1sSDK;",
            ")V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/appsflyer/internal/AFb1hSDK;->d:Lcom/appsflyer/internal/AFf1mSDK;

    iput-object p4, p0, Lcom/appsflyer/internal/AFb1hSDK;->registerClient:Lcom/appsflyer/internal/AFh1sSDK;

    return-void
.end method


# virtual methods
.method public final m_(Landroid/content/Intent;)V
    .locals 7
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "onActivityCreated with deeplink"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v1

    sget-object v2, Lcom/appsflyer/internal/AFa1kSDK;->AFa1zSDK:Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;->d(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1kSDK;

    move-result-object v0

    iget-object v2, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v2

    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    invoke-virtual {v1, v0, p1, v2}, Lcom/appsflyer/internal/AFa1qSDK;->b_(Lcom/appsflyer/internal/AFa1kSDK;Landroid/content/Intent;Landroid/content/Context;)V

    return-void
.end method

.method public final n_(Landroid/content/Intent;)V
    .locals 7
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "onBecameForeground"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger()V

    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/appsflyer/internal/AFj1wSDK;->R_(Landroid/content/Intent;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v1

    sget-object v2, Lcom/appsflyer/internal/AFa1kSDK;->AFa1zSDK:Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->setUserPhone()Lcom/appsflyer/internal/AFa1lSDK;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;->d(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1kSDK;

    move-result-object v2

    iget-object v3, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object v3

    iget-object v3, v3, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    invoke-virtual {v1, v2, p1, v3}, Lcom/appsflyer/internal/AFa1qSDK;->b_(Lcom/appsflyer/internal/AFa1kSDK;Landroid/content/Intent;Landroid/content/Context;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    move-result-object v1

    iget-object v2, p0, Lcom/appsflyer/internal/AFb1hSDK;->d:Lcom/appsflyer/internal/AFf1mSDK;

    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFf1hSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFf1mSDK;)V

    sget-boolean v1, Lcom/appsflyer/internal/AFe1jSDK;->force:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object v1

    new-instance v2, Lcom/appsflyer/internal/AFe1jSDK;

    iget-object v3, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-direct {v2, v3}, Lcom/appsflyer/internal/AFe1jSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;)V

    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v2, "appsFlyerCount"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_1

    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->afInfoLog()Lcom/appsflyer/internal/AFj1ySDK;

    move-result-object v1

    invoke-interface {v1}, Lcom/appsflyer/internal/AFj1ySDK;->registerClient()V

    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFb1hSDK;->registerClient:Lcom/appsflyer/internal/AFh1sSDK;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1, v2}, Lcom/appsflyer/internal/AFh1sSDK;->D_(Landroid/content/Intent;Lcom/appsflyer/internal/AFa1qSDK;)V

    :cond_2
    return-void
.end method

.method public final registerClient()V
    .locals 10

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "onBecameBackground"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v2, Lcom/appsflyer/internal/AFh1xSDK;->e:J

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-eqz v9, :cond_1

    sub-long/2addr v3, v5

    cmp-long v0, v3, v7

    if-lez v0, :cond_0

    const-wide/16 v0, 0x3e8

    cmp-long v5, v3, v0

    if-gez v5, :cond_0

    move-wide v3, v0

    :cond_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    iput-wide v0, v2, Lcom/appsflyer/internal/AFh1xSDK;->afInfoLog:J

    iget-object v2, v2, Lcom/appsflyer/internal/AFh1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v3, "prev_session_dur"

    invoke-interface {v2, v3, v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    const-string v2, "Metrics: fg ts is missing"

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFLogger:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAppInviteOneLink()Lcom/appsflyer/internal/AFj1wSDK;

    move-result-object v0

    invoke-interface {v0}, Lcom/appsflyer/internal/AFj1wSDK;->registerClient()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFb1hSDK;->AFKeystoreWrapper:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method
