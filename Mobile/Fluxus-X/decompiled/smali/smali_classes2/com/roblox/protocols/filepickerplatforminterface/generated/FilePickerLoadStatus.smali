.class public final enum Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

.field public static final enum CANCELLED:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

.field public static final enum INSUFFICIENTSTORAGE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

.field public static final enum PLATFORMERROR:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

.field public static final enum SUCCESS:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

.field public static final enum TOOLARGE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

.field public static final enum UNAVAILABLE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;
    .locals 6

    sget-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->SUCCESS:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    sget-object v1, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->CANCELLED:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    sget-object v2, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->UNAVAILABLE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    sget-object v3, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->INSUFFICIENTSTORAGE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    sget-object v4, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->PLATFORMERROR:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    sget-object v5, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->TOOLARGE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    filled-new-array/range {v0 .. v5}, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->SUCCESS:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    const-string v1, "CANCELLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->CANCELLED:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    const-string v1, "UNAVAILABLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->UNAVAILABLE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    const-string v1, "INSUFFICIENTSTORAGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->INSUFFICIENTSTORAGE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    const-string v1, "PLATFORMERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->PLATFORMERROR:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    new-instance v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    const-string v1, "TOOLARGE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->TOOLARGE:Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    invoke-static {}, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->$values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->$VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;
    .locals 1

    const-class v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->$VALUES:[Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    invoke-virtual {v0}, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/filepickerplatforminterface/generated/FilePickerLoadStatus;

    return-object v0
.end method
