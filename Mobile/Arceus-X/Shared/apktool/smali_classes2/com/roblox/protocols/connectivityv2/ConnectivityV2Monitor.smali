.class public final Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;
.super Lcom/roblox/protocols/connectivityv2platforminterface/generated/IPlatformConnectivityV2;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;,
        Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002JKB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0007\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0003J3\u0010\u0019\u001a\u00020\u000b2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0016*\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u0016*\u00020 H\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u001b\u0010%\u001a\u0004\u0018\u00010$*\u0008\u0012\u0004\u0012\u00020$0#H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u001b\u0010\'\u001a\u0004\u0018\u00010$*\u0008\u0012\u0004\u0012\u00020$0#H\u0002\u00a2\u0006\u0004\u0008\'\u0010&J\u0013\u0010)\u001a\u00020\u0016*\u00020(H\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008+\u0010\u0003J\u000f\u0010,\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008,\u0010\u0003J#\u00100\u001a\u00020-2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001\u00a2\u0006\u0004\u0008.\u0010/J-\u00104\u001a\u0002012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u00082\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0016\u0010H\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010I\u00a8\u0006L"
    }
    d2 = {
        "Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;",
        "Lcom/roblox/protocols/connectivityv2platforminterface/generated/IPlatformConnectivityV2;",
        "<init>",
        "()V",
        "T",
        "Lkotlin/Function0;",
        "action",
        "withMonitorLock",
        "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;",
        "Landroid/content/Context;",
        "context",
        "",
        "setup",
        "(Landroid/content/Context;)V",
        "registerDataSaverReceiver",
        "unregisterDataSaverReceiver",
        "reportCurrentNetwork",
        "reportNoNetwork",
        "Landroid/net/NetworkCapabilities;",
        "capabilities",
        "Landroid/net/LinkProperties;",
        "linkProperties",
        "",
        "dataSaverEnabled",
        "meteringEnabled",
        "reportNetwork",
        "(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;ZZ)V",
        "Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;",
        "interfaceType",
        "(Landroid/net/NetworkCapabilities;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;",
        "isMetered",
        "(Landroid/net/NetworkCapabilities;)Z",
        "Landroid/net/ConnectivityManager;",
        "isDataSaverEnabled",
        "(Landroid/net/ConnectivityManager;)Z",
        "",
        "Landroid/net/LinkAddress;",
        "firstUsableIpv4",
        "(Ljava/util/List;)Landroid/net/LinkAddress;",
        "firstUsableIpv6",
        "Ljava/net/InetAddress;",
        "isUsableAddress",
        "(Ljava/net/InetAddress;)Z",
        "startMonitoring",
        "stopMonitoring",
        "Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;",
        "buildReportLegacy$universalapp_googleProdRelease",
        "(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;",
        "buildReportLegacy",
        "Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;",
        "buildReportV2$universalapp_googleProdRelease",
        "(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;Z)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;",
        "buildReportV2",
        "",
        "TAG",
        "Ljava/lang/String;",
        "Luu/a;",
        "monitorMutex",
        "Luu/a;",
        "applicationContext",
        "Landroid/content/Context;",
        "connectivityManager",
        "Landroid/net/ConnectivityManager;",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "networkCallback",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "Landroid/content/BroadcastReceiver;",
        "dataSaverReceiver",
        "Landroid/content/BroadcastReceiver;",
        "Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;",
        "coreListener",
        "Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;",
        "setupInProgress",
        "Z",
        "b",
        "a",
        "universalapp_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "ConnectivityV2Monitor"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static applicationContext:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static connectivityManager:Landroid/net/ConnectivityManager;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static coreListener:Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static dataSaverReceiver:Landroid/content/BroadcastReceiver;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static final monitorMutex:Luu/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static setupInProgress:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;

    invoke-direct {v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;-><init>()V

    sput-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->INSTANCE:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Luu/g;->b(ZILjava/lang/Object;)Luu/a;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->monitorMutex:Luu/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/IPlatformConnectivityV2;-><init>()V

    return-void
.end method

.method public static synthetic a()Landroid/net/ConnectivityManager;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->reportCurrentNetwork$lambda$0()Landroid/net/ConnectivityManager;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getMonitorMutex$p()Luu/a;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->monitorMutex:Luu/a;

    return-object v0
.end method

.method public static final synthetic access$reportCurrentNetwork(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->reportCurrentNetwork()V

    return-void
.end method

.method public static final synthetic access$reportNoNetwork(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->reportNoNetwork()V

    return-void
.end method

.method public static synthetic b(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->startMonitoring$lambda$1(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic buildReportV2$universalapp_googleProdRelease$default(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;ZILjava/lang/Object;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->buildReportV2$universalapp_googleProdRelease(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;Z)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setup$lambda$0(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d()Lkotlin/Pair;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->startMonitoring$lambda$0()Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setup$lambda$1()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lkotlin/Pair;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->registerDataSaverReceiver$lambda$0()Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method

.method private final firstUsableIpv4(Ljava/util/List;)Landroid/net/LinkAddress;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/net/LinkAddress;",
            ">;)",
            "Landroid/net/LinkAddress;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/LinkAddress;

    invoke-virtual {v1}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    instance-of v2, v1, Ljava/net/Inet4Address;

    if-eqz v2, :cond_0

    sget-object v2, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->INSTANCE:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;

    invoke-direct {v2, v1}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->isUsableAddress(Ljava/net/InetAddress;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Landroid/net/LinkAddress;

    return-object v0
.end method

.method private final firstUsableIpv6(Ljava/util/List;)Landroid/net/LinkAddress;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/net/LinkAddress;",
            ">;)",
            "Landroid/net/LinkAddress;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/LinkAddress;

    invoke-virtual {v1}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    instance-of v2, v1, Ljava/net/Inet6Address;

    if-eqz v2, :cond_0

    sget-object v2, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->INSTANCE:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;

    invoke-direct {v2, v1}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->isUsableAddress(Ljava/net/InetAddress;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Landroid/net/LinkAddress;

    return-object v0
.end method

.method public static synthetic g(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->registerDataSaverReceiver$lambda$1(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setup$lambda$2(Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Lkotlin/Pair;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->unregisterDataSaverReceiver$lambda$0()Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method

.method private final interfaceType(Landroid/net/NetworkCapabilities;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->WIFI:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->CELLULAR:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    return-object p1

    :cond_1
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->WIRED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    return-object p1

    :cond_2
    sget-object p1, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->UNKNOWN:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    return-object p1
.end method

.method private final isDataSaverEnabled(Landroid/net/ConnectivityManager;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getRestrictBackgroundStatus()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isMetered(Landroid/net/NetworkCapabilities;)Z
    .locals 3

    const/16 v0, 0xb

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_1

    const/16 v0, 0x19

    invoke-virtual {p1, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private final isUsableAddress(Ljava/net/InetAddress;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic j()Lkotlin/Pair;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->stopMonitoring$lambda$0()Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method

.method private final registerDataSaverReceiver()V
    .locals 4

    new-instance v0, Lhl/e;

    invoke-direct {v0}, Lhl/e;-><init>()V

    invoke-direct {p0, v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;

    :try_start_0
    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.RESTRICT_BACKGROUND_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x4

    invoke-static {v1, v0, v2, v3}, Ll2/b;->m(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    new-instance v2, Lhl/f;

    invoke-direct {v2, v0}, Lhl/f;-><init>(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;)V

    invoke-direct {p0, v2}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    const-string v0, "ConnectivityV2Monitor"

    const-string v2, "Unable to register Data Saver receiver"

    invoke-static {v0, v2, v1}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method private static final registerDataSaverReceiver$lambda$0()Lkotlin/Pair;
    .locals 3

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->applicationContext:Landroid/content/Context;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->dataSaverReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;

    sget-object v2, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->INSTANCE:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;

    invoke-direct {v1, v2}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;-><init>(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;)V

    sput-object v1, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->dataSaverReceiver:Landroid/content/BroadcastReceiver;

    invoke-static {v0, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static final registerDataSaverReceiver$lambda$1(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->dataSaverReceiver:Landroid/content/BroadcastReceiver;

    if-ne v0, p0, :cond_0

    const/4 p0, 0x0

    sput-object p0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->dataSaverReceiver:Landroid/content/BroadcastReceiver;

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private final reportCurrentNetwork()V
    .locals 4

    new-instance v0, Lhl/d;

    invoke-direct {v0}, Lhl/d;-><init>()V

    invoke-direct {p0, v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    move-result-object v2

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->A()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {p0, v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->isDataSaverEnabled(Landroid/net/ConnectivityManager;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-direct {p0, v3, v2, v0, v1}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->reportNetwork(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;ZZ)V

    return-void
.end method

.method private static final reportCurrentNetwork$lambda$0()Landroid/net/ConnectivityManager;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->connectivityManager:Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method private final reportNetwork(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;ZZ)V
    .locals 0

    if-eqz p4, :cond_0

    sget-object p4, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->coreListener:Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;

    if-eqz p4, :cond_1

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->buildReportV2$universalapp_googleProdRelease(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;Z)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;->reportNetworkChangedV2(Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;)V

    return-void

    :cond_0
    sget-object p3, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->coreListener:Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->buildReportLegacy$universalapp_googleProdRelease(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;->reportNetworkChanged(Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;)V

    :cond_1
    return-void
.end method

.method private final reportNoNetwork()V
    .locals 3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->A()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v1, v1, v2, v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->reportNetwork(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;ZZ)V

    return-void
.end method

.method public static final setup(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->INSTANCE:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;

    new-instance v1, Lhl/a;

    invoke-direct {v1, p0}, Lhl/a;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {v0}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;->setPlatformImpl(Lcom/roblox/protocols/connectivityv2platforminterface/generated/IPlatformConnectivityV2;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Lhl/c;

    invoke-direct {v1, p0}, Lhl/c;-><init>(Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;)V

    invoke-direct {v0, v1}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->startMonitoring()V

    return-void

    :catch_0
    move-exception p0

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->INSTANCE:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;

    new-instance v1, Lhl/b;

    invoke-direct {v1}, Lhl/b;-><init>()V

    invoke-direct {v0, v1}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    throw p0
.end method

.method private static final setup$lambda$0(Landroid/content/Context;)Z
    .locals 1

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->coreListener:Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setupInProgress:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setupInProgress:Z

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->applicationContext:Landroid/content/Context;

    return v0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final setup$lambda$1()Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setupInProgress:Z

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method private static final setup$lambda$2(Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setupInProgress:Z

    sput-object p0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->coreListener:Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final startMonitoring$lambda$0()Lkotlin/Pair;
    .locals 3

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->applicationContext:Landroid/content/Context;

    if-eqz v0, :cond_1

    const-class v2, Landroid/net/ConnectivityManager;

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "ConnectivityV2Monitor"

    const-string v2, "ConnectivityManager unavailable"

    invoke-static {v0, v2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_2
    new-instance v1, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;

    sget-object v2, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->INSTANCE:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;

    invoke-direct {v1, v2}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;-><init>(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;)V

    sput-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->connectivityManager:Landroid/net/ConnectivityManager;

    sput-object v1, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-static {v0, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method

.method private static final startMonitoring$lambda$1(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    if-ne v0, p0, :cond_0

    const/4 p0, 0x0

    sput-object p0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    sput-object p0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->connectivityManager:Landroid/net/ConnectivityManager;

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final stopMonitoring$lambda$0()Lkotlin/Pair;
    .locals 3

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->connectivityManager:Landroid/net/ConnectivityManager;

    sget-object v1, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sput-object v2, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->connectivityManager:Landroid/net/ConnectivityManager;

    sput-object v2, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->networkCallback:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-static {v0, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    return-object v2
.end method

.method private final unregisterDataSaverReceiver()V
    .locals 2

    new-instance v0, Lhl/g;

    invoke-direct {v0}, Lhl/g;-><init>()V

    invoke-direct {p0, v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/BroadcastReceiver;

    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "ConnectivityV2Monitor"

    const-string v1, "Data Saver receiver was already unregistered"

    invoke-static {v0, v1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final unregisterDataSaverReceiver$lambda$0()Lkotlin/Pair;
    .locals 3

    sget-object v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->applicationContext:Landroid/content/Context;

    sget-object v1, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->dataSaverReceiver:Landroid/content/BroadcastReceiver;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sput-object v2, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->dataSaverReceiver:Landroid/content/BroadcastReceiver;

    invoke-static {v0, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    return-object v2
.end method

.method private final withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)TT;"
        }
    .end annotation

    new-instance v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$c;-><init>(Lkotlin/jvm/functions/Function0;Lnt/b;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, Lku/i;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final buildReportLegacy$universalapp_googleProdRelease(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;
    .locals 11
    .param p1    # Landroid/net/NetworkCapabilities;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/net/LinkProperties;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    const/16 v1, 0xc

    invoke-virtual {p1, v1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_8

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/net/LinkProperties;->getLinkAddresses()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v2}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->firstUsableIpv4(Ljava/util/List;)Landroid/net/LinkAddress;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/net/LinkProperties;->getLinkAddresses()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-direct {p0, p2}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->firstUsableIpv6(Ljava/util/List;)Landroid/net/LinkAddress;

    move-result-object v1

    :cond_1
    new-instance v3, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;

    invoke-direct {p0, p1}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->interfaceType(Landroid/net/NetworkCapabilities;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    move-result-object v4

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v5, p2

    goto :goto_3

    :cond_3
    :goto_2
    new-array p2, v0, [B

    goto :goto_1

    :goto_3
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_5

    :cond_4
    :goto_4
    move-object v6, p2

    goto :goto_6

    :cond_5
    :goto_5
    new-array p2, v0, [B

    goto :goto_4

    :goto_6
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/net/LinkAddress;->getPrefixLength()I

    move-result v0

    :cond_6
    move v7, v0

    const/16 p2, 0x10

    invoke-virtual {p1, p2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->VALIDATED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    :goto_7
    move-object v9, p1

    goto :goto_8

    :cond_7
    sget-object p1, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->NOTVALIDATED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    goto :goto_7

    :goto_8
    const/4 v8, 0x1

    invoke-direct/range {v3 .. v9}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;-><init>(Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;[B[BIZLcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;)V

    return-object v3

    :cond_8
    new-instance v4, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;

    sget-object v5, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->NONE:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    new-array v6, v0, [B

    new-array v7, v0, [B

    const/4 v9, 0x0

    sget-object v10, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->UNKNOWN:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;-><init>(Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;[B[BIZLcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;)V

    return-object v4
.end method

.method public final buildReportV2$universalapp_googleProdRelease(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;Z)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;
    .locals 10
    .param p1    # Landroid/net/NetworkCapabilities;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/net/LinkProperties;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->buildReportLegacy$universalapp_googleProdRelease(Landroid/net/NetworkCapabilities;Landroid/net/LinkProperties;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;

    move-result-object p2

    new-instance v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;

    invoke-virtual {p2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;->getInterfaceType()Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    move-result-object v1

    invoke-virtual {p2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;->getIpv4()[B

    move-result-object v2

    invoke-virtual {p2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;->getIpv6()[B

    move-result-object v3

    invoke-virtual {p2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;->getIpv6PrefixLength()I

    move-result v4

    invoke-virtual {p2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;->getPathSatisfied()Z

    move-result v5

    invoke-virtual {p2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;->getValidation()Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    move-result-object v6

    invoke-virtual {p2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;->getPathSatisfied()Z

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v7, :cond_0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->isMetered(Landroid/net/NetworkCapabilities;)Z

    move-result p1

    if-ne p1, v9, :cond_0

    move v7, v9

    goto :goto_0

    :cond_0
    move v7, v8

    :goto_0
    invoke-virtual {p2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;->getPathSatisfied()Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz p3, :cond_1

    move v8, v9

    :cond_1
    invoke-direct/range {v0 .. v8}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;-><init>(Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;[B[BIZLcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;ZZ)V

    return-object v0
.end method

.method public startMonitoring()V
    .locals 3

    new-instance v0, Lhl/h;

    invoke-direct {v0}, Lhl/h;-><init>()V

    invoke-direct {p0, v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;

    :try_start_0
    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->registerDataSaverReceiver()V

    :cond_1
    invoke-direct {p0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->reportCurrentNetwork()V

    return-void

    :catch_0
    move-exception v1

    new-instance v2, Lhl/i;

    invoke-direct {v2, v0}, Lhl/i;-><init>(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;)V

    invoke-direct {p0, v2}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    const-string v0, "ConnectivityV2Monitor"

    const-string v2, "Unable to register default network callback"

    invoke-static {v0, v2, v1}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public stopMonitoring()V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->unregisterDataSaverReceiver()V

    :cond_0
    new-instance v0, Lhl/j;

    invoke-direct {v0}, Lhl/j;-><init>()V

    invoke-direct {p0, v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->withMonitorLock(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager$NetworkCallback;

    :try_start_0
    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "ConnectivityV2Monitor"

    const-string v1, "Default network callback was already unregistered"

    invoke-static {v0, v1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
