.class final Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;
.super Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private accessCode:Ljava/lang/String;

.field private callId:Ljava/lang/String;

.field private conversationId:J

.field private deviceParams:Lcom/roblox/engine/jni/model/DeviceParams;

.field private eventId:Ljava/lang/String;

.field private gameId:Ljava/lang/String;

.field private gameIdToExclude:Ljava/lang/String;

.field private gameJoinContext:Ljava/lang/String;

.field private isUnder13:Z

.field private isoContext:Ljava/lang/String;

.field private joinAttemptId:Ljava/lang/String;

.field private joinAttemptOrigin:Ljava/lang/String;

.field private joinRequestType:I

.field private launchData:Ljava/lang/String;

.field private linkCode:Ljava/lang/String;

.field private placeId:J

.field private platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

.field private referralPage:Ljava/lang/String;

.field private referredByPlayerId:J

.field private reservedServerAccessCode:Ljava/lang/String;

.field private set$0:B

.field private surface:Landroid/view/Surface;

.field private userId:J

.field private username:Ljava/lang/String;

.field private vrContext:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public autoBuild()Lcom/roblox/engine/jni/autovalue/StartGameParams;
    .locals 33

    move-object/from16 v0, p0

    iget-byte v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    const/16 v2, 0x3f

    if-ne v1, v2, :cond_1

    iget-object v4, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->surface:Landroid/view/Surface;

    if-eqz v4, :cond_1

    iget-object v5, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    if-eqz v5, :cond_1

    iget-object v11, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->accessCode:Ljava/lang/String;

    if-eqz v11, :cond_1

    iget-object v12, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->linkCode:Ljava/lang/String;

    if-eqz v12, :cond_1

    iget-object v13, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->gameId:Ljava/lang/String;

    if-eqz v13, :cond_1

    iget-object v15, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->username:Ljava/lang/String;

    if-eqz v15, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->reservedServerAccessCode:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->callId:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v3, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->referralPage:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v6, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->launchData:Ljava/lang/String;

    if-eqz v6, :cond_1

    iget-object v7, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->gameJoinContext:Ljava/lang/String;

    if-eqz v7, :cond_1

    iget-object v8, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->eventId:Ljava/lang/String;

    if-eqz v8, :cond_1

    iget-object v9, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->joinAttemptId:Ljava/lang/String;

    if-eqz v9, :cond_1

    iget-object v10, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->joinAttemptOrigin:Ljava/lang/String;

    if-eqz v10, :cond_1

    iget-object v14, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->isoContext:Ljava/lang/String;

    if-nez v14, :cond_0

    goto :goto_0

    :cond_0
    move-object/from16 v21, v3

    new-instance v3, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;

    move-object/from16 v22, v6

    iget-object v6, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->deviceParams:Lcom/roblox/engine/jni/model/DeviceParams;

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    iget-wide v7, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->placeId:J

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    iget-wide v9, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->userId:J

    move-object/from16 v27, v14

    iget-boolean v14, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->isUnder13:Z

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    iget-wide v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->conversationId:J

    move-wide/from16 v16, v1

    iget v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->joinRequestType:I

    move/from16 v20, v1

    iget-wide v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->referredByPlayerId:J

    move-wide/from16 v28, v1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->gameIdToExclude:Ljava/lang/String;

    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->vrContext:Landroid/app/Activity;

    const/16 v32, 0x0

    move-object/from16 v30, v1

    move-object/from16 v31, v2

    invoke-direct/range {v3 .. v32}, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;-><init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/i;)V

    return-object v3

    :cond_1
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->surface:Landroid/view/Surface;

    if-nez v2, :cond_2

    const-string v2, " surface"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    if-nez v2, :cond_3

    const-string v2, " platformParams"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_4

    const-string v2, " placeId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    and-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_5

    const-string v2, " userId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->accessCode:Ljava/lang/String;

    if-nez v2, :cond_6

    const-string v2, " accessCode"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->linkCode:Ljava/lang/String;

    if-nez v2, :cond_7

    const-string v2, " linkCode"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->gameId:Ljava/lang/String;

    if-nez v2, :cond_8

    const-string v2, " gameId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    and-int/lit8 v2, v2, 0x4

    if-nez v2, :cond_9

    const-string v2, " isUnder13"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->username:Ljava/lang/String;

    if-nez v2, :cond_a

    const-string v2, " username"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    and-int/lit8 v2, v2, 0x8

    if-nez v2, :cond_b

    const-string v2, " conversationId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->reservedServerAccessCode:Ljava/lang/String;

    if-nez v2, :cond_c

    const-string v2, " reservedServerAccessCode"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->callId:Ljava/lang/String;

    if-nez v2, :cond_d

    const-string v2, " callId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_d
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    and-int/lit8 v2, v2, 0x10

    if-nez v2, :cond_e

    const-string v2, " joinRequestType"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_e
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->referralPage:Ljava/lang/String;

    if-nez v2, :cond_f

    const-string v2, " referralPage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_f
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->launchData:Ljava/lang/String;

    if-nez v2, :cond_10

    const-string v2, " launchData"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_10
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->gameJoinContext:Ljava/lang/String;

    if-nez v2, :cond_11

    const-string v2, " gameJoinContext"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_11
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->eventId:Ljava/lang/String;

    if-nez v2, :cond_12

    const-string v2, " eventId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_12
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->joinAttemptId:Ljava/lang/String;

    if-nez v2, :cond_13

    const-string v2, " joinAttemptId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_13
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->joinAttemptOrigin:Ljava/lang/String;

    if-nez v2, :cond_14

    const-string v2, " joinAttemptOrigin"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_14
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->isoContext:Ljava/lang/String;

    if-nez v2, :cond_15

    const-string v2, " isoContext"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_15
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    and-int/lit8 v2, v2, 0x20

    if-nez v2, :cond_16

    const-string v2, " referredByPlayerId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_16
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public setAccessCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->accessCode:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null accessCode"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCallId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->callId:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null callId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setConversationId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->conversationId:J

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x8

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    return-object p0
.end method

.method public setDeviceParams(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->deviceParams:Lcom/roblox/engine/jni/model/DeviceParams;

    return-object p0
.end method

.method public setEventId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->eventId:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null eventId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setGameId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->gameId:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null gameId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setGameIdToExclude(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->gameIdToExclude:Ljava/lang/String;

    return-object p0
.end method

.method public setGameJoinContext(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->gameJoinContext:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null gameJoinContext"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setIsUnder13(Z)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->isUnder13:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x4

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    return-object p0
.end method

.method public setIsoContext(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->isoContext:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null isoContext"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setJoinAttemptId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->joinAttemptId:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null joinAttemptId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setJoinAttemptOrigin(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->joinAttemptOrigin:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null joinAttemptOrigin"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setJoinRequestType(I)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->joinRequestType:I

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x10

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    return-object p0
.end method

.method public setLaunchData(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->launchData:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null launchData"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLinkCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->linkCode:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null linkCode"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setPlaceId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->placeId:J

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    return-object p0
.end method

.method public setPlatformParams(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->platformParams:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null platformParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setReferralPage(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->referralPage:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null referralPage"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setReferredByPlayerId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->referredByPlayerId:J

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x20

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    return-object p0
.end method

.method public setReservedServerAccessCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->reservedServerAccessCode:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null reservedServerAccessCode"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSurface(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->surface:Landroid/view/Surface;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null surface"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setUserId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->userId:J

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->set$0:B

    return-object p0
.end method

.method public setUsername(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->username:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null username"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setVrContext(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$Builder;->vrContext:Landroid/app/Activity;

    return-object p0
.end method
