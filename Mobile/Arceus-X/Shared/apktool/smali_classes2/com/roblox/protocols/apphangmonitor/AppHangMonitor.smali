.class public Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->createAppHangMonitor()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->a:J

    return-void
.end method

.method private native createAppHangMonitor()J
.end method

.method private native nativePause(J)V
.end method

.method private native nativeResume(J)V
.end method

.method private native nativeStartMonitoring(J)V
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-wide v0, p0, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->a:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->nativePause(J)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 4

    iget-wide v0, p0, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->a:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->nativeResume(J)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 4

    iget-wide v0, p0, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->a:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->nativeStartMonitoring(J)V

    :cond_0
    return-void
.end method
