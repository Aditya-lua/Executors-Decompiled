.class public final enum Lbacktraceio/library/enums/database/RetryOrder;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/enums/database/RetryOrder;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/enums/database/RetryOrder;

.field public static final enum Queue:Lbacktraceio/library/enums/database/RetryOrder;

.field public static final enum Stack:Lbacktraceio/library/enums/database/RetryOrder;


# direct methods
.method private static synthetic $values()[Lbacktraceio/library/enums/database/RetryOrder;
    .locals 2

    sget-object v0, Lbacktraceio/library/enums/database/RetryOrder;->Stack:Lbacktraceio/library/enums/database/RetryOrder;

    sget-object v1, Lbacktraceio/library/enums/database/RetryOrder;->Queue:Lbacktraceio/library/enums/database/RetryOrder;

    filled-new-array {v0, v1}, [Lbacktraceio/library/enums/database/RetryOrder;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbacktraceio/library/enums/database/RetryOrder;

    const-string v1, "Stack"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/database/RetryOrder;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/database/RetryOrder;->Stack:Lbacktraceio/library/enums/database/RetryOrder;

    new-instance v0, Lbacktraceio/library/enums/database/RetryOrder;

    const-string v1, "Queue"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/enums/database/RetryOrder;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/enums/database/RetryOrder;->Queue:Lbacktraceio/library/enums/database/RetryOrder;

    invoke-static {}, Lbacktraceio/library/enums/database/RetryOrder;->$values()[Lbacktraceio/library/enums/database/RetryOrder;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/enums/database/RetryOrder;->$VALUES:[Lbacktraceio/library/enums/database/RetryOrder;

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

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/enums/database/RetryOrder;
    .locals 1

    const-class v0, Lbacktraceio/library/enums/database/RetryOrder;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/enums/database/RetryOrder;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/enums/database/RetryOrder;
    .locals 1

    sget-object v0, Lbacktraceio/library/enums/database/RetryOrder;->$VALUES:[Lbacktraceio/library/enums/database/RetryOrder;

    invoke-virtual {v0}, [Lbacktraceio/library/enums/database/RetryOrder;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/enums/database/RetryOrder;

    return-object v0
.end method
