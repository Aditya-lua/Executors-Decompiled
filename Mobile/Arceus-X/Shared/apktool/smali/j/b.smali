.class public Lj/b;
.super Le4/q;
.source "SourceFile"

# interfaces
.implements Lj/c;
.implements Lk2/v$a;


# instance fields
.field public C:Lj/e;

.field public D:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le4/q;-><init>()V

    invoke-virtual {p0}, Lj/b;->u1()V

    return-void
.end method


# virtual methods
.method public A1()Z
    .locals 2

    invoke-virtual {p0}, Lj/b;->t()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lj/b;->D1(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lk2/v;->d(Landroid/content/Context;)Lk2/v;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj/b;->v1(Lk2/v;)V

    invoke-virtual {p0, v0}, Lj/b;->y1(Lk2/v;)V

    invoke-virtual {v0}, Lk2/v;->e()V

    :try_start_0
    invoke-static {p0}, Lk2/b;->s(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lj/b;->C1(Landroid/content/Intent;)V

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final B1(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public C1(Landroid/content/Intent;)V
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lk2/i;->e(Landroid/app/Activity;Landroid/content/Intent;)V

    return-void
.end method

.method public D1(Landroid/content/Intent;)Z
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lk2/i;->f(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public M(Lo/b;)V
    .locals 0
    .param p1    # Lo/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Le/p;->X0()V

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj/e;->e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->g(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public closeOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lj/b;->t1()Lj/a;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/a;->f()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_1
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0}, Lj/b;->t1()Lj/a;

    move-result-object v1

    const/16 v2, 0x52

    if-ne v0, v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lj/a;->p(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Lk2/g;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->j(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->p()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 2

    iget-object v0, p0, Lj/b;->D:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    invoke-static {}, Lq/f1;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lq/f1;

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lq/f1;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V

    iput-object v0, p0, Lj/b;->D:Landroid/content/res/Resources;

    :cond_0
    iget-object v0, p0, Lj/b;->D:Landroid/content/res/Resources;

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->t()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1    # Landroid/content/res/Configuration;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Le/p;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->v(Landroid/content/res/Configuration;)V

    iget-object p1, p0, Lj/b;->D:Landroid/content/res/Resources;

    if-eqz p1, :cond_0

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v1, p0, Lj/b;->D:Landroid/content/res/Resources;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    :cond_0
    return-void
.end method

.method public onContentChanged()V
    .locals 0

    invoke-virtual {p0}, Lj/b;->z1()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Le4/q;->onDestroy()V

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->x()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0, p2}, Lj/b;->B1(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1
    .param p2    # Landroid/view/MenuItem;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Le4/q;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Lj/b;->t1()Lj/a;

    move-result-object p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x102002c

    if-ne p2, v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lj/a;->i()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lj/b;->A1()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 0
    .param p2    # Landroid/view/Menu;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Le/p;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->y(Landroid/os/Bundle;)V

    return-void
.end method

.method public onPostResume()V
    .locals 1

    invoke-super {p0}, Le4/q;->onPostResume()V

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->z()V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Le4/q;->onStart()V

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->B()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Le4/q;->onStop()V

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->C()V

    return-void
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object p2

    invoke-virtual {p2, p1}, Lj/e;->L(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public openOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lj/b;->t1()Lj/a;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/a;->q()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_1
    return-void
.end method

.method public s(Lo/b$a;)Lo/b;
    .locals 0
    .param p1    # Lo/b$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return-object p1
.end method

.method public s1()Lj/e;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lj/b;->C:Lj/e;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Lj/e;->h(Landroid/app/Activity;Lj/c;)Lj/e;

    move-result-object v0

    iput-object v0, p0, Lj/b;->C:Lj/e;

    :cond_0
    iget-object v0, p0, Lj/b;->C:Lj/e;

    return-object v0
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/p;->X0()V

    .line 2
    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->G(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Le/p;->X0()V

    .line 4
    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->H(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Le/p;->X0()V

    .line 6
    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj/e;->I(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTheme(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/e;->K(I)V

    return-void
.end method

.method public t()Landroid/content/Intent;
    .locals 1

    invoke-static {p0}, Lk2/i;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public t1()Lj/a;
    .locals 1

    invoke-virtual {p0}, Lj/b;->s1()Lj/e;

    move-result-object v0

    invoke-virtual {v0}, Lj/e;->r()Lj/a;

    move-result-object v0

    return-object v0
.end method

.method public final u1()V
    .locals 3

    invoke-virtual {p0}, Le/p;->A()Ld5/f;

    move-result-object v0

    new-instance v1, Lj/b$a;

    invoke-direct {v1, p0}, Lj/b$a;-><init>(Lj/b;)V

    const-string v2, "androidx:appcompat"

    invoke-virtual {v0, v2, v1}, Ld5/f;->c(Ljava/lang/String;Ld5/f$b;)V

    new-instance v0, Lj/b$b;

    invoke-direct {v0, p0}, Lj/b$b;-><init>(Lj/b;)V

    invoke-virtual {p0, v0}, Le/p;->N0(Lf/b;)V

    return-void
.end method

.method public v1(Lk2/v;)V
    .locals 0
    .param p1    # Lk2/v;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1, p0}, Lk2/v;->b(Landroid/app/Activity;)Lk2/v;

    return-void
.end method

.method public w1(Lu2/j;)V
    .locals 0
    .param p1    # Lu2/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public x(Lo/b;)V
    .locals 0
    .param p1    # Lo/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public x1(I)V
    .locals 0

    return-void
.end method

.method public y1(Lk2/v;)V
    .locals 0
    .param p1    # Lk2/v;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public z1()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
