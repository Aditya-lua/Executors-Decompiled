.class public abstract Lcom/roblox/engine/jni/autovalue/StartGameParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "StartGameParams"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 4

    new-instance v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->p(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;->j(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;->g(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;->q(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;->v(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;->d(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;->m(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;->n(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;->l(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;->u(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;->i(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract accessCode()Ljava/lang/String;
.end method

.method public abstract callId()Ljava/lang/String;
.end method

.method public abstract conversationId()J
.end method

.method public abstract deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;
.end method

.method public abstract eventId()Ljava/lang/String;
.end method

.method public abstract gameId()Ljava/lang/String;
.end method

.method public abstract gameIdToExclude()Ljava/lang/String;
.end method

.method public abstract gameJoinContext()Ljava/lang/String;
.end method

.method public abstract isUnder13()Z
.end method

.method public abstract isoContext()Ljava/lang/String;
.end method

.method public abstract joinAttemptId()Ljava/lang/String;
.end method

.method public abstract joinAttemptOrigin()Ljava/lang/String;
.end method

.method public abstract joinRequestType()I
.end method

.method public abstract launchData()Ljava/lang/String;
.end method

.method public abstract linkCode()Ljava/lang/String;
.end method

.method public abstract placeId()J
.end method

.method public abstract platformParams()Lcom/roblox/engine/jni/model/PlatformParams;
.end method

.method public abstract referralPage()Ljava/lang/String;
.end method

.method public abstract referredByPlayerId()J
.end method

.method public abstract reservedServerAccessCode()Ljava/lang/String;
.end method

.method public abstract surface()Landroid/view/Surface;
.end method

.method public abstract userId()J
.end method

.method public abstract username()Ljava/lang/String;
.end method

.method public abstract vrContext()Landroid/app/Activity;
.end method
