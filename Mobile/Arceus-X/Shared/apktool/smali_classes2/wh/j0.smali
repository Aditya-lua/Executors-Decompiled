.class public Lwh/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:I

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:J

.field public r:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lwh/j0;->a:J

    iput-wide v0, p0, Lwh/j0;->b:J

    iput-wide v0, p0, Lwh/j0;->c:J

    const-string v2, ""

    iput-object v2, p0, Lwh/j0;->d:Ljava/lang/String;

    iput-object v2, p0, Lwh/j0;->e:Ljava/lang/String;

    iput-object v2, p0, Lwh/j0;->f:Ljava/lang/String;

    iput-object v2, p0, Lwh/j0;->g:Ljava/lang/String;

    iput-object v2, p0, Lwh/j0;->h:Ljava/lang/String;

    iput-object v2, p0, Lwh/j0;->i:Ljava/lang/String;

    const/4 v3, -0x1

    iput v3, p0, Lwh/j0;->j:I

    iput-object v2, p0, Lwh/j0;->k:Ljava/lang/String;

    iput-object v2, p0, Lwh/j0;->l:Ljava/lang/String;

    iput-object v2, p0, Lwh/j0;->m:Ljava/lang/String;

    iput-object v2, p0, Lwh/j0;->n:Ljava/lang/String;

    iput-object v2, p0, Lwh/j0;->o:Ljava/lang/String;

    iput-object v2, p0, Lwh/j0;->p:Ljava/lang/String;

    iput-wide v0, p0, Lwh/j0;->q:J

    iput-object v2, p0, Lwh/j0;->r:Ljava/lang/String;

    return-void
.end method

.method public static N(Landroid/os/Bundle;Lwh/j0;)Landroid/os/Bundle;
    .locals 3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    :cond_1
    const-string v0, "mPlaceId"

    invoke-virtual {p1}, Lwh/j0;->p()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "mUserId"

    invoke-virtual {p1}, Lwh/j0;->u()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "mConversationId"

    invoke-virtual {p1}, Lwh/j0;->f()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "mAccessCode"

    invoke-virtual {p1}, Lwh/j0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mLinkCode"

    invoke-virtual {p1}, Lwh/j0;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mGameId"

    invoke-virtual {p1}, Lwh/j0;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mRequestType"

    invoke-virtual {p1}, Lwh/j0;->s()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mReferralPage"

    invoke-virtual {p1}, Lwh/j0;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mLaunchData"

    invoke-virtual {p1}, Lwh/j0;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mJoinAttemptId"

    invoke-virtual {p1}, Lwh/j0;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mJoinAttemptOrigin"

    invoke-virtual {p1}, Lwh/j0;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mIsoContext"

    invoke-virtual {p1}, Lwh/j0;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->X2()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "mReferredByPlayerId"

    invoke-virtual {p1}, Lwh/j0;->r()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->E0()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "mReservedServerAccessCode"

    invoke-virtual {p1}, Lwh/j0;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mCallId"

    invoke-virtual {p1}, Lwh/j0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-string v0, "mGameJoinContext"

    invoke-virtual {p1}, Lwh/j0;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_event_id"

    invoke-virtual {p1}, Lwh/j0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->x3()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "game_id_to_exclude"

    invoke-virtual {p1}, Lwh/j0;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-object p0
.end method

