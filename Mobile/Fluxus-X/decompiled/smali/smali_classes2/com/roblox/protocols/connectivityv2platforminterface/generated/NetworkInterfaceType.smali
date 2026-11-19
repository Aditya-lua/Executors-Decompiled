.class public final enum Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

.field public static final enum CELLULAR:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

.field public static final enum NONE:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

.field public static final enum UNKNOWN:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

.field public static final enum WIFI:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

.field public static final enum WIRED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;
    .locals 5

    sget-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->NONE:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    sget-object v1, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->WIFI:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    sget-object v2, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->CELLULAR:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    sget-object v3, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->WIRED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    sget-object v4, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->UNKNOWN:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->NONE:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    new-instance v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    const-string v1, "WIFI"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->WIFI:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    new-instance v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    const-string v1, "CELLULAR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->CELLULAR:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    new-instance v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    const-string v1, "WIRED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->WIRED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    new-instance v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->UNKNOWN:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    invoke-static {}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->$values()[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->$VALUES:[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;
    .locals 1

    const-class v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->$VALUES:[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    invoke-virtual {v0}, [Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    return-object v0
.end method
