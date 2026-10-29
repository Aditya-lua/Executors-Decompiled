.class public final enum Lcom/appsflyer/share/MediationNetwork;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/share/MediationNetwork;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0015\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017"
    }
    d2 = {
        "Lcom/appsflyer/share/MediationNetwork;",
        "",
        "",
        "p0",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "value",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "IRONSOURCE",
        "APPLOVIN_MAX",
        "GOOGLE_ADMOB",
        "FYBER",
        "APPODEAL",
        "ADMOST",
        "TOPON",
        "TRADPLUS",
        "YANDEX",
        "CHARTBOOST",
        "UNITY",
        "TOPON_PTE",
        "CUSTOM_MEDIATION",
        "DIRECT_MONETIZATION_NETWORK"
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
.field public static final enum ADMOST:Lcom/appsflyer/share/MediationNetwork;

.field private static final synthetic AFLogger:Lqt/a;

.field public static final enum APPLOVIN_MAX:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum APPODEAL:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum CHARTBOOST:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum CUSTOM_MEDIATION:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum DIRECT_MONETIZATION_NETWORK:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum FYBER:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum GOOGLE_ADMOB:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum IRONSOURCE:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum TOPON:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum TOPON_PTE:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum TRADPLUS:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum UNITY:Lcom/appsflyer/share/MediationNetwork;

.field public static final enum YANDEX:Lcom/appsflyer/share/MediationNetwork;

.field private static final synthetic unregisterClient:[Lcom/appsflyer/share/MediationNetwork;


# instance fields
.field private final value:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lcom/appsflyer/share/MediationNetwork;

    const/4 v1, 0x0

    const-string v2, "ironsource"

    const-string v3, "IRONSOURCE"

    invoke-direct {v0, v3, v1, v2}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/share/MediationNetwork;->IRONSOURCE:Lcom/appsflyer/share/MediationNetwork;

    new-instance v1, Lcom/appsflyer/share/MediationNetwork;

    const/4 v2, 0x1

    const-string v3, "applovinmax"

    const-string v4, "APPLOVIN_MAX"

    invoke-direct {v1, v4, v2, v3}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/appsflyer/share/MediationNetwork;->APPLOVIN_MAX:Lcom/appsflyer/share/MediationNetwork;

    new-instance v2, Lcom/appsflyer/share/MediationNetwork;

    const/4 v3, 0x2

    const-string v4, "googleadmob"

    const-string v5, "GOOGLE_ADMOB"

    invoke-direct {v2, v5, v3, v4}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/appsflyer/share/MediationNetwork;->GOOGLE_ADMOB:Lcom/appsflyer/share/MediationNetwork;

    new-instance v3, Lcom/appsflyer/share/MediationNetwork;

    const/4 v4, 0x3

    const-string v5, "fyber"

    const-string v6, "FYBER"

    invoke-direct {v3, v6, v4, v5}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/appsflyer/share/MediationNetwork;->FYBER:Lcom/appsflyer/share/MediationNetwork;

    new-instance v4, Lcom/appsflyer/share/MediationNetwork;

    const/4 v5, 0x4

    const-string v6, "appodeal"

    const-string v7, "APPODEAL"

    invoke-direct {v4, v7, v5, v6}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/appsflyer/share/MediationNetwork;->APPODEAL:Lcom/appsflyer/share/MediationNetwork;

    new-instance v5, Lcom/appsflyer/share/MediationNetwork;

    const/4 v6, 0x5

    const-string v7, "Admost"

    const-string v8, "ADMOST"

    invoke-direct {v5, v8, v6, v7}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/appsflyer/share/MediationNetwork;->ADMOST:Lcom/appsflyer/share/MediationNetwork;

    new-instance v6, Lcom/appsflyer/share/MediationNetwork;

    const/4 v7, 0x6

    const-string v8, "Topon"

    const-string v9, "TOPON"

    invoke-direct {v6, v9, v7, v8}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/appsflyer/share/MediationNetwork;->TOPON:Lcom/appsflyer/share/MediationNetwork;

    new-instance v7, Lcom/appsflyer/share/MediationNetwork;

    const/4 v8, 0x7

    const-string v9, "Tradplus"

    const-string v10, "TRADPLUS"

    invoke-direct {v7, v10, v8, v9}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lcom/appsflyer/share/MediationNetwork;->TRADPLUS:Lcom/appsflyer/share/MediationNetwork;

    new-instance v8, Lcom/appsflyer/share/MediationNetwork;

    const/16 v9, 0x8

    const-string v10, "Yandex"

    const-string v11, "YANDEX"

    invoke-direct {v8, v11, v9, v10}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lcom/appsflyer/share/MediationNetwork;->YANDEX:Lcom/appsflyer/share/MediationNetwork;

    new-instance v9, Lcom/appsflyer/share/MediationNetwork;

    const/16 v10, 0x9

    const-string v11, "chartboost"

    const-string v12, "CHARTBOOST"

    invoke-direct {v9, v12, v10, v11}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lcom/appsflyer/share/MediationNetwork;->CHARTBOOST:Lcom/appsflyer/share/MediationNetwork;

    new-instance v10, Lcom/appsflyer/share/MediationNetwork;

    const/16 v11, 0xa

    const-string v12, "Unity"

    const-string v13, "UNITY"

    invoke-direct {v10, v13, v11, v12}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lcom/appsflyer/share/MediationNetwork;->UNITY:Lcom/appsflyer/share/MediationNetwork;

    new-instance v11, Lcom/appsflyer/share/MediationNetwork;

    const/16 v12, 0xb

    const-string v13, "toponpte"

    const-string v14, "TOPON_PTE"

    invoke-direct {v11, v14, v12, v13}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lcom/appsflyer/share/MediationNetwork;->TOPON_PTE:Lcom/appsflyer/share/MediationNetwork;

    new-instance v12, Lcom/appsflyer/share/MediationNetwork;

    const/16 v13, 0xc

    const-string v14, "customMediation"

    const-string v15, "CUSTOM_MEDIATION"

    invoke-direct {v12, v15, v13, v14}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lcom/appsflyer/share/MediationNetwork;->CUSTOM_MEDIATION:Lcom/appsflyer/share/MediationNetwork;

    new-instance v13, Lcom/appsflyer/share/MediationNetwork;

    const/16 v14, 0xd

    const-string v15, "directMonetizationNetwork"

    move-object/from16 v16, v0

    const-string v0, "DIRECT_MONETIZATION_NETWORK"

    invoke-direct {v13, v0, v14, v15}, Lcom/appsflyer/share/MediationNetwork;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lcom/appsflyer/share/MediationNetwork;->DIRECT_MONETIZATION_NETWORK:Lcom/appsflyer/share/MediationNetwork;

    move-object/from16 v0, v16

    filled-new-array/range {v0 .. v13}, [Lcom/appsflyer/share/MediationNetwork;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/share/MediationNetwork;->unregisterClient:[Lcom/appsflyer/share/MediationNetwork;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/share/MediationNetwork;->AFLogger:Lqt/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/appsflyer/share/MediationNetwork;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lcom/appsflyer/share/MediationNetwork;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/appsflyer/share/MediationNetwork;->AFLogger:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/share/MediationNetwork;
    .locals 1

    const-class v0, Lcom/appsflyer/share/MediationNetwork;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/share/MediationNetwork;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/share/MediationNetwork;
    .locals 1

    sget-object v0, Lcom/appsflyer/share/MediationNetwork;->unregisterClient:[Lcom/appsflyer/share/MediationNetwork;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/share/MediationNetwork;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/share/MediationNetwork;->value:Ljava/lang/String;

    return-object v0
.end method
