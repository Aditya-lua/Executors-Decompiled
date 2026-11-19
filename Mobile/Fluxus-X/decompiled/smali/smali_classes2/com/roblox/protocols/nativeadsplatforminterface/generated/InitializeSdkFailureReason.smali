.class public final enum Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

.field public static final enum ALREADYINITIALIZING:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

.field public static final enum NATIVESHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

.field public static final enum NOTINSTALLED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

.field public static final enum SHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

.field public static final enum TIMEDOUT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

.field public static final enum UNDEFINED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

.field public static final enum UNSUPPORTEDPLATFORM:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;
    .locals 7

    sget-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->UNDEFINED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    sget-object v1, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->UNSUPPORTEDPLATFORM:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    sget-object v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->NOTINSTALLED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    sget-object v3, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->ALREADYINITIALIZING:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    sget-object v4, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->TIMEDOUT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    sget-object v5, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->NATIVESHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    sget-object v6, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->SHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    filled-new-array/range {v0 .. v6}, [Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->UNDEFINED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    const-string v1, "UNSUPPORTEDPLATFORM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->UNSUPPORTEDPLATFORM:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    const-string v1, "NOTINSTALLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->NOTINSTALLED:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    const-string v1, "ALREADYINITIALIZING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->ALREADYINITIALIZING:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    const-string v1, "TIMEDOUT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->TIMEDOUT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    const-string v1, "NATIVESHUTTINGDOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->NATIVESHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    new-instance v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    const-string v1, "SHUTTINGDOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->SHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    invoke-static {}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->$values()[Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->$VALUES:[Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;
    .locals 1

    const-class v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->$VALUES:[Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    invoke-virtual {v0}, [Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;

    return-object v0
.end method
