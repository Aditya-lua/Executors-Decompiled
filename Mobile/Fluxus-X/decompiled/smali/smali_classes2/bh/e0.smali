.class public Lbh/e0;
.super Lcom/roblox/client/c;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/c;-><init>()V

    return-void
.end method


# virtual methods
.method public I3()Leh/v0$b;
    .locals 1

    sget-object v0, Leh/v0$b;->g:Leh/v0$b;

    return-object v0
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    sget v0, Lbh/n0;->r:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    sget v0, Lbh/m0;->E:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-super {p0, p1, v0, p3}, Lcom/roblox/client/c;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p2
.end method

.method public c1()V
    .locals 3

    invoke-super {p0}, Lcom/roblox/client/c;->c1()V

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmw/c;->n(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lf4/o;->h2()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit8 v2, v2, 0x2

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public d1()V
    .locals 1

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmw/c;->p(Ljava/lang/Object;)V

    invoke-super {p0}, Lcom/roblox/client/c;->d1()V

    return-void
.end method

.method public onNavigateToConversationEvent(Lyh/f;)V
    .locals 0
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Lf4/o;->i2()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lf4/o;->h2()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public onNavigateToFeatureEvent(Lyh/g;)V
    .locals 0
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Lf4/o;->i2()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lf4/o;->h2()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
