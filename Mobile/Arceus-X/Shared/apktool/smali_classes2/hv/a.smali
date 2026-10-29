.class public final synthetic Lhv/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lhv/e;

.field public final synthetic b:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;


# direct methods
.method public synthetic constructor <init>(Lhv/e;Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhv/a;->a:Lhv/e;

    iput-object p2, p0, Lhv/a;->b:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lhv/a;->a:Lhv/e;

    iget-object v1, p0, Lhv/a;->b:Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;

    invoke-static {v0, v1}, Lhv/e;->c(Lhv/e;Lorg/webrtc/voiceengine/AppAudioManagerBase$AudioManagerEvents;)V

    return-void
.end method
