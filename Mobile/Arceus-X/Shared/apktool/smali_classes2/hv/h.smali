.class public Lhv/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhv/h$f;,
        Lhv/h$e;,
        Lhv/h$d;,
        Lhv/h$c;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lhv/h$f;

.field public final c:Landroid/media/AudioManager;

.field public final d:Landroid/os/Handler;

.field public e:I

.field public f:Lhv/h$e;

.field public final g:Landroid/bluetooth/BluetoothProfile$ServiceListener;

.field public h:Landroid/bluetooth/BluetoothAdapter;

.field public i:Landroid/bluetooth/BluetoothHeadset;

.field public j:Landroid/bluetooth/BluetoothDevice;

.field public final k:Landroid/content/BroadcastReceiver;

.field public l:Landroid/media/AudioDeviceCallback;

.field public final m:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lhv/h$f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhv/g;

    invoke-direct {v0, p0}, Lhv/g;-><init>(Lhv/h;)V

    iput-object v0, p0, Lhv/h;->m:Ljava/lang/Runnable;

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "ctor"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Liv/a;->f()V

    iput-object p1, p0, Lhv/h;->a:Landroid/content/Context;

    iput-object p2, p0, Lhv/h;->b:Lhv/h$f;

    invoke-virtual {p0, p1}, Lhv/h;->o(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object p1

    iput-object p1, p0, Lhv/h;->c:Landroid/media/AudioManager;

    sget-object p1, Lhv/h$e;->a:Lhv/h$e;

    iput-object p1, p0, Lhv/h;->f:Lhv/h$e;

    new-instance p1, Lhv/h$d;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lhv/h$d;-><init>(Lhv/h;Lhv/i;)V

    iput-object p1, p0, Lhv/h;->g:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    new-instance p1, Lhv/h$c;

    invoke-direct {p1, p0, p2}, Lhv/h$c;-><init>(Lhv/h;Lhv/i;)V

    iput-object p1, p0, Lhv/h;->k:Landroid/content/BroadcastReceiver;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lhv/h;->d:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Lhv/h;)V
    .locals 0

    invoke-virtual {p0}, Lhv/h;->j()V

    return-void
.end method

.method public static bridge synthetic b(Lhv/h;)Lhv/h$e;
    .locals 0

    iget-object p0, p0, Lhv/h;->f:Lhv/h$e;

    return-object p0
.end method

.method public static bridge synthetic c(Lhv/h;Lhv/h$e;)V
    .locals 0

    iput-object p1, p0, Lhv/h;->f:Lhv/h$e;

    return-void
.end method

.method public static bridge synthetic d(Lhv/h;)V
    .locals 0

    invoke-virtual {p0}, Lhv/h;->w()V

    return-void
.end method

.method public static bridge synthetic e(Lhv/h;)V
    .locals 0

    invoke-virtual {p0}, Lhv/h;->x()V

    return-void
.end method

.method public static bridge synthetic f(Lhv/h;)V
    .locals 0

    invoke-virtual {p0}, Lhv/h;->y()V

    return-void
.end method

.method public static bridge synthetic g(Lhv/h;)V
    .locals 0

    invoke-virtual {p0}, Lhv/h;->z()V

    return-void
.end method

.method public static bridge synthetic h(Lhv/h;Landroid/bluetooth/BluetoothHeadset;)V
    .locals 0

    invoke-virtual {p0, p1}, Lhv/h;->A(Landroid/bluetooth/BluetoothHeadset;)V

    return-void
.end method

.method public static bridge synthetic i(Lhv/h;)V
    .locals 0

    invoke-virtual {p0}, Lhv/h;->B()V

    return-void
.end method

.method public static n(Landroid/content/Context;Lhv/h$f;)Lhv/h;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "create"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Liv/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lhv/h;

    invoke-direct {v0, p0, p1}, Lhv/h;-><init>(Landroid/content/Context;Lhv/h$f;)V

    return-object v0
.end method


# virtual methods
.method public final A(Landroid/bluetooth/BluetoothHeadset;)V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetProfileConnected"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    invoke-virtual {p0}, Lhv/h;->N()V

    return-void
.end method

.method public final B()V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetProfileDisconnected"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lhv/h;->K()V

    const/4 v0, 0x0

    iput-object v0, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    iput-object v0, p0, Lhv/h;->j:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0}, Lhv/h;->N()V

    return-void
.end method

