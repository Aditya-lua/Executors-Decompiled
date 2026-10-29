.class public Lhv/e;
.super Lorg/webrtc/voiceengine/AppAudioManagerBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhv/e$d;,
        Lhv/e$c;,
        Lhv/e$b;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/media/AudioManager;

.field public c:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

.field public d:Lhv/e$c;

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public final j:Lhv/e$b;

.field public k:Lhv/e$b;

.field public final l:Lhv/h;

.field public m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lhv/e$b;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Landroid/content/BroadcastReceiver;

.field public o:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field public p:Landroid/media/AudioFocusRequest;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Lorg/webrtc/voiceengine/AppAudioManagerBase;-><init>()V

    const/4 v0, -0x2

    iput v0, p0, Lhv/e;->e:I

    const/4 v0, 0x0

    iput v0, p0, Lhv/e;->i:I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lhv/e;->m:Ljava/util/Set;

    const-string v0, "ctor"

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Liv/a;->f()V

    iput-object p1, p0, Lhv/e;->a:Landroid/content/Context;

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

    new-instance v0, Lhv/c;

    invoke-direct {v0, p0}, Lhv/c;-><init>(Lhv/e;)V

    invoke-static {p1, v0}, Lhv/h;->n(Landroid/content/Context;Lhv/h$f;)Lhv/h;

    move-result-object p1

    iput-object p1, p0, Lhv/e;->l:Lhv/h;

    new-instance p1, Lhv/e$d;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lhv/e$d;-><init>(Lhv/e;Lhv/f;)V

    iput-object p1, p0, Lhv/e;->n:Landroid/content/BroadcastReceiver;

    sget-object p1, Lhv/e$c;->a:Lhv/e$c;

    iput-object p1, p0, Lhv/e;->d:Lhv/e$c;

    sget-object p1, Lhv/e$b;->a:Lhv/e$b;

    iput-object p1, p0, Lhv/e;->j:Lhv/e$b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "defaultAudioDevice: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Liv/a;->u(Ljava/lang/String;)V

    invoke-virtual {p0, p0}, Lorg/webrtc/voiceengine/AppAudioManagerBase;->setInstance(Lorg/webrtc/voiceengine/AppAudioManagerBase;)V

    return-void
.end method

.method public static synthetic a(Lhv/e;)V
    .locals 0

    invoke-virtual {p0}, Lhv/e;->s()V

    return-void
.end method

