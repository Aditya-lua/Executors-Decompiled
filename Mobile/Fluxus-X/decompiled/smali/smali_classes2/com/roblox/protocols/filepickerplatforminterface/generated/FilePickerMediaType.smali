.class public final enum Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

.field public static final enum AUDIO:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

.field public static final enum IMAGE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

.field public static final enum VIDEO:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;
    .locals 3

    sget-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;->IMAGE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    sget-object v1, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;->VIDEO:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    sget-object v2, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;->AUDIO:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    filled-new-array {v0, v1, v2}, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    const-string v1, "IMAGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;->IMAGE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    const-string v1, "VIDEO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;->VIDEO:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    const-string v1, "AUDIO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;->AUDIO:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    invoke-static {}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;->$values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;->$VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;
    .locals 1

    const-class v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;->$VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    invoke-virtual {v0}, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerMediaType;

    return-object v0
.end method
