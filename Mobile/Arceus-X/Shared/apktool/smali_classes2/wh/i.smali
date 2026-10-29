.class public Lwh/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:J


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/BatteryManager;

.field public c:Landroid/content/BroadcastReceiver;

.field public d:J

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public f:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->G2()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x3a98

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x7530

    :goto_0
    sput-wide v0, Lwh/i;->g:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lwh/i;->d:J

    new-instance v0, Lwh/h;

    invoke-direct {v0}, Lwh/h;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lwh/i;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Lwh/i;->a:Landroid/content/Context;

    const-string v0, "batterymanager"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/BatteryManager;

    iput-object p1, p0, Lwh/i;->b:Landroid/os/BatteryManager;

    return-void
.end method

.method public static synthetic a(Lwh/i;)V
    .locals 0

    invoke-virtual {p0}, Lwh/i;->m()V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BatteryStatusObserver-"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0
.end method

.method public static bridge synthetic c(Lwh/i;)J
    .locals 2

    iget-wide v0, p0, Lwh/i;->d:J

    return-wide v0
.end method

.method public static bridge synthetic d(Lwh/i;J)V
    .locals 0

    iput-wide p1, p0, Lwh/i;->d:J

    return-void
.end method

.method public static bridge synthetic e(Lwh/i;Landroid/content/Intent;)V
    .locals 0

    invoke-virtual {p0, p1}, Lwh/i;->n(Landroid/content/Intent;)V

    return-void
.end method

.method public static bridge synthetic f()J
    .locals 2

    sget-wide v0, Lwh/i;->g:J

    return-wide v0
.end method

