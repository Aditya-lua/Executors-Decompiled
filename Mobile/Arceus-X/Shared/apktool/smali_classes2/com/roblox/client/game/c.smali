.class public Lcom/roblox/client/game/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/game/c$b;
    }
.end annotation


# instance fields
.field public a:Lcom/roblox/client/game/c$b;

.field public b:Lcom/roblox/client/game/ExperienceSession;

.field public c:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/roblox/client/game/c$b;->a:Lcom/roblox/client/game/c$b;

    iput-object v0, p0, Lcom/roblox/client/game/c;->a:Lcom/roblox/client/game/c$b;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/roblox/client/game/c;->c:J

    return-void
.end method

.method public static synthetic a(Lcom/roblox/client/game/c;Landroid/app/Activity;Lwh/j0;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/game/c;->j(Landroid/app/Activity;Lwh/j0;)V

    return-void
.end method

.method public static bridge synthetic b(Lcom/roblox/client/game/c;)Lcom/roblox/client/game/ExperienceSession;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/c;->b:Lcom/roblox/client/game/ExperienceSession;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/roblox/client/game/c;Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/c;->b:Lcom/roblox/client/game/ExperienceSession;

    return-void
.end method

.method public static bridge synthetic d(Lcom/roblox/client/game/c;Landroid/content/Context;Lwh/j0;)Lcom/roblox/client/game/ExperienceSession;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/game/c;->e(Landroid/content/Context;Lwh/j0;)Lcom/roblox/client/game/ExperienceSession;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e(Landroid/content/Context;Lwh/j0;)Lcom/roblox/client/game/ExperienceSession;
    .locals 3

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "roblox_placeId"

    invoke-virtual {p2}, Lwh/j0;->p()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "roblox_userId"

    invoke-virtual {p2}, Lwh/j0;->u()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "roblox_conversationId"

    invoke-virtual {p2}, Lwh/j0;->f()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "roblox_accessCode"

    invoke-virtual {p2}, Lwh/j0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_linkCode"

    invoke-virtual {p2}, Lwh/j0;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_gameId"

    invoke-virtual {p2}, Lwh/j0;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_reservedServerAccessCode"

    invoke-virtual {p2}, Lwh/j0;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_callId"

    invoke-virtual {p2}, Lwh/j0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_joinRequestType"

    invoke-virtual {p2}, Lwh/j0;->s()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "roblox_referralPage"

    invoke-virtual {p2}, Lwh/j0;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_launchData"

    invoke-virtual {p2}, Lwh/j0;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_joinAttemptId"

    invoke-virtual {p2}, Lwh/j0;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_joinAttemptOrigin"

    invoke-virtual {p2}, Lwh/j0;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_isoContext"

    invoke-virtual {p2}, Lwh/j0;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->X2()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "roblox_referredByPlayerId"

    invoke-virtual {p2}, Lwh/j0;->r()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    const-string v0, "roblox_gameJoinContext"

    invoke-virtual {p2}, Lwh/j0;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "roblox_event_id"

    invoke-virtual {p2}, Lwh/j0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->x3()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "game_id_to_exclude"

    invoke-virtual {p2}, Lwh/j0;->i()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance p2, Lcom/roblox/client/game/ExperienceSession;

    invoke-direct {p2, p1}, Lcom/roblox/client/game/ExperienceSession;-><init>(Landroid/os/Bundle;)V

    return-object p2
.end method

.method public f()Z
    .locals 2

    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/d;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GameManager"

    const-string v1, "canStartGame = false: Upgrade required"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public g(Z)V
    .locals 1

    const-string p1, "endGameSession"

    const-string v0, "GameManager"

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/game/c;->b:Lcom/roblox/client/game/ExperienceSession;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roblox/client/game/ExperienceSession;->D(Z)V

    return-void

    :cond_0
    const-string p1, "Error: Try to end but no game session exists."

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public h()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/game/c;->a:Lcom/roblox/client/game/c$b;

    sget-object v1, Lcom/roblox/client/game/c$b;->c:Lcom/roblox/client/game/c$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/game/c;->a:Lcom/roblox/client/game/c$b;

    sget-object v1, Lcom/roblox/client/game/c$b;->b:Lcom/roblox/client/game/c$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic j(Landroid/app/Activity;Lwh/j0;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/game/c;->k(Landroid/app/Activity;Lwh/j0;)V

    return-void
.end method

.method public final k(Landroid/app/Activity;Lwh/j0;)V
    .locals 4

    const-string v0, "GameManager"

    if-eqz p2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "launchGameWithParams: Start game activity for placeId = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lwh/j0;->p()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "ROBLOXCrash"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    new-instance v0, Lcom/roblox/client/game/c$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/roblox/client/game/c$a;-><init>(Lcom/roblox/client/game/c;Landroid/app/Activity;Lwh/j0;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/roblox/client/game/c;->c:J

    invoke-virtual {p0}, Lcom/roblox/client/game/c;->m()V

    return-void

    :cond_0
    const-string p1, "launchGameWithParams: game-params is null. Just close this activity!"

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public l(Landroid/content/Context;)V
    .locals 1

    const-string p1, "GameManager"

    const-string v0, "onGameEnded:"

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/game/c$b;->c:Lcom/roblox/client/game/c$b;

    iput-object p1, p0, Lcom/roblox/client/game/c;->a:Lcom/roblox/client/game/c$b;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/game/c;->b:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {p0}, Lcom/roblox/client/game/c;->o()V

    return-void
.end method

.method public m()V
    .locals 2

    const-string v0, "GameManager"

    const-string v1, "onGameStarted:"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roblox/client/game/c;->c:J

    sget-object v0, Lcom/roblox/client/game/c$b;->b:Lcom/roblox/client/game/c$b;

    iput-object v0, p0, Lcom/roblox/client/game/c;->a:Lcom/roblox/client/game/c$b;

    return-void
.end method

.method public n()V
    .locals 2

    const-string v0, "pauseGameSession"

    const-string v1, "GameManager"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/c;->b:Lcom/roblox/client/game/ExperienceSession;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->Z()V

    return-void

    :cond_0
    const-string v0, "Error: Try to pause but no game session exists."

    invoke-static {v1, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public o()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/roblox/client/game/c;->c:J

    sub-long/2addr v0, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Game duration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "ms."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "GameManager"

    invoke-static {v3, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lxg/a;->e()Lxg/a;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lxg/a;->m(J)V

    return-void
.end method

.method public p()V
    .locals 2

    const-string v0, "resumeGameSession"

    const-string v1, "GameManager"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/c;->b:Lcom/roblox/client/game/ExperienceSession;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->d0()V

    return-void

    :cond_0
    const-string v0, "Error: Try to resume but no game session exists."

    invoke-static {v1, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public q(Landroid/app/Activity;Lwh/j0;I)V
    .locals 3

    invoke-virtual {p0}, Lcom/roblox/client/game/c;->f()Z

    move-result v0

    const-string v1, "GameManager"

    if-nez v0, :cond_0

    const-string p1, "Game launch halted - Can\'t start game."

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startGameForResult: requestCode = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-object p3, p1

    check-cast p3, Lcom/roblox/client/ActivityNativeMain;

    sget-object v0, Lwh/t0;->a:Lwh/t0;

    invoke-virtual {p3, v0}, Lcom/roblox/client/ActivityNativeMain;->r3(Lwh/t0;)V

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-virtual {p3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-ne p3, v0, :cond_1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p3

    new-instance v0, Lwh/k0;

    invoke-direct {v0, p0, p1, p2}, Lwh/k0;-><init>(Lcom/roblox/client/game/c;Landroid/app/Activity;Lwh/j0;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/game/c;->k(Landroid/app/Activity;Lwh/j0;)V

    return-void
.end method
