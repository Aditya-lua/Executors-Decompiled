.class public final enum Lbacktraceio/library/models/types/BacktraceResultStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/models/types/BacktraceResultStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/models/types/BacktraceResultStatus;

.field public static final enum Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

.field public static final enum ServerError:Lbacktraceio/library/models/types/BacktraceResultStatus;


# direct methods
.method private static synthetic $values()[Lbacktraceio/library/models/types/BacktraceResultStatus;
    .locals 2

    sget-object v0, Lbacktraceio/library/models/types/BacktraceResultStatus;->ServerError:Lbacktraceio/library/models/types/BacktraceResultStatus;

    sget-object v1, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    filled-new-array {v0, v1}, [Lbacktraceio/library/models/types/BacktraceResultStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbacktraceio/library/models/types/BacktraceResultStatus;

    const-string v1, "ServerError"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/models/types/BacktraceResultStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/models/types/BacktraceResultStatus;->ServerError:Lbacktraceio/library/models/types/BacktraceResultStatus;

    new-instance v0, Lbacktraceio/library/models/types/BacktraceResultStatus;

    const-string v1, "Ok"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/models/types/BacktraceResultStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    invoke-static {}, Lbacktraceio/library/models/types/BacktraceResultStatus;->$values()[Lbacktraceio/library/models/types/BacktraceResultStatus;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/models/types/BacktraceResultStatus;->$VALUES:[Lbacktraceio/library/models/types/BacktraceResultStatus;

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

.method public static enumOf(Ljava/lang/String;)Lbacktraceio/library/models/types/BacktraceResultStatus;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "servererror"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ok"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid BacktraceResultStatus enum value"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lbacktraceio/library/models/types/BacktraceResultStatus;->ServerError:Lbacktraceio/library/models/types/BacktraceResultStatus;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/models/types/BacktraceResultStatus;
    .locals 1

    const-class v0, Lbacktraceio/library/models/types/BacktraceResultStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/models/types/BacktraceResultStatus;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/models/types/BacktraceResultStatus;
    .locals 1

    sget-object v0, Lbacktraceio/library/models/types/BacktraceResultStatus;->$VALUES:[Lbacktraceio/library/models/types/BacktraceResultStatus;

    invoke-virtual {v0}, [Lbacktraceio/library/models/types/BacktraceResultStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/models/types/BacktraceResultStatus;

    return-object v0
.end method
