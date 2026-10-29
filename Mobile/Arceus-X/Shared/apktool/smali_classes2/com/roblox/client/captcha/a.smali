.class public Lcom/roblox/client/captcha/a;
.super Lsg/y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/captcha/a$a;
    }
.end annotation


# instance fields
.field public h1:Lcom/roblox/client/captcha/a$a;

.field public i1:Z

.field public j1:Z

.field public k1:Lcom/roblox/client/captcha/CaptchaConfig;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsg/y0;-><init>()V

    return-void
.end method

.method public static K3(Lcom/roblox/client/captcha/CaptchaConfig;)Lcom/roblox/client/captcha/a;
    .locals 3

    new-instance v0, Lcom/roblox/client/captcha/a;

    invoke-direct {v0}, Lcom/roblox/client/captcha/a;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "captchaConfig"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public C0(Landroid/content/Context;)V
    .locals 2

    invoke-super {p0, p1}, Lsg/y0;->C0(Landroid/content/Context;)V

    const-string v0, "FragmentFunCaptcha"

    const-string v1, "onAttach."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    instance-of v0, v0, Lcom/roblox/client/captcha/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/captcha/a$a;

    iput-object p1, p0, Lcom/roblox/client/captcha/a;->h1:Lcom/roblox/client/captcha/a$a;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must implement OnFragmentInteractionListener"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public F0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lsg/y0;->F0(Landroid/os/Bundle;)V

    const-string p1, "FragmentFunCaptcha"

    const-string v0, "onCreate."

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "captchaConfig"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/captcha/CaptchaConfig;

    iput-object p1, p0, Lcom/roblox/client/captcha/a;->k1:Lcom/roblox/client/captcha/CaptchaConfig;

    :cond_0
    return-void
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lsg/y0;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final L3()V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->j0()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/captcha/a;->h1:Lcom/roblox/client/captcha/a$a;

    invoke-interface {v0}, Lcom/roblox/client/captcha/a$a;->Y()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lsg/y0;->D3(Z)V

    return-void
.end method

.method public N0()V
    .locals 2

    invoke-super {p0}, Lsg/y0;->N0()V

    const-string v0, "FragmentFunCaptcha"

    const-string v1, "onDetach."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/captcha/a;->j1:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/captcha/a;->h1:Lcom/roblox/client/captcha/a$a;

    invoke-interface {v0}, Lcom/roblox/client/captcha/a$a;->dismiss()V

    const-string v0, "captcha"

    const-string v1, "close"

    invoke-static {v0, v1}, Lsg/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/captcha/a;->h1:Lcom/roblox/client/captcha/a$a;

    return-void
.end method

.method public V0()V
    .locals 2

    invoke-super {p0}, Lsg/y0;->V0()V

    const-string v0, "FragmentFunCaptcha"

    const-string v1, "onPause."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfv/c;->p(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lsg/y0;->D3(Z)V

    return-void
.end method

.method public a1()V
    .locals 2

    invoke-super {p0}, Lsg/y0;->a1()V

    const-string v0, "FragmentFunCaptcha"

    const-string v1, "onResume."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfv/c;->n(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/roblox/client/captcha/a;->i1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/captcha/a;->L3()V

    :cond_0
    return-void
.end method

.method public c1()V
    .locals 1

    invoke-super {p0}, Lsg/y0;->c1()V

    const-string v0, "captcha"

    invoke-static {v0}, Lsg/t0;->v(Ljava/lang/String;)V

    return-void
.end method

.method public onNavigateToFeatureEvent(Lph/g;)V
    .locals 3
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NavigateToFeature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentFunCaptcha"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "CAPTCHA_SUCCESS_TAG"

    iget-object v2, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iput-boolean v2, p0, Lcom/roblox/client/captcha/a;->j1:Z

    invoke-virtual {p1}, Lph/g;->e()Lorg/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "captchaData"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v1, "captchaToken"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "captchaProvider"

    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object p1, v0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Lcom/roblox/client/captcha/a;->h1:Lcom/roblox/client/captcha/a$a;

    invoke-interface {v1, v0, p1}, Lcom/roblox/client/captcha/a$a;->c0(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "CAPTCHA_SHOWN_TAG"

    iget-object p1, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "isCaptchaShown: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/roblox/client/captcha/a;->i1:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean p1, p0, Lcom/roblox/client/captcha/a;->i1:Z

    if-nez p1, :cond_2

    iput-boolean v2, p0, Lcom/roblox/client/captcha/a;->i1:Z

    invoke-virtual {p0}, Lcom/roblox/client/captcha/a;->L3()V

    :cond_2
    return-void
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lsg/y0;->z0(Landroid/os/Bundle;)V

    const-string p1, "onActivityCreated."

    const-string v0, "FragmentFunCaptcha"

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/captcha/a;->k1:Lcom/roblox/client/captcha/CaptchaConfig;

    invoke-interface {p1}, Lcom/roblox/client/captcha/CaptchaConfig;->getUrl()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Load captcha url: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/c;->K0:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/roblox/client/c;->q3(Ljava/lang/String;)V

    return-void
.end method
