.class public final enum Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008"
    }
    d2 = {
        "Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "BANNER",
        "INTERSTITIAL",
        "NATIVE",
        "REWARDED",
        "APP_OPEN"
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
.field private static final synthetic AFLogger:[Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

.field public static final enum APP_OPEN:Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

.field public static final enum BANNER:Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

.field public static final enum INTERSTITIAL:Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

.field public static final enum NATIVE:Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

.field public static final enum REWARDED:Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

.field private static final synthetic registerClient:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    const-string v1, "BANNER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;->BANNER:Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    new-instance v1, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    const-string v2, "INTERSTITIAL"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;->INTERSTITIAL:Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    new-instance v2, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    const-string v3, "NATIVE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;->NATIVE:Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    new-instance v3, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    const-string v4, "REWARDED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;->REWARDED:Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    new-instance v4, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    const-string v5, "APP_OPEN"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;->APP_OPEN:Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;->AFLogger:[Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;->registerClient:Lqt/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;->registerClient:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;
    .locals 1

    const-class v0, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;
    .locals 1

    sget-object v0, Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;->AFLogger:[Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;

    return-object v0
.end method
