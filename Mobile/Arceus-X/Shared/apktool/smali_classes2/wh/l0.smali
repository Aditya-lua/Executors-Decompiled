.class public Lwh/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:J

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:J

.field public r:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lwh/l0;->a:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lwh/l0;->b:J

    iput-wide v0, p0, Lwh/l0;->c:J

    const-string v2, ""

    iput-object v2, p0, Lwh/l0;->d:Ljava/lang/String;

    iput-object v2, p0, Lwh/l0;->e:Ljava/lang/String;

    iput-object v2, p0, Lwh/l0;->f:Ljava/lang/String;

    iput-wide v0, p0, Lwh/l0;->g:J

    iput-object v2, p0, Lwh/l0;->h:Ljava/lang/String;

    iput-object v2, p0, Lwh/l0;->i:Ljava/lang/String;

    iput-object v2, p0, Lwh/l0;->j:Ljava/lang/String;

    iput-object v2, p0, Lwh/l0;->k:Ljava/lang/String;

    iput-object v2, p0, Lwh/l0;->l:Ljava/lang/String;

    iput-object v2, p0, Lwh/l0;->m:Ljava/lang/String;

    iput-object v2, p0, Lwh/l0;->n:Ljava/lang/String;

    iput-object v2, p0, Lwh/l0;->o:Ljava/lang/String;

    iput-object v2, p0, Lwh/l0;->p:Ljava/lang/String;

    iput-wide v0, p0, Lwh/l0;->q:J

    iput-object v2, p0, Lwh/l0;->r:Ljava/lang/String;

    const-string v2, "roblox_placeId"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lwh/l0;->c:J

    const-string v2, "roblox_accessCode"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lwh/l0;->d:Ljava/lang/String;

    const-string v2, "roblox_linkCode"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lwh/l0;->e:Ljava/lang/String;

    const-string v2, "roblox_gameId"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lwh/l0;->f:Ljava/lang/String;

    const-string v2, "roblox_userId"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lwh/l0;->b:J

    const-string v2, "roblox_conversationId"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lwh/l0;->g:J

    const-string v2, "roblox_reservedServerAccessCode"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lwh/l0;->h:Ljava/lang/String;

    const-string v2, "roblox_callId"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lwh/l0;->i:Ljava/lang/String;

    const-string v2, "roblox_joinRequestType"

    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lwh/l0;->a:I

    const-string v2, "roblox_referralPage"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lwh/l0;->j:Ljava/lang/String;

    const-string v2, "roblox_launchData"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lwh/l0;->k:Ljava/lang/String;

    const-string v2, "roblox_joinAttemptId"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lwh/l0;->n:Ljava/lang/String;

    const-string v2, "roblox_joinAttemptOrigin"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lwh/l0;->o:Ljava/lang/String;

    const-string v2, "roblox_isoContext"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lwh/l0;->p:Ljava/lang/String;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->X2()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "roblox_referredByPlayerId"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lwh/l0;->q:J

    :cond_0
    const-string v0, "roblox_gameJoinContext"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lwh/l0;->l:Ljava/lang/String;

    const-string v0, "roblox_event_id"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lwh/l0;->m:Ljava/lang/String;

    const-string v0, "game_id_to_exclude"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lwh/l0;->r:Ljava/lang/String;

    return-void
.end method
