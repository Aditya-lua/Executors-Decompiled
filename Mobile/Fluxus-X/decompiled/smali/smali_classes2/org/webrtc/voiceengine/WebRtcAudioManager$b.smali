.class public Lorg/webrtc/voiceengine/WebRtcAudioManager$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/voiceengine/WebRtcAudioManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/voiceengine/WebRtcAudioManager$b$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/media/AudioManager;

.field public b:Ljava/util/Timer;


# direct methods
.method public constructor <init>(Landroid/media/AudioManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/voiceengine/WebRtcAudioManager$b;->a:Landroid/media/AudioManager;

    return-void
.end method

.method public static bridge synthetic a(Lorg/webrtc/voiceengine/WebRtcAudioManager$b;)Landroid/media/AudioManager;
    .locals 0

    iget-object p0, p0, Lorg/webrtc/voiceengine/WebRtcAudioManager$b;->a:Landroid/media/AudioManager;

    return-object p0
.end method

.method public static bridge synthetic b(Lorg/webrtc/voiceengine/WebRtcAudioManager$b;)V
    .locals 0

    invoke-virtual {p0}, Lorg/webrtc/voiceengine/WebRtcAudioManager$b;->d()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 6

    new-instance v0, Ljava/util/Timer;

    const-string v1, "WebRtcVolumeLevelLoggerThread"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioManager$b;->b:Ljava/util/Timer;

    new-instance v1, Lorg/webrtc/voiceengine/WebRtcAudioManager$b$a;

    iget-object v2, p0, Lorg/webrtc/voiceengine/WebRtcAudioManager$b;->a:Landroid/media/AudioManager;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v2

    iget-object v3, p0, Lorg/webrtc/voiceengine/WebRtcAudioManager$b;->a:Landroid/media/AudioManager;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v3

    invoke-direct {v1, p0, v2, v3}, Lorg/webrtc/voiceengine/WebRtcAudioManager$b$a;-><init>(Lorg/webrtc/voiceengine/WebRtcAudioManager$b;II)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x7530

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioManager$b;->b:Ljava/util/Timer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioManager$b;->b:Ljava/util/Timer;

    :cond_0
    return-void
.end method
