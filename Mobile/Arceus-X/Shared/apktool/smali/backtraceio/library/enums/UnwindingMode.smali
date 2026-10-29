.class public final enum Lbacktraceio/library/enums/UnwindingMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/enums/UnwindingMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/enums/UnwindingMode;

.field public static final enum LOCAL:Lbacktraceio/library/enums/UnwindingMode;

.field public static final enum LOCAL_CONTEXT:Lbacktraceio/library/enums/UnwindingMode;

.field public static final enum LOCAL_DUMPWITHOUTCRASH:Lbacktraceio/library/enums/UnwindingMode;

.field public static final enum REMOTE:Lbacktraceio/library/enums/UnwindingMode;

.field public static final enum REMOTE_DUMPWITHOUTCRASH:Lbacktraceio/library/enums/UnwindingMode;


# direct methods
.method private static synthetic $values()[Lbacktraceio/library/enums/UnwindingMode;
    .locals 5

    sget-object v0, Lbacktraceio/library/enums/UnwindingMode;->LOCAL:Lbacktraceio/library/enums/UnwindingMode;

    sget-object v1, Lbacktraceio/library/enums/UnwindingMode;->REMOTE:Lbacktraceio/library/enums/UnwindingMode;

    sget-object v2, Lbacktraceio/library/enums/UnwindingMode;->REMOTE_DUMPWITHOUTCRASH:Lbacktraceio/library/enums/UnwindingMode;

    sget-object v3, Lbacktraceio/library/enums/UnwindingMode;->LOCAL_DUMPWITHOUTCRASH:Lbacktraceio/library/enums/UnwindingMode;

    sget-object v4, Lbacktraceio/library/enums/UnwindingMode;->LOCAL_CONTEXT:Lbacktraceio/library/enums/UnwindingMode;

    filled-new-array {v0, v1, v2, v3, v4}, [Lbacktraceio/library/enums/UnwindingMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbacktraceio/library/enums/UnwindingMode;

    const-string v1, "LOCAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/UnwindingMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/UnwindingMode;->LOCAL:Lbacktraceio/library/enums/UnwindingMode;

    new-instance v0, Lbacktraceio/library/enums/UnwindingMode;

    const-string v1, "REMOTE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/UnwindingMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/UnwindingMode;->REMOTE:Lbacktraceio/library/enums/UnwindingMode;

    new-instance v0, Lbacktraceio/library/enums/UnwindingMode;

    const-string v1, "REMOTE_DUMPWITHOUTCRASH"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/UnwindingMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/UnwindingMode;->REMOTE_DUMPWITHOUTCRASH:Lbacktraceio/library/enums/UnwindingMode;

    new-instance v0, Lbacktraceio/library/enums/UnwindingMode;

    const-string v1, "LOCAL_DUMPWITHOUTCRASH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/UnwindingMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/UnwindingMode;->LOCAL_DUMPWITHOUTCRASH:Lbacktraceio/library/enums/UnwindingMode;

    new-instance v0, Lbacktraceio/library/enums/UnwindingMode;

    const-string v1, "LOCAL_CONTEXT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/UnwindingMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/UnwindingMode;->LOCAL_CONTEXT:Lbacktraceio/library/enums/UnwindingMode;

    invoke-static {}, Lbacktraceio/library/enums/UnwindingMode;->$values()[Lbacktraceio/library/enums/UnwindingMode;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/enums/UnwindingMode;->$VALUES:[Lbacktraceio/library/enums/UnwindingMode;

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

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/enums/UnwindingMode;
    .locals 1

    const-class v0, Lbacktraceio/library/enums/UnwindingMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/enums/UnwindingMode;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/enums/UnwindingMode;
    .locals 1

    sget-object v0, Lbacktraceio/library/enums/UnwindingMode;->$VALUES:[Lbacktraceio/library/enums/UnwindingMode;

    invoke-virtual {v0}, [Lbacktraceio/library/enums/UnwindingMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/enums/UnwindingMode;

    return-object v0
.end method
