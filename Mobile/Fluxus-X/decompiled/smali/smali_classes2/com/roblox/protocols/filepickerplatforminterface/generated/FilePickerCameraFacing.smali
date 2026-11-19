.class public final enum Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

.field public static final enum BACK:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

.field public static final enum DEFAULT:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

.field public static final enum FRONT:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;
    .locals 3

    sget-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;->DEFAULT:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    sget-object v1, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;->FRONT:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    sget-object v2, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;->BACK:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    filled-new-array {v0, v1, v2}, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;->DEFAULT:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    const-string v1, "FRONT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;->FRONT:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    const-string v1, "BACK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;->BACK:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    invoke-static {}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;->$values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;->$VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;
    .locals 1

    const-class v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;->$VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    invoke-virtual {v0}, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerCameraFacing;

    return-object v0
.end method