.method public static g(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, -0x80000000

    invoke-virtual {p0, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-eq p0, v0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static l(Ljava/lang/Integer;)Lcom/roblox/engine/jni/model/BatteryStatus$b;
    .locals 6

    if-nez p0, :cond_0

    sget-object p0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    return-object p0

    :cond_0
    invoke-static {}, Lcom/roblox/engine/jni/model/BatteryStatus$b;->values()[Lcom/roblox/engine/jni/model/BatteryStatus$b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    iget v4, v3, Lcom/roblox/engine/jni/model/BatteryStatus$b;->androidValue:I

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v4, v5, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object p0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    return-object p0
.end method


# virtual methods
.method public final h(I)Ljava/lang/Integer;
    .locals 4

    iget-object v0, p0, Lwh/i;->b:Landroid/os/BatteryManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/BatteryManager;->getLongProperty(I)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final j(I)Ljava/lang/Long;
    .locals 4

    iget-object v0, p0, Lwh/i;->b:Landroid/os/BatteryManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/BatteryManager;->getLongProperty(I)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final k(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const-string p1, "BATTERY_STATUS_UNKNOWN"

    return-object p1

    :cond_0
    const-string p1, "BATTERY_STATUS_FULL"

    return-object p1

    :cond_1
    const-string p1, "BATTERY_STATUS_NOT_CHARGING"

    return-object p1

    :cond_2
    const-string p1, "BATTERY_STATUS_DISCHARGING"

    return-object p1

    :cond_3
    const-string p1, "BATTERY_STATUS_CHARGING"

    return-object p1
.end method

.method public final m()V
    .locals 6

    iget-object v0, p0, Lwh/i;->a:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/roblox/engine/jni/model/BatteryStatus;

    invoke-direct {v1}, Lcom/roblox/engine/jni/model/BatteryStatus;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lwh/i;->h(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->chargeCounter:Ljava/lang/Integer;

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, Lwh/i;->h(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    const v3, 0xa410

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-ge v2, v3, :cond_1

    iget-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    :cond_1
    const/4 v2, 0x3

    invoke-virtual {p0, v2}, Lwh/i;->h(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-ge v2, v3, :cond_2

    iget-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    :cond_2
    const/4 v2, 0x5

    invoke-virtual {p0, v2}, Lwh/i;->j(I)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->energyCounter:Ljava/lang/Long;

    const-string v2, "status"

    invoke-static {v0, v2}, Lwh/i;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lcom/roblox/engine/jni/model/BatteryStatus$c;->b(Ljava/lang/Integer;)Lcom/roblox/engine/jni/model/BatteryStatus$c;

    move-result-object v2

    iget v3, v2, Lcom/roblox/engine/jni/model/BatteryStatus$c;->robloxValue:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->status:Ljava/lang/Integer;

    const-string v3, "plugged"

    invoke-static {v0, v3}, Lwh/i;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lwh/i;->l(Ljava/lang/Integer;)Lcom/roblox/engine/jni/model/BatteryStatus$b;

    move-result-object v3

    iget v4, v3, Lcom/roblox/engine/jni/model/BatteryStatus$b;->robloxValue:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->plugged:Ljava/lang/Integer;

    sget-object v4, Lcom/roblox/engine/jni/model/BatteryStatus$b;->NOT_PLUGGED:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    if-ne v3, v4, :cond_3

    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lez v4, :cond_4

    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    neg-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    neg-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    goto :goto_0

    :cond_3
    sget-object v4, Lcom/roblox/engine/jni/model/BatteryStatus$b;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    if-eq v3, v4, :cond_4

    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-gez v4, :cond_4

    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    neg-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    neg-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentAverage:Ljava/lang/Integer;

    :cond_4
    :goto_0
    const-string v4, "level"

    invoke-static {v0, v4}, Lwh/i;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "scale"

    invoke-static {v0, v5}, Lwh/i;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v4, :cond_5

    if-eqz v5, :cond_5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    mul-int/lit8 v4, v4, 0x64

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    div-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->batteryPercentage:Ljava/lang/Integer;

    :cond_5
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1c

    if-lt v4, v5, :cond_6

    const-string v4, "battery_low"

    invoke-static {v0, v4}, Lwh/i;->g(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->batteryLow:Ljava/lang/Boolean;

    :cond_6
    const-string v4, "voltage"

    invoke-static {v0, v4}, Lwh/i;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->voltage:Ljava/lang/Integer;

    const-string v4, "temperature"

    invoke-static {v0, v4}, Lwh/i;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x41200000    # 10.0f

    div-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->temperature:Ljava/lang/Float;

    :cond_7
    const-string v4, "technology"

    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->technology:Ljava/lang/String;

    const-string v4, "health"

    invoke-static {v0, v4}, Lwh/i;->i(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lcom/roblox/engine/jni/model/BatteryStatus$a;->b(Ljava/lang/Integer;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->health:Ljava/lang/Integer;

    const-string v4, "present"

    invoke-static {v0, v4}, Lwh/i;->g(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->present:Ljava/lang/Boolean;

    iget-object v0, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    if-eqz v0, :cond_8

    iget-object v4, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->voltage:Ljava/lang/Integer;

    if-eqz v4, :cond_8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v0, v4

    iget-object v5, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->voltage:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v4

    mul-float/2addr v0, v5

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->power:Ljava/lang/Integer;

    :cond_8
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->z1()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lwh/i;->a:Landroid/content/Context;

    const-string v4, "power"

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->isPowerSaveMode()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->batterySaverMode:Ljava/lang/Boolean;

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "perfdata battery "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->currentNow:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "uAmps "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/roblox/engine/jni/model/BatteryStatus;->power:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "mW"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "rbx.perfdata"

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lcom/roblox/engine/jni/NativeGLInterface;->reportBatteryStatus(Lcom/roblox/engine/jni/model/BatteryStatus;)V

    return-void
.end method

.method public final n(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "level"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "scale"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    int-to-float v0, v0

    int-to-float v2, v2

    div-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    const-string v2, "status"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batteryStatus: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lwh/i;->k(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " batteryLevel: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BatteryStatusObserver"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->reportBatteryStateChanged(II)V

    return-void
.end method

.method public o()V
    .locals 8

    invoke-virtual {p0}, Lwh/i;->q()V

    const-string v0, "BatteryStatusObserver"

    const-string v1, "startObserving"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->G2()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lwh/i;->p()V

    return-void

    :cond_0
    iget-object v1, p0, Lwh/i;->e:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lwh/g;

    invoke-direct {v2, p0}, Lwh/g;-><init>(Lwh/i;)V

    sget-wide v5, Lwh/i;->g:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lwh/i;->f:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public p()V
    .locals 3

    invoke-virtual {p0}, Lwh/i;->q()V

    const-string v0, "BatteryStatusObserver"

    const-string v1, "startObserving"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lwh/i$a;

    invoke-direct {v0, p0}, Lwh/i$a;-><init>(Lwh/i;)V

    iput-object v0, p0, Lwh/i;->c:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lwh/i;->a:Landroid/content/Context;

    iget-object v2, p0, Lwh/i;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lwh/i;->n(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public q()V
    .locals 3

    iget-object v0, p0, Lwh/i;->c:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "BatteryStatusObserver"

    const-string v2, "stopObserving"

    invoke-static {v0, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwh/i;->a:Landroid/content/Context;

    iget-object v2, p0, Lwh/i;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iput-object v1, p0, Lwh/i;->c:Landroid/content/BroadcastReceiver;

    :cond_0
    iget-object v0, p0, Lwh/i;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v1, p0, Lwh/i;->f:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    return-void
.end method