.method public final C()V
    .locals 3

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "registerAudioDeviceCallback"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->l:Landroid/media/AudioDeviceCallback;

    if-nez v0, :cond_1

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lhv/h$a;

    invoke-direct {v0, p0}, Lhv/h$a;-><init>(Lhv/h;)V

    iput-object v0, p0, Lhv/h;->l:Landroid/media/AudioDeviceCallback;

    iget-object v1, p0, Lhv/h;->c:Landroid/media/AudioManager;

    iget-object v2, p0, Lhv/h;->d:Landroid/os/Handler;

    invoke-virtual {v1, v0, v2}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public D(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lhv/h;->a:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public E()V
    .locals 4

    invoke-static {}, Liv/a;->f()V

    const-string v0, "start"

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Starting AppRtcBluetoothManager..."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    const-string v0, "audioManager == null"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v2, p0, Lhv/h;->f:Lhv/h$e;

    sget-object v3, Lhv/h$e;->a:Lhv/h$e;

    if-eq v2, v3, :cond_1

    const-string v0, "Invalid BT state"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v2, 0x0

    iput-object v2, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    iput-object v2, p0, Lhv/h;->j:Landroid/bluetooth/BluetoothDevice;

    const/4 v2, 0x0

    iput v2, p0, Lhv/h;->e:I

    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoAvailableOffCall()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Bluetooth SCO audio is not available off call"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lhv/h;->h:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_3

    const-string v0, "Device does not support Bluetooth"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    iget-object v0, p0, Lhv/h;->a:Landroid/content/Context;

    iget-object v2, p0, Lhv/h;->g:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    invoke-virtual {p0, v0, v2}, Lhv/h;->p(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "BluetoothAdapter.getBluetoothHeadsetProfileProxy failed"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v2, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v2, p0, Lhv/h;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v2, v0}, Lhv/h;->D(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start: bluetoothHeadsetReceiver registered. receiverIntent.action="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " receiverIntent.extras="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    const-string v0, "Bluetooth proxy for headset profile has started."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lhv/h;->k()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lhv/h;->C()V

    :cond_6
    sget-object v0, Lhv/h$e;->b:Lhv/h$e;

    invoke-virtual {p0, v0}, Lhv/h;->m(Lhv/h$e;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start done: BT state="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final F()V
    .locals 2

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->startBluetoothSco()V

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    return-void
.end method

.method public final G()Z
    .locals 5

    invoke-static {}, Liv/a;->f()V

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    const/4 v1, 0x0

    const-string v2, "AppRtcBluetoothMgr"

    if-nez v0, :cond_0

    const-string v0, "startScoAudio: audioManager == null"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSco: BT state="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", attempts: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lhv/h;->e:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", SCO is on: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhv/h;->u()Z

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lhv/h;->e:I

    const/4 v4, 0x2

    if-lt v0, v4, :cond_1

    const-string v0, "BT SCO connection fails - no more attempts"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_1
    const-string v0, "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED..."

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lhv/h;->F()V

    iget v0, p0, Lhv/h;->e:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lhv/h;->e:I

    invoke-virtual {p0}, Lhv/h;->H()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "startScoAudio done: BT state="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhv/h;->u()Z

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method

.method public final H()V
    .locals 4

    invoke-static {}, Liv/a;->f()V

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "startTimer"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->d:Landroid/os/Handler;

    iget-object v1, p0, Lhv/h;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lhv/h;->d:Landroid/os/Handler;

    iget-object v1, p0, Lhv/h;->m:Ljava/lang/Runnable;

    const-wide/16 v2, 0xfa0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public I()V
    .locals 6

    invoke-static {}, Liv/a;->f()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stop: BT state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->h:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhv/h;->f:Lhv/h$e;

    sget-object v2, Lhv/h$e;->a:Lhv/h$e;

    if-ne v0, v2, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lhv/h;->L()V

    invoke-virtual {p0}, Lhv/h;->K()V

    iget-object v0, p0, Lhv/h;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lhv/h;->M(Landroid/content/BroadcastReceiver;)V

    invoke-virtual {p0}, Lhv/h;->l()V

    iget-object v0, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    iget-object v4, p0, Lhv/h;->h:Landroid/bluetooth/BluetoothAdapter;

    const/4 v5, 0x1

    invoke-virtual {v4, v5, v0}, Landroid/bluetooth/BluetoothAdapter;->closeProfileProxy(ILandroid/bluetooth/BluetoothProfile;)V

    iput-object v3, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    :cond_2
    iput-object v3, p0, Lhv/h;->h:Landroid/bluetooth/BluetoothAdapter;

    iput-object v3, p0, Lhv/h;->j:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, v2}, Lhv/h;->m(Lhv/h$e;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stop done: BT state="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final J()V
    .locals 2

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->stopBluetoothSco()V

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    return-void
.end method

.method public final K()V
    .locals 4

    invoke-static {}, Liv/a;->f()V

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    const-string v1, "AppRtcBluetoothMgr"

    if-nez v0, :cond_0

    const-string v0, "stopScoAudio: audioManager == null"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stopScoAudio: BT state="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", SCO is on: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhv/h;->u()Z

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->f:Lhv/h$e;

    sget-object v3, Lhv/h$e;->e:Lhv/h$e;

    if-eq v0, v3, :cond_1

    sget-object v3, Lhv/h$e;->f:Lhv/h$e;

    if-eq v0, v3, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lhv/h;->l()V

    invoke-virtual {p0}, Lhv/h;->J()V

    sget-object v0, Lhv/h$e;->d:Lhv/h$e;

    invoke-virtual {p0, v0}, Lhv/h;->m(Lhv/h$e;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stopScoAudio done: BT state="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhv/h;->u()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final L()V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "unregisterAudioDeviceCallback"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->l:Landroid/media/AudioDeviceCallback;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lhv/h;->c:Landroid/media/AudioManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public M(Landroid/content/BroadcastReceiver;)V
    .locals 1

    iget-object v0, p0, Lhv/h;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public final declared-synchronized N()V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "AppRtcBluetoothMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update: bluetoothState="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->f:Lhv/h$e;

    sget-object v1, Lhv/h$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lhv/h;->r()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v0, Lhv/h$e;->f:Lhv/h$e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lhv/h;->P()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lhv/h$e;->c:Lhv/h$e;

    goto :goto_0

    :cond_2
    sget-object v0, Lhv/h$e;->b:Lhv/h$e;

    :cond_3
    :goto_0
    sget-object v1, Lhv/h$e;->c:Lhv/h$e;

    if-ne v0, v1, :cond_4

    iget v1, p0, Lhv/h;->e:I

    const/4 v2, 0x2

    if-ge v1, v2, :cond_4

    const-string v1, "AppRtcBluetoothMgr"

    const-string v2, "Starting SCO Audio..."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lhv/h;->G()Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v0, Lhv/h$e;->e:Lhv/h$e;

    :cond_4
    iget-object v1, p0, Lhv/h;->f:Lhv/h$e;

    if-eq v0, v1, :cond_5

    invoke-virtual {p0, v0}, Lhv/h;->m(Lhv/h$e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final O()V
    .locals 2

    invoke-static {}, Liv/a;->f()V

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "updateAudioDeviceState"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lhv/h;->v()V

    iget-object v0, p0, Lhv/h;->b:Lhv/h$f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lhv/h$f;->a()V

    :cond_0
    return-void
.end method

.method public final P()Z
    .locals 4

    iget-object v0, p0, Lhv/h;->f:Lhv/h$e;

    sget-object v1, Lhv/h$e;->a:Lhv/h$e;

    const/4 v2, 0x0

    const-string v3, "AppRtcBluetoothMgr"

    if-ne v0, v1, :cond_0

    const-string v0, "updateDevice: not initialized!"

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_0
    iget-object v0, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateDevice: bluetoothHeadset is null. bluetoothState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_1
    invoke-virtual {p0}, Lhv/h;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lhv/h;->a:Landroid/content/Context;

    iget-object v1, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v3, v0, v1}, Liv/a;->j(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iput-object v0, p0, Lhv/h;->j:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_2

    const-string v0, "updateDevice: No connected bluetooth headset"

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lhv/h;->a:Landroid/content/Context;

    iget-object v2, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v3, v1, v2, v0}, Liv/a;->t(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)V

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    if-eqz v0, :cond_4

    invoke-static {v3, v0}, Liv/a;->r(Ljava/lang/String;Landroid/media/AudioManager;)V

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    invoke-static {v0, v2}, Liv/a;->l(Landroid/media/AudioManager;Z)Z

    move-result v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateDevice: permission not granted, bluetoothState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateDevice done: hasBluetoothHeadset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v2
.end method

.method public final j()V
    .locals 3

    invoke-static {}, Liv/a;->f()V

    iget-object v0, p0, Lhv/h;->f:Lhv/h$e;

    sget-object v1, Lhv/h$e;->a:Lhv/h$e;

    const-string v2, "AppRtcBluetoothMgr"

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bluetoothTimeout: BT state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", attempts: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lhv/h;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", SCO is on: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhv/h;->u()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->f:Lhv/h$e;

    sget-object v1, Lhv/h$e;->e:Lhv/h$e;

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lhv/h;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lhv/h;->a:Landroid/content/Context;

    iget-object v1, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v2, v0, v1}, Liv/a;->i(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iput-object v0, p0, Lhv/h;->j:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lhv/h;->r()Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lhv/h;->w()V

    goto :goto_1

    :cond_4
    const-string v0, "BT failed to connect after timeout"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lhv/h;->K()V

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bluetoothTimeout done: BT state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_5
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bluetoothTimeout: not initialized! BT state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public k()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l()V
    .locals 2

    invoke-static {}, Liv/a;->f()V

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "cancelTimer"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->d:Landroid/os/Handler;

    iget-object v1, p0, Lhv/h;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final m(Lhv/h$e;)V
    .locals 2

    iget-object v0, p0, Lhv/h;->f:Lhv/h$e;

    if-eq p1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Changing state from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lhv/h;->f:Lhv/h$e;

    sget-object v0, Lhv/h$e;->a:Lhv/h$e;

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lhv/h;->O()V

    :cond_0
    return-void
.end method

.method public o(Landroid/content/Context;)Landroid/media/AudioManager;
    .locals 1

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    return-object p1
.end method

.method public p(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;)Z
    .locals 2

    iget-object v0, p0, Lhv/h;->h:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    move-result p1

    return p1
.end method

.method public final q()Lhv/h$e;
    .locals 1

    invoke-static {}, Liv/a;->f()V

    iget-object v0, p0, Lhv/h;->f:Lhv/h$e;

    return-object v0
.end method

.method public final r()Z
    .locals 4

    invoke-virtual {p0}, Lhv/h;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv/h;->a:Landroid/content/Context;

    iget-object v1, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    iget-object v2, p0, Lhv/h;->j:Landroid/bluetooth/BluetoothDevice;

    const-string v3, "AppRtcBluetoothMgr"

    invoke-static {v3, v0, v1, v2}, Liv/a;->o(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Liv/a;->l(Landroid/media/AudioManager;Z)Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public s()Z
    .locals 2

    invoke-virtual {p0}, Lhv/h;->q()Lhv/h$e;

    move-result-object v0

    sget-object v1, Lhv/h$e;->f:Lhv/h$e;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lhv/h;->q()Lhv/h$e;

    move-result-object v0

    sget-object v1, Lhv/h$e;->e:Lhv/h$e;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lhv/h;->q()Lhv/h$e;

    move-result-object v0

    sget-object v1, Lhv/h$e;->c:Lhv/h$e;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public t()Z
    .locals 2

    invoke-virtual {p0}, Lhv/h;->q()Lhv/h$e;

    move-result-object v0

    sget-object v1, Lhv/h$e;->f:Lhv/h$e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    move-result v0

    return v0
.end method

.method public final v()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bluetoothState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->c:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    invoke-static {v1, v0}, Liv/a;->r(Ljava/lang/String;Landroid/media/AudioManager;)V

    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lhv/h;->h:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v2, :cond_2

    if-eq v0, v2, :cond_2

    const-string v0, "Cached adapter different that default BluetoothAdapter!"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string v0, "Default BluetoothAdapter unavailable!"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_3

    iget-object v0, p0, Lhv/h;->a:Landroid/content/Context;

    const-string v2, "android.permission.BLUETOOTH_CONNECT"

    invoke-static {v0, v2}, Liv/a;->n(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "logBluetoothStatus: BLUETOOTH_CONNECT not granted!"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    iget-object v0, p0, Lhv/h;->i:Landroid/bluetooth/BluetoothHeadset;

    if-eqz v0, :cond_4

    iget-object v2, p0, Lhv/h;->a:Landroid/content/Context;

    invoke-static {v1, v2, v0}, Liv/a;->s(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;)V

    return-void

    :cond_4
    const-string v0, "No headset connected."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final w()V
    .locals 3

    const-string v0, "onHeadsetAudioConnected"

    const-string v1, "AppRtcBluetoothMgr"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/h;->f:Lhv/h$e;

    sget-object v2, Lhv/h$e;->f:Lhv/h$e;

    if-ne v0, v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onHeadsetAudioConnected: Audio already connected. state="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lhv/h;->f:Lhv/h$e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p0}, Lhv/h;->l()V

    iget-object v0, p0, Lhv/h;->f:Lhv/h$e;

    sget-object v2, Lhv/h$e;->e:Lhv/h$e;

    if-ne v0, v2, :cond_1

    const-string v0, "+++ Bluetooth audio SCO is now connected"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput v0, p0, Lhv/h;->e:I

    invoke-virtual {p0}, Lhv/h;->N()V

    return-void

    :cond_1
    const-string v0, "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final x()V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetAudioDisconnected"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lhv/h$e;->c:Lhv/h$e;

    invoke-virtual {p0, v0}, Lhv/h;->m(Lhv/h$e;)V

    const/4 v0, 0x0

    iput v0, p0, Lhv/h;->e:I

    invoke-virtual {p0}, Lhv/h;->N()V

    return-void
.end method

.method public final y()V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetConnected"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput v0, p0, Lhv/h;->e:I

    invoke-virtual {p0}, Lhv/h;->N()V

    return-void
.end method

.method public final z()V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onHeadsetDisconnected"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lhv/h;->K()V

    invoke-virtual {p0}, Lhv/h;->N()V

    return-void
.end method
