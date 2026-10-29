.class public final enum Lbacktraceio/library/anr/AnrType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/anr/AnrType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/anr/AnrType;

.field public static final enum ApplicationExit:Lbacktraceio/library/anr/AnrType;

.field public static final enum Threshold:Lbacktraceio/library/anr/AnrType;


# direct methods
.method private static synthetic $values()[Lbacktraceio/library/anr/AnrType;
    .locals 2

    sget-object v0, Lbacktraceio/library/anr/AnrType;->Threshold:Lbacktraceio/library/anr/AnrType;

    sget-object v1, Lbacktraceio/library/anr/AnrType;->ApplicationExit:Lbacktraceio/library/anr/AnrType;

    filled-new-array {v0, v1}, [Lbacktraceio/library/anr/AnrType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbacktraceio/library/anr/AnrType;

    const-string v1, "Threshold"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/anr/AnrType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/anr/AnrType;->Threshold:Lbacktraceio/library/anr/AnrType;

    new-instance v0, Lbacktraceio/library/anr/AnrType;

    const-string v1, "ApplicationExit"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lbacktraceio/library/anr/AnrType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbacktraceio/library/anr/AnrType;->ApplicationExit:Lbacktraceio/library/anr/AnrType;

    invoke-static {}, Lbacktraceio/library/anr/AnrType;->$values()[Lbacktraceio/library/anr/AnrType;

    move-result-object v0

    sput-object v0, Lbacktraceio/library/anr/AnrType;->$VALUES:[Lbacktraceio/library/anr/AnrType;

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

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/anr/AnrType;
    .locals 1

    const-class v0, Lbacktraceio/library/anr/AnrType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/anr/AnrType;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/anr/AnrType;
    .locals 1

    sget-object v0, Lbacktraceio/library/anr/AnrType;->$VALUES:[Lbacktraceio/library/anr/AnrType;

    invoke-virtual {v0}, [Lbacktraceio/library/anr/AnrType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/anr/AnrType;

    return-object v0
.end method
