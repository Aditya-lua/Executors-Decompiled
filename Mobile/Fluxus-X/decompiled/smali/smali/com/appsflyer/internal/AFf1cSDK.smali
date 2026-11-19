.class public final Lcom/appsflyer/internal/AFf1cSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFf1cSDK$AFa1zSDK;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AFLogger(JLandroid/content/Context;Lcom/appsflyer/internal/AFf1cSDK$AFa1zSDK;)Z
    .locals 1
    .param p3    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/appsflyer/internal/AFf1cSDK$AFa1zSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    new-instance v0, Lcom/appsflyer/internal/AFf1cSDK$5;

    invoke-direct {v0, p0, p4}, Lcom/appsflyer/internal/AFf1cSDK$5;-><init>(Lcom/appsflyer/internal/AFf1cSDK;Lcom/appsflyer/internal/AFf1cSDK$AFa1zSDK;)V

    invoke-static {p1, p2, p3, v0}, Lcom/appsflyer/lvl/AppsFlyerLVL;->checkLicense(JLandroid/content/Context;Lcom/appsflyer/lvl/AppsFlyerLVL$resultListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    sget-object p2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p3, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string p4, "Exception while getting LVL data"

    invoke-virtual {p2, p3, p4, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method
