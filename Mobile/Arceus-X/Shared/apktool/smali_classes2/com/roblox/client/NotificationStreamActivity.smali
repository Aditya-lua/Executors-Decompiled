.class public Lcom/roblox/client/NotificationStreamActivity;
.super Lcom/roblox/client/RobloxWebActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/RobloxWebActivity;-><init>()V

    return-void
.end method

.method private o2(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    sget v0, Lsg/o0;->d:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    sget p2, Lsg/m0;->d:I

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    new-instance p2, Ldk/f;

    invoke-direct {p2}, Ldk/f;-><init>()V

    invoke-virtual {p2}, Ldk/f;->getTheme()Lol/a;

    move-result-object p2

    sget-object v0, Lcom/roblox/client/NotificationStreamActivity$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    sget p2, Lsg/l0;->u:I

    goto :goto_0

    :cond_0
    sget p2, Lsg/l0;->t:I

    goto :goto_0

    :cond_1
    sget p2, Lsg/l0;->v:I

    :goto_0
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    new-instance p2, Lcom/roblox/client/NotificationStreamActivity$a;

    invoke-direct {p2, p0}, Lcom/roblox/client/NotificationStreamActivity$a;-><init>(Lcom/roblox/client/NotificationStreamActivity;)V

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    return-void
.end method


# virtual methods
.method public m2()Lvg/c0$b;
    .locals 1

    sget-object v0, Lvg/c0$b;->f:Lvg/c0$b;

    return-object v0
.end method

.method public n2(Ljava/lang/String;Ljava/lang/String;)V
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "URL_EXTRA"

    invoke-static {}, Lsg/a1;->y0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget v1, Lsg/q0;->H:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "TITLE_EXTRA"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    invoke-super {p0, p1}, Lcom/roblox/client/RobloxWebActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p1

    invoke-virtual {p0}, Lj/b;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/NotificationStreamActivity;->o2(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void
.end method

.method public onNavigateToFeatureEvent(Lph/g;)V
    .locals 1
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    iget-object v0, p1, Lph/g;->a:Ljava/lang/String;

    iget-object p1, p1, Lph/g;->b:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/NotificationStreamActivity;->n2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public u(Lol/a;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    invoke-virtual {p0}, Lj/b;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/roblox/client/NotificationStreamActivity;->o2(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    invoke-super {p0, p1}, Lcom/roblox/client/RobloxWebActivity;->u(Lol/a;)V

    return-void
.end method
