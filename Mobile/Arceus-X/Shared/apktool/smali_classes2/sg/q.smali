.class public Lsg/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/RobloxWebActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "URL_EXTRA"

    invoke-static {p1}, Lgk/f;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "TITLE_EXTRA"

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "USE_GENERIC_WEB_FRAG_EXTRA"

    invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p0, "SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA"

    invoke-virtual {v0, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p0, "HIDE_ACCESSORY_BUTTONS_EXTRA"

    invoke-virtual {v0, p0, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method

.method public static b(Lorg/json/JSONObject;Landroid/app/Activity;)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v0, :cond_c

    const-string v2, "placeId"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v4, "userId"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v4

    const-string v6, "conversationId"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v6

    const-string v8, "gameInstanceId"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "reservedServerAccessCode"

    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "callId"

    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "referralPage"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "accessCode"

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "linkCode"

    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "launchData"

    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v14

    invoke-interface {v14}, Lth/i;->X2()Z

    move-result v14

    if-eqz v14, :cond_0

    const-string v14, "referredByPlayerId"

    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v17

    goto :goto_0

    :cond_0
    const-wide/16 v17, 0x0

    :goto_0
    const-string v14, "eventId"

    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    const-string v14, "gameJoinContext"

    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    const-string v14, "joinAttemptId"

    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-wide/16 v19, 0x0

    const-string v15, "joinAttemptOrigin"

    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-wide/from16 v24, v2

    const-string v2, "isoContext"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->x3()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "gameIdToExclude"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object/from16 v28, v0

    goto :goto_2

    :cond_1
    const-string v0, ""

    goto :goto_1

    :goto_2
    cmp-long v0, v24, v19

    if-lez v0, :cond_2

    cmp-long v2, v6, v19

    if-lez v2, :cond_2

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v2, v11, v14, v15}, Lwh/j0;->b(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lwh/j0;

    move-result-object v0

    goto/16 :goto_7

    :cond_2
    const/4 v2, 0x0

    if-gtz v0, :cond_4

    cmp-long v3, v4, v19

    if-lez v3, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, v2

    goto :goto_7

    :cond_4
    :goto_3
    if-nez v0, :cond_5

    move-object v0, v2

    goto :goto_4

    :cond_5
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_4
    cmp-long v3, v4, v19

    if-nez v3, :cond_6

    move-object v3, v2

    goto :goto_5

    :cond_6
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_5
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    move-object v12, v2

    :cond_7
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object v13, v2

    :cond_8
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object/from16 v16, v2

    goto :goto_6

    :cond_9
    move-object/from16 v16, v8

    :goto_6
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_a

    move-object v9, v2

    :cond_a
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object v10, v2

    :cond_b
    const/16 v19, 0x0

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v27

    move-object/from16 v17, v9

    move-object/from16 v18, v10

    move-object/from16 v20, v11

    move-object/from16 v24, v14

    move-object/from16 v25, v15

    move-object v14, v12

    move-object v15, v13

    move-object v12, v0

    move-object v13, v3

    invoke-static/range {v12 .. v28}, Lwh/j0;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lwh/j0;

    move-result-object v0

    :goto_7
    if-eqz v0, :cond_c

    invoke-static {v0, v1}, Lsg/q;->j(Lwh/j0;Landroid/app/Activity;)V

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    invoke-virtual {v0, v1}, Lvi/g;->j(Landroid/content/Context;)V

    :cond_c
    return-void
.end method

.method public static c(Lwh/j0;Landroid/app/Activity;)V
    .locals 6

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lwh/j0;->p()J

    move-result-wide v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Launching PlaceId:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " Pid:"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " Debugger:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_0

    const-string v0, "attached"

    goto :goto_0

    :cond_0
    const-string v0, "none"

    :goto_0
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ActivityUtils"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    const/16 v1, 0x4e88

    invoke-virtual {v0, p1, p0, v1}, Lcom/roblox/client/game/c;->q(Landroid/app/Activity;Lwh/j0;I)V

    return-void
.end method

.method public static d(Landroid/app/Activity;Ljava/lang/String;Z)V
    .locals 7

    sget v0, Lsg/q0;->w:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move v5, p2

    invoke-static/range {v1 .. v6}, Lsg/q;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    sget p0, Lsg/g0;->b:I

    const p1, 0x10a0001

    invoke-virtual {v1, p0, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public static e(Landroid/app/Activity;Ljava/lang/String;IZZ)V
    .locals 0

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2, p3, p4}, Lsg/q;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lsg/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public static g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lsg/q;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;

    move-result-object p0

    if-eqz p3, :cond_0

    const-string p1, "SEARCH_PARAMS"

    invoke-virtual {p0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    const/4 p1, 0x1

    invoke-static {v0, p0, p1}, Lsg/q;->k(Landroid/app/Activity;Landroid/content/Intent;Z)V

    return-void
.end method

.method public static h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    invoke-static/range {v0 .. v5}, Lsg/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public static i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lsg/q;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lsg/q;->k(Landroid/app/Activity;Landroid/content/Intent;Z)V

    return-void
.end method

.method public static j(Lwh/j0;Landroid/app/Activity;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Lsg/a1;->v:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startLaunchGame: activity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GameLaunch"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Lsg/q;->c(Lwh/j0;Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public static k(Landroid/app/Activity;Landroid/content/Intent;Z)V
    .locals 1

    const/16 v0, 0x4e8e

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    if-nez p2, :cond_1

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeUserGameSettingsGetReducedMotion()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget p1, Lsg/g0;->b:I

    const p2, 0x10a0001

    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method
