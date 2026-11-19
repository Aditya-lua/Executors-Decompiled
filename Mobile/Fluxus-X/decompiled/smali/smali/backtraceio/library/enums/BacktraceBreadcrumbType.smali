.class public final enum Lbacktraceio/library/enums/BacktraceBreadcrumbType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/enums/BacktraceBreadcrumbType;

.field public static final ALL:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum CONFIGURATION:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

.field public static final enum HTTP:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

.field public static final enum LOG:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

.field public static final enum MANUAL:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

.field public static final enum NAVIGATION:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

.field public static final NONE:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum SYSTEM:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

.field public static final enum USER:Lbacktraceio/library/enums/BacktraceBreadcrumbType;


# direct methods
.method private static synthetic $values()[Lbacktraceio/library/enums/BacktraceBreadcrumbType;
    .locals 7

    sget-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->MANUAL:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    sget-object v1, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->LOG:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    sget-object v2, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->NAVIGATION:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    sget-object v3, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->HTTP:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    sget-object v4, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->SYSTEM:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    sget-object v5, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->USER:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    sget-object v6, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->CONFIGURATION:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    filled-new-array/range {v0 .. v6}, [Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    const-string v1, "MANUAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->MANUAL:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    const-string v1, "LOG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->LOG:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    const-string v1, "NAVIGATION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->NAVIGATION:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    const-string v1, "HTTP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->HTTP:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    const-string v1, "SYSTEM"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->SYSTEM:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    const-string v1, "USER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->USER:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    new-instance v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    const-string v1, "CONFIGURATION"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/BacktraceBreadcrumbType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->CONFIGURATION:Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    invoke-static {}, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->$values()[Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->$VALUES:[Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    const-class v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    sput-object v1, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->ALL:Ljava/util/EnumSet;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->NONE:Ljava/util/EnumSet;

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

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/enums/BacktraceBreadcrumbType;
    .locals 1

    const-class v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/enums/BacktraceBreadcrumbType;
    .locals 1

    sget-object v0, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->$VALUES:[Lbacktraceio/library/enums/BacktraceBreadcrumbType;

    invoke-virtual {v0}, [Lbacktraceio/library/enums/BacktraceBreadcrumbType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/enums/BacktraceBreadcrumbType;

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
