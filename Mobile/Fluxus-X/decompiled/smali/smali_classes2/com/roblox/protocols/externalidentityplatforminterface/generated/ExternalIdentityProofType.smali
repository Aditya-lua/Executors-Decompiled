.class public final enum Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

.field public static final enum IDTOKEN:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

.field public static final enum SESSIONESTABLISHED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;
    .locals 2

    sget-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;->IDTOKEN:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    sget-object v1, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;->SESSIONESTABLISHED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    filled-new-array {v0, v1}, [Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    const-string v1, "IDTOKEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;->IDTOKEN:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    new-instance v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    const-string v1, "SESSIONESTABLISHED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;->SESSIONESTABLISHED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    invoke-static {}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;->$values()[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;->$VALUES:[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;
    .locals 1

    const-class v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;->$VALUES:[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    invoke-virtual {v0}, [Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    return-object v0
.end method
