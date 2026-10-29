.class public final enum Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

.field public static final enum ALREADYEXISTS:Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

.field public static final enum FAILURE:Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

.field public static final enum SUCCESS:Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;
    .locals 3

    sget-object v0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;->SUCCESS:Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    sget-object v1, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;->FAILURE:Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    sget-object v2, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;->ALREADYEXISTS:Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    filled-new-array {v0, v1, v2}, [Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;->SUCCESS:Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    new-instance v0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    const-string v1, "FAILURE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;->FAILURE:Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    new-instance v0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    const-string v1, "ALREADYEXISTS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;->ALREADYEXISTS:Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    invoke-static {}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;->$values()[Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;->$VALUES:[Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;
    .locals 1

    const-class v0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;->$VALUES:[Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    invoke-virtual {v0}, [Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/pinshortcutplatforminterface/generated/PlatformPinExperienceStatus;

    return-object v0
.end method
