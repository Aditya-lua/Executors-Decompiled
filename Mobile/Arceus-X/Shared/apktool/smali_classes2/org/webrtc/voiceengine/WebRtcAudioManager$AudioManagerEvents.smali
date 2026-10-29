.class Lorg/webrtc/voiceengine/WebRtcAudioManager$AudioManagerEvents;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/voiceengine/WebRtcAudioManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AudioManagerEvents"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/webrtc/voiceengine/WebRtcAudioManager;


# direct methods
.method private constructor <init>(Lorg/webrtc/voiceengine/WebRtcAudioManager;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lorg/webrtc/voiceengine/WebRtcAudioManager$AudioManagerEvents;->this$0:Lorg/webrtc/voiceengine/WebRtcAudioManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/webrtc/voiceengine/WebRtcAudioManager;Lorg/webrtc/voiceengine/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/webrtc/voiceengine/WebRtcAudioManager$AudioManagerEvents;-><init>(Lorg/webrtc/voiceengine/WebRtcAudioManager;)V

    return-void
.end method


# virtual methods
.method public onAudioDeviceChanged(Ljava/lang/String;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onAudioDeviceChanged: selectedAudioDevice: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "WebRtcAudioManager"

    invoke-static {p2, p1}, Lorg/webrtc/Logging;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, Lorg/webrtc/voiceengine/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;)V

    return-void
.end method
