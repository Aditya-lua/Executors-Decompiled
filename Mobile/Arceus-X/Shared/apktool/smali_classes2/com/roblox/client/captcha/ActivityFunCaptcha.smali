.class public Lcom/roblox/client/captcha/ActivityFunCaptcha;
.super Lcom/roblox/client/a;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/captcha/a$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/a;-><init>()V

    return-void
.end method

.method public static i2(Landroid/content/Context;Lcom/roblox/client/captcha/CaptchaConfig;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/captcha/ActivityFunCaptcha;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "captchaConfigKey"

    invoke-virtual {p0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method public E1()V
    .locals 0

    return-void
.end method

.method public Y()V
    .locals 0

    return-void
.end method

.method public c0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/16 p1, 0x65

    invoke-virtual {p0, p1}, Lcom/roblox/client/captcha/ActivityFunCaptcha;->j2(I)V

    return-void
.end method

.method public dismiss()V
    .locals 1

    const/16 v0, 0x66

    invoke-virtual {p0, v0}, Lcom/roblox/client/captcha/ActivityFunCaptcha;->j2(I)V

    return-void
.end method

.method public final j2(I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-super {p0}, Le/p;->onBackPressed()V

    const/16 v0, 0x66

    invoke-virtual {p0, v0}, Lcom/roblox/client/captcha/ActivityFunCaptcha;->j2(I)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/roblox/client/a;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lsg/n0;->a:I

    invoke-virtual {p0, p1}, Lcom/roblox/client/a;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "captchaConfigKey"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/captcha/CaptchaConfig;

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lsg/k0;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    const/high16 v4, 0x43a50000    # 330.0f

    invoke-static {v3, v4, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    int-to-float v3, v1

    cmpg-float v3, v0, v3

    if-gez v3, :cond_0

    float-to-int v1, v0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "FragmentFunCaptcha"

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->n0(Ljava/lang/String;)Landroidx/fragment/app/c;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object v0

    sget v2, Lsg/m0;->g:I

    invoke-static {p1}, Lcom/roblox/client/captcha/a;->K3(Lcom/roblox/client/captcha/CaptchaConfig;)Lcom/roblox/client/captcha/a;

    move-result-object p1

    invoke-virtual {v0, v2, p1, v1}, Landroidx/fragment/app/h;->b(ILandroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/h;->g()I

    :cond_1
    return-void
.end method

.method public onStart()V
    .locals 0

    invoke-super {p0}, Lcom/roblox/client/a;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-super {p0}, Lcom/roblox/client/a;->onStop()V

    return-void
.end method
