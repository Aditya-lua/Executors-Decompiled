.class public final enum Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

.field public static final enum CAMERA:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

.field public static final enum FILES:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

.field public static final enum LIBRARY:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

.field public static final enum MICROPHONE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;
    .locals 4

    sget-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->FILES:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    sget-object v1, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->LIBRARY:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    sget-object v2, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->CAMERA:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    sget-object v3, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->MICROPHONE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    filled-new-array {v0, v1, v2, v3}, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    const-string v1, "FILES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->FILES:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    const-string v1, "LIBRARY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->LIBRARY:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    const-string v1, "CAMERA"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->CAMERA:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    const-string v1, "MICROPHONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->MICROPHONE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    invoke-static {}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->$values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->$VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;
    .locals 1

    const-class v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->$VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    invoke-virtual {v0}, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerSource;

    return-object v0
.end method
