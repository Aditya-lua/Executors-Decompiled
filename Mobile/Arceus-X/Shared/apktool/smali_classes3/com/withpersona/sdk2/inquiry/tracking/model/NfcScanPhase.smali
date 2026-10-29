.class public final enum Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ServiceOpen",
        "Authentication",
        "ChipAuthentication",
        "Dg1Read",
        "Dg2Read",
        "SodRead",
        "Copy",
        "Complete",
        "Unknown",
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

.field private static final synthetic $VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

.field public static final enum Authentication:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .annotation runtime Lum/g;
        name = "authentication"
    .end annotation
.end field

.field public static final enum ChipAuthentication:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .annotation runtime Lum/g;
        name = "chip_authentication"
    .end annotation
.end field

.field public static final enum Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .annotation runtime Lum/g;
        name = "complete"
    .end annotation
.end field

.field public static final enum Copy:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .annotation runtime Lum/g;
        name = "copy"
    .end annotation
.end field

.field public static final enum Dg1Read:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .annotation runtime Lum/g;
        name = "dg1_read"
    .end annotation
.end field

.field public static final enum Dg2Read:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .annotation runtime Lum/g;
        name = "dg2_read"
    .end annotation
.end field

.field public static final enum ServiceOpen:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .annotation runtime Lum/g;
        name = "service_open"
    .end annotation
.end field

.field public static final enum SodRead:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .annotation runtime Lum/g;
        name = "sod_read"
    .end annotation
.end field

.field public static final enum Unknown:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .annotation runtime Lum/g;
        name = "unknown"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .locals 9

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->ServiceOpen:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Authentication:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->ChipAuthentication:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Dg1Read:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    sget-object v4, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Dg2Read:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->SodRead:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    sget-object v6, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Copy:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    sget-object v7, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    sget-object v8, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Unknown:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    filled-new-array/range {v0 .. v8}, [Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-string v1, "ServiceOpen"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->ServiceOpen:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-string v1, "Authentication"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Authentication:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-string v1, "ChipAuthentication"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->ChipAuthentication:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-string v1, "Dg1Read"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Dg1Read:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-string v1, "Dg2Read"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Dg2Read:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-string v1, "SodRead"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->SodRead:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-string v1, "Copy"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Copy:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-string v1, "Complete"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    const-string v1, "Unknown"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->Unknown:Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->$values()[Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->$VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->$ENTRIES:Lqt/a;

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
            "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->$ENTRIES:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;->$VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;

    return-object v0
.end method
