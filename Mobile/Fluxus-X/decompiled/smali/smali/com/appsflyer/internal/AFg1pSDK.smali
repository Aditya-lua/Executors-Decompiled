.class public final Lcom/appsflyer/internal/AFg1pSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFg1wSDK;


# static fields
.field private static unregisterClient:Landroid/content/IntentFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFg1pSDK;->unregisterClient:Landroid/content/IntentFilter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final registerClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    sget-object v0, Lcom/appsflyer/internal/AFg1pSDK;->unregisterClient:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string v0, "status"

    const/4 v3, -0x1

    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v4, 0x2

    if-ne v4, v0, :cond_3

    const-string v0, "plugged"

    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v5, 0x1

    if-eq v0, v5, :cond_2

    if-eq v0, v4, :cond_1

    const/4 v4, 0x4

    if-eq v0, v4, :cond_0

    const-string v0, "other"

    :goto_0
    move-object v1, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v6, p1

    goto :goto_2

    :cond_0
    const-string v0, "wireless"

    goto :goto_0

    :cond_1
    const-string v0, "usb"

    goto :goto_0

    :cond_2
    const-string v0, "ac"

    goto :goto_0

    :cond_3
    const-string v0, "no"

    goto :goto_0

    :goto_1
    const-string v0, "level"

    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v4, "scale"

    invoke-virtual {p1, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v3, v0, :cond_4

    if-eq v3, p1, :cond_4

    const/high16 v2, 0x42c80000    # 100.0f

    int-to-float v0, v0

    mul-float/2addr v0, v2

    int-to-float p1, p1

    div-float v2, v0, p1

    goto :goto_3

    :goto_2
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v5, "Failed to register receiver for battery status"

    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    :cond_4
    :goto_3
    new-instance p1, Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;

    invoke-direct {p1, v2, v1}, Lcom/appsflyer/internal/AFg1wSDK$AFa1vSDK;-><init>(FLjava/lang/String;)V

    return-object p1
.end method
