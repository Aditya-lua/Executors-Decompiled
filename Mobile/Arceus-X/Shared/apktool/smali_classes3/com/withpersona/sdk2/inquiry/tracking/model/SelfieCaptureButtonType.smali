.class public final enum Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SHUTTER",
        "FLASH",
        "SWITCH_CAMERA",
        "tracking-events_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lqt/a;

.field private static final synthetic $VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

.field public static final enum FLASH:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;
    .annotation runtime Lum/g;
        name = "flash"
    .end annotation
.end field

.field public static final enum SHUTTER:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;
    .annotation runtime Lum/g;
        name = "shutter"
    .end annotation
.end field

.field public static final enum SWITCH_CAMERA:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;
    .annotation runtime Lum/g;
        name = "switch_camera"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;
    .locals 3

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->SHUTTER:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->FLASH:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->SWITCH_CAMERA:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    filled-new-array {v0, v1, v2}, [Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    const-string v1, "SHUTTER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->SHUTTER:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    const-string v1, "FLASH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->FLASH:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    const-string v1, "SWITCH_CAMERA"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->SWITCH_CAMERA:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->$values()[Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->$VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->$ENTRIES:Lqt/a;

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

.method public static getEntries()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->$ENTRIES:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;->$VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonType;

    return-object v0
.end method
