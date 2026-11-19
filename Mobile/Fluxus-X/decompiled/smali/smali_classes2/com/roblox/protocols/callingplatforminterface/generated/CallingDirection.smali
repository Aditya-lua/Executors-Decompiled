.class public final enum Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

.field public static final enum INCOMING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

.field public static final enum OUTGOING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;
    .locals 2

    sget-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;->OUTGOING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    sget-object v1, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;->INCOMING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    filled-new-array {v0, v1}, [Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    const-string v1, "OUTGOING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;->OUTGOING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    const-string v1, "INCOMING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;->INCOMING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    invoke-static {}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;->$values()[Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;->$VALUES:[Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;
    .locals 1

    const-class v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;->$VALUES:[Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    invoke-virtual {v0}, [Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/callingplatforminterface/generated/CallingDirection;

    return-object v0
.end method
