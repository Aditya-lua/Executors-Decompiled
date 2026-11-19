.class public final enum Lbacktraceio/library/enums/BatteryState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/enums/BatteryState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/enums/BatteryState;

.field public static final enum CHARGING:Lbacktraceio/library/enums/BatteryState;

.field public static final enum FULL:Lbacktraceio/library/enums/BatteryState;

.field public static final enum UNKNOWN:Lbacktraceio/library/enums/BatteryState;

.field public static final enum UNPLUGGED:Lbacktraceio/library/enums/BatteryState;


# instance fields
.field private final text:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lbacktraceio/library/enums/BatteryState;
    .locals 4

    sget-object v0, Lbacktraceio/library/enums/BatteryState;->CHARGING:Lbacktraceio/library/enums/BatteryState;

    sget-object v1, Lbacktraceio/library/enums/BatteryState;->UNKNOWN:Lbacktraceio/library/enums/BatteryState;

    sget-object v2, Lbacktraceio/library/enums/BatteryState;->FULL:Lbacktraceio/library/enums/BatteryState;

    sget-object v3, Lbacktraceio/library/enums/BatteryState;->UNPLUGGED:Lbacktraceio/library/enums/BatteryState;

    filled-new-array {v0, v1, v2, v3}, [Lbacktraceio/library/enums/BatteryState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbacktraceio/library/enums/BatteryState;

    const/4 v1, 0x0

    const-string v2, "Charging"

    const-string v3, "CHARGING"

    invoke-direct {v0, v3, v1, v2}, Lbacktraceio/library/enums/BatteryState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbacktraceio/library/enums/BatteryState;->CHARGING:Lbacktraceio/library/enums/BatteryState;

    new-instance v0, Lbacktraceio/library/enums/BatteryState;

    const/4 v1, 0x1

    const-string v2, "Unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lbacktraceio/library/enums/BatteryState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbacktraceio/library/enums/BatteryState;->UNKNOWN:Lbacktraceio/library/enums/BatteryState;

    new-instance v0, Lbacktraceio/library/enums/BatteryState;

    const/4 v1, 0x2

    const-string v2, "Full"

    const-string v3, "FULL"

    invoke-direct {v0, v3, v1, v2}, Lbacktraceio/library/enums/BatteryState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbacktraceio/library/enums/BatteryState;->FULL:Lbacktraceio/library/enums/BatteryState;

    new-instance v0, Lbacktraceio/library/enums/BatteryState;

    const/4 v1, 0x3

    const-string v2, "Unplugged"

    const-string v3, "UNPLUGGED"

    invoke-direct {v0, v3, v1, v2}, Lbacktraceio/library/enums/BatteryState;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbacktraceio/library/enums/BatteryState;->UNPLUGGED:Lbacktraceio/library/enums/BatteryState;

    invoke-static {}, Lbacktraceio/library/enums/BatteryState;->$values()[Lbacktraceio/library/enums/BatteryState;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/enums/BatteryState;->$VALUES:[Lbacktraceio/library/enums/BatteryState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lbacktraceio/library/enums/BatteryState;->text:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/enums/BatteryState;
    .locals 1

    const-class v0, Lbacktraceio/library/enums/BatteryState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/enums/BatteryState;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/enums/BatteryState;
    .locals 1

    sget-object v0, Lbacktraceio/library/enums/BatteryState;->$VALUES:[Lbacktraceio/library/enums/BatteryState;

    invoke-virtual {v0}, [Lbacktraceio/library/enums/BatteryState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/enums/BatteryState;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/enums/BatteryState;->text:Ljava/lang/String;

    return-object v0
.end method