.method public static synthetic b(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAudioFocusChange: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Liv/a;->g(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "AppRtcAudioManager"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic c(Lhv/e;Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V
    .locals 0

    invoke-virtual {p0, p1}, Lhv/e;->j(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V

    return-void
.end method

.method public static bridge synthetic d(Lhv/e;Z)V
    .locals 0

    iput-boolean p1, p0, Lhv/e;->h:Z

    return-void
.end method

.method public static bridge synthetic e(Lhv/e;)V
    .locals 0

    invoke-virtual {p0}, Lhv/e;->s()V

    return-void
.end method

.method public static g(Landroid/content/Context;)Lhv/e;
    .locals 1

    new-instance v0, Lhv/e;

    invoke-direct {v0, p0}, Lhv/e;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public final f()V
    .locals 2

    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lhv/e;->p:Landroid/media/AudioFocusRequest;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    return-void
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, Lhv/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.telephony"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final i()Z
    .locals 9

    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

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

.method public final synthetic j(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V
    .locals 0

    invoke-virtual {p0, p1}, Lhv/e;->p(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V

    return-void
.end method

.method public final k(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 1

    iget-object v0, p0, Lhv/e;->a:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public final l()V
    .locals 4

    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

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

    iget-object v1, p0, Lhv/e;->o:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object v0

    iput-object v0, p0, Lhv/e;->p:Landroid/media/AudioFocusRequest;

    iget-object v1, p0, Lhv/e;->b:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestAudioFocusNew: result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Liv/a;->h(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final m(Lhv/e$b;)V
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

    iget-object v0, p0, Lhv/e;->m:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Liv/a;->a(Z)V

    sget-object v0, Lhv/e$a;->a:[I

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

    invoke-virtual {p0, v0}, Lhv/e;->o(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, Lhv/e;->o(Z)V

    :goto_0
    iput-object p1, p0, Lhv/e;->k:Lhv/e$b;

    return-void
.end method

.method public final n(Z)V
    .locals 1

    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v0

    if-ne v0, p1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    return-void
.end method

.method public final o(Z)V
    .locals 1

    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v0

    if-ne v0, p1, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    return-void
.end method

.method public onDispose()V
    .locals 2

    iget-object v0, p0, Lhv/e;->d:Lhv/e$c;

    sget-object v1, Lhv/e$c;->a:Lhv/e$c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lhv/e;->stopCommunication()V

    :cond_0
    return-void
.end method

.method public p(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V
    .locals 3

    const-string v0, "start"

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Liv/a;->f()V

    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    const-string p1, "start: audioManager == null"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lhv/e;->d:Lhv/e$c;

    sget-object v2, Lhv/e$c;->b:Lhv/e$c;

    if-ne v0, v2, :cond_1

    const-string p1, "AudioManager is already active"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string v0, "AudioManager starts..."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lhv/e;->c:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

    iput-object v2, p0, Lhv/e;->d:Lhv/e$c;

    iget-object p1, p0, Lhv/e;->b:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->getMode()I

    move-result p1

    iput p1, p0, Lhv/e;->e:I

    iget-object p1, p0, Lhv/e;->b:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result p1

    iput-boolean p1, p0, Lhv/e;->f:Z

    iget-object p1, p0, Lhv/e;->b:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result p1

    iput-boolean p1, p0, Lhv/e;->g:Z

    invoke-virtual {p0}, Lhv/e;->i()Z

    move-result p1

    iput-boolean p1, p0, Lhv/e;->h:Z

    new-instance p1, Lhv/d;

    invoke-direct {p1}, Lhv/d;-><init>()V

    iput-object p1, p0, Lhv/e;->o:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {p0}, Lhv/e;->l()V

    iget-object p1, p0, Lhv/e;->b:Landroid/media/AudioManager;

    const/4 v0, 0x3

    invoke-static {v1, p1, v0}, Liv/a;->w(Ljava/lang/String;Landroid/media/AudioManager;I)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lhv/e;->n(Z)V

    sget-object p1, Lhv/e$b;->e:Lhv/e$b;

    iput-object p1, p0, Lhv/e;->k:Lhv/e$b;

    iget-object p1, p0, Lhv/e;->m:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    iget-object p1, p0, Lhv/e;->l:Lhv/h;

    invoke-virtual {p1}, Lhv/h;->E()V

    invoke-virtual {p0}, Lhv/e;->s()V

    iget-object p1, p0, Lhv/e;->n:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.HEADSET_PLUG"

    invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lhv/e;->k(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    const-string p1, "AudioManager started"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public q()V
    .locals 3

    const-string v0, "stop"

    const-string v1, "AppRtcAudioManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Liv/a;->f()V

    iget-object v0, p0, Lhv/e;->d:Lhv/e$c;

    sget-object v2, Lhv/e$c;->b:Lhv/e$c;

    if-eq v0, v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to stop AudioManager in incorrect state: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lhv/e;->d:Lhv/e$c;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    sget-object v0, Lhv/e$c;->a:Lhv/e$c;

    iput-object v0, p0, Lhv/e;->d:Lhv/e$c;

    iget-object v0, p0, Lhv/e;->n:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lhv/e;->r(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lhv/e;->l:Lhv/h;

    invoke-virtual {v0}, Lhv/h;->I()V

    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lhv/e;->f:Z

    invoke-virtual {p0, v0}, Lhv/e;->o(Z)V

    iget-boolean v0, p0, Lhv/e;->g:Z

    invoke-virtual {p0, v0}, Lhv/e;->n(Z)V

    iget v0, p0, Lhv/e;->e:I

    const/4 v2, -0x2

    if-eq v0, v2, :cond_1

    iget-object v2, p0, Lhv/e;->b:Landroid/media/AudioManager;

    invoke-static {v1, v2, v0}, Liv/a;->w(Ljava/lang/String;Landroid/media/AudioManager;I)V

    :cond_1
    invoke-virtual {p0}, Lhv/e;->f()V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lhv/e;->o:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const-string v2, "Abandoned audio focus for VOICE_CALL streams"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object v0, p0, Lhv/e;->c:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

    const-string v0, "AudioManager stopped"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final r(Landroid/content/BroadcastReceiver;)V
    .locals 1

    iget-object v0, p0, Lhv/e;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public final s()V
    .locals 5

    invoke-static {}, Liv/a;->f()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "---> updateAudioDeviceState: wired headset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lhv/e;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", BT isHeadsetAvailable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhv/e;->l:Lhv/h;

    invoke-virtual {v1}, Lhv/h;->s()Z

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

    iget-object v2, p0, Lhv/e;->m:Ljava/util/Set;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", selected="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lhv/e;->k:Lhv/e$b;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    const-string v0, "Mode != MODE_IN_COMMUNICATION"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/e;->b:Landroid/media/AudioManager;

    invoke-static {v1, v0, v3}, Liv/a;->w(Ljava/lang/String;Landroid/media/AudioManager;I)V

    :cond_0
    iget-object v0, p0, Lhv/e;->d:Lhv/e$c;

    sget-object v3, Lhv/e$c;->a:Lhv/e$c;

    if-ne v0, v3, :cond_1

    const-string v0, "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v3, p0, Lhv/e;->l:Lhv/h;

    invoke-virtual {v3}, Lhv/h;->t()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lhv/e$b;->d:Lhv/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-boolean v3, p0, Lhv/e;->h:Z

    if-eqz v3, :cond_3

    sget-object v3, Lhv/e$b;->b:Lhv/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    sget-object v3, Lhv/e$b;->a:Lhv/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lhv/e;->h()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lhv/e$b;->c:Lhv/e$b;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_0
    iget-object v3, p0, Lhv/e;->m:Ljava/util/Set;

    invoke-interface {v3, v0}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v3

    iput-object v0, p0, Lhv/e;->m:Ljava/util/Set;

    iget-object v0, p0, Lhv/e;->l:Lhv/h;

    invoke-virtual {v0}, Lhv/h;->t()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lhv/e$b;->d:Lhv/e$b;

    goto :goto_1

    :cond_5
    iget-boolean v0, p0, Lhv/e;->h:Z

    if-eqz v0, :cond_6

    sget-object v0, Lhv/e$b;->b:Lhv/e$b;

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lhv/e;->j:Lhv/e$b;

    :goto_1
    iget-object v4, p0, Lhv/e;->k:Lhv/e$b;

    if-ne v0, v4, :cond_7

    if-nez v3, :cond_9

    :cond_7
    invoke-virtual {p0, v0}, Lhv/e;->m(Lhv/e$b;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "New device status: available="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lhv/e;->m:Ljava/util/Set;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhv/e;->c:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

    if-eqz v0, :cond_9

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p0, Lhv/e;->m:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhv/e$b;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    iget-object v2, p0, Lhv/e;->c:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

    iget-object v3, p0, Lhv/e;->k:Lhv/e$b;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;->onAudioDeviceChanged(Ljava/lang/String;Ljava/util/Set;)V

    :cond_9
    const-string v0, "<--- updateAudioDeviceState done"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public setActivityForPermissionRequest(Lj/b;)V
    .locals 0

    return-void
.end method

.method public startCommunication(Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V
    .locals 2

    const-string v0, "AppRtcAudioManager"

    const-string v1, "startCommunication"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lhv/e;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lhv/e;->i:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lhv/a;

    invoke-direct {v1, p0, p1}, Lhv/a;-><init>(Lhv/e;Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public stopCommunication()V
    .locals 2

    const-string v0, "AppRtcAudioManager"

    const-string v1, "stopCommunication"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lhv/e;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lhv/e;->i:I

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lhv/b;

    invoke-direct {v1, p0}, Lhv/b;-><init>(Lhv/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
