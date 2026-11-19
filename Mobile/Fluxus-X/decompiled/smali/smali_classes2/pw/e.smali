.class public Lpw/e;
.super Lorg/webrtc/voiceengine/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpw/e$d;,
        Lpw/e$c;,
        Lpw/e$b;
    }
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Landroid/media/AudioManager;

.field public d:Lorg/webrtc/voiceengine/a$a;

.field public e:Lpw/e$c;

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:I

.field public final k:Lpw/e$b;

.field public l:Lpw/e$b;

.field public final m:Lpw/h;

.field public n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lpw/e$b;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Landroid/content/BroadcastReceiver;

.field public p:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field public q:Landroid/media/AudioFocusRequest;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Lorg/webrtc/voiceengine/a;-><init>()V

    const/4 v0, -0x2

    iput v0, p0, Lpw/e;->f:I

    const/4 v0, 0x0

    iput v0, p0, Lpw/e;->j:I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lpw/e;->n:Ljava/util/Set;

    const-string v0, "ctor"

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lqw/a;->f()V

    iput-object p1, p0, Lpw/e;->b:Landroid/content/Context;

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    new-instance v0, Lpw/b;

    invoke-direct {v0, p0}, Lpw/b;-><init>(Lpw/e;)V

    invoke-static {p1, v0}, Lpw/h;->n(Landroid/content/Context;Lpw/h$f;)Lpw/h;

    move-result-object p1

    iput-object p1, p0, Lpw/e;->m:Lpw/h;

    new-instance p1, Lpw/e$d;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lpw/e$d;-><init>(Lpw/e;Lpw/f;)V

    iput-object p1, p0, Lpw/e;->o:Landroid/content/BroadcastReceiver;

    sget-object p1, Lpw/e$c;->a:Lpw/e$c;

    iput-object p1, p0, Lpw/e;->e:Lpw/e$c;

    sget-object p1, Lpw/e$b;->a:Lpw/e$b;

    iput-object p1, p0, Lpw/e;->k:Lpw/e$b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "defaultAudioDevice: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lqw/a;->u(Ljava/lang/String;)V

    invoke-virtual {p0, p0}, Lorg/webrtc/voiceengine/a;->g(Lorg/webrtc/voiceengine/a;)V

    return-void
.end method

.method public static synthetic j(Lpw/e;)V
    .locals 0

    invoke-virtual {p0}, Lpw/e;->B()V

    return-void
.end method

