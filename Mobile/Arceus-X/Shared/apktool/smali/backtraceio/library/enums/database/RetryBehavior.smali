.class public final enum Lbacktraceio/library/enums/database/RetryBehavior;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/enums/database/RetryBehavior;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/enums/database/RetryBehavior;

.field public static final enum ByInterval:Lbacktraceio/library/enums/database/RetryBehavior;

.field public static final enum NoRetry:Lbacktraceio/library/enums/database/RetryBehavior;


# direct methods
.method private static synthetic $values()[Lbacktraceio/library/enums/database/RetryBehavior;
    .locals 2

    sget-object v0, Lbacktraceio/library/enums/database/RetryBehavior;->ByInterval:Lbacktraceio/library/enums/database/RetryBehavior;

    sget-object v1, Lbacktraceio/library/enums/database/RetryBehavior;->NoRetry:Lbacktraceio/library/enums/database/RetryBehavior;

    filled-new-array {v0, v1}, [Lbacktraceio/library/enums/database/RetryBehavior;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbacktraceio/library/enums/database/RetryBehavior;

    const-string v1, "ByInterval"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/database/RetryBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/database/RetryBehavior;->ByInterval:Lbacktraceio/library/enums/database/RetryBehavior;

    new-instance v0, Lbacktraceio/library/enums/database/RetryBehavior;

    const-string v1, "NoRetry"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/database/RetryBehavior;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/database/RetryBehavior;->NoRetry:Lbacktraceio/library/enums/database/RetryBehavior;

    invoke-static {}, Lbacktraceio/library/enums/database/RetryBehavior;->$values()[Lbacktraceio/library/enums/database/RetryBehavior;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/enums/database/RetryBehavior;->$VALUES:[Lbacktraceio/library/enums/database/RetryBehavior;

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

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/enums/database/RetryBehavior;
    .locals 1

    const-class v0, Lbacktraceio/library/enums/database/RetryBehavior;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/enums/database/RetryBehavior;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/enums/database/RetryBehavior;
    .locals 1

    sget-object v0, Lbacktraceio/library/enums/database/RetryBehavior;->$VALUES:[Lbacktraceio/library/enums/database/RetryBehavior;

    invoke-virtual {v0}, [Lbacktraceio/library/enums/database/RetryBehavior;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/enums/database/RetryBehavior;

    return-object v0
.end method
