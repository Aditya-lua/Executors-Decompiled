.class public final enum Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Action",
        "Complete",
        "Submit",
        "Cancel",
        "ClickableStack",
        "ReusablePersona",
        "Nfc",
        "Mdoc",
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

.field private static final synthetic $VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

.field public static final enum Action:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .annotation runtime Lum/g;
        name = "action"
    .end annotation
.end field

.field public static final enum Cancel:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .annotation runtime Lum/g;
        name = "cancel"
    .end annotation
.end field

.field public static final enum ClickableStack:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .annotation runtime Lum/g;
        name = "clickable_stack"
    .end annotation
.end field

.field public static final enum Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .annotation runtime Lum/g;
        name = "complete"
    .end annotation
.end field

.field public static final enum Mdoc:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .annotation runtime Lum/g;
        name = "mdoc"
    .end annotation
.end field

.field public static final enum Nfc:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .annotation runtime Lum/g;
        name = "nfc"
    .end annotation
.end field

.field public static final enum ReusablePersona:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .annotation runtime Lum/g;
        name = "reusable_persona"
    .end annotation
.end field

.field public static final enum Submit:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .annotation runtime Lum/g;
        name = "submit"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .locals 8

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Action:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Submit:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Cancel:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    sget-object v4, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->ClickableStack:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->ReusablePersona:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    sget-object v6, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Nfc:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    sget-object v7, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Mdoc:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    filled-new-array/range {v0 .. v7}, [Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    const-string v1, "Action"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Action:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    const-string v1, "Complete"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    const-string v1, "Submit"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Submit:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    const-string v1, "Cancel"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Cancel:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    const-string v1, "ClickableStack"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->ClickableStack:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    const-string v1, "ReusablePersona"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->ReusablePersona:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    const-string v1, "Nfc"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Nfc:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    const-string v1, "Mdoc"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Mdoc:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->$values()[Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->$VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->$ENTRIES:Lqt/a;

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
            "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->$ENTRIES:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->$VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    return-object v0
.end method
