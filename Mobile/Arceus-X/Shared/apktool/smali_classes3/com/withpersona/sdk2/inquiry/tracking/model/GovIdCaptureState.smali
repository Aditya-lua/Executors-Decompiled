.class public final enum Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "LOADING",
        "IDLE",
        "TAKING_PHOTO",
        "CONFIRMING",
        "SUBMITTING",
        "CAPTURED_PHOTO",
        "RECORDING_TIMED_OUT",
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

.field private static final synthetic $VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

.field public static final enum CAPTURED_PHOTO:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
    .annotation runtime Lum/g;
        name = "captured_photo"
    .end annotation
.end field

.field public static final enum CONFIRMING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
    .annotation runtime Lum/g;
        name = "confirming"
    .end annotation
.end field

.field public static final enum IDLE:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
    .annotation runtime Lum/g;
        name = "idle"
    .end annotation
.end field

.field public static final enum LOADING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
    .annotation runtime Lum/g;
        name = "loading"
    .end annotation
.end field

.field public static final enum RECORDING_TIMED_OUT:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
    .annotation runtime Lum/g;
        name = "recording_timed_out"
    .end annotation
.end field

.field public static final enum SUBMITTING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
    .annotation runtime Lum/g;
        name = "submitting"
    .end annotation
.end field

.field public static final enum TAKING_PHOTO:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
    .annotation runtime Lum/g;
        name = "taking_photo"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
    .locals 7

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->LOADING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->IDLE:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->TAKING_PHOTO:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->CONFIRMING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    sget-object v4, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->SUBMITTING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->CAPTURED_PHOTO:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    sget-object v6, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->RECORDING_TIMED_OUT:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    filled-new-array/range {v0 .. v6}, [Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    const-string v1, "LOADING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->LOADING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    const-string v1, "IDLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->IDLE:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    const-string v1, "TAKING_PHOTO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->TAKING_PHOTO:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    const-string v1, "CONFIRMING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->CONFIRMING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    const-string v1, "SUBMITTING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->SUBMITTING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    const-string v1, "CAPTURED_PHOTO"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->CAPTURED_PHOTO:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    const-string v1, "RECORDING_TIMED_OUT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->RECORDING_TIMED_OUT:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->$values()[Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->$VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->$ENTRIES:Lqt/a;

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
            "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->$ENTRIES:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->$VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    return-object v0
.end method
