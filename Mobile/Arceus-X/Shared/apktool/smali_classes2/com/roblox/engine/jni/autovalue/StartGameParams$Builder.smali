.class public abstract Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/StartGameParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract autoBuild()Lcom/roblox/engine/jni/autovalue/StartGameParams;
.end method

.method public final build()Lcom/roblox/engine/jni/autovalue/StartGameParams;
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->autoBuild()Lcom/roblox/engine/jni/autovalue/StartGameParams;

    move-result-object v0

    return-object v0
.end method

.method public abstract setAccessCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setCallId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setConversationId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setDeviceParams(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setEventId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setGameId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setGameIdToExclude(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setGameJoinContext(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setIsUnder13(Z)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setIsoContext(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setJoinAttemptId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setJoinAttemptOrigin(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setJoinRequestType(I)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setLaunchData(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setLinkCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setPlaceId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setPlatformParams(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setReferralPage(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setReferredByPlayerId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setReservedServerAccessCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setSurface(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setUserId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setUsername(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method

.method public abstract setVrContext(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.end method
