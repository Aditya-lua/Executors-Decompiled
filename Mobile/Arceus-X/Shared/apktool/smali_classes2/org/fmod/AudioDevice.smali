.class public Lorg/fmod/AudioDevice;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mTrack:Landroid/media/AudioTrack;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    return-void
.end method

.method private fetchChannelConfigFromCount(I)I
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    if-ne p1, v1, :cond_1

    const/4 p1, 0x3

    return p1

    :cond_1
    const/4 v0, 0x6

    if-ne p1, v0, :cond_2

    const/16 p1, 0xfc

    return p1

    :cond_2
    const/16 v0, 0x8

    if-ne p1, v0, :cond_3

    const/16 p1, 0x18fc

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public close()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "fmod"

    const-string v1, "AudioDevice::init : AudioTrack stop caused IllegalStateException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    return-void
.end method

.method public init(IIII)Z
    .locals 8

    invoke-direct {p0, p1}, Lorg/fmod/AudioDevice;->fetchChannelConfigFromCount(I)I

    move-result v3

    const/4 v0, 0x2

    invoke-static {p2, v3, v0}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v1

    const-string v2, " bytes"

    const-string v7, "fmod"

    if-gez v1, :cond_0

    const-string v4, "AudioDevice::init : Couldn\'t query minimum buffer size, possibly unsupported sample rate or channel count"

    invoke-static {v7, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AudioDevice::init : Min buffer size: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    mul-int/2addr p3, p4

    mul-int/2addr p3, p1

    mul-int/2addr p3, v0

    if-le p3, v1, :cond_1

    move v5, p3

    goto :goto_1

    :cond_1
    move v5, v1

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "AudioDevice::init : Actual buffer size: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v7, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    :try_start_0
    new-instance v0, Landroid/media/AudioTrack;

    const/4 v4, 0x2

    const/4 v6, 0x1

    const/4 v1, 0x3

    move v2, p2

    invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    iput-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const-string p2, "AudioDevice::init : AudioTrack play caused IllegalStateException"

    invoke-static {v7, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    invoke-virtual {p2}, Landroid/media/AudioTrack;->release()V

    const/4 p2, 0x0

    iput-object p2, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    return p1

    :catch_1
    const-string p2, "AudioDevice::init : AudioTrack creation caused IllegalArgumentException"

    invoke-static {v7, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return p1
.end method

.method public write([BI)V
    .locals 2

    iget-object v0, p0, Lorg/fmod/AudioDevice;->mTrack:Landroid/media/AudioTrack;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Landroid/media/AudioTrack;->write([BII)I

    return-void
.end method
