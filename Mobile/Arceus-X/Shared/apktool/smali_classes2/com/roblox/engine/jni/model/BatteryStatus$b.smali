.class public final enum Lcom/roblox/engine/jni/model/BatteryStatus$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/model/BatteryStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/engine/jni/model/BatteryStatus$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AC:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final enum DOCK:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final enum NOT_PLUGGED:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final enum UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final enum USB:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final enum WIRELESS:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final synthetic a:[Lcom/roblox/engine/jni/model/BatteryStatus$b;


# instance fields
.field public final androidValue:I

.field public final robloxValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const/4 v1, -0x1

    const-string v2, "UNKNOWN"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1, v1}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const-string v1, "NOT_PLUGGED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->NOT_PLUGGED:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const-string v1, "AC"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2, v2}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->AC:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const-string v1, "USB"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->USB:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const-string v1, "WIRELESS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->WIRELESS:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const/4 v1, 0x5

    const/16 v2, 0x8

    const-string v3, "DOCK"

    invoke-direct {v0, v3, v1, v2, v2}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->DOCK:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    invoke-static {}, Lcom/roblox/engine/jni/model/BatteryStatus$b;->a()[Lcom/roblox/engine/jni/model/BatteryStatus$b;

    move-result-object v0

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->a:[Lcom/roblox/engine/jni/model/BatteryStatus$b;

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

    iput p3, p0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->robloxValue:I

    iput p4, p0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->androidValue:I

    return-void
.end method

.method public static synthetic a()[Lcom/roblox/engine/jni/model/BatteryStatus$b;
    .locals 6

    sget-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    sget-object v1, Lcom/roblox/engine/jni/model/BatteryStatus$b;->NOT_PLUGGED:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    sget-object v2, Lcom/roblox/engine/jni/model/BatteryStatus$b;->AC:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    sget-object v3, Lcom/roblox/engine/jni/model/BatteryStatus$b;->USB:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    sget-object v4, Lcom/roblox/engine/jni/model/BatteryStatus$b;->WIRELESS:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    sget-object v5, Lcom/roblox/engine/jni/model/BatteryStatus$b;->DOCK:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    filled-new-array/range {v0 .. v5}, [Lcom/roblox/engine/jni/model/BatteryStatus$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/engine/jni/model/BatteryStatus$b;
    .locals 1

    const-class v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    return-object p0
.end method

.method public static values()[Lcom/roblox/engine/jni/model/BatteryStatus$b;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->a:[Lcom/roblox/engine/jni/model/BatteryStatus$b;

    invoke-virtual {v0}, [Lcom/roblox/engine/jni/model/BatteryStatus$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/engine/jni/model/BatteryStatus$b;

    return-object v0
.end method
