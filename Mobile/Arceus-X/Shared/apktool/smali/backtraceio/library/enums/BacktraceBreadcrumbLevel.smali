.class public final enum Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

.field public static final ALL:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum DEBUG:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

.field public static final enum ERROR:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

.field public static final enum FATAL:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

.field public static final enum INFO:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

.field public static final NONE:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum WARNING:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;


# direct methods
.method private static synthetic $values()[Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;
    .locals 5

    sget-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->DEBUG:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    sget-object v1, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->INFO:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    sget-object v2, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->WARNING:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    sget-object v3, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->ERROR:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    sget-object v4, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->FATAL:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    filled-new-array {v0, v1, v2, v3, v4}, [Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    const-string v1, "DEBUG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->DEBUG:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    const-string v1, "INFO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->INFO:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    const-string v1, "WARNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->WARNING:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    const-string v1, "ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->ERROR:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    const-string v1, "FATAL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->FATAL:Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    invoke-static {}, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->$values()[Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->$VALUES:[Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    const-class v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    sput-object v1, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->ALL:Ljava/util/EnumSet;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->NONE:Ljava/util/EnumSet;

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

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;
    .locals 1

    const-class v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;
    .locals 1

    sget-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->$VALUES:[Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    invoke-virtual {v0}, [Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
