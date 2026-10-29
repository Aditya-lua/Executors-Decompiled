.class public final enum Lcom/roblox/engine/jni/model/BatteryStatus$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/model/BatteryStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/engine/jni/model/BatteryStatus$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum COLD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum DEAD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum GOOD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum OVERHEAT:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum OVER_VOLTAGE:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum UNSPECFIED_FAILURE:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final synthetic a:[Lcom/roblox/engine/jni/model/BatteryStatus$a;


# instance fields
.field public final androidValue:I

.field public final robloxValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v1, "GOOD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v3, v2}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->GOOD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v1, "OVERHEAT"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->OVERHEAT:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v1, "DEAD"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v3, v2}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->DEAD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v1, "OVER_VOLTAGE"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->OVER_VOLTAGE:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v1, "UNSPECFIED_FAILURE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v3, v2}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->UNSPECFIED_FAILURE:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v1, "COLD"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->COLD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    invoke-static {}, Lcom/roblox/engine/jni/model/BatteryStatus$a;->a()[Lcom/roblox/engine/jni/model/BatteryStatus$a;

    move-result-object v0

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->a:[Lcom/roblox/engine/jni/model/BatteryStatus$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->robloxValue:I

    iput p4, p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->androidValue:I

    return-void
.end method

.method public static synthetic a()[Lcom/roblox/engine/jni/model/BatteryStatus$a;
    .locals 7

    sget-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    sget-object v1, Lcom/roblox/engine/jni/model/BatteryStatus$a;->GOOD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    sget-object v2, Lcom/roblox/engine/jni/model/BatteryStatus$a;->OVERHEAT:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    sget-object v3, Lcom/roblox/engine/jni/model/BatteryStatus$a;->DEAD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    sget-object v4, Lcom/roblox/engine/jni/model/BatteryStatus$a;->OVER_VOLTAGE:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    sget-object v5, Lcom/roblox/engine/jni/model/BatteryStatus$a;->UNSPECFIED_FAILURE:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    sget-object v6, Lcom/roblox/engine/jni/model/BatteryStatus$a;->COLD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    filled-new-array/range {v0 .. v6}, [Lcom/roblox/engine/jni/model/BatteryStatus$a;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/Integer;)I
    .locals 6

    if-nez p0, :cond_0

    sget-object p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    iget p0, p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->robloxValue:I

    return p0

    :cond_0
    invoke-static {}, Lcom/roblox/engine/jni/model/BatteryStatus$a;->values()[Lcom/roblox/engine/jni/model/BatteryStatus$a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    iget v4, v3, Lcom/roblox/engine/jni/model/BatteryStatus$a;->androidValue:I

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v4, v5, :cond_1

    iget p0, v3, Lcom/roblox/engine/jni/model/BatteryStatus$a;->robloxValue:I

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    iget p0, p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->robloxValue:I

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/engine/jni/model/BatteryStatus$a;
    .locals 1

    const-class v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    return-object p0
.end method

.method public static values()[Lcom/roblox/engine/jni/model/BatteryStatus$a;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->a:[Lcom/roblox/engine/jni/model/BatteryStatus$a;

    invoke-virtual {v0}, [Lcom/roblox/engine/jni/model/BatteryStatus$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/engine/jni/model/BatteryStatus$a;

    return-object v0
.end method
