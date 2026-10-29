.class final Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;
.super Lcom/roblox/engine/jni/autovalue/StartGameParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;
    }
.end annotation


# instance fields
.field private final accessCode:Ljava/lang/String;

.field private final callId:Ljava/lang/String;

.field private final conversationId:J

.field private final deviceParams:Lcom/roblox/engine/jni/model/DeviceParams;

.field private final eventId:Ljava/lang/String;

.field private final gameId:Ljava/lang/String;

.field private final gameIdToExclude:Ljava/lang/String;

.field private final gameJoinContext:Ljava/lang/String;

.field private final isUnder13:Z

.field private final isoContext:Ljava/lang/String;

.field private final joinAttemptId:Ljava/lang/String;

.field private final joinAttemptOrigin:Ljava/lang/String;

.field private final joinRequestType:I

.field private final launchData:Ljava/lang/String;

.field private final linkCode:Ljava/lang/String;

.field private final placeId:J

.field private final platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

.field private final referralPage:Ljava/lang/String;

.field private final referredByPlayerId:J

.field private final reservedServerAccessCode:Ljava/lang/String;

.field private final surface:Landroid/view/Surface;

.field private final userId:J

.field private final username:Ljava/lang/String;

.field private final vrContext:Landroid/app/Activity;


# direct methods
.method private constructor <init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Landroid/app/Activity;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/StartGameParams;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->surface:Landroid/view/Surface;

    .line 4
    iput-object p2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    .line 5
    iput-object p3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->deviceParams:Lcom/roblox/engine/jni/model/DeviceParams;

    .line 6
    iput-wide p4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->placeId:J

    .line 7
    iput-wide p6, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->userId:J

    .line 8
    iput-object p8, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->accessCode:Ljava/lang/String;

    .line 9
    iput-object p9, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->linkCode:Ljava/lang/String;

    .line 10
    iput-object p10, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameId:Ljava/lang/String;

    .line 11
    iput-boolean p11, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->isUnder13:Z

    .line 12
    iput-object p12, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->username:Ljava/lang/String;

    .line 13
    iput-wide p13, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->conversationId:J

    .line 14
    iput-object p15, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->reservedServerAccessCode:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 15
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->callId:Ljava/lang/String;

    move/from16 p1, p17

    .line 16
    iput p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinRequestType:I

    move-object/from16 p1, p18

    .line 17
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->referralPage:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 18
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->launchData:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 19
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameJoinContext:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 20
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->eventId:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 21
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinAttemptId:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 22
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinAttemptOrigin:Ljava/lang/String;

    move-object/from16 p1, p24

    .line 23
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->isoContext:Ljava/lang/String;

    move-wide/from16 p1, p25

    .line 24
    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->referredByPlayerId:J

    move-object/from16 p1, p27

    .line 25
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameIdToExclude:Ljava/lang/String;

    move-object/from16 p1, p28

    .line 26
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->vrContext:Landroid/app/Activity;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/i;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p28}, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;-><init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public accessCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->accessCode:Ljava/lang/String;

    return-object v0
.end method

.method public callId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public conversationId()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->conversationId:J

    return-wide v0
.end method

.method public deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->deviceParams:Lcom/roblox/engine/jni/model/DeviceParams;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/roblox/engine/jni/autovalue/StartGameParams;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, Lcom/roblox/engine/jni/autovalue/StartGameParams;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->surface:Landroid/view/Surface;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->surface()Landroid/view/Surface;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->platformParams()Lcom/roblox/engine/jni/model/PlatformParams;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->deviceParams:Lcom/roblox/engine/jni/model/DeviceParams;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    iget-wide v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->placeId:J

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->placeId()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_4

    iget-wide v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->userId:J

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->userId()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->accessCode:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->accessCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->linkCode:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->linkCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->gameId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->isUnder13:Z

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->isUnder13()Z

    move-result v3

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->username:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->username()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-wide v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->conversationId:J

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->conversationId()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->reservedServerAccessCode:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->reservedServerAccessCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->callId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->callId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinRequestType:I

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->joinRequestType()I

    move-result v3

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->referralPage:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->referralPage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->launchData:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->launchData()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameJoinContext:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->gameJoinContext()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->eventId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->eventId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinAttemptId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->joinAttemptId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinAttemptOrigin:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->joinAttemptOrigin()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->isoContext:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->isoContext()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-wide v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->referredByPlayerId:J

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->referredByPlayerId()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameIdToExclude:Ljava/lang/String;

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->gameIdToExclude()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->gameIdToExclude()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->vrContext:Landroid/app/Activity;

    if-nez v1, :cond_3

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->vrContext()Landroid/app/Activity;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->vrContext()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_2
    return v0

    :cond_4
    return v2
