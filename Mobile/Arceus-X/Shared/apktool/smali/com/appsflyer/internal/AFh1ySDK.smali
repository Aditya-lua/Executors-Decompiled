.class public final Lcom/appsflyer/internal/AFh1ySDK;
.super Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
.source "SourceFile"


# instance fields
.field private final unregisterClient:Lcom/appsflyer/internal/AFc1bSDK;
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

    invoke-direct {p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFh1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFc1bSDK;

    return-void
.end method


# virtual methods
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

    if-eqz p6, :cond_1

    invoke-static {p2}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_0

    const-string p2, "missing label"

    :cond_0
    invoke-virtual {p0, p2, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->withTag(Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/LogTag;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/appsflyer/internal/AFh1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->getEntries()Lcom/appsflyer/exception_manager/ExceptionManager;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2, p3, p1}, Lcom/appsflyer/exception_manager/ExceptionManager;->storeNewException(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
