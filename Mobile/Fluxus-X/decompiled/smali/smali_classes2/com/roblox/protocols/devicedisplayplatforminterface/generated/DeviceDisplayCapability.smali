.class public final enum Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

.field public static final enum BRIGHTNESS:Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

.field public static final enum WAKELOCK:Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;
    .locals 2

    sget-object v0, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;->BRIGHTNESS:Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    sget-object v1, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;->WAKELOCK:Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    filled-new-array {v0, v1}, [Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    const-string v1, "BRIGHTNESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;->BRIGHTNESS:Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    new-instance v0, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    const-string v1, "WAKELOCK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;->WAKELOCK:Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    invoke-static {}, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;->$values()[Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;->$VALUES:[Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;
    .locals 1

    const-class v0, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;->$VALUES:[Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    invoke-virtual {v0}, [Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;

    return-object v0
.end method
