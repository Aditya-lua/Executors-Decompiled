.class public Lpw/h$a;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpw/h;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lpw/h;


# direct methods
.method public constructor <init>(Lpw/h;)V
    .locals 0

    iput-object p1, p0, Lpw/h$a;->a:Lpw/h;

    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 2

    const-string v0, "onAudioDevicesAdded"

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lqw/a;->m([Landroid/media/AudioDeviceInfo;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpw/h$a;->a:Lpw/h;

    invoke-static {v0}, Lpw/h;->f(Lpw/h;)V

    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lqw/a;->m([Landroid/media/AudioDeviceInfo;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lpw/h$a;->a:Lpw/h;

    invoke-static {p1}, Lpw/h;->b(Lpw/h;)Lpw/h$e;

    move-result-object p1

    sget-object v0, Lpw/h$e;->f:Lpw/h$e;

    if-ne p1, v0, :cond_1

    const-string p1, "SCO_CONNECTED state but device in A2DP. Reconnecting..."

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lpw/h$a;->a:Lpw/h;

    sget-object v0, Lpw/h$e;->c:Lpw/h$e;

    invoke-static {p1, v0}, Lpw/h;->c(Lpw/h;Lpw/h$e;)V

    iget-object p1, p0, Lpw/h$a;->a:Lpw/h;

    invoke-static {p1}, Lpw/h;->f(Lpw/h;)V

    :cond_1
    return-void
.end method

.method public onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onAudioDevicesRemoved"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lqw/a;->m([Landroid/media/AudioDeviceInfo;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpw/h$a;->a:Lpw/h;

    invoke-static {p1}, Lpw/h;->g(Lpw/h;)V

    :cond_0
    return-void
.end method
