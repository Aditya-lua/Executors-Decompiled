.class public Lcom/roblox/engine/jni/model/BatteryStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/model/BatteryStatus$b;,
        Lcom/roblox/engine/jni/model/BatteryStatus$c;,
        Lcom/roblox/engine/jni/model/BatteryStatus$a;
    }
.end annotation


# instance fields
.field public batteryLow:Ljava/lang/Boolean;

.field public batteryPercentage:Ljava/lang/Integer;

.field public batterySaverMode:Ljava/lang/Boolean;

.field public chargeCounter:Ljava/lang/Integer;

.field public currentAverage:Ljava/lang/Integer;

.field public currentNow:Ljava/lang/Integer;

.field public energyCounter:Ljava/lang/Long;

.field public health:Ljava/lang/Integer;

.field public plugged:Ljava/lang/Integer;

.field public power:Ljava/lang/Integer;

.field public present:Ljava/lang/Boolean;

.field public status:Ljava/lang/Integer;

.field public technology:Ljava/lang/String;

.field public temperature:Ljava/lang/Float;

.field public voltage:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
