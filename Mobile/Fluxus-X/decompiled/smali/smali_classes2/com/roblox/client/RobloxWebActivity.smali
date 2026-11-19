.class public Lcom/roblox/client/RobloxWebActivity;
.super Lcom/roblox/client/a;
.source "SourceFile"

# interfaces
.implements Ldj/e$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/RobloxWebActivity$b;
    }
.end annotation


# instance fields
.field public S:I

.field public T:I

.field public U:Landroidx/appcompat/widget/Toolbar;

.field public V:Lcom/roblox/client/RobloxWebActivity$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/roblox/client/a;-><init>()V

    new-instance v0, Lcom/roblox/client/RobloxWebActivity$b;

    invoke-direct {v0}, Lcom/roblox/client/RobloxWebActivity$b;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/RobloxWebActivity;->V:Lcom/roblox/client/RobloxWebActivity$b;

    return-void
.end method


# virtual methods
.method public R(ILandroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/16 v0, 0x65

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "FEATURE_EXTRA"

    const-string v1, "LAUNCH_GAME"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "game_init_params"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 p2, -0x1

    invoke-virtual {p0, p2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    const-string p1, "RobloxActivity"

    const-string v0, "(RobloxWebActivity) handleNotification() Logout event..."

    invoke-static {p1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget p1, Lbh/q0;->h:I

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-static {}, Lek/c;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Ldj/b;->p()V

    :cond_2
    invoke-static {p2}, Ldj/b;->g(Landroid/os/Bundle;)Ldj/b$d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/a;->X1(Ldj/b$d;)V

    return-void
.end method

.method public g0(Lcm/a;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->g0(Lcm/a;)V

    invoke-super {p0, p1}, Lcom/roblox/client/a;->g0(Lcm/a;)V

    return-void
.end method

.method public final i2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "FEATURE_EXTRA"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "PATH_EXTRA"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, -0x1

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final j2(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    const-class v1, Lcom/roblox/client/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf4/k0;->n0(Ljava/lang/String;)Lf4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/c;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/c;

    invoke-virtual {v0, p1}, Lcom/roblox/client/c;->q3(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public k2(JJ)V
    .locals 5

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "FEATURE_EXTRA"

    const-string v2, "CHAT_TAG"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-wide/16 v1, -0x1

    cmp-long v3, p1, v1

    if-eqz v3, :cond_0

    const-string v4, "CONVERSATION_ID_EXTRA"

    invoke-virtual {v0, v4, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    :cond_0
    cmp-long p1, p3, v1

    if-eqz p1, :cond_1

    const-string p2, "USER_ID_EXTRA"

    invoke-virtual {v0, p2, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    :cond_1
    if-nez p1, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    const/4 p1, -0x1

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final l2()V
    .locals 2

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    const-class v1, Lcom/roblox/client/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf4/k0;->n0(Ljava/lang/String;)Lf4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/c;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/c;

    invoke-virtual {v0}, Lcom/roblox/client/c;->e()V

    :cond_0
    return-void
.end method

.method public m2()Leh/v0$b;
    .locals 1

    sget-object v0, Leh/v0$b;->c:Leh/v0$b;

    return-object v0
.end method

.method public onBackPressed()V
    .locals 2

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    const-class v1, Lcom/roblox/client/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf4/k0;->n0(Ljava/lang/String;)Lf4/q;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/roblox/client/c;->e3()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-super {p0}, Le/p;->onBackPressed()V

    iget v0, p0, Lcom/roblox/client/RobloxWebActivity;->S:I

    iget v1, p0, Lcom/roblox/client/RobloxWebActivity;->T:I

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public onCloseOverlayEvent(Lyh/d;)V
    .locals 0
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Lcom/roblox/client/a;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lbh/n0;->f:I

    invoke-virtual {p0, p1}, Lcom/roblox/client/a;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "URL_EXTRA"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "TITLE_EXTRA"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA"

    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    const-string v4, "USE_GENERIC_WEB_FRAG_EXTRA"

    invoke-virtual {p1, v4, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move v3, v0

    move v4, v3

    move-object v2, v1

    :goto_0
    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/roblox/client/RobloxWebActivity;->m2()Leh/v0$b;

    move-result-object v5

    invoke-static {v5, v1}, Leh/v0;->w(Leh/v0$b;Ljava/lang/String;)V

    sget v5, Lbh/m0;->n0:I

    invoke-virtual {p0, v5}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroidx/appcompat/widget/Toolbar;

    iput-object v5, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    if-eqz v4, :cond_2

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v4

    invoke-virtual {v4}, Lbh/y;->b()Ldi/d;

    move-result-object v4

    const-string v6, "TITLE_STRING"

    invoke-virtual {v5, v6, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "HAS_PARENT"

    const/4 v6, 0x1

    invoke-virtual {v5, v2, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "HIDE_ACCESSORY_BUTTONS_EXTRA"

    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    const-string v6, "HIDE_ACCESSORY_BUTTONS"

    invoke-virtual {v5, v6, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "SEARCH_PARAMS"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v2, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    iput v0, p0, Lcom/roblox/client/RobloxWebActivity;->S:I

    iput v0, p0, Lcom/roblox/client/RobloxWebActivity;->T:I

    goto :goto_3

    :cond_2
    new-instance v4, Lcom/roblox/client/c;

    invoke-direct {v4}, Lcom/roblox/client/c;-><init>()V

    iget-object v6, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    sget v2, Lbh/q0;->x:I

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v6, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    instance-of v6, v2, Lcom/roblox/client/components/RobloxToolbar;

    if-eqz v6, :cond_4

    check-cast v2, Lcom/roblox/client/components/RobloxToolbar;

    new-instance v6, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {v6}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    invoke-virtual {v2, v6}, Lcom/roblox/client/components/RobloxToolbar;->setIconDelegate(Lcom/roblox/client/components/RobloxToolbar$d;)V

    goto :goto_2

    :cond_4
    sget v6, Lbh/l0;->h:I

    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    :goto_2
    iget-object v2, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    new-instance v6, Lcom/roblox/client/RobloxWebActivity$a;

    invoke-direct {v6, p0}, Lcom/roblox/client/RobloxWebActivity$a;-><init>(Lcom/roblox/client/RobloxWebActivity;)V

    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeUserGameSettingsGetReducedMotion()Z

    move-result v2

    if-eqz v2, :cond_5

    iput v0, p0, Lcom/roblox/client/RobloxWebActivity;->S:I

    iput v0, p0, Lcom/roblox/client/RobloxWebActivity;->T:I

    goto :goto_3

    :cond_5
    const/high16 v2, 0x10a0000

    iput v2, p0, Lcom/roblox/client/RobloxWebActivity;->S:I

    sget v2, Lbh/g0;->a:I

    iput v2, p0, Lcom/roblox/client/RobloxWebActivity;->T:I

    :goto_3
    if-eqz v3, :cond_6

    invoke-virtual {v4}, Lf4/q;->a()Landroidx/lifecycle/l;

    move-result-object v2

    iget-object v3, p0, Lcom/roblox/client/RobloxWebActivity;->V:Lcom/roblox/client/RobloxWebActivity$b;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_6
    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v2

    invoke-virtual {v2}, Lf4/k0;->r()Lf4/t0;

    move-result-object v2

    const-string v3, "DEFAULT_URL"

    invoke-virtual {v5, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "USING_LOGIN_WEB_URL"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {v5, v1, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {v4, v5}, Lf4/q;->O1(Landroid/os/Bundle;)V

    sget p1, Lbh/m0;->t0:I

    const-class v0, Lcom/roblox/client/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v4, v0}, Lf4/t0;->b(ILf4/q;Ljava/lang/String;)Lf4/t0;

    invoke-virtual {v2}, Lf4/t0;->g()I

    return-void
.end method

.method public onNavigateToConversationEvent(Lyh/f;)V
    .locals 4
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RWF.onNavigateToConversationEvent() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, Lyh/f;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, Lyh/f;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RobloxActivity"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-wide v0, p1, Lyh/f;->a:J

    iget-wide v2, p1, Lyh/f;->b:J

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/roblox/client/RobloxWebActivity;->k2(JJ)V

    return-void
.end method

.method public onNavigateToFeatureEvent(Lyh/g;)V
    .locals 2
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "ABUSE_REPORT_TAG"

    iget-object v1, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lyh/g;->b:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lbh/q;->d(Landroid/app/Activity;Ljava/lang/String;Z)V

    return-void

    :cond_0
    const-string v0, "FRIEND_FINDER_TAG"

    iget-object v1, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "UNIVERSAL_FRIENDS_TAG"

    iget-object v1, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p1, Lyh/g;->a:Ljava/lang/String;

    iget-object p1, p1, Lyh/g;->b:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/RobloxWebActivity;->i2(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_0
    invoke-static {}, Lbh/a1;->R()Ljava/lang/String;

    move-result-object p1

    sget v0, Lbh/q0;->C:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{\"searchType\":\"Players\"}"

    invoke-static {p0, p1, v0, v1}, Lbh/q;->g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onNavigateToLuaEvent(Lcom/roblox/client/c$h;)V
    .locals 0
    .annotation runtime Lmw/j;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onPushNotificationRegistrationFailedEvent(Lyh/h;)V
    .locals 1
    .annotation runtime Lmw/j;
    .end annotation

    invoke-virtual {p1}, Lyh/h;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PushNotificationRegistrationFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lbh/q0;->f1:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-virtual {p0}, Lcom/roblox/client/RobloxWebActivity;->l2()V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Lcom/roblox/client/a;->onStart()V

    invoke-static {}, Ldj/e;->c()Ldj/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Ldj/e;->b(Ldj/e$e;)V

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmw/c;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-static {}, Ldj/e;->c()Ldj/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Ldj/e;->g(Ldj/e$e;)V

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmw/c;->p(Ljava/lang/Object;)V

    invoke-super {p0}, Lcom/roblox/client/a;->onStop()V

    return-void
.end method

.method public onWebSearchEvent(Lyh/k;)V
    .locals 2
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RWA.onWebSearchEvent() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lyh/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RobloxActivity"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p1, Lyh/k;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lyh/k;->b:Ljava/lang/String;

    invoke-static {p1}, Lbh/a1;->I0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lyh/k;->b:Ljava/lang/String;

    invoke-static {p1}, Lbh/a1;->G0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lyh/k;->b:Ljava/lang/String;

    invoke-static {p1}, Lbh/a1;->H0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    iget-object p1, p1, Lyh/k;->b:Ljava/lang/String;

    invoke-static {p1}, Lbh/a1;->J0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_4

    invoke-static {p0}, Lbh/e2;->h(Landroid/app/Activity;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/RobloxWebActivity;->j2(Ljava/lang/String;)V

    :cond_4
    return-void
.end method
