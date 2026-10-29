.class public final enum Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

.field public static final enum NOTVALIDATED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

.field public static final enum UNKNOWN:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

.field public static final enum VALIDATED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;
    .locals 3

    sget-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->UNKNOWN:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    sget-object v1, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->NOTVALIDATED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    sget-object v2, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->VALIDATED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    filled-new-array {v0, v1, v2}, [Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->UNKNOWN:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    new-instance v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    const-string v1, "NOTVALIDATED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->NOTVALIDATED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    new-instance v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    const-string v1, "VALIDATED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->VALIDATED:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    invoke-static {}, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->$values()[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->$VALUES:[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;
    .locals 1

    const-class v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->$VALUES:[Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    invoke-virtual {v0}, [Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    return-object v0
.end method
