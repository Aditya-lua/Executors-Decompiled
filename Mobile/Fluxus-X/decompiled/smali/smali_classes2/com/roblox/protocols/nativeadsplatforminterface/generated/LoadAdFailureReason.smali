.class public final enum Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum ADALREADYLOADED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum ADTRACINGIDABSENT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum ALREADYLOADING:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum CANCELED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum GENERATESIGNALFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum LOADFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum NATIVESHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum NOFILL:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum NOTINITIALIZED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum NOTINSTALLED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum SERVEADFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum SHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum TIMEDOUT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum UNDEFINED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

.field public static final enum UNSUPPORTEDPLATFORM:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;
    .locals 15

    sget-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->UNDEFINED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v1, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->UNSUPPORTEDPLATFORM:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NOTINSTALLED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v3, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NOTINITIALIZED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v4, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->ADTRACINGIDABSENT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v5, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->ADALREADYLOADED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v6, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->ALREADYLOADING:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v7, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->CANCELED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v8, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NOFILL:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v9, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->GENERATESIGNALFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v10, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->SERVEADFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v11, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->LOADFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v12, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->TIMEDOUT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v13, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NATIVESHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    sget-object v14, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->SHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    filled-new-array/range {v0 .. v14}, [Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->UNDEFINED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "UNSUPPORTEDPLATFORM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->UNSUPPORTEDPLATFORM:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "NOTINSTALLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NOTINSTALLED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "NOTINITIALIZED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NOTINITIALIZED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "ADTRACINGIDABSENT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->ADTRACINGIDABSENT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "ADALREADYLOADED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->ADALREADYLOADED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "ALREADYLOADING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->ALREADYLOADING:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "CANCELED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->CANCELED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "NOFILL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NOFILL:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "GENERATESIGNALFAILED"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->GENERATESIGNALFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "SERVEADFAILED"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->SERVEADFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "LOADFAILED"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->LOADFAILED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "TIMEDOUT"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->TIMEDOUT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "NATIVESHUTTINGDOWN"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NATIVESHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v1, "SHUTTINGDOWN"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->SHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    invoke-static {}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->$values()[Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->$VALUES:[Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;
    .locals 1

    const-class v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->$VALUES:[Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    invoke-virtual {v0}, [Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    return-object v0
.end method