.end method

.method public eventId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->eventId:Ljava/lang/String;

    return-object v0
.end method

.method public gameId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameId:Ljava/lang/String;

    return-object v0
.end method

.method public gameIdToExclude()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameIdToExclude:Ljava/lang/String;

    return-object v0
.end method

.method public gameJoinContext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameJoinContext:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 8

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->surface:Landroid/view/Surface;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->deviceParams:Lcom/roblox/engine/jni/model/DeviceParams;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->placeId:J

    const/16 v2, 0x20

    ushr-long v6, v4, v2

    xor-long/2addr v4, v6

    long-to-int v4, v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-wide v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->userId:J

    ushr-long v6, v4, v2

    xor-long/2addr v4, v6

    long-to-int v4, v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->accessCode:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->linkCode:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameId:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-boolean v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->isUnder13:Z

    if-eqz v4, :cond_1

    const/16 v4, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v4, 0x4d5

    :goto_1
    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->username:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-wide v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->conversationId:J

    ushr-long v6, v4, v2

    xor-long/2addr v4, v6

    long-to-int v4, v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->reservedServerAccessCode:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->callId:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinRequestType:I

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->referralPage:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->launchData:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameJoinContext:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->eventId:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinAttemptId:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinAttemptOrigin:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->isoContext:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-wide v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->referredByPlayerId:J

    ushr-long v6, v4, v2

    xor-long/2addr v4, v6

    long-to-int v2, v4

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameIdToExclude:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->vrContext:Landroid/app/Activity;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    xor-int/2addr v0, v3

    return v0
.end method

.method public isUnder13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->isUnder13:Z

    return v0
.end method

.method public isoContext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->isoContext:Ljava/lang/String;

    return-object v0
.end method

.method public joinAttemptId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinAttemptId:Ljava/lang/String;

    return-object v0
.end method

.method public joinAttemptOrigin()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinAttemptOrigin:Ljava/lang/String;

    return-object v0
.end method

.method public joinRequestType()I
    .locals 1

    iget v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinRequestType:I

    return v0
.end method

.method public launchData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->launchData:Ljava/lang/String;

    return-object v0
.end method

.method public linkCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->linkCode:Ljava/lang/String;

    return-object v0
.end method

.method public placeId()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->placeId:J

    return-wide v0
.end method

.method public platformParams()Lcom/roblox/engine/jni/model/PlatformParams;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object v0
.end method

.method public referralPage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->referralPage:Ljava/lang/String;

    return-object v0
.end method

.method public referredByPlayerId()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->referredByPlayerId:J

    return-wide v0
.end method

.method public reservedServerAccessCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->reservedServerAccessCode:Ljava/lang/String;

    return-object v0
.end method

.method public surface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->surface:Landroid/view/Surface;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartGameParams{surface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->surface:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->deviceParams:Lcom/roblox/engine/jni/model/DeviceParams;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->placeId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->userId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", accessCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->accessCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->linkCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gameId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isUnder13="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->isUnder13:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", username="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->username:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", conversationId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->conversationId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", reservedServerAccessCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->reservedServerAccessCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", callId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->callId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinRequestType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinRequestType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", referralPage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->referralPage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", launchData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->launchData:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gameJoinContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameJoinContext:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", eventId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->eventId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinAttemptId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinAttemptId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinAttemptOrigin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->joinAttemptOrigin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isoContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->isoContext:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", referredByPlayerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->referredByPlayerId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", gameIdToExclude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->gameIdToExclude:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", vrContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->vrContext:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public userId()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->userId:J

    return-wide v0
.end method

.method public username()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->username:Ljava/lang/String;

    return-object v0
.end method

.method public vrContext()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;->vrContext:Landroid/app/Activity;

    return-object v0
.end method
