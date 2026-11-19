.class public final enum Lbacktraceio/library/enums/WifiStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/enums/WifiStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/enums/WifiStatus;

.field public static final enum DISABLED:Lbacktraceio/library/enums/WifiStatus;

.field public static final enum ENABLED:Lbacktraceio/library/enums/WifiStatus;

.field public static final enum NOT_PERMITTED:Lbacktraceio/library/enums/WifiStatus;


# instance fields
.field private final text:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lbacktraceio/library/enums/WifiStatus;
    .locals 3

    sget-object v0, Lbacktraceio/library/enums/WifiStatus;->NOT_PERMITTED:Lbacktraceio/library/enums/WifiStatus;

    sget-object v1, Lbacktraceio/library/enums/WifiStatus;->DISABLED:Lbacktraceio/library/enums/WifiStatus;

    sget-object v2, Lbacktraceio/library/enums/WifiStatus;->ENABLED:Lbacktraceio/library/enums/WifiStatus;

    filled-new-array {v0, v1, v2}, [Lbacktraceio/library/enums/WifiStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbacktraceio/library/enums/WifiStatus;

    const/4 v1, 0x0

    const-string v2, "NotPermitted"

    const-string v3, "NOT_PERMITTED"

    invoke-direct {v0, v3, v1, v2}, Lbacktraceio/library/enums/WifiStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbacktraceio/library/enums/WifiStatus;->NOT_PERMITTED:Lbacktraceio/library/enums/WifiStatus;

    new-instance v0, Lbacktraceio/library/enums/WifiStatus;

    const/4 v1, 0x1

    const-string v2, "Disabled"

    const-string v3, "DISABLED"

    invoke-direct {v0, v3, v1, v2}, Lbacktraceio/library/enums/WifiStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbacktraceio/library/enums/WifiStatus;->DISABLED:Lbacktraceio/library/enums/WifiStatus;

    new-instance v0, Lbacktraceio/library/enums/WifiStatus;

    const/4 v1, 0x2

    const-string v2, "Enabled"

    const-string v3, "ENABLED"

    invoke-direct {v0, v3, v1, v2}, Lbacktraceio/library/enums/WifiStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbacktraceio/library/enums/WifiStatus;->ENABLED:Lbacktraceio/library/enums/WifiStatus;

    invoke-static {}, Lbacktraceio/library/enums/WifiStatus;->$values()[Lbacktraceio/library/enums/WifiStatus;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/enums/WifiStatus;->$VALUES:[Lbacktraceio/library/enums/WifiStatus;

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

    iput-object p3, p0, Lbacktraceio/library/enums/WifiStatus;->text:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/enums/WifiStatus;
    .locals 1

    const-class v0, Lbacktraceio/library/enums/WifiStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/enums/WifiStatus;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/enums/WifiStatus;
    .locals 1

    sget-object v0, Lbacktraceio/library/enums/WifiStatus;->$VALUES:[Lbacktraceio/library/enums/WifiStatus;

    invoke-virtual {v0}, [Lbacktraceio/library/enums/WifiStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/enums/WifiStatus;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/enums/WifiStatus;->text:Ljava/lang/String;

    return-object v0
.end method
