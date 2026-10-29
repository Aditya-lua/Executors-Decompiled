.class public Lvh/k;
.super Lsg/y1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvh/k$e;,
        Lvh/k$d;,
        Lvh/k$c;
    }
.end annotation


# instance fields
.field public C0:Z

.field public D0:Z

.field public E0:Z

.field public F0:Landroid/widget/TextView;

.field public G0:Landroid/widget/FrameLayout;

.field public H0:Landroid/widget/ImageView;

.field public I0:Ldk/d;

.field public J0:Ldk/d;

.field public K0:Ldk/d;

.field public L0:Lcom/roblox/client/components/RobloxToolbar$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lsg/y1;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lvh/k;->C0:Z

    iput-boolean v0, p0, Lvh/k;->D0:Z

    iput-boolean v0, p0, Lvh/k;->E0:Z

    return-void
.end method

.method public static synthetic h3(Lvh/k;Le4/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvh/k;->k3(Le4/q;)V

    return-void
.end method

.method public static synthetic i3(Lvh/k;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvh/k;->l3(Landroid/view/View;)V

    return-void
.end method

.method private j3()V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    invoke-virtual {v0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    return-void
.end method

.method private m3()V
    .locals 3

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    new-instance v1, Lvh/k$a;

    invoke-direct {v1, p0}, Lvh/k$a;-><init>(Lvh/k;)V

    new-instance v2, Lei/h;

    invoke-direct {v2}, Lei/h;-><init>()V

    invoke-virtual {v0, v1, v2}, Lvi/h;->m(Lvi/h$d;Lei/f;)V

    return-void
.end method

.method private n3(Landroid/view/LayoutInflater;)V
    .locals 2

    sget v0, Lsg/n0;->F:I

    iget-object v1, p0, Lsg/y1;->o0:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    sget v0, Lsg/m0;->k:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lvh/k;->H0:Landroid/widget/ImageView;

    new-instance v1, Lvh/j;

    invoke-direct {v1, p0}, Lvh/j;-><init>(Lvh/k;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, Lsg/m0;->r:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lvh/k;->F0:Landroid/widget/TextView;

    sget v0, Lsg/m0;->s:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lvh/k;->G0:Landroid/widget/FrameLayout;

    return-void
.end method

.method private p3(Lol/a;)V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D0()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lvh/k;->G0:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lvh/k;->D0:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lvh/k;->J0:Ldk/d;

    invoke-interface {v1, p1}, Ldk/d;->a(Lol/a;)I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lvh/k;->I0:Ldk/d;

    invoke-interface {v1, p1}, Ldk/d;->a(Lol/a;)I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_1
    iget-object v0, p0, Lvh/k;->F0:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lvh/k;->K0:Ldk/d;

    invoke-interface {v1, p1}, Ldk/d;->a(Lol/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    iget-object v0, p0, Lvh/k;->H0:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lvh/k;->L0:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-virtual {v1, p1}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Lol/a;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_3
    return-void

    :cond_4
    iget-object v0, p0, Lvh/k;->G0:Landroid/widget/FrameLayout;

    iget-boolean v1, p0, Lvh/k;->D0:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Lvh/k;->J0:Ldk/d;

    invoke-interface {v1, p1}, Ldk/d;->a(Lol/a;)I

    move-result v1

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lvh/k;->I0:Ldk/d;

    invoke-interface {v1, p1}, Ldk/d;->a(Lol/a;)I

    move-result v1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lvh/k;->F0:Landroid/widget/TextView;

    iget-object v1, p0, Lvh/k;->K0:Ldk/d;

    invoke-interface {v1, p1}, Ldk/d;->a(Lol/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lvh/k;->H0:Landroid/widget/ImageView;

    iget-object v1, p0, Lvh/k;->L0:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-virtual {v1, p1}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Lol/a;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method


# virtual methods
.method public F2()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lvh/k;->D0:Z

    if-eqz v0, :cond_0

    const-string v0, "buildersClub"

    return-object v0

    :cond_0
    iget-boolean v0, p0, Lvh/k;->C0:Z

    if-eqz v0, :cond_1

    const-string v0, "robux"

    return-object v0

    :cond_1
    invoke-super {p0}, Lsg/y1;->F2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    invoke-super {p0, p1, p2, p3}, Lsg/y1;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p2

    new-instance p3, Lvh/k$e;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Lvh/k$e;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lvh/k;->I0:Ldk/d;

    new-instance p3, Lvh/k$d;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Lvh/k$d;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lvh/k;->J0:Ldk/d;

    new-instance p3, Lvh/k$c;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Lvh/k$c;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lvh/k;->K0:Ldk/d;

    new-instance p3, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {p3}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    iput-object p3, p0, Lvh/k;->L0:Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p3

    invoke-interface {p3}, Lth/i;->D0()Z

    move-result p3

    const-string v0, "showPremium"

    const-string v1, "showRobux"

    const/4 v2, 0x0

    if-eqz p3, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lvh/k;->C0:Z

    invoke-virtual {p3, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lvh/k;->D0:Z

    const-string v0, "hideNativeHeader"

    invoke-virtual {p3, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    iput-boolean p3, p0, Lvh/k;->E0:Z

    :cond_0
    iget-boolean p3, p0, Lvh/k;->E0:Z

    if-nez p3, :cond_1

    invoke-direct {p0, p1}, Lvh/k;->n3(Landroid/view/LayoutInflater;)V

    :cond_1
    iget-boolean p1, p0, Lvh/k;->C0:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lvh/k;->o3()V

    invoke-direct {p0}, Lvh/k;->m3()V

    goto :goto_0

    :cond_2
    iget-boolean p1, p0, Lvh/k;->D0:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lvh/k;->F0:Landroid/widget/TextView;

    if-eqz p1, :cond_5

    sget p3, Lsg/q0;->z:I

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_3
    invoke-direct {p0, p1}, Lvh/k;->n3(Landroid/view/LayoutInflater;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    const/4 v1, 0x1

    if-eqz p3, :cond_4

    iput-boolean v1, p0, Lvh/k;->C0:Z

    invoke-virtual {p0}, Lvh/k;->o3()V

    invoke-direct {p0}, Lvh/k;->m3()V

    goto :goto_0

    :cond_4
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v1, p0, Lvh/k;->D0:Z

    iget-object p1, p0, Lvh/k;->F0:Landroid/widget/TextView;

    sget p3, Lsg/q0;->z:I

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(I)V

    :cond_5
    :goto_0
    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p1

    invoke-virtual {p1}, Lfk/c;->g()Lol/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lvh/k;->p3(Lol/a;)V

    return-object p2
.end method

.method public M0()V
    .locals 2

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->f()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lvh/k;->D0:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lvh/k;->C0:Z

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lvh/k;->F2()Ljava/lang/String;

    move-result-object v0

    const-string v1, "close"

    invoke-static {v0, v1}, Lsg/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-super {p0}, Lsg/y1;->M0()V

    return-void
.end method

.method public g3()Lvg/c0$b;
    .locals 1

    sget-object v0, Lvg/c0$b;->k:Lvg/c0$b;

    return-object v0
.end method

.method public final synthetic k3(Le4/q;)V
    .locals 1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lvh/k;->D0:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lvh/k;->j3()V

    return-void

    :cond_1
    invoke-direct {p0}, Lvh/k;->m3()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final synthetic l3(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lvh/k;->j3()V

    return-void
.end method

.method public o3()V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lvh/k;->C0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvh/k;->F0:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->f()I

    move-result v0

    sget v1, Lsg/q0;->l1:I

    invoke-static {v0}, Lej/l;->a(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/c;->g0(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lvh/k;->F0:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lvh/k;->C0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->f()I

    move-result v0

    sget v1, Lsg/q0;->l1:I

    invoke-static {v0}, Lej/l;->a(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/c;->g0(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lvh/k;->F0:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public x2(Lej/k;)V
    .locals 1

    invoke-super {p0, p1}, Lsg/y1;->x2(Lej/k;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lvh/i;

    invoke-direct {v0, p0, p1}, Lvh/i;-><init>(Lvh/k;Le4/q;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