.method public static O(Lwh/j0;)Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lwh/j0;->N(Landroid/os/Bundle;Lwh/j0;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lwh/j0;
    .locals 20

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    new-instance v13, Lwh/j0;

    invoke-direct {v13}, Lwh/j0;-><init>()V

    if-eqz p0, :cond_0

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    move-wide/from16 v14, v16

    :goto_0
    const-wide/16 v16, -0x1

    goto :goto_1

    :cond_0
    const-wide/16 v14, -0x1

    goto :goto_0

    :goto_1
    if-eqz p1, :cond_1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    move-wide/from16 v11, v18

    goto :goto_2

    :cond_1
    move-wide/from16 v11, v16

    :goto_2
    if-eqz p15, :cond_2

    invoke-virtual/range {p15 .. p15}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    move-wide/from16 v9, v18

    goto :goto_3

    :cond_2
    move-wide/from16 v9, v16

    :goto_3
    cmp-long v18, v11, v16

    if-eqz v18, :cond_4

    invoke-virtual {v13, v11, v12}, Lwh/j0;->M(J)V

    cmp-long v0, v14, v16

    if-eqz v0, :cond_3

    invoke-virtual {v13, v14, v15}, Lwh/j0;->H(J)V

    :cond_3
    const/4 v0, 0x1

    goto :goto_6

    :cond_4
    cmp-long v11, v14, v16

    if-eqz v11, :cond_9

    invoke-virtual {v13, v14, v15}, Lwh/j0;->H(J)V

    const/4 v11, 0x2

    if-eqz v1, :cond_5

    invoke-virtual {v13, v1}, Lwh/j0;->G(Ljava/lang/String;)V

    :goto_4
    move v0, v11

    goto :goto_5

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {v13, v0}, Lwh/j0;->v(Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    if-eqz v2, :cond_7

    invoke-virtual {v13, v2}, Lwh/j0;->z(Ljava/lang/String;)V

    const/4 v0, 0x3

    goto :goto_5

    :cond_7
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->E0()Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz v3, :cond_8

    invoke-virtual {v13, v3}, Lwh/j0;->L(Ljava/lang/String;)V

    const/16 v0, 0x8

    goto :goto_5

    :cond_8
    const/4 v0, 0x0

    :goto_5
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->E0()Z

    move-result v1

    if-eqz v1, :cond_a

    if-eqz v4, :cond_a

    invoke-virtual {v13, v4}, Lwh/j0;->w(Ljava/lang/String;)V

    goto :goto_6

    :cond_9
    const/4 v0, -0x1

    :cond_a
    :goto_6
    if-eqz p7, :cond_b

    invoke-virtual/range {p7 .. p7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v13, v0}, Lwh/j0;->K(I)V

    goto :goto_7

    :cond_b
    invoke-virtual {v13, v0}, Lwh/j0;->K(I)V

    :goto_7
    if-eqz v5, :cond_c

    invoke-virtual {v13, v5}, Lwh/j0;->I(Ljava/lang/String;)V

    :cond_c
    if-eqz v6, :cond_d

    invoke-virtual {v13, v6}, Lwh/j0;->F(Ljava/lang/String;)V

    :cond_d
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->X2()Z

    move-result v0

    if-eqz v0, :cond_e

    cmp-long v0, v9, v16

    if-eqz v0, :cond_e

    invoke-virtual {v13, v9, v10}, Lwh/j0;->J(J)V

    :cond_e
    if-eqz v7, :cond_f

    invoke-virtual {v13, v7}, Lwh/j0;->B(Ljava/lang/String;)V

    :cond_f
    if-eqz v8, :cond_10

    invoke-virtual {v13, v8}, Lwh/j0;->y(Ljava/lang/String;)V

    :cond_10
    if-eqz p12, :cond_11

    move-object/from16 v9, p12

    invoke-virtual {v13, v9}, Lwh/j0;->D(Ljava/lang/String;)V

    :cond_11
    if-eqz p13, :cond_12

    move-object/from16 v10, p13

    invoke-virtual {v13, v10}, Lwh/j0;->E(Ljava/lang/String;)V

    :cond_12
    if-eqz p14, :cond_13

    move-object/from16 v11, p14

    invoke-virtual {v13, v11}, Lwh/j0;->C(Ljava/lang/String;)V

    :cond_13
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->x3()Z

    move-result v0

    if-eqz v0, :cond_14

    if-eqz p16, :cond_14

    move-object/from16 v12, p16

    invoke-virtual {v13, v12}, Lwh/j0;->A(Ljava/lang/String;)V

    :cond_14
    return-object v13
.end method

.method public static b(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lwh/j0;
    .locals 6

    new-instance v0, Lwh/j0;

    invoke-direct {v0}, Lwh/j0;-><init>()V

    const-wide/16 v1, -0x1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    goto :goto_1

    :cond_1
    move-wide p0, v1

    :goto_1
    cmp-long v5, v3, v1

    if-eqz v5, :cond_2

    cmp-long v1, p0, v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, p0, p1}, Lwh/j0;->x(J)V

    invoke-virtual {v0, v3, v4}, Lwh/j0;->H(J)V

    const/4 p0, 0x6

    invoke-virtual {v0, p0}, Lwh/j0;->K(I)V

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {v0, p2}, Lwh/j0;->I(Ljava/lang/String;)V

    :cond_3
    if-eqz p3, :cond_4

    invoke-virtual {v0, p3}, Lwh/j0;->D(Ljava/lang/String;)V

    :cond_4
    if-eqz p4, :cond_5

    invoke-virtual {v0, p4}, Lwh/j0;->E(Ljava/lang/String;)V

    :cond_5
    return-object v0
.end method

.method public static c(Landroid/os/Bundle;)Lwh/j0;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lwh/j0;

    invoke-direct {v0}, Lwh/j0;-><init>()V

    const-string v1, "mPlaceId"

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lwh/j0;->H(J)V

    const-string v1, "mUserId"

    invoke-virtual {p0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lwh/j0;->M(J)V

    const-string v1, "mConversationId"

    invoke-virtual {p0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lwh/j0;->x(J)V

    const-string v1, "mAccessCode"

    const-string v4, ""

    invoke-virtual {p0, v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->v(Ljava/lang/String;)V

    const-string v1, "mLinkCode"

    invoke-virtual {p0, v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->G(Ljava/lang/String;)V

    const-string v1, "mGameId"

    invoke-virtual {p0, v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->z(Ljava/lang/String;)V

    const-string v1, "mRequestType"

    const/4 v5, -0x1

    invoke-virtual {p0, v1, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lwh/j0;->K(I)V

    const-string v1, "mReferralPage"

    invoke-virtual {p0, v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->I(Ljava/lang/String;)V

    const-string v1, "mLaunchData"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->F(Ljava/lang/String;)V

    const-string v1, "mJoinAttemptId"

    invoke-virtual {p0, v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->D(Ljava/lang/String;)V

    const-string v1, "mJoinAttemptOrigin"

    invoke-virtual {p0, v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->E(Ljava/lang/String;)V

    const-string v1, "mIsoContext"

    invoke-virtual {p0, v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->C(Ljava/lang/String;)V

    const-string v1, "mGameJoinContext"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->B(Ljava/lang/String;)V

    const-string v1, "roblox_event_id"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->y(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->X2()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "mReferredByPlayerId"

    invoke-virtual {p0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lwh/j0;->J(J)V

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->E0()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "mReservedServerAccessCode"

    invoke-virtual {p0, v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->L(Ljava/lang/String;)V

    const-string v1, "mCallId"

    invoke-virtual {p0, v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwh/j0;->w(Ljava/lang/String;)V

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->x3()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "game_id_to_exclude"

    invoke-virtual {p0, v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lwh/j0;->A(Ljava/lang/String;)V

    :cond_3
    return-object v0
.end method


# virtual methods
.method public A(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->r:Ljava/lang/String;

    return-void
.end method

.method public B(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->l:Ljava/lang/String;

    return-void
.end method

.method public C(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lwh/j0;->p:Ljava/lang/String;

    return-void
.end method

.method public D(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->n:Ljava/lang/String;

    return-void
.end method

.method public E(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->o:Ljava/lang/String;

    return-void
.end method

.method public F(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->k:Ljava/lang/String;

    return-void
.end method

.method public G(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->e:Ljava/lang/String;

    return-void
.end method

.method public H(J)V
    .locals 0

    iput-wide p1, p0, Lwh/j0;->a:J

    return-void
.end method

.method public I(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->i:Ljava/lang/String;

    return-void
.end method

.method public J(J)V
    .locals 0

    iput-wide p1, p0, Lwh/j0;->q:J

    return-void
.end method

.method public K(I)V
    .locals 0

    iput p1, p0, Lwh/j0;->j:I

    return-void
.end method

.method public L(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->g:Ljava/lang/String;

    return-void
.end method

.method public M(J)V
    .locals 0

    iput-wide p1, p0, Lwh/j0;->b:J

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->h:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lwh/j0;->c:J

    return-wide v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->m:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->f:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->r:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->l:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->p:Ljava/lang/String;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->n:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->o:Ljava/lang/String;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->k:Ljava/lang/String;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->e:Ljava/lang/String;

    return-object v0
.end method

.method public p()J
    .locals 2

    iget-wide v0, p0, Lwh/j0;->a:J

    return-wide v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public r()J
    .locals 2

    iget-wide v0, p0, Lwh/j0;->q:J

    return-wide v0
.end method

.method public s()I
    .locals 1

    iget v0, p0, Lwh/j0;->j:I

    return v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwh/j0;->g:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{ placeId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lwh/j0;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", userId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lwh/j0;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", conversationId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lwh/j0;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", accessCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", linkCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gameId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reservedServerAccessCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", callId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reqType:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lwh/j0;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", referralPage:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", launchData:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gameJoinContext:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", eventId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinAttemptId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinAttemptOrigin:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mIsoContext:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", referredByPlayerId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lwh/j0;->q:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", gameIdToExclude:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwh/j0;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()J
    .locals 2

    iget-wide v0, p0, Lwh/j0;->b:J

    return-wide v0
.end method

.method public v(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->d:Ljava/lang/String;

    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->h:Ljava/lang/String;

    return-void
.end method

.method public x(J)V
    .locals 0

    iput-wide p1, p0, Lwh/j0;->c:J

    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->m:Ljava/lang/String;

    return-void
.end method

.method public z(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwh/j0;->f:Ljava/lang/String;

    return-void
.end method
