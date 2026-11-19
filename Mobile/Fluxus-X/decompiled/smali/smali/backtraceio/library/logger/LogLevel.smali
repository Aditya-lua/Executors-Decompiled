.class public final enum Lbacktraceio/library/logger/LogLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/logger/LogLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/logger/LogLevel;

.field public static final enum DEBUG:Lbacktraceio/library/logger/LogLevel;

.field public static final enum ERROR:Lbacktraceio/library/logger/LogLevel;

.field public static final enum OFF:Lbacktraceio/library/logger/LogLevel;

.field public static final enum WARN:Lbacktraceio/library/logger/LogLevel;


# direct methods
.method private static synthetic $values()[Lbacktraceio/library/logger/LogLevel;
    .locals 4

    sget-object v0, Lbacktraceio/library/logger/LogLevel;->DEBUG:Lbacktraceio/library/logger/LogLevel;

    sget-object v1, Lbacktraceio/library/logger/LogLevel;->WARN:Lbacktraceio/library/logger/LogLevel;

    sget-object v2, Lbacktraceio/library/logger/LogLevel;->ERROR:Lbacktraceio/library/logger/LogLevel;

    sget-object v3, Lbacktraceio/library/logger/LogLevel;->OFF:Lbacktraceio/library/logger/LogLevel;

    filled-new-array {v0, v1, v2, v3}, [Lbacktraceio/library/logger/LogLevel;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbacktraceio/library/logger/LogLevel;

    const-string v1, "DEBUG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/logger/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/logger/LogLevel;->DEBUG:Lbacktraceio/library/logger/LogLevel;

    new-instance v0, Lbacktraceio/library/logger/LogLevel;

    const-string v1, "WARN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/logger/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/logger/LogLevel;->WARN:Lbacktraceio/library/logger/LogLevel;

    new-instance v0, Lbacktraceio/library/logger/LogLevel;

    const-string v1, "ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/logger/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/logger/LogLevel;->ERROR:Lbacktraceio/library/logger/LogLevel;

    new-instance v0, Lbacktraceio/library/logger/LogLevel;

    const-string v1, "OFF"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/logger/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/logger/LogLevel;->OFF:Lbacktraceio/library/logger/LogLevel;

    invoke-static {}, Lbacktraceio/library/logger/LogLevel;->$values()[Lbacktraceio/library/logger/LogLevel;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/logger/LogLevel;->$VALUES:[Lbacktraceio/library/logger/LogLevel;

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

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/logger/LogLevel;
    .locals 1

    const-class v0, Lbacktraceio/library/logger/LogLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/logger/LogLevel;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/logger/LogLevel;
    .locals 1

    sget-object v0, Lbacktraceio/library/logger/LogLevel;->$VALUES:[Lbacktraceio/library/logger/LogLevel;

    invoke-virtual {v0}, [Lbacktraceio/library/logger/LogLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/logger/LogLevel;

    return-object v0
.end method