.method public static synthetic k(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAudioFocusChange: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lqw/a;->g(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "AppRtcAudioManager"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic l(Lpw/e;Lorg/webrtc/voiceengine/a$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lpw/e;->s(Lorg/webrtc/voiceengine/a$a;)V

    return-void
.end method

.method public static bridge synthetic m(Lpw/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lpw/e;->i:Z

    return-void
.end method

.method public static bridge synthetic n(Lpw/e;)V
    .locals 0

    invoke-virtual {p0}, Lpw/e;->B()V

    return-void
.end method

.method public static p(Landroid/content/Context;)Lpw/e;
    .locals 1

    new-instance v0, Lpw/e;

    invoke-direct {v0, p0}, Lpw/e;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public final A(Landroid/content/BroadcastReceiver;)V
    .locals 1

    iget-object v0, p0, Lpw/e;->b:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public final B()V
    .locals 5

    invoke-static {}, Lqw/a;->f()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "---> updateAudioDeviceState: wired headset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpw/e;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", BT isHeadsetAvailable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpw/e;->m:Lpw/h;

    invoke-virtual {v1}, Lpw/h;->s()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device status: available="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lpw/e;->n:Ljava/util/Set;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", selected="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lpw/e;->l:Lpw/e$b;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    const-string v0, "Mode != MODE_IN_COMMUNICATION"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    invoke-static {v1, v0, v3}, Lqw/a;->w(Ljava/lang/String;Landroid/media/AudioManager;I)V

    :cond_0
    iget-object v0, p0, Lpw/e;->e:Lpw/e$c;

    sget-object v3, Lpw/e$c;->a:Lpw/e$c;

    if-ne v0, v3, :cond_1

    const-string v0, "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v3, p0, Lpw/e;->m:Lpw/h;

    invoke-virtual {v3}, Lpw/h;->t()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lpw/e$b;->d:Lpw/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-boolean v3, p0, Lpw/e;->i:Z

    if-eqz v3, :cond_3

    sget-object v3, Lpw/e$b;->b:Lpw/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    sget-object v3, Lpw/e$b;->a:Lpw/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lpw/e;->q()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lpw/e$b;->c:Lpw/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_0
    iget-object v3, p0, Lpw/e;->n:Ljava/util/Set;

    invoke-interface {v3, v0}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v3

    iput-object v0, p0, Lpw/e;->n:Ljava/util/Set;

    iget-object v0, p0, Lpw/e;->m:Lpw/h;

    invoke-virtual {v0}, Lpw/h;->t()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lpw/e$b;->d:Lpw/e$b;

    goto :goto_1

    :cond_5
    iget-boolean v0, p0, Lpw/e;->i:Z

    if-eqz v0, :cond_6

    sget-object v0, Lpw/e$b;->b:Lpw/e$b;

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lpw/e;->k:Lpw/e$b;

    :goto_1
    iget-object v4, p0, Lpw/e;->l:Lpw/e$b;

    if-ne v0, v4, :cond_7

    if-nez v3, :cond_9

    :cond_7
    invoke-virtual {p0, v0}, Lpw/e;->v(Lpw/e$b;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "New device status: available="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lpw/e;->n:Ljava/util/Set;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lpw/e;->d:Lorg/webrtc/voiceengine/a$a;

    if-eqz v0, :cond_9

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p0, Lpw/e;->n:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpw/e$b;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    iget-object v2, p0, Lpw/e;->d:Lorg/webrtc/voiceengine/a$a;

    iget-object v3, p0, Lpw/e;->l:Lpw/e$b;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Lorg/webrtc/voiceengine/a$a;->a(Ljava/lang/String;Ljava/util/Set;)V

    :cond_9
    const-string v0, "<--- updateAudioDeviceState done"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lpw/e;->e:Lpw/e$c;

    sget-object v1, Lpw/e$c;->a:Lpw/e$c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lpw/e;->i()V

    :cond_0
    return-void
.end method

.method public e(Lj/b;)V
    .locals 0

    return-void
.end method

.method public h(Lorg/webrtc/voiceengine/a$a;)V
    .locals 2

    const-string v0, "AppRtcAudioManager"

    const-string v1, "startCommunication"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lpw/e;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lpw/e;->j:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lpw/a;

    invoke-direct {v1, p0, p1}, Lpw/a;-><init>(Lpw/e;Lorg/webrtc/voiceengine/a$a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public i()V
    .locals 2

    const-string v0, "AppRtcAudioManager"

    const-string v1, "stopCommunication"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lpw/e;->j:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lpw/e;->j:I

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lpw/c;

    invoke-direct {v1, p0}, Lpw/c;-><init>(Lpw/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lpw/e;->q:Landroid/media/AudioFocusRequest;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    return-void
.end method

.method public final q()Z
    .locals 2

    iget-object v0, p0, Lpw/e;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.telephony"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final r()Z
    .locals 9

    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object v0

    array-length v3, v0

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v0, v4

    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v5

    const-string v6, "AppRtcAudioManager"

    const/4 v7, 0x1

    if-ne v5, v2, :cond_1

    const-string v0, "hasWiredHeadset: found wired headset"

    invoke-static {v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v7

    :cond_1
    const/16 v8, 0xb

    if-ne v5, v8, :cond_2

    const-string v0, "hasWiredHeadset: found USB audio device"

    invoke-static {v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v7

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public final synthetic s(Lorg/webrtc/voiceengine/a$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lpw/e;->y(Lorg/webrtc/voiceengine/a$a;)V

    return-void
.end method

.method public final t(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 1

    iget-object v0, p0, Lpw/e;->b:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public final u()V
    .locals 4

    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    new-instance v3, Landroid/media/AudioFocusRequest$Builder;

    invoke-direct {v3, v1}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    invoke-virtual {v3, v0}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/media/AudioFocusRequest$Builder;->setAcceptsDelayedFocusGain(Z)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/media/AudioFocusRequest$Builder;->setWillPauseWhenDucked(Z)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    iget-object v1, p0, Lpw/e;->p:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object v0

    iput-object v0, p0, Lpw/e;->q:Landroid/media/AudioFocusRequest;

    iget-object v1, p0, Lpw/e;->c:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestAudioFocusNew: result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lqw/a;->h(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final v(Lpw/e$b;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setAudioDeviceInternal(device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lpw/e;->n:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lqw/a;->a(Z)V

    sget-object v0, Lpw/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    const-string v0, "Invalid audio device selection"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lpw/e;->x(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, Lpw/e;->x(Z)V

    :goto_0
    iput-object p1, p0, Lpw/e;->l:Lpw/e$b;

    return-void
.end method

.method public final w(Z)V
    .locals 1

    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v0

    if-ne v0, p1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    return-void
.end method

.method public final x(Z)V
    .locals 1

    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v0

    if-ne v0, p1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    return-void
.end method

.method public y(Lorg/webrtc/voiceengine/a$a;)V
    .locals 3

    const-string v0, "start"

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lqw/a;->f()V

    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    const-string p1, "start: audioManager == null"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lpw/e;->e:Lpw/e$c;

    sget-object v2, Lpw/e$c;->b:Lpw/e$c;

    if-ne v0, v2, :cond_1

    const-string p1, "AudioManager is already active"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string v0, "AudioManager starts..."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lpw/e;->d:Lorg/webrtc/voiceengine/a$a;

    iput-object v2, p0, Lpw/e;->e:Lpw/e$c;

    iget-object p1, p0, Lpw/e;->c:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->getMode()I

    move-result p1

    iput p1, p0, Lpw/e;->f:I

    iget-object p1, p0, Lpw/e;->c:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result p1

    iput-boolean p1, p0, Lpw/e;->g:Z

    iget-object p1, p0, Lpw/e;->c:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result p1

    iput-boolean p1, p0, Lpw/e;->h:Z

    invoke-virtual {p0}, Lpw/e;->r()Z

    move-result p1

    iput-boolean p1, p0, Lpw/e;->i:Z

    new-instance p1, Lpw/d;

    invoke-direct {p1}, Lpw/d;-><init>()V

    iput-object p1, p0, Lpw/e;->p:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {p0}, Lpw/e;->u()V

    iget-object p1, p0, Lpw/e;->c:Landroid/media/AudioManager;

    const/4 v0, 0x3

    invoke-static {v1, p1, v0}, Lqw/a;->w(Ljava/lang/String;Landroid/media/AudioManager;I)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lpw/e;->w(Z)V

    sget-object p1, Lpw/e$b;->e:Lpw/e$b;

    iput-object p1, p0, Lpw/e;->l:Lpw/e$b;

    iget-object p1, p0, Lpw/e;->n:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    iget-object p1, p0, Lpw/e;->m:Lpw/h;

    invoke-virtual {p1}, Lpw/h;->E()V

    invoke-virtual {p0}, Lpw/e;->B()V

    iget-object p1, p0, Lpw/e;->o:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.HEADSET_PLUG"

    invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lpw/e;->t(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    const-string p1, "AudioManager started"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public z()V
    .locals 3

    const-string v0, "stop"

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lqw/a;->f()V

    iget-object v0, p0, Lpw/e;->e:Lpw/e$c;

    sget-object v2, Lpw/e$c;->b:Lpw/e$c;

    if-eq v0, v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to stop AudioManager in incorrect state: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lpw/e;->e:Lpw/e$c;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    sget-object v0, Lpw/e$c;->a:Lpw/e$c;

    iput-object v0, p0, Lpw/e;->e:Lpw/e$c;

    iget-object v0, p0, Lpw/e;->o:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lpw/e;->A(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lpw/e;->m:Lpw/h;

    invoke-virtual {v0}, Lpw/h;->I()V

    iget-object v0, p0, Lpw/e;->c:Landroid/media/AudioManager;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lpw/e;->g:Z

    invoke-virtual {p0, v0}, Lpw/e;->x(Z)V

    iget-boolean v0, p0, Lpw/e;->h:Z

    invoke-virtual {p0, v0}, Lpw/e;->w(Z)V

    iget v0, p0, Lpw/e;->f:I

    const/4 v2, -0x2

    if-eq v0, v2, :cond_1

    iget-object v2, p0, Lpw/e;->c:Landroid/media/AudioManager;

    invoke-static {v1, v2, v0}, Lqw/a;->w(Ljava/lang/String;Landroid/media/AudioManager;I)V

    :cond_1
    invoke-virtual {p0}, Lpw/e;->o()V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lpw/e;->p:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const-string v2, "Abandoned audio focus for VOICE_CALL streams"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object v0, p0, Lpw/e;->d:Lorg/webrtc/voiceengine/a$a;

    const-string v0, "AudioManager stopped"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
