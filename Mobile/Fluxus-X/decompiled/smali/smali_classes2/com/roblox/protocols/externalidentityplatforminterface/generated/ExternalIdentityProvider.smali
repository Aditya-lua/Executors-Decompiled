.class public final enum Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

.field public static final enum APPLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

.field public static final enum GOOGLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;
    .locals 2

    sget-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->GOOGLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    sget-object v1, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->APPLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    filled-new-array {v0, v1}, [Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    const-string v1, "GOOGLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->GOOGLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    new-instance v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    const-string v1, "APPLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->APPLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    invoke-static {}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->$values()[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->$VALUES:[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;
    .locals 1

    const-class v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->$VALUES:[Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    invoke-virtual {v0}, [Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    return-object v0
.end method
