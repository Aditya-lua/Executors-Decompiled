.class public final Lcom/appsflyer/internal/AFd1wSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFd1uSDK;


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFLoggerLogLevel:[I = null

.field private static afInfoLog:I = 0x1

.field private static afWarnLog:I

.field private static final d:I


# instance fields
.field private AFKeystoreWrapper:I

.field private AFLogger:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/appsflyer/internal/AFc1bSDK;

.field private force:Ljava/security/SecureRandom;

.field private i:Z

.field private final registerClient:Ljava/util/Map;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private unregisterClient:Z

.field private v:Z

.field private w:Lcom/appsflyer/AppsFlyerProperties;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/appsflyer/internal/AFd1wSDK;->force()V

    const v0, 0x17f76

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->d:I

    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x2b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->force:Ljava/security/SecureRandom;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v1

    iput-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->w:Lcom/appsflyer/AppsFlyerProperties;

    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    const-string v2, "AF_DISABLE_REMOTE_DEBUGGER"

    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->v:Z

    iput v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    iput-boolean v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z

    iput-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    return-void
.end method

.method private static AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1aSDK;)Lcom/appsflyer/internal/AFh1cSDK;
    .locals 4

    .line 33
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v0, 0x5d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v1, v1, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const/16 v1, 0x14

    .line 34
    div-int/lit8 v1, v1, 0x0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_2

    .line 35
    :goto_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1aSDK;->registerClient:Lcom/appsflyer/internal/AFh1gSDK;

    if-eqz p0, :cond_2

    .line 36
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1cSDK;

    add-int/lit8 v2, v2, 0x33

    .line 37
    rem-int/lit16 v0, v2, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_1

    return-object p0

    :cond_1
    throw v3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 38
    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    return-object v3
.end method

