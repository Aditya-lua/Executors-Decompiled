.class public final Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;
.super Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/view/Surface;

.field public b:Lcom/roblox/engine/jni/model/PlatformParams;

.field public c:Lcom/roblox/engine/jni/model/DeviceParams;

.field public d:J

.field public e:J

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Z

.field public j:Ljava/lang/String;

.field public k:J

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:I

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;

.field public v:J

.field public w:Ljava/lang/String;

.field public x:Landroid/app/Activity;

.field public y:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/StartGameParams$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/roblox/engine/jni/autovalue/StartGameParams;
    .locals 33

    move-object/from16 v0, p0

    iget-byte v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    const/16 v2, 0x3f

    if-ne v1, v2, :cond_1

    iget-object v4, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->a:Landroid/view/Surface;

    if-eqz v4, :cond_1

    iget-object v5, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    if-eqz v5, :cond_1

    iget-object v11, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->f:Ljava/lang/String;

    if-eqz v11, :cond_1

    iget-object v12, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->g:Ljava/lang/String;

    if-eqz v12, :cond_1

    iget-object v13, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->h:Ljava/lang/String;

    if-eqz v13, :cond_1

    iget-object v15, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->j:Ljava/lang/String;

    if-eqz v15, :cond_1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->l:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->m:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v3, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->o:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v6, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->p:Ljava/lang/String;

    if-eqz v6, :cond_1

    iget-object v7, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->q:Ljava/lang/String;

    if-eqz v7, :cond_1

    iget-object v8, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->r:Ljava/lang/String;

    if-eqz v8, :cond_1

    iget-object v9, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->s:Ljava/lang/String;

    if-eqz v9, :cond_1

    iget-object v10, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->t:Ljava/lang/String;

    if-eqz v10, :cond_1

    iget-object v14, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->u:Ljava/lang/String;

    if-nez v14, :cond_0

    goto :goto_0

    :cond_0
    move-object/from16 v21, v3

    new-instance v3, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;

    move-object/from16 v22, v6

    iget-object v6, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    iget-wide v7, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->d:J

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    iget-wide v9, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->e:J

    move-object/from16 v27, v14

    iget-boolean v14, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->i:Z

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    iget-wide v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->k:J

    move-wide/from16 v16, v1

    iget v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->n:I

    move/from16 v20, v1

    iget-wide v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->v:J

    move-wide/from16 v28, v1

    iget-object v1, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->w:Ljava/lang/String;

    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->x:Landroid/app/Activity;

    const/16 v32, 0x0

    move-object/from16 v30, v1

    move-object/from16 v31, v2

    invoke-direct/range {v3 .. v32}, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams;-><init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/j;)V

    return-object v3

    :cond_1
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->a:Landroid/view/Surface;

    if-nez v2, :cond_2

    const-string v2, " surface"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    if-nez v2, :cond_3

    const-string v2, " platformParams"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_4

    const-string v2, " placeId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    and-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_5

    const-string v2, " userId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->f:Ljava/lang/String;

    if-nez v2, :cond_6

    const-string v2, " accessCode"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->g:Ljava/lang/String;

    if-nez v2, :cond_7

    const-string v2, " linkCode"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->h:Ljava/lang/String;

    if-nez v2, :cond_8

    const-string v2, " gameId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    and-int/lit8 v2, v2, 0x4

    if-nez v2, :cond_9

    const-string v2, " isUnder13"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->j:Ljava/lang/String;

    if-nez v2, :cond_a

    const-string v2, " username"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    and-int/lit8 v2, v2, 0x8

    if-nez v2, :cond_b

    const-string v2, " conversationId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->l:Ljava/lang/String;

    if-nez v2, :cond_c

    const-string v2, " reservedServerAccessCode"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_c
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->m:Ljava/lang/String;

    if-nez v2, :cond_d

    const-string v2, " callId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_d
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    and-int/lit8 v2, v2, 0x10

    if-nez v2, :cond_e

    const-string v2, " joinRequestType"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_e
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->o:Ljava/lang/String;

    if-nez v2, :cond_f

    const-string v2, " referralPage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_f
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->p:Ljava/lang/String;

    if-nez v2, :cond_10

    const-string v2, " launchData"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_10
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->q:Ljava/lang/String;

    if-nez v2, :cond_11

    const-string v2, " gameJoinContext"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_11
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->r:Ljava/lang/String;

    if-nez v2, :cond_12

    const-string v2, " eventId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_12
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->s:Ljava/lang/String;

    if-nez v2, :cond_13

    const-string v2, " joinAttemptId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_13
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->t:Ljava/lang/String;

    if-nez v2, :cond_14

    const-string v2, " joinAttemptOrigin"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_14
    iget-object v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->u:Ljava/lang/String;

    if-nez v2, :cond_15

    const-string v2, " isoContext"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_15
    iget-byte v2, v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

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

.method public c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->f:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null accessCode"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->m:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null callId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->k:J

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    or-int/lit8 p1, p1, 0x8

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    return-object p0
.end method

.method public f(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->r:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null eventId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->h:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null gameId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->w:Ljava/lang/String;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->q:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null gameJoinContext"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k(Z)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->i:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    or-int/lit8 p1, p1, 0x4

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    return-object p0
.end method

.method public l(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->u:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null isoContext"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->s:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null joinAttemptId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->t:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null joinAttemptOrigin"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o(I)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 0

    iput p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->n:I

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    or-int/lit8 p1, p1, 0x10

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->p:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null launchData"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public q(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->g:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null linkCode"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public r(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->d:J

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    return-object p0
.end method

.method public s(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null platformParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->o:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null referralPage"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public u(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->v:J

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    or-int/lit8 p1, p1, 0x20

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    return-object p0
.end method

.method public v(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->l:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null reservedServerAccessCode"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public w(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->a:Landroid/view/Surface;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null surface"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public x(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->e:J

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->y:B

    return-object p0
.end method

.method public y(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->j:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null username"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public z(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartGameParams$a;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartGameParams$a;->x:Landroid/app/Activity;

    return-object p0
.end method
