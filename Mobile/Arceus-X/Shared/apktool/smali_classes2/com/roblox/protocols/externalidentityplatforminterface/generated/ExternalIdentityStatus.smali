.class public final enum Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

.field public static final enum BUSY:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

.field public static final enum CANCELLED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

.field public static final enum FAILED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

.field public static final enum SUCCESS:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

.field public static final enum UNAVAILABLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;
    .locals 5

    sget-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->SUCCESS:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    sget-object v1, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->CANCELLED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    sget-object v2, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->UNAVAILABLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    sget-object v3, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->FAILED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    sget-object v4, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->BUSY:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->SUCCESS:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    new-instance v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    const-string v1, "CANCELLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->CANCELLED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    new-instance v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    const-string v1, "UNAVAILABLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->UNAVAILABLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    new-instance v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->FAILED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    new-instance v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    const-string v1, "BUSY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->BUSY:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    invoke-static {}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->$values()[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->$VALUES:[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;
    .locals 1

    const-class v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->$VALUES:[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    invoke-virtual {v0}, [Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    return-object v0
.end method
