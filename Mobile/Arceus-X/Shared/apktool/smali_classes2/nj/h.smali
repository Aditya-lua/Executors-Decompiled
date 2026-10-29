.class public abstract Lnj/h;
.super Lsg/w0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsg/w0;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lei/p;

    invoke-direct {v0}, Lei/p;-><init>()V

    invoke-static {p0, p1}, Lei/p;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lei/o;

    invoke-direct {v0}, Lei/o;-><init>()V

    invoke-static {p0, p1, p2}, Lei/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static g(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 4

    const-string v0, "EXTRA_STACKED_NOTIFICATION"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    const-string v1, "rbx.push"

    const-string v2, "EXTRA_NOTIFICATION_ID"

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "marking single notification as read with id: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lnj/h;->e(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "marking stacked notifications as read with last id: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p0, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "EXTRA_CATEGORY"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, v0, p0}, Lnj/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ljj/u;->c()Ljj/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljj/u;->d(Ljava/lang/String;)Ljj/j;

    move-result-object p1

    invoke-interface {p1}, Ljj/j;->clear()V

    return-void
.end method

.method public b(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V
    .locals 11

    new-instance v0, Ljj/x;

    invoke-direct {v0}, Ljj/x;-><init>()V

    const-string v1, "GcmPlatform"

    invoke-virtual {v0, p2, v1}, Ljj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p2}, Lgk/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, p3}, Lnj/h;->c(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "base"

    invoke-static {p3}, Ljj/w;->a(Landroid/content/Intent;)Ljava/util/List;

    move-result-object v10

    move-object v2, p1

    move v7, p4

    move-object/from16 v4, p5

    invoke-static/range {v2 .. v10}, Lsg/t0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public c(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    const-string v0, "EXTRA_NOTIFICATION_VERSION"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    const-string p1, "0"

    return-object p1
.end method

.method public d(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->f()Z

    move-result v0

    const-string v1, "rbx.push"

    if-eqz v0, :cond_0

    const-string v0, "loadTheApp: ...(logged in) launch Main."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0, p1}, Lsg/y;->i(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lnj/h;->j(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p2

    const/high16 v0, 0x10000000

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    const-string v0, "loadTheApp: ...(not logged in) launch Splash."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->LOADED_FROM_PUSH_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {p1, v0}, Lcom/roblox/client/startup/ActivitySplash;->o2(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lnj/h;->j(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p2

    const v0, 0x10008000

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :goto_0
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljj/r;->G(Landroid/os/Bundle;)V

    :cond_1
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public h(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notification of type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " clicked"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1, p2}, Lnj/h;->d(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {p0, v6}, Lnj/h;->a(Ljava/lang/String;)V

    invoke-static {p2, p1}, Lnj/h;->g(Landroid/content/Intent;Landroid/content/Context;)V

    const-string v2, "clicked"

    const/4 v5, 0x1

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Lnj/h;->b(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V

    return-void
.end method

.method public i(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cleared notifications of type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v6}, Lnj/h;->a(Ljava/lang/String;)V

    const-string v2, "dismissed"

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Lnj/h;->b(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;)V

    return-void
.end method

.method public abstract j(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;)Landroid/content/Intent;
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    invoke-super {p0, p1, p2}, Lsg/w0;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/b;->l(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/roblox/client/startup/a;->s(Landroid/content/Context;)V

    invoke-static {p1}, Lei/c;->e(Landroid/content/Context;)V

    if-eqz p2, :cond_1

    const-string v0, "EXTRA_INTENT_ACTION_TYPE_CODE"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {p0, p1, p2}, Lnj/h;->i(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    :cond_0
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1, p2}, Lnj/h;->h(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_1
    return-void
.end method