.method private declared-synchronized AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const v1, -0x3f0e94b7

    const v2, -0x166ce116

    const v3, 0x228cb56d

    const v4, 0x5179247d

    filled-new-array {v3, v4, v1, v2}, [I

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Landroid/telephony/cdma/CdmaCellLocation;->convertQuartSecToDecDegrees(I)D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpl-double v3, v3, v5

    rsub-int/lit8 v3, v3, 0x5

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v1, v3, v4}, Lcom/appsflyer/internal/AFd1wSDK;->a([II[Ljava/lang/Object;)V

    aget-object v1, v4, v2

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v1, "model"

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v1, "platform"

    const-string v3, "Android"

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v1, "platform_version"

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_1

    .line 14
    :try_start_1
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x79

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-lez v0, :cond_1

    .line 16
    :try_start_3
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x77

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v0, :cond_0

    .line 17
    :try_start_4
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v1, "advertiserId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p1, 0x39

    .line 18
    div-int/2addr p1, v2

    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v1, "advertiserId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    .line 20
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-lez p1, :cond_3

    :try_start_5
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x25

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz p1, :cond_2

    .line 21
    :try_start_6
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v0, "imei"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p3, "imei"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 22
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 23
    :goto_1
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1

    :cond_3
    :goto_2
    if-eqz p3, :cond_4

    .line 24
    :try_start_8
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_4

    .line 25
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p2, "android_id"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 26
    :cond_4
    monitor-exit p0

    return-void

    .line 27
    :catchall_1
    monitor-exit p0

    return-void
.end method

.method private AFKeystoreWrapper(Ljava/lang/String;)Z
    .locals 1

    .line 28
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x5

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    if-eqz p1, :cond_1

    add-int/lit8 v0, v0, 0x19

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private declared-synchronized AFLogger(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    .line 18
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x75

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 19
    :try_start_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v2, "sdk_version"

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p2, :cond_1

    .line 20
    :try_start_2
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x77

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_0

    .line 21
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 22
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v0, "devkey"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz p3, :cond_3

    :try_start_4
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x51

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_2

    .line 24
    :try_start_5
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_3

    .line 25
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p2, "originalAppsFlyerId"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 26
    :cond_2
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_3
    :goto_1
    if-eqz p4, :cond_4

    :try_start_6
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x59

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 27
    :try_start_7
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_4

    .line 28
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p2, "uid"

    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 29
    :cond_4
    monitor-exit p0

    return-void

    .line 30
    :cond_5
    :try_start_8
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p3, "sdk_version"

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 32
    :catchall_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw p1
.end method

.method private varargs declared-synchronized AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    .line 33
    :try_start_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->afErrorLog()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 34
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x4f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_4

    .line 35
    iget v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v1, 0x18000

    if-lt v0, v1, :cond_0

    goto/16 :goto_2

    .line 36
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 37
    const-string v2, ", "

    invoke-static {v2, p3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    if-eqz p1, :cond_1

    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " _/AppsFlyer_7.0.1 ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 39
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/AppsFlyer_7.0.1 "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 40
    :goto_0
    iget p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    const/4 v0, 0x1

    shl-int/2addr p3, v0

    add-int/2addr p2, p3

    sget p3, Lcom/appsflyer/internal/AFd1wSDK;->d:I

    const/4 v1, 0x0

    if-le p2, p3, :cond_2

    .line 41
    iget p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    sub-int/2addr p3, p2

    div-int/lit8 p3, p3, 0x2

    invoke-virtual {p1, v1, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    move v1, v0

    .line 42
    :cond_2
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    iget p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    shl-int/2addr p1, v0

    add-int/2addr p2, p1

    iput p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_3

    .line 44
    :try_start_2
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x31

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    :try_start_3
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    const-string p2, "+~+~ The limit has been exceeded, and no more data is available. +~+~"

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    iget p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    add-int/lit16 p1, p1, 0x8a

    iput p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 47
    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    .line 48
    :catchall_1
    monitor-exit p0

    return-void

    :cond_4
    const/4 p1, 0x0

    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_5
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method private AFLogger(Lcom/appsflyer/internal/AFh1cSDK;Lcom/appsflyer/internal/AFh1cSDK;)Z
    .locals 2
    .param p1    # Lcom/appsflyer/internal/AFh1cSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 49
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 50
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x4f

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 51
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog()Z

    move-result p1

    return p1

    .line 52
    :cond_0
    iget p1, p1, Lcom/appsflyer/internal/AFh1cSDK;->unregisterClient:F

    .line 53
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    const v0, 0x317aee4a

    const v1, -0x317aee4a

    invoke-static {p1, v0, v1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 54
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient(Z)V

    .line 55
    sget p2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p2, p2, 0x21

    rem-int/lit16 p2, p2, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    return p1
.end method

.method private declared-synchronized AFLoggerLogLevel()Ljava/util/Map;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x65

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v1, "data"

    iget-object v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->afDebugLog()V

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x3b

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v1, "data"

    iget-object v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->afDebugLog()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_3
    throw v0

    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method private static a([II[Ljava/lang/Object;)V
    .locals 16

    move-object/from16 v0, p0

    new-instance v1, Lcom/appsflyer/internal/AFk1oSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFk1oSDK;-><init>()V

    const/4 v2, 0x4

    new-array v2, v2, [C

    array-length v3, v0

    const/4 v4, 0x2

    mul-int/2addr v3, v4

    new-array v3, v3, [C

    sget-object v5, Lcom/appsflyer/internal/AFd1wSDK;->AFLoggerLogLevel:[I

    const-wide v6, 0x769c5e91f036dbc7L    # 2.2332975936769864E263

    const/4 v8, 0x0

    if-eqz v5, :cond_2

    array-length v9, v5

    new-array v10, v9, [I

    :goto_0
    move v11, v8

    :goto_1
    if-ge v11, v9, :cond_1

    sget v12, Lcom/appsflyer/internal/AFd1wSDK;->$11:I

    add-int/lit8 v12, v12, 0x73

    rem-int/lit16 v13, v12, 0x80

    sput v13, Lcom/appsflyer/internal/AFd1wSDK;->$10:I

    rem-int/2addr v12, v4

    if-eqz v12, :cond_0

    aget v12, v5, v11

    int-to-long v12, v12

    mul-long/2addr v12, v6

    long-to-int v12, v12

    aput v12, v10, v11

    goto :goto_0

    :cond_0
    aget v12, v5, v11

    int-to-long v12, v12

    xor-long/2addr v12, v6

    long-to-int v12, v12

    aput v12, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    move-object v5, v10

    :cond_2
    array-length v5, v5

    new-array v9, v5, [I

    sget-object v10, Lcom/appsflyer/internal/AFd1wSDK;->AFLoggerLogLevel:[I

    if-eqz v10, :cond_4

    array-length v11, v10

    new-array v12, v11, [I

    move v13, v8

    :goto_2
    if-ge v13, v11, :cond_3

    aget v14, v10, v13

    int-to-long v14, v14

    xor-long/2addr v14, v6

    long-to-int v14, v14

    aput v14, v12, v13

    add-int/lit8 v13, v13, 0x1

    sget v14, Lcom/appsflyer/internal/AFd1wSDK;->$10:I

    add-int/lit8 v14, v14, 0x33

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFd1wSDK;->$11:I

    goto :goto_2

    :cond_3
    move-object v10, v12

    :cond_4
    invoke-static {v10, v8, v9, v8, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v8, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFKeystoreWrapper:I

    :goto_3
    iget v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFKeystoreWrapper:I

    array-length v6, v0

    if-ge v5, v6, :cond_6

    sget v6, Lcom/appsflyer/internal/AFd1wSDK;->$11:I

    const/4 v7, 0x3

    add-int/2addr v6, v7

    rem-int/lit16 v6, v6, 0x80

    sput v6, Lcom/appsflyer/internal/AFd1wSDK;->$10:I

    aget v6, v0, v5

    shr-int/lit8 v10, v6, 0x10

    int-to-char v10, v10

    aput-char v10, v2, v8

    int-to-char v6, v6

    const/4 v11, 0x1

    aput-char v6, v2, v11

    add-int/lit8 v12, v5, 0x1

    aget v12, v0, v12

    const/16 v13, 0x10

    shr-int/2addr v12, v13

    int-to-char v12, v12

    aput-char v12, v2, v4

    add-int/lit8 v5, v5, 0x1

    aget v5, v0, v5

    int-to-char v5, v5

    aput-char v5, v2, v7

    shl-int/2addr v10, v13

    add-int/2addr v10, v6

    iput v10, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    shl-int/lit8 v6, v12, 0x10

    add-int/2addr v6, v5

    iput v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    invoke-static {v9}, Lcom/appsflyer/internal/AFk1oSDK;->unregisterClient([I)V

    move v5, v8

    :goto_4
    if-ge v5, v13, :cond_5

    sget v6, Lcom/appsflyer/internal/AFd1wSDK;->$10:I

    add-int/lit8 v6, v6, 0x21

    rem-int/lit16 v6, v6, 0x80

    sput v6, Lcom/appsflyer/internal/AFd1wSDK;->$11:I

    iget v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    aget v10, v9, v5

    xor-int/2addr v6, v10

    iput v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    invoke-static {v6}, Lcom/appsflyer/internal/AFk1oSDK;->d(I)I

    move-result v6

    iget v10, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    xor-int/2addr v6, v10

    iget v10, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    iput v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    iput v10, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_5
    iget v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    iget v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    iput v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    iput v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    aget v10, v9, v13

    xor-int/2addr v5, v10

    iput v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    const/16 v10, 0x11

    aget v10, v9, v10

    xor-int/2addr v6, v10

    iput v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    ushr-int/lit8 v10, v6, 0x10

    int-to-char v10, v10

    aput-char v10, v2, v8

    int-to-char v6, v6

    aput-char v6, v2, v11

    ushr-int/lit8 v6, v5, 0x10

    int-to-char v6, v6

    aput-char v6, v2, v4

    int-to-char v5, v5

    aput-char v5, v2, v7

    invoke-static {v9}, Lcom/appsflyer/internal/AFk1oSDK;->unregisterClient([I)V

    iget v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFKeystoreWrapper:I

    mul-int/lit8 v6, v5, 0x2

    aget-char v10, v2, v8

    aput-char v10, v3, v6

    mul-int/lit8 v6, v5, 0x2

    add-int/2addr v6, v11

    aget-char v10, v2, v11

    aput-char v10, v3, v6

    mul-int/lit8 v6, v5, 0x2

    add-int/2addr v6, v4

    aget-char v10, v2, v4

    aput-char v10, v3, v6

    mul-int/lit8 v6, v5, 0x2

    add-int/2addr v6, v7

    aget-char v7, v2, v7

    aput-char v7, v3, v6

    add-int/2addr v5, v4

    iput v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFKeystoreWrapper:I

    goto/16 :goto_3

    :cond_6
    new-instance v0, Ljava/lang/String;

    move/from16 v1, p1

    invoke-direct {v0, v3, v8, v1}, Ljava/lang/String;-><init>([CII)V

    aput-object v0, p2, v8

    return-void
.end method

.method private declared-synchronized afDebugLog()V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x13

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    :try_start_2
    throw v0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method private afErrorLog()Z
    .locals 3

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->v:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z

    if-eqz v0, :cond_2

    :cond_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0xf

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v2, 0x1

    if-nez v0, :cond_1

    const/16 v0, 0x2b

    div-int/2addr v0, v1

    :cond_1
    return v2

    :cond_2
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x5f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    return v1
.end method

.method private afInfoLog()Z
    .locals 3

    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x51

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v0

    const-string v1, "participantInProxy"

    invoke-interface {v0, v1}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    move-result v0

    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v1, v1, 0x7d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    const/16 v1, 0x31

    div-int/lit8 v1, v1, 0x0

    :cond_0
    return v0
.end method

.method private afWarnLog()V
    .locals 4

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    const v2, -0x30603f54

    const v3, 0x30603f56

    invoke-static {v0, v2, v3, v1}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method

.method private static synthetic d([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    aget-object v0, p0, v0

    check-cast v0, Lcom/appsflyer/internal/AFd1wSDK;

    const/4 v1, 0x1

    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/String;

    .line 17
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x5

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    .line 18
    iget-object v1, v0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/appsflyer/internal/AFd1wSDK;->d(Ljava/lang/String;Lcom/appsflyer/internal/AFc1eSDK;)V

    .line 19
    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1wSDK;->AFLoggerLogLevel()Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 20
    :cond_0
    iget-object v1, v0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/appsflyer/internal/AFd1wSDK;->d(Ljava/lang/String;Lcom/appsflyer/internal/AFc1eSDK;)V

    .line 21
    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1wSDK;->AFLoggerLogLevel()Ljava/util/Map;

    const/4 p0, 0x0

    throw p0
.end method

.method private declared-synchronized d(Ljava/lang/String;Lcom/appsflyer/internal/AFc1eSDK;)V
    .locals 5

    monitor-enter p0

    .line 37
    :try_start_0
    const-string v0, "remote_debug_static_data"

    .line 38
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->w:Lcom/appsflyer/AppsFlyerProperties;

    invoke-interface {v1, v0}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 39
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 40
    :try_start_1
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/appsflyer/internal/AFg1dSDK;->unregisterClient(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 41
    :try_start_2
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x79

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger()Ljava/lang/String;

    move-result-object v1

    .line 43
    iget-object v2, p2, Lcom/appsflyer/internal/AFc1eSDK;->AFLoggerLogLevel:Ljava/lang/String;

    .line 44
    iget-object p2, p2, Lcom/appsflyer/internal/AFc1eSDK;->force:Ljava/lang/String;

    .line 45
    invoke-direct {p0, v1, v2, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "7.0.1."

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 47
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    const v3, -0x62ff1f55

    const v4, 0x62ff1f57

    invoke-static {v2, v3, v4, v1}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->w:Lcom/appsflyer/AppsFlyerProperties;

    const-string v3, "KSAppsFlyerId"

    .line 48
    invoke-interface {v2, v3}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 49
    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v3

    .line 50
    iget-object v3, v3, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {v3}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    move-result-object v3

    .line 51
    invoke-direct {p0, p2, v1, v2, v3}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    :try_start_3
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object p2

    .line 53
    invoke-virtual {p2}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object p2

    iget p2, p2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 54
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    .line 55
    const-string v2, "CHANNEL"

    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_2

    .line 56
    :try_start_4
    sget v2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v2, v2, 0xf

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v2, v2, 0x2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 57
    :try_start_5
    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v1, v3

    goto :goto_0

    .line 58
    :cond_1
    const-string p1, ""

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    throw v3

    .line 59
    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->w:Lcom/appsflyer/AppsFlyerProperties;

    const-string v3, "preInstallName"

    invoke-interface {v2, v3}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 60
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2, v1, v2}, Lcom/appsflyer/internal/AFd1wSDK;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 61
    :try_start_6
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x4d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 62
    :catchall_1
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->w:Lcom/appsflyer/AppsFlyerProperties;

    new-instance p2, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    invoke-direct {p2, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :catchall_2
    :goto_1
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p2, "launch_counter"

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    .line 64
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "appsFlyerCount"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v0

    .line 65
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 66
    monitor-exit p0

    return-void

    :goto_2
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1
.end method

.method private declared-synchronized d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 22
    :try_start_0
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v1, v1, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 23
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-lez v1, :cond_1

    .line 24
    :try_start_2
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x3

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    :try_start_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v2, "app_id"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 26
    :try_start_4
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x1b

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    :try_start_6
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x37

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz p1, :cond_2

    .line 27
    :try_start_7
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_3

    .line 28
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v1, "app_version"

    invoke-interface {p1, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 29
    :cond_2
    throw v0

    :cond_3
    :goto_1
    if-eqz p3, :cond_4

    .line 30
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_4

    .line 31
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p2, "channel"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 32
    :try_start_8
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x35

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    :cond_4
    if-eqz p4, :cond_6

    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x6b

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-eqz p1, :cond_5

    .line 33
    :try_start_9
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_6

    .line 34
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p2, "preInstall"

    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 35
    :cond_5
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    throw p1

    .line 36
    :cond_6
    :goto_3
    monitor-exit p0

    return-void
.end method

.method private d(F)Z
    .locals 3

    .line 91
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x317aee4a

    const v2, -0x317aee4a

    invoke-static {p1, v1, v2, v0}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method private declared-synchronized d(Lcom/appsflyer/internal/AFh1cSDK;Lcom/appsflyer/internal/AFh1cSDK;)Z
    .locals 5

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 67
    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    const v1, -0x30603f54

    const v2, 0x30603f56

    invoke-static {p1, v1, v2, p2}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 69
    :cond_0
    :try_start_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v2, p1, Lcom/appsflyer/internal/AFh1cSDK;->d:J

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    invoke-static {}, Lcom/appsflyer/internal/AFh1cSDK;->registerClient()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-lez v1, :cond_6

    .line 70
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 71
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    .line 72
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v2, "appsFlyerCount"

    invoke-interface {v1, v2, v0}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v1

    .line 73
    iget v2, p1, Lcom/appsflyer/internal/AFh1cSDK;->AFKeystoreWrapper:I

    if-gt v1, v2, :cond_5

    .line 74
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Lcom/appsflyer/internal/AFh1cSDK;Lcom/appsflyer/internal/AFh1cSDK;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 75
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x2d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    monitor-exit p0

    return v0

    .line 77
    :cond_1
    :try_start_2
    iget-object p2, p1, Lcom/appsflyer/internal/AFh1cSDK;->AFLogger:Ljava/lang/String;

    .line 78
    invoke-direct {p0, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p2, :cond_2

    .line 79
    monitor-exit p0

    return v0

    .line 80
    :cond_2
    :try_start_3
    iget-object p1, p1, Lcom/appsflyer/internal/AFh1cSDK;->force:Ljava/lang/String;

    .line 81
    invoke-static {p1}, Lcom/appsflyer/internal/AFd1wSDK;->d(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 82
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x39

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 83
    monitor-exit p0

    return v0

    .line 84
    :cond_3
    :try_start_4
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x49

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 p2, 0x1

    if-nez p1, :cond_4

    const/16 p1, 0x48

    :try_start_5
    div-int/2addr p1, v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit p0

    return p2

    :catchall_1
    move-exception p1

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_4
    monitor-exit p0

    return p2

    .line 85
    :cond_5
    monitor-exit p0

    return v0

    .line 86
    :cond_6
    monitor-exit p0

    return v0

    :goto_0
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1
.end method

.method private static d(Ljava/lang/String;)Z
    .locals 2

    .line 87
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x4b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x7

    .line 88
    div-int/lit8 v0, v0, 0x0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_2

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 89
    :cond_1
    new-instance v0, Lcom/appsflyer/internal/AFd1ySDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1ySDK;-><init>()V

    invoke-static {}, Lcom/appsflyer/internal/AFd1wSDK;->v()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/appsflyer/internal/AFd1ySDK;->registerClient(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 90
    :cond_2
    :goto_1
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p0, p0, 0x29

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 p0, p0, 0x2

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    const/16 p0, 0x44

    div-int/lit8 p0, p0, 0x0

    :cond_3
    return v0
.end method

.method private static d(Ljava/lang/String;[Ljava/lang/StackTraceElement;)[Ljava/lang/String;
    .locals 2

    .line 92
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int p1, v0

    const v0, -0x3c18d5b9

    const v1, 0x3c18d5bc

    invoke-static {p0, v0, v1, p1}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method private declared-synchronized e()V
    .locals 8

    monitor-enter p0

    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0xb

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-string v0, "r_debugging_on"

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy-MM-dd HH:mm:ssZ"

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v4, v0

    :try_start_4
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PROXY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "Error while starting remote debugger"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v5, 0x1

    invoke-virtual/range {v1 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method

.method public static force()V
    .locals 1

    const/16 v0, 0x12

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/appsflyer/internal/AFd1wSDK;->AFLoggerLogLevel:[I

    return-void

    :array_0
    .array-data 4
        -0x21e0c15d
        0x64a1c383
        0x32ed4eed
        -0x28feb00a
        -0x6becd846
        0x5e69765e
        -0x77428a16
        -0x8c1f50d
        0x2a272167
        -0x7c9eb97e
        -0x21942169
        0x6bb25fda
        -0x505fe132
        0xa97ec3b
        -0x4890aa44
        -0x36455434    # -1529209.5f
        -0x69d30092
        0x44c9ddff
    .end array-data
.end method

.method public static synthetic registerClient([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 5

    mul-int/lit8 v0, p1, 0x32

    mul-int/lit8 v1, p2, -0x61

    add-int/2addr v0, v1

    not-int v1, p2

    not-int v2, p3

    or-int v3, v1, v2

    not-int v3, v3

    or-int v4, v1, p1

    not-int v4, v4

    or-int/2addr v3, v4

    mul-int/lit8 v3, v3, 0x62

    add-int/2addr v0, v3

    not-int v3, p1

    or-int/2addr v2, v3

    not-int v2, v2

    or-int/2addr v2, v1

    or-int v3, p1, p3

    not-int v3, v3

    or-int/2addr v2, v3

    mul-int/lit8 v2, v2, -0x31

    add-int/2addr v0, v2

    or-int/2addr p3, v1

    not-int p3, p3

    or-int/2addr p1, p2

    not-int p1, p1

    or-int/2addr p1, p3

    mul-int/lit8 p1, p1, 0x31

    add-int/2addr v0, p1

    const/4 p1, 0x1

    if-eq v0, p1, :cond_9

    const/4 p2, 0x2

    const/4 p3, 0x0

    if-eq v0, p2, :cond_8

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    .line 1
    aget-object p2, p0, p3

    check-cast p2, Lcom/appsflyer/internal/AFd1wSDK;

    aget-object p0, p0, p1

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    .line 2
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x3d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    float-to-double v0, p0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double p1, v0, v2

    if-ltz p1, :cond_0

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_0
    const-wide/16 v2, 0x0

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_1

    .line 3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 4
    :cond_1
    invoke-direct {p2}, Lcom/appsflyer/internal/AFd1wSDK;->w()F

    move-result p1

    cmpg-float p0, p1, p0

    if-gtz p0, :cond_2

    .line 5
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p0, p0, 0x73

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 6
    :cond_3
    aget-object v0, p0, p3

    check-cast v0, Ljava/lang/String;

    aget-object p0, p0, p1

    check-cast p0, [Ljava/lang/StackTraceElement;

    .line 7
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v1, v1, 0x7b

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    if-nez p0, :cond_5

    add-int/lit8 v1, v1, 0x39

    rem-int/lit16 p0, v1, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/2addr v1, p2

    if-nez v1, :cond_4

    .line 8
    new-array p0, p3, [Ljava/lang/String;

    aput-object v0, p0, p1

    return-object p0

    :cond_4
    new-array p0, p1, [Ljava/lang/String;

    aput-object v0, p0, p3

    return-object p0

    .line 9
    :cond_5
    array-length v1, p0

    add-int/2addr v1, p1

    new-array v1, v1, [Ljava/lang/String;

    .line 10
    aput-object v0, v1, p3

    .line 11
    :goto_0
    array-length p3, p0

    if-ge p1, p3, :cond_7

    .line 12
    sget p3, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p3, p3, 0x49

    rem-int/lit16 v0, p3, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/2addr p3, p2

    if-nez p3, :cond_6

    .line 13
    aget-object p3, p0, p1

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    aput-object p3, v1, p1

    add-int/lit8 p1, p1, 0x32

    goto :goto_0

    :cond_6
    aget-object p3, p0, p1

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    aput-object p3, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_7
    return-object v1

    .line 14
    :cond_8
    aget-object p0, p0, p3

    check-cast p0, Lcom/appsflyer/internal/AFd1wSDK;

    .line 15
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x27

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 16
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object p0

    const-string p1, "participantInProxy"

    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;)V

    .line 17
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p0, p0, 0x3b

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    const/4 p0, 0x0

    return-object p0

    .line 18
    :cond_9
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1wSDK;->d([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private registerClient(Ljava/lang/String;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 34
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x58727eef

    const v2, -0x58727eee    # -3.92753E-15f

    invoke-static {p1, v1, v2, v0}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    return-object p1
.end method

.method private unregisterClient(Z)V
    .locals 2

    .line 9
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x79

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 10
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v0

    const-string v1, "participantInProxy"

    invoke-interface {v0, v1, p1}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;Z)V

    .line 11
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x59

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_0

    const/16 p1, 0x1f

    div-int/lit8 p1, p1, 0x0

    :cond_0
    return-void
.end method

.method private static v()Ljava/lang/String;
    .locals 2

    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x39

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    const-string v0, "7.0.1"

    return-object v0

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method private w()F
    .locals 3

    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x5b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->force:Ljava/security/SecureRandom;

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    const/16 v1, 0x48

    div-int/lit8 v1, v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->force:Ljava/security/SecureRandom;

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    :goto_0
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x21

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final AFKeystoreWrapper()V
    .locals 2

    .line 7
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x69

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->v:Z

    add-int/lit8 v0, v0, 0x47

    .line 9
    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method public final AFKeystoreWrapper(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    .line 4
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x7b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "server_response"

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    .line 5
    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v0, v2

    aput-object p3, v0, v2

    invoke-direct {p0, v1, p1, v0}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2, p3}, [Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 6
    :goto_0
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x77

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    const/16 p1, 0x34

    div-int/2addr p1, v2

    :cond_1
    return-void
.end method

.method public final AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x73

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 2
    const-string v0, "server_request"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 3
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x33

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public final AFLogger(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 16
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x73

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 17
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void

    :cond_0
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final AFLogger()Z
    .locals 3

    .line 1
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x17

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    move-result-object v0

    .line 3
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1hSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    .line 4
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    .line 5
    invoke-static {v0}, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1aSDK;)Lcom/appsflyer/internal/AFh1cSDK;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    move-result-object v1

    .line 7
    iget-object v1, v1, Lcom/appsflyer/internal/AFf1hSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    .line 8
    iget-object v1, v1, Lcom/appsflyer/internal/AFf1jSDK;->d:Lcom/appsflyer/internal/AFh1aSDK;

    .line 9
    invoke-static {v1}, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1aSDK;)Lcom/appsflyer/internal/AFh1cSDK;

    move-result-object v1

    .line 10
    invoke-direct {p0, v0, v1}, Lcom/appsflyer/internal/AFd1wSDK;->d(Lcom/appsflyer/internal/AFh1cSDK;Lcom/appsflyer/internal/AFh1cSDK;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v1, v1, 0x31

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    .line 12
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->e()V

    return v0

    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->e()V

    const/4 v0, 0x0

    throw v0

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient()V

    .line 14
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1wSDK;->d()V

    .line 15
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v1, v1, 0x19

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    return v0
.end method

.method public final declared-synchronized d()V
    .locals 8

    monitor-enter p0

    .line 1
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v0, 0x51

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 2
    iget-boolean v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z

    const/4 v2, 0x0

    if-nez v1, :cond_2

    add-int/lit8 v1, v0, 0x7b

    .line 3
    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v3, 0x50

    :try_start_1
    div-int/2addr v3, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_1

    .line 4
    :cond_0
    iget-boolean v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z

    if-nez v1, :cond_2

    :goto_0
    add-int/lit8 v0, v0, 0x11

    .line 5
    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    const/4 v0, 0x0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 6
    :cond_2
    :try_start_4
    iput-boolean v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z

    .line 7
    iput-boolean v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 8
    :try_start_5
    const-string v0, "r_debugging_off"

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy-MM-dd HH:mm:ssZ"

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v1, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 9
    :try_start_6
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x1f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    monitor-exit p0

    return-void

    :catchall_2
    move-exception v0

    move-object v4, v0

    .line 10
    :try_start_7
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PROXY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "Error while stopping remote debugger"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v5, 0x1

    invoke-virtual/range {v1 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 11
    monitor-exit p0

    return-void

    :goto_1
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw v0
.end method

.method public final varargs d(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .line 12
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x57

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "public_api_call"

    if-eqz v0, :cond_0

    .line 13
    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x61

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    return-void

    .line 15
    :cond_0
    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 16
    throw p1
.end method

.method public final i()Z
    .locals 2

    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x3d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    iget-boolean v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z

    add-int/lit8 v0, v0, 0x3f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    return v1
.end method

.method public final declared-synchronized registerClient()V
    .locals 1

    monitor-enter p0

    .line 29
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x33

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z

    .line 31
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient()V

    .line 32
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->afDebugLog()V

    .line 33
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x3f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final registerClient(Ljava/lang/Throwable;)V
    .locals 5

    .line 19
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 21
    sget v3, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v3, v3, 0x79

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_0

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    throw v2

    .line 24
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    :goto_0
    if-nez v0, :cond_2

    .line 25
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    .line 26
    :goto_1
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    long-to-int v0, v3

    const v3, -0x3c18d5b9

    const v4, 0x3c18d5bc

    invoke-static {p1, v3, v4, v0}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 27
    const-string v0, "exception"

    invoke-direct {p0, v0, v1, p1}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 28
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x11

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_3

    return-void

    :cond_3
    throw v2
.end method

.method public final declared-synchronized unregisterClient()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 3
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 6
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final v_(Ljava/lang/String;Landroid/content/pm/PackageManager;)V
    .locals 6

    sget p2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p2, p2, 0x49

    rem-int/lit16 v0, p2, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p2, p2, 0x2

    const v0, 0x62ff1f57

    const v1, -0x62ff1f55

    const v2, -0x58727eee    # -3.92753E-15f

    const v3, 0x58727eef

    if-nez p2, :cond_0

    :try_start_0
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p1, v3, v2, p2}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iget-object p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    invoke-static {v2, v1, v0, p2}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->unregisterClient()Lcom/appsflyer/internal/AFd1sSDK;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/appsflyer/internal/AFd1sSDK;->d(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1vSDK;

    move-result-object p1

    const/16 p2, 0x28

    div-int/lit8 p2, p2, 0x0

    if-nez p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v3, p1

    goto :goto_1

    :cond_0
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p1, v3, v2, p2}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iget-object p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    invoke-static {v2, v1, v0, p2}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->unregisterClient()Lcom/appsflyer/internal/AFd1sSDK;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/appsflyer/internal/AFd1sSDK;->d(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1vSDK;

    move-result-object p1

    if-nez p1, :cond_1

    :goto_0
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PROXY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Could not send proxy data: request is null"

    new-instance v3, Ljava/lang/NullPointerException;

    const-string p1, "request was null"

    invoke-direct {v3, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-void

    :cond_1
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    new-instance v0, Lcom/appsflyer/internal/e0;

    invoke-direct {v0, p1}, Lcom/appsflyer/internal/e0;-><init>(Lcom/appsflyer/internal/AFd1vSDK;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x11

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    return-void

    :goto_1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PROXY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v2, "Could not send proxy data"

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-void
.end method
