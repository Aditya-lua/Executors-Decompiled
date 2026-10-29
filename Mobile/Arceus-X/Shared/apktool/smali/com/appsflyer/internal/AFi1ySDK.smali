.class public abstract Lcom/appsflyer/internal/AFi1ySDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFi1ySDK$AFa1uSDK;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\'\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0017\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0018H\u0005\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0005\u00a2\u0006\u0004\u0008\u001b\u0010\u0008R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001cR\u001e\u0010\r\u001a\u0004\u0018\u00010\u001e8\u0005@\u0004X\u0085\u000c\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\"8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010#"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFi1ySDK;",
        "",
        "Landroid/content/Context;",
        "p0",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "AFLogger",
        "()Ljava/lang/String;",
        "",
        "registerClient",
        "()Z",
        "Lcom/appsflyer/internal/AFi1xSDK;",
        "unregisterClient",
        "()Lcom/appsflyer/internal/AFi1xSDK;",
        "Lcom/appsflyer/internal/AFi1rSDK;",
        "AFKeystoreWrapper",
        "()Lcom/appsflyer/internal/AFi1rSDK;",
        "Landroid/net/NetworkCapabilities;",
        "L_",
        "()Landroid/net/NetworkCapabilities;",
        "Landroid/net/Network;",
        "K_",
        "()Landroid/net/Network;",
        "Lkotlin/Pair;",
        "v",
        "()Lkotlin/Pair;",
        "e",
        "Landroid/content/Context;",
        "d",
        "Landroid/net/ConnectivityManager;",
        "Landroid/net/ConnectivityManager;",
        "E_",
        "()Landroid/net/ConnectivityManager;",
        "Landroid/telephony/TelephonyManager;",
        "Landroid/telephony/TelephonyManager;",
        "AFa1uSDK"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AFa1uSDK:Lcom/appsflyer/internal/AFi1ySDK$AFa1uSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final AFLogger:Landroid/telephony/TelephonyManager;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private d:Landroid/net/ConnectivityManager;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final registerClient:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/appsflyer/internal/AFi1ySDK$AFa1uSDK;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFi1ySDK$AFa1uSDK;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/appsflyer/internal/AFi1ySDK;->AFa1uSDK:Lcom/appsflyer/internal/AFi1ySDK$AFa1uSDK;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFi1ySDK;->registerClient:Landroid/content/Context;

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/net/ConnectivityManager;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/net/ConnectivityManager;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    iput-object v0, p0, Lcom/appsflyer/internal/AFi1ySDK;->d:Landroid/net/ConnectivityManager;

    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_1

    move-object v2, p1

    check-cast v2, Landroid/telephony/TelephonyManager;

    :cond_1
    iput-object v2, p0, Lcom/appsflyer/internal/AFi1ySDK;->AFLogger:Landroid/telephony/TelephonyManager;

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 12
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1ySDK;->AFLogger:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDataState()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UNKNOWN("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    move-object v5, v0

    goto :goto_0

    :cond_0
    const-string v0, "SUSPENDED"

    return-object v0

    :cond_1
    const-string v0, "CONNECTED"

    return-object v0

    :cond_2
    const-string v0, "CONNECTING"

    return-object v0

    :cond_3
    const-string v0, "DISCONNECTED"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :cond_4
    return-object v1

    :goto_0
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v10, 0x78

    const/4 v11, 0x0

    const-string v4, "Exception while collecting data state. "

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    return-object v1
.end method

.method private v()Lkotlin/Pair;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1ySDK;->d:Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, v1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v5, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v0, Lkotlin/Pair;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v2, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Lkotlin/Pair;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v2, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_2
    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v2

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0

    new-instance v3, Lkotlin/Pair;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v3, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v3

    :goto_0
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v10, 0x78

    const/4 v11, 0x0

    const-string v4, "Exception while collecting internet capabilities. "

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, v1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFi1rSDK;
    .locals 15
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->unregisterClient()Lcom/appsflyer/internal/AFi1xSDK;

    move-result-object v0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFi1ySDK;->v()Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/Boolean;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFi1ySDK;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->L_()Landroid/net/NetworkCapabilities;

    move-result-object v1

    const/16 v2, 0xf

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x4

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    const-string v10, ""

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v1, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v1, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v10

    if-eqz v10, :cond_0

    const-string v1, "WIFI"

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "MOBILE"

    goto :goto_0

    :cond_1
    const-string v1, "UNKNOWN"

    goto :goto_0

    :cond_2
    move-object v1, v9

    :goto_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->L_()Landroid/net/NetworkCapabilities;

    move-result-object v10

    if-nez v10, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v10, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-virtual {v10, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v10

    if-nez v10, :cond_7

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->K_()Landroid/net/Network;

    move-result-object v10

    if-eqz v10, :cond_7

    iget-object v11, p0, Lcom/appsflyer/internal/AFi1ySDK;->d:Landroid/net/ConnectivityManager;

    if-eqz v11, :cond_4

    invoke-virtual {v11, v10}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    move-result-object v10

    goto :goto_1

    :cond_4
    move-object v10, v9

    :goto_1
    if-eqz v10, :cond_7

    invoke-virtual {v10}, Landroid/net/LinkProperties;->getLinkAddresses()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_7

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Landroid/net/LinkAddress;

    invoke-virtual {v12}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v12

    invoke-virtual {v12}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v12

    if-nez v12, :cond_5

    goto :goto_2

    :cond_6
    move-object v11, v9

    :goto_2
    check-cast v11, Landroid/net/LinkAddress;

    if-eqz v11, :cond_7

    invoke-virtual {v11}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v10

    if-eqz v10, :cond_7

    invoke-virtual {v10}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v10

    goto :goto_4

    :cond_7
    :goto_3
    move-object v10, v9

    :goto_4
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1c

    if-ge v11, v12, :cond_8

    new-instance v2, Lkotlin/Pair;

    invoke-direct {v2, v9, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_8
    iget-object v11, p0, Lcom/appsflyer/internal/AFi1ySDK;->d:Landroid/net/ConnectivityManager;

    if-nez v11, :cond_9

    move-object v12, v9

    goto/16 :goto_9

    :cond_9
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->K_()Landroid/net/Network;

    move-result-object v12

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->L_()Landroid/net/NetworkCapabilities;

    move-result-object v13

    if-eqz v12, :cond_a

    invoke-virtual {v11, v12}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    move-result-object v12

    goto :goto_5

    :cond_a
    move-object v12, v9

    :goto_5
    if-eqz v12, :cond_b

    invoke-virtual {v12}, Landroid/net/LinkProperties;->getPrivateDnsServerName()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_b

    invoke-static {v14}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v14

    xor-int/2addr v14, v4

    if-ne v14, v4, :cond_b

    goto :goto_6

    :cond_b
    move v4, v3

    :goto_6
    if-eqz v12, :cond_c

    if-eqz v13, :cond_11

    invoke-virtual {v13, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v14

    if-eqz v14, :cond_11

    invoke-virtual {v13, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v14

    if-nez v14, :cond_11

    if-eqz v4, :cond_c

    goto :goto_9

    :cond_c
    if-eqz v13, :cond_11

    invoke-virtual {v13, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v13, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v2

    if-nez v2, :cond_11

    invoke-virtual {v11}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    move-result-object v2

    if-nez v2, :cond_d

    new-array v2, v3, [Landroid/net/Network;

    :cond_d
    array-length v4, v2

    :goto_7
    if-ge v3, v4, :cond_11

    aget-object v13, v2, v3

    invoke-virtual {v11, v13}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v14

    if-nez v14, :cond_e

    goto :goto_8

    :cond_e
    invoke-virtual {v14, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v14

    if-nez v14, :cond_10

    invoke-virtual {v11, v13}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    move-result-object v13

    if-nez v13, :cond_f

    goto :goto_8

    :cond_f
    move-object v12, v13

    goto :goto_9

    :cond_10
    :goto_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_11
    :goto_9
    if-nez v12, :cond_12

    new-instance v2, Lkotlin/Pair;

    invoke-direct {v2, v9, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v12}, Landroid/net/LinkProperties;->getPrivateDnsServerName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_13

    invoke-static {v2}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_13

    move-object v9, v2

    :cond_13
    invoke-virtual {v12}, Landroid/net/LinkProperties;->isPrivateDnsActive()Z

    move-result v2

    new-instance v3, Lkotlin/Pair;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v3, v9, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v3

    :goto_a
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/Boolean;

    new-instance v3, Lcom/appsflyer/internal/AFi1rSDK;

    iget-object v4, v0, Lcom/appsflyer/internal/AFi1xSDK;->unregisterClient:Ljava/lang/String;

    iget-boolean v5, v0, Lcom/appsflyer/internal/AFi1xSDK;->d:Z

    move-object v9, v1

    invoke-direct/range {v3 .. v12}, Lcom/appsflyer/internal/AFi1rSDK;-><init>(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v3
.end method

.method public abstract AFLogger()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final E_()Landroid/net/ConnectivityManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFi1ySDK;->d:Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method public K_()Landroid/net/Network;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public L_()Landroid/net/NetworkCapabilities;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract registerClient()Z
.end method

.method public final unregisterClient()Lcom/appsflyer/internal/AFi1xSDK;
    .locals 12
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1ySDK;->AFLogger:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v2

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_2

    const-string v0, "CDMA"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    goto :goto_1

    :cond_1
    move-object v2, v1

    goto :goto_3

    :goto_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DEVICE_DATA:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v10, 0x78

    const/4 v11, 0x0

    const-string v4, "Exception while collecting network info"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    move-object v2, v1

    :goto_2
    move-object v1, v0

    :cond_2
    :goto_3
    new-instance v0, Lcom/appsflyer/internal/AFi1xSDK;

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->AFLogger()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->registerClient()Z

    move-result v4

    invoke-direct {v0, v3, v1, v2, v4}, Lcom/appsflyer/internal/AFi1xSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method
